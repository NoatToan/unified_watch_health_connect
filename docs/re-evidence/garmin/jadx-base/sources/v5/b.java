package v5;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lv5/b;", "Landroid/text/style/MetricAffectingSpan;", "", "fontFeatureSettings", "<init>", "(Ljava/lang/String;)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends MetricAffectingSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f175705a;

    public b(String str) {
        this.f175705a = str;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setFontFeatureSettings(this.f175705a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setFontFeatureSettings(this.f175705a);
    }
}
