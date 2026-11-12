package lk2;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Llk2/a0;", "response", "Llk2/u;", "factory", "Lkotlin/Function2;", "", "", "Lcom/garmin/device/filetransfer/TransferProgress;", "progress", "<anonymous>", "(Llk2/a0;Llk2/u;Le23/p;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.filetransfer.FileTransferManager$read$transfer$1", f = "FileTransferManager.kt", l = {327}, m = "invokeSuspend")
public final class g extends v13.i implements e23.r<a0, u, e23.p<? super Long, ? super Long, ? extends Unit>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f113212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ a0 f113213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ u f113214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ e23.p f113215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f113216e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r0<nk2.b> f113217f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dz2.a f113218g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c0 f113219h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(long j8, r0<nk2.b> r0Var, dz2.a aVar, c0 c0Var, t13.d<? super g> dVar) {
        super(4, dVar);
        this.f113216e = j8;
        this.f113217f = r0Var;
        this.f113218g = aVar;
        this.f113219h = c0Var;
    }

    @Override // e23.r
    public final Object invoke(a0 a0Var, u uVar, e23.p<? super Long, ? super Long, ? extends Unit> pVar, t13.d<? super Unit> dVar) {
        dz2.a aVar = this.f113218g;
        c0 c0Var = this.f113219h;
        g gVar = new g(this.f113216e, this.f113217f, aVar, c0Var, dVar);
        gVar.f113213b = a0Var;
        gVar.f113214c = uVar;
        gVar.f113215d = pVar;
        return gVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f113212a;
        c0 c0Var = this.f113219h;
        r0<nk2.b> r0Var = this.f113217f;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                a0 a0Var = this.f113213b;
                u uVar = this.f113214c;
                e23.p pVar = this.f113215d;
                int i15 = a0Var.f113158a;
                long j8 = this.f113216e;
                nk2.b bVar = r0Var.f105810a;
                if (bVar == null) {
                    bVar = this.f113218g;
                }
                dz2.a aVar2 = bVar;
                this.f113213b = null;
                this.f113214c = null;
                this.f113212a = 1;
                if (uVar.b(i15, j8, aVar2, pVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            nk2.b bVar2 = r0Var.f105810a;
            if (bVar2 != null) {
                bVar2.c();
            }
            nk2.b bVar3 = r0Var.f105810a;
            c0Var.f113168f = bVar3 != null ? new Long(bVar3.f126465f) : null;
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            nk2.b bVar4 = r0Var.f105810a;
            if (bVar4 != null) {
                bVar4.c();
            }
            nk2.b bVar5 = r0Var.f105810a;
            c0Var.f113168f = bVar5 != null ? new Long(bVar5.f126465f) : null;
            throw th3;
        }
    }
}
