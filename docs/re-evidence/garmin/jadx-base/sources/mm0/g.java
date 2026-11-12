package mm0;

import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.group.service.model.GroupDetailsDTO;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/g3;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.details.GroupDetailViewModel$cancelGroupMemberRequest$1", f = "GroupDetailViewModel.kt", l = {192, 194, 196, 197, 199}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements e23.p<t0<g3<? extends Unit>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f119520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f119521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f119522c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.group.details.GroupDetailViewModel$cancelGroupMemberRequest$1$result$1", f = "GroupDetailViewModel.kt", l = {194}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super v2<? extends Unit>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f119523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f119524b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ wm0.c f119525c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, wm0.c cVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f119524b = eVar;
            this.f119525c = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f119524b, this.f119525c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends Unit>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f119523a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            e eVar = this.f119524b;
            ym0.a aVar2 = eVar.f119505a;
            long jB4 = eVar.B4();
            this.f119523a = 1;
            aVar2.getClass();
            Object objJ = f0.J(aVar2, new ym0.d(aVar2, jB4, this.f119525c, null), this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f119522c = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g gVar = new g(this.f119522c, dVar);
        gVar.f119521b = obj;
        return gVar;
    }

    @Override // e23.p
    public final Object invoke(t0<g3<? extends Unit>> t0Var, t13.d<? super Unit> dVar) {
        return ((g) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0080  */
    /* JADX WARN: Code duplicated, block: B:31:0x008d  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c4  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a0, code lost:
    
        if (r1.emit(r3, r19) == r2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00be, code lost:
    
        if (r1.emit(r3, r19) == r2) goto L38;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objE0;
        v2 v2Var;
        GroupDetailsDTO groupDetailsDTO;
        t0 t0Var = (t0) this.f119521b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f119520a;
        e eVar = this.f119522c;
        if (i14 == 0) {
            o13.r.b(obj);
            g3 g3VarC = g3.a.c(g3.f35298f);
            this.f119521b = t0Var;
            this.f119520a = 1;
            if (t0Var.emit(g3VarC, this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 == 2) {
                o13.r.b(obj);
                objE0 = obj;
                v2Var = (v2) objE0;
                if (v2Var instanceof v2.b) {
                    groupDetailsDTO = eVar.f119507c;
                    this.f119521b = t0Var;
                    this.f119520a = 3;
                    if (eVar.z4(groupDetailsDTO, this) != aVar) {
                        g3.a aVar2 = g3.f35298f;
                        Unit unit = Unit.INSTANCE;
                        aVar2.getClass();
                        g3 g3VarD = g3.a.d(unit);
                        this.f119521b = null;
                        this.f119520a = 4;
                    }
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    g3 g3VarA = g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13);
                    this.f119521b = null;
                    this.f119520a = 5;
                }
                return aVar;
            }
            if (i14 == 3) {
                o13.r.b(obj);
                g3.a aVar3 = g3.f35298f;
                Unit unit2 = Unit.INSTANCE;
                aVar3.getClass();
                g3 g3VarD2 = g3.a.d(unit2);
                this.f119521b = null;
                this.f119520a = 4;
            } else {
                if (i14 != 4 && i14 != 5) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
        }
        return Unit.INSTANCE;
        wm0.c cVar = eVar.f119509e;
        wm0.c cVar2 = new wm0.c(cVar != null ? cVar.getGroupMemberRequestId() : null, null, null, null, null, 30, null);
        x53.c cVar3 = s0.f129406a;
        x53.b bVar = x53.b.f189152a;
        a aVar4 = new a(eVar, cVar2, null);
        this.f119521b = t0Var;
        this.f119520a = 2;
        objE0 = ge1.b.e0(bVar, aVar4, this);
        if (objE0 != aVar) {
            v2Var = (v2) objE0;
            if (v2Var instanceof v2.b) {
                groupDetailsDTO = eVar.f119507c;
                this.f119521b = t0Var;
                this.f119520a = 3;
                if (eVar.z4(groupDetailsDTO, this) != aVar) {
                    g3.a aVar5 = g3.f35298f;
                    Unit unit3 = Unit.INSTANCE;
                    aVar5.getClass();
                    g3 g3VarD3 = g3.a.d(unit3);
                    this.f119521b = null;
                    this.f119520a = 4;
                }
            } else {
                if (v2Var instanceof v2.a) {
                    u0.r();
                    return null;
                }
                g3 g3VarA2 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13);
                this.f119521b = null;
                this.f119520a = 5;
            }
        }
        return aVar;
    }
}
