package org.koin.core.context;

import e23.l;
import java.util.List;
import org.apache.commons.lang3.e;
import org.koin.core.Koin;
import org.koin.core.KoinApplication;
import org.koin.core.module.Module;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000b\u001a\u00020\t2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\rj\u0002`\u000eH&¢\u0006\u0004\b\u000b\u0010\u0010J!\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0015\u001a\u00020\u00062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00172\b\b\u0002\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0015\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001a\u001a\u00020\u00062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u0017H&¢\u0006\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Lorg/koin/core/context/KoinContext;", "", "Lorg/koin/core/Koin;", "get", "()Lorg/koin/core/Koin;", "getOrNull", "", "stopKoin", "()V", "Lorg/koin/core/KoinApplication;", "koinApplication", "startKoin", "(Lorg/koin/core/KoinApplication;)Lorg/koin/core/KoinApplication;", "Lkotlin/Function1;", "Lorg/koin/dsl/KoinAppDeclaration;", "appDeclaration", "(Le23/l;)Lorg/koin/core/KoinApplication;", "Lorg/koin/core/module/Module;", "module", "", "createEagerInstances", "loadKoinModules", "(Lorg/koin/core/module/Module;Z)V", "", "modules", "(Ljava/util/List;Z)V", "unloadKoinModules", "(Lorg/koin/core/module/Module;)V", "(Ljava/util/List;)V", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface KoinContext {
    Koin get();

    Koin getOrNull();

    void loadKoinModules(List<Module> modules, boolean createEagerInstances);

    void loadKoinModules(Module module, boolean createEagerInstances);

    KoinApplication startKoin(l<? super KoinApplication, Unit> appDeclaration);

    KoinApplication startKoin(KoinApplication koinApplication);

    void stopKoin();

    void unloadKoinModules(List<Module> modules);

    void unloadKoinModules(Module module);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void loadKoinModules$default(KoinContext koinContext, Module module, boolean z14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: loadKoinModules");
                return;
            }
            if ((i14 & 2) != 0) {
                z14 = false;
            }
            koinContext.loadKoinModules(module, z14);
        }

        public static /* synthetic */ void loadKoinModules$default(KoinContext koinContext, List list, boolean z14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: loadKoinModules");
                return;
            }
            if ((i14 & 2) != 0) {
                z14 = false;
            }
            koinContext.loadKoinModules((List<Module>) list, z14);
        }
    }
}
