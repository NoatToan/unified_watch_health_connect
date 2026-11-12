package com.garmin.android.apps.connectmobile.training.atp.biz;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fBA\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/biz/n;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "Lfu1/r;", "", "planTypeId", "prePlanWeeklyMileage", "prePlanTrainingPace", "", "workoutPlanId", "", "personalGoalChanged", "Lcom/garmin/android/library/backgroundtaskmanagement/b$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;ZLcom/garmin/android/library/backgroundtaskmanagement/b$a;)V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends com.garmin.android.library.backgroundtaskmanagement.b<fu1.r> {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BG\b\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/biz/n$a;", "Liu1/h;", "Lfu1/r;", "", "planTypeId", "prePlanWeeklyMileage", "prePlanTrainingPace", "", "workoutPlanId", "", "personalGoalChanged", "Liu1/k;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;ZLiu1/k;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends iu1.h<fu1.r> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Integer f45184l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Integer f45185m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Integer f45186n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final Long f45187o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final boolean f45188p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Integer num, Integer num2, Integer num3, Long l14, boolean z14, iu1.k<? super fu1.r> kVar) {
            super(null, null, false, fu1.r.class, kVar, null, null, null, 231, null);
            kVar.getClass();
            this.f45184l = num;
            this.f45185m = num2;
            this.f45186n = num3;
            this.f45187o = l14;
            this.f45188p = z14;
        }

        @Override // iu1.h
        public final c83.d<String> f() {
            Integer num = this.f45184l;
            int iIntValue = num != null ? num.intValue() : rt1.r.FIVE_K.f154560a;
            Integer num2 = this.f45185m;
            int iIntValue2 = num2 != null ? num2.intValue() : 0;
            Integer num3 = this.f45186n;
            int iIntValue3 = num3 != null ? num3.intValue() : 0;
            Long l14 = this.f45188p ? null : this.f45187o;
            if (l14 == null || l14.longValue() <= 0) {
                return ((gu1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, gu1.a.class, new c83.h.a[0], null, null, null, 120)).B(iIntValue, iIntValue2, iIntValue3);
            }
            return ((gu1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, gu1.a.class, new c83.h.a[0], null, null, null, 120)).m(iIntValue, iIntValue2, iIntValue3, l14.longValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/training/atp/biz/n$b", "Liu1/k;", "Lfu1/r;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements iu1.k<fu1.r> {
        public b() {
        }

        @Override // iu1.k
        public final void onSuccess(fu1.r rVar) {
            n.this.i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, rVar);
        }
    }

    public n(Integer num, Integer num2, Integer num3, Long l14, boolean z14, com.garmin.android.library.backgroundtaskmanagement.b.a aVar) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.UI_PRIORITY, aVar);
        i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, new fu1.r(null, 0, 3, null));
        cw.e.a(this, new a(num, num2, num3, l14, z14, new b()));
    }
}
