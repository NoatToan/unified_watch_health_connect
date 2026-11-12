package com.xiaomi.fitness.nfc.register;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.miui.tsmclient.open.OpenConstants;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.SyncStateListener;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.login.utils.RegionUtil;
import com.xiaomi.fitness.nfc.bean.yoyo.CardInfoBeanKt;
import com.xiaomi.fitness.nfc.bean.yoyo.CardInfoRequest;
import com.xiaomi.fitness.nfc.bean.yoyo.CardInfoResponse;
import com.xiaomi.fitness.nfc.di.NfcEventModule;
import com.xiaomi.fitness.nfc.register.NfcComponent;
import com.xiaomi.fitness.nfc.request.YoYoCardRequest;
import com.xiaomi.fitness.nfc.schema.NFCPushSchemaHandler;
import com.xiaomi.fitness.nfc.sp.NfcPreference;
import com.xiaomi.fitness.nfc.utils.NfcUtils;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.jtk;
import defpackage.ltg;
import defpackage.o63;
import defpackage.rr3;
import defpackage.s3q;
import defpackage.vqg;
import defpackage.xfl;
import defpackage.zl3;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\b\u001a\u00020\u0005H\u0002J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u001e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0005H\u0002J\b\u0010\u0012\u001a\u00020\u0005H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/nfc/register/NfcComponent;", "", "<init>", "()V", "registerAppCreate", "", "openServiceReceiver", "Landroid/content/BroadcastReceiver;", "registerSyncNfc", "syncData", "did", "", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "loadYoYoCard", "callBack", "Lkotlin/Function0;", "registerNfcSchemerHandlder", "registerDeviceConnection", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = "nfc")
public final class NfcComponent {

