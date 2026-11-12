package hz0;

import com.garmin.android.apps.connectmobile.newsfeed.NewsFeedViewModel;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.newsfeed.NewsFeedViewModel$unfollow$1", f = "NewsFeedViewModel.kt", l = {91}, m = "invokeSuspend", v = 2)
public final class f0 extends v13.i implements e23.l<t13.d<? super v2<? extends Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f86430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NewsFeedViewModel f86431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f86432c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(NewsFeedViewModel newsFeedViewModel, String str, t13.d<? super f0> dVar) {
        super(1, dVar);
        this.f86431b = newsFeedViewModel;
        this.f86432c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new f0(this.f86431b, this.f86432c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends Unit>> dVar) {
        return ((f0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f86430a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        ei0.d dVar = this.f86431b.f39459e;
        this.f86430a = 1;
        Object objE0 = dVar.e0(this.f86432c, this);
        return objE0 == aVar ? aVar : objE0;
    }
}
