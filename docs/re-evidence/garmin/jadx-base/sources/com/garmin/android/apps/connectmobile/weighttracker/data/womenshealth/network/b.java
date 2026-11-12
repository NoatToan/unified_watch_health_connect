package com.garmin.android.apps.connectmobile.weighttracker.data.womenshealth.network;

import c83.a0;
import i83.f;
import i83.s;
import i83.t;
import o13.r;
import o53.i0;
import o53.s0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import r1.q2;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/weighttracker/data/womenshealth/network/b;", "", "<init>", "()V", "a", "b", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0937b f47986a = new C0937b(null);

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bb\u0018\u00002\u00020\u0001J1\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/weighttracker/data/womenshealth/network/b$a;", "", "", "date", "todayDate", "Lo53/i0;", "Lc83/a0;", "Lj52/c;", "a", "(Ljava/lang/String;Ljava/lang/String;)Lo53/i0;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface a {
        @f("periodichealth-service/menstrualcycle/dayview/{date}")
        i0<a0<j52.c>> a(@s("date") String date, @t("todayDate") String todayDate);
    }

    private b() {
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.weighttracker.data.womenshealth.network.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/weighttracker/data/womenshealth/network/b$b;", "", "<init>", "()V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0937b {
        public /* synthetic */ C0937b(j jVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0099, code lost:
        
            if (r0 == r3) goto L25;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object a(LocalDate localDate, v13.c cVar) throws Exception {
            c cVar2;
            if (cVar instanceof c) {
                cVar2 = (c) cVar;
                int i14 = cVar2.f47989c;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    cVar2.f47989c = i14 - Integer.MIN_VALUE;
                } else {
                    cVar2 = new c(this, cVar);
                }
            } else {
                cVar2 = new c(this, cVar);
            }
            Object objAwait = cVar2.f47987a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = cVar2.f47989c;
            if (i15 != 0) {
                if (i15 == 1) {
                    r.b(objAwait);
                } else {
                    if (i15 != 2) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
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
            a aVar2 = (a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, a.class, new c83.h.a[]{new sd1.a()}, null, null, null, 120);
            string.getClass();
            string2.getClass();
            i0<a0<j52.c>> i0VarA = aVar2.a(string, string2);
            cVar2.f47989c = 1;
            objAwait = i0VarA.await(cVar2);
            if (objAwait != aVar) {
            }
            return aVar;
            a0 a0Var = (a0) objAwait;
            if (a0Var.f25745a.isSuccessful()) {
                return a0Var.f25746b;
            }
            x53.c cVar3 = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            d dVar = new d(a0Var, null);
            cVar2.f47989c = 2;
            objAwait = ge1.b.e0(bVar, dVar, cVar2);
        }

        private C0937b() {
        }
    }
}
