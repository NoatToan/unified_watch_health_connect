package com.huawei.healthcloud.plugintrack.ui.activity;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.linechart.utils.AsyncSelectorSerialize;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import defpackage.dep;
import defpackage.npg;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractSportActivity extends BaseActivity {
    private static final int PRE_CONDITION_ERROR_CODE_PERMISSION = 1;
    private static final String TAG = "Track_AbstractSportActivity";
    private Context mContext;
    private boolean mIsShowLocationGuideDialog;
    protected AsyncSelectorSerialize mSportPreCheckCondition = new AsyncSelectorSerialize(new Handler(Looper.getMainLooper())) { // from class: com.huawei.healthcloud.plugintrack.ui.activity.AbstractSportActivity.5
        @Override // com.huawei.ui.commonui.linechart.utils.AsyncSelectorSerialize
        public void onFailed(int i) {
            LogUtil.j(AbstractSportActivity.TAG, "sport pre condition check failed with error code:", Integer.valueOf(i));
            AbstractSportActivity.this.finish();
        }

        @Override // com.huawei.ui.commonui.linechart.utils.AsyncSelectorSerialize
        public void onSuccess(Map map) {
            LogUtil.a(AbstractSportActivity.TAG, "sport pre condition check success.", map);
            AbstractSportActivity.this.doAfterPreCheck();
        }
    };

    protected abstract void doAfterPreCheck();

    protected abstract PermissionUtil.PermissionType getPermissionType();

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mContext = this;
        initPreCheckAction();
        this.mSportPreCheckCondition.run();
    }

    protected void initPreCheckAction() {
        addPermissionCheck();
    }

    private void addPermissionCheck() {
        final c cVar = new c(this);
        this.mSportPreCheckCondition.add(new AsyncSelectorSerialize.Action() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.AbstractSportActivity.2
            @Override // com.huawei.ui.commonui.linechart.utils.AsyncSelectorSerialize.Action
            public int getFailedValue() {
                return 1;
            }

            @Override // com.huawei.ui.commonui.linechart.utils.AsyncSelectorSerialize.Action
            public void execute(Map map) {
                PermissionUtil.PermissionType permissionType = AbstractSportActivity.this.getPermissionType();
                if (!AbstractSportActivity.this.isNeedObtainLocationPermission(permissionType) || !PermissionUtil.a()) {
                    PermissionUtil.d(AbstractSportActivity.this.mContext, permissionType, cVar);
                } else if (dep.e(AbstractSportActivity.this.mContext)) {
                    AbstractSportActivity abstractSportActivity = AbstractSportActivity.this;
                    abstractSportActivity.showOpenBackGroundPermissionGuide(abstractSportActivity.mContext, permissionType, cVar);
                } else {
                    PermissionUtil.d(AbstractSportActivity.this.mContext, permissionType, cVar);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showOpenBackGroundPermissionGuide(Context context, final PermissionUtil.PermissionType permissionType, final CustomPermissionAction customPermissionAction) {
        if (this.mIsShowLocationGuideDialog) {
            LogUtil.j(TAG, "showOpenBackGroundPermissionGuide has show");
            npg.d().e("sportTrackTempLocation");
            finish();
        } else {
            LogUtil.a(TAG, "Show Open Background Permission Guide Dialog.");
            NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(context).a(context.getString(R.string.IDS_hw_need_always_access_location_permissions_tips)).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.AbstractSportActivity.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.a(AbstractSportActivity.TAG, "showOpenBackGroundPermissionGuide cancel");
                    npg.d().e("sportTrackTempLocation");
                    AbstractSportActivity.this.mSportPreCheckCondition.postError();
                }
            }).c(R.string.IDS_common_enable_button, new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.AbstractSportActivity.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.a(AbstractSportActivity.TAG, "showOpenBackGroundPermissionGuide onClick");
                    PermissionUtil.d(AbstractSportActivity.this.mContext, permissionType, customPermissionAction);
                }
            }).c();
            noTitleCustomAlertDialogC.setCancelable(false);
            noTitleCustomAlertDialogC.show();
            this.mIsShowLocationGuideDialog = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isNeedObtainLocationPermission(PermissionUtil.PermissionType permissionType) {
        return permissionType == PermissionUtil.PermissionType.LOCATION || permissionType == PermissionUtil.PermissionType.LOCATION_WITH_BACKGROUND;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleOnDenied(CustomPermissionAction customPermissionAction) {
        LogUtil.j(TAG, "TrackBaseActivity CustomPermissionAction onDenied.");
        PermissionUtil.PermissionType permissionType = getPermissionType();
        if (isNeedObtainLocationPermission(permissionType) && PermissionUtil.a()) {
            if (dep.e(this.mContext)) {
                showOpenBackGroundPermissionGuide(this.mContext, permissionType, customPermissionAction);
                return;
            } else {
                this.mSportPreCheckCondition.postError();
                return;
            }
        }
        this.mSportPreCheckCondition.postError();
    }

    public static class c extends CustomPermissionAction {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<AbstractSportActivity> f10788b;

        public c(AbstractSportActivity abstractSportActivity) {
            super(abstractSportActivity);
            this.f10788b = new WeakReference<>(abstractSportActivity);
        }

        @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onGranted() {
            LogUtil.a(AbstractSportActivity.TAG, "TrackBaseActivity CustomPermissionAction onGranted.");
            AbstractSportActivity abstractSportActivity = this.f10788b.get();
            if (abstractSportActivity == null) {
                LogUtil.a(AbstractSportActivity.TAG, "AbstractSportActivity is null in onGranted");
            } else {
                abstractSportActivity.mSportPreCheckCondition.next(null);
            }
        }

        @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onDenied(String str) {
            super.onDenied(str);
            AbstractSportActivity abstractSportActivity = this.f10788b.get();
            if (abstractSportActivity == null) {
                LogUtil.a(AbstractSportActivity.TAG, "AbstractSportActivity is null in onDenied");
            } else {
                abstractSportActivity.handleOnDenied(this);
            }
        }

        @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
            final AbstractSportActivity abstractSportActivity = this.f10788b.get();
            if (abstractSportActivity == null) {
                LogUtil.a(AbstractSportActivity.TAG, "AbstractSportActivity is null in onForeverDenied");
            } else {
                super.onForeverDenied(permissionType, new View.OnClickListener() { // from class: jhm
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        abstractSportActivity.mSportPreCheckCondition.postError();
                    }
                }, new View.OnClickListener() { // from class: jhp
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        abstractSportActivity.mSportPreCheckCondition.postError();
                    }
                });
            }
        }
    }
}
