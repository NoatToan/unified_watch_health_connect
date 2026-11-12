package com.huawei.health.tradeservice.view;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.health.tradeservice.R;
import com.huawei.health.tradeservice.cloud.OrderManager;
import com.huawei.hms.framework.network.download.internal.constants.ExceptionCode;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.trade.datatype.OrderBriefInfo;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.ilw;
import defpackage.njy;
import health.compact.a.CommonUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public class TradeOrderLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f10297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f10298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RelativeLayout f10299c;
    private Handler d;
    private RelativeLayout e;
    private RelativeLayout f;
    private int g;
    private List<OrderBriefInfo> h;
    private TradeOrderAdapter i;
    private HealthTextView j;
    private HealthRecycleView k;

    static class c extends BaseHandler<TradeOrderLayout> {
        c(TradeOrderLayout tradeOrderLayout) {
            super(tradeOrderLayout);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(TradeOrderLayout tradeOrderLayout, Message message) {
            int i = message.what;
            if (i == 1101) {
                tradeOrderLayout.b();
            } else if (i == 1102) {
                tradeOrderLayout.a();
            } else {
                LogUtil.j("TradeOrderLayout", "handleMessageWhenReferenceNotNull not match ");
            }
        }
    }

    public TradeOrderLayout(Context context, int i) {
        super(context);
        this.g = i;
        this.d = new c(this);
        e();
        c();
    }

    private void e() {
        LogUtil.a("TradeOrderLayout", "initView");
        this.k = (HealthRecycleView) LayoutInflater.from(BaseApplication.getContext()).inflate(R.layout.trade_order_layout, this).findViewById(R.id.trade_recyle_view);
        this.f10299c = (RelativeLayout) findViewById(R.id.rl_hint);
        this.f10298b = (ImageView) findViewById(R.id.img_hint);
        this.j = (HealthTextView) findViewById(R.id.tv_hint);
        this.e = (RelativeLayout) findViewById(R.id.rl_content);
        this.f = (RelativeLayout) findViewById(R.id.order_loading);
        this.i = new TradeOrderAdapter(BaseApplication.getContext(), new ArrayList());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(BaseApplication.getContext());
        linearLayoutManager.setOrientation(1);
        this.k.setLayoutManager(linearLayoutManager);
        this.k.setAdapter(this.i);
    }

    private void c() {
        if (!CommonUtil.ab(com.huawei.haf.application.BaseApplication.b())) {
            d();
        } else {
            OrderManager.orderQueryHistory(0L, System.currentTimeMillis(), 50L, new b(this));
            ilw.c().e("");
        }
    }

    static class b implements IBaseResponseCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<TradeOrderLayout> f10300b;

        b(TradeOrderLayout tradeOrderLayout) {
            this.f10300b = new WeakReference<>(tradeOrderLayout);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            TradeOrderLayout tradeOrderLayout = this.f10300b.get();
            if (tradeOrderLayout == null) {
                LogUtil.a("TradeOrderLayout", "layout is destroyed");
                return;
            }
            if (i != 0 || !(obj instanceof List)) {
                LogUtil.j("TradeOrderLayout", "orderQueryHistory fail errorCode = ", Integer.valueOf(i));
                tradeOrderLayout.f10297a = ExceptionCode.CHECK_FILE_SIZE_FAILED;
                tradeOrderLayout.d.sendEmptyMessage(1102);
                return;
            }
            LogUtil.j("TradeOrderLayout", "orderQueryHistory success");
            tradeOrderLayout.h = (List) obj;
            if (!njy.e(tradeOrderLayout.h)) {
                tradeOrderLayout.d.sendEmptyMessage(1101);
                return;
            }
            LogUtil.j("TradeOrderLayout", "mProductSummary = null");
            tradeOrderLayout.f10297a = ExceptionCode.CHECK_FILE_SIZE_FAILED;
            tradeOrderLayout.d.sendEmptyMessage(1102);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.i.b(this.h, this.g);
        this.f.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.f.setVisibility(8);
        this.e.setVisibility(8);
        this.f10299c.setVisibility(0);
        if (this.f10297a == 1105) {
            this.j.setText(BaseApplication.getContext().getString(R.string.IDS_hwh_privacy_no_data));
            this.f10298b.setImageResource(R.drawable.data_empty);
        } else {
            this.j.setText(BaseApplication.getContext().getString(R.string.IDS_update_network_error));
        }
    }

    private void d() {
        if (this.g == 0) {
            LogUtil.j("TradeOrderLayout", "net not ok");
        } else {
            a();
        }
    }
}
