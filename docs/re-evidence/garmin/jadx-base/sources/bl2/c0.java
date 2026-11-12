package bl2;

import java.util.UUID;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.filetransfer.core.tasks.TransferStatusResponder$respond$2$job$1", f = "TransferStatusResponder.kt", l = {59, 65, 76}, m = "invokeSuspend")
public final class c0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f18625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lk2.b f18626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wk2.i f18627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a0 f18628e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(boolean z14, lk2.b bVar, wk2.i iVar, a0 a0Var, t13.d<? super c0> dVar) {
        super(2, dVar);
        this.f18625b = z14;
        this.f18626c = bVar;
        this.f18627d = iVar;
        this.f18628e = a0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c0(this.f18625b, this.f18626c, this.f18627d, this.f18628e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        if (r1.f(r8, null, r7) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        if (r1.f(r8, r4, r7) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0080, code lost:
    
        if (r1.f(r8, r4, r7) == r0) goto L33;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f18624a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return Unit.INSTANCE;
            }
            if (i14 == 2) {
                o13.r.b(obj);
                return Unit.INSTANCE;
            }
            if (i14 == 3) {
                o13.r.b(obj);
                return Unit.INSTANCE;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        boolean z14 = this.f18625b;
        lk2.b bVar = this.f18626c;
        wk2.i iVar = this.f18627d;
        if (z14) {
            a0 a0Var = this.f18628e;
            Integer numO = a0Var.f18596b.o(iVar);
            if (numO != null) {
                UUID id3 = iVar.getId();
                this.f18624a = 2;
            } else {
                if (iVar.getF205155e().a() >= 20 && a0Var.f18596b.h(20, iVar.getId())) {
                    numO = new Integer(20);
                }
                UUID id4 = iVar.getId();
                this.f18624a = 3;
            }
        } else {
            UUID id5 = iVar.getId();
            this.f18624a = 1;
        }
        return aVar;
    }
}
