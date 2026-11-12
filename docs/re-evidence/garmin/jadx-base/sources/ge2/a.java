package ge2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lge2/a;", "", "", "autoStart", "courseSharingEnabled", "spectatorAudio", "spectatorText", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f77007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f77008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f77009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f77010d;

    public /* synthetic */ a(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : bool, (i14 & 2) != 0 ? null : bool2, (i14 & 4) != 0 ? null : bool3, (i14 & 8) != 0 ? null : bool4);
    }

    public static a a(a aVar, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i14) {
        if ((i14 & 1) != 0) {
            bool = aVar.f77007a;
        }
        if ((i14 & 2) != 0) {
            bool2 = aVar.f77008b;
        }
        if ((i14 & 4) != 0) {
            bool3 = aVar.f77009c;
        }
        if ((i14 & 8) != 0) {
            bool4 = aVar.f77010d;
        }
        aVar.getClass();
        return new a(bool, bool2, bool3, bool4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f77007a, aVar.f77007a) && s.g(this.f77008b, aVar.f77008b) && s.g(this.f77009c, aVar.f77009c) && s.g(this.f77010d, aVar.f77010d);
    }

    public final int hashCode() {
        Boolean bool = this.f77007a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f77008b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f77009c;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f77010d;
        return iHashCode3 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final String toString() {
        return "DeviceSettings(autoStart=" + this.f77007a + ", courseSharingEnabled=" + this.f77008b + ", spectatorAudio=" + this.f77009c + ", spectatorText=" + this.f77010d + ")";
    }

    public a(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.f77007a = bool;
        this.f77008b = bool2;
        this.f77009c = bool3;
        this.f77010d = bool4;
    }

    public a() {
        this(null, null, null, null, 15, null);
    }
}
