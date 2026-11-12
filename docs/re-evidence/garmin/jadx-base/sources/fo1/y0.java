package fo1;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lmo1/d;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.ConversationViewModel$createConversation$1", f = "ConversationViewModel.kt", l = {794, 794}, m = "invokeSuspend", v = 2)
public final class y0 extends v13.i implements e23.p<androidx.lifecycle.t0<v2<? extends mo1.d>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.lifecycle.t0 f72867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f72868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f72869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o0 f72870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ am.c2 f72871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f72872f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(o0 o0Var, am.c2 c2Var, String str, t13.d<? super y0> dVar) {
        super(2, dVar);
        this.f72870d = o0Var;
        this.f72871e = c2Var;
        this.f72872f = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        y0 y0Var = new y0(this.f72870d, this.f72871e, this.f72872f, dVar);
        y0Var.f72869c = obj;
        return y0Var;
    }

    @Override // e23.p
    public final Object invoke(androidx.lifecycle.t0<v2<? extends mo1.d>> t0Var, t13.d<? super Unit> dVar) {
        return ((y0) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        androidx.lifecycle.t0 t0Var = (androidx.lifecycle.t0) this.f72869c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f72868b;
        if (i14 != 0) {
            if (i14 == 1) {
                t0Var = this.f72867a;
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        this.f72869c = null;
        this.f72867a = t0Var;
        this.f72868b = 1;
        int i15 = o0.H0;
        o0 o0Var = this.f72870d;
        o0Var.getClass();
        x53.c cVar = o53.s0.f129406a;
        obj = ge1.b.e0(x53.b.f189152a, new p1(this.f72871e, this.f72872f, o0Var, null), this);
        if (obj != aVar) {
        }
        return aVar;
        this.f72869c = null;
        this.f72867a = null;
        this.f72868b = 2;
    }
}
