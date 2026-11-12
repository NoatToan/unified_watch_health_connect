package yo;

import am.b2;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lc83/a0;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.multisport.advancededit.repo.MultisportEditLegsRepo$getActivityUploadStatus$1", f = "MultisportEditLegsRepo.kt", l = {394, 394}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.p<r53.j<? super c83.a0<Unit>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r53.j f198271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f198272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f198273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f198274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f198275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f198276f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(e eVar, String str, String str2, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f198274d = eVar;
        this.f198275e = str;
        this.f198276f = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        k kVar = new k(this.f198274d, this.f198275e, this.f198276f, dVar);
        kVar.f198273c = obj;
        return kVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super c83.a0<Unit>> jVar, t13.d<? super Unit> dVar) {
        return ((k) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f198273c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f198272b;
        if (i14 != 0) {
            if (i14 == 1) {
                jVar = this.f198271a;
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
        i0<c83.a0<Unit>> i0VarG = ((b2) this.f198274d.f198232b.getValue()).G(this.f198275e, this.f198276f);
        this.f198273c = null;
        this.f198271a = jVar;
        this.f198272b = 1;
        obj = i0VarG.await(this);
        if (obj != aVar) {
        }
        return aVar;
        this.f198273c = null;
        this.f198271a = null;
        this.f198272b = 2;
    }
}
