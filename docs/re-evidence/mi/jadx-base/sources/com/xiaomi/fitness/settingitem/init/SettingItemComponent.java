package com.xiaomi.fitness.settingitem.init;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.SettingItemPreference;
import com.xiaomi.fitness.settingitem.db.SettingItemDatabase;
import com.xiaomi.fitness.settingitem.db.entity.SettingItemEntity;
import com.xiaomi.fitness.settingitem.init.SettingItemComponent;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0007J\b\u0010\b\u001a\u00020\u0005H\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/settingitem/init/SettingItemComponent;", "", "<init>", "()V", "syncSettings", "", "tryUpdateUserSettingInfo", "initComponent", "initDataSyncReceiver", "Companion", "settingitem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = "settingitems")
public final class SettingItemComponent {

    @NotNull
    public static final String TAG = "SettingItemComponent";

    /* JADX INFO: renamed from: com.xiaomi.fitness.settingitem.init.SettingItemComponent$tryUpdateUserSettingInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.settingitem.init.SettingItemComponent$tryUpdateUserSettingInfo$1", f = "SettingItemComponent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C29181 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C29181(Continuation<? super C29181> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C29181(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DeviceSettingManager.INSTANCE.getInstance().tryUpdateUserSettingInfo();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C29181) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initComponent$lambda$1(boolean z) {
        if (!z) {
            DeviceSettingManager.INSTANCE.getInstance().destroy();
            AnyExtKt.io$default(null, new SettingItemComponent$initComponent$1$1(null), 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initComponent$lambda$2(SettingItemComponent this$0, String old, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(old, "old");
        Intrinsics.checkNotNullParameter(str, "new");
        Logger.i(TAG, "regionChangeListener old:" + old + " new:" + str);
        DeviceSettingManager.INSTANCE.getInstance().destroy();
        AnyExtKt.io$default(null, new SettingItemComponent$initComponent$2$1(null), 1, null);
        if (old.length() == 0) {
            this$0.tryUpdateUserSettingInfo();
        }
        return Unit.INSTANCE;
    }

    private final void tryUpdateUserSettingInfo() {
        AccountManager.Companion companion = AccountManager.INSTANCE;
        if (AccountManagerExtKt.getInstance(companion).isLogin()) {
            AnyExtKt.io$default(null, new C29181(null), 1, null);
        } else {
            AccountManagerExtKt.getInstance(companion).addAccountListener(new Function1() { // from class: i1m
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SettingItemComponent.tryUpdateUserSettingInfo$lambda$0(((Boolean) obj).booleanValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit tryUpdateUserSettingInfo$lambda$0(boolean z) {
        if (z) {
            AnyExtKt.io$default(null, new SettingItemComponent$tryUpdateUserSettingInfo$2$1(null), 1, null);
        }
        return Unit.INSTANCE;
    }

    @ComponentTask(notEarlierThan = 6, notLaterThan = 6, onMainThread = true)
    public final void initComponent() {
        RegionManager.Companion companion = RegionManager.INSTANCE;
        if (RegionExtKt.isRegionSelected(RegionExtKt.getInstance(companion))) {
            tryUpdateUserSettingInfo();
        }
        AccountManagerExtKt.getInstance(AccountManager.INSTANCE).addAccountListener(new Function1() { // from class: j1m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SettingItemComponent.initComponent$lambda$1(((Boolean) obj).booleanValue());
            }
        });
        RegionExtKt.getInstance(companion).addRegionChangeListener(new Function2() { // from class: k1m
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SettingItemComponent.initComponent$lambda$2(this.f23330a, (String) obj, (String) obj2);
            }
        });
    }

    @ComponentTask(notLaterThan = 2)
    public final void initDataSyncReceiver() {
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.xiaomi.fitness.settingitem.init.SettingItemComponent$initDataSyncReceiver$receiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                Logger.i(SettingItemComponent.TAG, "onReceive: data sync event " + (intent != null ? intent.toUri(0) : null));
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("fitness_data_changed_broadcast");
        intentFilter.addAction("recent_data_changed_broadcast");
        if (Build.VERSION.SDK_INT >= 34) {
            ApplicationExtKt.getApplication().registerReceiver(broadcastReceiver, intentFilter, 4);
        } else {
            ApplicationExtKt.getApplication().registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    @ComponentTask(notEarlierThan = 4, onMainThread = false, processName = ":device")
    public final void syncSettings() {
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceStatusListener(new OnDeviceFullStatusListener() { // from class: com.xiaomi.fitness.settingitem.init.SettingItemComponent.syncSettings.1
            @Override // com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener
            public void onBind(String did, boolean isRebind) {
                super.onBind(did, isRebind);
                Logger.i(SettingItemComponent.TAG, "onBind did = " + did);
                DeviceSettingManager.INSTANCE.getInstance().onDeviceBind(did);
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener, com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onConnectSuccess(String did) {
                Product product;
                super.onConnectSuccess(did);
                if (did == null || did.length() == 0) {
                    Logger.i(SettingItemComponent.TAG, "onConnectSuccess did is null");
                    return;
                }
                WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did);
                List<SettingItemEntity> settings = SettingItemDatabase.INSTANCE.getInstance().settingItemDao().getSettings(did);
                Logger.d(SettingItemComponent.TAG, "onConnectSuccess did: " + did + " isSettingItem = " + settings + " product.type = " + ((wearableDeviceModel == null || (product = wearableDeviceModel.getProduct()) == null) ? null : Integer.valueOf(product.getType())) + " deviceConnected:" + (wearableDeviceModel != null ? Boolean.valueOf(wearableDeviceModel.getIsDeviceConnected()) : null) + " isHuami:" + (wearableDeviceModel != null ? Boolean.valueOf(DeviceModelExtKt.isHuaMi(wearableDeviceModel)) : null) + " isBluetooth:" + (wearableDeviceModel != null ? Boolean.valueOf(DeviceModelExtKt.isBluetooth(wearableDeviceModel)) : null));
                if (settings == null || !settings.isEmpty() || wearableDeviceModel == null || !DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
                    return;
                }
                SettingItemPreference.INSTANCE.setSettingItemUpdating(did, true);
                AnyExtKt.io$default(null, new SettingItemComponent$syncSettings$1$onConnectSuccess$1(wearableDeviceModel, null), 1, null);
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener
            public void onDestroy(String did, boolean isRemoved) {
                super.onDestroy(did, isRemoved);
                if (isRemoved) {
                    DeviceSettingManager.INSTANCE.getInstance().clearData(did);
                }
            }
        });
    }
}
