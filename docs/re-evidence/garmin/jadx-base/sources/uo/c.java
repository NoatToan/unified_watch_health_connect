package uo;

import android.os.Parcelable;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ps.d1;
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Luo/c;", "", "Lps/d1;", "multisportLeg", "", "legIndex", "Lkotlin/Function1;", "", "selectionCallback", "<init>", "(Lps/d1;ILe23/l;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d1 f172078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f172079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l<Integer, Unit> f172080c;

    static {
        Parcelable.Creator<d1> creator = d1.CREATOR;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(d1 d1Var, int i14, l<? super Integer, Unit> lVar) {
        d1Var.getClass();
        lVar.getClass();
        this.f172078a = d1Var;
        this.f172079b = i14;
        this.f172080c = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f172078a.equals(cVar.f172078a) && this.f172079b == cVar.f172079b && this.f172080c.equals(cVar.f172080c);
    }

    public final int hashCode() {
        return this.f172080c.hashCode() + q2.d(this.f172079b, this.f172078a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "MultisportLegViewHolderData(multisportLeg=" + this.f172078a + ", legIndex=" + this.f172079b + ", selectionCallback=" + this.f172080c + ")";
    }
}
