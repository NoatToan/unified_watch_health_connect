package qm0;

import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ym0.s0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/g3;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.details.feed.BaseGroupFeedViewModel$unLikePost$1", f = "BaseGroupFeedViewModel.kt", l = {354, 357, 358, 359, 360}, m = "invokeSuspend", v = 2)
public final class u extends v13.i implements e23.p<t0<g3<? extends Unit>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f145559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f145560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f145561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Long f145562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f145563e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(String str, Long l14, p pVar, t13.d<? super u> dVar) {
        super(2, dVar);
        this.f145561c = str;
        this.f145562d = l14;
        this.f145563e = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        u uVar = new u(this.f145561c, this.f145562d, this.f145563e, dVar);
        uVar.f145560b = obj;
        return uVar;
    }

    @Override // e23.p
    public final Object invoke(t0<g3<? extends Unit>> t0Var, t13.d<? super Unit> dVar) {
        return ((u) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0077 A[PHI: r3
      0x0077: PHI (r3v11 java.lang.Object) = (r3v10 java.lang.Object), (r3v18 java.lang.Object) binds: [B:25:0x0073, B:14:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x007d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0098  */
    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b5  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0095, code lost:
    
        if (r1.emit(r3, r18) == r2) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00af, code lost:
    
        if (r1.emit(r3, r18) == r2) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fc, code lost:
    
        if (r1.emit(r3, r18) == r2) goto L42;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objJ;
        v2 v2Var;
        t0 t0Var = (t0) this.f145560b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f145559a;
        String str = this.f145561c;
        Long l14 = this.f145562d;
        if (i14 == 0) {
            o13.r.b(obj);
            if (str == null || l14 == null) {
                String str2 = "unLikePost: invalid param conversationUuid=[" + str + "], conversationPk=[" + l14 + "]";
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.p(a2Var, "BaseGroupFeedViewModel", str2);
                g3 g3VarA = g3.a.a(g3.f35298f, null, new Exception("Invalid params found"), null, null, 13);
                this.f145560b = null;
                this.f145559a = 1;
            } else {
                g3 g3VarC = g3.a.c(g3.f35298f);
                this.f145560b = t0Var;
                this.f145559a = 2;
                if (t0Var.emit(g3VarC, this) != aVar) {
                    ym0.a aVar3 = this.f145563e.f145528d;
                    String strValueOf = String.valueOf(l14.longValue());
                    this.f145560b = t0Var;
                    this.f145559a = 3;
                    aVar3.getClass();
                    objJ = f0.J(aVar3, new s0(aVar3, str, strValueOf, null), this);
                    if (objJ != aVar) {
                        v2Var = (v2) objJ;
                        if (v2Var instanceof v2.a) {
                            g3 g3VarA2 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13);
                            this.f145560b = null;
                            this.f145559a = 4;
                        } else {
                            if (!(v2Var instanceof v2.b)) {
                                u0.r();
                                return null;
                            }
                            g3.a aVar4 = g3.f35298f;
                            Unit unit = Unit.INSTANCE;
                            aVar4.getClass();
                            g3 g3VarD = g3.a.d(unit);
                            this.f145560b = null;
                            this.f145559a = 5;
                        }
                    }
                }
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            return Unit.INSTANCE;
        }
        if (i14 == 2) {
            o13.r.b(obj);
            ym0.a aVar5 = this.f145563e.f145528d;
            String strValueOf2 = String.valueOf(l14.longValue());
            this.f145560b = t0Var;
            this.f145559a = 3;
            aVar5.getClass();
            objJ = f0.J(aVar5, new s0(aVar5, str, strValueOf2, null), this);
            if (objJ != aVar) {
                v2Var = (v2) objJ;
                if (v2Var instanceof v2.a) {
                    g3 g3VarA3 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13);
                    this.f145560b = null;
                    this.f145559a = 4;
                } else {
                    if (!(v2Var instanceof v2.b)) {
                        u0.r();
                        return null;
                    }
                    g3.a aVar6 = g3.f35298f;
                    Unit unit2 = Unit.INSTANCE;
                    aVar6.getClass();
                    g3 g3VarD2 = g3.a.d(unit2);
                    this.f145560b = null;
                    this.f145559a = 5;
                }
            }
            return aVar;
        }
        if (i14 == 3) {
            o13.r.b(obj);
            objJ = obj;
            v2Var = (v2) objJ;
            if (v2Var instanceof v2.a) {
                g3 g3VarA4 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13);
                this.f145560b = null;
                this.f145559a = 4;
            } else {
                if (!(v2Var instanceof v2.b)) {
                    u0.r();
                    return null;
                }
                g3.a aVar7 = g3.f35298f;
                Unit unit3 = Unit.INSTANCE;
                aVar7.getClass();
                g3 g3VarD3 = g3.a.d(unit3);
                this.f145560b = null;
                this.f145559a = 5;
            }
        } else {
            if (i14 != 4 && i14 != 5) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
