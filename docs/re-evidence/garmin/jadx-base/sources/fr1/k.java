package fr1;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import gg1.v0;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.strava.StravaViewModel$getStravaAuthorizeUrl$1", f = "StravaViewModel.kt", l = {17}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.l<t13.d<? super v2<? extends String>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f73315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f73316b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, t13.d<? super k> dVar) {
        super(1, dVar);
        this.f73316b = mVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new k(this.f73316b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends String>> dVar) {
        return ((k) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f73315a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        v0.T.getClass();
        String strConcat = v0.a.b().b().concat("/strava-auth");
        gr1.b bVar = this.f73316b.f73320a;
        this.f73315a = 1;
        bVar.getClass();
        Object objJ = f0.J(bVar, new gr1.c(bVar, strConcat, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}
