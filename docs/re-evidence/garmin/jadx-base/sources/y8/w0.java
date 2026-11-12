package y8;

import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.activities.model.PrivacyUpdateRequestError;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Ly8/w0;", "Ly8/d0;", "Ljava/time/Instant;", "startTime", "Ljava/time/ZoneOffset;", "startZoneOffset", "endTime", "endZoneOffset", "Lz8/c;", TtmlNode.TAG_METADATA, "", "title", "notes", "", "Ly8/w0$b;", "stages", "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Lz8/c;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "a", "b", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class w0 implements d0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f195029i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final LinkedHashMap f195030j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f195031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f195032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f195033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ZoneOffset f195034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z8.c f195035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f195036f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f195037g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<b> f195038h;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ly8/w0$b;", "", "Ljava/time/Instant;", "startTime", "endTime", "", "stage", "<init>", "(Ljava/time/Instant;Ljava/time/Instant;I)V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Instant f195039a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Instant f195040b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f195041c;

        public b(Instant instant, Instant instant2, int i14) {
            instant.getClass();
            instant2.getClass();
            this.f195039a = instant;
            this.f195040b = instant2;
            this.f195041c = i14;
            if (instant.isBefore(instant2)) {
                return;
            }
            vb.h.s("startTime must be before endTime.");
            throw null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f195041c == bVar.f195041c && this.f195039a.equals(bVar.f195039a) && this.f195040b.equals(bVar.f195040b);
        }

        public final int hashCode() {
            return this.f195040b.hashCode() + wr.g.k(this.f195039a, Integer.hashCode(this.f195041c) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("Stage(startTime=");
            sb3.append(this.f195039a);
            sb3.append(", endTime=");
            sb3.append(this.f195040b);
            sb3.append(", stage=");
            return ds.e0.j(sb3, this.f195041c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ly8/w0$b;", "kotlin.jvm.PlatformType", "a", "b", "", "invoke", "(Ly8/w0$b;Ly8/w0$b;)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class c extends p005kotlin.jvm.internal.w implements e23.p<b, b, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f195042a = new c();

        public c() {
            super(2);
        }

        @Override // e23.p
        public final Integer invoke(b bVar, b bVar2) {
            return Integer.valueOf(bVar.f195039a.compareTo(bVar2.f195039a));
        }
    }

    static {
        new a(null);
        l8.a.f111475a.getClass();
        new l8.a(l8.d.f111484a, "SleepSession", l8.a.EnumC2129a.DURATION, null);
        Map mapE = p13.u0.e(new o13.p("awake", 1), new o13.p("sleeping", 2), new o13.p("out_of_bed", 3), new o13.p("light", 4), new o13.p("deep", 5), new o13.p("rem", 6), new o13.p("awake_in_bed", 7), new o13.p(PrivacyUpdateRequestError.UNKNOWN, 0));
        f195029i = mapE;
        Set<Map.Entry> setEntrySet = mapE.entrySet();
        int iA = p13.t0.a(p13.y.r(setEntrySet, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap.put(Integer.valueOf(((Number) entry.getValue()).intValue()), (String) entry.getKey());
        }
        f195030j = linkedHashMap;
    }

    public w0(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, z8.c cVar, String str, String str2, List<b> list) {
        instant.getClass();
        instant2.getClass();
        cVar.getClass();
        list.getClass();
        this.f195031a = instant;
        this.f195032b = zoneOffset;
        this.f195033c = instant2;
        this.f195034d = zoneOffset2;
        this.f195035e = cVar;
        this.f195036f = str;
        this.f195037g = str2;
        this.f195038h = list;
        if (!instant.isBefore(instant2)) {
            vb.h.s("startTime must be before endTime.");
            throw null;
        }
        if (list.isEmpty()) {
            return;
        }
        List listN0 = p13.h0.N0(list, new p5.l0(c.f195042a, 3));
        int iJ = p13.x.j(listN0);
        int i14 = 0;
        while (i14 < iJ) {
            Instant instant3 = ((b) listN0.get(i14)).f195040b;
            i14++;
            if (instant3.isAfter(((b) listN0.get(i14)).f195039a)) {
                vb.h.s("Failed requirement.");
                throw null;
            }
        }
        if (((b) p13.h0.b0(listN0)).f195039a.isBefore(this.f195031a)) {
            vb.h.s("Failed requirement.");
            throw null;
        }
        if (((b) p13.h0.m0(listN0)).f195040b.isAfter(this.f195033c)) {
            vb.h.s("Failed requirement.");
            throw null;
        }
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ZoneOffset getF195067d() {
        return this.f195034d;
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: c, reason: from getter */
    public final ZoneOffset getF195065b() {
        return this.f195032b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return p005kotlin.jvm.internal.s.g(this.f195036f, w0Var.f195036f) && p005kotlin.jvm.internal.s.g(this.f195037g, w0Var.f195037g) && p005kotlin.jvm.internal.s.g(this.f195038h, w0Var.f195038h) && p005kotlin.jvm.internal.s.g(this.f195031a, w0Var.f195031a) && p005kotlin.jvm.internal.s.g(this.f195032b, w0Var.f195032b) && p005kotlin.jvm.internal.s.g(this.f195033c, w0Var.f195033c) && p005kotlin.jvm.internal.s.g(this.f195034d, w0Var.f195034d) && p005kotlin.jvm.internal.s.g(this.f195035e, w0Var.f195035e);
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: getEndTime, reason: from getter */
    public final Instant getF195066c() {
        return this.f195033c;
    }

    @Override // y8.q0
    /* JADX INFO: renamed from: getMetadata, reason: from getter */
    public final z8.c getF195076d() {
        return this.f195035e;
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: getStartTime, reason: from getter */
    public final Instant getF195064a() {
        return this.f195031a;
    }

    public final int hashCode() {
        String str = this.f195036f;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f195037g;
        int iB = lc.u0.b((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f195038h);
        ZoneOffset zoneOffset = this.f195032b;
        int iK = wr.g.k(this.f195033c, (iB + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.f195034d;
        return this.f195035e.hashCode() + ((iK + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SleepSessionRecord(startTime=");
        sb3.append(this.f195031a);
        sb3.append(", startZoneOffset=");
        sb3.append(this.f195032b);
        sb3.append(", endTime=");
        sb3.append(this.f195033c);
        sb3.append(", endZoneOffset=");
        sb3.append(this.f195034d);
        sb3.append(", title=");
        sb3.append(this.f195036f);
        sb3.append(", notes=");
        sb3.append(this.f195037g);
        sb3.append(", stages=");
        sb3.append(this.f195038h);
        sb3.append(", metadata=");
        return wr.g.q(sb3, this.f195035e, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b0\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Ly8/w0$a;", "", "<init>", "()V", "Ll8/a;", "Ljava/time/Duration;", "SLEEP_DURATION_TOTAL", "Ll8/a;", "", "STAGE_TYPE_UNKNOWN", "I", "STAGE_TYPE_AWAKE", "STAGE_TYPE_SLEEPING", "STAGE_TYPE_OUT_OF_BED", "STAGE_TYPE_LIGHT", "STAGE_TYPE_DEEP", "STAGE_TYPE_REM", "STAGE_TYPE_AWAKE_IN_BED", "", "", "STAGE_TYPE_STRING_TO_INT_MAP", "Ljava/util/Map;", "STAGE_TYPE_INT_TO_STRING_MAP", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public w0(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, z8.c cVar, String str, String str2, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this(instant, zoneOffset, instant2, zoneOffset2, cVar, (i14 & 32) != 0 ? null : str, (i14 & 64) != 0 ? null : str2, (i14 & 128) != 0 ? p13.j0.f134944a : list);
    }
}
