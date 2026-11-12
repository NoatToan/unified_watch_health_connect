package y8;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Ly8/e;", "Ly8/b0;", "Ljava/time/Instant;", "time", "Ljava/time/ZoneOffset;", "zoneOffset", "Lz8/c;", TtmlNode.TAG_METADATA, "Lc9/a;", "level", "", "specimenSource", "mealType", "relationToMeal", "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Lz8/c;Lc9/a;III)V", "a", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e implements b0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c9.a f194754h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f194755i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final LinkedHashMap f194756j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f194757k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final LinkedHashMap f194758l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f194759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f194760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z8.c f194761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c9.a f194762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f194763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f194764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f194765g;

    static {
        new a(null);
        c9.a.f25937c.getClass();
        f194754h = new c9.a(50.0d, c9.a.b.f25941a, null);
        Map mapE = p13.u0.e(new o13.p("general", 1), new o13.p("after_meal", 4), new o13.p("fasting", 2), new o13.p("before_meal", 3));
        f194755i = mapE;
        f194756j = b1.f(mapE);
        Map mapE2 = p13.u0.e(new o13.p("interstitial_fluid", 1), new o13.p("capillary_blood", 2), new o13.p("plasma", 3), new o13.p("tears", 5), new o13.p("whole_blood", 6), new o13.p("serum", 4));
        f194757k = mapE2;
        f194758l = b1.f(mapE2);
    }

    public e(Instant instant, ZoneOffset zoneOffset, z8.c cVar, c9.a aVar, int i14, int i15, int i16) {
        instant.getClass();
        cVar.getClass();
        aVar.getClass();
        this.f194759a = instant;
        this.f194760b = zoneOffset;
        this.f194761c = cVar;
        this.f194762d = aVar;
        this.f194763e = i14;
        this.f194764f = i15;
        this.f194765g = i16;
        b1.d(aVar, (c9.a) p13.u0.c(aVar.f25940b, c9.a.f25938d), "level");
        b1.e(aVar, f194754h, "level");
    }

    @Override // y8.b0
    /* JADX INFO: renamed from: d, reason: from getter */
    public final ZoneOffset getF194760b() {
        return this.f194760b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!e.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        e eVar = (e) obj;
        return p005kotlin.jvm.internal.s.g(this.f194759a, eVar.f194759a) && p005kotlin.jvm.internal.s.g(this.f194760b, eVar.f194760b) && p005kotlin.jvm.internal.s.g(this.f194762d, eVar.f194762d) && this.f194763e == eVar.f194763e && this.f194764f == eVar.f194764f && this.f194765g == eVar.f194765g && p005kotlin.jvm.internal.s.g(this.f194761c, eVar.f194761c);
    }

    @Override // y8.q0
    /* JADX INFO: renamed from: getMetadata, reason: from getter */
    public final z8.c getF194761c() {
        return this.f194761c;
    }

    @Override // y8.b0
    /* JADX INFO: renamed from: getTime, reason: from getter */
    public final Instant getF194759a() {
        return this.f194759a;
    }

    public final int hashCode() {
        int iHashCode = this.f194759a.hashCode() * 31;
        ZoneOffset zoneOffset = this.f194760b;
        return this.f194761c.hashCode() + ((((((((this.f194762d.hashCode() + ((iHashCode + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31)) * 31) + this.f194763e) * 31) + this.f194764f) * 31) + this.f194765g) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BloodGlucoseRecord(time=");
        sb3.append(this.f194759a);
        sb3.append(", zoneOffset=");
        sb3.append(this.f194760b);
        sb3.append(", level=");
        sb3.append(this.f194762d);
        sb3.append(", specimenSource=");
        sb3.append(this.f194763e);
        sb3.append(", mealType=");
        sb3.append(this.f194764f);
        sb3.append(", relationToMeal=");
        sb3.append(this.f194765g);
        sb3.append(", metadata=");
        return wr.g.q(sb3, this.f194761c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\tR\u0014\u0010\u0011\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\tR\u0014\u0010\u0012\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\tR\u0014\u0010\u0013\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\tR\u0014\u0010\u0014\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\tR \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00070\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00160\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00070\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00160\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018¨\u0006\u001c"}, d2 = {"Ly8/e$a;", "", "<init>", "()V", "Lc9/a;", "MAX_BLOOD_GLUCOSE_LEVEL", "Lc9/a;", "", "RELATION_TO_MEAL_UNKNOWN", "I", "RELATION_TO_MEAL_GENERAL", "RELATION_TO_MEAL_FASTING", "RELATION_TO_MEAL_BEFORE_MEAL", "RELATION_TO_MEAL_AFTER_MEAL", "SPECIMEN_SOURCE_UNKNOWN", "SPECIMEN_SOURCE_INTERSTITIAL_FLUID", "SPECIMEN_SOURCE_CAPILLARY_BLOOD", "SPECIMEN_SOURCE_PLASMA", "SPECIMEN_SOURCE_SERUM", "SPECIMEN_SOURCE_TEARS", "SPECIMEN_SOURCE_WHOLE_BLOOD", "", "", "RELATION_TO_MEAL_STRING_TO_INT_MAP", "Ljava/util/Map;", "RELATION_TO_MEAL_INT_TO_STRING_MAP", "SPECIMEN_SOURCE_STRING_TO_INT_MAP", "SPECIMEN_SOURCE_INT_TO_STRING_MAP", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ e(Instant instant, ZoneOffset zoneOffset, z8.c cVar, c9.a aVar, int i14, int i15, int i16, int i17, p005kotlin.jvm.internal.j jVar) {
        this(instant, zoneOffset, cVar, aVar, (i17 & 16) != 0 ? 0 : i14, (i17 & 32) != 0 ? 0 : i15, (i17 & 64) != 0 ? 0 : i16);
    }
}
