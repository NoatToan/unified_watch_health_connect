package zf2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzf2/e;", "", "", "deviceName", "deviceImageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f204640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f204641b;

    public /* synthetic */ e(String str, String str2, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.f204640a, eVar.f204640a) && s.g(this.f204641b, eVar.f204641b);
    }

    public final int hashCode() {
        String str = this.f204640a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f204641b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return e0.g("DeviceInfoMetadata(deviceName=", this.f204640a, ", deviceImageUrl=", this.f204641b, ")");
    }

    public e(String str, String str2) {
        this.f204640a = str;
        this.f204641b = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
