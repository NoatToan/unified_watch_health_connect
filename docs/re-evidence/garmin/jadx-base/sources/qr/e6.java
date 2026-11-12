package qr;

import java.util.Arrays;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$sendCourseToDeviceFromActivity$1", f = "ActivityDetailsViewModel.kt", l = {1133, 1133}, m = "invokeSuspend", v = 2)
public final class e6 extends v13.i implements e23.p<r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends Unit>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r53.j f146193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f146194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f146195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f146196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f146197e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6(t tVar, long j8, t13.d<? super e6> dVar) {
        super(2, dVar);
        this.f146196d = tVar;
        this.f146197e = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e6 e6Var = new e6(this.f146196d, this.f146197e, dVar);
        e6Var.f146195c = obj;
        return e6Var;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends Unit>> jVar, t13.d<? super Unit> dVar) {
        return ((e6) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ab, code lost:
    
        if (r1.emit(r3, r20) == r2) goto L22;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String activityName;
        Object objJ;
        r53.j jVar = (r53.j) this.f146195c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f146194b;
        if (i14 != 0) {
            if (i14 == 1) {
                jVar = this.f146193a;
                o13.r.b(obj);
                objJ = obj;
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
        t tVar = this.f146196d;
        long j8 = tVar.f146575z;
        ps.r value = tVar.W4().getValue();
        if (value == null || (activityName = value.getActivityName()) == null) {
            activityName = "";
        }
        String str = activityName;
        this.f146195c = null;
        this.f146193a = jVar;
        this.f146194b = 1;
        jd0.l lVarS = tVar.f146544o.S();
        p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
        Long l14 = new Long(j8);
        long j14 = this.f146197e;
        List listC = p13.w.c(new com.garmin.android.apps.connectmobile.activities.newmodel.n(j14, String.format("course-service/course/copyFromActivity/fit/%d/%d?elevation=true", Arrays.copyOf(new Object[]{l14, new Long(j14)}, 2)), null, str, null, 0, null, j8, 116, null));
        lVarS.getClass();
        oc1.b bVar = jd0.l.f98351b;
        String string = jd0.l.f98352c.toJson(listC).toString();
        bVar.getClass();
        objJ = com.garmin.android.apps.connectmobile.f0.J(bVar, new oc1.c(bVar, string, null), this);
        if (objJ != aVar) {
        }
        return aVar;
        this.f146195c = null;
        this.f146193a = null;
        this.f146194b = 2;
    }
}
