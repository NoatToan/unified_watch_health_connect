package i02;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b5.a0;
import b5.h0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.h1;
import p008y1.k3;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class a implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p<?> f86827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w4.a f86828b;

    /* JADX INFO: renamed from: i02.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb5/h0;", "", "<anonymous>", "(Lb5/h0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.draggable.grid.DetectReorderKt$detectReorderAfterLongPress$1$1", f = "DetectReorder.kt", l = {39, 42}, m = "invokeSuspend", v = 2)
    public static final class C1723a extends v13.i implements e23.p<h0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a0 f86829a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f86830b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f86831c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p<?> f86832d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ w4.a f86833e;

        /* JADX INFO: renamed from: i02.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb5/c;", "Lb5/a0;", "<anonymous>", "(Lb5/c;)Lb5/a0;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.draggable.grid.DetectReorderKt$detectReorderAfterLongPress$1$1$down$1", f = "DetectReorder.kt", l = {40}, m = "invokeSuspend", v = 2)
        public static final class C1724a extends v13.h implements e23.p<b5.c, t13.d<? super a0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f86834a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f86835b;

            public C1724a(t13.d<? super C1724a> dVar) {
                super(2, dVar);
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                C1724a c1724a = new C1724a(dVar);
                c1724a.f86835b = obj;
                return c1724a;
            }

            @Override // e23.p
            public final Object invoke(b5.c cVar, t13.d<? super a0> dVar) {
                return ((C1724a) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                b5.c cVar = (b5.c) this.f86835b;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f86834a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                this.f86835b = null;
                this.f86834a = 1;
                Object objC = k3.c(cVar, null, this, 2);
                return objC == aVar ? aVar : objC;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1723a(p<?> pVar, w4.a aVar, t13.d<? super C1723a> dVar) {
            super(2, dVar);
            this.f86832d = pVar;
            this.f86833e = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            C1723a c1723a = new C1723a(this.f86832d, this.f86833e, dVar);
            c1723a.f86831c = obj;
            return c1723a;
        }

        @Override // e23.p
        public final Object invoke(h0 h0Var, t13.d<? super Unit> dVar) {
            return ((C1723a) create(h0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x004b  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            a0 a0Var;
            h0 h0Var = (h0) this.f86831c;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f86830b;
            if (i14 == 0) {
                o13.r.b(obj);
                C1724a c1724a = new C1724a(null);
                this.f86831c = h0Var;
                this.f86830b = 1;
                obj = h0Var.R(c1724a, this);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                a0Var = this.f86829a;
                o13.r.b(obj);
            }
            if (((a0) obj) != null) {
                this.f86832d.f86892h.i(new v(a0Var.f15748a, null, 2, null));
                w4.b.f181904b.getClass();
                w4.b.a.a();
                this.f86833e.a(0);
            }
            return Unit.INSTANCE;
            a0 a0Var2 = (a0) obj;
            this.f86831c = null;
            this.f86829a = a0Var2;
            this.f86830b = 2;
            Object objA = e.a(h0Var, a0Var2, this);
            if (objA != aVar) {
                a0Var = a0Var2;
                obj = objA;
                if (((a0) obj) != null) {
                    this.f86832d.f86892h.i(new v(a0Var.f15748a, null, 2, null));
                    w4.b.f181904b.getClass();
                    w4.b.a.a();
                    this.f86833e.a(0);
                }
                return Unit.INSTANCE;
            }
            return aVar;
        }
    }

    public a(p<?> pVar, w4.a aVar) {
        this.f86827a = pVar;
        this.f86828b = aVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(h0 h0Var, t13.d<? super Unit> dVar) {
        Object objD = h1.d(h0Var, new C1723a(this.f86827a, this.f86828b, null), dVar);
        return objD == u13.a.COROUTINE_SUSPENDED ? objD : Unit.INSTANCE;
    }
}
