package ws2;

import e23.p;
import java.io.IOException;
import o13.r;
import o53.b0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import rs2.x;
import rs2.y;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.gfdi.file.FileManager$handleCancelTransfer$1", f = "FileManager.kt", l = {590}, m = "invokeSuspend")
public final class g extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f186980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f186981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.gfdi.file.a f186982c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(x xVar, com.garmin.gfdi.file.a aVar, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f186981b = xVar;
        this.f186982c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f186981b, this.f186982c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f186980a;
        try {
            if (i14 == 0) {
                r.b(obj);
                x xVar = this.f186981b;
                y yVar = y.ACK;
                this.f186980a = 1;
                if (xVar.b(yVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
        } catch (IOException e4) {
            Logger logger = this.f186982c.f52361b;
            if (logger == null) {
                s.m("logger");
                throw null;
            }
            logger.warn("Failed to send cancel transfer response", (Throwable) e4);
        }
        return Unit.INSTANCE;
    }
}
