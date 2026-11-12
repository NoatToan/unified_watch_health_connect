package com.xiaomi.fitness.login.privacy;

import android.content.DialogInterface;
import android.os.Process;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.baseui.dialog.PrivacySensitiveDialog;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppVersionUtil;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.login.bean.PrivacyAgreeModel;
import com.xiaomi.fitness.login.bean.PrivacyModel;
import com.xiaomi.fitness.login.preference.PrivacyPreference;
import com.xiaomi.fitness.login.preference.PrivacyVersionPreference;
import com.xiaomi.fitness.login.privacy.CheckerPrivacyVersion;
import com.xiaomi.fitness.login.request.PrivacyRequest;
import com.xiaomi.fitness.login.util.PrivacyUrlsKt;
import com.xiaomi.fitness.login.util.hyperlink.a;
import com.xiaomi.fitness.net.response.BaseResponse;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import defpackage.av6;
import defpackage.g0j;
import defpackage.mui;
import defpackage.of4;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J(\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0012H\u0002J\b\u0010\u001c\u001a\u00020\u0014H\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0006\u0010!\u001a\u00020\u0014J\u0010\u0010\"\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/login/privacy/CheckerPrivacyVersion;", "", "<init>", "()V", "isDataRequest", "", "APP_PRIVACY_ID", "", "mPrivacyDialog", "Lcom/xiaomi/fitness/baseui/dialog/PrivacySensitiveDialog;", "getMPrivacyDialog", "()Lcom/xiaomi/fitness/baseui/dialog/PrivacySensitiveDialog;", "setMPrivacyDialog", "(Lcom/xiaomi/fitness/baseui/dialog/PrivacySensitiveDialog;)V", "mPrivacyAgreeDialog", "getMPrivacyAgreeDialog", "setMPrivacyAgreeDialog", "TAG", "", Constants.KEY_REQUEST_DATA, "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "checkPrivacyChange", "showPrivacyChangeDialog", "popType", "changeLog", DeviceTagInterface.TAG_VERSION_CODE, "reportAgreeTime", "buildPrivacyModel", "Lcom/xiaomi/fitness/login/bean/PrivacyAgreeModel;", "time", "", "reportRemovePrivacyAgreeTime", "buildRemovePrivacyModel", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CheckerPrivacyVersion {
    private static boolean isDataRequest;

    @Nullable
    private static PrivacySensitiveDialog mPrivacyAgreeDialog;

    @Nullable
    private static PrivacySensitiveDialog mPrivacyDialog;

    @NotNull
    public static final CheckerPrivacyVersion INSTANCE = new CheckerPrivacyVersion();
    private static final int APP_PRIVACY_ID = 1;

    @NotNull
    private static final String TAG = "CheckerPrivacyVersion";

    private CheckerPrivacyVersion() {
    }

    private final PrivacyAgreeModel buildPrivacyModel(long time) {
        PrivacyAgreeModel privacyAgreeModel = new PrivacyAgreeModel();
        privacyAgreeModel.did = "xiaomiwear_app";
        privacyAgreeModel.time = time;
        privacyAgreeModel.appVersion = AppVersionUtil.INSTANCE.getAppVersionName();
        privacyAgreeModel.privacyId = APP_PRIVACY_ID;
        privacyAgreeModel.privacyVersion = PrivacyVersionPreference.INSTANCE.getPrivacyVersion();
        return privacyAgreeModel;
    }

    private final PrivacyAgreeModel buildRemovePrivacyModel(long time) {
        PrivacyAgreeModel privacyAgreeModel = new PrivacyAgreeModel();
        privacyAgreeModel.did = "xiaomiwear_app";
        privacyAgreeModel.type = "remove";
        privacyAgreeModel.time = time;
        privacyAgreeModel.appVersion = AppVersionUtil.INSTANCE.getAppVersionName();
        privacyAgreeModel.privacyId = APP_PRIVACY_ID;
        privacyAgreeModel.privacyVersion = PrivacyVersionPreference.INSTANCE.getPrivacyVersion();
        return privacyAgreeModel;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.ref.WeakReference] */
    private final void checkPrivacyChange(FragmentActivity activity) {
        if (!of4.d) {
            PrivacyPreference.INSTANCE.setPrivacyDialogFinished(true);
            return;
        }
        String privacyVersion = PrivacyVersionPreference.INSTANCE.getPrivacyVersion();
        Logger.i(TAG, "version: " + privacyVersion);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new WeakReference(activity);
        PrivacyRequest.checkPrivacyUpdate$default(new PrivacyRequest(), APP_PRIVACY_ID, privacyVersion, new Function1() { // from class: dv3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CheckerPrivacyVersion.checkPrivacyChange$lambda$0(objectRef, (PrivacyModel.ChangeResult) obj);
            }
        }, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit checkPrivacyChange$lambda$0(Ref.ObjectRef ref, PrivacyModel.ChangeResult it) {
        Intrinsics.checkNotNullParameter(ref, "$ref");
        Intrinsics.checkNotNullParameter(it, "it");
        String str = TAG;
        Logger.i(str, "result: " + it);
        FragmentActivity fragmentActivity = (FragmentActivity) ((WeakReference) ref.element).get();
        if (fragmentActivity == null) {
            Logger.i(str, "activity is null");
            return Unit.INSTANCE;
        }
        if (fragmentActivity.isFinishing()) {
            Logger.i(str, "activity is finishing");
            return Unit.INSTANCE;
        }
        Logger.i(str, "checkPrivacyUpdate:" + it.ver);
        if (TextUtils.isEmpty(it.ver)) {
            PrivacyPreference.INSTANCE.setPrivacyDialogFinished(true);
            return Unit.INSTANCE;
        }
        if (TextUtils.isEmpty(it.changeLog)) {
            PrivacyPreference.INSTANCE.setPrivacyDialogFinished(true);
            return Unit.INSTANCE;
        }
        CheckerPrivacyVersion checkerPrivacyVersion = INSTANCE;
        int i = it.popType;
        String changeLog = it.changeLog;
        Intrinsics.checkNotNullExpressionValue(changeLog, "changeLog");
        String ver = it.ver;
        Intrinsics.checkNotNullExpressionValue(ver, "ver");
        checkerPrivacyVersion.showPrivacyChangeDialog(fragmentActivity, i, changeLog, ver);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportAgreeTime() {
        PrivacyPreference privacyPreference = PrivacyPreference.INSTANCE;
        if (privacyPreference.getPrivacyAgreeTime() > 0) {
            PrivacyAgreeModel privacyAgreeModelBuildPrivacyModel = buildPrivacyModel(privacyPreference.getPrivacyAgreeTime() / ((long) 1000));
            Logger.d(TAG, "reportAgreeTime:" + privacyAgreeModelBuildPrivacyModel);
            PrivacyRequest.reportPrivacy$default(new PrivacyRequest(), privacyAgreeModelBuildPrivacyModel, new Function1() { // from class: cv3
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return CheckerPrivacyVersion.reportAgreeTime$lambda$1((BaseResponse) obj);
                }
            }, null, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reportAgreeTime$lambda$1(BaseResponse it) {
        Intrinsics.checkNotNullParameter(it, "it");
        PrivacyPreference.INSTANCE.setPrivacyAgreeTime(0L);
        Logger.i(TAG + "reportAgreeTime,success", new Object[0]);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reportRemovePrivacyAgreeTime$lambda$2(BaseResponse it) {
        Intrinsics.checkNotNullParameter(it, "it");
        PrivacyPreference.INSTANCE.setPrivacyAgreeTime(0L);
        Logger.i(TAG + "reportRemovePrivacyAgreeTime, success", new Object[0]);
        return Unit.INSTANCE;
    }

    private final void showPrivacyChangeDialog(FragmentActivity activity, int popType, String changeLog, final String ver) {
        Boolean boolValueOf;
        PrivacySensitiveDialog privacySensitiveDialog;
        PrivacySensitiveDialog privacySensitiveDialog2;
        String string = ApplicationExtKt.getApplication().getResources().getString(g0j.L, PrivacyUrlsKt.getWatchAgreementHtmlSwitchRegionUrlOnFirst(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null), "app"));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String str = changeLog + "<br>" + string;
        if (popType == 1) {
            CharSequence charSequenceB = a.b(str);
            if (mPrivacyDialog == null) {
                mPrivacyDialog = new PrivacySensitiveDialog.a("repeat").setCustomLayoutId(mui.g).setPositiveText(g0j.common_known).setCancelable(false).create();
            }
            PrivacySensitiveDialog privacySensitiveDialog3 = mPrivacyDialog;
            if (privacySensitiveDialog3 != null) {
                privacySensitiveDialog3.B(charSequenceB);
            }
            PrivacySensitiveDialog privacySensitiveDialog4 = mPrivacyDialog;
            Intrinsics.checkNotNull(privacySensitiveDialog4 != null ? privacySensitiveDialog4.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.login.privacy.CheckerPrivacyVersion.showPrivacyChangeDialog.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                    Intrinsics.checkNotNullParameter(dialog, "dialog");
                    super.onDialogClick(dialogName, dialog, which);
                    if (which == -1) {
                        PrivacyVersionPreference.INSTANCE.setPrivacyVersion(ver);
                        PrivacyPreference privacyPreference = PrivacyPreference.INSTANCE;
                        privacyPreference.setPrivacyAgreeTime(System.currentTimeMillis());
                        CheckerPrivacyVersion.INSTANCE.reportAgreeTime();
                        dialog.dismiss();
                        privacyPreference.setPrivacyDialogFinished(true);
                    }
                }

                @Override // defpackage.av6
                public void onDialogMultiClick(String dialogName, int which, boolean isChecked) {
                    Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                    super.onDialogMultiClick(dialogName, which, isChecked);
                }
            }) : null, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.dialog.CommonDialog<*>");
            PrivacySensitiveDialog privacySensitiveDialog5 = mPrivacyDialog;
            boolValueOf = privacySensitiveDialog5 != null ? Boolean.valueOf(privacySensitiveDialog5.isShowing()) : null;
            Intrinsics.checkNotNull(boolValueOf);
            if (boolValueOf.booleanValue() || (privacySensitiveDialog = mPrivacyDialog) == null) {
                return;
            }
            privacySensitiveDialog.showIfNeed(activity.getSupportFragmentManager());
            return;
        }
        if (popType != 2) {
            PrivacyPreference.INSTANCE.setPrivacyDialogFinished(true);
            PrivacyVersionPreference.INSTANCE.setPrivacyVersion(ver);
            reportAgreeTime();
            return;
        }
        CharSequence charSequenceB2 = a.b(str);
        if (mPrivacyAgreeDialog == null) {
            mPrivacyAgreeDialog = new PrivacySensitiveDialog.a("repeat").setCustomLayoutId(mui.g).setPositiveText(g0j.A).setNegativeText(g0j.B).setCancelable(false).create();
        }
        PrivacySensitiveDialog privacySensitiveDialog6 = mPrivacyAgreeDialog;
        if (privacySensitiveDialog6 != null) {
            privacySensitiveDialog6.B(charSequenceB2);
        }
        PrivacySensitiveDialog privacySensitiveDialog7 = mPrivacyAgreeDialog;
        Intrinsics.checkNotNull(privacySensitiveDialog7 != null ? privacySensitiveDialog7.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.login.privacy.CheckerPrivacyVersion.showPrivacyChangeDialog.2
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    PrivacyPreference.INSTANCE.setPrivacyDialogFinished(true);
                    Process.killProcess(Process.myPid());
                } else {
                    if (which != -1) {
                        return;
                    }
                    PrivacyVersionPreference.INSTANCE.setPrivacyVersion(ver);
                    PrivacyPreference privacyPreference = PrivacyPreference.INSTANCE;
                    privacyPreference.setPrivacyAgreeTime(System.currentTimeMillis());
                    CheckerPrivacyVersion.INSTANCE.reportAgreeTime();
                    privacyPreference.setPrivacyDialogFinished(true);
                    dialog.dismiss();
                }
            }

            @Override // defpackage.av6
            public void onDialogMultiClick(String dialogName, int which, boolean isChecked) {
                Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                super.onDialogMultiClick(dialogName, which, isChecked);
            }
        }) : null, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.dialog.CommonDialog<*>");
        PrivacySensitiveDialog privacySensitiveDialog8 = mPrivacyAgreeDialog;
        boolValueOf = privacySensitiveDialog8 != null ? Boolean.valueOf(privacySensitiveDialog8.isShowing()) : null;
        Intrinsics.checkNotNull(boolValueOf);
        if (boolValueOf.booleanValue() || (privacySensitiveDialog2 = mPrivacyAgreeDialog) == null) {
            return;
        }
        privacySensitiveDialog2.showIfNeed(activity.getSupportFragmentManager());
    }

    @Nullable
    public final PrivacySensitiveDialog getMPrivacyAgreeDialog() {
        return mPrivacyAgreeDialog;
    }

    @Nullable
    public final PrivacySensitiveDialog getMPrivacyDialog() {
        return mPrivacyDialog;
    }

    public final void reportRemovePrivacyAgreeTime() {
        PrivacyAgreeModel privacyAgreeModelBuildRemovePrivacyModel = buildRemovePrivacyModel(System.currentTimeMillis() / ((long) 1000));
        Logger.d(TAG, "reportRemovePrivacyAgreeTime:" + privacyAgreeModelBuildRemovePrivacyModel);
        PrivacyRequest.reportPrivacy$default(new PrivacyRequest(), privacyAgreeModelBuildRemovePrivacyModel, new Function1() { // from class: bv3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CheckerPrivacyVersion.reportRemovePrivacyAgreeTime$lambda$2((BaseResponse) obj);
            }
        }, null, 4, null);
    }

    public final void requestData(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (NetUtil.INSTANCE.getNetWorkAvailable(ApplicationExtKt.getApplication()) && AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            checkPrivacyChange(activity);
            isDataRequest = true;
        }
    }

    public final void setMPrivacyAgreeDialog(@Nullable PrivacySensitiveDialog privacySensitiveDialog) {
        mPrivacyAgreeDialog = privacySensitiveDialog;
    }

    public final void setMPrivacyDialog(@Nullable PrivacySensitiveDialog privacySensitiveDialog) {
        mPrivacyDialog = privacySensitiveDialog;
    }
}
