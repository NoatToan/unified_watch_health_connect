package com.xiaomi.hm.health.mainpage;

import com.huami.bluetooth.profile.channel.module.MenstruationModule;
import com.huami.femalehealth.logiclib.helper.FemaleHealthScopeNames;
import com.huami.femalehealth.logiclib.repo.MenstruationRepo;
import com.huami.femalehealth.logiclib.repo.SettingRepo;
import com.huami.healthlabel.koin.ScopesAndQualifersKt;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstrualNotifiedData;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.feature.sync.job.mili.data.MenstruationDeviceConfigCallback;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.scope.Scope;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0003\u001a\u00020\u0002R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/mainpage/FemaleListener;", "", "", "setListener", "Lkotlin/Lazy;", "Lcom/huami/femalehealth/logiclib/repo/MenstruationRepo;", "a", "Lkotlin/Lazy;", "menstruationRepo", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class FemaleListener {

    @NotNull
    public static final FemaleListener INSTANCE = new FemaleListener();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final Lazy<MenstruationRepo> menstruationRepo = KoinJavaComponent.inject$default(MenstruationRepo.class, null, null, 6, null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {
        public final /* synthetic */ HMMiLiProDevice a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HMMiLiProDevice hMMiLiProDevice) {
            super(0);
            this.a = hMMiLiProDevice;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Scope scopeOrNull = ScopesAndQualifersKt.getKoin().getScopeOrNull(FemaleHealthScopeNames.FEMALE_HEALTH);
            if (scopeOrNull == null || this.a == null) {
                return;
            }
            this.a.getMenstruationConfig(new MenstruationDeviceConfigCallback((SettingRepo) scopeOrNull.get(Reflection.getOrCreateKotlinClass(SettingRepo.class), null, null), this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstrualNotifiedData;", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<MenstrualNotifiedData, Unit> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        public final void a(MenstrualNotifiedData menstrualNotifiedData) {
            ((MenstruationRepo) FemaleListener.menstruationRepo.getValue()).setInitSetting(menstrualNotifiedData.getPeriodContinueTime(), menstrualNotifiedData.getPeriodCycle(), menstrualNotifiedData.getLastPeriodStartTime(), menstrualNotifiedData.getSmartSwitch());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MenstrualNotifiedData menstrualNotifiedData) {
            a(menstrualNotifiedData);
            return Unit.INSTANCE;
        }
    }

    private FemaleListener() {
    }

    public final void setListener() {
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
        HMMiLiProDevice hMMiLiProDevice = device instanceof HMMiLiProDevice ? (HMMiLiProDevice) device : null;
        MenstruationModule menstruationModule = hMMiLiProDevice != null ? (MenstruationModule) hMMiLiProDevice.getChannelModule(MenstruationModule.class) : null;
        if (menstruationModule != null) {
            menstruationModule.setDataChangeListener(new a(hMMiLiProDevice));
        }
        if (hMMiLiProDevice == null) {
            return;
        }
        hMMiLiProDevice.setMenstrualNotifiedDataListener(b.a);
    }
}
