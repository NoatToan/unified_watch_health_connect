package c22;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/g3;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.util.ViewModelDelegateUtil$uiResourceLiveData$1", f = "ViewModelDelegateUtil.kt", l = {11, 13, 14, 16}, m = "invokeSuspend", v = 2)
public final class v3 extends v13.i implements e23.p<androidx.lifecycle.t0<com.garmin.android.apps.connectmobile.g3<Object>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f23302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l<t13.d<? super com.garmin.android.apps.connectmobile.v2<Object>>, Object> f23303c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v3(e23.l<? super t13.d<? super com.garmin.android.apps.connectmobile.v2<Object>>, ? extends Object> lVar, t13.d<? super v3> dVar) {
        super(2, dVar);
        this.f23303c = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        v3 v3Var = new v3(this.f23303c, dVar);
        v3Var.f23302b = obj;
        return v3Var;
    }

    @Override // e23.p
    public final Object invoke(androidx.lifecycle.t0<com.garmin.android.apps.connectmobile.g3<Object>> t0Var, t13.d<? super Unit> dVar) {
        return ((v3) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0052  */
    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:28:0x006e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0090  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        if (r0.emit(r13, r12) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008a, code lost:
    
        if (r0.emit(r13, r12) == r1) goto L30;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        com.garmin.android.apps.connectmobile.v2 v2Var;
        androidx.lifecycle.t0 t0Var = (androidx.lifecycle.t0) this.f23302b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f23301a;
        if (i14 == 0) {
            o13.r.b(obj);
            com.garmin.android.apps.connectmobile.g3 g3VarC = com.garmin.android.apps.connectmobile.g3.a.c(com.garmin.android.apps.connectmobile.g3.f35298f);
            this.f23302b = t0Var;
            this.f23301a = 1;
            if (t0Var.emit(g3VarC, this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else if (i14 == 2) {
            o13.r.b(obj);
            v2Var = (com.garmin.android.apps.connectmobile.v2) obj;
            if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
                com.garmin.android.apps.connectmobile.g3.a aVar2 = com.garmin.android.apps.connectmobile.g3.f35298f;
                T t7 = ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
                aVar2.getClass();
                com.garmin.android.apps.connectmobile.g3 g3VarD = com.garmin.android.apps.connectmobile.g3.a.d(t7);
                this.f23302b = null;
                this.f23301a = 3;
            } else {
                if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.a) {
                    lc.u0.r();
                    return null;
                }
                com.garmin.android.apps.connectmobile.v2.a aVar3 = (com.garmin.android.apps.connectmobile.v2.a) v2Var;
                com.garmin.android.apps.connectmobile.g3 g3VarA = com.garmin.android.apps.connectmobile.g3.a.a(com.garmin.android.apps.connectmobile.g3.f35298f, aVar3.f47383a.toString(), aVar3.f47383a, null, null, 12);
                this.f23302b = null;
                this.f23301a = 4;
            }
        } else {
            if (i14 != 3 && i14 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        this.f23302b = t0Var;
        this.f23301a = 2;
        obj = this.f23303c.invoke(this);
        if (obj != aVar) {
            v2Var = (com.garmin.android.apps.connectmobile.v2) obj;
            if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
                com.garmin.android.apps.connectmobile.g3.a aVar4 = com.garmin.android.apps.connectmobile.g3.f35298f;
                T t14 = ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
                aVar4.getClass();
                com.garmin.android.apps.connectmobile.g3 g3VarD2 = com.garmin.android.apps.connectmobile.g3.a.d(t14);
                this.f23302b = null;
                this.f23301a = 3;
            } else {
                if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.a) {
                    lc.u0.r();
                    return null;
                }
                com.garmin.android.apps.connectmobile.v2.a aVar5 = (com.garmin.android.apps.connectmobile.v2.a) v2Var;
                com.garmin.android.apps.connectmobile.g3 g3VarA2 = com.garmin.android.apps.connectmobile.g3.a.a(com.garmin.android.apps.connectmobile.g3.f35298f, aVar5.f47383a.toString(), aVar5.f47383a, null, null, 12);
                this.f23302b = null;
                this.f23301a = 4;
            }
        }
        return aVar;
    }
}
