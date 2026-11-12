package com.xiaomi.fitness.notify.util;

import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.xiaomi.fitness.notify.util.KeyboardUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/notify/util/KeyboardUtils;", "", "<init>", "()V", "showKeyboard", "", "editText", "Landroid/widget/EditText;", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class KeyboardUtils {

    @NotNull
    public static final KeyboardUtils INSTANCE = new KeyboardUtils();

    private KeyboardUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showKeyboard$lambda$0(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "$editText");
        Object systemService = editText.getContext().getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).showSoftInput(editText, 2);
    }

    public final void showKeyboard(@NotNull final EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "editText");
        editText.requestFocus();
        editText.postDelayed(new Runnable() { // from class: z0e
            @Override // java.lang.Runnable
            public final void run() {
                KeyboardUtils.showKeyboard$lambda$0(editText);
            }
        }, 300L);
    }
}
