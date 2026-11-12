package o12;

import e23.p;
import m12.q;
import o13.r;
import o53.b0;
import o53.c0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.EditProfileViewModel$fetchProfileData$1", f = "EditProfileViewModel.kt", l = {175}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f128547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.userprofile.presentation.d f128548b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.garmin.android.apps.connectmobile.userprofile.presentation.d dVar, t13.d<? super f> dVar2) {
        super(2, dVar2);
        this.f128548b = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f128548b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f128547a;
        com.garmin.android.apps.connectmobile.userprofile.presentation.d dVar = this.f128548b;
        if (i14 == 0) {
            r.b(obj);
            p2 p2Var = dVar.f47028l;
            do {
                value = p2Var.getValue();
                ((Boolean) value).getClass();
            } while (!p2Var.b(value, Boolean.TRUE));
            m12.d dVar2 = dVar.f47019c;
            String str = dVar.f47025i;
            this.f128547a = 1;
            dVar2.getClass();
            obj = c0.e(new m12.c(dVar2, str, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        q qVar = (q) obj;
        Boolean bool = qVar.f115855a;
        if (bool == null) {
            q qVar2 = (q) dVar.f47032p.f150540a.getValue();
            bool = qVar2 != null ? qVar2.f115855a : null;
        }
        com.garmin.android.apps.connectmobile.userprofile.model.r rVar = qVar.f115856b;
        if (rVar == null) {
            q qVar3 = (q) dVar.f47032p.f150540a.getValue();
            rVar = qVar3 != null ? qVar3.f115856b : null;
        }
        nj1.e eVar = qVar.f115857c;
        if (eVar == null) {
            q qVar4 = (q) dVar.f47032p.f150540a.getValue();
            eVar = qVar4 != null ? qVar4.f115857c : null;
        }
        q qVar5 = new q(bool, rVar, eVar, qVar.f115858d);
        m12.b.f115791a.getClass();
        dVar.f47030n = q.a(qVar5, null, m12.b.a(qVar5.f115857c), false, 11);
        p2 p2Var2 = dVar.f47031o;
        do {
            value2 = p2Var2.getValue();
        } while (!p2Var2.b(value2, qVar5));
        p2 p2Var3 = dVar.f47028l;
        do {
            value3 = p2Var3.getValue();
            ((Boolean) value3).getClass();
        } while (!p2Var3.b(value3, Boolean.FALSE));
        return Unit.INSTANCE;
    }
}
