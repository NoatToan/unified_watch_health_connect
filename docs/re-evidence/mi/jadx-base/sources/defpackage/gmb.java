package defpackage;

import android.os.Handler;
import android.util.SparseArray;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public class gmb {
    public static final WeakHashMap<ReactContext, gmb> h = new WeakHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference<ReactContext> f19129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<hmb> f19130b = new CopyOnWriteArraySet();
    public final AtomicInteger c = new AtomicInteger(0);
    public final Handler d = new Handler();
    public final Set<Integer> e = new CopyOnWriteArraySet();
    public final Map<Integer, fmb> f = new ConcurrentHashMap();
    public final SparseArray<Runnable> g = new SparseArray<>();

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f19131a;

        public a(int i) {
            this.f19131a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = gmb.this.f19130b.iterator();
            while (it.hasNext()) {
                ((hmb) it.next()).onHeadlessJsTaskFinish(this.f19131a);
            }
        }
    }

    public gmb(ReactContext reactContext) {
        this.f19129a = new WeakReference<>(reactContext);
    }

    public static gmb d(ReactContext reactContext) {
        WeakHashMap<ReactContext, gmb> weakHashMap = h;
        gmb gmbVar = weakHashMap.get(reactContext);
        if (gmbVar != null) {
            return gmbVar;
        }
        gmb gmbVar2 = new gmb(reactContext);
        weakHashMap.put(reactContext, gmbVar2);
        return gmbVar2;
    }

    public void b(hmb hmbVar) {
        this.f19130b.add(hmbVar);
    }

    public synchronized void c(int i) {
        sk1.b(this.e.remove(Integer.valueOf(i)), "Tried to finish non-existent task with id " + i + ".");
        sk1.b(this.f.remove(Integer.valueOf(i)) != null, "Tried to remove non-existent task config with id " + i + ".");
        h(i);
        UiThreadUtil.runOnUiThread(new a(i));
    }

    public boolean e() {
        return this.e.size() > 0;
    }

    public synchronized boolean f(int i) {
        return this.e.contains(Integer.valueOf(i));
    }

    public void g(hmb hmbVar) {
        this.f19130b.remove(hmbVar);
    }

    public final void h(int i) {
        Runnable runnable = this.g.get(i);
        if (runnable != null) {
            this.d.removeCallbacks(runnable);
            this.g.remove(i);
        }
    }

    public synchronized boolean i(int i) {
        fmb fmbVar = this.f.get(Integer.valueOf(i));
        sk1.b(fmbVar != null, "Tried to retrieve non-existent task config with id " + i + ".");
        fmbVar.a();
        throw null;
    }
}
