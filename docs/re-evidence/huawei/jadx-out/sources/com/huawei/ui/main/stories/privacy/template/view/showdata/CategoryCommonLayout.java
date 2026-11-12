package com.huawei.ui.main.stories.privacy.template.view.showdata;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.haf.application.BaseApplication;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.toolbar.HealthToolBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.privacy.template.model.bean.PageModelArgs;
import com.huawei.ui.main.stories.privacy.template.util.PrivacyToolBarManager;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrs;
import defpackage.wel;
import defpackage.wig;
import defpackage.wjr;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes19.dex */
public abstract class CategoryCommonLayout extends RelativeLayout {
    protected int mClassType;
    protected CustomTitleBar mCustomTitleBar;
    protected wel mDataManager;
    protected PrivacyDataModelActivity mDataModelActivity;
    protected String mDeviceUuid;
    protected boolean mIsOtherManufacturer;
    private ImageView mNoDataImage;
    protected HealthToolBar.OnSingleTapListener mOnSingleTapListener;
    protected PrivacyToolBarManager.OnStatusChangedListener mOnStatusChangedListener;
    protected String mPackageName;
    protected PageModelArgs mPageModelArgs;
    protected int mPageType;
    protected CustomTitleBar mSpinnerCustomTitleBar;
    protected PrivacyToolBarManager mToolBarManager;

    protected abstract void deleteDate();

    protected abstract int getCheckedCount();

    protected abstract int getLayoutId();

    protected abstract int getTotalCount();

    protected abstract boolean hasData();

    public abstract void onToolBarStatusChanged(int i);

    protected abstract void setAllChecked(boolean z);

    /* JADX INFO: renamed from: lambda$new$0$com-huawei-ui-main-stories-privacy-template-view-showdata-CategoryCommonLayout, reason: not valid java name */
    public /* synthetic */ void m1758xe9d7cc05(int i) {
        if (i == 1) {
            onToolBarLeftClicked();
        } else {
            if (i != 3) {
                return;
            }
            onToolBarRightClicked();
        }
    }

    public CategoryCommonLayout(Context context, Activity activity, PageModelArgs pageModelArgs) {
        super(context);
        this.mOnSingleTapListener = new HealthToolBar.OnSingleTapListener() { // from class: wiq
            @Override // com.huawei.ui.commonui.toolbar.HealthToolBar.OnSingleTapListener
            public final void onSingleTap(int i) {
                this.d.m1758xe9d7cc05(i);
            }
        };
        this.mOnStatusChangedListener = new PrivacyToolBarManager.OnStatusChangedListener() { // from class: wit
            @Override // com.huawei.ui.main.stories.privacy.template.util.PrivacyToolBarManager.OnStatusChangedListener
            public final void onStatusChanged(int i) {
                this.d.onToolBarStatusChanged(i);
            }
        };
        if (activity instanceof PrivacyDataModelActivity) {
            this.mDataModelActivity = (PrivacyDataModelActivity) activity;
        }
        this.mPageModelArgs = pageModelArgs;
        if (pageModelArgs != null) {
            this.mIsOtherManufacturer = pageModelArgs.isOtherManufacturer();
            this.mPageType = this.mPageModelArgs.getPageType();
            this.mPackageName = this.mPageModelArgs.getPackageName();
            this.mDeviceUuid = this.mPageModelArgs.getUuid();
            int classType = this.mPageModelArgs.getClassType();
            this.mClassType = classType;
            if (classType == 3) {
                this.mClassType = 2;
            }
            this.mDataManager = new wel(this.mPageType);
        }
    }

    public boolean isShowDeleteBtn() {
        return wig.d(this.mPageModelArgs) && hasData();
    }

    public void setDeleteBtnVisibility(int i) {
        this.mCustomTitleBar.setRightButtonVisibility(i);
        this.mSpinnerCustomTitleBar.setRightButtonVisibility(i);
    }

    public boolean onBackPressed() {
        if (this.mToolBarManager.b() == 1) {
            return false;
        }
        setUiState(1);
        return true;
    }

    protected void initViews() {
        LayoutInflater.from(getContext()).inflate(getLayoutId(), this);
        this.mNoDataImage = (ImageView) findViewById(R.id.no_data_image);
        HealthToolBar healthToolBar = (HealthToolBar) findViewById(R.id.privacy_detail_tool_bar);
        this.mToolBarManager = new PrivacyToolBarManager(healthToolBar, this.mOnSingleTapListener);
        if (qrs.ah(BaseApplication.b())) {
            healthToolBar.setIsColumnEnabled(false);
        }
        this.mToolBarManager.a(this.mOnStatusChangedListener);
        PrivacyDataModelActivity privacyDataModelActivity = this.mDataModelActivity;
        if (privacyDataModelActivity != null) {
            this.mCustomTitleBar = privacyDataModelActivity.getCustomTitleBar();
            this.mSpinnerCustomTitleBar = this.mDataModelActivity.getSpinnerCustomTitleBar();
        }
    }

    protected boolean isSupportLongClick() {
        return wig.d(this.mPageModelArgs) && this.mToolBarManager.b() == 1;
    }

