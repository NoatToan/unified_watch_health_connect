package xa;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface c {

    public interface a {

        /* JADX INFO: renamed from: xa.c$a$a, reason: collision with other inner class name */
        public static final class C3528a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CopyOnWriteArrayList<C3529a> f189667a = new CopyOnWriteArrayList<>();

            /* JADX INFO: renamed from: xa.c$a$a$a, reason: collision with other inner class name */
            public static final class C3529a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Handler f189668a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final a f189669b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public boolean f189670c;

                public C3529a(Handler handler, a aVar) {
                    this.f189668a = handler;
                    this.f189669b = aVar;
                }
            }
        }

        void onBandwidthSample(int i14, long j8, long j14);
    }

    void b(a aVar);

    void d(Handler handler, a aVar);

    long getBitrateEstimate();

    h getTransferListener();
}
