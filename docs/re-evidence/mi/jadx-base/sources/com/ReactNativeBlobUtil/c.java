package com.ReactNativeBlobUtil;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f5658a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5659b = 0;
    public int c;
    public int d;
    public boolean e;
    public a f;

    public enum a {
        Upload,
        Download
    }

    public c(boolean z, int i, int i2, a aVar) {
        this.c = -1;
        this.d = -1;
        this.e = false;
        a aVar2 = a.Upload;
        this.e = z;
        this.d = i;
        this.f = aVar;
        this.c = i2;
    }

    public boolean a(float f) {
        int i = this.c;
        boolean z = false;
        boolean z2 = i <= 0 || f <= 0.0f || Math.floor((double) (f * ((float) i))) > ((double) this.f5659b);
        if (System.currentTimeMillis() - this.f5658a > this.d && this.e && z2) {
            z = true;
        }
        if (z) {
            this.f5659b++;
            this.f5658a = System.currentTimeMillis();
        }
        return z;
    }
}
