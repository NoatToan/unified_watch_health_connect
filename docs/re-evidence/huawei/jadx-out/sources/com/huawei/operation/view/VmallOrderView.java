package com.huawei.operation.view;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.operation.R;
import com.huawei.operation.activity.WebViewActivity;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes13.dex */
public class VmallOrderView extends LinearLayout {
    public static final String PATH_ADDRESS_MANAGEMENT = "/sc/address/index.html?targetRoute=AddressList&showheader=false";
    private static final String PATH_MY_COUPON = "/member/coupon";
    private static final String PATH_ORDER_MANAGEMENT = "/member/order?tagId=all";
    private String mVmallHost;

    public VmallOrderView(Context context) {
        this(context, null);
    }

    public VmallOrderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VmallOrderView(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        addView(View.inflate(context, R.layout.view_vmall_order, null));
        findViewById(R.id.ll_order_management).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.operation.view.VmallOrderView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m1638lambda$new$0$comhuaweioperationviewVmallOrderView(context, view);
            }
        });
        findViewById(R.id.ll_address_management).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.operation.view.VmallOrderView$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m1639lambda$new$1$comhuaweioperationviewVmallOrderView(context, view);
            }
        });
        findViewById(R.id.ll_my_coupon).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.operation.view.VmallOrderView$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m1640lambda$new$2$comhuaweioperationviewVmallOrderView(context, view);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$new$0$com-huawei-operation-view-VmallOrderView, reason: not valid java name */
    /* synthetic */ void m1638lambda$new$0$comhuaweioperationviewVmallOrderView(Context context, View view) {
        loadVmallUrl(context, PATH_ORDER_MANAGEMENT);
    }

    /* JADX INFO: renamed from: lambda$new$1$com-huawei-operation-view-VmallOrderView, reason: not valid java name */
    /* synthetic */ void m1639lambda$new$1$comhuaweioperationviewVmallOrderView(Context context, View view) {
        loadVmallUrl(context, PATH_ADDRESS_MANAGEMENT);
    }

    /* JADX INFO: renamed from: lambda$new$2$com-huawei-operation-view-VmallOrderView, reason: not valid java name */
    /* synthetic */ void m1640lambda$new$2$comhuaweioperationviewVmallOrderView(Context context, View view) {
        loadVmallUrl(context, PATH_MY_COUPON);
    }

    private void loadVmallUrl(Context context, String str) {
        if (TextUtils.isEmpty(this.mVmallHost)) {
            this.mVmallHost = GRSManager.c(context).getUrl("domainMVmall");
        }
        Intent intent = new Intent();
        intent.setClass(context, WebViewActivity.class);
        intent.putExtra("url", this.mVmallHost + str);
        context.startActivity(intent);
    }
}
