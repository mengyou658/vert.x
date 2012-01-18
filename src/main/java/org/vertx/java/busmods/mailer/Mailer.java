package org.vertx.java.busmods.mailer;

import org.vertx.java.busmods.BusModBase;
import org.vertx.java.core.eventbus.Message;
import org.vertx.java.core.logging.Logger;

import java.util.Map;

/**
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
public class Mailer extends BusModBase {

  private static final Logger log = Logger.getLogger(Mailer.class);

  public Mailer(final String address) {
    super(address);
  }

  public void handle(Message message, Map<String, Object> json) {
    // TODO
  }

}
