package y10;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lo10/b;", "<anonymous>", "(Lo53/b0;)Lo10/b;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.connectiq.viewmodel.ConnectIQDownloadViewModel$onIconTaskCompleted$updatedApp$1", f = "ConnectIQDownloadViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class c0 extends v13.i implements e23.p<o53.b0, t13.d<? super o10.b>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f193803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o10.b f193804b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(k kVar, o10.b bVar, t13.d<? super c0> dVar) {
        super(2, dVar);
        this.f193803a = kVar;
        this.f193804b = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c0(this.f193803a, this.f193804b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super o10.b> dVar) {
        return ((c0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        for (Object obj2 : this.f193803a.f193912k) {
            if (p005kotlin.jvm.internal.s.g(((o10.b) obj2).getName(), this.f193804b.getName())) {
                return obj2;
            }
        }
        return null;
    }
}
