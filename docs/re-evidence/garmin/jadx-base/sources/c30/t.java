package c30;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "La50/g;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.custom.ConvertToGCJ02UseCase$invoke$1", f = "ConvertToGCJ02UseCase.kt", l = {21, 21}, m = "invokeSuspend", v = 2)
public final class t extends v13.i implements e23.p<r53.j<? super a50.g>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r53.j f24027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f24029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f24030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a50.g f24031e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, a50.g gVar, t13.d<? super t> dVar) {
        super(2, dVar);
        this.f24030d = uVar;
        this.f24031e = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        t tVar = new t(this.f24030d, this.f24031e, dVar);
        tVar.f24029c = obj;
        return tVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super a50.g> jVar, t13.d<? super Unit> dVar) {
        return ((t) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f24029c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f24028b;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f24029c = null;
            this.f24027a = jVar;
            this.f24028b = 1;
            obj = u.a(this.f24030d, this.f24031e, this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            jVar = this.f24027a;
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        this.f24029c = null;
        this.f24027a = null;
        this.f24028b = 2;
    }
}
