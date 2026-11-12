package vn2;

import android.content.DialogInterface;
import java.io.File;
import org.slf4j.Logger;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f178859b;

    public /* synthetic */ a0(b0 b0Var, int i14) {
        this.f178858a = i14;
        this.f178859b = b0Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f178858a;
        b0 b0Var = this.f178859b;
        switch (i14) {
            case 0:
                Logger logger = b0.f178864c;
                ((DialogInterface) obj).getClass();
                b0Var.getView().c();
                break;
            case 1:
                pn2.e eVar = (pn2.e) obj;
                Logger logger2 = b0.f178864c;
                com.garmin.feature.garminpay.providers.felica.ui.b view2 = b0Var.getView();
                eVar.getClass();
                view2.r4(eVar);
                break;
            case 2:
                b0.f178864c.error("getCardUsageHistory failed: ", (Throwable) obj);
                com.garmin.feature.garminpay.providers.felica.ui.b view3 = b0Var.getView();
                int i15 = vq2.b.f179457y0;
                view3.J3(new b1(5));
                break;
            default:
                File file = (File) obj;
                Logger logger3 = b0.f178864c;
                b0Var.getView().hideProgressOverlay();
                com.garmin.feature.garminpay.providers.felica.ui.b view4 = b0Var.getView();
                file.getClass();
                view4.t7(file);
                break;
        }
        return Unit.INSTANCE;
    }
}
