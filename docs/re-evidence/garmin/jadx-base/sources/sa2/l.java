package sa2;

import java.sql.Date;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.exportablereports.presenter.ReportsDownloadPresenter$reportDownloadComplete$1", f = "ReportsDownloadPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f158371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f158372b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(h hVar, String str, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f158371a = hVar;
        this.f158372b = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f158371a, this.f158372b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        h hVar = this.f158371a;
        ua2.b bVar = hVar.f158336b;
        wa2.a.C3407a c3407a = wa2.a.f183799a;
        qa2.e eVar = hVar.f158337c;
        Date date = eVar.f143901a;
        c3407a.getClass();
        bVar.v5(wa2.a.C3407a.b(date), wa2.a.C3407a.b(eVar.f143902b), this.f158372b);
        hVar.f158338d = false;
        return Unit.INSTANCE;
    }
}
