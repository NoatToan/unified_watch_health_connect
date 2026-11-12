package i02;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b5.a0;
import b5.h0;
import b5.z;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.h1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class l implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f86866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p<?> f86867b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb5/h0;", "", "<anonymous>", "(Lb5/h0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.draggable.grid.ReorderableKt$reorderable$1$1", f = "Reorderable.kt", l = {23, 25, 32}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<h0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public v f86868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f86869b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f86870c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p<?> f86871d;

        /* JADX INFO: renamed from: i02.l$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb5/c;", "Lb5/a0;", "<anonymous>", "(Lb5/c;)Lb5/a0;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.draggable.grid.ReorderableKt$reorderable$1$1$down$1", f = "Reorderable.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C1725a extends v13.h implements e23.p<b5.c, t13.d<? super a0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f86872a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f86873b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1725a(v vVar, t13.d<? super C1725a> dVar) {
                super(2, dVar);
                this.f86873b = vVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                C1725a c1725a = new C1725a(this.f86873b, dVar);
                c1725a.f86872a = obj;
                return c1725a;
            }

            @Override // e23.p
            public final Object invoke(b5.c cVar, t13.d<? super a0> dVar) {
                return ((C1725a) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                b5.c cVar = (b5.c) this.f86872a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                for (Object obj2 : cVar.k0().f15870a) {
                    if (z.b(((a0) obj2).f15748a, this.f86873b.f86928a)) {
                        return obj2;
                    }
                }
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p<?> pVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f86871d = pVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f86871d, dVar);
            aVar.f86870c = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(h0 h0Var, t13.d<? super Unit> dVar) {
            return ((a) create(h0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x005c  */
        /* JADX WARN: Code duplicated, block: B:22:0x007a  */
        /* JADX WARN: Code duplicated, block: B:23:0x0080  */
        /* JADX WARN: Code duplicated, block: B:27:0x0093  */
        /* JADX WARN: Code duplicated, block: B:37:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:38:0x00d3  */
        /* JADX WARN: Code duplicated, block: B:40:0x00d6  */
        /* JADX WARN: Code duplicated, block: B:42:0x00da  */
        /* JADX WARN: Code duplicated, block: B:46:0x0125  */
        /* JADX WARN: Code duplicated, block: B:52:0x00b9 A[SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0127, code lost:
        
            if (r1 == r2) goto L48;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objG;
            v vVar;
            Object objR;
            a0 a0Var;
            char c14;
            int i14;
            int iIntBitsToFloat;
            long j8;
            int i15;
            int iIntBitsToFloat2;
            Iterator<T> it;
            char c15;
            long j14;
            Object next;
            n4.c cVar;
            Object objR2;
            h0 h0Var = (h0) this.f86870c;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i16 = this.f86869b;
            p<?> pVar = this.f86871d;
            if (i16 == 0) {
                o13.r.b(obj);
                q53.b bVar = pVar.f86892h;
                this.f86870c = h0Var;
                this.f86869b = 1;
                objG = bVar.g(this);
                if (objG != aVar) {
                }
                return aVar;
            }
            if (i16 == 1) {
                o13.r.b(obj);
                objG = obj;
            } else if (i16 == 2) {
                vVar = this.f86868a;
                o13.r.b(obj);
                objR = obj;
                a0Var = (a0) objR;
                if (a0Var != null) {
                    long j15 = a0Var.f15750c;
                    c14 = ' ';
                    i14 = (int) (j15 >> 32);
                    iIntBitsToFloat = (int) Float.intBitsToFloat(i14);
                    j8 = 4294967295L;
                    i15 = (int) (j15 & 4294967295L);
                    iIntBitsToFloat2 = (int) Float.intBitsToFloat(i15);
                    if (pVar.u()) {
                        iIntBitsToFloat2 += pVar.r();
                    } else {
                        iIntBitsToFloat += pVar.r();
                    }
                    it = pVar.s().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            c15 = c14;
                            j14 = j8;
                            next = null;
                            break;
                        }
                        c15 = c14;
                        next = it.next();
                        j14 = j8;
                        int iN = pVar.n(next);
                        if (iIntBitsToFloat > pVar.o(next) && iN <= iIntBitsToFloat) {
                            int iP = pVar.p(next);
                            if (iIntBitsToFloat2 <= pVar.c(next) && iP <= iIntBitsToFloat2) {
                                break;
                            }
                        }
                        c14 = c15;
                        j8 = j14;
                    }
                    if (next != null) {
                        pVar.f86895k.setValue(next);
                        pVar.f86891g.setValue(Integer.valueOf(pVar.l(next)));
                    } else {
                        next = null;
                    }
                    if (next != null) {
                        cVar = vVar.f86929b;
                        if (cVar != null) {
                            long j16 = cVar.f123544a;
                            pVar.w((int) Float.intBitsToFloat(i14), (int) Float.intBitsToFloat(i15), (int) Float.intBitsToFloat((int) (j16 >> c15)), (int) Float.intBitsToFloat((int) (j16 & j14)));
                        }
                        long j17 = a0Var.f15748a;
                        j jVar = new j(pVar, 0);
                        j jVar2 = new j(pVar, 1);
                        k kVar = new k(pVar, 0);
                        this.f86870c = null;
                        this.f86868a = null;
                        this.f86869b = 3;
                        objR2 = h0Var.R(new i(j17, jVar, jVar2, kVar, null), this);
                        if (objR2 != u13.a.COROUTINE_SUSPENDED) {
                            objR2 = Unit.INSTANCE;
                        }
                    }
                }
            } else {
                if (i16 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
            vVar = (v) objG;
            C1725a c1725a = new C1725a(vVar, null);
            this.f86870c = h0Var;
            this.f86868a = vVar;
            this.f86869b = 2;
            objR = h0Var.R(c1725a, this);
            if (objR != aVar) {
                a0Var = (a0) objR;
                if (a0Var != null) {
                    long j18 = a0Var.f15750c;
                    c14 = ' ';
                    i14 = (int) (j18 >> 32);
                    iIntBitsToFloat = (int) Float.intBitsToFloat(i14);
                    j8 = 4294967295L;
                    i15 = (int) (j18 & 4294967295L);
                    iIntBitsToFloat2 = (int) Float.intBitsToFloat(i15);
                    if (pVar.u()) {
                        iIntBitsToFloat2 += pVar.r();
                    } else {
                        iIntBitsToFloat += pVar.r();
                    }
                    it = pVar.s().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            c15 = c14;
                            j14 = j8;
                            next = null;
                            break;
                        }
                        c15 = c14;
                        next = it.next();
                        j14 = j8;
                        int iN2 = pVar.n(next);
                        if (iIntBitsToFloat > pVar.o(next)) {
                        }
                        c14 = c15;
                        j8 = j14;
                    }
                    if (next != null) {
                        pVar.f86895k.setValue(next);
                        pVar.f86891g.setValue(Integer.valueOf(pVar.l(next)));
                    } else {
                        next = null;
                    }
                    if (next != null) {
                        cVar = vVar.f86929b;
                        if (cVar != null) {
                            long j19 = cVar.f123544a;
                            pVar.w((int) Float.intBitsToFloat(i14), (int) Float.intBitsToFloat(i15), (int) Float.intBitsToFloat((int) (j19 >> c15)), (int) Float.intBitsToFloat((int) (j19 & j14)));
                        }
                        long j110 = a0Var.f15748a;
                        j jVar3 = new j(pVar, 0);
                        j jVar4 = new j(pVar, 1);
                        k kVar2 = new k(pVar, 0);
                        this.f86870c = null;
                        this.f86868a = null;
                        this.f86869b = 3;
                        objR2 = h0Var.R(new i(j110, jVar3, jVar4, kVar2, null), this);
                        if (objR2 != u13.a.COROUTINE_SUSPENDED) {
                            objR2 = Unit.INSTANCE;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            return aVar;
        }
    }

    public l(boolean z14, p<?> pVar) {
        this.f86866a = z14;
        this.f86867b = pVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(h0 h0Var, t13.d<? super Unit> dVar) {
        boolean z14 = this.f86866a;
        p<?> pVar = this.f86867b;
        if (z14) {
            pVar.v();
            return Unit.INSTANCE;
        }
        Object objD = h1.d(h0Var, new a(pVar, null), dVar);
        return objD == u13.a.COROUTINE_SUSPENDED ? objD : Unit.INSTANCE;
    }
}
