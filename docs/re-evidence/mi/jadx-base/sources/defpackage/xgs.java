package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public final class xgs {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final pbt f39108k = new pbt("ExtractorLooper");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eks f39109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bgs f39110b;
    public final pps c;
    public final xls d;
    public final kms e;
    public final oos f;
    public final aps g;
    public final pks h;
    public final AtomicBoolean i = new AtomicBoolean(false);
    public final i7s j;

    public xgs(eks eksVar, i7s i7sVar, bgs bgsVar, pps ppsVar, xls xlsVar, kms kmsVar, oos oosVar, aps apsVar, pks pksVar) {
        this.f39109a = eksVar;
        this.j = i7sVar;
        this.f39110b = bgsVar;
        this.c = ppsVar;
        this.d = xlsVar;
        this.e = kmsVar;
        this.f = oosVar;
        this.g = apsVar;
        this.h = pksVar;
    }

    public final void a() {
        mks mksVarA;
        pbt pbtVar = f39108k;
        pbtVar.a("Run extractor loop", new Object[0]);
        if (!this.i.compareAndSet(false, true)) {
            pbtVar.e("runLoop already looping; return", new Object[0]);
            return;
        }
        while (true) {
            try {
                mksVarA = this.h.a();
            } catch (ugs e) {
                f39108k.b("Error while getting next extraction task: %s", e.getMessage());
                if (e.f35748a >= 0) {
                    ((vgt) this.j.a()).a(e.f35748a);
                    b(e.f35748a, e);
                }
                mksVarA = null;
            }
            if (mksVarA == null) {
                this.i.set(false);
                return;
            }
            try {
                if (mksVarA instanceof xfs) {
                    this.f39110b.a((xfs) mksVarA);
                } else if (mksVarA instanceof nps) {
                    this.c.a((nps) mksVarA);
                } else if (mksVarA instanceof uls) {
                    this.d.a((uls) mksVarA);
                } else if (mksVarA instanceof dms) {
                    this.e.a((dms) mksVarA);
                } else if (mksVarA instanceof kos) {
                    this.f.a((kos) mksVarA);
                } else if (mksVarA instanceof vos) {
                    this.g.a((vos) mksVarA);
                } else {
                    f39108k.b("Unknown task type: %s", mksVarA.getClass().getName());
                }
            } catch (Exception e2) {
                f39108k.b("Error during extraction task: %s", e2.getMessage());
                ((vgt) this.j.a()).a(mksVarA.f26968a);
                b(mksVarA.f26968a, e2);
            }
        }
    }

    public final void b(int i, Exception exc) {
        try {
            this.f39109a.k(i, 5);
            this.f39109a.l(i);
        } catch (ugs unused) {
            f39108k.b("Error during error handling: %s", exc.getMessage());
        }
    }
}
