package tb0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;
import sg0.w0;
import y80.b0;
import zb0.u0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ltb0/n;", "Landroidx/lifecycle/u1;", "", "deviceId", "Lzb0/u0;", "deviceEnum", "", "deviceName", "Ld90/h;", "config", "Ly80/b0;", "deviceStorageRepo", "Lf12/l;", "userSettings", "<init>", "(Ljava/lang/Long;Lzb0/u0;Ljava/lang/String;Ld90/h;Ly80/b0;Lf12/l;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f163648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u0 f163649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f163650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0 f163651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f12.l f163652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public hv.a f163653f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2 f163654g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o13.t f163655h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f163656i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p2 f163657j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b2 f163658k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p2 f163659l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p2 f163660m;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f163661a;

        static {
            int[] iArr = new int[ub0.a.values().length];
            try {
                iArr[ub0.a.PLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ub0.a.NEXT_STEP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ub0.a.PREVIOUS_STEP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f163661a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltb0/t;", "uiState", "", FirebaseAnalytics.Param.INDEX, "<anonymous>", "(Ltb0/t;I)Ltb0/t;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.tutorials.GestureAnimationLegacyViewModel$tutorialState$1", f = "GestureAnimationLegacyViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.q<t, Integer, t13.d<? super t>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ t f163662a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ int f163663b;

        public b(t13.d<? super b> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(t tVar, Integer num, t13.d<? super t> dVar) {
            int iIntValue = num.intValue();
            b bVar = new b(dVar);
            bVar.f163662a = tVar;
            bVar.f163663b = iIntValue;
            return bVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            t tVar = this.f163662a;
            int i14 = this.f163663b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            return t.a(tVar, false, null, i14, 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Ltb0/t;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.tutorials.GestureAnimationLegacyViewModel$tutorialState$2", f = "GestureAnimationLegacyViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<r53.j<? super t>, t13.d<? super Unit>, Object> {
        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return n.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super t> jVar, t13.d<? super Unit> dVar) {
            return ((c) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            n nVar = n.this;
            nVar.getClass();
            ge1.b.T(v1.a(nVar), null, null, new o(nVar, null), 3);
            return Unit.INSTANCE;
        }
    }

    public n(Long l14, u0 u0Var, String str, d90.h hVar, b0 b0Var, f12.l lVar) {
        u0Var.getClass();
        hVar.getClass();
        b0Var.getClass();
        lVar.getClass();
        this.f163648a = l14;
        this.f163649b = u0Var;
        this.f163650c = str;
        this.f163651d = b0Var;
        this.f163652e = lVar;
        p2 p2VarA = q2.a(0);
        this.f163654g = p2VarA;
        o13.t tVarB = o13.m.b(new w0(this, 19));
        this.f163655h = tVarB;
        t tVar = new t(true, false, null, ((Boolean) tVarB.getValue()).booleanValue(), hVar.f58470d, 0, 38, null);
        this.f163656i = tVar;
        p2 p2VarA2 = q2.a(tVar);
        this.f163657j = p2VarA2;
        this.f163658k = r53.s.K(new r53.v(new c(null), new r53.u1(p2VarA2, p2VarA, new b(null))), v1.a(this), k2.a.a(k2.f150703a, 2), tVar);
        p2 p2VarA3 = q2.a(null);
        this.f163659l = p2VarA3;
        this.f163660m = p2VarA3;
    }

    public final void x4(ub0.a aVar) {
        Object value;
        Object value2;
        aVar.getClass();
        int i14 = a.f163661a[aVar.ordinal()];
        p2 p2Var = this.f163654g;
        if (i14 != 1 && i14 != 2) {
            if (i14 == 3 && ((Number) p2Var.getValue()).intValue() > 0) {
                do {
                    value2 = p2Var.getValue();
                } while (!p2Var.b(value2, Integer.valueOf(((Number) value2).intValue() - 1)));
                return;
            }
            return;
        }
        hv.a aVar2 = this.f163653f;
        if (aVar2 == null || ((Number) p2Var.getValue()).intValue() >= aVar2.f85745d - 1) {
            return;
        }
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, Integer.valueOf(((Number) value).intValue() + 1)));
    }
}
