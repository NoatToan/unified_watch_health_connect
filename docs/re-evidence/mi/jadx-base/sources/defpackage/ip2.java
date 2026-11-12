package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes4.dex */
public class ip2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f21964b;
    public final int c;
    public final int d;
    public final frk<Bitmap> e;

    public class a implements frk<Bitmap> {
        public a() {
        }

        @Override // defpackage.frk
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void release(Bitmap bitmap) {
            try {
                ip2.this.a(bitmap);
            } finally {
                bitmap.recycle();
            }
        }
    }

    public ip2(int i, int i2) {
        b6i.b(i > 0);
        b6i.b(i2 > 0);
        this.c = i;
        this.d = i2;
        this.e = new a();
    }

    public synchronized void a(Bitmap bitmap) {
        int iE = jq2.e(bitmap);
        b6i.c(this.f21963a > 0, "No bitmaps registered.");
        long j = iE;
        b6i.d(j <= this.f21964b, "Bitmap size bigger than the total registered size: %d, %d", Integer.valueOf(iE), Long.valueOf(this.f21964b));
        this.f21964b -= j;
        this.f21963a--;
    }

    public synchronized int b() {
        return this.f21963a;
    }

    public synchronized int c() {
        return this.c;
    }

    public synchronized int d() {
        return this.d;
    }

    public frk<Bitmap> e() {
        return this.e;
    }

    public synchronized long f() {
        return this.f21964b;
    }

    public synchronized boolean g(Bitmap bitmap) {
        int iE = jq2.e(bitmap);
        int i = this.f21963a;
        if (i < this.c) {
            long j = this.f21964b;
            long j2 = iE;
            if (j + j2 <= this.d) {
                this.f21963a = i + 1;
                this.f21964b = j + j2;
                return true;
            }
        }
        return false;
    }
}
