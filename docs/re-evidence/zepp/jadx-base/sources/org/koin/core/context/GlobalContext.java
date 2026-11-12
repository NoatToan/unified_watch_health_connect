package org.koin.core.context;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.e;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.KoinApplication;
import org.koin.core.error.KoinAppAlreadyStartedException;
import org.koin.core.module.Module;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\t\u001a\u0004\u0018\u00010\u0002J\b\u0010\n\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J%\u0010\u000b\u001a\u00020\u00022\u001b\u0010\u000f\u001a\u0017\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\fj\u0002`\r¢\u0006\u0002\b\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0016\u0010\u0012\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013H\u0016J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0016\u0010\u0015\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013H\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lorg/koin/core/context/GlobalContext;", "Lorg/koin/core/context/KoinContext;", "Lorg/koin/core/KoinApplication;", "koinApplication", "", "a", "Lorg/koin/core/Koin;", "get", "getOrNull", "getKoinApplicationOrNull", "stopKoin", "startKoin", "Lkotlin/Function1;", "Lorg/koin/dsl/KoinAppDeclaration;", "Lkotlin/ExtensionFunctionType;", "appDeclaration", "Lorg/koin/core/module/Module;", "module", "loadKoinModules", "", "modules", "unloadKoinModules", "Lorg/koin/core/Koin;", "_koin", "b", "Lorg/koin/core/KoinApplication;", "_koinApplication", "<init>", "()V", "koin-core"}, k = 1, mv = {1, 5, 1})
public final class GlobalContext implements KoinContext {

    @NotNull
    public static final GlobalContext INSTANCE = new GlobalContext();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private static Koin _koin;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private static KoinApplication _koinApplication;

    private GlobalContext() {
    }

    private final void a(KoinApplication koinApplication) throws KoinAppAlreadyStartedException {
        if (_koin != null) {
            throw new KoinAppAlreadyStartedException("A Koin Application has already been started");
        }
        _koinApplication = koinApplication;
        _koin = koinApplication.getKoin();
    }

    @Override // org.koin.core.context.KoinContext
    @NotNull
    public Koin get() {
        Koin koin = _koin;
        if (koin != null) {
            return koin;
        }
        throw new IllegalStateException("KoinApplication has not been started".toString());
    }

    @Nullable
    public final KoinApplication getKoinApplicationOrNull() {
        return _koinApplication;
    }

    @Override // org.koin.core.context.KoinContext
    @Nullable
    public Koin getOrNull() {
        return _koin;
    }

    @Override // org.koin.core.context.KoinContext
    public void loadKoinModules(@NotNull Module module) {
        synchronized (this) {
            Koin.loadModules$default(INSTANCE.get(), e.listOf(module), false, 2, null);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // org.koin.core.context.KoinContext
    @NotNull
    public KoinApplication startKoin(@NotNull KoinApplication koinApplication) {
        synchronized (this) {
            INSTANCE.a(koinApplication);
            koinApplication.createEagerInstances();
        }
        return koinApplication;
    }

    @Override // org.koin.core.context.KoinContext
    public void stopKoin() {
        synchronized (this) {
            Koin koin = _koin;
            if (koin != null) {
                koin.close();
            }
            _koin = null;
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // org.koin.core.context.KoinContext
    public void unloadKoinModules(@NotNull Module module) {
        synchronized (this) {
            INSTANCE.get().unloadModules(e.listOf(module));
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // org.koin.core.context.KoinContext
    public void loadKoinModules(@NotNull List<Module> modules) {
        synchronized (this) {
            Koin.loadModules$default(INSTANCE.get(), modules, false, 2, null);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // org.koin.core.context.KoinContext
    @NotNull
    public KoinApplication startKoin(@NotNull Function1<? super KoinApplication, Unit> appDeclaration) {
        KoinApplication koinApplicationInit;
        synchronized (this) {
            koinApplicationInit = KoinApplication.INSTANCE.init();
            INSTANCE.a(koinApplicationInit);
            appDeclaration.invoke(koinApplicationInit);
            koinApplicationInit.createEagerInstances();
        }
        return koinApplicationInit;
    }

    @Override // org.koin.core.context.KoinContext
    public void unloadKoinModules(@NotNull List<Module> modules) {
        synchronized (this) {
            INSTANCE.get().unloadModules(modules);
            Unit unit = Unit.INSTANCE;
        }
    }
}
