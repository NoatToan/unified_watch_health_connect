package kk1;

import e23.p;
import ek1.v;
import hk1.n;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.thirdparty.presentation.details.ThirdPartyAppDetailsViewModel$updatePermission$1", f = "ThirdPartyAppDetailsViewModel.kt", l = {68}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f105159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f105160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f105161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f105162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hk1.d f105163e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n f105164f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, String str, String str2, hk1.d dVar, n nVar, t13.d<? super i> dVar2) {
        super(2, dVar2);
        this.f105160b = gVar;
        this.f105161c = str;
        this.f105162d = str2;
        this.f105163e = dVar;
        this.f105164f = nVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f105160b, this.f105161c, this.f105162d, this.f105163e, this.f105164f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f105159a;
        if (i14 == 0) {
            r.b(obj);
            g gVar = this.f105160b;
            p2 p2Var = gVar.f105154h;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, j.a((j) value, true, false, null, false, 62)));
            v vVar = gVar.f105148b;
            List<String> list = gVar.f105151e;
            i53.d<hk1.d, Boolean> dVar = ((j) gVar.f105154h.getValue()).f105168d;
            h hVar = new h(gVar, 0);
            jx0.e eVar = new jx0.e(gVar, 18);
            this.f105159a = 1;
            if (vVar.a(this.f105161c, this.f105163e, this.f105164f, list, dVar, hVar, eVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
