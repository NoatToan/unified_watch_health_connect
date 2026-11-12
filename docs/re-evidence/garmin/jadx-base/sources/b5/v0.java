package b5;

import androidx.compose.ui.input.pointer.CancelTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputResetException;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.List;
import kotlin.a4;
import o53.c2;
import p005kotlin.Metadata;
import p005kotlin.NoWhenBranchMatchedException;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0013B=\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rBU\b\u0017\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\b\u0012\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000e¢\u0006\u0004\b\f\u0010\u0012¨\u0006\u0014"}, d2 = {"Lb5/v0;", "Lh4/r$c;", "Lb5/u0;", "Lb5/h0;", "Lg6/c;", "", "key1", "key2", "", UserMetadata.KEYDATA_FILENAME, "Landroidx/compose/ui/input/pointer/PointerInputEventHandler;", "pointerInputEventHandler", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)V", "Lkotlin/Function2;", "Lt13/d;", "", "pointerInputEvent", "(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Le23/p;)V", "b", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v0 extends h4.r.c implements u0, h0, g6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f15905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f15906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f15907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.p<? super h0, ? super t13.d<? super Unit>, ? extends Object> f15908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PointerInputEventHandler f15909e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c2 f15910f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q f15911g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q3.c<b<?>> f15912h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final q3.c f15913i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final q3.c<b<?>> f15914j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public q f15915k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f15916l;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb5/h0;", "", "invoke", "(Lb5/h0;Lt13/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f15917a = new a();

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(h0 h0Var, t13.d<? super Unit> dVar) {
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb5/v0$b;", "R", "Lb5/c;", "Lg6/c;", "Lt13/d;", "completion", "<init>", "(Lb5/v0;Lt13/d;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class b<R> implements b5.c, g6.c, t13.d<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v0 f15918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final t13.d<R> f15919b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public o53.k f15920c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public s f15921d = s.Main;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final t13.h f15922e = t13.h.f161748a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(t13.d<? super R> dVar) {
            this.f15918a = v0.this;
            this.f15919b = dVar;
        }

        @Override // g6.c
        public final long A(long j8) {
            return this.f15918a.A(j8);
        }

        @Override // g6.c
        public final long D(float f14) {
            return this.f15918a.D(f14);
        }

        @Override // g6.i
        public final float H0(long j8) {
            return this.f15918a.H0(j8);
        }

        @Override // b5.c
        public final Object W0(s sVar, t13.d<? super q> dVar) throws Throwable {
            o53.k kVar = new o53.k(u13.f.b(dVar), 1);
            kVar.q();
            this.f15921d = sVar;
            this.f15920c = kVar;
            Object objP = kVar.p();
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            return objP;
        }

        @Override // g6.i
        public final long Y(float f14) {
            return this.f15918a.Y(f14);
        }

        @Override // b5.c
        public final long a() {
            return v0.this.f15916l;
        }

        @Override // g6.c
        public final float c1(int i14) {
            return this.f15918a.c1(i14);
        }

        @Override // g6.c
        public final float d1(float f14) {
            return this.f15918a.d1(f14);
        }

        @Override // g6.c
        public final int f0(float f14) {
            return this.f15918a.f0(f14);
        }

        @Override // g6.c
        public final float g0(long j8) {
            return this.f15918a.g0(j8);
        }

        @Override // t13.d
        /* JADX INFO: renamed from: getContext */
        public final t13.g getF157466b() {
            return this.f15922e;
        }

        @Override // g6.c
        /* JADX INFO: renamed from: getDensity */
        public final float getF75991a() {
            return this.f15918a.getF75991a();
        }

        @Override // b5.c
        public final a4 getViewConfiguration() {
            v0 v0Var = v0.this;
            v0Var.getClass();
            return h5.k.g(v0Var).C;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v0, types: [long] */
        /* JADX WARN: Type inference failed for: r8v1, types: [o53.l1] */
        /* JADX WARN: Type inference failed for: r8v4, types: [o53.l1] */
        /* JADX WARN: Type inference failed for: r8v7 */
        /* JADX WARN: Type inference failed for: r8v8 */
        @Override // b5.c
        public final Object h1(long j8, e23.p pVar, v13.a aVar) {
            w0 w0Var;
            o53.k kVar;
            if (aVar instanceof w0) {
                w0Var = (w0) aVar;
                int i14 = w0Var.f15936d;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    w0Var.f15936d = i14 - Integer.MIN_VALUE;
                } else {
                    w0Var = new w0(this, aVar);
                }
            } else {
                w0Var = new w0(this, aVar);
            }
            Object objInvoke = w0Var.f15934b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i15 = w0Var.f15936d;
            try {
                if (i15 == 0) {
                    o13.r.b(objInvoke);
                    if (j8 <= 0 && (kVar = this.f15920c) != null) {
                        int i16 = o13.q.f128596b;
                        kVar.resumeWith(new o13.q.b(new PointerEventTimeoutCancellationException(j8)));
                    }
                    c2 c2VarT = ge1.b.T(v0.this.getCoroutineScope(), null, null, new x0(j8, this, null), 3);
                    w0Var.f15933a = c2VarT;
                    w0Var.f15936d = 1;
                    objInvoke = pVar.invoke(this, w0Var);
                    j8 = c2VarT;
                    if (objInvoke == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c2 c2Var = w0Var.f15933a;
                    o13.r.b(objInvoke);
                    j8 = c2Var;
                }
                j8.c(CancelTimeoutCancellationException.INSTANCE);
                return objInvoke;
            } catch (Throwable th3) {
                j8.c(CancelTimeoutCancellationException.INSTANCE);
                throw th3;
            }
        }

        @Override // b5.c
        public final q k0() {
            return v0.this.f15911g;
        }

        @Override // g6.c
        public final long k1(long j8) {
            return this.f15918a.k1(j8);
        }

        @Override // g6.i
        /* JADX INFO: renamed from: r0 */
        public final float getF75992b() {
            return this.f15918a.getF75992b();
        }

        @Override // t13.d
        public final void resumeWith(Object obj) {
            v0 v0Var = v0.this;
            synchronized (v0Var.f15913i) {
                v0Var.f15912h.j(this);
                Unit unit = Unit.INSTANCE;
            }
            this.f15919b.resumeWith(obj);
        }

        @Override // g6.c
        public final float s0(float f14) {
            return this.f15918a.getF75991a() * f14;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // b5.c
        public final Object t0(long j8, e23.p pVar, v13.a aVar) {
            y0 y0Var;
            if (aVar instanceof y0) {
                y0Var = (y0) aVar;
                int i14 = y0Var.f15945c;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    y0Var.f15945c = i14 - Integer.MIN_VALUE;
                } else {
                    y0Var = new y0(this, aVar);
                }
            } else {
                y0Var = new y0(this, aVar);
            }
            Object obj = y0Var.f15943a;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i15 = y0Var.f15945c;
            try {
                if (i15 == 0) {
                    o13.r.b(obj);
                    y0Var.f15945c = 1;
                    Object objH1 = h1(j8, pVar, y0Var);
                    return objH1 == aVar2 ? aVar2 : objH1;
                }
                if (i15 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            } catch (PointerEventTimeoutCancellationException unused) {
                return null;
            }
        }

        @Override // g6.c
        public final int v0(long j8) {
            return this.f15918a.v0(j8);
        }

        @Override // b5.c
        public final long w1() {
            v0 v0Var = v0.this;
            v0Var.getClass();
            long jK1 = v0Var.k1(h5.k.g(v0Var).C.g());
            long j8 = v0Var.f15916l;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jK1 >> 32)) - ((int) (j8 >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jK1 & 4294967295L)) - ((int) (j8 & 4294967295L))) / 2.0f)) & 4294967295L);
            n4.g.a aVar = n4.g.f123559b;
            return jFloatToRawIntBits;
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15924a;

        static {
            int[] iArr = new int[s.values().length];
            try {
                iArr[s.Initial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s.Final.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s.Main.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f15924a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class d extends p005kotlin.jvm.internal.w implements e23.l<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b<R> f15925a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(b<R> bVar) {
            super(1);
            this.f15925a = bVar;
        }

        @Override // e23.l
        public final Unit invoke(Throwable th3) {
            Throwable th4 = th3;
            b<R> bVar = this.f15925a;
            o53.k kVar = bVar.f15920c;
            if (kVar != null) {
                kVar.u(th4);
            }
            bVar.f15920c = null;
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$onPointerEvent$1", f = "SuspendingPointerInputFilter.kt", l = {718, 720}, m = "invokeSuspend", v = 1)
    public static final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f15926a;

        public e(t13.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return v0.this.new e(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
        
            if (r1.invoke(r5, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
        
            if (r1.invoke(r5, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
        
            return r0;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f15926a;
            if (i14 == 0) {
                o13.r.b(obj);
                v0 v0Var = v0.this;
                e23.p<? super h0, ? super t13.d<? super Unit>, ? extends Object> pVar = v0Var.f15908d;
                if (pVar != null) {
                    this.f15926a = 1;
                } else {
                    PointerInputEventHandler pointerInputEventHandler = v0Var.f15909e;
                    this.f15926a = 2;
                }
            } else {
                if (i14 != 1 && i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public v0(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.f15905a = obj;
        this.f15906b = obj2;
        this.f15907c = objArr;
        this.f15909e = pointerInputEventHandler;
        this.f15911g = s0.f15885a;
        q3.c<b<?>> cVar = new q3.c<>(new b[16], 0);
        this.f15912h = cVar;
        this.f15913i = cVar;
        this.f15914j = new q3.c<>(new b[16], 0);
        g6.m.f76012b.getClass();
        this.f15916l = 0L;
    }

    @Override // b5.h0
    public final <R> Object R(e23.p<? super b5.c, ? super t13.d<? super R>, ? extends Object> pVar, t13.d<? super R> dVar) {
        o53.k kVar = new o53.k(u13.f.b(dVar), 1);
        kVar.q();
        b bVar = new b(kVar);
        synchronized (this.f15913i) {
            this.f15912h.b(bVar);
            t13.i iVar = new t13.i(u13.f.b(u13.f.a(pVar, bVar, bVar)), u13.a.COROUTINE_SUSPENDED);
            int i14 = o13.q.f128596b;
            iVar.resumeWith(Unit.INSTANCE);
        }
        kVar.r(new d(bVar));
        return kVar.p();
    }

    public final void U1(q qVar, s sVar) {
        o53.k kVar;
        o53.k kVar2;
        synchronized (this.f15913i) {
            q3.c<b<?>> cVar = this.f15914j;
            cVar.d(cVar.f142358c, this.f15912h);
        }
        try {
            int i14 = c.f15924a[sVar.ordinal()];
            if (i14 == 1 || i14 == 2) {
                q3.c<b<?>> cVar2 = this.f15914j;
                b<?>[] bVarArr = cVar2.f142356a;
                int i15 = cVar2.f142358c;
                for (int i16 = 0; i16 < i15; i16++) {
                    b<?> bVar = bVarArr[i16];
                    if (sVar == bVar.f15921d && (kVar = bVar.f15920c) != null) {
                        bVar.f15920c = null;
                        int i17 = o13.q.f128596b;
                        kVar.resumeWith(qVar);
                    }
                }
            } else {
                if (i14 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                q3.c<b<?>> cVar3 = this.f15914j;
                int i18 = cVar3.f142358c - 1;
                b<?>[] bVarArr2 = cVar3.f142356a;
                if (i18 < bVarArr2.length) {
                    while (i18 >= 0) {
                        b<?> bVar2 = bVarArr2[i18];
                        if (sVar == bVar2.f15921d && (kVar2 = bVar2.f15920c) != null) {
                            bVar2.f15920c = null;
                            int i19 = o13.q.f128596b;
                            kVar2.resumeWith(qVar);
                        }
                        i18--;
                    }
                }
            }
            this.f15914j.g();
        } catch (Throwable th3) {
            this.f15914j.g();
            throw th3;
        }
    }

    @Override // h5.u1
    public final void a1() {
        q qVar = this.f15915k;
        if (qVar == null) {
            return;
        }
        List<a0> list = qVar.f15870a;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            if (list.get(i14).f15751d) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i15 = 0; i15 < size2; i15++) {
                    a0 a0Var = list.get(i15);
                    long j8 = a0Var.f15748a;
                    long j14 = a0Var.f15750c;
                    long j15 = a0Var.f15749b;
                    float f14 = a0Var.f15752e;
                    boolean z14 = a0Var.f15751d;
                    arrayList.add(new a0(j8, j15, j14, false, f14, j15, j14, z14, z14, a0Var.f15756i, 0L, 0.0f, 0L, 7168, (p005kotlin.jvm.internal.j) null));
                }
                q qVar2 = new q(arrayList);
                this.f15911g = qVar2;
                U1(qVar2, s.Initial);
                U1(qVar2, s.Main);
                U1(qVar2, s.Final);
                this.f15915k = null;
                return;
            }
        }
    }

    @Override // g6.c
    /* JADX INFO: renamed from: getDensity */
    public final float getF75991a() {
        return h5.k.g(this).A.getF75991a();
    }

    @Override // b5.h0
    public final a4 getViewConfiguration() {
        return h5.k.g(this).C;
    }

    @Override // b5.u0
    public final void i0() {
        c2 c2Var = this.f15910f;
        if (c2Var != null) {
            c2Var.H(new PointerInputResetException());
            this.f15910f = null;
        }
    }

    @Override // h5.j, h5.u1
    public final void onDensityChange() {
        i0();
    }

    @Override // h4.r.c
    public final void onDetach() {
        i0();
        super.onDetach();
    }

    @Override // g6.i
    /* JADX INFO: renamed from: r0 */
    public final float getF75992b() {
        return h5.k.g(this).A.getF75992b();
    }

    @Override // h5.u1
    public final void u1(q qVar, s sVar, long j8) {
        this.f15916l = j8;
        if (sVar == s.Initial) {
            this.f15911g = qVar;
        }
        if (this.f15910f == null) {
            this.f15910f = ge1.b.T(getCoroutineScope(), null, o53.d0.UNDISPATCHED, new e(null), 1);
        }
        U1(qVar, sVar);
        List<a0> list = qVar.f15870a;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            if (!r.d(list.get(i14))) {
                this.f15915k = qVar;
            }
        }
        qVar = null;
        this.f15915k = qVar;
    }

    @Override // h5.u1
    public final void z0() {
        i0();
    }

    public /* synthetic */ v0(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : obj, (i14 & 2) != 0 ? null : obj2, (i14 & 4) != 0 ? null : objArr, pointerInputEventHandler);
    }

    @o13.e
    public v0(Object obj, Object obj2, Object[] objArr, e23.p<? super h0, ? super t13.d<? super Unit>, ? extends Object> pVar) {
        this(obj, obj2, objArr, a.f15917a);
        this.f15908d = pVar;
    }
}
