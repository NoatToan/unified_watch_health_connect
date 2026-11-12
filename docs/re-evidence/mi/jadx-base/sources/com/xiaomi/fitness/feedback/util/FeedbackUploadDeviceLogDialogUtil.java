package com.xiaomi.fitness.feedback.util;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.baseui.dialog.CircleProgressDialog;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.feedback.bugreport.GetDeviceLog;
import com.xiaomi.fitness.feedback.export.WearosBugreportInter;
import com.xiaomi.fitness.wearos.export.WearOSUtil;
import com.xiaomi.fitness.wearos.export.WearOsExtKt;
import defpackage.a0j;
import defpackage.av6;
import defpackage.cri;
import defpackage.dah;
import defpackage.hui;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b-\u0010\rJ3\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJJ\u0010\u0019\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\t0\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ8\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\t0\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ8\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\t0\u0014¢\u0006\u0004\b\u001d\u0010\u001cJB\u0010\u001e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\t0\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010\"\u001a\u00020\t2\u0006\u0010!\u001a\u00020 2\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082D¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010+\u001a\b\u0012\u0002\b\u0003\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, d2 = {"Lcom/xiaomi/fitness/feedback/util/FeedbackUploadDeviceLogDialogUtil;", "Lcom/xiaomi/fitness/feedback/export/WearosBugreportInter;", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", LifecycleConstantKt.TYPE_ACTIVITY, "", "titleId", "resId", "Lav6;", "callback", "", "showSyncOrUploadDeviceLogDialogLoading", "(Lcom/xiaomi/fitness/baseui/view/BaseActivity;IILav6;)V", "dismissSyncOrUploadDeviceLogDeviceLogDialogLoading", "()V", "Landroidx/fragment/app/FragmentActivity;", "context", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "Lcom/xiaomi/fitness/feedback/util/WeakHandler;", "handler", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "message", "callBack", "showUploadDeviceLogDialog", "(Landroidx/fragment/app/FragmentActivity;Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Lcom/xiaomi/fitness/feedback/util/WeakHandler;Lkotlin/jvm/functions/Function1;)V", "syncHuamiDeviceLog", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Lkotlin/jvm/functions/Function1;)V", "syncBleDeviceLog", "syncWearOsBugreport", "(Landroidx/fragment/app/FragmentActivity;Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Lkotlin/jvm/functions/Function1;)V", "Ljava/io/File;", "file", "handBugreport", "(Ljava/io/File;Lkotlin/jvm/functions/Function1;)V", "", "TAG", "Ljava/lang/String;", "Lcom/xiaomi/fitness/baseui/dialog/CircleProgressDialog;", "mDeviceSyncLogLoadingDia", "Lcom/xiaomi/fitness/baseui/dialog/CircleProgressDialog;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "mDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "<init>", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FeedbackUploadDeviceLogDialogUtil implements WearosBugreportInter {

    @NotNull
    private final String TAG = "FeedbackUploadDeviceLogDialogUtil";

    @Nullable
    private CircleProgressDialog mDeviceSyncLogLoadingDia;

    @Nullable
    private CommonDialog<?> mDialog;

    public static /* synthetic */ void showSyncOrUploadDeviceLogDialogLoading$default(FeedbackUploadDeviceLogDialogUtil feedbackUploadDeviceLogDialogUtil, BaseActivity baseActivity, int i, int i2, av6 av6Var, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            av6Var = null;
        }
        feedbackUploadDeviceLogDialogUtil.showSyncOrUploadDeviceLogDialogLoading(baseActivity, i, i2, av6Var);
    }

    public final void dismissSyncOrUploadDeviceLogDeviceLogDialogLoading() {
        CircleProgressDialog circleProgressDialog = this.mDeviceSyncLogLoadingDia;
        if (circleProgressDialog == null || !circleProgressDialog.isShowing()) {
            return;
        }
        CircleProgressDialog circleProgressDialog2 = this.mDeviceSyncLogLoadingDia;
        if (circleProgressDialog2 != null) {
            circleProgressDialog2.dismiss();
        }
        this.mDeviceSyncLogLoadingDia = null;
    }

    @Override // com.xiaomi.fitness.feedback.export.WearosBugreportInter
    public void handBugreport(@NotNull File file, @Nullable Function1<? super Integer, Unit> handler) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (handler != null) {
            handler.invoke2(2);
        }
    }

    @SuppressLint({"InflateParams"})
    public final void showSyncOrUploadDeviceLogDialogLoading(@NotNull BaseActivity activity, int titleId, int resId, @Nullable av6 callback) {
        CircleProgressDialog circleProgressDialog;
        Intrinsics.checkNotNullParameter(activity, "activity");
        View viewInflate = LayoutInflater.from(activity).inflate(hui.l, (ViewGroup) null, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        TextView textView = (TextView) viewInflate.findViewById(cri.L);
        if (this.mDeviceSyncLogLoadingDia == null) {
            this.mDeviceSyncLogLoadingDia = new CircleProgressDialog.a("uploadDeviceLog").setDialogTitle(titleId).setCustomLayoutId(hui.l).setNegativeText(a0j.f485a).setCanceledOnTouchOutside(false).setCanceledOnBackPressed(false).setCancelable(false).create();
        }
        if (callback != null && (circleProgressDialog = this.mDeviceSyncLogLoadingDia) != null) {
            circleProgressDialog.addDialogCallback(callback);
        }
        if (textView != null) {
            textView.setText(resId);
        }
        CircleProgressDialog circleProgressDialog2 = this.mDeviceSyncLogLoadingDia;
        if (circleProgressDialog2 != null) {
            circleProgressDialog2.setPickerHintText(activity.getString(resId));
        }
        CircleProgressDialog circleProgressDialog3 = this.mDeviceSyncLogLoadingDia;
        if (circleProgressDialog3 != null) {
            circleProgressDialog3.showIfNeed(activity.getSupportFragmentManager());
        }
    }

    public final void showUploadDeviceLogDialog(@NotNull final FragmentActivity context, @NotNull final WearableDeviceModel deviceModel, @Nullable WeakHandler handler, @NotNull final Function1<? super Integer, Unit> callBack) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        Logger.d(this.TAG, "uploadDeviceLog is " + Boolean.valueOf(deviceModel.getIsDeviceConnected()));
        CommonDialog<?> commonDialog = this.mDialog;
        if (commonDialog == null || !commonDialog.isShowing()) {
            if (this.mDialog == null) {
                this.mDialog = new CommonDialog.c("upload").setDialogTitle(a0j.S).setDialogDescription(a0j.P).setNegativeText(a0j.f485a).setPositiveText(a0j.i).create();
            }
            CommonDialog<?> commonDialog2 = this.mDialog;
            if (commonDialog2 != null) {
                commonDialog2.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.feedback.util.FeedbackUploadDeviceLogDialogUtil.showUploadDeviceLogDialog.1
                    @Override // defpackage.av6
                    public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                        Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                        Intrinsics.checkNotNullParameter(dialog, "dialog");
                        super.onDialogClick(dialogName, dialog, which);
                        if (which == -2) {
                            dialog.dismiss();
                            callBack.invoke2(2);
                            FeedbackUploadDeviceLogDialogUtil.this.mDialog = null;
                        } else {
                            if (which != -1) {
                                return;
                            }
                            Logger.d(FeedbackUploadDeviceLogDialogUtil.this.TAG, "SYNC WEB showIfNeed");
                            WearableDeviceModel wearableDeviceModel = deviceModel;
                            FeedbackUploadDeviceLogDialogUtil feedbackUploadDeviceLogDialogUtil = FeedbackUploadDeviceLogDialogUtil.this;
                            Function1<Integer, Unit> function1 = callBack;
                            FragmentActivity fragmentActivity = context;
                            if (DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
                                feedbackUploadDeviceLogDialogUtil.syncHuamiDeviceLog(wearableDeviceModel, function1);
                            } else if (DeviceModelExtKt.isWearOS(wearableDeviceModel)) {
                                feedbackUploadDeviceLogDialogUtil.syncWearOsBugreport(fragmentActivity, wearableDeviceModel, function1);
                            } else {
                                feedbackUploadDeviceLogDialogUtil.syncBleDeviceLog(wearableDeviceModel, function1);
                            }
                            FeedbackUploadDeviceLogDialogUtil.this.mDialog = null;
                        }
                    }
                });
            }
            CommonDialog<?> commonDialog3 = this.mDialog;
            if (commonDialog3 != null) {
                commonDialog3.showIfNeed(context.getSupportFragmentManager());
            }
        }
    }

    public final void syncBleDeviceLog(@NotNull WearableDeviceModel deviceModel, @NotNull final Function1<? super Integer, Unit> handler) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(handler, "handler");
        GetDeviceLog.INSTANCE.syncLogFromBleDevice(deviceModel, new OnSyncCallback() { // from class: com.xiaomi.fitness.feedback.util.FeedbackUploadDeviceLogDialogUtil.syncBleDeviceLog.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(FeedbackUploadDeviceLogDialogUtil.this.TAG, "syncLogFromBleDevice onError type=" + type + "**code=" + code);
                ToastUtil.showToast("onError type=" + type + "**code=" + code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                Logger.i(FeedbackUploadDeviceLogDialogUtil.this.TAG, "sync log from ble device callback IS " + result);
                handler.invoke2(1);
            }
        });
    }

    public final void syncHuamiDeviceLog(@NotNull WearableDeviceModel deviceModel, @NotNull final Function1<? super Integer, Unit> handler) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(handler, "handler");
        GetDeviceLog.INSTANCE.syncDeviceLog(deviceModel, new dah() { // from class: com.xiaomi.fitness.feedback.util.FeedbackUploadDeviceLogDialogUtil.syncHuamiDeviceLog.1
            @Override // defpackage.dah
            public void onProgress(int progress) {
                Logger.d(FeedbackUploadDeviceLogDialogUtil.this.TAG, "ONPROGRESS " + progress);
            }

            @Override // defpackage.dah
            public void onStart() {
                Logger.i(FeedbackUploadDeviceLogDialogUtil.this.TAG, "syncDeviceLog onStart");
                handler.invoke2(1);
            }

            @Override // defpackage.dah
            public void onStop() {
                handler.invoke2(2);
                Logger.i(FeedbackUploadDeviceLogDialogUtil.this.TAG, "syncDeviceLog onStop");
            }
        });
    }

    public final void syncWearOsBugreport(@NotNull FragmentActivity context, @Nullable WearableDeviceModel deviceModel, @NotNull Function1<? super Integer, Unit> handler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(handler, "handler");
        handler.invoke2(1);
        WearOsExtKt.getInstance(WearOSUtil.INSTANCE).syncWearOSBugreport(handler);
    }
}
