package wo2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import vo2.z;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lwo2/g;", "Lwo2/f;", "", "syncId", "deviceId", "ackLink", "completeLink", "Lvo2/z;", "syncSource", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvo2/z;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f186515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f186516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f186517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f186518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z f186519e;

    public g(String str, String str2, String str3, String str4, z zVar) {
        str.getClass();
        str2.getClass();
        zVar.getClass();
        this.f186515a = str;
        this.f186516b = str2;
        this.f186517c = str3;
        this.f186518d = str4;
        this.f186519e = zVar;
    }

    @Override // wo2.f
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF186518d() {
        return this.f186518d;
    }

    @Override // wo2.f
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF179117a() {
        return this.f186515a;
    }

    @Override // wo2.f
    /* JADX INFO: renamed from: c, reason: from getter */
    public final z getF179119c() {
        return this.f186519e;
    }

    @Override // wo2.f
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getF186517c() {
        return this.f186517c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.g(this.f186515a, gVar.f186515a) && s.g(this.f186516b, gVar.f186516b) && s.g(this.f186517c, gVar.f186517c) && s.g(this.f186518d, gVar.f186518d) && this.f186519e == gVar.f186519e;
    }

    public final int hashCode() {
        int iJ = wr.g.j(this.f186515a.hashCode() * 31, 31, this.f186516b);
        String str = this.f186517c;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f186518d;
        return this.f186519e.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("SyncEventDto(syncId=", this.f186515a, ", deviceId=", this.f186516b, ", ackLink=");
        sn.a.t(sbI, this.f186517c, ", completeLink=", this.f186518d, ", syncSource=");
        sbI.append(this.f186519e);
        sbI.append(")");
        return sbI.toString();
    }

    public /* synthetic */ g(String str, String str2, String str3, String str4, z zVar, int i14, j jVar) {
        this(str, str2, str3, str4, (i14 & 16) != 0 ? z.PLATFORM : zVar);
    }
}
