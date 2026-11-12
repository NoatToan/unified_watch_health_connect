package ql1;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.j;
import r53.k2;
import r53.p2;
import r53.q2;
import r53.s;
import r53.v;
import rd2.f;
import t60.h;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lql1/b;", "Landroidx/lifecycle/u1;", "Lt60/c;", "crossSellingDelegate", "Lt60/h;", "crossSellingPreferences", "<init>", "(Lt60/c;Lt60/h;)V", "a", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends u1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t60.a f145230e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t60.c f145231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f145232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f145233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b2 f145234d;

    /* JADX INFO: renamed from: ql1.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lql1/a;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.sleep.SleepEnhancedHelpViewModel$educationalContentUiState$1", f = "SleepEnhancedHelpViewModel.kt", l = {27}, m = "invokeSuspend", v = 2)
    public static final class C2738b extends i implements p<j<? super ql1.a>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f145235a;

        public C2738b(t13.d<? super C2738b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return b.this.new C2738b(dVar);
        }

        @Override // e23.p
        public final Object invoke(j<? super ql1.a> jVar, t13.d<? super Unit> dVar) {
            return ((C2738b) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            String shopUrl;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f145235a;
            b bVar = b.this;
            if (i14 == 0) {
                r.b(obj);
                h hVar = bVar.f145232b;
                t60.a aVar2 = b.f145230e;
                this.f145235a = 1;
                obj = hVar.d(aVar2, this);
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
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                sn1.b.f160414a.getClass();
                bv.b.f21239a.getClass();
                bv.b.a();
                boolean zO0 = k1.f37122a.O0();
                t60.c cVar = bVar.f145231a;
                t60.a aVar3 = b.f145230e;
                f.a().f152045a.getClass();
                boolean zH = cVar.h(aVar3, rd2.j.d());
                v60.c cVar2 = (v60.c) ((v2.b) v2Var).f47386a;
                if (cVar2.getAvailableForPurchase() && zO0 && !zH) {
                    p2 p2Var = bVar.f145233c;
                    do {
                        value2 = p2Var.getValue();
                        shopUrl = cVar2.getShopUrl();
                        ((ql1.a) value2).getClass();
                    } while (!p2Var.b(value2, new ql1.a(true, shopUrl)));
                }
            } else {
                p2 p2Var2 = bVar.f145233c;
                do {
                    value = p2Var2.getValue();
                    ((ql1.a) value).getClass();
                } while (!p2Var2.b(value, new ql1.a(false, null)));
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
        f145230e = t60.a.SLEEP_BAND_BANNER;
    }

    public b(t60.c cVar, h hVar) {
        cVar.getClass();
        hVar.getClass();
        this.f145231a = cVar;
        this.f145232b = hVar;
        p2 p2VarA = q2.a(new ql1.a(false, null, 3, null));
        this.f145233c = p2VarA;
        v vVar = new v(new C2738b(null), s.d(p2VarA));
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        this.f145234d = s.K(vVar, aVarA, k2.a.f150706c, new ql1.a(false, null, 3, null));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lql1/b$a;", "", "<init>", "()V", "Lt60/a;", "SLEEP_BAND_BANNER", "Lt60/a;", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
