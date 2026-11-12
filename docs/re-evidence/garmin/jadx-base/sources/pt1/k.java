package pt1;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lpt1/k;", "", "", "message", "actionMessage", "Lkotlin/Function0;", "", "actionCallback", "<init>", "(Ljava/lang/String;Ljava/lang/String;Le23/a;)V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f140871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f140872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.a<Unit> f140873c;

    public /* synthetic */ k(String str, String str2, e23.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return p005kotlin.jvm.internal.s.g(this.f140871a, kVar.f140871a) && p005kotlin.jvm.internal.s.g(this.f140872b, kVar.f140872b) && p005kotlin.jvm.internal.s.g(this.f140873c, kVar.f140873c);
    }

    public final int hashCode() {
        String str = this.f140871a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f140872b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        e23.a<Unit> aVar = this.f140873c;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return n23.j.i(p6.b.i("SnackbarDataState(message=", this.f140871a, ", actionMessage=", this.f140872b, ", actionCallback="), this.f140873c, ")");
    }

    public k(String str, String str2, e23.a<Unit> aVar) {
        this.f140871a = str;
        this.f140872b = str2;
        this.f140873c = aVar;
    }

    public k() {
        this(null, null, null, 7, null);
    }
}
