package com.xiaomi.hm.health.di.koin.module;

import android.content.Context;
import android.content.Intent;
import androidx.p008lifecycle.FlowLiveDataConversions;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.HMLoginManager;
import com.huami.account.service.AccountServiceExtKt;
import com.huami.bigdata.statistics.core.api.BigDataExportedApi;
import com.huami.bigdata.statistics.core.api.IBigDataExportedApi;
import com.huami.bloodpressure.service.BloodPressureExpireVo;
import com.huami.bloodpressure.service.IBloodPressureExpireService;
import com.huami.bloodpressure.service.IBloodPressureExpireUIService;
import com.huami.bloodpressure_core.di.KoinExKt;
import com.huami.bloodpressure_core.ext.UserEx;
import com.huami.bloodpressure_core.ext.UserExKt;
import com.huami.bloodpressure_core.service.IDeviceSwitch;
import com.huami.bloodpressure_core.url.IBPResearchConfig;
import com.huami.bloodpressure_core.user.WeakUserInfo;
import com.huami.bloodpressure_ui.BloodPressureUIModuleKt;
import com.huami.device.feature.health.HealthDetect;
import com.huami.device.feature.health.device.HealthFunc;
import com.huami.device.feature.health.settings.BloodPressureSetting;
import com.huami.device.feature.health.ui.bloodpressure.BloodPressureCorrectActivity;
import com.huami.device.feature.health.user.HealthConfig;
import com.huami.device.feature.health.util.BloodPressureCorrectDayStatus;
import com.huami.device.feature.health.util.BloodPressureExtKt;
import com.huami.device.feature.health.util.LiveDataExtKt;
import com.huami.network.hmnetwork.config.HMAppConfig;
import com.huami.rawdata_uploader.di.RawDataInterModuleKt;
import com.huami.rawdata_uploader.usecase.BloodPressureRawDataUseCase;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.health.blood_pressure.BloodPressureUtil;
import com.xiaomi.hm.health.discovery.WebHelper;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.model.account.HMUserInfo;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.instance.ScopedInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleKt;
import org.koin.dsl.ScopeDSL;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\"\u0019\u0010\u0005\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0019\u0010\b\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\u0004\")\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00000\tj\b\u0012\u0004\u0012\u00020\u0000`\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0016\u0010\u0011\u001a\u00020\u00108\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0019\u0010\u0015\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0014\u0010\u0004\")\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00000\tj\b\u0012\u0004\u0012\u00020\u0000`\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000e¨\u0006\u0019"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getWeakUserInfoModule", "()Lorg/koin/core/module/Module;", "weakUserInfoModule", "b", "getBloodPressureModuleExternal", "bloodPressureModuleExternal", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "c", "Ljava/util/ArrayList;", "getBloodPressureModules", "()Ljava/util/ArrayList;", "bloodPressureModules", "", "RAWDATA_UPLOAD_SCOPE", "Ljava/lang/String;", GoogleApiAvailabilityLight.a, "getRawDataExternalModule", "rawDataExternalModule", "e", "getRawDataBPModules", "rawDataBPModules", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class BloodPressureModuleKt {

    @NotNull
    public static final String RAWDATA_UPLOAD_SCOPE = "RAWDATA_UPLOAD_SCOPE";

    @NotNull
    private static final Module a = ModuleKt.module$default(false, b.a, 1, null);

    @NotNull
    private static final Module b = ModuleKt.module$default(false, new Function1<Module, Unit>() { // from class: com.xiaomi.hm.health.di.koin.module.BloodPressureModuleKt$bloodPressureModuleExternal$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Module module) {
            invoke2(module);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Module module) {
            module.scope(QualifierKt.named(com.huami.bloodpressure_core.di.BloodPressureModuleKt.BLOODPRESSURE_SCOPE_NAME), new Function1<ScopeDSL, Unit>() { // from class: com.xiaomi.hm.health.di.koin.module.BloodPressureModuleKt$bloodPressureModuleExternal$1.1

                /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.BloodPressureModuleKt$bloodPressureModuleExternal$1$1$a */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bigdata/statistics/core/api/IBigDataExportedApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class a extends Lambda implements Function2<Scope, ParametersHolder, IBigDataExportedApi> {
                    public static final a a = new a();

                    public a() {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final IBigDataExportedApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                        return new BigDataExportedApi(UserEx.getUserId(), HMAppConfig.getPackageName(), false, 4, null);
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ScopeDSL scopeDSL) {
                    invoke2(scopeDSL);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ScopeDSL scopeDSL) {
                    a aVar = a.a;
                    Kind kind = Kind.Scoped;
                    BeanDefinition beanDefinition = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(IBigDataExportedApi.class), null, aVar, kind, CollectionsKt__CollectionsKt.emptyList());
                    String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                    ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(beanDefinition);
                    Module.saveMapping$default(scopeDSL.getModule(), strIndexKey, scopedInstanceFactory, false, 4, null);
                    new Pair(scopeDSL.getModule(), scopedInstanceFactory);
                    AnonymousClass2 anonymousClass2 = new Function2<Scope, ParametersHolder, IDeviceSwitch>() { // from class: com.xiaomi.hm.health.di.koin.module.BloodPressureModuleKt.bloodPressureModuleExternal.1.1.2
                        @Override // kotlin.jvm.functions.Function2
                        @NotNull
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final IDeviceSwitch invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                            return new IDeviceSwitch() { // from class: com.xiaomi.hm.health.di.koin.module.BloodPressureModuleKt.bloodPressureModuleExternal.1.1.2.1

                                /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.BloodPressureModuleKt$bloodPressureModuleExternal$1$1$2$1$a */
                                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                                @DebugMetadata(c = "com.xiaomi.hm.health.di.koin.module.BloodPressureModuleKt$bloodPressureModuleExternal$1$1$2$1$deviceSupportBPFlow$1", f = "BloodPressureModule.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
                                public static final class a extends SuspendLambda implements Function2<FlowCollector<? super Boolean>, Continuation<? super Unit>, Object> {
                                    public int a;
                                    private /* synthetic */ Object b;

                                    public a(Continuation<? super a> continuation) {
                                        super(2, continuation);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @NotNull
                                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                        a aVar = new a(continuation);
                                        aVar.b = obj;
                                        return aVar;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    @Nullable
                                    public final Object invoke(@NotNull FlowCollector<? super Boolean> flowCollector, @Nullable Continuation<? super Unit> continuation) {
                                        return ((a) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object obj) {
                                        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                                        int i = this.a;
                                        if (i == 0) {
                                            ResultKt.throwOnFailure(obj);
                                            FlowCollector flowCollector = (FlowCollector) this.b;
                                            Boolean boolBoxBoolean = Boxing.boxBoolean(true);
                                            this.a = 1;
                                            if (flowCollector.emit(boolBoxBoolean, this) == coroutine_suspended) {
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

                                @Override // com.huami.bloodpressure_core.service.IDeviceSwitch
                                @NotNull
                                public Flow<Boolean> deviceSupportBPFlow() {
                                    return FlowKt.flow(new a(null));
                                }

                                @Override // com.huami.bloodpressure_core.service.IDeviceSwitch
                                public boolean supportDeviceMeasureBP() {
                                    return true;
                                }
                            };
                        }
                    };
                    BeanDefinition beanDefinition2 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(IDeviceSwitch.class), null, anonymousClass2, kind, CollectionsKt__CollectionsKt.emptyList());
                    String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                    ScopedInstanceFactory scopedInstanceFactory2 = new ScopedInstanceFactory(beanDefinition2);
                    Module.saveMapping$default(scopeDSL.getModule(), strIndexKey2, scopedInstanceFactory2, false, 4, null);
                    new Pair(scopeDSL.getModule(), scopedInstanceFactory2);
                    AnonymousClass3 anonymousClass3 = new Function2<Scope, ParametersHolder, IBPResearchConfig>() { // from class: com.xiaomi.hm.health.di.koin.module.BloodPressureModuleKt.bloodPressureModuleExternal.1.1.3
                        @Override // kotlin.jvm.functions.Function2
                        @NotNull
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final IBPResearchConfig invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                            return new IBPResearchConfig() { // from class: com.xiaomi.hm.health.di.koin.module.BloodPressureModuleKt.bloodPressureModuleExternal.1.1.3.1
                                @Override // com.huami.bloodpressure_core.url.IBPResearchConfig
                                public String getAppName() {
                                    return HMAppConfig.getPackageName();
                                }

                                @Override // com.huami.bloodpressure_core.url.IBPResearchConfig
                                public boolean onResearchCardEnabled() {
                                    return Language.isSimplifiedChinese();
                                }

                                @Override // com.huami.bloodpressure_core.url.IBPResearchConfig
                                public void onResearchClick(@NotNull String url) {
                                    WebHelper.launch(url);
                                }

                                @Override // com.huami.bloodpressure_core.url.IBPResearchConfig
                                public boolean researchEnable() {
                                    return HMLoginManager.isInMainland() && Language.isSimplifiedChinese();
                                }
                            };
                        }
                    };
                    BeanDefinition beanDefinition3 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(IBPResearchConfig.class), null, anonymousClass3, kind, CollectionsKt__CollectionsKt.emptyList());
                    String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                    ScopedInstanceFactory scopedInstanceFactory3 = new ScopedInstanceFactory(beanDefinition3);
                    Module.saveMapping$default(scopeDSL.getModule(), strIndexKey3, scopedInstanceFactory3, false, 4, null);
                    new Pair(scopeDSL.getModule(), scopedInstanceFactory3);
                    AnonymousClass4 anonymousClass4 = new Function2<Scope, ParametersHolder, IBloodPressureExpireService>() { // from class: com.xiaomi.hm.health.di.koin.module.BloodPressureModuleKt.bloodPressureModuleExternal.1.1.4
                        @Override // kotlin.jvm.functions.Function2
                        @NotNull
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final IBloodPressureExpireService invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                            return new IBloodPressureExpireService() { // from class: com.xiaomi.hm.health.di.koin.module.BloodPressureModuleKt.bloodPressureModuleExternal.1.1.4.1

                                /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.BloodPressureModuleKt$bloodPressureModuleExternal$1$1$4$1$a */
                                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/device/feature/health/user/HealthConfig;", "config", "Lcom/huami/bloodpressure/service/BloodPressureExpireVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                                public static final class a extends Lambda implements Function1<HealthConfig, BloodPressureExpireVo> {
                                    public static final a a = new a();

                                    public a() {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    @Nullable
                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                    public final BloodPressureExpireVo invoke(@NotNull HealthConfig healthConfig) {
                                        Long data;
                                        String deviceID;
                                        HMMiLiProDevice miliProDevice = HMDeviceManager.getInstance().getMiliProDevice();
                                        if (miliProDevice == null || !BloodPressureUtil.INSTANCE.isSupportBloodPressure(miliProDevice)) {
                                            return null;
                                        }
                                        DeviceInfo deviceInfo = miliProDevice.getDeviceInfo();
                                        String str = "";
                                        if (deviceInfo != null && (deviceID = deviceInfo.getDeviceID()) != null) {
                                            str = deviceID;
                                        }
                                        BloodPressureSetting serviceForce = HealthFunc.BLOOD_PRESSURE.INSTANCE.getServiceForce();
                                        long jLongValue = (serviceForce == null || (data = serviceForce.getData()) == null) ? 0L : data.longValue() * 1000;
                                        if (jLongValue == 0) {
                                            return null;
                                        }
                                        return new BloodPressureExpireVo(str, !(BloodPressureExtKt.generateCorrectStatus(jLongValue) instanceof BloodPressureCorrectDayStatus.VALID));
                                    }
                                }

                                @Override // com.huami.bloodpressure.service.IBloodPressureExpireService
                                @NotNull
                                public Flow<BloodPressureExpireVo> getCurrentDeviceExpire() {
                                    return FlowLiveDataConversions.asFlow(LiveDataExtKt.map(HealthDetect.INSTANCE.observeHealthConfig(), a.a));
                                }

                                @Override // com.huami.bloodpressure.service.IBloodPressureExpireService
                                public void gotoBloodPressureHandleExpire(@NotNull Context context) {
                                    Intent intent = new Intent(context, (Class<?>) BloodPressureCorrectActivity.class);
                                    intent.addFlags(268435456);
                                    context.startActivity(intent);
                                }
                            };
                        }
                    };
                    BeanDefinition beanDefinition4 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(IBloodPressureExpireService.class), null, anonymousClass4, kind, CollectionsKt__CollectionsKt.emptyList());
                    String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                    ScopedInstanceFactory scopedInstanceFactory4 = new ScopedInstanceFactory(beanDefinition4);
                    Module.saveMapping$default(scopeDSL.getModule(), strIndexKey4, scopedInstanceFactory4, false, 4, null);
                    new Pair(scopeDSL.getModule(), scopedInstanceFactory4);
                    AnonymousClass5 anonymousClass5 = new Function2<Scope, ParametersHolder, IBloodPressureExpireUIService>() { // from class: com.xiaomi.hm.health.di.koin.module.BloodPressureModuleKt.bloodPressureModuleExternal.1.1.5
                        @Override // kotlin.jvm.functions.Function2
                        @NotNull
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final IBloodPressureExpireUIService invoke(@NotNull final Scope scope, @NotNull ParametersHolder parametersHolder) {
                            return new IBloodPressureExpireUIService() { // from class: com.xiaomi.hm.health.di.koin.module.BloodPressureModuleKt.bloodPressureModuleExternal.1.1.5.1

                                /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.BloodPressureModuleKt$bloodPressureModuleExternal$1$1$5$1$a */
                                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                                @DebugMetadata(c = "com.xiaomi.hm.health.di.koin.module.BloodPressureModuleKt$bloodPressureModuleExternal$1$1$5$1$getExpireEnable$2", f = "BloodPressureModule.kt", i = {}, l = {172}, m = "invokeSuspend", n = {}, s = {})
                                public static final class a extends SuspendLambda implements Function2<FlowCollector<? super Boolean>, Continuation<? super Unit>, Object> {
                                    public int a;
                                    private /* synthetic */ Object b;

                                    public a(Continuation<? super a> continuation) {
                                        super(2, continuation);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @NotNull
                                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                        a aVar = new a(continuation);
                                        aVar.b = obj;
                                        return aVar;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    @Nullable
                                    public final Object invoke(@NotNull FlowCollector<? super Boolean> flowCollector, @Nullable Continuation<? super Unit> continuation) {
                                        return ((a) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object obj) {
                                        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                                        int i = this.a;
                                        if (i == 0) {
                                            ResultKt.throwOnFailure(obj);
                                            FlowCollector flowCollector = (FlowCollector) this.b;
                                            Boolean boolBoxBoolean = Boxing.boxBoolean(false);
                                            this.a = 1;
                                            if (flowCollector.emit(boolBoxBoolean, this) == coroutine_suspended) {
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

                                @Override // com.huami.bloodpressure.service.IBloodPressureExpireUIService
                                @NotNull
                                public Flow<Boolean> getExpireEnable() {
                                    IBloodPressureExpireService iBloodPressureExpireService = (IBloodPressureExpireService) KoinExKt.bloodPressureScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(IBloodPressureExpireService.class), null, null);
                                    if (!((IBPResearchConfig) KoinExKt.bloodPressureScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(IBPResearchConfig.class), null, null)).researchEnable()) {
                                        return FlowKt.flow(new a(null));
                                    }
                                    final Flow<BloodPressureExpireVo> currentDeviceExpire = iBloodPressureExpireService.getCurrentDeviceExpire();
                                    return new Flow<Boolean>() { // from class: com.xiaomi.hm.health.di.koin.module.BloodPressureModuleKt$bloodPressureModuleExternal$1$1$5$1$getExpireEnable$$inlined$map$1

                                        /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.BloodPressureModuleKt$bloodPressureModuleExternal$1$1$5$1$getExpireEnable$$inlined$map$1$2, reason: invalid class name */
                                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
                                        public static final class AnonymousClass2 implements FlowCollector<BloodPressureExpireVo> {
                                            public final /* synthetic */ FlowCollector a;

                                            /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.BloodPressureModuleKt$bloodPressureModuleExternal$1$1$5$1$getExpireEnable$$inlined$map$1$2$1, reason: invalid class name */
                                            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                                            @DebugMetadata(c = "com.xiaomi.hm.health.di.koin.module.BloodPressureModuleKt$bloodPressureModuleExternal$1$1$5$1$getExpireEnable$$inlined$map$1$2", f = "BloodPressureModule.kt", i = {}, l = {137}, m = "emit", n = {}, s = {})
                                            public static final class AnonymousClass1 extends ContinuationImpl {
                                                public /* synthetic */ Object a;
                                                public int b;
                                                public Object c;

                                                public AnonymousClass1(Continuation continuation) {
                                                    super(continuation);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @Nullable
                                                public final Object invokeSuspend(@NotNull Object obj) {
                                                    this.a = obj;
                                                    this.b |= Integer.MIN_VALUE;
                                                    return AnonymousClass2.this.emit(null, this);
                                                }
                                            }

                                            public AnonymousClass2(FlowCollector flowCollector) {
                                                this.a = flowCollector;
                                            }

                                            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                                            @Override // kotlinx.coroutines.flow.FlowCollector
                                            @Nullable
                                            public Object emit(BloodPressureExpireVo bloodPressureExpireVo, @NotNull Continuation continuation) {
                                                AnonymousClass1 anonymousClass1;
                                                Boolean boolBoxBoolean;
                                                if (continuation instanceof AnonymousClass1) {
                                                    anonymousClass1 = (AnonymousClass1) continuation;
                                                    int i = anonymousClass1.b;
                                                    if ((i & Integer.MIN_VALUE) != 0) {
                                                        anonymousClass1.b = i - Integer.MIN_VALUE;
                                                    } else {
                                                        anonymousClass1 = new AnonymousClass1(continuation);
                                                    }
                                                } else {
                                                    anonymousClass1 = new AnonymousClass1(continuation);
                                                }
                                                Object obj = anonymousClass1.a;
                                                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                                                int i2 = anonymousClass1.b;
                                                if (i2 == 0) {
                                                    ResultKt.throwOnFailure(obj);
                                                    FlowCollector flowCollector = this.a;
                                                    BloodPressureExpireVo bloodPressureExpireVo2 = bloodPressureExpireVo;
                                                    boolean zBooleanValue = false;
                                                    if (bloodPressureExpireVo2 != null && (boolBoxBoolean = Boxing.boxBoolean(bloodPressureExpireVo2.getExpire())) != null) {
                                                        zBooleanValue = boolBoxBoolean.booleanValue();
                                                    }
                                                    Boolean boolBoxBoolean2 = Boxing.boxBoolean(zBooleanValue);
                                                    anonymousClass1.b = 1;
                                                    if (flowCollector.emit(boolBoxBoolean2, anonymousClass1) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                } else {
                                                    if (i2 != 1) {
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    }
                                                    ResultKt.throwOnFailure(obj);
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }

                                        @Override // kotlinx.coroutines.flow.Flow
                                        @Nullable
                                        public Object collect(@NotNull FlowCollector<? super Boolean> flowCollector, @NotNull Continuation continuation) {
                                            Object objCollect = currentDeviceExpire.collect(new AnonymousClass2(flowCollector), continuation);
                                            return objCollect == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                                        }
                                    };
                                }
                            };
                        }
                    };
                    BeanDefinition beanDefinition5 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(IBloodPressureExpireUIService.class), null, anonymousClass5, kind, CollectionsKt__CollectionsKt.emptyList());
                    String strIndexKey5 = BeanDefinitionKt.indexKey(beanDefinition5.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                    ScopedInstanceFactory scopedInstanceFactory5 = new ScopedInstanceFactory(beanDefinition5);
                    Module.saveMapping$default(scopeDSL.getModule(), strIndexKey5, scopedInstanceFactory5, false, 4, null);
                    new Pair(scopeDSL.getModule(), scopedInstanceFactory5);
                }
            });
        }
    }, 1, null);

    @NotNull
    private static final ArrayList<Module> c;

    @NotNull
    private static final Module d;

    @NotNull
    private static final ArrayList<Module> e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Module, Unit> {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.BloodPressureModuleKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/dsl/ScopeDSL;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0900a extends Lambda implements Function1<ScopeDSL, Unit> {
            public static final C0900a a = new C0900a();

            /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.BloodPressureModuleKt$a$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/rawdata_uploader/usecase/BloodPressureRawDataUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0901a extends Lambda implements Function2<Scope, ParametersHolder, BloodPressureRawDataUseCase> {
                public static final C0901a a = new C0901a();

                public C0901a() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final BloodPressureRawDataUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new BloodPressureRawDataUseCase(ModuleExtKt.androidContext(scope));
                }
            }

            public C0900a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ScopeDSL scopeDSL) {
                invoke2(scopeDSL);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ScopeDSL scopeDSL) {
                C0901a c0901a = C0901a.a;
                Kind kind = Kind.Scoped;
                BeanDefinition beanDefinition = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(BloodPressureRawDataUseCase.class), null, c0901a, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(beanDefinition);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey, scopedInstanceFactory, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory);
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
            module.scope(QualifierKt.named("RAWDATA_UPLOAD_SCOPE"), C0900a.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Module, Unit> {
        public static final b a = new b();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bloodpressure_core/user/WeakUserInfo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function2<Scope, ParametersHolder, WeakUserInfo> {
            public static final a a = new a();

            public a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final WeakUserInfo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                HMUserInfo userInfo;
                try {
                    userInfo = HMPersonInfo.getInstance().getUserInfo();
                } catch (Exception unused) {
                    userInfo = null;
                }
                String strUserId = AccountServiceExtKt.userId(AccountModuleKt.getAccountService());
                String str = strUserId == null ? "" : strUserId;
                int age = userInfo == null ? 0 : userInfo.getAge();
                int gender = userInfo == null ? 0 : userInfo.getGender();
                Long lValueOf = Long.valueOf(AccountModuleKt.getAccountService().getRegisterDate());
                String strAppToken = AccountServiceExtKt.appToken(AccountModuleKt.getAccountService());
                return new WeakUserInfo(str, age, gender, lValueOf, strAppToken == null ? "" : strAppToken);
            }
        }

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Module module) {
            invoke2(module);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Module module) {
            StringQualifier stringQualifierNamed = QualifierKt.named(UserExKt.getWEAK_NAME_USERINFO());
            a aVar = a.a;
            StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
            BeanDefinition beanDefinition = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(WeakUserInfo.class), stringQualifierNamed, aVar, Kind.Factory, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), stringQualifierNamed, rootScopeQualifier);
            FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, factoryInstanceFactory, false, 4, null);
            new Pair(module, factoryInstanceFactory);
        }
    }

    static {
        ArrayList<Module> arrayList = new ArrayList<>();
        arrayList.add(getBloodPressureModuleExternal());
        arrayList.add(getWeakUserInfoModule());
        arrayList.addAll(BloodPressureUIModuleKt.getBloodPressureModuleInter());
        c = arrayList;
        d = ModuleKt.module$default(false, a.a, 1, null);
        ArrayList<Module> arrayList2 = new ArrayList<>();
        arrayList2.add(RawDataInterModuleKt.getRawDataInterModule());
        arrayList2.add(getRawDataExternalModule());
        e = arrayList2;
    }

    @NotNull
    public static final Module getBloodPressureModuleExternal() {
        return b;
    }

    @NotNull
    public static final ArrayList<Module> getBloodPressureModules() {
        return c;
    }

    @NotNull
    public static final ArrayList<Module> getRawDataBPModules() {
        return e;
    }

    @NotNull
    public static final Module getRawDataExternalModule() {
        return d;
    }

    @NotNull
    public static final Module getWeakUserInfoModule() {
        return a;
    }
}
