package com.google.android.exoplayer2.drm;

import android.net.Uri;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.m;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import defpackage.ahd;
import defpackage.rk1;
import defpackage.wlq;
import defpackage.y57;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements y57 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7890a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("lock")
    public m.e f7891b;

    @GuardedBy("lock")
    public c c;
    public HttpDataSource.b d;
    public String e;

    @Override // defpackage.y57
    public c a(m mVar) {
        c cVar;
        rk1.e(mVar.f7949b);
        m.e eVar = mVar.f7949b.c;
        if (eVar == null || wlq.f38110a < 18) {
            return c.f7896a;
        }
        synchronized (this.f7890a) {
            try {
                if (!wlq.c(eVar, this.f7891b)) {
                    this.f7891b = eVar;
                    this.c = b(eVar);
                }
                cVar = (c) rk1.e(this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    @RequiresApi(18)
    public final c b(m.e eVar) {
        HttpDataSource.b bVarC = this.d;
        if (bVarC == null) {
            bVarC = new com.google.android.exoplayer2.upstream.e.b().c(this.e);
        }
        Uri uri = eVar.f7959b;
        h hVar = new h(uri == null ? null : uri.toString(), eVar.f, bVarC);
        for (Map.Entry<String, String> entry : eVar.c.entrySet()) {
            hVar.e(entry.getKey(), entry.getValue());
        }
        DefaultDrmSessionManager defaultDrmSessionManagerA = new DefaultDrmSessionManager.b().e(eVar.f7958a, g.d).b(eVar.d).c(eVar.e).d(ahd.k(eVar.g)).a(hVar);
        defaultDrmSessionManagerA.A(0, eVar.a());
        return defaultDrmSessionManagerA;
    }
}
