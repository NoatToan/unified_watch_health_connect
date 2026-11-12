package y8;

import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.activities.model.PrivacyUpdateRequestError;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0011BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Ly8/i0;", "Ly8/d0;", "Ljava/time/Instant;", "startTime", "Ljava/time/ZoneOffset;", "startZoneOffset", "endTime", "endZoneOffset", "Lz8/c;", TtmlNode.TAG_METADATA, "", "mindfulnessSessionType", "", "title", "notes", "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Lz8/c;ILjava/lang/String;Ljava/lang/String;)V", "a", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i0 implements d0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f194818i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final LinkedHashMap f194819j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f194820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f194821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f194822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ZoneOffset f194823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z8.c f194824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f194825f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f194826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f194827h;

    static {
        new a(null);
        l8.a.f111475a.getClass();
        new l8.a(l8.d.f111484a, "MindfulnessSession", l8.a.EnumC2129a.DURATION, null);
        Map mapE = p13.u0.e(new o13.p("breathing", 2), new o13.p("meditation", 1), new o13.p("movement", 4), new o13.p("music", 3), new o13.p("unguided", 5), new o13.p(PrivacyUpdateRequestError.UNKNOWN, 0));
        f194818i = mapE;
        f194819j = b1.f(mapE);
    }

    public i0(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, z8.c cVar, int i14, String str, String str2) {
        instant.getClass();
        instant2.getClass();
        cVar.getClass();
        this.f194820a = instant;
        this.f194821b = zoneOffset;
        this.f194822c = instant2;
        this.f194823d = zoneOffset2;
        this.f194824e = cVar;
        this.f194825f = i14;
        this.f194826g = str;
        this.f194827h = str2;
        if (instant.isBefore(instant2)) {
            return;
        }
        vb.h.s("startTime must be before endTime.");
        throw null;
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ZoneOffset getF194823d() {
        return this.f194823d;
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: c, reason: from getter */
    public final ZoneOffset getF194821b() {
        return this.f194821b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.f194825f == i0Var.f194825f && p005kotlin.jvm.internal.s.g(this.f194826g, i0Var.f194826g) && p005kotlin.jvm.internal.s.g(this.f194827h, i0Var.f194827h) && p005kotlin.jvm.internal.s.g(this.f194820a, i0Var.f194820a) && p005kotlin.jvm.internal.s.g(this.f194821b, i0Var.f194821b) && p005kotlin.jvm.internal.s.g(this.f194822c, i0Var.f194822c) && p005kotlin.jvm.internal.s.g(this.f194823d, i0Var.f194823d) && p005kotlin.jvm.internal.s.g(this.f194824e, i0Var.f194824e);
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: getEndTime, reason: from getter */
    public final Instant getF194822c() {
        return this.f194822c;
    }

    @Override // y8.q0
    /* JADX INFO: renamed from: getMetadata, reason: from getter */
    public final z8.c getF194824e() {
        return this.f194824e;
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: getStartTime, reason: from getter */
    public final Instant getF194820a() {
        return this.f194820a;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f194825f) * 31;
        String str = this.f194826g;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f194827h;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        ZoneOffset zoneOffset = this.f194821b;
        int iK = wr.g.k(this.f194822c, (iHashCode3 + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.f194823d;
        return this.f194824e.hashCode() + ((iK + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MindfulnessSessionRecord(startTime=");
        sb3.append(this.f194820a);
        sb3.append(", startZoneOffset=");
        sb3.append(this.f194821b);
        sb3.append(", endTime=");
        sb3.append(this.f194822c);
        sb3.append(", endZoneOffset=");
        sb3.append(this.f194823d);
        sb3.append(", mindfulnessSessionType=");
        sb3.append(this.f194825f);
        sb3.append(", title=");
        sb3.append(this.f194826g);
        sb3.append(", notes=");
        sb3.append(this.f194827h);
        sb3.append(", metadata=");
        return wr.g.q(sb3, this.f194824e, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Ly8/i0$a;", "", "<init>", "()V", "Ll8/a;", "Ljava/time/Duration;", "MINDFULNESS_DURATION_TOTAL", "Ll8/a;", "", "MINDFULNESS_SESSION_TYPE_UNKNOWN", "I", "MINDFULNESS_SESSION_TYPE_MEDITATION", "MINDFULNESS_SESSION_TYPE_BREATHING", "MINDFULNESS_SESSION_TYPE_MUSIC", "MINDFULNESS_SESSION_TYPE_MOVEMENT", "MINDFULNESS_SESSION_TYPE_UNGUIDED", "", "", "MINDFULNESS_SESSION_TYPE_STRING_TO_INT_MAP", "Ljava/util/Map;", "MINDFULNESS_SESSION_TYPE_INT_TO_STRING_MAP", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ i0(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, z8.c cVar, int i14, String str, String str2, int i15, p005kotlin.jvm.internal.j jVar) {
        this(instant, zoneOffset, instant2, zoneOffset2, cVar, i14, (i15 & 64) != 0 ? null : str, (i15 & 128) != 0 ? null : str2);
    }
}
