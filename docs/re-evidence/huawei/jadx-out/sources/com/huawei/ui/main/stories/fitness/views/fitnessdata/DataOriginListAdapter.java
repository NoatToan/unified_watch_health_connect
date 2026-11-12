package com.huawei.ui.main.stories.fitness.views.fitnessdata;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.utils.FoundationCommonUtil;
import defpackage.lsm;
import defpackage.njy;
import defpackage.qrs;
import defpackage.uif;
import defpackage.ump;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class DataOriginListAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f27273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LayoutInflater f27274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<uif> f27275c = new ArrayList();
    private boolean e;

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthTextView f27276a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthTextView f27277b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthDivider f27278c;
        ImageView e;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        return i;
    }

    public void b(boolean z) {
        this.e = z;
    }

    public DataOriginListAdapter(Context context) {
        this.f27274b = LayoutInflater.from(context);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f27275c.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.f27275c.get(i);
    }

    public void c(List<uif> list) {
        this.f27275c.clear();
        if (njy.b(list)) {
            this.f27275c.addAll(list);
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        e eVar;
        uif uifVar = (uif) lsm.e(this.f27275c.get(i));
        if (view == null) {
            view = this.f27274b.inflate(R.layout.item_data_origin_listview, viewGroup, false);
            eVar = new e();
            eVar.e = (ImageView) view.findViewById(R.id.iv_data_type_icon);
            eVar.f27276a = (HealthTextView) view.findViewById(R.id.tv_data_origin_text);
            if (qrs.ac()) {
                eVar.f27276a.setTextSize(1, 30.0f);
            }
            eVar.f27278c = (HealthDivider) view.findViewById(R.id.data_origin_list_divider);
            eVar.f27277b = (HealthTextView) view.findViewById(R.id.tv_sum_text);
            view.setTag(eVar);
        } else {
            eVar = (e) view.getTag();
        }
        if (this.f27275c.size() > 0 && i == this.f27275c.size() - 1) {
            eVar.f27278c.setVisibility(8);
        } else {
            eVar.f27278c.setVisibility(0);
        }
        b(uifVar, eVar);
        return view;
    }

    private void b(uif uifVar, e eVar) {
        if (uifVar == null) {
            return;
        }
        LogUtil.a("DataOriginListAdapter", "setDataIcon dataType:", Integer.valueOf(uifVar.a()));
        a(uifVar, eVar);
        eVar.e.setBackgroundResource(ump.d(uifVar.a(), uifVar.c()));
        int iA = uifVar.a();
        if (iA != 32) {
            if (iA != 39 && iA != 41 && iA != 46 && iA != 51 && iA != 88 && iA != 395 && iA != 506 && iA != 35 && iA != 36) {
                switch (iA) {
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        e(uifVar, eVar);
                        break;
                }
                return;
            }
            c(uifVar, eVar);
            return;
        }
        if (uifVar.d() != null) {
            eVar.f27276a.setText(uifVar.d());
        } else {
            eVar.f27276a.setText(uifVar.c());
        }
    }

    private void a(uif uifVar, e eVar) {
        if ((uifVar.e() instanceof Boolean) && !d(uifVar)) {
            eVar.f27277b.setVisibility(0);
            if (((Boolean) uifVar.e()).booleanValue() && uifVar.a() != 32) {
                eVar.f27277b.setText(R.string.IDS_fitness_core_sleep_title);
                return;
            } else {
                eVar.f27277b.setText(R.string.IDS_sleep_data_source_normal_sleep);
                return;
            }
        }
        if (this.f27273a && d(uifVar.b())) {
            eVar.f27277b.setVisibility(0);
            eVar.f27277b.setText(R.string.IDS_fitness_step_device);
        } else if (this.e && uifVar.e() == null && uifVar.a() == 32) {
            eVar.f27277b.setVisibility(0);
            eVar.f27277b.setText(R.string.IDS_sleep_record_entry_title);
        } else {
            eVar.f27277b.setVisibility(8);
        }
    }

    private void e(uif uifVar, e eVar) {
        if (d(uifVar)) {
            eVar.f27276a.setText(R.string.IDS_manual_sleep_title);
        } else if (uifVar.c() != null) {
            eVar.f27276a.setText(uifVar.c());
        } else {
            eVar.f27276a.setText(R.string.IDS_hw_data_origin_unknow_device);
        }
    }

    private boolean d(uif uifVar) {
        return uifVar.b() != null && uifVar.b().equals("-1");
    }

    private void c(uif uifVar, e eVar) {
        if (uifVar.c() != null) {
            eVar.f27276a.setText(uifVar.c());
        } else {
            eVar.f27276a.setText(R.string.IDS_hw_data_origin_unknow_device);
        }
    }

    public void c(boolean z) {
        this.f27273a = z;
    }

    private boolean d(String str) {
        String androidId = FoundationCommonUtil.getAndroidId(BaseApplication.getContext());
        if (TextUtils.isEmpty(androidId)) {
            LogUtil.j("DataOriginListAdapter", "showStepSourceList isLocalDevice phoneId is error");
            return false;
        }
        return androidId.equals(str);
    }
}
