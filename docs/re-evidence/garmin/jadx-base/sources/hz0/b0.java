package hz0;

import am.c2;
import com.garmin.android.apps.connectmobile.newsfeed.NewsFeedViewModel;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lmo1/f;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.newsfeed.NewsFeedViewModel$likeActivity$1", f = "NewsFeedViewModel.kt", l = {104}, m = "invokeSuspend", v = 2)
public final class b0 extends v13.i implements e23.l<t13.d<? super v2<? extends mo1.f>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f86407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NewsFeedViewModel f86408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f86409c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(NewsFeedViewModel newsFeedViewModel, String str, t13.d<? super b0> dVar) {
        super(1, dVar);
        this.f86408b = newsFeedViewModel;
        this.f86409c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new b0(this.f86408b, this.f86409c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends mo1.f>> dVar) {
        return ((b0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f86407a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        fo1.f fVar = this.f86408b.f39458d;
        c2 c2Var = c2.ACTIVITY;
        this.f86407a = 1;
        fVar.getClass();
        Object objJ = com.garmin.android.apps.connectmobile.f0.J(fVar, new fo1.v(fVar, c2Var, this.f86409c, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}
