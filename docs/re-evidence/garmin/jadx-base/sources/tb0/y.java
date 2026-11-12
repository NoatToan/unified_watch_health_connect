package tb0;

import android.graphics.Bitmap;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ltb0/y;", "Landroidx/lifecycle/u1;", "Ld90/i;", "config", "Laa0/b;", "animationHolderProvider", "<init>", "(Ld90/i;Laa0/b;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d90.i f163729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aa0.b f163730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f163731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b2 f163732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f163733e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f163734f;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f163735a;

        static {
            int[] iArr = new int[ub0.a.values().length];
            try {
                iArr[ub0.a.PLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ub0.a.PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ub0.a.RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f163735a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltb0/a;", "wrapper", "Ltb0/a0;", "<anonymous>", "(Ltb0/a;)Ltb0/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.tutorials.PairAnimationViewModel$pairUiState$1", f = "PairAnimationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<tb0.a, t13.d<? super a0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f163736a;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = y.this.new b(dVar);
            bVar.f163736a = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(tb0.a aVar, t13.d<? super a0> dVar) {
            return ((b) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            String str;
            tb0.a aVar = (tb0.a) this.f163736a;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            x xVar = null;
            aa0.d dVar = aVar != null ? aVar.f163587a : null;
            boolean z14 = dVar == null;
            if (dVar != null) {
                y yVar = y.this;
                yVar.getClass();
                int i14 = dVar.f2198f.f2187a;
                String str2 = dVar.f2193a;
                Map<String, Bitmap> map = dVar.f2196d;
                i53.d dVarG = map != null ? i53.a.g(map) : null;
                String str3 = dVar.f2195c;
                d90.i iVar = yVar.f163729a;
                if (iVar == null || (str = iVar.f58475b) == null) {
                    str = "";
                }
                xVar = new x(i14, str2, dVarG, str3, str);
            }
            return new a0(false, z14, xVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Ltb0/a0;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.tutorials.PairAnimationViewModel$pairUiState$2", f = "PairAnimationViewModel.kt", l = {43}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<r53.j<? super a0>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f163738a;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return y.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super a0> jVar, t13.d<? super Unit> dVar) {
            return ((c) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f163738a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f163738a = 1;
                if (y.x4(y.this, this) == aVar) {
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

    public y(d90.i iVar, aa0.b bVar) {
        bVar.getClass();
        this.f163729a = iVar;
        this.f163730b = bVar;
        p2 p2VarA = q2.a(null);
        this.f163731c = p2VarA;
        this.f163732d = r53.s.K(new r53.v(new c(null), r53.s.D(p2VarA, new b(null))), v1.a(this), k2.a.a(k2.f150703a, 2), new a0(true, false, null, 6, null));
        p2 p2VarA2 = q2.a(null);
        this.f163733e = p2VarA2;
        this.f163734f = p2VarA2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object x4(y yVar, v13.c cVar) {
        z zVar;
        Object value;
        Object value2;
        tb0.a aVar;
        p2 p2Var = yVar.f163731c;
        if (cVar instanceof z) {
            zVar = (z) cVar;
            int i14 = zVar.f163742c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                zVar.f163742c = i14 - Integer.MIN_VALUE;
            } else {
                zVar = new z(yVar, cVar);
            }
        } else {
            zVar = new z(yVar, cVar);
        }
        Object objA = zVar.f163740a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = zVar.f163742c;
        try {
            if (i15 == 0) {
                o13.r.b(objA);
                aa0.b bVar = yVar.f163730b;
                zVar.f163742c = 1;
                objA = bVar.a(zVar);
                if (objA == aVar2) {
                    return aVar2;
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
                if (dVar != null) {
                    aa0.c cVar2 = dVar.f2199g;
                    int i16 = cVar2.f2191b;
                    cVar2.getClass();
                    aVar = new tb0.a(dVar, i16 + "_0");
                } else {
                    aVar = null;
                }
            } while (!p2Var.b(value2, aVar));
        } catch (Exception unused) {
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, null));
        }
        return Unit.INSTANCE;
    }
}
