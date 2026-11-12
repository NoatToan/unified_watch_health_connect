package xi1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import lc.u0;
import o13.r;
import o53.b0;
import oj1.g;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;
import z70.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.newsfeed.NewsFeedSettingsViewModel$setUserNewsFeedPreference$1", f = "NewsFeedSettingsViewModel.kt", l = {43}, m = "invokeSuspend", v = 2)
public final class f extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f191141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f191142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f191143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f191144d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, e23.a<Unit> aVar, t13.d<? super f> dVar2) {
        super(2, dVar2);
        this.f191143c = dVar;
        this.f191144d = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f fVar = new f(this.f191143c, this.f191144d, dVar);
        fVar.f191142b = obj;
        return fVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var = (b0) this.f191142b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f191141a;
        if (i14 == 0) {
            r.b(obj);
            d dVar = this.f191143c;
            u uVar = new u("activity.summary.image.generation.enabled", String.valueOf(((Boolean) dVar.f191134b.getValue()).booleanValue()));
            g gVar = dVar.f191133a;
            this.f191142b = b0Var;
            this.f191141a = 1;
            gVar.getClass();
            obj = f0.J(gVar, new oj1.i(gVar, "activity.summary.image.generation.enabled", uVar, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            this.f191144d.invoke();
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error setUserNewsFeedPreference: ");
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "NewsFeedSettingsViewModel", strD);
        }
        return Unit.INSTANCE;
    }
}
