package g22;

import o13.r;
import o53.b0;
import o53.c0;
import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.util.extensions.JavaCoroutines$launchWhenStartedDelayed$1", f = "JavaCoroutines.kt", l = {64}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f75565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f75566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f75567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f75568d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(long j8, e23.a<Unit> aVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f75567c = j8;
        this.f75568d = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        h hVar = new h(this.f75567c, this.f75568d, dVar);
        hVar.f75566b = obj;
        return hVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var = (b0) this.f75566b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f75565a;
        if (i14 == 0) {
            r.b(obj);
            this.f75566b = b0Var;
            this.f75565a = 1;
            if (m0.b(this.f75567c, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        if (c0.g(b0Var)) {
            this.f75568d.invoke();
        }
        return Unit.INSTANCE;
    }
}
