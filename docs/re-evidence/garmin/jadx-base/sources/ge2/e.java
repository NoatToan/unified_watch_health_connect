package ge2;

import b71.i;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lge2/e;", "", "", "", "Lge2/a;", "deviceSettings", "", "emailEnabled", "extendLiveTrack", "groupTrackAllConnections", "groupTrackEnabled", "Lge2/d;", "profileSettings", "", "postTrackPointFrequencyPeriod", "<init>", "(Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lge2/d;Ljava/lang/String;)V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Long, a> f77022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f77023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f77024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f77025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Boolean f77026e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f77027f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f77028g;

    public /* synthetic */ e(Map map, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, d dVar, String str, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : map, (i14 & 2) != 0 ? null : bool, (i14 & 4) != 0 ? null : bool2, (i14 & 8) != 0 ? null : bool3, (i14 & 16) != 0 ? null : bool4, (i14 & 32) != 0 ? null : dVar, (i14 & 64) != 0 ? null : str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.f77022a, eVar.f77022a) && s.g(this.f77023b, eVar.f77023b) && s.g(this.f77024c, eVar.f77024c) && s.g(this.f77025d, eVar.f77025d) && s.g(this.f77026e, eVar.f77026e) && s.g(this.f77027f, eVar.f77027f) && s.g(this.f77028g, eVar.f77028g);
    }

    public final int hashCode() {
        Map<Long, a> map = this.f77022a;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Boolean bool = this.f77023b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f77024c;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f77025d;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f77026e;
        int iHashCode5 = (iHashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        d dVar = this.f77027f;
        int iHashCode6 = (iHashCode5 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str = this.f77028g;
        return iHashCode6 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Settings(deviceSettings=");
        sb3.append(this.f77022a);
        sb3.append(", emailEnabled=");
        sb3.append(this.f77023b);
        sb3.append(", extendLiveTrack=");
        i.o(this.f77024c, this.f77025d, ", groupTrackAllConnections=", ", groupTrackEnabled=", sb3);
        sb3.append(this.f77026e);
        sb3.append(", profileSettings=");
        sb3.append(this.f77027f);
        sb3.append(", postTrackPointFrequencyPeriod=");
        return am.j.o(this.f77028g, ")", sb3);
    }

    public e(Map<Long, a> map, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, d dVar, String str) {
        this.f77022a = map;
        this.f77023b = bool;
        this.f77024c = bool2;
        this.f77025d = bool3;
        this.f77026e = bool4;
        this.f77027f = dVar;
        this.f77028g = str;
    }

    public e() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
