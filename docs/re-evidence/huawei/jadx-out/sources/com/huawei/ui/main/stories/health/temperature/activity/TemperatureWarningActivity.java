package com.huawei.ui.main.stories.health.temperature.activity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiTimeInterval;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.adapter.BaseGroupDataAdapter;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.listview.HealthExpandableListView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.toolbar.HealthToolBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.temperature.adapter.TemperatureWaringGroupDataAdapter;
import defpackage.njy;
import defpackage.qre;
import defpackage.vae;
import defpackage.vai;
import defpackage.vbk;
import defpackage.vbl;
import defpackage.vbr;
import health.compact.a.LanguageUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class TemperatureWarningActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TemperatureWaringGroupDataAdapter f28094a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthExpandableListView f28096c;
    private RelativeLayout d;
    private CustomTitleBar h;
    private HealthToolBar i;
    private boolean e = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f28095b = false;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_temperature_warning);
        f();
        a();
    }

    private void a() {
        vbk.c().c(new a(this));
    }

    private void f() {
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.title_bar);
        this.h = customTitleBar;
        customTitleBar.setTitleBarBackgroundColor(ContextCompat.getColor(this, R.color.transparent));
        this.d = (RelativeLayout) findViewById(R.id.temperature_warning_loading);
        this.f28096c = (HealthExpandableListView) findViewById(R.id.temperature_warning_exp_list);
        TemperatureWaringGroupDataAdapter temperatureWaringGroupDataAdapter = new TemperatureWaringGroupDataAdapter();
        this.f28094a = temperatureWaringGroupDataAdapter;
        this.f28096c.setAdapter(temperatureWaringGroupDataAdapter);
        this.f28094a.setOnLongClickListener(new BaseGroupDataAdapter.OnLongClickListener() { // from class: vah
            @Override // com.huawei.ui.commonui.adapter.BaseGroupDataAdapter.OnLongClickListener
            public final void onLongClickListener(int i, int i2) {
                this.f50856b.b(i, i2);
            }
        });
        this.f28094a.setOnCheckedChangeListener(new BaseGroupDataAdapter.OnCheckedChangeListener() { // from class: vaf
            @Override // com.huawei.ui.commonui.adapter.BaseGroupDataAdapter.OnCheckedChangeListener
            public final void onCheckedChanged(int i, int i2, boolean z) {
                this.f50854c.c(i, i2, z);
            }
        });
        this.i = (HealthToolBar) findViewById(R.id.temperature_tool_bar);
        h();
        i();
    }

    public /* synthetic */ void b(int i, int i2) {
        this.f28094a.switchCheckStatus(i, i2);
        vai child = this.f28094a.getChild(i, i2);
        if (child == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new HiTimeInterval(child.d(), child.e()));
        e(arrayList);
    }

    public /* synthetic */ void c(int i, int i2, boolean z) {
        c();
    }

    private void h() {
        this.h.setRightButtonDrawable(ContextCompat.getDrawable(this, R.drawable.ic_public_delete), qre.f(R.string.IDS_contact_delete));
        this.h.setRightButtonVisibility(0);
        this.h.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: uzv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f50839c.e(view);
            }
        });
        this.h.setRightButtonOnClickListener(new View.OnClickListener() { // from class: uzy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f50848c.b(view);
            }
        });
    }

    public /* synthetic */ void e(View view) {
        if (this.e) {
            b();
        } else {
            finish();
        }
    }

    public /* synthetic */ void b(View view) {
        d(true);
    }

    private void i() {
        View viewInflate = View.inflate(this, R.layout.hw_toolbar_bottomview, null);
        viewInflate.setBackgroundColor(ContextCompat.getColor(this, R.color.health_chart_extend_background_color));
        this.i.d(viewInflate);
        this.i.setIcon(1, R.drawable.ic_public_delete);
        this.i.setIconTitle(1, getString(R.string.IDS_contact_delete));
        this.i.setIcon(2, R.drawable.ic_public_select_all);
        this.i.setIconTitle(2, getResources().getString(R.string.IDS_my_route_select_all));
        this.i.setOnSingleTapListener(new HealthToolBar.OnSingleTapListener() { // from class: vad
            @Override // com.huawei.ui.commonui.toolbar.HealthToolBar.OnSingleTapListener
            public final void onSingleTap(int i) {
                this.f50852a.b(i);
            }
        });
        this.i.setVisibility(8);
    }

    public /* synthetic */ void b(int i) {
        if (i == 1) {
            if (!this.e) {
                d(true);
                return;
            } else {
                d();
                return;
            }
        }
        if (i == 2) {
            a(!this.f28095b);
        } else {
            LogUtil.j("TemperatureWarningActivity", "initToolBar undefined type");
        }
    }

    private void d(boolean z) {
        this.e = z;
        if (z) {
            this.f28094a.setState(z ? 2 : 1);
            this.h.setTitleText(getString(R.string.IDS_hw_show_main_health_page_healthdata_selectNone));
            this.h.setLeftButtonDrawable(ContextCompat.getDrawable(this, R.drawable.hwappbarpattern_cancel), qre.f(R.string.accessibility_close));
            this.h.setRightButtonVisibility(8);
            this.i.setVisibility(0);
            return;
        }
        this.f28094a.setState(1);
        this.h.setTitleText(getString(R.string.IDS_temperature_warning));
        this.h.setRightButtonVisibility(0);
        this.i.setVisibility(8);
    }

    private void d() {
        List<vai> checkedList = this.f28094a.getCheckedList();
        if (njy.b(checkedList)) {
            ArrayList arrayList = new ArrayList();
            for (vai vaiVar : checkedList) {
                arrayList.add(new HiTimeInterval(vaiVar.d(), vaiVar.e()));
            }
            e(arrayList);
        }
    }

    public void e(final List<HiTimeInterval> list) {
        new NoTitleCustomAlertDialog.Builder(this).a(getString(R.string.IDS_hw_health_show_healthdata_delete)).a(getString(R.string.IDS_hw_health_show_common_dialog_ok_button), new View.OnClickListener() { // from class: uzz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.a(list, view);
            }
        }).d(getString(R.string.IDS_hw_health_show_common_dialog_cancle_button), new View.OnClickListener() { // from class: vac
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.d(view);
            }
        }).c().show();
    }

    public /* synthetic */ void a(List list, View view) {
        vbk.c().e(this, (List<HiTimeInterval>) list, new IBaseResponseCallback() { // from class: vaa
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f50849a.b(i, obj);
            }
        });
    }

    public /* synthetic */ void b(int i, Object obj) {
        runOnUiThread(new Runnable() { // from class: vag
            @Override // java.lang.Runnable
            public final void run() {
                this.f50855c.e();
            }
        });
    }

    public /* synthetic */ void e() {
        this.f28094a.updateDataWithRemoveChecked();
        b();
        if (this.f28094a.getGroupCount() == 0) {
            vbl.a(false);
            finish();
        }
    }

    public /* synthetic */ void d(View view) {
        b();
    }

    private void a(boolean z) {
        int i;
        this.f28095b = z;
        if (z) {
            i = R.string.IDS_my_route_cancel_select_all;
        } else {
            i = R.string.IDS_my_route_select_all;
        }
        this.i.setIconTitle(2, getString(i));
        if (z) {
            this.i.setIcon(2, R.drawable.ic_public_deselect_all);
        } else {
            this.i.setIcon(2, R.drawable.ic_public_select_all);
        }
        this.f28094a.setAllChecked(z);
        c();
    }

    public void c() {
        if (!this.e) {
            this.h.setTitleText(getString(R.string.IDS_temperature_warning));
        }
        if (njy.e(this.f28094a.getCheckedList())) {
            this.h.setTitleText(getString(R.string.IDS_hw_show_main_health_page_healthdata_selectNone));
            return;
        }
        int checkedCount = this.f28094a.getCheckedCount();
        boolean z = checkedCount == this.f28094a.getTotalCount();
        this.h.setTitleText(getResources().getQuantityString(R.plurals.IDS_hw_weight_delete_check_measure_data, 0, Integer.valueOf(checkedCount)));
        this.i.setIcon(2, z ? R.drawable.ic_public_deselect_all : R.drawable.ic_public_select_all);
        this.i.setIconTitle(2, getString(z ? R.string.IDS_my_route_cancel_select_all : R.string.IDS_my_route_select_all));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.e) {
            b();
        } else {
            super.onBackPressed();
        }
    }

    private void b() {
        LogUtil.a("TemperatureWarningActivity", "cancelSelect");
        a(false);
        d(false);
        if (!LanguageUtil.ba(this)) {
            this.h.setLeftButtonDrawable(ContextCompat.getDrawable(this, R.drawable.health_navbar_back_selector), qre.f(R.string.accessibility_go_back));
        } else {
            this.h.setLeftButtonDrawable(ContextCompat.getDrawable(this, R.mipmap.ic_health_rtl_back_black), qre.f(R.string.accessibility_go_back));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final List<vae> list) {
        HandlerExecutor.b(new Runnable() { // from class: vab
            @Override // java.lang.Runnable
            public final void run() {
                this.f50850b.a(list);
            }
        });
    }

    public /* synthetic */ void a(List list) {
        if (njy.e(list)) {
            vbl.a(false);
            finish();
            return;
        }
        this.f28094a.refresh(list);
        this.d.setVisibility(8);
        this.f28096c.setVisibility(0);
        for (int i = 0; i < list.size(); i++) {
            this.f28096c.expandGroup(i);
        }
    }

    static class a implements IBaseResponseCallback {
        private final WeakReference<TemperatureWarningActivity> d;

        a(TemperatureWarningActivity temperatureWarningActivity) {
            this.d = new WeakReference<>(temperatureWarningActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            TemperatureWarningActivity temperatureWarningActivity = this.d.get();
            if (temperatureWarningActivity == null) {
                LogUtil.j("TemperatureWarningActivity", "getWarningData activity is null");
                return;
            }
            if (i != 0) {
                LogUtil.j("TemperatureWarningActivity", "getWarningData is error");
            } else if (obj instanceof List) {
                List list = (List) obj;
                LogUtil.a("TemperatureWarningActivity", "getWarningData size: ", Integer.valueOf(list.size()));
                temperatureWarningActivity.c(vbr.c((List<HiHealthData>) list));
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
