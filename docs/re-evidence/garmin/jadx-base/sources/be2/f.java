package be2;

import b71.i;
import java.util.LinkedHashMap;
import java.util.Map;
import org.joda.time.Period;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u0011\u0012Bg\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lbe2/f;", "", "", "", "Lbe2/f$a;", "deviceSettings", "", "emailEnabled", "extendLiveTrack", "groupTrackAllConnections", "groupTrackEnabled", "Lorg/joda/time/Period;", "postTrackPointFrequency", "Lbe2/f$b;", "profileSettings", "<init>", "(Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lorg/joda/time/Period;Lbe2/f$b;)V", "a", "b", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Long, a> f17751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f17752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f17753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f17754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Boolean f17755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Period f17756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f17757g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f17758h;

    public /* synthetic */ f(Map map, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Period period, b bVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : map, (i14 & 2) != 0 ? null : bool, (i14 & 4) != 0 ? null : bool2, (i14 & 8) != 0 ? null : bool3, (i14 & 16) != 0 ? null : bool4, (i14 & 32) != 0 ? null : period, (i14 & 64) != 0 ? null : bVar);
    }

    public static f a(f fVar, LinkedHashMap linkedHashMap, b bVar, int i14) {
        Map<Long, a> map = linkedHashMap;
        if ((i14 & 1) != 0) {
            map = fVar.f17751a;
        }
        Map<Long, a> map2 = map;
        Boolean bool = fVar.f17752b;
        Boolean bool2 = fVar.f17753c;
        Boolean bool3 = fVar.f17754d;
        Boolean bool4 = fVar.f17755e;
        Period period = fVar.f17756f;
        if ((i14 & 64) != 0) {
            bVar = fVar.f17757g;
        }
        fVar.getClass();
        return new f(map2, bool, bool2, bool3, bool4, period, bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.f17751a, fVar.f17751a) && s.g(this.f17752b, fVar.f17752b) && s.g(this.f17753c, fVar.f17753c) && s.g(this.f17754d, fVar.f17754d) && s.g(this.f17755e, fVar.f17755e) && s.g(this.f17756f, fVar.f17756f) && s.g(this.f17757g, fVar.f17757g);
    }

    public final int hashCode() {
        Map<Long, a> map = this.f17751a;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Boolean bool = this.f17752b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f17753c;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f17754d;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f17755e;
        int iHashCode5 = (iHashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Period period = this.f17756f;
        int iHashCode6 = (iHashCode5 + (period == null ? 0 : period.hashCode())) * 31;
        b bVar = this.f17757g;
        return iHashCode6 + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LivetrackSettings(deviceSettings=");
        sb3.append(this.f17751a);
        sb3.append(", emailEnabled=");
        sb3.append(this.f17752b);
        sb3.append(", extendLiveTrack=");
        i.o(this.f17753c, this.f17754d, ", groupTrackAllConnections=", ", groupTrackEnabled=", sb3);
        sb3.append(this.f17755e);
        sb3.append(", postTrackPointFrequency=");
        sb3.append(this.f17756f);
        sb3.append(", profileSettings=");
        sb3.append(this.f17757g);
        sb3.append(")");
        return sb3.toString();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lbe2/f$b;", "", "", "liveTrackPrivacy", "activeLiveTrackPrivacy", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f17763a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f17764b;

        public /* synthetic */ b(String str, String str2, int i14, j jVar) {
            this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return s.g(this.f17763a, bVar.f17763a) && s.g(this.f17764b, bVar.f17764b);
        }

        public final int hashCode() {
            String str = this.f17763a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f17764b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return e0.g("ProfileSettings(liveTrackPrivacy=", this.f17763a, ", activeLiveTrackPrivacy=", this.f17764b, ")");
        }

        public b(String str, String str2) {
            this.f17763a = str;
            this.f17764b = str2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lbe2/f$a;", "", "", "autoStart", "courseSharingEnabled", "spectatorAudio", "spectatorText", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Boolean f17759a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Boolean f17760b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Boolean f17761c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Boolean f17762d;

        public /* synthetic */ a(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i14, j jVar) {
            this((i14 & 1) != 0 ? null : bool, (i14 & 2) != 0 ? null : bool2, (i14 & 4) != 0 ? null : bool3, (i14 & 8) != 0 ? null : bool4);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return s.g(this.f17759a, aVar.f17759a) && s.g(this.f17760b, aVar.f17760b) && s.g(this.f17761c, aVar.f17761c) && s.g(this.f17762d, aVar.f17762d);
        }

        public final int hashCode() {
            Boolean bool = this.f17759a;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.f17760b;
            int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.f17761c;
            int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.f17762d;
            return iHashCode3 + (bool4 != null ? bool4.hashCode() : 0);
        }

        public final String toString() {
            return "DeviceSettings(autoStart=" + this.f17759a + ", courseSharingEnabled=" + this.f17760b + ", spectatorAudio=" + this.f17761c + ", spectatorText=" + this.f17762d + ")";
        }

        public a(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
            this.f17759a = bool;
            this.f17760b = bool2;
            this.f17761c = bool3;
            this.f17762d = bool4;
        }

        public a() {
            this(null, null, null, null, 15, null);
        }
    }

    public f(Map<Long, a> map, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Period period, b bVar) {
        this.f17751a = map;
        this.f17752b = bool;
        this.f17753c = bool2;
        this.f17754d = bool3;
        this.f17755e = bool4;
        this.f17756f = period;
        this.f17757g = bVar;
    }

    public f() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
