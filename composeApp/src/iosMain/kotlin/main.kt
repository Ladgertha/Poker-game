import androidx.compose.ui.window.ComposeUIViewController
import ru.ladgertha.poker_game.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController {
    return ComposeUIViewController { App() }
}
