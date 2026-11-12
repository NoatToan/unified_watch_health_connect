package tt1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.training.activeplans.presentation.activity.ActiveTrainingPlansActivity;
import e23.p;
import java.util.Arrays;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.x0;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f166428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActiveTrainingPlansActivity f166429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ww1.a f166430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f166431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f166432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f166433f;

    public /* synthetic */ f(ActiveTrainingPlansActivity activeTrainingPlansActivity, ww1.a aVar, int i14, int i15, String str, int i16) {
        this.f166428a = i16;
        this.f166429b = activeTrainingPlansActivity;
        this.f166430c = aVar;
        this.f166431d = i14;
        this.f166432e = i15;
        this.f166433f = str;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00bb  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f166428a) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ActiveTrainingPlansActivity.a aVar = ActiveTrainingPlansActivity.f45098w;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    Context context = (Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b);
                    ww1.a aVar2 = this.f166430c;
                    String str = aVar2.f187760f;
                    if (str == null) {
                        str = "";
                    }
                    ActiveTrainingPlansActivity activeTrainingPlansActivity = this.f166429b;
                    activeTrainingPlansActivity.getClass();
                    x0 x0Var = x0.f105818a;
                    String string = context.getString(R.string.coach_name);
                    string.getClass();
                    String str2 = String.format(string, Arrays.copyOf(new Object[]{str}, 1));
                    String str3 = aVar2.f187756b;
                    u4.d dVar = am.x0.f4308n.f4362e;
                    String strPa = activeTrainingPlansActivity.pa(this.f166431d, this.f166432e, this.f166433f, false);
                    boolean zR = mVar.r(activeTrainingPlansActivity) | mVar.r(aVar2);
                    Object objQ = mVar.q();
                    if (zR) {
                        objQ = new tb0.d(7, activeTrainingPlansActivity, aVar2);
                        mVar.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new tb0.d(7, activeTrainingPlansActivity, aVar2);
                            mVar.K(objQ);
                        }
                    }
                    ku1.n.b(null, dVar, str2, str3, strPa, (e23.a) objQ, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ActiveTrainingPlansActivity.a aVar3 = ActiveTrainingPlansActivity.f45098w;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1619292360, new f(this.f166429b, this.f166430c, this.f166431d, this.f166432e, this.f166433f, 0), mVar2), mVar2, 196608, 31);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
