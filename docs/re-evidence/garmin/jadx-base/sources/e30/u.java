package e30;

import com.garmin.android.apps.connectmobile.courses.model.AccessibleControlRule;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import d60.p0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.details.PublishCourseUseCase$invoke$1", f = "PublishCourseUseCase.kt", l = {18, 23}, m = "invokeSuspend", v = 2)
public final class u extends v13.i implements e23.p<r53.j<? super v2<? extends Unit>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f62722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f62723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f62724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f62725d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(String str, v vVar, t13.d<? super u> dVar) {
        super(2, dVar);
        this.f62724c = str;
        this.f62725d = vVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        u uVar = new u(this.f62724c, this.f62725d, dVar);
        uVar.f62723b = obj;
        return uVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super v2<? extends Unit>> jVar, t13.d<? super Unit> dVar) {
        return ((u) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        if (r13 == r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (r0.emit(r13, r12) == r1) goto L19;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v2 aVar;
        r53.j jVar = (r53.j) this.f62723b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f62722a;
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
        String str = this.f62724c;
        if (str != null) {
            d60.b bVar = this.f62725d.f62726a;
            AccessibleControlRule.b bVar2 = AccessibleControlRule.b.f32775c;
            this.f62723b = jVar;
            this.f62722a = 1;
            obj = f0.J(bVar, new p0(bVar, str, bVar2, null), this);
        } else {
            aVar = new v2.a(new Exception("Invalid course id."), null, null, 6, null);
            this.f62723b = null;
            this.f62722a = 2;
        }
        return aVar2;
        aVar = (v2) obj;
        this.f62723b = null;
        this.f62722a = 2;
    }
}
