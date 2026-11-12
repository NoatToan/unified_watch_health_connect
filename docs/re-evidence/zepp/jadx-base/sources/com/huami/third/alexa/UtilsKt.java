package com.huami.third.alexa;

import android.view.View;
import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\"\u0016\u0010\u0006\u001a\u00020\u00038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005\"\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t\"\u0016\u0010\f\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005¨\u0006\r"}, d2 = {"Landroid/view/View;", "", "isFastDoubleClick", "", "a", LogUtil.I, "MIN_DELAY_TIME", "", "b", "J", "lastClickTime", "c", "viewId", "alexa-ui_release"}, k = 2, mv = {1, 5, 1})
public final class UtilsKt {
    private static final int a = 2000;
    private static long b;
    private static int c;

    public static final boolean isFastDoubleClick(@NotNull View view) {
        if (view.getId() != c) {
            b = System.currentTimeMillis();
            c = view.getId();
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - b;
        if (1 <= j && j < 2000) {
            return true;
        }
        b = jCurrentTimeMillis;
        return false;
    }
}
