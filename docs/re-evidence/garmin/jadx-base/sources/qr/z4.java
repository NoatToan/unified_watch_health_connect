package qr;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getTrailsCandidates$1", f = "ActivityDetailsViewModel.kt", l = {2001, 2001}, m = "invokeSuspend", v = 2)
public final class z4 extends v13.i implements e23.p<r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends List<? extends Long>>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r53.j f146876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f146877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f146878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f146879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f146880e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(t tVar, long j8, t13.d<? super z4> dVar) {
        super(2, dVar);
        this.f146879d = tVar;
        this.f146880e = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        z4 z4Var = new z4(this.f146879d, this.f146880e, dVar);
        z4Var.f146878c = obj;
        return z4Var;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends List<? extends Long>>> jVar, t13.d<? super Unit> dVar) {
        return ((z4) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f146878c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f146877b;
        if (i14 != 0) {
            if (i14 == 1) {
                jVar = this.f146876a;
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
        d60.b bVar = this.f146879d.f146516f;
        this.f146878c = null;
        this.f146876a = jVar;
        this.f146877b = 1;
        bVar.getClass();
        obj = com.garmin.android.apps.connectmobile.f0.J(bVar, new d60.d0(bVar, this.f146880e, null), this);
        if (obj != aVar) {
        }
        return aVar;
        this.f146878c = null;
        this.f146876a = null;
        this.f146877b = 2;
    }
}
