package com.xiaomi.fitness.device.manager;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.IBinder;
import android.os.RemoteException;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.fitness.banner.export.compare.ABTestResponseResult;
import com.fitness.banner.export.compare.ICompare;
import com.fitness.banner.export.compare.ICompareKt;
import com.mi.fitness.capability.export.CapabilityManager;
import com.mi.fitness.capability.export.CapabilityManagerExtKt;
import com.mi.health.uri_parser.links.HttpLinkManager;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.cache.sp.SpExtKt;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.NetworkExtKt;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.manager.DeviceManagerComponent;
import com.xiaomi.fitness.device.manager.export.DeviceTabManager;
import com.xiaomi.fitness.device.manager.export.DeviceTabManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.extensions.InstanceExtKt;
import com.xiaomi.fitness.device.manager.passtoken.PassTokenDataHandler;
import com.xiaomi.fitness.device.manager.remote.DeviceInfoUpdater;
import com.xiaomi.fitness.device.manager.remote.DeviceManagerRemoteImpl;
import com.xiaomi.fitness.device.manager.remote.DeviceModelRemote;
import com.xiaomi.fitness.device.manager.report.DeviceActiveTracker;
import com.xiaomi.fitness.device.manager.scheme.DeviceManagerPageScheme;
import com.xiaomi.fitness.device.manager.ui.bind.BindDeviceLinkHandler;
import com.xiaomi.fitness.device.manager.ui.bind.LocalBindLinkHandler;
import com.xiaomi.fitness.device.manager.ui.bind.MiHomeBindLinkHandler;
import com.xiaomi.fitness.device.model.api.ProductManagerRemoteInternal;
import com.xiaomi.fitness.devicesettings.export.DeviceSettingExtKt;
import com.xiaomi.fitness.devicesettings.export.DeviceSettingHelper;
import com.xiaomi.fitness.keep_alive.KeepAliveConfig;
import com.xiaomi.fitness.keep_alive.KeepAliveHelper;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.net.scope.AndroidScope;
import com.xiaomi.fitness.service.ServiceConnector;
import com.xiaomi.wearable.core.CoreExtKt;
import com.xiaomi.wearable.core.IReporter;
import com.xiaomi.wearable.core.client.IMiWearCoreClient;
import com.xiaomi.wearable.core.client.Logger;
import com.xiaomi.wearable.core.client.ServiceStateListener;
import defpackage.puc;
import defpackage.s33;
import defpackage.xfl;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u0000 62\u00020\u0001:\u00016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\b\u0010\u0019\u001a\u00020\u0016H\u0007J\b\u0010\u001a\u001a\u00020\u0016H\u0002J\b\u0010\u001b\u001a\u00020\u0016H\u0002J\b\u0010\u001c\u001a\u00020\u0016H\u0007J\b\u0010\u001d\u001a\u00020\u0016H\u0007J\u0010\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u0018H\u0007J\u0010\u0010 \u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020\u0016H\u0007J\b\u0010#\u001a\u00020\u0016H\u0002J\b\u0010$\u001a\u00020\u0016H\u0002J\b\u0010%\u001a\u00020\u0016H\u0007J\b\u0010&\u001a\u00020\u0016H\u0007J\b\u0010'\u001a\u00020\u0016H\u0007J\u001c\u0010(\u001a\u00020\u00162\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00160*H\u0002J\b\u0010,\u001a\u00020\u0016H\u0002J\b\u0010-\u001a\u00020\u0016H\u0002J\b\u0010.\u001a\u00020\u0016H\u0002J\b\u0010/\u001a\u00020\u0016H\u0002J\b\u00100\u001a\u00020\u0016H\u0002J\u0010\u00101\u001a\u00020\u00162\u0006\u00102\u001a\u00020\u0018H\u0007J\b\u00103\u001a\u00020\u0016H\u0007J\b\u00104\u001a\u00020\u0016H\u0007J\b\u00105\u001a\u00020\u0016H\u0007R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u00067"}, d2 = {"Lcom/xiaomi/fitness/device/manager/DeviceManagerComponent;", "", "<init>", "()V", "mProductManager", "Lcom/xiaomi/fitness/device/model/api/ProductManagerRemoteInternal;", "getMProductManager", "()Lcom/xiaomi/fitness/device/model/api/ProductManagerRemoteInternal;", "mProductManager$delegate", "Lkotlin/Lazy;", "mDeviceManager", "Lcom/xiaomi/fitness/device/manager/remote/DeviceManagerRemoteImpl;", "getMDeviceManager", "()Lcom/xiaomi/fitness/device/manager/remote/DeviceManagerRemoteImpl;", "mDeviceManager$delegate", "mRequestLastTime", "", "logger", "Lcom/xiaomi/wearable/core/client/Logger;", "getLogger", "()Lcom/xiaomi/wearable/core/client/Logger;", "startConnectProcess", "", "application", "Landroid/app/Application;", "startForegroundService", "onMainActivityResume", "connectDeviceIfNeed", "addHttpLinkHandler", "initOnAttach", "initConnect", "context", "registerLogoutReceiver", "Landroid/content/Context;", "updateDevices", "updateUserInfo", "tryToRequestDevice", "loadDeviceCache", "requestDeviceWhenMainResume", "registerPrivacyListener", "updateDevicesIfLogin", "loginListener", "Lkotlin/Function1;", "", "requestDevicesNoLogin", "requestDevices", "clearAll", "clearProducts", "updateDeviceIfHaveRegion", "initUnlockServiceVersion", "app", "registerDeviceListener", "addCheckMyDeviceShortcut", "getFaceEntranceTest", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = "DeviceManager")
@SourceDebugExtension({"SMAP\nDeviceManagerComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceManagerComponent.kt\ncom/xiaomi/fitness/device/manager/DeviceManagerComponent\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,543:1\n1863#2,2:544\n*S KotlinDebug\n*F\n+ 1 DeviceManagerComponent.kt\ncom/xiaomi/fitness/device/manager/DeviceManagerComponent\n*L\n495#1:544,2\n*E\n"})
public final class DeviceManagerComponent {

