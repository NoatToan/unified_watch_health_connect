package sz1;

import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import p13.h0;
import p13.y;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class k {
    public static final void a(DateTime dateTime, DateTime dateTime2, List<oz1.b> list, p3.m mVar, int i14) {
        Float fValueOf;
        Float fValueOf2;
        o0 o0VarE = mVar.E(-382472947);
        int i15 = (i14 & 6) == 0 ? (o0VarE.r(dateTime) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(dateTime2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(list) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            ArrayList arrayListC = c02.a.c(dateTime, dateTime2);
            List listN0 = h0.N0(list, new j());
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listN0) {
                if (hashSet.add(((oz1.b) obj).s())) {
                    arrayList.add(obj);
                }
            }
            List listN1 = h0.N0(arrayList, new i());
            ArrayList arrayList2 = new ArrayList();
            Iterator it = listN1.iterator();
            while (true) {
                fValueOf = null;
                aVar = null;
                m92.h0.e.a aVar = null;
                if (!it.hasNext()) {
                    break;
                }
                oz1.b bVar = (oz1.b) it.next();
                DateTime dateTimeS = bVar.s();
                Float fValueOf3 = dateTimeS != null ? Float.valueOf(dateTimeS.getMillis()) : null;
                Float score = bVar.getScore();
                if (fValueOf3 != null && score != null) {
                    aVar = new m92.h0.e.a(fValueOf3.floatValue(), score.floatValue());
                }
                if (aVar != null) {
                    arrayList2.add(aVar);
                }
            }
            ArrayList arrayList3 = new ArrayList(y.r(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(Float.valueOf(((m92.h0.e.a) it3.next()).f117347b));
            }
            Iterator it4 = arrayList3.iterator();
            if (it4.hasNext()) {
                float fFloatValue = ((Number) it4.next()).floatValue();
                while (it4.hasNext()) {
                    fFloatValue = Math.max(fFloatValue, ((Number) it4.next()).floatValue());
                }
                fValueOf2 = Float.valueOf(fFloatValue);
            } else {
                fValueOf2 = null;
            }
            ArrayList arrayList4 = new ArrayList(y.r(arrayList2, 10));
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                arrayList4.add(Float.valueOf(((m92.h0.e.a) it5.next()).f117347b));
            }
            Iterator it6 = arrayList4.iterator();
            if (it6.hasNext()) {
                float fFloatValue2 = ((Number) it6.next()).floatValue();
                while (it6.hasNext()) {
                    fFloatValue2 = Math.min(fFloatValue2, ((Number) it6.next()).floatValue());
                }
                fValueOf = Float.valueOf(fFloatValue2);
            }
            m92.o.a(null, gl1.y.Q(o0VarE, R.string.training_readiness), null, null, z3.f.c(931780749, new s5.a(new q(i53.a.e(arrayList2), i53.a.e(arrayListC), Float.valueOf(fValueOf2 != null ? fValueOf2.floatValue() : 0.0f), Float.valueOf(fValueOf != null ? fValueOf.floatValue() : 0.0f)), 19), o0VarE), null, null, o0VarE, 24576, 109);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new s70.n(dateTime, dateTime2, list, i14, 26);
        }
    }
}
