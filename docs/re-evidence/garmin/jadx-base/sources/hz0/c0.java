package hz0;

import com.garmin.android.apps.connectmobile.newsfeed.NewsFeedViewModel;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.newsfeed.NewsFeedViewModel$likeOrUnlikeHighlightedComment$1", f = "NewsFeedViewModel.kt", l = {313, 315}, m = "invokeSuspend", v = 2)
public final class c0 extends v13.i implements e23.l<t13.d<? super v2<? extends Object>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f86412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f86413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NewsFeedViewModel f86414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f86415d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(boolean z14, NewsFeedViewModel newsFeedViewModel, String str, t13.d<? super c0> dVar) {
        super(1, dVar);
        this.f86413b = z14;
        this.f86414c = newsFeedViewModel;
        this.f86415d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new c0(this.f86413b, this.f86414c, this.f86415d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends Object>> dVar) {
        return ((c0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r7 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        if (r7 == r0) goto L19;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f86412a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return (v2) obj;
            }
            if (i14 == 2) {
                o13.r.b(obj);
                return (v2) obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        String str = this.f86415d;
        boolean z14 = this.f86413b;
        NewsFeedViewModel newsFeedViewModel = this.f86414c;
        if (z14) {
            fo1.f fVar = newsFeedViewModel.f39458d;
            this.f86412a = 1;
            fVar.getClass();
            obj = com.garmin.android.apps.connectmobile.f0.J(fVar, new fo1.a0(fVar, str, null), this);
        } else {
            fo1.f fVar2 = newsFeedViewModel.f39458d;
            this.f86412a = 2;
            fVar2.getClass();
            obj = com.garmin.android.apps.connectmobile.f0.J(fVar2, new fo1.u(fVar2, str, null), this);
        }
        return aVar;
    }
}
