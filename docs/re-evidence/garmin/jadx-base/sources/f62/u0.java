package f62;

import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDTO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lf62/u0;", "Lk52/d;", "", "Lm52/k;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u0 extends k52.d<List<? extends m52.k>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f69341c = "WorkoutPreCreateViewModel";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l52.y f69342d = (l52.y) KoinJavaComponent.get$default(l52.y.class, null, null, 6, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o52.e f69343e = (o52.e) KoinJavaComponent.get$default(o52.e.class, null, null, 6, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o52.f f69344f = (o52.f) KoinJavaComponent.get$default(o52.f.class, null, null, 6, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o52.c f69345g = (o52.c) KoinJavaComponent.get$default(o52.c.class, null, null, 6, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f69346h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b2 f69347i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p2 f69348j;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f69349a;

        static {
            int[] iArr = new int[m52.k.values().length];
            try {
                iArr[m52.k.f116757q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m52.k.A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m52.k.B.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f69349a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lf62/t0;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutPreCreateViewModel$uiState$1", f = "WorkoutPreCreateViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<r53.j<? super t0>, t13.d<? super Unit>, Object> {
        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return u0.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super t0> jVar, t13.d<? super Unit> dVar) {
            return ((b) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            u0 u0Var = u0.this;
            boolean zA = u0Var.f69344f.a();
            p2 p2Var = u0Var.f69348j;
            com.garmin.android.apps.connectmobile.workouts.data.model.y yVar = (com.garmin.android.apps.connectmobile.workouts.data.model.y) p2Var.getValue();
            boolean z14 = false;
            boolean z15 = yVar != null && yVar.a();
            if (!zA || z15) {
                u0Var.B4(false);
            } else {
                com.garmin.android.apps.connectmobile.workouts.data.model.y yVar2 = (com.garmin.android.apps.connectmobile.workouts.data.model.y) p2Var.getValue();
                boolean z16 = yVar2 != null && yVar2.b();
                com.garmin.android.apps.connectmobile.workouts.data.model.y yVar3 = (com.garmin.android.apps.connectmobile.workouts.data.model.y) p2Var.getValue();
                if (yVar3 != null && (((yVar3 instanceof com.garmin.android.apps.connectmobile.workouts.data.model.y.a) || (yVar3 instanceof com.garmin.android.apps.connectmobile.workouts.data.model.y.c)) && z16)) {
                    z14 = true;
                }
                u0Var.B4(z14);
            }
            return Unit.INSTANCE;
        }
    }

    public u0() {
        p2 p2VarA = q2.a(new t0(false, 1, null));
        this.f69346h = p2VarA;
        r53.v vVar = new r53.v(new b(null), p2VarA);
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        this.f69347i = r53.s.K(vVar, aVarA, k2.a.f150706c, p2VarA.getValue());
        p2 p2VarA2 = q2.a(null);
        this.f69348j = p2VarA2;
        r53.s.d(p2VarA2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable A4(m52.k kVar, v13.c cVar) {
        x0 x0Var;
        if (cVar instanceof x0) {
            x0Var = (x0) cVar;
            int i14 = x0Var.f69362c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                x0Var.f69362c = i14 - Integer.MIN_VALUE;
            } else {
                x0Var = new x0(this, cVar);
            }
        } else {
            x0Var = new x0(this, cVar);
        }
        Object objF = x0Var.f69360a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = x0Var.f69362c;
        if (i15 == 0) {
            o13.r.b(objF);
            List listC = p13.w.c(kVar);
            x0Var.f69362c = 1;
            objF = this.f69342d.f(listC, 0, Integer.MAX_VALUE, x0Var);
            if (objF == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objF);
        }
        v2 v2Var = (v2) objF;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return p13.j0.f134944a;
            }
            lc.u0.r();
            return null;
        }
        Iterable iterable = (Iterable) ((v2.b) v2Var).f47386a;
        ArrayList arrayList = new ArrayList(p13.y.r(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((WorkoutDTO) it.next()).f48041b);
        }
        return arrayList;
    }

    public final void B4(boolean z14) {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f69346h;
            value = p2Var.getValue();
            ((t0) value).getClass();
        } while (!p2Var.b(value, new t0(z14)));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008a  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00de  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k52.d
    public final Object y4(v13.c cVar) {
        w0 w0Var;
        boolean zL0;
        com.garmin.android.apps.connectmobile.workouts.data.model.y yVar;
        boolean z14;
        com.garmin.android.apps.connectmobile.workouts.data.model.y yVar2;
        ArrayList arrayList;
        Iterator it;
        m52.k kVarB;
        int i14;
        o52.e eVar;
        if (cVar instanceof w0) {
            w0Var = (w0) cVar;
            int i15 = w0Var.f69358e;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                w0Var.f69358e = i15 - Integer.MIN_VALUE;
            } else {
                w0Var = new w0(this, cVar);
            }
        } else {
            w0Var = new w0(this, cVar);
        }
        Object objA = w0Var.f69356c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = w0Var.f69358e;
        if (i16 == 0) {
            o13.r.b(objA);
            w0Var.f69358e = 1;
            int i17 = o52.c.f129295e;
            objA = this.f69345g.a(null, w0Var);
            if (objA != aVar) {
            }
            return aVar;
        }
        if (i16 == 1) {
            o13.r.b(objA);
        } else {
            if (i16 == 2) {
                zL0 = w0Var.f69355b;
                yVar = w0Var.f69354a;
                o13.r.b(objA);
                w0Var.f69354a = yVar;
                w0Var.f69355b = zL0;
                w0Var.f69358e = 3;
                objA = ((o53.i0) objA).await(w0Var);
                if (objA != aVar) {
                    z14 = zL0;
                    yVar2 = yVar;
                }
                return aVar;
            }
            if (i16 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z14 = w0Var.f69355b;
            yVar2 = w0Var.f69354a;
            o13.r.b(objA);
        }
        List listN0 = p13.h0.N0((Iterable) objA, new v0());
        arrayList = new ArrayList();
        it = listN0.iterator();
        while (it.hasNext()) {
            kVarB = ((com.garmin.android.apps.connectmobile.workouts.data.model.i0) it.next()).b();
            if (kVarB == null) {
                i14 = -1;
            } else {
                i14 = a.f69349a[kVarB.ordinal()];
            }
            eVar = this.f69343e;
            if (i14 != 1) {
                if (i14 != 2) {
                    yVar2.getClass();
                    if ((yVar2 instanceof com.garmin.android.apps.connectmobile.workouts.data.model.y.c) && yVar2.a()) {
                        kVarB = null;
                    }
                } else if (i14 == 3 && (!eVar.s() || z14)) {
                    kVarB = null;
                }
            } else if (!eVar.G()) {
                kVarB = null;
            }
            if (kVarB != null) {
                arrayList.add(kVarB);
            }
        }
        return arrayList;
        com.garmin.android.apps.connectmobile.workouts.data.model.y yVar3 = (com.garmin.android.apps.connectmobile.workouts.data.model.y) objA;
        this.f69348j.setValue(yVar3);
        bv.b.f21239a.getClass();
        bv.b.a();
        zL0 = k1.f37122a.l0();
        w0Var.f69354a = yVar3;
        w0Var.f69355b = zL0;
        w0Var.f69358e = 2;
        o53.i0 i0VarB0 = this.f69342d.b0();
        if (i0VarB0 != aVar) {
            yVar = yVar3;
            objA = i0VarB0;
            w0Var.f69354a = yVar;
            w0Var.f69355b = zL0;
            w0Var.f69358e = 3;
            objA = ((o53.i0) objA).await(w0Var);
            if (objA != aVar) {
                z14 = zL0;
                yVar2 = yVar;
                List listN1 = p13.h0.N0((Iterable) objA, new v0());
                arrayList = new ArrayList();
                it = listN1.iterator();
                while (it.hasNext()) {
                    kVarB = ((com.garmin.android.apps.connectmobile.workouts.data.model.i0) it.next()).b();
                    if (kVarB == null) {
                        i14 = -1;
                    } else {
                        i14 = a.f69349a[kVarB.ordinal()];
                    }
                    eVar = this.f69343e;
                    if (i14 != 1) {
                        if (i14 != 2) {
                            yVar2.getClass();
                            if (yVar2 instanceof com.garmin.android.apps.connectmobile.workouts.data.model.y.c) {
                                kVarB = null;
                            }
                        } else if (i14 == 3) {
                            kVarB = null;
                        }
                    } else if (!eVar.G()) {
                        kVarB = null;
                    }
                    if (kVarB != null) {
                        arrayList.add(kVarB);
                    }
                }
                return arrayList;
            }
        }
        return aVar;
    }

    @Override // k52.d
    /* JADX INFO: renamed from: z4, reason: from getter */
    public final String getF69341c() {
        return this.f69341c;
    }
}
