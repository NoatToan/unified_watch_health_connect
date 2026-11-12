package com.huawei.ui.main.stories.privacy.template.view.showdata;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.activity.healthdata.InputBloodPressureActivity;
import com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback;
import com.huawei.ui.main.stories.privacy.datasourcemanager.bean.SourceInfo;
import com.huawei.ui.main.stories.privacy.template.model.adapter.BloodPressureDoubleGroupAdapter;
import com.huawei.ui.main.stories.privacy.template.model.adapter.DoubleGroupDataAdapter;
import com.huawei.ui.main.stories.privacy.template.model.bean.PageModelArgs;
import com.huawei.ui.main.stories.privacy.template.model.bean.PrivacyDataModel;
import com.huawei.ui.main.stories.privacy.template.view.component.PrivacyDoubleGroupDataView;
import defpackage.dfi;
import defpackage.dfr;
import defpackage.njy;
import defpackage.paw;
import defpackage.qpx;
import defpackage.qrs;
import defpackage.vzo;
import defpackage.whr;
import defpackage.whz;
import defpackage.wjr;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class CategoryDoubleGroupLayout extends CategoryCommonLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f28724a = "CategoryDoubleGroupLayout";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PrivacyDoubleGroupDataFragment f28725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<whr> f28726c;
    private DoubleGroupDataAdapter d;
    private PrivacyDoubleGroupDataView e;
    private HealthButton f;
    private LinearLayoutManager i;
    private LinearLayout j;

    public CategoryDoubleGroupLayout(Context context, Activity activity, Fragment fragment, PageModelArgs pageModelArgs) {
        super(context, activity, pageModelArgs);
        if (fragment instanceof PrivacyDoubleGroupDataFragment) {
            this.f28725b = (PrivacyDoubleGroupDataFragment) fragment;
        }
        initViews();
    }

    public void c(List<whr> list) {
        this.f28726c = list;
        b();
    }

    @Override // com.huawei.ui.main.stories.privacy.template.view.showdata.CategoryCommonLayout
    protected int getLayoutId() {
        return R.layout.privacy_fragment_data;
    }

    @Override // com.huawei.ui.main.stories.privacy.template.view.showdata.CategoryCommonLayout
    protected void initViews() {
        super.initViews();
        ((RelativeLayout) findViewById(R.id.privacy_data_loading)).setVisibility(8);
        this.j = (LinearLayout) findViewById(R.id.no_data_source);
        HealthButton healthButton = (HealthButton) findViewById(R.id.load_all);
        this.f = healthButton;
        healthButton.setOnClickListener(new View.OnClickListener() { // from class: wir
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f52087b.c(view);
            }
        });
        d();
    }

    @Override // com.huawei.ui.main.stories.privacy.template.view.showdata.CategoryCommonLayout
    protected boolean hasData() {
        return !njy.e(this.f28726c);
    }

    @Override // com.huawei.ui.main.stories.privacy.template.view.showdata.CategoryCommonLayout
    protected int getCheckedCount() {
        return this.d.c();
    }

    @Override // com.huawei.ui.main.stories.privacy.template.view.showdata.CategoryCommonLayout
    protected int getTotalCount() {
        return this.d.g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.ui.main.stories.privacy.template.view.showdata.CategoryCommonLayout
    public void onToolBarStatusChanged(int i) {
        if (i == 1) {
            if (this.mPageModelArgs.getLong("startTime") != Long.MIN_VALUE) {
                this.f.setVisibility(0);
            } else {
                this.f.setVisibility(8);
            }
            this.d.b(1);
            this.f28725b.e(true);
            return;
        }
        if (i == 2) {
            this.f.setVisibility(8);
            this.d.b(2);
            this.f28725b.e(false);
        } else if (i == 3) {
            setAllChecked(false);
        } else {
            if (i != 4) {
                return;
            }
            setAllChecked(true);
        }
    }

    @Override // com.huawei.ui.main.stories.privacy.template.view.showdata.CategoryCommonLayout
    protected void setAllChecked(boolean z) {
        this.d.a(z);
    }

    @Override // com.huawei.ui.main.stories.privacy.template.view.showdata.CategoryCommonLayout
    protected void deleteDate() {
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
        this.mDataManager.d(this.d.b(), vzoVar, new DataSourceCallback() { // from class: wis
            @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
            public final void onResponse(int i2, Object obj) {
                this.e.c(i2, (Boolean) obj);
            }
        });
    }

    public /* synthetic */ void c(int i, Boolean bool) {
        int i2;
        LogUtil.a(f28724a, "deleteData callBack code : " + i);
        Context context = getContext();
        if (i == 0) {
            i2 = com.huawei.plugindevice.R.string.IDS_device_wifi_clear_user_success;
        } else {
            i2 = com.huawei.plugindevice.R.string.IDS_device_wifi_delete_fail;
        }
        qpx.e(context, i2);
        this.f28725b.d();
    }

    private void b() {
        if (this.e == null) {
            return;
        }
        if (njy.e(this.f28726c)) {
            this.j.setVisibility(0);
            showRtlLanguage();
        } else {
            this.j.setVisibility(8);
            this.d.e(this.f28726c);
            e();
        }
    }

    private void d() {
        PrivacyDoubleGroupDataView privacyDoubleGroupDataView = new PrivacyDoubleGroupDataView(getContext());
        this.e = privacyDoubleGroupDataView;
        privacyDoubleGroupDataView.setOverScrollMode(2);
        ((LinearLayout) findViewById(R.id.privacy_data_fragment_container)).addView(this.e);
        if (this.mPageType == 107) {
            this.d = new BloodPressureDoubleGroupAdapter();
        } else {
            this.d = new DoubleGroupDataAdapter();
        }
        this.d.b(!this.mIsOtherManufacturer);
        this.d.d(new DoubleGroupDataAdapter.OnItemClickListener() { // from class: wiw
            @Override // com.huawei.ui.main.stories.privacy.template.model.adapter.DoubleGroupDataAdapter.OnItemClickListener
            public final void onItemClick(DoubleGroupDataAdapter.f fVar) {
                this.f52090a.e(fVar);
            }
        });
        this.d.d(new DoubleGroupDataAdapter.OnItemLongClickListener() { // from class: wiu
            @Override // com.huawei.ui.main.stories.privacy.template.model.adapter.DoubleGroupDataAdapter.OnItemLongClickListener
            public final void onItemLongClick(DoubleGroupDataAdapter.f fVar) {
                this.f52088c.d(fVar);
            }
        });
        this.e.setAdapter(this.d);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.i = linearLayoutManager;
        this.e.setLayoutManager(linearLayoutManager);
    }

    public /* synthetic */ void d(DoubleGroupDataAdapter.f fVar) {
        if (isSupportLongClick()) {
            showDelConfirmDialog(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(DoubleGroupDataAdapter.f fVar) {
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
        b(this.d.e(fVar));
    }

    private void b(PrivacyDataModel privacyDataModel) {
        if (this.mPageType != 107) {
            return;
        }
        d(privacyDataModel);
    }

    private void d(PrivacyDataModel privacyDataModel) {
        if (privacyDataModel == null) {
            LogUtil.j(f28724a, "startBpPage dataModel is null");
            return;
        }
        if (dfr.b()) {
            dfi dfiVar = new dfi();
            dfiVar.a(privacyDataModel.getInt("source_type") == 3);
            dfiVar.e(privacyDataModel.getStartTime());
            dfiVar.c(privacyDataModel.getClientId());
            dfiVar.d(true);
            dfiVar.b(2);
            dfr.c(getContext(), dfiVar);
            return;
        }
        Intent intent = new Intent(getContext(), (Class<?>) InputBloodPressureActivity.class);
        intent.putExtra("high", privacyDataModel.getInt(BleConstants.BLOODPRESSURE_SYSTOLIC));
        intent.putExtra("low", privacyDataModel.getInt(BleConstants.BLOODPRESSURE_DIASTOLIC));
        if (privacyDataModel.getInt(BleConstants.BLOODPRESSURE_SPHYGMUS) != Integer.MIN_VALUE) {
            intent.putExtra("bmp", privacyDataModel.getInt(BleConstants.BLOODPRESSURE_SPHYGMUS));
        }
        intent.putExtra("measureAbnormal", privacyDataModel.getInt("measureAbnormal"));
        intent.putExtra("deletetime", privacyDataModel.getStartTime());
        intent.putExtra("clientId", privacyDataModel.getClientId());
        intent.putExtra("isInputData", privacyDataModel.getInt("source_type") == 3);
        this.f28725b.startActivityForResult(intent, 2);
    }

    private void e() {
        long j = this.mPageModelArgs.getLong("Time");
        LogUtil.a(f28724a, "scrollToPosition time = " + j);
        if (j == Long.MIN_VALUE) {
            return;
        }
        int iD = 0;
        String strD = paw.d(j, 0);
        String strD2 = paw.d(j, Integer.MAX_VALUE);
        for (whr whrVar : this.f28726c) {
            int i = iD + 1;
            if (!strD.equals(whrVar.a())) {
                iD = i + a(whrVar);
            } else {
                iD = i + d(whrVar.c(), strD2, j);
                break;
            }
        }
        if (this.e != null) {
            int iM = (int) (((qrs.m() * 0.5f) - this.mSpinnerCustomTitleBar.getHeight()) - this.f28725b.c());
            LogUtil.a(f28724a, "scrollToPosition offset = " + iM);
            this.i.scrollToPositionWithOffset(iD, iM);
        }
        this.mPageModelArgs.putLong("Time", Long.MIN_VALUE);
    }

    private int a(whr whrVar) {
        if (whrVar != null) {
            List<whz> listC = whrVar.c();
            if (!njy.e(listC)) {
                Iterator<whz> it = listC.iterator();
                int size = 0;
                while (it.hasNext()) {
                    List<PrivacyDataModel> listC2 = it.next().c();
                    size = size + 1 + (listC2 == null ? 0 : listC2.size());
                }
                return size;
            }
        }
        return 0;
    }

    private int d(List<whz> list, String str, long j) {
        if (njy.e(list)) {
            return 0;
        }
        int size = 0;
        for (whz whzVar : list) {
            size++;
            List<PrivacyDataModel> listC = whzVar.c();
            if (!str.equals(whzVar.b())) {
                List<PrivacyDataModel> listC2 = whzVar.c();
                size += listC2 == null ? 0 : listC2.size();
            } else {
                Iterator<PrivacyDataModel> it = listC.iterator();
                while (it.hasNext()) {
                    if (it.next().getStartTime() == j) {
                        return size;
                    }
                    size++;
                }
            }
        }
        return size;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(View view) {
        this.f28725b.a();
    }
}
