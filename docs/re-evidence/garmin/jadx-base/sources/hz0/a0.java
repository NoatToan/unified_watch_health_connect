package hz0;

import com.garmin.android.apps.connectmobile.newsfeed.NewsFeedViewModel;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.newsfeed.NewsFeedViewModel$clearEditedCache$1", f = "NewsFeedViewModel.kt", l = {182, 183}, m = "invokeSuspend", v = 2)
public final class a0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f86404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NewsFeedViewModel f86405b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(NewsFeedViewModel newsFeedViewModel, t13.d<? super a0> dVar) {
        super(2, dVar);
        this.f86405b = newsFeedViewModel;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a0(this.f86405b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((a0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        if (r6 == r0) goto L21;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f86404a;
        NewsFeedViewModel newsFeedViewModel = this.f86405b;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        m mVar = newsFeedViewModel.f39457c;
        this.f86404a = 1;
        Object objB = mVar.f86460b.f().b(this);
        if (objB != aVar) {
            objB = Unit.INSTANCE;
        }
        if (objB != aVar) {
        }
        return aVar;
        m mVar2 = newsFeedViewModel.f39457c;
        this.f86404a = 2;
        Object objA = mVar2.f86460b.e().a(this);
        if (objA != aVar) {
            objA = Unit.INSTANCE;
        }
    }
}
