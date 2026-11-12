package lk2;

import com.garmin.device.filetransfer.FileTransferException;
import java.util.List;
import java.util.UUID;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Llk2/a0;", "<anonymous>", "()Llk2/a0;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.filetransfer.FileTransferManager$read$setup$1", f = "FileTransferManager.kt", l = {319}, m = "invokeSuspend")
public final class f extends v13.i implements e23.l<t13.d<? super a0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f113198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.device.filetransfer.a f113199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UUID f113200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f113201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f113202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f113203f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f113204g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r0<nk2.b> f113205h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ dz2.a f113206i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.garmin.device.filetransfer.a aVar, UUID uuid, int i14, long j8, long j14, boolean z14, r0<nk2.b> r0Var, dz2.a aVar2, t13.d<? super f> dVar) {
        super(1, dVar);
        this.f113199b = aVar;
        this.f113200c = uuid;
        this.f113201d = i14;
        this.f113202e = j8;
        this.f113203f = j14;
        this.f113204g = z14;
        this.f113205h = r0Var;
        this.f113206i = aVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new f(this.f113199b, this.f113200c, this.f113201d, this.f113202e, this.f113203f, this.f113204g, this.f113205h, this.f113206i, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0> dVar) {
        return ((f) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, nk2.b] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws FileTransferException {
        f fVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f113198a;
        p005kotlin.jvm.internal.j jVar = null;
        if (i14 == 0) {
            o13.r.b(obj);
            com.garmin.device.filetransfer.a aVar2 = this.f113199b;
            com.garmin.device.filetransfer.b bVar = aVar2.f50730f;
            if (bVar == null) {
                p005kotlin.jvm.internal.s.m("protobuf");
                throw null;
            }
            Long l14 = new Long(this.f113202e);
            List listC = com.garmin.device.filetransfer.a.c(aVar2);
            this.f113198a = 1;
            fVar = this;
            obj = bVar.h(this.f113200c, this.f113201d, l14, this.f113203f, listC, this.f113204g, fVar);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            fVar = this;
        }
        a0 a0Var = (a0) obj;
        if (a0Var.f113161d != null) {
            fVar.f113205h.f105810a = new nk2.b(fVar.f113206i, 0, 2, jVar);
        }
        return a0Var;
    }
}
