package com.google.android.exoplayer2.upstream;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public interface BandwidthMeter {

    public interface EventListener {

        public static final class EventDispatcher {
            private final CopyOnWriteArrayList<a> a = new CopyOnWriteArrayList<>();

            public static final class a {
                private final Handler a;
                private final EventListener b;
                private boolean c;

                public a(Handler handler, EventListener eventListener) {
                    this.a = handler;
                    this.b = eventListener;
                }

                public void d() {
                    this.c = true;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ void b(a aVar, int i, long j, long j2) {
                aVar.b.onBandwidthSample(i, j, j2);
            }

            public void addListener(Handler eventHandler, EventListener eventListener) {
                Assertions.checkNotNull(eventHandler);
                Assertions.checkNotNull(eventListener);
                removeListener(eventListener);
                this.a.add(new a(eventHandler, eventListener));
            }

            public void bandwidthSample(final int elapsedMs, final long bytesTransferred, final long bitrateEstimate) {
                for (final a aVar : this.a) {
                    if (!aVar.c) {
                        aVar.a.post(new Runnable() { // from class: com.google.android.exoplayer2.upstream.a
                            @Override // java.lang.Runnable
                            public final void run() {
                                BandwidthMeter.EventListener.EventDispatcher.b(aVar, elapsedMs, bytesTransferred, bitrateEstimate);
                            }
                        });
                    }
                }
            }

            public void removeListener(EventListener eventListener) {
                for (a aVar : this.a) {
                    if (aVar.b == eventListener) {
                        aVar.d();
                        this.a.remove(aVar);
                    }
                }
            }
        }

        void onBandwidthSample(int elapsedMs, long bytesTransferred, long bitrateEstimate);
    }

    void addEventListener(Handler eventHandler, EventListener eventListener);

    long getBitrateEstimate();

    long getTimeToFirstByteEstimateUs();

    @Nullable
    TransferListener getTransferListener();

    void removeEventListener(EventListener eventListener);
}
