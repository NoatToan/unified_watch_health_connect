package e30;

import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lw20/c;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.details.GetCourseLinkedEventsUseCase$invoke$1", f = "GetCourseLinkedEventsUseCase.kt", l = {17, 21, 23, 27, 30}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements e23.p<r53.j<? super w20.c>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f62684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f62685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f62686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f62687d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, String str, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f62686c = jVar;
        this.f62687d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i iVar = new i(this.f62686c, this.f62687d, dVar);
        iVar.f62685b = obj;
        return iVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super w20.c> jVar, t13.d<? super Unit> dVar) {
        return ((i) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0097  */
    /* JADX WARN: Code duplicated, block: B:43:0x009b  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a6  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0089, code lost:
    
        if (r0.emit(r2, r13) == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0094, code lost:
    
        if (r0.emit(null, r13) == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a3, code lost:
    
        if (r0.emit(null, r13) == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b2, code lost:
    
        if (r0.emit(null, r13) == r1) goto L50;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Long lValueOf;
        v2 v2Var;
        List list;
        r53.j jVar = (r53.j) this.f62685b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f62684a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    list = (List) ((v2.b) v2Var).f47386a;
                    if (list != null || list.isEmpty()) {
                        this.f62685b = null;
                        this.f62684a = 3;
                    } else {
                        w20.c cVar = new w20.c(list);
                        this.f62685b = null;
                        this.f62684a = 2;
                    }
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    this.f62685b = null;
                    this.f62684a = 4;
                }
            } else {
                if (i14 != 2 && i14 != 3 && i14 != 4 && i14 != 5) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        int i15 = j.f62688b;
        j jVar2 = this.f62686c;
        jVar2.getClass();
        String str = this.f62687d;
        if (str == null || str.length() == 0) {
            lValueOf = null;
        } else {
            try {
                long j8 = Long.parseLong(str);
                if (j8 > 0) {
                    lValueOf = Long.valueOf(j8);
                } else {
                    lValueOf = null;
                }
            } catch (NumberFormatException unused) {
            }
        }
        if (lValueOf != null) {
            d60.b bVar = jVar2.f62689a;
            long jLongValue = lValueOf.longValue();
            this.f62685b = jVar;
            this.f62684a = 1;
            obj = bVar.C(new d60.l(bVar, jLongValue, null), this);
            if (obj != aVar) {
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    list = (List) ((v2.b) v2Var).f47386a;
                    if (list != null) {
                    }
                    this.f62685b = null;
                    this.f62684a = 3;
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    this.f62685b = null;
                    this.f62684a = 4;
                }
            }
        } else {
            this.f62685b = null;
            this.f62684a = 5;
        }
        return aVar;
    }
}
