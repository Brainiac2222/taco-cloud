package tacos.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tacos.Order;

@Slf4j
@Controller
@RequestMapping( "/orders")
public class OrderController
{

    @GetMapping( "/current")
    public String orderForm( Model model )
    {
        model.addAttribute( "order", new Order() );
        return "orderForm";
    }

    @PostMapping
    public String processOrder( Order order )
    {
        log.info("Order submitted: {}", order);
        return "redirect:/";
    }
}
