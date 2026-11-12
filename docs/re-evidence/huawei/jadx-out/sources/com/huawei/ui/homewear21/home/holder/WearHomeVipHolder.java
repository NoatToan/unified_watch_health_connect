package com.huawei.ui.homewear21.home.holder;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.ui.homewear21.R;
import defpackage.qsp;

/* JADX INFO: loaded from: classes18.dex */
public class WearHomeVipHolder extends RecyclerView.ViewHolder {
    private LinearLayout d;

    public WearHomeVipHolder(View view) {
        super(view);
        if (view == null) {
            return;
        }
        this.d = (LinearLayout) qsp.a(view, R.id.vip_layout);
    }

    public LinearLayout d() {
        return this.d;
    }
}