    protected void showDelConfirmDialog(final boolean z) {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(getContext()).a(getContext().getString(R.string.IDS_hw_health_show_healthdata_delete)).a(getContext().getString(R.string.IDS_hw_health_show_common_dialog_ok_button), new View.OnClickListener() { // from class: win
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f52085a.m1761xf65027f0(view);
            }
        }).d(getContext().getString(R.string.IDS_hw_health_show_common_dialog_cancle_button), new View.OnClickListener() { // from class: wil
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f52083c.m1762xd4438dcf(z, view);
            }
        }).c();
        noTitleCustomAlertDialogC.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: wim
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return this.e.m1763xb236f3ae(z, dialogInterface, i, keyEvent);
            }
        });
        noTitleCustomAlertDialogC.show();
    }

    /* JADX INFO: renamed from: lambda$showDelConfirmDialog$1$com-huawei-ui-main-stories-privacy-template-view-showdata-CategoryCommonLayout, reason: not valid java name */
    public /* synthetic */ void m1761xf65027f0(View view) {
        if (this.mPageType == 106) {
            wjr.e();
        }
        deleteDate();
    }

    /* JADX INFO: renamed from: lambda$showDelConfirmDialog$2$com-huawei-ui-main-stories-privacy-template-view-showdata-CategoryCommonLayout, reason: not valid java name */
    public /* synthetic */ void m1762xd4438dcf(boolean z, View view) {
        if (z) {
            setAllChecked(false);
        }
    }

    /* JADX INFO: renamed from: lambda$showDelConfirmDialog$3$com-huawei-ui-main-stories-privacy-template-view-showdata-CategoryCommonLayout, reason: not valid java name */
    public /* synthetic */ boolean m1763xb236f3ae(boolean z, DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getAction() == 1 && z) {
            setAllChecked(false);
        }
        return false;
    }

    protected void setUiState(int i) {
        PrivacyToolBarManager privacyToolBarManager = this.mToolBarManager;
        if (privacyToolBarManager != null) {
            privacyToolBarManager.e(i);
            setTitleBarState(i);
        }
    }

    private void onToolBarLeftClicked() {
        if (getCheckedCount() == 0) {
            return;
        }
        showDelConfirmDialog(false);
    }

    private void onToolBarRightClicked() {
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
        if (wig.g(this.mPageModelArgs) && this.mPageModelArgs.getLong("startTime") == Long.MIN_VALUE) {
            this.mCustomTitleBar.setAppBarVisible(false);
            this.mSpinnerCustomTitleBar.setAppBarVisible(true);
            return;
        }
        this.mCustomTitleBar.setLeftButtonDrawable(wig.e(R.mipmap.ic_health_nav_back_black), qre.f(R.string.accessibility_go_back));
        this.mCustomTitleBar.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: wip
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f52086b.m1760x9050d655(view);
            }
        });
        PrivacyDataModelActivity privacyDataModelActivity = this.mDataModelActivity;
        if (privacyDataModelActivity != null) {
            this.mCustomTitleBar.setTitleText(privacyDataModelActivity.getTitleBarContent());
        }
    }

    /* JADX INFO: renamed from: lambda$setTitleBarNotEditStatus$4$com-huawei-ui-main-stories-privacy-template-view-showdata-CategoryCommonLayout, reason: not valid java name */
    public /* synthetic */ void m1760x9050d655(View view) {
        PrivacyDataModelActivity privacyDataModelActivity = this.mDataModelActivity;
        if (privacyDataModelActivity != null) {
            privacyDataModelActivity.onBackPressed();
        }
    }

    protected void setTitleBarEditingStatus() {
        setDeleteBtnVisibility(8);
        this.mSpinnerCustomTitleBar.setAppBarVisible(false);
        this.mCustomTitleBar.setAppBarVisible(true);
        this.mCustomTitleBar.setLeftButtonDrawable(wig.e(R.drawable.ic_public_select_cancel), qre.f(R.string.accessibility_close));
        this.mCustomTitleBar.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: wio
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.m1759x53875bb9(view);
            }
        });
        int checkedCount = getCheckedCount();
        if (checkedCount == 0) {
            this.mCustomTitleBar.setTitleText(getResources().getString(R.string.IDS_hw_show_healthdata_bloodsugar_not_select));
        } else {
            this.mCustomTitleBar.setTitleText(getResources().getQuantityString(R.plurals.IDS_hw_show_healthdata_bloodsugar_selected_items, checkedCount, Integer.valueOf(checkedCount)));
        }
    }

    /* JADX INFO: renamed from: lambda$setTitleBarEditingStatus$5$com-huawei-ui-main-stories-privacy-template-view-showdata-CategoryCommonLayout, reason: not valid java name */
    public /* synthetic */ void m1759x53875bb9(View view) {
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
        if (LanguageUtil.ba(getContext())) {
            this.mNoDataImage.setBackground(qqz.e(getContext(), R.drawable.icon_no_data_new));
        } else {
            this.mNoDataImage.setBackgroundResource(R.drawable.icon_no_data_new);
        }
    }
}
