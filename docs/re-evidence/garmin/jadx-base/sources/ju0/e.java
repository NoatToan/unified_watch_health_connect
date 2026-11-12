package ju0;

import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.liveeventsharing.database.LiveEventDatabase;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.library.backgroundtaskmanagement.BizOperationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import jk0.w;
import m20.z;
import o13.r;
import o13.t;
import o53.s;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lju0/e;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lju0/a;", "liveEventSharingApi", "<init>", "(Lju0/a;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements f0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f100881g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ju0.a f100882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f100883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f100884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f100885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f100886e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f100887f;

    public e(ju0.a aVar) {
        aVar.getClass();
        this.f100882a = aVar;
        this.f100883b = o13.m.b(new w(20));
        final int i14 = 0;
        this.f100884c = o13.m.b(new e23.a(this) { // from class: ju0.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f100880b;

            {
                this.f100880b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i15 = i14;
                e eVar = this.f100880b;
                switch (i15) {
                    case 0:
                        e.a aVar2 = e.f100881g;
                        return ((LiveEventDatabase) eVar.f100883b.getValue()).f();
                    case 1:
                        e.a aVar3 = e.f100881g;
                        return ((LiveEventDatabase) eVar.f100883b.getValue()).e();
                    default:
                        e.a aVar4 = e.f100881g;
                        return ((LiveEventDatabase) eVar.f100883b.getValue()).g();
                }
            }
        });
        final int i15 = 1;
        this.f100885d = o13.m.b(new e23.a(this) { // from class: ju0.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f100880b;

            {
                this.f100880b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i16 = i15;
                e eVar = this.f100880b;
                switch (i16) {
                    case 0:
                        e.a aVar2 = e.f100881g;
                        return ((LiveEventDatabase) eVar.f100883b.getValue()).f();
                    case 1:
                        e.a aVar3 = e.f100881g;
                        return ((LiveEventDatabase) eVar.f100883b.getValue()).e();
                    default:
                        e.a aVar4 = e.f100881g;
                        return ((LiveEventDatabase) eVar.f100883b.getValue()).g();
                }
            }
        });
        final int i16 = 2;
        this.f100886e = o13.m.b(new e23.a(this) { // from class: ju0.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f100880b;

            {
                this.f100880b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i17 = i16;
                e eVar = this.f100880b;
                switch (i17) {
                    case 0:
                        e.a aVar2 = e.f100881g;
                        return ((LiveEventDatabase) eVar.f100883b.getValue()).f();
                    case 1:
                        e.a aVar3 = e.f100881g;
                        return ((LiveEventDatabase) eVar.f100883b.getValue()).e();
                    default:
                        e.a aVar4 = e.f100881g;
                        return ((LiveEventDatabase) eVar.f100883b.getValue()).g();
                }
            }
        });
        this.f100887f = o13.m.b(new w(21));
    }

    public static boolean f(q qVar) {
        return qVar.getLiveEventSharingEnabled() == null && qVar.getLiveTrackEnabled() == null && qVar.getLiveEventSharingEndTimestamp() == null && qVar.e() == null && qVar.getLiveEventSharingTargetDistance() == null && qVar.f() == null;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
    
        if (d(r9, r0) == r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j8, v13.c cVar, boolean z14) {
        i iVar;
        v2 v2Var;
        boolean z15;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i14 = iVar.f100904e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f100904e = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object objJ = iVar.f100902c;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar.f100904e;
        t tVar = this.f100884c;
        if (i15 == 0) {
            r.b(objJ);
            if (z14) {
                j jVar = new j(this, j8, null);
                iVar.f100900a = j8;
                iVar.f100901b = z14;
                iVar.f100904e = 1;
                objJ = f0.J(this, jVar, iVar);
                if (objJ != obj) {
                    v2Var = (v2) objJ;
                    z15 = v2Var instanceof v2.b;
                    if (!z15) {
                        if (z15) {
                            ((fu0.c) tVar.getValue()).c(jg.b.Q((q) ((v2.b) v2Var).f47386a, j8));
                        }
                    } else if (z15) {
                        ((fu0.c) tVar.getValue()).c(jg.b.Q((q) ((v2.b) v2Var).f47386a, j8));
                    }
                }
                return obj;
            }
            return ((fu0.c) tVar.getValue()).b(j8);
        }
        if (i15 == 1) {
            z14 = iVar.f100901b;
            j8 = iVar.f100900a;
            r.b(objJ);
            v2Var = (v2) objJ;
            z15 = v2Var instanceof v2.b;
            if (!z15 && f((q) ((v2.b) v2Var).f47386a)) {
                String strValueOf = String.valueOf(j8);
                iVar.f100900a = j8;
                iVar.f100901b = z14;
                iVar.f100904e = 2;
            } else if (z15) {
                ((fu0.c) tVar.getValue()).c(jg.b.Q((q) ((v2.b) v2Var).f47386a, j8));
            }
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j8 = iVar.f100900a;
            r.b(objJ);
        }
        return ((fu0.c) tVar.getValue()).b(j8);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(boolean z14, v13.c cVar) {
        k kVar;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i14 = kVar.f100910c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f100910c = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        Object objJ = kVar.f100908a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = kVar.f100910c;
        t tVar = this.f100885d;
        if (i15 == 0) {
            r.b(objJ);
            if (z14) {
                z zVar = (z) this.f100887f.getValue();
                kVar.f100910c = 1;
                zVar.getClass();
                objJ = f0.J(zVar, new m20.p(zVar, null), kVar);
                if (objJ == aVar) {
                    return aVar;
                }
            }
            return ((fu0.a) tVar.getValue()).getAll();
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(objJ);
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            ((fu0.a) tVar.getValue()).deleteAll();
            l20.r rVar = (l20.r) ((v2.b) v2Var).f47386a;
            rVar.getClass();
            ArrayList arrayList = new ArrayList();
            List<l20.a> listF = rVar.f();
            if (listF != null) {
                for (l20.a aVar2 : listF) {
                    String firstName = aVar2.getFirstName();
                    String lastName = aVar2.getLastName();
                    List<l20.c> listZ = aVar2.z();
                    arrayList.add(new gu0.a(0, firstName, lastName, listZ != null ? new ArrayList(listZ) : null, 1, null));
                }
            }
            ((fu0.a) tVar.getValue()).a(arrayList);
        }
        return ((fu0.a) tVar.getValue()).getAll();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object c(String str, v13.c cVar) {
        l lVar;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i14 = lVar.f100914d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f100914d = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        Object objJ = lVar.f100912b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = lVar.f100914d;
        if (i15 == 0) {
            r.b(objJ);
            m mVar = new m(this, str, null);
            lVar.f100911a = str;
            lVar.f100914d = 1;
            objJ = f0.J(this, mVar, lVar);
            if (objJ != obj) {
            }
        }
        if (i15 != 1) {
            if (i15 == 2) {
                r.b(objJ);
                return objJ;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = lVar.f100911a;
        r.b(objJ);
        v2 v2Var = (v2) objJ;
        boolean z14 = v2Var instanceof v2.b;
        if (!z14 || !f((q) ((v2.b) v2Var).f47386a)) {
            if (z14) {
                ((fu0.c) this.f100884c.getValue()).c(jg.b.Q((q) ((v2.b) v2Var).f47386a, Long.parseLong(str)));
            }
            return v2Var;
        }
        lVar.f100911a = null;
        lVar.f100914d = 2;
        Object objD = d(str, lVar);
        return objD == obj ? obj : objD;
    }

    public final Object d(String str, v13.c cVar) {
        GarminConnectMobileApp.f28685g.getClass();
        hu0.a aVarA = new hu0.b(GarminConnectMobileApp.a.a()).a();
        cu0.g.f55579a.getClass();
        q qVar = new q(null, null, null, null, null, null, null, null, 255, null);
        f12.l.f68084a.getClass();
        qVar.m(Boolean.valueOf(f12.l.a.a().o2()));
        qVar.r(Boolean.valueOf(aVarA.getIsLiveTrackON()));
        Long startTime = aVarA.getStartTime();
        if (startTime != null) {
            DateTime dateTimePlusHours = new DateTime(startTime.longValue()).plusHours(24);
            if (dateTimePlusHours.isAfterNow()) {
                qVar.n(Long.valueOf(dateTimePlusHours.getMillis()));
            } else {
                qVar.m(Boolean.FALSE);
            }
        }
        ArrayList arrayList = new ArrayList();
        if (aVarA.getIsMsgContentCumulativeTimeOn()) {
            arrayList.add(b.CUMULATIVE_TIME);
        }
        if (aVarA.getIsMsgContentPaceSpeedOn()) {
            arrayList.add(b.PACE_SPEED);
        }
        if (aVarA.getIsMsgContentLastLapTimeOn()) {
            arrayList.add(b.LAST_LAP_TIME);
        }
        if (aVarA.getIsEstimatedCompletionTimeOn()) {
            arrayList.add(b.EST_COMPLETION_TIME);
        }
        Double estimatedCompletionDistance = aVarA.getEstimatedCompletionDistance();
        if (estimatedCompletionDistance != null && !Double.isNaN(estimatedCompletionDistance.doubleValue())) {
            qVar.q(Integer.valueOf((int) (estimatedCompletionDistance.doubleValue() * 100.0d)));
        }
        if (!arrayList.isEmpty()) {
            qVar.o(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        if (aVarA.getIsMsgTriggerStartSelected()) {
            arrayList2.add(c.START);
        }
        if (aVarA.getIsMsgTriggerEveryLapSelected()) {
            arrayList2.add(c.EVERY_LAP);
        } else if (aVarA.getIsMsgTriggerEveryMileSelected()) {
            arrayList2.add(c.DISTANCE);
        }
        if (aVarA.getIsMsgTriggerEveryTransitionSelected()) {
            arrayList2.add(c.EVERY_TRANSITION);
        }
        if (aVarA.getIsMsgTriggerEndSelected()) {
            arrayList2.add(c.END);
        }
        if (!arrayList2.isEmpty()) {
            qVar.p(arrayList2);
        }
        i2.f36769a.getClass();
        i2.a.k(a2.LIVE_EVENT_SHARING, "LiveEventSharingRepo", "Performing migrations of settings, Old Model: " + aVarA + " dto: " + qVar);
        return g(str, qVar, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object g(String str, q qVar, v13.c cVar) {
        n nVar;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i14 = nVar.f100921d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                nVar.f100921d = i14 - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, cVar);
            }
        } else {
            nVar = new n(this, cVar);
        }
        Object objJ = nVar.f100919b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = nVar.f100921d;
        if (i15 == 0) {
            r.b(objJ);
            o oVar = new o(this, str, qVar, null);
            nVar.f100918a = str;
            nVar.f100921d = 1;
            objJ = f0.J(this, oVar, nVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = nVar.f100918a;
            r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            ((fu0.c) this.f100884c.getValue()).c(jg.b.Q((q) ((v2.b) v2Var).f47386a, Long.parseLong(str)));
        }
        return v2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(boolean z14, v13.c cVar) {
        p pVar;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i14 = pVar.f100928c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                pVar.f100928c = i14 - Integer.MIN_VALUE;
            } else {
                pVar = new p(this, cVar);
            }
        } else {
            pVar = new p(this, cVar);
        }
        Object objC = pVar.f100926a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = pVar.f100928c;
        try {
            if (i15 == 0) {
                r.b(objC);
                o53.r<String> rVarK = new b20.a(z14, null).k();
                pVar.f100928c = 1;
                objC = ((s) rVarK).C(pVar);
                if (objC == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objC);
            }
            String str = (String) objC;
            return str != null ? new v2.b(str, 200, null, null, 12, null) : new v2.a(new BizOperationException(com.garmin.android.library.backgroundtaskmanagement.b.c.NO_DATA), null, null, 6, null);
        } catch (BizOperationException e4) {
            return new v2.a(e4, null, null, 6, null);
        } catch (Throwable th3) {
            return new v2.a(new IOException(th3), null, null, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lju0/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static e a() {
            return new e((ju0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ju0.a.class, new c83.h.a[0], null, null, null, 120));
        }

        private a() {
        }
    }
}
