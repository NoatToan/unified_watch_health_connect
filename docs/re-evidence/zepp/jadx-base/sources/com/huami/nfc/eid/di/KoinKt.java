package com.huami.nfc.eid.di;

import com.huami.nfc.base.ApiWrapperKt;
import com.huami.nfc.base.INfcChannel;
import com.huami.nfc.eid.EidAppletApiImpl;
import com.huami.nfc.eid.EidDeviceApiWithLog;
import com.huami.nfc.eid.EidWebApiImpl;
import com.huami.nfc.eid.EidWebApiWithLog;
import com.huami.nfc.eid.PostResultApiImpl;
import com.huami.nfc.eid.PostResultApiWithLog;
import com.huami.nfc.eid.api.EidDeviceApi;
import com.huami.nfc.eid.api.EidWebApi;
import com.huami.nfc.web.DefaultApduScriptImpl;
import com.huami.nfc.web.EidInitRequestApiImpl;
import com.huami.nfc.web.InitRequestTaskImpl;
import com.huami.nfc.web.server.InitRequestServer;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0019\u0010\u0005\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getEidModule", "()Lorg/koin/core/module/Module;", "eidModule", "nfc-eid_release"}, k = 2, mv = {1, 5, 1})
public final class KoinKt {

    @NotNull
    private static final Module a = ModuleKt.module$default(false, a.a, 1, null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Module, Unit> {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.huami.nfc.eid.di.KoinKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/nfc/eid/api/EidWebApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0513a extends Lambda implements Function2<Scope, ParametersHolder, EidWebApi> {
            public static final C0513a a = new C0513a();

            /* JADX INFO: renamed from: com.huami.nfc.eid.di.KoinKt$a$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/nfc/eid/api/EidWebApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0514a extends Lambda implements Function0<EidWebApi> {
                public final /* synthetic */ EidWebApi a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0514a(EidWebApi eidWebApi) {
                    super(0);
                    this.a = eidWebApi;
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final EidWebApi getA() {
                    return this.a;
                }
            }

            public C0513a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final EidWebApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return (EidWebApi) ApiWrapperKt.wrapperLog$default(false, new C0514a(new EidWebApiWithLog(new EidWebApiImpl(new PostResultApiWithLog(new PostResultApiImpl()), new EidDeviceApiWithLog((EidDeviceApi) scope.get(Reflection.getOrCreateKotlinClass(EidDeviceApi.class), null, null)), new EidAppletApiImpl(new InitRequestTaskImpl(new EidInitRequestApiImpl((InitRequestServer) scope.get(Reflection.getOrCreateKotlinClass(InitRequestServer.class), null, null)), new DefaultApduScriptImpl((INfcChannel) scope.get(Reflection.getOrCreateKotlinClass(INfcChannel.class), null, null)))), (INfcChannel) scope.get(Reflection.getOrCreateKotlinClass(INfcChannel.class), null, null)))), 1, null);
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
            C0513a c0513a = C0513a.a;
            Kind kind = Kind.Singleton;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            BeanDefinition beanDefinition = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(EidWebApi.class), null, c0513a, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, singleInstanceFactory, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory);
            }
            new Pair(module, singleInstanceFactory);
        }
    }

    @NotNull
    public static final Module getEidModule() {
        return a;
    }
}
