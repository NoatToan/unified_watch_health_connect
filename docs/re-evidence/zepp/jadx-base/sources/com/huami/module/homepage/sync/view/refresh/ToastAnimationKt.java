package com.huami.module.homepage.sync.view.refresh;

import android.content.res.Resources;
import android.text.TextPaint;
import com.huami.module.ktx.NumberExtKt;
import kotlin.Metadata;
import kotlin.Triple;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a$\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0002¨\u0006\u0006"}, d2 = {"", "message", "Lkotlin/Triple;", "", "", "a", "homePage_release"}, k = 2, mv = {1, 5, 1})
public final class ToastAnimationKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Triple<Integer, Integer, Boolean> a(CharSequence charSequence) {
        if (charSequence == null) {
            return new Triple<>(0, 0, Boolean.FALSE);
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(NumberExtKt.getSp(14));
        double d = Resources.getSystem().getDisplayMetrics().widthPixels;
        int i = (int) (0.51d * d);
        int i2 = (int) (d * 0.75d);
        float fMeasureText = textPaint.measureText(charSequence, 0, charSequence.length());
        int dp = NumberExtKt.getDp(30);
        if (fMeasureText <= i - dp) {
            return new Triple<>(Integer.valueOf(i), Integer.valueOf(NumberExtKt.getDp(32)), Boolean.FALSE);
        }
        float f = i2 - dp;
        if (fMeasureText <= f) {
            return new Triple<>(Integer.valueOf(i2), Integer.valueOf(NumberExtKt.getDp(32)), Boolean.FALSE);
        }
        if (fMeasureText / 2.0f <= f) {
            return new Triple<>(Integer.valueOf(i2), Integer.valueOf(NumberExtKt.getDp(50)), Boolean.TRUE);
        }
        return fMeasureText / 3.0f <= f ? new Triple<>(Integer.valueOf(i2), Integer.valueOf(NumberExtKt.getDp(72)), Boolean.TRUE) : new Triple<>(0, 0, Boolean.TRUE);
    }
}
