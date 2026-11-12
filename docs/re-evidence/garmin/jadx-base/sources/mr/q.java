package mr;

import am.i2;
import am.w0;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lmr/q;", "", "Lir/e;", "repository", "<init>", "(Lir/e;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ir.e f120287a;

    static {
        new a(null);
    }

    public q(ir.e eVar) {
        eVar.getClass();
        this.f120287a = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(q qVar, String str, String str2, v13.c cVar) {
        r rVar;
        qVar.getClass();
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i14 = rVar.f120290c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                rVar.f120290c = i14 - Integer.MIN_VALUE;
            } else {
                rVar = new r(qVar, cVar);
            }
        } else {
            rVar = new r(qVar, cVar);
        }
        Object objJ = rVar.f120288a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = rVar.f120290c;
        if (i15 == 0) {
            o13.r.b(objJ);
            ir.e eVar = qVar.f120287a;
            List listK = p13.x.k("distance", "duration");
            rVar.f120290c = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(eVar, new ir.c(eVar, str, str2, listK, null), rVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            return (w0) p13.h0.d0((List) ((v2.b) v2Var).f47386a);
        }
        if (v2Var instanceof v2.a) {
            return null;
        }
        lc.u0.r();
        return null;
    }

    public static final Double b(q qVar, w0 w0Var, String str) {
        i2 i2Var;
        qVar.getClass();
        Map<String, i2> map = w0Var.f().get(TtmlNode.COMBINE_ALL);
        if (map == null || (i2Var = map.get(str)) == null) {
            return null;
        }
        return Double.valueOf(i2Var.getSum());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(long j8, String str, v13.c cVar) {
        s sVar;
        long j14;
        String str2;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i14 = sVar.f120302e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                sVar.f120302e = i14 - Integer.MIN_VALUE;
            } else {
                sVar = new s(this, cVar);
            }
        } else {
            sVar = new s(this, cVar);
        }
        Object objJ = sVar.f120300c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = sVar.f120302e;
        if (i15 == 0) {
            o13.r.b(objJ);
            sVar.f120299b = str;
            sVar.f120298a = j8;
            sVar.f120302e = 1;
            ir.e eVar = this.f120287a;
            objJ = com.garmin.android.apps.connectmobile.f0.J(eVar, new ir.d(eVar, j8, str, null), sVar);
            if (objJ != aVar) {
                j14 = j8;
                str2 = str;
            }
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(objJ);
                return objJ;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j14 = sVar.f120298a;
        str2 = sVar.f120299b;
        o13.r.b(objJ);
        v2 v2Var = (v2) objJ;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return p13.j0.f134944a;
            }
            lc.u0.r();
            return null;
        }
        t tVar = new t((List) ((v2.b) v2Var).f47386a, this, str2, null);
        sVar.f120299b = null;
        sVar.f120298a = j14;
        sVar.f120302e = 2;
        Object objE = o53.c0.e(tVar, sVar);
        return objE == aVar ? aVar : objE;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lmr/q$a;", "", "<init>", "()V", "", "METRIC_DISTANCE", "Ljava/lang/String;", "METRIC_DURATION", "STATS_GROUP_ALL", "", "CM_TO_M", "D", "MILLIS_TO_SEC", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
