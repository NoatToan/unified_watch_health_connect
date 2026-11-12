package defpackage;

import com.xiaomi.fitness.webview.OptionButton;
import com.xiaomi.fitness.webview.OptionMenu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface ysc {
    void onFeedbackResult(Boolean bool);

    void showOptionButton(@NotNull OptionButton optionButton);

    void showPopMenu(OptionMenu optionMenu);

    void showTitleBar(String str);

    void triggerShare(OptionButton.MenuItem menuItem);
}
