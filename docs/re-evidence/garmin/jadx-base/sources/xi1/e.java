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
import oj1.h;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import z70.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.newsfeed.NewsFeedSettingsViewModel$getUserNewsFeedPreference$1", f = "NewsFeedSettingsViewModel.kt", l = {26}, m = "invokeSuspend", v = 2)
public final class e extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f191138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f191139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f191140c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, t13.d<? super e> dVar2) {
        super(2, dVar2);
        this.f191140c = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e eVar = new e(this.f191140c, dVar);
        eVar.f191139b = obj;
        return eVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var = (b0) this.f191139b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f191138a;
        d dVar = this.f191140c;
        if (i14 == 0) {
            r.b(obj);
            dVar.f191136d.k(null, Boolean.TRUE);
            g gVar = dVar.f191133a;
            this.f191139b = b0Var;
            this.f191138a = 1;
            gVar.getClass();
            obj = f0.J(gVar, new h(gVar, "activity.summary.image.generation.enabled", null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            dVar.f191134b.k(null, Boolean.valueOf(Boolean.parseBoolean(((u) ((v2.b) v2Var).f47386a).f202869b)));
            dVar.f191136d.k(null, Boolean.FALSE);
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            dVar.f191136d.k(null, Boolean.FALSE);
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error getUserNewsFeedPreference: ");
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "NewsFeedSettingsViewModel", strD);
        }
        return Unit.INSTANCE;
    }
}
