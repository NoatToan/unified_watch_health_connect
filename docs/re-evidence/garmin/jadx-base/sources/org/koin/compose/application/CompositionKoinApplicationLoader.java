package org.koin.compose.application;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import org.koin.core.Koin;
import org.koin.core.KoinApplication;
import org.koin.core.annotation.KoinInternalApi;
import org.koin.core.context.DefaultContextExtKt;
import org.koin.core.logger.Logger;
import org.koin.mp.KoinPlatform;
import p005kotlin.Metadata;
import p3.y2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lorg/koin/compose/application/CompositionKoinApplicationLoader;", "Lp3/y2;", "Lorg/koin/core/KoinApplication;", "koinApplication", "<init>", "(Lorg/koin/core/KoinApplication;)V", "", TtmlNode.START, "()V", "stop", "onAbandoned", "onForgotten", "onRemembered", "Lorg/koin/core/KoinApplication;", "getKoinApplication", "()Lorg/koin/core/KoinApplication;", "koin-compose"}, k = 1, mv = {2, 0, 0}, xi = 48)
@KoinInternalApi
public final class CompositionKoinApplicationLoader implements y2 {
    public static final int $stable = 8;
    private final KoinApplication koinApplication;

    public CompositionKoinApplicationLoader(KoinApplication koinApplication) {
        koinApplication.getClass();
        this.koinApplication = koinApplication;
    }

    private final void start() {
        DefaultContextExtKt.startKoin(this.koinApplication).getKoin().getLogger().debug(this + " -> started Koin Application " + this.koinApplication);
    }

    private final void stop() {
        Logger logger;
        Koin koinOrNull = KoinPlatform.INSTANCE.getKoinOrNull();
        if (koinOrNull != null && (logger = koinOrNull.getLogger()) != null) {
            logger.debug(this + " -> stop Koin Application " + this.koinApplication);
        }
        DefaultContextExtKt.stopKoin();
    }

    public final KoinApplication getKoinApplication() {
        return this.koinApplication;
    }

    @Override // p3.y2
    public void onAbandoned() {
        stop();
    }

    @Override // p3.y2
    public void onForgotten() {
        stop();
    }

    @Override // p3.y2
    public void onRemembered() {
        start();
    }
}
