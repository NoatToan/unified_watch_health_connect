package defpackage;

import java.io.File;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
public final class aps {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tbs f3343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eks f3344b;
    public final ihs c;
    public final i7s d;
    public final i7s e;

    public aps(tbs tbsVar, i7s i7sVar, eks eksVar, i7s i7sVar2, ihs ihsVar) {
        this.f3343a = tbsVar;
        this.d = i7sVar;
        this.f3344b = eksVar;
        this.e = i7sVar2;
        this.c = ihsVar;
    }

    public final void a(final vos vosVar) {
        File fileT = this.f3343a.t(vosVar.f26969b, vosVar.c, vosVar.e);
        if (!fileT.exists()) {
            throw new ugs(String.format("Cannot find pack files to promote for pack %s at %s", vosVar.f26969b, fileT.getAbsolutePath()), vosVar.f26968a);
        }
        File fileT2 = this.f3343a.t(vosVar.f26969b, vosVar.d, vosVar.e);
        fileT2.mkdirs();
        if (!fileT.renameTo(fileT2)) {
            throw new ugs(String.format("Cannot promote pack %s from %s to %s", vosVar.f26969b, fileT.getAbsolutePath(), fileT2.getAbsolutePath()), vosVar.f26968a);
        }
        ((Executor) this.e.a()).execute(new Runnable() { // from class: xos
            @Override // java.lang.Runnable
            public final void run() {
                this.f39322a.b(vosVar);
            }
        });
        this.f3344b.i(vosVar.f26969b, vosVar.d, vosVar.e);
        this.c.c(vosVar.f26969b);
        ((vgt) this.d.a()).b(vosVar.f26968a, vosVar.f26969b);
    }

    public final /* synthetic */ void b(vos vosVar) {
        this.f3343a.b(vosVar.f26969b, vosVar.d, vosVar.e);
    }
}
