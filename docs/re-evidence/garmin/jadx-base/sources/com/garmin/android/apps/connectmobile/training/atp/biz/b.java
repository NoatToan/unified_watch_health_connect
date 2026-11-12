package com.garmin.android.apps.connectmobile.training.atp.biz;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u000e\u000f\u0010B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/biz/b;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "", "", "athletePlanId", "workoutId", "", "newDate", "", "action", "Lcom/garmin/android/library/backgroundtaskmanagement/b$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(JJLjava/lang/String;ILcom/garmin/android/library/backgroundtaskmanagement/b$a;)V", "c", "b", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends com.garmin.android.library.backgroundtaskmanagement.b<Object> {

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.training.atp.biz.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/biz/b$b;", "Liu1/h;", "", "", "athletePlanId", "workoutId", "Liu1/j;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(JJLiu1/j;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0864b extends iu1.h<Object> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final long f45119l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final long f45120m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0864b(long j8, long j14, iu1.j jVar) {
            super(null, null, false, Object.class, null, null, jVar, null, 183, null);
            jVar.getClass();
            this.f45119l = j8;
            this.f45120m = j14;
        }

        @Override // iu1.h
        public final c83.d<String> f() {
            return ((gu1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, gu1.a.class, new c83.h.a[0], null, null, null, 120)).o(String.valueOf(this.f45119l), String.valueOf(this.f45120m));
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/biz/b$c;", "Liu1/h;", "", "", "athletePlanId", "workoutId", "", "date", "Liu1/j;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(JJLjava/lang/String;Liu1/j;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends iu1.h<Object> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final long f45121l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final long f45122m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final String f45123n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j8, long j14, String str, iu1.j jVar) {
            super(null, null, false, Object.class, null, null, jVar, null, 183, null);
            str.getClass();
            jVar.getClass();
            this.f45121l = j8;
            this.f45122m = j14;
            this.f45123n = str;
        }

        @Override // iu1.h
        public final c83.d<String> f() {
            return ((gu1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, gu1.a.class, new c83.h.a[0], null, null, null, 120)).g(String.valueOf(this.f45121l), String.valueOf(this.f45122m), this.f45123n);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/training/atp/biz/b$d", "Liu1/j;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements iu1.j {
        @Override // iu1.j
        public final void c(String str) {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long j8, long j14, String str, int i14, com.garmin.android.library.backgroundtaskmanagement.b.a aVar) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.UI_PRIORITY, aVar);
        str.getClass();
        i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, new Object());
        d dVar = new d();
        if (i14 == 1) {
            cw.e.a(this, new c(j8, j14, str, dVar));
            return;
        }
        if (i14 == 2) {
            cw.e.a(this, new C0864b(j8, j14, dVar));
            return;
        }
        String strH = am.j.h(i14, "Unsupported ATPWorkoutActionsOperation action ");
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.f(a2Var, "ATPWorkoutActionsOperation", strH);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/biz/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "RESCHEDULE", "I", "REMOVE", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ b(long j8, long j14, String str, int i14, com.garmin.android.library.backgroundtaskmanagement.b.a aVar, int i15, p005kotlin.jvm.internal.j jVar) {
        this(j8, j14, (i15 & 4) != 0 ? "" : str, i14, aVar);
    }
}
