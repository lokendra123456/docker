package com.service;
import org.springframework.stereotype.Component;
import com.bean.Product;
import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
/**
 * Created by RamaMohan
 */
@Component
@Path("/")
public class ProductService {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getProducts() {
		ArrayList<Product> al = new ArrayList<>();
		Product p1 = new Product("Paper", 67.9);
		Product p2 = new Product("Pen", 100.89);
		al.add(p1);
		al.add(p2);
		return Response.status(200).entity(al).build();
	}

}
