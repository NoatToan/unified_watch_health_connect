package com.huami.nfc.door.di;

import android.content.Context;
import com.huami.nfc.base.ApiWrapperKt;
import com.huami.nfc.base.INfcChannel;
import com.huami.nfc.door.INfcTag;
import com.huami.nfc.door.LoockAppletApiImpl;
import com.huami.nfc.door.SnowballAccessDoorApi;
import com.huami.nfc.door.SnowballAccessDoorAppletApi;
import com.huami.nfc.door.XiaomiAccessDoorAppletApi;
import com.huami.nfc.door.XiaomiDoorApi;
import com.huami.nfc.door.api.ISnowballAccessDoorApi;
import com.huami.nfc.door.api.IXiaomiDoorApi;
import com.huami.nfc.door.service.AccessDoorServer;
import com.huami.nfc.web.AccessInitRequestApiImpl;
import com.huami.nfc.web.DefaultApduScriptImpl;
import com.huami.nfc.web.InitRequestTaskImpl;
import com.huami.nfc.web.LoockInitRequestApiImpl;
import com.huami.nfc.web.server.InitRequestServer;
import com.huami.nfc.web.server.ProtocolServer;
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
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleKt;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0019\u0010\u0005\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getDoorModule", "()Lorg/koin/core/module/Module;", "doorModule", "nfc-door_release"}, k = 2, mv = {1, 5, 1})
public final class KoinKt {

    @NotNull
    private static final Module a = ModuleKt.module$default(false, a.a, 1, null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Module, Unit> {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.huami.nfc.door.di.KoinKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/nfc/door/service/AccessDoorServer;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0510a extends Lambda implements Function2<Scope, ParametersHolder, AccessDoorServer> {
            public static final C0510a a = new C0510a();

            public C0510a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AccessDoorServer invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return (AccessDoorServer) ((Retrofit) scope.get(Reflection.getOrCreateKotlinClass(Retrofit.class), null, null)).create(AccessDoorServer.class);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/nfc/door/api/ISnowballAccessDoorApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function2<Scope, ParametersHolder, ISnowballAccessDoorApi> {
            public static final b a = new b();

            /* JADX INFO: renamed from: com.huami.nfc.door.di.KoinKt$a$b$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/nfc/door/api/ISnowballAccessDoorApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0511a extends Lambda implements Function0<ISnowballAccessDoorApi> {
                public final /* synthetic */ ISnowballAccessDoorApi a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0511a(ISnowballAccessDoorApi iSnowballAccessDoorApi) {
                    super(0);
                    this.a = iSnowballAccessDoorApi;
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ISnowballAccessDoorApi getA() {
                    return this.a;
                }
            }

            public b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ISnowballAccessDoorApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                DefaultApduScriptImpl defaultApduScriptImpl = new DefaultApduScriptImpl((INfcChannel) scope.get(Reflection.getOrCreateKotlinClass(INfcChannel.class), null, null));
                return (ISnowballAccessDoorApi) ApiWrapperKt.wrapperLogAndAnalysis(false, new C0511a(new SnowballAccessDoorWrapperWithLogcat(new SnowballAccessDoorApi((INfcTag) scope.get(Reflection.getOrCreateKotlinClass(INfcTag.class), null, null), (INfcChannel) scope.get(Reflection.getOrCreateKotlinClass(INfcChannel.class), null, null), (AccessDoorServer) scope.get(Reflection.getOrCreateKotlinClass(AccessDoorServer.class), null, null), (ProtocolServer) scope.get(Reflection.getOrCreateKotlinClass(ProtocolServer.class), null, null), new SnowballAccessDoorAppletApi(new InitRequestTaskImpl(new AccessInitRequestApiImpl((InitRequestServer) scope.get(Reflection.getOrCreateKotlinClass(InitRequestServer.class), null, null)), defaultApduScriptImpl)), new LoockAppletApiImpl(new InitRequestTaskImpl(new LoockInitRequestApiImpl((InitRequestServer) scope.get(Reflection.getOrCreateKotlinClass(InitRequestServer.class), null, null)), defaultApduScriptImpl))))));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/nfc/door/api/IXiaomiDoorApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function2<Scope, ParametersHolder, IXiaomiDoorApi> {
            public static final c a = new c();

            /* JADX INFO: renamed from: com.huami.nfc.door.di.KoinKt$a$c$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/nfc/door/api/IXiaomiDoorApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0512a extends Lambda implements Function0<IXiaomiDoorApi> {
                public final /* synthetic */ IXiaomiDoorApi a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0512a(IXiaomiDoorApi iXiaomiDoorApi) {
                    super(0);
                    this.a = iXiaomiDoorApi;
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final IXiaomiDoorApi getA() {
                    return this.a;
                }
            }

            public c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IXiaomiDoorApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return (IXiaomiDoorApi) ApiWrapperKt.wrapperLogAndAnalysis(false, new C0512a(new XiaomAccessDoorWrapperWithLogcat(new XiaomiDoorNetworkWrapper((Context) scope.get(Reflection.getOrCreateKotlinClass(Context.class), null, null), new XiaomiDoorApi((INfcTag) scope.get(Reflection.getOrCreateKotlinClass(INfcTag.class), null, null), (INfcChannel) scope.get(Reflection.getOrCreateKotlinClass(INfcChannel.class), null, null), (AccessDoorServer) scope.get(Reflection.getOrCreateKotlinClass(AccessDoorServer.class), null, null), (ProtocolServer) scope.get(Reflection.getOrCreateKotlinClass(ProtocolServer.class), null, null), new XiaomiAccessDoorAppletApi(new InitRequestTaskImpl(new AccessInitRequestApiImpl((InitRequestServer) scope.get(Reflection.getOrCreateKotlinClass(InitRequestServer.class), null, null)), new DefaultApduScriptImpl((INfcChannel) scope.get(Reflection.getOrCreateKotlinClass(INfcChannel.class), null, null)))))))));
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
            C0510a c0510a = C0510a.a;
            Kind kind = Kind.Singleton;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            BeanDefinition beanDefinition = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AccessDoorServer.class), null, c0510a, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, singleInstanceFactory, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory);
            }
            new Pair(module, singleInstanceFactory);
            b bVar = b.a;
            BeanDefinition beanDefinition2 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ISnowballAccessDoorApi.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory2 = new SingleInstanceFactory<>(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, singleInstanceFactory2, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory2);
            }
            new Pair(module, singleInstanceFactory2);
            c cVar = c.a;
            BeanDefinition beanDefinition3 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(IXiaomiDoorApi.class), null, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory3 = new SingleInstanceFactory<>(beanDefinition3);
            Module.saveMapping$default(module, strIndexKey3, singleInstanceFactory3, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory3);
            }
            new Pair(module, singleInstanceFactory3);
        }
    }

    @NotNull
    public static final Module getDoorModule() {
        return a;
    }
}
