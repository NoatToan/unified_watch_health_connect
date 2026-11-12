package ug0;

import java.util.List;
import o13.r;
import o53.b0;
import o53.c2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import r53.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.viewable.ViewableAccountsViewModel$generateViewOnlyUri$1", f = "ViewableAccountsViewModel.kt", l = {109}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f170596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f170597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f170598c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(q qVar, String str, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f170597b = qVar;
        this.f170598c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m(this.f170597b, this.f170598c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        List<ue0.l> listC;
        Object value2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f170596a;
        q qVar = this.f170597b;
        if (i14 == 0) {
            r.b(obj);
            p2 p2Var = qVar.f170631e;
            p2 p2Var2 = qVar.f170631e;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, a.a((a) p2Var2.getValue(), true)));
            Object obj2 = null;
            qVar.f170632f.k(null, fw.m.a.f(fw.m.f73767e, null, null, 3));
            ue0.k kVar = ((a) s.d(p2Var2).f150540a.getValue()).f170565a;
            String str = this.f170598c;
            if (kVar != null && (listC = kVar.c()) != null) {
                for (Object obj3 : listC) {
                    if (String.valueOf(((ue0.l) obj3).getUserId()).equals(str)) {
                        obj2 = obj3;
                        break;
                    }
                }
                obj2 = (ue0.l) obj2;
            }
            boolean z14 = obj2 != null;
            te0.e eVar = qVar.f170628b;
            this.f170596a = 1;
            obj = eVar.a(str, z14, this);
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
        fw.m mVar = (fw.m) obj;
        c2 c2Var = qVar.f170633g;
        p2 p2Var3 = qVar.f170631e;
        if (c2Var != null && !c2Var.isCancelled()) {
            qVar.f170632f.setValue(mVar);
        }
        do {
            value2 = p2Var3.getValue();
        } while (!p2Var3.b(value2, a.a((a) p2Var3.getValue(), false)));
        return Unit.INSTANCE;
    }
}
