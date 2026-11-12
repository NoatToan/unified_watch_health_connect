package f32;

import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o13.r;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lf32/g;", "", "DetailsData", "Lf32/e;", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class g<DetailsData> implements e<DetailsData> {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object b(g gVar, DateTime dateTime, v13.c cVar) throws Exception {
        f fVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f68666c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f68666c = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(gVar, cVar);
            }
        } else {
            fVar = new f(gVar, cVar);
        }
        Object objC = fVar.f68664a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f68666c;
        if (i15 == 0) {
            r.b(objC);
            fVar.f68666c = 1;
            objC = gVar.c(dateTime, fVar);
            if (objC == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objC);
        }
        v2 v2Var = (v2) objC;
        if (v2Var instanceof v2.b) {
            return ((v2.b) v2Var).f47386a;
        }
        if (v2Var instanceof v2.a) {
            throw ((v2.a) v2Var).f47383a;
        }
        u0.r();
        return null;
    }

    @Override // f32.e
    public final Object a(DateTime dateTime, t13.d<? super DetailsData> dVar) {
        return b(this, dateTime, (v13.c) dVar);
    }

    public abstract Object c(DateTime dateTime, t13.d<? super v2<? extends DetailsData>> dVar);
}
