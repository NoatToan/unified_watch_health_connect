package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: loaded from: classes4.dex */
public class o2m extends CharacterStyle implements xej {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f28678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f28679b;
    public final float c;
    public final int d;

    public o2m(float f, float f2, float f3, int i) {
        this.f28678a = f;
        this.f28679b = f2;
        this.c = f3;
        this.d = i;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.c, this.f28678a, this.f28679b, this.d);
    }
}
