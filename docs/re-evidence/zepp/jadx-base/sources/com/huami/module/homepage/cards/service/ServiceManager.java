package com.huami.module.homepage.cards.service;

import androidx.exifinterface.media.ExifInterface;
import com.app.calorie.service.CalorieService;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bloodoxygen.service.Spo2Service;
import com.huami.bloodpressure.service.IBloodPressureExpireUIService;
import com.huami.bloodpressure.service.IBloodPressureService;
import com.huami.bloodpressure_core.di.BloodPressureModuleKt;
import com.huami.ecg.service.EcgService;
import com.huami.fhservice.FemaleHealthService;
import com.huami.firstbeat.service.SportStateService;
import com.huami.health.afppg.service.AfPpgService;
import com.huami.health.bodymeasurements.bodyfat_service.BodyfatService;
import com.huami.health.bodymeasurements.p014temperatureservice.TemperatureService;
import com.huami.health.service.HealthService;
import com.huami.healthlabel.koin.LabelScopeNames;
import com.huami.heartrate.HelperKt;
import com.huami.heartrate.service.IHeartRateService;
import com.huami.lib.healthlabel.service.HealthLabelService;
import com.huami.module.homepage.koin.HomePageScopeNames;
import com.huami.module.homepage.koin.ScopesAndQualifersKt;
import com.huami.pai.koin.PaiScopeNames;
import com.huami.pai_service.PaiService;
import com.huami.phn.service.PHNStateService;
import com.huami.sky.service.SkyCardService;
import com.huami.sky.service.SkyPromotionService;
import com.huami.sky.service.SkyService;
import com.huami.sleep.service.BreathQualityService;
import com.huami.sleep.service.SleepService;
import com.huami.sleepassistant.servicelib.service.SleepAidService;
import com.huami.sport.service.SportService;
import com.huami.sport.service.model.HistoryRecord;
import com.huami.step.service.StepService;
import com.huami.stress_service.StressResourceService;
import com.huami.stress_service.StressService;
import com.huami.web.service.WebViewService;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bK\u0010LJ\u001c\u0010\u0003\u001a\u00028\u0000\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0001H\u0082\b¢\u0006\u0004\b\u0003\u0010\u0004J\u001e\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0001H\u0082\b¢\u0006\u0004\b\u0005\u0010\u0004J\u0014\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u0019\u001a\u00020\u000fJ\u0006\u0010\u001b\u001a\u00020\u001aJ\u0006\u0010\u001d\u001a\u00020\u001cJ\u0006\u0010\u001f\u001a\u00020\u001eJ\u0006\u0010!\u001a\u00020 J\b\u0010#\u001a\u0004\u0018\u00010\"J\u0006\u0010%\u001a\u00020$J\u0006\u0010'\u001a\u00020&J\u0006\u0010)\u001a\u00020(J\u0006\u0010+\u001a\u00020*J\u0006\u0010-\u001a\u00020,J\u0006\u0010/\u001a\u00020.J\f\u00102\u001a\b\u0012\u0004\u0012\u00020100J\u0006\u00104\u001a\u000203J\u0006\u00106\u001a\u000205J\u0006\u00108\u001a\u000207J\u0006\u0010:\u001a\u000209J\u0006\u0010<\u001a\u00020;J\u0006\u0010>\u001a\u00020=J\b\u0010@\u001a\u0004\u0018\u00010?J\u0006\u0010B\u001a\u00020AJ\u0006\u0010D\u001a\u00020CJ\u0006\u0010F\u001a\u00020ER\u001d\u0010J\u001a\u00020;8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010G\u001a\u0004\bH\u0010I¨\u0006M"}, d2 = {"Lcom/huami/module/homepage/cards/service/ServiceManager;", "", ExifInterface.GPS_DIRECTION_TRUE, "a", "()Ljava/lang/Object;", "b", "Lorg/koin/core/Koin;", "", "scopeName", "Lorg/koin/core/scope/Scope;", GoogleApiAvailabilityLight.a, "Lcom/huami/fhservice/FemaleHealthService;", "getFemaleService", "Lcom/app/calorie/service/CalorieService;", "getCalorieService", "", "getGoalCalorie", "Lcom/huami/step/service/StepService;", "getStepService", "Lcom/huami/module/homepage/cards/service/RealtimeStepService;", "getRealTimeStepService", "Lcom/huami/sleep/service/SleepService;", "getSleepService", "Lcom/huami/sleep/service/BreathQualityService;", "getBreathEqualityService", "getUserAge", "Lcom/huami/heartrate/service/IHeartRateService;", "getHeartRateService", "Lcom/huami/health/afppg/service/AfPpgService;", "getAfPpgService", "Lcom/huami/bloodoxygen/service/Spo2Service;", "getSpo2Service", "Lcom/huami/stress_service/StressService;", "getStressService", "Lcom/huami/stress_service/StressResourceService;", "getStressResourceService", "Lcom/huami/health/bodymeasurements/bodyfat_service/BodyfatService;", "getWeightService", "Lcom/huami/ecg/service/EcgService;", "getEcgService", "Lcom/huami/pai_service/PaiService;", "getPaiService", "Lcom/huami/health/bodymeasurements/temperatureservice/TemperatureService;", "getTemperatureService", "Lcom/huami/health/service/HealthService;", "getHealthStateService", "Lcom/huami/firstbeat/service/SportStateService;", "getSportStateService", "Lcom/huami/sport/service/SportService;", "Lcom/huami/sport/service/model/HistoryRecord;", "getSportService", "Lcom/huami/lib/healthlabel/service/HealthLabelService;", "getHealthLabelService", "Lcom/huami/module/homepage/cards/service/CardAssistService;", "getAssistService", "Lcom/huami/bloodpressure/service/IBloodPressureService;", "getBloodPressureService", "Lcom/huami/bloodpressure/service/IBloodPressureExpireUIService;", "getBloodPressureExpireUIService", "Lcom/huami/sky/service/SkyService;", "getStarSkyService", "Lcom/huami/sky/service/SkyCardService;", "getSkyCardService", "Lcom/huami/sky/service/SkyPromotionService;", "getSkyPromotionService", "Lcom/huami/sleepassistant/servicelib/service/SleepAidService;", "getSleepAidService", "Lcom/huami/phn/service/PHNStateService;", "getPHNStateService", "Lcom/huami/web/service/WebViewService;", "getWebService", "Lkotlin/Lazy;", "c", "()Lcom/huami/sky/service/SkyService;", "skyService", "<init>", "()V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class ServiceManager {

    @NotNull
    public static final ServiceManager INSTANCE = new ServiceManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final Lazy skyService;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Koin koin = ScopesAndQualifersKt.getKoin();
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Scope rootScope = koin.getScopeRegistry().getRootScope();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        skyService = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<SkyService>() { // from class: com.huami.module.homepage.cards.service.ServiceManager$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.huami.sky.service.SkyService, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SkyService invoke() {
                return rootScope.get(Reflection.getOrCreateKotlinClass(SkyService.class), qualifier, objArr);
            }
        });
    }

    private ServiceManager() {
    }

    private final /* synthetic */ <T> T a() {
        Scope rootScope = ScopesAndQualifersKt.getKoin().getScopeRegistry().getRootScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) rootScope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
    }

    private final /* synthetic */ <T> T b() {
        Scope rootScope = ScopesAndQualifersKt.getKoin().getScopeRegistry().getRootScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) rootScope.getOrNull(Reflection.getOrCreateKotlinClass(Object.class), null, null);
    }

    private final SkyService c() {
        return (SkyService) skyService.getValue();
    }

    private final Scope d(Koin koin, String str) {
        return Koin.getOrCreateScope$default(koin, str, QualifierKt.named(str), null, 4, null);
    }

    @NotNull
    public final AfPpgService getAfPpgService() {
        return (AfPpgService) ScopesAndQualifersKt.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(AfPpgService.class), null, null);
    }

    @NotNull
    public final CardAssistService getAssistService() {
        return (CardAssistService) ScopesAndQualifersKt.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(CardAssistService.class), null, null);
    }

    @NotNull
    public final IBloodPressureExpireUIService getBloodPressureExpireUIService() {
        return (IBloodPressureExpireUIService) d(ScopesAndQualifersKt.getKoin(), BloodPressureModuleKt.BLOODPRESSURE_SCOPE_NAME).get(Reflection.getOrCreateKotlinClass(IBloodPressureExpireUIService.class), null, null);
    }

    @NotNull
    public final IBloodPressureService getBloodPressureService() {
        return (IBloodPressureService) d(ScopesAndQualifersKt.getKoin(), BloodPressureModuleKt.BLOODPRESSURE_SCOPE_NAME).get(Reflection.getOrCreateKotlinClass(IBloodPressureService.class), null, null);
    }

    @NotNull
    public final BreathQualityService getBreathEqualityService() {
        return (BreathQualityService) ScopesAndQualifersKt.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(BreathQualityService.class), null, null);
    }

    @NotNull
    public final CalorieService getCalorieService() {
        return (CalorieService) ScopesAndQualifersKt.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(CalorieService.class), null, null);
    }

    @NotNull
    public final EcgService getEcgService() {
        return (EcgService) ScopesAndQualifersKt.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(EcgService.class), null, null);
    }

    @NotNull
    public final FemaleHealthService getFemaleService() {
        return (FemaleHealthService) ScopesAndQualifersKt.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(FemaleHealthService.class), null, null);
    }

    public final int getGoalCalorie() {
        Koin koin = ScopesAndQualifersKt.getKoin();
        return ((Number) koin.getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(Integer.class), QualifierKt.named(HomePageScopeNames.CALORIE_GOAL), null)).intValue();
    }

    @NotNull
    public final HealthLabelService getHealthLabelService() {
        return (HealthLabelService) d(ScopesAndQualifersKt.getKoin(), LabelScopeNames.HEALTH_LABEL).get(Reflection.getOrCreateKotlinClass(HealthLabelService.class), null, null);
    }

    @NotNull
    public final HealthService getHealthStateService() {
        return (HealthService) ScopesAndQualifersKt.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(HealthService.class), null, null);
    }

    @NotNull
    public final IHeartRateService getHeartRateService() {
        return HelperKt.getHeartRateService$default(null, 1, null);
    }

    @NotNull
    public final PHNStateService getPHNStateService() {
        return (PHNStateService) ScopesAndQualifersKt.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(PHNStateService.class), null, null);
    }

    @NotNull
    public final PaiService getPaiService() {
        return (PaiService) d(ScopesAndQualifersKt.getKoin(), PaiScopeNames.PAI).get(Reflection.getOrCreateKotlinClass(PaiService.class), null, null);
    }

    @NotNull
    public final RealtimeStepService getRealTimeStepService() {
        return (RealtimeStepService) ScopesAndQualifersKt.homePageScope(ScopesAndQualifersKt.getKoin()).get(Reflection.getOrCreateKotlinClass(RealtimeStepService.class), null, null);
    }

    @NotNull
    public final SkyCardService getSkyCardService() {
        return (SkyCardService) ScopesAndQualifersKt.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(SkyCardService.class), null, null);
    }

    @Nullable
    public final SkyPromotionService getSkyPromotionService() {
        return (SkyPromotionService) ScopesAndQualifersKt.getKoin().getScopeRegistry().getRootScope().getOrNull(Reflection.getOrCreateKotlinClass(SkyPromotionService.class), null, null);
    }

    @NotNull
    public final SleepAidService getSleepAidService() {
        return (SleepAidService) ScopesAndQualifersKt.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(SleepAidService.class), null, null);
    }

    @NotNull
    public final SleepService getSleepService() {
        return (SleepService) ScopesAndQualifersKt.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(SleepService.class), null, null);
    }

    @NotNull
    public final Spo2Service getSpo2Service() {
        return (Spo2Service) ScopesAndQualifersKt.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(Spo2Service.class), null, null);
    }

    @NotNull
    public final SportService<HistoryRecord> getSportService() {
        return (SportService) ScopesAndQualifersKt.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(SportService.class), null, null);
    }

    @NotNull
    public final SportStateService getSportStateService() {
        return (SportStateService) ScopesAndQualifersKt.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(SportStateService.class), null, null);
    }

    @NotNull
    public final SkyService getStarSkyService() {
        return c();
    }

    @NotNull
    public final StepService getStepService() {
        return (StepService) ScopesAndQualifersKt.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(StepService.class), null, null);
    }

    @Nullable
    public final StressResourceService getStressResourceService() {
        return (StressResourceService) ScopesAndQualifersKt.getKoin().getScopeRegistry().getRootScope().getOrNull(Reflection.getOrCreateKotlinClass(StressResourceService.class), null, null);
    }

    @NotNull
    public final StressService getStressService() {
        return (StressService) ScopesAndQualifersKt.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(StressService.class), null, null);
    }

    @NotNull
    public final TemperatureService getTemperatureService() {
        return (TemperatureService) d(ScopesAndQualifersKt.getKoin(), "Temperature").get(Reflection.getOrCreateKotlinClass(TemperatureService.class), null, null);
    }

    public final int getUserAge() {
        return HMPersonInfo.getInstance().getUserInfo().getAge();
    }

    @NotNull
    public final WebViewService getWebService() {
        return (WebViewService) ScopesAndQualifersKt.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(WebViewService.class), null, null);
    }

    @NotNull
    public final BodyfatService getWeightService() {
        return (BodyfatService) ScopesAndQualifersKt.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(BodyfatService.class), null, null);
    }
}
