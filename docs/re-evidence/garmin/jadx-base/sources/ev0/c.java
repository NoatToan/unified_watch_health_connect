package ev0;

import b71.i;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lev0/c;", "", "", "hasSubscription", "isSuspended", "", "baseProfileUrl", "path", "accessCode", "urlSaved", "Lev0/a;", "alertDialog", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lev0/a;)V", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f66152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f66153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f66154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f66155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f66156e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Boolean f66157f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f66158g;

    public /* synthetic */ c(Boolean bool, Boolean bool2, String str, String str2, String str3, Boolean bool3, a aVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : bool, (i14 & 2) != 0 ? null : bool2, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? null : str3, (i14 & 32) != 0 ? null : bool3, (i14 & 64) != 0 ? null : aVar);
    }

    public static c a(c cVar, String str, String str2, Boolean bool, a aVar, int i14) {
        Boolean bool2 = cVar.f66152a;
        Boolean bool3 = cVar.f66153b;
        String str3 = cVar.f66154c;
        if ((i14 & 8) != 0) {
            str = cVar.f66155d;
        }
        String str4 = str;
        if ((i14 & 16) != 0) {
            str2 = cVar.f66156e;
        }
        String str5 = str2;
        if ((i14 & 32) != 0) {
            bool = cVar.f66157f;
        }
        Boolean bool4 = bool;
        if ((i14 & 64) != 0) {
            aVar = cVar.f66158g;
        }
        cVar.getClass();
        return new c(bool2, bool3, str3, str4, str5, bool4, aVar);
    }

    public final boolean b() {
        String str = this.f66156e;
        return true ^ (str == null || str.length() == 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f66152a, cVar.f66152a) && s.g(this.f66153b, cVar.f66153b) && s.g(this.f66154c, cVar.f66154c) && s.g(this.f66155d, cVar.f66155d) && s.g(this.f66156e, cVar.f66156e) && s.g(this.f66157f, cVar.f66157f) && this.f66158g == cVar.f66158g;
    }

    public final int hashCode() {
        Boolean bool = this.f66152a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f66153b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.f66154c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f66155d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f66156e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool3 = this.f66157f;
        int iHashCode6 = (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        a aVar = this.f66158g;
        return iHashCode6 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LiveTrackPlusUiModel(hasSubscription=");
        sb3.append(this.f66152a);
        sb3.append(", isSuspended=");
        sb3.append(this.f66153b);
        sb3.append(", baseProfileUrl=");
        sn.a.t(sb3, this.f66154c, ", path=", this.f66155d, ", accessCode=");
        i.w(sb3, this.f66156e, ", urlSaved=", this.f66157f, ", alertDialog=");
        sb3.append(this.f66158g);
        sb3.append(")");
        return sb3.toString();
    }

    public c(Boolean bool, Boolean bool2, String str, String str2, String str3, Boolean bool3, a aVar) {
        this.f66152a = bool;
        this.f66153b = bool2;
        this.f66154c = str;
        this.f66155d = str2;
        this.f66156e = str3;
        this.f66157f = bool3;
        this.f66158g = aVar;
    }

    public c() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
