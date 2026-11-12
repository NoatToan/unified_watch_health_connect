package com.huami.bloodpressure_ui;

import com.huami.bloodpressure_core.dc.local.ILocalDelegate;
import com.huami.bloodpressure_core.di.BloodPressureModuleKt;
import com.huami.bloodpressure_core.di.KoinExKt;
import com.huami.bloodpressure_core.repo.BloodPressureLogicRepo;
import com.huami.bloodpressure_core.repo.IBloodPressureRepo;
import com.huami.bloodpressure_ui.usercase.BloodPressureLogicRepoUserCase;
import java.util.ArrayList;
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
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleKt;
import org.koin.dsl.ScopeDSL;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0019\u0010\u0005\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\")\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00000\u0006j\b\u0012\u0004\u0012\u00020\u0000`\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getBloodPressureUIModule", "()Lorg/koin/core/module/Module;", "bloodPressureUIModule", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "b", "Ljava/util/ArrayList;", "getBloodPressureModuleInter", "()Ljava/util/ArrayList;", "bloodPressureModuleInter", "bloodpressure-ui_release"}, k = 2, mv = {1, 5, 1})
public final class BloodPressureUIModuleKt {

    @NotNull
    private static final Module a = ModuleKt.module$default(false, a.a, 1, null);

    @NotNull
    private static final ArrayList<Module> b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Module, Unit> {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.huami.bloodpressure_ui.BloodPressureUIModuleKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/dsl/ScopeDSL;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0303a extends Lambda implements Function1<ScopeDSL, Unit> {
            public static final C0303a a = new C0303a();

            /* JADX INFO: renamed from: com.huami.bloodpressure_ui.BloodPressureUIModuleKt$a$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bloodpressure_ui/usercase/BloodPressureLogicRepoUserCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0304a extends Lambda implements Function2<Scope, ParametersHolder, BloodPressureLogicRepoUserCase> {
                public static final C0304a a = new C0304a();

                public C0304a() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final BloodPressureLogicRepoUserCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new BloodPressureLogicRepoUserCase(new BloodPressureLogicRepo((ILocalDelegate) KoinExKt.bloodPressureScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(ILocalDelegate.class), null, null)), (IBloodPressureRepo) KoinExKt.bloodPressureScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(IBloodPressureRepo.class), null, null));
                }
            }

            public C0303a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ScopeDSL scopeDSL) {
                invoke2(scopeDSL);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ScopeDSL scopeDSL) {
                C0304a c0304a = C0304a.a;
                Kind kind = Kind.Scoped;
                BeanDefinition beanDefinition = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(BloodPressureLogicRepoUserCase.class), null, c0304a, kind, CollectionsKt__CollectionsKt.emptyList());
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
            module.scope(QualifierKt.named(BloodPressureModuleKt.BLOODPRESSURE_SCOPE_NAME), C0303a.a);
        }
    }

    static {
        ArrayList<Module> arrayList = new ArrayList<>();
        arrayList.add(BloodPressureModuleKt.getBloodPressureModuleInterval());
        arrayList.add(getBloodPressureUIModule());
        arrayList.add(BloodPressureViewModelIntervalKt.getBloodPressureViewModelInterval());
        b = arrayList;
    }

    @NotNull
    public static final ArrayList<Module> getBloodPressureModuleInter() {
        return b;
    }

    @NotNull
    public static final Module getBloodPressureUIModule() {
        return a;
    }
}
