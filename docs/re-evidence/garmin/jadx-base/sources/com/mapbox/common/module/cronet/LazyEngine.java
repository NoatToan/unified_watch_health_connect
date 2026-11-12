package com.mapbox.common.module.cronet;

import android.content.Context;
import aq.s1;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.net.CronetProviderInstaller;
import com.google.android.gms.tasks.Task;
import com.google.protobuf.a;
import com.mapbox.common.FeatureTelemetryCounter;
import com.mapbox.common.MapboxCommonLogger;
import com.mapbox.common.MapboxSDKCommon;
import e23.l;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n8F@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/mapbox/common/module/cronet/LazyEngine;", "", "executor", "Ljava/util/concurrent/Executor;", "(Ljava/util/concurrent/Executor;)V", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "cronetProvider", "Lorg/chromium/net/CronetProvider;", "<set-?>", "Lorg/chromium/net/CronetEngine;", "engine", "getEngine", "()Lorg/chromium/net/CronetEngine;", "configureEngine", "initializeProvider", "", "tryInstallFromGooglePlay", "Companion", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class LazyEngine {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Context context;
    private CronetProvider cronetProvider;
    private volatile CronetEngine engine;
    private final Executor executor;

    public LazyEngine(Executor executor) {
        executor.getClass();
        this.executor = executor;
        this.context = MapboxSDKCommon.INSTANCE.getContext();
        initializeProvider();
    }

    private final CronetEngine configureEngine() {
        try {
            CronetProvider cronetProvider = this.cronetProvider;
            cronetProvider.getClass();
            CronetEngine cronetEngineBuild = cronetProvider.createBuilder().enableBrotli(true).enableQuic(true).enableHttp2(true).addQuicHint("api.mapbox.com", 443, 443).addQuicHint("events.mapbox.com", 443, 443).addQuicHint("config.mapbox.com", 443, 443).enableHttpCache(0, 0L).build();
            cronetEngineBuild.addRequestFinishedListener(new CronetRequestFinishedListener(this.executor));
            Companion companion = INSTANCE;
            CronetProvider cronetProvider2 = this.cronetProvider;
            cronetProvider2.getClass();
            companion.onCronetAvailable(cronetProvider2);
            return cronetEngineBuild;
        } catch (Throwable unused) {
            CopyOnWriteArraySet<String> disabledProviders = LazyEngineKt.getDisabledProviders();
            CronetProvider cronetProvider3 = this.cronetProvider;
            cronetProvider3.getClass();
            disabledProviders.add(cronetProvider3.getName());
            initializeProvider();
            if (this.cronetProvider != null) {
                return configureEngine();
            }
            return null;
        }
    }

    private final void initializeProvider() {
        CronetProvider cronetProviderFindCronetProvider = LazyEngineKt.findCronetProvider(this.context);
        this.cronetProvider = cronetProviderFindCronetProvider;
        if (cronetProviderFindCronetProvider == null) {
            tryInstallFromGooglePlay();
        }
    }

    private final void tryInstallFromGooglePlay() {
        Companion companion = INSTANCE;
        if (companion.canInstallFromGooglePlay()) {
            companion.installCronetFromPlayServices(this.context).addOnSuccessListener(new s1(new AnonymousClass1(), 5)).addOnFailureListener(new a(17));
        } else {
            companion.onCronetNotAvailable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tryInstallFromGooglePlay$lambda$1(l lVar, Object obj) {
        lVar.getClass();
        lVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tryInstallFromGooglePlay$lambda$2(Exception exc) {
        exc.getClass();
        INSTANCE.onCronetNotAvailable();
    }

    public final CronetEngine getEngine() {
        if (this.cronetProvider == null) {
            return null;
        }
        if (this.engine == null) {
            synchronized (this) {
                try {
                    if (this.engine == null) {
                        this.engine = configureEngine();
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return this.engine;
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\u000bH\u0007¨\u0006\u000f"}, d2 = {"Lcom/mapbox/common/module/cronet/LazyEngine$Companion;", "", "()V", "canInstallFromGooglePlay", "", "installCronetFromPlayServices", "Lcom/google/android/gms/tasks/Task;", "Ljava/lang/Void;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "onCronetAvailable", "", "provider", "Lorg/chromium/net/CronetProvider;", "onCronetNotAvailable", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final boolean canInstallFromGooglePlay() {
            return LazyEngineKt.canInstallFromGooglePlay.getAndSet(false);
        }

        public final Task<Void> installCronetFromPlayServices(Context context) {
            context.getClass();
            Task<Void> taskInstallProvider = CronetProviderInstaller.installProvider(context);
            taskInstallProvider.getClass();
            return taskInstallProvider;
        }

        public final void onCronetAvailable(CronetProvider provider) {
            String str;
            provider.getClass();
            String name = provider.getName();
            if (s.g(name, CronetProvider.PROVIDER_NAME_APP_PACKAGED)) {
                str = "Embedded";
            } else {
                str = (LazyEngineKt.isPlayServicesCronetProviderInstallerAvailable && s.g(name, "Google-Play-Services-Cronet-Provider")) ? "PlayServices" : "UnknownSource";
            }
            FeatureTelemetryCounter.create("common/network/http3/Cronet" + str + "Available").increment();
        }

        public final void onCronetNotAvailable() {
            FeatureTelemetryCounter.create("common/network/http3/CronetNotAvailable").increment();
            MapboxCommonLogger.INSTANCE.logW$common_release("HTTP", "HTTP/3 will not be available: Cannot find a valid Cronet provider. In order to\nenable HTTP/3 in the Mapbox SDKs, it's necessary that the application depends on\na valid Cronet provider. Valid providers include the Google Play Services\nprovider (from \"com.google.android.gms:play-services-cronet\"), in which case\nCronet will be used from Play Services, or you may choose to embed Cronet with\nyour application by depending on \"org.chromium.net:cronet-embedded\".");
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.mapbox.common.module.cronet.LazyEngine$tryInstallFromGooglePlay$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements l<Void, Unit> {
        public AnonymousClass1() {
            super(1);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Void r14) {
            LazyEngine lazyEngine = LazyEngine.this;
            lazyEngine.cronetProvider = LazyEngineKt.findCronetProvider(lazyEngine.context);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(Void r14) {
            invoke2(r14);
            return Unit.INSTANCE;
        }
    }
}
