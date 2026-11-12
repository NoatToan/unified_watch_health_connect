package lk2;

import com.garmin.device.filetransfer.FileTransferException;
import com.garmin.device.filetransfer.ItemAccessException;
import com.garmin.proto.generated.GDIFileAccess;
import java.util.List;
import java.util.UUID;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Llk2/a0;", "<anonymous>", "()Llk2/a0;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.filetransfer.FileTransferManager$write$setup$1", f = "FileTransferManager.kt", l = {393, 395}, m = "invokeSuspend")
public final class i extends v13.i implements e23.l<t13.d<? super a0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f113230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dz2.b f113231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f113232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r0<Long> f113233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f113234e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.garmin.device.filetransfer.a f113235f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ UUID f113236g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f113237h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f113238i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f113239j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ r0<nk2.a> f113240k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(dz2.b bVar, String str, r0<Long> r0Var, boolean z14, com.garmin.device.filetransfer.a aVar, UUID uuid, String str2, int i14, boolean z15, r0<nk2.a> r0Var2, t13.d<? super i> dVar) {
        super(1, dVar);
        this.f113231b = bVar;
        this.f113232c = str;
        this.f113233d = r0Var;
        this.f113234e = z14;
        this.f113235f = aVar;
        this.f113236g = uuid;
        this.f113237h = str2;
        this.f113238i = i14;
        this.f113239j = z15;
        this.f113240k = r0Var2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new i(this.f113231b, this.f113232c, this.f113233d, this.f113234e, this.f113235f, this.f113236g, this.f113237h, this.f113238i, this.f113239j, this.f113240k, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0> dVar) {
        return ((i) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
    
        if (r0 == r9) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00de, code lost:
    
        if (r0 == r9) goto L36;
     */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r2v10, types: [T, nk2.a] */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws FileTransferException {
        GDIFileAccess.DataType.Builder format;
        Object objJ;
        Object objJ2;
        a0 a0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f113230a;
        String str = this.f113232c;
        com.garmin.device.filetransfer.a aVar2 = this.f113235f;
        dz2.b bVar = this.f113231b;
        if (i14 == 0) {
            o13.r.b(obj);
            if (bVar.getF126459l() == 0) {
                throw new FileTransferException(tn.k.g(str, " failed: DataSource is empty"), null, 2, null);
            }
            this.f113233d.f105810a = new Long(bVar.getF126459l());
            boolean z14 = this.f113234e;
            String str2 = this.f113237h;
            if (z14) {
                com.garmin.device.filetransfer.b bVar2 = aVar2.f50730f;
                if (bVar2 == null) {
                    p005kotlin.jvm.internal.s.m("protobuf");
                    throw null;
                }
                long f61810d = bVar.getF126459l();
                List listC = com.garmin.device.filetransfer.a.c(aVar2);
                this.f113230a = 1;
                GDIFileAccess.DataType.Builder format2 = GDIFileAccess.DataType.newBuilder().setSoftwareUpdatePath(str2).setFormat(GDIFileAccess.DataType.Format.SOFTWARE_UPDATE);
                format2.getClass();
                objJ2 = bVar2.j(this.f113236g, format2, this.f113238i, f61810d, listC, this.f113239j, this);
            } else {
                com.garmin.device.filetransfer.b bVar3 = aVar2.f50730f;
                if (bVar3 == null) {
                    p005kotlin.jvm.internal.s.m("protobuf");
                    throw null;
                }
                long f61810d2 = bVar.getF126459l();
                List listC2 = com.garmin.device.filetransfer.a.c(aVar2);
                this.f113230a = 2;
                if (p005kotlin.jvm.internal.s.g(str2, "CounterByteTest")) {
                    format = GDIFileAccess.DataType.newBuilder().setFormat(GDIFileAccess.DataType.Format.SPECIAL_CASE).setSpecialCase(GDIFileAccess.DataType.SpecialCase.COUNTER_BYTE_TEST);
                } else {
                    if (p005kotlin.jvm.internal.s.g(str2, "GDXml")) {
                        throw new FileTransferException("Write Garmin Device XML not supported", null, 2, null);
                    }
                    format = d53.u.y(str2, "AD_HOC_", false) ? GDIFileAccess.DataType.newBuilder().setFormat(GDIFileAccess.DataType.Format.DATA_XFER) : GDIFileAccess.DataType.newBuilder().setFormat(GDIFileAccess.DataType.Format.GDXML_DATA_TYPE).setGdxmlString(str2);
                }
                GDIFileAccess.DataType.Builder builder = format;
                builder.getClass();
                objJ = bVar3.j(this.f113236g, builder, this.f113238i, f61810d2, listC2, this.f113239j, this);
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            objJ2 = obj;
            a0Var = (a0) objJ2;
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objJ = obj;
            a0Var = (a0) objJ;
        }
        Long l14 = a0Var.f113160c;
        if (l14 == null) {
            throw new FileTransferException(tn.k.g(str, " failed: Device did not include an offset"), null, 2, null);
        }
        if (l14.longValue() < bVar.getF126459l()) {
            Integer num = a0Var.f113161d;
            if (num != null) {
                this.f113240k.f105810a = new nk2.a(this.f113231b, num.intValue(), 0, 4, null);
            }
            return a0Var;
        }
        Logger logger = aVar2.f50729e;
        if (logger == null) {
            p005kotlin.jvm.internal.s.m("logger");
            throw null;
        }
        logger.info(str + ": Partial item on device is larger than input item (" + a0Var.f113160c + " >= " + bVar.getF126459l() + ").");
        throw new ItemAccessException(GDIFileAccess.ItemAccessResult.INVALID_OFFSET, "Write failed: Offset is larger than input");
    }
}
