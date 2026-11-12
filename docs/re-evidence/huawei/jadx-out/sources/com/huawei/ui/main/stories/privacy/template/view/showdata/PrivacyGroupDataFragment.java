package com.huawei.ui.main.stories.privacy.template.view.showdata;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.subtab.HealthSubTabWidget;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.activity.healthdata.InputBloodPressureActivity;
import com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback;
import com.huawei.ui.main.stories.privacy.datasourcemanager.bean.SourceInfo;
import com.huawei.ui.main.stories.privacy.template.model.adapter.BloodOxygenGroupAdapter;
import com.huawei.ui.main.stories.privacy.template.model.adapter.BloodPressureGroupAdapter;
import com.huawei.ui.main.stories.privacy.template.model.adapter.GroupDataAdapter;
import com.huawei.ui.main.stories.privacy.template.model.bean.PageModelArgs;
import com.huawei.ui.main.stories.privacy.template.model.bean.PrivacyDataModel;
import com.huawei.ui.main.stories.privacy.template.model.config.PrivacyDataFragmentConfig;
import com.huawei.ui.main.stories.privacy.template.view.PrivacyDataDetailMvpFragment;
import com.huawei.ui.main.stories.privacy.template.view.component.PrivacyGroupDataView;
import com.huawei.uikit.hwviewpager.widget.HwViewPager;
import defpackage.dfi;
import defpackage.dfr;
import defpackage.njy;
import defpackage.paw;
import defpackage.qpo;
import defpackage.qpx;
import defpackage.qrs;
import defpackage.vzo;
import defpackage.whj;
import defpackage.whv;
import defpackage.whz;
import defpackage.wig;
import defpackage.wjr;
import defpackage.xfz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class PrivacyGroupDataFragment extends PrivacyDataDetailMvpFragment<whv> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<Integer, CategoryGroupLayout> f28747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CustomAlertDialog f28748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28749c;
    private Integer[] d;
    private List<whz> e = new ArrayList(16);
    private long f;
    private GroupDataAdapter g;
    private PrivacyGroupDataView h;
    private HealthTextView i;
    private whv j;
    private List<SourceInfo> k;
    private List<String> l;
    private LinearLayout m;
    private PageModelArgs n;
    private RelativeLayout o;
    private HealthViewPager p;
    private HealthSubTabWidget q;
    private View r;
    private int s;
    private List<Integer> t;

    public static PrivacyGroupDataFragment a(PrivacyDataFragmentConfig privacyDataFragmentConfig, PageModelArgs pageModelArgs, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_config", privacyDataFragmentConfig);
        bundle.putParcelable("extra_page_model_args", pageModelArgs);
        bundle.putParcelable("extra_source_info", parcelable);
        PrivacyGroupDataFragment privacyGroupDataFragment = new PrivacyGroupDataFragment();
        privacyGroupDataFragment.setArguments(bundle);
        return privacyGroupDataFragment;
    }

    @Override // com.huawei.ui.main.stories.privacy.template.view.PrivacyDataDetailMvpFragment
    public boolean onBackPressed() {
        View view = this.r;
        if (view != null && view.getVisibility() == 0) {
            return this.f28747a.get(this.d[this.p.getCurrentItem()]).onBackPressed();
        }
        return super.onBackPressed();
    }

    public void d(boolean z) {
        HealthViewPager healthViewPager = this.p;
        if (healthViewPager == null || this.q == null) {
            return;
        }
        healthViewPager.setIsScroll(z);
        this.q.setClickable(z);
    }

    public int c() {
        HealthSubTabWidget healthSubTabWidget = this.q;
        if (healthSubTabWidget == null) {
            return 0;
        }
        return healthSubTabWidget.getHeight();
    }

    public void e(List<whz> list) {
        this.o.setVisibility(8);
        if (njy.e(list)) {
            this.g.b(this.e);
            if (this.g.isEmpty()) {
                this.m.setVisibility(0);
                showRtlLanguage();
                return;
            }
            return;
        }
        this.m.setVisibility(8);
        long jE = this.f;
        if (jE == 0) {
            jE = e();
        }
        h(list);
        this.g.b(this.e);
        if (this.h != null) {
            int groupCount = this.g.getGroupCount();
            for (int groupCount2 = this.g.getGroupCount(); groupCount2 < groupCount; groupCount2++) {
                this.h.expandGroup(groupCount2);
            }
            if (wig.b(jE, e())) {
                b();
            } else {
                this.h.expandGroup(groupCount - 1);
            }
        }
    }

    private void h() {
        long j = this.mPageModelArgs.getLong("Time");
        LogUtil.a("PrivacyGroupDataFragment", "scrollToPosition time = " + j);
        if (j == Long.MIN_VALUE) {
            return;
        }
        int size = 0;
        String strD = paw.d(j, 0);
        for (whz whzVar : this.e) {
            size++;
            if (!strD.equals(whzVar.b())) {
                size += whzVar.c().size();
            } else {
                Iterator<PrivacyDataModel> it = whzVar.c().iterator();
                while (it.hasNext() && j != it.next().getStartTime()) {
                    size++;
                }
                break;
            }
        }
        if (this.h != null) {
            int iM = (int) ((qrs.m() * 0.5f) - this.mSpinnerCustomTitleBar.getHeight());
            LogUtil.a("PrivacyGroupDataFragment", "scrollToPosition offset = " + iM);
            this.h.setSelectionFromTop(size, iM);
        }
        this.mPageModelArgs.putLong("Time", Long.MIN_VALUE);
    }

    private long e() {
        if (this.e.isEmpty()) {
            return 0L;
        }
        GroupDataAdapter groupDataAdapter = this.g;
        List<PrivacyDataModel> listC = groupDataAdapter.getGroup(groupDataAdapter.getGroupCount() - 1).c();
        return listC.get(listC.size() - 1).getStartTime();
    }

    public void b(List<whz> list) {
        this.f = e();
        if (this.mPageModelArgs.getDataSource() == 2) {
            this.e.clear();
        }
        e(list);
    }

    public void d(List<whz> list) {
        this.e = list;
        this.o.setVisibility(8);
        if (njy.e(list)) {
            this.m.setVisibility(0);
            showRtlLanguage();
        } else {
            this.g.b(this.e);
            if (this.h != null) {
                int groupCount = this.g.getGroupCount();
                for (int i = 0; i < groupCount; i++) {
                    this.h.expandGroup(i);
                }
            }
            h();
        }
        if (wig.d(this.mPageModelArgs)) {
            setUiState(1);
        }
    }

    public void d(Map<Integer, List<whz>> map) {
        CategoryGroupLayout categoryGroupLayout;
        Map<Integer, CategoryGroupLayout> map2 = this.f28747a;
        if (map2 == null || map2.size() == 0) {
            return;
        }
        this.o.setVisibility(8);
        this.r.setVisibility(0);
        for (Map.Entry<Integer, CategoryGroupLayout> entry : this.f28747a.entrySet()) {
            entry.getValue().c(map != null ? map.get(entry.getKey()) : null);
        }
        if (!wig.d(this.mPageModelArgs) || (categoryGroupLayout = this.f28747a.get(Integer.valueOf(this.f28749c))) == null) {
            return;
        }
        categoryGroupLayout.setUiState(1);
    }

    public void a(List<SourceInfo> list) {
        c(list);
    }

    private void c(List<SourceInfo> list) {
        this.k = new ArrayList(10);
        if (list != null && list.size() > 0) {
            this.k.addAll(list);
        }
        this.k.add(0, null);
        ArrayList arrayList = new ArrayList(10);
        HashMap map = new HashMap(16);
        map.put("SpinnerItemIcon", String.valueOf(R.mipmap.ic_data_source_all_black));
        map.put("SpinnerItemText", getString(R.string.IDS_privacy_all_data));
        arrayList.add(map);
        this.s = 0;
        if (list != null && list.size() > 0) {
            for (SourceInfo sourceInfo : list) {
                HashMap map2 = new HashMap(16);
                map2.put("SpinnerItemIcon", String.valueOf(sourceInfo.getIconResourceId()));
                map2.put("SpinnerItemText", sourceInfo.getDeviceName());
                arrayList.add(map2);
            }
        }
        initSpinnerWithIcon(arrayList, this.s);
    }

    private void d() {
        if (this.mDataSource != 3) {
            return;
        }
        this.l = wig.b(this.mPageType);
        List<Integer> listF = wig.f(this.mPageType);
        this.t = listF;
        if (listF == null || listF.size() == 0) {
            return;
        }
        if (this.t.contains(Integer.valueOf(this.mSubPageType))) {
            this.s = this.t.indexOf(Integer.valueOf(this.mSubPageType));
        } else {
            this.s = 0;
        }
        initSpinner(this.l, this.s);
    }

    private void h(List<whz> list) {
        whz whzVar;
        List<PrivacyDataModel> listC;
        if (list == null) {
            return;
        }
        int size = this.e.size();
        if (size == 0) {
            this.e.addAll(list);
            return;
        }
        boolean z = false;
        for (whz whzVar2 : list) {
            if (z) {
                this.e.add(whzVar2);
            } else {
                String strB = whzVar2.b();
                if (strB != null && (listC = (whzVar = this.e.get(size - 1)).c()) != null) {
                    if (strB.equals(whzVar.b())) {
                        listC.addAll(whzVar2.c());
                        z = true;
                    } else {
                        this.e.add(whzVar2);
                    }
                }
            }
        }
    }

    @Override // com.huawei.ui.main.stories.privacy.template.view.PrivacyDataDetailMvpFragment, com.huawei.ui.main.stories.template.health.HealthMvpFragment
    public void initViews(View view) {
        super.initViews(view);
        this.j = (whv) getPresenter();
        this.f28749c = this.mPageModelArgs.getInt("categoryType");
        if (this.mPageType == 107 && this.mDataSource == 3) {
            this.g = new BloodPressureGroupAdapter();
        } else if (this.mPageType == 105 && this.mDataSource == 3) {
            this.g = new BloodOxygenGroupAdapter();
        } else {
            this.g = new GroupDataAdapter();
        }
        this.o = (RelativeLayout) view.findViewById(R.id.privacy_data_loading);
        this.m = (LinearLayout) view.findViewById(R.id.no_data_source);
        this.i = (HealthTextView) view.findViewById(R.id.hint);
        j();
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.privacy_data_fragment_container);
        d(linearLayout);
        initComponent(linearLayout);
        if (this.mComponents instanceof PrivacyGroupDataView) {
            this.h = (PrivacyGroupDataView) this.mComponents;
        }
        i();
        d();
    }

    private void d(ViewGroup viewGroup) {
        if (wig.j(this.mPageModelArgs)) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.privacy_tab_layout, (ViewGroup) null);
            this.r = viewInflate;
            viewGroup.addView(viewInflate);
            HealthSubTabWidget healthSubTabWidget = (HealthSubTabWidget) this.r.findViewById(R.id.privacy_tab);
            this.q = healthSubTabWidget;
            healthSubTabWidget.setBackgroundColor(getContext().getColor(R.color.health_chart_extend_background_color));
            this.p = (HealthViewPager) this.r.findViewById(R.id.privacy_view_pager);
            this.f28747a = new HashMap(10);
            String[] strArrH = wig.h(this.mPageType);
            Integer[] numArrC = wig.c(this.mPageType);
            this.d = numArrC;
            if (this.f28749c == Integer.MIN_VALUE) {
                this.f28749c = numArrC[0].intValue();
                this.mPageModelArgs.putInt("categoryType", this.f28749c);
            }
            qpo qpoVar = new qpo(this.p, this.q);
            for (int i = 0; i < strArrH.length; i++) {
                xfz xfzVarB = this.q.b(strArrH[i]);
                CategoryGroupLayout categoryGroupLayout = new CategoryGroupLayout(getContext(), getActivity(), this, this.mPageModelArgs);
                this.f28747a.put(this.d[i], categoryGroupLayout);
                if (this.f28749c == this.d[i].intValue()) {
                    qpoVar.c(xfzVarB, categoryGroupLayout, true);
                } else {
                    qpoVar.c(xfzVarB, categoryGroupLayout, false);
                }
            }
            this.p.addOnPageChangeListener(new HwViewPager.b() { // from class: com.huawei.ui.main.stories.privacy.template.view.showdata.PrivacyGroupDataFragment.4
                @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.b, com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
                public void onPageSelected(int i2) {
                    PrivacyGroupDataFragment privacyGroupDataFragment = PrivacyGroupDataFragment.this;
                    privacyGroupDataFragment.f28749c = privacyGroupDataFragment.d[i2].intValue();
                    PrivacyGroupDataFragment.this.mPageModelArgs.putInt("categoryType", PrivacyGroupDataFragment.this.f28749c);
                    CategoryGroupLayout categoryGroupLayout2 = (CategoryGroupLayout) PrivacyGroupDataFragment.this.f28747a.get(PrivacyGroupDataFragment.this.d[i2]);
                    if (categoryGroupLayout2 != null) {
                        categoryGroupLayout2.setTitleBarState(1);
                    }
                    if (PrivacyGroupDataFragment.this.mPageType == 106) {
                        wjr.f();
                    }
                }
            });
        }
    }

    private void i() {
        PrivacyGroupDataView privacyGroupDataView = this.h;
        if (privacyGroupDataView == null) {
            LogUtil.j("PrivacyGroupDataFragment", "setAllDataViewInfo mGroupDataView is null");
            return;
        }
        privacyGroupDataView.setAdapter(this.g);
        this.g.c(!this.mIsOtherManufacturer);
        this.h.setDividerHeight(0);
        this.h.setLoadMoreListener(new PrivacyGroupDataView.LoadMoreListener() { // from class: wjn
            @Override // com.huawei.ui.main.stories.privacy.template.view.component.PrivacyGroupDataView.LoadMoreListener
            public final void loadMore() {
                this.f52103a.b();
            }
        });
        this.h.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() { // from class: com.huawei.ui.main.stories.privacy.template.view.showdata.PrivacyGroupDataFragment$$ExternalSyntheticLambda1
            @Override // android.widget.ExpandableListView.OnGroupClickListener
            public final boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long j) {
                return this.d.d(expandableListView, view, i, j);
            }
        });
        this.g.c(new GroupDataAdapter.OnItemClickListener() { // from class: wjl
            @Override // com.huawei.ui.main.stories.privacy.template.model.adapter.GroupDataAdapter.OnItemClickListener
            public final void onItemClickListener(int i, int i2) {
                this.e.b(i, i2);
            }
        });
        this.g.b(new GroupDataAdapter.OnLongClickListener() { // from class: wjm
            @Override // com.huawei.ui.main.stories.privacy.template.model.adapter.GroupDataAdapter.OnLongClickListener
            public final void onLongClickListener(int i, int i2) {
                this.f52102a.c(i, i2);
            }
        });
    }

    /* synthetic */ boolean d(ExpandableListView expandableListView, View view, int i, long j) {
        LogUtil.d("PrivacyGroupDataFragment", expandableListView.isGroupExpanded(i) + ";" + i);
        if (i != this.g.getGroupCount() - 1 || !expandableListView.isGroupExpanded(i)) {
            return false;
        }
        b();
        return false;
    }

    public /* synthetic */ void c(int i, int i2) {
        if (isSupportLongClick()) {
            this.g.d(i, i2);
            if (this.mPageType == 103) {
                wjr.d(1, getTotalCount() == getCheckedCount());
            }
            showDelConfirmDialog(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, int i2) {
        if (this.mIsOtherManufacturer) {
            return;
        }
        if (this.mToolBarManager.b() != 1) {
            this.g.d(i, i2);
            setTitleBarState(2);
            if (getCheckedCount() == getTotalCount()) {
                this.mToolBarManager.e(4);
                return;
            } else {
                this.mToolBarManager.e(2);
                return;
            }
        }
        if (qrs.c(500)) {
            return;
        }
        d(this.g.c(i, i2));
    }

    private void d(PrivacyDataModel privacyDataModel) {
        int i = this.mPageType;
        if (i == 103) {
            PageModelArgs pageModelArgsA = wig.a(this.mPageModelArgs);
            this.n = pageModelArgsA;
            pageModelArgsA.setTimestamp(privacyDataModel.getEndTime());
            this.n.setModuleType(2);
            PrivacyDataModelActivity.e(getViewContext(), this.n, this.mSourceInfoBean);
            return;
        }
        if (i != 105) {
            if (i != 112) {
                if (i == 107) {
                    b(privacyDataModel);
                    return;
                }
                if (i != 108) {
                    if (this.mPageType == 106 || this.mPageType == 113) {
                        wjr.b();
                    }
                    PageModelArgs pageModelArgsA2 = wig.a(this.mPageModelArgs);
                    this.n = pageModelArgsA2;
                    pageModelArgsA2.setTimestamp(privacyDataModel.getStartTime());
                    this.n.setModuleType(2);
                    Intent intent = new Intent(getViewContext(), (Class<?>) PrivacyDataModelActivity.class);
                    intent.putExtra("extra_page_model_args", this.n);
                    intent.putExtra("extra_source_info", this.mSourceInfoBean);
                    startActivityForResult(intent, 1);
                    return;
                }
            }
            Intent intent2 = new Intent();
            intent2.putExtra("extra_source_info", this.mSourceInfoBean);
            intent2.putExtra("extra_page_model_args", this.mPageModelArgs);
            intent2.putExtra("extra_privacy_data_model", privacyDataModel);
            intent2.setClass(getViewContext(), PrivacyDetailActivity.class);
            getViewContext().startActivity(intent2);
            return;
        }
        c(privacyDataModel);
    }

    private void b(PrivacyDataModel privacyDataModel) {
        if (this.mDataSource == 3) {
            if (dfr.b()) {
                dfi dfiVar = new dfi();
                dfiVar.a(privacyDataModel.getInt("source_type") == 3);
                dfiVar.e(privacyDataModel.getStartTime());
                dfiVar.c(privacyDataModel.getClientId());
                dfiVar.d(true);
                dfiVar.b(2);
                dfr.c(getViewContext(), dfiVar);
                return;
            }
            Intent intent = new Intent(getViewContext(), (Class<?>) InputBloodPressureActivity.class);
            intent.putExtra("high", privacyDataModel.getInt(BleConstants.BLOODPRESSURE_SYSTOLIC));
            intent.putExtra("low", privacyDataModel.getInt(BleConstants.BLOODPRESSURE_DIASTOLIC));
            if (privacyDataModel.getInt(BleConstants.BLOODPRESSURE_SPHYGMUS) != Integer.MIN_VALUE) {
                intent.putExtra("bmp", privacyDataModel.getInt(BleConstants.BLOODPRESSURE_SPHYGMUS));
            }
            intent.putExtra("measureAbnormal", privacyDataModel.getInt("measureAbnormal"));
            intent.putExtra("deletetime", privacyDataModel.getStartTime());
            intent.putExtra("clientId", privacyDataModel.getClientId());
            intent.putExtra("isInputData", privacyDataModel.getInt("source_type") == 3);
            startActivityForResult(intent, 2);
            return;
        }
        Intent intent2 = new Intent();
        intent2.putExtra("extra_source_info", this.mSourceInfoBean);
        intent2.putExtra("extra_page_model_args", this.mPageModelArgs);
        intent2.putExtra("extra_privacy_data_model", privacyDataModel);
        intent2.setClass(getViewContext(), PrivacyDetailActivity.class);
        getViewContext().startActivity(intent2);
    }

    private void c(PrivacyDataModel privacyDataModel) {
        Intent intent = new Intent();
        if (this.mDataSource == 3) {
            int i = privacyDataModel.getInt("bloodOxygenCardKey");
            if (i == 1001 || i == 1002) {
                if (i == 1001) {
                    int iC = wjr.c(i, privacyDataModel.getInt("lakeLouiseScoreKey"));
                    if (iC != 0) {
                        wjr.a(2, wjr.d(i), iC);
                    }
                } else {
                    wjr.a(2, wjr.d(i), wjr.c(i, privacyDataModel.getInt("bloodOxygenKey")));
                }
                intent.putExtra("extra_source_info", this.mSourceInfoBean);
                intent.putExtra("extra_page_model_args", this.mPageModelArgs);
                intent.putExtra("extra_privacy_data_model", privacyDataModel);
                intent.setClass(getViewContext(), PrivacyDetailActivity.class);
            } else {
                this.mPageModelArgs.setTimestamp(privacyDataModel.getStartTime());
                this.mPageModelArgs.setModuleType(2);
                intent.putExtra("extra_page_model_args", this.mPageModelArgs);
                intent.putExtra("extra_source_info", this.mSourceInfoBean);
                intent.setClass(getViewContext(), PrivacyDataModelActivity.class);
            }
        } else {
            this.mPageModelArgs.setTimestamp(privacyDataModel.getStartTime());
            this.mPageModelArgs.setModuleType(2);
            intent.putExtra("extra_page_model_args", this.mPageModelArgs);
            intent.putExtra("extra_source_info", this.mSourceInfoBean);
            intent.setClass(getViewContext(), PrivacyDataModelActivity.class);
        }
        getViewContext().startActivity(intent);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LogUtil.a("PrivacyGroupDataFragment", "onActivityResult requestCode ", Integer.valueOf(i), " resultCode ", Integer.valueOf(i2));
        if (i2 == -1 && i == 1) {
            a();
        } else if (i2 == 0 && i == 2 && intent != null && intent.getBooleanExtra("edit", false)) {
            a();
        }
    }

    public void a() {
        this.e.clear();
        whv whvVar = this.j;
        if (whvVar != null) {
            whvVar.c(this.mPageModelArgs);
        }
    }

    @Override // com.huawei.ui.main.stories.privacy.template.view.PrivacyDataDetailMvpFragment
    public boolean isShowDeleteBtn() {
        return wig.d(this.mPageModelArgs) && hasData();
    }

    @Override // com.huawei.ui.main.stories.privacy.template.view.PrivacyDataDetailMvpFragment
    public boolean isSupportLongClick() {
        return wig.d(this.mPageModelArgs) && this.mToolBarManager.b() == 1;
    }

    @Override // com.huawei.ui.main.stories.privacy.template.view.PrivacyDataDetailMvpFragment
    public boolean hasData() {
        List<whz> list = this.e;
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // com.huawei.ui.main.stories.privacy.template.view.PrivacyDataDetailMvpFragment
    public void onDeleteBtnClicked() {
        if (this.mPageType == 103) {
            wjr.d(0, false);
        }
        View view = this.r;
        if (view != null && view.getVisibility() == 0) {
            CategoryGroupLayout categoryGroupLayout = this.f28747a.get(Integer.valueOf(this.f28749c));
            if (categoryGroupLayout != null) {
                categoryGroupLayout.setUiState(2);
                return;
            }
            return;
        }
        setUiState(2);
    }

    @Override // com.huawei.ui.main.stories.privacy.template.view.PrivacyDataDetailMvpFragment
    public int getCheckedCount() {
        return this.g.d();
    }

    @Override // com.huawei.ui.main.stories.privacy.template.view.PrivacyDataDetailMvpFragment
    public int getTotalCount() {
        return this.g.a();
    }

    @Override // com.huawei.ui.main.stories.privacy.template.view.PrivacyDataDetailMvpFragment
    public void onToolBarStatusChanged(int i) {
        if (i == 1) {
            this.g.a(1);
            return;
        }
        if (i == 2) {
            this.g.a(2);
        } else if (i == 3) {
            setAllChecked(false);
        } else {
            if (i != 4) {
                return;
            }
            setAllChecked(true);
        }
    }

    @Override // com.huawei.ui.main.stories.privacy.template.view.PrivacyDataDetailMvpFragment
    public void setAllChecked(boolean z) {
        this.g.d(z);
    }

    @Override // com.huawei.ui.main.stories.privacy.template.view.PrivacyDataDetailMvpFragment
    public void deleteDate() {
        if (this.mDataManager == null) {
            return;
        }
        if (wig.c(this.mPageModelArgs)) {
            CustomAlertDialog customAlertDialogB = new CustomAlertDialog.Builder(getContext()).a(LayoutInflater.from(getContext()).inflate(R.layout.dialog_deleting, (ViewGroup) null)).b();
            this.f28748b = customAlertDialogB;
            customAlertDialogB.setCancelable(false);
            this.f28748b.show();
        }
        int i = this.mClassType;
        String deviceUniqueCode = this.mDeviceUuid;
        String packageName = this.mPackageName;
        SourceInfo sourceInfo = this.mPageModelArgs.getSourceInfo();
        if (sourceInfo != null) {
            if (sourceInfo.getSourceType() == 1) {
                packageName = sourceInfo.getPackageName();
                i = 1;
            } else {
                deviceUniqueCode = sourceInfo.getDeviceUniqueCode();
                i = 2;
            }
        }
        this.mDataManager.d(this.g.c(), new vzo(i, deviceUniqueCode, packageName), new DataSourceCallback() { // from class: wjq
            @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
            public final void onResponse(int i2, Object obj) {
                this.f52108a.c(i2, (Boolean) obj);
            }
        });
    }

    public /* synthetic */ void c(int i, Boolean bool) {
        int i2;
        LogUtil.a("PrivacyGroupDataFragment", "deleteData callBack code : " + i);
        CustomAlertDialog customAlertDialog = this.f28748b;
        if (customAlertDialog != null) {
            customAlertDialog.cancel();
            this.f28748b = null;
        }
        if (getActivity() == null) {
            return;
        }
        Context context = BaseApplication.getContext();
        if (i == 0) {
            i2 = com.huawei.plugindevice.R.string.IDS_device_wifi_clear_user_success;
        } else {
            i2 = com.huawei.plugindevice.R.string.IDS_device_wifi_delete_fail;
        }
        qpx.e(context, i2);
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        whv whvVar = this.j;
        if (whvVar == null || !whvVar.a()) {
            return;
        }
        this.j.c(this.mPageModelArgs);
    }

    @Override // com.huawei.ui.main.stories.template.health.HealthMvpFragment
    public View getContentView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.privacy_fragment_data, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        whj.a().c();
    }

    @Override // com.huawei.ui.main.stories.privacy.template.view.PrivacyDataDetailMvpFragment
    public void clickSpinner(int i) {
        if (this.mPageType == 107) {
            d(i);
        } else if (this.mPageType == 105) {
            a(i);
        } else {
            c(i);
        }
    }

    private void d(int i) {
        if (njy.e(this.t, i)) {
            LogUtil.j("PrivacyGroupDataFragment", "selectBpSubpage mSubpageTypeList isOutOfBounds");
            return;
        }
        f();
        this.mPageModelArgs.putInt("Subpage", this.t.get(i).intValue());
        a();
    }

    private void a(int i) {
        if (njy.e(this.t, i)) {
            LogUtil.j("PrivacyGroupDataFragment", "selectSpo2Subpage mSubpageTypeList isOutOfBounds");
            return;
        }
        wjr.a(this.t.get(i).intValue());
        f();
        this.g.b(new ArrayList());
        this.mPageModelArgs.putInt("Subpage", this.t.get(i).intValue());
        a();
    }

    private void c(int i) {
        if (njy.e(this.k, i)) {
            LogUtil.j("PrivacyGroupDataFragment", "selectSource mSourceList isOutOfBounds");
            return;
        }
        SourceInfo sourceInfo = this.k.get(i);
        if (this.mPageType == 103) {
            wjr.c(wjr.b(sourceInfo));
        }
        this.mPageModelArgs.setSourceInfo(sourceInfo);
        j();
        f();
        a();
    }

    private void f() {
        View view = this.r;
        if (view != null) {
            view.setVisibility(8);
        }
        this.m.setVisibility(8);
        this.o.setVisibility(0);
    }

    private void j() {
        if (this.mPageType == 103 && this.mDataSource == 3) {
            if (this.mPageModelArgs.getSourceInfo() == null) {
                this.i.setVisibility(0);
            } else {
                this.i.setVisibility(8);
            }
        }
    }
}
