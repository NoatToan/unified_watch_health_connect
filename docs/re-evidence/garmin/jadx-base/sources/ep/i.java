package ep;

import android.content.Context;
import android.content.res.Resources;
import b82.d2;
import c2.t2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.stats.timinggates.TimingGatesActivity;
import e23.q;
import gl1.y;
import h4.r;
import java.util.List;
import org.joda.time.DateTimeConstants;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.x;
import p3.x1;
import p5.v;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f64821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f64822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f64823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f64824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f64825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f64826f;

    public /* synthetic */ i(int i14, Context context, Object obj, Object obj2, boolean z14, int i15) {
        this.f64821a = i15;
        this.f64822b = i14;
        this.f64824d = context;
        this.f64825e = obj;
        this.f64826f = obj2;
        this.f64823c = z14;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0092  */
    /* JADX WARN: Code duplicated, block: B:52:0x016a  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String quantityString;
        int i14 = this.f64821a;
        boolean z14 = this.f64823c;
        Object obj4 = this.f64826f;
        Object obj5 = this.f64825e;
        Context context = this.f64824d;
        int i15 = this.f64822b;
        int i16 = 18;
        switch (i14) {
            case 0:
                b bVar = (b) obj5;
                String str = (String) obj4;
                t2 t2Var = (t2) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(t2Var) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    d2 d2Var = d2.f16532a;
                    context.getClass();
                    if (i15 <= 59) {
                        quantityString = context.getResources().getQuantityString(R.plurals.lbl_duration_second, i15, Integer.valueOf(i15));
                        quantityString.getClass();
                    } else if (i15 <= 3599) {
                        int i17 = i15 / 60;
                        quantityString = context.getResources().getQuantityString(R.plurals.lbl_duration_minute, i17, Integer.valueOf(i17));
                        quantityString.getClass();
                    } else {
                        Resources resources = context.getResources();
                        int i18 = i15 / DateTimeConstants.SECONDS_PER_HOUR;
                        quantityString = resources.getQuantityString(R.plurals.lbl_duration_hour, i18, Integer.valueOf(i18));
                        quantityString.getClass();
                    }
                    String str2 = quantityString;
                    h4.d.f81522a.getClass();
                    h4.g.a aVar = h4.d.a.f81536n;
                    int i19 = iIntValue & 14;
                    int i24 = i19 | 3072;
                    d2Var.f(t2Var, str2, null, aVar, 0, 0, mVar, i24, 26);
                    d2Var.f(t2Var, bVar != null ? f.a(bVar.f64801a.f117347b, z14) : str, null, aVar, 0, 0, mVar, i24, 26);
                    d2Var.e(t2Var, null, aVar, z3.f.c(1243743601, new d81.h(i16, bVar, str), mVar), mVar, i19 | 3456, 1);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                TimingGatesActivity timingGatesActivity = (TimingGatesActivity) context;
                zq.a aVar2 = (zq.a) obj5;
                yq.c cVar = (yq.c) obj4;
                t2 t2Var2 = (t2) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                TimingGatesActivity.a aVar3 = TimingGatesActivity.f29952c;
                t2Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(t2Var2) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    int i25 = i15 + 1;
                    String strP = y.P(R.string.pacepro_lbl_split_number, new Object[]{String.valueOf(i25)}, mVar2);
                    t2 t2Var3 = t2Var2;
                    d2 d2Var2 = d2.f16532a;
                    String strValueOf = String.valueOf(i25);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar4 = h4.d.a.f81536n;
                    d2Var2.getClass();
                    r rVarI = d2.i();
                    timingGatesActivity.getClass();
                    r rVarU = x2.u(rVarI, TimingGatesActivity.ia(mVar2));
                    boolean zB = mVar2.B(strP);
                    Object objQ = mVar2.q();
                    p3.m.a aVar5 = p3.m.f135153a;
                    if (zB) {
                        objQ = new y01.k(strP, 7);
                        mVar2.K(objQ);
                    } else {
                        aVar5.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new y01.k(strP, 7);
                            mVar2.K(objQ);
                        }
                    }
                    r rVarB = v.b(rVarU, (e23.l) objQ);
                    int i26 = iIntValue2 & 14;
                    d2Var2.f(t2Var3, strValueOf, rVarB, aVar4, 0, 0, mVar2, i26 | 3072, 24);
                    List<ps.x1> list = aVar2.f206626c;
                    if (list == null) {
                        mVar2.C(-2133665440);
                        mVar2.f();
                    } else {
                        mVar2.C(-2133665439);
                        int i27 = 0;
                        for (Object obj6 : list) {
                            int i28 = i27 + 1;
                            if (i27 < 0) {
                                x.q();
                                throw null;
                            }
                            ps.x1 x1Var3 = (ps.x1) obj6;
                            boolean zG = s.g(x1Var3, aVar2.f206624a);
                            StringBuilder sbI = sn.a.i(strP, ",");
                            sbI.append(y.P(R.string.lbl_enduro_split_index, new Object[]{String.valueOf(i28)}, mVar2));
                            sbI.append(",");
                            sbI.append(cVar.d(x1Var3 != null ? x1Var3.getElapsedDuration() : null));
                            sbI.append(",");
                            if (zG) {
                                mVar2.C(1887073922);
                                sbI.append(y.Q(mVar2, R.string.lbl_fastest));
                                mVar2.f();
                            } else {
                                mVar2.C(1887195969);
                                mVar2.f();
                            }
                            String strC = cVar.c(x1Var3 != null ? x1Var3.getElapsedDuration() : null);
                            boolean z15 = zG && z14;
                            d2.f16532a.getClass();
                            r rVarU2 = x2.u(d2.i(), TimingGatesActivity.ha(mVar2));
                            boolean zR = mVar2.r(sbI);
                            Object objQ2 = mVar2.q();
                            if (zR) {
                                objQ2 = new rg2.e(2, sbI);
                                mVar2.K(objQ2);
                            } else {
                                aVar5.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new rg2.e(2, sbI);
                                    mVar2.K(objQ2);
                                }
                            }
                            r rVarB2 = v.b(rVarU2, (e23.l) objQ2);
                            t2 t2Var4 = t2Var3;
                            timingGatesActivity.fa(t2Var4, strC, z15, rVarB2, mVar2, i26);
                            t2Var3 = t2Var4;
                            i27 = i28;
                        }
                        mVar2.f();
                    }
                    x1 x1Var4 = p3.n.f135158a;
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
