package ou1;

import am.x0;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/repcounting/model/c;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.domain.GetExerciseListWithTranslationUseCase$invoke$1", f = "GetExerciseListWithTranslationUseCase.kt", l = {19, 20, 33, 36}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements e23.p<r53.j<? super com.garmin.android.apps.connectmobile.repcounting.model.c>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2 f134049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f134050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f134051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f134052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x0 f134053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f134054f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, x0 x0Var, boolean z14, t13.d<? super f> dVar2) {
        super(2, dVar2);
        this.f134052d = dVar;
        this.f134053e = x0Var;
        this.f134054f = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f fVar = new f(this.f134052d, this.f134053e, this.f134054f, dVar);
        fVar.f134051c = obj;
        return fVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.repcounting.model.c> jVar, t13.d<? super Unit> dVar) {
        return ((f) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005b  */
    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a7  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008f, code lost:
    
        if (r0.emit(r2, r9) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009c, code lost:
    
        if (r0.emit(null, r9) == r1) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        v2 v2Var;
        v2 v2Var2;
        r53.j jVar = (r53.j) this.f134051c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f134050b;
        x0 x0Var = this.f134053e;
        d dVar = this.f134052d;
        if (i14 == 0) {
            o13.r.b(obj);
            ru1.b bVar = dVar.f134023a;
            this.f134051c = jVar;
            this.f134050b = 1;
            obj = bVar.a(x0Var, this.f134054f);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else if (i14 == 2) {
            v2Var = this.f134049a;
            o13.r.b(obj);
            v2Var2 = (v2) obj;
            if (!(v2Var instanceof v2.a)) {
                throw ((v2.a) v2Var).f47383a;
            }
            if (!(v2Var2 instanceof v2.a)) {
                throw ((v2.a) v2Var2).f47383a;
            }
            if ((v2Var instanceof v2.b) || !(v2Var2 instanceof v2.b)) {
                this.f134051c = null;
                this.f134049a = null;
                this.f134050b = 4;
            } else {
                com.garmin.android.apps.connectmobile.repcounting.model.c cVar = (com.garmin.android.apps.connectmobile.repcounting.model.c) ((v2.b) v2Var).f47386a;
                if (cVar != null) {
                    com.garmin.android.apps.connectmobile.repcounting.model.d.b bVar2 = com.garmin.android.apps.connectmobile.repcounting.model.d.f41101j;
                    com.garmin.android.apps.connectmobile.repcounting.model.d[] dVarArrF = cVar.F();
                    String str = (String) ((v2.b) v2Var2).f47386a;
                    bVar2.getClass();
                    com.garmin.android.apps.connectmobile.repcounting.model.d.b.c(dVarArrF, str);
                    cVar.I(dVarArrF);
                }
                this.f134051c = null;
                this.f134049a = null;
                this.f134050b = 3;
            }
        } else {
            if (i14 != 3 && i14 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        v2Var = (v2) obj;
        ru1.d dVar2 = dVar.f134024b;
        this.f134051c = jVar;
        this.f134049a = v2Var;
        this.f134050b = 2;
        obj = ru1.d.a(dVar2, x0Var, this);
        if (obj != aVar) {
            v2Var2 = (v2) obj;
            if (!(v2Var instanceof v2.a)) {
                throw ((v2.a) v2Var).f47383a;
            }
            if (!(v2Var2 instanceof v2.a)) {
                throw ((v2.a) v2Var2).f47383a;
            }
            if (v2Var instanceof v2.b) {
            }
            this.f134051c = null;
            this.f134049a = null;
            this.f134050b = 4;
        }
        return aVar;
    }
}
