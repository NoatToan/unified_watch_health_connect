package com.huawei.health.device.ui.measure.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.radiobutton.HealthRadioButton;
import defpackage.dnj;
import defpackage.njy;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class WeightResultConfirmAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f6397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f6398c = -1;
    private int d = -1;
    private List<dnj> e;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public WeightResultConfirmAdapter(Context context, List<dnj> list) {
        this.e = list;
        this.f6397b = context;
    }

    public void a(List<dnj> list) {
        this.e = list;
        notifyDataSetChanged();
    }

    public void e(int i) {
        this.f6398c = i;
        this.d = i;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<dnj> list = this.e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (njy.e(this.e, i)) {
            LogUtil.j("PluginDevice_WeightResultConfrimAdapter", "getItem position error.");
            return null;
        }
        return this.e.get(i);
    }

    @Override // android.widget.Adapter
    public View getView(final int i, View view, ViewGroup viewGroup) {
        View viewInflate;
        b bVar;
        if (i < 0 || i >= this.e.size()) {
            LogUtil.j("PluginDevice_WeightResultConfrimAdapter", "getView position error.");
            return null;
        }
        if (view == null) {
            bVar = new b();
            viewInflate = LayoutInflater.from(this.f6397b).inflate(R.layout.weight_measure_result_confrim_dialog_list_item, (ViewGroup) null);
            bVar.f6399a = (HealthTextView) viewInflate.findViewById(R.id.weight_measure_reslut_confrim_item_user_text);
            bVar.f6400b = (HealthRadioButton) viewInflate.findViewById(R.id.weight_measure_reslut_confrim_item_radiobutton);
            viewInflate.setTag(bVar);
        } else {
            if (!(view.getTag() instanceof b)) {
                LogUtil.j("PluginDevice_WeightResultConfrimAdapter", "getView viewHolder is null.");
                return view;
            }
            viewInflate = view;
            bVar = (b) view.getTag();
        }
        if (this.f6398c == i) {
            bVar.f6399a.setText(this.f6397b.getString(R.string.IDS_hw_device_hygride_current_measure_user_tips, this.e.get(i).h()));
        } else {
            bVar.f6399a.setText(this.e.get(i).h());
        }
        bVar.f6400b.setOnClickListener(new View.OnClickListener() { // from class: duz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f32402b.b(i, view2);
            }
        });
        if (i != this.d) {
            bVar.f6400b.setButtonDrawable(R.drawable.hwradiobutton_unchecked_disable_bg);
            return viewInflate;
        }
        bVar.f6400b.setButtonDrawable(R.drawable.hwradiobutton_checked_bg);
        return viewInflate;
    }

    public /* synthetic */ void b(int i, View view) {
        if (this.d == i) {
            this.d = this.f6398c;
        } else {
            this.d = i;
        }
        notifyDataSetChanged();
    }

    public int c() {
        LogUtil.a("PluginDevice_WeightResultConfrimAdapter", "getSelectPosition mTempPosition:", Integer.valueOf(this.d));
        return this.d;
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthTextView f6399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthRadioButton f6400b;
    }
}
