package defpackage;

import android.graphics.Bitmap;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public class mte {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27184b;
    public final String c;
    public final String d;
    public final String e;
    public Bitmap f;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public mte(int i, int i2, String str, String str2, String str3) {
        this.f27183a = i;
        this.f27184b = i2;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public Bitmap a() {
        return this.f;
    }

    public String b() {
        return this.d;
    }

    public int c() {
        return this.f27184b;
    }

    public String d() {
        return this.c;
    }

    public int e() {
        return this.f27183a;
    }

    public void f(Bitmap bitmap) {
        this.f = bitmap;
    }
}
