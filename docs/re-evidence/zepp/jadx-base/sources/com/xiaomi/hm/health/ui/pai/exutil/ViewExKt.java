package com.xiaomi.hm.health.ui.pai.exutil;

import android.graphics.Paint;
import android.graphics.Rect;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005"}, d2 = {"Landroid/graphics/Paint;", "", "str", "", "getStrHeight", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class ViewExKt {
    public static final int getStrHeight(@NotNull Paint paint, @NotNull String str) {
        if (str.length() == 0) {
            return 0;
        }
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.height();
    }
}
