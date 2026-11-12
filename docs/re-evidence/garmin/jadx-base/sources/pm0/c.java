package pm0;

import androidx.lifecycle.t0;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupChallengeDTO;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.group.details.InvalidGroupIdException;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import ym0.n;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/g3;", "", "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupChallengeDTO;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.details.challenges.GroupChallengesViewModel$fetchChallengeList$1", f = "GroupChallengesViewModel.kt", l = {115, 124, 125, 130, 132}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements p<t0<g3<? extends List<? extends GroupChallengeDTO>>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f138599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f138600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f138601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.group.details.challenges.c f138602d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f138603e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(long j8, com.garmin.android.apps.connectmobile.group.details.challenges.c cVar, boolean z14, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f138601c = j8;
        this.f138602d = cVar;
        this.f138603e = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c cVar = new c(this.f138601c, this.f138602d, this.f138603e, dVar);
        cVar.f138600b = obj;
        return cVar;
    }

    @Override // e23.p
    public final Object invoke(t0<g3<? extends List<? extends GroupChallengeDTO>>> t0Var, t13.d<? super Unit> dVar) {
        return ((c) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009d A[PHI: r3
      0x009d: PHI (r3v10 java.lang.Object) = (r3v9 java.lang.Object), (r3v17 java.lang.Object) binds: [B:28:0x009a, B:14:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ed  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r1.emit(r3, r19) == r2) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c7, code lost:
    
        if (r1.emit(r3, r19) == r2) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e7, code lost:
    
        if (r1.emit(r3, r19) == r2) goto L42;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objJ;
        v2 v2Var;
        List<GroupChallengeDTO> list;
        t0 t0Var = (t0) this.f138600b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f138599a;
        long j8 = this.f138601c;
        com.garmin.android.apps.connectmobile.group.details.challenges.c cVar = this.f138602d;
        if (i14 == 0) {
            r.b(obj);
            if (j8 == -1) {
                g3 g3VarA = g3.a.a(g3.f35298f, null, new InvalidGroupIdException(), null, null, 13);
                this.f138600b = null;
                this.f138599a = 1;
            } else {
                cVar.f36308g = this.f138603e;
                cVar.f36304c.j(new ArrayList());
                g3 g3VarC = g3.a.c(g3.f35298f);
                this.f138600b = t0Var;
                this.f138599a = 2;
                if (t0Var.emit(g3VarC, this) != aVar) {
                    ym0.a aVar2 = cVar.f36303b;
                    String strValueOf = String.valueOf(j8);
                    this.f138600b = t0Var;
                    this.f138599a = 3;
                    aVar2.getClass();
                    objJ = f0.J(aVar2, new n(aVar2, strValueOf, null), this);
                    if (objJ != aVar) {
                        v2Var = (v2) objJ;
                        cVar.f36308g = false;
                        if (v2Var instanceof v2.b) {
                            y0<List<GroupChallengeDTO>> y0Var = cVar.f36304c;
                            T t7 = ((v2.b) v2Var).f47386a;
                            list = (List) t7;
                            if (list == null) {
                                list = j0.f134944a;
                            }
                            y0Var.j(list);
                            g3.f35298f.getClass();
                            g3 g3VarD = g3.a.d(t7);
                            this.f138600b = null;
                            this.f138599a = 4;
                        } else {
                            if (!(v2Var instanceof v2.a)) {
                                u0.r();
                                return null;
                            }
                            g3 g3VarA2 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13);
                            this.f138600b = null;
                            this.f138599a = 5;
                        }
                    }
                }
            }
            return aVar;
        }
        if (i14 == 1) {
            r.b(obj);
            return Unit.INSTANCE;
        }
        if (i14 == 2) {
            r.b(obj);
            ym0.a aVar3 = cVar.f36303b;
            String strValueOf2 = String.valueOf(j8);
            this.f138600b = t0Var;
            this.f138599a = 3;
            aVar3.getClass();
            objJ = f0.J(aVar3, new n(aVar3, strValueOf2, null), this);
            if (objJ != aVar) {
                v2Var = (v2) objJ;
                cVar.f36308g = false;
                if (v2Var instanceof v2.b) {
                    y0<List<GroupChallengeDTO>> y0Var2 = cVar.f36304c;
                    T t14 = ((v2.b) v2Var).f47386a;
                    list = (List) t14;
                    if (list == null) {
                        list = j0.f134944a;
                    }
                    y0Var2.j(list);
                    g3.f35298f.getClass();
                    g3 g3VarD2 = g3.a.d(t14);
                    this.f138600b = null;
                    this.f138599a = 4;
                } else {
                    if (!(v2Var instanceof v2.a)) {
                        u0.r();
                        return null;
                    }
                    g3 g3VarA3 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13);
                    this.f138600b = null;
                    this.f138599a = 5;
                }
            }
            return aVar;
        }
        if (i14 == 3) {
            r.b(obj);
            objJ = obj;
            v2Var = (v2) objJ;
            cVar.f36308g = false;
            if (v2Var instanceof v2.b) {
                y0<List<GroupChallengeDTO>> y0Var3 = cVar.f36304c;
                T t15 = ((v2.b) v2Var).f47386a;
                list = (List) t15;
                if (list == null) {
                    list = j0.f134944a;
                }
                y0Var3.j(list);
                g3.f35298f.getClass();
                g3 g3VarD3 = g3.a.d(t15);
                this.f138600b = null;
                this.f138599a = 4;
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                g3 g3VarA4 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13);
                this.f138600b = null;
                this.f138599a = 5;
            }
        } else {
            if (i14 != 4 && i14 != 5) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
