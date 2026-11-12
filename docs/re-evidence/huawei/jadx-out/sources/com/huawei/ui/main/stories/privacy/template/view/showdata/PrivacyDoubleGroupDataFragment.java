package com.huawei.ui.main.stories.privacy.template.view.showdata;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.subtab.HealthSubTabWidget;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.activity.healthdata.InputBloodPressureActivity;
import com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback;
import com.huawei.ui.main.stories.privacy.datasourcemanager.bean.SourceInfo;
import com.huawei.ui.main.stories.privacy.template.model.adapter.BloodPressureDoubleGroupAdapter;
import com.huawei.ui.main.stories.privacy.template.model.adapter.DoubleGroupDataAdapter;
import com.huawei.ui.main.stories.privacy.template.model.bean.PageModelArgs;
import com.huawei.ui.main.stories.privacy.template.model.bean.PrivacyDataModel;
import com.huawei.ui.main.stories.privacy.template.model.config.PrivacyDataFragmentConfig;
import com.huawei.ui.main.stories.privacy.template.view.PrivacyDataDetailMvpFragment;
import com.huawei.ui.main.stories.privacy.template.view.component.PrivacyDoubleGroupDataView;
import com.huawei.uikit.hwviewpager.widget.HwViewPager;
import defpackage.dfi;
import defpackage.dfr;
import defpackage.njy;
import defpackage.qpo;
import defpackage.qpx;
import defpackage.qrs;
import defpackage.vzo;
import defpackage.whr;
import defpackage.whx;
import defpackage.wig;
import defpackage.wjr;
import defpackage.xfz;
import health.compact.a.CloudUtils;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes19.dex */
public class PrivacyDoubleGroupDataFragment extends PrivacyDataDetailMvpFragment<whx> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f28743a = "PrivacyDoubleGroupDataFragment";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<whr> f28744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer[] f28745c;
    private Map<Integer, CategoryDoubleGroupLayout> d;
    private int e;
    private DoubleGroupDataAdapter f;
    private PrivacyDoubleGroupDataView g;
    private LinearLayout h;
    private RelativeLayout i;
    private whx j;
    private List<Integer> k;
    private HealthViewPager l;
    private HealthSubTabWidget m;
    private View o;

    public static PrivacyDoubleGroupDataFragment d(PrivacyDataFragmentConfig privacyDataFragmentConfig, PageModelArgs pageModelArgs, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_config", privacyDataFragmentConfig);
        bundle.putParcelable("extra_page_model_args", pageModelArgs);
        bundle.putParcelable("extra_source_info", parcelable);
        PrivacyDoubleGroupDataFragment privacyDoubleGroupDataFragment = new PrivacyDoubleGroupDataFragment();
        privacyDoubleGroupDataFragment.setArguments(bundle);
        return privacyDoubleGroupDataFragment;
    }

    @Override // com.huawei.ui.main.stories.privacy.template.view.PrivacyDataDetailMvpFragment
    public boolean onBackPressed() {
        View view = this.o;
        if (view != null && view.getVisibility() == 0) {
            return this.d.get(this.f28745c[this.l.getCurrentItem()]).onBackPressed();
        }
        return super.onBackPressed();
    }

    public void b(List<whr> list) {
        this.f28744b = list;
        this.i.setVisibility(8);
        if (njy.e(this.f28744b)) {
            this.h.setVisibility(0);
            this.mSpinnerCustomTitleBar.setRightThirdKeyVisibility(8);
            showRtlLanguage();
        } else {
            this.f.e(this.f28744b);
            j();
        }
        if (wig.d(this.mPageModelArgs)) {
            setUiState(1);
        }
    }

    private void j() {
        if (this.mPageType == 107 && this.mSubPageType == 1) {
            this.mSpinnerCustomTitleBar.setRightThirdKeyBackground(wig.e(R.drawable.arrow_right_up_and_square_xxxhdpi), "");
            this.mSpinnerCustomTitleBar.setRightThirdKeyVisibility(0);
            this.mSpinnerCustomTitleBar.setRightThirdKeyOnClickListener(new View.OnClickListener() { // from class: wjj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f52101c.e(view);
                }
            });
        }
    }

    public /* synthetic */ void e(View view) {
        wjr.i();
        if (SharedPreferenceManager.b("HiHealthService", "pullAllStatus", true) || !CloudUtils.a()) {
            MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
            if (marketRouterApi == null) {
                LogUtil.j(f28743a, "marketRouterApi is null");
                return;
            } else {
                marketRouterApi.router("huaweischeme://healthapp/router/openwith?address=com.huawei.health.h5.health-data-subpage?h5pro=true&urlType=4&pName=com.huawei.health&path=exportBloodPressuredata");
                return;
            }
        }
        TextView textView = new TextView(getContext());
        textView.setText(getString(R.string.IDS_blood_pressure_export_sync_message));
        textView.setTextSize(0, getResources().getDimension(R.dimen.textSizeBody1));
        textView.setTextColor(ContextCompat.getColor(getContext(), R.color.textColorPrimary));
        new CustomAlertDialog.Builder(getContext()).b(getString(R.string.IDS_blood_pressure_export_data_loading_prompt)).a(textView).d(R.string.IDS_know_blood_pressure, new DialogInterface.OnClickListener() { // from class: wjk
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).e(true).b().show();
    }

    public void c(Map<Integer, List<whr>> map) {
        CategoryDoubleGroupLayout categoryDoubleGroupLayout;
        Map<Integer, CategoryDoubleGroupLayout> map2 = this.d;
        if (map2 == null || map2.size() == 0) {
            LogUtil.a(f28743a, "PrivacyDoubleGroupDataFragment mCategoryDoubleGroupLayoutMap == null or is empty");
            return;
        }
        this.i.setVisibility(8);
        this.o.setVisibility(0);
        for (Map.Entry<Integer, CategoryDoubleGroupLayout> entry : this.d.entrySet()) {
            entry.getValue().c(map != null ? map.get(entry.getKey()) : null);
        }
        if (!wig.d(this.mPageModelArgs) || (categoryDoubleGroupLayout = this.d.get(Integer.valueOf(this.e))) == null) {
            return;
        }
        categoryDoubleGroupLayout.setUiState(1);
    }

    public void d() {
        if (this.mPageType == 107 && this.mSubPageType != 1) {
            this.mSpinnerCustomTitleBar.setRightThirdKeyVisibility(8);
        }
        whx whxVar = this.j;
        if (whxVar != null) {
            whxVar.c(this.mPageModelArgs);
        }
    }

    public void a() {
        if (this.j != null) {
            this.mPageModelArgs.putLong("startTime", Long.MIN_VALUE);
            this.mPageModelArgs.putLong("endTime", Long.MIN_VALUE);
            this.mCustomTitleBar.setAppBarVisible(false);
            this.mSpinnerCustomTitleBar.setAppBarVisible(true);
            this.j.c(this.mPageModelArgs);
            return;
        }
        LogUtil.e(f28743a, "loadAllData mDoubleGroupDataPresenter is null");
    }

    public void e(boolean z) {
        HealthViewPager healthViewPager = this.l;
        if (healthViewPager == null || this.m == null) {
            return;
        }
        healthViewPager.setIsScroll(z);
        this.m.setClickable(z);
    }

    public int c() {
        HealthSubTabWidget healthSubTabWidget = this.m;
        if (healthSubTabWidget == null) {
            return 0;
        }
        return healthSubTabWidget.getHeight();
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
        return !njy.e(this.f28744b);
    }

    @Override // com.huawei.ui.main.stories.privacy.template.view.PrivacyDataDetailMvpFragment
    public void onDeleteBtnClicked() {
        View view = this.o;
        if (view != null && view.getVisibility() == 0) {
            CategoryDoubleGroupLayout categoryDoubleGroupLayout = this.d.get(Integer.valueOf(this.e));
            if (categoryDoubleGroupLayout != null) {
                categoryDoubleGroupLayout.setUiState(2);
                return;
            }
            return;
        }
        setUiState(2);
    }

    @Override // com.huawei.ui.main.stories.privacy.template.view.PrivacyDataDetailMvpFragment
    public int getCheckedCount() {
        return this.f.c();
    }

    @Override // com.huawei.ui.main.stories.privacy.template.view.PrivacyDataDetailMvpFragment
    public int getTotalCount() {
        return this.f.g();
    }

    @Override // com.huawei.ui.main.stories.privacy.template.view.PrivacyDataDetailMvpFragment
    public void onToolBarStatusChanged(int i) {
        if (i == 1) {
            this.f.b(1);
            return;
        }
        if (i == 2) {
            this.f.b(2);
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
        this.f.a(z);
    }

    @Override // com.huawei.ui.main.stories.privacy.template.view.PrivacyDataDetailMvpFragment
    public void deleteDate() {
        if (this.mDataManager == null) {
            return;
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
        vzo vzoVar = new vzo(i, deviceUniqueCode, packageName);
        if (this.mPageType == 107) {
            wjr.a();
        }
        this.mDataManager.d(this.f.b(), vzoVar, new DataSourceCallback() { // from class: wji
            @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
            public final void onResponse(int i2, Object obj) {
                this.d.a(i2, (Boolean) obj);
            }
        });
    }

    public /* synthetic */ void a(int i, Boolean bool) {
        int i2;
        LogUtil.a(f28743a, "deleteData callBack code : ", Integer.valueOf(i));
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
        d();
    }

    @Override // com.huawei.ui.main.stories.privacy.template.view.PrivacyDataDetailMvpFragment
    public void clickSpinner(int i) {
        if (this.mPageType == 107) {
            c(i);
        }
    }

    @Override // com.huawei.ui.main.stories.template.health.HealthMvpFragment
    public View getContentView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.privacy_fragment_data, viewGroup, false);
    }

    @Override // com.huawei.ui.main.stories.privacy.template.view.PrivacyDataDetailMvpFragment, com.huawei.ui.main.stories.template.health.HealthMvpFragment
    public void initViews(View view) {
        super.initViews(view);
        this.e = this.mPageModelArgs.getInt("categoryType");
        this.j = (whx) getPresenter();
        this.i = (RelativeLayout) view.findViewById(R.id.privacy_data_loading);
        this.h = (LinearLayout) view.findViewById(R.id.no_data_source);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.privacy_data_fragment_container);
        b(linearLayout);
        initComponent(linearLayout);
        e();
        b();
        if (this.mPageModelArgs.getLong("startTime") == Long.MIN_VALUE || this.mPageType != 107) {
            return;
        }
        this.mPrivacyDataModelActivity.setTitle(getString(R.string.IDS_privacy_bp_abnormal_data));
        this.mCustomTitleBar.setAppBarVisible(true);
        this.mSpinnerCustomTitleBar.setAppBarVisible(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        LogUtil.a(f28743a, "onActivityResult requestCode ", Integer.valueOf(i), " resultCode ", Integer.valueOf(i2));
        if (i2 == -1 && i == 1) {
            d();
            return;
        }
        if (i2 == -1 && i == 2 && intent != null) {
            boolean booleanExtra = intent.getBooleanExtra("edit", false);
            if (Objects.equals(intent.getStringExtra("result"), "true") || booleanExtra) {
                d();
            }
        }
    }

    private void b(ViewGroup viewGroup) {
        if (wig.h(this.mPageModelArgs)) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.privacy_tab_layout_double, (ViewGroup) null);
            this.o = viewInflate;
            viewGroup.addView(viewInflate);
            HealthSubTabWidget healthSubTabWidget = (HealthSubTabWidget) this.o.findViewById(R.id.privacy_tab);
            this.m = healthSubTabWidget;
            healthSubTabWidget.setBackgroundColor(getContext().getColor(R.color.health_chart_extend_background_color));
            this.l = (HealthViewPager) this.o.findViewById(R.id.privacy_view_pager);
            this.d = new LinkedHashMap(10);
            String[] strArrH = wig.h(this.mPageType);
            Integer[] numArrC = wig.c(this.mPageType);
            this.f28745c = numArrC;
            if (this.e == Integer.MIN_VALUE) {
                this.e = numArrC[0].intValue();
            }
            qpo qpoVar = new qpo(this.l, this.m);
            for (int i = 0; i < strArrH.length; i++) {
                xfz xfzVarB = this.m.b(strArrH[i]);
                CategoryDoubleGroupLayout categoryDoubleGroupLayout = new CategoryDoubleGroupLayout(getContext(), getActivity(), this, this.mPageModelArgs);
                this.d.put(this.f28745c[i], categoryDoubleGroupLayout);
                if (this.e == this.f28745c[i].intValue()) {
                    qpoVar.c(xfzVarB, categoryDoubleGroupLayout, true);
                    categoryDoubleGroupLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.ui.main.stories.privacy.template.view.showdata.PrivacyDoubleGroupDataFragment.5
                        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                        public void onGlobalLayout() {
                            PrivacyDoubleGroupDataFragment.this.m.d(PrivacyDoubleGroupDataFragment.this.m.getSelectedSubTabPostion());
                            PrivacyDoubleGroupDataFragment.this.m.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        }
                    });
                } else {
                    qpoVar.c(xfzVarB, categoryDoubleGroupLayout, false);
                }
            }
            this.l.addOnPageChangeListener(new HwViewPager.b() { // from class: com.huawei.ui.main.stories.privacy.template.view.showdata.PrivacyDoubleGroupDataFragment.3
                @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.b, com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
                public void onPageSelected(int i2) {
                    wjr.d(2, i2);
                    PrivacyDoubleGroupDataFragment privacyDoubleGroupDataFragment = PrivacyDoubleGroupDataFragment.this;
                    privacyDoubleGroupDataFragment.e = privacyDoubleGroupDataFragment.f28745c[i2].intValue();
                    CategoryDoubleGroupLayout categoryDoubleGroupLayout2 = (CategoryDoubleGroupLayout) PrivacyDoubleGroupDataFragment.this.d.get(Integer.valueOf(PrivacyDoubleGroupDataFragment.this.e));
                    if (categoryDoubleGroupLayout2 != null) {
                        categoryDoubleGroupLayout2.setUiState(1);
                    }
                }
            });
        }
    }

    private void e() {
        if (this.mComponents instanceof PrivacyDoubleGroupDataView) {
            this.g = (PrivacyDoubleGroupDataView) this.mComponents;
        }
        PrivacyDoubleGroupDataView privacyDoubleGroupDataView = this.g;
        if (privacyDoubleGroupDataView == null) {
            LogUtil.e(f28743a, "initDoubleGroupDataView mDoubleGroupDataView == null");
            return;
        }
        privacyDoubleGroupDataView.setOverScrollMode(2);
        if (this.mPageType == 107 && this.mDataSource == 3) {
            this.f = new BloodPressureDoubleGroupAdapter();
        } else {
            this.f = new DoubleGroupDataAdapter();
        }
        this.f.b(!this.mIsOtherManufacturer);
        this.f.d(new DoubleGroupDataAdapter.OnItemClickListener() { // from class: com.huawei.ui.main.stories.privacy.template.view.showdata.PrivacyDoubleGroupDataFragment.4
            @Override // com.huawei.ui.main.stories.privacy.template.model.adapter.DoubleGroupDataAdapter.OnItemClickListener
            public void onItemClick(DoubleGroupDataAdapter.f fVar) {
                PrivacyDoubleGroupDataFragment.this.c(fVar);
            }
        });
        this.f.d(new DoubleGroupDataAdapter.OnItemLongClickListener() { // from class: com.huawei.ui.main.stories.privacy.template.view.showdata.PrivacyDoubleGroupDataFragment.1
            @Override // com.huawei.ui.main.stories.privacy.template.model.adapter.DoubleGroupDataAdapter.OnItemLongClickListener
            public void onItemLongClick(DoubleGroupDataAdapter.f fVar) {
                if (PrivacyDoubleGroupDataFragment.this.isSupportLongClick()) {
                    PrivacyDoubleGroupDataFragment.this.showDelConfirmDialog(true);
                }
            }
        });
        this.g.setAdapter(this.f);
        this.g.setLayoutManager(new LinearLayoutManager(getContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(DoubleGroupDataAdapter.f fVar) {
        if (this.mIsOtherManufacturer) {
            return;
        }
        if (this.mToolBarManager.b() != 1) {
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
        a(this.f.e(fVar));
    }

    private void a(PrivacyDataModel privacyDataModel) {
        if (this.mPageType != 107) {
            return;
        }
        d(privacyDataModel);
    }

    private void d(PrivacyDataModel privacyDataModel) {
        if (privacyDataModel == null) {
            LogUtil.j(f28743a, "startBloodPressurePage dataModel is null");
            return;
        }
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

    private void b() {
        int iIndexOf;
        if (this.mDataSource != 3) {
            return;
        }
        List<Integer> listF = wig.f(this.mPageType);
        this.k = listF;
        if (listF == null || listF.size() == 0) {
            return;
        }
        if (this.k.contains(Integer.valueOf(this.mSubPageType))) {
            iIndexOf = this.k.indexOf(Integer.valueOf(this.mSubPageType));
        } else {
            this.mSubPageType = this.k.get(0).intValue();
            iIndexOf = 0;
        }
        initSpinner(wig.b(this.mPageType), iIndexOf);
    }

    private void c(int i) {
        if (njy.e(this.k, i)) {
            LogUtil.j(f28743a, "selectBpSubpage mSubpageTypeList isOutOfBounds");
            return;
        }
        wjr.d(i, 0);
        h();
        this.mPageModelArgs.putInt("Subpage", this.k.get(i).intValue());
        this.mSubPageType = this.k.get(i).intValue();
        d();
    }

    private void h() {
        View view = this.o;
        if (view != null) {
            view.setVisibility(8);
        }
        this.h.setVisibility(8);
        this.i.setVisibility(0);
    }
}
