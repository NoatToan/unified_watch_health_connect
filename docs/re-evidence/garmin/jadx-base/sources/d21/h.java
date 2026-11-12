package d21;

import b63.v;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import e23.r;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import q01.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class h implements r<e2.d, Integer, m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f57298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l22.a f57299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e21.a f57300c;

    public h(List list, l22.a aVar, e21.a aVar2) {
        this.f57298a = list;
        this.f57299b = aVar;
        this.f57300c = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00be  */
    @Override // e23.r
    public final Unit invoke(e2.d dVar, Integer num, m mVar, Integer num2) {
        int i14;
        String strB;
        e2.d dVar2 = dVar;
        int iIntValue = num.intValue();
        m mVar2 = mVar;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i14 = (mVar2.B(dVar2) ? 4 : 2) | iIntValue2;
        } else {
            i14 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i14 |= mVar2.k(iIntValue) ? 32 : 16;
        }
        if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            e21.a.c cVar = (e21.a.c) this.f57298a.get(iIntValue);
            mVar2.C(-204249061);
            if (cVar.f62620e) {
                strB = sn.a.h(mVar2, -560776263, R.string.device_settings_frequency_daily, mVar2);
            } else {
                mVar2.C(-560773983);
                mVar2.f();
                j jVar = cVar.f62617b;
                l22.a aVar = this.f57299b;
                aVar.getClass();
                b11.c.a aVar2 = b11.c.f14245d;
                String str = jVar.f142035a;
                boolean z14 = jVar.f142036b;
                aVar2.getClass();
                strB = b11.c.a.b(str, aVar, z14);
            }
            String str2 = strB;
            boolean z15 = cVar.f62618c;
            v vVar = cVar.f62619d;
            e21.a aVar3 = this.f57300c;
            boolean zR = mVar2.r(aVar3) | mVar2.r(cVar);
            Object objQ = mVar2.q();
            m.a aVar4 = m.f135153a;
            if (zR) {
                objQ = new d(aVar3, cVar);
                mVar2.K(objQ);
            } else {
                aVar4.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new d(aVar3, cVar);
                    mVar2.K(objQ);
                }
            }
            l lVar = (l) objQ;
            boolean zR2 = mVar2.r(aVar3) | mVar2.r(cVar);
            Object objQ2 = mVar2.q();
            if (zR2) {
                objQ2 = new e(aVar3, cVar);
                mVar2.K(objQ2);
            } else {
                aVar4.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new e(aVar3, cVar);
                    mVar2.K(objQ2);
                }
            }
            c21.e.a(str2, z15, vVar, lVar, (l) objQ2, mVar2, 0);
            if (cVar.f62620e) {
                mVar2.C(-203561947);
                h4.r.a aVar5 = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                c2.l.f(x2.h(aVar5, j92.b.f97899b.f97920e), mVar2);
                mVar2.f();
            } else {
                mVar2.C(-203442783);
                mVar2.f();
            }
            mVar2.f();
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
