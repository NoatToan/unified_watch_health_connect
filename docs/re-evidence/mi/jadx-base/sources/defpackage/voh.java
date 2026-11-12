package defpackage;

import android.app.Activity;
import com.miui.tsmclient.sesdk.OrderData;
import com.xiaomi.fitness.nfc.bean.CardWrapper;

/* JADX INFO: loaded from: classes9.dex */
public class voh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b8r f37088b;

    public boolean a() {
        return this.f37087a == 2;
    }

    public void b(Activity activity, CardWrapper cardWrapper, OrderData.Order order) {
        b8r b8rVar = this.f37088b;
        if (b8rVar == null) {
            this.f37088b = new b8r(activity.getApplicationContext());
        } else {
            b8rVar.a();
        }
        vqg.d("PaySelector mCardName:" + cardWrapper.mCardName + " orderId:" + order.getOrderId());
        h6q.a(this.f37088b).b(activity, order.getPayString(), null);
        this.f37087a = 2;
    }
}
