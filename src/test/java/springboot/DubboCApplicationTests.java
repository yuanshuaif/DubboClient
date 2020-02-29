package springboot;

import com.alibaba.dubbo.rpc.RpcContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import springboot.Service.IHelloDubboService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DubboCApplicationTests {
	@Autowired
	private IHelloDubboService helloDubboService;
	@Test
	public void contextLoads() {
		RpcContext.getContext().getAttachments().put("msg", "cnma");
		helloDubboService.sayHello();
	}

}
