package com.xiaomi.fitness.notify;

import android.text.TextUtils;
import com.facebook.react.bridge.BaseJavaModule;
import com.google.gson.Gson;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.notify.BleNotifySettingImpl;
import com.xiaomi.fitness.notify.data.InstallApplicationInfo;
import com.xiaomi.fitness.notify.di.NotifyStartExtKt;
import com.xiaomi.fitness.notify.util.BlueToothSender;
import com.xiaomi.fitness.notify.util.NotifyPreference;
import com.xiaomi.fitness.settingitem.settingitem.InCall;
import defpackage.xpd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 92\u00020\u0001:\u00019B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0016J\u001e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010H\u0016J \u0010\u0011\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0016J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J&\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010H\u0016J\u0018\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\rH\u0016J\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\rH\u0016J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\rH\u0016J\u0010\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\rH\u0016J3\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072!\u0010 \u001a\u001d\u0012\u0013\u0012\u00110\"¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u00050!H\u0016J \u0010&\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\rH\u0016J\u0087\u0001\u0010)\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072u\u0010 \u001aq\u0012\u0013\u0012\u00110\r¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b('\u0012\u0013\u0012\u00110\r¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b((\u0012\u0013\u0012\u00110\"¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(+\u0012\u0013\u0012\u00110\"¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\"¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u00050*H\u0016J\u0018\u0010-\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\rH\u0016J\b\u0010/\u001a\u00020\u0005H\u0016J\b\u00100\u001a\u00020\u0005H\u0016J\b\u00101\u001a\u00020\u0005H\u0016J\b\u00102\u001a\u00020\rH\u0016J\u0010\u00103\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\rH\u0016J\b\u00104\u001a\u00020\u0005H\u0016J\b\u00105\u001a\u00020\u0005H\u0016J\b\u00106\u001a\u00020\u0005H\u0016J\u000e\u00107\u001a\b\u0012\u0004\u0012\u0002080\u0010H\u0016¨\u0006:"}, d2 = {"Lcom/xiaomi/fitness/notify/BleNotifySettingImpl;", "Lcom/xiaomi/fitness/notify/DeviceNotificationSettingManager;", "<init>", "()V", "removeAllConfig", "", "did", "", "getNotifyEnableList", "", "setNotifyEnable", "packageName", "enable", "", "setNotifyEnableList", "packageNameList", "", "isNotificationEnable", "notificationGroup", "enableList", "setNotifySwitchStatus", "status", "isNotifySwitchStatusEnable", "setSyncAllNotifySwitchStatusEnable", BaseJavaModule.METHOD_TYPE_SYNC, "isSyncAllNotifySwitchStatusEnable", "setNotifyStatusOnScreenLock", "onlyLockscreen", "isNotifyStatusOnScreenLockEnable", "isTelNotifyEnable", "setScreenOnByNewNotificationSwitch", "isScreenOnByNewNotificationSwitch", "callBack", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "result", "updateNotificationSettings", "notifyEnabled", "allEnable", "getNotificationSettings", "Lkotlin/Function5;", "screenOnNewNotification", "isOnlyWear", "updateOnlyWearEnable", "checked", "getAllAppMuteStates", "loadSilenceWhileUsingPhone", "deAttachNotify", "isCallSyncResult", "setWearOSSettingCallSync", "loadWearOSCallSync", "deAttachCallNotify", "initWearOsAllSync", "getInstallApplicationList", "Lcom/xiaomi/fitness/notify/data/InstallApplicationInfo;", "Companion", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BleNotifySettingImpl implements DeviceNotificationSettingManager {

    @NotNull
    private static final String TAG = "BleNotifySettingImpl";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final BleNotifySettingImpl instance = new BleNotifySettingImpl();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/notify/BleNotifySettingImpl$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fitness/notify/BleNotifySettingImpl;", "getInstance", "()Lcom/xiaomi/fitness/notify/BleNotifySettingImpl;", "TAG", "", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BleNotifySettingImpl getInstance() {
            return BleNotifySettingImpl.instance;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.notify.BleNotifySettingImpl$setNotifyStatusOnScreenLock$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.notify.BleNotifySettingImpl$setNotifyStatusOnScreenLock$1", f = "BleNotifySettingImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $onlyLockscreen;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$onlyLockscreen = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$onlyLockscreen, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BlueToothSender.setNotificationSetBySystemSetting$default(BlueToothSender.INSTANCE, null, Boxing.boxBoolean(this.$onlyLockscreen), null, 4, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.notify.BleNotifySettingImpl$setScreenOnByNewNotificationSwitch$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.notify.BleNotifySettingImpl$setScreenOnByNewNotificationSwitch$1", f = "BleNotifySettingImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C27171 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $sync;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27171(boolean z, Continuation<? super C27171> continuation) {
            super(2, continuation);
            this.$sync = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C27171(this.$sync, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BlueToothSender.setNotificationSetBySystemSetting$default(BlueToothSender.INSTANCE, Boxing.boxBoolean(this.$sync), null, null, 4, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C27171) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.notify.BleNotifySettingImpl$updateOnlyWearEnable$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.notify.BleNotifySettingImpl$updateOnlyWearEnable$1", f = "BleNotifySettingImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C27181 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $checked;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27181(boolean z, Continuation<? super C27181> continuation) {
            super(2, continuation);
            this.$checked = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C27181(this.$checked, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BlueToothSender.INSTANCE.setNotificationSetBySystemSetting(null, null, Boxing.boxBoolean(this.$checked));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C27181) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getNotificationSettings$lambda$2(final String did, final Function5 callBack, final boolean z, final boolean z2, BleNotifySettingImpl this$0, boolean z3, int i, int i2, final int i3) {
        Intrinsics.checkNotNullParameter(did, "$did");
        Intrinsics.checkNotNullParameter(callBack, "$callBack");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z3) {
            NotifyPreference.INSTANCE.setSyncNotificationOnlyScreenLock(did, i2 == 1);
            callBack.invoke(Boolean.valueOf(z), Boolean.valueOf(z2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        } else {
            this$0.isScreenOnByNewNotificationSwitch(did, new Function1() { // from class: ts2
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return BleNotifySettingImpl.getNotificationSettings$lambda$2$lambda$1(did, callBack, z, z2, i3, ((Integer) obj).intValue());
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getNotificationSettings$lambda$2$lambda$1(String did, Function5 callBack, boolean z, boolean z2, int i, int i2) {
        Intrinsics.checkNotNullParameter(did, "$did");
        Intrinsics.checkNotNullParameter(callBack, "$callBack");
        callBack.invoke(Boolean.valueOf(z), Boolean.valueOf(z2), Integer.valueOf(i2), Integer.valueOf(NotifyPreference.INSTANCE.isSyncNotificationOnlyScreenLock(did) ? 1 : 2), Integer.valueOf(i));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit isScreenOnByNewNotificationSwitch$lambda$0(Function1 callBack, int i) {
        Intrinsics.checkNotNullParameter(callBack, "$callBack");
        callBack.invoke2(Integer.valueOf(i));
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public void deAttachCallNotify() {
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public void deAttachNotify() {
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public void getAllAppMuteStates() {
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    @NotNull
    public List<InstallApplicationInfo> getInstallApplicationList() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public void getNotificationSettings(@NotNull final String did, @NotNull final Function5<? super Boolean, ? super Boolean, ? super Integer, ? super Integer, ? super Integer, Unit> callBack) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        NotifyPreference notifyPreference = NotifyPreference.INSTANCE;
        final boolean zIsNeedSyncNotification = notifyPreference.isNeedSyncNotification(did);
        final boolean zIsNeedSyncAllNotification = notifyPreference.isNeedSyncAllNotification(did);
        BlueToothSender.INSTANCE.getNotificationSetBySystemSetting(new Function4() { // from class: vs2
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return BleNotifySettingImpl.getNotificationSettings$lambda$2(did, callBack, zIsNeedSyncNotification, zIsNeedSyncAllNotification, this, ((Boolean) obj).booleanValue(), ((Integer) obj2).intValue(), ((Integer) obj3).intValue(), ((Integer) obj4).intValue());
            }
        });
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    @NotNull
    public List<String> getNotifyEnableList(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        if (isNotifySwitchStatusEnable(did)) {
            String notifyListString = NotifyPreference.INSTANCE.getNotifyListString(did);
            if (!TextUtils.isEmpty(notifyListString)) {
                List listG = xpd.g(notifyListString, String.class);
                Intrinsics.checkNotNull(listG, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.String>");
                return TypeIntrinsics.asMutableList(listG);
            }
        }
        return new ArrayList();
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public void initWearOsAllSync() {
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public boolean isCallSyncResult() {
        return false;
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public boolean isNotificationEnable(@NotNull String did, @NotNull String packageName, @NotNull String notificationGroup) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(notificationGroup, "notificationGroup");
        List<String> notifyEnableList = getNotifyEnableList(did);
        if (isNotificationEnable(did, packageName, notifyEnableList)) {
            return true;
        }
        if (!Intrinsics.areEqual("com.xiaomi.xmsf", packageName) || TextUtils.isEmpty(notificationGroup)) {
            return false;
        }
        return isNotificationEnable(did, notificationGroup, notifyEnableList);
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public boolean isNotifyStatusOnScreenLockEnable(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return NotifyPreference.INSTANCE.isSyncNotificationOnlyScreenLock(did);
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public boolean isNotifySwitchStatusEnable(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return NotifyPreference.INSTANCE.isNeedSyncNotification(did);
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public void isScreenOnByNewNotificationSwitch(@NotNull String did, @NotNull final Function1<? super Integer, Unit> callBack) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        BlueToothSender.INSTANCE.getEnableAutoScreen(new Function1() { // from class: us2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BleNotifySettingImpl.isScreenOnByNewNotificationSwitch$lambda$0(callBack, ((Integer) obj).intValue());
            }
        });
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public boolean isSyncAllNotifySwitchStatusEnable(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return NotifyPreference.INSTANCE.isNeedSyncAllNotification(did);
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public boolean isTelNotifyEnable(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        InCall inCallResult = BleNotifyModel.INSTANCE.getInCallResult(did);
        if (inCallResult != null) {
            return inCallResult.isIncallNotifyEnabled();
        }
        return false;
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public void loadSilenceWhileUsingPhone() {
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public void loadWearOSCallSync() {
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public void removeAllConfig(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public void setNotifyEnable(@NotNull String did, @NotNull String packageName, boolean enable) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        List<String> notifyEnableList = getNotifyEnableList(did);
        if (!enable) {
            notifyEnableList.remove(packageName);
        } else if (!notifyEnableList.contains(packageName)) {
            notifyEnableList.add(packageName);
        }
        String strA = xpd.a(notifyEnableList);
        Logger.d(TAG, "setNotifyEnable enable list = " + strA);
        NotifyPreference.INSTANCE.setNotifyListString(did, strA);
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public void setNotifyEnableList(@NotNull String did, @NotNull List<String> packageNameList) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(packageNameList, "packageNameList");
        List<String> notifyEnableList = getNotifyEnableList(did);
        for (String str : packageNameList) {
            if (!notifyEnableList.contains(str)) {
                notifyEnableList.add(str);
            }
        }
        String json = new Gson().toJson(notifyEnableList);
        Logger.d(TAG, "setNotifyEnableList enable list = " + json);
        NotifyPreference.INSTANCE.setNotifyListString(did, json);
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public void setNotifyStatusOnScreenLock(@NotNull String did, boolean onlyLockscreen) {
        Intrinsics.checkNotNullParameter(did, "did");
        ScopeExtKt.scopeNet(Dispatchers.getIO(), new AnonymousClass1(onlyLockscreen, null));
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public void setNotifySwitchStatus(@NotNull String did, boolean status) {
        Intrinsics.checkNotNullParameter(did, "did");
        NotifyPreference.INSTANCE.setNeedSyncNotification(did, status);
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public void setScreenOnByNewNotificationSwitch(@NotNull String did, boolean sync) {
        Intrinsics.checkNotNullParameter(did, "did");
        ScopeExtKt.scopeNet(Dispatchers.getIO(), new C27171(sync, null));
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public void setSyncAllNotifySwitchStatusEnable(@NotNull String did, boolean sync) {
        Intrinsics.checkNotNullParameter(did, "did");
        NotifyPreference.INSTANCE.setNeedSyncAllNotification(did, sync);
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public void setWearOSSettingCallSync(boolean sync) {
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public void updateNotificationSettings(@NotNull String did, boolean notifyEnabled, boolean allEnable) {
        Intrinsics.checkNotNullParameter(did, "did");
        NotifyPreference notifyPreference = NotifyPreference.INSTANCE;
        notifyPreference.setNeedSyncNotification(did, notifyEnabled);
        notifyPreference.setNeedSyncAllNotification(did, allEnable);
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public void updateOnlyWearEnable(@NotNull String did, boolean checked) {
        Intrinsics.checkNotNullParameter(did, "did");
        ScopeExtKt.scopeNet(Dispatchers.getIO(), new C27181(checked, null));
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public boolean isNotificationEnable(@NotNull String did, @NotNull String packageName) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return isNotificationEnable(did, packageName, getNotifyEnableList(did));
    }

    @Override // com.xiaomi.fitness.notify.DeviceNotificationSettingManager
    public boolean isNotificationEnable(@NotNull String did, @NotNull String packageName, @NotNull List<String> enableList) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(enableList, "enableList");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if ((wearableDeviceModel != null && !DeviceModelExtKt.isSupportFeature(wearableDeviceModel, "notification")) || enableList.isEmpty()) {
            return false;
        }
        if (NotifyStartExtKt.getNotificationManagerImpl().isTelApp(packageName)) {
            packageName = "telephony_app";
        }
        Iterator<String> it = enableList.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(packageName, it.next())) {
                return true;
            }
        }
        return false;
    }
}
