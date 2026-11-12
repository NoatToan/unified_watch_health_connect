package ok2;

import android.content.Context;
import o53.c2;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.filetransfer.core.CoreTransferManager$onCommunicationReady$1", f = "CoreTransferManager.kt", l = {648, 650, 656}, m = "invokeSuspend")
public final class l extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f132752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f132753b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(g gVar, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f132753b = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f132753b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
    
        if (r2.P(r17) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
    
        if (r2.P(r17) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0088, code lost:
    
        if (r2.P(r17) == r1) goto L23;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f132752a;
        g gVar = this.f132753b;
        if (i14 == 0) {
            o13.r.b(obj);
            com.garmin.device.filetransfer.core.background.a.C1027a c1027a = com.garmin.device.filetransfer.core.background.a.f50783c;
            b bVar = gVar.f132683b;
            pk2.b bVar2 = gVar.f132696o;
            long jA = bVar.a().a();
            c1027a.getClass();
            if (com.garmin.device.filetransfer.core.background.a.C1027a.a(jA)) {
                bVar2.getClass();
                c2 c2VarO = bVar2.o(new pk2.t(bVar2, null));
                this.f132752a = 3;
            } else if (gVar.f132686e.compareAndSet(true, false)) {
                c2 c2VarK = bVar2.k(y.c.a(y.f132805h, null, null, y.d.FORCED, null, 11));
                this.f132752a = 1;
            } else {
                bVar2.getClass();
                c2 c2VarO2 = bVar2.o(new pk2.t(bVar2, null));
                this.f132752a = 2;
            }
            return aVar;
        }
        if (i14 == 1 || i14 == 2) {
            o13.r.b(obj);
        } else {
            if (i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            b bVar3 = gVar.f132683b;
            Logger logger = gVar.f132688g;
            b bVar4 = gVar.f132683b;
            rs2.c cVar = gVar.f132682a;
            if (!bVar3.getConfiguration().p()) {
                com.garmin.device.filetransfer.core.background.a.b.f50787e.getClass();
                long jB = com.garmin.device.filetransfer.core.background.a.b.f50791i.b(Long.hashCode(cVar.getF92746j()));
                Context context = bVar4.getConfiguration().f132622b;
                if (context != null) {
                    com.garmin.device.filetransfer.core.background.a.b(context, jB, cVar.getF92741e(), bVar4.b(), ue.l.REPLACE);
                } else {
                    logger.warn("onCommunicationReady: midnight delay but context unavailable, retry may be missed");
                }
                wr.g.v("onCommunicationReady: midnight delay, background retry in ", jB / ((long) 1000), "s", logger);
                o53.s sVar = gVar.f132693l;
                Unit unit = Unit.INSTANCE;
                sVar.g0(unit);
                return unit;
            }
        }
        g.J(gVar, "device connect", null, false, 6);
        o53.s sVar2 = gVar.f132693l;
        Unit unit2 = Unit.INSTANCE;
        sVar2.g0(unit2);
        return unit2;
    }
}
