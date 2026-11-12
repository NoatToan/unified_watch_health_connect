package ho2;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.garmin.feature.garminpay.providers.gpay.ui.common.FitPayA2AInstallAppActivity;
import h4.r;
import i3.mh;
import p005kotlin.Unit;
import p3.x1;
import p5.v;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class n implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84879a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f84880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f84881c;

    public /* synthetic */ n(Context context, String str) {
        this.f84881c = context;
        this.f84880b = str;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0043  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f84879a;
        Context context = this.f84881c;
        switch (i14) {
            case 0:
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c cVar = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a;
                dialogInterface.getClass();
                Intent intent = new Intent(context, (Class<?>) FitPayA2AInstallAppActivity.class);
                intent.putExtra("app.package.name", this.f84880b);
                context.startActivity(intent);
                dialogInterface.dismiss();
                break;
            default:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    r.a aVar = r.S;
                    String str = this.f84880b;
                    boolean zB = mVar.B(str) | mVar.r(context);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new a42.b(str, context, 7);
                        mVar.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new a42.b(str, context, 7);
                            mVar.K(objQ);
                        }
                    }
                    r rVarB = v.b(aVar, (e23.l) objQ);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(str, rVarB, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97931h, mVar), mVar, 0, 0, 131068);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ n(String str, Context context) {
        this.f84880b = str;
        this.f84881c = context;
    }
}
