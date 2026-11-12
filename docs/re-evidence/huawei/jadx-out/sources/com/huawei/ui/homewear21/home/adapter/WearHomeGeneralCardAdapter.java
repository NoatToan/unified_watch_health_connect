package com.huawei.ui.homewear21.home.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.homewear21.R;
import com.huawei.ui.homewear21.home.listener.WearHomeListener;
import defpackage.qsp;
import defpackage.tlf;
import health.compact.a.LanguageUtil;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class WearHomeGeneralCardAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WearHomeListener f26300c;
    private LayoutInflater d;
    private List<tlf> e;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i;
    }

    public WearHomeGeneralCardAdapter(Context context, List<tlf> list) {
        this.e = list;
        this.d = LayoutInflater.from(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new WearHomeGeneralCardViewHolder(this.d.inflate(R.layout.wear_home_general_card_layout, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        LogUtil.a("WearHomeGeneralCardAdapter", "onBindViewHolder mWearHomeGeneralBeans.size() = ", Integer.valueOf(this.e.size()));
        if (i < this.e.size() && (viewHolder instanceof WearHomeGeneralCardViewHolder)) {
            c((WearHomeGeneralCardViewHolder) viewHolder, i);
        }
    }

    private void c(WearHomeGeneralCardViewHolder wearHomeGeneralCardViewHolder, final int i) {
        tlf tlfVar = this.e.get(i);
        if (tlfVar.h()) {
            wearHomeGeneralCardViewHolder.g.setVisibility(0);
        } else {
            wearHomeGeneralCardViewHolder.g.setVisibility(8);
        }
        wearHomeGeneralCardViewHolder.f26301a.setText(tlfVar.e());
        if (TextUtils.isEmpty(tlfVar.c())) {
            wearHomeGeneralCardViewHolder.f26302b.setVisibility(8);
        } else {
            wearHomeGeneralCardViewHolder.f26302b.setVisibility(0);
            wearHomeGeneralCardViewHolder.f26302b.setText(tlfVar.c());
        }
        if (!TextUtils.isEmpty(tlfVar.a())) {
            wearHomeGeneralCardViewHolder.e.setVisibility(0);
            wearHomeGeneralCardViewHolder.e.setText(tlfVar.a());
        } else {
            wearHomeGeneralCardViewHolder.e.setVisibility(8);
        }
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            wearHomeGeneralCardViewHolder.d.setBackgroundResource(R.drawable.common_ui_arrow_left);
        } else {
            wearHomeGeneralCardViewHolder.d.setBackgroundResource(R.drawable.common_ui_arrow_right);
        }
        if (tlfVar.d() == 65 || tlfVar.d() == 55) {
            wearHomeGeneralCardViewHolder.f26303c.setEnabled(true);
            wearHomeGeneralCardViewHolder.f26303c.setAlpha(1.0f);
        } else {
            wearHomeGeneralCardViewHolder.f26303c.setEnabled(tlfVar.b());
            if (tlfVar.b()) {
                wearHomeGeneralCardViewHolder.f26303c.setAlpha(1.0f);
            } else {
                wearHomeGeneralCardViewHolder.f26303c.setAlpha(0.38f);
            }
        }
        wearHomeGeneralCardViewHolder.f26303c.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.homewear21.home.adapter.WearHomeGeneralCardAdapter.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (WearHomeGeneralCardAdapter.this.f26300c != null) {
                    WearHomeGeneralCardAdapter.this.f26300c.onItemClick(i);
                }
            }
        });
    }

    public void d(List<tlf> list) {
        this.e = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.e.size();
    }

    public void e(WearHomeListener wearHomeListener) {
        this.f26300c = wearHomeListener;
    }

    public static class WearHomeGeneralCardViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthTextView f26301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthTextView f26302b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        LinearLayout f26303c;
        ImageView d;
        HealthTextView e;
        View g;

        public WearHomeGeneralCardViewHolder(View view) {
            super(view);
            this.g = qsp.a(view, R.id.update_red_hot);
            this.f26303c = (LinearLayout) qsp.a(view, R.id.general_card);
            this.f26301a = (HealthTextView) qsp.a(view, R.id.description);
            this.f26302b = (HealthTextView) qsp.a(view, R.id.concretely_description);
            this.e = (HealthTextView) qsp.a(view, R.id.status);
            this.d = (ImageView) qsp.a(view, R.id.icon);
        }
    }
}
