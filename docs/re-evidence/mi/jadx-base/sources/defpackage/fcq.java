package defpackage;

import android.annotation.TargetApi;

/* JADX INFO: loaded from: classes4.dex */
public class fcq implements x8g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17659b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public fcq(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f17658a = i;
        this.f17659b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = b(i6);
    }

    @Override // defpackage.x8g
    public void a(y8g y8gVar) {
        throw null;
    }

    @TargetApi(19)
    public final int b(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Unsupported layout direction: " + i);
    }

    public String toString() {
        return "UpdateLayoutMountItem [" + this.f17658a + "] - x: " + this.f17659b + " - y: " + this.c + " - height: " + this.e + " - width: " + this.d + " - layoutDirection: " + this.f;
    }
}
