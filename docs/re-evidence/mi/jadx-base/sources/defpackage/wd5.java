package defpackage;

import android.annotation.TargetApi;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes4.dex */
@TargetApi(21)
public class wd5 extends MetricAffectingSpan implements xej {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f37865a;

    public wd5(float f) {
        this.f37865a = f;
    }

    public final void a(TextPaint textPaint) {
        if (Float.isNaN(this.f37865a)) {
            return;
        }
        textPaint.setLetterSpacing(this.f37865a);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        a(textPaint);
    }
}
