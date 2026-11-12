package com.xiaomi.hm.health.di.koin.spo2;

import android.content.Context;
import com.huami.account.HMLoginManager;
import com.huami.bloodoxygen.bluetooth.sync.Spo2DeviceApi;
import com.huami.bloodoxygen.core.koin.BloodOxygenConfig;
import com.huami.bloodoxygen.service.Spo2Service;
import com.huami.bloodoxygen.ui.usecase.JumpToDetectSettingUseCase;
import com.huami.bloodoxygen.zepp.koin.ZeppBloodOxygenModuleKt;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.koinstartup.KoinAdapterKt;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.datautil.HMDateUtil;
import com.xiaomi.hm.health.healthdata.utils.HealthDataNavigator;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.module.Module;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0019\u0010\u0005\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0013\u0010\t\u001a\u00020\u00068F@\u0006¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getSpo2Module", "()Lorg/koin/core/module/Module;", "spo2Module", "Lcom/huami/bloodoxygen/service/Spo2Service;", "getSpo2Service", "()Lcom/huami/bloodoxygen/service/Spo2Service;", "spo2Service", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class Spo2ModuleKt {

    @NotNull
    private static final Module a = ZeppBloodOxygenModuleKt.getZeppBloodOxygenModule(a.a, b.a, new Function0<JumpToDetectSettingUseCase>() { // from class: com.xiaomi.hm.health.di.koin.spo2.Spo2ModuleKt$spo2Module$3
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JumpToDetectSettingUseCase getA() {
            return new JumpToDetectSettingUseCase() { // from class: com.xiaomi.hm.health.di.koin.spo2.Spo2ModuleKt$spo2Module$3.1
                @Override // com.huami.bloodoxygen.ui.usecase.JumpToDetectSettingUseCase
                public void execute(@NotNull Context context) {
                    HealthDataNavigator.INSTANCE.navigateToDetectSetting(context);
                }
            };
        }
    });

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bloodoxygen/bluetooth/sync/Spo2DeviceApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Spo2DeviceApi> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Spo2DeviceApi getA() {
            return new RealSpo2DeviceApiImpl();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bloodoxygen/core/koin/BloodOxygenConfig;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<BloodOxygenConfig> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BloodOxygenConfig getA() {
            String huamiId = HMLoginManager.getHuamiId();
            if (huamiId == null) {
                huamiId = EcgData.DEFAULT_DIGIT_VALUE;
            }
            return new BloodOxygenConfig(huamiId, "com.huami.midong", GlobalConfig.get().isBuildInner(), new SleepQuery(), new Date(HMDateUtil.getCreateTime().longValue()), null, false, 96, null);
        }
    }

    @NotNull
    public static final Module getSpo2Module() {
        return a;
    }

    @NotNull
    public static final Spo2Service getSpo2Service() {
        return (Spo2Service) KoinAdapterKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(Spo2Service.class), null, null);
    }
}
