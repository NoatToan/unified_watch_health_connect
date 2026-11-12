package com.huami.device.feature.health;

import com.huami.device.feature.health.device.HealthDevice;
import com.huami.device.feature.health.device.init.AtrialSettingInit;
import com.huami.device.feature.health.device.init.AtrialSleepNotDisturbInit;
import com.huami.device.feature.health.device.init.BaseHealthInit;
import com.huami.device.feature.health.device.init.BloodPressureInit;
import com.huami.device.feature.health.device.init.HighHrAlertInit;
import com.huami.device.feature.health.device.init.HrIntervalInit;
import com.huami.device.feature.health.device.init.HrModeInit;
import com.huami.device.feature.health.device.init.LowHrAlertInit;
import com.huami.device.feature.health.device.init.LowSpo2AlertInit;
import com.huami.device.feature.health.device.init.OsaInit;
import com.huami.device.feature.health.device.init.PressureAlertInit;
import com.huami.device.feature.health.device.init.PressureInit;
import com.huami.device.feature.health.device.init.RemInit;
import com.huami.device.feature.health.device.init.SleepingBloodPressureMonitorInit;
import com.huami.device.feature.health.device.init.SmartSpo2Init;
import com.huami.device.feature.health.device.init.SportHrInit;
import com.huami.device.feature.health.settings.AtrialSetting;
import com.huami.device.feature.health.settings.AtrialSleepNotDisturbSetting;
import com.huami.device.feature.health.settings.BloodPressureSetting;
import com.huami.device.feature.health.settings.HighHrAlertSetting;
import com.huami.device.feature.health.settings.HrIntervalSetting;
import com.huami.device.feature.health.settings.HrModeSetting;
import com.huami.device.feature.health.settings.LowHrAlertSetting;
import com.huami.device.feature.health.settings.LowSpo2AlertSetting;
import com.huami.device.feature.health.settings.OsaSetting;
import com.huami.device.feature.health.settings.PressureAlertSetting;
import com.huami.device.feature.health.settings.PressureSetting;
import com.huami.device.feature.health.settings.RemSetting;
import com.huami.device.feature.health.settings.SleepingBloodPressureMonitorSetting;
import com.huami.device.feature.health.settings.SmartSpo2Setting;
import com.huami.device.feature.health.settings.SportHrSetting;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.context.DefaultContextExtKt;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u0007\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\r"}, d2 = {"Lcom/huami/device/feature/health/HealthKoinModule;", "", "Lcom/huami/device/feature/health/device/HealthDevice;", "healthDevice", "Lorg/koin/core/module/Module;", "b", "", "a", "initHealth", "Lorg/koin/core/module/Module;", "healthModule", "<init>", "()V", "health-base_release"}, k = 1, mv = {1, 5, 1})
public final class HealthKoinModule {

