package com.huawei.ui.device.activity.donotdisturb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.device.R;
import com.huawei.uikit.hwsubheader.widget.HwSubHeader;

/* JADX INFO: loaded from: classes16.dex */
public class NoDisturbSettingSubHeaderAdapter extends HwSubHeader.SubHeaderRecyclerAdapter {
    private Context d;
    private int e;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 1;
    }

    @Override // com.huawei.uikit.hwsubheader.widget.HwSubHeader.SubHeaderRecyclerAdapter
    public int getItemType(int i) {
        return 1;
    }

    public NoDisturbSettingSubHeaderAdapter(Context context, int i) {
        this.d = context;
        this.e = i;
    }

    @Override // com.huawei.uikit.hwsubheader.widget.HwSubHeader.SubHeaderRecyclerAdapter
    public View getHeaderViewAsPos(int i, Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.hwsubhearder_alarm, (ViewGroup) null, false);
        onBindViewHolder(new HeaderHolder(viewInflate), i);
        return viewInflate;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new HeaderHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.hwsubhearder_alarm, viewGroup, false));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if ((viewHolder instanceof HeaderHolder) && this.e == 0) {
            ((HeaderHolder) viewHolder).f24324a.setText(this.d.getResources().getString(R.string.IDS_setting_disturb_desc_can_disturb_content));
        }
    }

    public static class HeaderHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthTextView f24324a;

        public HeaderHolder(View view) {
            super(view);
            this.f24324a = (HealthTextView) view.findViewById(R.id.heanth_data_subheader);
        }
    }
}
