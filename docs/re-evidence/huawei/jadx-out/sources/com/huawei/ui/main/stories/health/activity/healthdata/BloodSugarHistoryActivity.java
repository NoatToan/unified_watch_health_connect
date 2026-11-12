package com.huawei.ui.main.stories.health.activity.healthdata;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hihealth.HiDataSourceFetchOption;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiTimeInterval;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataClientListener;
import com.huawei.hihealth.data.model.HiBloodSugarMetaData;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.CommonUiBaseResponse;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.listview.HealthExpandableListView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.toolbar.HealthToolBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.adapter.BloodSugarHistoryExpandableListViewAdapter;
import com.huawei.ui.main.stories.health.util.BloodSugarTimeUtils;
import defpackage.etn;
import defpackage.lmf;
import defpackage.njy;
import defpackage.nkb;
import defpackage.qre;
import defpackage.uvy;
import defpackage.uwf;
import defpackage.uwh;
import defpackage.wgr;
import defpackage.wqm;
import defpackage.wuc;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes19.dex */
public class BloodSugarHistoryActivity extends BaseActivity {
    private HealthToolBar ab;
    private HealthExpandableListView f;
    private LinearLayout g;
    private BloodSugarHistoryExpandableListViewAdapter h;
    private Context i;
    private c j;
    private uwf k;
    private g m;
    private LinearLayout n;
    private a o;
    private Resources p;
    private RelativeLayout s;
    private String v;
    private String w;
    private CustomTitleBar x;
    private int y = 0;
    private Handler l = new e(this);
    private List<ArrayList<uwh>> e = new ArrayList(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<uvy> f27431c = new CopyOnWriteArrayList();
    private List<uvy> d = new ArrayList(10);
    private Map<Long, uvy> u = new HashMap();
    private boolean r = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f27430b = 0;
    private int z = 0;
    private boolean t = false;
    private boolean q = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f27429a = 0;

    static /* synthetic */ int c(BloodSugarHistoryActivity bloodSugarHistoryActivity) {
        int i = bloodSugarHistoryActivity.z;
        bloodSugarHistoryActivity.z = i - 1;
        return i;
    }

    private static int d(List<uvy> list, ArrayList<List<Boolean>> arrayList) {
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            List<Boolean> list2 = arrayList.get(i2);
            if (njy.e(list, i2)) {
                return 0;
            }
            for (int i3 = 0; i3 < list2.size(); i3++) {
                if (list2.get(i3).booleanValue()) {
                    ArrayList<uvy.e> arrayListC = list.get(i2).c();
                    if (!njy.e(arrayListC, i3) && !arrayListC.get(i3).o()) {
                        i++;
                    }
                }
            }
        }
        return i;
    }

