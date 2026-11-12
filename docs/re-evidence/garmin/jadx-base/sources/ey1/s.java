package ey1;

import com.garmin.android.apps.connectmobile.g3;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.viewmodel.StrengthTrainingPlanDashboardViewModel$handleUnlinkEvent$1", f = "StrengthTrainingPlanDashboardViewModel.kt", l = {290, 302}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f67416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f67417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Long f67418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f67419e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(j jVar, boolean z14, Long l14, String str, t13.d<? super s> dVar) {
        super(2, dVar);
        this.f67416b = jVar;
        this.f67417c = z14;
        this.f67418d = l14;
        this.f67419e = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new s(this.f67416b, this.f67417c, this.f67418d, this.f67419e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((s) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r0) goto L26;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f67415a;
        j jVar = this.f67416b;
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
        st1.c cVar = jVar.f67340g;
        this.f67415a = 1;
        cVar.getClass();
        x53.c cVar2 = s0.f129406a;
        Object objE0 = ge1.b.e0(x53.b.f189152a, new st1.e(cVar, this.f67417c, this.f67418d, this.f67419e, null), this);
        if (objE0 != obj2) {
            objE0 = Unit.INSTANCE;
        }
        if (objE0 != obj2) {
        }
        return obj2;
        g3 g3Var = (g3) jVar.f67340g.f160875g.f150540a.getValue();
        if ((g3Var != null ? g3Var.f35300a : null) == fw.p.SUCCESS) {
            jVar.f67339f.a();
            jVar.B.k(null, new dy1.n.d(jVar.f67334a));
        } else {
            jVar.C4();
        }
        p2 p2Var = jVar.f67355x;
        Boolean bool = Boolean.FALSE;
        this.f67415a = 2;
        p2Var.k(null, bool);
    }
}
