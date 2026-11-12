package cg;

import hf.m;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import vb.h;
import wf.i;
import wf.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\fB-\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcg/b;", "Lcg/d;", "Lcg/e;", "target", "Lwf/i;", "result", "", "durationMillis", "", "preferExactIntrinsicSize", "<init>", "(Lcg/e;Lwf/i;IZ)V", "a", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f27107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f27108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f27109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f27110d;

    public b(e eVar, i iVar, int i14, boolean z14) {
        this.f27107a = eVar;
        this.f27108b = iVar;
        this.f27109c = i14;
        this.f27110d = z14;
        if (i14 > 0) {
            return;
        }
        h.s("durationMillis must be > 0.");
        throw null;
    }

    @Override // cg.d
    public final void a() {
        e eVar = this.f27107a;
        eVar.getClass();
        i iVar = this.f27108b;
        if (iVar.getF185006a() != null) {
            eVar.getView();
            throw null;
        }
        boolean z14 = iVar instanceof p;
        cg.a aVar = new cg.a(null, null, iVar.getF185007b().f184923v, this.f27109c, (z14 && ((p) iVar).f185012g) ? false : true, this.f27110d);
        if (z14) {
            m.b(aVar);
        } else if (iVar instanceof wf.e) {
            m.b(aVar);
        } else {
            u0.r();
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcg/b$a;", "Lcg/d$a;", "", "durationMillis", "", "preferExactIntrinsicSize", "<init>", "(IZ)V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements d.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f27111b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f27112c;

        public a(int i14, boolean z14) {
            this.f27111b = i14;
            this.f27112c = z14;
            if (i14 > 0) {
                return;
            }
            h.s("durationMillis must be > 0.");
            throw null;
        }

        @Override // cg.d.a
        public final d a(e eVar, i iVar) {
            boolean z14 = iVar instanceof p;
            c.a aVar = d.a.f27115a;
            if (!z14) {
                aVar.getClass();
                return new c(eVar, iVar);
            }
            if (((p) iVar).f185008c != lf.e.MEMORY_CACHE) {
                return new b(eVar, iVar, this.f27111b, this.f27112c);
            }
            aVar.getClass();
            return new c(eVar, iVar);
        }

        public a(int i14) {
            this(i14, false, 2, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(0, 0 == true ? 1 : 0, 3, null);
        }

        public /* synthetic */ a(int i14, boolean z14, int i15, j jVar) {
            this((i15 & 1) != 0 ? 200 : i14, (i15 & 2) != 0 ? false : z14);
        }
    }

    public b(e eVar, i iVar, int i14) {
        this(eVar, iVar, i14, false, 8, null);
    }

    public b(e eVar, i iVar) {
        this(eVar, iVar, 0, false, 12, null);
    }

    public /* synthetic */ b(e eVar, i iVar, int i14, boolean z14, int i15, j jVar) {
        this(eVar, iVar, (i15 & 4) != 0 ? 200 : i14, (i15 & 8) != 0 ? false : z14);
    }
}
