package com.facebook.imagepipeline.nativecode;

import defpackage.a24;
import defpackage.b6i;
import defpackage.c47;
import defpackage.jxk;
import defpackage.l4d;
import defpackage.o98;
import defpackage.pv5;
import defpackage.rhg;
import defpackage.srd;
import defpackage.w07;
import defpackage.w5d;
import defpackage.x5d;
import defpackage.ypk;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
@w07
public class NativeJpegTranscoder implements x5d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f7122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7123b;
    public boolean c;

    static {
        rhg.a();
    }

    public NativeJpegTranscoder(boolean z, int i, boolean z2) {
        this.f7122a = z;
        this.f7123b = i;
        this.c = z2;
    }

    public static void e(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException {
        rhg.a();
        b6i.b(i2 >= 1);
        b6i.b(i2 <= 16);
        b6i.b(i3 >= 0);
        b6i.b(i3 <= 100);
        b6i.b(srd.j(i));
        b6i.c((i2 == 8 && i == 0) ? false : true, "no transformation requested");
        nativeTranscodeJpeg((InputStream) b6i.g(inputStream), (OutputStream) b6i.g(outputStream), i, i2, i3);
    }

    public static void f(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException {
        rhg.a();
        b6i.b(i2 >= 1);
        b6i.b(i2 <= 16);
        b6i.b(i3 >= 0);
        b6i.b(i3 <= 100);
        b6i.b(srd.i(i));
        b6i.c((i2 == 8 && i == 1) ? false : true, "no transformation requested");
        nativeTranscodeJpegWithExifOrientation((InputStream) b6i.g(inputStream), (OutputStream) b6i.g(outputStream), i, i2, i3);
    }

    @w07
    private static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException;

    @w07
    private static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException;

    @Override // defpackage.x5d
    public String a() {
        return "NativeJpegTranscoder";
    }

    @Override // defpackage.x5d
    public boolean b(o98 o98Var, jxk jxkVar, ypk ypkVar) {
        if (jxkVar == null) {
            jxkVar = jxk.a();
        }
        return srd.f(jxkVar, ypkVar, o98Var, this.f7122a) < 8;
    }

    @Override // defpackage.x5d
    public boolean c(l4d l4dVar) {
        return l4dVar == pv5.f30818a;
    }

    @Override // defpackage.x5d
    public w5d d(o98 o98Var, OutputStream outputStream, jxk jxkVar, ypk ypkVar, l4d l4dVar, Integer num) throws IOException {
        if (num == null) {
            num = 85;
        }
        if (jxkVar == null) {
            jxkVar = jxk.a();
        }
        int iB = c47.b(jxkVar, ypkVar, o98Var, this.f7123b);
        try {
            int iF = srd.f(jxkVar, ypkVar, o98Var, this.f7122a);
            int iA = srd.a(iB);
            if (this.c) {
                iF = iA;
            }
            InputStream inputStreamY = o98Var.y();
            if (srd.f33913a.contains(Integer.valueOf(o98Var.o()))) {
                f(inputStreamY, outputStream, srd.d(jxkVar, o98Var), iF, num.intValue());
            } else {
                e(inputStreamY, outputStream, srd.e(jxkVar, o98Var), iF, num.intValue());
            }
            a24.b(inputStreamY);
            return new w5d(iB != 1 ? 0 : 1);
        } catch (Throwable th) {
            a24.b(null);
            throw th;
        }
    }
}
