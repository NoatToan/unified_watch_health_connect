package gx;

import ae0.h;
import j20.x;
import j53.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B¹\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0012\b\u0002\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\t\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lgx/b;", "", "Lyz1/d;", "status", "", "todayBodyBatteryDrainedValue", "todayBodyBatteryChargedValue", "todayBodyBatteryMostRecentValue", "todaySleepEnd", "Li53/c;", "bodyBatteryRealTimeTodayValues", "bodyBatteryMeasuredTodayValues", "bodyBatteryEstimatedTodayValues", "bodyBatteryTodayStress", "bodyBatteryTodayRest", "Lae0/h;", "timelineEntries", "", "last4WeeksBodyBatteryDataAvailable", "isCreateAccountToday", "last4HoursDataAvailable", "<init>", "(Lyz1/d;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Li53/c;Li53/c;Li53/c;Li53/c;Li53/c;Li53/c;ZZZ)V", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yz1.d f80006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f80007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f80008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f80009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f80010e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i53.c<Integer> f80011f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i53.c<Integer> f80012g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i53.c<Integer> f80013h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i53.c<Integer> f80014i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i53.c<Integer> f80015j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i53.c<h> f80016k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f80017l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f80018m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f80019n;

    public b(yz1.d dVar, Integer num, Integer num2, Integer num3, Integer num4, i53.c cVar, i53.c cVar2, i53.c cVar3, i53.c cVar4, i53.c cVar5, i53.c cVar6, boolean z14, boolean z15, boolean z16, int i14, j jVar) {
        this(dVar, num, num2, num3, num4, (i14 & 32) != 0 ? null : cVar, (i14 & 64) != 0 ? l.b() : cVar2, (i14 & 128) != 0 ? l.b() : cVar3, (i14 & 256) != 0 ? l.b() : cVar4, (i14 & 512) != 0 ? l.b() : cVar5, cVar6, z14, z15, z16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f80006a, bVar.f80006a) && s.g(this.f80007b, bVar.f80007b) && s.g(this.f80008c, bVar.f80008c) && s.g(this.f80009d, bVar.f80009d) && s.g(this.f80010e, bVar.f80010e) && s.g(this.f80011f, bVar.f80011f) && s.g(this.f80012g, bVar.f80012g) && s.g(this.f80013h, bVar.f80013h) && s.g(this.f80014i, bVar.f80014i) && s.g(this.f80015j, bVar.f80015j) && s.g(this.f80016k, bVar.f80016k) && this.f80017l == bVar.f80017l && this.f80018m == bVar.f80018m && this.f80019n == bVar.f80019n;
    }

    public final int hashCode() {
        int iHashCode = this.f80006a.hashCode() * 31;
        Integer num = this.f80007b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f80008c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f80009d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f80010e;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        i53.c<Integer> cVar = this.f80011f;
        return Boolean.hashCode(this.f80019n) + q6.f.g(q6.f.g(l2.a(this.f80016k, l2.a(this.f80015j, l2.a(this.f80014i, l2.a(this.f80013h, l2.a(this.f80012g, (iHashCode5 + (cVar != null ? cVar.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31, this.f80017l), 31, this.f80018m);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BodyBatteryKeyStatCardData(status=");
        sb3.append(this.f80006a);
        sb3.append(", todayBodyBatteryDrainedValue=");
        sb3.append(this.f80007b);
        sb3.append(", todayBodyBatteryChargedValue=");
        x.m(sb3, this.f80008c, ", todayBodyBatteryMostRecentValue=", this.f80009d, ", todaySleepEnd=");
        sb3.append(this.f80010e);
        sb3.append(", bodyBatteryRealTimeTodayValues=");
        sb3.append(this.f80011f);
        sb3.append(", bodyBatteryMeasuredTodayValues=");
        q6.f.w(sb3, this.f80012g, ", bodyBatteryEstimatedTodayValues=", this.f80013h, ", bodyBatteryTodayStress=");
        q6.f.w(sb3, this.f80014i, ", bodyBatteryTodayRest=", this.f80015j, ", timelineEntries=");
        sb3.append(this.f80016k);
        sb3.append(", last4WeeksBodyBatteryDataAvailable=");
        sb3.append(this.f80017l);
        sb3.append(", isCreateAccountToday=");
        return com.airbnb.lottie.animation.keyframe.a.f(", last4HoursDataAvailable=", ")", sb3, this.f80018m, this.f80019n);
    }

    public b(yz1.d dVar, Integer num, Integer num2, Integer num3, Integer num4, i53.c<Integer> cVar, i53.c<Integer> cVar2, i53.c<Integer> cVar3, i53.c<Integer> cVar4, i53.c<Integer> cVar5, i53.c<h> cVar6, boolean z14, boolean z15, boolean z16) {
        dVar.getClass();
        cVar2.getClass();
        cVar3.getClass();
        cVar4.getClass();
        cVar5.getClass();
        cVar6.getClass();
        this.f80006a = dVar;
        this.f80007b = num;
        this.f80008c = num2;
        this.f80009d = num3;
        this.f80010e = num4;
        this.f80011f = cVar;
        this.f80012g = cVar2;
        this.f80013h = cVar3;
        this.f80014i = cVar4;
        this.f80015j = cVar5;
        this.f80016k = cVar6;
        this.f80017l = z14;
        this.f80018m = z15;
        this.f80019n = z16;
    }
}
