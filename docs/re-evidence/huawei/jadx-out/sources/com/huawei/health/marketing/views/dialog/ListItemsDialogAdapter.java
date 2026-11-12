package com.huawei.health.marketing.views.dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.marketing.views.dialog.ListItemsDialogAdapter;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.servicesui.R;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import defpackage.gbc;
import defpackage.njy;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class ListItemsDialogAdapter extends RecyclerView.Adapter<ItemHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<gbc.b> f8454a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f8455c;

    public ListItemsDialogAdapter(Context context) {
        this.f8455c = context;
    }

    public void b(List<gbc.b> list) {
        this.f8454a.clear();
        if (njy.b(list)) {
            this.f8454a.addAll(list);
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public ItemHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ItemHolder(LayoutInflater.from(this.f8455c).inflate(R.layout.list_itmes_dialog_item_layout, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ItemHolder itemHolder, int i) {
        itemHolder.d(this.f8454a.get(i), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f8454a.size();
    }

    public class ItemHolder extends RecyclerView.ViewHolder {
        ImageView e;

        public ItemHolder(View view) {
            super(view);
            this.e = (ImageView) view.findViewById(R.id.background);
        }

        public void d(final gbc.b bVar, final int i) {
            this.e.setImageDrawable(bVar.d());
            if (bVar.e() != null) {
                this.itemView.setOnClickListener(new View.OnClickListener() { // from class: gbf
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        LoginInit.getInstance(BaseApplication.getContext()).browsingToLogin(new IBaseResponseCallback() { // from class: gbi
                            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                            /* JADX INFO: renamed from: onResponse */
                            public final void a(int i2, Object obj) {
                                ListItemsDialogAdapter.ItemHolder.a(bVar, i, i2, obj);
                            }
                        }, AnalyticsValue.MARKETING_RESOURCE.value());
                    }
                });
            }
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) this.itemView.getLayoutParams();
            if (i < ListItemsDialogAdapter.this.getItemCount() - 1) {
                layoutParams.bottomMargin = this.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.cardMarginMiddle);
            }
            if (i == ListItemsDialogAdapter.this.getItemCount() - 1) {
                layoutParams.bottomMargin = this.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.health_common_20dp);
            }
        }

        public static /* synthetic */ void a(gbc.b bVar, int i, int i2, Object obj) {
            if (i2 == 0) {
                MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
                if (marketRouterApi != null) {
                    marketRouterApi.router(bVar.e());
                    return;
                }
                return;
            }
            LogUtil.j("ListItemsDialogAdapter", "getViewClickListener errorCode = ", Integer.valueOf(i2), ", item positionId = ", Integer.valueOf(i));
        }
    }
}
