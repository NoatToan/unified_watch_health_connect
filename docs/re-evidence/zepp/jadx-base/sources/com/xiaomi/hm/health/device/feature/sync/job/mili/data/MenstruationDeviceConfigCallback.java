package com.xiaomi.hm.health.device.feature.sync.job.mili.data;

import com.huami.bluetooth.profile.channel.module.MenstruationModule;
import com.huami.device.core.sync.api.exception.SyncException;
import com.huami.femalehealth.logiclib.device.MenstruationDataManager;
import com.huami.femalehealth.logiclib.helper.DateHelper;
import com.huami.femalehealth.logiclib.helper.FemaleHealthScopeNames;
import com.huami.femalehealth.logiclib.repo.SettingRepo;
import com.huami.femalehealth.logiclib.vo.SettingVo;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstruationConfig;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstruationTotalRecord;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import com.xiaomi.hm.health.di.koin.female.FemaleExternalDeviceDataTransfer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/device/feature/sync/job/mili/data/MenstruationDeviceConfigCallback;", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstruationConfig;", "Lorg/koin/core/component/KoinComponent;", "Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstruationTotalRecord;", "menstruationTotalRecord", "", "writeDataToApp", "config", "onFinish", "Lcom/huami/femalehealth/logiclib/repo/SettingRepo;", CommonLanguageSettingFragment.KEY_REPO, "Lcom/huami/femalehealth/logiclib/repo/SettingRepo;", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "device", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "", "tag", "Ljava/lang/String;", "<init>", "(Lcom/huami/femalehealth/logiclib/repo/SettingRepo;Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class MenstruationDeviceConfigCallback extends HMCallback<MenstruationConfig> implements KoinComponent {

    @NotNull
    private final HMMiLiProDevice device;

    @NotNull
    private final SettingRepo repo;

    @NotNull
    private final String tag = "MenstruationDeviceConfigCallback";

    /* JADX INFO: renamed from: com.xiaomi.hm.health.device.feature.sync.job.mili.data.MenstruationDeviceConfigCallback$onFinish$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.feature.sync.job.mili.data.MenstruationDeviceConfigCallback$onFinish$1", f = "MenstruationDeviceConfigCallback.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ MenstruationConfig $config;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MenstruationConfig menstruationConfig, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$config = menstruationConfig;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MenstruationDeviceConfigCallback.this.new AnonymousClass1(this.$config, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Integer numBoxInt;
            Integer numBoxInt2;
            final SettingVo settingVo;
            Byte bBoxByte;
            Integer numBoxInt3;
            Byte bBoxByte2;
            Integer numBoxInt4;
            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SettingVo fromSp = MenstruationDeviceConfigCallback.this.repo.readFromSp();
                    fromSp.setIntelligentPrediction(Intrinsics.areEqual(this.$config.getSmartPredict(), Boxing.boxBoolean(true)));
                    fromSp.setHardwarePush(Intrinsics.areEqual(this.$config.getDeviceNotify(), Boxing.boxBoolean(true)));
                    Byte menstruationNotifyDays = this.$config.getMenstruationNotifyDays();
                    fromSp.setHardwareBeforeMenstruationPush((menstruationNotifyDays == null || (numBoxInt = Boxing.boxInt(menstruationNotifyDays.byteValue())) == null) ? 1 : numBoxInt.intValue());
                    Byte ovulationDays = this.$config.getOvulationDays();
                    fromSp.setHardwareBeforeOvulationPush((ovulationDays == null || (numBoxInt2 = Boxing.boxInt(ovulationDays.byteValue())) == null) ? 1 : numBoxInt2.intValue());
                    MenstruationModule menstruationModule = (MenstruationModule) MenstruationDeviceConfigCallback.this.device.getChannelModule(MenstruationModule.class);
                    if (menstruationModule == null) {
                        throw new SyncException("女性健康通信模块创建失败", null, 0, 6, null);
                    }
                    this.L$0 = fromSp;
                    this.label = 1;
                    Object menstruationTotalRecord = menstruationModule.getMenstruationTotalRecord(this);
                    if (menstruationTotalRecord == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    settingVo = fromSp;
                    obj = menstruationTotalRecord;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    settingVo = (SettingVo) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                final MenstruationTotalRecord menstruationTotalRecord2 = (MenstruationTotalRecord) obj;
                int iIntValue = 5;
                if (menstruationTotalRecord2 != null && (bBoxByte = Boxing.boxByte(menstruationTotalRecord2.getMenstruationPeriodDays())) != null && (numBoxInt3 = Boxing.boxInt(bBoxByte.byteValue())) != null) {
                    iIntValue = numBoxInt3.intValue();
                }
                settingVo.setEstimatedMenstrualDays(iIntValue);
                int iIntValue2 = 28;
                if (menstruationTotalRecord2 != null && (bBoxByte2 = Boxing.boxByte(menstruationTotalRecord2.getCyclePeriodDays())) != null && (numBoxInt4 = Boxing.boxInt(bBoxByte2.byteValue())) != null) {
                    iIntValue2 = numBoxInt4.intValue();
                }
                settingVo.setMenstrualCycle(iIntValue2);
                if (settingVo.getFirstTime()) {
                    settingVo.setFirstTime(false);
                    settingVo.setAppBeforeMenstruationPush(1);
                    settingVo.setAppBeforeOvulationPush(1);
                }
                if (menstruationTotalRecord2 != null) {
                    settingVo.setLastMenstrualTime(DateHelper.INSTANCE.resetHour(menstruationTotalRecord2.getLastPeriodBeginDay() * ((long) 1000)));
                }
                MenstruationDeviceConfigCallback.this.repo.setInitSetting(settingVo);
                MenstruationDeviceConfigCallback.this.writeDataToApp(menstruationTotalRecord2);
                String str = MenstruationDeviceConfigCallback.this.tag;
                final MenstruationConfig menstruationConfig = this.$config;
                HMLog.info(str, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.data.MenstruationDeviceConfigCallback.onFinish.1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "device setting change config =" + menstruationConfig + " and setting = " + settingVo + " and menstruationTotalRecord=" + menstruationTotalRecord2;
                    }
                });
            } catch (Exception e) {
                HMLog.info(MenstruationDeviceConfigCallback.this.tag, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.data.MenstruationDeviceConfigCallback.onFinish.1.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "Exception:" + e;
                    }
                });
            }
            return Unit.INSTANCE;
        }
    }

    public MenstruationDeviceConfigCallback(@NotNull SettingRepo settingRepo, @NotNull HMMiLiProDevice hMMiLiProDevice) {
        this.repo = settingRepo;
        this.device = hMMiLiProDevice;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void writeDataToApp(MenstruationTotalRecord menstruationTotalRecord) throws SyncException {
        Scope scopeOrNull = getKoin().getScopeOrNull(FemaleHealthScopeNames.FEMALE_HEALTH);
        if (scopeOrNull == null) {
            throw new SyncException("初始化女性健康出错", null, 0, 6, null);
        }
        MenstruationDataManager menstruationDataManager = (MenstruationDataManager) scopeOrNull.get(Reflection.getOrCreateKotlinClass(MenstruationDataManager.class), null, null);
        if (menstruationTotalRecord == null || !(!menstruationTotalRecord.getRecords().isEmpty())) {
            return;
        }
        menstruationDataManager.addDataFromDevice(FemaleExternalDeviceDataTransfer.INSTANCE.convertTotalDtoForApp(menstruationTotalRecord));
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMCallback
    public void onFinish(@Nullable MenstruationConfig config) {
        if (config == null) {
            return;
        }
        e.f(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new AnonymousClass1(config, null), 3, null);
    }
}
