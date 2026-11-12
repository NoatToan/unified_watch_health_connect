package j1;

import android.content.Context;
import android.view.OrientationEventListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f96299b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f96298a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f96300c = new HashMap();

    public class a extends OrientationEventListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f96301a;

        public a(Context context) {
            super(context);
            this.f96301a = -1;
        }

        @Override // android.view.OrientationEventListener
        public final void onOrientationChanged(int i14) {
            int i15;
            ArrayList<c> arrayList;
            if (i14 == -1) {
                return;
            }
            if (i14 >= 315 || i14 < 45) {
                i15 = 0;
            } else if (i14 >= 225) {
                i15 = 1;
            } else {
                i15 = i14 >= 135 ? 2 : 3;
            }
            if (this.f96301a != i15) {
                this.f96301a = i15;
                synchronized (q.this.f96298a) {
                    arrayList = new ArrayList(q.this.f96300c.values());
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                for (c cVar : arrayList) {
                    cVar.f96304b.execute(new androidx.media3.exoplayer.d(cVar, i15, 9));
                }
            }
        }
    }

    public interface b {
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f96303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f96304b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicBoolean f96305c = new AtomicBoolean(true);

        public c(b bVar, Executor executor) {
            this.f96303a = bVar;
            this.f96304b = executor;
        }
    }

    public q(Context context) {
        this.f96299b = new a(context);
    }
}
