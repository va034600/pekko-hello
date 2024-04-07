import GreeterMain.SayHello
import org.apache.pekko.actor.typed.ActorSystem

object Main extends App {
  //#actor-system
  val greeterMain: ActorSystem[GreeterMain.SayHello] = ActorSystem(GreeterMain(), "PekkoQuickstart")
  //#actor-system

  //#main-send-messages
  greeterMain ! SayHello("Charles")
  //#main-send-messages
}
