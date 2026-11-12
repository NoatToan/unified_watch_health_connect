package org.koin.core;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.huami.passport.Configs;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import org.koin.core.module.Module;
import org.koin.core.time.MeasureKt;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \"2\u00020\u0001:\u0001\"B\t\b\u0002¢\u0006\u0004\b \u0010!J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003J!\u0010\u0004\u001a\u00020\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0007\"\u00020\u0003¢\u0006\u0004\b\u0004\u0010\bJ\u0014\u0010\u0004\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0006\u0010\t\u001a\u00020\u0005J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nJ\u001a\u0010\u0010\u001a\u00020\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011J\u0010\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0016\u001a\u00020\u0005J\u0014\u0010\u0017\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u000e\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0003R\u0019\u0010\u001d\u001a\u00020\u00198\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lorg/koin/core/KoinApplication;", "", "", "Lorg/koin/core/module/Module;", "modules", "", "a", "", "([Lorg/koin/core/module/Module;)Lorg/koin/core/KoinApplication;", "createEagerInstances", "", "override", "allowOverride", "", "", "values", Configs.Params.PROPERTIES, "Lorg/koin/core/logger/Logger;", "logger", "Lorg/koin/core/logger/Level;", FirebaseAnalytics.Param.LEVEL, "printLogger", "close", "unloadModules", "module", "Lorg/koin/core/Koin;", "Lorg/koin/core/Koin;", "getKoin", "()Lorg/koin/core/Koin;", "koin", "b", "Z", "<init>", "()V", "Companion", "koin-core"}, k = 1, mv = {1, 5, 1})
public final class KoinApplication {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Koin koin;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean allowOverride;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lorg/koin/core/KoinApplication$Companion;", "", "Lorg/koin/core/KoinApplication;", PointCategory.INIT, "<init>", "()V", "koin-core"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KoinApplication init() {
            return new KoinApplication(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {
        public final /* synthetic */ List<Module> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<Module> list) {
            super(0);
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            KoinApplication.this.a(this.b);
        }
    }

    private KoinApplication() {
        this.koin = new Koin();
        this.allowOverride = true;
    }

    public /* synthetic */ KoinApplication(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(List<Module> modules) {
        this.koin.loadModules(modules, this.allowOverride);
    }

    public static /* synthetic */ KoinApplication printLogger$default(KoinApplication koinApplication, Level level, int i, Object obj) {
        if ((i & 1) != 0) {
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

    @NotNull
    public final Koin getKoin() {
        return this.koin;
    }

    @NotNull
    public final KoinApplication logger(@NotNull Logger logger) {
        this.koin.setupLogger(logger);
        return this;
    }

    @NotNull
    public final KoinApplication modules(@NotNull Module modules) {
        return modules(e.listOf(modules));
    }

    @NotNull
    public final KoinApplication printLogger(@NotNull Level level) {
        this.koin.setupLogger(KoinPlatformTools.INSTANCE.defaultLogger(level));
        return this;
    }

    @NotNull
    public final KoinApplication properties(@NotNull Map<String, String> values) {
        this.koin.getPropertyRegistry().saveProperties(values);
        return this;
    }

    public final void unloadModules(@NotNull List<Module> modules) {
        this.koin.unloadModules(modules);
    }

    @NotNull
    public final KoinApplication modules(@NotNull Module... modules) {
        return modules(ArraysKt___ArraysKt.toList(modules));
    }

    public final void unloadModules(@NotNull Module module) {
        this.koin.unloadModules(e.listOf(module));
    }

    @NotNull
    public final KoinApplication modules(@NotNull List<Module> modules) {
        if (this.koin.getLogger().isAt(Level.INFO)) {
            double dMeasureDuration = MeasureKt.measureDuration(new a(modules));
            int size = this.koin.getInstanceRegistry().size();
            this.koin.getLogger().info("loaded " + size + " definitions - " + dMeasureDuration + " ms");
        } else {
            a(modules);
        }
        return this;
    }
}
