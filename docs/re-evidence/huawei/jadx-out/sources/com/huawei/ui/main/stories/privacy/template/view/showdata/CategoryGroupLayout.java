package com.huawei.ui.main.stories.privacy.template.view.showdata;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.CreativeType;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback;
import com.huawei.ui.main.stories.privacy.datasourcemanager.bean.SourceInfo;
import com.huawei.ui.main.stories.privacy.template.model.adapter.GroupDataAdapter;
import com.huawei.ui.main.stories.privacy.template.model.bean.PageModelArgs;
import com.huawei.ui.main.stories.privacy.template.model.bean.PrivacyDataModel;
import com.huawei.ui.main.stories.privacy.template.view.component.PrivacyGroupDataView;
import defpackage.paw;
import defpackage.qpx;
import defpackage.qrs;
import defpackage.vzo;
import defpackage.whz;
import defpackage.wig;
import defpackage.wjr;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class CategoryGroupLayout extends CategoryCommonLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f28727b = "CategoryGroupLayout";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PrivacyGroupDataView f28728a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private GroupDataAdapter f28729c;
    private PrivacyGroupDataFragment d;
    private List<whz> e;
    private long i;
    private LinearLayout j;

    public CategoryGroupLayout(Context context, Activity activity, Fragment fragment, PageModelArgs pageModelArgs) {
        super(context, activity, pageModelArgs);
        this.i = Long.MIN_VALUE;
        if (fragment instanceof PrivacyGroupDataFragment) {
            this.d = (PrivacyGroupDataFragment) fragment;
        }
        initViews();
    }

    public void c(List<whz> list) {
        this.e = list;
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
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.no_data_source);
        this.j = linearLayout;
        linearLayout.setVisibility(0);
        a();
    }

    @Override // com.huawei.ui.main.stories.privacy.template.view.showdata.CategoryCommonLayout
    protected boolean hasData() {
        List<whz> list = this.e;
        return (list == null || list.size() == 0) ? false : true;
    }

    @Override // com.huawei.ui.main.stories.privacy.template.view.showdata.CategoryCommonLayout
    protected int getCheckedCount() {
        return this.f28729c.d();
    }

    @Override // com.huawei.ui.main.stories.privacy.template.view.showdata.CategoryCommonLayout
    protected int getTotalCount() {
        return this.f28729c.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.ui.main.stories.privacy.template.view.showdata.CategoryCommonLayout
    public void onToolBarStatusChanged(int i) {
        if (i == 1) {
            this.f28729c.a(1);
            this.d.d(true);
        } else if (i == 2) {
            this.f28729c.a(2);
            this.d.d(false);
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
        this.f28729c.d(z);
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
        vzoVar.a("categoryType", this.mPageModelArgs.getInt("categoryType"));
        this.mDataManager.d(this.f28729c.c(), vzoVar, new DataSourceCallback() { // from class: wiv
            @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
            public final void onResponse(int i2, Object obj) {
                this.f52089a.b(i2, (Boolean) obj);
            }
        });
    }

    public /* synthetic */ void b(int i, Boolean bool) {
        int i2;
        LogUtil.a(f28727b, "deleteData callBack code : " + i);
        Context context = getContext();
        if (i == 0) {
            i2 = com.huawei.plugindevice.R.string.IDS_device_wifi_clear_user_success;
        } else {
            i2 = com.huawei.plugindevice.R.string.IDS_device_wifi_delete_fail;
        }
        qpx.e(context, i2);
        this.d.a();
    }

    private void b() {
        List<whz> list = this.e;
        if (list == null || list.isEmpty()) {
            this.j.setVisibility(0);
            showRtlLanguage();
        } else {
            if (this.f28729c == null) {
                return;
            }
            this.j.setVisibility(8);
            this.f28729c.b(this.e);
            if (this.f28728a != null) {
                int groupCount = this.f28729c.getGroupCount();
                for (int i = 0; i < groupCount; i++) {
                    this.f28728a.expandGroup(i);
                }
            }
            d();
        }
    }

    private void a() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.privacy_data_fragment_container);
        PrivacyGroupDataView privacyGroupDataView = new PrivacyGroupDataView(getContext());
        this.f28728a = privacyGroupDataView;
        linearLayout.addView(privacyGroupDataView);
        GroupDataAdapter groupDataAdapter = new GroupDataAdapter();
        this.f28729c = groupDataAdapter;
        groupDataAdapter.c(!this.mIsOtherManufacturer);
        this.f28729c.c(new GroupDataAdapter.OnItemClickListener() { // from class: wix
            @Override // com.huawei.ui.main.stories.privacy.template.model.adapter.GroupDataAdapter.OnItemClickListener
            public final void onItemClickListener(int i, int i2) {
                this.f52091c.e(i, i2);
            }
        });
        this.f28729c.b(new GroupDataAdapter.OnLongClickListener() { // from class: wiy
            @Override // com.huawei.ui.main.stories.privacy.template.model.adapter.GroupDataAdapter.OnLongClickListener
            public final void onLongClickListener(int i, int i2) {
                this.f52092a.b(i, i2);
            }
        });
        this.f28728a.setAdapter(this.f28729c);
        this.f28728a.setDividerHeight(0);
    }

    public /* synthetic */ void b(int i, int i2) {
        if (isSupportLongClick()) {
            this.f28729c.d(i, i2);
            showDelConfirmDialog(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, int i2) {
        if (this.mIsOtherManufacturer) {
            return;
        }
        if (this.mToolBarManager.b() != 1) {
            this.f28729c.d(i, i2);
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
        b(this.f28729c.c(i, i2));
    }

    private void b(PrivacyDataModel privacyDataModel) {
        if (this.mPageType != 106) {
            return;
        }
        wjr.b();
        PageModelArgs pageModelArgsA = wig.a(this.mPageModelArgs);
        if (this.mPageModelArgs.getInt("categoryType") == 2) {
            pageModelArgsA.setPageType(CreativeType.WINDOW_IMAGE_WITH_DOWNLOAD_BUTTON);
        }
        pageModelArgsA.setTimestamp(privacyDataModel.getStartTime());
        pageModelArgsA.setModuleType(2);
        Intent intent = new Intent(getContext(), (Class<?>) PrivacyDataModelActivity.class);
        intent.putExtra("extra_page_model_args", pageModelArgsA);
        this.d.startActivityForResult(intent, 1);
    }

    private void d() {
        long j = this.i;
        if (j == Long.MIN_VALUE) {
            return;
        }
        String strD = paw.d(j, Integer.MAX_VALUE);
        int size = 0;
        for (whz whzVar : this.e) {
            size++;
            if (!strD.equals(whzVar.b())) {
                size += whzVar.c().size();
            } else {
                Iterator<PrivacyDataModel> it = whzVar.c().iterator();
                while (it.hasNext()) {
                    if (this.i == it.next().getStartTime()) {
                        break;
                    } else {
                        size++;
                    }
                }
                break;
            }
        }
        PrivacyGroupDataView privacyGroupDataView = this.f28728a;
        if (privacyGroupDataView != null) {
            privacyGroupDataView.smoothScrollToPositionFromTop(size, (int) (((qrs.m() * 0.5f) - this.mSpinnerCustomTitleBar.getHeight()) - this.d.c()));
        }
        this.i = Long.MIN_VALUE;
    }
}
