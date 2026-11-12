package xk2;

import com.garmin.device.filetransfer.core.util.CoreTransferException;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import wk2.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lxk2/e;", "Lxk2/d;", "Lxk2/c;", "Ldz2/a;", "dataSink", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "bufferSize", "<init>", "(Ldz2/a;Lxk2/c;I)V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class e implements d, c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dz2.a f191300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f191301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f191302d;

    public e(dz2.a aVar, c cVar, int i14) {
        aVar.getClass();
        cVar.getClass();
        this.f191300b = aVar;
        this.f191301c = cVar;
        this.f191302d = i14;
    }

    @Override // xk2.c
    public final void a(f fVar, CoreTransferException coreTransferException) {
        fVar.getClass();
        this.f191301c.a(fVar, coreTransferException);
    }

    @Override // xk2.d
    public final Unit b(dz2.b bVar) {
        while (bVar.d()) {
            this.f191300b.write(bVar.e(this.f191302d));
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ e(dz2.a aVar, c cVar, int i14, int i15, j jVar) {
        this(aVar, cVar, (i15 & 4) != 0 ? 1000 : i14);
    }
}
