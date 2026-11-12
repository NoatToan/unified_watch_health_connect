package ou0;

import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import wd2.g2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lou0/f;", "", "", "emailOption", "Lou0/b;", "groupTrackOption", "Lwd2/g2;", "stravaBeaconOption", "extendLiveTrackOption", "", "", "Lge2/a;", "deviceSettings", "Lge2/d;", "profileSettings", "<init>", "(Ljava/lang/Boolean;Lou0/b;Lwd2/g2;Ljava/lang/Boolean;Ljava/util/Map;Lge2/d;)V", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f133983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f133984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g2 f133985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f133986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<Long, ge2.a> f133987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ge2.d f133988f;

    public /* synthetic */ f(Boolean bool, b bVar, g2 g2Var, Boolean bool2, Map map, ge2.d dVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : bool, (i14 & 2) != 0 ? null : bVar, (i14 & 4) != 0 ? null : g2Var, (i14 & 8) != 0 ? null : bool2, (i14 & 16) != 0 ? null : map, (i14 & 32) != 0 ? null : dVar);
    }

    public static f a(f fVar, Boolean bool, b bVar, g2 g2Var, Boolean bool2, LinkedHashMap linkedHashMap, int i14) {
        if ((i14 & 1) != 0) {
            bool = fVar.f133983a;
        }
        Boolean bool3 = bool;
        if ((i14 & 2) != 0) {
            bVar = fVar.f133984b;
        }
        b bVar2 = bVar;
        if ((i14 & 4) != 0) {
            g2Var = fVar.f133985c;
        }
        g2 g2Var2 = g2Var;
        if ((i14 & 8) != 0) {
            bool2 = fVar.f133986d;
        }
        Boolean bool4 = bool2;
        Map<Long, ge2.a> map = linkedHashMap;
        if ((i14 & 16) != 0) {
            map = fVar.f133987e;
        }
        ge2.d dVar = fVar.f133988f;
        fVar.getClass();
        return new f(bool3, bVar2, g2Var2, bool4, map, dVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.f133983a, fVar.f133983a) && s.g(this.f133984b, fVar.f133984b) && s.g(this.f133985c, fVar.f133985c) && s.g(this.f133986d, fVar.f133986d) && s.g(this.f133987e, fVar.f133987e) && s.g(this.f133988f, fVar.f133988f);
    }

    public final int hashCode() {
        Boolean bool = this.f133983a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        b bVar = this.f133984b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        g2 g2Var = this.f133985c;
        int iHashCode3 = (iHashCode2 + (g2Var == null ? 0 : g2Var.hashCode())) * 31;
        Boolean bool2 = this.f133986d;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Map<Long, ge2.a> map = this.f133987e;
        int iHashCode5 = (iHashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        ge2.d dVar = this.f133988f;
        return iHashCode5 + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        return "LiveTrackSharingOptions(emailOption=" + this.f133983a + ", groupTrackOption=" + this.f133984b + ", stravaBeaconOption=" + this.f133985c + ", extendLiveTrackOption=" + this.f133986d + ", deviceSettings=" + this.f133987e + ", profileSettings=" + this.f133988f + ")";
    }

    public f(Boolean bool, b bVar, g2 g2Var, Boolean bool2, Map<Long, ge2.a> map, ge2.d dVar) {
        this.f133983a = bool;
        this.f133984b = bVar;
        this.f133985c = g2Var;
        this.f133986d = bool2;
        this.f133987e = map;
        this.f133988f = dVar;
    }

    public f() {
        this(null, null, null, null, null, null, 63, null);
    }
}
