package org.koin.core.context;

import e23.l;
import java.util.List;
import org.koin.core.KoinApplication;
import org.koin.core.module.KoinApplicationDslMarker;
import org.koin.core.module.Module;
import org.koin.mp.KoinPlatformTools;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a'\u0010\u0002\u001a\u00020\u00002\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006H\u0007¢\u0006\u0004\b\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\n\u001a\u0015\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\r\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f¢\u0006\u0004\b\r\u0010\u0011\u001a\u0015\u0010\u0012\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u000e\u001a\u001b\u0010\u0012\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f¢\u0006\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lorg/koin/core/KoinApplication;", "koinApplication", "startKoin", "(Lorg/koin/core/KoinApplication;)Lorg/koin/core/KoinApplication;", "Lkotlin/Function1;", "", "Lorg/koin/dsl/KoinAppDeclaration;", "appDeclaration", "(Le23/l;)Lorg/koin/core/KoinApplication;", "stopKoin", "()V", "Lorg/koin/core/module/Module;", "module", "loadKoinModules", "(Lorg/koin/core/module/Module;)V", "", "modules", "(Ljava/util/List;)V", "unloadKoinModules", "koin-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DefaultContextExtKt {
    public static final void loadKoinModules(Module module) {
        module.getClass();
        KoinContext.DefaultImpls.loadKoinModules$default(KoinPlatformTools.INSTANCE.defaultContext(), module, false, 2, (Object) null);
    }

    @KoinApplicationDslMarker
    public static final KoinApplication startKoin(KoinApplication koinApplication) {
        koinApplication.getClass();
        return KoinPlatformTools.INSTANCE.defaultContext().startKoin(koinApplication);
    }

    public static final void stopKoin() {
        KoinPlatformTools.INSTANCE.defaultContext().stopKoin();
    }

    public static final void unloadKoinModules(Module module) {
        module.getClass();
        KoinPlatformTools.INSTANCE.defaultContext().unloadKoinModules(module);
    }

    public static final void unloadKoinModules(List<Module> list) {
        list.getClass();
        KoinPlatformTools.INSTANCE.defaultContext().unloadKoinModules(list);
    }

    @KoinApplicationDslMarker
    public static final KoinApplication startKoin(l<? super KoinApplication, Unit> lVar) {
        lVar.getClass();
        return KoinPlatformTools.INSTANCE.defaultContext().startKoin(lVar);
    }

    public static final void loadKoinModules(List<Module> list) {
        list.getClass();
        KoinContext.DefaultImpls.loadKoinModules$default(KoinPlatformTools.INSTANCE.defaultContext(), (List) list, false, 2, (Object) null);
    }
}
