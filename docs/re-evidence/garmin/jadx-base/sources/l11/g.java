package l11;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.details.viewmodel.FoodDetailsViewModel$setFavorite$1", f = "FoodDetailsViewModel.kt", l = {417}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f108154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f108155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f108156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b11.d f108157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a.b f108158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f108159f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(a aVar, b11.d dVar, a.b bVar, boolean z14, t13.d<? super g> dVar2) {
        super(2, dVar2);
        this.f108156c = aVar;
        this.f108157d = dVar;
        this.f108158e = bVar;
        this.f108159f = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g gVar = new g(this.f108156c, this.f108157d, this.f108158e, this.f108159f, dVar);
        gVar.f108155b = obj;
        return gVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objE0;
        Object value;
        b0 b0Var = (b0) this.f108155b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f108154a;
        a.b bVar = this.f108158e;
        a aVar2 = this.f108156c;
        if (i14 == 0) {
            o13.r.b(obj);
            v01.y yVar = aVar2.f108059h;
            b11.d dVar = this.f108157d;
            String str = dVar.f14253a;
            g01.u uVar = dVar.f14257e;
            String str2 = dVar.f14258f;
            String str3 = dVar.f14259g;
            b11.i.a aVar3 = bVar.f108075a;
            String str4 = aVar3.f14302h.f14372a;
            Double d14 = new Double(aVar3.f14298d);
            this.f108155b = b0Var;
            this.f108154a = 1;
            objE0 = ge1.b.e0(yVar.f174609c, new v01.x(this.f108159f, yVar, str, uVar, str4, d14, str2, str3, null), this);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objE0 = obj;
        }
        v2 v2Var = (v2) objE0;
        boolean z14 = v2Var instanceof v2.a;
        boolean z15 = this.f108159f;
        if (z14) {
            a2 a2Var = a2.NUTRITION;
            String str5 = "Failed to mark food as favorite=" + z15 + ". exception=" + ((v2.a) v2Var).f47383a;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "FoodDetailsViewModel", str5);
            aVar2.f108073x.setValue(a.d.e.f108101a);
        } else {
            if (!(v2Var instanceof v2.b)) {
                u0.r();
                return null;
            }
            aVar2.f108064m.k(null, a.b.a(bVar, b11.i.a.i(bVar.f108075a, null, 0.0d, this.f108159f, 0L, null, null, null, 1007), null, false, 62));
            p2 p2Var = aVar2.f108073x;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, z15 ? a.d.C2076d.f108100a : a.d.l.f108109a));
        }
        return Unit.INSTANCE;
    }
}
