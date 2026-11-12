package uu;

import com.garmin.android.apps.connectmobile.v2;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.badges.redesign.BadgesViewModel$earnShareBadge$1", f = "BadgesViewModel.kt", l = {183}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.l<t13.d<? super v2<? extends Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f172752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f172753b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(int i14, t13.d<? super r> dVar) {
        super(1, dVar);
        this.f172753b = i14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new r(this.f172753b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends Unit>> dVar) {
        return ((r) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f172752a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        av.g gVar = (av.g) KoinJavaComponent.get$default(av.g.class, null, null, 6, null);
        com.garmin.android.apps.connectmobile.badges.service.model.t tVar = new com.garmin.android.apps.connectmobile.badges.service.model.t(this.f172753b);
        this.f172752a = 1;
        gVar.getClass();
        Object objJ = com.garmin.android.apps.connectmobile.f0.J(gVar, new av.i(gVar, tVar, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}
