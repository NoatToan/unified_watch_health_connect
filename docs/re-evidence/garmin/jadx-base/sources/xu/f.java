package xu;

import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/service/model/i;", "processedTranslations", "Lcom/garmin/android/apps/connectmobile/v2;", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/badges/service/model/i;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.badges.redesign.translation.domain.BadgeTranslationsUseCase$fetchTranslations$3", f = "BadgeTranslationsUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class f extends i implements p<com.garmin.android.apps.connectmobile.badges.service.model.i, t13.d<? super v2<? extends com.garmin.android.apps.connectmobile.badges.service.model.i>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f192221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v2<String> f192222b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(v2<String> v2Var, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f192222b = v2Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f fVar = new f(this.f192222b, dVar);
        fVar.f192221a = obj;
        return fVar;
    }

    @Override // e23.p
    public final Object invoke(com.garmin.android.apps.connectmobile.badges.service.model.i iVar, t13.d<? super v2<? extends com.garmin.android.apps.connectmobile.badges.service.model.i>> dVar) {
        return ((f) create(iVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        com.garmin.android.apps.connectmobile.badges.service.model.i iVar = (com.garmin.android.apps.connectmobile.badges.service.model.i) this.f192221a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        v2<String> v2Var = this.f192222b;
        if (iVar != null) {
            return new v2.b(iVar, ((v2.b) v2Var).f47387b, null, null, 12, null);
        }
        v2.a aVar2 = new v2.a(new NullPointerException("Processed translations are null"), new Integer(((v2.b) v2Var).f47387b), null, 4, null);
        return new v2.a(aVar2.f47383a, aVar2.f47384b, null, 4, null);
    }
}
