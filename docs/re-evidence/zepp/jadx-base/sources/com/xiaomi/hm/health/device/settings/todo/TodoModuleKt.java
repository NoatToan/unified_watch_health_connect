package com.xiaomi.hm.health.device.settings.todo;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.pai.ext.HashExKt;
import com.huami.utils.persistence.kvkit.KvKit;
import com.xiaomi.hm.health.device.setting.DeviceCenter;
import com.xiaomi.hm.health.device.settings.todo.datasource.LocalDataSource;
import com.xiaomi.hm.health.device.settings.todo.datasource.RemoteDataSource;
import com.xiaomi.hm.health.device.settings.todo.datasource.impl.LocalDataSourceImpl;
import com.xiaomi.hm.health.device.settings.todo.datasource.impl.RemoteDataSourceImpl;
import com.xiaomi.hm.health.device.settings.todo.usecase.DeviceDataObserverUserCase;
import com.xiaomi.hm.health.device.settings.todo.usecase.FetchDeviceTodoListUseCase;
import com.xiaomi.hm.health.device.settings.todo.usecase.FetchRemoteTodoListUseCase;
import com.xiaomi.hm.health.device.settings.todo.usecase.FindLocalModifyDataUseCase;
import com.xiaomi.hm.health.device.settings.todo.usecase.LoadRestoreDataUseCase;
import com.xiaomi.hm.health.device.settings.todo.usecase.RestoreDataUseCase;
import com.xiaomi.hm.health.device.settings.todo.usecase.SyncLocalChangeToRemoteUseCase;
import com.xiaomi.hm.health.device.webapi.UserEventApi;
import java.util.Objects;
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
import org.koin.core.Koin;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.instance.ScopedInstanceFactory;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleKt;
import org.koin.dsl.ScopeDSL;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0006\u0010\u0001\u001a\u00020\u0000\"(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\"\u001c\u0010\u000f\u001a\u00020\n8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u001c\u0010\u0012\u001a\u00020\n8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000e\"\u0016\u0010\u0015\u001a\u00020\u00038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\"\u001c\u0010\u001b\u001a\u00020\u00168\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\"\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\"\u0016\u0010#\u001a\u00020 8@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"", "destroyTodoUserScope", "Lkotlin/Function0;", "", "todoUserId", "Lkotlin/jvm/functions/Function0;", "getTodoUserId", "()Lkotlin/jvm/functions/Function0;", "setTodoUserId", "(Lkotlin/jvm/functions/Function0;)V", "Lorg/koin/core/qualifier/StringQualifier;", "a", "Lorg/koin/core/qualifier/StringQualifier;", "getDATA_SOURCE_LOCAL", "()Lorg/koin/core/qualifier/StringQualifier;", "DATA_SOURCE_LOCAL", "b", "getDATA_SOURCE_REMOTE", "DATA_SOURCE_REMOTE", "c", "Ljava/lang/String;", "TODO_USER_SCOPE", "Lorg/koin/core/module/Module;", GoogleApiAvailabilityLight.a, "Lorg/koin/core/module/Module;", "getTodoModule", "()Lorg/koin/core/module/Module;", "todoModule", "Lkotlin/Function1;", "e", "Lkotlin/jvm/functions/Function1;", "storageName", "Lorg/koin/core/scope/Scope;", "getTodoUserScope", "()Lorg/koin/core/scope/Scope;", "todoUserScope", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class TodoModuleKt {

    @NotNull
    private static final String c = "todo_user_scope";
    public static Function0<String> todoUserId;

    @NotNull
    private static final StringQualifier a = QualifierKt.named("local");

    @NotNull
    private static final StringQualifier b = QualifierKt.named("remote");

    @NotNull
    private static final Module d = ModuleKt.module$default(false, b.a, 1, null);

    @NotNull
    private static final Function1<String, String> e = a.a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "suffix", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<String, String> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull String str) {
            return HashExKt.md5(((Object) TodoModuleKt.getTodoUserId().invoke()) + "_" + str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Module, Unit> {
        public static final b a = new b();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/settings/todo/datasource/RemoteDataSource;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function2<Scope, ParametersHolder, RemoteDataSource> {
            public static final a a = new a();

            public a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final RemoteDataSource invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new RemoteDataSourceImpl((UserEventApi) scope.get(Reflection.getOrCreateKotlinClass(UserEventApi.class), null, null));
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.settings.todo.TodoModuleKt$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/settings/todo/TodoListViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0883b extends Lambda implements Function2<Scope, ParametersHolder, TodoListViewModel> {
            public static final C0883b a = new C0883b();

            public C0883b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TodoListViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new TodoListViewModel((DeviceCenter) scope.get(Reflection.getOrCreateKotlinClass(DeviceCenter.class), null, null), (LocalDataSource) TodoModuleKt.getTodoUserScope().get(Reflection.getOrCreateKotlinClass(LocalDataSource.class), TodoModuleKt.getDATA_SOURCE_LOCAL(), null), (SyncLocalChangeToRemoteUseCase) TodoModuleKt.getTodoUserScope().get(Reflection.getOrCreateKotlinClass(SyncLocalChangeToRemoteUseCase.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/dsl/ScopeDSL;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function1<ScopeDSL, Unit> {
            public static final c a = new c();

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/settings/todo/datasource/LocalDataSource;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function2<Scope, ParametersHolder, LocalDataSource> {
                public static final a a = new a();

                public a() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final LocalDataSource invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new LocalDataSourceImpl(KvKit.getKvPersistence$default((String) TodoModuleKt.e.invoke("local"), false, 2, null));
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.settings.todo.TodoModuleKt$b$c$b, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/settings/todo/datasource/LocalDataSource;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0884b extends Lambda implements Function2<Scope, ParametersHolder, LocalDataSource> {
                public static final C0884b a = new C0884b();

                public C0884b() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final LocalDataSource invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new LocalDataSourceImpl(KvKit.getKvPersistence$default((String) TodoModuleKt.e.invoke("remote"), false, 2, null));
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.settings.todo.TodoModuleKt$b$c$c, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/settings/todo/usecase/DeviceDataObserverUserCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0885c extends Lambda implements Function2<Scope, ParametersHolder, DeviceDataObserverUserCase> {
                public static final C0885c a = new C0885c();

                public C0885c() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final DeviceDataObserverUserCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new DeviceDataObserverUserCase((LocalDataSource) scope.get(Reflection.getOrCreateKotlinClass(LocalDataSource.class), TodoModuleKt.getDATA_SOURCE_LOCAL(), null), (SyncLocalChangeToRemoteUseCase) scope.get(Reflection.getOrCreateKotlinClass(SyncLocalChangeToRemoteUseCase.class), null, null));
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/settings/todo/usecase/FetchDeviceTodoListUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class d extends Lambda implements Function2<Scope, ParametersHolder, FetchDeviceTodoListUseCase> {
                public static final d a = new d();

                public d() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final FetchDeviceTodoListUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new FetchDeviceTodoListUseCase((LocalDataSource) scope.get(Reflection.getOrCreateKotlinClass(LocalDataSource.class), TodoModuleKt.getDATA_SOURCE_LOCAL(), null), (SyncLocalChangeToRemoteUseCase) scope.get(Reflection.getOrCreateKotlinClass(SyncLocalChangeToRemoteUseCase.class), null, null));
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/settings/todo/usecase/FetchRemoteTodoListUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class e extends Lambda implements Function2<Scope, ParametersHolder, FetchRemoteTodoListUseCase> {
                public static final e a = new e();

                public e() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final FetchRemoteTodoListUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new FetchRemoteTodoListUseCase((RemoteDataSource) scope.get(Reflection.getOrCreateKotlinClass(RemoteDataSource.class), null, null), (LocalDataSource) scope.get(Reflection.getOrCreateKotlinClass(LocalDataSource.class), TodoModuleKt.getDATA_SOURCE_REMOTE(), null));
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/settings/todo/usecase/FindLocalModifyDataUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class f extends Lambda implements Function2<Scope, ParametersHolder, FindLocalModifyDataUseCase> {
                public static final f a = new f();

                public f() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final FindLocalModifyDataUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new FindLocalModifyDataUseCase((LocalDataSource) scope.get(Reflection.getOrCreateKotlinClass(LocalDataSource.class), TodoModuleKt.getDATA_SOURCE_LOCAL(), null), (LocalDataSource) scope.get(Reflection.getOrCreateKotlinClass(LocalDataSource.class), TodoModuleKt.getDATA_SOURCE_REMOTE(), null));
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/settings/todo/usecase/LoadRestoreDataUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class g extends Lambda implements Function2<Scope, ParametersHolder, LoadRestoreDataUseCase> {
                public static final g a = new g();

                public g() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final LoadRestoreDataUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new LoadRestoreDataUseCase((LocalDataSource) scope.get(Reflection.getOrCreateKotlinClass(LocalDataSource.class), TodoModuleKt.getDATA_SOURCE_LOCAL(), null), (FetchRemoteTodoListUseCase) scope.get(Reflection.getOrCreateKotlinClass(FetchRemoteTodoListUseCase.class), null, null));
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/settings/todo/usecase/RestoreDataUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class h extends Lambda implements Function2<Scope, ParametersHolder, RestoreDataUseCase> {
                public static final h a = new h();

                public h() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final RestoreDataUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new RestoreDataUseCase((LoadRestoreDataUseCase) scope.get(Reflection.getOrCreateKotlinClass(LoadRestoreDataUseCase.class), null, null));
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/settings/todo/usecase/SyncLocalChangeToRemoteUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class i extends Lambda implements Function2<Scope, ParametersHolder, SyncLocalChangeToRemoteUseCase> {
                public static final i a = new i();

                public i() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final SyncLocalChangeToRemoteUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new SyncLocalChangeToRemoteUseCase((RemoteDataSource) scope.get(Reflection.getOrCreateKotlinClass(RemoteDataSource.class), null, null), (LocalDataSource) scope.get(Reflection.getOrCreateKotlinClass(LocalDataSource.class), TodoModuleKt.getDATA_SOURCE_REMOTE(), null), (FindLocalModifyDataUseCase) scope.get(Reflection.getOrCreateKotlinClass(FindLocalModifyDataUseCase.class), null, null));
                }
            }

            public c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ScopeDSL scopeDSL) {
                invoke2(scopeDSL);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ScopeDSL scopeDSL) {
                StringQualifier data_source_local = TodoModuleKt.getDATA_SOURCE_LOCAL();
                a aVar = a.a;
                Kind kind = Kind.Scoped;
                BeanDefinition beanDefinition = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(LocalDataSource.class), data_source_local, aVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), data_source_local, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(beanDefinition);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey, scopedInstanceFactory, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory);
                StringQualifier data_source_remote = TodoModuleKt.getDATA_SOURCE_REMOTE();
                C0884b c0884b = C0884b.a;
                BeanDefinition beanDefinition2 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(LocalDataSource.class), data_source_remote, c0884b, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), data_source_remote, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory2 = new ScopedInstanceFactory(beanDefinition2);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey2, scopedInstanceFactory2, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory2);
                C0885c c0885c = C0885c.a;
                BeanDefinition beanDefinition3 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(DeviceDataObserverUserCase.class), null, c0885c, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory3 = new ScopedInstanceFactory(beanDefinition3);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey3, scopedInstanceFactory3, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory3);
                d dVar = d.a;
                BeanDefinition beanDefinition4 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(FetchDeviceTodoListUseCase.class), null, dVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory4 = new ScopedInstanceFactory(beanDefinition4);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey4, scopedInstanceFactory4, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory4);
                e eVar = e.a;
                BeanDefinition beanDefinition5 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(FetchRemoteTodoListUseCase.class), null, eVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey5 = BeanDefinitionKt.indexKey(beanDefinition5.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory5 = new ScopedInstanceFactory(beanDefinition5);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey5, scopedInstanceFactory5, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory5);
                f fVar = f.a;
                BeanDefinition beanDefinition6 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(FindLocalModifyDataUseCase.class), null, fVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey6 = BeanDefinitionKt.indexKey(beanDefinition6.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory6 = new ScopedInstanceFactory(beanDefinition6);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey6, scopedInstanceFactory6, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory6);
                g gVar = g.a;
                BeanDefinition beanDefinition7 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(LoadRestoreDataUseCase.class), null, gVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey7 = BeanDefinitionKt.indexKey(beanDefinition7.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory7 = new ScopedInstanceFactory(beanDefinition7);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey7, scopedInstanceFactory7, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory7);
                h hVar = h.a;
                BeanDefinition beanDefinition8 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(RestoreDataUseCase.class), null, hVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey8 = BeanDefinitionKt.indexKey(beanDefinition8.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory8 = new ScopedInstanceFactory(beanDefinition8);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey8, scopedInstanceFactory8, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory8);
                i iVar = i.a;
                BeanDefinition beanDefinition9 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(SyncLocalChangeToRemoteUseCase.class), null, iVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey9 = BeanDefinitionKt.indexKey(beanDefinition9.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory9 = new ScopedInstanceFactory(beanDefinition9);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey9, scopedInstanceFactory9, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory9);
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
            Kind kind = Kind.Singleton;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            BeanDefinition beanDefinition = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(RemoteDataSource.class), null, aVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, singleInstanceFactory, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory);
            }
            new Pair(module, singleInstanceFactory);
            C0883b c0883b = C0883b.a;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition2 = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(TodoListViewModel.class), null, c0883b, Kind.Factory, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, rootScopeQualifier);
            FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, factoryInstanceFactory, false, 4, null);
            new Pair(module, factoryInstanceFactory);
            module.scope(QualifierKt.named(TodoModuleKt.c), c.a);
        }
    }

    public static final void destroyTodoUserScope() {
        Scope scopeOrNull = KoinJavaComponent.getKoin().getScopeOrNull(c);
        if (scopeOrNull == null) {
            return;
        }
        scopeOrNull.close();
    }

    @NotNull
    public static final StringQualifier getDATA_SOURCE_LOCAL() {
        return a;
    }

    @NotNull
    public static final StringQualifier getDATA_SOURCE_REMOTE() {
        return b;
    }

    @NotNull
    public static final Module getTodoModule() {
        return d;
    }

    @NotNull
    public static final Function0<String> getTodoUserId() {
        Function0<String> function0 = todoUserId;
        Objects.requireNonNull(function0);
        return function0;
    }

    @NotNull
    public static final Scope getTodoUserScope() {
        return Koin.getOrCreateScope$default(KoinJavaComponent.getKoin(), c, QualifierKt.named(c), null, 4, null);
    }

    public static final void setTodoUserId(@NotNull Function0<String> function0) {
        todoUserId = function0;
    }
}
