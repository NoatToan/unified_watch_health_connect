package m42;

import b63.o;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import g22.l;
import o13.r;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lm42/b;", "Lcom/garmin/android/apps/connectmobile/f0;", "<init>", "()V", "a", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f116608a = new a(null);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(o oVar, v13.c cVar) {
        c cVar2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f116613e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f116613e = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objJ = cVar2.f116611c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f116613e;
        if (i15 == 0) {
            r.b(objJ);
            d dVar = new d(oVar, null);
            cVar2.f116609a = oVar;
            cVar2.f116613e = 1;
            objJ = f0.J(this, dVar, cVar2);
            if (objJ != aVar) {
            }
            return aVar;
        }
        if (i15 != 1) {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v2.b bVar = cVar2.f116610b;
            r.b(objJ);
            return bVar;
        }
        oVar = cVar2.f116609a;
        r.b(objJ);
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            DateTime dateTimeAtStartOfDay = l.h(oVar).toDateTimeAtStartOfDay();
            com.garmin.android.apps.connectmobile.googlehealthconnect.a aVar2 = (com.garmin.android.apps.connectmobile.googlehealthconnect.a) KoinJavaComponent.get$default(com.garmin.android.apps.connectmobile.googlehealthconnect.a.class, null, null, 6, null);
            dateTimeAtStartOfDay.getClass();
            cVar2.f116609a = null;
            cVar2.f116610b = (v2.b) v2Var;
            cVar2.f116613e = 2;
            if (aVar2.e(dateTimeAtStartOfDay, cVar2) == aVar) {
                return aVar;
            }
        }
        return v2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(o oVar, long j8, long j14, v13.c cVar) {
        e eVar;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i14 = eVar.f116621f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f116621f = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object objJ = eVar.f116619d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f116621f;
        if (i15 == 0) {
            r.b(objJ);
            f fVar = new f(oVar, j14, null);
            eVar.f116617b = j8;
            eVar.f116618c = j14;
            eVar.f116621f = 1;
            objJ = f0.J(this, fVar, eVar);
            if (objJ != aVar) {
            }
            return aVar;
        }
        if (i15 != 1) {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v2.b bVar = eVar.f116616a;
            r.b(objJ);
            return bVar;
        }
        j14 = eVar.f116618c;
        j8 = eVar.f116617b;
        r.b(objJ);
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            com.garmin.android.apps.connectmobile.googlehealthconnect.a aVar2 = (com.garmin.android.apps.connectmobile.googlehealthconnect.a) KoinJavaComponent.get$default(com.garmin.android.apps.connectmobile.googlehealthconnect.a.class, null, null, 6, null);
            eVar.f116616a = (v2.b) v2Var;
            eVar.f116617b = j8;
            eVar.f116618c = j14;
            eVar.f116621f = 2;
            if (aVar2.j(j8, eVar) == aVar) {
                return aVar;
            }
        }
        return v2Var;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lm42/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lm42/a;", "apiService", "Lm42/a;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static final m42.a a(a aVar) {
            aVar.getClass();
            a aVar2 = b.f116608a;
            return (m42.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, m42.a.class, new c83.h.a[0], null, null, null, 120);
        }

        public static b b(a aVar) {
            aVar.getClass();
            return new b();
        }

        private a() {
        }
    }
}
