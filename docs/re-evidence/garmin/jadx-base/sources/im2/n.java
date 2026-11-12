package im2;

import android.content.Context;
import android.text.TextUtils;
import bd0.c0;
import c83.a0;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o13.r;
import o53.b0;
import org.apache.commons.lang3.BooleanUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.pairing.impl.retrofit.PairingRetrofitServerDelegate$removeDevice$job$1", f = "PairingRetrofitServerDelegate.kt", l = {655}, m = "invokeSuspend")
public final class n extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f94340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f94341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f94342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lm2.i.a f94343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f94344e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List<c83.d<?>> f94345f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m0 f94346g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ lm2.i.b<vm2.h> f94347h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f94348i;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"im2/n$a", "Lc83/f;", "Ljava/lang/Void;", "device-pairing-retrofit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements c83.f<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f94349a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f94350b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m0 f94351c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ lm2.i.b<vm2.h> f94352d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f94353e;

        /* JADX INFO: renamed from: im2.n$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"im2/n$a$a", "Llm2/f$a;", "Ljava/lang/Void;", "device-pairing-retrofit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C1799a implements lm2.f.a<Void> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f94354a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f94355b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Map<Integer, String> f94356c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ m0 f94357d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ lm2.i.b<vm2.h> f94358e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ boolean f94359f;

            public C1799a(c cVar, long j8, Map<Integer, String> map, m0 m0Var, lm2.i.b<vm2.h> bVar, boolean z14) {
                this.f94354a = cVar;
                this.f94355b = j8;
                this.f94356c = map;
                this.f94357d = m0Var;
                this.f94358e = bVar;
                this.f94359f = z14;
            }

            @Override // lm2.f.a
            public final void a() {
                Map<Integer, String> map = this.f94356c;
                Collection<String> collectionValues = map.values();
                c cVar = this.f94354a;
                long j8 = this.f94355b;
                c.b(cVar, j8, collectionValues);
                wr.g.v("removeDevice(", j8, ") success", cVar.f94218b);
                this.f94357d.f105804a = false;
                Context context = ((c0) lm2.h.d()).f17547a;
                cn2.d.f28092a.getClass();
                cn2.d.a(context, "com.garmin.device.sharing.management.ACTION_DEVICE_REMOVED", j8, null);
                cVar.j(j8, map.values());
                lm2.i.b<vm2.h> bVar = this.f94358e;
                if (bVar != null) {
                    bVar.a(new vm2.h(true, this.f94359f, false));
                }
            }

            @Override // lm2.f.a
            public final void onFailure(Throwable th3) {
                th3.getClass();
                c cVar = this.f94354a;
                cVar.f94218b.error("removeDevice delete from db failed", th3);
                c.b(cVar, this.f94355b, this.f94356c.values());
                this.f94357d.f105804a = false;
                lm2.i.b<vm2.h> bVar = this.f94358e;
                if (bVar != null) {
                    bVar.onFailure(th3);
                }
            }
        }

        public a(long j8, c cVar, m0 m0Var, lm2.i.b<vm2.h> bVar, boolean z14) {
            this.f94349a = j8;
            this.f94350b = cVar;
            this.f94351c = m0Var;
            this.f94352d = bVar;
            this.f94353e = z14;
        }

        @Override // c83.f
        public final void a(c83.d<Void> dVar, Throwable th3) {
            dVar.getClass();
            th3.getClass();
            this.f94350b.f94218b.error("removeDevice failed", th3);
            this.f94351c.f105804a = false;
            lm2.i.b<vm2.h> bVar = this.f94352d;
            if (bVar != null) {
                bVar.onFailure(th3);
            }
        }

        @Override // c83.f
        public final void c(c83.d<Void> dVar, a0<Void> a0Var) {
            dVar.getClass();
            final long j8 = this.f94349a;
            final c cVar = this.f94350b;
            final m0 m0Var = this.f94351c;
            final lm2.i.b<vm2.h> bVar = this.f94352d;
            final boolean z14 = this.f94353e;
            new Thread(new Runnable() { // from class: im2.m
                @Override // java.lang.Runnable
                public final void run() {
                    Map map;
                    lm2.h.e();
                    rd2.f.a().f152045a.getClass();
                    long j14 = j8;
                    sd2.f fVarI = rd2.j.i(j14, null);
                    if (fVarI == null) {
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap map2 = new HashMap();
                        String strD0 = fVarI.d0();
                        if (!TextUtils.isEmpty(strD0)) {
                            map2.put(1, strD0);
                        }
                        String strQ = fVarI.Q();
                        if (!TextUtils.isEmpty(strQ)) {
                            map2.put(2, strQ);
                        }
                        map = map2;
                    }
                    boolean zIsEmpty = map.isEmpty();
                    c cVar2 = cVar;
                    m0 m0Var2 = m0Var;
                    lm2.i.b bVar2 = bVar;
                    boolean z15 = z14;
                    if (zIsEmpty) {
                        wr.g.v("removeDevice(", j14, ") success", cVar2.f94218b);
                        m0Var2.f105804a = false;
                        if (bVar2 != null) {
                            bVar2.a(new vm2.h(true, z15, false));
                            return;
                        }
                        return;
                    }
                    Iterator it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        ok2.a0.f132585h.a().h((String) ((Map.Entry) it.next()).getValue());
                    }
                    ((em2.d) lm2.h.e()).g(((c0) lm2.h.d()).f17547a, j14, null, new n.a.C1799a(cVar2, j14, map, m0Var2, bVar2, z15));
                }
            }).start();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(c cVar, lm2.i.a aVar, long j8, List<c83.d<?>> list, m0 m0Var, lm2.i.b<vm2.h> bVar, boolean z14, t13.d<? super n> dVar) {
        super(2, dVar);
        this.f94342c = cVar;
        this.f94343d = aVar;
        this.f94344e = j8;
        this.f94345f = list;
        this.f94346g = m0Var;
        this.f94347h = bVar;
        this.f94348i = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        n nVar = new n(this.f94342c, this.f94343d, this.f94344e, this.f94345f, this.f94346g, this.f94347h, this.f94348i, dVar);
        nVar.f94341b = obj;
        return nVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f94340a;
        c cVar = this.f94342c;
        if (i14 == 0) {
            r.b(obj);
            this.f94341b = (b0) this.f94341b;
            this.f94340a = 1;
            cVar.getClass();
            obj = c.f(cVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        jm2.b bVar = (jm2.b) obj;
        String strG = cVar.g();
        if (strG == null) {
            strG = BooleanUtils.TRUE;
        }
        c83.d<Void> dVarG = bVar.g(this.f94344e, strG);
        this.f94345f.add(dVarG);
        dVarG.q0(new a(this.f94344e, this.f94342c, this.f94346g, this.f94347h, this.f94348i));
        return Unit.INSTANCE;
    }
}
