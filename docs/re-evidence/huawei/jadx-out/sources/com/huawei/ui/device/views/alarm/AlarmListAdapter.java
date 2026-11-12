package com.huawei.ui.device.views.alarm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.device.R;
import defpackage.lrd;
import defpackage.qre;
import defpackage.rfo;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class AlarmListAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f24987b;
    private OnAlarmSwitchClickListener d;
    private LayoutInflater e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<rfo> f24988c = new ArrayList(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View.OnClickListener f24986a = new View.OnClickListener() { // from class: com.huawei.ui.device.views.alarm.AlarmListAdapter.2
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (AlarmListAdapter.this.d != null) {
                AlarmListAdapter.this.d.onAlarmSwitchClick(view);
            }
        }
    };

    public interface OnAlarmSwitchClickListener {
        void onAlarmSwitchClick(View view);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }

    public AlarmListAdapter(Context context, List<rfo> list) {
        this.f24987b = null;
        this.f24987b = context;
        if (context != null) {
            LogUtil.a("AlarmListAdapter", "mContext != null");
        }
        e(list);
        this.e = LayoutInflater.from(context);
    }

    private void e(List<rfo> list) {
        this.f24988c.clear();
        this.f24988c.addAll(list);
    }

    public void c(List<rfo> list) {
        this.f24988c.clear();
        this.f24988c.addAll(list);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f24988c.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (i < 0 || i >= this.f24988c.size()) {
            return null;
        }
        return this.f24988c.get(i);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        rfo rfoVar = getItem(i) instanceof rfo ? (rfo) getItem(i) : null;
        if (rfoVar != null) {
            return rfoVar.g();
        }
        return -1;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        rfo rfoVar;
        int iG;
        if (i >= 0 && i < this.f24988c.size() && (iG = (rfoVar = this.f24988c.get(i)).g()) != 0) {
            if (iG != 1) {
                LogUtil.a("AlarmListAdapter", "unknow type");
                return view;
            }
            LogUtil.a("AlarmListAdapter", "view", view);
            if (view == null) {
                view = this.e.inflate(R.layout.activity_alarm_list_item_black, (ViewGroup) null);
                BaseActivity.setViewSafeRegion(false, (LinearLayout) view.findViewById(R.id.event_alarm_linear_layout));
            }
            c(i, view, rfoVar);
        }
        return view;
    }

    private void c(int i, View view, rfo rfoVar) {
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.alarm_time);
        HealthTextView healthTextView2 = (HealthTextView) view.findViewById(R.id.alarm_content);
        HealthTextView healthTextView3 = (HealthTextView) view.findViewById(R.id.alarm_repeat);
        HealthSwitchButton healthSwitchButton = (HealthSwitchButton) view.findViewById(R.id.event_alarm_switch_btn);
        if (rfoVar.c() == 0) {
            healthSwitchButton.setChecked(false);
            lrd.a((View) healthSwitchButton, (CharSequence) qre.f(R.string.IDS_status_disabled), true);
        } else if (rfoVar.c() == 1) {
            healthSwitchButton.setChecked(true);
            lrd.a((View) healthSwitchButton, (CharSequence) qre.f(R.string.IDS_status_enabled), true);
        } else {
            LogUtil.a("AlarmListAdapter", "setItemStyle unknow type");
        }
        healthSwitchButton.setTag(Integer.valueOf(i));
        if (rfoVar.h() != null) {
            healthTextView.setText(rfoVar.h());
            healthTextView.setVisibility(0);
        } else {
            healthTextView.setVisibility(8);
        }
        if (LanguageUtil.ba(this.f24987b)) {
            if (rfoVar.e() != null) {
                healthTextView2.setText(rfoVar.e());
                healthTextView2.setVisibility(0);
            } else {
                healthTextView2.setVisibility(8);
            }
            if (rfoVar.d() != null) {
                healthTextView3.setText(rfoVar.d());
                healthTextView3.setVisibility(0);
            } else {
                healthTextView3.setVisibility(8);
            }
        } else {
            if (rfoVar.e() != null && rfoVar.d() != null) {
                if (rfoVar.a() == 1 && LanguageUtil.l(this.f24987b)) {
                    healthTextView2.setText(rfoVar.e() + "，" + this.f24987b.getResources().getString(R.string.IDS_legal_workdays));
                } else {
                    healthTextView2.setText(qre.a(com.huawei.health.servicesui.R.string.IDS_settings_alarm_comma, rfoVar.e(), rfoVar.d()));
                }
                healthTextView2.setVisibility(0);
            } else {
                healthTextView2.setVisibility(8);
            }
            healthTextView3.setVisibility(8);
        }
        healthSwitchButton.setOnClickListener(this.f24986a);
    }

    public void b(OnAlarmSwitchClickListener onAlarmSwitchClickListener) {
        this.d = onAlarmSwitchClickListener;
    }
}
