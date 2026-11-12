package com.huami.bloodoxygen.zepp.koin;

import com.huami.bloodoxygen.bluetooth.koin.BloodOxygenBleScopeSetKt;
import com.huami.bloodoxygen.bluetooth.sync.Spo2DeviceApi;
import com.huami.bloodoxygen.core.koin.BloodOxygenConfig;
import com.huami.bloodoxygen.core.koin.BloodOxygenModuleKt;
import com.huami.bloodoxygen.core.local.kvkit.KvKey;
import com.huami.bloodoxygen.core.remote.upload.IUploader;
import com.huami.bloodoxygen.core.repository.IBloodOxygenRepo;
import com.huami.bloodoxygen.core.usecase.clickspo2.SaveManualClickSpo2UseCase;
import com.huami.bloodoxygen.core.usecase.odi.GetLatestSleepBreathScoreFlowUseCase;
import com.huami.bloodoxygen.core.usecase.odi.GetRemoteSleepBreathScoreListUseCase;
import com.huami.bloodoxygen.core.usecase.odi.GetSleepBreathScoreFlowUseCase;
import com.huami.bloodoxygen.core.usecase.odi.GetSleepBreathScoreListFlowUseCase;
import com.huami.bloodoxygen.core.usecase.odi.GetSleepBreathScoreUseCase;
import com.huami.bloodoxygen.core.usecase.osaevent.GetDifficultBreathListFlowUseCase;
import com.huami.bloodoxygen.ui.koin.BloodOxygenUiModuleKt;
import com.huami.bloodoxygen.ui.usecase.JumpToDetectSettingUseCase;
import com.huami.bloodoxygen.ui.vo.DetailUIConfig;
import com.huami.bloodoxygen.zepp.usecase.MigrateSpo2DataUseCase;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.instance.ScopedInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;
import org.koin.dsl.ScopeDSL;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a0\u0010\b\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0000¨\u0006\t"}, d2 = {"Lkotlin/Function0;", "Lcom/huami/bloodoxygen/bluetooth/sync/Spo2DeviceApi;", "deviceApi", "Lcom/huami/bloodoxygen/core/koin/BloodOxygenConfig;", "config", "Lcom/huami/bloodoxygen/ui/usecase/JumpToDetectSettingUseCase;", "jumpToDetectSettingUseCase", "Lorg/koin/core/module/Module;", "getZeppBloodOxygenModule", "zepp_release"}, k = 2, mv = {1, 5, 1})
public final class ZeppBloodOxygenModuleKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/dsl/ScopeDSL;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<ScopeDSL, Unit> {
        public final /* synthetic */ Function0<Spo2DeviceApi> a;
        public final /* synthetic */ Function0<JumpToDetectSettingUseCase> b;
        public final /* synthetic */ Function0<BloodOxygenConfig> c;

