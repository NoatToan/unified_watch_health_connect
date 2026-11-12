package com.huawei.ui.main.stories.history.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.bundle.extension.ComponentInfo;
import com.huawei.healthcloud.plugintrack.ui.sporttypeconfig.bean.HwSportDataStaticsInfo;
import com.huawei.healthcloud.plugintrack.ui.sporttypeconfig.bean.HwSportTypeInfo;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import defpackage.jry;
import defpackage.njy;
import defpackage.vrf;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class DivingDataAdapter extends RecyclerView.Adapter<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f28274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<vrf> f28275b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f28276c;
    private OnItemClickListener e;

    public interface OnItemClickListener {
        void onItemClick(int i);
    }

    public DivingDataAdapter(Context context, int i) {
        this.f28276c = context;
        this.f28274a = i;
        a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public e onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(this.f28276c).inflate(R.layout.item_diving_data, viewGroup, false);
        if (i == 0 && (viewInflate.getLayoutParams() instanceof RecyclerView.LayoutParams)) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) viewInflate.getLayoutParams();
            layoutParams.setMarginStart(viewInflate.getContext().getResources().getDimensionPixelSize(R.dimen.emui_dimens_default_start));
            viewInflate.setLayoutParams(layoutParams);
        }
        return new e(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(e eVar, final int i) {
        if (njy.c(this.f28275b, i)) {
            eVar.f28279b.setText(this.f28275b.get(i).e());
            d(eVar, i);
            b(eVar, i);
            eVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.history.adapter.DivingDataAdapter.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (DivingDataAdapter.this.e != null) {
                        LogUtil.a("Track_DivingDataAdapter", "onClick position is ", Integer.valueOf(i));
                        DivingDataAdapter.this.e.onItemClick(i);
                    }
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f28275b.size();
    }

    private void d(e eVar, int i) {
        double dA = this.f28275b.get(i).a() / 60.0d;
        if (Math.abs(dA) < 1.0E-10d) {
            eVar.e.setText("- -");
        } else {
            eVar.e.setText(UnitUtil.e(dA, 1, 2));
        }
        eVar.f.setText(this.f28276c.getString(R.string.IDS_diving_duration));
        eVar.f28278a.setText(this.f28276c.getString(R.string.IDS_motiontrack_detail_fm_heart_min));
    }

    private void b(e eVar, int i) {
        LogUtil.a("Track_DivingDataAdapter", "init color position = ", Integer.valueOf(i), ", color = ", Integer.valueOf(this.f28275b.get(i).b()));
        if (this.f28275b.get(i).c()) {
            this.f28274a = i;
            eVar.f28279b.setTextColor(ContextCompat.getColor(this.f28276c, R.color.textColorPrimaryInverse));
            eVar.e.setTextColor(ContextCompat.getColor(this.f28276c, R.color.textColorPrimaryInverse));
            eVar.f.setTextColor(ContextCompat.getColor(this.f28276c, R.color.textColorPrimaryInverse));
            eVar.f28278a.setTextColor(ContextCompat.getColor(this.f28276c, R.color.textColorPrimaryInverse));
            eVar.d.setCardBackgroundColor(this.f28276c.getColor(this.f28275b.get(i).b()));
            return;
        }
        eVar.f28279b.setTextColor(ContextCompat.getColor(this.f28276c, R.color.textColorPrimary));
        eVar.e.setTextColor(ContextCompat.getColor(this.f28276c, R.color.textColorPrimary));
        eVar.f.setTextColor(ContextCompat.getColor(this.f28276c, R.color.textColorPrimary));
        eVar.f28278a.setTextColor(ContextCompat.getColor(this.f28276c, R.color.textColorPrimary));
        eVar.d.setCardBackgroundColor(this.f28276c.getColor(R.color.colorCardPanelBg));
    }

    private void a() {
        vrf vrfVar = new vrf(this.f28276c.getString(R.string.IDS_freediving_tip), 0.0d, this.f28274a == 0, R.color.track_duration_color);
        vrf vrfVar2 = new vrf(this.f28276c.getString(R.string.IDS_scuba_diving), 0.0d, this.f28274a == 1, R.color.track_duration_color);
        this.f28275b.add(vrfVar);
        this.f28275b.add(vrfVar2);
    }

    public void e(int i, List<HiHealthData> list, List<HiHealthData> list2) {
        if (njy.e(this.f28275b, this.f28274a) || njy.e(this.f28275b, i)) {
            LogUtil.j("Track_DivingDataAdapter", "mIndex or cardPosition is out of bound");
            return;
        }
        int i2 = this.f28274a;
        if (i != i2) {
            this.f28275b.get(i2).d(false);
        }
        this.f28275b.get(i).d(true);
        a(list, list2);
        notifyDataSetChanged();
    }

    private void a(List<HiHealthData> list, List<HiHealthData> list2) {
        this.f28275b.get(0).d(d(287, list));
        this.f28275b.get(1).d(d(ComponentInfo.PluginPay_A_N, list2));
    }

    private double d(int i, List<HiHealthData> list) {
        double d = 0.0d;
        if (njy.e(list)) {
            LogUtil.j("Track_DivingDataAdapter", "sportDataStatics is null with ", Integer.valueOf(i));
            return 0.0d;
        }
        HwSportTypeInfo hwSportTypeInfoB = jry.a(BaseApplication.b()).b(i);
        if (hwSportTypeInfoB == null) {
            LogUtil.j("Track_DivingDataAdapter", "hwSportTypeInfo is null");
            return 0.0d;
        }
        List<HwSportDataStaticsInfo> sportDataStatics = hwSportTypeInfoB.getSportDataStatics();
        if (njy.e(sportDataStatics)) {
            LogUtil.j("Track_DivingDataAdapter", "sportDataStaticsList is empty ", Integer.valueOf(i));
            return 0.0d;
        }
        HwSportDataStaticsInfo hwSportDataStaticsInfo = sportDataStatics.get(0);
        if (hwSportDataStaticsInfo == null) {
            LogUtil.j("Track_DivingDataAdapter", "sportDataStatics is null with ", Integer.valueOf(i));
            return 0.0d;
        }
        for (Map.Entry<String, String> entry : hwSportDataStaticsInfo.getItemDataTypeStringMap().entrySet()) {
            if (entry.getKey() != null && entry.getValue().equals("Track_Diving_Duration_Sum")) {
                for (HiHealthData hiHealthData : list) {
                    if (hiHealthData != null) {
                        d += hiHealthData.getDouble(entry.getValue());
                    }
                }
            }
        }
        return d;
    }

    public void c(OnItemClickListener onItemClickListener) {
        this.e = onItemClickListener;
    }

    class e extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthTextView f28278a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthTextView f28279b;
        private HealthCardView d;
        private HealthTextView e;
        private HealthTextView f;

        e(View view) {
            super(view);
            this.d = (HealthCardView) view.findViewById(R.id.item_diving_data_card);
            this.f28279b = (HealthTextView) view.findViewById(R.id.diving_card_item_string);
            this.f = (HealthTextView) view.findViewById(R.id.diving_card_item_value_name);
            this.e = (HealthTextView) view.findViewById(R.id.diving_card_item_value);
            this.f28278a = (HealthTextView) view.findViewById(R.id.diving_card_item_unit);
        }
    }
}
