package org.koin.compose.module;

import java.util.List;
import org.koin.core.Koin;
import org.koin.core.annotation.KoinExperimentalAPI;
import org.koin.core.annotation.KoinInternalApi;
import org.koin.core.module.Module;
import p005kotlin.Metadata;
import p3.y2;

/* JADX INFO: loaded from: classes3.dex */
@KoinExperimentalAPI
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u000eR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, d2 = {"Lorg/koin/compose/module/CompositionKoinModuleLoader;", "Lp3/y2;", "", "Lorg/koin/core/module/Module;", "modules", "Lorg/koin/core/Koin;", "koin", "", "unloadOnForgotten", "unloadOnAbandoned", "<init>", "(Ljava/util/List;Lorg/koin/core/Koin;ZZ)V", "", "unloadModules", "()V", "onRemembered", "onForgotten", "onAbandoned", "Ljava/util/List;", "getModules", "()Ljava/util/List;", "Lorg/koin/core/Koin;", "getKoin", "()Lorg/koin/core/Koin;", "Z", "getUnloadOnForgotten", "()Z", "getUnloadOnAbandoned", "koin-compose"}, k = 1, mv = {2, 0, 0}, xi = 48)
@KoinInternalApi
public final class CompositionKoinModuleLoader implements y2 {
    public static final int $stable = 8;
    private final Koin koin;
    private final List<Module> modules;
    private final boolean unloadOnAbandoned;
    private final boolean unloadOnForgotten;

    public CompositionKoinModuleLoader(List<Module> list, Koin koin, boolean z14, boolean z15) {
        list.getClass();
        koin.getClass();
        this.modules = list;
        this.koin = koin;
        this.unloadOnForgotten = z14;
        this.unloadOnAbandoned = z15;
        koin.getLogger().debug(this + " -> load modules");
        Koin.loadModules$default(koin, list, false, false, 6, null);
    }

    private final void unloadModules() {
        this.koin.getLogger().debug(this + " -> unload modules");
        this.koin.unloadModules(this.modules);
    }

    public final Koin getKoin() {
        return this.koin;
    }

    public final List<Module> getModules() {
        return this.modules;
    }

    public final boolean getUnloadOnAbandoned() {
        return this.unloadOnAbandoned;
    }

    public final boolean getUnloadOnForgotten() {
        return this.unloadOnForgotten;
    }

    @Override // p3.y2
    public void onAbandoned() {
        if (this.unloadOnAbandoned) {
            unloadModules();
        }
    }

    @Override // p3.y2
    public void onForgotten() {
        if (this.unloadOnForgotten) {
            unloadModules();
        }
    }

    @Override // p3.y2
    public void onRemembered() {
    }
}
