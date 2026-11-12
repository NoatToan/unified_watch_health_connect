package uk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
@v13.e(c = "com.dsi.vivoki.antble.gfdi.VivokiGfdiEmulator$handleCreateFile$1", f = "VivokiGfdiEmulator.kt", l = {353}, m = "invokeSuspend")
public final class q extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o53.b0 f171728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o53.b0 f171729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f171730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f171731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ByteArrayOutputStream f171732e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(k kVar, ByteArrayOutputStream byteArrayOutputStream, t13.d dVar) {
        super(2, dVar);
        this.f171731d = kVar;
        this.f171732e = byteArrayOutputStream;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        dVar.getClass();
        q qVar = new q(this.f171731d, this.f171732e, dVar);
        qVar.f171728a = (o53.b0) obj;
        return qVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f171730c;
        k kVar = this.f171731d;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                o53.b0 b0Var = this.f171728a;
                c0 c0Var = kVar.f171691d;
                h hVar = h.ACK;
                byte[] byteArray = this.f171732e.toByteArray();
                byteArray.getClass();
                this.f171729b = b0Var;
                this.f171730c = 1;
                if (c0Var.b(5005, hVar, byteArray, this) == aVar) {
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
            kVar.f171699l.error("Failed to send create file resposne", (Throwable) e4);
        }
        return Unit.INSTANCE;
    }
}
