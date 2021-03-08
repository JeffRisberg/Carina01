package com.incra.carina.demo;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.lang.invoke.MethodHandles;

/**
 * This is Hello World carina-demo tests.
 *
 * @author qpsdemo
 */
public class HelloWorld extends AbstractTest {
  private static final Logger LOGGER =
      LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

  @Test()
  @MethodOwner(owner = "qpsdemo")
  public void helloWorld() {
    LOGGER.info("Hello World!");
  }
}
