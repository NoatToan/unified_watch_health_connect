package g02;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lg02/p1;", "", "", "title", "Lkotlin/Function0;", "", "leftIconComposable", "rightIconComposable", "<init>", "(Ljava/lang/String;Le23/p;Le23/p;)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f74517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.p<p3.m, Integer, Unit> f74518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.p<p3.m, Integer, Unit> f74519c;

    public /* synthetic */ p1(String str, e23.p pVar, e23.p pVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, (i14 & 2) != 0 ? null : pVar, (i14 & 4) != 0 ? null : pVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return p005kotlin.jvm.internal.s.g(this.f74517a, p1Var.f74517a) && p005kotlin.jvm.internal.s.g(this.f74518b, p1Var.f74518b) && p005kotlin.jvm.internal.s.g(this.f74519c, p1Var.f74519c);
    }

    public final int hashCode() {
        int iHashCode = this.f74517a.hashCode() * 31;
        e23.p<p3.m, Integer, Unit> pVar = this.f74518b;
        int iHashCode2 = (iHashCode + (pVar == null ? 0 : pVar.hashCode())) * 31;
        e23.p<p3.m, Integer, Unit> pVar2 = this.f74519c;
        return iHashCode2 + (pVar2 != null ? pVar2.hashCode() : 0);
    }

    public final String toString() {
        return "TabRowItem(title=" + this.f74517a + ", leftIconComposable=" + this.f74518b + ", rightIconComposable=" + this.f74519c + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p1(String str, e23.p<? super p3.m, ? super Integer, Unit> pVar, e23.p<? super p3.m, ? super Integer, Unit> pVar2) {
        str.getClass();
        this.f74517a = str;
        this.f74518b = pVar;
        this.f74519c = pVar2;
    }
}
