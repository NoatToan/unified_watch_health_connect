package rf0;

import android.text.TextUtils;
import androidx.navigation.fragment.NavHostFragment;
import c2.b0;
import c2.j;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.ecg.presentation.stats.filter.EcgFilterFragment;
import e23.p;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.u;
import p13.x;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import v.h;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f152406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EcgFilterFragment f152407b;

    public /* synthetic */ e(EcgFilterFragment ecgFilterFragment, int i14) {
        this.f152406a = i14;
        this.f152407b = ecgFilterFragment;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x011d  */
    /* JADX WARN: Code duplicated, block: B:57:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:85:0x025f  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        String string;
        String strA;
        String string2;
        String lowerCase;
        int i14 = this.f152406a;
        final EcgFilterFragment ecgFilterFragment = this.f152407b;
        Object[] objArr = 0;
        final int i15 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i16 = EcgFilterFragment.f34911e;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(649853590, new e(ecgFilterFragment, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i17 = EcgFilterFragment.f34911e;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    r.a aVar = r.S;
                    j.f22691a.getClass();
                    j.k kVar = j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    r rVarC = k.c(aVar, mVar2);
                    g.V.getClass();
                    e0.a aVar2 = g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar2);
                    } else {
                        mVar2.c();
                    }
                    b4.c(g.a.f81810g, zVarA, mVar2);
                    b4.c(g.a.f81809f, i2VarX, mVar2);
                    g.a.b bVar = g.a.f81813j;
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(g.a.f81807d, rVarC, mVar2);
                    b0 b0Var = b0.f22601a;
                    String strQ = gl1.y.Q(mVar2, R.string.lbl_result);
                    pf0.s sVar = ecgFilterFragment.f34912d;
                    if (sVar == null) {
                        s.m("formatter");
                        throw null;
                    }
                    l22.a aVar3 = sVar.f137530b;
                    List<? extends gf0.f> list = ecgFilterFragment.v6().f152388a;
                    list.getClass();
                    if (list.isEmpty() || list.containsAll(gf0.f.f77062c)) {
                        string = aVar3.getString(R.string.common_all);
                    } else {
                        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
                        for (gf0.f fVar : list) {
                            fVar.getClass();
                            pf0.s.a aVar4 = pf0.s.f137528d;
                            String str = (String) u.H(fVar.f77063a);
                            if (str == null) {
                                str = "";
                            }
                            aVar4.getClass();
                            arrayList.add(aVar3.getString(pf0.s.a.a(str)));
                        }
                        string = TextUtils.join(", ", arrayList);
                        string.getClass();
                    }
                    boolean zR = mVar2.r(ecgFilterFragment);
                    Object objQ = mVar2.q();
                    m.a aVar5 = m.f135153a;
                    if (zR) {
                        final Object[] objArr2 = objArr == true ? 1 : 0;
                        objQ = new e23.a() { // from class: rf0.f
                            @Override // e23.a
                            public final Object invoke() {
                                int i18 = objArr2;
                                EcgFilterFragment ecgFilterFragment2 = ecgFilterFragment;
                                switch (i18) {
                                    case 0:
                                        int i19 = EcgFilterFragment.f34911e;
                                        NavHostFragment.f10124e.getClass();
                                        NavHostFragment.a.a(ecgFilterFragment2).g(R.id.action_filter_result, null);
                                        break;
                                    case 1:
                                        int i24 = EcgFilterFragment.f34911e;
                                        NavHostFragment.f10124e.getClass();
                                        NavHostFragment.a.a(ecgFilterFragment2).g(R.id.action_filter_date, null);
                                        break;
                                    default:
                                        int i25 = EcgFilterFragment.f34911e;
                                        NavHostFragment.f10124e.getClass();
                                        NavHostFragment.a.a(ecgFilterFragment2).g(R.id.action_filter_symptom, null);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ);
                    } else {
                        aVar5.getClass();
                        if (objQ == m.a.f135155b) {
                            final int objArr3 = objArr == true ? 1 : 0;
                            objQ = new e23.a() { // from class: rf0.f
                                @Override // e23.a
                                public final Object invoke() {
                                    int i18 = objArr3;
                                    EcgFilterFragment ecgFilterFragment2 = ecgFilterFragment;
                                    switch (i18) {
                                        case 0:
                                            int i19 = EcgFilterFragment.f34911e;
                                            NavHostFragment.f10124e.getClass();
                                            NavHostFragment.a.a(ecgFilterFragment2).g(R.id.action_filter_result, null);
                                            break;
                                        case 1:
                                            int i24 = EcgFilterFragment.f34911e;
                                            NavHostFragment.f10124e.getClass();
                                            NavHostFragment.a.a(ecgFilterFragment2).g(R.id.action_filter_date, null);
                                            break;
                                        default:
                                            int i25 = EcgFilterFragment.f34911e;
                                            NavHostFragment.f10124e.getClass();
                                            NavHostFragment.a.a(ecgFilterFragment2).g(R.id.action_filter_symptom, null);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ);
                        }
                    }
                    d10.d.u6(strQ, string, (e23.a) objQ, mVar2);
                    String strQ2 = gl1.y.Q(mVar2, R.string.txt_date);
                    pf0.s sVar2 = ecgFilterFragment.f34912d;
                    if (sVar2 == null) {
                        s.m("formatter");
                        throw null;
                    }
                    LocalDate localDate = ecgFilterFragment.v6().f152390c;
                    LocalDate localDate2 = ecgFilterFragment.v6().f152391d;
                    l22.a aVar6 = sVar2.f137530b;
                    pi0.e eVar = sVar2.f137531c;
                    if (localDate != null && localDate2 != null) {
                        qi0.a aVar7 = qi0.a.NUMERIC_YEAR_MONTH_DAY;
                        strA = aVar6.a(R.string.lbl_value_range, eVar.d(localDate, aVar7), eVar.d(localDate2, aVar7));
                    } else if (localDate != null) {
                        strA = aVar6.a(R.string.lbl_common_since_date, eVar.d(localDate, qi0.a.NUMERIC_YEAR_MONTH_DAY));
                    } else {
                        strA = localDate2 != null ? aVar6.a(R.string.lbl_date_and_before, eVar.d(localDate2, qi0.a.NUMERIC_YEAR_MONTH_DAY)) : aVar6.getString(R.string.common_all);
                    }
                    boolean zR2 = mVar2.r(ecgFilterFragment);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new e23.a() { // from class: rf0.f
                            @Override // e23.a
                            public final Object invoke() {
                                int i18 = i15;
                                EcgFilterFragment ecgFilterFragment2 = ecgFilterFragment;
                                switch (i18) {
                                    case 0:
                                        int i19 = EcgFilterFragment.f34911e;
                                        NavHostFragment.f10124e.getClass();
                                        NavHostFragment.a.a(ecgFilterFragment2).g(R.id.action_filter_result, null);
                                        break;
                                    case 1:
                                        int i24 = EcgFilterFragment.f34911e;
                                        NavHostFragment.f10124e.getClass();
                                        NavHostFragment.a.a(ecgFilterFragment2).g(R.id.action_filter_date, null);
                                        break;
                                    default:
                                        int i25 = EcgFilterFragment.f34911e;
                                        NavHostFragment.f10124e.getClass();
                                        NavHostFragment.a.a(ecgFilterFragment2).g(R.id.action_filter_symptom, null);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ2);
                    } else {
                        aVar5.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new e23.a() { // from class: rf0.f
                                @Override // e23.a
                                public final Object invoke() {
                                    int i18 = i15;
                                    EcgFilterFragment ecgFilterFragment2 = ecgFilterFragment;
                                    switch (i18) {
                                        case 0:
                                            int i19 = EcgFilterFragment.f34911e;
                                            NavHostFragment.f10124e.getClass();
                                            NavHostFragment.a.a(ecgFilterFragment2).g(R.id.action_filter_result, null);
                                            break;
                                        case 1:
                                            int i24 = EcgFilterFragment.f34911e;
                                            NavHostFragment.f10124e.getClass();
                                            NavHostFragment.a.a(ecgFilterFragment2).g(R.id.action_filter_date, null);
                                            break;
                                        default:
                                            int i25 = EcgFilterFragment.f34911e;
                                            NavHostFragment.f10124e.getClass();
                                            NavHostFragment.a.a(ecgFilterFragment2).g(R.id.action_filter_symptom, null);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ2);
                        }
                    }
                    d10.d.u6(strQ2, strA, (e23.a) objQ2, mVar2);
                    String strQ3 = gl1.y.Q(mVar2, R.string.lbl_symptom);
                    pf0.s sVar3 = ecgFilterFragment.f34912d;
                    if (sVar3 == null) {
                        s.m("formatter");
                        throw null;
                    }
                    List<? extends gf0.h> list2 = ecgFilterFragment.v6().f152389b;
                    list2.getClass();
                    if (list2.isEmpty() || list2.containsAll(gf0.h.f77071d)) {
                        string2 = sVar3.f137530b.getString(R.string.common_all);
                    } else {
                        ArrayList arrayList2 = new ArrayList(p13.y.r(list2, 10));
                        int i18 = 0;
                        for (Object obj3 : list2) {
                            int i19 = i18 + 1;
                            if (i18 < 0) {
                                x.q();
                                throw null;
                            }
                            String strE = sVar3.e((gf0.h) obj3);
                            if (i18 == 0) {
                                Locale locale = Locale.ROOT;
                                lowerCase = strE.toLowerCase(locale);
                                lowerCase.getClass();
                                if (lowerCase.length() > 0) {
                                    StringBuilder sb3 = new StringBuilder();
                                    String strValueOf = String.valueOf(lowerCase.charAt(0));
                                    strValueOf.getClass();
                                    String upperCase = strValueOf.toUpperCase(locale);
                                    upperCase.getClass();
                                    sb3.append((Object) upperCase);
                                    sb3.append(lowerCase.substring(1));
                                    lowerCase = sb3.toString();
                                }
                            } else {
                                lowerCase = strE.toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                            }
                            arrayList2.add(lowerCase);
                            i18 = i19;
                        }
                        string2 = TextUtils.join(", ", arrayList2);
                        string2.getClass();
                    }
                    boolean zR3 = mVar2.r(ecgFilterFragment);
                    Object objQ3 = mVar2.q();
                    if (zR3) {
                        final int i24 = 2;
                        objQ3 = new e23.a() { // from class: rf0.f
                            @Override // e23.a
                            public final Object invoke() {
                                int i110 = i24;
                                EcgFilterFragment ecgFilterFragment2 = ecgFilterFragment;
                                switch (i110) {
                                    case 0:
                                        int i111 = EcgFilterFragment.f34911e;
                                        NavHostFragment.f10124e.getClass();
                                        NavHostFragment.a.a(ecgFilterFragment2).g(R.id.action_filter_result, null);
                                        break;
                                    case 1:
                                        int i25 = EcgFilterFragment.f34911e;
                                        NavHostFragment.f10124e.getClass();
                                        NavHostFragment.a.a(ecgFilterFragment2).g(R.id.action_filter_date, null);
                                        break;
                                    default:
                                        int i26 = EcgFilterFragment.f34911e;
                                        NavHostFragment.f10124e.getClass();
                                        NavHostFragment.a.a(ecgFilterFragment2).g(R.id.action_filter_symptom, null);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ3);
                    } else {
                        aVar5.getClass();
                        if (objQ3 == m.a.f135155b) {
                            final int i25 = 2;
                            objQ3 = new e23.a() { // from class: rf0.f
                                @Override // e23.a
                                public final Object invoke() {
                                    int i110 = i25;
                                    EcgFilterFragment ecgFilterFragment2 = ecgFilterFragment;
                                    switch (i110) {
                                        case 0:
                                            int i111 = EcgFilterFragment.f34911e;
                                            NavHostFragment.f10124e.getClass();
                                            NavHostFragment.a.a(ecgFilterFragment2).g(R.id.action_filter_result, null);
                                            break;
                                        case 1:
                                            int i26 = EcgFilterFragment.f34911e;
                                            NavHostFragment.f10124e.getClass();
                                            NavHostFragment.a.a(ecgFilterFragment2).g(R.id.action_filter_date, null);
                                            break;
                                        default:
                                            int i27 = EcgFilterFragment.f34911e;
                                            NavHostFragment.f10124e.getClass();
                                            NavHostFragment.a.a(ecgFilterFragment2).g(R.id.action_filter_symptom, null);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ3);
                        }
                    }
                    d10.d.u6(strQ3, string2, (e23.a) objQ3, mVar2);
                    mVar2.y();
                    x1 x1Var3 = n.f135158a;
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
