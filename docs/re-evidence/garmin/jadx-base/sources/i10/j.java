package i10;

import androidx.lifecycle.t0;
import e23.p;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/t0;", "", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.connections.groups.challenges.GroupChallengesViewModel$manualScrollToUser$1", f = "GroupChallengesViewModel.kt", l = {83}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements p<t0<Integer>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f87069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f87070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f87071c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h hVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f87071c = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j jVar = new j(this.f87071c, dVar);
        jVar.f87070b = obj;
        return jVar;
    }

    @Override // e23.p
    public final Object invoke(t0<Integer> t0Var, t13.d<? super Unit> dVar) {
        return ((j) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        t0 t0Var = (t0) this.f87070b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f87069a;
        if (i14 == 0) {
            r.b(obj);
            Integer num = new Integer(this.f87071c.f87062f);
            this.f87070b = null;
            this.f87069a = 1;
            if (t0Var.emit(num, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
