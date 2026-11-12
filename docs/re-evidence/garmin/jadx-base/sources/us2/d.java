package us2;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import rs2.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.gfdi.core.Dispatcher$onRequestRead$1", f = "Dispatcher.kt", l = {201}, m = "invokeSuspend")
public final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f172481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f172482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ct2.h f172483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f172484d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, ct2.h hVar, int i14, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f172482b = bVar;
        this.f172483c = hVar;
        this.f172484d = i14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f172482b, this.f172483c, this.f172484d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f172481a;
        b bVar = this.f172482b;
        try {
            if (i14 == 0) {
                r.b(obj);
                this.f172481a = 1;
                if (bVar.f172459b.b(this.f172483c, this.f172484d, y.UNKNOWN_OR_NOT_SUPPORTED, new byte[0], this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
        } catch (Exception e4) {
            bVar.f172463f.debug("Failed to send unknown or not supported response", (Throwable) e4);
        }
        return Unit.INSTANCE;
    }
}
