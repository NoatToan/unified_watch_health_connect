package e30;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.apps.connectmobile.w2;
import d60.k0;
import lc.u0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.details.SendCourseToDeviceUseCase$invoke$1", f = "SendCourseToDeviceUseCase.kt", l = {26, 33}, m = "invokeSuspend", v = 2)
public final class y extends v13.i implements e23.p<r53.j<? super v2<? extends Object>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f62735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f62736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.e f62737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f62738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f62739e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.garmin.android.apps.connectmobile.courses.model.e eVar, z zVar, String str, t13.d<? super y> dVar) {
        super(2, dVar);
        this.f62737c = eVar;
        this.f62738d = zVar;
        this.f62739e = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        y yVar = new y(this.f62737c, this.f62738d, this.f62739e, dVar);
        yVar.f62736b = obj;
        return yVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super v2<? extends Object>> jVar, t13.d<? super Unit> dVar) {
        return ((y) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX WARN: Code duplicated, block: B:23:0x0070  */
    /* JADX WARN: Code duplicated, block: B:25:0x0074  */
    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0080  */
    /* JADX WARN: Code duplicated, block: B:33:0x009a  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bc  */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (r15 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b6, code lost:
    
        if (r0.emit(r15, r14) == r1) goto L37;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v2 aVar;
        v2.a aVar2;
        Integer num;
        com.garmin.android.library.backgroundtaskmanagement.b.c cVar;
        r53.j jVar = (r53.j) this.f62736b;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f62735a;
        z zVar = this.f62738d;
        com.garmin.android.apps.connectmobile.courses.model.e eVar = this.f62737c;
        if (i14 != 0) {
            if (i14 == 1) {
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
        String str = eVar != null ? eVar.courseId : null;
        if (str != null) {
            d60.b bVar = zVar.f62741a;
            this.f62736b = jVar;
            this.f62735a = 1;
            obj = f0.J(bVar, new k0(bVar, str, this.f62739e, null), this);
        } else {
            aVar = new v2.a(new Exception("Invalid course id."), null, null, 6, null);
            int i15 = z.f62740b;
            zVar.getClass();
            if (aVar instanceof v2.b) {
                a30.d.a((a30.a) KoinJavaComponent.get$default(a30.a.class, null, null, 6, null), a30.c.b.f909b, eVar);
            } else {
                if (aVar instanceof v2.a) {
                    u0.r();
                    return null;
                }
                aVar2 = (v2.a) aVar;
                if (w2.a(aVar2)) {
                    cVar = com.garmin.android.library.backgroundtaskmanagement.b.c.USER_NOT_AUTHORIZED;
                } else {
                    j23.l lVar = new j23.l(500, 599);
                    num = aVar2.f47384b;
                    if (num == null && lVar.d(num.intValue())) {
                        cVar = com.garmin.android.library.backgroundtaskmanagement.b.c.SERVER_UNAVAILABLE;
                    } else {
                        cVar = com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
                    }
                }
                a30.d.a((a30.a) KoinJavaComponent.get$default(a30.a.class, null, null, 6, null), new a30.c.C0009c(cVar.toString()), eVar);
            }
            this.f62736b = null;
            this.f62735a = 2;
        }
        return aVar3;
        aVar = (v2) obj;
        int i16 = z.f62740b;
        zVar.getClass();
        if (aVar instanceof v2.b) {
            a30.d.a((a30.a) KoinJavaComponent.get$default(a30.a.class, null, null, 6, null), a30.c.b.f909b, eVar);
        } else {
            if (aVar instanceof v2.a) {
                u0.r();
                return null;
            }
            aVar2 = (v2.a) aVar;
            if (w2.a(aVar2)) {
                cVar = com.garmin.android.library.backgroundtaskmanagement.b.c.USER_NOT_AUTHORIZED;
            } else {
                j23.l lVar2 = new j23.l(500, 599);
                num = aVar2.f47384b;
                if (num == null) {
                    cVar = com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
                } else {
                    cVar = com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
                }
            }
            a30.d.a((a30.a) KoinJavaComponent.get$default(a30.a.class, null, null, 6, null), new a30.c.C0009c(cVar.toString()), eVar);
        }
        this.f62736b = null;
        this.f62735a = 2;
    }
}
