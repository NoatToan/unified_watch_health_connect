package z2;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.k3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class k1 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o1 f201662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f201663b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb5/c;", "", "<anonymous>", "(Lb5/c;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1$1", f = "SelectionManager.kt", l = {994, 1000}, m = "invokeSuspend", v = 1)
    public static final class a extends v13.h implements e23.p<b5.c, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f201664a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f201665b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o1 f201666c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f201667d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o1 o1Var, e23.a<Unit> aVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f201666c = o1Var;
            this.f201667d = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f201666c, this.f201667d, dVar);
            aVar.f201665b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b5.c cVar, t13.d<? super Unit> dVar) {
            return ((a) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        
            if (r6 == r0) goto L15;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            b5.c cVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f201664a;
            if (i14 == 0) {
                o13.r.b(obj);
                cVar = (b5.c) this.f201665b;
                this.f201665b = cVar;
                this.f201664a = 1;
                k3.a aVar2 = k3.f193358a;
                obj = k3.d(cVar, b5.s.Main, this);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                cVar = (b5.c) this.f201665b;
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            if (!((Boolean) obj).booleanValue() && this.f201666c.f() == null) {
                this.f201667d.invoke();
            }
            return Unit.INSTANCE;
            b5.s sVar = b5.s.Initial;
            this.f201665b = null;
            this.f201664a = 2;
            obj = p008y1.m0.a(cVar, (b5.a0) obj, sVar, this);
        }
    }

    public k1(o1 o1Var, e23.a<Unit> aVar) {
        this.f201662a = o1Var;
        this.f201663b = aVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(b5.h0 h0Var, t13.d<? super Unit> dVar) {
        Object objC = p008y1.h1.c(h0Var, new a(this.f201662a, this.f201663b, null), dVar);
        return objC == u13.a.COROUTINE_SUSPENDED ? objC : Unit.INSTANCE;
    }
}
