package com.huawei.ui.homewear21.home.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.homewear21.R;
import com.huawei.ui.homewear21.home.listener.WearHomeListener;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.tom;
import health.compact.a.LanguageUtil;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class WearHomeDataSyncAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<tom> f26269c;
    private WearHomeListener d;
    private Context e;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return 0;
    }

    public WearHomeDataSyncAdapter(Context context, List<tom> list) {
        this.e = context;
        this.f26269c = list;
    }

    public void c(WearHomeListener wearHomeListener) {
        this.d = wearHomeListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new DataSyncHolder(LayoutInflater.from(this.e).inflate(R.layout.activity_device_data_sync_image_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (i >= this.f26269c.size()) {
            LogUtil.j("WearHomeDataSyncAdapter", "onBindViewHolder position Out Of Bounds");
        } else if (!(viewHolder instanceof DataSyncHolder)) {
            LogUtil.j("WearHomeDataSyncAdapter", "onBindViewHolder viewHolder not instanceof DataSyncHolder");
        } else {
            b((DataSyncHolder) viewHolder, i);
        }
    }

    private void b(DataSyncHolder dataSyncHolder, final int i) {
        final tom tomVar = this.f26269c.get(i);
        dataSyncHolder.f26273a.setImageDrawable(tomVar.d());
        dataSyncHolder.d.setText(tomVar.a());
        if (LanguageUtil.ba(this.e)) {
            dataSyncHolder.e.setBackgroundResource(R.drawable.common_ui_arrow_left);
        } else {
            dataSyncHolder.e.setBackgroundResource(R.drawable.common_ui_arrow_right);
        }
        if (i == this.f26269c.size() - 1) {
            dataSyncHolder.f26275c.setVisibility(8);
        }
        if (tomVar.b()) {
            dataSyncHolder.e.setVisibility(8);
            dataSyncHolder.g.setVisibility(0);
            dataSyncHolder.g.setChecked(tomVar.c());
            dataSyncHolder.g.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.homewear21.home.adapter.WearHomeDataSyncAdapter.2
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    LogUtil.a("WearHomeDataSyncAdapter", "onCheckedChanged isChecked:", Boolean.valueOf(z));
                    tomVar.b(z);
                    if (WearHomeDataSyncAdapter.this.d != null) {
                        WearHomeDataSyncAdapter.this.d.onItemClick(i);
                    }
                }
            });
            return;
        }
        dataSyncHolder.e.setVisibility(0);
        dataSyncHolder.g.setVisibility(8);
        dataSyncHolder.f26274b.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.homewear21.home.adapter.WearHomeDataSyncAdapter.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (qrs.c(800) || WearHomeDataSyncAdapter.this.d == null) {
                    return;
                }
                WearHomeDataSyncAdapter.this.d.onItemClick(i);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f26269c.size();
    }

    public static class DataSyncHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ImageView f26273a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private RelativeLayout f26274b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private View f26275c;
        private HealthTextView d;
        private ImageView e;
        private HealthSwitchButton g;

        public DataSyncHolder(View view) {
            super(view);
            this.f26273a = (ImageView) qsp.a(view, R.id.data_sync_item_icon);
            this.f26274b = (RelativeLayout) qsp.a(view, R.id.data_sync_device_relative);
            this.d = (HealthTextView) qsp.a(view, R.id.data_sync_app_name);
            this.e = (ImageView) qsp.a(view, R.id.data_sync_arrow_icon);
            this.g = (HealthSwitchButton) qsp.a(view, R.id.data_sync_switch_button);
            this.f26275c = qsp.a(view, R.id.data_sync_item_line);
        }
    }
}
