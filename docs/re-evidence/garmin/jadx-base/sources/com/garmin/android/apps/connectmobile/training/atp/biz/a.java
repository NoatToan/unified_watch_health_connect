package com.garmin.android.apps.connectmobile.training.atp.biz;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\r\u000eB1\b\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/biz/a;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "", "", "athletePlanId", "", "reason", "", "action", "Lcom/garmin/android/library/backgroundtaskmanagement/b$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(JLjava/lang/String;ILcom/garmin/android/library/backgroundtaskmanagement/b$a;)V", "a", "b", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends com.garmin.android.library.backgroundtaskmanagement.b<Object> {

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/training/atp/biz/a$c", "Liu1/j;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements iu1.j {
        @Override // iu1.j
        public final void c(String str) {
        }
    }

    static {
        new C0863a(null);
    }

    public a(long j8, String str, int i14, com.garmin.android.library.backgroundtaskmanagement.b.a aVar) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.UI_PRIORITY, aVar);
        i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, new Object());
        c cVar = new c();
        if (i14 == 1) {
            cw.e.a(this, new xt1.h(j8, cVar));
            return;
        }
        if (i14 == 2) {
            cw.e.a(this, new b(j8, str == null ? "OTHER" : str, cVar));
            return;
        }
        if (i14 == 3) {
            ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).b1(true);
            cw.e.a(this, new xt1.i(j8, cVar));
        } else {
            if (i14 == 4) {
                cw.e.a(this, new xt1.k(j8, cVar));
                return;
            }
            String strH = am.j.h(i14, "Unsupported ATPActionsOperation action ");
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "ATPActionsOperation", strH);
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.training.atp.biz.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/biz/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "PAUSE", "I", "RESUME", "QUIT", "REMOVE", "REASON_INJURY", "REASON_VACATION", "REASON_BUSY", "REASON_OTHER", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0863a {
        public /* synthetic */ C0863a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C0863a() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\b\u0000\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/biz/a$b;", "Liu1/h;", "", "", "athletePlanId", "", "reason", "Liu1/j;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(JLjava/lang/String;Liu1/j;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends iu1.h<Object> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final long f45117l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final String f45118m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j8, String str, iu1.j jVar) {
            super(null, null, false, Object.class, null, null, jVar, null, 183, null);
            str.getClass();
            jVar.getClass();
            this.f45117l = j8;
            this.f45118m = str;
        }

        @Override // iu1.h
        public final c83.d<String> f() {
            return ((gu1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, gu1.a.class, new c83.h.a[0], null, null, null, 120)).e(this.f45118m, String.valueOf(this.f45117l));
        }

        public /* synthetic */ b(long j8, String str, iu1.j jVar, int i14, p005kotlin.jvm.internal.j jVar2) {
            this((i14 & 1) != 0 ? -1L : j8, (i14 & 2) != 0 ? "REASON_OTHER" : str, jVar);
        }
    }

    public a(long j8, int i14, com.garmin.android.library.backgroundtaskmanagement.b.a aVar) {
        this(j8, null, i14, aVar, 2, null);
    }

    public /* synthetic */ a(long j8, String str, int i14, com.garmin.android.library.backgroundtaskmanagement.b.a aVar, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? -1L : j8, (i15 & 2) != 0 ? null : str, i14, aVar);
    }

    public a(int i14, com.garmin.android.library.backgroundtaskmanagement.b.a aVar) {
        this(0L, null, i14, aVar, 3, null);
    }
}
