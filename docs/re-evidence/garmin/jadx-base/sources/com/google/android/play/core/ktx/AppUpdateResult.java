package com.google.android.play.core.ktx;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateOptions;
import com.google.android.play.core.install.InstallState;
import f.c;
import f.i;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import t13.d;
import u13.a;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/google/android/play/core/ktx/AppUpdateResult;", "", "()V", "Available", "Downloaded", "InProgress", "NotAvailable", "Lcom/google/android/play/core/ktx/AppUpdateResult$Available;", "Lcom/google/android/play/core/ktx/AppUpdateResult$Downloaded;", "Lcom/google/android/play/core/ktx/AppUpdateResult$InProgress;", "Lcom/google/android/play/core/ktx/AppUpdateResult$NotAvailable;", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_app_update_ktx"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class AppUpdateResult {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/google/android/play/core/ktx/AppUpdateResult$Downloaded;", "Lcom/google/android/play/core/ktx/AppUpdateResult;", "Lcom/google/android/play/core/appupdate/AppUpdateManager;", "appUpdateManager", "<init>", "(Lcom/google/android/play/core/appupdate/AppUpdateManager;)V", "", "completeUpdate", "(Lt13/d;)Ljava/lang/Object;", "Lcom/google/android/play/core/appupdate/AppUpdateManager;", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_app_update_ktx"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Downloaded extends AppUpdateResult {
        private final AppUpdateManager appUpdateManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Downloaded(AppUpdateManager appUpdateManager) {
            super(null);
            appUpdateManager.getClass();
            this.appUpdateManager = appUpdateManager;
        }

        public final Object completeUpdate(d<? super Unit> dVar) {
            Object objRequestCompleteUpdate = AppUpdateManagerKtxKt.requestCompleteUpdate(this.appUpdateManager, dVar);
            return objRequestCompleteUpdate == a.COROUTINE_SUSPENDED ? objRequestCompleteUpdate : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/google/android/play/core/ktx/AppUpdateResult$InProgress;", "Lcom/google/android/play/core/ktx/AppUpdateResult;", "installState", "Lcom/google/android/play/core/install/InstallState;", "(Lcom/google/android/play/core/install/InstallState;)V", "getInstallState", "()Lcom/google/android/play/core/install/InstallState;", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_app_update_ktx"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class InProgress extends AppUpdateResult {
        private final InstallState installState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InProgress(InstallState installState) {
            super(null);
            installState.getClass();
            this.installState = installState;
        }

        public final InstallState getInstallState() {
            return this.installState;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/android/play/core/ktx/AppUpdateResult$NotAvailable;", "Lcom/google/android/play/core/ktx/AppUpdateResult;", "()V", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_app_update_ktx"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NotAvailable extends AppUpdateResult {
        public static final NotAvailable INSTANCE = new NotAvailable();

        private NotAvailable() {
            super(null);
        }
    }

    public /* synthetic */ AppUpdateResult(j jVar) {
        this();
    }

    private AppUpdateResult() {
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\f\u0010\u0012J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\f\u0010\u0015J\u001b\u0010\u0016\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0016\u0010\rJ\u001d\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/google/android/play/core/ktx/AppUpdateResult$Available;", "Lcom/google/android/play/core/ktx/AppUpdateResult;", "Lcom/google/android/play/core/appupdate/AppUpdateManager;", "appUpdateManager", "Lcom/google/android/play/core/appupdate/AppUpdateInfo;", "updateInfo", "<init>", "(Lcom/google/android/play/core/appupdate/AppUpdateManager;Lcom/google/android/play/core/appupdate/AppUpdateInfo;)V", "Lf/c;", "Lf/i;", "activityResultLauncher", "", "startFlexibleUpdate", "(Lf/c;)Z", "Landroid/app/Activity;", "activity", "", "requestCode", "(Landroid/app/Activity;I)Z", "Landroidx/fragment/app/Fragment;", "fragment", "(Landroidx/fragment/app/Fragment;I)Z", "startImmediateUpdate", "Lcom/google/android/play/core/appupdate/AppUpdateManager;", "Lcom/google/android/play/core/appupdate/AppUpdateInfo;", "getUpdateInfo", "()Lcom/google/android/play/core/appupdate/AppUpdateInfo;", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_app_update_ktx"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Available extends AppUpdateResult {
        private final AppUpdateManager appUpdateManager;
        private final AppUpdateInfo updateInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Available(AppUpdateManager appUpdateManager, AppUpdateInfo appUpdateInfo) {
            super(null);
            appUpdateManager.getClass();
            appUpdateInfo.getClass();
            this.appUpdateManager = appUpdateManager;
            this.updateInfo = appUpdateInfo;
        }

        public final AppUpdateInfo getUpdateInfo() {
            return this.updateInfo;
        }

        public final boolean startFlexibleUpdate(Fragment fragment, int requestCode) {
            fragment.getClass();
            AppUpdateManager appUpdateManager = this.appUpdateManager;
            AppUpdateInfo appUpdateInfo = this.updateInfo;
            AppUpdateOptions appUpdateOptionsBuild = AppUpdateOptions.newBuilder(0).build();
            appUpdateOptionsBuild.getClass();
            return AppUpdateManagerKtxKt.startUpdateFlowForResult(appUpdateManager, appUpdateInfo, fragment, appUpdateOptionsBuild, requestCode);
        }

        public final boolean startImmediateUpdate(Fragment fragment, int requestCode) {
            fragment.getClass();
            AppUpdateManager appUpdateManager = this.appUpdateManager;
            AppUpdateInfo appUpdateInfo = this.updateInfo;
            AppUpdateOptions appUpdateOptionsBuild = AppUpdateOptions.newBuilder(1).build();
            appUpdateOptionsBuild.getClass();
            return AppUpdateManagerKtxKt.startUpdateFlowForResult(appUpdateManager, appUpdateInfo, fragment, appUpdateOptionsBuild, requestCode);
        }

        public final boolean startFlexibleUpdate(Activity activity, int requestCode) {
            activity.getClass();
            return this.appUpdateManager.startUpdateFlowForResult(this.updateInfo, activity, AppUpdateOptions.newBuilder(0).build(), requestCode);
        }

        public final boolean startImmediateUpdate(Activity activity, int requestCode) {
            activity.getClass();
            return this.appUpdateManager.startUpdateFlowForResult(this.updateInfo, activity, AppUpdateOptions.newBuilder(1).build(), requestCode);
        }

        public final boolean startFlexibleUpdate(c<i> activityResultLauncher) {
            activityResultLauncher.getClass();
            return this.appUpdateManager.startUpdateFlowForResult(this.updateInfo, activityResultLauncher, AppUpdateOptions.newBuilder(0).build());
        }

        public final boolean startImmediateUpdate(c<i> activityResultLauncher) {
            activityResultLauncher.getClass();
            return this.appUpdateManager.startUpdateFlowForResult(this.updateInfo, activityResultLauncher, AppUpdateOptions.newBuilder(1).build());
        }
    }
}
