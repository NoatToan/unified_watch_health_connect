package zj2;

import com.garmin.device.datatransfer.DataTransferException;
import com.garmin.gfdi.protobuf.ProtobufException;
import com.garmin.proto.generated.GDIDataTransferExtension;
import com.garmin.proto.generated.GDIDataTransferProto;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.GeneratedMessage;
import e23.p;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import o13.r;
import o53.s;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u001c\b\u0002\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lzj2/l;", "", "", "transferId", "Ldt2/g;", "messenger", "expectedSize", "", "timeout", "Lcz2/a;", "clock", "Lkotlin/Function2;", "", "progress", "", "sourceFeature", "<init>", "(ILdt2/g;IJLcz2/a;Le23/p;Ljava/lang/String;)V", "data-transfer_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f205022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dt2.g f205023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f205024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p<Integer, Integer, Unit> f205025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Logger f205026e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final cz2.g<byte[]> f205027f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ByteArrayOutputStream f205028g;

    /* JADX WARN: Multi-variable type inference failed */
    public l(int i14, dt2.g gVar, int i15, long j8, cz2.a aVar, p<? super Integer, ? super Integer, Unit> pVar, String str) {
        gVar.getClass();
        aVar.getClass();
        this.f205022a = i14;
        this.f205023b = gVar;
        this.f205024c = i15;
        this.f205025d = pVar;
        StringBuilder sb3 = new StringBuilder("DT#DataUploadTask[");
        sb3.append(i14);
        sb3.append(str != null ? "-".concat(str) : "");
        sb3.append(']');
        this.f205026e = LoggerFactory.getLogger(sb3.toString());
        this.f205027f = new cz2.g<>(j8, aVar);
        this.f205028g = new ByteArrayOutputStream();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(GDIDataTransferProto.DataUploadRequest dataUploadRequest, dt2.k kVar, v13.c cVar) throws IOException {
        j jVar;
        GDIDataTransferProto.DataUploadResponse.Status status;
        l lVar;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i14 = jVar.f205017d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f205017d = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object obj = jVar.f205015b;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f205017d;
        if (i15 == 0) {
            r.b(obj);
            cz2.g<byte[]> gVar = this.f205027f;
            AtomicLong atomicLong = gVar.f56899c;
            s sVar = gVar.f56901e;
            atomicLong.set(gVar.f56898b.millis());
            boolean zIsActive = sVar.isActive();
            Logger logger = this.f205026e;
            if (zIsActive) {
                int offset = dataUploadRequest.getOffset();
                ByteArrayOutputStream byteArrayOutputStream = this.f205028g;
                if (offset != byteArrayOutputStream.size()) {
                    String str = "Received data upload request with invalid offset: " + dataUploadRequest.getOffset() + " != " + byteArrayOutputStream.size();
                    logger.debug(str);
                    sVar.O(new DataTransferException(str, null, 2, null));
                    status = GDIDataTransferProto.DataUploadResponse.Status.INVALID_OFFSET;
                } else {
                    int size = dataUploadRequest.getPayload().size() + byteArrayOutputStream.size();
                    int i16 = this.f205024c;
                    if (size > i16) {
                        logger.debug("Received data upload request with invalid size");
                        sVar.O(new DataTransferException("Received data upload request with invalid size", null, 2, null));
                        status = GDIDataTransferProto.DataUploadResponse.Status.SIZE_MISMATCH;
                    } else {
                        logger.debug("handle data request: offset=" + dataUploadRequest.getOffset() + ", size=" + dataUploadRequest.getPayload().size());
                        byteArrayOutputStream.write(dataUploadRequest.getPayload().toByteArray());
                        p<Integer, Integer, Unit> pVar = this.f205025d;
                        if (pVar != null) {
                            pVar.invoke(new Integer(byteArrayOutputStream.size()), new Integer(i16));
                        }
                        if (byteArrayOutputStream.size() == i16) {
                            logger.debug("transfer complete");
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            byteArray.getClass();
                            gVar.b(byteArray);
                        }
                        status = GDIDataTransferProto.DataUploadResponse.Status.SUCCESS;
                    }
                }
            } else {
                logger.debug("Transfer already ended. Aborting");
                status = GDIDataTransferProto.DataUploadResponse.Status.ABORT;
            }
            GDISmartProto.Smart smartA = qu2.a.a(GDIDataTransferProto.DataTransferService.newBuilder().setDataUploadResponse(GDIDataTransferProto.DataUploadResponse.newBuilder().setId(dataUploadRequest.getId()).setStatus(status)));
            smartA.getClass();
            try {
                jVar.f205014a = this;
                jVar.f205017d = 1;
                if (kVar.a(smartA, jVar) == obj2) {
                    return obj2;
                }
            } catch (ProtobufException e4) {
                e = e4;
                lVar = this;
                lVar.f205026e.error("Failed to send data upload response", (Throwable) e);
                cz2.g<byte[]> gVar2 = lVar.f205027f;
                DataTransferException dataTransferException = new DataTransferException("Failed to send data upload response", e);
                gVar2.getClass();
                gVar2.f56901e.O(dataTransferException);
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lVar = jVar.f205014a;
            try {
                r.b(obj);
            } catch (ProtobufException e14) {
                e = e14;
                lVar.f205026e.error("Failed to send data upload response", (Throwable) e);
                cz2.g<byte[]> gVar3 = lVar.f205027f;
                DataTransferException dataTransferException2 = new DataTransferException("Failed to send data upload response", e);
                gVar3.getClass();
                gVar3.f56901e.O(dataTransferException2);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0091  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(v13.c cVar) throws DataTransferException {
        k kVar;
        l lVar;
        GDIDataTransferProto.DataTransferService dataTransferService;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i14 = kVar.f205021d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f205021d = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        Object objB = kVar.f205019b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = kVar.f205021d;
        try {
            try {
                if (i15 == 0) {
                    r.b(objB);
                    this.f205026e.debug("Start data transfer: expected size = " + this.f205024c);
                    GDISmartProto.Smart smartA = qu2.a.a(GDIDataTransferProto.DataTransferService.newBuilder().setInitiateDataUploadRequest(GDIDataTransferProto.InitiateDataUploadRequest.newBuilder().setId(this.f205022a)));
                    smartA.getClass();
                    dt2.g gVar = this.f205023b;
                    kVar.f205018a = this;
                    kVar.f205021d = 1;
                    objB = gVar.b(smartA, kVar);
                    if (objB != aVar) {
                        lVar = this;
                    }
                }
                if (i15 != 1) {
                    if (i15 == 2) {
                        r.b(objB);
                        return objB;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                lVar = kVar.f205018a;
                r.b(objB);
                GDISmartProto.Smart smart = (GDISmartProto.Smart) objB;
                if (smart != null) {
                    GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIDataTransferProto.DataTransferService> generatedExtension = GDIDataTransferExtension.dataTransferService;
                    if (smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
                        dataTransferService = (GDIDataTransferProto.DataTransferService) smart.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
                    } else {
                        dataTransferService = null;
                    }
                } else {
                    dataTransferService = null;
                }
                if (dataTransferService == null || !dataTransferService.hasInitiateDataUploadResponse()) {
                    lVar.f205026e.debug("Invalid initiate upload response");
                    throw new DataTransferException("Invalid initiate upload response", null, 2, null);
                }
                GDIDataTransferProto.InitiateDataUploadResponse initiateDataUploadResponse = dataTransferService.getInitiateDataUploadResponse();
                GDIDataTransferProto.InitiateDataUploadResponse.Status status = initiateDataUploadResponse != null ? initiateDataUploadResponse.getStatus() : null;
                if (status == GDIDataTransferProto.InitiateDataUploadResponse.Status.OK) {
                    cz2.g<byte[]> gVar2 = lVar.f205027f;
                    kVar.f205018a = null;
                    kVar.f205021d = 2;
                    Object objA = gVar2.a(kVar);
                    return objA == aVar ? aVar : objA;
                }
                lVar.f205026e.debug("Invalid initiate upload response status: " + status);
                throw new DataTransferException("Invalid initiate upload response status: " + status, null, 2, null);
            } catch (TimeoutException e4) {
                throw new DataTransferException("transfer timed out", e4);
            }
        } catch (Exception e14) {
            throw new DataTransferException("Failed to send protobuf request", e14);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public l(int i14, dt2.g gVar, int i15, long j8, cz2.a aVar, p pVar, String str, int i16, p005kotlin.jvm.internal.j jVar) {
        cz2.a aVar2;
        long j14 = (i16 & 8) != 0 ? 30000L : j8;
        if ((i16 & 16) != 0) {
            cz2.a.f56879a.getClass();
            aVar2 = cz2.a.C1219a.f56881b;
        } else {
            aVar2 = aVar;
        }
        this(i14, gVar, i15, j14, aVar2, (i16 & 32) != 0 ? null : pVar, (i16 & 64) != 0 ? null : str);
    }
}
