package i3;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class f6 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f88079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f88080b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb5/c;", "", "<anonymous>", "(Lb5/c;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.material3.ExposedDropdownMenuKt$expandable$1$1", f = "ExposedDropdownMenu.kt", l = {1426, 1430}, m = "invokeSuspend")
    public static final class a extends v13.h implements e23.p<b5.c, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f88081a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f88082b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f88083c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f88084d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, e23.a<Unit> aVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f88083c = str;
            this.f88084d = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f88083c, this.f88084d, dVar);
            aVar.f88082b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b5.c cVar, t13.d<? super Unit> dVar) {
            return ((a) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
        
            if (r6 == r0) goto L18;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            b5.c cVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f88081a;
            if (i14 == 0) {
                o13.r.b(obj);
                cVar = (b5.c) this.f88082b;
                b5.s sVar = b5.s.Initial;
                this.f88082b = cVar;
                this.f88081a = 1;
                obj = p008y1.k3.c(cVar, sVar, this, 1);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                cVar = (b5.c) this.f88082b;
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            if (((b5.a0) obj) != null) {
                this.f88084d.invoke();
            }
            return Unit.INSTANCE;
            b5.a0 a0Var = (b5.a0) obj;
            y5.f90403b.getClass();
            if (p005kotlin.jvm.internal.s.g(this.f88083c, y5.f90406e)) {
                a0Var.a();
            }
            b5.s sVar2 = b5.s.Initial;
            this.f88082b = null;
            this.f88081a = 2;
            obj = p008y1.k3.j(cVar, sVar2, this);
        }
    }

    public f6(String str, e23.a<Unit> aVar) {
        this.f88079a = str;
        this.f88080b = aVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(b5.h0 h0Var, t13.d<? super Unit> dVar) {
        Object objC = p008y1.h1.c(h0Var, new a(this.f88079a, this.f88080b, null), dVar);
        return objC == u13.a.COROUTINE_SUSPENDED ? objC : Unit.INSTANCE;
    }
}
