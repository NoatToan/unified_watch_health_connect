package uu1;

import c2.l;
import com.garmin.android.apps.connectmobile.settings.usersettings.stride.StrideLengthSettingsActivity;
import e23.p;
import h4.r;
import i3.mh;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import u1.w;
import w51.x0;
import zo1.f1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f172857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f172858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f172859c;

    public /* synthetic */ i(String str, e23.a aVar, int i14) {
        this.f172857a = i14;
        this.f172858b = str;
        this.f172859c = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0052  */
    /* JADX WARN: Code duplicated, block: B:40:0x00de  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f172857a;
        m.a aVar = m.f135153a;
        String str = this.f172858b;
        e23.a aVar2 = this.f172859c;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                j.b(p0.t(1), aVar2, str, (m) obj);
                break;
            case 1:
                ((Integer) obj2).getClass();
                og.a.a(p0.t(1), aVar2, str, (m) obj);
                break;
            case 2:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    r.a aVar3 = r.S;
                    boolean zB = mVar.B(aVar2);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new ux1.g(aVar2, 23);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new ux1.g(aVar2, 23);
                            mVar.K(objQ);
                        }
                    }
                    r rVarD = w.d(aVar3, false, null, null, (e23.a) objQ, 15);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    r rVarC = l.C(rVarD, 0.0f, 0.0f, eVar.f97921f, eVar.f97920e, 3);
                    d92.b.f58624b.getClass();
                    mh.c(this.f172858b, rVarC, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar), mVar, 0, 0, 131068);
                } else {
                    mVar.e();
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                x0.a(p0.t(1), aVar2, str, (m) obj);
                break;
            case 4:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    wv0.p.a(this.f172858b, null, this.f172859c, mVar2, 0, 2);
                } else {
                    mVar2.e();
                }
                break;
            case 5:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                StrideLengthSettingsActivity.a aVar4 = StrideLengthSettingsActivity.f44198b;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    boolean zB2 = mVar3.B(aVar2);
                    Object objQ2 = mVar3.q();
                    if (zB2) {
                        objQ2 = new ya0.l(aVar2, 6);
                        mVar3.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new ya0.l(aVar2, 6);
                            mVar3.K(objQ2);
                        }
                    }
                    z02.f.c(0, 54, null, (e23.a) objQ2, null, this.f172858b, mVar3, null);
                } else {
                    mVar3.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                f1.d(p0.t(1), aVar2, str, (m) obj);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ i(String str, e23.a aVar, int i14, int i15) {
        this.f172857a = i15;
        this.f172858b = str;
        this.f172859c = aVar;
    }
}
