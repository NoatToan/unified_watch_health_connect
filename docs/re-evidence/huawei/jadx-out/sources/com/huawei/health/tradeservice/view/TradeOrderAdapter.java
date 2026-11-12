package com.huawei.health.tradeservice.view;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.health.tradeservice.R;
import com.huawei.health.tradeservice.activity.TradeOrderDetailActivity;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.trade.datatype.OrderBriefInfo;
import com.huawei.trade.datatype.ProductResourceInfo;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.fua;
import defpackage.ily;
import defpackage.iov;
import defpackage.njy;
import defpackage.qqf;
import defpackage.qrs;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public class TradeOrderAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f10292a;
    private List<OrderBriefInfo> d;
    private Context e;

    public TradeOrderAdapter(Context context, List<OrderBriefInfo> list) {
        new ArrayList();
        this.e = context;
        this.d = list;
    }

    public void b(List<OrderBriefInfo> list, int i) {
        this.d = list;
        this.f10292a = i;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewInflate;
        if (qrs.u()) {
            viewInflate = LayoutInflater.from(this.e).inflate(R.layout.trade_order_item_large, viewGroup, false);
        } else {
            viewInflate = LayoutInflater.from(this.e).inflate(R.layout.trade_order_item, viewGroup, false);
        }
        return new ViewHolder(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        if (njy.e(this.d, i)) {
            LogUtil.j("TradeOrderAdapter", "mCurrentPlansList is null");
            return;
        }
        final OrderBriefInfo orderBriefInfo = this.d.get(i);
        a(viewHolder, orderBriefInfo);
        if (i == this.d.size() - 1) {
            viewHolder.e.setVisibility(8);
        }
        viewHolder.f10296c.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.tradeservice.view.TradeOrderAdapter.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ProductResourceInfo productInfo = orderBriefInfo.getProductInfo();
                Intent intent = new Intent(TradeOrderAdapter.this.e, (Class<?>) TradeOrderDetailActivity.class);
                intent.setFlags(268435456);
                intent.putExtra("orderCode", orderBriefInfo.getOrderCode());
                intent.putExtra("productId", productInfo.getProductId());
                if (TradeOrderAdapter.this.f10292a == 1) {
                    intent.putExtra("invoice", true);
                    TradeOrderAdapter.this.e.startActivity(intent);
                } else if (Utils.o() || !fua.n()) {
                    TradeOrderAdapter.this.e.startActivity(intent);
                } else {
                    iov.b(TradeOrderAdapter.this.e, ArkUIXConstants.ORDER_DETAIL, "23", orderBriefInfo.getOrderCode());
                }
            }
        });
    }

    private void a(ViewHolder viewHolder, OrderBriefInfo orderBriefInfo) {
        viewHolder.j.setText(String.format(this.e.getString(R.string.IDS_quantity), 1));
        ProductResourceInfo productInfo = orderBriefInfo.getProductInfo();
        viewHolder.f10295b.setText(productInfo.getProductName());
        qqf.a(productInfo.getProductUrl(), viewHolder.f, (int) BaseApplication.b().getResources().getDimension(com.huawei.ui.commonui.R.dimen.defaultCornerRadiusM));
        if (orderBriefInfo.getPrefMode() != 2 && orderBriefInfo.getPrefMode() != 4) {
            if (orderBriefInfo.getPrefMode() != 5) {
                viewHolder.i.setText(ily.c(orderBriefInfo.getCurrency(), orderBriefInfo.getPayPrice() / 1000000.0f));
            } else {
                viewHolder.i.setText(com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_portfolio_sales));
            }
        } else {
            viewHolder.i.setText(com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_redeemed));
        }
        LogUtil.a("TradeOrderAdapter", "orderBriefInfo.getGiveawaysExist = ", Integer.valueOf(orderBriefInfo.getGiveawaysExist()));
        if (orderBriefInfo.getGiveawaysExist() != 1 || !b(orderBriefInfo.getGiveawaysInfo())) {
            viewHolder.d.setVisibility(8);
        } else {
            viewHolder.d.setVisibility(0);
        }
    }

    private boolean b(List<ProductResourceInfo> list) {
        if (list == null || list.size() < 1) {
            return false;
        }
        Iterator<ProductResourceInfo> it = list.iterator();
        while (it.hasNext()) {
            if (!it.next().getShowGiveawayFlag()) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.d.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthTextView f10295b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private LinearLayout f10296c;
        private HealthTextView d;
        private HealthDivider e;
        private ImageView f;
        private HealthTextView i;
        private HealthTextView j;

        ViewHolder(View view) {
            super(view);
            this.i = (HealthTextView) view.findViewById(R.id.tv_show_price);
            this.f10295b = (HealthTextView) view.findViewById(R.id.tv_class_name);
            this.f = (ImageView) view.findViewById(R.id.img_goods);
            this.e = (HealthDivider) view.findViewById(R.id.divider);
            this.d = (HealthTextView) view.findViewById(R.id.tv_hava_giveaways);
            this.f10296c = (LinearLayout) view.findViewById(R.id.lin_content);
            this.j = (HealthTextView) view.findViewById(R.id.tv_show_quantity);
        }
    }
}
