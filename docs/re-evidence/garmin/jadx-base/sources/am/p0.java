package am;

import com.garmin.android.apps.connectmobile.v2;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.ActivityRepo$getUserWeight$1", f = "ActivityRepo.kt", l = {394, 395}, m = "invokeSuspend", v = 2)
public final class p0 extends v13.i implements e23.p<r53.j<? super v2<? extends Double>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f4151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DateTime f4152d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(m mVar, DateTime dateTime, t13.d<? super p0> dVar) {
        super(2, dVar);
        this.f4151c = mVar;
        this.f4152d = dateTime;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        p0 p0Var = new p0(this.f4151c, this.f4152d, dVar);
        p0Var.f4150b = obj;
        return p0Var;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super v2<? extends Double>> jVar, t13.d<? super Unit> dVar) {
        return ((p0) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0045  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        if (r13 == r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r0.emit(r13, r12) == r1) goto L21;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v2 aVar;
        r53.j jVar = (r53.j) this.f4150b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f4149a;
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
        if (this.f4151c.f4072d != null) {
            this.f4150b = jVar;
            this.f4149a = 1;
            obj = ((d) KoinJavaComponent.get$default(d.class, null, null, 6, null)).m(this.f4152d, true, this);
        } else {
            aVar = null;
            if (aVar == null) {
                aVar = new v2.a(new Exception("Something went wrong while fetching user weight!"), null, null, 6, null);
            }
            this.f4150b = null;
            this.f4149a = 2;
        }
        return aVar2;
        aVar = (v2) obj;
        if (aVar == null) {
            aVar = new v2.a(new Exception("Something went wrong while fetching user weight!"), null, null, 6, null);
        }
        this.f4150b = null;
        this.f4149a = 2;
    }
}
