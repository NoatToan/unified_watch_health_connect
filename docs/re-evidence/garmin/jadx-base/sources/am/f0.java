package am;

import com.garmin.android.apps.connectmobile.badges.service.model.SimpleBadgeDTO;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lcom/garmin/android/apps/connectmobile/badges/service/model/SimpleBadgeDTO;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.ActivityRepo$getBadgesForActivity$1", f = "ActivityRepo.kt", l = {383, 384}, m = "invokeSuspend", v = 2)
public final class f0 extends v13.i implements e23.p<r53.j<? super v2<? extends List<? extends SimpleBadgeDTO>>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f3935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f3936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f3937e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(m mVar, String str, long j8, t13.d<? super f0> dVar) {
        super(2, dVar);
        this.f3935c = mVar;
        this.f3936d = str;
        this.f3937e = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f0 f0Var = new f0(this.f3935c, this.f3936d, this.f3937e, dVar);
        f0Var.f3934b = obj;
        return f0Var;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super v2<? extends List<? extends SimpleBadgeDTO>>> jVar, t13.d<? super Unit> dVar) {
        return ((f0) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        if (r13 == r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (r0.emit(r13, r12) == r1) goto L21;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v2 aVar;
        r53.j jVar = (r53.j) this.f3934b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f3933a;
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
        if (this.f3935c.f4072d != null) {
            this.f3934b = jVar;
            this.f3933a = 1;
            obj = ((d) KoinJavaComponent.get$default(d.class, null, null, 6, null)).A(this.f3936d, this.f3937e, this);
        } else {
            aVar = null;
            if (aVar == null) {
                aVar = new v2.a(new Exception("Something went wrong while fetching badges!"), null, null, 6, null);
            }
            this.f3934b = null;
            this.f3933a = 2;
        }
        return aVar2;
        aVar = (v2) obj;
        if (aVar == null) {
            aVar = new v2.a(new Exception("Something went wrong while fetching badges!"), null, null, 6, null);
        }
        this.f3934b = null;
        this.f3933a = 2;
    }
}
