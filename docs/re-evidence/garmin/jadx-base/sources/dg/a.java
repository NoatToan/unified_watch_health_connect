package dg;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Ldg/a;", "Ldg/q;", "Lhf/n;", "strongImageLoaderReference", "<init>", "(Lhf/n;)V", "a", "c", "b", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference<hf.n> f59468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1268a f59469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f59470c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f59471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f59472e;

    /* JADX INFO: renamed from: dg.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ldg/a$a;", "Ldg/d;", "Lhf/n;", "strongImageLoaderReference", "<init>", "(Ldg/a;Lhf/n;)V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class C1268a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f59473a;

        public C1268a(hf.n nVar) {
            hf.n.a aVar = nVar.f83578a;
            hf.f.c<Integer> cVar = hf.l.f83573a;
            hf.f fVar = aVar.f83584b.f184967n;
            hf.f.c<Double> cVar2 = hf.l.f83576d;
            Object obj = fVar.f83559a.get(cVar2);
            this.f59473a = ((Number) (obj == null ? cVar2.f83562a : obj)).doubleValue();
        }

        public final void a(Context context) {
            double d14 = this.f59473a;
            if (d14 == 1.0d) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            a aVar = a.this;
            hf.n nVar = aVar.f59468a.get();
            if (nVar == null) {
                aVar.b();
                return;
            }
            rf.b bVarD = nVar.d();
            if (bVarD != null) {
                bVarD.b((long) (d14 * bVarD.e()));
                nVar.f83578a.getClass();
            }
        }

        public final void b(Context context) {
            if (this.f59473a == 1.0d) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
            a aVar = a.this;
            hf.n nVar = aVar.f59468a.get();
            if (nVar == null) {
                aVar.b();
                return;
            }
            rf.b bVarD = nVar.d();
            if (bVarD != null) {
                bVarD.b(bVarD.e());
                nVar.f83578a.getClass();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            b(activity);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldg/a$c;", "Landroid/content/ComponentCallbacks2;", "<init>", "(Ldg/a;)V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class c implements ComponentCallbacks2 {
        public c() {
        }

        @Override // android.content.ComponentCallbacks
        public final void onConfigurationChanged(Configuration configuration) {
            a aVar = a.this;
            synchronized (aVar) {
                if (aVar.f59468a.get() == null) {
                    aVar.b();
                }
                Unit unit = Unit.INSTANCE;
            }
        }

        @Override // android.content.ComponentCallbacks
        public final void onLowMemory() {
            onTrimMemory(80);
        }

        @Override // android.content.ComponentCallbacks2
        public final void onTrimMemory(int i14) {
            rf.b bVarD;
            a aVar = a.this;
            synchronized (aVar) {
                try {
                    hf.n nVar = aVar.f59468a.get();
                    if (nVar != null) {
                        nVar.f83578a.getClass();
                        if (i14 >= 40) {
                            rf.b bVarD2 = nVar.d();
                            if (bVarD2 != null) {
                                bVarD2.clear();
                            }
                        } else if (i14 >= 20) {
                            aVar.f59469b.a(nVar.f83578a.f83583a);
                        } else if (i14 >= 10 && (bVarD = nVar.d()) != null) {
                            bVarD.c(bVarD.getSize() / ((long) 2));
                        }
                    } else {
                        aVar.b();
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    static {
        new b(null);
    }

    public a(hf.n nVar) {
        this.f59468a = new WeakReference<>(nVar);
        this.f59469b = new C1268a(nVar);
    }

    @Override // dg.q
    public final synchronized void a() {
        try {
            hf.n nVar = this.f59468a.get();
            if (nVar == null) {
                b();
            } else if (this.f59471d == null) {
                Context context = nVar.f83578a.f83583a;
                this.f59471d = context;
                context.registerComponentCallbacks(this.f59470c);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void b() {
        try {
            if (this.f59472e) {
                return;
            }
            this.f59472e = true;
            Context context = this.f59471d;
            if (context != null) {
                this.f59469b.b(context);
                context.unregisterComponentCallbacks(this.f59470c);
            }
            this.f59468a.clear();
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ldg/a$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
