package cg1;

import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/g3;", "Lmo1/d;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.segments.presentation.SegmentViewModel$getConversation$1", f = "SegmentViewModel.kt", l = {22, 23, 25, 29}, m = "invokeSuspend", v = 2)
public final class w extends v13.i implements e23.p<t0<g3<? extends mo1.d>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f27208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f27209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f27210e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(c0 c0Var, String str, String str2, t13.d<? super w> dVar) {
        super(2, dVar);
        this.f27208c = c0Var;
        this.f27209d = str;
        this.f27210e = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        w wVar = new w(this.f27208c, this.f27209d, this.f27210e, dVar);
        wVar.f27207b = obj;
        return wVar;
    }

    @Override // e23.p
    public final Object invoke(t0<g3<? extends mo1.d>> t0Var, t13.d<? super Unit> dVar) {
        return ((w) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0059  */
    /* JADX WARN: Code duplicated, block: B:26:0x0068  */
    /* JADX WARN: Code duplicated, block: B:30:0x007b  */
    /* JADX WARN: Code duplicated, block: B:32:0x007f  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
    
        if (r0.emit(r13, r12) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009b, code lost:
    
        if (r0.emit(r13, r12) == r1) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v2 v2Var;
        mo1.d dVar;
        t0 t0Var = (t0) this.f27207b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f27206a;
        if (i14 == 0) {
            o13.r.b(obj);
            g3 g3VarC = g3.a.c(g3.f35298f);
            this.f27207b = t0Var;
            this.f27206a = 1;
            if (t0Var.emit(g3VarC, this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else if (i14 == 2) {
            o13.r.b(obj);
            v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                g3.a aVar2 = g3.f35298f;
                dVar = (mo1.d) ((v2.b) v2Var).f47386a;
                if (dVar.getUuid() == null) {
                    dVar = null;
                }
                aVar2.getClass();
                g3 g3VarD = g3.a.d(dVar);
                this.f27207b = null;
                this.f27206a = 3;
            } else {
                if (v2Var instanceof v2.a) {
                    u0.r();
                    return null;
                }
                v2.a aVar3 = (v2.a) v2Var;
                g3 g3VarA = g3.a.a(g3.f35298f, aVar3.f47383a.toString(), aVar3.f47383a, null, null, 12);
                this.f27207b = null;
                this.f27206a = 4;
            }
        } else {
            if (i14 != 3 && i14 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        fo1.f fVar = this.f27208c.f27135a;
        this.f27207b = t0Var;
        this.f27206a = 2;
        obj = fVar.a(this.f27209d, this.f27210e, this);
        if (obj != aVar) {
            v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                g3.a aVar4 = g3.f35298f;
                dVar = (mo1.d) ((v2.b) v2Var).f47386a;
                if (dVar.getUuid() == null) {
                    dVar = null;
                }
                aVar4.getClass();
                g3 g3VarD2 = g3.a.d(dVar);
                this.f27207b = null;
                this.f27206a = 3;
            } else {
                if (v2Var instanceof v2.a) {
                    u0.r();
                    return null;
                }
                v2.a aVar5 = (v2.a) v2Var;
                g3 g3VarA2 = g3.a.a(g3.f35298f, aVar5.f47383a.toString(), aVar5.f47383a, null, null, 12);
                this.f27207b = null;
                this.f27206a = 4;
            }
        }
        return aVar;
    }
}
