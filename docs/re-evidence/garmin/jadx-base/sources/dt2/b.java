package dt2;

import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.ExtensionRegistryLite;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import o13.q;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ldt2/b;", "", "Lcom/google/protobuf/ExtensionRegistryLite;", "extensionRegistry", "Lcz2/a;", "clock", "Lkotlin/Function1;", "Lo13/q;", "Lcom/garmin/proto/generated/GDISmartProto$Smart;", "", "completion", "<init>", "(Lcom/google/protobuf/ExtensionRegistryLite;Lcz2/a;Le23/l;)V", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExtensionRegistryLite f61136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cz2.a f61137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.l<q<GDISmartProto.Smart>, Boolean> f61138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicLong f61139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f61140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ByteArrayOutputStream f61141f;

    /* JADX WARN: Multi-variable type inference failed */
    public b(ExtensionRegistryLite extensionRegistryLite, cz2.a aVar, e23.l<? super q<GDISmartProto.Smart>, Boolean> lVar) {
        extensionRegistryLite.getClass();
        aVar.getClass();
        lVar.getClass();
        this.f61136a = extensionRegistryLite;
        this.f61137b = aVar;
        this.f61138c = lVar;
        this.f61139d = new AtomicLong(aVar.millis());
        this.f61140e = new AtomicBoolean(true);
        this.f61141f = new ByteArrayOutputStream();
    }

    public final boolean a(Serializable serializable) {
        if (this.f61140e.compareAndSet(true, false)) {
            return this.f61138c.invoke(q.a(serializable)).booleanValue();
        }
        return false;
    }
}
