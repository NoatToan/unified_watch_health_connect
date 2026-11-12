package p006l2;

import b5.a0;
import b5.c;
import b5.q;
import b5.s;
import b5.z;
import e23.p;
import java.util.List;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.k3;
import t13.d;
import u13.a;
import v13.e;
import v13.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb5/c;", "", "<anonymous>", "(Lb5/c;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", l = {77, 81}, m = "invokeSuspend", v = 1)
public final class i2 extends h implements p<c, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a0 f108571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f108572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f108573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p2 f108574d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(p2 p2Var, d<? super i2> dVar) {
        super(2, dVar);
        this.f108574d = p2Var;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        i2 i2Var = new i2(this.f108574d, dVar);
        i2Var.f108573c = obj;
        return i2Var;
    }

    @Override // e23.p
    public final Object invoke(c cVar, d<? super Unit> dVar) {
        return ((i2) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        if (r13 == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        if (r13 == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        return r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0050 -> B:17:0x0053). Please report as a decompilation issue!!! */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        c cVar;
        c cVar2;
        a0 a0Var;
        a aVar = a.COROUTINE_SUSPENDED;
        int i14 = this.f108572b;
        p2 p2Var = this.f108574d;
        if (i14 != 0) {
            if (i14 == 1) {
                cVar = (c) this.f108573c;
                r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                a0Var = this.f108571a;
                cVar2 = (c) this.f108573c;
                r.b(obj);
            }
            List<a0> list = ((q) obj).f15870a;
            int size = list.size();
            int i15 = 0;
            while (true) {
                if (i15 >= size) {
                    p2Var.a();
                    return Unit.INSTANCE;
                }
                a0 a0Var2 = list.get(i15);
                if (z.b(a0Var2.f15748a, a0Var.f15748a) && a0Var2.f15751d) {
                    break;
                }
                i15++;
            }
            this.f108573c = cVar2;
            this.f108571a = a0Var;
            this.f108572b = 2;
            obj = cVar2.W0(s.Main, this);
        } else {
            r.b(obj);
            cVar = (c) this.f108573c;
            this.f108573c = cVar;
            this.f108572b = 1;
            obj = k3.c(cVar, null, this, 2);
        }
        a0 a0Var3 = (a0) obj;
        long j8 = a0Var3.f15750c;
        p2Var.c();
        cVar2 = cVar;
        a0Var = a0Var3;
        this.f108573c = cVar2;
        this.f108571a = a0Var;
        this.f108572b = 2;
        obj = cVar2.W0(s.Main, this);
    }
}
