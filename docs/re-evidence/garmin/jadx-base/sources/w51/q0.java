package w51;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016BU\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lw51/q0;", "Landroidx/lifecycle/u1;", "", "pendingActivityId", "Lb63/o;", "calendarDate", "Lz51/h;", "summary", "Ly51/a;", "pendingActivitiesRepo", "Lu51/b;", "getDeviceAppInfoUseCase", "Lis1/e;", "timelineRepository", "Lu51/c;", "shouldShowNoLocationDataAvailableUseCase", "Lv51/a;", "preferences", "Lcom/garmin/android/apps/connectmobile/b1;", "featureAvailability", "<init>", "(Ljava/lang/String;Lb63/o;Lz51/h;Ly51/a;Lu51/b;Lis1/e;Lu51/c;Lv51/a;Lcom/garmin/android/apps/connectmobile/b1;)V", "b", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q0 extends u1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f182369n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y51.a f182370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u51.b f182371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final is1.e f182372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u51.c f182373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v51.a f182374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f182375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b2 f182376g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f182377h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b2 f182378i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p2 f182379j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b2 f182380k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f182381l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f182382m;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.pending.activities.presentation.PendingActivityDetailsViewModel$1", f = "PendingActivityDetailsViewModel.kt", l = {104, 105}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f182383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f182384b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b63.o f182385c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ q0 f182386d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ z51.h f182387e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, b63.o oVar, q0 q0Var, z51.h hVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f182384b = str;
            this.f182385c = oVar;
            this.f182386d = q0Var;
            this.f182387e = hVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f182384b, this.f182385c, this.f182386d, this.f182387e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x007b, code lost:
        
            if (p005kotlin.Unit.INSTANCE == r1) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0147, code lost:
        
            if (p005kotlin.Unit.INSTANCE == r1) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0149, code lost:
        
            return r1;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            i53.c cVarB;
            b63.o oVar;
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f182383a;
            if (i14 == 0) {
                o13.r.b(obj);
                q0 q0Var = this.f182386d;
                String str = this.f182384b;
                if (str == null || (oVar = this.f182385c) == null) {
                    z51.h hVar = this.f182387e;
                    if (hVar != null) {
                        this.f182383a = 2;
                        int i15 = q0.f182369n;
                        q0Var.getClass();
                        List<String> list = hVar.f202514j;
                        if (list != null) {
                            arrayList = new ArrayList();
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                am.x0 x0VarM = am.z0.m((String) it.next());
                                if (x0VarM != null) {
                                    arrayList.add(x0VarM);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        String strE = w2.a0.e(hVar);
                        p2 p2Var = q0Var.f182375f;
                        while (true) {
                            Object value2 = p2Var.getValue();
                            p2 p2Var2 = p2Var;
                            p0 p0Var = (p0) value2;
                            if (arrayList == null || (cVarB = i53.a.e(arrayList)) == null) {
                                cVarB = j53.l.b();
                            }
                            if (p2Var2.b(value2, p0.a(p0Var, hVar, null, cVarB, null, hVar.f202510f, hVar.f202511g, hVar.d(), hVar.b(), c1.a(hVar), false, false, false, false, false, false, q0.D4(q0Var, strE), j53.l.b(), false, null, false, false, false, false, 5568000))) {
                                break;
                            }
                            p2Var = p2Var2;
                        }
                        q0Var.f182377h.setValue(null);
                        ge1.b.T(v1.a(q0Var), null, null, new r0(q0Var, null), 3);
                        ge1.b.T(v1.a(q0Var), null, null, new u0(q0Var, hVar, strE, null), 3);
                    }
                } else {
                    this.f182383a = 1;
                    p2 p2Var3 = q0Var.f182375f;
                    do {
                        value = p2Var3.getValue();
                    } while (!p2Var3.b(value, p0.a((p0) value, null, null, null, null, null, null, null, null, 0.0d, true, false, false, false, false, false, false, null, false, null, false, false, false, false, 16776703)));
                    ge1.b.T(v1.a(q0Var), null, null, new t0(q0Var, str, fz0.d.a(oVar), null), 3);
                }
            } else {
                if (i14 != 1 && i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new b(null);
    }

    public q0(String str, b63.o oVar, z51.h hVar, y51.a aVar, u51.b bVar, is1.e eVar, u51.c cVar, v51.a aVar2, com.garmin.android.apps.connectmobile.b1 b1Var) {
        aVar.getClass();
        bVar.getClass();
        eVar.getClass();
        cVar.getClass();
        aVar2.getClass();
        b1Var.getClass();
        this.f182370a = aVar;
        this.f182371b = bVar;
        this.f182372c = eVar;
        this.f182373d = cVar;
        this.f182374e = aVar2;
        p2 p2VarA = q2.a(new p0(null, null, null, null, null, null, null, null, 0.0d, false, false, false, false, false, false, false, false, null, false, null, false, false, false, false, 16776703, null));
        this.f182375f = p2VarA;
        this.f182376g = r53.s.d(p2VarA);
        p2 p2VarA2 = q2.a(null);
        this.f182377h = p2VarA2;
        this.f182378i = r53.s.d(p2VarA2);
        p2 p2VarA3 = q2.a(p13.j0.f134944a);
        this.f182379j = p2VarA3;
        this.f182380k = r53.s.d(p2VarA3);
        this.f182381l = b1Var.G0();
        b1Var.U0();
        this.f182382m = true;
        ge1.b.T(v1.a(this), null, null, new a(str, oVar, this, hVar, null), 3);
    }

    public static gs1.j B4(gs1.j jVar, b63.u uVar, b63.u uVar2) {
        ArrayList arrayList;
        gs1.j.c payload;
        List<gs1.j.b> listD;
        b63.z.INSTANCE.getClass();
        b63.k kVar = b63.z.f16226b;
        e53.j jVarC = b63.b.c(uVar, kVar);
        e53.c.a aVar = e53.c.f63094b;
        long jE = e53.e.e(1, e53.f.MINUTES);
        jVarC.getClass();
        long jC = jVarC.b(e53.c.l(jE)).c();
        long jC2 = b63.b.c(uVar2, kVar).c();
        if (jVar == null || (payload = jVar.getPayload()) == null || (listD = payload.d()) == null) {
            arrayList = null;
        } else {
            ArrayList<gs1.j.b> arrayList2 = new ArrayList();
            for (Object obj : listD) {
                DateTime dateTime = ((gs1.j.b) obj).f78778a;
                if (dateTime != null) {
                    long millis = dateTime.getMillis();
                    if (jC <= millis && millis <= jC2) {
                        arrayList2.add(obj);
                    }
                }
            }
            arrayList = new ArrayList(p13.y.r(arrayList2, 10));
            for (gs1.j.b bVar : arrayList2) {
                bVar.getClass();
                DateTime dateTime2 = bVar.f78778a;
                arrayList.add(p13.u.C(new Double[]{dateTime2 != null ? Double.valueOf(dateTime2.getMillis()) : null, bVar.f78779b}));
            }
        }
        if (jVar == null) {
            return null;
        }
        gs1.j.c payload2 = jVar.getPayload();
        return new gs1.j(payload2 != null ? gs1.j.c.b(payload2, arrayList) : null);
    }

    public static boolean C4(String str, List list) {
        am.x0 x0VarM;
        if (str == null || (x0VarM = am.z0.m(str)) == null) {
            return false;
        }
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (p005kotlin.jvm.internal.s.g(((am.x0) it.next()).f4358a, x0VarM.f4358a)) {
                return true;
            }
        }
        return false;
    }

    public static boolean D4(q0 q0Var, String str) {
        List list = (List) q0Var.f182380k.f150540a.getValue();
        q0Var.getClass();
        return C4(str, list);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:36:0x0108  */
    /* JADX WARN: Code duplicated, block: B:38:0x010c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0115  */
    /* JADX WARN: Code duplicated, block: B:44:0x011a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0120  */
    /* JADX WARN: Code duplicated, block: B:47:0x0125  */
    /* JADX WARN: Code duplicated, block: B:49:0x0128  */
    /* JADX WARN: Code duplicated, block: B:52:0x0130  */
    /* JADX WARN: Code duplicated, block: B:53:0x0135  */
    /* JADX WARN: Code duplicated, block: B:55:0x0138  */
    /* JADX WARN: Code duplicated, block: B:59:0x0153  */
    /* JADX WARN: Code duplicated, block: B:61:0x0160  */
    /* JADX WARN: Code duplicated, block: B:62:0x016a  */
    /* JADX WARN: Code duplicated, block: B:66:0x017f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0184  */
    /* JADX WARN: Code duplicated, block: B:70:0x0190  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object x4(q0 q0Var, b63.u uVar, b63.u uVar2, v13.c cVar) {
        s0 s0Var;
        Object value;
        gs1.t tVar;
        gs1.j jVarB4;
        b63.u uVar3;
        v2 v2Var;
        gs1.j dailyMovementDTO;
        gs1.j dailyMovementDTO2;
        gs1.j.c payload;
        List<gs1.j.b> listD;
        gs1.j.c payload2;
        List<gs1.j.b> listD2;
        ArrayList arrayList;
        gs1.j.c payload3;
        gs1.j.c cVarB;
        DateTime dateTime;
        Double dValueOf;
        b63.u uVar4 = uVar;
        b63.u uVar5 = uVar2;
        is1.e eVar = q0Var.f182372c;
        p2 p2Var = q0Var.f182375f;
        if (cVar instanceof s0) {
            s0Var = (s0) cVar;
            int i14 = s0Var.f182399f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                s0Var.f182399f = i14 - Integer.MIN_VALUE;
            } else {
                s0Var = new s0(q0Var, cVar);
            }
        } else {
            s0Var = new s0(q0Var, cVar);
        }
        Object objA = s0Var.f182397d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = s0Var.f182399f;
        if (i15 == 0) {
            o13.r.b(objA);
            if (uVar4 == null || uVar5 == null) {
                return null;
            }
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, p0.a((p0) p2Var.getValue(), null, null, null, null, null, null, null, null, 0.0d, false, false, false, false, false, false, false, null, true, null, false, false, false, false, 16515071)));
            DateTime dateTimeAtStartOfDay = g22.l.h(uVar4.b()).toDateTimeAtStartOfDay();
            dateTimeAtStartOfDay.getClass();
            s0Var.f182394a = uVar4;
            s0Var.f182395b = uVar5;
            s0Var.f182399f = 1;
            objA = eVar.a(dateTimeAtStartOfDay, s0Var);
            if (objA != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            b63.u uVar6 = s0Var.f182395b;
            b63.u uVar7 = s0Var.f182394a;
            o13.r.b(objA);
            uVar5 = uVar6;
            uVar4 = uVar7;
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tVar = s0Var.f182396c;
            uVar5 = s0Var.f182395b;
            uVar3 = s0Var.f182394a;
            o13.r.b(objA);
        }
        v2Var = (v2) objA;
        if (v2Var instanceof v2.b) {
            dailyMovementDTO = ((gs1.t) ((v2.b) v2Var).f47386a).getDailyMovementDTO();
        } else {
            if (v2Var instanceof v2.a) {
                lc.u0.r();
                return null;
            }
            dailyMovementDTO = null;
        }
        dailyMovementDTO2 = tVar.getDailyMovementDTO();
        if (dailyMovementDTO2 != null) {
            if (dailyMovementDTO != null) {
                payload = dailyMovementDTO2.getPayload();
                if (payload != null) {
                    listD = payload.d();
                } else {
                    listD = null;
                }
                if (listD == null) {
                    listD = p13.j0.f134944a;
                }
                payload2 = dailyMovementDTO.getPayload();
                if (payload2 != null) {
                    listD2 = payload2.d();
                } else {
                    listD2 = null;
                }
                if (listD2 == null) {
                    listD2 = p13.j0.f134944a;
                }
                ArrayList<gs1.j.b> arrayListC0 = p13.h0.C0(listD, listD2);
                arrayList = new ArrayList(p13.y.r(arrayListC0, 10));
                for (gs1.j.b bVar : arrayListC0) {
                    bVar.getClass();
                    dateTime = bVar.f78778a;
                    if (dateTime != null) {
                        dValueOf = Double.valueOf(dateTime.getMillis());
                    } else {
                        dValueOf = null;
                    }
                    arrayList.add(p13.u.C(new Double[]{dValueOf, bVar.f78779b}));
                }
                payload3 = dailyMovementDTO2.getPayload();
                if (payload3 != null) {
                    cVarB = gs1.j.c.b(payload3, arrayList);
                } else {
                    cVarB = null;
                }
                dailyMovementDTO2 = new gs1.j(cVarB);
            }
            dailyMovementDTO = dailyMovementDTO2;
        }
        jVarB4 = B4(dailyMovementDTO, uVar3, uVar5);
        return gs1.t.b(tVar, null, jVarB4, 2015);
        v2 v2Var2 = (v2) objA;
        if (!(v2Var2 instanceof v2.b)) {
            if (!(v2Var2 instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            a2 a2Var = a2.PENDING_ACTIVITIES;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "PendingActivityDetailsViewModel", "getTimelineSnapshot: error retrieving timeline snapshot");
            return null;
        }
        gs1.t tVar2 = (gs1.t) ((v2.b) v2Var2).f47386a;
        if (uVar5.b().compareTo(uVar4.b()) > 0) {
            DateTime dateTimeAtStartOfDay2 = g22.l.h(uVar5.b()).toDateTimeAtStartOfDay();
            dateTimeAtStartOfDay2.getClass();
            s0Var.f182394a = uVar4;
            s0Var.f182395b = uVar5;
            s0Var.f182396c = tVar2;
            s0Var.f182399f = 2;
            Object objA2 = eVar.a(dateTimeAtStartOfDay2, s0Var);
            if (objA2 != aVar) {
                uVar3 = uVar4;
                tVar = tVar2;
                objA = objA2;
                v2Var = (v2) objA;
                if (v2Var instanceof v2.b) {
                    dailyMovementDTO = ((gs1.t) ((v2.b) v2Var).f47386a).getDailyMovementDTO();
                } else {
                    if (v2Var instanceof v2.a) {
                        lc.u0.r();
                        return null;
                    }
                    dailyMovementDTO = null;
                }
                dailyMovementDTO2 = tVar.getDailyMovementDTO();
                if (dailyMovementDTO2 != null) {
                    if (dailyMovementDTO != null) {
                        payload = dailyMovementDTO2.getPayload();
                        if (payload != null) {
                            listD = payload.d();
                        } else {
                            listD = null;
                        }
                        if (listD == null) {
                            listD = p13.j0.f134944a;
                        }
                        payload2 = dailyMovementDTO.getPayload();
                        if (payload2 != null) {
                            listD2 = payload2.d();
                        } else {
                            listD2 = null;
                        }
                        if (listD2 == null) {
                            listD2 = p13.j0.f134944a;
                        }
                        ArrayList<gs1.j.b> arrayListC1 = p13.h0.C0(listD, listD2);
                        arrayList = new ArrayList(p13.y.r(arrayListC1, 10));
                        while (r0.hasNext()) {
                            bVar.getClass();
                            dateTime = bVar.f78778a;
                            if (dateTime != null) {
                                dValueOf = Double.valueOf(dateTime.getMillis());
                            } else {
                                dValueOf = null;
                            }
                            arrayList.add(p13.u.C(new Double[]{dValueOf, bVar.f78779b}));
                        }
                        payload3 = dailyMovementDTO2.getPayload();
                        if (payload3 != null) {
                            cVarB = gs1.j.c.b(payload3, arrayList);
                        } else {
                            cVarB = null;
                        }
                        dailyMovementDTO2 = new gs1.j(cVarB);
                    }
                    dailyMovementDTO = dailyMovementDTO2;
                }
                jVarB4 = B4(dailyMovementDTO, uVar3, uVar5);
            }
            return aVar;
        }
        gs1.j jVarB5 = B4(tVar2.getDailyMovementDTO(), uVar4, uVar5);
        tVar = tVar2;
        jVarB4 = jVarB5;
        return gs1.t.b(tVar, null, jVarB4, 2015);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object y4(q0 q0Var, v13.c cVar) {
        v0 v0Var;
        q0Var.getClass();
        if (cVar instanceof v0) {
            v0Var = (v0) cVar;
            int i14 = v0Var.f182444c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                v0Var.f182444c = i14 - Integer.MIN_VALUE;
            } else {
                v0Var = new v0(q0Var, cVar);
            }
        } else {
            v0Var = new v0(q0Var, cVar);
        }
        Object objD = v0Var.f182442a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = v0Var.f182444c;
        if (i15 == 0) {
            o13.r.b(objD);
            y51.a aVar2 = q0Var.f182370a;
            v0Var.f182444c = 1;
            objD = aVar2.d(v0Var);
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objD);
        }
        v2 v2Var = (v2) objD;
        if (v2Var instanceof v2.b) {
            p2 p2Var = q0Var.f182379j;
            T t7 = ((v2.b) v2Var).f47386a;
            p2Var.setValue(t7);
            return (List) t7;
        }
        if (!(v2Var instanceof v2.a)) {
            lc.u0.r();
            return null;
        }
        a2 a2Var = a2.PENDING_ACTIVITIES;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "PendingActivityDetailsViewModel", "fetchNoGPSDataActivityTypes: error retrieving no GPS data activity types");
        return p13.j0.f134944a;
    }

    public final Double A4(b63.u uVar, b63.u uVar2) {
        z51.h hVar = ((p0) this.f182376g.f150540a.getValue()).f182344a;
        if (hVar == null) {
            return null;
        }
        Double d14 = hVar.f202511g;
        if (!E4(uVar, uVar2)) {
            double dB = c1.b(hVar.f202509e, uVar2, uVar);
            double dA = c1.a(hVar);
            if (dA != 0.0d && dB <= dA) {
                return Double.valueOf((dB / dA) * (d14 != null ? d14.doubleValue() : 0.0d));
            }
        }
        return d14;
    }

    public final boolean E4(b63.u uVar, b63.u uVar2) {
        z51.h hVar = ((p0) this.f182376g.f150540a.getValue()).f182344a;
        if (hVar != null) {
            b63.u uVarD = hVar.d();
            b63.u uVarB = hVar.b();
            boolean z14 = uVar.compareTo(uVarD) >= 0 || (uVar.b().equals(uVarD.b()) && g22.l.b(uVar) == g22.l.b(uVarD));
            boolean z15 = uVar2.compareTo(uVarB) <= 0 || (uVar2.b().equals(uVarB.b()) && g22.l.b(uVar2) == g22.l.b(uVarB));
            if (!z14 || !z15) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    public final void F4(String str) {
        Object value;
        ?? arrayList;
        Object value2;
        List<String> list;
        am.x0 x0VarM = am.z0.m(str);
        boolean zR = p13.h0.R(((p0) this.f182376g.f150540a.getValue()).f182346c, x0VarM);
        p2 p2Var = this.f182375f;
        if (zR) {
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, p0.a((p0) value, null, str, null, null, null, null, null, null, 0.0d, false, false, false, false, false, false, D4(this, str), null, false, null, false, false, false, false, 16711677)));
            return;
        }
        z51.h hVar = ((p0) p2Var.getValue()).f182344a;
        if (hVar == null || (list = hVar.f202514j) == null) {
            arrayList = p13.j0.f134944a;
        } else {
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                am.x0 x0VarM2 = am.z0.m((String) it.next());
                if (x0VarM2 != null) {
                    arrayList.add(x0VarM2);
                }
            }
        }
        ArrayList arrayListC0 = p13.h0.C0(p13.x.l(x0VarM), (Iterable) arrayList);
        do {
            value2 = p2Var.getValue();
        } while (!p2Var.b(value2, p0.a((p0) value2, null, str, i53.a.e(arrayListC0), null, null, null, null, null, 0.0d, false, false, false, false, false, false, D4(this, str), null, false, null, false, false, false, false, 16711673)));
    }

    public final void G4() {
        p2 p2Var;
        Object value;
        this.f182374e.a();
        do {
            p2Var = this.f182375f;
            value = p2Var.getValue();
        } while (!p2Var.b(value, p0.a((p0) value, null, null, null, null, null, null, null, null, 0.0d, false, false, false, false, false, false, false, null, false, null, false, false, false, false, 8388607)));
    }

    public final Double z4(b63.u uVar, b63.u uVar2) {
        b2 b2Var = this.f182376g;
        z51.h hVar = ((p0) b2Var.f150540a.getValue()).f182344a;
        if (hVar == null) {
            return null;
        }
        i53.c<z51.c> cVar = ((p0) b2Var.f150540a.getValue()).f182361r;
        ArrayList arrayList = new ArrayList();
        for (z51.c cVar2 : cVar) {
            b63.u uVar3 = cVar2.f202484a;
            b63.u uVarJ = uVar3 != null ? g22.l.j(uVar3) : g22.l.e(b63.u.INSTANCE);
            if (uVarJ.compareTo(uVar) >= 0 && uVarJ.compareTo(uVar2) <= 0) {
                arrayList.add(cVar2);
            }
        }
        if (arrayList.isEmpty()) {
            return hVar.f202510f;
        }
        Iterator it = arrayList.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            Double d14 = ((z51.c) it.next()).f202485b;
            dDoubleValue += d14 != null ? d14.doubleValue() : 0.0d;
        }
        return Double.valueOf(dDoubleValue / ((double) arrayList.size()));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lw51/q0$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
