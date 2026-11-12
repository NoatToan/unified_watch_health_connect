package w63;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lw63/z;", "Lw63/g0;", "Lw63/g;", "upstream", "<init>", "(Lw63/g;)V", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f183411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f183412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c0 f183413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f183414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f183415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f183416f;

    public z(g gVar) {
        gVar.getClass();
        this.f183411a = gVar;
        e f183329b = gVar.getF183329b();
        this.f183412b = f183329b;
        c0 c0Var = f183329b.f183348a;
        this.f183413c = c0Var;
        this.f183414d = c0Var != null ? c0Var.f183337b : -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f183415e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if (r3 == r5.f183337b) goto L16;
     */
    @Override // w63.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long read(e eVar, long j8) {
        c0 c0Var;
        eVar.getClass();
        if (j8 < 0) {
            vb.h.x(org.apache.commons.lang3.e.e(j8, "byteCount < 0: "));
            return 0L;
        }
        if (this.f183415e) {
            vb.h.z("closed");
            return 0L;
        }
        c0 c0Var2 = this.f183413c;
        e eVar2 = this.f183412b;
        if (c0Var2 != null) {
            c0 c0Var3 = eVar2.f183348a;
            if (c0Var2 == c0Var3) {
                int i14 = this.f183414d;
                c0Var3.getClass();
            }
            vb.h.z("Peek source is invalid because upstream source was used");
            return 0L;
        }
        if (j8 == 0) {
            return 0L;
        }
        if (!this.f183411a.b(this.f183416f + 1)) {
            return -1L;
        }
        if (this.f183413c == null && (c0Var = eVar2.f183348a) != null) {
            this.f183413c = c0Var;
            this.f183414d = c0Var.f183337b;
        }
        long jMin = Math.min(j8, eVar2.f183349b - this.f183416f);
        this.f183412b.f(this.f183416f, eVar, jMin);
        this.f183416f += jMin;
        return jMin;
    }

    @Override // w63.g0
    /* JADX INFO: renamed from: timeout */
    public final h0 getF183401b() {
        return this.f183411a.getF183401b();
    }
}
