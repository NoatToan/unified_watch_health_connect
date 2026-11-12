package t20;

import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.biz.ImportCourseTask$execute$2", f = "ImportCourseTask.kt", l = {}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f161793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v2<com.garmin.android.apps.connectmobile.courses.model.e> f161794b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(j jVar, v2<com.garmin.android.apps.connectmobile.courses.model.e> v2Var, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f161793a = jVar;
        this.f161794b = v2Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f161793a, this.f161794b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        this.f161793a.f161788d.b((com.garmin.android.apps.connectmobile.courses.model.e) ((v2.b) this.f161794b).f47386a);
        return Unit.INSTANCE;
    }
}
