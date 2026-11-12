package pk2;

import java.util.Collection;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.core.agent.AgentQueueHelper$refreshQueueOnConnection$1", f = "AgentQueueHelper.kt", l = {192, 196}, m = "invokeSuspend")
public final class t extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f138481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f138482b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(b bVar, t13.d<? super t> dVar) {
        super(1, dVar);
        this.f138482b = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new t(this.f138482b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super Unit> dVar) {
        return ((t) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (r5.i(r1, r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (pk2.b.d(r5, r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        return r0;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f138481a;
        if (i14 == 0) {
            o13.r.b(obj);
            b bVar = this.f138482b;
            Collection<Integer> collectionValues = bVar.f138363f.values();
            collectionValues.getClass();
            if (h0.c0(collectionValues) == null) {
                ok2.y yVar = new ok2.y();
                this.f138481a = 1;
            } else {
                this.f138481a = 2;
            }
        } else {
            if (i14 != 1 && i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
