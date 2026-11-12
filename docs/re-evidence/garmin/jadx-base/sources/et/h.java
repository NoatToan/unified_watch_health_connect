package et;

import a03.h0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.proto.generated.GDIInReachMessaging;
import gl1.y;
import l72.i3;
import l72.w;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65249a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f65250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f65251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f65252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f65253e;

    public /* synthetic */ h(String str, e23.l lVar, p1 p1Var, e23.a aVar) {
        this.f65251c = str;
        this.f65252d = lVar;
        this.f65250b = p1Var;
        this.f65253e = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0059  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:53:0x013b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        vs.a aVar;
        vs.f fVar;
        int i14 = this.f65249a;
        p3.m.a aVar2 = p3.m.f135153a;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    p1 p1Var = this.f65250b;
                    vs.e eVar = ((ys.b) p1Var.getF182175a()).f199161c;
                    String strQ = y.Q(mVar, ((eVar == null || (fVar = eVar.f179706a) == null) && ((aVar = ((ys.b) p1Var.getF182175a()).f199162d) == null || (fVar = aVar.f179692a) == null)) ? R.string.lbl_empty_string : fVar.f179713c);
                    vs.a aVar3 = ((ys.b) p1Var.getF182175a()).f199162d;
                    String strP = null;
                    if (s.g(aVar3 != null ? aVar3.f179693b : null, ys.a.C3724a.f199152a)) {
                        mVar.C(-821181172);
                    } else {
                        mVar.C(-821129619);
                        strP = y.P(R.string.lbl_recording_on_device, new Object[]{this.f65251c}, mVar);
                    }
                    mVar.f();
                    e23.l lVar = this.f65252d;
                    boolean zB = mVar.B(lVar) | mVar.B(p1Var);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new a51.k(lVar, p1Var, 25);
                        mVar.K(objQ);
                    } else {
                        aVar2.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new a51.k(lVar, p1Var, 25);
                            mVar.K(objQ);
                        }
                    }
                    e23.a aVar4 = (e23.a) objQ;
                    i53.f fVarA = i53.a.a(new i3("HELP", y.Q(mVar, R.string.lbl_help), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                    e23.a aVar5 = this.f65253e;
                    boolean zB2 = mVar.B(aVar5);
                    Object objQ2 = mVar.q();
                    if (zB2) {
                        objQ2 = new h0(aVar5, 22);
                        mVar.K(objQ2);
                    } else {
                        aVar2.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new h0(aVar5, 22);
                            mVar.K(objQ2);
                        }
                    }
                    z02.f.d(strQ, strP, null, aVar4, fVarA, null, (e23.l) objQ2, mVar, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 84);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    w wVar = w.f111301a;
                    String strQ2 = y.Q(mVar2, R.string.lbl_common_save);
                    p1 p1Var2 = this.f65250b;
                    boolean zB3 = mVar2.B(p1Var2);
                    String str = this.f65251c;
                    boolean zB4 = zB3 | mVar2.B(str);
                    e23.l lVar2 = this.f65252d;
                    boolean zB5 = zB4 | mVar2.B(lVar2);
                    e23.a aVar6 = this.f65253e;
                    boolean zB6 = zB5 | mVar2.B(aVar6);
                    Object objQ3 = mVar2.q();
                    if (zB6) {
                        ug2.k kVar = new ug2.k(str, lVar2, aVar6, p1Var2, 2);
                        mVar2.K(kVar);
                        objQ3 = kVar;
                    } else {
                        aVar2.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            ug2.k kVar2 = new ug2.k(str, lVar2, aVar6, p1Var2, 2);
                            mVar2.K(kVar2);
                            objQ3 = kVar2;
                        }
                    }
                    wVar.j(0, (e23.a) objQ3, strQ2, mVar2);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ h(p1 p1Var, String str, e23.l lVar, e23.a aVar) {
        this.f65250b = p1Var;
        this.f65251c = str;
        this.f65252d = lVar;
        this.f65253e = aVar;
    }
}
