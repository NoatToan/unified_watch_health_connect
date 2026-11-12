package tb0;

import android.graphics.Bitmap;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.airbnb.lottie.RenderMode;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.t0;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;
import zb0.u0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ltb0/q;", "Landroidx/lifecycle/u1;", "", "isNewUser", "", "deviceName", "Lzb0/u0;", "deviceEnum", "Laa0/b;", "animationHolderProvider", "<init>", "(ZLjava/lang/String;Lzb0/u0;Laa0/b;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f163681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aa0.b f163682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RenderMode f163683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f163684e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f163685f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b2 f163686g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f163687h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p2 f163688i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p2 f163689j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p2 f163690k;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f163691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f163692b;

        static {
            int[] iArr = new int[u0.values().length];
            try {
                iArr[u0.X0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u0.Y0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u0.Z0.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[u0.R0.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[u0.Q0.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[u0.T0.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[u0.S0.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f163691a = iArr;
            int[] iArr2 = new int[ub0.a.values().length];
            try {
                iArr2[ub0.a.PLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ub0.a.NEXT_STEP.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[ub0.a.PREVIOUS_STEP.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[ub0.a.PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[ub0.a.RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            f163692b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltb0/a;", "wrapper", "Ltb0/s;", "<anonymous>", "(Ltb0/a;)Ltb0/s;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.tutorials.GestureAnimationViewModel$gestureUiState$1", f = "GestureAnimationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<tb0.a, t13.d<? super s>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f163693a;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = q.this.new b(dVar);
            bVar.f163693a = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(tb0.a aVar, t13.d<? super s> dVar) {
            return ((b) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            p pVar;
            LinkedHashMap linkedHashMap;
            hv.j jVar;
            hv.j jVar2;
            tb0.a aVar = (tb0.a) this.f163693a;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            aa0.d dVar = aVar != null ? aVar.f163587a : null;
            boolean z14 = dVar == null;
            q qVar = q.this;
            if (dVar != null) {
                aa0.c cVar = dVar.f2199g;
                qVar.getClass();
                List<hv.j> listA = cVar.f2190a.a(cVar.f2191b);
                if (listA == null) {
                    a2 a2Var = a2.BIC;
                    String strH = am.j.h(cVar.f2191b, "invalid group index ");
                    i2.f36769a.getClass();
                    i2.a.f(a2Var, "AnimationNavigator", strH);
                    listA = null;
                }
                int time = (listA == null || (jVar2 = (hv.j) h0.d0(listA)) == null) ? 0 : jVar2.getTime();
                int iB = (listA == null || (jVar = (hv.j) h0.n0(listA)) == null) ? 0 : jVar.b();
                if (listA != null) {
                    int iA = t0.a(p13.y.r(listA, 10));
                    if (iA < 16) {
                        iA = 16;
                    }
                    linkedHashMap = new LinkedHashMap(iA);
                    for (hv.j jVar3 : listA) {
                        String comment = jVar3.getComment();
                        if (comment == null) {
                            comment = "";
                        }
                        o13.p pVar2 = new o13.p(dVar.a(comment), jVar3);
                        linkedHashMap.put(pVar2.f128594a, pVar2.f128595b);
                    }
                } else {
                    linkedHashMap = null;
                }
                int i14 = cVar.f2191b;
                boolean z15 = i14 == -1;
                boolean z16 = i14 == 0;
                boolean z17 = i14 == cVar.f2190a.f2189c.size() - 1;
                int i15 = dVar.f2198f.f2187a;
                String str = dVar.f2193a;
                Map<String, Bitmap> map = dVar.f2196d;
                pVar = new p(z15, z16, z17, i15, str, map != null ? i53.a.g(map) : null, cVar.f2190a.f2189c.size(), cVar.f2191b, time, iB, linkedHashMap != null ? i53.a.g(linkedHashMap) : null, dVar.f2197e);
            } else {
                pVar = null;
            }
            return new s(false, z14, qVar.f163683d, qVar.f163684e, pVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Ltb0/s;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.tutorials.GestureAnimationViewModel$gestureUiState$2", f = "GestureAnimationViewModel.kt", l = {67}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<r53.j<? super s>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f163695a;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return q.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super s> jVar, t13.d<? super Unit> dVar) {
            return ((c) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f163695a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f163695a = 1;
                if (q.x4(q.this, this) == aVar) {
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

    public q(boolean z14, String str, u0 u0Var, aa0.b bVar) {
        RenderMode renderMode;
        boolean z15;
        str.getClass();
        bVar.getClass();
        this.f163680a = z14;
        this.f163681b = str;
        this.f163682c = bVar;
        switch (u0Var == null ? -1 : a.f163691a[u0Var.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                renderMode = RenderMode.SOFTWARE;
                break;
            default:
                renderMode = RenderMode.HARDWARE;
                break;
        }
        RenderMode renderMode2 = renderMode;
        this.f163683d = renderMode2;
        switch (u0Var != null ? a.f163691a[u0Var.ordinal()] : -1) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                z15 = false;
                break;
            default:
                z15 = true;
                break;
        }
        boolean z16 = z15;
        this.f163684e = z16;
        p2 p2VarA = q2.a(null);
        this.f163685f = p2VarA;
        this.f163686g = r53.s.K(new r53.v(new c(null), r53.s.D(p2VarA, new b(null))), v1.a(this), k2.a.a(k2.f150703a, 2), new s(true, false, renderMode2, z16, null, 18, null));
        p2 p2VarA2 = q2.a(null);
        this.f163687h = p2VarA2;
        this.f163688i = p2VarA2;
        p2 p2VarA3 = q2.a(null);
        this.f163689j = p2VarA3;
        this.f163690k = p2VarA3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object x4(q qVar, v13.c cVar) {
        r rVar;
        Object value;
        Object value2;
        p2 p2Var = qVar.f163685f;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i14 = rVar.f163699c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                rVar.f163699c = i14 - Integer.MIN_VALUE;
            } else {
                rVar = new r(qVar, cVar);
            }
        } else {
            rVar = new r(qVar, cVar);
        }
        Object objA = rVar.f163697a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = rVar.f163699c;
        try {
            if (i15 == 0) {
                o13.r.b(objA);
                if (p2Var.getValue() != null) {
                    return Unit.INSTANCE;
                }
                aa0.b bVar = qVar.f163682c;
                rVar.f163699c = 1;
                objA = bVar.a(rVar);
                if (objA == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objA);
            }
            aa0.d dVar = (aa0.d) objA;
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, dVar != null ? new tb0.a(dVar, y4(dVar)) : null));
        } catch (Exception unused) {
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, null));
        }
        return Unit.INSTANCE;
    }

    public static String y4(aa0.d dVar) {
        aa0.c cVar = dVar.f2199g;
        int i14 = cVar.f2191b;
        cVar.getClass();
        return i14 + "_0";
    }

    public final void A4(ub0.a aVar) {
        Object value;
        tb0.a aVar2;
        Object value2;
        Object value3;
        tb0.a aVar3;
        Object value4;
        aa0.c cVar;
        int i14;
        Object value5;
        Object value6;
        aVar.getClass();
        int i15 = a.f163692b[aVar.ordinal()];
        p2 p2Var = this.f163685f;
        p2 p2Var2 = this.f163689j;
        if (i15 == 1 || i15 == 2) {
            do {
                value = p2Var.getValue();
                tb0.a aVar4 = (tb0.a) value;
                if (aVar4 != null) {
                    aVar4.f163587a.f2199g.f2191b++;
                }
                if (aVar4 != null) {
                    aa0.d dVar = aVar4.f163587a;
                    aVar2 = new tb0.a(dVar, y4(dVar));
                } else {
                    aVar2 = null;
                }
            } while (!p2Var.b(value, aVar2));
            do {
                value2 = p2Var2.getValue();
            } while (!p2Var2.b(value2, ub0.l.PLAYING));
            return;
        }
        if (i15 != 3) {
            if (i15 == 4) {
                do {
                    value5 = p2Var2.getValue();
                } while (!p2Var2.b(value5, ub0.l.PAUSED));
                return;
            } else {
                if (i15 != 5) {
                    lc.u0.r();
                    return;
                }
                do {
                    value6 = p2Var2.getValue();
                } while (!p2Var2.b(value6, ub0.l.RESUMED));
                return;
            }
        }
        do {
            value3 = p2Var.getValue();
            tb0.a aVar5 = (tb0.a) value3;
            if (aVar5 != null && (i14 = (cVar = aVar5.f163587a.f2199g).f2191b) > 0) {
                cVar.f2191b = i14 - 1;
            }
            if (aVar5 != null) {
                aa0.d dVar2 = aVar5.f163587a;
                aVar3 = new tb0.a(dVar2, y4(dVar2));
            } else {
                aVar3 = null;
            }
        } while (!p2Var.b(value3, aVar3));
        do {
            value4 = p2Var2.getValue();
        } while (!p2Var2.b(value4, ub0.l.PLAYING));
    }

    public final void z4(String str) {
        ArrayList arrayListM = p13.x.m(new zk.e("Screen", "OnboardingTutorialIntro"));
        arrayListM.add(new zk.e("Action", str));
        arrayListM.add(new zk.e("deviceName", this.f163681b));
        arrayListM.add(new zk.e("Type", this.f163680a ? "NewUser" : "ExistingUser"));
        ht.s sVar = ht.s.f85508a;
        zk.a aVar = new zk.a("UserAction", arrayListM, false, 0L, 12, null);
        sVar.getClass();
        ht.s.b(aVar);
    }
}
