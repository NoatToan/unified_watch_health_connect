package li0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.follow.ui.FollowAction$unfollowUser$1", f = "FollowAction.kt", l = {399, 402, 407}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f112836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f112837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v2.a f112838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f112839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f112840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d0 f112841f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f112842g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(f fVar, d0 d0Var, Context context, t13.d<? super p> dVar) {
        super(1, dVar);
        this.f112840e = fVar;
        this.f112841f = d0Var;
        this.f112842g = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new p(this.f112840e, this.f112841f, this.f112842g, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super Unit> dVar) {
        return ((p) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a3, code lost:
    
        if (li0.f.a(r3, r2, r1, r8) == r0) goto L39;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v2 v2Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f112839d;
        d0 d0Var = this.f112841f;
        f fVar = this.f112840e;
        if (i14 == 0) {
            o13.r.b(obj);
            ei0.d dVar = fVar.f112664e;
            String str = d0Var != null ? d0Var.f112650c : null;
            this.f112839d = 1;
            obj = dVar.e0(str, this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else if (i14 == 2) {
            v2Var = this.f112838c;
            o13.r.b(obj);
            v2.a aVar2 = (v2.a) v2Var;
            String strI = lc.u0.i(aVar2.f47384b, "Unfollow failed (", "): ", aVar2.f47385c);
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var, "FollowItemViewAction", strI);
        } else {
            if (i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        v2 v2Var2 = (v2) obj;
        if (v2Var2 instanceof v2.a) {
            this.f112836a = obj;
            this.f112837b = fVar;
            this.f112838c = (v2.a) v2Var2;
            this.f112839d = 2;
            if (f.c(fVar, this.f112842g, this) != aVar) {
                v2Var = v2Var2;
                v2.a aVar4 = (v2.a) v2Var;
                String strI2 = lc.u0.i(aVar4.f47384b, "Unfollow failed (", "): ", aVar4.f47385c);
                i2.a aVar5 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar5.getClass();
                i2.a.f(a2Var2, "FollowItemViewAction", strI2);
                return Unit.INSTANCE;
            }
        } else {
            if (!(v2Var2 instanceof v2.b)) {
                lc.u0.r();
                return null;
            }
            l0 l0VarB = m0.b(fVar.f112665f, d0Var != null ? e0.e(d0Var) : null, m0.a.UNFOLLOW);
            String str2 = d0Var != null ? d0Var.f112650c : null;
            this.f112836a = obj;
            this.f112837b = null;
            this.f112838c = null;
            this.f112839d = 3;
        }
        return aVar;
    }
}
