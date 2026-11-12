package st2;

import am.j;
import b71.i;
import i63.h;
import java.util.Map;
import m63.u1;
import o13.l;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import sk0.i0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0019B\u007f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0010\u0010\u0011B\u0081\u0001\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016¨\u0006\u001a"}, d2 = {"Lst2/g;", "", "", "extendLiveTrack", "useEmail", "groupTrack", "groupTrackAllConnections", "", "", "Lst2/a;", "deviceSettingsDTO", "Lst2/f;", "profileSettings", "postTrackPointFrequency", "postTrackPointBacklogFrequency", "postTrackPointPowerSaveFrequency", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/Map;Lst2/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/Map;Lst2/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "livetrack_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@h
public final /* data */ class g {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final l<i63.c<Object>>[] f160933j = {null, null, null, null, m.a(n.PUBLICATION, new i0(19)), null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f160934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f160935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f160936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f160937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<String, st2.a> f160938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f160939f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f160940g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f160941h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f160942i;

    public /* synthetic */ g(int i14, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Map map, f fVar, String str, String str2, String str3, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f160934a = null;
        } else {
            this.f160934a = bool;
        }
        if ((i14 & 2) == 0) {
            this.f160935b = null;
        } else {
            this.f160935b = bool2;
        }
        if ((i14 & 4) == 0) {
            this.f160936c = null;
        } else {
            this.f160936c = bool3;
        }
        if ((i14 & 8) == 0) {
            this.f160937d = null;
        } else {
            this.f160937d = bool4;
        }
        if ((i14 & 16) == 0) {
            this.f160938e = null;
        } else {
            this.f160938e = map;
        }
        if ((i14 & 32) == 0) {
            this.f160939f = null;
        } else {
            this.f160939f = fVar;
        }
        if ((i14 & 64) == 0) {
            this.f160940g = null;
        } else {
            this.f160940g = str;
        }
        if ((i14 & 128) == 0) {
            this.f160941h = null;
        } else {
            this.f160941h = str2;
        }
        if ((i14 & 256) == 0) {
            this.f160942i = null;
        } else {
            this.f160942i = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.g(this.f160934a, gVar.f160934a) && s.g(this.f160935b, gVar.f160935b) && s.g(this.f160936c, gVar.f160936c) && s.g(this.f160937d, gVar.f160937d) && s.g(this.f160938e, gVar.f160938e) && s.g(this.f160939f, gVar.f160939f) && s.g(this.f160940g, gVar.f160940g) && s.g(this.f160941h, gVar.f160941h) && s.g(this.f160942i, gVar.f160942i);
    }

    public final int hashCode() {
        Boolean bool = this.f160934a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f160935b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f160936c;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f160937d;
        int iHashCode4 = (iHashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Map<String, st2.a> map = this.f160938e;
        int iHashCode5 = (iHashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        f fVar = this.f160939f;
        int iHashCode6 = (iHashCode5 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        String str = this.f160940g;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f160941h;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f160942i;
        return iHashCode8 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("UserSettings(extendLiveTrack=");
        sb3.append(this.f160934a);
        sb3.append(", useEmail=");
        sb3.append(this.f160935b);
        sb3.append(", groupTrack=");
        i.o(this.f160936c, this.f160937d, ", groupTrackAllConnections=", ", deviceSettingsDTO=", sb3);
        sb3.append(this.f160938e);
        sb3.append(", profileSettings=");
        sb3.append(this.f160939f);
        sb3.append(", postTrackPointFrequency=");
        sn.a.t(sb3, this.f160940g, ", postTrackPointBacklogFrequency=", this.f160941h, ", postTrackPointPowerSaveFrequency=");
        return j.o(this.f160942i, ")", sb3);
    }

    /* JADX INFO: renamed from: st2.g$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lst2/g$b;", "", "<init>", "()V", "Li63/c;", "Lst2/g;", "serializer", "()Li63/c;", "livetrack_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final i63.c<g> serializer() {
            return a.f160943a;
        }

        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }
    }

    public g() {
        this((Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Map) null, (f) null, (String) null, (String) null, (String) null, 511, (p005kotlin.jvm.internal.j) null);
    }

    public g(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Map<String, st2.a> map, f fVar, String str, String str2, String str3) {
        this.f160934a = bool;
        this.f160935b = bool2;
        this.f160936c = bool3;
        this.f160937d = bool4;
        this.f160938e = map;
        this.f160939f = fVar;
        this.f160940g = str;
        this.f160941h = str2;
        this.f160942i = str3;
    }

    public /* synthetic */ g(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Map map, f fVar, String str, String str2, String str3, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : bool, (i14 & 2) != 0 ? null : bool2, (i14 & 4) != 0 ? null : bool3, (i14 & 8) != 0 ? null : bool4, (i14 & 16) != 0 ? null : map, (i14 & 32) != 0 ? null : fVar, (i14 & 64) != 0 ? null : str, (i14 & 128) != 0 ? null : str2, (i14 & 256) != 0 ? null : str3);
    }
}
