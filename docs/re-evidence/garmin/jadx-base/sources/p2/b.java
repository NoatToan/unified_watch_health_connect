package p2;

import b5.a0;
import b5.c;
import b5.s;
import e23.l;
import e23.p;
import o13.r;
import oe2.f;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.k3;
import t13.d;
import v13.e;
import v13.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb5/c;", "", "<anonymous>", "(Lb5/c;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt$onRightClickDown$2", f = "RightClickGestures.kt", l = {32, 35}, m = "invokeSuspend", v = 1)
public final class b extends h implements p<c, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f134980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f134981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l<n4.c, Unit> f134982c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(l<? super n4.c, Unit> lVar, d<? super b> dVar) {
        super(2, dVar);
        this.f134982c = lVar;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        b bVar = new b(this.f134982c, dVar);
        bVar.f134981b = obj;
        return bVar;
    }

    @Override // e23.p
    public final Object invoke(c cVar, d<? super Unit> dVar) {
        return ((b) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        if (r7 == r0) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        c cVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f134980a;
        if (i14 == 0) {
            r.b(obj);
            cVar = (c) this.f134981b;
            this.f134981b = cVar;
            this.f134980a = 1;
            obj = f.d(cVar, this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            cVar = (c) this.f134981b;
            r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        a0 a0Var = (a0) obj;
        if (a0Var != null) {
            a0Var.a();
        }
        return Unit.INSTANCE;
        a0 a0Var2 = (a0) obj;
        a0Var2.a();
        this.f134982c.invoke(n4.c.a(a0Var2.f15750c));
        this.f134981b = null;
        this.f134980a = 2;
        k3.a aVar2 = k3.f193358a;
        obj = k3.j(cVar, s.Main, this);
    }
}
