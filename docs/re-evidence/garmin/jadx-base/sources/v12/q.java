package v12;

import am.x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.y;
import r53.e2;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.past.UpdateCustomPastActivitiesPrivacyViewModel$onBackPressed$1", f = "UpdateCustomPastActivitiesPrivacyViewModel.kt", l = {78, 79}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f174801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f174802b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p pVar, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f174802b = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f174802b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
    
        if (r11.emit(r1, r10) == r0) goto L19;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f174801a;
        p pVar = this.f174802b;
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
        p2 p2Var = pVar.f174791b;
        p.a aVar2 = (p.a) p2Var.getValue();
        List<ip.a> list = ((p.a) pVar.f174791b.getValue()).f174794a;
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            x0 x0Var = ((ip.a) it.next()).f94639a;
            x0Var.getClass();
            arrayList.add(new ip.a(x0Var, null));
        }
        p.a aVarA = p.a.a(aVar2, arrayList, false, false, 6);
        this.f174801a = 1;
        p2Var.k(null, aVarA);
        if (Unit.INSTANCE != aVar) {
        }
        return aVar;
        e2 e2Var = pVar.f174792c;
        p.b.C3255b c3255b = p.b.C3255b.f174798a;
        this.f174801a = 2;
    }
}
