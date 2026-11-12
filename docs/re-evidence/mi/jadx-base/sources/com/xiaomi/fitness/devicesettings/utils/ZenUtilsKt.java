package com.xiaomi.fitness.devicesettings.utils;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.notify.export.NotifyHelperExtKt;
import defpackage.av6;
import defpackage.wzi;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u001d\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\b\u001a\u0015\u0010\t\u001a\u00020\u00012\b\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"showNotificationPolicyAccessSettingRequestDialog", "", "Landroidx/fragment/app/Fragment;", "handleDeviceSettingDND", "did", "", "syncWithPhone", "", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "handleDeviceSetQuietMode", "isAllDayOn", "(Ljava/lang/Boolean;)V", "device-settings_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ZenUtilsKt {

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.utils.ZenUtilsKt$handleDeviceSettingDND$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.utils.ZenUtilsKt$handleDeviceSettingDND$1", f = "ZenUtils.kt", i = {}, l = {70, 73}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        final /* synthetic */ Boolean $syncWithPhone;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Boolean bool, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$syncWithPhone = bool;
            this.$did = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$syncWithPhone, this.$did, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ZenUtils zenUtils = ZenUtils.INSTANCE;
                if (!ZenUtils.isSupportZenMode$default(zenUtils, null, 1, null)) {
                    Logger.i(ZenUtils.sTag, "handleDeviceSettingDND isSupportZenMode false");
                    return Unit.INSTANCE;
                }
                if (!Intrinsics.areEqual(this.$syncWithPhone, Boxing.boxBoolean(true))) {
                    DeviceSettingsPreference.INSTANCE.isZenModeOpen(this.$did, false);
                } else if (NotifyHelperExtKt.getNotificationManagerExport().isNotificationPolicyAccessGranted()) {
                    DeviceSettingsPreference.INSTANCE.isZenModeOpen(this.$did, true);
                    this.label = 1;
                    if (zenUtils.postSyncZenMode(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    DeviceSettingsPreference.INSTANCE.isZenModeOpen(this.$did, false);
                    this.label = 2;
                    if (zenUtils.postDeviceNoPermission(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final void handleDeviceSetQuietMode(@Nullable Boolean bool) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected() || !DeviceSettingsPreference.INSTANCE.isZenModeOpen(wearableDeviceModel.getDid())) {
            Logger.i(ZenUtils.sTag, "null or not connected or close sync");
        } else if (NotifyHelperExtKt.getNotificationManagerExport().isNotificationPolicyAccessGranted()) {
            ZenUtils.INSTANCE.postSetZenMode(Intrinsics.areEqual(bool, Boolean.TRUE));
        }
    }

    public static final void handleDeviceSettingDND(@NotNull String did, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(did, "did");
        AnyExtKt.io$default(null, new AnonymousClass1(bool, did, null), 1, null);
    }

    public static final void showNotificationPolicyAccessSettingRequestDialog(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        new CommonDialog.c("gotoNotificationPolicyAccessSetting").setDialogTitle(wzi.Ma).setDialogDescription(wzi.La).setNegativeText(wzi.e).setPositiveText(wzi.Z1).setCanceledOnBackPressed(false).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.utils.ZenUtilsKt.showNotificationPolicyAccessSettingRequestDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } else {
                    if (which != -1) {
                        return;
                    }
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    NotifyHelperExtKt.getNotificationManagerExport().gotoNotificationPolicyAccessSetting();
                }
            }
        }).show(fragment.getChildFragmentManager(), "");
    }
}
