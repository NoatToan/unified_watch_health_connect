package l11;

import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import v01.t1;
import v01.u1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.details.viewmodel.FoodReportIssueViewModel$logFoodIssue$1", f = "FoodReportIssueViewModel.kt", l = {56}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f108171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f108172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f108173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g01.l f108174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f108175e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, h hVar, g01.l lVar, String str, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f108172b = kVar;
        this.f108173c = hVar;
        this.f108174d = lVar;
        this.f108175e = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f108172b, this.f108173c, this.f108174d, this.f108175e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f108171a;
        k kVar = this.f108172b;
        if (i14 == 0) {
            o13.r.b(obj);
            u1 u1Var = kVar.f108176a;
            this.f108171a = 1;
            obj = ge1.b.e0(u1Var.f174552b, new t1(this.f108173c, this.f108174d, this.f108175e, u1Var, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            p2 p2Var = kVar.f108177b;
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, i.a((i) value2, null, null, false, false, true, false, 31)));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            p2 p2Var2 = kVar.f108177b;
            do {
                value = p2Var2.getValue();
            } while (!p2Var2.b(value, i.a((i) value, null, null, false, false, false, true, 31)));
        }
        return Unit.INSTANCE;
    }
}
