package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes4.dex */
public final class qls {
    public static boolean d = false;
    public static boolean e = false;
    public static boolean f = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f31643a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f31644b = 0;
    public int c = 20;

    public static void a(boolean z) {
        d = z;
    }

    public static boolean b() {
        return d;
    }

    public static void d(boolean z) {
        e = z;
    }

    public static boolean e() {
        return e;
    }

    public static void f(boolean z) {
        f = z;
    }

    public static boolean g() {
        return f;
    }

    public static void k() {
        m2t.r(new Exception("BlackScreen"), "PureScreenCheckTool", "uploadInfo");
    }

    public final boolean c(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int i = -1;
                for (int i2 = (int) (width / 4.0f); i2 < (width * 3) / 4.0f; i2++) {
                    for (int i3 = (int) (height / 4.0f); i3 < (height * 3) / 4.0f; i3++) {
                        int pixel = bitmap.getPixel(i2, i3);
                        if (i == -1) {
                            i = pixel;
                        }
                        if (pixel != i) {
                            this.f31643a = true;
                            return false;
                        }
                        if (pixel != -16777216) {
                            this.f31643a = true;
                            return false;
                        }
                    }
                }
            } catch (Throwable th) {
                try {
                    m2t.r(th, "AMapdelegate", "checkBlackScreen");
                } finally {
                    this.f31643a = true;
                }
            }
        }
        return true;
    }

    public final boolean h() {
        return this.f31643a;
    }

    public final void i() {
        this.f31644b++;
    }

    public final boolean j() {
        return this.f31644b >= this.c;
    }
}
