package ok2;

import java.io.Serializable;
import java.util.UUID;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo53/b0;", "Lo13/p;", "", "Ljava/util/UUID;", "Lcom/garmin/device/filetransfer/core/GarminDeviceXml;", "<anonymous>", "(Lo53/b0;)Lo13/p;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.filetransfer.core.TransferManager$requestDeviceXml$2", f = "TransferManager.kt", l = {369}, m = "invokeSuspend")
public final class e0 extends v13.i implements e23.p<o53.b0, t13.d<? super o13.p<? extends byte[], ? extends UUID>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f132669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f132670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f132671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ al2.m f132672d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(f0 f0Var, boolean z14, al2.m mVar, t13.d<? super e0> dVar) {
        super(2, dVar);
        this.f132670b = f0Var;
        this.f132671c = z14;
        this.f132672d = mVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e0(this.f132670b, this.f132671c, this.f132672d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super o13.p<? extends byte[], ? extends UUID>> dVar) {
        return ((e0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Exception {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f132669a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f132669a = 1;
            Serializable serializableE = f0.e(this.f132670b, this.f132671c, this.f132672d, this);
            return serializableE == aVar ? aVar : serializableE;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            return obj;
        }
        vb.h.z("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
