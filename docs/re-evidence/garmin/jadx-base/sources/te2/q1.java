package te2;

import android.content.Context;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lve2/d;", "<anonymous>", "(Lo53/b0;)Lve2/d;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.biz.ITTicketForCredentialExchanger$forIT2$2", f = "ITTicketForCredentialExchanger.kt", l = {100, 114, 117}, m = "invokeSuspend")
public final class q1 extends v13.i implements e23.p<o53.b0, t13.d<? super ve2.d>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public sc2.o f164254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f164255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s1 f164256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f164257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f164258e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(s1 s1Var, String str, String str2, t13.d<? super q1> dVar) {
        super(2, dVar);
        this.f164256c = s1Var;
        this.f164257d = str;
        this.f164258e = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q1(this.f164256c, this.f164257d, this.f164258e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super ve2.d> dVar) {
        return ((q1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c4, code lost:
    
        if (r0 == r2) goto L31;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objE0;
        Object objE1;
        sc2.o oVar;
        Object objE2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f164255b;
        s1 s1Var = this.f164256c;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                s1Var.f164294g.debug("forIT2: calling 'ITTicketForIT2Request'...");
                rc2.f0 f0Var = new rc2.f0(s1Var.f164288a, s1Var.f164292e, s1Var.f164289b, this.f164257d, this.f164258e);
                this.f164255b = 1;
                x53.c cVar = o53.s0.f129406a;
                objE0 = ge1.b.e0(x53.b.f189152a, new rc2.g0(f0Var, null), this);
                if (objE0 == aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                objE0 = obj;
            } else if (i14 == 2) {
                sc2.o oVar2 = this.f164254a;
                o13.r.b(obj);
                oVar = oVar2;
                objE1 = obj;
                sc2.e eVar = (sc2.e) wc2.b.a((wc2.a) objE1);
                new s0();
                ve2.e eVar2 = s1Var.f164292e;
                re2.b.c cVar2 = s1Var.f164293f;
                this.f164254a = null;
                this.f164255b = 3;
                objE2 = ge1.b.e0(o53.s0.f129406a, new r0(oVar, eVar, cVar2, eVar2, null, null), this);
            } else {
                if (i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                objE2 = obj;
            }
            return (ve2.d) objE2;
            sc2.o oVar3 = ((sc2.c) wc2.b.a((wc2.a) objE0)).f158488a;
            String str = oVar3.f158547d;
            if (str == null || d53.w.J(str)) {
                throw new Exception("ITTicketForIT2Request returned null or blank customerGUID for " + s1Var.f164289b);
            }
            s1Var.f164294g.debug("forIT2: calling 'ITBasicCustomerInfoRequest'...");
            Context context = s1Var.f164288a;
            ve2.e eVar3 = s1Var.f164292e;
            str.getClass();
            rc2.n nVar = new rc2.n(context, eVar3, str, oVar3.f158544a, this.f164258e);
            this.f164254a = oVar3;
            this.f164255b = 2;
            x53.c cVar3 = o53.s0.f129406a;
            objE1 = ge1.b.e0(x53.b.f189152a, new rc2.o(nVar, null), this);
            if (objE1 != aVar) {
                oVar = oVar3;
                sc2.e eVar4 = (sc2.e) wc2.b.a((wc2.a) objE1);
                new s0();
                ve2.e eVar5 = s1Var.f164292e;
                re2.b.c cVar4 = s1Var.f164293f;
                this.f164254a = null;
                this.f164255b = 3;
                objE2 = ge1.b.e0(o53.s0.f129406a, new r0(oVar, eVar4, cVar4, eVar5, null, null), this);
            }
            return aVar;
        } catch (Throwable th3) {
            s1Var.f164294g.error("forIT2", th3);
            throw th3;
        }
    }
}
