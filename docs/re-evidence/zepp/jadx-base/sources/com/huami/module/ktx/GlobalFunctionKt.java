package com.huami.module.ktx;

import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0006\u0010\u0004\u001a\u00020\u0002¨\u0006\u0005"}, d2 = {"", "isRtl", "", "screenWidth", "screenHeight", "hm-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class GlobalFunctionKt {
    public static final boolean isRtl() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }

    public static final int screenHeight() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    public static final int screenWidth() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }
}
