package hz0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.newsfeed.NewsFeedViewModel;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.newsfeed.NewsFeedViewModel$unlikeActivity$1", f = "NewsFeedViewModel.kt", l = {116}, m = "invokeSuspend", v = 2)
public final class g0 extends v13.i implements e23.l<t13.d<? super v2<? extends Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f86435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f86436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f86437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ NewsFeedViewModel f86438d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(String str, Long l14, NewsFeedViewModel newsFeedViewModel, t13.d<? super g0> dVar) {
        super(1, dVar);
        this.f86436b = str;
        this.f86437c = l14;
        this.f86438d = newsFeedViewModel;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new g0(this.f86436b, this.f86437c, this.f86438d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends Unit>> dVar) {
        return ((g0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f86435a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        Long l14 = this.f86437c;
        String str = this.f86436b;
        if (str != null && l14 != null) {
            fo1.f fVar = this.f86438d.f39458d;
            String strValueOf = String.valueOf(l14.longValue());
            this.f86435a = 1;
            fVar.getClass();
            Object objJ = com.garmin.android.apps.connectmobile.f0.J(fVar, new fo1.b0(fVar, str, strValueOf, null), this);
            return objJ == aVar ? aVar : objJ;
        }
        String str2 = "unlikeActivity: invalid param conversationUuid=[" + str + "], conversationLikePk=[" + l14 + "]";
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.p(a2Var, "NewsFeedViewModel", str2);
        return new v2.a(new Exception("Invalid params found"), null, null, 6, null);
    }
}
