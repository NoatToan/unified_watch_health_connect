package com.xiaomi.fitness.pay.page;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.mibi.sdk.component.Constants;
import com.mibi.sdk.component.OrderBean;
import com.mibi.sdk.payment.Payment;
import com.miui.tsmclientsdk.MiTsmConstants;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.pay.export.PaymentOrderType;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\"\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u000e\u001a\u00020\u0005H\u0016¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/pay/page/PaymentTranslucentActivity;", "Landroid/app/Activity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onActivityResult", AccountInteractActivity.KEY_REQUEST_CODE, "", "resultCode", "data", "Landroid/content/Intent;", "finish", "Companion", "pay_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PaymentTranslucentActivity extends Activity {
    public static final int DEDUCT_REQUEST_CODE = 2004;

    @NotNull
    public static final String ORDER_TYPE = "order_type";

    @NotNull
    public static final String PAYMENT_PARAMS = "payment_pamras";
    public static final int PAYMENT_REQUEST_CODE = 2003;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Map<String, Function2<Integer, Intent, Unit>> callbackMap = new LinkedHashMap();

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00052\u001a\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000e0\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R.\u0010\n\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000e0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/pay/page/PaymentTranslucentActivity$Companion;", "", "<init>", "()V", "PAYMENT_PARAMS", "", "ORDER_TYPE", "PAYMENT_REQUEST_CODE", "", "DEDUCT_REQUEST_CODE", "callbackMap", "", "Lkotlin/Function2;", "Landroid/content/Intent;", "", "startForActivityResult", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", Constants.KEY_ORDER_BEAN, "Lcom/mibi/sdk/component/OrderBean;", MiTsmConstants.KEY_ORDER_TYPE, "callback", "pay_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void startForActivityResult(@NotNull Activity activity, @NotNull OrderBean orderBean, @NotNull String orderType, @NotNull Function2<? super Integer, ? super Intent, Unit> callback) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(orderBean, "orderBean");
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            Intrinsics.checkNotNullParameter(callback, "callback");
            String strValueOf = String.valueOf(System.currentTimeMillis());
            PaymentTranslucentActivity.callbackMap.put(strValueOf, callback);
            Intent intent = new Intent(activity, (Class<?>) PaymentTranslucentActivity.class);
            intent.putExtra(PaymentTranslucentActivity.PAYMENT_PARAMS, orderBean);
            intent.putExtra(PaymentTranslucentActivity.ORDER_TYPE, orderType);
            intent.putExtra("request_id", strValueOf);
            activity.startActivity(intent);
        }
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Function2 function2 = (Function2) TypeIntrinsics.asMutableMap(callbackMap).remove(getIntent().getStringExtra("request_id"));
        if (function2 != null) {
            function2.invoke(Integer.valueOf(resultCode), data);
        }
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String stringExtra = getIntent().getStringExtra(ORDER_TYPE);
        OrderBean orderBean = (OrderBean) getIntent().getParcelableExtra(PAYMENT_PARAMS);
        if (Intrinsics.areEqual(stringExtra, PaymentOrderType.DEDUCT)) {
            Payment.signDeduct(this, 2004, orderBean);
        } else {
            Payment.pay(this, 2003, orderBean);
        }
    }
}
