package uk;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.io.IOException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
@v13.e(c = "com.dsi.vivoki.antble.gfdi.VivokiGfdiEmulator$handleConfiguration$1", f = "VivokiGfdiEmulator.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend")
public final class p extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o53.b0 f171724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o53.b0 f171725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f171726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f171727d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(k kVar, t13.d dVar) {
        super(2, dVar);
        this.f171727d = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        dVar.getClass();
        p pVar = new p(this.f171727d, dVar);
        pVar.f171724a = (o53.b0) obj;
        return pVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f171726c;
        k kVar = this.f171727d;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                this.f171725b = this.f171724a;
                this.f171726c = 1;
                if (kVar.f171691d.b(5050, h.ACK, new byte[0], this) == aVar) {
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
            kVar.f171699l.error("Failed to send configuration response", (Throwable) e4);
        }
        return Unit.INSTANCE;
    }
}
