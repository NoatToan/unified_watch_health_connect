package vs;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lvs/d;", "", "", "displayName", "imageUrl", "Lxs/c;", "deviceConnectionState", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lxs/c;)V", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f179703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f179704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xs.c f179705c;

    public d(String str, String str2, xs.c cVar) {
        str.getClass();
        cVar.getClass();
        this.f179703a = str;
        this.f179704b = str2;
        this.f179705c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f179703a, dVar.f179703a) && s.g(this.f179704b, dVar.f179704b) && s.g(this.f179705c, dVar.f179705c);
    }

    public final int hashCode() {
        int iHashCode = this.f179703a.hashCode() * 31;
        String str = this.f179704b;
        return this.f179705c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("DeviceInfo(displayName=", this.f179703a, ", imageUrl=", this.f179704b, ", deviceConnectionState=");
        sbI.append(this.f179705c);
        sbI.append(")");
        return sbI.toString();
    }

    public /* synthetic */ d(String str, String str2, xs.c cVar, int i14, j jVar) {
        this(str, (i14 & 2) != 0 ? null : str2, cVar);
    }
}
