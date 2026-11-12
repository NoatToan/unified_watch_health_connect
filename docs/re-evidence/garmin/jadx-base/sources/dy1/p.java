package dy1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.gncs.NotificationConstants;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import p005kotlin.Metadata;
import p3.x1;
import yc.l2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u001a\b\u0002\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u00120\u0006¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Ldy1/p;", "", "Lmx1/d;", "goal", "Lmx1/c;", "equipment", "Li53/c;", "Lmx1/f;", "availableStrengthTrainingPlanTypes", NotificationConstants.KEY_DATA_MIME_TYPE, "", "addBenchmarkingWeek", "addDeloadWeek", "", "startDateUtcMillis", "endDateUtcMillis", "", "planName", "Lo13/p;", "workoutNames", "<init>", "(Lmx1/d;Lmx1/c;Li53/c;Lmx1/f;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Li53/c;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mx1.d f61595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mx1.c f61596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i53.c<mx1.f> f61597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mx1.f f61598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Boolean f61599e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Boolean f61600f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f61601g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f61602h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f61603i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i53.c<o13.p<String, String>> f61604j;

    public p(mx1.d dVar, mx1.c cVar, i53.c cVar2, mx1.f fVar, Boolean bool, Boolean bool2, Long l14, Long l15, String str, i53.c cVar3, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : dVar, (i14 & 2) != 0 ? null : cVar, (i14 & 4) != 0 ? j53.l.b() : cVar2, (i14 & 8) != 0 ? null : fVar, (i14 & 16) != 0 ? null : bool, (i14 & 32) != 0 ? null : bool2, (i14 & 64) != 0 ? null : l14, (i14 & 128) != 0 ? null : l15, (i14 & 256) != 0 ? null : str, (i14 & 512) != 0 ? j53.l.b() : cVar3);
    }

    public static p a(p pVar, mx1.d dVar, mx1.c cVar, i53.f fVar, mx1.f fVar2, Boolean bool, Boolean bool2, Long l14, Long l15, String str, i53.c cVar2, int i14) {
        if ((i14 & 1) != 0) {
            dVar = pVar.f61595a;
        }
        mx1.d dVar2 = dVar;
        if ((i14 & 2) != 0) {
            cVar = pVar.f61596b;
        }
        mx1.c cVar3 = cVar;
        i53.c<mx1.f> cVar4 = fVar;
        if ((i14 & 4) != 0) {
            cVar4 = pVar.f61597c;
        }
        i53.c<mx1.f> cVar5 = cVar4;
        if ((i14 & 8) != 0) {
            fVar2 = pVar.f61598d;
        }
        mx1.f fVar3 = fVar2;
        Boolean bool3 = (i14 & 16) != 0 ? pVar.f61599e : bool;
        Boolean bool4 = (i14 & 32) != 0 ? pVar.f61600f : bool2;
        Long l16 = (i14 & 64) != 0 ? pVar.f61601g : l14;
        Long l17 = (i14 & 128) != 0 ? pVar.f61602h : l15;
        String str2 = (i14 & 256) != 0 ? pVar.f61603i : str;
        i53.c cVar6 = (i14 & 512) != 0 ? pVar.f61604j : cVar2;
        pVar.getClass();
        cVar5.getClass();
        cVar6.getClass();
        return new p(dVar2, cVar3, cVar5, fVar3, bool3, bool4, l16, l17, str2, cVar6);
    }

    public final String b(p3.m mVar) {
        x1 x1Var = p3.n.f135158a;
        Long l14 = this.f61601g;
        if (l14 == null) {
            mVar.C(110912814);
            mVar.f();
            return null;
        }
        mVar.C(110912815);
        pi0.e eVar = new pi0.e((Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b));
        LocalDateTime localDateTime = new DateTime(l14.longValue(), DateTimeZone.UTC).toLocalDateTime();
        localDateTime.getClass();
        qi0.a aVar = qi0.a.RELATIVE_YEAR_MONTH_DAY_WEEKDAY;
        aVar.getClass();
        String strA = eVar.a(g22.k.r(localDateTime), aVar);
        mVar.f();
        return strA;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f61595a == pVar.f61595a && this.f61596b == pVar.f61596b && p005kotlin.jvm.internal.s.g(this.f61597c, pVar.f61597c) && p005kotlin.jvm.internal.s.g(this.f61598d, pVar.f61598d) && p005kotlin.jvm.internal.s.g(this.f61599e, pVar.f61599e) && p005kotlin.jvm.internal.s.g(this.f61600f, pVar.f61600f) && p005kotlin.jvm.internal.s.g(this.f61601g, pVar.f61601g) && p005kotlin.jvm.internal.s.g(this.f61602h, pVar.f61602h) && p005kotlin.jvm.internal.s.g(this.f61603i, pVar.f61603i) && p005kotlin.jvm.internal.s.g(this.f61604j, pVar.f61604j);
    }

    public final int hashCode() {
        mx1.d dVar = this.f61595a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        mx1.c cVar = this.f61596b;
        int iA = l2.a(this.f61597c, (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31, 31);
        mx1.f fVar = this.f61598d;
        int iHashCode2 = (iA + (fVar == null ? 0 : fVar.hashCode())) * 31;
        Boolean bool = this.f61599e;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f61600f;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l14 = this.f61601g;
        int iHashCode5 = (iHashCode4 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.f61602h;
        int iHashCode6 = (iHashCode5 + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str = this.f61603i;
        return this.f61604j.hashCode() + ((iHashCode6 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StrengthTrainingPlanState(goal=");
        sb3.append(this.f61595a);
        sb3.append(", equipment=");
        sb3.append(this.f61596b);
        sb3.append(", availableStrengthTrainingPlanTypes=");
        sb3.append(this.f61597c);
        sb3.append(", type=");
        sb3.append(this.f61598d);
        sb3.append(", addBenchmarkingWeek=");
        b71.i.o(this.f61599e, this.f61600f, ", addDeloadWeek=", ", startDateUtcMillis=", sb3);
        kg.f.s(sb3, this.f61601g, ", endDateUtcMillis=", this.f61602h, ", planName=");
        sb3.append(this.f61603i);
        sb3.append(", workoutNames=");
        sb3.append(this.f61604j);
        sb3.append(")");
        return sb3.toString();
    }

    public p(mx1.d dVar, mx1.c cVar, i53.c<mx1.f> cVar2, mx1.f fVar, Boolean bool, Boolean bool2, Long l14, Long l15, String str, i53.c<o13.p<String, String>> cVar3) {
        cVar2.getClass();
        cVar3.getClass();
        this.f61595a = dVar;
        this.f61596b = cVar;
        this.f61597c = cVar2;
        this.f61598d = fVar;
        this.f61599e = bool;
        this.f61600f = bool2;
        this.f61601g = l14;
        this.f61602h = l15;
        this.f61603i = str;
        this.f61604j = cVar3;
    }

    public p() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }
}
