package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
public final class kms {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tbs f23997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eks f23998b;
    public final ihs c;
    public final xns d;
    public final i7s e;
    public final i7s f;

    public kms(tbs tbsVar, i7s i7sVar, eks eksVar, i7s i7sVar2, ihs ihsVar, xns xnsVar) {
        this.f23997a = tbsVar;
        this.e = i7sVar;
        this.f23998b = eksVar;
        this.f = i7sVar2;
        this.c = ihsVar;
        this.d = xnsVar;
    }

    public final void a(final dms dmsVar) {
        tbs tbsVar = this.f23997a;
        String str = dmsVar.f26969b;
        int i = dmsVar.c;
        long j = dmsVar.d;
        File fileV = tbsVar.v(str, i, j);
        File fileX = tbsVar.x(str, i, j);
        if (!fileV.exists() || !fileX.exists()) {
            throw new ugs(String.format("Cannot find pack files to move for pack %s.", dmsVar.f26969b), dmsVar.f26968a);
        }
        File fileT = this.f23997a.t(dmsVar.f26969b, dmsVar.c, dmsVar.d);
        fileT.mkdirs();
        if (!fileV.renameTo(fileT)) {
            throw new ugs("Cannot move merged pack files to final location.", dmsVar.f26968a);
        }
        new File(this.f23997a.t(dmsVar.f26969b, dmsVar.c, dmsVar.d), "merge.tmp").delete();
        File fileU = this.f23997a.u(dmsVar.f26969b, dmsVar.c, dmsVar.d);
        fileU.mkdirs();
        if (!fileX.renameTo(fileU)) {
            throw new ugs("Cannot move metadata files to final location.", dmsVar.f26968a);
        }
        try {
            this.d.b(dmsVar.f26969b, dmsVar.c, dmsVar.d, dmsVar.e);
            ((Executor) this.f.a()).execute(new Runnable() { // from class: hms
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20247a.b(dmsVar);
                }
            });
            this.f23998b.i(dmsVar.f26969b, dmsVar.c, dmsVar.d);
            this.c.c(dmsVar.f26969b);
            ((vgt) this.e.a()).b(dmsVar.f26968a, dmsVar.f26969b);
        } catch (IOException e) {
            throw new ugs(String.format("Could not write asset pack version tag for pack %s: %s", dmsVar.f26969b, e.getMessage()), dmsVar.f26968a);
        }
    }

    public final /* synthetic */ void b(dms dmsVar) {
        this.f23997a.b(dmsVar.f26969b, dmsVar.c, dmsVar.d);
    }
}
