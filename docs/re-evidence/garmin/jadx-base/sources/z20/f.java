package z20;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.DeleteCoursePowerGuideUseCase$invoke$1", f = "DeleteCoursePowerGuideUseCase.kt", l = {16, 21}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements e23.p<r53.j<? super v2<? extends Unit>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f201905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f201906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f201907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f201908d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, String str, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f201907c = gVar;
        this.f201908d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f fVar = new f(this.f201907c, this.f201908d, dVar);
        fVar.f201906b = obj;
        return fVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super v2<? extends Unit>> jVar, t13.d<? super Unit> dVar) {
        return ((f) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        if (r13 == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        if (r0.emit(r13, r12) == r1) goto L28;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Long lValueOf;
        v2 aVar;
        r53.j jVar = (r53.j) this.f201906b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f201905a;
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
        int i15 = g.f201909b;
        g gVar = this.f201907c;
        gVar.getClass();
        String str = this.f201908d;
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
            sa1.m mVar = gVar.f201910a;
            long jLongValue = lValueOf.longValue();
            this.f201906b = jVar;
            this.f201905a = 1;
            obj = f0.J(mVar, new sa1.p(mVar, jLongValue, null), this);
        } else {
            aVar = new v2.a(new Exception("Invalid course id."), null, null, 6, null);
            this.f201906b = null;
            this.f201905a = 2;
        }
        return aVar2;
        aVar = (v2) obj;
        this.f201906b = null;
        this.f201905a = 2;
    }
}
