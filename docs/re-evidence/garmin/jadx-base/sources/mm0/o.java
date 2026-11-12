package mm0;

import androidx.lifecycle.t0;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.group.service.model.GroupDetailsDTO;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ym0.r0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/g3;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.details.GroupDetailViewModel$requestToJoinGroup$1", f = "GroupDetailViewModel.kt", l = {180, 181, 183, SyslogConstants.LOG_LOCAL7, 186}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<t0<g3<? extends Unit>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f119562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f119563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f119564c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lwm0/c;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.group.details.GroupDetailViewModel$requestToJoinGroup$1$result$1", f = "GroupDetailViewModel.kt", l = {181}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super v2<? extends wm0.c>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f119565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f119566b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f119566b = eVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f119566b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends wm0.c>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f119565a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            e eVar = this.f119566b;
            ym0.a aVar2 = eVar.f119505a;
            long jB4 = eVar.B4();
            this.f119565a = 1;
            aVar2.getClass();
            Object objJ = f0.J(aVar2, new r0(aVar2, jB4, null), this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(e eVar, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f119564c = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        o oVar = new o(this.f119564c, dVar);
        oVar.f119563b = obj;
        return oVar;
    }

    @Override // e23.p
    public final Object invoke(t0<g3<? extends Unit>> t0Var, t13.d<? super Unit> dVar) {
        return ((o) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:30:0x0089  */
    /* JADX WARN: Code duplicated, block: B:32:0x008d  */
    /* JADX WARN: Code duplicated, block: B:37:0x00aa  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0086, code lost:
    
        if (r1.emit(r3, r17) == r2) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a4, code lost:
    
        if (r1.emit(r3, r17) == r2) goto L34;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objE0;
        v2 v2Var;
        GroupDetailsDTO groupDetailsDTO;
        t0 t0Var = (t0) this.f119563b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f119562a;
        e eVar = this.f119564c;
        if (i14 == 0) {
            o13.r.b(obj);
            g3 g3VarC = g3.a.c(g3.f35298f);
            this.f119563b = t0Var;
            this.f119562a = 1;
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
                    this.f119563b = t0Var;
                    this.f119562a = 3;
                    if (eVar.z4(groupDetailsDTO, this) != aVar) {
                        g3.a aVar2 = g3.f35298f;
                        Unit unit = Unit.INSTANCE;
                        aVar2.getClass();
                        g3 g3VarD = g3.a.d(unit);
                        this.f119563b = null;
                        this.f119562a = 4;
                    }
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    g3 g3VarA = g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13);
                    this.f119563b = null;
                    this.f119562a = 5;
                }
                return aVar;
            }
            if (i14 == 3) {
                o13.r.b(obj);
                g3.a aVar3 = g3.f35298f;
                Unit unit2 = Unit.INSTANCE;
                aVar3.getClass();
                g3 g3VarD2 = g3.a.d(unit2);
                this.f119563b = null;
                this.f119562a = 4;
            } else {
                if (i14 != 4 && i14 != 5) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
        }
        return Unit.INSTANCE;
        x53.c cVar = s0.f129406a;
        x53.b bVar = x53.b.f189152a;
        a aVar4 = new a(eVar, null);
        this.f119563b = t0Var;
        this.f119562a = 2;
        objE0 = ge1.b.e0(bVar, aVar4, this);
        if (objE0 != aVar) {
            v2Var = (v2) objE0;
            if (v2Var instanceof v2.b) {
                groupDetailsDTO = eVar.f119507c;
                this.f119563b = t0Var;
                this.f119562a = 3;
                if (eVar.z4(groupDetailsDTO, this) != aVar) {
                    g3.a aVar5 = g3.f35298f;
                    Unit unit3 = Unit.INSTANCE;
                    aVar5.getClass();
                    g3 g3VarD3 = g3.a.d(unit3);
                    this.f119563b = null;
                    this.f119562a = 4;
                }
            } else {
                if (v2Var instanceof v2.a) {
                    u0.r();
                    return null;
                }
                g3 g3VarA2 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13);
                this.f119563b = null;
                this.f119562a = 5;
            }
        }
        return aVar;
    }
}
