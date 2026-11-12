package o91;

import c83.a0;
import e23.l;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Ln91/a;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.personalrecords.data.repo.PersonalRecordsRepositoryImpl$savePersonalRecord$2", f = "PersonalRecordsRepositoryImpl.kt", l = {28}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements l<t13.d<? super a0<n91.a>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f130996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f130997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n91.a f130998c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, n91.a aVar, t13.d<? super i> dVar) {
        super(1, dVar);
        this.f130997b = gVar;
        this.f130998c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new i(this.f130997b, this.f130998c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<n91.a>> dVar) {
        return ((i) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f130996a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        m91.a aVar2 = this.f130997b.f130989a;
        this.f130996a = 1;
        Object objE = aVar2.e(this.f130998c, this);
        return objE == aVar ? aVar : objE;
    }
}
