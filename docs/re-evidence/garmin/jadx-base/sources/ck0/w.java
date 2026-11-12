package ck0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lck0/w;", "", "", "numCodesRemainingAfterReveal", "Lb63/o;", "moreCodesAvailableOnDate", "expirationDate", "Lkotlin/Function0;", "", "onPositive", "onNegative", "<init>", "(ILb63/o;Lb63/o;Le23/a;Le23/a;)V", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b63.o f27899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b63.o f27900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.a<Unit> f27901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e23.a<Unit> f27902e;

    public w(int i14, b63.o oVar, b63.o oVar2, e23.a<Unit> aVar, e23.a<Unit> aVar2) {
        oVar.getClass();
        oVar2.getClass();
        aVar.getClass();
        aVar2.getClass();
        this.f27898a = i14;
        this.f27899b = oVar;
        this.f27900c = oVar2;
        this.f27901d = aVar;
        this.f27902e = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f27898a == wVar.f27898a && this.f27899b.equals(wVar.f27899b) && this.f27900c.equals(wVar.f27900c) && this.f27901d.equals(wVar.f27901d) && this.f27902e.equals(wVar.f27902e);
    }

    public final int hashCode() {
        return this.f27902e.hashCode() + q6.f.f(n23.j.a(this.f27900c.f16206a, n23.j.a(this.f27899b.f16206a, Integer.hashCode(this.f27898a) * 31, 31), 31), 31, this.f27901d);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RevealConfirmationDialogData(numCodesRemainingAfterReveal=");
        sb3.append(this.f27898a);
        sb3.append(", moreCodesAvailableOnDate=");
        sb3.append(this.f27899b);
        sb3.append(", expirationDate=");
        sb3.append(this.f27900c);
        sb3.append(", onPositive=");
        sb3.append(this.f27901d);
        sb3.append(", onNegative=");
        return n23.j.i(sb3, this.f27902e, ")");
    }
}
