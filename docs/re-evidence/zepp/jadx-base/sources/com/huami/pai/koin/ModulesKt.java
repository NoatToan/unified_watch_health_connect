package com.huami.pai.koin;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.pai.coroutine.PaiCoroutineScope;
import com.huami.pai.db.PaiDb;
import com.huami.pai.dc.remote.userevent.IPaiEventApi;
import com.huami.pai.dc.remote.userevent.PaiEventApi;
import com.huami.pai.dto.HttpUserInfo;
import com.huami.pai.dto.IHttpUserInfoManager;
import com.huami.pai.dto.Myself;
import com.huami.pai.ext.HashExKt;
import com.huami.pai.repository.AppExecutors;
import com.huami.pai.repository.AppExecutorsImpl;
import com.huami.pai.repository.PaiRepo;
import com.huami.pai.repository.detail.FitnessAgeRepo;
import com.huami.pai.repository.detail.FitnessAgeRepoImpl;
import com.huami.pai.service.IPaiUiService;
import com.huami.pai.service.PaiServiceImp;
import com.huami.pai.service.PaiUiService;
import com.huami.pai.sp.PaiInnerSharedPref;
import com.huami.pai.ui.detail.FitnessAgeViewModel;
import com.huami.pai.ui.history.PAIBaseRepo;
import com.huami.pai.ui.history.PAIHistroyRepo;
import com.huami.pai.vo.PAIDataVo;
import com.huami.pai.web.IPaiWebApi;
import com.huami.pai_service.PaiService;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.instance.ScopedInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleKt;
import org.koin.dsl.ScopeDSL;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\b\u0006\u001a#\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004\u001a(\u0010\u000b\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0007\u0018\u0001*\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0086\b¢\u0006\u0004\b\u000b\u0010\f\"\u0019\u0010\u0011\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0019\u0010\u0014\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010\"\u0019\u0010\u0017\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010\"\u001f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00000\u00188\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lorg/koin/core/module/Module;", "Lkotlin/Function1;", "Lorg/koin/dsl/ScopeDSL;", "", "Lkotlin/ExtensionFunctionType;", "scopeSet", "scopePai", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/koin/core/scope/Scope;", "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "getInPai", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/qualifier/Qualifier;)Ljava/lang/Object;", "a", "Lorg/koin/core/module/Module;", "getPaiModule", "()Lorg/koin/core/module/Module;", "paiModule", "b", "getPaiViewModelModule", "paiViewModelModule", "c", "getPaiRepositoryModule", "paiRepositoryModule", "", GoogleApiAvailabilityLight.a, "[Lorg/koin/core/module/Module;", "getPaiInternalModules", "()[Lorg/koin/core/module/Module;", "paiInternalModules", "lib_release"}, k = 2, mv = {1, 5, 1})
public final class ModulesKt {

    @NotNull
    private static final Module a;

    @NotNull
    private static final Module b;

    @NotNull
    private static final Module c;

    @NotNull
    private static final Module[] d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Module, Unit> {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.huami.pai.koin.ModulesKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/dsl/ScopeDSL;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0520a extends Lambda implements Function1<ScopeDSL, Unit> {
            public static final C0520a a = new C0520a();

            /* JADX INFO: renamed from: com.huami.pai.koin.ModulesKt$a$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/pai/repository/AppExecutors;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0521a extends Lambda implements Function2<Scope, ParametersHolder, AppExecutors> {
                public static final C0521a a = new C0521a();

                public C0521a() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final AppExecutors invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new AppExecutorsImpl();
                }
            }

            /* JADX INFO: renamed from: com.huami.pai.koin.ModulesKt$a$a$b */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/pai/db/PaiDb;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function2<Scope, ParametersHolder, PaiDb> {
                public static final b a = new b();

                public b() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final PaiDb invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    String userId;
                    HttpUserInfo userInfo = ((IHttpUserInfoManager) ScopesAndQualifersKt.paiScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(IHttpUserInfoManager.class), null, null)).getUserInfo();
                    String str = "default";
                    if (userInfo != null && (userId = userInfo.getUserId()) != null) {
                        str = userId;
                    }
                    return PaiDb.INSTANCE.create(ModuleExtKt.androidContext(scope), "pai_" + HashExKt.md5(str) + ".db");
                }
            }

