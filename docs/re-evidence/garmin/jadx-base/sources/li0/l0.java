package li0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lli0/l0;", "", "Lli0/b0;", "buttonState", "", "displayName", "", "requestIdSent", "requestIdReceived", "Lli0/n0;", "followStatusData", "<init>", "(Lli0/b0;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lli0/n0;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f112785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f112786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f112787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f112788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n0 f112789e;

    public /* synthetic */ l0(b0 b0Var, String str, Long l14, Long l15, n0 n0Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : b0Var, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : l14, (i14 & 8) != 0 ? null : l15, (i14 & 16) != 0 ? null : n0Var);
    }

    public static l0 a(l0 l0Var, b0 b0Var, Long l14, n0 n0Var, int i14) {
        String str = l0Var.f112786b;
        if ((i14 & 4) != 0) {
            l14 = l0Var.f112787c;
        }
        Long l15 = l14;
        Long l16 = l0Var.f112788d;
        if ((i14 & 16) != 0) {
            n0Var = l0Var.f112789e;
        }
        l0Var.getClass();
        return new l0(b0Var, str, l15, l16, n0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.f112785a == l0Var.f112785a && p005kotlin.jvm.internal.s.g(this.f112786b, l0Var.f112786b) && p005kotlin.jvm.internal.s.g(this.f112787c, l0Var.f112787c) && p005kotlin.jvm.internal.s.g(this.f112788d, l0Var.f112788d) && p005kotlin.jvm.internal.s.g(this.f112789e, l0Var.f112789e);
    }

    public final int hashCode() {
        b0 b0Var = this.f112785a;
        int iHashCode = (b0Var == null ? 0 : b0Var.hashCode()) * 31;
        String str = this.f112786b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l14 = this.f112787c;
        int iHashCode3 = (iHashCode2 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.f112788d;
        int iHashCode4 = (iHashCode3 + (l15 == null ? 0 : l15.hashCode())) * 31;
        n0 n0Var = this.f112789e;
        return iHashCode4 + (n0Var != null ? n0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FollowStateData(buttonState=");
        sb3.append(this.f112785a);
        sb3.append(", displayName=");
        sb3.append(this.f112786b);
        sb3.append(", requestIdSent=");
        kg.f.s(sb3, this.f112787c, ", requestIdReceived=", this.f112788d, ", followStatusData=");
        sb3.append(this.f112789e);
        sb3.append(")");
        return sb3.toString();
    }

    public l0(b0 b0Var, String str, Long l14, Long l15, n0 n0Var) {
        this.f112785a = b0Var;
        this.f112786b = str;
        this.f112787c = l14;
        this.f112788d = l15;
        this.f112789e = n0Var;
    }

    public l0() {
        this(null, null, null, null, null, 31, null);
    }
}
