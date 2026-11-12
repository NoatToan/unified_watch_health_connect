package s51;

import androidx.lifecycle.s0;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import q6.f;
import yc.m2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001Bu\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Ls51/a;", "", "T", "Landroidx/lifecycle/s0;", "Lyc/m2;", "pagedList", "Ls51/e;", "networkState", "refreshState", "Lkotlin/Function0;", "", "refresh", "retry", "Lkotlin/Function1;", "removeItem", "", "emptyState", "<init>", "(Landroidx/lifecycle/s0;Landroidx/lifecycle/s0;Landroidx/lifecycle/s0;Le23/a;Le23/a;Le23/l;Landroidx/lifecycle/s0;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0<m2<T>> f157370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s0<e> f157371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s0<e> f157372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.a<Unit> f157373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e23.a<Unit> f157374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l<T, Unit> f157375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s0<Boolean> f157376g;

    /* JADX WARN: Multi-variable type inference failed */
    public a(s0<m2<T>> s0Var, s0<e> s0Var2, s0<e> s0Var3, e23.a<Unit> aVar, e23.a<Unit> aVar2, l<? super T, Unit> lVar, s0<Boolean> s0Var4) {
        s0Var.getClass();
        s0Var2.getClass();
        s0Var3.getClass();
        aVar.getClass();
        aVar2.getClass();
        lVar.getClass();
        s0Var4.getClass();
        this.f157370a = s0Var;
        this.f157371b = s0Var2;
        this.f157372c = s0Var3;
        this.f157373d = aVar;
        this.f157374e = aVar2;
        this.f157375f = lVar;
        this.f157376g = s0Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f157370a.equals(aVar.f157370a) && this.f157371b.equals(aVar.f157371b) && this.f157372c.equals(aVar.f157372c) && this.f157373d.equals(aVar.f157373d) && this.f157374e.equals(aVar.f157374e) && this.f157375f.equals(aVar.f157375f) && this.f157376g.equals(aVar.f157376g);
    }

    public final int hashCode() {
        return this.f157376g.hashCode() + f.h(f.f(f.f((this.f157372c.hashCode() + ((this.f157371b.hashCode() + (this.f157370a.hashCode() * 31)) * 31)) * 31, 31, this.f157373d), 31, this.f157374e), this.f157375f, 31);
    }

    public final String toString() {
        return "Listing(pagedList=" + this.f157370a + ", networkState=" + this.f157371b + ", refreshState=" + this.f157372c + ", refresh=" + this.f157373d + ", retry=" + this.f157374e + ", removeItem=" + this.f157375f + ", emptyState=" + this.f157376g + ")";
    }
}
