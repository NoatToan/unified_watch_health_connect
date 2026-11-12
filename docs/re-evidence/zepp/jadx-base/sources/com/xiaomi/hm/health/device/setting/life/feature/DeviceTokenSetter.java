package com.xiaomi.hm.health.device.setting.life.feature;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.WiFiControllerModule;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.network.hmnetwork.config.HMAppConfig;
import com.huami.passport.IAccount;
import com.huami.passport.api.TokenHelper;
import com.huami.passport.domain.model.TokenInfo;
import com.huami.passport.utils.TokenEventHelper;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMAmazfitScaleDevice;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.model.HMLanguage;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineManager;
import com.xiaomi.hm.health.device.setting.life.feature.trigger.TokenRefreshTrigger;
import com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt;
import com.xiaomi.mipush.sdk.MiPushClient;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001f2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001fB\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u001b\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0010J\b\u0010\u0012\u001a\u00020\u000bH\u0016J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0015\u001a\u00020\bH\u0016J\u001c\u0010\u001a\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016R\u0016\u0010\u001c\u001a\u00020\u000b8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0011\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/device/setting/life/feature/DeviceTokenSetter;", "Landroid/content/BroadcastReceiver;", "Lcom/xiaomi/hm/health/device/setting/life/feature/BleEventSubscriber;", "Lcom/xiaomi/hm/health/device/setting/life/feature/trigger/TokenRefreshTrigger;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "", "isClean", "", GoogleApiAvailabilityLight.a, "(Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "coderStr", "", "b", "c", "(Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "getName", "register", MiPushClient.COMMAND_UNREGISTER, "onTokenRefreshed", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/content/Intent;", "intent", "onReceive", "Ljava/lang/String;", "tag", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DeviceTokenSetter extends BroadcastReceiver implements BleEventSubscriber, TokenRefreshTrigger {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String EXTRA_NETWORK_ENABLE = "EXTRA_NETWORK_ENABLE";

    @NotNull
    public static final String LOCAL_ACTION_NETWORK_CHANGED = "com.huami.watch.hmwatchmanager.networkchange";

    @NotNull
    private static final String b = "DeviceTokenSetter";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String tag = "DeviceLifeFeature";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0016\u0010\f\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/life/feature/DeviceTokenSetter$Companion;", "", "Landroid/content/IntentFilter;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "subscribeBroadcast", "", "EXTRA_NETWORK_ENABLE", "Ljava/lang/String;", "LOCAL_ACTION_NETWORK_CHANGED", "TAG", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Throwable a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Throwable th) {
                super(0);
                this.a = th;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "error of BR : " + this.a.getMessage();
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final IntentFilter a() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(TokenEventHelper.ACTION_APP_TOKEN_REFRESH);
            intentFilter.addAction("com.huami.watch.hmwatchmanager.networkchange");
            return intentFilter;
        }

        public final void subscribeBroadcast(@NotNull Context context) {
            try {
                LocalBroadcastManager.getInstance(context).registerReceiver(new DeviceTokenSetter(), a());
            } catch (Throwable th) {
                HMLog.error$default(null, null, null, new a(th), 7, null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "device is null.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "error of onTokenRefreshed";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.life.feature.DeviceTokenSetter$register$1", f = "DeviceTokenSetter.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HMBaseDevice b;
        public final /* synthetic */ DeviceTokenSetter c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ HMBaseDevice a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HMBaseDevice hMBaseDevice) {
                super(0);
                this.a = hMBaseDevice;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "此设备(" + this.a.getMDeviceSource() + ")不支持注入token";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(HMBaseDevice hMBaseDevice, DeviceTokenSetter deviceTokenSetter, Continuation<? super c> continuation) {
            super(2, continuation);
            this.b = hMBaseDevice;
            this.c = deviceTokenSetter;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (!ConfigHelperKt.hasFeature(Feature.NEED_INJECT_TOKEN, this.b.getMDeviceSource())) {
                    HMLog.info(this.c.tag, new a(this.b));
                    return Unit.INSTANCE;
                }
                DeviceTokenSetter deviceTokenSetter = this.c;
                HMBaseDevice hMBaseDevice = this.b;
                this.a = 1;
                if (deviceTokenSetter.c(hMBaseDevice, this) == coroutine_suspended) {
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
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.life.feature.DeviceTokenSetter$unregister$1", f = "DeviceTokenSetter.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HMBaseDevice c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(HMBaseDevice hMBaseDevice, Continuation<? super d> continuation) {
            super(2, continuation);
            this.c = hMBaseDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DeviceTokenSetter.this.new d(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DeviceTokenSetter deviceTokenSetter = DeviceTokenSetter.this;
                HMBaseDevice hMBaseDevice = this.c;
                this.a = 1;
                if (deviceTokenSetter.a(hMBaseDevice, this) == coroutine_suspended) {
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
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.life.feature.DeviceTokenSetter", f = "DeviceTokenSetter.kt", i = {1}, l = {69, 82, 93}, m = "updateAppToken", n = {"module"}, s = {"L$2"})
    public static final class e extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return DeviceTokenSetter.this.d(null, false, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "注入Token结果：" + this.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(HMBaseDevice hMBaseDevice, Continuation<? super Unit> continuation) {
        Object objD = d(hMBaseDevice, true, continuation);
        return objD == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objD : Unit.INSTANCE;
    }

    private final int b(String coderStr) {
        try {
            return Integer.parseInt(coderStr);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object c(HMBaseDevice hMBaseDevice, Continuation<? super Unit> continuation) {
        Object objD = d(hMBaseDevice, false, continuation);
        return objD == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objD : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:43:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cb A[Catch: all -> 0x0150, TRY_LEAVE, TryCatch #0 {all -> 0x0150, blocks: (B:41:0x00c5, B:44:0x00cb, B:49:0x0118, B:52:0x011f, B:48:0x0114), top: B:69:0x00c5 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0112  */
    /* JADX WARN: Code duplicated, block: B:48:0x0114 A[Catch: all -> 0x0150, TRY_ENTER, TryCatch #0 {all -> 0x0150, blocks: (B:41:0x00c5, B:44:0x00cb, B:49:0x0118, B:52:0x011f, B:48:0x0114), top: B:69:0x00c5 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x011e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0138 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x0139  */
    /* JADX WARN: Code duplicated, block: B:58:0x0146  */
    /* JADX WARN: Code duplicated, block: B:59:0x0148  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Instruction removed from duplicated block: B:44:0x00cb, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    public final Object d(HMBaseDevice hMBaseDevice, boolean z, Continuation<? super Unit> continuation) {
        e eVar;
        WiFiControllerModule wiFiControllerModule;
        Object objAwait;
        DeviceTokenSetter deviceTokenSetter;
        TokenInfo tokenInfo;
        String appToken;
        DeviceTokenSetter deviceTokenSetter2;
        boolean zBooleanValue;
        boolean z2;
        HMBaseDevice hMBaseDevice2 = hMBaseDevice;
        DeviceTokenSetter deviceTokenSetter3 = "_";
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i = eVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                eVar.f = i - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        e eVar2 = eVar;
        Object objSendToken = eVar2.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = eVar2.f;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objSendToken);
                try {
                    wiFiControllerModule = (WiFiControllerModule) hMBaseDevice2.getChannelModule(WiFiControllerModule.class);
                    if (wiFiControllerModule == null) {
                        return Unit.INSTANCE;
                    }
                    if (z) {
                        eVar2.a = this;
                        eVar2.f = 1;
                        if (wiFiControllerModule.sendToken("", "", 0, 0, "", "", (64 & 64) != 0 ? null : null, eVar2) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        final CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                        TokenHelper.authorize((Context) DeviceXFunctionsKt.getContext(), true, new IAccount.Callback<TokenInfo, String>() { // from class: com.xiaomi.hm.health.device.setting.life.feature.DeviceTokenSetter$updateAppToken$2

                            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                            public static final class a extends Lambda implements Function0<String> {
                                public final /* synthetic */ String a;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public a(String str) {
                                    super(0);
                                    this.a = str;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                @Nullable
                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final String getA() {
                                    return "转换 device token ：" + this.a;
                                }
                            }

                            @Override // com.huami.passport.IAccount.Callback
                            public void onError(@Nullable String error) {
                                HMLog.error$default(this.tag, null, null, new a(error), 6, null);
                                completableDeferredCompletableDeferred$default.complete(null);
                            }

                            @Override // com.huami.passport.IAccount.Callback
                            public void onSuccess(@Nullable TokenInfo result) {
                                completableDeferredCompletableDeferred$default.complete(result);
                            }
                        });
                        eVar2.a = this;
                        eVar2.b = hMBaseDevice2;
                        eVar2.c = wiFiControllerModule;
                        eVar2.f = 2;
                        objAwait = completableDeferredCompletableDeferred$default.await(eVar2);
                        if (objAwait == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        deviceTokenSetter = this;
                        tokenInfo = (TokenInfo) objAwait;
                        if (tokenInfo == null) {
                            String packageName = HMAppConfig.getPackageName();
                            String str = HMAppConfig.getVersionCode() + "_" + HMAppConfig.getVersionName();
                            Locale locale = HMFwOnlineManager.getLocale(hMBaseDevice2.getDeviceInfo());
                            String str2 = HMLanguage.getLanguageCode(locale) + "_" + locale.getCountry();
                            if (hMBaseDevice2 instanceof HMAmazfitScaleDevice) {
                                appToken = "";
                            } else {
                                appToken = tokenInfo.getAppToken();
                            }
                            String loginToken = tokenInfo.getLoginToken();
                            if (appToken == null) {
                                appToken = "";
                            }
                            int iB = deviceTokenSetter.b(tokenInfo.getRegion());
                            eVar2.a = deviceTokenSetter;
                            eVar2.b = tokenInfo;
                            eVar2.c = null;
                            eVar2.f = 3;
                            objSendToken = wiFiControllerModule.sendToken(loginToken, appToken, iB, 0, packageName, str, str2, eVar2);
                            if (objSendToken == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            deviceTokenSetter2 = deviceTokenSetter;
                            zBooleanValue = ((Boolean) objSendToken).booleanValue();
                            String str3 = deviceTokenSetter2.tag;
                            if (zBooleanValue) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            HMLog.info(str3, new f(z2));
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    deviceTokenSetter3 = this;
                    HMLog.e(deviceTokenSetter3.tag, th, "set token error!", new Object[0]);
                    return Unit.INSTANCE;
                }
            } else if (i2 != 1) {
                if (i2 == 2) {
                    WiFiControllerModule wiFiControllerModule2 = (WiFiControllerModule) eVar2.c;
                    HMBaseDevice hMBaseDevice3 = (HMBaseDevice) eVar2.b;
                    DeviceTokenSetter deviceTokenSetter4 = (DeviceTokenSetter) eVar2.a;
                    try {
                        ResultKt.throwOnFailure(objSendToken);
                        deviceTokenSetter = deviceTokenSetter4;
                        objAwait = objSendToken;
                        wiFiControllerModule = wiFiControllerModule2;
                        hMBaseDevice2 = hMBaseDevice3;
                        try {
                            tokenInfo = (TokenInfo) objAwait;
                            if (tokenInfo == null) {
                                String packageName2 = HMAppConfig.getPackageName();
                                String str4 = HMAppConfig.getVersionCode() + "_" + HMAppConfig.getVersionName();
                                Locale locale2 = HMFwOnlineManager.getLocale(hMBaseDevice2.getDeviceInfo());
                                String str5 = HMLanguage.getLanguageCode(locale2) + "_" + locale2.getCountry();
                                if (hMBaseDevice2 instanceof HMAmazfitScaleDevice) {
                                    appToken = "";
                                } else {
                                    appToken = tokenInfo.getAppToken();
                                }
                                String loginToken2 = tokenInfo.getLoginToken();
                                if (appToken == null) {
                                    appToken = "";
                                }
                                int iB2 = deviceTokenSetter.b(tokenInfo.getRegion());
                                eVar2.a = deviceTokenSetter;
                                eVar2.b = tokenInfo;
                                eVar2.c = null;
                                eVar2.f = 3;
                                objSendToken = wiFiControllerModule.sendToken(loginToken2, appToken, iB2, 0, packageName2, str4, str5, eVar2);
                                if (objSendToken == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                deviceTokenSetter2 = deviceTokenSetter;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            deviceTokenSetter3 = deviceTokenSetter;
                            HMLog.e(deviceTokenSetter3.tag, th, "set token error!", new Object[0]);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        deviceTokenSetter3 = deviceTokenSetter4;
                        HMLog.e(deviceTokenSetter3.tag, th, "set token error!", new Object[0]);
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    deviceTokenSetter2 = (DeviceTokenSetter) eVar2.a;
                    ResultKt.throwOnFailure(objSendToken);
                }
                zBooleanValue = ((Boolean) objSendToken).booleanValue();
                String str6 = deviceTokenSetter2.tag;
                if (zBooleanValue) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                HMLog.info(str6, new f(z2));
            } else {
                ResultKt.throwOnFailure(objSendToken);
            }
        } catch (Throwable th4) {
            th = th4;
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object e(DeviceTokenSetter deviceTokenSetter, HMBaseDevice hMBaseDevice, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return deviceTokenSetter.d(hMBaseDevice, z, continuation);
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber
    @NotNull
    /* JADX INFO: renamed from: getName */
    public String getTag() {
        return "DeviceTokenEvent";
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        if (Intrinsics.areEqual(TokenEventHelper.ACTION_APP_TOKEN_REFRESH, intent.getAction())) {
            onTokenRefreshed();
        } else if (Intrinsics.areEqual("com.huami.watch.hmwatchmanager.networkchange", intent.getAction()) && intent.getBooleanExtra("EXTRA_NETWORK_ENABLE", false)) {
            onTokenRefreshed();
        }
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.trigger.TokenRefreshTrigger
    public void onTokenRefreshed() {
        try {
            HMBaseDevice device = HMDeviceManager.getInstance().getDevice();
            if (device == null) {
                HMLog.info(b, a.a);
            } else {
                register(device);
            }
        } catch (Throwable th) {
            HMLog.error$default(b, null, th, b.a, 2, null);
        }
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber
    public void register(@NotNull HMBaseDevice device) {
        kotlinx.coroutines.e.f(GlobalScope.INSTANCE, Dispatchers.getIO().plus(ExtKt.getExceptionHandler()), null, new c(device, this, null), 2, null);
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber
    public void unregister(@NotNull HMBaseDevice device) {
        kotlinx.coroutines.e.f(GlobalScope.INSTANCE, Dispatchers.getIO().plus(ExtKt.getExceptionHandler()), null, new d(device, null), 2, null);
    }
}
