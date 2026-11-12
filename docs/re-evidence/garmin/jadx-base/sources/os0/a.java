package os0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import f72.x2;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import u4.d;
import z3.f;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f133538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f133539c;

    public /* synthetic */ a(c cVar, String str, int i14) {
        this.f133537a = i14;
        this.f133538b = cVar;
        this.f133539c = str;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f133537a;
        String str = this.f133539c;
        c cVar = this.f133538b;
        int i15 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, f.c(1038171814, new a(cVar, str, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    s62.a.f157643a.getClass();
                    d dVarA = x2.a(t62.c.f162799a);
                    String strA = cVar.f133543b.f106382a.a(R.string.lbl_trip_to_city_name, str);
                    String string = ((Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b)).getString(R.string.msg_jet_lag_genesis_state_info);
                    string.getClass();
                    b82.n.c(dVarA, strA, string, null, null, mVar2, 0, 24);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
