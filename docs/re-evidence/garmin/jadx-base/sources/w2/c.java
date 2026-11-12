package w2;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.k3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb5/c;", "", "<anonymous>", "(Lb5/c;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.foundation.text.input.internal.selection.PressDownGestureKt$detectPressDownGesture$2", f = "PressDownGesture.kt", l = {31, 37}, m = "invokeSuspend", v = 1)
public final class c extends v13.h implements e23.p<b5.c, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b5.a0 f181302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f181303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f181304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f181305d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f181306e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, e23.a<Unit> aVar, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f181305d = eVar;
        this.f181306e = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c cVar = new c(this.f181305d, this.f181306e, dVar);
        cVar.f181304c = obj;
        return cVar;
    }

    @Override // e23.p
    public final Object invoke(b5.c cVar, t13.d<? super Unit> dVar) {
        return ((c) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        if (r13 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        if (r13 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        return r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0054 -> B:19:0x0057). Please report as a decompilation issue!!! */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        b5.c cVar;
        b5.c cVar2;
        b5.a0 a0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f181303b;
        e23.a<Unit> aVar2 = this.f181306e;
        if (i14 != 0) {
            if (i14 == 1) {
                cVar = (b5.c) this.f181304c;
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                a0Var = this.f181302a;
                cVar2 = (b5.c) this.f181304c;
                o13.r.b(obj);
            }
            List<b5.a0> list = ((b5.q) obj).f15870a;
            int size = list.size();
            int i15 = 0;
            while (true) {
                if (i15 >= size) {
                    aVar2.invoke();
                    return Unit.INSTANCE;
                }
                b5.a0 a0Var2 = list.get(i15);
                if (b5.z.b(a0Var2.f15748a, a0Var.f15748a) && a0Var2.f15751d) {
                    break;
                }
                i15++;
            }
            this.f181304c = cVar2;
            this.f181302a = a0Var;
            this.f181303b = 2;
            obj = cVar2.W0(b5.s.Main, this);
        } else {
            o13.r.b(obj);
            cVar = (b5.c) this.f181304c;
            this.f181304c = cVar;
            this.f181303b = 1;
            obj = k3.c(cVar, null, this, 2);
        }
        b5.a0 a0Var3 = (b5.a0) obj;
        long j8 = a0Var3.f15750c;
        this.f181305d.a();
        if (aVar2 != null) {
            cVar2 = cVar;
            a0Var = a0Var3;
            this.f181304c = cVar2;
            this.f181302a = a0Var;
            this.f181303b = 2;
            obj = cVar2.W0(b5.s.Main, this);
        }
        return Unit.INSTANCE;
    }
}
