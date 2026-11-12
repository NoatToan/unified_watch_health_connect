package f32;

import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o13.r;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lf32/p;", "", "SummaryData", "Lf32/n;", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class p<SummaryData> implements n<SummaryData> {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object c(p pVar, DateTime dateTime, DateTime dateTime2, v13.c cVar) throws Exception {
        o oVar;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i14 = oVar.f68695c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                oVar.f68695c = i14 - Integer.MIN_VALUE;
            } else {
                oVar = new o(pVar, cVar);
            }
        } else {
            oVar = new o(pVar, cVar);
        }
        Object objB = oVar.f68693a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = oVar.f68695c;
        if (i15 == 0) {
            r.b(objB);
            oVar.f68695c = 1;
            objB = pVar.b(dateTime, dateTime2, oVar);
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objB);
        }
        v2 v2Var = (v2) objB;
        if (v2Var instanceof v2.b) {
            return ((v2.b) v2Var).f47386a;
        }
        if (v2Var instanceof v2.a) {
            throw ((v2.a) v2Var).f47383a;
        }
        u0.r();
        return null;
    }

    @Override // f32.n
    public final Object a(DateTime dateTime, DateTime dateTime2, i iVar) {
        return c(this, dateTime, dateTime2, iVar);
    }

    public abstract Object b(DateTime dateTime, DateTime dateTime2, t13.d<? super v2<? extends SummaryData>> dVar);
}
