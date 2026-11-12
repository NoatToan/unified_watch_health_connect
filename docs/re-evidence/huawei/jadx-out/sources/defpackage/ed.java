package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes21.dex */
public class ed {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f32769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bitmap f32771c;
    private final String d;
    private final String e;
    private final int i;

    public ed(int i, int i2, String str, String str2, String str3) {
        this.i = i;
        this.f32769a = i2;
        this.d = str;
        this.f32770b = str2;
        this.e = str3;
    }

    public int c() {
        return this.i;
    }

    public int e() {
        return this.f32769a;
    }

    public String b() {
        return this.d;
    }

    public String d() {
        return this.f32770b;
    }

    public Bitmap a() {
        return this.f32771c;
    }

    public void c(Bitmap bitmap) {
        this.f32771c = bitmap;
    }

    public ed d(float f) {
        ed edVar = new ed((int) (this.i * f), (int) (this.f32769a * f), this.d, this.f32770b, this.e);
        Bitmap bitmap = this.f32771c;
        if (bitmap != null) {
            edVar.c(Bitmap.createScaledBitmap(bitmap, edVar.i, edVar.f32769a, true));
        }
        return edVar;
    }
}
