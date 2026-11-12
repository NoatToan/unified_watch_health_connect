package com.xiaomi.fitness.health.todayhealth.ui.holder;

import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"getRelativeSizeSpannableStr", "", "ratio", "", "wholeStr", "", "enlargeStr", "health_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TodayHealthExtKt {
    @NotNull
    public static final CharSequence getRelativeSizeSpannableStr(float f, @NotNull String wholeStr, @NotNull String enlargeStr) {
        Intrinsics.checkNotNullParameter(wholeStr, "wholeStr");
        Intrinsics.checkNotNullParameter(enlargeStr, "enlargeStr");
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) wholeStr, enlargeStr, 0, false, 6, (Object) null);
        int length = enlargeStr.length() + iIndexOf$default;
        SpannableString spannableString = new SpannableString(wholeStr);
        spannableString.setSpan(new RelativeSizeSpan(f), iIndexOf$default, length, 17);
        return spannableString;
    }
}
