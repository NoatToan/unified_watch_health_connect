package kd0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.CoursesDelegateImpl$isTrailsAvailableInArea$2", f = "CoursesDelegateImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class r0 extends v13.i implements e23.p<o53.b0, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f104321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double f104322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ double f104323c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(double d14, double d15, t13.d<? super r0> dVar) {
        super(2, dVar);
        this.f104322b = d14;
        this.f104323c = d15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        r0 r0Var = new r0(this.f104322b, this.f104323c, dVar);
        r0Var.f104321a = obj;
        return r0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Boolean> dVar) {
        return ((r0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        String string;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        double d14 = this.f104322b;
        double d15 = this.f104323c;
        try {
            int i14 = o13.q.f128596b;
            boolean z14 = false;
            String str = ((ps1.a) ez0.b.a(ez0.b.f67468a, ez0.c.TRAILS, ps1.a.class, new c83.h.a[0], null, null, null, 120)).d(d14, d15).execute().f25746b;
            if (str != null && (string = d53.w.i0(str).toString()) != null && Boolean.parseBoolean(string)) {
                z14 = true;
            }
            bVar = Boolean.valueOf(z14);
        } catch (Throwable th3) {
            int i15 = o13.q.f128596b;
            bVar = new o13.q.b(th3);
        }
        return bVar instanceof o13.q.b ? Boolean.FALSE : bVar;
    }
}
