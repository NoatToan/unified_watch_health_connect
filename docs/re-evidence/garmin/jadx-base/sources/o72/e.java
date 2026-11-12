package o72;

import android.content.Context;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import java.util.Collection;
import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f130360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f130361c;

    public /* synthetic */ e(Context context, p3.p1 p1Var, int i14) {
        this.f130359a = i14;
        this.f130361c = context;
        this.f130360b = p1Var;
    }

    /* JADX WARN: Code duplicated, block: B:88:0x0346  */
    /* JADX WARN: Code duplicated, block: B:93:0x0363  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        String strP;
        String string;
        int i14 = this.f130359a;
        p3.p1 p1Var = this.f130360b;
        Context context = this.f130361c;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    l72.s sVar = l72.s.f111232a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA = v62.u.a(t62.b.f162798a);
                    g6.f.a aVar = g6.f.f75994b;
                    h4.r rVarZ = c2.l.z(h4.r.S, 16, 4);
                    boolean zR = mVar.r(context);
                    Object objQ = mVar.q();
                    p3.m.a aVar2 = p3.m.f135153a;
                    if (zR) {
                        objQ = new by1.p(context, p1Var, 3);
                        mVar.K(objQ);
                    } else {
                        aVar2.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new by1.p(context, p1Var, 3);
                            mVar.K(objQ);
                        }
                    }
                    e23.a aVar3 = (e23.a) objQ;
                    boolean zR2 = mVar.r(context);
                    Object objQ2 = mVar.q();
                    if (zR2) {
                        objQ2 = new by1.p(context, p1Var, 4);
                        mVar.K(objQ2);
                    } else {
                        aVar2.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new by1.p(context, p1Var, 4);
                            mVar.K(objQ2);
                        }
                    }
                    sVar.c(rVarZ, dVarA, null, null, "Title", "Cras mattis consectetur purus sit amet amet fermentum.", "Action", false, aVar3, (e23.a) objQ2, mVar, 1794054, 0, 396);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                List list = (List) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                list.getClass();
                p1Var.setValue(list);
                Toast.makeText(context, "Selected " + ((l72.j0) list.get(iIntValue2)).f111072a, 0).show();
                return Unit.INSTANCE;
            case 2:
                List list2 = (List) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                list2.getClass();
                p1Var.setValue(list2);
                Toast.makeText(context, "Selected " + ((l72.j0) list2.get(iIntValue3)).f111072a, 0).show();
                return Unit.INSTANCE;
            case 3:
                int iIntValue4 = ((Integer) obj).intValue();
                int iIntValue5 = ((Integer) obj2).intValue();
                p1Var.setValue(Boolean.FALSE);
                r1.c(context, "Action1: selectedHour: " + iIntValue4 + " - selectedMinute: " + iIntValue5);
                return Unit.INSTANCE;
            case 4:
                String str = (String) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                str.getClass();
                p1Var.setValue(str);
                if (zBooleanValue) {
                    u3.b(context, "Search for " + ((String) p1Var.getF182175a()));
                }
                return Unit.INSTANCE;
            case 5:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    wf.f.a aVar4 = new wf.f.a(context);
                    com.garmin.android.apps.connectmobile.devices.model.j jVar = (com.garmin.android.apps.connectmobile.devices.model.j) p1Var.getF182175a();
                    aVar4.f184930c = jVar != null ? jVar.f34188b : null;
                    wf.g.a(aVar4);
                    wf.f fVarA = aVar4.a();
                    s62.a.f157643a.getClass();
                    t62.b bVar = t62.b.f162798a;
                    u4.o oVarB = u4.p.b(v62.m2.a(bVar), mVar2);
                    u4.o oVarB2 = u4.p.b(v62.m2.a(bVar), mVar2);
                    String strQ = gl1.y.Q(mVar2, R.string.image_content_description);
                    h4.r.a aVar5 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    jf.r.b(fVarA, strQ, c2.x2.q(aVar5, j92.b.f97901d.f97906e), oVarB, oVarB2, null, null, null, null, null, null, null, mVar2, 36864, 0, 32736);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                    Collection collection = (Collection) ((com.garmin.android.apps.connectmobile.g3) p1Var.getF182175a()).f35301b;
                    if (collection == null || collection.isEmpty()) {
                        mVar3.C(-720000324);
                        l72.p2.f111205a.g(gl1.y.Q(mVar3, R.string.lbl_no_active_features), null, null, null, null, false, false, null, mVar3, 0, 510);
                        mVar3.f();
                    } else {
                        mVar3.C(-734182606);
                        List<o13.p> list3 = (List) ((com.garmin.android.apps.connectmobile.g3) p1Var.getF182175a()).f35301b;
                        if (list3 == null) {
                            list3 = p13.j0.f134944a;
                        }
                        for (o13.p pVar : list3) {
                            c80.p pVar2 = (c80.p) pVar.f128595b;
                            if (pVar2 instanceof c80.p.a) {
                                mVar3.C(-719478563);
                                String string2 = ((c80.p.a) pVar2).f25519a.toString("MMMM d, yyyy");
                                string2.getClass();
                                strP = gl1.y.P(R.string.lbl_active_expires_on, new Object[]{string2}, mVar3);
                                mVar3.f();
                            } else if (p005kotlin.jvm.internal.s.g(pVar2, c80.p.b.f25521a)) {
                                strP = sn.a.h(mVar3, -1131576965, R.string.lbl_eligible, mVar3);
                            } else {
                                if (!(pVar2 instanceof c80.p.c)) {
                                    throw n23.j.m(mVar3, -1131594989);
                                }
                                mVar3.C(-1131573350);
                                strP = gl1.y.P(R.string.lbl_ineligible_reason, new Object[]{((c80.p.c) pVar2).f25522a}, mVar3);
                                mVar3.f();
                            }
                            String str2 = strP;
                            l72.p2 p2Var = l72.p2.f111205a;
                            c80.q qVar = (c80.q) pVar.f128594a;
                            qVar.getClass();
                            context.getClass();
                            switch (c80.q.b.f25549a[qVar.ordinal()]) {
                                case 1:
                                    string = context.getString(R.string.active_intelligence);
                                    string.getClass();
                                    break;
                                case 2:
                                    string = context.getString(R.string.live_activity);
                                    string.getClass();
                                    break;
                                case 3:
                                    string = context.getString(R.string.title_live_track);
                                    string.getClass();
                                    break;
                                case 4:
                                    string = context.getString(R.string.live_track_sms);
                                    string.getClass();
                                    break;
                                case 5:
                                    string = context.getString(R.string.lbl_garmin_trails);
                                    string.getClass();
                                    break;
                                case 6:
                                    string = context.getString(R.string.lbl_category_social);
                                    string.getClass();
                                    break;
                                case 7:
                                    string = context.getString(R.string.lbl_profile_image_frame);
                                    string.getClass();
                                    break;
                                case 8:
                                    string = context.getString(R.string.lbl_annual_report);
                                    string.getClass();
                                    break;
                                case 9:
                                    string = context.getString(R.string.performance_dashboard);
                                    string.getClass();
                                    break;
                                case 10:
                                    string = context.getString(R.string.lbl_training_media);
                                    string.getClass();
                                    break;
                                case 11:
                                    string = context.getString(R.string.map_3d_label);
                                    string.getClass();
                                    break;
                                case 12:
                                    string = context.getString(R.string.lbl_nutrition);
                                    string.getClass();
                                    break;
                                case 13:
                                    string = context.getString(R.string.exclusive_offers);
                                    string.getClass();
                                    break;
                                default:
                                    lc.u0.r();
                                    return null;
                            }
                            p2Var.h(string, str2, null, null, null, false, false, null, null, null, null, mVar3, 0, 0, 2044);
                        }
                        mVar3.f();
                    }
                    p3.x1 x1Var4 = p3.n.f135158a;
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ e(p3.p1 p1Var, Context context, int i14) {
        this.f130359a = i14;
        this.f130360b = p1Var;
        this.f130361c = context;
    }
}
