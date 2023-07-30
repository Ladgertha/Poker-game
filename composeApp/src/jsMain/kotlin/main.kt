import ru.ladgertha.poker_game.App
import org.jetbrains.skiko.wasm.onWasmReady

fun main() {
    onWasmReady {
        BrowserViewportWindow("PokerGame") {
            App()
        }
    }
}
