package vo2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lvo2/c;", "Lwo2/f;", "", "syncId", "deviceId", "Lvo2/z;", "syncSource", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lvo2/z;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements wo2.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f179117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f179118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f179119c;

    public c(String str, String str2, z zVar) {
        str.getClass();
        str2.getClass();
        zVar.getClass();
        this.f179117a = str;
        this.f179118b = str2;
        this.f179119c = zVar;
    }

    @Override // wo2.f
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF179117a() {
        return this.f179117a;
    }

    @Override // wo2.f
    /* JADX INFO: renamed from: c, reason: from getter */
    public final z getF179119c() {
        return this.f179119c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f179117a.equals(cVar.f179117a) && this.f179118b.equals(cVar.f179118b) && this.f179119c == cVar.f179119c;
    }

    public final int hashCode() {
        return this.f179119c.hashCode() + wr.g.j(this.f179117a.hashCode() * 31, 31, this.f179118b);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("ManualSyncEventDto(syncId=", this.f179117a, ", deviceId=", this.f179118b, ", syncSource=");
        sbI.append(this.f179119c);
        sbI.append(")");
        return sbI.toString();
    }
}