            /* JADX INFO: renamed from: com.huami.pai.koin.ModulesKt$a$a$c */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/pai/ui/history/PAIHistroyRepo;", "Lcom/huami/pai/vo/PAIDataVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class c extends Lambda implements Function2<Scope, ParametersHolder, PAIHistroyRepo<PAIDataVo>> {
                public static final c a = new c();

                public c() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final PAIHistroyRepo<PAIDataVo> invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new PAIHistroyRepo<>((PAIBaseRepo) ScopesAndQualifersKt.paiScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(PAIBaseRepo.class), null, null), (PaiDb) ScopesAndQualifersKt.paiScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(PaiDb.class), null, null), (CoroutineScope) ScopesAndQualifersKt.paiScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(PaiCoroutineScope.class), null, null));
                }
            }

            /* JADX INFO: renamed from: com.huami.pai.koin.ModulesKt$a$a$d */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/pai/coroutine/PaiCoroutineScope;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class d extends Lambda implements Function2<Scope, ParametersHolder, PaiCoroutineScope> {
                public static final d a = new d();

                public d() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final PaiCoroutineScope invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new PaiCoroutineScope();
                }
            }

            /* JADX INFO: renamed from: com.huami.pai.koin.ModulesKt$a$a$e */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/pai/dc/remote/userevent/IPaiEventApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class e extends Lambda implements Function2<Scope, ParametersHolder, IPaiEventApi> {
                public static final e a = new e();

                public e() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final IPaiEventApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new PaiEventApi();
                }
            }

            /* JADX INFO: renamed from: com.huami.pai.koin.ModulesKt$a$a$f */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/pai/repository/PaiRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class f extends Lambda implements Function2<Scope, ParametersHolder, PaiRepo> {
                public static final f a = new f();

                public f() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final PaiRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new PaiRepo((IPaiEventApi) ScopesAndQualifersKt.paiScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(IPaiEventApi.class), null, null), (IHttpUserInfoManager) ScopesAndQualifersKt.paiScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(IHttpUserInfoManager.class), null, null));
                }
            }

            /* JADX INFO: renamed from: com.huami.pai.koin.ModulesKt$a$a$g */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/pai_service/PaiService;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class g extends Lambda implements Function2<Scope, ParametersHolder, PaiService> {
                public static final g a = new g();

                public g() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final PaiService invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new PaiServiceImp((PaiDb) ScopesAndQualifersKt.paiScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(PaiDb.class), null, null));
                }
            }

            /* JADX INFO: renamed from: com.huami.pai.koin.ModulesKt$a$a$h */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/pai/sp/PaiInnerSharedPref;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class h extends Lambda implements Function2<Scope, ParametersHolder, PaiInnerSharedPref> {
                public static final h a = new h();

                public h() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final PaiInnerSharedPref invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new PaiInnerSharedPref();
                }
            }

            /* JADX INFO: renamed from: com.huami.pai.koin.ModulesKt$a$a$i */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/pai/service/IPaiUiService;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class i extends Lambda implements Function2<Scope, ParametersHolder, IPaiUiService> {
                public static final i a = new i();

                public i() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final IPaiUiService invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new PaiUiService();
                }
            }

            public C0520a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ScopeDSL scopeDSL) {
                invoke2(scopeDSL);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ScopeDSL scopeDSL) {
                C0521a c0521a = C0521a.a;
                Kind kind = Kind.Scoped;
                BeanDefinition beanDefinition = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(AppExecutors.class), null, c0521a, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(beanDefinition);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey, scopedInstanceFactory, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory);
                b bVar = b.a;
                BeanDefinition beanDefinition2 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(PaiDb.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory2 = new ScopedInstanceFactory(beanDefinition2);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey2, scopedInstanceFactory2, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory2);
                c cVar = c.a;
                BeanDefinition beanDefinition3 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(PAIHistroyRepo.class), null, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory3 = new ScopedInstanceFactory(beanDefinition3);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey3, scopedInstanceFactory3, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory3);
                d dVar = d.a;
                BeanDefinition beanDefinition4 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(PaiCoroutineScope.class), null, dVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory4 = new ScopedInstanceFactory(beanDefinition4);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey4, scopedInstanceFactory4, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory4);
                e eVar = e.a;
                BeanDefinition beanDefinition5 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(IPaiEventApi.class), null, eVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey5 = BeanDefinitionKt.indexKey(beanDefinition5.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory5 = new ScopedInstanceFactory(beanDefinition5);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey5, scopedInstanceFactory5, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory5);
                f fVar = f.a;
                BeanDefinition beanDefinition6 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(PaiRepo.class), null, fVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey6 = BeanDefinitionKt.indexKey(beanDefinition6.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory6 = new ScopedInstanceFactory(beanDefinition6);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey6, scopedInstanceFactory6, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory6);
                g gVar = g.a;
                BeanDefinition beanDefinition7 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(PaiService.class), null, gVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey7 = BeanDefinitionKt.indexKey(beanDefinition7.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory7 = new ScopedInstanceFactory(beanDefinition7);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey7, scopedInstanceFactory7, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory7);
                h hVar = h.a;
                BeanDefinition beanDefinition8 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(PaiInnerSharedPref.class), null, hVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey8 = BeanDefinitionKt.indexKey(beanDefinition8.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory8 = new ScopedInstanceFactory(beanDefinition8);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey8, scopedInstanceFactory8, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory8);
                i iVar = i.a;
                BeanDefinition beanDefinition9 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(IPaiUiService.class), null, iVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey9 = BeanDefinitionKt.indexKey(beanDefinition9.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory9 = new ScopedInstanceFactory(beanDefinition9);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey9, scopedInstanceFactory9, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory9);
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
            ModulesKt.scopePai(module, C0520a.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Module, Unit> {
        public static final b a = new b();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/pai/repository/detail/FitnessAgeRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function2<Scope, ParametersHolder, FitnessAgeRepo> {
            public static final a a = new a();

            public a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final FitnessAgeRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new FitnessAgeRepoImpl((AppExecutors) ScopesAndQualifersKt.paiScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(AppExecutors.class), null, null), (PaiDb) ScopesAndQualifersKt.paiScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(PaiDb.class), null, null), (IPaiWebApi) ScopesAndQualifersKt.paiScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(IPaiWebApi.class), null, null));
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
            a aVar = a.a;
            StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
            BeanDefinition beanDefinition = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(FitnessAgeRepo.class), null, aVar, Kind.Factory, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, rootScopeQualifier);
            FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, factoryInstanceFactory, false, 4, null);
            new Pair(module, factoryInstanceFactory);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<Module, Unit> {
        public static final c a = new c();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/pai/ui/detail/FitnessAgeViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function2<Scope, ParametersHolder, FitnessAgeViewModel> {
            public static final a a = new a();

            public a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final FitnessAgeViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new FitnessAgeViewModel((Myself) ScopesAndQualifersKt.paiScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(Myself.class), null, null), (FitnessAgeRepo) scope.get(Reflection.getOrCreateKotlinClass(FitnessAgeRepo.class), null, null));
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
            a aVar = a.a;
            StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
            BeanDefinition beanDefinition = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(FitnessAgeViewModel.class), null, aVar, Kind.Factory, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, rootScopeQualifier);
            FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, factoryInstanceFactory, false, 4, null);
            new Pair(module, factoryInstanceFactory);
        }
    }

    static {
        Module moduleModule$default = ModuleKt.module$default(false, a.a, 1, null);
        a = moduleModule$default;
        Module moduleModule$default2 = ModuleKt.module$default(false, c.a, 1, null);
        b = moduleModule$default2;
        Module moduleModule$default3 = ModuleKt.module$default(false, b.a, 1, null);
        c = moduleModule$default3;
        d = new Module[]{moduleModule$default, moduleModule$default2, moduleModule$default3};
    }

    public static final /* synthetic */ <T> T getInPai(Scope scope, Qualifier qualifier) {
        Scope scopePaiScope = ScopesAndQualifersKt.paiScope(scope.getKoin());
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) scopePaiScope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, null);
    }

    public static /* synthetic */ Object getInPai$default(Scope scope, Qualifier qualifier, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        Scope scopePaiScope = ScopesAndQualifersKt.paiScope(scope.getKoin());
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return scopePaiScope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, null);
    }

    @NotNull
    public static final Module[] getPaiInternalModules() {
        return d;
    }

    @NotNull
    public static final Module getPaiModule() {
        return a;
    }

    @NotNull
    public static final Module getPaiRepositoryModule() {
        return c;
    }

    @NotNull
    public static final Module getPaiViewModelModule() {
        return b;
    }

    public static final void scopePai(@NotNull Module module, @NotNull Function1<? super ScopeDSL, Unit> function1) {
        module.scope(QualifierKt.named(PaiScopeNames.PAI), function1);
    }
}
