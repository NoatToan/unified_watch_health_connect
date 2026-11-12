package defpackage;

import android.graphics.Color;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class cdp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f5229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f5230b;
    public float c;
    public int d = -1;
    public int e = -1;
    public int f = -1;

    public cdp(float f, float f2, float f3) {
        this.f5229a = f;
        this.f5230b = f2;
        this.c = f3;
    }

    public static cdp a() {
        cdp cdpVar = new cdp(0.0f, 0.0f, 0.0f);
        cdpVar.c(Color.parseColor("#FFB426"), Color.parseColor("#F95C38"), Color.parseColor("#53B9FF"));
        return cdpVar;
    }

    public static cdp b(float f, float f2, float f3) {
        return new cdp(f, f2, f3);
    }

    public void c(int i, int i2, int i3) {
        this.d = i;
        this.e = i2;
        this.f = i3;
    }

    public String toString() {
        return "ThreeCircleModel{firstPercentage=" + this.f5229a + ", secondPercentage=" + this.f5230b + ", thirdPercentage=" + this.c + ", firstCircleColor=" + this.d + ", secondCircleColor=" + this.e + ", thirdCircleColor=" + this.f + AbstractJsonLexerKt.END_OBJ;
    }
}
