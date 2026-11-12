package defpackage;

import android.content.Context;
import android.os.IBinder;
import com.xiaomi.continuity.ContinuityServiceManagerConnector;
import com.xiaomi.continuity.a;
import com.xiaomi.continuity.infra.ServiceConnector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class ij4 {
    public static volatile ij4 e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f21191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ServiceConnector<com.xiaomi.continuity.a> f21192b;
    public final CopyOnWriteArrayList<gj4> c = new CopyOnWriteArrayList<>();
    public final ArrayList<String> d = new ArrayList<>();

    public class a implements ServiceConnector.b<com.xiaomi.continuity.a> {
        public a() {
        }

        @Override // com.xiaomi.continuity.infra.ServiceConnector.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(com.xiaomi.continuity.a aVar) {
            Iterator it = ij4.this.c.iterator();
            while (it.hasNext()) {
                ((gj4) it.next()).s2(ij4.this);
            }
        }

        @Override // com.xiaomi.continuity.infra.ServiceConnector.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(com.xiaomi.continuity.a aVar) {
            Iterator it = ij4.this.c.iterator();
            while (it.hasNext()) {
                ((gj4) it.next()).h4(ij4.this);
            }
        }

        @Override // com.xiaomi.continuity.infra.ServiceConnector.b
        public void h() {
            uoe.e("ContinuityServiceManager", "onBinderDied.");
            Iterator it = ij4.this.c.iterator();
            while (it.hasNext()) {
                ((gj4) it.next()).h();
            }
        }
    }

    public ij4(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f21191a = applicationContext;
        ContinuityServiceManagerConnector continuityServiceManagerConnector = new ContinuityServiceManagerConnector(applicationContext);
        this.f21192b = continuityServiceManagerConnector;
        continuityServiceManagerConnector.setServiceLifecycleCallbacks(new a());
    }

    public static synchronized ij4 e(Context context) {
        try {
            if (e == null) {
                e = new ij4(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return e;
    }

    public static /* synthetic */ IBinder f(String str, com.xiaomi.continuity.a aVar) {
        return aVar.x(str);
    }

    public void c(gj4 gj4Var) {
        Objects.requireNonNull(gj4Var);
        this.c.add(gj4Var);
    }

    public IBinder d(final String str) {
        IBinder iBinder = null;
        for (int i = 0; i < 3; i++) {
            try {
                iBinder = (IBinder) this.f21192b.postForResult(new ServiceConnector.a() { // from class: hj4
                    @Override // com.xiaomi.continuity.infra.ServiceConnector.a
                    public final Object run(Object obj) {
                        return ij4.f(str, (a) obj);
                    }
                }).get(1L, TimeUnit.SECONDS);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (iBinder != null) {
                synchronized (this.d) {
                    try {
                        if (!this.d.contains(str)) {
                            this.d.add(str);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                break;
            }
        }
        return iBinder;
    }

    public void g(gj4 gj4Var) {
        this.c.remove(gj4Var);
    }

    public void h(String str) {
        synchronized (this.d) {
            try {
                if (this.d.contains(str)) {
                    this.d.remove(str);
                }
                if (this.d.isEmpty() || (this.d.size() == 1 && this.d.contains("universal_feature_manager_service"))) {
                    this.d.clear();
                    this.f21192b.unbind();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
