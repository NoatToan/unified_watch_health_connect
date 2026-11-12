package eo2;

import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.x1;
import ap2.h;
import aq2.j;
import com.garmin.feature.garminpay.providers.gpay.ecom.EcomMainActivity;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f64786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EcomMainActivity f64787b;

    public /* synthetic */ a(EcomMainActivity ecomMainActivity, int i14) {
        this.f64786a = i14;
        this.f64787b = ecomMainActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f64786a;
        EcomMainActivity ecomMainActivity = this.f64787b;
        switch (i14) {
            case 0:
                EcomMainActivity.a aVar = EcomMainActivity.f51133k;
                return (com.garmin.feature.garminpay.providers.gpay.ui.common.a) new x1(ecomMainActivity).b(s0.f105811a.b(com.garmin.feature.garminpay.providers.gpay.ui.common.a.class));
            case 1:
                EcomMainActivity.a aVar2 = EcomMainActivity.f51133k;
                return (h) new x1(ecomMainActivity).b(s0.f105811a.b(h.class));
            case 2:
                EcomMainActivity.a aVar3 = EcomMainActivity.f51133k;
                j jVar = j.f12491a;
                kj0.b.f104940a.getClass();
                zi2.a aVarA = kj0.b.a();
                jVar.getClass();
                ecomMainActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(j.c(aVarA))));
                wr2.j.f186862a.getClass();
                wr2.j.b("EcomMainActivity.showMaintenanceAlertDialog(), positiveAction");
                d.f64794a.getClass();
                d.c(ecomMainActivity);
                return Unit.INSTANCE;
            default:
                EcomMainActivity.a aVar4 = EcomMainActivity.f51133k;
                wr2.j.f186862a.getClass();
                wr2.j.b("EcomMainActivity.showMaintenanceAlertDialog(), negativeAction");
                d.f64794a.getClass();
                d.c(ecomMainActivity);
                return Unit.INSTANCE;
        }
    }
}