    @NotNull
    private final BroadcastReceiver openServiceReceiver = new BroadcastReceiver() { // from class: com.xiaomi.fitness.nfc.register.NfcComponent$openServiceReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            String stringExtra = intent.getStringExtra("action_type");
            String stringExtra2 = intent.getStringExtra("card_type");
            String stringExtra3 = intent.getStringExtra("aid");
            vqg.d("openServiceReceiver action: " + intent.getAction() + " " + stringExtra + " " + stringExtra2 + " " + stringExtra3);
            if (!Intrinsics.areEqual("delete", stringExtra) || stringExtra3 == null) {
                return;
            }
            o63.b(new jtk());
            ltg.c().k(stringExtra3);
        }
    };

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.register.NfcComponent$loadYoYoCard$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.register.NfcComponent$loadYoYoCard$1", f = "NfcComponent.kt", i = {}, l = {135}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $callBack;
        final /* synthetic */ String $did;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Function0<Unit> function0, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$did = str;
            this.$callBack = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$did, this.$callBack, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    boolean zIsNeedYoYoCardFirstSync = NfcPreference.isNeedYoYoCardFirstSync(this.$did);
                    vqg.d("NfcComponent loadYoYoCard start isNeedSyncYoYo:" + zIsNeedYoYoCardFirstSync);
                    if (zIsNeedYoYoCardFirstSync) {
                        NfcPreference.setNeedYoYoCardFirstSync(this.$did, false);
                        CardInfoRequest cardInfoRequestBuildCardInfo = NfcUtils.buildCardInfo();
                        YoYoCardRequest yoYoCardRequest = new YoYoCardRequest();
                        this.label = 1;
                        obj = yoYoCardRequest.cardInfo(cardInfoRequestBuildCardInfo, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CardInfoResponse cardInfoResponse = (CardInfoResponse) obj;
                vqg.d("NfcComponent loadYoYoCard " + cardInfoResponse.getCardInfo().getCardStatus());
                if (Intrinsics.areEqual(cardInfoResponse.getCardInfo().getCardStatus(), "00") || Intrinsics.areEqual(cardInfoResponse.getCardInfo().getCardStatus(), CardInfoBeanKt.sStatusDisableCard)) {
                    ltg.c().w(true);
                }
            } catch (Exception e) {
                vqg.c("NfcComponent loadYoYoCard", e);
            } finally {
                this.$callBack.invoke();
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.register.NfcComponent$registerSyncNfc$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/nfc/register/NfcComponent$registerSyncNfc$1", "Lcom/xiaomi/fitness/device/contact/export/SyncStateListener;", LifecycleConstantKt.ON_START, "", "did", "", "onSyncing", BroadcastsKt.SILENT_PUSHING_PROGRESS, "", "onFinish", "code", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C26651 implements SyncStateListener {
        public C26651() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onFinish$lambda$1$lambda$0(NfcComponent this$0, String did, WearableDeviceModel wearableDeviceModel) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(did, "$did");
            this$0.syncData(did, wearableDeviceModel);
            return Unit.INSTANCE;
        }

        @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
        public void onFinish(final String did, int code) {
            Intrinsics.checkNotNullParameter(did, "did");
            vqg.b("onFinish did:" + did + " code:" + code);
            final WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did);
            if (wearableDeviceModel != null) {
                final NfcComponent nfcComponent = NfcComponent.this;
                s3q.f0().t0(wearableDeviceModel);
                boolean zIsSupportFeature = DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.EASYCARD);
                vqg.d("background sync supportEasycard:" + zIsSupportFeature);
                if (zIsSupportFeature) {
                    nfcComponent.loadYoYoCard(did, new Function0() { // from class: dmg
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return NfcComponent.C26651.onFinish$lambda$1$lambda$0(nfcComponent, did, wearableDeviceModel);
                        }
                    });
                } else {
                    nfcComponent.syncData(did, wearableDeviceModel);
                }
            }
        }

        @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
        public void onStart(String did) {
            Intrinsics.checkNotNullParameter(did, "did");
            vqg.b(LifecycleConstantKt.ON_START);
        }

        @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
        public void onSyncing(String did, int progress) {
            Intrinsics.checkNotNullParameter(did, "did");
            vqg.b("onSyncing");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadYoYoCard(String did, Function0<Unit> callBack) {
        AnyExtKt.io$default(null, new AnonymousClass1(did, callBack, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerAppCreate$lambda$0(boolean z) {
        if (!z) {
            s3q.f0().N();
        }
        return Unit.INSTANCE;
    }

    private final void registerDeviceConnection() {
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceStatusListener(new OnDeviceFullStatusListener() { // from class: com.xiaomi.fitness.nfc.register.NfcComponent.registerDeviceConnection.1
            @Override // com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener, com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onConnectSuccess(String did) {
                vqg.b("NfcComponet onConnectSuccess did:" + did);
                if (did != null) {
                    WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
                    s3q.f0().t0(wearableDeviceModel);
                    if (wearableDeviceModel == null || !NfcUtils.isSupportNfc(wearableDeviceModel) || DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.MASTERCARD)) {
                        return;
                    }
                    NfcEventModule.INSTANCE.updateCardNumber(zl3.g().j().size() + zl3.g().f().size() + zl3.g().d().size());
                }
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener
            public void onDestroy(String did, boolean isRemoved) {
                super.onDestroy(did, isRemoved);
                vqg.d("registerDeviceConnection onDestroy did:" + did + " isRemoved:" + isRemoved);
                if (!isRemoved || did == null) {
                    return;
                }
                NfcPreference.setNeedYoYoCardFirstSync(did, true);
                NfcPreference.setInitSync(did, false);
                zl3.g().b(did);
                NfcPreference.INSTANCE.setCheckUserBind(false);
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener
            public void onInit(String did, boolean isReadded) {
                super.onInit(did, isReadded);
                vqg.d("registerDeviceConnection onInit did:" + did + " isReadded:" + isReadded);
                if (!isReadded || did == null) {
                    return;
                }
                NfcPreference.setNeedYoYoCardFirstSync(did, true);
                NfcPreference.setInitSync(did, false);
                zl3.g().b(did);
                NfcPreference.INSTANCE.setCheckUserBind(false);
            }
        });
    }

    private final void registerNfcSchemerHandlder() {
        xfl.a().d(new rr3());
        xfl.a().d(new NFCPushSchemaHandler());
    }

    private final void registerSyncNfc() {
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).addSyncStateListener(new C26651());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncData(String did, WearableDeviceModel deviceModel) {
        boolean zIsSupportFeature = DeviceModelExtKt.isSupportFeature(deviceModel, "nfc");
        boolean zIsSupportFeature2 = DeviceModelExtKt.isSupportFeature(deviceModel, Feature.MASTERCARD);
        vqg.d("background sync supportNfc:" + zIsSupportFeature + "  supportMaster:" + zIsSupportFeature2);
        if (zIsSupportFeature || zIsSupportFeature2) {
            boolean zIsInitSync = NfcPreference.isInitSync(did);
            vqg.d("background sync CardListLoaded:" + zIsInitSync);
            if (zIsInitSync) {
                return;
            }
            s3q.f0().v1(deviceModel);
        }
    }

    @ComponentTask(notEarlierThan = 3, notLaterThan = 3, onMainThread = true)
    public final void registerAppCreate() {
        registerNfcSchemerHandlder();
        registerDeviceConnection();
        registerSyncNfc();
        AccountManagerExtKt.getInstance(AccountManager.INSTANCE).addAccountListener(new Function1() { // from class: cmg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return NfcComponent.registerAppCreate$lambda$0(((Boolean) obj).booleanValue());
            }
        });
        vqg.d("registerAppCreate register OpenConstants.ACTION_UPDATE_CARD_INFO " + RegionUtil.isInTaiWan());
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(OpenConstants.ACTION_UPDATE_CARD_INFO);
        if (Build.VERSION.SDK_INT >= 33) {
            ApplicationExtKt.getApplication().registerReceiver(this.openServiceReceiver, intentFilter, 2);
        } else {
            ApplicationExtKt.getApplication().registerReceiver(this.openServiceReceiver, intentFilter);
        }
    }
}
