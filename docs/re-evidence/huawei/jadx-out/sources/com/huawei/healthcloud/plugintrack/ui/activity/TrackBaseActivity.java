package com.huawei.healthcloud.plugintrack.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.manager.inteface.ViewHolderInterface;
import com.huawei.healthcloud.plugintrack.ui.activity.TrackBaseActivity;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import defpackage.dep;
import defpackage.iwy;
import defpackage.ltd;
import defpackage.npg;
import defpackage.qrs;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TrackBaseActivity extends BaseActivity implements ActivityCompat.OnRequestPermissionsResultCallback {
    private static final int MSG_HAS_PERMISSIONS = 0;
    private static final int MSG_NO_PERMISSIONS = 1;
    private static final String TAG = "Track_TrackBaseActivity";
    private Context mContext;
    private CustomPermissionAction mPermissionAction;
    protected Handler mPermissionHandler;
    protected ViewHolderInterface mViewHolderInterface = null;
    private boolean mIsShowLocationGuideDialog = false;

    protected abstract void initSport();

    protected abstract void initSport(boolean z);

    protected abstract ViewHolderInterface initViewHolder();

    protected boolean isNeedActivityPermission() {
        return false;
    }

    protected boolean isNeedLocationPermission() {
        return true;
    }

    protected boolean isNeedStorgePermission() {
        return true;
    }

    protected boolean isSport() {
        return false;
    }

    protected abstract void setActvityLayoutModel();

    public TrackBaseActivity() {
        this.mPermissionHandler = new e();
        this.mPermissionAction = new d();
    }

    protected void init() {
        ViewHolderInterface viewHolderInterfaceInitViewHolder = initViewHolder();
        this.mViewHolderInterface = viewHolderInterfaceInitViewHolder;
        if (viewHolderInterfaceInitViewHolder != null) {
            viewHolderInterfaceInitViewHolder.setEventListener();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PermissionUtil.PermissionType getPermissionType() {
        boolean zIsNeedActivityPermission = isNeedActivityPermission();
        if (isNeedLocationPermission()) {
            if (zIsNeedActivityPermission) {
                return PermissionUtil.PermissionType.ACTIVITY_LOCATION;
            }
            return dep.a();
        }
        if (isNeedStorgePermission()) {
            if (zIsNeedActivityPermission) {
                return PermissionUtil.PermissionType.ACTIVITY_MEDIA_VIDEO_IMAGES;
            }
            return PermissionUtil.PermissionType.MEDIA_VIDEO_IMAGES;
        }
        if (zIsNeedActivityPermission) {
            return PermissionUtil.PermissionType.ACTIVITY;
        }
        return PermissionUtil.PermissionType.NONE;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mContext = this;
        if (isSport() && bundle != null) {
            finish();
            return;
        }
        if (qrs.ah(this.mContext) || isHasPermissions()) {
            this.mPermissionHandler.sendEmptyMessage(0);
        } else {
            checkPermission();
        }
        setActvityLayoutModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isHasPermissions() {
        boolean zB = PermissionUtil.b(BaseApplication.getContext(), new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"});
        boolean zB2 = PermissionUtil.b(BaseApplication.getContext(), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"});
        boolean zJ = PermissionUtil.j();
        boolean zIsHasActivityPermission = isHasActivityPermission();
        LogUtil.a(TAG, "isHasLocation:", Boolean.valueOf(zB), " isHasStorage:", Boolean.valueOf(zB2), " isUseOnlyAllowedLocation():", Boolean.valueOf(zJ), " isActivity: ", Boolean.valueOf(zIsHasActivityPermission));
        return zB && zB2 && zJ && zIsHasActivityPermission;
    }

    /* JADX INFO: loaded from: classes10.dex */
    static class e extends BaseHandler<TrackBaseActivity> {
        private e(TrackBaseActivity trackBaseActivity) {
            super(trackBaseActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(TrackBaseActivity trackBaseActivity, Message message) {
            LogUtil.a(TrackBaseActivity.TAG, "PermissionHandler handleMessageWhenReferenceNotNull message.what ", Integer.valueOf(message.what));
            int i = message.what;
            if (i != 0) {
                if (i != 1) {
                    return;
                }
                trackBaseActivity.finish();
            } else {
                trackBaseActivity.init();
                if (iwy.a(BaseApplication.getContext()).aq()) {
                    trackBaseActivity.initSport(true);
                } else {
                    trackBaseActivity.initSport();
                }
            }
        }
    }

    private void checkPermission() {
        PermissionUtil.PermissionType permissionType = getPermissionType();
        if (isNeedObtainLocationPermission(permissionType) && PermissionUtil.b()) {
            if (dep.e(this.mContext)) {
                showOpenBackGroundPermissionGuide(this.mContext, permissionType);
                return;
            } else {
                PermissionUtil.d(this.mContext, permissionType, this.mPermissionAction);
                return;
            }
        }
        PermissionUtil.d(this.mContext, permissionType, this.mPermissionAction);
    }

    private boolean isHasActivityPermission() {
        return !isNeedActivityPermission() || ContextCompat.checkSelfPermission(this.mContext, "android.permission.ACTIVITY_RECOGNITION") == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showOpenBackGroundPermissionGuide(Context context, final PermissionUtil.PermissionType permissionType) {
        if (this.mIsShowLocationGuideDialog) {
            LogUtil.j(TAG, "showOpenBackGroundPermissionGuide has show");
            npg.d().e("sportTrackTempLocation");
            finish();
        } else {
            LogUtil.a(TAG, "Show Open Background Permission Guide Dialog.");
            NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(context).a(context.getString(R.string.IDS_hw_need_always_access_location_permissions_tips)).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.TrackBaseActivity.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.a(TrackBaseActivity.TAG, "showOpenBackGroundPermissionGuide cancel");
                    npg.d().e("sportTrackTempLocation");
                    TrackBaseActivity.this.finish();
                }
            }).c(R.string.IDS_common_enable_button, new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.TrackBaseActivity.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.a(TrackBaseActivity.TAG, "showOpenBackGroundPermissionGuide onClick");
                    PermissionUtil.d(TrackBaseActivity.this.mContext, permissionType, TrackBaseActivity.this.mPermissionAction);
                }
            }).c();
            noTitleCustomAlertDialogC.setCancelable(false);
            noTitleCustomAlertDialogC.show();
            this.mIsShowLocationGuideDialog = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isNeedObtainLocationPermission(PermissionUtil.PermissionType permissionType) {
        return permissionType == PermissionUtil.PermissionType.LOCATION || permissionType == PermissionUtil.PermissionType.LOCATION_WITH_BACKGROUND || permissionType == PermissionUtil.PermissionType.ACTIVITY_LOCATION;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isApplyBackgroundLocationPermission() {
        return (!isNeedLocationPermission() || PermissionUtil.j() || PermissionUtil.e(this.mContext, PermissionUtil.PermissionType.LOCATION_WITH_BACKGROUND) == PermissionUtil.PermissionResult.GRANTED) ? false : true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ltd.e().d(this.mPermissionAction);
        this.mPermissionAction = null;
    }

    /* JADX INFO: loaded from: classes10.dex */
    public static class d extends CustomPermissionAction {
        private final WeakReference<TrackBaseActivity> e;

        private d(TrackBaseActivity trackBaseActivity) {
            super(trackBaseActivity);
            this.e = new WeakReference<>(trackBaseActivity);
        }

        @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onGranted() {
            TrackBaseActivity trackBaseActivity = this.e.get();
            if (trackBaseActivity == null || trackBaseActivity.isDestroyed() || trackBaseActivity.isFinishing()) {
                ReleaseLogUtil.e(TrackBaseActivity.TAG, "activity is null in WeakCustomPermissionAction");
                return;
            }
            LogUtil.a(TrackBaseActivity.TAG, "TrackBaseActivity CustomPermissionAction onGranted.");
            if (trackBaseActivity.isHasPermissions() || !trackBaseActivity.isApplyBackgroundLocationPermission()) {
                if (trackBaseActivity.mPermissionHandler != null) {
                    trackBaseActivity.mPermissionHandler.sendEmptyMessage(0);
                    return;
                }
                return;
            }
            PermissionUtil.d(trackBaseActivity, PermissionUtil.PermissionType.LOCATION_WITH_BACKGROUND, trackBaseActivity.mPermissionAction);
        }

        @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onDenied(String str) {
            super.onDenied(str);
            TrackBaseActivity trackBaseActivity = this.e.get();
            if (trackBaseActivity == null || trackBaseActivity.isDestroyed() || trackBaseActivity.isFinishing()) {
                ReleaseLogUtil.e(TrackBaseActivity.TAG, "activity is null in WeakCustomPermissionAction");
                return;
            }
            LogUtil.j(TrackBaseActivity.TAG, "TrackBaseActivity CustomPermissionAction onDenied.");
            if (trackBaseActivity.isHasPermissions() && trackBaseActivity.mPermissionHandler != null) {
                trackBaseActivity.mPermissionHandler.sendEmptyMessage(0);
                return;
            }
            PermissionUtil.PermissionType permissionType = trackBaseActivity.getPermissionType();
            if (trackBaseActivity.isNeedObtainLocationPermission(permissionType) && PermissionUtil.b()) {
                if (!dep.e(trackBaseActivity)) {
                    trackBaseActivity.finish();
                    return;
                } else {
                    trackBaseActivity.showOpenBackGroundPermissionGuide(trackBaseActivity, permissionType);
                    return;
                }
            }
            trackBaseActivity.finish();
        }

        @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
            final TrackBaseActivity trackBaseActivity = this.e.get();
            if (trackBaseActivity == null || trackBaseActivity.isDestroyed() || trackBaseActivity.isFinishing()) {
                ReleaseLogUtil.e(TrackBaseActivity.TAG, "activity is null in WeakCustomPermissionAction");
                return;
            }
            LogUtil.j(TrackBaseActivity.TAG, "TrackBaseActivity CustomPermissionAction onForeverDenied. ", "permissionType: ", permissionType);
            if (permissionType == PermissionUtil.PermissionType.LOCATION_WITH_BACKGROUND) {
                qrs.b(trackBaseActivity, permissionType, new View.OnClickListener() { // from class: jkh
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        trackBaseActivity.finish();
                    }
                }, new View.OnClickListener() { // from class: jkf
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TrackBaseActivity.d.a(trackBaseActivity, view);
                    }
                });
            } else if (dep.d(permissionType) || permissionType == PermissionUtil.PermissionType.ACTIVITY_LOCATION) {
                dep.c(trackBaseActivity, permissionType, PermissionUtil.PermissionResult.FOREVER_DENIED, true);
            }
        }

        public static /* synthetic */ void a(TrackBaseActivity trackBaseActivity, View view) {
            qrs.al(trackBaseActivity);
            trackBaseActivity.finish();
        }
    }
}
