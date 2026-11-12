package com.huawei.healthcloud.plugintrack.ui.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.activity.HorizontalDetailActivity;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.tablewidget.HealthTableWidget;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.jab;
import defpackage.jbp;
import defpackage.jmb;
import defpackage.jpj;
import defpackage.jpn;
import defpackage.njy;
import defpackage.qpv;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class PaceHorizontalFrag extends BaseFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f11051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CustomTitleBar f11052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f11053c;
    private HealthTableWidget d;
    private HealthColumnSystem e;
    private float[] g;
    private List<jbp> i;
    private jmb j;
    private View l;
    private qpv<jpj, jpn, jpn, jpn, jpn, jpn> h = new qpv<>();
    private int f = -1;

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (layoutInflater == null) {
            LogUtil.j("Track_PaceHorizontalFrag", "LayoutInflater not found.");
            return null;
        }
        LogUtil.a("Track_PaceHorizontalFrag", "onCreateView");
        FragmentActivity activity = getActivity();
        if (!(activity instanceof HorizontalDetailActivity)) {
            LogUtil.e("Track_PaceHorizontalFrag", "Object is not instanceof HorizontalDetailActivity");
            return null;
        }
        HorizontalDetailActivity horizontalDetailActivity = (HorizontalDetailActivity) activity;
        this.f11053c = horizontalDetailActivity;
        if (!a(horizontalDetailActivity)) {
            LogUtil.e("Track_PaceHorizontalFrag", "getData failed");
            horizontalDetailActivity.finish();
            return null;
        }
        View viewInflate = layoutInflater.inflate(R.layout.track_horizontal_segment_fragment, viewGroup, false);
        this.f11052b = (CustomTitleBar) viewInflate.findViewById(R.id.titlebar);
        this.d = (HealthTableWidget) viewInflate.findViewById(R.id.table_layout);
        this.l = viewInflate.findViewById(R.id.tips_layout);
        LogUtil.a("Track_PaceHorizontalFrag", "mFragmentTag = ", this.f11051a);
        this.f11052b.setTitleText(getResources().getString(R.string.IDS_hwh_motiontrack_running_pace_range));
        this.l.setVisibility(8);
        b();
        this.e = new HealthColumnSystem(this.f11053c);
        this.g = c();
        d();
        BaseActivity.cancelLayoutById(viewInflate, this.d);
        return viewInflate;
    }

    private float[] c() {
        return new float[]{63.75f, 62.25f, 68.5f, 71.75f, 65.0f, 65.25f, 58.25f, 61.5f, 61.5f, 77.0f, 70.5f, 70.5f, 70.5f};
    }

    private boolean a(HorizontalDetailActivity horizontalDetailActivity) {
        Intent intent = horizontalDetailActivity.getIntent();
        if (intent == null) {
            LogUtil.e("Track_PaceHorizontalFrag", "intent is null HorizontalDetailActivity");
            return false;
        }
        this.f = intent.getIntExtra(BleConstants.SPORT_TYPE, -1);
        String stringExtra = intent.getStringExtra("fragment_tag");
        this.f11051a = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            LogUtil.j("Track_PaceHorizontalFrag", "intent fragment tag error: ");
            return false;
        }
        int i = this.f;
        if (i == -1) {
            LogUtil.j("Track_PaceHorizontalFrag", "intent sportType paras error: ", Integer.valueOf(i));
            return false;
        }
        if ("pace".equals(this.f11051a)) {
            LogUtil.a("Track_PaceHorizontalFrag", "from PACE_TAG");
            List<jbp> listB = HeartRateFrag.b();
            this.i = listB;
            if (!njy.e(listB)) {
                return true;
            }
            LogUtil.j("Track_PaceHorizontalFrag", " mSpeedRangList data list is empty");
            return false;
        }
        LogUtil.j("Track_PaceHorizontalFrag", "mFragmentTag exception", this.f11051a);
        return false;
    }

    private void b() {
        e(this.i);
    }

    private void e(List<jbp> list) {
        if (!njy.b((Object) list, jbp.class)) {
            LogUtil.j("Track_PaceHorizontalFrag", "dataList is exception");
            return;
        }
        LogUtil.a("Track_PaceHorizontalFrag", "initRunningData");
        jab.a(this.h, list);
        for (int i = 5; i >= 1; i--) {
            jab.e(this.h, i, list);
        }
    }

    private void d() {
        jmb jmbVar = new jmb(this.f11053c, this.h, false, LanguageUtil.bo(this.f11053c) ? 38.5f : 0.0f) { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.PaceHorizontalFrag.4
            @Override // com.huawei.ui.commonui.tablewidget.BaseHealthTableAdapter, com.huawei.ui.commonui.tablewidget.HealthTableAdapter
            public int getColumnWidthValueType() {
                return 1;
            }

            @Override // defpackage.jmb, com.huawei.ui.commonui.tablewidget.HealthTableAdapter
            public int getColumnWidth(int i) {
                if (PaceHorizontalFrag.this.g == null || i < 0 || i >= PaceHorizontalFrag.this.g.length) {
                    return super.getColumnWidth(i);
                }
                return qrs.d(PaceHorizontalFrag.this.f11053c, PaceHorizontalFrag.this.g[i]);
            }

            @Override // defpackage.jmb, com.huawei.ui.commonui.tablewidget.BaseHealthTableAdapter, com.huawei.ui.commonui.tablewidget.HealthTableAdapter
            public int getColumnCount() {
                if (PaceHorizontalFrag.this.f != 258 || PaceHorizontalFrag.this.e.j() <= 4) {
                    return super.getColumnCount();
                }
                return Math.min(super.getColumnCount(), Math.min(11, PaceHorizontalFrag.this.i.size() + 1));
            }

            @Override // defpackage.jmb
            public int a() {
                return super.a();
            }
        };
        this.j = jmbVar;
        this.d.setAdapter(jmbVar);
    }
}
