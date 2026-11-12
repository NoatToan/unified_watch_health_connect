package defpackage;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class oos {
    public static final pbt c = new pbt("PatchSliceTaskHandler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tbs f29349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i7s f29350b;

    public oos(tbs tbsVar, i7s i7sVar) {
        this.f29349a = tbsVar;
        this.f29350b = i7sVar;
    }

    public final void a(kos kosVar) {
        tbs tbsVar = this.f29349a;
        String str = kosVar.f26969b;
        int i = kosVar.c;
        long j = kosVar.d;
        File fileT = tbsVar.t(str, i, j);
        File file = new File(tbsVar.u(str, i, j), kosVar.h);
        try {
            InputStream gZIPInputStream = kosVar.j;
            if (kosVar.g == 2) {
                gZIPInputStream = new GZIPInputStream(gZIPInputStream, 8192);
            }
            try {
                bcs bcsVar = new bcs(fileT, file);
                File fileB = this.f29349a.B(kosVar.f26969b, kosVar.e, kosVar.f, kosVar.h);
                if (!fileB.exists()) {
                    fileB.mkdirs();
                }
                gps gpsVar = new gps(this.f29349a, kosVar.f26969b, kosVar.e, kosVar.f, kosVar.h);
                m6s.a(bcsVar, gZIPInputStream, new ehs(fileB, gpsVar), kosVar.i);
                gpsVar.i(0);
                gZIPInputStream.close();
                c.d("Patching and extraction finished for slice %s of pack %s.", kosVar.h, kosVar.f26969b);
                ((vgt) this.f29350b.a()).f(kosVar.f26968a, kosVar.f26969b, kosVar.h, 0);
                try {
                    kosVar.j.close();
                } catch (IOException unused) {
                    c.e("Could not close file for slice %s of pack %s.", kosVar.h, kosVar.f26969b);
                }
            } catch (Throwable th) {
                try {
                    gZIPInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            c.b("IOException during patching %s.", e.getMessage());
            throw new ugs(String.format("Error patching slice %s of pack %s.", kosVar.h, kosVar.f26969b), e, kosVar.f26968a);
        }
    }
}
