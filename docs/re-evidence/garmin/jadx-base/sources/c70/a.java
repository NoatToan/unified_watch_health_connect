package c70;

import a42.l;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import e23.q;
import h82.r;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f25215b;

    public /* synthetic */ a(c cVar, int i14) {
        this.f25214a = i14;
        this.f25215b = cVar;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f25214a;
        c cVar = this.f25215b;
        switch (i14) {
            case 0:
                m mVar = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i15 = c.f25219f;
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = n.f135158a;
                    cVar.h(mVar, h82.c.f82429e);
                } else {
                    mVar.e();
                }
                break;
            default:
                r rVar = (r) obj;
                m mVar2 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i16 = c.f25219f;
                rVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(rVar) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = n.f135158a;
                    Context context = (Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b);
                    int i17 = (iIntValue2 << 3) & 112;
                    rVar.D(R.string.lbl_cycling_ability, mVar2, i17);
                    rVar.l(R.string.lbl_cycling_ability_help_description, (iIntValue2 << 6) & 896, 2, null, mVar2);
                    int i18 = i17 | 6;
                    rVar.j(z3.f.c(1090041717, new c50.f(rVar, 2, context, cVar), mVar2), mVar2, i18);
                    rVar.j(z3.f.c(1610914860, new l(rVar, 8), mVar2), mVar2, i18);
                    rVar.j(z3.f.c(-148445011, new b(rVar, context, 0), mVar2), mVar2, i18);
                    rVar.j(z3.f.c(-1907804882, new l(rVar, 9), mVar2), mVar2, i18);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
