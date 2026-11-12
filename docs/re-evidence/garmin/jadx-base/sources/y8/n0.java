package y8;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.temporal.TemporalAmount;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001dBu\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0015\u0010\u0016Bc\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0015\u0010\u0017BO\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0015\u0010\u001c¨\u0006\u001e"}, d2 = {"Ly8/n0;", "Ly8/d0;", "Ljava/time/Instant;", "startTime", "Ljava/time/ZoneOffset;", "startZoneOffset", "endTime", "endZoneOffset", "Lz8/c;", TtmlNode.TAG_METADATA, "", "hasExplicitTime", "", "exerciseType", "", "completedExerciseSessionId", "", "Ly8/m0;", "blocks", "title", "notes", "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Lz8/c;ZILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Lz8/c;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;)V", "Ljava/time/LocalDate;", "startDate", "Ljava/time/Duration;", "duration", "(Lz8/c;Ljava/time/LocalDate;Ljava/time/Duration;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;)V", "a", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n0 implements d0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f194904l = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f194905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f194906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f194907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ZoneOffset f194908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z8.c f194909e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f194910f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f194911g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f194912h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<m0> f194913i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f194914j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f194915k;

    /* JADX WARN: Illegal instructions before constructor call */
    public n0(z8.c cVar, LocalDate localDate, Duration duration, List<m0> list, int i14, String str, String str2) {
        cVar.getClass();
        localDate.getClass();
        duration.getClass();
        list.getClass();
        a aVar = f194904l;
        Instant instantA = a.a(aVar, localDate);
        ZoneOffset offset = ZoneId.systemDefault().getRules().getOffset(a.a(aVar, localDate));
        offset.getClass();
        Instant instantPlus = a.a(aVar, localDate).plus((TemporalAmount) duration);
        instantPlus.getClass();
        Instant instantPlus2 = a.a(aVar, localDate).plus((TemporalAmount) duration);
        instantPlus2.getClass();
        ZoneOffset offset2 = ZoneId.systemDefault().getRules().getOffset(instantPlus2);
        offset2.getClass();
        this(instantA, offset, instantPlus, offset2, cVar, false, i14, (String) null, list, str, str2);
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ZoneOffset getF194908d() {
        return this.f194908d;
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: c, reason: from getter */
    public final ZoneOffset getF194906b() {
        return this.f194906b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return p005kotlin.jvm.internal.s.g(this.f194905a, n0Var.f194905a) && p005kotlin.jvm.internal.s.g(this.f194906b, n0Var.f194906b) && p005kotlin.jvm.internal.s.g(this.f194907c, n0Var.f194907c) && p005kotlin.jvm.internal.s.g(this.f194908d, n0Var.f194908d) && this.f194910f == n0Var.f194910f && p005kotlin.jvm.internal.s.g(this.f194913i, n0Var.f194913i) && p005kotlin.jvm.internal.s.g(this.f194914j, n0Var.f194914j) && p005kotlin.jvm.internal.s.g(this.f194915k, n0Var.f194915k) && this.f194911g == n0Var.f194911g && p005kotlin.jvm.internal.s.g(this.f194909e, n0Var.f194909e);
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: getEndTime, reason: from getter */
    public final Instant getF194907c() {
        return this.f194907c;
    }

    @Override // y8.q0
    /* JADX INFO: renamed from: getMetadata, reason: from getter */
    public final z8.c getF194909e() {
        return this.f194909e;
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: getStartTime, reason: from getter */
    public final Instant getF194905a() {
        return this.f194905a;
    }

    public final int hashCode() {
        int iHashCode = this.f194905a.hashCode() * 31;
        ZoneOffset zoneOffset = this.f194906b;
        int iK = wr.g.k(this.f194907c, (iHashCode + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.f194908d;
        int iB = lc.u0.b(q6.f.g((iK + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31, 31, this.f194910f), 31, this.f194913i);
        String str = this.f194914j;
        int iHashCode2 = (iB + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f194915k;
        int iHashCode3 = (((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f194911g) * 31;
        String str3 = this.f194912h;
        return this.f194909e.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PlannedExerciseSessionRecord(startTime=");
        sb3.append(this.f194905a);
        sb3.append(", startZoneOffset=");
        sb3.append(this.f194906b);
        sb3.append(", endTime=");
        sb3.append(this.f194907c);
        sb3.append(", endZoneOffset=");
        sb3.append(this.f194908d);
        sb3.append(", hasExplicitTime=");
        sb3.append(this.f194910f);
        sb3.append(", title=");
        sb3.append(this.f194914j);
        sb3.append(", notes=");
        sb3.append(this.f194915k);
        sb3.append(", exerciseType=");
        sb3.append(this.f194911g);
        sb3.append(", completedExerciseSessionId=");
        sb3.append(this.f194912h);
        sb3.append(", metadata=");
        sb3.append(this.f194909e);
        sb3.append(", blocks=");
        return o2.c.d(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.f194913i, sb3);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ly8/n0$a;", "", "<init>", "()V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static final Instant a(a aVar, LocalDate localDate) {
            aVar.getClass();
            Instant instant = localDate.atTime(LocalTime.NOON).atZone(ZoneId.systemDefault()).toInstant();
            instant.getClass();
            return instant;
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n0(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, z8.c cVar, List<m0> list, int i14, String str) {
        this(instant, zoneOffset, instant2, zoneOffset2, cVar, list, i14, str, (String) null, 256, (p005kotlin.jvm.internal.j) null);
        instant.getClass();
        instant2.getClass();
        cVar.getClass();
        list.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n0(z8.c cVar, LocalDate localDate, Duration duration, List<m0> list, int i14) {
        this(cVar, localDate, duration, list, i14, (String) null, (String) null, 96, (p005kotlin.jvm.internal.j) null);
        cVar.getClass();
        localDate.getClass();
        duration.getClass();
        list.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n0(z8.c cVar, LocalDate localDate, Duration duration, List<m0> list, int i14, String str) {
        this(cVar, localDate, duration, list, i14, str, (String) null, 64, (p005kotlin.jvm.internal.j) null);
        cVar.getClass();
        localDate.getClass();
        duration.getClass();
        list.getClass();
    }

    public n0(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, z8.c cVar, boolean z14, int i14, String str, List<m0> list, String str2, String str3) {
        instant.getClass();
        instant2.getClass();
        cVar.getClass();
        list.getClass();
        this.f194905a = instant;
        this.f194906b = zoneOffset;
        this.f194907c = instant2;
        this.f194908d = zoneOffset2;
        this.f194909e = cVar;
        this.f194910f = z14;
        this.f194911g = i14;
        this.f194912h = str;
        this.f194913i = list;
        this.f194914j = str2;
        this.f194915k = str3;
        if (instant.isBefore(instant2)) {
            return;
        }
        vb.h.s("Failed requirement.");
        throw null;
    }

    public /* synthetic */ n0(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, z8.c cVar, boolean z14, int i14, String str, List list, String str2, String str3, int i15, p005kotlin.jvm.internal.j jVar) {
        this(instant, zoneOffset, instant2, zoneOffset2, cVar, z14, i14, str, (List<m0>) list, (i15 & 512) != 0 ? null : str2, (i15 & 1024) != 0 ? null : str3);
    }

    public /* synthetic */ n0(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, z8.c cVar, List list, int i14, String str, String str2, int i15, p005kotlin.jvm.internal.j jVar) {
        this(instant, zoneOffset, instant2, zoneOffset2, cVar, (List<m0>) list, i14, (i15 & 128) != 0 ? null : str, (i15 & 256) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n0(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, z8.c cVar, List<m0> list, int i14, String str, String str2) {
        this(instant, zoneOffset, instant2, zoneOffset2, cVar, true, i14, (String) null, list, str, str2);
        instant.getClass();
        instant2.getClass();
        cVar.getClass();
        list.getClass();
    }

    public /* synthetic */ n0(z8.c cVar, LocalDate localDate, Duration duration, List list, int i14, String str, String str2, int i15, p005kotlin.jvm.internal.j jVar) {
        this(cVar, localDate, duration, (List<m0>) list, i14, (i15 & 32) != 0 ? null : str, (i15 & 64) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n0(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, z8.c cVar, List<m0> list, int i14) {
        this(instant, zoneOffset, instant2, zoneOffset2, cVar, list, i14, (String) null, (String) null, 384, (p005kotlin.jvm.internal.j) null);
        instant.getClass();
        instant2.getClass();
        cVar.getClass();
        list.getClass();
    }
}