    @NotNull
    public static final HealthKoinModule INSTANCE = new HealthKoinModule();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private static Module healthModule;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/device/feature/health/settings/PressureSetting;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function2<Scope, ParametersHolder, PressureSetting> {
        public final /* synthetic */ BaseHealthInit a;
        public final /* synthetic */ HealthDevice b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(BaseHealthInit baseHealthInit, HealthDevice healthDevice) {
            super(2);
            this.a = baseHealthInit;
            this.b = healthDevice;
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PressureSetting invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
            return new PressureSetting((PressureInit) this.a, this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/device/feature/health/settings/RemSetting;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function2<Scope, ParametersHolder, RemSetting> {
        public final /* synthetic */ BaseHealthInit a;
        public final /* synthetic */ HealthDevice b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(BaseHealthInit baseHealthInit, HealthDevice healthDevice) {
            super(2);
            this.a = baseHealthInit;
            this.b = healthDevice;
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RemSetting invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
            return new RemSetting((RemInit) this.a, this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/device/feature/health/settings/SmartSpo2Setting;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function2<Scope, ParametersHolder, SmartSpo2Setting> {
        public final /* synthetic */ BaseHealthInit a;
        public final /* synthetic */ HealthDevice b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(BaseHealthInit baseHealthInit, HealthDevice healthDevice) {
            super(2);
            this.a = baseHealthInit;
            this.b = healthDevice;
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SmartSpo2Setting invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
            return new SmartSpo2Setting((SmartSpo2Init) this.a, this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/device/feature/health/settings/SportHrSetting;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function2<Scope, ParametersHolder, SportHrSetting> {
        public final /* synthetic */ BaseHealthInit a;
        public final /* synthetic */ HealthDevice b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(BaseHealthInit baseHealthInit, HealthDevice healthDevice) {
            super(2);
            this.a = baseHealthInit;
            this.b = healthDevice;
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SportHrSetting invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
            return new SportHrSetting((SportHrInit) this.a, this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/device/feature/health/settings/BloodPressureSetting;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function2<Scope, ParametersHolder, BloodPressureSetting> {
        public final /* synthetic */ BaseHealthInit a;
        public final /* synthetic */ HealthDevice b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(BaseHealthInit baseHealthInit, HealthDevice healthDevice) {
            super(2);
            this.a = baseHealthInit;
            this.b = healthDevice;
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BloodPressureSetting invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
            return new BloodPressureSetting((BloodPressureInit) this.a, this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/device/feature/health/settings/SleepingBloodPressureMonitorSetting;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function2<Scope, ParametersHolder, SleepingBloodPressureMonitorSetting> {
        public final /* synthetic */ BaseHealthInit a;
        public final /* synthetic */ HealthDevice b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(BaseHealthInit baseHealthInit, HealthDevice healthDevice) {
            super(2);
            this.a = baseHealthInit;
            this.b = healthDevice;
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SleepingBloodPressureMonitorSetting invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
            return new SleepingBloodPressureMonitorSetting((SleepingBloodPressureMonitorInit) this.a, this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/device/feature/health/settings/HrModeSetting;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function2<Scope, ParametersHolder, HrModeSetting> {
        public final /* synthetic */ BaseHealthInit a;
        public final /* synthetic */ HealthDevice b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(BaseHealthInit baseHealthInit, HealthDevice healthDevice) {
            super(2);
            this.a = baseHealthInit;
            this.b = healthDevice;
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HrModeSetting invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
            return new HrModeSetting((HrModeInit) this.a, this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/device/feature/health/settings/AtrialSetting;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function2<Scope, ParametersHolder, AtrialSetting> {
        public final /* synthetic */ BaseHealthInit a;
        public final /* synthetic */ HealthDevice b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(BaseHealthInit baseHealthInit, HealthDevice healthDevice) {
            super(2);
            this.a = baseHealthInit;
            this.b = healthDevice;
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AtrialSetting invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
            return new AtrialSetting((AtrialSettingInit) this.a, this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/device/feature/health/settings/AtrialSleepNotDisturbSetting;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function2<Scope, ParametersHolder, AtrialSleepNotDisturbSetting> {
        public final /* synthetic */ BaseHealthInit a;
        public final /* synthetic */ HealthDevice b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(BaseHealthInit baseHealthInit, HealthDevice healthDevice) {
            super(2);
            this.a = baseHealthInit;
            this.b = healthDevice;
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AtrialSleepNotDisturbSetting invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
            return new AtrialSleepNotDisturbSetting((AtrialSleepNotDisturbInit) this.a, this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/device/feature/health/settings/HighHrAlertSetting;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function2<Scope, ParametersHolder, HighHrAlertSetting> {
        public final /* synthetic */ BaseHealthInit a;
        public final /* synthetic */ HealthDevice b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(BaseHealthInit baseHealthInit, HealthDevice healthDevice) {
            super(2);
            this.a = baseHealthInit;
            this.b = healthDevice;
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HighHrAlertSetting invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
            return new HighHrAlertSetting((HighHrAlertInit) this.a, this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/device/feature/health/settings/HrIntervalSetting;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function2<Scope, ParametersHolder, HrIntervalSetting> {
        public final /* synthetic */ BaseHealthInit a;
        public final /* synthetic */ HealthDevice b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(BaseHealthInit baseHealthInit, HealthDevice healthDevice) {
            super(2);
            this.a = baseHealthInit;
            this.b = healthDevice;
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HrIntervalSetting invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
            return new HrIntervalSetting((HrIntervalInit) this.a, this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/device/feature/health/settings/LowHrAlertSetting;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function2<Scope, ParametersHolder, LowHrAlertSetting> {
        public final /* synthetic */ BaseHealthInit a;
        public final /* synthetic */ HealthDevice b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(BaseHealthInit baseHealthInit, HealthDevice healthDevice) {
            super(2);
            this.a = baseHealthInit;
            this.b = healthDevice;
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LowHrAlertSetting invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
            return new LowHrAlertSetting((LowHrAlertInit) this.a, this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/device/feature/health/settings/LowSpo2AlertSetting;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function2<Scope, ParametersHolder, LowSpo2AlertSetting> {
        public final /* synthetic */ BaseHealthInit a;
        public final /* synthetic */ HealthDevice b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(BaseHealthInit baseHealthInit, HealthDevice healthDevice) {
            super(2);
            this.a = baseHealthInit;
            this.b = healthDevice;
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LowSpo2AlertSetting invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
            return new LowSpo2AlertSetting((LowSpo2AlertInit) this.a, this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/device/feature/health/settings/OsaSetting;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function2<Scope, ParametersHolder, OsaSetting> {
        public final /* synthetic */ BaseHealthInit a;
        public final /* synthetic */ HealthDevice b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(BaseHealthInit baseHealthInit, HealthDevice healthDevice) {
            super(2);
            this.a = baseHealthInit;
            this.b = healthDevice;
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OsaSetting invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
            return new OsaSetting((OsaInit) this.a, this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/device/feature/health/settings/PressureAlertSetting;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function2<Scope, ParametersHolder, PressureAlertSetting> {
        public final /* synthetic */ BaseHealthInit a;
        public final /* synthetic */ HealthDevice b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(BaseHealthInit baseHealthInit, HealthDevice healthDevice) {
            super(2);
            this.a = baseHealthInit;
            this.b = healthDevice;
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PressureAlertSetting invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
            return new PressureAlertSetting((PressureAlertInit) this.a, this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function1<Module, Unit> {
        public final /* synthetic */ HealthDevice a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/device/feature/health/device/HealthDevice;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function2<Scope, ParametersHolder, HealthDevice> {
            public final /* synthetic */ HealthDevice a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HealthDevice healthDevice) {
                super(2);
                this.a = healthDevice;
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final HealthDevice invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return this.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(HealthDevice healthDevice) {
            super(1);
            this.a = healthDevice;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Module module) {
            invoke2(module);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Module module) {
            a aVar = new a(this.a);
            Kind kind = Kind.Singleton;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            BeanDefinition beanDefinition = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(HealthDevice.class), null, aVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, singleInstanceFactory, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory);
            }
            new Pair(module, singleInstanceFactory);
            HealthKoinModule.INSTANCE.a(module, this.a);
        }
    }

    private HealthKoinModule() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Module module, HealthDevice healthDevice) {
        for (BaseHealthInit baseHealthInit : healthDevice.getHealthList()) {
            if (baseHealthInit instanceof HrModeInit) {
                g gVar = new g(baseHealthInit, healthDevice);
                Kind kind = Kind.Singleton;
                ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
                BeanDefinition beanDefinition = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(HrModeSetting.class), null, gVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, companion.getRootScopeQualifier());
                SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition);
                Module.saveMapping$default(module, strIndexKey, singleInstanceFactory, false, 4, null);
                if (module.getCreatedAtStart()) {
                    module.getEagerInstances().add(singleInstanceFactory);
                }
                new Pair(module, singleInstanceFactory);
            } else if (baseHealthInit instanceof AtrialSettingInit) {
                h hVar = new h(baseHealthInit, healthDevice);
                Kind kind2 = Kind.Singleton;
                ScopeRegistry.Companion companion2 = ScopeRegistry.INSTANCE;
                BeanDefinition beanDefinition2 = new BeanDefinition(companion2.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AtrialSetting.class), null, hVar, kind2, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, companion2.getRootScopeQualifier());
                SingleInstanceFactory<?> singleInstanceFactory2 = new SingleInstanceFactory<>(beanDefinition2);
                Module.saveMapping$default(module, strIndexKey2, singleInstanceFactory2, false, 4, null);
                if (module.getCreatedAtStart()) {
                    module.getEagerInstances().add(singleInstanceFactory2);
                }
                new Pair(module, singleInstanceFactory2);
            } else if (baseHealthInit instanceof AtrialSleepNotDisturbInit) {
                i iVar = new i(baseHealthInit, healthDevice);
                Kind kind3 = Kind.Singleton;
                ScopeRegistry.Companion companion3 = ScopeRegistry.INSTANCE;
                BeanDefinition beanDefinition3 = new BeanDefinition(companion3.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AtrialSleepNotDisturbSetting.class), null, iVar, kind3, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, companion3.getRootScopeQualifier());
                SingleInstanceFactory<?> singleInstanceFactory3 = new SingleInstanceFactory<>(beanDefinition3);
                Module.saveMapping$default(module, strIndexKey3, singleInstanceFactory3, false, 4, null);
                if (module.getCreatedAtStart()) {
                    module.getEagerInstances().add(singleInstanceFactory3);
                }
                new Pair(module, singleInstanceFactory3);
            } else if (baseHealthInit instanceof HighHrAlertInit) {
                j jVar = new j(baseHealthInit, healthDevice);
                Kind kind4 = Kind.Singleton;
                ScopeRegistry.Companion companion4 = ScopeRegistry.INSTANCE;
                BeanDefinition beanDefinition4 = new BeanDefinition(companion4.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(HighHrAlertSetting.class), null, jVar, kind4, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, companion4.getRootScopeQualifier());
                SingleInstanceFactory<?> singleInstanceFactory4 = new SingleInstanceFactory<>(beanDefinition4);
                Module.saveMapping$default(module, strIndexKey4, singleInstanceFactory4, false, 4, null);
                if (module.getCreatedAtStart()) {
                    module.getEagerInstances().add(singleInstanceFactory4);
                }
                new Pair(module, singleInstanceFactory4);
            } else if (baseHealthInit instanceof HrIntervalInit) {
                k kVar = new k(baseHealthInit, healthDevice);
                Kind kind5 = Kind.Singleton;
                ScopeRegistry.Companion companion5 = ScopeRegistry.INSTANCE;
                BeanDefinition beanDefinition5 = new BeanDefinition(companion5.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(HrIntervalSetting.class), null, kVar, kind5, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey5 = BeanDefinitionKt.indexKey(beanDefinition5.getPrimaryType(), null, companion5.getRootScopeQualifier());
                SingleInstanceFactory<?> singleInstanceFactory5 = new SingleInstanceFactory<>(beanDefinition5);
                Module.saveMapping$default(module, strIndexKey5, singleInstanceFactory5, false, 4, null);
                if (module.getCreatedAtStart()) {
                    module.getEagerInstances().add(singleInstanceFactory5);
                }
                new Pair(module, singleInstanceFactory5);
            } else if (baseHealthInit instanceof LowHrAlertInit) {
                l lVar = new l(baseHealthInit, healthDevice);
                Kind kind6 = Kind.Singleton;
                ScopeRegistry.Companion companion6 = ScopeRegistry.INSTANCE;
                BeanDefinition beanDefinition6 = new BeanDefinition(companion6.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(LowHrAlertSetting.class), null, lVar, kind6, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey6 = BeanDefinitionKt.indexKey(beanDefinition6.getPrimaryType(), null, companion6.getRootScopeQualifier());
                SingleInstanceFactory<?> singleInstanceFactory6 = new SingleInstanceFactory<>(beanDefinition6);
                Module.saveMapping$default(module, strIndexKey6, singleInstanceFactory6, false, 4, null);
                if (module.getCreatedAtStart()) {
                    module.getEagerInstances().add(singleInstanceFactory6);
                }
                new Pair(module, singleInstanceFactory6);
            } else if (baseHealthInit instanceof LowSpo2AlertInit) {
                m mVar = new m(baseHealthInit, healthDevice);
                Kind kind7 = Kind.Singleton;
                ScopeRegistry.Companion companion7 = ScopeRegistry.INSTANCE;
                BeanDefinition beanDefinition7 = new BeanDefinition(companion7.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(LowSpo2AlertSetting.class), null, mVar, kind7, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey7 = BeanDefinitionKt.indexKey(beanDefinition7.getPrimaryType(), null, companion7.getRootScopeQualifier());
                SingleInstanceFactory<?> singleInstanceFactory7 = new SingleInstanceFactory<>(beanDefinition7);
                Module.saveMapping$default(module, strIndexKey7, singleInstanceFactory7, false, 4, null);
                if (module.getCreatedAtStart()) {
                    module.getEagerInstances().add(singleInstanceFactory7);
                }
                new Pair(module, singleInstanceFactory7);
            } else if (baseHealthInit instanceof OsaInit) {
                n nVar = new n(baseHealthInit, healthDevice);
                Kind kind8 = Kind.Singleton;
                ScopeRegistry.Companion companion8 = ScopeRegistry.INSTANCE;
                BeanDefinition beanDefinition8 = new BeanDefinition(companion8.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(OsaSetting.class), null, nVar, kind8, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey8 = BeanDefinitionKt.indexKey(beanDefinition8.getPrimaryType(), null, companion8.getRootScopeQualifier());
                SingleInstanceFactory<?> singleInstanceFactory8 = new SingleInstanceFactory<>(beanDefinition8);
                Module.saveMapping$default(module, strIndexKey8, singleInstanceFactory8, false, 4, null);
                if (module.getCreatedAtStart()) {
                    module.getEagerInstances().add(singleInstanceFactory8);
                }
                new Pair(module, singleInstanceFactory8);
            } else if (baseHealthInit instanceof PressureAlertInit) {
                o oVar = new o(baseHealthInit, healthDevice);
                Kind kind9 = Kind.Singleton;
                ScopeRegistry.Companion companion9 = ScopeRegistry.INSTANCE;
                BeanDefinition beanDefinition9 = new BeanDefinition(companion9.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(PressureAlertSetting.class), null, oVar, kind9, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey9 = BeanDefinitionKt.indexKey(beanDefinition9.getPrimaryType(), null, companion9.getRootScopeQualifier());
                SingleInstanceFactory<?> singleInstanceFactory9 = new SingleInstanceFactory<>(beanDefinition9);
                Module.saveMapping$default(module, strIndexKey9, singleInstanceFactory9, false, 4, null);
                if (module.getCreatedAtStart()) {
                    module.getEagerInstances().add(singleInstanceFactory9);
                }
                new Pair(module, singleInstanceFactory9);
            } else if (baseHealthInit instanceof PressureInit) {
                a aVar = new a(baseHealthInit, healthDevice);
                Kind kind10 = Kind.Singleton;
                ScopeRegistry.Companion companion10 = ScopeRegistry.INSTANCE;
                BeanDefinition beanDefinition10 = new BeanDefinition(companion10.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(PressureSetting.class), null, aVar, kind10, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey10 = BeanDefinitionKt.indexKey(beanDefinition10.getPrimaryType(), null, companion10.getRootScopeQualifier());
                SingleInstanceFactory<?> singleInstanceFactory10 = new SingleInstanceFactory<>(beanDefinition10);
                Module.saveMapping$default(module, strIndexKey10, singleInstanceFactory10, false, 4, null);
                if (module.getCreatedAtStart()) {
                    module.getEagerInstances().add(singleInstanceFactory10);
                }
                new Pair(module, singleInstanceFactory10);
            } else if (baseHealthInit instanceof RemInit) {
                b bVar = new b(baseHealthInit, healthDevice);
                Kind kind11 = Kind.Singleton;
                ScopeRegistry.Companion companion11 = ScopeRegistry.INSTANCE;
                BeanDefinition beanDefinition11 = new BeanDefinition(companion11.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(RemSetting.class), null, bVar, kind11, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey11 = BeanDefinitionKt.indexKey(beanDefinition11.getPrimaryType(), null, companion11.getRootScopeQualifier());
                SingleInstanceFactory<?> singleInstanceFactory11 = new SingleInstanceFactory<>(beanDefinition11);
                Module.saveMapping$default(module, strIndexKey11, singleInstanceFactory11, false, 4, null);
                if (module.getCreatedAtStart()) {
                    module.getEagerInstances().add(singleInstanceFactory11);
                }
                new Pair(module, singleInstanceFactory11);
            } else if (baseHealthInit instanceof SmartSpo2Init) {
                c cVar = new c(baseHealthInit, healthDevice);
                Kind kind12 = Kind.Singleton;
                ScopeRegistry.Companion companion12 = ScopeRegistry.INSTANCE;
                BeanDefinition beanDefinition12 = new BeanDefinition(companion12.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(SmartSpo2Setting.class), null, cVar, kind12, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey12 = BeanDefinitionKt.indexKey(beanDefinition12.getPrimaryType(), null, companion12.getRootScopeQualifier());
                SingleInstanceFactory<?> singleInstanceFactory12 = new SingleInstanceFactory<>(beanDefinition12);
                Module.saveMapping$default(module, strIndexKey12, singleInstanceFactory12, false, 4, null);
                if (module.getCreatedAtStart()) {
                    module.getEagerInstances().add(singleInstanceFactory12);
                }
                new Pair(module, singleInstanceFactory12);
            } else if (baseHealthInit instanceof SportHrInit) {
                d dVar = new d(baseHealthInit, healthDevice);
                Kind kind13 = Kind.Singleton;
                ScopeRegistry.Companion companion13 = ScopeRegistry.INSTANCE;
                BeanDefinition beanDefinition13 = new BeanDefinition(companion13.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(SportHrSetting.class), null, dVar, kind13, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey13 = BeanDefinitionKt.indexKey(beanDefinition13.getPrimaryType(), null, companion13.getRootScopeQualifier());
                SingleInstanceFactory<?> singleInstanceFactory13 = new SingleInstanceFactory<>(beanDefinition13);
                Module.saveMapping$default(module, strIndexKey13, singleInstanceFactory13, false, 4, null);
                if (module.getCreatedAtStart()) {
                    module.getEagerInstances().add(singleInstanceFactory13);
                }
                new Pair(module, singleInstanceFactory13);
            } else if (baseHealthInit instanceof BloodPressureInit) {
                e eVar = new e(baseHealthInit, healthDevice);
                Kind kind14 = Kind.Singleton;
                ScopeRegistry.Companion companion14 = ScopeRegistry.INSTANCE;
                BeanDefinition beanDefinition14 = new BeanDefinition(companion14.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(BloodPressureSetting.class), null, eVar, kind14, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey14 = BeanDefinitionKt.indexKey(beanDefinition14.getPrimaryType(), null, companion14.getRootScopeQualifier());
                SingleInstanceFactory<?> singleInstanceFactory14 = new SingleInstanceFactory<>(beanDefinition14);
                Module.saveMapping$default(module, strIndexKey14, singleInstanceFactory14, false, 4, null);
                if (module.getCreatedAtStart()) {
                    module.getEagerInstances().add(singleInstanceFactory14);
                }
                new Pair(module, singleInstanceFactory14);
            } else if (baseHealthInit instanceof SleepingBloodPressureMonitorInit) {
                f fVar = new f(baseHealthInit, healthDevice);
                Kind kind15 = Kind.Singleton;
                ScopeRegistry.Companion companion15 = ScopeRegistry.INSTANCE;
                BeanDefinition beanDefinition15 = new BeanDefinition(companion15.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(SleepingBloodPressureMonitorSetting.class), null, fVar, kind15, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey15 = BeanDefinitionKt.indexKey(beanDefinition15.getPrimaryType(), null, companion15.getRootScopeQualifier());
                SingleInstanceFactory<?> singleInstanceFactory15 = new SingleInstanceFactory<>(beanDefinition15);
                Module.saveMapping$default(module, strIndexKey15, singleInstanceFactory15, false, 4, null);
                if (module.getCreatedAtStart()) {
                    module.getEagerInstances().add(singleInstanceFactory15);
                }
                new Pair(module, singleInstanceFactory15);
            }
        }
    }

    private final Module b(HealthDevice healthDevice) {
        return ModuleKt.module$default(false, new p(healthDevice), 1, null);
    }

    public final void initHealth(@NotNull HealthDevice healthDevice) {
        Module module = healthModule;
        if (module != null) {
            DefaultContextExtKt.unloadKoinModules(module);
            healthModule = null;
        }
        Module moduleB = b(healthDevice);
        DefaultContextExtKt.loadKoinModules(moduleB);
        healthModule = moduleB;
    }
}
