package defpackage;

import android.os.Bundle;
import com.mibi.sdk.component.recharge.Recharge;
import com.mibi.sdk.mvp.IView;
import com.mibi.sdk.partner.task.RxCheckPartnerPayOrderTask;
import com.mibi.sdk.partner.task.RxGetPartnerRechargeTypeTask;

/* JADX INFO: loaded from: classes.dex */
public interface i9s extends IView {
    void a();

    void a(Bundle bundle);

    void a(boolean z);

    void c(int i, String str, Bundle bundle);

    void k(Recharge recharge);

    void m(RxCheckPartnerPayOrderTask.Result result, RxGetPartnerRechargeTypeTask.Result result2);
}
