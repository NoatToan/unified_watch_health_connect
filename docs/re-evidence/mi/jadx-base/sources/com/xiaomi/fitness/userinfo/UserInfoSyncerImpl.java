package com.xiaomi.fitness.userinfo;

import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceSyncCallback;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.user.info.export.UserInfoSyncer;
import com.xiaomi.fitness.userinfo.utils.UserInfoConfigUtil;
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
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/userinfo/UserInfoSyncerImpl;", "Lcom/xiaomi/fitness/user/info/export/UserInfoSyncer;", "<init>", "()V", "syncData", "", "did", "", "callBack", "Lcom/xiaomi/fitness/device/contact/export/DeviceSyncCallback;", "Companion", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UserInfoSyncerImpl implements UserInfoSyncer {

    @NotNull
    public static final String TAG = "UserInfoSyncerImpl";

    /* JADX INFO: renamed from: com.xiaomi.fitness.userinfo.UserInfoSyncerImpl$syncData$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.userinfo.UserInfoSyncerImpl$syncData$2", f = "UserInfoSyncerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ DeviceSyncCallback $callBack;
        final /* synthetic */ WearableDeviceModel $device;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(WearableDeviceModel wearableDeviceModel, DeviceSyncCallback deviceSyncCallback, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$device = wearableDeviceModel;
            this.$callBack = deviceSyncCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$device, this.$callBack, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            UserInfoConfigUtil userInfoConfigUtil = UserInfoConfigUtil.INSTANCE;
            UserProfile userProfile = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserProfile(false);
            WearableDeviceModel wearableDeviceModel = this.$device;
            final DeviceSyncCallback deviceSyncCallback = this.$callBack;
            userInfoConfigUtil.syncUserInfoToSportDevice(userProfile, wearableDeviceModel, new OnSyncCallback() { // from class: com.xiaomi.fitness.userinfo.UserInfoSyncerImpl.syncData.2.1
                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did, int type, int code) {
                    DeviceSyncCallback deviceSyncCallback2;
                    Logger.e(UserInfoSyncerImpl.TAG, "UserInfoSyncerImpl ble syncData error:" + code);
                    if (did == null || (deviceSyncCallback2 = deviceSyncCallback) == null) {
                        return;
                    }
                    deviceSyncCallback2.onSyncError(did, 5, String.valueOf(code));
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did, int type, SyncResult result) {
                    if (did != null) {
                        Logger.e(UserInfoSyncerImpl.TAG, "UserInfoSyncerImpl ble syncData success");
                        DeviceSyncCallback deviceSyncCallback2 = deviceSyncCallback;
                        if (deviceSyncCallback2 != null) {
                            deviceSyncCallback2.onSyncSuccess(did, 5, null);
                        }
                    }
                }
            }, Boxing.boxBoolean(false));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // com.xiaomi.fitness.device.contact.export.DeviceSyncer
    public void syncData(@NotNull String did, @Nullable final DeviceSyncCallback callBack) {
        Intrinsics.checkNotNullParameter(did, "did");
        Logger.i(TAG, "UserInfoSyncerImpl: start sync");
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getDeviceModel(did);
        if (wearableDeviceModel == null) {
            Logger.i(TAG, "sync userinfo fail: device model is null");
            if ((wearableDeviceModel2 != null && DeviceModelExtKt.isLocalDevice(wearableDeviceModel2)) || (wearableDeviceModel2 != null && com.xiaomi.fitness.device.manager.export.DeviceModelExtKt.isEarPhone(wearableDeviceModel2))) {
                Logger.i(TAG, "sync userinfo nothing: device model is not support");
                return;
            } else {
                if (callBack != null) {
                    callBack.onSyncError(did, 5, null);
                    return;
                }
                return;
            }
        }
        if ((wearableDeviceModel2 != null && DeviceModelExtKt.isLocalDevice(wearableDeviceModel2)) || (wearableDeviceModel2 != null && com.xiaomi.fitness.device.manager.export.DeviceModelExtKt.isEarPhone(wearableDeviceModel2))) {
            Logger.i(TAG, "sync userinfo nothing: device model is not support");
            return;
        }
        if (DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            UserInfoConfigUtil.INSTANCE.syncHuamiUserInfoToSportDevice(UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null), wearableDeviceModel, new OnSyncCallback() { // from class: com.xiaomi.fitness.userinfo.UserInfoSyncerImpl.syncData.1
                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did2, int type, int code) {
                    DeviceSyncCallback deviceSyncCallback;
                    Logger.e(UserInfoSyncerImpl.TAG, "UserInfoSyncerImpl huami syncData error:" + code);
                    if (did2 == null || (deviceSyncCallback = callBack) == null) {
                        return;
                    }
                    deviceSyncCallback.onSyncError(did2, 5, null);
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did2, int type, SyncResult result) {
                    Logger.e(UserInfoSyncerImpl.TAG, "sync userinfo success");
                    if (did2 != null) {
                        Logger.i(UserInfoSyncerImpl.TAG, "sync userinfo success: isHuaMi");
                        DeviceSyncCallback deviceSyncCallback = callBack;
                        if (deviceSyncCallback != null) {
                            deviceSyncCallback.onSyncSuccess(did2, 5, null);
                        }
                    }
                }
            });
            return;
        }
        if (DeviceModelExtKt.isBluetooth(wearableDeviceModel) || DeviceModelExtKt.isWearOS(wearableDeviceModel)) {
            ScopeExtKt.scope(Dispatchers.getIO(), new AnonymousClass2(wearableDeviceModel, callBack, null));
        } else if (DeviceModelExtKt.isWearOS(wearableDeviceModel)) {
            Logger.i(TAG, "sync wear os");
        }
    }
}
