package defpackage;

import android.content.res.AssetManager;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes4.dex */
public class je5 extends MetricAffectingSpan implements xej {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AssetManager f22695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22696b;
    public final int c;
    public final String d;

    public je5(int i, int i2, String str, AssetManager assetManager) {
        this.f22696b = i;
        this.c = i2;
        this.d = str;
        this.f22695a = assetManager;
    }

    public static void a(Paint paint, int i, int i2, String str, AssetManager assetManager) {
        Typeface typeface = paint.getTypeface();
        int i3 = 0;
        int style = typeface == null ? 0 : typeface.getStyle();
        if (i2 == 1 || ((style & 1) != 0 && i2 == -1)) {
            i3 = 1;
        }
        if (i == 2 || ((style & 2) != 0 && i == -1)) {
            i3 |= 2;
        }
        if (str != null) {
            typeface = hdj.b().c(str, i3, i2, assetManager);
        } else if (typeface != null) {
            typeface = Typeface.create(typeface, i3);
        }
        if (typeface != null) {
            paint.setTypeface(typeface);
        } else {
            paint.setTypeface(Typeface.defaultFromStyle(i3));
        }
        paint.setSubpixelText(true);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        a(textPaint, this.f22696b, this.c, this.d, this.f22695a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        a(textPaint, this.f22696b, this.c, this.d, this.f22695a);
    }
}
