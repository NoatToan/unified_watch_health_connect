package de2;

import java.io.IOException;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.device.LiveTrackDataHandler$sendResponse$1", f = "LiveTrackDataHandler.kt", l = {157}, m = "invokeSuspend", v = 2)
public final class d0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f59270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f59271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f59272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rs2.x f59273d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(b0 b0Var, String str, rs2.x xVar, t13.d<? super d0> dVar) {
        super(2, dVar);
        this.f59271b = b0Var;
        this.f59272c = str;
        this.f59273d = xVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d0(this.f59271b, this.f59272c, this.f59273d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f59270a;
        String str = this.f59272c;
        b0 b0Var = this.f59271b;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                Logger logger = b0Var.f59254e;
                if (logger == null) {
                    p005kotlin.jvm.internal.s.m("logger");
                    throw null;
                }
                logger.trace("Sending " + str + " response");
                rs2.x xVar = this.f59273d;
                rs2.y yVar = rs2.y.ACK;
                this.f59270a = 1;
                if (xVar.b(yVar, this) == aVar) {
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
            Logger logger2 = b0Var.f59254e;
            if (logger2 == null) {
                p005kotlin.jvm.internal.s.m("logger");
                throw null;
            }
            logger2.warn("Failed to send response for " + str, (Throwable) e4);
        }
        return Unit.INSTANCE;
    }
}
