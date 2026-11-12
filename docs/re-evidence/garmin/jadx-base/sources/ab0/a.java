package ab0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import ca0.c4;
import ca0.o1;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import gg1.o0;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import lc.u0;
import mb0.f;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import p13.l0;
import r53.b2;
import r53.j;
import r53.k2;
import r53.p2;
import r53.q2;
import r53.s;
import r53.v;
import t13.d;
import v13.e;
import v13.i;
import y80.s0;
import z80.l;
import z80.m;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lab0/a;", "Landroidx/lifecycle/u1;", "Lq90/c;", "pairedDevice", "Lca0/o1;", "deviceSetupFlow", "", "editUserSettings", "Ly80/s0;", "userProfileRepository", "Ls90/a;", "convertProfileWizardStepUseCase", "Lw90/a;", "updateUserShortNameUseCase", "Ls90/b;", "filterProfileWizardStepUseCase", "<init>", "(Lq90/c;Lca0/o1;ZLy80/s0;Ls90/a;Lw90/a;Ls90/b;)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends u1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f2507q = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q90.c f2508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o1 f2509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s0 f2511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s90.a f2512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w90.a f2513f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s90.b f2514g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f2515h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b2 f2516i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p2 f2517j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b2 f2518k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public l f2519l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List<? extends u90.a> f2520m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Set<String> f2521n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p2 f2522o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b2 f2523p;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2524a;

        static {
            int[] iArr = new int[u90.a.values().length];
            try {
                iArr[u90.a.WHEELCHAIR_ACTIVITY_LEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f2524a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.profile.ProfileSetupViewModel$initializedData$1", f = "ProfileSetupViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<j<? super Boolean>, d<? super Unit>, Object> {
        public c(d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return a.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(j<? super Boolean> jVar, d<? super Unit> dVar) {
            return ((c) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            int i14 = a.f2507q;
            a aVar2 = a.this;
            aVar2.getClass();
            ge1.b.T(v1.a(aVar2), null, null, new ab0.b(aVar2, null), 3);
            return Unit.INSTANCE;
        }
    }

    static {
        new C0026a(null);
    }

    public a(q90.c cVar, o1 o1Var, boolean z14, s0 s0Var, s90.a aVar, w90.a aVar2, s90.b bVar) {
        cVar.getClass();
        o1Var.getClass();
        s0Var.getClass();
        aVar.getClass();
        aVar2.getClass();
        bVar.getClass();
        this.f2508a = cVar;
        this.f2509b = o1Var;
        this.f2510c = z14;
        this.f2511d = s0Var;
        this.f2512e = aVar;
        this.f2513f = aVar2;
        this.f2514g = bVar;
        Boolean bool = Boolean.FALSE;
        p2 p2VarA = q2.a(bool);
        this.f2515h = p2VarA;
        this.f2516i = s.d(p2VarA);
        p2 p2VarA2 = q2.a(null);
        this.f2517j = p2VarA2;
        this.f2518k = s.d(p2VarA2);
        this.f2520m = j0.f134944a;
        this.f2521n = l0.f134950a;
        p2 p2VarA3 = q2.a(bool);
        this.f2522o = p2VarA3;
        this.f2523p = s.K(new v(new c(null), p2VarA3), v1.a(this), k2.a.a(k2.f150703a, 2), bool);
    }

    public final void A4(o0 o0Var) {
        p2 p2Var;
        Object value;
        l lVar;
        o0Var.getClass();
        do {
            p2Var = this.f2517j;
            value = p2Var.getValue();
            lVar = (l) value;
        } while (!p2Var.b(value, lVar != null ? l.a(lVar, null, null, null, null, o0Var, 0L, null, null, null, null, false, null, null, 8175) : null));
    }

    public final void x4(f fVar) {
        p2 p2Var;
        Object value;
        l lVarA;
        fVar.getClass();
        mb0.e eVar = fVar.f117730a;
        mb0.a aVar = fVar.f117731b;
        boolean zContains = this.f2508a.f143495c.f111531p.f58439e.contains(u90.a.SLEEP);
        int i14 = zContains ? eVar.f117728a : aVar.f117710a;
        int i15 = zContains ? eVar.f117729b : aVar.f117711b;
        do {
            p2Var = this.f2517j;
            value = p2Var.getValue();
            l lVar = (l) value;
            lVarA = null;
            if (lVar != null) {
                m mVar = new m(i14, i15, false, false, 12, null);
                List<z80.j> list = aVar.f117712c;
                lVarA = l.a(lVar, null, null, null, null, null, 0L, mVar, !list.isEmpty() ? list : null, null, null, false, null, fVar.f117733d, 3903);
            }
        } while (!p2Var.b(value, lVarA));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004d  */
    public final c4 y4(u90.a aVar) {
        b2 b2Var;
        Object next;
        s90.f fVar;
        boolean z14;
        Iterator it = h0.U(this.f2520m, aVar != null ? this.f2520m.indexOf(aVar) + 1 : 0).iterator();
        do {
            boolean zHasNext = it.hasNext();
            b2Var = this.f2518k;
            if (!zHasNext) {
                next = null;
                break;
            }
            next = it.next();
            if (b.f2524a[((u90.a) next).ordinal()] != 1) {
                z14 = false;
            } else {
                l lVar = (l) b2Var.f150540a.getValue();
                if (lVar != null ? p005kotlin.jvm.internal.s.g(lVar.f203081j, Boolean.TRUE) : false) {
                    z14 = false;
                } else {
                    z14 = true;
                }
            }
        } while (z14);
        u90.a aVar2 = (u90.a) next;
        if (aVar2 == null) {
            ge1.b.T(v1.a(this), null, null, new ab0.c(this, null), 3);
            return c4.m.INSTANCE;
        }
        l lVar2 = (l) b2Var.f150540a.getValue();
        if (lVar2 == null && (lVar2 = this.f2519l) == null) {
            lVar2 = new l(null, null, null, null, null, 0L, null, null, null, null, false, null, null, 8191, null);
        }
        yl2.b bVar = this.f2508a.f143495c.f111530o;
        s90.c cVar = this.f2512e.f158024a;
        bVar.getClass();
        m mVar = lVar2.f203078g;
        switch (s90.a.C2987a.f158025a[aVar2.ordinal()]) {
            case 1:
                return c4.l.INSTANCE;
            case 2:
                return c4.k.INSTANCE;
            case 3:
                return c4.g.INSTANCE;
            case 4:
                return c4.h.INSTANCE;
            case 5:
                return c4.p.INSTANCE;
            case 6:
                return new c4.o(mVar != null ? mVar.f203085a : 79200, mVar != null ? mVar.f203086b : 21600, cVar.a(bVar));
            case 7:
                int i14 = mVar != null ? mVar.f203085a : 79200;
                int i15 = mVar != null ? mVar.f203086b : 21600;
                String strA = cVar.a(bVar);
                List<z80.j> list = lVar2.f203079h;
                return (list == null || list.isEmpty()) ? new c4.b(i14, i15, strA) : new c4.n(true, strA);
            case 8:
                long j8 = lVar2.f203077f;
                Long lValueOf = j8 != -1 ? Long.valueOf(j8) : null;
                return new c4.e(lValueOf != null ? lValueOf.longValue() : 0L);
            case 9:
                return c4.d.INSTANCE;
            case 10:
                return c4.a.INSTANCE;
            case 11:
                return c4.q.INSTANCE;
            case 12:
                int i16 = s90.c.a.f158030a[bVar.ordinal()];
                if (i16 != 31) {
                    fVar = i16 != 32 ? new s90.f(-1, null) : new s90.f(4, Integer.valueOf(R.string.msg_scale_user_name_instructions));
                } else {
                    fVar = new s90.f(5, Integer.valueOf(R.string.mercury_short_name_description));
                }
                return new c4.i(fVar);
            default:
                u0.r();
                return null;
        }
    }

    public final void z4(int i14) {
        p2 p2Var;
        Object value;
        l lVar;
        do {
            p2Var = this.f2517j;
            value = p2Var.getValue();
            lVar = (l) value;
        } while (!p2Var.b(value, lVar != null ? l.a(lVar, null, null, null, null, null, 0L, null, null, null, null, false, Integer.valueOf(i14), null, 6143) : null));
    }

    /* JADX INFO: renamed from: ab0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lab0/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0026a {
        public /* synthetic */ C0026a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C0026a() {
        }
    }
}
