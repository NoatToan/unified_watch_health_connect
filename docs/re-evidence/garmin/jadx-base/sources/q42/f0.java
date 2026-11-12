package q42;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lq42/f0;", "", "Lb63/o;", "selectedDate", "Lo82/g;", "selectedIntervalType", "Lzk0/g;", "userGoal", "Ll42/c;", "weighInToBeDeleted", "Ll42/d;", "selectedOverlay", "", "showIndexS2WhatsNew", "<init>", "(Lb63/o;Lo82/g;Lzk0/g;Ll42/c;Ll42/d;Z)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b63.o f142635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o82.g f142636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zk0.g f142637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l42.c f142638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l42.d f142639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f142640f;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ f0(b63.o oVar, o82.g gVar, zk0.g gVar2, l42.c cVar, l42.d dVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 1) != 0) {
            b63.a.C0229a c0229a = b63.a.C0229a.f16171a;
            b63.z.INSTANCE.getClass();
            oVar = b63.b.f(c0229a, b63.z.Companion.a());
        }
        this(oVar, (i14 & 2) != 0 ? o82.g.f130850c : gVar, (i14 & 4) != 0 ? null : gVar2, (i14 & 8) != 0 ? null : cVar, (i14 & 16) != 0 ? l42.d.WEIGHT : dVar, (i14 & 32) != 0 ? false : z14);
    }

    public static f0 a(f0 f0Var, b63.o oVar, o82.g gVar, zk0.g gVar2, l42.c cVar, l42.d dVar, int i14) {
        if ((i14 & 1) != 0) {
            oVar = f0Var.f142635a;
        }
        b63.o oVar2 = oVar;
        if ((i14 & 2) != 0) {
            gVar = f0Var.f142636b;
        }
        o82.g gVar3 = gVar;
        if ((i14 & 4) != 0) {
            gVar2 = f0Var.f142637c;
        }
        zk0.g gVar4 = gVar2;
        if ((i14 & 8) != 0) {
            cVar = f0Var.f142638d;
        }
        l42.c cVar2 = cVar;
        if ((i14 & 16) != 0) {
            dVar = f0Var.f142639e;
        }
        l42.d dVar2 = dVar;
        boolean z14 = (i14 & 32) != 0 ? f0Var.f142640f : false;
        f0Var.getClass();
        oVar2.getClass();
        gVar3.getClass();
        dVar2.getClass();
        return new f0(oVar2, gVar3, gVar4, cVar2, dVar2, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return p005kotlin.jvm.internal.s.g(this.f142635a, f0Var.f142635a) && this.f142636b == f0Var.f142636b && p005kotlin.jvm.internal.s.g(this.f142637c, f0Var.f142637c) && p005kotlin.jvm.internal.s.g(this.f142638d, f0Var.f142638d) && this.f142639e == f0Var.f142639e && this.f142640f == f0Var.f142640f;
    }

    public final int hashCode() {
        int i14 = q6.f.i(this.f142636b, this.f142635a.f16206a.hashCode() * 31, 31);
        zk0.g gVar = this.f142637c;
        int iHashCode = (i14 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        l42.c cVar = this.f142638d;
        return Boolean.hashCode(this.f142640f) + ((this.f142639e.hashCode() + ((iHashCode + (cVar != null ? cVar.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "WeightUiState(selectedDate=" + this.f142635a + ", selectedIntervalType=" + this.f142636b + ", userGoal=" + this.f142637c + ", weighInToBeDeleted=" + this.f142638d + ", selectedOverlay=" + this.f142639e + ", showIndexS2WhatsNew=" + this.f142640f + ")";
    }

    public f0(b63.o oVar, o82.g gVar, zk0.g gVar2, l42.c cVar, l42.d dVar, boolean z14) {
        oVar.getClass();
        gVar.getClass();
        dVar.getClass();
        this.f142635a = oVar;
        this.f142636b = gVar;
        this.f142637c = gVar2;
        this.f142638d = cVar;
        this.f142639e = dVar;
        this.f142640f = z14;
    }

    public f0() {
        this(null, null, null, null, null, false, 63, null);
    }
}
