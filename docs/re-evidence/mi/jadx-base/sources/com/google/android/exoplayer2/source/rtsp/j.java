package com.google.android.exoplayer2.source.rtsp;

import defpackage.b0l;
import defpackage.t8q;
import defpackage.wlq;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements a.InterfaceC0196a {
    @Override // com.google.android.exoplayer2.source.rtsp.a.InterfaceC0196a
    public a a(int i) throws IOException {
        t8q t8qVar = new t8q();
        t8q t8qVar2 = new t8q();
        try {
            t8qVar.b(b0l.a(0));
            int iC = t8qVar.c();
            boolean z = iC % 2 == 0;
            t8qVar2.b(b0l.a(z ? iC + 1 : iC - 1));
            if (z) {
                t8qVar.r(t8qVar2);
                return t8qVar;
            }
            t8qVar2.r(t8qVar);
            return t8qVar2;
        } catch (IOException e) {
            wlq.n(t8qVar);
            wlq.n(t8qVar2);
            throw e;
        }
    }
}
