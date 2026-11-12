package com.garmin.android.apps.connectmobile.startup;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o13.q;
import o13.r;
import o53.b0;
import o53.c2;
import o53.s0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.w;
import p13.y;
import q92.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/startup/k;", "Landroidx/lifecycle/u1;", "<init>", "()V", "a", "b", "c", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f44879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y0<c> f44880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c2 f44881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z53.b f44882d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/startup/k$b;", "", "<init>", "(Ljava/lang/String;I)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        START_COLLECTING_DOB_FLOW,
        START_LOCATION_CONSENT_CHECKS,
        START_DELETE_DATA_CONSENT,
        LOCKED_IN_LIVE_ACTIVITY_SESSION,
        REDIRECT
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.startup.StartupViewModel$logEvent$1", f = "StartupViewModel.kt", l = {154}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public z53.b f44891a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f44892b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f44893c;

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = k.this.new d(dVar);
            dVar2.f44893c = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            z53.b bVar;
            Object bVar2;
            b0 b0Var = (b0) this.f44893c;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f44892b;
            if (i14 == 0) {
                r.b(obj);
                z53.b bVar3 = k.this.f44882d;
                this.f44893c = b0Var;
                this.f44891a = bVar3;
                this.f44892b = 1;
                if (bVar3.c(this) == aVar) {
                    return aVar;
                }
                bVar = bVar3;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bVar = this.f44891a;
                r.b(obj);
            }
            try {
                f12.l.f68084a.getClass();
                f12.l lVarA = f12.l.a.a();
                long jW2 = lVarA.w2();
                DateTime dateTime = jW2 > 0 ? new DateTime(jW2) : null;
                boolean zK = dateTime != null ? g22.k.k(dateTime) : false;
                i2.f36769a.getClass();
                i2.a.b(a2.GENERAL, "StartupViewModel", "lastLoggedSessionDateTime = " + dateTime + ", hasLoggedSessionToday = " + zK);
                Set<String> setB4 = lVarA.b4();
                ArrayList arrayList = new ArrayList();
                for (String str : setB4) {
                    try {
                        int i15 = q.f128596b;
                        bVar2 = new Long(Long.parseLong(str));
                    } catch (Throwable th3) {
                        int i16 = q.f128596b;
                        bVar2 = new q.b(th3);
                    }
                    if (bVar2 instanceof q.b) {
                        bVar2 = null;
                    }
                    Long l14 = (Long) bVar2;
                    if (l14 != null) {
                        arrayList.add(l14);
                    }
                }
                Long l15 = (Long) h0.o0(arrayList);
                boolean z14 = (l15 != null ? DateTime.now().getMillis() - l15.longValue() : 7200000L) >= 7200000;
                if (!zK) {
                    ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new zk.e("SESSION", new Long(((Number) it.next()).longValue())));
                    }
                    zk.a aVar2 = new zk.a("SESSION", arrayList2, false, DateTime.now().getMillis(), 4, null);
                    zk.c cVar = zk.c.f205034a;
                    List listC = w.c("GCS");
                    cVar.getClass();
                    new zk.d(cVar, null, listC).a(aVar2);
                    lVarA.z3(DateTime.now().getMillis());
                    lVarA.t4();
                    i2.a aVar3 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar3.getClass();
                    i2.a.b(a2Var, "StartupViewModel", "resetUserSessions");
                    if (!GCMSettingManager.f41536b.getBoolean("CLIENT_ANALYTICS_FIRST_EVENT", false)) {
                        ht.a.f85464a.getClass();
                        ht.a.a(null, "ClientAnalyticsFirstEvent");
                        GCMSettingManager.f41536b.edit().putBoolean("CLIENT_ANALYTICS_FIRST_EVENT", true).commit();
                    }
                    ht.a.f85464a.getClass();
                    ht.a.a(null, "ClientAnalyticsSessionLog");
                } else if (z14) {
                    lVarA.L3(String.valueOf(DateTime.now().getMillis()));
                }
                Unit unit = Unit.INSTANCE;
                bVar.e(null);
                return Unit.INSTANCE;
            } catch (Throwable th4) {
                bVar.e(null);
                throw th4;
            }
        }
    }

    static {
        new a(null);
    }

    public k() {
        i.f44871a.getClass();
        this.f44879a = new i();
        this.f44882d = z53.c.a();
    }

    public final void x4() {
        com.garmin.android.apps.connectmobile.l.g().getClass();
        if (gh2.i.f77458c.a().f77477b.c("enable_GCM4_session_analytics")) {
            w9.a aVarA = v1.a(this);
            x53.c cVar = s0.f129406a;
            ge1.b.T(aVarA, x53.b.f189152a, null, new d(null), 2);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/startup/k$a;", "", "<init>", "()V", "", "EVENT_NAME", "Ljava/lang/String;", "TAG", "", "MIN_TIME_ELAPSED", "I", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/startup/k$c;", "", "Lcom/garmin/android/apps/connectmobile/startup/k$b;", "status", "Lq92/v;", "consentStatus", "<init>", "(Lcom/garmin/android/apps/connectmobile/startup/k$b;Lq92/v;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f44889a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v f44890b;

        public c(b bVar, v vVar) {
            bVar.getClass();
            this.f44889a = bVar;
            this.f44890b = vVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f44889a == cVar.f44889a && s.g(this.f44890b, cVar.f44890b);
        }

        public final int hashCode() {
            int iHashCode = this.f44889a.hashCode() * 31;
            v vVar = this.f44890b;
            return iHashCode + (vVar == null ? 0 : vVar.hashCode());
        }

        public final String toString() {
            return "StartupUIResource(status=" + this.f44889a + ", consentStatus=" + this.f44890b + ")";
        }

        public /* synthetic */ c(b bVar, v vVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this(bVar, (i14 & 2) != 0 ? null : vVar);
        }
    }
}
