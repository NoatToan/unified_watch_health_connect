package am;

import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/ActivityDetailChartDTO;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.ActivityRepo$getActivityDetails$1", f = "ActivityRepo.kt", l = {356, 355}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<r53.j<? super v2<? extends ActivityDetailChartDTO>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r53.j f4153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f4155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f4156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f4157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f4158f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4159g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ List<qs.x> f4160h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f4161i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(m mVar, long j8, boolean z14, int i14, List<? extends qs.x> list, boolean z15, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f4156d = mVar;
        this.f4157e = j8;
        this.f4158f = z14;
        this.f4159g = i14;
        this.f4160h = list;
        this.f4161i = z15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        q qVar = new q(this.f4156d, this.f4157e, this.f4158f, this.f4159g, this.f4160h, this.f4161i, dVar);
        qVar.f4155c = obj;
        return qVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super v2<? extends ActivityDetailChartDTO>> jVar, t13.d<? super Unit> dVar) {
        return ((q) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        if (r1.emit(r3, r16) == r2) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objJ;
        r53.j jVar = (r53.j) this.f4155c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f4154b;
        if (i14 != 0) {
            if (i14 == 1) {
                jVar = this.f4153a;
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
        this.f4155c = null;
        this.f4153a = jVar;
        this.f4154b = 1;
        m mVar = this.f4156d;
        mVar.getClass();
        objJ = com.garmin.android.apps.connectmobile.f0.J(mVar, new p(this.f4158f, mVar, this.f4157e, this.f4160h, this.f4161i, this.f4159g, null), this);
        if (objJ != aVar) {
        }
        return aVar;
        this.f4155c = null;
        this.f4153a = null;
        this.f4154b = 2;
    }
}
