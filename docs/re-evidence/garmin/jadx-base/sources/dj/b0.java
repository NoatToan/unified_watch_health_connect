package dj;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes7.dex */
public class b0 implements ui.j<InputStream, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f59806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi.b f59807b;

    public static class a implements m.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final y f59808a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final qj.d f59809b;

        public a(y yVar, qj.d dVar) {
            this.f59808a = yVar;
            this.f59809b = dVar;
        }

        @Override // dj.m.b
        public final void a(Bitmap bitmap, xi.d dVar) throws IOException {
            IOException iOException = this.f59809b.f144967b;
            if (iOException != null) {
                if (bitmap == null) {
                    throw iOException;
                }
                dVar.c(bitmap);
                throw iOException;
            }
        }

        @Override // dj.m.b
        public final void b() {
            y yVar = this.f59808a;
            synchronized (yVar) {
                yVar.f59889c = yVar.f59887a.length;
            }
        }
    }

    public b0(m mVar, xi.b bVar) {
        this.f59806a = mVar;
        this.f59807b = bVar;
    }

    @Override // ui.j
    public final wi.u<Bitmap> a(InputStream inputStream, int i14, int i15, ui.h hVar) {
        boolean z14;
        y yVar;
        qj.d dVar;
        InputStream inputStream2 = inputStream;
        if (inputStream2 instanceof y) {
            yVar = (y) inputStream2;
            z14 = false;
        } else {
            z14 = true;
            yVar = new y(inputStream2, this.f59807b);
        }
        ArrayDeque arrayDeque = qj.d.f144965c;
        synchronized (arrayDeque) {
            dVar = (qj.d) arrayDeque.poll();
        }
        if (dVar == null) {
            dVar = new qj.d();
        }
        qj.d dVar2 = dVar;
        dVar2.f144966a = yVar;
        qj.j jVar = new qj.j(dVar2);
        a aVar = new a(yVar, dVar2);
        try {
            m mVar = this.f59806a;
            e eVarA = mVar.a(new u.b(jVar, mVar.f59858d, mVar.f59857c), i14, i15, hVar, aVar);
            dVar2.f144967b = null;
            dVar2.f144966a = null;
            synchronized (arrayDeque) {
                arrayDeque.offer(dVar2);
            }
            return eVarA;
        } finally {
            dVar2.f144967b = null;
            dVar2.f144966a = null;
            ArrayDeque arrayDeque2 = qj.d.f144965c;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(dVar2);
                if (z14) {
                    yVar.release();
                }
            }
        }
    }

    @Override // ui.j
    public final boolean b(InputStream inputStream, ui.h hVar) {
        this.f59806a.getClass();
        return true;
    }
}
