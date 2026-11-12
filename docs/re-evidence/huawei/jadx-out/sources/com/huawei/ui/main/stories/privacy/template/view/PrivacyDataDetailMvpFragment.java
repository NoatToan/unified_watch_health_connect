package com.huawei.ui.main.stories.privacy.template.view;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import android.widget.Toast;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.spinner.HealthSpinner;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.toolbar.HealthToolBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.privacy.template.contract.PrivacyDetailFragmentContract;
import com.huawei.ui.main.stories.privacy.template.model.adapter.SourceSpinnerAdapter;
import com.huawei.ui.main.stories.privacy.template.model.bean.PageModelArgs;
import com.huawei.ui.main.stories.privacy.template.model.bean.SourceInfoBean;
import com.huawei.ui.main.stories.privacy.template.model.config.PrivacyDataFragmentConfig;
import com.huawei.ui.main.stories.privacy.template.util.PrivacyToolBarManager;
import com.huawei.ui.main.stories.privacy.template.view.component.BaseComponent;
import com.huawei.ui.main.stories.privacy.template.view.showdata.PrivacyDataModelActivity;
import com.huawei.ui.main.stories.template.health.HealthMvpFragment;
import com.huawei.ui.main.stories.template.health.config.HealthCommonExpandViewConfig;
import defpackage.qqz;
import defpackage.qre;
import defpackage.wel;
import defpackage.wib;
import defpackage.wic;
import defpackage.wig;
import defpackage.wij;
import defpackage.wjr;
import health.compact.a.LanguageUtil;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public abstract class PrivacyDataDetailMvpFragment<P extends wib> extends HealthMvpFragment<P> implements PrivacyDetailFragmentContract.PrivacyFragmentView {
    private static final String TAG = "PrivacyDataDetailMvpFragment";
    protected int mClassType;
    protected BaseComponent mComponents;
    protected CustomTitleBar mCustomTitleBar;
    protected wel mDataManager;
    protected int mDataSource;
    protected String mDeviceUuid;
    protected boolean mIsOtherManufacturer;
    protected int mModuleType;
    private ImageView mNoDataImage;
    protected HealthToolBar.OnSingleTapListener mOnSingleTapListener = new HealthToolBar.OnSingleTapListener() { // from class: com.huawei.ui.main.stories.privacy.template.view.PrivacyDataDetailMvpFragment.5
        @Override // com.huawei.ui.commonui.toolbar.HealthToolBar.OnSingleTapListener
        public void onSingleTap(int i) {
            if (i == 1) {
                PrivacyDataDetailMvpFragment.this.onToolBarLeftClicked();
            } else {
                if (i != 3) {
                    return;
                }
                PrivacyDataDetailMvpFragment.this.onToolBarRightClicked();
            }
        }
    };
    protected PrivacyToolBarManager.OnStatusChangedListener mOnStatusChangedListener = new PrivacyToolBarManager.OnStatusChangedListener() { // from class: com.huawei.ui.main.stories.privacy.template.view.PrivacyDataDetailMvpFragment.4
        @Override // com.huawei.ui.main.stories.privacy.template.util.PrivacyToolBarManager.OnStatusChangedListener
        public void onStatusChanged(int i) {
            PrivacyDataDetailMvpFragment.this.onToolBarStatusChanged(i);
        }
    };
    protected String mPackageName;
    public PageModelArgs mPageModelArgs;
    public int mPageType;
    protected PrivacyDataModelActivity mPrivacyDataModelActivity;
    private PrivacyDataFragmentConfig mPrivacyFragmentConfig;
    protected SourceInfoBean mSourceInfoBean;
    protected CustomTitleBar mSpinnerCustomTitleBar;
    protected int mSubPageType;
    private HealthToolBar mToolBar;
    protected PrivacyToolBarManager mToolBarManager;

    protected abstract void clickSpinner(int i);

    protected abstract void deleteDate();

    protected abstract int getCheckedCount();

    protected abstract int getTotalCount();

    protected abstract boolean hasData();

    protected abstract boolean isShowDeleteBtn();

    protected abstract boolean isSupportLongClick();

    protected abstract void onDeleteBtnClicked();

    protected abstract void onToolBarStatusChanged(int i);

    protected abstract void setAllChecked(boolean z);

    public void setDeleteBtnVisibility(int i) {
        this.mCustomTitleBar.setRightButtonVisibility(i);
        this.mSpinnerCustomTitleBar.setRightButtonVisibility(i);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // com.huawei.ui.main.stories.template.health.HealthMvpFragment
    public void initViews(View view) {
        Bundle arguments = getArguments();
        if (arguments == null) {
            LogUtil.e(TAG, "bundle is null");
            return;
        }
        this.mPrivacyFragmentConfig = (PrivacyDataFragmentConfig) arguments.getParcelable("extra_config");
        this.mSourceInfoBean = (SourceInfoBean) arguments.getParcelable("extra_source_info");
        PageModelArgs pageModelArgs = (PageModelArgs) arguments.getParcelable("extra_page_model_args");
        this.mPageModelArgs = pageModelArgs;
        if (pageModelArgs == null) {
            LogUtil.e(TAG, "Privacy mPageModelArgs is null exception");
            return;
        }
        this.mIsOtherManufacturer = pageModelArgs.isOtherManufacturer();
        this.mDataSource = this.mPageModelArgs.getDataSource();
        this.mModuleType = this.mPageModelArgs.getModuleType();
        this.mPageType = this.mPageModelArgs.getPageType();
        this.mSubPageType = this.mPageModelArgs.getInt("Subpage");
        this.mPackageName = this.mPageModelArgs.getPackageName();
        this.mDeviceUuid = this.mPageModelArgs.getUuid();
        int classType = this.mPageModelArgs.getClassType();
        this.mClassType = classType;
        if (classType == 3) {
            this.mClassType = 2;
        }
        this.mDataManager = new wel(this.mPageType);
        this.mNoDataImage = (ImageView) view.findViewById(R.id.no_data_image);
        HealthToolBar healthToolBar = (HealthToolBar) view.findViewById(R.id.privacy_detail_tool_bar);
        this.mToolBar = healthToolBar;
        PrivacyToolBarManager privacyToolBarManager = new PrivacyToolBarManager(healthToolBar, this.mOnSingleTapListener);
        this.mToolBarManager = privacyToolBarManager;
        privacyToolBarManager.a(this.mOnStatusChangedListener);
        initTitleBar();
        fixSpinnerPadding(this.mSpinnerCustomTitleBar);
    }

    private void initTitleBar() {
        if (getActivity() instanceof PrivacyDataModelActivity) {
            PrivacyDataModelActivity privacyDataModelActivity = (PrivacyDataModelActivity) getActivity();
            this.mPrivacyDataModelActivity = privacyDataModelActivity;
            CustomTitleBar customTitleBar = privacyDataModelActivity.getCustomTitleBar();
            this.mCustomTitleBar = customTitleBar;
            customTitleBar.setRightButtonDrawable(wig.e(R.drawable.ic_public_delete), qre.f(R.string.IDS_contact_delete));
            this.mCustomTitleBar.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.privacy.template.view.PrivacyDataDetailMvpFragment.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    PrivacyDataDetailMvpFragment.this.onDeleteBtnClicked();
                }
            });
            CustomTitleBar spinnerCustomTitleBar = this.mPrivacyDataModelActivity.getSpinnerCustomTitleBar();
            this.mSpinnerCustomTitleBar = spinnerCustomTitleBar;
            spinnerCustomTitleBar.setRightButtonDrawable(wig.e(R.drawable.ic_public_delete), qre.f(R.string.IDS_contact_delete));
            this.mSpinnerCustomTitleBar.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.privacy.template.view.PrivacyDataDetailMvpFragment.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    PrivacyDataDetailMvpFragment.this.onDeleteBtnClicked();
                }
            });
        }
    }

    @Override // com.huawei.ui.main.stories.template.BaseView
    public Context getViewContext() {
        return getActivity();
    }

    public void initComponent(LinearLayout linearLayout) {
        addExpandedViewsIfNeeded(this.mPrivacyFragmentConfig.getLayoutConfig().getListView(), linearLayout);
        getPresenter().addComponents(this.mComponents);
    }

    private void addExpandedViewsIfNeeded(HealthCommonExpandViewConfig healthCommonExpandViewConfig, LinearLayout linearLayout) {
        if (healthCommonExpandViewConfig == null) {
            return;
        }
        String newComponent = healthCommonExpandViewConfig.getNewComponent();
        if (TextUtils.isEmpty(newComponent)) {
            return;
        }
        BaseComponent baseComponentA = wic.a(newComponent, getContext());
        this.mComponents = baseComponentA;
        if (baseComponentA != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            this.mComponents.setPresenter(getPresenter());
            linearLayout.addView(this.mComponents.getView(getContext()), layoutParams);
        }
    }

    @Override // com.huawei.ui.main.stories.template.health.HealthMvpFragment
    public void initData() {
        if (this.mPageModelArgs == null) {
            LogUtil.j(TAG, "PageModelArgs null exception");
        } else {
            getPresenter().c(this.mPageModelArgs);
        }
    }

    public boolean onBackPressed() {
        if (this.mToolBarManager.b() == 1) {
            return false;
        }
        setUiState(1);
        return true;
    }

    @Override // com.huawei.ui.main.stories.template.health.HealthMvpFragment
    public P onCreatePresenter() {
        return (P) wij.d(this.mPrivacyFragmentConfig.getFragmentPresenter(), this);
    }

    public void showDelConfirmDialog(final boolean z) {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(requireContext()).a(requireContext().getString(R.string.IDS_hw_health_show_healthdata_delete)).a(requireContext().getString(R.string.IDS_hw_health_show_common_dialog_ok_button), new View.OnClickListener() { // from class: wif
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f52079c.m1756xb5d7173c(view);
            }
        }).d(requireContext().getString(R.string.IDS_hw_health_show_common_dialog_cancle_button), new View.OnClickListener() { // from class: wih
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f52080b.m1757xbcfff97d(z, view);
            }
        }).c();
        noTitleCustomAlertDialogC.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.huawei.ui.main.stories.privacy.template.view.PrivacyDataDetailMvpFragment.1
            @Override // android.content.DialogInterface.OnKeyListener
            public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                if (i == 4 && keyEvent.getAction() == 1 && z) {
                    PrivacyDataDetailMvpFragment.this.setAllChecked(false);
                }
                return false;
            }
        });
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    /* JADX INFO: renamed from: lambda$showDelConfirmDialog$0$com-huawei-ui-main-stories-privacy-template-view-PrivacyDataDetailMvpFragment, reason: not valid java name */
    public /* synthetic */ void m1756xb5d7173c(View view) {
        if (wig.c(this.mPageModelArgs) && !NetworkUtil.i()) {
            Toast.makeText(BaseApplication.getContext(), getResources().getString(R.string.IDS_privacy_network_error), 0).show();
        } else {
            deleteAllDataBI();
            deleteDate();
        }
    }

    /* JADX INFO: renamed from: lambda$showDelConfirmDialog$1$com-huawei-ui-main-stories-privacy-template-view-PrivacyDataDetailMvpFragment, reason: not valid java name */
    public /* synthetic */ void m1757xbcfff97d(boolean z, View view) {
        if (this.mPageType == 103) {
            wjr.d(3, getTotalCount() == getCheckedCount());
        }
        if (z) {
            setAllChecked(false);
        }
    }

    private void deleteAllDataBI() {
        int i = this.mPageType;
        if (i == 106 || i == 113) {
            if (this.mModuleType == 2) {
                wjr.d();
            } else {
                wjr.e();
            }
        }
        if (this.mPageType == 103) {
            wjr.d(2, getTotalCount() == getCheckedCount());
        }
        if (this.mPageType == 107) {
            wjr.a();
        }
    }

    public void setUiState(int i) {
        PrivacyToolBarManager privacyToolBarManager = this.mToolBarManager;
        if (privacyToolBarManager != null) {
            privacyToolBarManager.e(i);
            setTitleBarState(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onToolBarLeftClicked() {
        if (getCheckedCount() == 0) {
            return;
        }
        showDelConfirmDialog(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onToolBarRightClicked() {
        if (this.mToolBarManager.b() == 4) {
            setUiState(3);
        } else {
            setUiState(4);
        }
    }

    protected void setTitleBarState(int i) {
        if (i == 1) {
            setTitleBarNotEditStatus();
            return;
        }
        if (i == 2) {
            setTitleBarEditingStatus();
        } else if (i == 3) {
            setTitleBarCancelCheckedStatus();
        } else {
            if (i != 4) {
                return;
            }
            setTitleBarAllCheckedStatus();
        }
    }

    protected void setTitleBarNotEditStatus() {
        setDeleteBtnVisibility(isShowDeleteBtn() ? 0 : 8);
        if (wig.g(this.mPageModelArgs)) {
            this.mCustomTitleBar.setAppBarVisible(false);
            this.mSpinnerCustomTitleBar.setAppBarVisible(true);
        } else {
            this.mCustomTitleBar.setLeftButtonDrawable(wig.e(R.mipmap.ic_health_nav_back_black), qre.f(R.string.accessibility_go_back));
            this.mCustomTitleBar.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: wii
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f52082a.m1755x8a5ba5f6(view);
                }
            });
            this.mCustomTitleBar.setTitleText(this.mPrivacyDataModelActivity.getTitleBarContent());
        }
    }

    /* JADX INFO: renamed from: lambda$setTitleBarNotEditStatus$2$com-huawei-ui-main-stories-privacy-template-view-PrivacyDataDetailMvpFragment, reason: not valid java name */
    public /* synthetic */ void m1755x8a5ba5f6(View view) {
        PrivacyDataModelActivity privacyDataModelActivity = this.mPrivacyDataModelActivity;
        if (privacyDataModelActivity != null) {
            privacyDataModelActivity.onBackPressed();
        }
    }

    protected void setTitleBarEditingStatus() {
        setDeleteBtnVisibility(8);
        this.mSpinnerCustomTitleBar.setAppBarVisible(false);
        this.mCustomTitleBar.setAppBarVisible(true);
        this.mCustomTitleBar.setLeftButtonDrawable(wig.e(R.drawable.ic_public_select_cancel), qre.f(R.string.accessibility_close));
        this.mCustomTitleBar.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: wik
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.m1754x254ce412(view);
            }
        });
        int checkedCount = getCheckedCount();
        if (checkedCount == 0) {
            this.mCustomTitleBar.setTitleText(getResources().getString(R.string.IDS_hw_show_healthdata_bloodsugar_not_select));
        } else {
            this.mCustomTitleBar.setTitleText(getResources().getQuantityString(R.plurals.IDS_hw_show_healthdata_bloodsugar_selected_items, checkedCount, Integer.valueOf(checkedCount)));
        }
    }

    /* JADX INFO: renamed from: lambda$setTitleBarEditingStatus$3$com-huawei-ui-main-stories-privacy-template-view-PrivacyDataDetailMvpFragment, reason: not valid java name */
    public /* synthetic */ void m1754x254ce412(View view) {
        setUiState(1);
    }

    protected void setTitleBarCancelCheckedStatus() {
        this.mCustomTitleBar.setTitleText(getResources().getString(R.string.IDS_hw_show_healthdata_bloodsugar_not_select));
    }

    protected void setTitleBarAllCheckedStatus() {
        int totalCount = getTotalCount();
        this.mCustomTitleBar.setTitleText(getResources().getQuantityString(R.plurals.IDS_hw_show_healthdata_bloodsugar_selected_items, totalCount, Integer.valueOf(totalCount)));
    }

    protected void showRtlLanguage() {
        if (LanguageUtil.ba(getViewContext())) {
            this.mNoDataImage.setBackground(qqz.e(getViewContext(), R.drawable.icon_no_data_new));
        } else {
            this.mNoDataImage.setBackgroundResource(R.drawable.icon_no_data_new);
        }
    }

    protected void initSpinner(List<String> list, int i) {
        HealthSpinner titleSpinner = this.mSpinnerCustomTitleBar.getTitleSpinner();
        ArrayAdapter arrayAdapter = new ArrayAdapter(getContext(), com.huawei.ui.commonui.R.layout.health_commonui_spinner_item_appbar, list);
        arrayAdapter.setDropDownViewResource(com.huawei.ui.commonui.R.layout.dropdown_item);
        if (titleSpinner != null) {
            titleSpinner.setAdapter((SpinnerAdapter) arrayAdapter);
            titleSpinner.setSelection(i, true);
            titleSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.huawei.ui.main.stories.privacy.template.view.PrivacyDataDetailMvpFragment.10
                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onNothingSelected(AdapterView<?> adapterView) {
                }

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j) {
                    PrivacyDataDetailMvpFragment.this.clickSpinner(i2);
                }
            });
        }
    }

    protected void initSpinnerWithIcon(List<Map<String, String>> list, int i) {
        HealthSpinner titleSpinner = this.mSpinnerCustomTitleBar.getTitleSpinner();
        SourceSpinnerAdapter sourceSpinnerAdapter = new SourceSpinnerAdapter(list);
        if (titleSpinner != null) {
            titleSpinner.setAdapter((SpinnerAdapter) sourceSpinnerAdapter);
            titleSpinner.setSelection(i, true);
            titleSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.huawei.ui.main.stories.privacy.template.view.PrivacyDataDetailMvpFragment.8
                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onNothingSelected(AdapterView<?> adapterView) {
                }

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j) {
                    PrivacyDataDetailMvpFragment.this.clickSpinner(i2);
                }
            });
        }
    }

    protected void fixSpinnerPadding(CustomTitleBar customTitleBar) {
        HealthSpinner titleSpinner;
        if (LanguageUtil.ba(BaseApplication.getContext()) || (titleSpinner = customTitleBar.getTitleSpinner()) == null) {
            return;
        }
        titleSpinner.setPadding(0, titleSpinner.getPaddingTop(), titleSpinner.getPaddingRight(), titleSpinner.getPaddingBottom());
    }
}
