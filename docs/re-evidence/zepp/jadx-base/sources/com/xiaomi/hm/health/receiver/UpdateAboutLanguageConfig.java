package com.xiaomi.hm.health.receiver;

import android.content.Context;
import android.text.TextUtils;
import com.huami.tools.log.HMLog;
import com.huami.worldclock.controller.IWorldClockController;
import com.huami.worldclock.controller.WorldClockController;
import com.huami.worldclock.manager.WorldClockConfig;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.model.HMLanguage;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceFreeTask;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.HMDeviceUtils;
import com.xiaomi.hm.health.device.service.UpdateWeatherWrapper;
import com.xiaomi.hm.health.locweather.LocWeatherManager;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.ui.language.DeviceLanguage;
import com.xiaomi.hm.health.ui.language.DeviceLanguageConfig;
import com.xiaomi.hm.health.ui.language.HmLanguageUtil;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001e\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001d\u0010\u000f\u001a\u00020\u000b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/receiver/UpdateAboutLanguageConfig;", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "", "updateAboutLanguageConfig", "", "kotlin.jvm.PlatformType", "a", "Ljava/lang/String;", "TAG", "Lcom/huami/worldclock/controller/IWorldClockController;", "b", "Lkotlin/Lazy;", "()Lcom/huami/worldclock/controller/IWorldClockController;", "worldClockController", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class UpdateAboutLanguageConfig {

    @NotNull
    public static final UpdateAboutLanguageConfig INSTANCE = new UpdateAboutLanguageConfig();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String TAG = UpdateAboutLanguageConfig.class.getSimpleName();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final Lazy worldClockController = LazyKt__LazyJVMKt.lazy(c.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Boolean, Unit> {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.xiaomi.hm.health.receiver.UpdateAboutLanguageConfig$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0990a extends Lambda implements Function0<String> {
            public final /* synthetic */ Boolean a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0990a(Boolean bool) {
                super(0);
                this.a = bool;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "supportHuamiOS: " + this.a;
            }
        }

        public a() {
            super(1);
        }

        public final void a(Boolean bool) {
            HMLog.info(UpdateAboutLanguageConfig.TAG, new C0990a(bool));
            if (bool.booleanValue()) {
                return;
            }
            UpdateWeatherWrapper.updateWeatherToDevice(LocWeatherManager.getInstance().getWeatherInfosForDevice());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            a(bool);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.receiver.UpdateAboutLanguageConfig$updateAboutLanguageConfig$2", f = "UpdateAboutLanguageConfig.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IWorldClockController iWorldClockControllerA = UpdateAboutLanguageConfig.INSTANCE.a();
                Context context = BraceletApp.getContext();
                this.a = 1;
                if (iWorldClockControllerA.setLocaleWorldClock(context, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/worldclock/controller/WorldClockController;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<WorldClockController> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WorldClockController invoke() {
            return new WorldClockController();
        }
    }

    private UpdateAboutLanguageConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IWorldClockController a() {
        return (IWorldClockController) worldClockController.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v9, types: [T, com.xiaomi.hm.health.bt.model.HMLanguage] */
    /* JADX WARN: Type inference failed for: r5v6, types: [T, com.xiaomi.hm.health.bt.model.HMLanguage] */
    public final void updateAboutLanguageConfig(@NotNull HMDeviceSource source) {
        final HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) HMDeviceManager.getInstance().getDevice(source.getType());
        if (hMMiLiProDevice == null || !hMMiLiProDevice.isConnected()) {
            return;
        }
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        HMDeviceUtils.setTimePanelBYSystemLang(hMMiLiProDevice, hMPersonInfo);
        HMDeviceUtils.setShowContactBySystemLanguage(hMMiLiProDevice, hMPersonInfo);
        DeviceInfo deviceInfo = hMMiLiProDevice.getDeviceInfo();
        boolean z = false;
        boolean z2 = deviceInfo == null || !deviceInfo.getLanguageComBination().isSupportDeviceSettings();
        final boolean z3 = deviceInfo != null && deviceInfo.getDeviceFeature().hasSw(1);
        DeviceLanguage deviceLanguage = DeviceLanguageConfig.INSTANCE.getDeviceLanguage(hMMiLiProDevice.getDeviceSource().getValue());
        if ((deviceLanguage != null && deviceLanguage.isFollowSystem()) && !z2) {
            z = true;
        }
        if ((!HMDeviceConfig.hasFeatureG2(source) && z2) || z) {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = HMDeviceUtils.fromSystemLanguage();
            HMCallback<Object> hMCallback = new HMCallback<Object>() { // from class: com.xiaomi.hm.health.receiver.UpdateAboutLanguageConfig$updateAboutLanguageConfig$callback$1

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class a extends Lambda implements Function0<String> {
                    public final /* synthetic */ Ref.ObjectRef<HMLanguage> a;
                    public final /* synthetic */ boolean b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public a(Ref.ObjectRef<HMLanguage> objectRef, boolean z) {
                        super(0);
                        this.a = objectRef;
                        this.b = z;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return "setLanguage " + this.a.element.getLanguage() + " result:" + this.b;
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class b extends Lambda implements Function1<Boolean, Unit> {
                    public static final b a = new b();

                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    public static final class a extends Lambda implements Function0<String> {
                        public final /* synthetic */ Boolean a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public a(Boolean bool) {
                            super(0);
                            this.a = bool;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        public final String invoke() {
                            return "supportHuamiOS: " + this.a;
                        }
                    }

                    public b() {
                        super(1);
                    }

                    public final void a(Boolean bool) {
                        HMLog.info(UpdateAboutLanguageConfig.TAG, new a(bool));
                        if (bool.booleanValue()) {
                            return;
                        }
                        UpdateWeatherWrapper.updateWeatherToDevice(LocWeatherManager.getInstance().getWeatherInfosForDevice());
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                        a(bool);
                        return Unit.INSTANCE;
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.xiaomi.hm.health.receiver.UpdateAboutLanguageConfig$updateAboutLanguageConfig$callback$1$onFinish$3", f = "UpdateAboutLanguageConfig.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
                public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    public int a;

                    public c(Continuation<? super c> continuation) {
                        super(2, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        return new c(continuation);
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
                            IWorldClockController iWorldClockControllerA = UpdateAboutLanguageConfig.INSTANCE.a();
                            Context context = BraceletApp.getContext();
                            this.a = 1;
                            if (iWorldClockControllerA.setLocaleWorldClock(context, this) == coroutine_suspended) {
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

                @Override // com.xiaomi.hm.health.bt.device.HMCallback
                public void onFinish(boolean result) {
                    HMLog.info(UpdateAboutLanguageConfig.TAG, new a(objectRef, result));
                    hMMiLiProDevice.supportHuamiOSWeather(b.a);
                    if (z3) {
                        e.f(WorldClockConfig.INSTANCE.getWorldClockScope(), null, null, new c(null), 3, null);
                    }
                }
            };
            if (z) {
                Integer localeToHmLanguageCode = HmLanguageUtil.INSTANCE.parseLocaleToHmLanguageCode(Locale.getDefault());
                objectRef.element = new HMLanguage(localeToHmLanguageCode == null ? 2 : localeToHmLanguageCode.intValue());
            }
            hMMiLiProDevice.setLanguage((HMLanguage) objectRef.element, hMCallback);
        }
        if (!z2) {
            hMMiLiProDevice.supportHuamiOSWeather(a.a);
            if (z3) {
                e.f(WorldClockConfig.INSTANCE.getWorldClockScope(), null, null, new b(null), 3, null);
            }
        }
        final String dateFormat = HMDeviceUtils.getDateFormat(source);
        if (!TextUtils.isEmpty(dateFormat)) {
            final HMDeviceFreeTask.DeviceConfig deviceConfig = HMDeviceFreeTask.getDeviceConfig();
            if (!Intrinsics.areEqual(dateFormat, deviceConfig.dateFormat)) {
                hMMiLiProDevice.setDateFormat(dateFormat, new HMCallback<Object>() { // from class: com.xiaomi.hm.health.receiver.UpdateAboutLanguageConfig.updateAboutLanguageConfig.3
                    @Override // com.xiaomi.hm.health.bt.device.HMCallback
                    public void onFinish(boolean result) {
                        HMDeviceFreeTask.DeviceConfig deviceConfig2 = deviceConfig;
                        deviceConfig2.dateFormat = dateFormat;
                        HMDeviceFreeTask.saveDeviceConfig(deviceConfig2);
                    }
                });
            }
        }
        if (HMDeviceConfig.hasFeatureCalendarAndStartDayOfWeek()) {
            final byte b2 = Language.isChinese() ? (byte) 1 : (byte) 0;
            hMMiLiProDevice.setOtherCalendar(b2, new HMCallback<Object>() { // from class: com.xiaomi.hm.health.receiver.UpdateAboutLanguageConfig.updateAboutLanguageConfig.4

                /* JADX INFO: renamed from: com.xiaomi.hm.health.receiver.UpdateAboutLanguageConfig$updateAboutLanguageConfig$4$a */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class a extends Lambda implements Function0<String> {
                    public final /* synthetic */ byte a;
                    public final /* synthetic */ boolean b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public a(byte b, boolean z) {
                        super(0);
                        this.a = b;
                        this.b = z;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        byte b = this.a;
                        return "setOtherCalendar " + ((int) b) + ",ret:" + this.b;
                    }
                }

                @Override // com.xiaomi.hm.health.bt.device.HMCallback
                public void onFinish(boolean result) {
                    if (result) {
                        HMDeviceFreeTask.getDeviceConfig().setDeviceLanguage(Language.getDefault());
                    }
                    HMLog.info(UpdateAboutLanguageConfig.TAG, new a(b2, result));
                }
            });
        }
    }
}
