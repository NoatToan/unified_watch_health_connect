package k91;

import ak0.o;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.personalizedinsights.presentation.language.LanguageSelectionActivity;
import e23.p;
import hl1.j;
import i3.fe;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.v;
import p3.x1;
import z3.f;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f103626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LanguageSelectionActivity f103627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h91.b f103628c;

    public /* synthetic */ a(LanguageSelectionActivity languageSelectionActivity, h91.b bVar, int i14) {
        this.f103626a = i14;
        this.f103627b = languageSelectionActivity;
        this.f103628c = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, o13.l] */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f103626a;
        h91.b bVar = this.f103628c;
        LanguageSelectionActivity languageSelectionActivity = this.f103627b;
        int i15 = 2;
        int i16 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                LanguageSelectionActivity.a aVar = LanguageSelectionActivity.f40328b;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, true, f.c(-957568661, new a(languageSelectionActivity, bVar, i16), mVar), mVar, 221184, 15);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                LanguageSelectionActivity.a aVar2 = LanguageSelectionActivity.f40328b;
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    v.a(g02.d.f74342a.c(languageSelectionActivity.getOnBackPressedDispatcher()), f.c(-561480149, new a(languageSelectionActivity, bVar, i15), mVar2), mVar2, 56);
                } else {
                    mVar2.e();
                }
                break;
            default:
                LanguageSelectionActivity languageSelectionActivity2 = this.f103627b;
                ?? r14 = languageSelectionActivity2.f40329a;
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                LanguageSelectionActivity.a aVar3 = LanguageSelectionActivity.f40328b;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    g3 g3Var = (g3) s9.c.c(((c) r14.getValue()).f103633e, mVar3).getF182175a();
                    g3 g3Var2 = (g3) s9.c.c(((c) r14.getValue()).f103635g, mVar3).getF182175a();
                    String str = (String) s9.c.c(((c) r14.getValue()).f103637i, mVar3).getF182175a();
                    Object objQ = mVar3.q();
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new fe();
                        mVar3.K(objQ);
                    }
                    fe feVar = (fe) objQ;
                    fw.p pVar = g3Var.f35300a;
                    fw.p pVar2 = fw.p.LOADING;
                    z02.d.a(pVar == pVar2 || g3Var2.f35300a == pVar2, f.c(1981142342, new ik1.c(languageSelectionActivity2, 22), mVar3), f.c(-893034651, new o(feVar, 20), mVar3), null, null, f.c(-925631038, new j(g3Var, g3Var2, str, languageSelectionActivity2, this.f103628c, feVar, 15), mVar3), mVar3, 197040, 24);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
