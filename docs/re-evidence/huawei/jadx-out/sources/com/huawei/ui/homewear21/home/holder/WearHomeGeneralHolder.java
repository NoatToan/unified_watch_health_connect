package com.huawei.ui.homewear21.home.holder;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.homewear21.R;
import defpackage.qsp;

/* JADX INFO: loaded from: classes18.dex */
public class WearHomeGeneralHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthRecycleView f26329b;
    private LinearLayout d;

    public WearHomeGeneralHolder(View view) {
        super(view);
        this.d = (LinearLayout) qsp.a(view, R.id.home_general_layout);
        this.f26329b = (HealthRecycleView) qsp.a(view, R.id.general_list);
    }

    public HealthRecycleView c() {
        return this.f26329b;
    }

    public LinearLayout b() {
        return this.d;
    }
}