        /* JADX INFO: renamed from: com.huami.bloodoxygen.zepp.koin.ZeppBloodOxygenModuleKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bloodoxygen/core/usecase/osaevent/GetDifficultBreathListFlowUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0300a extends Lambda implements Function2<Scope, ParametersHolder, GetDifficultBreathListFlowUseCase> {
            public static final C0300a a = new C0300a();

            public C0300a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GetDifficultBreathListFlowUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new GetDifficultBreathListFlowUseCase((IBloodOxygenRepo) scope.get(Reflection.getOrCreateKotlinClass(IBloodOxygenRepo.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bloodoxygen/ui/vo/DetailUIConfig;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function2<Scope, ParametersHolder, DetailUIConfig> {
            public static final b a = new b();

            public b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DetailUIConfig invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new DetailUIConfig(true, true, false, false, 12, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bloodoxygen/core/usecase/clickspo2/SaveManualClickSpo2UseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function2<Scope, ParametersHolder, SaveManualClickSpo2UseCase> {
            public static final c a = new c();

            public c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SaveManualClickSpo2UseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SaveManualClickSpo2UseCase(((BloodOxygenConfig) scope.get(Reflection.getOrCreateKotlinClass(BloodOxygenConfig.class), null, null)).getUserId(), (IUploader) scope.get(Reflection.getOrCreateKotlinClass(IUploader.class), null, null), ((BloodOxygenConfig) scope.get(Reflection.getOrCreateKotlinClass(BloodOxygenConfig.class), null, null)).isSyncDataEnable(), (IBloodOxygenRepo) scope.get(Reflection.getOrCreateKotlinClass(IBloodOxygenRepo.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lkotlin/Function0;", "Lcom/huami/bloodoxygen/ui/usecase/JumpToDetectSettingUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function2<Scope, ParametersHolder, Function0<? extends JumpToDetectSettingUseCase>> {
            public final /* synthetic */ Function0<JumpToDetectSettingUseCase> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public d(Function0<? extends JumpToDetectSettingUseCase> function0) {
                super(2);
                this.a = function0;
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Function0<JumpToDetectSettingUseCase> invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return this.a;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bloodoxygen/bluetooth/sync/Spo2DeviceApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function2<Scope, ParametersHolder, Spo2DeviceApi> {
            public final /* synthetic */ Function0<Spo2DeviceApi> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public e(Function0<? extends Spo2DeviceApi> function0) {
                super(2);
                this.a = function0;
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Spo2DeviceApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return this.a.getA();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bloodoxygen/ui/usecase/JumpToDetectSettingUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class f extends Lambda implements Function2<Scope, ParametersHolder, JumpToDetectSettingUseCase> {
            public final /* synthetic */ Function0<JumpToDetectSettingUseCase> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public f(Function0<? extends JumpToDetectSettingUseCase> function0) {
                super(2);
                this.a = function0;
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final JumpToDetectSettingUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return this.a.getA();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bloodoxygen/core/koin/BloodOxygenConfig;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class g extends Lambda implements Function2<Scope, ParametersHolder, BloodOxygenConfig> {
            public final /* synthetic */ Function0<BloodOxygenConfig> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(Function0<BloodOxygenConfig> function0) {
                super(2);
                this.a = function0;
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BloodOxygenConfig invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return this.a.getA();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bloodoxygen/zepp/usecase/MigrateSpo2DataUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class h extends Lambda implements Function2<Scope, ParametersHolder, MigrateSpo2DataUseCase> {
            public static final h a = new h();

            public h() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final MigrateSpo2DataUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new MigrateSpo2DataUseCase((KvKey) scope.get(Reflection.getOrCreateKotlinClass(KvKey.class), null, null), (IUploader) scope.get(Reflection.getOrCreateKotlinClass(IUploader.class), null, null), ((BloodOxygenConfig) scope.get(Reflection.getOrCreateKotlinClass(BloodOxygenConfig.class), null, null)).isSyncDataEnable());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bloodoxygen/core/usecase/odi/GetRemoteSleepBreathScoreListUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class i extends Lambda implements Function2<Scope, ParametersHolder, GetRemoteSleepBreathScoreListUseCase> {
            public static final i a = new i();

            public i() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GetRemoteSleepBreathScoreListUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new GetRemoteSleepBreathScoreListUseCase((IBloodOxygenRepo) scope.get(Reflection.getOrCreateKotlinClass(IBloodOxygenRepo.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bloodoxygen/core/usecase/odi/GetLatestSleepBreathScoreFlowUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class j extends Lambda implements Function2<Scope, ParametersHolder, GetLatestSleepBreathScoreFlowUseCase> {
            public static final j a = new j();

            public j() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GetLatestSleepBreathScoreFlowUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new GetLatestSleepBreathScoreFlowUseCase((IBloodOxygenRepo) scope.get(Reflection.getOrCreateKotlinClass(IBloodOxygenRepo.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bloodoxygen/core/usecase/odi/GetSleepBreathScoreListFlowUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class k extends Lambda implements Function2<Scope, ParametersHolder, GetSleepBreathScoreListFlowUseCase> {
            public static final k a = new k();

            public k() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GetSleepBreathScoreListFlowUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new GetSleepBreathScoreListFlowUseCase((IBloodOxygenRepo) scope.get(Reflection.getOrCreateKotlinClass(IBloodOxygenRepo.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bloodoxygen/core/usecase/odi/GetSleepBreathScoreUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class l extends Lambda implements Function2<Scope, ParametersHolder, GetSleepBreathScoreUseCase> {
            public static final l a = new l();

            public l() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GetSleepBreathScoreUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new GetSleepBreathScoreUseCase((IBloodOxygenRepo) scope.get(Reflection.getOrCreateKotlinClass(IBloodOxygenRepo.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bloodoxygen/core/usecase/odi/GetSleepBreathScoreFlowUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class m extends Lambda implements Function2<Scope, ParametersHolder, GetSleepBreathScoreFlowUseCase> {
            public static final m a = new m();

            public m() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GetSleepBreathScoreFlowUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new GetSleepBreathScoreFlowUseCase((IBloodOxygenRepo) scope.get(Reflection.getOrCreateKotlinClass(IBloodOxygenRepo.class), null, null));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function0<? extends Spo2DeviceApi> function0, Function0<? extends JumpToDetectSettingUseCase> function1, Function0<BloodOxygenConfig> function2) {
            super(1);
            this.a = function0;
            this.b = function1;
            this.c = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ScopeDSL scopeDSL) {
            invoke2(scopeDSL);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull ScopeDSL scopeDSL) {
            e eVar = new e(this.a);
            Kind kind = Kind.Scoped;
            BeanDefinition beanDefinition = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(Spo2DeviceApi.class), null, eVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(beanDefinition);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey, scopedInstanceFactory, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory);
            f fVar = new f(this.b);
            BeanDefinition beanDefinition2 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(JumpToDetectSettingUseCase.class), null, fVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory2 = new ScopedInstanceFactory(beanDefinition2);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey2, scopedInstanceFactory2, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory2);
            g gVar = new g(this.c);
            BeanDefinition beanDefinition3 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(BloodOxygenConfig.class), null, gVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory3 = new ScopedInstanceFactory(beanDefinition3);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey3, scopedInstanceFactory3, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory3);
            h hVar = h.a;
            BeanDefinition beanDefinition4 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(MigrateSpo2DataUseCase.class), null, hVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory4 = new ScopedInstanceFactory(beanDefinition4);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey4, scopedInstanceFactory4, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory4);
            i iVar = i.a;
            BeanDefinition beanDefinition5 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(GetRemoteSleepBreathScoreListUseCase.class), null, iVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey5 = BeanDefinitionKt.indexKey(beanDefinition5.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory5 = new ScopedInstanceFactory(beanDefinition5);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey5, scopedInstanceFactory5, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory5);
            j jVar = j.a;
            BeanDefinition beanDefinition6 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(GetLatestSleepBreathScoreFlowUseCase.class), null, jVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey6 = BeanDefinitionKt.indexKey(beanDefinition6.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory6 = new ScopedInstanceFactory(beanDefinition6);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey6, scopedInstanceFactory6, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory6);
            k kVar = k.a;
            BeanDefinition beanDefinition7 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(GetSleepBreathScoreListFlowUseCase.class), null, kVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey7 = BeanDefinitionKt.indexKey(beanDefinition7.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory7 = new ScopedInstanceFactory(beanDefinition7);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey7, scopedInstanceFactory7, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory7);
            l lVar = l.a;
            BeanDefinition beanDefinition8 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(GetSleepBreathScoreUseCase.class), null, lVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey8 = BeanDefinitionKt.indexKey(beanDefinition8.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory8 = new ScopedInstanceFactory(beanDefinition8);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey8, scopedInstanceFactory8, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory8);
            m mVar = m.a;
            BeanDefinition beanDefinition9 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(GetSleepBreathScoreFlowUseCase.class), null, mVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey9 = BeanDefinitionKt.indexKey(beanDefinition9.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory9 = new ScopedInstanceFactory(beanDefinition9);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey9, scopedInstanceFactory9, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory9);
            C0300a c0300a = C0300a.a;
            BeanDefinition beanDefinition10 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(GetDifficultBreathListFlowUseCase.class), null, c0300a, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey10 = BeanDefinitionKt.indexKey(beanDefinition10.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory10 = new ScopedInstanceFactory(beanDefinition10);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey10, scopedInstanceFactory10, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory10);
            b bVar = b.a;
            BeanDefinition beanDefinition11 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(DetailUIConfig.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey11 = BeanDefinitionKt.indexKey(beanDefinition11.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory11 = new ScopedInstanceFactory(beanDefinition11);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey11, scopedInstanceFactory11, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory11);
            c cVar = c.a;
            BeanDefinition beanDefinition12 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(SaveManualClickSpo2UseCase.class), null, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey12 = BeanDefinitionKt.indexKey(beanDefinition12.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory12 = new ScopedInstanceFactory(beanDefinition12);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey12, scopedInstanceFactory12, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory12);
            d dVar = new d(this.b);
            BeanDefinition beanDefinition13 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(Function0.class), null, dVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey13 = BeanDefinitionKt.indexKey(beanDefinition13.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory13 = new ScopedInstanceFactory(beanDefinition13);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey13, scopedInstanceFactory13, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory13);
            BloodOxygenModuleKt.getBloodOxygenDefaultScopeSet().invoke(scopeDSL);
            BloodOxygenUiModuleKt.getBloodOxygenUiScopeSet().invoke(scopeDSL);
            BloodOxygenBleScopeSetKt.getBloodOxygenBleScopeSet().invoke(scopeDSL);
        }
    }

    @NotNull
    public static final Module getZeppBloodOxygenModule(@NotNull Function0<? extends Spo2DeviceApi> function0, @NotNull Function0<BloodOxygenConfig> function1, @NotNull Function0<? extends JumpToDetectSettingUseCase> function2) {
        return BloodOxygenModuleKt.bloodOxygenModule(new a(function0, function2, function1));
    }
}
