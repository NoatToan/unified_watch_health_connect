package com.garmin.android.apps.connectmobile.menstrualcycle.data.api;

import c83.a0;
import c83.h;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.nimbusds.jose.jwk.JWKParameterNames;
import hx0.w;
import i83.o;
import i83.s;
import i83.t;
import o13.r;
import o53.i0;
import o53.s0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import r1.q2;
import ww0.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/data/api/a;", "", "<init>", "()V", "a", "b", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f38759a = new b(null);

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.menstrualcycle.data.api.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bb\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\t\u0010\nJ!\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u0004H'¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u000eH'¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u0002H'¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00062\b\b\u0001\u0010\u0016\u001a\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u0002H'¢\u0006\u0004\b\u0019\u0010\u0015J/\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u001b\u001a\u00020\u001aH'¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u0006H'¢\u0006\u0004\b\u001f\u0010 J?\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00062\b\b\u0001\u0010!\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010#\u001a\u00020\"2\b\b\u0001\u0010$\u001a\u00020\u0002H'¢\u0006\u0004\b&\u0010'J\u001d\u0010(\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070\u0006H'¢\u0006\u0004\b(\u0010 ¨\u0006)À\u0006\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/data/api/a$a;", "", "", "date", "Lxw0/b;", "cycle", "Lo53/i0;", "Lc83/a0;", "", JWKParameterNames.RSA_EXPONENT, "(Ljava/lang/String;Lxw0/b;)Lo53/i0;", "initialCycle", "f", "(Lxw0/b;)Lo53/i0;", "Lxw0/c;", "cycleUpdates", "b", "(Lxw0/c;)Lo53/i0;", "todayDate", "Lww0/c;", "a", "(Ljava/lang/String;Ljava/lang/String;)Lo53/i0;", "fromdate", "todate", "Lxw0/a;", "d", "Lww0/b;", "request", "h", "(Ljava/lang/String;Lww0/b;)Lo53/i0;", "Lxw0/d;", "c", "()Lo53/i0;", "cycleCount", "", "next", "reportType", "Lww0/k;", "g", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lo53/i0;", IntegerTokenConverter.CONVERTER_KEY, "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface InterfaceC0687a {
        @i83.f("periodichealth-service/menstrualcycle/dayview/{date}")
        i0<a0<ww0.c>> a(@s("date") String date, @t("todayDate") String todayDate);

        @o("periodichealth-service/menstrualcycle/calendarupdates")
        i0<a0<Unit>> b(@i83.a xw0.c cycleUpdates);

        @i83.f("periodichealth-service/menstrualcycle/reminderdates")
        i0<xw0.d> c();

        @i83.f("periodichealth-service/menstrualcycle/calendar/{startDate}/{endDate}")
        i0<xw0.a> d(@s("startDate") String fromdate, @s("endDate") String todate);

        @o("periodichealth-service/menstrualcycle/{date}")
        i0<a0<Unit>> e(@s("date") String date, @i83.a xw0.b cycle);

        @o("periodichealth-service/menstrualcycle/initCycleSetup")
        i0<Unit> f(@i83.a xw0.b initialCycle);

        @i83.f("periodichealth-service/reports/menstrualcycle/{cycle_count}/{date}")
        i0<k> g(@s("cycle_count") String cycleCount, @s("date") String date, @t("next") boolean next, @t("reportType") String reportType);

        @o("periodichealth-service/menstrualcycle/dailylog/{date}")
        i0<a0<Unit>> h(@s("date") String date, @i83.a ww0.b request);

        @i83.f("/periodichealth-service/menstrualcycle/hascycle")
        i0<a0<Unit>> i();
    }

    private a() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/data/api/a$b;", "", "<init>", "()V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        public static Object a(LocalDate localDate, LocalDate localDate2, com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.c.a aVar) {
            String string = localDate.toString("yyyy-MM-dd");
            String string2 = localDate2.toString("yyyy-MM-dd");
            InterfaceC0687a interfaceC0687aF = f();
            string.getClass();
            string2.getClass();
            return interfaceC0687aF.d(string, string2).await(aVar);
        }

        public static Object c(w.a aVar) {
            return f().i().await(aVar);
        }

        public static Object d(yx0.a.b bVar) {
            return f().c().await(bVar);
        }

        public static Object e(int i14, LocalDate localDate, boolean z14, k.b bVar, jx0.j.a aVar) {
            String string = localDate.toString("yyyy-MM-dd");
            InterfaceC0687a interfaceC0687aF = f();
            String strValueOf = String.valueOf(i14);
            string.getClass();
            return interfaceC0687aF.g(strValueOf, string, z14, bVar.name()).await(aVar);
        }

        public static InterfaceC0687a f() {
            return (InterfaceC0687a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, InterfaceC0687a.class, new h.a[]{new sd1.a()}, null, null, null, 120);
        }

        public static i0 h(xw0.c cVar) {
            return f().b(cVar);
        }

        public static i0 j(xw0.b bVar) {
            return f().f(bVar);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
        
            if (r8 == r1) goto L25;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object b(LocalDate localDate, v13.c cVar) throws Exception {
            com.garmin.android.apps.connectmobile.menstrualcycle.data.api.b bVar;
            if (cVar instanceof com.garmin.android.apps.connectmobile.menstrualcycle.data.api.b) {
                bVar = (com.garmin.android.apps.connectmobile.menstrualcycle.data.api.b) cVar;
                int i14 = bVar.f38762c;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    bVar.f38762c = i14 - Integer.MIN_VALUE;
                } else {
                    bVar = new com.garmin.android.apps.connectmobile.menstrualcycle.data.api.b(this, cVar);
                }
            } else {
                bVar = new com.garmin.android.apps.connectmobile.menstrualcycle.data.api.b(this, cVar);
            }
            Object objAwait = bVar.f38760a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = bVar.f38762c;
            if (i15 != 0) {
                if (i15 == 1) {
                    r.b(objAwait);
                } else {
                    if (i15 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(objAwait);
                }
                q2.u((String) objAwait);
                return null;
            }
            r.b(objAwait);
            String string = localDate.toString("yyyy-MM-dd");
            String string2 = new LocalDate().toString("yyyy-MM-dd");
            InterfaceC0687a interfaceC0687aF = f();
            string.getClass();
            string2.getClass();
            i0<a0<ww0.c>> i0VarA = interfaceC0687aF.a(string, string2);
            bVar.f38762c = 1;
            objAwait = i0VarA.await(bVar);
            if (objAwait != aVar) {
            }
            return aVar;
            a0 a0Var = (a0) objAwait;
            if (a0Var.f25745a.isSuccessful()) {
                return a0Var.f25746b;
            }
            x53.c cVar2 = s0.f129406a;
            x53.b bVar2 = x53.b.f189152a;
            c cVar3 = new c(a0Var, null);
            bVar.f38762c = 2;
            objAwait = ge1.b.e0(bVar2, cVar3, bVar);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object g(LocalDate localDate, xw0.b bVar, v13.c cVar) {
            d dVar;
            if (cVar instanceof d) {
                dVar = (d) cVar;
                int i14 = dVar.f38766c;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    dVar.f38766c = i14 - Integer.MIN_VALUE;
                } else {
                    dVar = new d(this, cVar);
                }
            } else {
                dVar = new d(this, cVar);
            }
            Object objAwait = dVar.f38764a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = dVar.f38766c;
            if (i15 == 0) {
                r.b(objAwait);
                String string = localDate.toString("yyyy-MM-dd");
                InterfaceC0687a interfaceC0687aF = f();
                string.getClass();
                i0<a0<Unit>> i0VarE = interfaceC0687aF.e(string, bVar);
                dVar.f38766c = 1;
                objAwait = i0VarE.await(dVar);
                if (objAwait == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objAwait);
            }
            return Boolean.valueOf(((a0) objAwait).f25745a.isSuccessful());
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object i(LocalDate localDate, ww0.b bVar, v13.c cVar) {
            e eVar;
            if (cVar instanceof e) {
                eVar = (e) cVar;
                int i14 = eVar.f38769c;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    eVar.f38769c = i14 - Integer.MIN_VALUE;
                } else {
                    eVar = new e(this, cVar);
                }
            } else {
                eVar = new e(this, cVar);
            }
            Object objAwait = eVar.f38767a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = eVar.f38769c;
            if (i15 == 0) {
                r.b(objAwait);
                String string = localDate.toString("yyyy-MM-dd");
                InterfaceC0687a interfaceC0687aF = f();
                string.getClass();
                i0<a0<Unit>> i0VarH = interfaceC0687aF.h(string, bVar);
                eVar.f38769c = 1;
                objAwait = i0VarH.await(eVar);
                if (objAwait == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objAwait);
            }
            return Boolean.valueOf(((a0) objAwait).f25745a.isSuccessful());
        }

        private b() {
        }
    }
}
