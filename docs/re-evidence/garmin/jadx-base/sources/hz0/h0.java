package hz0;

import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.newsfeed.NewsFeedViewModel;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/e;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.newsfeed.NewsFeedViewModel$uploadPhotos$1", f = "NewsFeedViewModel.kt", l = {324}, m = "invokeSuspend", v = 2)
public final class h0 extends v13.i implements e23.p<r53.j<? super List<? extends com.garmin.android.apps.connectmobile.activities.newmodel.e>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f86439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NewsFeedViewModel f86440b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(NewsFeedViewModel newsFeedViewModel, t13.d<? super h0> dVar) {
        super(2, dVar);
        this.f86440b = newsFeedViewModel;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h0(this.f86440b, dVar);
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super List<? extends com.garmin.android.apps.connectmobile.activities.newmodel.e>> jVar, t13.d<? super Unit> dVar) {
        return ((h0) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f86439a;
        if (i14 == 0) {
            o13.r.b(obj);
            p2 p2Var = this.f86440b.f39462h;
            g3 g3VarC = g3.a.c(g3.f35298f);
            this.f86439a = 1;
            p2Var.k(null, g3VarC);
            if (Unit.INSTANCE == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