    @NotNull
    public static final String SERVER_ACTION = "miui.bluetooth.mible.BluetoothUnlockService";

    @NotNull
    public static final String SERVER_CLASSNAME = "com.android.bluetooth.ble.BluetoothUnlockService";

    @NotNull
    public static final String SERVER_PACKAGE = "com.xiaomi.bluetooth";

    @NotNull
    public static final String TAG = "DeviceManagerComponent";

    @NotNull
    public static final String fileName = "Transfer";
    private long mRequestLastTime;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static int unlockVersion = -1;

    /* JADX INFO: renamed from: mProductManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mProductManager = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: m96
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DeviceManagerComponent.mProductManager_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: mDeviceManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDeviceManager = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: n96
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DeviceManagerComponent.mDeviceManager_delegate$lambda$1();
        }
    });

    @NotNull
    private final Logger logger = new Logger() { // from class: com.xiaomi.fitness.device.manager.DeviceManagerComponent$logger$1
        @Override // com.xiaomi.wearable.core.client.Logger
        public void d(String tag, String msg) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(msg, "msg");
            com.xiaomi.fitness.common.log.Logger.d(tag, msg, "Transfer", new Object[0]);
        }

        @Override // com.xiaomi.wearable.core.client.Logger
        public void e(String tag, String msg) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(msg, "msg");
            com.xiaomi.fitness.common.log.Logger.e(tag, msg, "Transfer", new Object[0]);
        }

        @Override // com.xiaomi.wearable.core.client.Logger
        public void i(String tag, String msg) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(msg, "msg");
            com.xiaomi.fitness.common.log.Logger.i(tag, msg, "Transfer", new Object[0]);
        }

        @Override // com.xiaomi.wearable.core.client.Logger
        public void w(String tag, String msg) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(msg, "msg");
            com.xiaomi.fitness.common.log.Logger.i(tag, msg, "Transfer", new Object[0]);
        }

        @Override // com.xiaomi.wearable.core.client.Logger
        public void e(String tag, String msg, Throwable exception) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(msg, "msg");
            Intrinsics.checkNotNullParameter(exception, "exception");
            com.xiaomi.fitness.common.log.Logger.e(tag, msg, exception, "Transfer");
        }
    };

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/device/manager/DeviceManagerComponent$Companion;", "", "<init>", "()V", "TAG", "", "SERVER_ACTION", "SERVER_PACKAGE", "SERVER_CLASSNAME", "unlockVersion", "", "fileName", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.DeviceManagerComponent$getFaceEntranceTest$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.DeviceManagerComponent$getFaceEntranceTest$1", f = "DeviceManagerComponent.kt", i = {}, l = {532}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ICompare instance = ICompareKt.getINSTANCE(ICompare.INSTANCE);
                this.label = 1;
                obj = ICompare.DefaultImpls.getTestResult$default(instance, 5, null, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ABTestResponseResult aBTestResponseResult = (ABTestResponseResult) obj;
            int status = aBTestResponseResult.getStatus();
            int groupType = aBTestResponseResult.getGroupType();
            String layerName = aBTestResponseResult.getLayerName();
            if (layerName == null) {
                layerName = "";
            }
            long groupId = aBTestResponseResult.getGroupId();
            ICompare.Companion companion = ICompare.INSTANCE;
            ICompareKt.getINSTANCE(companion).setLayerName(layerName);
            if (status != 3) {
                ICompareKt.getINSTANCE(companion).setGroupId(CollectionsKt__CollectionsJVMKt.listOf(String.valueOf(groupId)));
            }
            com.xiaomi.fitness.common.log.Logger.i(DeviceManagerComponent.TAG, "getTestType status: " + status + " groupType: " + groupType);
            DevicePreference.INSTANCE.setFACE_ENTRANCE_TITLE(status == 1);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.DeviceManagerComponent$loadDeviceCache$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.DeviceManagerComponent$loadDeviceCache$1", f = "DeviceManagerComponent.kt", i = {}, l = {313}, m = "invokeSuspend", n = {}, s = {})
    public static final class C18961 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C18961(Continuation<? super C18961> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeviceManagerComponent.this.new C18961(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DeviceManagerRemoteImpl mDeviceManager = DeviceManagerComponent.this.getMDeviceManager();
                this.label = 1;
                if (mDeviceManager.initDeviceModelsByCache(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C18961) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.DeviceManagerComponent$requestDevicesNoLogin$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.DeviceManagerComponent$requestDevicesNoLogin$1", f = "DeviceManagerComponent.kt", i = {}, l = {381, 382}, m = "invokeSuspend", n = {}, s = {})
    public static final class C18981 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C18981(Continuation<? super C18981> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeviceManagerComponent.this.new C18981(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                DeviceManagerComponent.this.mRequestLastTime = System.currentTimeMillis();
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            ProductManagerRemoteInternal mProductManager = DeviceManagerComponent.this.getMProductManager();
            this.label = 1;
            if (mProductManager.update(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            DeviceManagerRemoteImpl mDeviceManager = DeviceManagerComponent.this.getMDeviceManager();
            this.label = 2;
            if (mDeviceManager.initDeviceModelsByCache(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            DeviceManagerComponent.this.mRequestLastTime = System.currentTimeMillis();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C18981) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearAll() throws RemoteException {
        getMProductManager().clear();
        getMDeviceManager().clear();
    }

    private final void clearProducts() throws RemoteException {
        com.xiaomi.fitness.common.log.Logger.i(TAG, "clearProducts() called");
        getMProductManager().clear();
    }

    private final void connectDeviceIfNeed() {
        ServiceConnector.INSTANCE.getBinder(5, new Function1() { // from class: p96
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceManagerComponent.connectDeviceIfNeed$lambda$3((IBinder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit connectDeviceIfNeed$lambda$3(IBinder iBinder) {
        try {
            c cVarAsInterface = c.a.asInterface(iBinder);
            com.xiaomi.fitness.common.log.Logger.i(TAG, "startConnectProcess: device manager binder prepared");
            if (iBinder == null) {
                com.xiaomi.fitness.common.log.Logger.i(TAG, "startConnectProcess: binder is null");
                return Unit.INSTANCE;
            }
            DeviceModelRemote currentDeviceModel = cVarAsInterface != null ? cVarAsInterface.getCurrentDeviceModel() : null;
            if (currentDeviceModel == null) {
                com.xiaomi.fitness.common.log.Logger.i(TAG, "startConnectProcess: device model is null");
                return Unit.INSTANCE;
            }
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(currentDeviceModel.getDid());
            if (wearableDeviceModel == null) {
                return Unit.INSTANCE;
            }
            if (wearableDeviceModel.getIsDeviceConnected()) {
                KeepAliveHelper.INSTANCE.getInstance().startService();
            } else if (!s33.e()) {
                com.xiaomi.fitness.common.log.Logger.i(TAG, "startConnectProcess: connectable bluetooth close");
            } else if (com.xiaomi.fitness.device.manager.export.DeviceModelExtKt.needBackgroundConnect(wearableDeviceModel)) {
                com.xiaomi.fitness.common.log.Logger.i(TAG, "startConnectProcess: connect device");
                cVarAsInterface.connectDevice(true, true);
            } else {
                com.xiaomi.fitness.common.log.Logger.i(TAG, "startConnectProcess: connectable false");
            }
            return Unit.INSTANCE;
        } catch (Exception e) {
            com.xiaomi.fitness.common.log.Logger.e(TAG, "startConnectProcess: main resume exception", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceManagerRemoteImpl getMDeviceManager() {
        return (DeviceManagerRemoteImpl) this.mDeviceManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProductManagerRemoteInternal getMProductManager() {
        return (ProductManagerRemoteInternal) this.mProductManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceManagerRemoteImpl mDeviceManager_delegate$lambda$1() {
        return InstanceExtKt.getInstance(DeviceManagerRemoteImpl.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProductManagerRemoteInternal mProductManager_delegate$lambda$0() {
        return InstanceExtKt.getInstance(ProductManagerRemoteInternal.INSTANCE);
    }

    private final void onMainActivityResume() {
        ServiceConnector.Companion companion = ServiceConnector.INSTANCE;
        boolean zIsConnected$default = ServiceConnector.isConnected$default(companion.getInstance(), 0, 1, null);
        com.xiaomi.fitness.common.log.Logger.i(TAG, "onMainActivityResume() service connected " + zIsConnected$default);
        if (zIsConnected$default) {
            connectDeviceIfNeed();
        } else {
            ServiceConnector.bindPoolService$default(companion.getInstance(), ApplicationExtKt.getApplication(), "fitness.intent.action.DEVICE", null, 0, 12, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerDeviceListener$lambda$12(WearableDeviceModel wearableDeviceModel) {
        com.xiaomi.fitness.common.log.Logger.i(TAG, "registerDeviceListener: onDeviceChange " + wearableDeviceModel);
        if (Build.VERSION.SDK_INT < 31 || PermissionExtKt.isPermissionGranted(AppUtil.getApp(), "android.permission.BLUETOOTH_CONNECT")) {
            for (WearableDeviceModel wearableDeviceModel2 : com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getNeedKeepAliveDeviceModel()) {
                boolean zNeedBackgroundConnect = com.xiaomi.fitness.device.manager.export.DeviceModelExtKt.needBackgroundConnect(wearableDeviceModel2);
                com.xiaomi.fitness.common.log.Logger.i(TAG, "needBackgroundConnect() called with: " + zNeedBackgroundConnect);
                if (zNeedBackgroundConnect) {
                    com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).connectDevice(wearableDeviceModel2.getDid());
                }
            }
        } else {
            com.xiaomi.fitness.common.log.Logger.i(TAG, "registerDeviceListener:  no permission no connect");
        }
        return Unit.INSTANCE;
    }

    private final void registerLogoutReceiver(Context context) {
        com.xiaomi.fitness.common.log.Logger.i(TAG, "registerLogoutReceiver: ");
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.xiaomi.fitness.device.manager.DeviceManagerComponent$registerLogoutReceiver$receiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) throws RemoteException {
                com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi("logout receiver " + (intent != null ? intent.getAction() : null));
                this.this$0.clearAll();
            }
        };
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(broadcastReceiver, new IntentFilter("com.xiaomi.wearable.device.logout"), 2);
        } else {
            context.registerReceiver(broadcastReceiver, new IntentFilter("com.xiaomi.wearable.device.logout"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerPrivacyListener$lambda$5(DeviceManagerComponent this$0) throws RemoteException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!RegionPreference.INSTANCE.getPRIVACY_AGREE()) {
            this$0.clearAll();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerPrivacyListener$lambda$6(Function0 privacyAgreeCheck, SharedPreferences sharedPreferences, String str) {
        Intrinsics.checkNotNullParameter(privacyAgreeCheck, "$privacyAgreeCheck");
        final RegionPreference regionPreference = RegionPreference.INSTANCE;
        if (Intrinsics.areEqual(str, SpExtKt.getKey(new MutablePropertyReference0Impl(regionPreference) { // from class: com.xiaomi.fitness.device.manager.DeviceManagerComponent$registerPrivacyListener$1$1
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return Boolean.valueOf(((RegionPreference) this.receiver).getPRIVACY_AGREE());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((RegionPreference) this.receiver).setPRIVACY_AGREE(((Boolean) obj).booleanValue());
            }
        }))) {
            com.xiaomi.fitness.common.log.Logger.i(TAG, "onPrivacyChange called with: " + regionPreference.getPRIVACY_AGREE());
            privacyAgreeCheck.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestDeviceWhenMainResume$lambda$4(DeviceManagerComponent this$0, String activity, String lifecycle) throws RemoteException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        com.xiaomi.fitness.common.log.Logger.i(TAG, "requestDeviceWhenMainResume() called with: activity = " + activity + ", lifecycle = " + lifecycle);
        if (StringsKt__StringsJVMKt.startsWith$default(activity, AppManager.INSTANCE.getInstance().getMainActivity(), false, 2, null)) {
            com.xiaomi.fitness.common.log.Logger.i(TAG, "requestDeviceWhenMainResume() called with: activity = " + activity + ", ON_RESUME");
            if (Intrinsics.areEqual(lifecycle, LifecycleConstantKt.ON_RESUME)) {
                long jCurrentTimeMillis = System.currentTimeMillis() - this$0.mRequestLastTime;
                com.xiaomi.fitness.common.log.Logger.i(TAG, "request device when main resume, diffTime=" + jCurrentTimeMillis);
                if (jCurrentTimeMillis >= Constants.TIME_OFFSET) {
                    this$0.tryToRequestDevice();
                }
                DeviceSettingExtKt.getInstance(DeviceSettingHelper.INSTANCE).updateCapabilities();
            }
        }
        return Unit.INSTANCE;
    }

    private final void requestDevices() {
        getMDeviceManager().requestDeviceList(new b.a() { // from class: com.xiaomi.fitness.device.manager.DeviceManagerComponent.requestDevices.1
            @Override // com.xiaomi.fitness.device.manager.b
            public void onFail(String cause, int code) {
                DeviceManagerComponent.this.mRequestLastTime = 0L;
            }

            @Override // com.xiaomi.fitness.device.manager.b
            public void onSuccess() {
                DeviceManagerComponent.this.mRequestLastTime = System.currentTimeMillis();
            }
        });
    }

    private final void requestDevicesNoLogin() {
        ScopeExtKt.scopeNet$default(null, new C18981(null), 1, null).m503catch(new Function2() { // from class: o96
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DeviceManagerComponent.requestDevicesNoLogin$lambda$7(this.f28885a, (AndroidScope) obj, (Throwable) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestDevicesNoLogin$lambda$7(DeviceManagerComponent this$0, AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        com.xiaomi.fit.device.extensions.DeviceModelExtKt.loge("request product fail " + it);
        this$0.mRequestLastTime = 0L;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startForegroundService$lambda$2(DeviceManagerComponent this$0, String activity, String lifecycle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (StringsKt__StringsKt.contains$default((CharSequence) activity, (CharSequence) AppManager.INSTANCE.getInstance().getMainActivity(), false, 2, (Object) null) && AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin() && Intrinsics.areEqual(lifecycle, LifecycleConstantKt.ON_RESUME)) {
            this$0.onMainActivityResume();
        }
        return Unit.INSTANCE;
    }

    private final void tryToRequestDevice() throws RemoteException {
        if (NetworkExtKt.isNetworkAvailable()) {
            updateDeviceIfHaveRegion();
        } else {
            NetworkExtKt.registerConnectChangeListener(new Function1<Boolean, Unit>() { // from class: com.xiaomi.fitness.device.manager.DeviceManagerComponent$tryToRequestDevice$networkListener$1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Unit invoke2(Boolean bool) throws RemoteException {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public void invoke(boolean isConnect) throws RemoteException {
                    if (isConnect) {
                        this.this$0.updateDeviceIfHaveRegion();
                        NetworkExtKt.unregisterConnectChangeListener(this);
                    }
                }
            });
        }
        InstanceExtKt.getInstance(DeviceManagerRemoteImpl.INSTANCE).addDeviceStatusListener(DeviceActiveTracker.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateDeviceIfHaveRegion() throws RemoteException {
        final Function1<? super Boolean, Unit> function1 = new Function1() { // from class: j96
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceManagerComponent.updateDeviceIfHaveRegion$lambda$8(this.f22553a, ((Boolean) obj).booleanValue());
            }
        };
        RegionManager.Companion companion = RegionManager.INSTANCE;
        String currentRegion = RegionExtKt.getInstance(companion).getCurrentRegion();
        com.xiaomi.fit.device.extensions.DeviceModelExtKt.loge("current region is " + currentRegion);
        if (currentRegion.length() > 0) {
            updateDevicesIfLogin(function1);
        }
        RegionExtKt.getInstance(companion).addRegionChangeListener(new Function2() { // from class: k96
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DeviceManagerComponent.updateDeviceIfHaveRegion$lambda$9(this.f23622a, function1, (String) obj, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateDeviceIfHaveRegion$lambda$8(DeviceManagerComponent this$0, boolean z) throws RemoteException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi("login success, and requestDeviceList");
            DevicePreference devicePreference = DevicePreference.INSTANCE;
            if (devicePreference.getSOURCE_PRODUCT_NO_LOGIN()) {
                this$0.clearProducts();
                devicePreference.setSOURCE_PRODUCT_NO_LOGIN(false);
            }
            this$0.requestDevices();
        } else {
            com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi("logout success, and clear device");
            this$0.clearAll();
        }
        this$0.updateUserInfo();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateDeviceIfHaveRegion$lambda$9(DeviceManagerComponent this$0, Function1 loginListener, String old, String str) throws RemoteException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(loginListener, "$loginListener");
        Intrinsics.checkNotNullParameter(old, "old");
        Intrinsics.checkNotNullParameter(str, "new");
        com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi("The region has changed from " + old + " to " + str + ", and reset device list");
        this$0.clearAll();
        this$0.updateDevicesIfLogin(loginListener);
        return Unit.INSTANCE;
    }

    private final void updateDevicesIfLogin(Function1<? super Boolean, Unit> loginListener) throws RemoteException {
        AccountManager accountManagerExtKt = AccountManagerExtKt.getInstance(AccountManager.INSTANCE);
        boolean zIsLogin = accountManagerExtKt.isLogin();
        DevicePreference devicePreference = DevicePreference.INSTANCE;
        com.xiaomi.fitness.common.log.Logger.i(TAG, "updateDevicesIfLogin() called with: login " + zIsLogin + ", source_product " + devicePreference.getSOURCE_PRODUCT_NO_LOGIN());
        if (accountManagerExtKt.isLogin()) {
            if (devicePreference.getSOURCE_PRODUCT_NO_LOGIN()) {
                clearProducts();
                devicePreference.setSOURCE_PRODUCT_NO_LOGIN(false);
            }
            requestDevices();
        } else {
            requestDevicesNoLogin();
            devicePreference.setSOURCE_PRODUCT_NO_LOGIN(true);
        }
        accountManagerExtKt.addAccountListener(loginListener);
    }

    private final void updateUserInfo() {
    }

    @ComponentTask(notLaterThan = 4, onMainThread = false)
    public final void addCheckMyDeviceShortcut() {
        DeviceTabManagerExtKt.getInstance(DeviceTabManager.INSTANCE).addMyDeviceShortcut();
    }

    @ComponentTask(name = "HttpLinkHandler", notLaterThan = 3, onMainThread = true)
    public final void addHttpLinkHandler() {
        xfl.a().d(new BindDeviceSchemaHandler());
        HttpLinkManager.Companion companion = HttpLinkManager.INSTANCE;
        companion.getInstance().addLinkHandler(new LocalBindLinkHandler());
        companion.getInstance().addLinkHandler(new BindDeviceLinkHandler());
        companion.getInstance().addLinkHandler(new MiHomeBindLinkHandler());
        ConnectAssist.INSTANCE.register();
    }

    @ComponentTask(notLaterThan = 9, onMainThread = true)
    public final void getFaceEntranceTest() {
        ScopeExtKt.scopeNet(Dispatchers.getIO(), new AnonymousClass1(null));
    }

    @NotNull
    public final Logger getLogger() {
        return this.logger;
    }

    @ComponentTask(notLaterThan = 2, processName = ":device")
    public final void initConnect(@NotNull Application context) {
        Intrinsics.checkNotNullParameter(context, "context");
        IMiWearCoreClient.INSTANCE.getInstance().init(context, this.logger, new IReporter() { // from class: com.xiaomi.fitness.device.manager.DeviceManagerComponent.initConnect.1
            @Override // com.xiaomi.wearable.core.IReporter
            public void report(String eventName, Map<String, ? extends Object> params) {
                Intrinsics.checkNotNullParameter(eventName, "eventName");
                Intrinsics.checkNotNullParameter(params, "params");
                com.xiaomi.fitness.common.log.Logger.i(DeviceManagerComponent.TAG, "report() called with: eventName = " + eventName + ", params = " + params);
                OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(eventName, params);
            }
        }, new ServiceStateListener() { // from class: com.xiaomi.fitness.device.manager.DeviceManagerComponent.initConnect.2
            @Override // com.xiaomi.wearable.core.client.ServiceStateListener
            public void onCoreServiceState(int state) {
                com.xiaomi.fitness.common.log.Logger.i(DeviceManagerComponent.TAG, "onCoreServiceState() called with: state = " + state);
                if (state == 1) {
                    IMiWearCoreClient.Companion companion = IMiWearCoreClient.INSTANCE;
                    companion.getInstance().setChannel(ApplicationExtKt.getApplication().getPackageName());
                    companion.getInstance().setAppCapabilities(CapabilityManagerExtKt.getInstance(CapabilityManager.INSTANCE).getCapabilitiesInt());
                    KeepAliveConfig.INSTANCE.keepAliveEnable();
                    DevicePreference.INSTANCE.setLYRA_ENABLED(CoreExtKt.getLyraConnection());
                }
            }
        });
        DeviceContact.Companion companion = DeviceContact.INSTANCE;
        DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(companion);
        DeviceDataHandler deviceDataHandler = DeviceDataHandler.INSTANCE;
        deviceSyncExtKt.addDataHandler(2, deviceDataHandler);
        DeviceSyncExtKt.getInstance(companion).addDataHandler(1, PassTokenDataHandler.INSTANCE);
        DeviceSyncExtKt.getInstance(companion).addDataHandler(2, DeviceBasicStatusDataHandler.INSTANCE);
        DeviceSyncExtKt.getInstance(companion).addDataHandler(22, deviceDataHandler);
        registerLogoutReceiver(context);
    }

    @ComponentTask(notEarlierThan = 1, notLaterThan = 1, processName = ":device")
    public final void initOnAttach() {
        ServiceConnector.INSTANCE.setServer(true);
    }

    @ComponentTask(notEarlierThan = 8, onMainThread = false)
    public final void initUnlockServiceVersion(@NotNull final Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        boolean z = false;
        if (RomUtils.isXiaomi()) {
            Intent intent = new Intent("miui.bluetooth.mible.BluetoothUnlockService");
            intent.setComponent(new ComponentName("com.xiaomi.bluetooth", "com.android.bluetooth.ble.BluetoothUnlockService"));
            if (app.getPackageManager().resolveService(intent, 0) != null) {
                z = true;
            }
        }
        com.xiaomi.fitness.common.log.Logger.d(TAG, "initUnlockServiceVersion support:" + z);
        if (z) {
            Intent intent2 = new Intent("miui.bluetooth.mible.BluetoothUnlockService");
            intent2.setComponent(new ComponentName("com.xiaomi.bluetooth", "com.android.bluetooth.ble.BluetoothUnlockService"));
            app.bindService(intent2, new ServiceConnection() { // from class: com.xiaomi.fitness.device.manager.DeviceManagerComponent.initUnlockServiceVersion.1
                @Override // android.content.ServiceConnection
                public void onServiceConnected(ComponentName name, IBinder service) {
                    puc pucVarS2 = puc.a.s2(service);
                    if (pucVarS2 != null) {
                        try {
                            Companion companion = DeviceManagerComponent.INSTANCE;
                            DeviceManagerComponent.unlockVersion = pucVarS2.getVersion();
                            com.xiaomi.fitness.common.log.Logger.d(DeviceManagerComponent.TAG, "initUnlockServiceVersion version:" + DeviceManagerComponent.unlockVersion);
                        } catch (RemoteException e) {
                            e.printStackTrace();
                        }
                    }
                    app.unbindService(this);
                }

                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(ComponentName name) {
                }
            }, 1);
        }
    }

    @ComponentTask(notLaterThan = 4, processName = ":device")
    public final void loadDeviceCache() {
        AnyExtKt.io$default(null, new C18961(null), 1, null);
    }

    @ComponentTask(name = "connect_device", notEarlierThan = 2, notLaterThan = 2, onMainThread = true, processName = ":device")
    public final void registerDeviceListener() {
        com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceChangeListener(new Function1() { // from class: l96
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceManagerComponent.registerDeviceListener$lambda$12((WearableDeviceModel) obj);
            }
        });
    }

    @ComponentTask(notLaterThan = 3, processName = ":device")
    public final void registerPrivacyListener() {
        RegionPreference regionPreference = RegionPreference.INSTANCE;
        com.xiaomi.fitness.common.log.Logger.i(TAG, "registerPrivacyListener() called " + regionPreference.getPRIVACY_AGREE());
        final Function0 function0 = new Function0() { // from class: f96
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceManagerComponent.registerPrivacyListener$lambda$5(this.f17545a);
            }
        };
        function0.invoke();
        regionPreference.registerOnSharedPreferenceChangeListener(new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: h96
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                DeviceManagerComponent.registerPrivacyListener$lambda$6(function0, sharedPreferences, str);
            }
        });
    }

    @ComponentTask(notLaterThan = 3, processName = ":device")
    public final void requestDeviceWhenMainResume() {
        com.xiaomi.fitness.common.log.Logger.i(TAG, "requestDeviceWhenMainResume() called");
        AppManager.INSTANCE.getInstance().registerLifecycleListener(new Function2() { // from class: g96
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DeviceManagerComponent.requestDeviceWhenMainResume$lambda$4(this.f18748a, (String) obj, (String) obj2);
            }
        });
    }

    @ComponentTask(name = "ConnectProcess", notLaterThan = 2, onMainThread = false)
    public final void startConnectProcess(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        com.xiaomi.fitness.common.log.Logger.e(TAG, "startConnectProcess: " + AppUtil.INSTANCE.isMainThread());
        ServiceConnector.bindPoolService$default(ServiceConnector.INSTANCE.getInstance(), application, "fitness.intent.action.DEVICE", null, 0, 12, null);
        xfl.a().d(new DeviceManagerPageScheme());
        xfl.a().d(new BindDeviceSchemaHandler());
    }

    @ComponentTask(name = "startForegroundService", notEarlierThan = 2, onMainThread = false)
    public final void startForegroundService() {
        AppManager.INSTANCE.getInstance().registerLifecycleListener(new Function2() { // from class: i96
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DeviceManagerComponent.startForegroundService$lambda$2(this.f20901a, (String) obj, (String) obj2);
            }
        });
    }

    @ComponentTask(notEarlierThan = 2, notLaterThan = 4, processName = ":device")
    public final void updateDevices() {
        DeviceInfoUpdater deviceInfoUpdater = DeviceInfoUpdater.INSTANCE;
        deviceInfoUpdater.registerBindNewReceiver();
        com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceStatusListener(deviceInfoUpdater);
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            updateUserInfo();
        }
    }
}
