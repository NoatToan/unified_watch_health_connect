package zo1;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lzo1/q;", "Landroidx/lifecycle/u1;", "<init>", "()V", "a", "gcm-social-group-ride_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q extends u1 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f206413r = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vo1.c f206414a = (vo1.c) KoinJavaComponent.get$default(vo1.c.class, null, null, 6, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f206415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f206416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b2 f206417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f206418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b2 f206419f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t60.m f206420g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f206421h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b2 f206422i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p2 f206423j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b2 f206424k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p2 f206425l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b2 f206426m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final androidx.lifecycle.y0 f206427n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p2 f206428o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f206429p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r53.u1 f206430q;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"zo1/q$b", "Lli0/f;", "gcm-social-group-ride_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends li0.f {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.socialgroupride.presentation.GroupRideDetailsViewModel$groupRideFollowAction$1$updateStateData$1", f = "GroupRideDetailsViewModel.kt", l = {126}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f206432a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f206433b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f206434c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ li0.l0 f206435d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(q qVar, String str, li0.l0 l0Var, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f206433b = qVar;
                this.f206434c = str;
                this.f206435d = l0Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f206433b, this.f206434c, this.f206435d, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f206432a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    q qVar = this.f206433b;
                    LinkedHashMap linkedHashMapN = p13.u0.n((Map) qVar.f206428o.getValue());
                    linkedHashMapN.put(this.f206434c, this.f206435d);
                    p2 p2Var = qVar.f206428o;
                    this.f206432a = 1;
                    p2Var.k(null, linkedHashMapN);
                    if (Unit.INSTANCE == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public b(o53.b0 b0Var) {
            super(b0Var, null, null, 6, null);
        }

        @Override // li0.f
        public final void l(int i14, String str) {
        }

        @Override // li0.f
        public final void n(String str, li0.l0 l0Var) {
            if (str == null || l0Var == null) {
                return;
            }
            q qVar = q.this;
            ge1.b.T(v1.a(qVar), null, null, new a(qVar, str, l0Var, null), 3);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "", "Lli0/l0;", "tempMap", "", "Lli0/d0;", "list", "<anonymous>", "(Ljava/util/Map;Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.socialgroupride.presentation.GroupRideDetailsViewModel$groupRidersFlow$1", f = "GroupRideDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.q<Map<String, ? extends li0.l0>, List<? extends li0.d0>, t13.d<? super List<? extends li0.d0>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Map f206436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ List f206437b;

        public c(t13.d<? super c> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(Map<String, ? extends li0.l0> map, List<? extends li0.d0> list, t13.d<? super List<? extends li0.d0>> dVar) {
            c cVar = new c(dVar);
            cVar.f206436a = map;
            cVar.f206437b = list;
            return cVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Map map = this.f206436a;
            List list = this.f206437b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(li0.e0.f((li0.d0) it.next(), map));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                li0.n0 n0Var = ((li0.d0) obj2).f112656i;
                if (!(n0Var != null ? p005kotlin.jvm.internal.s.g(n0Var.f112817b, Boolean.TRUE) : false)) {
                    arrayList2.add(obj2);
                }
            }
            return arrayList2;
        }
    }

    static {
        new a(null);
    }

    public q() {
        p2 p2VarA = q2.a(p13.j0.f134944a);
        this.f206415b = p2VarA;
        p2 p2VarA2 = q2.a(new p(false, 1, null));
        this.f206416c = p2VarA2;
        this.f206417d = r53.s.d(p2VarA2);
        Boolean bool = Boolean.FALSE;
        p2 p2VarA3 = q2.a(bool);
        this.f206418e = p2VarA3;
        this.f206419f = r53.s.d(p2VarA3);
        t60.m mVar = new t60.m();
        this.f206420g = mVar;
        p2 p2VarA4 = q2.a(bool);
        this.f206421h = p2VarA4;
        this.f206422i = r53.s.d(p2VarA4);
        p2 p2VarA5 = q2.a(null);
        this.f206423j = p2VarA5;
        this.f206424k = r53.s.d(p2VarA5);
        p2 p2VarA6 = q2.a(bool);
        this.f206425l = p2VarA6;
        this.f206426m = r53.s.d(p2VarA6);
        this.f206427n = mVar.f162729b;
        p13.k0 k0Var = p13.k0.f134949a;
        k0Var.getClass();
        p2 p2VarA7 = q2.a(k0Var);
        this.f206428o = p2VarA7;
        this.f206429p = new b(v1.a(this));
        this.f206430q = new r53.u1(p2VarA7, p2VarA, new c(null));
    }

    public static final boolean x4(q qVar, List list) {
        qVar.getClass();
        if (list == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(g22.n.g((String) it.next()));
        }
        return arrayList.contains("DEDICATED_BIKE_COMPUTER");
    }

    public static final void y4(q qVar, boolean z14) {
        Object value;
        p2 p2Var = qVar.f206416c;
        do {
            value = p2Var.getValue();
            ((p) value).getClass();
        } while (!p2Var.b(value, new p(z14)));
    }

    public final void z4(boolean z14) {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f206425l;
            value = p2Var.getValue();
            ((Boolean) value).getClass();
        } while (!p2Var.b(value, Boolean.valueOf(z14)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzo1/q$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-social-group-ride_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
