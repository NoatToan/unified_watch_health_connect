package org.koin.core.context;

import e23.l;
import java.util.List;
import org.koin.core.Koin;
import org.koin.core.KoinApplication;
import org.koin.core.error.KoinApplicationAlreadyStartedException;
import org.koin.core.module.Module;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.w;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0003J\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0010\u001a\u00020\u00042\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u0012j\u0002`\u0013H\u0016¢\u0006\u0004\b\u0010\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001a\u001a\u00020\u00062\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u001c2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\u001f\u001a\u00020\u00062\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u001cH\u0016¢\u0006\u0004\b\u001f\u0010!R\u0018\u0010\"\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lorg/koin/core/context/GlobalContext;", "Lorg/koin/core/context/KoinContext;", "<init>", "()V", "Lorg/koin/core/KoinApplication;", "koinApplication", "", "register", "(Lorg/koin/core/KoinApplication;)V", "Lorg/koin/core/Koin;", "get", "()Lorg/koin/core/Koin;", "getOrNull", "getKoinApplicationOrNull", "()Lorg/koin/core/KoinApplication;", "stopKoin", "startKoin", "(Lorg/koin/core/KoinApplication;)Lorg/koin/core/KoinApplication;", "Lkotlin/Function1;", "Lorg/koin/dsl/KoinAppDeclaration;", "appDeclaration", "(Le23/l;)Lorg/koin/core/KoinApplication;", "Lorg/koin/core/module/Module;", "module", "", "createEagerInstances", "loadKoinModules", "(Lorg/koin/core/module/Module;Z)V", "", "modules", "(Ljava/util/List;Z)V", "unloadKoinModules", "(Lorg/koin/core/module/Module;)V", "(Ljava/util/List;)V", "_koin", "Lorg/koin/core/Koin;", "_koinApplication", "Lorg/koin/core/KoinApplication;", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GlobalContext implements KoinContext {
    public static final GlobalContext INSTANCE = new GlobalContext();
    private static Koin _koin;
    private static KoinApplication _koinApplication;

    private GlobalContext() {
    }

    private final void register(KoinApplication koinApplication) throws KoinApplicationAlreadyStartedException {
        if (_koin != null) {
            throw new KoinApplicationAlreadyStartedException("A Koin Application has already been started");
        }
        _koinApplication = koinApplication;
        _koin = koinApplication.getKoin();
    }

    @Override // org.koin.core.context.KoinContext
    public Koin get() {
        Koin koin = _koin;
        if (koin != null) {
            return koin;
        }
        h.z("KoinApplication has not been started");
        return null;
    }

    public final KoinApplication getKoinApplicationOrNull() {
        return _koinApplication;
    }

    @Override // org.koin.core.context.KoinContext
    public Koin getOrNull() {
        return _koin;
    }

    @Override // org.koin.core.context.KoinContext
    public void loadKoinModules(Module module, boolean createEagerInstances) {
        module.getClass();
        synchronized (this) {
            Koin.loadModules$default(INSTANCE.get(), w.c(module), false, createEagerInstances, 2, null);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // org.koin.core.context.KoinContext
    public KoinApplication startKoin(l<? super KoinApplication, Unit> appDeclaration) {
        KoinApplication koinApplicationInit;
        appDeclaration.getClass();
        synchronized (this) {
            koinApplicationInit = KoinApplication.INSTANCE.init();
            INSTANCE.register(koinApplicationInit);
            appDeclaration.invoke(koinApplicationInit);
            koinApplicationInit.createEagerInstances();
        }
        return koinApplicationInit;
    }

    @Override // org.koin.core.context.KoinContext
    public void stopKoin() {
        synchronized (this) {
            try {
                Koin koin = _koin;
                if (koin != null) {
                    koin.close();
                }
                _koin = null;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // org.koin.core.context.KoinContext
    public void unloadKoinModules(Module module) {
        module.getClass();
        synchronized (this) {
            INSTANCE.get().unloadModules(w.c(module));
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // org.koin.core.context.KoinContext
    public void unloadKoinModules(List<Module> modules) {
        modules.getClass();
        synchronized (this) {
            INSTANCE.get().unloadModules(modules);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // org.koin.core.context.KoinContext
    public KoinApplication startKoin(KoinApplication koinApplication) {
        koinApplication.getClass();
        synchronized (this) {
            INSTANCE.register(koinApplication);
            koinApplication.createEagerInstances();
        }
        return koinApplication;
    }

    @Override // org.koin.core.context.KoinContext
    public void loadKoinModules(List<Module> modules, boolean createEagerInstances) {
        modules.getClass();
        synchronized (this) {
            Koin.loadModules$default(INSTANCE.get(), modules, false, createEagerInstances, 2, null);
            Unit unit = Unit.INSTANCE;
        }
    }
}
