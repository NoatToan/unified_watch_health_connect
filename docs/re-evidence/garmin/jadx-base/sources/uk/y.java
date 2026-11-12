package uk;

import java.io.IOException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
@v13.e(c = "com.dsi.vivoki.antble.gfdi.VivokiGfdiEmulator$handleUnsupportedMessage$1", f = "VivokiGfdiEmulator.kt", l = {325}, m = "invokeSuspend")
public final class y extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o53.b0 f171784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o53.b0 f171785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f171786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f171787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f171788e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(k kVar, int i14, t13.d dVar) {
        super(2, dVar);
        this.f171787d = kVar;
        this.f171788e = i14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        dVar.getClass();
        y yVar = new y(this.f171787d, this.f171788e, dVar);
        yVar.f171784a = (o53.b0) obj;
        return yVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((y) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f171786c;
        k kVar = this.f171787d;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                this.f171785b = this.f171784a;
                this.f171786c = 1;
                if (kVar.f171691d.b(this.f171788e, h.UNKNOWN_OR_NOT_SUPPORTED, new byte[0], this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
        } catch (IOException e4) {
            kVar.f171699l.error("Failed to send unsupported message response", (Throwable) e4);
        }
        return Unit.INSTANCE;
    }
}
