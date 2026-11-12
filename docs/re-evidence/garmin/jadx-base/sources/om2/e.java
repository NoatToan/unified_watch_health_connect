package om2;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import om2.b;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
public class e<T extends b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f132984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f132985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f132986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f132987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet<Integer> f132988e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ExecutorService f132989f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f132990g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f132991h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f132992i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public qm2.a.C2744a f132993j;

    public e(Collection<? extends T> collection, String str) {
        this.f132986c = new byte[0];
        this.f132988e = new HashSet<>();
        if (collection == null || collection.isEmpty()) {
            h.s("no operations provided.");
            throw null;
        }
        this.f132987d = new ArrayList(collection);
        this.f132989f = Executors.newFixedThreadPool(collection.size());
        this.f132990g = new Handler(Looper.getMainLooper());
        this.f132985b = str;
        this.f132984a = LoggerFactory.getLogger(str != null ? str.concat("OperationQueue") : "OperationQueue");
    }

    public final void a() {
        synchronized (this.f132986c) {
            if (this.f132991h != Integer.MAX_VALUE) {
                this.f132992i = true;
                this.f132991h = Integer.MAX_VALUE;
                for (b bVar : this.f132987d) {
                    bVar.f132976b.set(null);
                    bVar.f132975a.g0(Boolean.FALSE);
                    bVar.b();
                }
                this.f132989f.shutdownNow();
            }
        }
    }

    public e(Collection<? extends T> collection) {
        this(collection, null);
    }
}
