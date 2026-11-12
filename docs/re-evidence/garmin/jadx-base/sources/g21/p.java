package g21;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lg21/p;", "", "Lb11/l;", "meal", "Lg21/f0;", "nutritionContent", "Lg21/u;", "nutritionGoals", "Li53/c;", "Lb11/i;", "loggedItems", "<init>", "(Lb11/l;Lg21/f0;Lg21/u;Li53/c;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b11.l f75473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f75474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f75475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i53.c<b11.i> f75476d;

    /* JADX WARN: Multi-variable type inference failed */
    public p(b11.l lVar, f0 f0Var, u uVar, i53.c<? extends b11.i> cVar) {
        lVar.getClass();
        f0Var.getClass();
        cVar.getClass();
        this.f75473a = lVar;
        this.f75474b = f0Var;
        this.f75475c = uVar;
        this.f75476d = cVar;
    }

    public final j23.i a() {
        b63.v vVar;
        b11.l lVar = this.f75473a;
        b63.v vVar2 = lVar.f14334d;
        if (vVar2 == null || (vVar = lVar.f14335e) == null) {
            return null;
        }
        return j23.s.a(vVar2, vVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f75473a.equals(pVar.f75473a) && this.f75474b.equals(pVar.f75474b) && p005kotlin.jvm.internal.s.g(this.f75475c, pVar.f75475c) && this.f75476d.equals(pVar.f75476d);
    }

    public final int hashCode() {
        int iHashCode = (this.f75474b.hashCode() + (this.f75473a.hashCode() * 31)) * 31;
        u uVar = this.f75475c;
        return this.f75476d.hashCode() + ((iHashCode + (uVar == null ? 0 : uVar.hashCode())) * 31);
    }

    public final String toString() {
        return "MealDetailsUIModel(meal=" + this.f75473a + ", nutritionContent=" + this.f75474b + ", nutritionGoals=" + this.f75475c + ", loggedItems=" + this.f75476d + ")";
    }
}
