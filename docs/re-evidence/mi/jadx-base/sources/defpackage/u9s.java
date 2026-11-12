package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.mibi.sdk.component.recharge.RechargeType;
import com.mibi.sdk.model.auth.OnCheckAuthErrorListener;
import com.mibi.sdk.mvp.IView;
import com.mibi.sdk.pay.task.RxAccountGetRechargeTypeTask;
import com.mibi.sdk.pay.task.RxStartAccountPaymentTask;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public interface u9s extends IView, OnCheckAuthErrorListener {
    void a();

    void a(Bundle bundle);

    void a(ArrayList<RechargeType> arrayList);

    void b(int i, String str, Throwable th);

    void h(int i, Bundle bundle);

    void i(RxStartAccountPaymentTask.Result result, RxAccountGetRechargeTypeTask.Result result2);

    void n(Intent intent);
}
