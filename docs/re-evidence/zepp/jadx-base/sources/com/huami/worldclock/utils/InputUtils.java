package com.huami.worldclock.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.IBinder;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.tools.analytics.DbUtils;
import com.huami.worldclock.utils.InputUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bJ\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\bR\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/huami/worldclock/utils/InputUtils;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/os/IBinder;", "windowToken", "", "dismissKeyboard", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "showKeyboard", "delayShowKeyboard", "Landroid/view/MotionEvent;", "event", "Landroid/app/Activity;", "activity", "", "hideKeyboardByClick", "rootView", "isKeyboardShown", "", "a", LogUtil.I, "KEY_BOARD_MIN_HEIGHT", "", "b", "J", "DELAY_MILLIS", "<init>", "()V", "worldclock_release"}, k = 1, mv = {1, 5, 1})
public final class InputUtils {

    @NotNull
    public static final InputUtils INSTANCE = new InputUtils();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final int KEY_BOARD_MIN_HEIGHT = 100;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final long DELAY_MILLIS = 300;

    private InputUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Context context, View view) {
        INSTANCE.showKeyboard(context, view);
    }

    public final void delayShowKeyboard(@NotNull final Context context, @NotNull final View view) {
        new Handler().postDelayed(new Runnable() { // from class: pf4
            @Override // java.lang.Runnable
            public final void run() {
                InputUtils.b(context, view);
            }
        }, 300L);
    }

    public final void dismissKeyboard(@NotNull Context context, @NotNull IBinder windowToken) {
        Object systemService = context.getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
    }

    public final boolean hideKeyboardByClick(@NotNull MotionEvent event, @NotNull View view, @NotNull Activity activity) {
        try {
            if (view instanceof EditText) {
                int[] iArr = {0, 0};
                view.getLocationInWindow(iArr);
                int i = iArr[1];
                int height = view.getHeight() + i;
                if (event.getRawY() < i || event.getRawY() > height) {
                    dismissKeyboard(activity, ((EditText) view).getWindowToken());
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public final boolean isKeyboardShown(@NotNull View rootView) {
        Rect rect = new Rect();
        rootView.getWindowVisibleDisplayFrame(rect);
        return ((float) (rootView.getBottom() - rect.bottom)) > ((float) 100) * rootView.getResources().getDisplayMetrics().density;
    }

    public final void showKeyboard(@NotNull Context context, @NotNull View view) {
        Object systemService = context.getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager == null) {
            return;
        }
        view.requestFocus();
        inputMethodManager.showSoftInput(view, 0);
    }
}
