package com.xiaomi.hm.health.relation;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.relatives.FriendsAndFamilyService;
import com.xiaomi.hm.health.push.Type;
import com.xiaomi.hm.health.relation.message.CareMessage;
import com.xiaomi.hm.health.relation.message.FollowMessage;
import com.xiaomi.hm.health.relation.message.UnfollowMessage;
import com.xiaomi.hm.health.relation.serviceImpl.FriendsAndFamilyServiceImpl;
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
import org.json.JSONObject;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleKt;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u0006\"\u0019\u0010\u0005\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0019\u0010\b\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\u0004\"\u0019\u0010\u000b\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0004\"\u0019\u0010\u000e\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0004\"\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00000\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getCareMessageModule", "()Lorg/koin/core/module/Module;", "careMessageModule", "b", "getFollowMessage", "followMessage", "c", "getCancelFollowMessage", "cancelFollowMessage", GoogleApiAvailabilityLight.a, "getFriendsAndFamilyServiceImpl", "friendsAndFamilyServiceImpl", "", "e", "Ljava/util/List;", "getRelationModule", "()Ljava/util/List;", "relationModule", "relatives_release"}, k = 2, mv = {1, 5, 1})
public final class ModuleFactoryKt {

    @NotNull
    private static final Module a;

    @NotNull
    private static final Module b;

    @NotNull
    private static final Module c;

    @NotNull
    private static final Module d;

    @NotNull
    private static final List<Module> e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Module, Unit> {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.xiaomi.hm.health.relation.ModuleFactoryKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "<name for destructuring parameter 0>", "Lcom/xiaomi/hm/health/relation/message/UnfollowMessage;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0991a extends Lambda implements Function2<Scope, ParametersHolder, UnfollowMessage> {
            public static final C0991a a = new C0991a();

            public C0991a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final UnfollowMessage invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new UnfollowMessage((Context) parametersHolder.elementAt(0, Reflection.getOrCreateKotlinClass(Context.class)), ((Number) parametersHolder.elementAt(1, Reflection.getOrCreateKotlinClass(Long.class))).longValue(), ((Number) parametersHolder.elementAt(2, Reflection.getOrCreateKotlinClass(Long.class))).longValue(), (JSONObject) parametersHolder.elementAt(3, Reflection.getOrCreateKotlinClass(JSONObject.class)));
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
            StringQualifier stringQualifierNamed = QualifierKt.named("cancelFollow");
            C0991a c0991a = C0991a.a;
            StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
            BeanDefinition beanDefinition = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(UnfollowMessage.class), stringQualifierNamed, c0991a, Kind.Factory, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), stringQualifierNamed, rootScopeQualifier);
            FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, factoryInstanceFactory, false, 4, null);
            new Pair(module, factoryInstanceFactory);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Module, Unit> {
        public static final b a = new b();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "<name for destructuring parameter 0>", "Lcom/xiaomi/hm/health/relation/message/CareMessage;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function2<Scope, ParametersHolder, CareMessage> {
            public static final a a = new a();

            public a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CareMessage invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new CareMessage((Context) parametersHolder.elementAt(0, Reflection.getOrCreateKotlinClass(Context.class)), ((Number) parametersHolder.elementAt(1, Reflection.getOrCreateKotlinClass(Long.class))).longValue(), ((Number) parametersHolder.elementAt(2, Reflection.getOrCreateKotlinClass(Long.class))).longValue(), (JSONObject) parametersHolder.elementAt(3, Reflection.getOrCreateKotlinClass(JSONObject.class)));
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
            StringQualifier stringQualifierNamed = QualifierKt.named(Type.CARE_MESSAGE);
            a aVar = a.a;
            StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
            BeanDefinition beanDefinition = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(CareMessage.class), stringQualifierNamed, aVar, Kind.Factory, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), stringQualifierNamed, rootScopeQualifier);
            FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, factoryInstanceFactory, false, 4, null);
            new Pair(module, factoryInstanceFactory);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<Module, Unit> {
        public static final c a = new c();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "<name for destructuring parameter 0>", "Lcom/xiaomi/hm/health/relation/message/FollowMessage;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function2<Scope, ParametersHolder, FollowMessage> {
            public static final a a = new a();

            public a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final FollowMessage invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new FollowMessage((Context) parametersHolder.elementAt(0, Reflection.getOrCreateKotlinClass(Context.class)), ((Number) parametersHolder.elementAt(1, Reflection.getOrCreateKotlinClass(Long.class))).longValue(), ((Number) parametersHolder.elementAt(2, Reflection.getOrCreateKotlinClass(Long.class))).longValue(), (JSONObject) parametersHolder.elementAt(3, Reflection.getOrCreateKotlinClass(JSONObject.class)));
            }
        }

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Module module) {
            invoke2(module);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Module module) {
            StringQualifier stringQualifierNamed = QualifierKt.named(Type.FOLLOW_MESSAGE);
            a aVar = a.a;
            StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
            BeanDefinition beanDefinition = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(FollowMessage.class), stringQualifierNamed, aVar, Kind.Factory, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), stringQualifierNamed, rootScopeQualifier);
            FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, factoryInstanceFactory, false, 4, null);
            new Pair(module, factoryInstanceFactory);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<Module, Unit> {
        public static final d a = new d();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/relatives/FriendsAndFamilyService;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function2<Scope, ParametersHolder, FriendsAndFamilyService> {
            public static final a a = new a();

            public a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final FriendsAndFamilyService invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new FriendsAndFamilyServiceImpl();
            }
        }

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Module module) {
            invoke2(module);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Module module) {
            a aVar = a.a;
            StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
            BeanDefinition beanDefinition = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(FriendsAndFamilyService.class), null, aVar, Kind.Factory, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, rootScopeQualifier);
            FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, factoryInstanceFactory, false, 4, null);
            new Pair(module, factoryInstanceFactory);
        }
    }

    static {
        Module moduleModule$default = ModuleKt.module$default(false, b.a, 1, null);
        a = moduleModule$default;
        Module moduleModule$default2 = ModuleKt.module$default(false, c.a, 1, null);
        b = moduleModule$default2;
        Module moduleModule$default3 = ModuleKt.module$default(false, a.a, 1, null);
        c = moduleModule$default3;
        Module moduleModule$default4 = ModuleKt.module$default(false, d.a, 1, null);
        d = moduleModule$default4;
        e = CollectionsKt__CollectionsKt.listOf((Object[]) new Module[]{moduleModule$default, moduleModule$default2, moduleModule$default3, moduleModule$default4});
    }

    @NotNull
    public static final Module getCancelFollowMessage() {
        return c;
    }

    @NotNull
    public static final Module getCareMessageModule() {
        return a;
    }

    @NotNull
    public static final Module getFollowMessage() {
        return b;
    }

    @NotNull
    public static final Module getFriendsAndFamilyServiceImpl() {
        return d;
    }

    @NotNull
    public static final List<Module> getRelationModule() {
        return e;
    }
}
