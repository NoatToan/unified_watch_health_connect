package com.xiaomi.hm.health.device.setting.life.feature;

import com.huami.bluetooth.profile.channel.module.MenstruationModule;
import com.huami.device.core.sync.api.exception.SyncException;
import com.huami.femalehealth.logiclib.device.MenstruationDataManager;
import com.huami.femalehealth.logiclib.helper.FemaleHealthScopeNames;
import com.huami.femalehealth.logiclib.repo.SettingRepo;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.device.feature.sync.job.mili.data.MenstruationConfigCallback;
import com.xiaomi.hm.health.device.feature.sync.job.mili.data.MenstruationDeviceConfigCallback;
import com.xiaomi.hm.health.device.feature.sync.job.mili.data.MenstruationTotalRecordCallback;
import com.xiaomi.mipush.sdk.MiPushClient;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.scope.Scope;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/life/feature/FemaleListenerSubscriber;", "Lcom/xiaomi/hm/health/device/setting/life/feature/BleEventSubscriber;", "", "getName", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "", "register", MiPushClient.COMMAND_UNREGISTER, "a", "Ljava/lang/String;", "tag", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class FemaleListenerSubscriber implements BleEventSubscriber {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String tag = "FemaleListenerSubscriber";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.life.feature.FemaleListenerSubscriber$register$1", f = "FemaleListenerSubscriber.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HMBaseDevice b;
        public final /* synthetic */ FemaleListenerSubscriber c;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.life.feature.FemaleListenerSubscriber$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0844a extends Lambda implements Function0<Unit> {
            public final /* synthetic */ Scope a;
            public final /* synthetic */ HMBaseDevice b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0844a(Scope scope, HMBaseDevice hMBaseDevice) {
                super(0);
                this.a = scope;
                this.b = hMBaseDevice;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ((HMMiLiProDevice) this.b).getMenstruationConfig(new MenstruationDeviceConfigCallback((SettingRepo) this.a.get(Reflection.getOrCreateKotlinClass(SettingRepo.class), null, null), (HMMiLiProDevice) this.b));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ Exception a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Exception exc) {
                super(0);
                this.a = exc;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "error = " + this.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HMBaseDevice hMBaseDevice, FemaleListenerSubscriber femaleListenerSubscriber, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = hMBaseDevice;
            this.c = femaleListenerSubscriber;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                if (this.b instanceof HMMiLiProDevice) {
                    Scope scopeOrNull = KoinJavaComponent.getKoin().getScopeOrNull(FemaleHealthScopeNames.FEMALE_HEALTH);
                    if (scopeOrNull == null) {
                        return Unit.INSTANCE;
                    }
                    MenstruationDataManager menstruationDataManager = (MenstruationDataManager) scopeOrNull.get(Reflection.getOrCreateKotlinClass(MenstruationDataManager.class), null, null);
                    menstruationDataManager.updateFemaleDataSyncTime(Calendar.getInstance());
                    MenstruationModule menstruationModule = (MenstruationModule) this.b.getChannelModule(MenstruationModule.class);
                    if (menstruationModule == null) {
                        return Unit.INSTANCE;
                    }
                    MenstruationConfigCallback menstruationConfigCallback = new MenstruationConfigCallback((HMMiLiProDevice) this.b, menstruationDataManager);
                    ((HMMiLiProDevice) this.b).getMenstruationConfig(menstruationConfigCallback);
                    menstruationConfigCallback.waiteForFinished();
                    MenstruationTotalRecordCallback menstruationTotalRecordCallback = new MenstruationTotalRecordCallback();
                    menstruationModule.getMenstruationTotalRecord(menstruationTotalRecordCallback);
                    menstruationDataManager.addDataFromDevice(menstruationTotalRecordCallback.waiteForResult());
                    menstruationModule.setDataChangeListener(new C0844a(scopeOrNull, this.b));
                }
            } catch (Exception e) {
                HMLog.error$default(this.c.tag, null, null, new b(e), 6, null);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "error = " + this.a;
        }
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber
    @NotNull
    /* JADX INFO: renamed from: getName, reason: from getter */
    public String getTag() {
        return this.tag;
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber
    public void register(@NotNull HMBaseDevice device) {
        e.f(GlobalScope.INSTANCE, null, null, new a(device, this, null), 3, null);
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber
    public void unregister(@NotNull HMBaseDevice device) {
        try {
            if (device instanceof HMMiLiProDevice) {
                MenstruationModule menstruationModule = (MenstruationModule) device.getChannelModule(MenstruationModule.class);
                if (menstruationModule == null) {
                    throw new SyncException("女性健康通信模块创建失败", null, 0, 6, null);
                }
                menstruationModule.setDataChangeListener(null);
            }
        } catch (Exception e) {
            HMLog.error$default(this.tag, null, null, new b(e), 6, null);
        }
    }
}
