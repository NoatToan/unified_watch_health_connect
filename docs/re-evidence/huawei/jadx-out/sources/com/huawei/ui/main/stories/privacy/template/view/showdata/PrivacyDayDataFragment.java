package com.huawei.ui.main.stories.privacy.template.view.showdata;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback;
import com.huawei.ui.main.stories.privacy.template.model.adapter.BloodOxygenDayAdapter;
import com.huawei.ui.main.stories.privacy.template.model.adapter.DayDataViewAdapter;
import com.huawei.ui.main.stories.privacy.template.model.bean.PageModelArgs;
import com.huawei.ui.main.stories.privacy.template.model.bean.PrivacyDataModel;
import com.huawei.ui.main.stories.privacy.template.model.config.PrivacyDataFragmentConfig;
import com.huawei.ui.main.stories.privacy.template.view.PrivacyDataDetailMvpFragment;
import com.huawei.ui.main.stories.privacy.template.view.component.PrivacyDayDataView;
import defpackage.njy;
import defpackage.qpx;
import defpackage.qrs;
import defpackage.vzo;
import defpackage.whw;
import defpackage.wig;
import defpackage.wjr;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class PrivacyDayDataFragment extends PrivacyDataDetailMvpFragment<whw> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DayDataViewAdapter f28734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RelativeLayout f28735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout f28736c;
    private List<PrivacyDataModel> d;
    private PrivacyDayDataView e;
    private TextView i;

    @Override // com.huawei.ui.main.stories.privacy.template.view.PrivacyDataDetailMvpFragment
    public void clickSpinner(int i) {
    }

    public static PrivacyDayDataFragment c(PrivacyDataFragmentConfig privacyDataFragmentConfig, PageModelArgs pageModelArgs, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_config", privacyDataFragmentConfig);
        bundle.putParcelable("extra_page_model_args", pageModelArgs);
        bundle.putParcelable("extra_source_info", parcelable);
        PrivacyDayDataFragment privacyDayDataFragment = new PrivacyDayDataFragment();
        privacyDayDataFragment.setArguments(bundle);
        return privacyDayDataFragment;
    }

    @Override // com.huawei.ui.main.stories.template.health.HealthMvpFragment
    public View getContentView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.privacy_fragment_data, viewGroup, false);
    }

    @Override // com.huawei.ui.main.stories.privacy.template.view.PrivacyDataDetailMvpFragment, com.huawei.ui.main.stories.template.health.HealthMvpFragment
    public void initViews(View view) {
        super.initViews(view);
        if (this.mPageType == 105 && this.mDataSource == 3) {
            this.f28734a = new BloodOxygenDayAdapter();
        } else {
            this.f28734a = new DayDataViewAdapter();
        }
        this.f28735b = (RelativeLayout) view.findViewById(R.id.privacy_data_loading);
        this.f28736c = (LinearLayout) view.findViewById(R.id.no_data_source);
        this.i = (TextView) view.findViewById(R.id.no_data_text);
        initComponent((LinearLayout) view.findViewById(R.id.privacy_data_fragment_container));
        if (this.mComponents instanceof PrivacyDayDataView) {
            this.e = (PrivacyDayDataView) this.mComponents;
            if (this.mPageType == 105 && this.mDataSource == 3) {
                this.e.setCardViewBackground(null);
            } else {
                this.e.setCardViewBackground(getResources().getDrawable(R.drawable.privacy_card_view_bg_round, null));
            }
        }
        this.e.setAdapter(this.f28734a);
        this.f28734a.e(new DayDataViewAdapter.OnItemClickListener() { // from class: wja
            @Override // com.huawei.ui.main.stories.privacy.template.model.adapter.DayDataViewAdapter.OnItemClickListener
            public final void onItemClickListener(int i) {
                this.f52097b.e(i);
            }
        });
        this.f28734a.a(new DayDataViewAdapter.OnLongClickListener() { // from class: wiz
            @Override // com.huawei.ui.main.stories.privacy.template.model.adapter.DayDataViewAdapter.OnLongClickListener
            public final void onLongClickListener(int i) {
                this.f52093c.a(i);
            }
        });
    }

    public /* synthetic */ void a(int i) {
        if (isSupportLongClick()) {
            this.f28734a.e(i);
            showDelConfirmDialog(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        if (this.mToolBarManager.b() != 1) {
            this.f28734a.e(i);
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
        d(this.f28734a.a(i));
    }

    private void d(PrivacyDataModel privacyDataModel) {
        int iC;
        if (this.mPageType == 105 && this.mDataSource == 3 && (iC = wjr.c(1002, privacyDataModel.getInt("bloodOxygenKey"))) != 0) {
            wjr.a(2, 2, iC);
        }
        if (this.mPageType == 106 || this.mPageType == 113) {
            wjr.c();
        }
        Intent intent = new Intent();
        intent.putExtra("extra_source_info", this.mSourceInfoBean);
        intent.putExtra("extra_privacy_data_model", privacyDataModel);
        intent.putExtra("extra_page_model_args", this.mPageModelArgs);
        intent.setClass(getViewContext(), PrivacyDetailActivity.class);
        getViewContext().startActivity(intent);
    }

    @Override // com.huawei.ui.main.stories.privacy.template.view.PrivacyDataDetailMvpFragment
    public boolean isShowDeleteBtn() {
        return wig.e(this.mPageModelArgs) && hasData();
    }

    @Override // com.huawei.ui.main.stories.privacy.template.view.PrivacyDataDetailMvpFragment
    public boolean isSupportLongClick() {
        return wig.e(this.mPageModelArgs) && this.mToolBarManager.b() == 1;
    }

    @Override // com.huawei.ui.main.stories.privacy.template.view.PrivacyDataDetailMvpFragment
    public boolean hasData() {
        return !njy.e(this.d);
    }

    @Override // com.huawei.ui.main.stories.privacy.template.view.PrivacyDataDetailMvpFragment
    public void onDeleteBtnClicked() {
        setUiState(2);
    }

    @Override // com.huawei.ui.main.stories.privacy.template.view.PrivacyDataDetailMvpFragment
    public void setAllChecked(boolean z) {
        this.f28734a.b(z);
    }

    @Override // com.huawei.ui.main.stories.privacy.template.view.PrivacyDataDetailMvpFragment
    public void deleteDate() {
        vzo vzoVar = new vzo(this.mClassType, this.mDeviceUuid, this.mPackageName);
        vzoVar.a("categoryType", this.mPageModelArgs.getInt("categoryType"));
        this.mDataManager.d(this.f28734a.e(), vzoVar, new DataSourceCallback() { // from class: wjc
            @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
            public final void onResponse(int i, Object obj) {
                this.f52099b.e(i, (Boolean) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void e(int i, Boolean bool) {
        int i2;
        LogUtil.a("PrivacyDayDataFragment", "deleteData callBack code : ", Integer.valueOf(i));
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
        ((whw) getPresenter()).c(this.mPageModelArgs);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(-1);
        }
    }

    @Override // com.huawei.ui.main.stories.privacy.template.view.PrivacyDataDetailMvpFragment
    public int getCheckedCount() {
        return this.f28734a.c();
    }

    @Override // com.huawei.ui.main.stories.privacy.template.view.PrivacyDataDetailMvpFragment
    public int getTotalCount() {
        return this.f28734a.a();
    }

    @Override // com.huawei.ui.main.stories.privacy.template.view.PrivacyDataDetailMvpFragment
    public void onToolBarStatusChanged(int i) {
        if (i == 1) {
            this.f28734a.c(1);
            return;
        }
        if (i == 2) {
            this.f28734a.c(2);
        } else if (i == 3) {
            setAllChecked(false);
        } else {
            if (i != 4) {
                return;
            }
            setAllChecked(true);
        }
    }

    public void a(int i, List<PrivacyDataModel> list) {
        LogUtil.a("PrivacyDayDataFragment", "addAllData resultCode = ", Integer.valueOf(i), ", data size = ", Integer.valueOf(list == null ? 0 : list.size()));
        this.d = list;
        this.f28735b.setVisibility(8);
        List<PrivacyDataModel> list2 = this.d;
        if (list2 == null || list2.isEmpty()) {
            if (i == 0) {
                this.i.setText(getResources().getString(R.string.IDS_hwh_privacy_no_details));
            } else {
                this.i.setText(getResources().getString(R.string.IDS_setting_wearhome_obtain_failed));
            }
            this.f28736c.setVisibility(0);
            showRtlLanguage();
        } else {
            this.f28734a.a(this.d);
        }
        if (wig.e(this.mPageModelArgs)) {
            setUiState(1);
        }
    }
}
