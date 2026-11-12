package com.huawei.ui.homewear21.home.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.homewear21.R;
import defpackage.qsp;
import defpackage.tlh;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class WearHomeDeviceInfoAdapter extends RecyclerView.Adapter<DeviceInfoViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<tlh> f26276a;
    private Context d;

    public WearHomeDeviceInfoAdapter(Context context, List<tlh> list) {
        this.d = context;
        this.f26276a = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DeviceInfoViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new DeviceInfoViewHolder(LayoutInflater.from(this.d).inflate(R.layout.acticity_device_info_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(DeviceInfoViewHolder deviceInfoViewHolder, int i) {
        if (i >= this.f26276a.size()) {
            return;
        }
        if (i == this.f26276a.size() - 1) {
            deviceInfoViewHolder.d.setVisibility(8);
        } else {
            deviceInfoViewHolder.d.setVisibility(0);
        }
        tlh tlhVar = this.f26276a.get(i);
        deviceInfoViewHolder.e.setText(tlhVar.b());
        deviceInfoViewHolder.f26277a.setText(tlhVar.a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.f26276a.size() > 0) {
            return this.f26276a.size();
        }
        return 0;
    }

    public static class DeviceInfoViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthTextView f26277a;
        private HealthDivider d;
        private HealthTextView e;

        DeviceInfoViewHolder(View view) {
            super(view);
            this.d = (HealthDivider) qsp.a(view, R.id.device_info_divider);
            this.e = (HealthTextView) qsp.a(view, R.id.device_info_basic_key);
            this.f26277a = (HealthTextView) qsp.a(view, R.id.device_info_basic_value);
        }
    }
}
