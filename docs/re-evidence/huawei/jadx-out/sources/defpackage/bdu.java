package defpackage;

import android.graphics.Color;
import androidx.core.view.ViewCompat;
import java.util.Locale;

/* JADX INFO: loaded from: classes23.dex */
public class bdu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1050b;
    private final float[] d;

    public bdu(int i, int i2) {
        float[] fArr = new float[3];
        this.d = fArr;
        this.f1049a = i;
        Color.colorToHSV(i, fArr);
        this.f1050b = i2;
    }

    public bdu(float f, float f2, float f3, int i) {
        float[] fArr = {f, f2, f3};
        this.d = fArr;
        this.f1049a = Color.HSVToColor(fArr);
        this.f1050b = i;
    }

    public int a() {
        return this.f1049a;
    }

    public int b() {
        return this.f1050b;
    }

    public void c(int i) {
        this.f1050b = i;
    }

    public float d() {
        return this.d[0];
    }

    public float e() {
        return this.d[1];
    }

    public float c() {
        return this.d[2];
    }

    public String toString() {
        Locale locale = Locale.ENGLISH;
        int i = this.f1049a;
        float[] fArr = this.d;
        return String.format(locale, "{rgb=#%06X, hsv=[%.2f, %.2f, %.2f], population=%d}", Integer.valueOf(i & ViewCompat.MEASURED_SIZE_MASK), Float.valueOf(fArr[0]), Float.valueOf(fArr[1]), Float.valueOf(fArr[2]), Integer.valueOf(this.f1050b));
    }
}
