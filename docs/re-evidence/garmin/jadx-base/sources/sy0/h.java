package sy0;

import i3.e5;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lsy0/h;", "", "", "showLiveTrackCard", "", "fullName", "liveTrackName", "url", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f161221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f161222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f161223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f161224d;

    public /* synthetic */ h(Boolean bool, String str, String str2, String str3, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : bool, (i14 & 2) != 0 ? "" : str, (i14 & 4) != 0 ? "" : str2, (i14 & 8) != 0 ? "" : str3);
    }

    public static h a(h hVar) {
        Boolean bool = Boolean.FALSE;
        String str = hVar.f161222b;
        String str2 = hVar.f161223c;
        String str3 = hVar.f161224d;
        hVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new h(bool, str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return p005kotlin.jvm.internal.s.g(this.f161221a, hVar.f161221a) && p005kotlin.jvm.internal.s.g(this.f161222b, hVar.f161222b) && p005kotlin.jvm.internal.s.g(this.f161223c, hVar.f161223c) && p005kotlin.jvm.internal.s.g(this.f161224d, hVar.f161224d);
    }

    public final int hashCode() {
        Boolean bool = this.f161221a;
        return this.f161224d.hashCode() + wr.g.j(wr.g.j((bool == null ? 0 : bool.hashCode()) * 31, 31, this.f161222b), 31, this.f161223c);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LiveTrackUiState(showLiveTrackCard=");
        sb3.append(this.f161221a);
        sb3.append(", fullName=");
        sb3.append(this.f161222b);
        sb3.append(", liveTrackName=");
        return e5.h(sb3, this.f161223c, ", url=", this.f161224d, ")");
    }

    public h(Boolean bool, String str, String str2, String str3) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.f161221a = bool;
        this.f161222b = str;
        this.f161223c = str2;
        this.f161224d = str3;
    }

    public h() {
        this(null, null, null, null, 15, null);
    }
}