    private static String d() {
        HiBloodSugarMetaData hiBloodSugarMetaData = new HiBloodSugarMetaData();
        hiBloodSugarMetaData.setConfirmed(true);
        return wqm.d(hiBloodSugarMetaData);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.health_data_historybloodsugar);
        clearBackgroundDrawable();
        this.i = this;
        this.q = true;
        this.p = BaseApplication.getContext().getResources();
        this.k = uwf.d();
        this.o = new a(this);
        this.j = new c(this);
        this.m = new g(this);
        this.w = this.p.getString(R.string.IDS_hw_show_healthdata_bloodsugar_select_all);
        this.v = this.p.getString(R.string.IDS_hw_show_healthdata_bloodsugar_unselected_all);
        h();
        r();
        a();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            f();
        }
    }

    private void h() {
        this.s = (RelativeLayout) findViewById(R.id.hw_blood_sugar_loading);
        this.g = (LinearLayout) findViewById(R.id.hw_show_health_data_bloodsugar_empty_layout);
        this.n = (LinearLayout) findViewById(R.id.layout_blood_sugar_has_data);
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.health_blood_sugar_history_title_layout);
        this.x = customTitleBar;
        customTitleBar.setTitleBarBackgroundColor(ContextCompat.getColor(this, R.color.hw_hongmeng_bg));
        this.f = (HealthExpandableListView) findViewById(R.id.list_blood_sugar_history_simplify);
        this.ab = (HealthToolBar) findViewById(R.id.blood_sugar_history_toolbar);
        this.ab.d(View.inflate(this.i, R.layout.hw_toolbar_bottomview, null));
        this.ab.setBackgroundColor(ContextCompat.getColor(this, R.color.colorSubBackground));
        h(0);
        this.ab.a(this);
        BaseActivity.cancelLayoutById(this.f);
        BloodSugarHistoryExpandableListViewAdapter bloodSugarHistoryExpandableListViewAdapter = new BloodSugarHistoryExpandableListViewAdapter(this.i);
        this.h = bloodSugarHistoryExpandableListViewAdapter;
        this.f.setAdapter(bloodSugarHistoryExpandableListViewAdapter);
        this.f.setSelector(new ColorDrawable(0));
        j();
    }

    private void j() {
        o();
    }

    private void o() {
        this.f.setOnChildClickListener(new ExpandableListView.OnChildClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.BloodSugarHistoryActivity$$ExternalSyntheticLambda3
            @Override // android.widget.ExpandableListView.OnChildClickListener
            public final boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
                return this.f27432c.e(expandableListView, view, i, i2, j);
            }
        });
        this.h.c(new BloodSugarHistoryExpandableListViewAdapter.OnItemClickListener() { // from class: uor
            @Override // com.huawei.ui.main.stories.health.adapter.BloodSugarHistoryExpandableListViewAdapter.OnItemClickListener
            public final void onItemClickListener(int i, int i2) {
                this.e.d(i, i2);
            }
        });
    }

    /* synthetic */ boolean e(ExpandableListView expandableListView, View view, int i, int i2, long j) {
        return d(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean d(int i, int i2) {
        if (this.y == 0) {
            c(this.d, i, i2);
            return true;
        }
        return c(i, i2);
    }

    private void c(List<uvy> list, int i, int i2) {
        if (njy.e(list, i)) {
            return;
        }
        ArrayList<uvy.e> arrayListC = list.get(i).c();
        if (njy.e(arrayListC, i2)) {
            LogUtil.e("BloodSugarHistoryActivity", "startDetailPage list is null or isOutOfBounds");
            return;
        }
        uvy.e eVar = arrayListC.get(i2);
        Intent intent = new Intent();
        if (wuc.d(eVar.c()) && !eVar.o()) {
            c();
            intent.setClass(this.i, BloodSugarDeviceMeasureActivity.class);
            intent.putExtra("entrance", "jump_from_blood_sugar_history");
            intent.putExtra("start_time", eVar.g());
            intent.putExtra("time_period", eVar.d());
        } else {
            intent.setClass(this.i, BloodSugarFeedbackActivity.class);
            intent.putExtra("bloodTimePeriod", eVar.d());
            if (eVar.g() != eVar.n()) {
                intent.putExtra("showDefaultTime", eVar.n());
            }
            intent.putExtra("time", eVar.g());
            intent.putExtra("bloodNum", eVar.i());
            intent.putExtra("isEdit", true);
            intent.putExtra("clientId", eVar.e());
            intent.putExtra(ParsedFieldTag.TASK_MODIFY_TIME, eVar.f());
            intent.putExtra("pageFrom", 4);
            if (wuc.d(eVar.c())) {
                intent.putExtra("bloodSugarDataIsFromMeter", true);
                intent.putExtra("titleName", this.i.getResources().getString(R.string.IDS_hw_show_healthdata_bloodsugar_measurement_record));
            } else {
                intent.putExtra("bloodSugarDataIsFromMeter", false);
                intent.putExtra("titleName", this.i.getResources().getString(R.string.IDS_hw_show_healthdata_bloodsugar_history));
            }
        }
        startActivityForResult(intent, 100);
    }

    private boolean c(int i, int i2) {
        ArrayList<List<Boolean>> arrayListE = this.h.e();
        if (njy.e(arrayListE, i)) {
            return true;
        }
        List<Boolean> list = arrayListE.get(i);
        if (njy.e(list, i2) || njy.e(this.d, i) || njy.e(this.d.get(i).c(), i2)) {
            return true;
        }
        Boolean bool = list.get(i2);
        list.set(i2, Boolean.valueOf(!bool.booleanValue()));
        arrayListE.set(i, list);
        this.h.b(arrayListE);
        if (!bool.booleanValue()) {
            this.f27430b++;
        } else {
            this.f27430b--;
        }
        Iterator<List<Boolean>> it = arrayListE.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().size();
        }
        if (this.f27430b == size) {
            this.r = true;
            this.ab.setIconTitle(3, this.v);
            this.ab.setIcon(3, R.drawable.ic_public_deselect_all);
        } else {
            this.r = false;
            this.ab.setIconTitle(3, this.w);
            this.ab.setIcon(3, R.drawable.ic_public_select_all);
        }
        q();
        return true;
    }

    private void d(long j, uvy.e eVar) {
        uvy uvyVar = this.u.get(Long.valueOf(j));
        if (uvyVar == null) {
            uvyVar = new uvy();
            uvyVar.b(new ArrayList());
            this.u.put(Long.valueOf(j), uvyVar);
        }
        uvyVar.c().add(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(int i) {
        if (i == 0) {
            this.r = false;
            this.f27430b = 0;
            this.z = 0;
        }
        this.y = i;
        this.h.c(i);
        h(i);
        b(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        i(0);
        this.h.d();
    }

    private void h(int i) {
        if (i == 1) {
            t();
            return;
        }
        this.ab.setIcon(2, R.drawable.ic_public_select_all);
        this.ab.setIconTitle(2, this.p.getString(R.string.IDS_hw_show_healthdata_bloodsugar_select));
        this.ab.setIconVisible(1, 8);
        this.ab.setIconVisible(3, 8);
        this.ab.setOnSingleTapListener(new HealthToolBar.OnSingleTapListener() { // from class: uos
            @Override // com.huawei.ui.commonui.toolbar.HealthToolBar.OnSingleTapListener
            public final void onSingleTap(int i2) {
                this.f50429a.d(i2);
            }
        });
    }

    public /* synthetic */ void d(int i) {
        if (i == 2) {
            i(1);
        }
    }

    private void t() {
        if (this.t) {
            this.ab.setIcon(1, R.drawable.ic_blood_sugar_confirm_time);
            this.ab.setIconTitle(1, this.p.getString(R.string.IDS_hw_show_healthdata_bloodsugar_confirm_time_segment));
            this.ab.setIcon(2, R.drawable.ic_public_black_delete);
            this.ab.setIconTitle(2, this.p.getString(R.string.IDS_hw_show_healthdata_bloodsugar_delete));
            this.ab.setIcon(3, R.drawable.ic_public_select_all);
            this.ab.setIconTitle(3, this.w);
            this.ab.setIconVisible(1, 0);
            this.ab.setIconVisible(3, 0);
            this.ab.setOnSingleTapListener(new HealthToolBar.OnSingleTapListener() { // from class: uou
                @Override // com.huawei.ui.commonui.toolbar.HealthToolBar.OnSingleTapListener
                public final void onSingleTap(int i) {
                    this.f50431b.e(i);
                }
            });
            return;
        }
        p();
    }

    public /* synthetic */ void e(int i) {
        if (i == 1) {
            int iD = d(this.d, this.h.e());
            this.z = iD;
            if (iD <= 0) {
                return;
            }
            b(this.f27430b, this.d, this.h.e());
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            s();
        } else {
            int i2 = this.f27430b;
            if (i2 <= 0) {
                this.f27430b = 0;
            } else {
                e(i2, this.d, this.h.e());
            }
        }
    }

    private void p() {
        this.ab.setIconVisible(2, 8);
        this.ab.setIcon(1, R.drawable.ic_public_black_delete);
        this.ab.setIconTitle(1, this.p.getString(R.string.IDS_hw_show_healthdata_bloodsugar_delete));
        this.ab.setIcon(3, R.drawable.ic_public_select_all);
        this.ab.setIconTitle(3, this.w);
        this.ab.setIconVisible(1, 0);
        this.ab.setIconVisible(3, 0);
        this.ab.setOnSingleTapListener(new HealthToolBar.OnSingleTapListener() { // from class: uoq
            @Override // com.huawei.ui.commonui.toolbar.HealthToolBar.OnSingleTapListener
            public final void onSingleTap(int i) {
                this.f50428c.c(i);
            }
        });
    }

    public /* synthetic */ void c(int i) {
        if (i != 1) {
            if (i != 3) {
                return;
            }
            s();
        } else {
            int i2 = this.f27430b;
            if (i2 <= 0) {
                this.f27430b = 0;
            } else {
                e(i2, this.d, this.h.e());
            }
        }
    }

    private void b(int i) {
        if (i == 1) {
            this.x.setLeftButtonDrawable(this.p.getDrawable(R.drawable.ic_public_select_cancel), qre.f(R.string.accessibility_close));
            this.x.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: uot
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f50430b.e(view);
                }
            });
            this.x.setTitleText(this.p.getString(R.string.IDS_hw_show_healthdata_bloodsugar_not_select));
        } else {
            this.x.setLeftButtonDrawable(this.p.getDrawable(R.drawable.health_navbar_back_selector), qre.f(R.string.accessibility_go_back));
            this.x.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: uoz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f50435c.b(view);
                }
            });
            this.x.setTitleText(this.p.getString(R.string.IDS_hw_base_health_data_history_record));
        }
    }

    public /* synthetic */ void e(View view) {
        i(0);
    }

    public /* synthetic */ void b(View view) {
        onBackPressed();
    }

    private void q() {
        if (this.f27430b > 0) {
            CustomTitleBar customTitleBar = this.x;
            Resources resources = this.p;
            int i = R.plurals.IDS_hw_show_healthdata_bloodsugar_selected_items;
            int i2 = this.f27430b;
            customTitleBar.setTitleText(resources.getQuantityString(i, i2, Integer.valueOf(i2)));
            return;
        }
        this.x.setTitleText(this.p.getString(R.string.IDS_hw_show_healthdata_bloodsugar_not_select));
    }

    private void s() {
        int size = 0;
        if (this.r) {
            this.h.a();
            this.r = false;
            this.ab.setIconTitle(3, this.w);
            this.ab.setIcon(3, R.drawable.ic_public_select_all);
            this.f27430b = 0;
            this.z = 0;
        } else {
            this.h.c();
            this.r = true;
            this.ab.setIconTitle(3, this.v);
            this.ab.setIcon(3, R.drawable.ic_public_deselect_all);
            ArrayList<List<Boolean>> arrayListE = this.h.e();
            if (arrayListE == null || arrayListE.size() == 0) {
                return;
            }
            Iterator<List<Boolean>> it = arrayListE.iterator();
            while (it.hasNext()) {
                size += it.next().size();
            }
            this.f27430b = size;
        }
        q();
    }

    private void r() {
        if (this.h.b() == null) {
            return;
        }
        for (int i = 0; i <= this.h.b().size(); i++) {
            a(i);
        }
    }

    private void a(int i) {
        if (this.f == null || !njy.c(this.h.b(), i)) {
            return;
        }
        this.f.expandGroup(i);
    }

    private void a() {
        String strValue = AnalyticsValue.HEALTH_HEALTH_BLOODSUGAR_CARD_DATA_2030070.value();
        HashMap map = new HashMap();
        map.put("click", "1");
        map.put("type", "1");
        lmf.d().c(this.i, strValue, map, 0);
    }

    private void c() {
        String strValue = AnalyticsValue.HEALTH_HEALTH_BLOODSUGAR_CARD_CONFIRMED_2030071.value();
        HashMap map = new HashMap();
        map.put("click", "1");
        map.put("type", "3");
        lmf.d().c(this.i, strValue, map, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        y();
        this.k.d(this.i, 0L, System.currentTimeMillis(), 0, this.o);
        if (this.y == 1) {
            i(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(int i) {
        this.t = false;
        this.d.clear();
        this.f27429a = 0;
        if (i == 1) {
            this.f27431c.clear();
            k();
            return;
        }
        for (uvy uvyVar : this.f27431c) {
            uvy uvyVar2 = this.u.get(Long.valueOf(uvyVar.a()));
            Iterator<uvy.e> it = uvyVar.c().iterator();
            ArrayList<uvy.e> arrayListC = uvyVar2 != null ? uvyVar2.c() : null;
            while (it.hasNext()) {
                uvy.e next = it.next();
                if (arrayListC != null && arrayListC.contains(next)) {
                    it.remove();
                } else {
                    boolean zA = a(next.j());
                    next.a(zA);
                    if (!zA) {
                        this.t = true;
                    }
                }
            }
            if (uvyVar.c().isEmpty()) {
                this.f27431c.remove(uvyVar);
            }
            this.f27429a += uvyVar.c().size();
        }
        m();
    }

    private void e(final int i, final List<uvy> list, final ArrayList<List<Boolean>> arrayList) {
        if (i <= 0) {
            return;
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.i);
        builder.a(this.p.getQuantityString(R.plurals.IDS_hw_show_healthdata_bloodsugar_confirm_delete_record_msg, i, Integer.valueOf(i))).a(this.i.getString(R.string.IDS_hw_health_show_common_dialog_ok_button), new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.BloodSugarHistoryActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BloodSugarHistoryActivity.this.d(i, list, arrayList);
            }
        }).d(this.i.getString(R.string.IDS_hw_health_show_common_dialog_cancle_button), new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.BloodSugarHistoryActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        builder.c().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, List<uvy> list, ArrayList<List<Boolean>> arrayList) {
        y();
        this.j.b(i);
        int i2 = 0;
        boolean z = i == this.f27429a;
        this.j.c(z);
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            List<Boolean> list2 = arrayList.get(i3);
            for (int i4 = 0; i4 < list2.size(); i4++) {
                if (list2.get(i4).booleanValue()) {
                    uvy uvyVar = list.get(i3);
                    uvy.e eVar = uvyVar.c().get(i4);
                    if (!z) {
                        d(uvyVar.a(), eVar);
                    }
                    HiTimeInterval hiTimeInterval = new HiTimeInterval();
                    hiTimeInterval.setStartTime(eVar.g());
                    hiTimeInterval.setEndTime(eVar.g());
                    arrayList2.add(hiTimeInterval);
                    hashSet.add(Integer.valueOf(eVar.d()));
                }
            }
        }
        int[] iArr = new int[hashSet.size()];
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            iArr[i2] = ((Integer) it.next()).intValue();
            i2++;
        }
        nkb.d().c(this.i, arrayList2, iArr, this.j);
    }

    private void b(int i, final List<uvy> list, final ArrayList<List<Boolean>> arrayList) {
        if (i <= 0) {
            return;
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.i);
        Resources resources = this.p;
        int i2 = R.plurals.IDS_hw_show_healthdata_bloodsugar_confirm_record_msg;
        int i3 = this.z;
        builder.a(resources.getQuantityString(i2, i3, Integer.valueOf(i3))).a(this.i.getString(R.string.IDS_hw_health_show_common_dialog_ok_button), new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.BloodSugarHistoryActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    BloodSugarHistoryActivity.this.b((uvy) list.get(i4), (List) arrayList.get(i4));
                }
            }
        }).d(this.i.getString(R.string.IDS_hw_health_show_common_dialog_cancle_button), new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.BloodSugarHistoryActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        builder.c().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(uvy uvyVar, List<Boolean> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).booleanValue()) {
                uvy.e eVar = uvyVar.c().get(i);
                if (!eVar.o()) {
                    LogUtil.a("BloodSugarHistoryActivity", "insertDeviceData clientId:", Integer.valueOf(eVar.e()));
                    d(eVar, this.m);
                    eVar.a(true);
                }
            }
        }
    }

    private void d(uvy.e eVar, IBaseResponseCallback iBaseResponseCallback) {
        String strD = "BloodSugarHistoryActivity";
        if (eVar == null || iBaseResponseCallback == null) {
            LogUtil.e("BloodSugarHistoryActivity", "insertDeviceData params is null");
            return;
        }
        String strJ = eVar.j();
        if (!TextUtils.isEmpty(strJ)) {
            try {
                HiBloodSugarMetaData hiBloodSugarMetaData = (HiBloodSugarMetaData) wqm.d(strJ, HiBloodSugarMetaData.class);
                if (hiBloodSugarMetaData == null) {
                    strD = d();
                } else {
                    hiBloodSugarMetaData.setConfirmed(true);
                    strD = wqm.d(hiBloodSugarMetaData);
                }
            } catch (JsonSyntaxException e2) {
                LogUtil.e(strD, e2.getMessage());
                strD = d();
            } catch (IllegalStateException e3) {
                LogUtil.e(strD, e3.getMessage());
                strD = d();
            }
        } else {
            strD = d();
        }
        HiHealthData hiHealthData = new HiHealthData(10001);
        hiHealthData.setDeviceUuid(eVar.a());
        hiHealthData.setStartTime(eVar.g());
        hiHealthData.setEndTime(eVar.g());
        hiHealthData.setType(eVar.d());
        hiHealthData.setValue(etn.h(eVar.a()) ? eVar.h() : eVar.i());
        hiHealthData.setMetaData(strD);
        HiHealthNativeApi.a(BaseApplication.getContext()).fetchDataSource(HiDataSourceFetchOption.builder().c(1).b(new int[]{eVar.e()}).a(), new d(this, hiHealthData, iBaseResponseCallback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (!njy.e(this.e)) {
            g();
        } else {
            k();
        }
    }

    private void g() {
        ArrayList arrayList = new ArrayList(this.f27431c);
        Collections.sort(arrayList, new b());
        this.f27431c.clear();
        this.f27431c.addAll(arrayList);
        m();
    }

    private void m() {
        this.d.addAll(this.f27431c);
        if (this.h == null) {
            this.h = new BloodSugarHistoryExpandableListViewAdapter(this);
        }
        this.h.c(this.d);
        this.s.setVisibility(8);
        this.n.setVisibility(0);
        this.g.setVisibility(8);
        r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        this.h.c(this.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (njy.e(this.f27431c)) {
            LogUtil.e("BloodSugarHistoryActivity", "getTypeMap is null");
            return;
        }
        int[] iArrC = c(this.f27431c);
        HiDataSourceFetchOption hiDataSourceFetchOptionA = HiDataSourceFetchOption.builder().c(1).b(iArrC).a();
        LogUtil.a("BloodSugarHistoryActivity", "start setDataSourceType");
        HiHealthNativeApi.a(this.i).fetchDataSource(hiDataSourceFetchOptionA, new d(this, iArrC, null));
    }

    protected int[] c(List<uvy> list) {
        HashSet hashSet = new HashSet(16);
        Iterator<uvy> it = list.iterator();
        while (it.hasNext()) {
            Iterator<uvy.e> it2 = it.next().c().iterator();
            while (it2.hasNext()) {
                hashSet.add(Integer.valueOf(it2.next().e()));
            }
        }
        int[] iArr = new int[hashSet.size()];
        Iterator it3 = hashSet.iterator();
        int i = 0;
        while (it3.hasNext()) {
            iArr[i] = ((Integer) it3.next()).intValue();
            i++;
        }
        return iArr;
    }

    private void y() {
        if (this.s.getVisibility() == 0) {
            return;
        }
        this.s.setVisibility(0);
        this.n.setVisibility(8);
        this.g.setVisibility(8);
        this.x.setTitleBarBackgroundColor(ContextCompat.getColor(this, R.color.hw_hongmeng_bg));
    }

    private void k() {
        this.s.setVisibility(8);
        this.g.setVisibility(0);
        this.n.setVisibility(8);
        this.x.setTitleBarBackgroundColor(ContextCompat.getColor(this, R.color.charteye_normal_bg));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List<ArrayList<uwh>> list) {
        this.f27431c.clear();
        this.d.clear();
        this.f27429a = 0;
        for (ArrayList<uwh> arrayList : list) {
            uvy uvyVar = new uvy();
            if (njy.e(arrayList)) {
                LogUtil.e("BloodSugarHistoryActivity", "addHistoryData healthDataList is empty");
                k();
                return;
            }
            uvyVar.a(arrayList.get(0).g());
            ArrayList<uvy.e> arrayList2 = new ArrayList<>();
            for (uwh uwhVar : arrayList) {
                if (uwhVar == null) {
                    k();
                    LogUtil.e("BloodSugarHistoryActivity", "addHistoryData healthData is null");
                    return;
                } else if (DateFormatUtil.d(uwhVar.g(), DateFormatUtil.DateFormatType.DATE_FORMAT_YYYYMD).equals(DateFormatUtil.d(uvyVar.a(), DateFormatUtil.DateFormatType.DATE_FORMAT_YYYYMD))) {
                    c(uwhVar, arrayList2, arrayList);
                }
            }
            uvyVar.b(arrayList2);
            this.f27431c.add(uvyVar);
            this.f27429a += arrayList.size();
        }
    }

    private void c(uwh uwhVar, ArrayList<uvy.e> arrayList, List<uwh> list) {
        uvy.e eVar = new uvy.e();
        eVar.a(uwhVar.g());
        eVar.d(uwhVar.g());
        int iM = (int) uwhVar.m();
        double dO = uwhVar.o();
        eVar.a(iM);
        eVar.b(dO);
        eVar.b(uwhVar.d());
        eVar.d(uwhVar.i());
        String strJ = uwhVar.j();
        eVar.b(strJ);
        eVar.e(uwhVar.a());
        eVar.e(uwhVar.f());
        if (!TextUtils.isEmpty(strJ)) {
            boolean zA = a(strJ);
            eVar.a(zA);
            if (!zA) {
                this.t = true;
            }
        } else {
            eVar.a(true);
            if (wuc.d(eVar.c())) {
                eVar.d(uwhVar.g());
            } else {
                eVar.d(BloodSugarTimeUtils.b(iM, list.get(0).g()));
            }
        }
        arrayList.add(eVar);
    }

    private boolean a(String str) {
        try {
            HiBloodSugarMetaData hiBloodSugarMetaData = (HiBloodSugarMetaData) wqm.d(str, HiBloodSugarMetaData.class);
            if (hiBloodSugarMetaData != null) {
                return hiBloodSugarMetaData.getConfirmed();
            }
            return true;
        } catch (JsonSyntaxException unused) {
            LogUtil.e("BloodSugarHistoryActivity", "fromJson JsonSyntaxException");
            return true;
        } catch (IllegalStateException unused2) {
            LogUtil.e("BloodSugarHistoryActivity", "fromJson IllegalStateException");
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.t = false;
        for (uvy uvyVar : this.d) {
            if (uvyVar != null) {
                for (uvy.e eVar : uvyVar.c()) {
                    if (eVar != null && !eVar.o()) {
                        this.t = true;
                        return;
                    }
                }
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.q) {
            f();
            this.q = false;
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        HealthExpandableListView healthExpandableListView = this.f;
        if (healthExpandableListView != null) {
            healthExpandableListView.setOnGroupClickListener(null);
            this.f.setOnChildClickListener(null);
            this.f.setOnItemLongClickListener(null);
            this.f = null;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.y == 1) {
            i(0);
        } else {
            super.onBackPressed();
        }
    }

    static class a implements CommonUiBaseResponse {
        WeakReference<BloodSugarHistoryActivity> d;

        a(BloodSugarHistoryActivity bloodSugarHistoryActivity) {
            this.d = new WeakReference<>(bloodSugarHistoryActivity);
        }

        @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
        public void onResponse(int i, Object obj) {
            BloodSugarHistoryActivity bloodSugarHistoryActivity = this.d.get();
            if (bloodSugarHistoryActivity != null) {
                bloodSugarHistoryActivity.t = false;
                if (obj instanceof List) {
                    bloodSugarHistoryActivity.e((List<ArrayList<uwh>>) obj);
                    bloodSugarHistoryActivity.b();
                }
                Message messageObtainMessage = bloodSugarHistoryActivity.l.obtainMessage();
                messageObtainMessage.what = 1;
                messageObtainMessage.obj = obj;
                bloodSugarHistoryActivity.l.sendMessage(messageObtainMessage);
            }
        }
    }

    static class e extends BaseHandler<BloodSugarHistoryActivity> {
        e(BloodSugarHistoryActivity bloodSugarHistoryActivity) {
            super(bloodSugarHistoryActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(BloodSugarHistoryActivity bloodSugarHistoryActivity, Message message) {
            if (message == null) {
                LogUtil.j("BloodSugarHistoryActivity", "handleMessageWhenReferenceNotNull msg is null");
                bloodSugarHistoryActivity.l();
                return;
            }
            int i = message.what;
            if (i == 1) {
                LogUtil.a("BloodSugarHistoryActivity", "UPDATE_HISTORY");
                Object obj = message.obj;
                if (obj instanceof List) {
                    bloodSugarHistoryActivity.e.clear();
                    bloodSugarHistoryActivity.e.addAll((List) obj);
                } else {
                    LogUtil.j("BloodSugarHistoryActivity", "CASE UPDATE_HISTORY : objFromBloodSugarUpdate data is null or not List");
                }
                bloodSugarHistoryActivity.l();
                return;
            }
            if (i == 2) {
                LogUtil.a("BloodSugarHistoryActivity", "DELETE_RECORDS");
                bloodSugarHistoryActivity.i(0);
                bloodSugarHistoryActivity.e();
                if (message.arg1 == 0) {
                    bloodSugarHistoryActivity.g(message.arg2);
                } else {
                    bloodSugarHistoryActivity.f();
                }
                bloodSugarHistoryActivity.u.clear();
                return;
            }
            if (i != 3) {
                if (i != 4) {
                    return;
                }
                bloodSugarHistoryActivity.n();
            } else {
                BloodSugarHistoryActivity.c(bloodSugarHistoryActivity);
                bloodSugarHistoryActivity.i(0);
                if (bloodSugarHistoryActivity.z <= 0) {
                    bloodSugarHistoryActivity.e();
                    bloodSugarHistoryActivity.i();
                }
            }
        }
    }

    static class c implements IBaseResponseCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f27439b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<BloodSugarHistoryActivity> f27440c;
        private int d = 0;

        c(BloodSugarHistoryActivity bloodSugarHistoryActivity) {
            this.f27440c = new WeakReference<>(bloodSugarHistoryActivity);
        }

        public void b(int i) {
            this.f27439b = i;
        }

        public void c(boolean z) {
            this.d = z ? 1 : 0;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            BloodSugarHistoryActivity bloodSugarHistoryActivity = this.f27440c.get();
            if (bloodSugarHistoryActivity == null) {
                return;
            }
            if (i == 0) {
                LogUtil.a("BloodSugarHistoryActivity", "DeleteDataResponseCallback delete successful");
                this.f27439b = 0;
            } else {
                LogUtil.e("BloodSugarHistoryActivity", "DeleteDataResponseCallback delete failed");
            }
            Message messageObtainMessage = bloodSugarHistoryActivity.l.obtainMessage();
            messageObtainMessage.what = 2;
            messageObtainMessage.arg1 = this.f27439b;
            messageObtainMessage.arg2 = this.d;
            bloodSugarHistoryActivity.l.sendMessage(messageObtainMessage);
        }
    }

    static class b implements Comparator<uvy>, Serializable {
        private static final long serialVersionUID = 3968849440072396774L;

        private b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int compare(uvy uvyVar, uvy uvyVar2) {
            long jA = uvyVar.a();
            long jA2 = uvyVar2.a();
            if (Long.compare(jA, jA2) < 0) {
                return 1;
            }
            return jA2 == jA ? 0 : -1;
        }
    }

    static class g implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<BloodSugarHistoryActivity> f27443a;

        g(BloodSugarHistoryActivity bloodSugarHistoryActivity) {
            this.f27443a = new WeakReference<>(bloodSugarHistoryActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            Message messageObtainMessage;
            BloodSugarHistoryActivity bloodSugarHistoryActivity = this.f27443a.get();
            if (bloodSugarHistoryActivity == null) {
                return;
            }
            if (i == 0) {
                LogUtil.a("BloodSugarHistoryActivity", "InsertBloodSugarResponseCallback, insert successful");
                messageObtainMessage = bloodSugarHistoryActivity.l.obtainMessage(3, 0, 0);
            } else {
                LogUtil.e("BloodSugarHistoryActivity", "InsertBloodSugarResponseCallback, insert fail");
                messageObtainMessage = bloodSugarHistoryActivity.l.obtainMessage(3, -1, 0);
            }
            bloodSugarHistoryActivity.l.sendMessage(messageObtainMessage);
        }
    }

    static class d implements HiDataClientListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f27441a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<BloodSugarHistoryActivity> f27442b;
        private final IBaseResponseCallback e;

        d(BloodSugarHistoryActivity bloodSugarHistoryActivity, Object obj, IBaseResponseCallback iBaseResponseCallback) {
            this.f27442b = new WeakReference<>(bloodSugarHistoryActivity);
            this.f27441a = obj;
            this.e = iBaseResponseCallback;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataClientListener
        public void onResult(List<HiHealthClient> list) {
            BloodSugarHistoryActivity bloodSugarHistoryActivity = this.f27442b.get();
            if (bloodSugarHistoryActivity == null) {
                return;
            }
            c(list);
            b(bloodSugarHistoryActivity, list);
        }

        private void c(List<HiHealthClient> list) {
            Object obj = this.f27441a;
            if (obj instanceof HiHealthData) {
                nkb.d().d(BaseApplication.getContext(), (HiHealthData) obj, njy.e(list) ? null : list.get(0).getPackageName(), this.e);
            }
        }

        private void b(BloodSugarHistoryActivity bloodSugarHistoryActivity, List<HiHealthClient> list) {
            Object obj = this.f27441a;
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                if (list == null || list.size() <= 0) {
                    LogUtil.e("BloodSugarHistoryActivity", "getDataSourceType clientList is null or size is 0");
                    return;
                }
                HashMap map = new HashMap(16);
                Iterator<HiHealthClient> it = list.iterator();
                int i = 0;
                while (it.hasNext()) {
                    map.put(Integer.valueOf(iArr[i]), Boolean.valueOf(wgr.a(it.next())));
                    i++;
                }
                LogUtil.a("BloodSugarHistoryActivity", "end setDataSourceType");
                for (uvy uvyVar : bloodSugarHistoryActivity.f27431c) {
                    if (njy.e(uvyVar.c())) {
                        LogUtil.j("BloodSugarHistoryActivity", "data.getOneDayList() is null");
                        return;
                    }
                    for (uvy.e eVar : uvyVar.c()) {
                        Boolean bool = (Boolean) map.get(Integer.valueOf(eVar.e()));
                        if (bool != null) {
                            eVar.c(bool.booleanValue());
                        } else {
                            eVar.c(false);
                        }
                    }
                }
                bloodSugarHistoryActivity.l.sendEmptyMessage(4);
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
