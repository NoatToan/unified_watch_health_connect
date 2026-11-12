package qm0;

import am.c2;
import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import java.security.InvalidParameterException;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ym0.m0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/g3;", "Lmo1/f;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.details.feed.BaseGroupFeedViewModel$likePost$1", f = "BaseGroupFeedViewModel.kt", l = {339, 343, 344, 345, 346}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<t0<g3<? extends mo1.f>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f145538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f145539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c2 f145540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f145541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f145542e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(c2 c2Var, p pVar, String str, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f145540c = c2Var;
        this.f145541d = pVar;
        this.f145542e = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        q qVar = new q(this.f145540c, this.f145541d, this.f145542e, dVar);
        qVar.f145539b = obj;
        return qVar;
    }

    @Override // e23.p
    public final Object invoke(t0<g3<? extends mo1.f>> t0Var, t13.d<? super Unit> dVar) {
        return ((q) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009d A[PHI: r3
      0x009d: PHI (r3v11 java.lang.Object) = (r3v10 java.lang.Object), (r3v18 java.lang.Object) binds: [B:28:0x009a, B:14:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00dc  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        if (r1.emit(r3, r16) == r2) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ba, code lost:
    
        if (r1.emit(r3, r16) == r2) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d6, code lost:
    
        if (r1.emit(r3, r16) == r2) goto L39;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objJ;
        v2 v2Var;
        t0 t0Var = (t0) this.f145539b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f145538a;
        if (i14 == 0) {
            o13.r.b(obj);
            d.E.getClass();
            if (d.F.contains(this.f145540c)) {
                g3 g3VarC = g3.a.c(g3.f35298f);
                this.f145539b = t0Var;
                this.f145538a = 2;
                if (t0Var.emit(g3VarC, this) != aVar) {
                    p pVar = this.f145541d;
                    ym0.a aVar2 = pVar.f145528d;
                    String strValueOf = String.valueOf(pVar.f145526b);
                    this.f145539b = t0Var;
                    this.f145538a = 3;
                    aVar2.getClass();
                    objJ = f0.J(aVar2, new m0(aVar2, strValueOf, this.f145540c, this.f145542e, null), this);
                    if (objJ != aVar) {
                        v2Var = (v2) objJ;
                        if (v2Var instanceof v2.a) {
                            v2.a aVar3 = (v2.a) v2Var;
                            g3 g3VarA = g3.a.a(g3.f35298f, null, aVar3.f47383a, null, aVar3.f47384b, 5);
                            this.f145539b = null;
                            this.f145538a = 4;
                        } else {
                            if (!(v2Var instanceof v2.b)) {
                                u0.r();
                                return null;
                            }
                            g3.a aVar4 = g3.f35298f;
                            T t7 = ((v2.b) v2Var).f47386a;
                            aVar4.getClass();
                            g3 g3VarD = g3.a.d(t7);
                            this.f145539b = null;
                            this.f145538a = 5;
                        }
                    }
                }
            } else {
                g3 g3VarA2 = g3.a.a(g3.f35298f, null, new InvalidParameterException("Unsupported conversation type"), null, null, 13);
                this.f145539b = null;
                this.f145538a = 1;
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            return Unit.INSTANCE;
        }
        if (i14 == 2) {
            o13.r.b(obj);
            p pVar2 = this.f145541d;
            ym0.a aVar5 = pVar2.f145528d;
            String strValueOf2 = String.valueOf(pVar2.f145526b);
            this.f145539b = t0Var;
            this.f145538a = 3;
            aVar5.getClass();
            objJ = f0.J(aVar5, new m0(aVar5, strValueOf2, this.f145540c, this.f145542e, null), this);
            if (objJ != aVar) {
                v2Var = (v2) objJ;
                if (v2Var instanceof v2.a) {
                    v2.a aVar6 = (v2.a) v2Var;
                    g3 g3VarA3 = g3.a.a(g3.f35298f, null, aVar6.f47383a, null, aVar6.f47384b, 5);
                    this.f145539b = null;
                    this.f145538a = 4;
                } else {
                    if (!(v2Var instanceof v2.b)) {
                        u0.r();
                        return null;
                    }
                    g3.a aVar7 = g3.f35298f;
                    T t14 = ((v2.b) v2Var).f47386a;
                    aVar7.getClass();
                    g3 g3VarD2 = g3.a.d(t14);
                    this.f145539b = null;
                    this.f145538a = 5;
                }
            }
            return aVar;
        }
        if (i14 == 3) {
            o13.r.b(obj);
            objJ = obj;
            v2Var = (v2) objJ;
            if (v2Var instanceof v2.a) {
                v2.a aVar8 = (v2.a) v2Var;
                g3 g3VarA4 = g3.a.a(g3.f35298f, null, aVar8.f47383a, null, aVar8.f47384b, 5);
                this.f145539b = null;
                this.f145538a = 4;
            } else {
                if (!(v2Var instanceof v2.b)) {
                    u0.r();
                    return null;
                }
                g3.a aVar9 = g3.f35298f;
                T t15 = ((v2.b) v2Var).f47386a;
                aVar9.getClass();
                g3 g3VarD3 = g3.a.d(t15);
                this.f145539b = null;
                this.f145538a = 5;
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
