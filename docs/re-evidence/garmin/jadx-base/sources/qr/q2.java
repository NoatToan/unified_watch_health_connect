package qr;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lmo1/f;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getConversationLikesFlow$1", f = "ActivityDetailsViewModel.kt", l = {4602, 4601}, m = "invokeSuspend", v = 2)
public final class q2 extends v13.i implements e23.p<r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends List<? extends mo1.f>>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r53.j f146442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f146443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f146444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f146445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f146446e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(t tVar, long j8, t13.d<? super q2> dVar) {
        super(2, dVar);
        this.f146445d = tVar;
        this.f146446e = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        q2 q2Var = new q2(this.f146445d, this.f146446e, dVar);
        q2Var.f146444c = obj;
        return q2Var;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends List<? extends mo1.f>>> jVar, t13.d<? super Unit> dVar) {
        return ((q2) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
    
        if (r0.emit(r15, r14) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f146444c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f146443b;
        if (i14 != 0) {
            if (i14 == 1) {
                jVar = this.f146442a;
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
        fo1.f fVar = this.f146445d.f146510d;
        am.c2 c2Var = am.c2.ACTIVITY;
        String strValueOf = String.valueOf(this.f146446e);
        Integer num = new Integer(3);
        this.f146444c = null;
        this.f146442a = jVar;
        this.f146443b = 1;
        fo1.f.a aVar2 = fo1.f.f72522b;
        fVar.getClass();
        obj = com.garmin.android.apps.connectmobile.f0.J(fVar, new fo1.q(fVar, c2Var, strValueOf, 0, num, true, null), this);
        if (obj != aVar) {
        }
        return aVar;
        this.f146444c = null;
        this.f146442a = null;
        this.f146443b = 2;
    }
}
