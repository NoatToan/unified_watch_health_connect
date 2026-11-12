package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import com.huawei.skinner.facade.template.ILogger;
import com.huawei.skinner.internal.ISkinLoader;
import com.huawei.skinner.internal.ISkinUpdate;
import com.huawei.skinner.internal.OnRegisterSkinAttrsListener;
import com.huawei.skinner.loader.SkinPlugin;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes15.dex */
public class pyt implements ISkinLoader {
    public static OnRegisterSkinAttrsListener d;
    private static volatile pyt e;
    private SkinPlugin i;
    private Context m;
    private List<ISkinUpdate> r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f45988a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final pym f45990c = new pym();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ILogger f45989b = new pzf();
    private LruCache<String, WeakReference<SkinPlugin>> n = new LruCache<>(5);
    private boolean f = true;
    private boolean h = false;
    private boolean j = false;
    private int o = 1;
    private ExecutorService k = Executors.newSingleThreadExecutor(a("HwSkinner SkinManager", false));
    private Handler l = new Handler(Looper.getMainLooper());
    private boolean g = false;
    private pym s = f45990c;
    private pyo q = pyo.a();

    @Override // com.huawei.skinner.internal.ISkinLoader
    public void notifySkinUpdate() {
    }

    private pyt(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            this.m = context;
        } else {
            this.m = ((Application) applicationContext).getBaseContext();
        }
        pyi.a(context);
    }

    public static pyt a(Context context) {
        return b(context);
    }

    public static pyt d() {
        if (e == null) {
            throw new pys("HwSkinner::Init::Invoke init(context) first!");
        }
        return e;
    }

    public static pyt b(Context context) {
        if (e == null) {
            synchronized (f45988a) {
                if (e == null) {
                    e = new pyt(context);
                }
            }
        }
        return e;
    }

    public boolean a() {
        return (this.f || this.i == null) ? false : true;
    }

    public boolean b() {
        return this.j;
    }

    private ThreadFactory a(final String str, final boolean z) {
        return new ThreadFactory() { // from class: pyt.2
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, str);
                thread.setDaemon(z);
                return thread;
            }
        };
    }

    public SkinPlugin e() {
        return this.i;
    }

    @Override // com.huawei.skinner.internal.ISkinLoader
    public void attach(ISkinUpdate iSkinUpdate) {
        if (this.r == null) {
            this.r = new ArrayList();
        }
        if (this.r.contains(iSkinUpdate)) {
            return;
        }
        this.r.add(iSkinUpdate);
    }

    @Override // com.huawei.skinner.internal.ISkinLoader
    public void detach(ISkinUpdate iSkinUpdate) {
        List<ISkinUpdate> list = this.r;
        if (list == null) {
            return;
        }
        list.remove(iSkinUpdate);
    }

    public boolean c() {
        return this.h;
    }
}
