package com.huawei.sim.multisim.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.sim.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.radiobutton.HealthRadioButton;
import defpackage.pxk;
import health.compact.a.LanguageUtil;
import health.compact.a.Utils;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class EsimOpenMethodAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f23160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f23161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23162c = 0;
    private int d;
    private String e;
    private OnRadioButtonClickListener g;

    public interface OnRadioButtonClickListener {
        void onClick(int i, String str);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    public EsimOpenMethodAdapter(Context context, List<String> list, String str) {
        this.f23160a = context;
        this.f23161b = list;
        this.e = str;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<String> list = this.f23161b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        List<String> list = this.f23161b;
        if (list == null) {
            LogUtil.j("EsimOpenMethodAdapter", "getItem mOpenMethodList is null");
            return null;
        }
        if (i < 0 || i >= list.size()) {
            LogUtil.j("EsimOpenMethodAdapter", "getItem position is out of range");
            return null;
        }
        return this.f23161b.get(i);
    }

    public void c(OnRadioButtonClickListener onRadioButtonClickListener) {
        this.g = onRadioButtonClickListener;
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        e eVar = null;
        if (view == null) {
            e eVar2 = new e();
            View viewInflate = LayoutInflater.from(this.f23160a).inflate(R.layout.multi_sim_open_method_item, (ViewGroup) null);
            eVar2.f23165b = (LinearLayout) viewInflate.findViewById(R.id.open_method_item_layout);
            eVar2.e = (HealthTextView) viewInflate.findViewById(R.id.item_open_method_name);
            eVar2.d = (HealthTextView) viewInflate.findViewById(R.id.item_open_method_recommend);
            eVar2.f23166c = (HealthTextView) viewInflate.findViewById(R.id.item_open_method_tips);
            eVar2.f = (HealthRadioButton) viewInflate.findViewById(R.id.item_radio_button);
            eVar2.f23164a = viewInflate.findViewById(R.id.item_display_line);
            viewInflate.setTag(eVar2);
            eVar = eVar2;
            view = viewInflate;
        } else {
            Object tag = view.getTag();
            if (tag instanceof e) {
                eVar = (e) tag;
            }
        }
        if (eVar != null) {
            a(i, eVar);
            return view;
        }
        LogUtil.j("EsimOpenMethodAdapter", "getView() holder is null");
        return view;
    }

    private void a(final int i, e eVar) {
        List<String> list = this.f23161b;
        if (list == null) {
            LogUtil.j("EsimOpenMethodAdapter", "setViewContent mOpenMethodList is null");
            return;
        }
        if (i == list.size() - 1) {
            LogUtil.a("EsimOpenMethodAdapter", "setViewContent position = ", Integer.valueOf(i));
            eVar.f23164a.setVisibility(4);
        } else {
            eVar.f23164a.setVisibility(0);
        }
        c(i, eVar);
        if (this.g == null) {
            eVar.f23165b.setClickable(false);
        } else {
            eVar.f23165b.setClickable(true);
            eVar.f23165b.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.sim.multisim.adapter.EsimOpenMethodAdapter.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    EsimOpenMethodAdapter.this.f23162c = i;
                    if (EsimOpenMethodAdapter.this.g != null) {
                        int i2 = i;
                        if (i2 >= 0 && i2 < EsimOpenMethodAdapter.this.f23161b.size()) {
                            EsimOpenMethodAdapter.this.g.onClick(i, (String) EsimOpenMethodAdapter.this.f23161b.get(i));
                        } else {
                            LogUtil.j("EsimOpenMethodAdapter", "tempPosition is out of range");
                        }
                    }
                    EsimOpenMethodAdapter.this.notifyDataSetChanged();
                }
            });
        }
        eVar.f.setChecked(i == this.f23162c);
    }

    private void c(int i, e eVar) {
        if (i < 0 || i >= this.f23161b.size()) {
            LogUtil.j("EsimOpenMethodAdapter", "position is out of range");
            return;
        }
        String str = this.f23161b.get(i);
        eVar.d.setVisibility(8);
        LogUtil.a("EsimOpenMethodAdapter", "openMethod : ", str);
        if (str.equals(HiAnalyticsConstant.KeyAndValue.NUMBER_01)) {
            eVar.e.setText(R.string.IDS_plugin_multi_esim_open_by_code);
            if (!Utils.o()) {
                if (this.d == 2) {
                    eVar.d.setVisibility(8);
                    if (LanguageUtil.ba(this.f23160a)) {
                        eVar.d.setBackground(this.f23160a.getResources().getDrawable(R.drawable.bg_recommend_orange_right));
                    } else {
                        eVar.d.setBackground(this.f23160a.getResources().getDrawable(R.drawable.bg_recommend_orange_left));
                    }
                }
                eVar.e.setText(R.string.IDS_plugin_multi_esim_business_hall);
            }
            eVar.f23166c.setText(R.string.IDS_esim_hall_tips);
            return;
        }
        if (str.equals("06")) {
            eVar.e.setText(R.string.IDS_open_method_hw_download);
            eVar.f23166c.setText(R.string.IDS_open_method_hw_download_tips);
            return;
        }
        eVar.e.setText(R.string.IDS_open_method_hw_es);
        if (pxk.a(this.e)) {
            eVar.f23166c.setText(R.string.IDS_esim_app_tips);
        } else {
            eVar.f23166c.setText(R.string.IDS_esim_open_method_online_tips);
        }
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        View f23164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        LinearLayout f23165b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthTextView f23166c;
        HealthTextView d;
        HealthTextView e;
        HealthRadioButton f;

        e() {
        }
    }

    public void d(int i) {
        this.d = i;
    }
}
