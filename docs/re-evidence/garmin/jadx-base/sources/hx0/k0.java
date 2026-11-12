package hx0;

import android.content.Intent;
import android.net.Uri;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.NaturalCyclesLearnMoreActivity;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class k0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f86094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NaturalCyclesLearnMoreActivity f86095b;

    public /* synthetic */ k0(NaturalCyclesLearnMoreActivity naturalCyclesLearnMoreActivity, int i14) {
        this.f86094a = i14;
        this.f86095b = naturalCyclesLearnMoreActivity;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003e  */
    /* JADX WARN: Code duplicated, block: B:19:0x005a  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f86094a;
        final NaturalCyclesLearnMoreActivity naturalCyclesLearnMoreActivity = this.f86095b;
        Object[] objArr = 0;
        final int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                NaturalCyclesLearnMoreActivity.a aVar = NaturalCyclesLearnMoreActivity.f38818a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, true, z3.f.c(-1782191113, new k0(naturalCyclesLearnMoreActivity, i15), mVar), mVar, 221184, 15);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                NaturalCyclesLearnMoreActivity.a aVar2 = NaturalCyclesLearnMoreActivity.f38818a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    long jE = vb.h.e(d92.b.f58623a, mVar2);
                    boolean zR = mVar2.r(naturalCyclesLearnMoreActivity);
                    Object objQ = mVar2.q();
                    p3.m.a aVar3 = p3.m.f135153a;
                    if (zR) {
                        final Object[] objArr2 = objArr == true ? 1 : 0;
                        objQ = new e23.a() { // from class: hx0.l0
                            @Override // e23.a
                            public final Object invoke() {
                                int i16 = objArr2;
                                NaturalCyclesLearnMoreActivity naturalCyclesLearnMoreActivity2 = naturalCyclesLearnMoreActivity;
                                switch (i16) {
                                    case 0:
                                        NaturalCyclesLearnMoreActivity.a aVar4 = NaturalCyclesLearnMoreActivity.f38818a;
                                        naturalCyclesLearnMoreActivity2.finish();
                                        break;
                                    default:
                                        NaturalCyclesLearnMoreActivity.a aVar5 = NaturalCyclesLearnMoreActivity.f38818a;
                                        Intent intent = new Intent("android.intent.action.VIEW");
                                        String strE = ((c22.k) KoinJavaComponent.get$default(c22.k.class, null, null, 6, null)).e("natural_cycles_promo_url");
                                        naturalCyclesLearnMoreActivity2.startActivity(intent.setData(strE != null ? Uri.parse(strE) : null));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ);
                    } else {
                        aVar3.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            final int objArr3 = objArr == true ? 1 : 0;
                            objQ = new e23.a() { // from class: hx0.l0
                                @Override // e23.a
                                public final Object invoke() {
                                    int i16 = objArr3;
                                    NaturalCyclesLearnMoreActivity naturalCyclesLearnMoreActivity2 = naturalCyclesLearnMoreActivity;
                                    switch (i16) {
                                        case 0:
                                            NaturalCyclesLearnMoreActivity.a aVar4 = NaturalCyclesLearnMoreActivity.f38818a;
                                            naturalCyclesLearnMoreActivity2.finish();
                                            break;
                                        default:
                                            NaturalCyclesLearnMoreActivity.a aVar5 = NaturalCyclesLearnMoreActivity.f38818a;
                                            Intent intent = new Intent("android.intent.action.VIEW");
                                            String strE = ((c22.k) KoinJavaComponent.get$default(c22.k.class, null, null, 6, null)).e("natural_cycles_promo_url");
                                            naturalCyclesLearnMoreActivity2.startActivity(intent.setData(strE != null ? Uri.parse(strE) : null));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ);
                        }
                    }
                    e23.a aVar4 = (e23.a) objQ;
                    boolean zR2 = mVar2.r(naturalCyclesLearnMoreActivity);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new e23.a() { // from class: hx0.l0
                            @Override // e23.a
                            public final Object invoke() {
                                int i16 = i15;
                                NaturalCyclesLearnMoreActivity naturalCyclesLearnMoreActivity2 = naturalCyclesLearnMoreActivity;
                                switch (i16) {
                                    case 0:
                                        NaturalCyclesLearnMoreActivity.a aVar5 = NaturalCyclesLearnMoreActivity.f38818a;
                                        naturalCyclesLearnMoreActivity2.finish();
                                        break;
                                    default:
                                        NaturalCyclesLearnMoreActivity.a aVar6 = NaturalCyclesLearnMoreActivity.f38818a;
                                        Intent intent = new Intent("android.intent.action.VIEW");
                                        String strE = ((c22.k) KoinJavaComponent.get$default(c22.k.class, null, null, 6, null)).e("natural_cycles_promo_url");
                                        naturalCyclesLearnMoreActivity2.startActivity(intent.setData(strE != null ? Uri.parse(strE) : null));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ2);
                    } else {
                        aVar3.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new e23.a() { // from class: hx0.l0
                                @Override // e23.a
                                public final Object invoke() {
                                    int i16 = i15;
                                    NaturalCyclesLearnMoreActivity naturalCyclesLearnMoreActivity2 = naturalCyclesLearnMoreActivity;
                                    switch (i16) {
                                        case 0:
                                            NaturalCyclesLearnMoreActivity.a aVar5 = NaturalCyclesLearnMoreActivity.f38818a;
                                            naturalCyclesLearnMoreActivity2.finish();
                                            break;
                                        default:
                                            NaturalCyclesLearnMoreActivity.a aVar6 = NaturalCyclesLearnMoreActivity.f38818a;
                                            Intent intent = new Intent("android.intent.action.VIEW");
                                            String strE = ((c22.k) KoinJavaComponent.get$default(c22.k.class, null, null, 6, null)).e("natural_cycles_promo_url");
                                            naturalCyclesLearnMoreActivity2.startActivity(intent.setData(strE != null ? Uri.parse(strE) : null));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ2);
                        }
                    }
                    m0.a(jE, aVar4, (e23.a) objQ2, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
