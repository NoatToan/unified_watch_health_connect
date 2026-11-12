package ge2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lge2/d;", "", "", "liveTrackPrivacy", "activeSessionPrivacy", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77021b;

    public /* synthetic */ d(String str, String str2, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f77020a, dVar.f77020a) && s.g(this.f77021b, dVar.f77021b);
    }

    public final int hashCode() {
        String str = this.f77020a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f77021b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return e0.g("ProfileSettings(liveTrackPrivacy=", this.f77020a, ", activeSessionPrivacy=", this.f77021b, ")");
    }

    public d(String str, String str2) {
        this.f77020a = str;
        this.f77021b = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
