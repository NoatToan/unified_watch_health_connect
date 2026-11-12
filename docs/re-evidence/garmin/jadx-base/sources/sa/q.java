package sa;

import androidx.media3.common.d0;
import androidx.media3.common.t;

/* JADX INFO: loaded from: classes.dex */
public final class q extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f158150c;

    public q(d0 d0Var, t tVar) {
        super(d0Var);
        this.f158150c = tVar;
    }

    @Override // sa.h, androidx.media3.common.d0
    public final d0.c m(int i14, d0.c cVar, long j8) {
        super.m(i14, cVar, j8);
        t tVar = this.f158150c;
        cVar.f8198c = tVar;
        t.h hVar = tVar.f8439b;
        cVar.f8197b = hVar != null ? hVar.f8489h : null;
        return cVar;
    }
}
