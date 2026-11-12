package com.huawei.ui.main.stories.health.activity.healthdata;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.device.fatscale.multiusers.WeightDataManager;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataSourceFetchOption;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.HiTimeInterval;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataClientListener;
import com.huawei.hihealth.data.type.HiSyncType;
import com.huawei.hihealth.dictionary.utils.ProductMapParseUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.toolbar.HealthToolBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.adapter.WeightExpandableListViewAdapter;
import com.huawei.ui.main.stories.health.util.TrendFragmentCallback;
import defpackage.dnb;
import defpackage.dnj;
import defpackage.lrd;
import defpackage.njy;
import defpackage.qre;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.uwe;
import defpackage.uwf;
import defpackage.uwo;
import defpackage.vei;
import defpackage.wgr;
import defpackage.wgt;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class HealthDataHistoryActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthDataHistoryActivity f27453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private dnj f27454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f27455c;
    private List<dnb> d;
    private WeightExpandableListViewAdapter e;
    private ExpandableListView f;
    private boolean g;
    private uwe i;
    private b j;
    private HealthProgressBar k;
    private uwf l;
    private long p;
    private volatile long q;
    private View s;
    private CustomTitleBar t;
    private String u;
    private LinearLayout w;
    private HealthToolBar x;
    private LinearLayout y;
    private final List<dnb> m = new CopyOnWriteArrayList();
    private boolean n = false;
    private boolean o = false;
    private Handler h = new a(this);
    private HealthToolBar.OnSingleTapListener r = new HealthToolBar.OnSingleTapListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.HealthDataHistoryActivity.1
        @Override // com.huawei.ui.commonui.toolbar.HealthToolBar.OnSingleTapListener
        public void onSingleTap(int i) {
            if (i != 1) {
                if (i == 2) {
                    HealthDataHistoryActivity healthDataHistoryActivity = HealthDataHistoryActivity.this;
                    healthDataHistoryActivity.d(!healthDataHistoryActivity.n);
                    return;
                } else {
                    LogUtil.j("HealthWeight_HealthDataHistoryActivity", "unkonw click");
                    return;
                }
            }
            if (HealthDataHistoryActivity.this.x.a(2)) {
                if (HealthDataHistoryActivity.this.e.a() != 0) {
                    HealthDataHistoryActivity.this.e(true, 0);
                }
            } else if (HealthDataHistoryActivity.this.e.e() != 0) {
                HealthDataHistoryActivity.this.e(true);
                HealthDataHistoryActivity.this.a(false);
            }
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_health_data_history);
        this.f27453a = this;
        this.g = true;
        if (this.h != null) {
            this.i = new uwe(this, this.h);
        }
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        this.p = intent.getLongExtra("HealthDataHistory", 0L);
        this.f27454b = MultiUsersManager.INSTANCE.getCurrentUser();
        this.u = intent.getStringExtra(JsbMapKeyNames.H5_USER_ID);
        this.l = uwf.d();
        qrs.e();
        d();
        a();
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static class a extends BaseHandler<HealthDataHistoryActivity> {
        a(HealthDataHistoryActivity healthDataHistoryActivity) {
            super(healthDataHistoryActivity);
        }

        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(HealthDataHistoryActivity healthDataHistoryActivity, Message message) {
            LogUtil.a("HealthWeight_HealthDataHistoryActivity", "handleMessageWhenReferenceNotNull()");
            if (healthDataHistoryActivity == null || message == null) {
                LogUtil.j("HealthWeight_HealthDataHistoryActivity", "handleMessageWhenReferenceNotNull obj or msg is null");
                return;
            }
            if (message.what == -1) {
                healthDataHistoryActivity.b(((Boolean) message.obj).booleanValue());
                return;
            }
            if (message.what == 2) {
                dnj dnjVar = healthDataHistoryActivity.f27454b;
                List<dnb> list = healthDataHistoryActivity.d;
                if (dnjVar != null && list != null) {
                    WeightDataManager.INSTANCE.removeMapData(dnjVar.i(), list);
                }
                healthDataHistoryActivity.c(false);
                healthDataHistoryActivity.e(false);
                healthDataHistoryActivity.g();
                healthDataHistoryActivity.b();
                return;
            }
            if (message.what == 3) {
                View view = healthDataHistoryActivity.s;
                if (view != null) {
                    view.setVisibility(8);
                }
                ArrayList arrayList = (ArrayList) message.obj;
                if (njy.b(arrayList)) {
                    healthDataHistoryActivity.m.addAll(arrayList);
                }
                LinearLayout linearLayout = healthDataHistoryActivity.y;
                if (linearLayout != null) {
                    linearLayout.setVisibility(njy.b(healthDataHistoryActivity.m) ? 0 : 8);
                }
                LinearLayout linearLayout2 = healthDataHistoryActivity.w;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(njy.b(healthDataHistoryActivity.m) ? 8 : 0);
                }
                if (njy.e(healthDataHistoryActivity.m)) {
                    WeightExpandableListViewAdapter weightExpandableListViewAdapter = healthDataHistoryActivity.e;
                    if (weightExpandableListViewAdapter != null) {
                        weightExpandableListViewAdapter.a((ArrayList<String[]>) null, (ArrayList<List<dnb>>) null);
                        return;
                    }
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                healthDataHistoryActivity.d(healthDataHistoryActivity.m, arrayList4, arrayList2);
                healthDataHistoryActivity.e((ArrayList<String[]>) arrayList3, (ArrayList<List<dnb>>) arrayList4, arrayList2);
                LogUtil.a("HealthWeight_HealthDataHistoryActivity", "handleMessageWhenReferenceNotNull size ", Integer.valueOf(arrayList.size()), " hasMore", Boolean.valueOf(healthDataHistoryActivity.g));
                if (healthDataHistoryActivity.g) {
                    dnb dnbVar = (dnb) healthDataHistoryActivity.m.get(healthDataHistoryActivity.m.size() - 1);
                    healthDataHistoryActivity.a(dnbVar == null ? System.currentTimeMillis() : dnbVar.ax() - 1);
                    return;
                }
                return;
            }
            LogUtil.a("HealthWeight_HealthDataHistoryActivity", "Not get this message");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.x.a(2)) {
            return;
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.m.clear();
        this.s.setVisibility(0);
        this.d = null;
        this.q = System.currentTimeMillis();
        this.j = new b(this.q);
        a(System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setTimeRange(0L, j);
        hiAggregateOption.setGroupUnitType(0);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setSortOrder(1);
        hiAggregateOption.setCount(500);
        LogUtil.a("HealthWeight_HealthDataHistoryActivity", "initData endTime ", Long.valueOf(j));
        vei.d(this.f27454b, hiAggregateOption, this.j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(ArrayList<String[]> arrayList, ArrayList<List<dnb>> arrayList2, List<Double> list) {
        int size = arrayList2.size();
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            String[] strArr = new String[2];
            String strA = this.l.a(this.p);
            String strA2 = this.l.a(arrayList2.get(i2).get(0).ax());
            strArr[0] = strA2;
            if (strA.equals(strA2)) {
                i = i2;
                z = true;
            }
            int size2 = arrayList2.get(i2).size();
            if (size2 == 0) {
                LogUtil.j("HealthWeight_HealthDataHistoryActivity", "setItem daySize = 0");
            } else {
                strArr[1] = (list.get(i2).doubleValue() / ((double) size2)) + "";
                arrayList.add(strArr);
            }
        }
        this.e.a(arrayList, arrayList2);
        if (z) {
            this.f.expandGroup(i);
            this.f.smoothScrollToPositionFromTop(i, 0);
        } else {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                this.f.expandGroup(i3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<dnb> list, List<List<dnb>> list2, List<Double> list3) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            dnb dnbVar = list.get(i);
            if (dnbVar != null) {
                String strA = this.l.a(dnbVar.ax());
                if (arrayList.contains(strA)) {
                    int iIndexOf = arrayList.indexOf(strA);
                    e(dnbVar, list2.get(iIndexOf));
                    list3.set(iIndexOf, Double.valueOf(list3.get(iIndexOf).doubleValue() + dnbVar.av()));
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(list.get(i));
                    arrayList.add(strA);
                    list2.add(arrayList2);
                    list3.add(Double.valueOf(dnbVar.av()));
                }
            }
        }
    }

    private void e(dnb dnbVar, List<dnb> list) {
        if (list == null) {
            return;
        }
        int size = list.size() - 1;
        if (njy.e(list, size)) {
            LogUtil.e("HealthWeight_HealthDataHistoryActivity", "out of bound, return");
            return;
        }
        if (dnbVar.ax() > list.get(size).ax()) {
            LogUtil.e("HealthWeight_HealthDataHistoryActivity", "add weight bean twice, return");
        } else {
            list.add(dnbVar);
        }
    }

    private void a() {
        this.t.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.HealthDataHistoryActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (HealthDataHistoryActivity.this.o) {
                    HealthDataHistoryActivity.this.c();
                    return;
                }
                if (HealthDataHistoryActivity.this.getIntent().getBooleanExtra("moveTaskToBack", false)) {
                    HealthDataHistoryActivity.this.moveTaskToBack(true);
                }
                HealthDataHistoryActivity.this.finish();
            }
        });
        this.f.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.HealthDataHistoryActivity.5
            @Override // android.widget.AdapterView.OnItemLongClickListener
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
                LogUtil.a("HealthWeight_HealthDataHistoryActivity", Integer.toString(i) + " " + Long.toString(j));
                long expandableListPosition = HealthDataHistoryActivity.this.f.getExpandableListPosition(i);
                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(expandableListPosition);
                int packedPositionChild = ExpandableListView.getPackedPositionChild(expandableListPosition);
                if (packedPositionGroup == -1 || packedPositionChild == -1) {
                    return true;
                }
                HealthDataHistoryActivity.this.e(false, i);
                return true;
            }
        });
        this.f.setOnChildClickListener(new ExpandableListView.OnChildClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.HealthDataHistoryActivity.3
            @Override // android.widget.ExpandableListView.OnChildClickListener
            public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
                vei.e(HealthDataHistoryActivity.this.f27453a, HealthDataHistoryActivity.this.e.getChild(i, i2), HealthDataHistoryActivity.this.f27454b);
                return true;
            }
        });
        this.f.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.HealthDataHistoryActivity$$ExternalSyntheticLambda0
            @Override // android.widget.ExpandableListView.OnGroupCollapseListener
            public final void onGroupCollapse(int i) {
                this.f27456c.e(i);
            }
        });
        this.f.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.HealthDataHistoryActivity$$ExternalSyntheticLambda1
            @Override // android.widget.ExpandableListView.OnGroupExpandListener
            public final void onGroupExpand(int i) {
                this.e.d(i);
            }
        });
    }

    /* synthetic */ void e(int i) {
        lrd.c(this.f, qre.f(R.string.accessibility_collapsed));
    }

    /* synthetic */ void d(int i) {
        lrd.c(this.f, qre.f(R.string.accessibility_expanded));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z) {
        int i;
        this.n = z;
        Resources resources = getResources();
        if (z) {
            i = R.string.IDS_hw_show_main_health_page_healthdata_bloodpresure_cancel_select;
        } else {
            i = R.string.IDS_hw_show_main_health_page_healthdata_bloodpresure_select;
        }
        this.x.setIconTitle(2, resources.getString(i));
        if (z) {
            h(true);
            a(true);
            this.x.setIcon(2, R.drawable.ic_public_deselect_all);
        } else {
            h(false);
            a(false);
            this.x.setIcon(2, R.drawable.ic_public_select_all);
        }
    }

    private void h(boolean z) {
        int groupCount = this.e.getGroupCount();
        for (int i = 0; i < groupCount; i++) {
            int childrenCount = this.e.getChildrenCount(i);
            for (int i2 = 0; i2 < childrenCount; i2++) {
                this.e.b().get(i).set(i2, Boolean.valueOf(z));
            }
        }
        this.e.notifyDataSetChanged();
    }

    private void d() {
        this.s = (LinearLayout) findViewById(R.id.hw_history_loading);
        HealthProgressBar healthProgressBar = (HealthProgressBar) findViewById(R.id.hw_device_history_loading_img);
        this.k = healthProgressBar;
        healthProgressBar.setLayerType(1, null);
        this.t = (CustomTitleBar) qsp.a(this.f27453a, R.id.health_healthdata_history_title_layout);
        this.f = (ExpandableListView) findViewById(R.id.hw_show_health_data_history_listview);
        this.w = (LinearLayout) findViewById(R.id.hw_show_health_data_history_empty_layout);
        this.y = (LinearLayout) findViewById(R.id.hw_show_health_data_history_layout);
        this.x = (HealthToolBar) findViewById(R.id.buttomview);
        View viewInflate = View.inflate(this.f27453a, R.layout.hw_toolbar_bottomview, null);
        this.f27455c = viewInflate;
        this.x.d(viewInflate);
        this.x.setOnSingleTapListener(this.r);
        this.x.a(this);
        this.x.setIcon(1, R.drawable.ic_public_delete);
        this.x.setIconTitle(1, getResources().getString(R.string.IDS_hw_health_show_healthdata_heart_delete));
        if (this.h != null) {
            WeightExpandableListViewAdapter weightExpandableListViewAdapter = new WeightExpandableListViewAdapter(this.h);
            this.e = weightExpandableListViewAdapter;
            this.f.setAdapter(weightExpandableListViewAdapter);
            this.f.setSelector(new ColorDrawable(0));
        }
        cancelAdaptRingRegion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        if (z) {
            if (!this.n && this.e.a() == this.e.e()) {
                this.n = true;
                this.x.setIcon(2, R.drawable.ic_public_deselect_all);
                this.x.setIconTitle(2, getResources().getString(R.string.IDS_hw_show_main_health_page_healthdata_bloodpresure_cancel_select));
            }
            a(true);
            return;
        }
        if (this.n && this.e.a() == this.e.e() - 1) {
            this.n = false;
            this.x.setIcon(2, R.drawable.ic_public_select_all);
            this.x.setIconTitle(2, getResources().getString(R.string.IDS_hw_show_main_health_page_healthdata_bloodpresure_select));
        }
        if (this.e.a() == 0) {
            a(false);
        } else {
            a(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final boolean z, final int i) {
        LogUtil.d("HealthWeight_HealthDataHistoryActivity", "showDeleteDialog ", "enter");
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.f27453a);
        builder.a(getString(R.string.IDS_hw_health_show_healthdata_delete)).a(getString(R.string.IDS_hw_common_ui_dialog_confirm).toUpperCase(Locale.ROOT), new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.HealthDataHistoryActivity.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.d("HealthWeight_HealthDataHistoryActivity", "it is positive");
                if (z) {
                    HealthDataHistoryActivity.this.e();
                    HealthDataHistoryActivity.this.c(false);
                    HealthDataHistoryActivity.this.e(false);
                    return;
                }
                HealthDataHistoryActivity.this.b(i);
            }
        }).d(getString(R.string.IDS_hw_show_cancel), new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.HealthDataHistoryActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.d("HealthWeight_HealthDataHistoryActivity", "it is negative");
            }
        });
        builder.c().show();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        LogUtil.a("HealthWeight_HealthDataHistoryActivity", "cancelSelect mAdapter.isMultiCheck()");
        if (this.e.d()) {
            a(false);
            LogUtil.a("HealthWeight_HealthDataHistoryActivity", "cancelSelect isMultiCheck");
            int groupCount = this.e.getGroupCount();
            for (int i = 0; i < groupCount; i++) {
                int childrenCount = this.e.getChildrenCount(i);
                for (int i2 = 0; i2 < childrenCount; i2++) {
                    this.e.b().get(i).set(i2, false);
                }
            }
            this.e.notifyDataSetChanged();
            c(false);
            e(false);
            return;
        }
        LogUtil.a("HealthWeight_HealthDataHistoryActivity", "cancelSelect finish");
        if (getIntent().getBooleanExtra("moveTaskToBack", false)) {
            moveTaskToBack(true);
        }
        super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int groupCount = this.e.getGroupCount() - 1; groupCount >= 0; groupCount--) {
            for (int childrenCount = this.e.getChildrenCount(groupCount) - 1; childrenCount >= 0; childrenCount--) {
                dnb dnbVarB = this.e.getChild(groupCount, childrenCount);
                if (dnbVarB != null && this.e.b().get(groupCount).get(childrenCount).booleanValue()) {
                    HiTimeInterval hiTimeInterval = new HiTimeInterval();
                    hiTimeInterval.setStartTime(dnbVarB.ax());
                    hiTimeInterval.setEndTime(dnbVarB.aw());
                    arrayList.add(hiTimeInterval);
                    arrayList2.add(dnbVarB);
                }
            }
        }
        this.d = arrayList2;
        uwe uweVar = this.i;
        if (uweVar != null) {
            uweVar.b(arrayList);
        }
        LogUtil.a("HealthWeight_HealthDataHistoryActivity", "deleteDatas ", TtmlNode.END);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        LogUtil.a("HealthWeight_HealthDataHistoryActivity", "refreshTop isSelect ", Boolean.valueOf(z));
        if (z) {
            return;
        }
        a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(boolean z) {
        LogUtil.a("HealthWeight_HealthDataHistoryActivity", "refreshBottom isSelect ", Boolean.valueOf(z));
        this.e.d(z);
        this.n = false;
        this.x.setIcon(2, R.drawable.ic_public_select_all);
        this.x.setIconTitle(2, getResources().getString(R.string.IDS_hw_show_main_health_page_healthdata_bloodpresure_select));
        if (!z) {
            this.t.setTitleText(getString(R.string.IDS_hw_base_health_data_history_record));
            if (!LanguageUtil.ba(this.f27453a)) {
                this.t.setLeftButtonDrawable(getResources().getDrawable(R.drawable.health_navbar_back_selector), qre.f(R.string.accessibility_go_back));
            } else {
                this.t.setLeftButtonDrawable(getResources().getDrawable(R.mipmap.ic_health_rtl_back_black), qre.f(R.string.accessibility_go_back));
            }
            this.o = true;
            this.x.setIconVisible(2, 8);
            this.e.notifyDataSetChanged();
            return;
        }
        this.x.setIconVisible(2, 0);
        this.e.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        WeightExpandableListViewAdapter weightExpandableListViewAdapter;
        this.o = true;
        Resources resources = BaseApplication.getContext().getResources();
        if (resources == null) {
            LogUtil.j("HealthWeight_HealthDataHistoryActivity", "setSelectNumVisibility resources is null");
            return;
        }
        this.t.setLeftButtonDrawable(resources.getDrawable(R.drawable.health_navbar_cancel_selector), qre.f(R.string.accessibility_close));
        if (z && (weightExpandableListViewAdapter = this.e) != null) {
            int iA = weightExpandableListViewAdapter.a();
            this.t.setTitleText(resources.getQuantityString(R.plurals.IDS_hw_weight_delete_check_measure_data, UnitUtil.e(iA), Integer.valueOf(iA)));
        } else {
            this.t.setTitleText(resources.getString(R.string.IDS_hw_show_main_health_page_healthdata_selectNone));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        LogUtil.a("HealthWeight_HealthDataHistoryActivity", "deleteData ", "enter");
        long expandableListPosition = this.f.getExpandableListPosition(i);
        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(expandableListPosition);
        int packedPositionChild = ExpandableListView.getPackedPositionChild(expandableListPosition);
        if (packedPositionGroup == -1 || packedPositionChild == -1) {
            LogUtil.e("HealthWeight_HealthDataHistoryActivity", "deleteData error, groupPosition=", Integer.valueOf(packedPositionGroup), ", childPosition=", Integer.valueOf(packedPositionChild));
            return;
        }
        dnb dnbVarB = this.e.getChild(packedPositionGroup, packedPositionChild);
        if (dnbVarB == null) {
            LogUtil.e("HealthWeight_HealthDataHistoryActivity", "deleteData item is null");
            return;
        }
        ArrayList arrayList = new ArrayList();
        HiTimeInterval hiTimeInterval = new HiTimeInterval();
        hiTimeInterval.setStartTime(dnbVarB.ax());
        hiTimeInterval.setEndTime(dnbVarB.aw());
        arrayList.add(hiTimeInterval);
        uwe uweVar = this.i;
        if (uweVar != null) {
            uweVar.b(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.e.getChild(packedPositionGroup, packedPositionChild));
        this.d = arrayList2;
        LogUtil.a("HealthWeight_HealthDataHistoryActivity", "deleteData ", TtmlNode.END);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        LogUtil.a("HealthWeight_HealthDataHistoryActivity", "syncData  ");
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(HiSyncType.HiSyncDataType.f12263a);
        hiSyncOption.setSyncScope(1);
        hiSyncOption.setSyncMethod(2);
        HiHealthNativeApi.a(this).synCloud(hiSyncOption, null);
    }

    protected int[] b(List<dnb> list) {
        HashSet hashSet = new HashSet(16);
        Iterator<dnb> it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(Integer.valueOf(it.next().l()));
        }
        int[] iArr = new int[hashSet.size()];
        Iterator it2 = hashSet.iterator();
        int i = 0;
        while (it2.hasNext()) {
            iArr[i] = ((Integer) it2.next()).intValue();
            i++;
        }
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<dnb> list, long j) {
        if (njy.e(list)) {
            LogUtil.e("HealthWeight_HealthDataHistoryActivity", "getTypeMap is null");
            e(list);
            return;
        }
        int[] iArrB = b(list);
        HiDataSourceFetchOption hiDataSourceFetchOptionA = HiDataSourceFetchOption.builder().c(1).b(iArrB).a();
        LogUtil.a("HealthWeight_HealthDataHistoryActivity", "start setDataSourceType");
        HiHealthNativeApi.a(this.f27453a).fetchDataSource(hiDataSourceFetchOptionA, new c(list, new HashMap(16), iArrB, j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List<dnb> list) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 3;
        messageObtain.obj = list;
        this.h.sendMessage(messageObtain);
    }

    private boolean h() {
        dnj mainUser = MultiUsersManager.INSTANCE.getMainUser();
        if (mainUser == null || this.f27454b == null || mainUser.i() == null || this.f27454b.i() == null) {
            return false;
        }
        return this.f27454b.i().equals(mainUser.i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(ArrayList<dnb> arrayList, HealthDataHistoryActivity healthDataHistoryActivity) {
        if (healthDataHistoryActivity.h()) {
            List<dnb> arrayList2 = new ArrayList<>();
            if (njy.b(arrayList)) {
                arrayList2 = arrayList.subList(0, 1);
            }
            if (!uwo.a(uwo.a(), arrayList2)) {
                LogUtil.a("HealthWeight_HealthDataHistoryActivity", "HealthDataHistoryCallback getWeight same cache");
            } else {
                uwo.e(arrayList2);
            }
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class b implements TrendFragmentCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<HealthDataHistoryActivity> f27463a;
        private final long d;

        private b(HealthDataHistoryActivity healthDataHistoryActivity, long j) {
            this.f27463a = new WeakReference<>(healthDataHistoryActivity);
            this.d = j;
        }

        @Override // com.huawei.ui.main.stories.health.util.TrendFragmentCallback
        public void getWeight(ArrayList<dnb> arrayList, boolean z) {
            if (this.f27463a == null) {
                LogUtil.j("HealthWeight_HealthDataHistoryActivity", "weakRef is null");
                return;
            }
            LogUtil.a("HealthWeight_HealthDataHistoryActivity", "weightBeanList.size()", Integer.valueOf(arrayList.size()));
            HealthDataHistoryActivity healthDataHistoryActivity = this.f27463a.get();
            if (healthDataHistoryActivity != null) {
                healthDataHistoryActivity.g = z;
                if (healthDataHistoryActivity.q != this.d) {
                    LogUtil.j("HealthWeight_HealthDataHistoryActivity", "request weight bean, request time is not same");
                    return;
                }
                d(arrayList);
                if (healthDataHistoryActivity.h != null) {
                    healthDataHistoryActivity.d(arrayList, this.d);
                    HealthDataHistoryActivity.a(arrayList, healthDataHistoryActivity);
                    return;
                }
                return;
            }
            LogUtil.j("HealthWeight_HealthDataHistoryActivity", "dataHistoryActivity is null");
        }

        private void d(List<dnb> list) {
            if (njy.e(list)) {
                return;
            }
            int i = 0;
            while (i < list.size() - 1) {
                int i2 = i + 1;
                if (njy.c(list, i2)) {
                    e(list.get(i), list.get(i2));
                }
                i = i2;
            }
        }

        private void e(dnb dnbVar, dnb dnbVar2) {
            if (dnbVar == null || dnbVar2 == null) {
                return;
            }
            double dMin = Math.min(dnbVar.av(), dnbVar2.av());
            if (dMin != 0.0d && Math.abs(dnbVar.av() - dnbVar2.av()) / dMin >= 0.4d) {
                ReleaseLogUtil.e("HealthWeight_HealthDataHistoryActivity", "weight data may be wrong, diff = ", Double.valueOf(dnbVar.av() - dnbVar2.av()), " isManual1 = ", Boolean.valueOf(dnbVar.p()), " isManual2 = ", Boolean.valueOf(dnbVar2.p()));
            }
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class c implements HiDataClientListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int[] f27464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f27465b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<HealthDataHistoryActivity> f27466c;
        private final HashMap<Integer, Boolean> d;
        private final List<dnb> e;

        private c(HealthDataHistoryActivity healthDataHistoryActivity, List<dnb> list, HashMap<Integer, Boolean> map, int[] iArr, long j) {
            this.f27466c = new WeakReference<>(healthDataHistoryActivity);
            this.e = list;
            this.d = map;
            this.f27464a = iArr;
            this.f27465b = j;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataClientListener
        public void onResult(List<HiHealthClient> list) {
            HealthDataHistoryActivity healthDataHistoryActivity = this.f27466c.get();
            if (healthDataHistoryActivity == null) {
                return;
            }
            if (healthDataHistoryActivity.q != this.f27465b) {
                LogUtil.e("HealthWeight_HealthDataHistoryActivity", "request data client, request time is not same");
                return;
            }
            if (njy.e(list)) {
                LogUtil.e("HealthWeight_HealthDataHistoryActivity", "getDataSourceType clientList is null or size is 0");
                healthDataHistoryActivity.e(this.e);
                return;
            }
            ProductMapParseUtil.a(BaseApplication.getContext());
            int i = 0;
            for (HiHealthClient hiHealthClient : list) {
                boolean zA = wgr.a(hiHealthClient);
                if (!zA) {
                    zA = healthDataHistoryActivity.b(hiHealthClient);
                }
                this.d.put(Integer.valueOf(this.f27464a[i]), Boolean.valueOf(zA));
                i++;
            }
            LogUtil.a("HealthWeight_HealthDataHistoryActivity", "end setDataSourceType");
            for (dnb dnbVar : this.e) {
                if (this.d.containsKey(Integer.valueOf(dnbVar.l()))) {
                    dnbVar.d(this.d.get(Integer.valueOf(dnbVar.l())).booleanValue());
                } else {
                    dnbVar.d(false);
                }
            }
            healthDataHistoryActivity.e(this.e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(HiHealthClient hiHealthClient) {
        HiDeviceInfo hiDeviceInfo = hiHealthClient.getHiDeviceInfo();
        if (hiDeviceInfo == null) {
            return false;
        }
        String strB = wgt.b(String.valueOf(hiDeviceInfo.getDeviceType()));
        LogUtil.a("HealthWeight_HealthDataHistoryActivity", "isFromWatch category ", strB);
        return "06D".equals(strB);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
