package org.koin.core;

import b71.i;
import e53.o;
import e53.p;
import java.util.List;
import java.util.Map;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import org.koin.core.module.KoinApplicationDslMarker;
import org.koin.core.module.Module;
import org.koin.core.time.DurationExtKt;
import org.koin.mp.KoinPlatformTools;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.u;
import p13.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u001f\u0010\n\u001a\u00020\u00002\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\f\"\u00020\u000b¢\u0006\u0002\u0010\rJ\u0014\u0010\n\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\b\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tJ\u0016\u0010\u0012\u001a\u00020\u00102\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eH\u0002J\u001a\u0010\u0013\u001a\u00020\u00002\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u0010J\u001b\u0010\u001d\u001a\u00020\u00102\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eH\u0000¢\u0006\u0002\b\u001eJ\u0015\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\u001eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lorg/koin/core/KoinApplication;", "", "<init>", "()V", "koin", "Lorg/koin/core/Koin;", "getKoin", "()Lorg/koin/core/Koin;", "allowOverride", "", "modules", "Lorg/koin/core/module/Module;", "", "([Lorg/koin/core/module/Module;)Lorg/koin/core/KoinApplication;", "", "createEagerInstances", "", "override", "loadModules", "properties", "values", "", "", "logger", "Lorg/koin/core/logger/Logger;", "printLogger", "level", "Lorg/koin/core/logger/Level;", "close", "unloadModules", "unloadModules$koin_core", "module", "Companion", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@KoinApplicationDslMarker
public final class KoinApplication {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private boolean allowOverride;
    private final Koin koin;

    private KoinApplication() {
        this.koin = new Koin();
        this.allowOverride = true;
    }

    private final void loadModules(List<Module> modules) {
        this.koin.loadModules(modules, this.allowOverride, false);
    }

    public static /* synthetic */ KoinApplication printLogger$default(KoinApplication koinApplication, Level level, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            level = Level.INFO;
        }
        return koinApplication.printLogger(level);
    }

    public final void allowOverride(boolean override) {
        this.allowOverride = override;
    }

    public final void close() {
        this.koin.close();
    }

    public final void createEagerInstances() {
        this.koin.createEagerInstances();
    }

    public final Koin getKoin() {
        return this.koin;
    }

    public final KoinApplication logger(Logger logger) {
        logger.getClass();
        this.koin.setupLogger(logger);
        return this;
    }

    public final KoinApplication modules(List<Module> modules) {
        modules.getClass();
        Logger logger = this.koin.getLogger();
        Level level = Level.INFO;
        if (logger.getLevel().compareTo(level) > 0) {
            loadModules(modules);
            return this;
        }
        p.a.f63127a.getClass();
        o.f63125a.getClass();
        long jB = o.b();
        loadModules(modules);
        long jB2 = p.a.C1330a.b(jB);
        int size = this.koin.getInstanceRegistry().size();
        Logger logger2 = this.koin.getLogger();
        StringBuilder sbI = i.i(size, "Started ", " definitions in ");
        sbI.append(DurationExtKt.m498getInMsLRDsOJo(jB2));
        sbI.append(" ms");
        logger2.display(level, sbI.toString());
        return this;
    }

    public final KoinApplication printLogger(Level level) {
        level.getClass();
        this.koin.setupLogger(KoinPlatformTools.INSTANCE.defaultLogger(level));
        return this;
    }

    public final KoinApplication properties(Map<String, ? extends Object> values) {
        values.getClass();
        this.koin.getPropertyRegistry().saveProperties(values);
        return this;
    }

    public final void unloadModules$koin_core(Module module) {
        module.getClass();
        this.koin.unloadModules(w.c(module));
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lorg/koin/core/KoinApplication$Companion;", "", "<init>", "()V", "init", "Lorg/koin/core/KoinApplication;", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final KoinApplication init() {
            return new KoinApplication(null);
        }

        private Companion() {
        }
    }

    public final void unloadModules$koin_core(List<Module> modules) {
        modules.getClass();
        this.koin.unloadModules(modules);
    }

    public /* synthetic */ KoinApplication(j jVar) {
        this();
    }

    public final KoinApplication modules(Module... modules) {
        modules.getClass();
        return modules(u.i0(modules));
    }

    public final KoinApplication modules(Module modules) {
        modules.getClass();
        return modules(w.c(modules));
    }
}
