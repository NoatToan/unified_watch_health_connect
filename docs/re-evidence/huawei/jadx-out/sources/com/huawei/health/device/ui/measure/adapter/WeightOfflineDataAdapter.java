package com.huawei.health.device.ui.measure.adapter;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CompoundButton;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.dso;
import defpackage.njy;
import health.compact.a.UnitUtil;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class WeightOfflineDataAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f6390c;
    private Handler e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<dso> f6389a = new ArrayList<>(10);
    private ArrayList<Boolean> d = new ArrayList<>(10);

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public WeightOfflineDataAdapter(Context context, ArrayList<dso> arrayList, Handler handler) {
        this.f6390c = context;
        this.f6389a.addAll(arrayList);
        this.e = handler;
    }

    public void a(ArrayList<dso> arrayList) {
        ArrayList<dso> arrayList2 = this.f6389a;
        if (arrayList2 == null || this.d == null) {
            LogUtil.a("WeightOfflineDataAdapter", "setData(), mList or mCheckList is null.");
            return;
        }
        arrayList2.clear();
        this.d.clear();
        this.f6389a.addAll(arrayList);
        ArrayList arrayList3 = new ArrayList(this.f6389a.size());
        for (int i = 0; i < this.f6389a.size(); i++) {
            arrayList3.add(false);
        }
        this.d.addAll(arrayList3);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<dso> arrayList = this.f6389a;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        ArrayList<dso> arrayList = this.f6389a;
        if (arrayList == null) {
            LogUtil.a("WeightOfflineDataAdapter", "getItem(), mList is null.");
            return null;
        }
        if (i < 0 || i > arrayList.size() - 1) {
            LogUtil.a("WeightOfflineDataAdapter", "getItem() Out of bounds exception... ");
            return null;
        }
        return this.f6389a.get(i);
    }

    @Override // android.widget.Adapter
    public View getView(final int i, View view, ViewGroup viewGroup) {
        View viewInflate;
        final c cVar;
        ArrayList<dso> arrayList = this.f6389a;
        if (arrayList == null || this.d == null) {
            LogUtil.a("WeightOfflineDataAdapter", "getView() mList or mCheckList is null.");
            return null;
        }
        boolean z = true;
        if (i <= arrayList.size() - 1 && i <= this.d.size() - 1) {
            z = false;
        }
        if (i < 0 || z) {
            LogUtil.a("WeightOfflineDataAdapter", "getView() position Out of bounds exception... ");
            return null;
        }
        if (view == null) {
            cVar = new c();
            viewInflate = LayoutInflater.from(this.f6390c).inflate(R.layout.weight_offline_data_sync_item, (ViewGroup) null);
            cVar.f6396c = (HealthTextView) viewInflate.findViewById(R.id.weight_offline_data_item_weight_value);
            cVar.f6394a = (HealthTextView) viewInflate.findViewById(R.id.weight_offline_data_item_measure_time);
            cVar.e = (HealthCheckBox) viewInflate.findViewById(R.id.weight_offline_data_list_checkbox);
            cVar.f6395b = (HealthDivider) viewInflate.findViewById(R.id.weight_conflict_list_divider);
            viewInflate.setTag(cVar);
        } else {
            Object tag = view.getTag();
            if (!(tag instanceof c)) {
                return view;
            }
            c cVar2 = (c) tag;
            viewInflate = view;
            cVar = cVar2;
        }
        cVar.f6394a.setText(this.f6390c.getResources().getString(R.string.IDS_device_measure_time, e(this.f6389a.get(i).getStartTime())));
        cVar.f6396c.setText(this.f6390c.getResources().getString(R.string.IDS_device_need_claim_weight_data, e(i)));
        cVar.e.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.health.device.ui.measure.adapter.WeightOfflineDataAdapter.5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                cVar.e.setChecked(z2);
                WeightOfflineDataAdapter.this.d.set(i, Boolean.valueOf(z2));
                Message messageObtain = Message.obtain();
                messageObtain.what = -1;
                messageObtain.obj = Boolean.valueOf(z2);
                WeightOfflineDataAdapter.this.e.sendMessage(messageObtain);
            }
        });
        cVar.e.setChecked(this.d.get(i).booleanValue());
        d(i, cVar);
        return viewInflate;
    }

    private String e(int i) {
        if (njy.e(this.f6389a, i)) {
            LogUtil.e("WeightOfflineDataAdapter", "getWeightValue isOutOfBounds true!");
            return "";
        }
        if (UnitUtil.f()) {
            return UnitUtil.e(UnitUtil.h(this.f6389a.get(i).getWeight()), 1, 1) + this.f6390c.getResources().getString(R.string.IDS_device_measure_weight_value_unit_eng);
        }
        return UnitUtil.e(this.f6389a.get(i).getWeight(), 1, 1) + this.f6390c.getResources().getString(R.string.IDS_device_measure_weight_value_unit);
    }

    private void d(int i, c cVar) {
        if (i == this.f6389a.size() - 1) {
            cVar.f6395b.setVisibility(8);
        } else {
            cVar.f6395b.setVisibility(0);
        }
    }

    public ArrayList<Boolean> e() {
        return this.d;
    }

    public int d() {
        ArrayList<Boolean> arrayList = this.d;
        int i = 0;
        if (arrayList != null && arrayList.size() != 0) {
            Iterator<Boolean> it = this.d.iterator();
            while (it.hasNext()) {
                if (it.next().booleanValue()) {
                    i++;
                }
            }
        }
        return i;
    }

    private String e(long j) {
        return new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), "yyyy-MM-dd")).format(Long.valueOf(j)) + " " + DateFormat.getTimeFormat(this.f6390c.getApplicationContext()).format(Long.valueOf(j));
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthTextView f6394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthDivider f6395b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthTextView f6396c;
        HealthCheckBox e;

        private c() {
        }
    }
}
