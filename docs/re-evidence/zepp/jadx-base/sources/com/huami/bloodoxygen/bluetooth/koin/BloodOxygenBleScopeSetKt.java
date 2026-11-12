package com.huami.bloodoxygen.bluetooth.koin;

import com.huami.bloodoxygen.bluetooth.synctime.local.BloodOxygenSyncTimeKey;
import com.huami.bloodoxygen.bluetooth.synctime.remote.api.property.PropertyApi;
import com.huami.bloodoxygen.bluetooth.synctime.repository.BloodOxygenSyncTimeRepo;
import com.huami.bloodoxygen.bluetooth.usecase.other.BloodOxygenBleLifecycleUseCase;
import com.huami.bloodoxygen.bluetooth.usecase.other.SaveBleDataUseCase;
import com.huami.bloodoxygen.bluetooth.usecase.synctime.GetBleSyncTimeUseCase;
import com.huami.bloodoxygen.core.koin.BloodOxygenConfig;
import com.huami.bloodoxygen.core.local.config.BloodOxygenCoroutineScope;
import com.huami.bloodoxygen.core.local.process.OdiFactory;
import com.huami.bloodoxygen.core.repository.IBloodOxygenRepo;
import com.huami.utils.persistence.kvkit.KvPersistence;
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
import org.koin.core.instance.ScopedInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;
import org.koin.dsl.ScopeDSL;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\".\u0010\t\u001a\u0017\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u0002`\u0003¢\u0006\u0002\b\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lkotlin/Function1;", "Lorg/koin/dsl/ScopeDSL;", "", "Lcom/huami/bloodoxygen/core/koin/ScopeSetDeclaration;", "Lkotlin/ExtensionFunctionType;", "a", "Lkotlin/jvm/functions/Function1;", "getBloodOxygenBleScopeSet", "()Lkotlin/jvm/functions/Function1;", "bloodOxygenBleScopeSet", "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class BloodOxygenBleScopeSetKt {

    @NotNull
    private static final Function1<ScopeDSL, Unit> a = a.a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/dsl/ScopeDSL;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<ScopeDSL, Unit> {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.huami.bloodoxygen.bluetooth.koin.BloodOxygenBleScopeSetKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bloodoxygen/bluetooth/synctime/remote/api/property/PropertyApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0290a extends Lambda implements Function2<Scope, ParametersHolder, PropertyApi> {
            public static final C0290a a = new C0290a();

            public C0290a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PropertyApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new PropertyApi(((BloodOxygenConfig) scope.get(Reflection.getOrCreateKotlinClass(BloodOxygenConfig.class), null, null)).getUserId(), null, 2, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bloodoxygen/bluetooth/synctime/repository/BloodOxygenSyncTimeRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function2<Scope, ParametersHolder, BloodOxygenSyncTimeRepo> {
            public static final b a = new b();

            public b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BloodOxygenSyncTimeRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new BloodOxygenSyncTimeRepo((PropertyApi) scope.get(Reflection.getOrCreateKotlinClass(PropertyApi.class), null, null), (BloodOxygenCoroutineScope) scope.get(Reflection.getOrCreateKotlinClass(BloodOxygenCoroutineScope.class), null, null), new BloodOxygenSyncTimeKey((KvPersistence) scope.get(Reflection.getOrCreateKotlinClass(KvPersistence.class), null, null), ((BloodOxygenConfig) scope.get(Reflection.getOrCreateKotlinClass(BloodOxygenConfig.class), null, null)).getUserId()));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bloodoxygen/bluetooth/usecase/other/SaveBleDataUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function2<Scope, ParametersHolder, SaveBleDataUseCase> {
            public static final c a = new c();

            public c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SaveBleDataUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SaveBleDataUseCase((BloodOxygenSyncTimeRepo) scope.get(Reflection.getOrCreateKotlinClass(BloodOxygenSyncTimeRepo.class), null, null), (IBloodOxygenRepo) scope.get(Reflection.getOrCreateKotlinClass(IBloodOxygenRepo.class), null, null), (BloodOxygenCoroutineScope) scope.get(Reflection.getOrCreateKotlinClass(BloodOxygenCoroutineScope.class), null, null), (OdiFactory) scope.get(Reflection.getOrCreateKotlinClass(OdiFactory.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bloodoxygen/bluetooth/usecase/synctime/GetBleSyncTimeUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function2<Scope, ParametersHolder, GetBleSyncTimeUseCase> {
            public static final d a = new d();

            public d() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GetBleSyncTimeUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new GetBleSyncTimeUseCase((BloodOxygenSyncTimeRepo) scope.get(Reflection.getOrCreateKotlinClass(BloodOxygenSyncTimeRepo.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bloodoxygen/bluetooth/usecase/other/BloodOxygenBleLifecycleUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function2<Scope, ParametersHolder, BloodOxygenBleLifecycleUseCase> {
            public static final e a = new e();

            public e() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BloodOxygenBleLifecycleUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new BloodOxygenBleLifecycleUseCase((BloodOxygenSyncTimeRepo) scope.get(Reflection.getOrCreateKotlinClass(BloodOxygenSyncTimeRepo.class), null, null));
            }
        }

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ScopeDSL scopeDSL) {
            invoke2(scopeDSL);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull ScopeDSL scopeDSL) {
            C0290a c0290a = C0290a.a;
            Kind kind = Kind.Scoped;
            BeanDefinition beanDefinition = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(PropertyApi.class), null, c0290a, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(beanDefinition);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey, scopedInstanceFactory, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory);
            b bVar = b.a;
            BeanDefinition beanDefinition2 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(BloodOxygenSyncTimeRepo.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory2 = new ScopedInstanceFactory(beanDefinition2);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey2, scopedInstanceFactory2, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory2);
            c cVar = c.a;
            BeanDefinition beanDefinition3 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(SaveBleDataUseCase.class), null, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory3 = new ScopedInstanceFactory(beanDefinition3);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey3, scopedInstanceFactory3, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory3);
            d dVar = d.a;
            BeanDefinition beanDefinition4 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(GetBleSyncTimeUseCase.class), null, dVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory4 = new ScopedInstanceFactory(beanDefinition4);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey4, scopedInstanceFactory4, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory4);
            e eVar = e.a;
            BeanDefinition beanDefinition5 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(BloodOxygenBleLifecycleUseCase.class), null, eVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey5 = BeanDefinitionKt.indexKey(beanDefinition5.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory5 = new ScopedInstanceFactory(beanDefinition5);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey5, scopedInstanceFactory5, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory5);
        }
    }

    @NotNull
    public static final Function1<ScopeDSL, Unit> getBloodOxygenBleScopeSet() {
        return a;
    }
}
