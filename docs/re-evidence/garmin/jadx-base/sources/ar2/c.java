package ar2;

import e23.p;
import java.util.Iterator;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.u;
import v13.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.ui.addcard.viewmodels.SelectCategoryViewModel$onCategoryClicked$1", f = "SelectCategoryViewModel.kt", l = {44, 47, 57}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f12587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qs2.e f12588c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, qs2.e eVar, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f12587b = bVar;
        this.f12588c = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f12587b, this.f12588c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0094, code lost:
    
        if (r5.x4(r14, r13) == r1) goto L36;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f12586a;
        b bVar = this.f12587b;
        try {
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return Unit.INSTANCE;
                }
                if (i14 == 2 || i14 == 3) {
                    r.b(obj);
                    return Unit.INSTANCE;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            ns2.a<ms2.e> aVar2 = bVar.f12579f;
            qs2.e eVar = this.f12588c;
            if (aVar2 == null || !aVar2.f127815a.isEmpty()) {
                Iterator it = aVar2.f127815a.iterator();
                while (it.hasNext()) {
                    if (u.z(((ms2.e) it.next()).getF205852c(), eVar)) {
                        b.InterfaceC0177b.a aVar3 = new b.InterfaceC0177b.a(this.f12588c, bVar.f12579f, bVar.B4(), bVar.A4());
                        this.f12586a = 2;
                        if (bVar.y4(aVar3, this) == aVar) {
                            return aVar;
                        }
                        return Unit.INSTANCE;
                    }
                }
            }
            b.InterfaceC0177b.C0178b c0178b = b.InterfaceC0177b.C0178b.f12585a;
            this.f12586a = 1;
            if (bVar.y4(c0178b, this) == aVar) {
                return aVar;
            }
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            b.f12578g.f12580a.a().warn("[onCategoryClicked]", th3);
            a.b.C0176b c0176b = a.b.C0176b.f12566a;
            this.f12586a = 3;
        }
    }
}
