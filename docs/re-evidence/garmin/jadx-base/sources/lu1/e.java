package lu1;

import ds.e0;
import m52.k;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Llu1/e;", "", "Lm52/k;", "workoutType", "Lorg/joda/time/DateTime;", "day", "", "isCompleted", "isRace", "isToday", "isFutureItem", "", "numWorkouts", "hasBenchmarkWorkoutOnPlan", "isSupportingEvent", "<init>", "(Lm52/k;Lorg/joda/time/DateTime;ZZZZLjava/lang/Integer;ZZ)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f115005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f115006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f115007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f115008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f115009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f115010f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f115011g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f115012h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f115013i;

    public /* synthetic */ e(k kVar, DateTime dateTime, boolean z14, boolean z15, boolean z16, boolean z17, Integer num, boolean z18, boolean z19, int i14, j jVar) {
        this(kVar, dateTime, z14, z15, z16, (i14 & 32) != 0 ? false : z17, (i14 & 64) != 0 ? null : num, (i14 & 128) != 0 ? false : z18, (i14 & 256) != 0 ? false : z19);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f115005a == eVar.f115005a && s.g(this.f115006b, eVar.f115006b) && this.f115007c == eVar.f115007c && this.f115008d == eVar.f115008d && this.f115009e == eVar.f115009e && this.f115010f == eVar.f115010f && s.g(this.f115011g, eVar.f115011g) && this.f115012h == eVar.f115012h && this.f115013i == eVar.f115013i;
    }

    public final int hashCode() {
        k kVar = this.f115005a;
        int iG = f.g(f.g(f.g(f.g(e0.a((kVar == null ? 0 : kVar.hashCode()) * 31, this.f115006b, 31), 31, this.f115007c), 31, this.f115008d), 31, this.f115009e), 31, this.f115010f);
        Integer num = this.f115011g;
        return Boolean.hashCode(this.f115013i) + f.g((iG + (num != null ? num.hashCode() : 0)) * 31, 31, this.f115012h);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TrainingPlanWorkoutCalendarItem(workoutType=");
        sb3.append(this.f115005a);
        sb3.append(", day=");
        sb3.append(this.f115006b);
        sb3.append(", isCompleted=");
        kg.f.q(", isRace=", ", isToday=", sb3, this.f115007c, this.f115008d);
        kg.f.q(", isFutureItem=", ", numWorkouts=", sb3, this.f115009e, this.f115010f);
        sb3.append(this.f115011g);
        sb3.append(", hasBenchmarkWorkoutOnPlan=");
        sb3.append(this.f115012h);
        sb3.append(", isSupportingEvent=");
        return hb.a.k(sb3, this.f115013i, ")");
    }

    public e(k kVar, DateTime dateTime, boolean z14, boolean z15, boolean z16, boolean z17, Integer num, boolean z18, boolean z19) {
        dateTime.getClass();
        this.f115005a = kVar;
        this.f115006b = dateTime;
        this.f115007c = z14;
        this.f115008d = z15;
        this.f115009e = z16;
        this.f115010f = z17;
        this.f115011g = num;
        this.f115012h = z18;
        this.f115013i = z19;
    }
}
