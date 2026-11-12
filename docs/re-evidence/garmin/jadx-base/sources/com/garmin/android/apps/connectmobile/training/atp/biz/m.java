package com.garmin.android.apps.connectmobile.training.atp.biz;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u000eB7\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/biz/m;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "", "Lxw1/m;", "", "planTypeId", "", "language", "prePlanWeeklyMileage", "prePlanTrainingPace", "Lcom/garmin/android/library/backgroundtaskmanagement/b$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/garmin/android/library/backgroundtaskmanagement/b$a;)V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends com.garmin.android.library.backgroundtaskmanagement.b<List<? extends xw1.m>> {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B=\b\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/biz/m$a;", "Liu1/h;", "Lxw1/m;", "", "planTypeId", "", "language", "prePlanWeeklyMileage", "prePlanTrainingPace", "Liu1/i;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Liu1/i;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends iu1.h<xw1.m> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Integer f45179l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final String f45180m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Integer f45181n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final Integer f45182o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Integer num, String str, Integer num2, Integer num3, iu1.i<? super xw1.m> iVar) {
            super(null, null, false, xw1.m.class, null, iVar, null, null, 215, null);
            str.getClass();
            iVar.getClass();
            this.f45179l = num;
            this.f45180m = str;
            this.f45181n = num2;
            this.f45182o = num3;
        }

        @Override // iu1.h
        public final c83.d<String> f() {
            Integer num = this.f45179l;
            int iIntValue = num != null ? num.intValue() : rt1.r.FIVE_K.f154560a;
            Integer num2 = this.f45181n;
            int iIntValue2 = num2 != null ? num2.intValue() : 0;
            Integer num3 = this.f45182o;
            return ((gu1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, gu1.a.class, new c83.h.a[0], null, null, null, 120)).i(iIntValue, this.f45180m, iIntValue2, num3 != null ? num3.intValue() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/training/atp/biz/m$b", "Liu1/i;", "Lxw1/m;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements iu1.i<xw1.m> {
        public b() {
        }

        @Override // iu1.i
        public final void b(List<? extends xw1.m> list) {
            m.this.i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, list);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Integer num, String str, Integer num2, Integer num3, com.garmin.android.library.backgroundtaskmanagement.b.a aVar) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.UI_PRIORITY, aVar);
        str.getClass();
        i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, new ArrayList());
        cw.e.a(this, new a(num, str, num2, num3, new b()));
    }
}
