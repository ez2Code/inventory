package org.daming.inventory.reactor;

import org.junit.Test;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 描述：
 *
 * @author daming
 * @date 2018-07-14 10:30
 */
public class ReactorTest {

    @Test
    public void test1() {
        List<String> list = new ArrayList<>(3);
        list.add("one");
        list.add("two");
        list.add("three");
        Flux<String> flux = Flux.fromIterable(list);
        flux.collect(Collectors.toList()).subscribe(res -> {
            res.forEach(System.out::println);
        });
    }
}
