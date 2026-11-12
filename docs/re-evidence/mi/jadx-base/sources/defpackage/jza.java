package defpackage;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public interface jza {

    public interface a {
        byte[] a(int i);

        Bitmap b(int i, int i2, Bitmap.Config config);

        void c(Bitmap bitmap);

        int[] d(int i);

        void e(byte[] bArr);

        void f(int[] iArr);
    }

    void a(Bitmap.Config config);

    void b();

    int c();

    void clear();

    int d();

    Bitmap e();

    void f();

    int g();

    ByteBuffer getData();

    int h();
}
