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
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.details.viewmodel.RecipeDetailsViewModel$setFavorite$1", f = "RecipeDetailsViewModel.kt", l = {374}, m = "invokeSuspend", v = 2)
public final class y extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f108318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f108319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f108320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b11.d f108321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f108322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f108323f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(t tVar, b11.d dVar, r rVar, boolean z14, t13.d<? super y> dVar2) {
        super(2, dVar2);
        this.f108320c = tVar;
        this.f108321d = dVar;
        this.f108322e = rVar;
        this.f108323f = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        y yVar = new y(this.f108320c, this.f108321d, this.f108322e, this.f108323f, dVar);
        yVar.f108319b = obj;
        return yVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((y) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objE0;
        Object value;
        b0 b0Var = (b0) this.f108319b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f108318a;
        r rVar = this.f108322e;
        t tVar = this.f108320c;
        if (i14 == 0) {
            o13.r.b(obj);
            v01.y yVar = tVar.f108261i;
            b11.d dVar = this.f108321d;
            String str = dVar.f14253a;
            g01.u uVar = g01.u.GARMIN;
            String str2 = dVar.f14258f;
            String str3 = dVar.f14259g;
            b11.i.b bVar = rVar.f108230a;
            String str4 = bVar.f14312h.f14372a;
            Double d14 = new Double(bVar.f14308d);
            this.f108319b = b0Var;
            this.f108318a = 1;
            objE0 = ge1.b.e0(yVar.f174609c, new v01.x(this.f108323f, yVar, str, uVar, str4, d14, str2, str3, null), this);
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
        boolean z15 = this.f108323f;
        if (z14) {
            a2 a2Var = a2.NUTRITION;
            String str5 = "Failed to mark recipe as favorite=" + z15 + ". exception=" + ((v2.a) v2Var).f47383a;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "RecipeDetailsViewModel", str5);
            tVar.f108268p.setValue(t.c.e.f108284a);
        } else {
            if (!(v2Var instanceof v2.b)) {
                u0.r();
                return null;
            }
            tVar.f108267o.k(null, r.a(rVar, b11.i.b.i(rVar.f108230a, null, 0.0d, this.f108323f, 0L, 1007), false, 126));
            p2 p2Var = tVar.f108268p;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, z15 ? t.c.d.f108283a : t.c.l.f108292a));
        }
        return Unit.INSTANCE;
    }
}
