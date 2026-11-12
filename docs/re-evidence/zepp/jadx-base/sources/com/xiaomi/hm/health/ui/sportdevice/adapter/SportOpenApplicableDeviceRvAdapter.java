package com.xiaomi.hm.health.ui.sportdevice.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.HMDeviceUtils;
import com.xiaomi.hm.health.ui.sportdevice.utils.SportOpenDeviceUtil;
import com.xiaomi.hm.health.ui.sportdevice.view.AutoLineFeedLayout;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class SportOpenApplicableDeviceRvAdapter extends RecyclerView.Adapter<a> implements View.OnClickListener {
    private Context a;
    private int b;
    private List<HMDeviceSource> c;
    private List<HMDeviceSource> d;
    private OnOpenedDeviceChangeListener e;
    private OnDeviceSupportSportAnalysisTagClickListener f;
    private HMDeviceManager g = HMDeviceManager.getInstance();

    public interface OnDeviceSupportSportAnalysisTagClickListener {
        void onAnalysisTagClick(int sportAnalysisType);
    }

    public interface OnOpenedDeviceChangeListener {
        void onOpenedChange(int position, boolean isOpened);
    }

    public class a extends RecyclerView.ViewHolder {
        private ImageView a;
        private TextView b;
        private AutoLineFeedLayout c;
        private TextView d;
        private SwitchCompat e;

        public a(View itemView) {
            super(itemView);
            this.a = (ImageView) itemView.findViewById(R.id.device_drawing);
            this.b = (TextView) itemView.findViewById(R.id.device_name);
            this.c = (AutoLineFeedLayout) itemView.findViewById(R.id.sport_device_support_analysis_type_container);
            this.d = (TextView) itemView.findViewById(R.id.device_connect_status);
            this.e = (SwitchCompat) itemView.findViewById(R.id.device_open_switch);
        }
    }

    public SportOpenApplicableDeviceRvAdapter(Context context, int currentSportType) {
        this.a = context;
        this.b = currentSportType;
    }

    private TextView b(int analysisTypeValue) {
        TextView textView = new TextView(this.a);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        textView.setTextColor(this.a.getResources().getColor(R.color.s2));
        textView.setBackgroundResource(R.drawable.sport_device_support_analysis_type_bg);
        int i = 1;
        textView.setTextSize(1, 12.0f);
        textView.setText(this.a.getText(analysisTypeValue));
        textView.setGravity(17);
        textView.setLayoutParams(layoutParams);
        if (analysisTypeValue == R.string.heart_rate_analyze) {
            i = 0;
        } else if (analysisTypeValue != R.string.pose_analyze) {
            i = analysisTypeValue == R.string.running_result_analyze ? 2 : -1;
        }
        textView.setTag(Integer.valueOf(i));
        textView.setOnClickListener(this);
        return textView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(int i, CompoundButton compoundButton, boolean z) {
        OnOpenedDeviceChangeListener onOpenedDeviceChangeListener = this.e;
        if (onOpenedDeviceChangeListener != null) {
            onOpenedDeviceChangeListener.onOpenedChange(i, z);
        }
    }

    private void d(AutoLineFeedLayout sportDeviceSupportAnalysisTypeContainer, List<Integer> sportDeviceSupportAnalysisArr) {
        if (sportDeviceSupportAnalysisArr == null || sportDeviceSupportAnalysisArr.size() == 0) {
            return;
        }
        sportDeviceSupportAnalysisTypeContainer.removeAllViews();
        Iterator<Integer> it2 = sportDeviceSupportAnalysisArr.iterator();
        while (it2.hasNext()) {
            sportDeviceSupportAnalysisTypeContainer.addView(b(it2.next().intValue()));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getA() {
        List<HMDeviceSource> list = this.c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f.onAnalysisTagClick(((Integer) view.getTag()).intValue());
    }

    public void setCanOpenDeviceList(List<HMDeviceSource> canOpenDeviceList) {
        this.c = canOpenDeviceList;
    }

    public void setHaveOpenedDeviceList(List<HMDeviceSource> haveOpenedDeviceList) {
        this.d = haveOpenedDeviceList;
    }

    public void setOnDeviceSupportSportAnalysisTagClickListener(OnDeviceSupportSportAnalysisTagClickListener onDeviceSupportSportAnalysisTagClickListener) {
        this.f = onDeviceSupportSportAnalysisTagClickListener;
    }

    public void setOnOpenedDeviceChangeListener(OnOpenedDeviceChangeListener onOpenedDeviceChangeListener) {
        this.e = onOpenedDeviceChangeListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull a holder, final int position) {
        HMDeviceSource hMDeviceSource = this.c.get(position);
        holder.b.setText(HMDeviceUtils.getDeviceDescription(this.a, hMDeviceSource, (String) null));
        holder.a.setBackgroundResource(SportOpenDeviceUtil.getDeviceIconResourceId(hMDeviceSource));
        holder.d.setText(this.g.isConnected(hMDeviceSource.getType()) ? R.string.add_devices_isconnect : R.string.add_devices_connecting);
        d(holder.c, SportOpenDeviceUtil.getDeviceSupportSpecifiedSportTypeAllAnalysisTypeCollection(hMDeviceSource, this.b));
        if (this.d.contains(hMDeviceSource)) {
            holder.e.setChecked(true);
        } else {
            holder.e.setChecked(false);
        }
        holder.e.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: pb7
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.a.c(position, compoundButton, z);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public a onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new a(LayoutInflater.from(this.a).inflate(R.layout.sport_open_device_item_device_info, parent, false));
    }
}
