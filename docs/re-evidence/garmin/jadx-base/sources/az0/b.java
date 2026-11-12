package az0;

import android.content.Context;
import androidx.lifecycle.j;
import androidx.lifecycle.v;
import bz0.o;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import o13.r;
import o53.b0;
import o53.c0;
import o53.s0;
import okhttp3.OkHttpClient;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.l1;
import r53.m1;
import r53.p2;
import r53.q2;
import r53.s;
import v13.i;
import zy0.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Laz0/b;", "", "<init>", "()V", "gcm-network_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f13670a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u53.d f13671b = c0.a(t13.g.a.C3052a.d(s0.f129406a, ge1.b.h()));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f13672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static vc2.c f13673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p2 f13674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j f13675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static h f13676g;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvc2/b;", "newState", "", "<anonymous>", "(Lvc2/b;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.network.connectivity.ConnectivityMonitor$initialize$2$1", f = "ConnectivityMonitor.kt", l = {75}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<vc2.b, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13677a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f13678b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ vc2.c f13679c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l f13680d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Context f13681e;

        /* JADX INFO: renamed from: az0.b$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.network.connectivity.ConnectivityMonitor$initialize$2$1$1", f = "ConnectivityMonitor.kt", l = {70, 71}, m = "invokeSuspend", v = 2)
        public static final class C0194a extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f13682a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Context f13683b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ vc2.b f13684c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0194a(Context context, vc2.b bVar, t13.d<? super C0194a> dVar) {
                super(2, dVar);
                this.f13683b = context;
                this.f13684c = bVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C0194a(this.f13683b, this.f13684c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C0194a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
            
                if (p005kotlin.Unit.INSTANCE == r0) goto L15;
             */
            @Override // v13.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Throwable {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f13682a;
                vc2.b bVar = this.f13684c;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                    } else {
                        if (i14 != 2) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r.b(obj);
                    }
                    return Unit.INSTANCE;
                }
                r.b(obj);
                b bVar2 = b.f13670a;
                vc2.l lVar = ((vc2.b.d) bVar).f177085b;
                this.f13682a = 1;
                bVar2.getClass();
                x53.c cVar = s0.f129406a;
                obj = ge1.b.e0(x53.b.f189152a, new az0.a(lVar, this.f13683b, null), this);
                if (obj != aVar) {
                }
                return aVar;
                p2 p2Var = b.f13674e;
                vc2.b.d dVar = new vc2.b.d((vc2.l) obj, ((vc2.b.d) bVar).f177086c);
                this.f13682a = 2;
                p2Var.k(null, dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(vc2.c cVar, l lVar, Context context, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f13679c = cVar;
            this.f13680d = lVar;
            this.f13681e = context;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f13679c, this.f13680d, this.f13681e, dVar);
            aVar.f13678b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(vc2.b bVar, t13.d<? super Unit> dVar) {
            return ((a) create(bVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            vc2.b bVar = (vc2.b) this.f13678b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f13677a;
            if (i14 == 0) {
                r.b(obj);
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.b(a2Var, "ConnectivityMonitor", "NetworkConnectivityMonitor new state[" + bVar + "]");
                if (bVar instanceof vc2.b.d) {
                    ge1.b.T(b.f13671b, null, null, new C0194a(this.f13681e, bVar, null), 3);
                } else {
                    p2 p2Var = b.f13674e;
                    this.f13678b = bVar;
                    this.f13677a = 1;
                    p2Var.setValue(bVar);
                    if (Unit.INSTANCE == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            this.f13680d.l(bVar);
            return Unit.INSTANCE;
        }
    }

    static {
        f.a aVar = f.f13695c;
        o.f22274a.getClass();
        OkHttpClient okHttpClientJ = o.j();
        x53.b bVar = x53.b.f189152a;
        aVar.getClass();
        okHttpClientJ.getClass();
        bVar.getClass();
        f13672c = new f(okHttpClientJ, bVar);
        p2 p2VarA = q2.a(new vc2.b.C3312b(vc2.d.UNKNOWN));
        f13674e = p2VarA;
        f13675f = v.b(p2VarA);
    }

    private b() {
    }

    public static final boolean a() {
        p2 p2Var = f13674e;
        return (p2Var.getValue() instanceof vc2.b.C3312b) || (p2Var.getValue() instanceof vc2.b.d);
    }

    public static final synchronized vc2.c b(Context context) {
        vc2.c cVar;
        try {
            context.getClass();
            vc2.c cVar2 = f13673d;
            if (cVar2 != null) {
                c0.c(cVar2.f177092c, null);
                cVar2.f177091b.setValue(null);
            }
            l lVar = (l) KoinJavaComponent.get$default(l.class, null, null, 6, null);
            String str = lVar.f() ? "mobile-status/garmin-connect-china-status.json" : "mobile-status/garmin-connect-status.json";
            String str2 = lVar.k(ez0.c.GC_WEB_URL) + "/" + str;
            cVar = new vc2.c(context, str2, false, new a90.c(str2, 1), 4, null);
            s.C(new m1(s.s(new l1(cVar.f177091b)), new a(cVar, lVar, context, null)), f13671b);
            f13673d = cVar;
            String strConcat = "NetworkConnectivityMonitor initialized with statusUrl: ".concat(str2);
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "ConnectivityMonitor", strConcat);
            o.f22274a.l();
        } catch (Throwable th3) {
            throw th3;
        }
        return cVar;
    }

    public final synchronized vc2.c c() {
        vc2.c cVarB;
        cVarB = f13673d;
        if (cVarB == null) {
            cVarB = b(((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c());
        }
        return cVarB;
    }
}
