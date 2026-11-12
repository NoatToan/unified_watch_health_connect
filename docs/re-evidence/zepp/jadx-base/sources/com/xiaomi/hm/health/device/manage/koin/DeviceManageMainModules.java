package com.xiaomi.hm.health.device.manage.koin;

import android.app.Activity;
import com.huami.devicex.injection.basic.MessageCenterApi;
import com.xiaomi.hm.health.bodyfat.device.IWeightDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.assistant.schedule.web.ScheduleWebApi;
import com.xiaomi.hm.health.device.assistant.schedule.web.ScheduleWebApiImpl;
import com.xiaomi.hm.health.device.introduce.recocver.IRecoverManager;
import com.xiaomi.hm.health.device.introduce.recocver.RestoreTask;
import com.xiaomi.hm.health.device.recover.RecoverManager;
import com.xiaomi.hm.health.device.service.FindPhoneDecorator;
import com.xiaomi.hm.health.device.service.FindPhoneNotification;
import com.xiaomi.hm.health.device.setting.FreeTaskImpl;
import com.xiaomi.hm.health.device.setting.inject.IDeviceFeatureDepends;
import com.xiaomi.hm.health.device.setting.life.feature.MusicControllerSetter;
import com.xiaomi.hm.health.device.setting.life.feature.bloodpressure.IHealthPlanQuery;
import com.xiaomi.hm.health.device.setting.life.feature.inject.AlarmApi;
import com.xiaomi.hm.health.device.setting.life.feature.inject.FindPhoneApi;
import com.xiaomi.hm.health.device.setting.life.feature.inject.FreeTaskApi;
import com.xiaomi.hm.health.device.setting.life.feature.inject.IFindPhoneNotification;
import com.xiaomi.hm.health.device.setting.life.feature.inject.JsAppApi;
import com.xiaomi.hm.health.device.setting.life.feature.inject.MediaUtilApi;
import com.xiaomi.hm.health.device.setting.life.feature.inject.RestoreApi;
import com.xiaomi.hm.health.device.setting.network.repo.IPropertyUtil;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.repo.IWatchSettingRepo;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.repo.WatchSettingRepo;
import com.xiaomi.hm.health.device.setting.viewmodel.SoftFeatureCache;
import com.xiaomi.hm.health.device.setting.viewmodel.SoftFeatureCacheImpl;
import com.xiaomi.hm.health.device.weather.viewmodel.SearchCityViewModel;
import com.xiaomi.hm.health.device.weather.viewmodel.WeatherViewModel;
import com.xiaomi.hm.health.device.weight.WeightDevice;
import com.xiaomi.hm.health.devicex.inject.DeviceFeatureDependsImpl;
import com.xiaomi.hm.health.devicex.inject.JsAppApiImpl;
import com.xiaomi.hm.health.devicex.inject.MessageCenterApiImpl;
import com.xiaomi.hm.health.healthdata.bp.HealthPlanQuery;
import com.xiaomi.hm.health.ui.smartplay.RestoreImpl;
import com.xiaomi.hm.health.ui.smartplay.alarm.AlarmApiImpl;
import com.xiaomi.hm.health.ui.smartplay.meidacontrol.MediaUtilApiImpl;
import com.xiaomi.hm.health.utils.PropertyImpl;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleKt;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/device/manage/koin/DeviceManageMainModules;", "", "Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getModules", "()Lorg/koin/core/module/Module;", "modules", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class DeviceManageMainModules {

    @NotNull
    public static final DeviceManageMainModules INSTANCE = new DeviceManageMainModules();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final Module modules = ModuleKt.module(false, a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Module, Unit> {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.manage.koin.DeviceManageMainModules$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/setting/viewmodel/SoftFeatureCache;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0832a extends Lambda implements Function2<Scope, ParametersHolder, SoftFeatureCache> {
            public static final C0832a a = new C0832a();

            public C0832a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SoftFeatureCache invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SoftFeatureCacheImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/setting/life/feature/inject/FreeTaskApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function2<Scope, ParametersHolder, FreeTaskApi> {
            public static final b a = new b();

            public b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final FreeTaskApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new FreeTaskImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/setting/life/feature/inject/RestoreApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function2<Scope, ParametersHolder, RestoreApi> {
            public static final c a = new c();

            public c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final RestoreApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new RestoreImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/setting/life/feature/inject/FindPhoneApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function2<Scope, ParametersHolder, FindPhoneApi> {
            public static final d a = new d();

            public d() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final FindPhoneApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new FindPhoneDecorator();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/setting/life/feature/inject/IFindPhoneNotification;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function2<Scope, ParametersHolder, IFindPhoneNotification> {
            public static final e a = new e();

            public e() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IFindPhoneNotification invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new FindPhoneNotification();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/bodyfat/device/IWeightDevice;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class f extends Lambda implements Function2<Scope, ParametersHolder, IWeightDevice> {
            public static final f a = new f();

            public f() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IWeightDevice invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new WeightDevice();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/setting/life/feature/MusicControllerSetter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class g extends Lambda implements Function2<Scope, ParametersHolder, MusicControllerSetter> {
            public static final g a = new g();

            public g() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final MusicControllerSetter invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new MusicControllerSetter();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/setting/network/repo/IPropertyUtil;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class h extends Lambda implements Function2<Scope, ParametersHolder, IPropertyUtil> {
            public static final h a = new h();

            public h() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IPropertyUtil invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new PropertyImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/setting/life/feature/bloodpressure/IHealthPlanQuery;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class i extends Lambda implements Function2<Scope, ParametersHolder, IHealthPlanQuery> {
            public static final i a = new i();

            public i() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IHealthPlanQuery invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new HealthPlanQuery();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/introduce/recocver/IRecoverManager;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class j extends Lambda implements Function2<Scope, ParametersHolder, IRecoverManager> {
            public static final j a = new j();

            public j() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IRecoverManager invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new RecoverManager();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/repo/IWatchSettingRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class k extends Lambda implements Function2<Scope, ParametersHolder, IWatchSettingRepo> {
            public static final k a = new k();

            public k() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IWatchSettingRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new WatchSettingRepo();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/devicex/injection/basic/MessageCenterApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class l extends Lambda implements Function2<Scope, ParametersHolder, MessageCenterApi> {
            public static final l a = new l();

            public l() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final MessageCenterApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new MessageCenterApiImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/weather/viewmodel/WeatherViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class m extends Lambda implements Function2<Scope, ParametersHolder, WeatherViewModel> {
            public static final m a = new m();

            public m() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final WeatherViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new WeatherViewModel();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/weather/viewmodel/SearchCityViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class n extends Lambda implements Function2<Scope, ParametersHolder, SearchCityViewModel> {
            public static final n a = new n();

            public n() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SearchCityViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SearchCityViewModel();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "<name for destructuring parameter 0>", "Lcom/xiaomi/hm/health/device/introduce/recocver/RestoreTask;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class o extends Lambda implements Function2<Scope, ParametersHolder, RestoreTask> {
            public static final o a = new o();

            public o() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final RestoreTask invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new RestoreTask((HMDeviceSource) parametersHolder.elementAt(0, Reflection.getOrCreateKotlinClass(HMDeviceSource.class)), (List) parametersHolder.elementAt(1, Reflection.getOrCreateKotlinClass(List.class)), (Activity) parametersHolder.elementAt(2, Reflection.getOrCreateKotlinClass(Activity.class)));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/setting/inject/IDeviceFeatureDepends;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class p extends Lambda implements Function2<Scope, ParametersHolder, IDeviceFeatureDepends> {
            public static final p a = new p();

            public p() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IDeviceFeatureDepends invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new DeviceFeatureDependsImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/setting/life/feature/inject/AlarmApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class q extends Lambda implements Function2<Scope, ParametersHolder, AlarmApi> {
            public static final q a = new q();

            public q() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AlarmApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new AlarmApiImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/setting/life/feature/inject/MediaUtilApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class r extends Lambda implements Function2<Scope, ParametersHolder, MediaUtilApi> {
            public static final r a = new r();

            public r() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final MediaUtilApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new MediaUtilApiImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/setting/life/feature/inject/JsAppApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class s extends Lambda implements Function2<Scope, ParametersHolder, JsAppApi> {
            public static final s a = new s();

            public s() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final JsAppApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new JsAppApiImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/assistant/schedule/web/ScheduleWebApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class t extends Lambda implements Function2<Scope, ParametersHolder, ScheduleWebApi> {
            public static final t a = new t();

            public t() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ScheduleWebApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new ScheduleWebApiImpl();
            }
        }

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Module module) {
            invoke2(module);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Module module) {
            k kVar = k.a;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Factory;
            BeanDefinition beanDefinition = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(IWatchSettingRepo.class), null, kVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, rootScopeQualifier);
            FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, factoryInstanceFactory, false, 4, null);
            new Pair(module, factoryInstanceFactory);
            m mVar = m.a;
            StringQualifier rootScopeQualifier2 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition2 = new BeanDefinition(rootScopeQualifier2, Reflection.getOrCreateKotlinClass(WeatherViewModel.class), null, mVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, rootScopeQualifier2);
            FactoryInstanceFactory factoryInstanceFactory2 = new FactoryInstanceFactory(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, factoryInstanceFactory2, false, 4, null);
            new Pair(module, factoryInstanceFactory2);
            n nVar = n.a;
            StringQualifier rootScopeQualifier3 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition3 = new BeanDefinition(rootScopeQualifier3, Reflection.getOrCreateKotlinClass(SearchCityViewModel.class), null, nVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, rootScopeQualifier3);
            FactoryInstanceFactory factoryInstanceFactory3 = new FactoryInstanceFactory(beanDefinition3);
            Module.saveMapping$default(module, strIndexKey3, factoryInstanceFactory3, false, 4, null);
            new Pair(module, factoryInstanceFactory3);
            o oVar = o.a;
            StringQualifier rootScopeQualifier4 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition4 = new BeanDefinition(rootScopeQualifier4, Reflection.getOrCreateKotlinClass(RestoreTask.class), null, oVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, rootScopeQualifier4);
            FactoryInstanceFactory factoryInstanceFactory4 = new FactoryInstanceFactory(beanDefinition4);
            Module.saveMapping$default(module, strIndexKey4, factoryInstanceFactory4, false, 4, null);
            new Pair(module, factoryInstanceFactory4);
            p pVar = p.a;
            StringQualifier rootScopeQualifier5 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition5 = new BeanDefinition(rootScopeQualifier5, Reflection.getOrCreateKotlinClass(IDeviceFeatureDepends.class), null, pVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey5 = BeanDefinitionKt.indexKey(beanDefinition5.getPrimaryType(), null, rootScopeQualifier5);
            FactoryInstanceFactory factoryInstanceFactory5 = new FactoryInstanceFactory(beanDefinition5);
            Module.saveMapping$default(module, strIndexKey5, factoryInstanceFactory5, false, 4, null);
            new Pair(module, factoryInstanceFactory5);
            q qVar = q.a;
            StringQualifier rootScopeQualifier6 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition6 = new BeanDefinition(rootScopeQualifier6, Reflection.getOrCreateKotlinClass(AlarmApi.class), null, qVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey6 = BeanDefinitionKt.indexKey(beanDefinition6.getPrimaryType(), null, rootScopeQualifier6);
            FactoryInstanceFactory factoryInstanceFactory6 = new FactoryInstanceFactory(beanDefinition6);
            Module.saveMapping$default(module, strIndexKey6, factoryInstanceFactory6, false, 4, null);
            new Pair(module, factoryInstanceFactory6);
            r rVar = r.a;
            StringQualifier rootScopeQualifier7 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition7 = new BeanDefinition(rootScopeQualifier7, Reflection.getOrCreateKotlinClass(MediaUtilApi.class), null, rVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey7 = BeanDefinitionKt.indexKey(beanDefinition7.getPrimaryType(), null, rootScopeQualifier7);
            FactoryInstanceFactory factoryInstanceFactory7 = new FactoryInstanceFactory(beanDefinition7);
            Module.saveMapping$default(module, strIndexKey7, factoryInstanceFactory7, false, 4, null);
            new Pair(module, factoryInstanceFactory7);
            s sVar = s.a;
            StringQualifier rootScopeQualifier8 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition8 = new BeanDefinition(rootScopeQualifier8, Reflection.getOrCreateKotlinClass(JsAppApi.class), null, sVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey8 = BeanDefinitionKt.indexKey(beanDefinition8.getPrimaryType(), null, rootScopeQualifier8);
            FactoryInstanceFactory factoryInstanceFactory8 = new FactoryInstanceFactory(beanDefinition8);
            Module.saveMapping$default(module, strIndexKey8, factoryInstanceFactory8, false, 4, null);
            new Pair(module, factoryInstanceFactory8);
            t tVar = t.a;
            StringQualifier rootScopeQualifier9 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition9 = new BeanDefinition(rootScopeQualifier9, Reflection.getOrCreateKotlinClass(ScheduleWebApi.class), null, tVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey9 = BeanDefinitionKt.indexKey(beanDefinition9.getPrimaryType(), null, rootScopeQualifier9);
            FactoryInstanceFactory factoryInstanceFactory9 = new FactoryInstanceFactory(beanDefinition9);
            Module.saveMapping$default(module, strIndexKey9, factoryInstanceFactory9, false, 4, null);
            new Pair(module, factoryInstanceFactory9);
            C0832a c0832a = C0832a.a;
            StringQualifier rootScopeQualifier10 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition10 = new BeanDefinition(rootScopeQualifier10, Reflection.getOrCreateKotlinClass(SoftFeatureCache.class), null, c0832a, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey10 = BeanDefinitionKt.indexKey(beanDefinition10.getPrimaryType(), null, rootScopeQualifier10);
            FactoryInstanceFactory factoryInstanceFactory10 = new FactoryInstanceFactory(beanDefinition10);
            Module.saveMapping$default(module, strIndexKey10, factoryInstanceFactory10, false, 4, null);
            new Pair(module, factoryInstanceFactory10);
            b bVar = b.a;
            StringQualifier rootScopeQualifier11 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition11 = new BeanDefinition(rootScopeQualifier11, Reflection.getOrCreateKotlinClass(FreeTaskApi.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey11 = BeanDefinitionKt.indexKey(beanDefinition11.getPrimaryType(), null, rootScopeQualifier11);
            FactoryInstanceFactory factoryInstanceFactory11 = new FactoryInstanceFactory(beanDefinition11);
            Module.saveMapping$default(module, strIndexKey11, factoryInstanceFactory11, false, 4, null);
            new Pair(module, factoryInstanceFactory11);
            c cVar = c.a;
            StringQualifier rootScopeQualifier12 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition12 = new BeanDefinition(rootScopeQualifier12, Reflection.getOrCreateKotlinClass(RestoreApi.class), null, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey12 = BeanDefinitionKt.indexKey(beanDefinition12.getPrimaryType(), null, rootScopeQualifier12);
            FactoryInstanceFactory factoryInstanceFactory12 = new FactoryInstanceFactory(beanDefinition12);
            Module.saveMapping$default(module, strIndexKey12, factoryInstanceFactory12, false, 4, null);
            new Pair(module, factoryInstanceFactory12);
            d dVar = d.a;
            Kind kind2 = Kind.Singleton;
            BeanDefinition beanDefinition13 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(FindPhoneApi.class), null, dVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey13 = BeanDefinitionKt.indexKey(beanDefinition13.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition13);
            Module.saveMapping$default(module, strIndexKey13, singleInstanceFactory, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory);
            }
            new Pair(module, singleInstanceFactory);
            e eVar = e.a;
            BeanDefinition beanDefinition14 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(IFindPhoneNotification.class), null, eVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey14 = BeanDefinitionKt.indexKey(beanDefinition14.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory2 = new SingleInstanceFactory<>(beanDefinition14);
            Module.saveMapping$default(module, strIndexKey14, singleInstanceFactory2, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory2);
            }
            new Pair(module, singleInstanceFactory2);
            f fVar = f.a;
            StringQualifier rootScopeQualifier13 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition15 = new BeanDefinition(rootScopeQualifier13, Reflection.getOrCreateKotlinClass(IWeightDevice.class), null, fVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey15 = BeanDefinitionKt.indexKey(beanDefinition15.getPrimaryType(), null, rootScopeQualifier13);
            FactoryInstanceFactory factoryInstanceFactory13 = new FactoryInstanceFactory(beanDefinition15);
            Module.saveMapping$default(module, strIndexKey15, factoryInstanceFactory13, false, 4, null);
            new Pair(module, factoryInstanceFactory13);
            g gVar = g.a;
            BeanDefinition beanDefinition16 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(MusicControllerSetter.class), null, gVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey16 = BeanDefinitionKt.indexKey(beanDefinition16.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory3 = new SingleInstanceFactory<>(beanDefinition16);
            Module.saveMapping$default(module, strIndexKey16, singleInstanceFactory3, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory3);
            }
            new Pair(module, singleInstanceFactory3);
            h hVar = h.a;
            StringQualifier rootScopeQualifier14 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition17 = new BeanDefinition(rootScopeQualifier14, Reflection.getOrCreateKotlinClass(IPropertyUtil.class), null, hVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey17 = BeanDefinitionKt.indexKey(beanDefinition17.getPrimaryType(), null, rootScopeQualifier14);
            FactoryInstanceFactory factoryInstanceFactory14 = new FactoryInstanceFactory(beanDefinition17);
            Module.saveMapping$default(module, strIndexKey17, factoryInstanceFactory14, false, 4, null);
            new Pair(module, factoryInstanceFactory14);
            i iVar = i.a;
            StringQualifier rootScopeQualifier15 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition18 = new BeanDefinition(rootScopeQualifier15, Reflection.getOrCreateKotlinClass(IHealthPlanQuery.class), null, iVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey18 = BeanDefinitionKt.indexKey(beanDefinition18.getPrimaryType(), null, rootScopeQualifier15);
            FactoryInstanceFactory factoryInstanceFactory15 = new FactoryInstanceFactory(beanDefinition18);
            Module.saveMapping$default(module, strIndexKey18, factoryInstanceFactory15, false, 4, null);
            new Pair(module, factoryInstanceFactory15);
            j jVar = j.a;
            StringQualifier rootScopeQualifier16 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition19 = new BeanDefinition(rootScopeQualifier16, Reflection.getOrCreateKotlinClass(IRecoverManager.class), null, jVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey19 = BeanDefinitionKt.indexKey(beanDefinition19.getPrimaryType(), null, rootScopeQualifier16);
            FactoryInstanceFactory factoryInstanceFactory16 = new FactoryInstanceFactory(beanDefinition19);
            Module.saveMapping$default(module, strIndexKey19, factoryInstanceFactory16, false, 4, null);
            new Pair(module, factoryInstanceFactory16);
            l lVar = l.a;
            StringQualifier rootScopeQualifier17 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition20 = new BeanDefinition(rootScopeQualifier17, Reflection.getOrCreateKotlinClass(MessageCenterApi.class), null, lVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey20 = BeanDefinitionKt.indexKey(beanDefinition20.getPrimaryType(), null, rootScopeQualifier17);
            FactoryInstanceFactory factoryInstanceFactory17 = new FactoryInstanceFactory(beanDefinition20);
            Module.saveMapping$default(module, strIndexKey20, factoryInstanceFactory17, false, 4, null);
            new Pair(module, factoryInstanceFactory17);
        }
    }

    private DeviceManageMainModules() {
    }

    @NotNull
    public final Module getModules() {
        return modules;
    }
}
