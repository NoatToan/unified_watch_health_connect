package vo;

import am.x0;
import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import ps.d1;
import r1.q2;
import yo.p;
import yo.z;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0016\u0010\n\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lvo/e;", "", "Lyo/z;", "result", "Lyo/p;", "updateType", "", "legIndex", "Lo13/p;", "Lps/d1;", "updatedLegs", "Lam/x0;", "deletionActivityType", "<init>", "(Lyo/z;Lyo/p;ILo13/p;Lam/x0;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f178995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f178996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f178997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o13.p<d1, d1> f178998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x0 f178999e;

    static {
        Parcelable.Creator<d1> creator = d1.CREATOR;
    }

    public e(z zVar, p pVar, int i14, o13.p<d1, d1> pVar2, x0 x0Var) {
        zVar.getClass();
        pVar.getClass();
        pVar2.getClass();
        this.f178995a = zVar;
        this.f178996b = pVar;
        this.f178997c = i14;
        this.f178998d = pVar2;
        this.f178999e = x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f178995a == eVar.f178995a && this.f178996b == eVar.f178996b && this.f178997c == eVar.f178997c && s.g(this.f178998d, eVar.f178998d) && this.f178999e == eVar.f178999e;
    }

    public final int hashCode() {
        int iHashCode = (this.f178998d.hashCode() + q2.d(this.f178997c, (this.f178996b.hashCode() + (this.f178995a.hashCode() * 31)) * 31, 31)) * 31;
        x0 x0Var = this.f178999e;
        return iHashCode + (x0Var == null ? 0 : x0Var.hashCode());
    }

    public final String toString() {
        return "MultisportEditPayload(result=" + this.f178995a + ", updateType=" + this.f178996b + ", legIndex=" + this.f178997c + ", updatedLegs=" + this.f178998d + ", deletionActivityType=" + this.f178999e + ")";
    }

    public /* synthetic */ e(z zVar, p pVar, int i14, o13.p pVar2, x0 x0Var, int i15, j jVar) {
        this(zVar, pVar, i14, pVar2, (i15 & 16) != 0 ? null : x0Var);
    }
}
