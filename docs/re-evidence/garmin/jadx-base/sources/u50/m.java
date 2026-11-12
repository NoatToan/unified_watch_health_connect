package u50;

import e23.p;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "available", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.search.CourseSearchViewModel$requestTrailsAvailabilityIfNeeded$1$1", f = "CourseSearchViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements p<Boolean, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f168694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f168695b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(h hVar, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f168695b = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        m mVar = new m(this.f168695b, dVar);
        mVar.f168694a = ((Boolean) obj).booleanValue();
        return mVar;
    }

    @Override // e23.p
    public final Object invoke(Boolean bool, t13.d<? super Unit> dVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((m) create(bool2, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        boolean z14 = this.f168694a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        p2 p2Var = this.f168695b.f168672h;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, x50.f.a((x50.f) value, null, null, null, false, false, 0, z14, 447)));
        return Unit.INSTANCE;
    }
}
