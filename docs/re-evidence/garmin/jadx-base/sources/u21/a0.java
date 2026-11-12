package u21;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lu21/a0;", "", "", "isLoading", "Ls21/o;", "micronutrientsSettings", "navigateBackWithData", "<init>", "(ZLs21/o;Z)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f167891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s21.o f167892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f167893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<s21.n> f167894d;

    public a0(boolean z14, s21.o oVar, boolean z15) {
        oVar.getClass();
        this.f167891a = z14;
        this.f167892b = oVar;
        this.f167893c = z15;
        this.f167894d = o72.t.c0(oVar).f156160b;
    }

    public static a0 a(a0 a0Var, boolean z14, s21.o oVar, boolean z15, int i14) {
        if ((i14 & 1) != 0) {
            z14 = a0Var.f167891a;
        }
        if ((i14 & 2) != 0) {
            oVar = a0Var.f167892b;
        }
        if ((i14 & 4) != 0) {
            z15 = a0Var.f167893c;
        }
        a0Var.getClass();
        oVar.getClass();
        return new a0(z14, oVar, z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f167891a == a0Var.f167891a && p005kotlin.jvm.internal.s.g(this.f167892b, a0Var.f167892b) && this.f167893c == a0Var.f167893c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f167893c) + ((this.f167892b.hashCode() + (Boolean.hashCode(this.f167891a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MicronutrientsUiState(isLoading=");
        sb3.append(this.f167891a);
        sb3.append(", micronutrientsSettings=");
        sb3.append(this.f167892b);
        sb3.append(", navigateBackWithData=");
        return hb.a.k(sb3, this.f167893c, ")");
    }

    public /* synthetic */ a0(boolean z14, s21.o oVar, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, oVar, (i14 & 4) != 0 ? false : z15);
    }
}
