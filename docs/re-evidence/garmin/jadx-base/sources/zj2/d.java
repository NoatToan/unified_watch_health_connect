package zj2;

import ch.qos.logback.core.CoreConstants;
import com.garmin.device.datatransfer.DataTransferException;
import com.garmin.device.filetransfer.adhoc.AdHocException;
import com.garmin.gfdi.protobuf.ProtobufException;
import com.garmin.proto.generated.GDIDataTransferProto;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.ByteString;
import e23.p;
import java.util.UUID;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import lk2.y;
import o13.r;
import o53.s;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u001c\b\u0002\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lzj2/d;", "Lmk2/c;", "", "transferId", "", "data", "", "timeout", "Lcz2/a;", "clock", "Lkotlin/Function2;", "", "progress", "", "sourceFeature", "Lmk2/a;", "defaultLatency", "<init>", "(I[BJLcz2/a;Le23/p;Ljava/lang/String;Lmk2/a;)V", "data-transfer_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d implements mk2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f204956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cz2.a f204957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p<Integer, Integer, Unit> f204958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f204959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final mk2.a f204960e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Logger f204961f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final cz2.g<Unit> f204962g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public UUID f204963h;

    /* JADX WARN: Multi-variable type inference failed */
    public d(int i14, byte[] bArr, long j8, cz2.a aVar, p<? super Integer, ? super Integer, Unit> pVar, String str, mk2.a aVar2) {
        bArr.getClass();
        aVar.getClass();
        this.f204956a = bArr;
        this.f204957b = aVar;
        this.f204958c = pVar;
        this.f204959d = str;
        this.f204960e = aVar2;
        StringBuilder sb3 = new StringBuilder("DT#DataDownloadTask[");
        sb3.append(i14);
        sb3.append(str != null ? fb1.c.n("-", str) : "");
        sb3.append(']');
        this.f204961f = LoggerFactory.getLogger(sb3.toString());
        this.f204962g = new cz2.g<>(j8, aVar);
    }

    @Override // mk2.c
    public final void a(AdHocException adHocException) {
        cz2.g<Unit> gVar = this.f204962g;
        Logger logger = this.f204961f;
        if (adHocException == null) {
            logger.debug("onComplete()");
            gVar.b(Unit.INSTANCE);
            return;
        }
        logger.warn("onComplete(" + adHocException.getMessage() + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String message = adHocException.getMessage();
        if (message == null) {
            message = "Ad Hoc transfer failed";
        }
        Throwable cause = adHocException.getCause();
        if (cause != null) {
            adHocException = cause;
        }
        DataTransferException dataTransferException = new DataTransferException(message, adHocException);
        gVar.getClass();
        gVar.f56901e.O(dataTransferException);
    }

    @Override // mk2.c
    public final void b(AdHocException adHocException) {
        this.f204961f.warn("onInterrupt(" + adHocException.getMessage() + CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Override // mk2.c
    public final void c(long j8) {
        p<Integer, Integer, Unit> pVar = this.f204958c;
        if (pVar != null) {
            pVar.invoke(Integer.valueOf((int) j8), Integer.valueOf(this.f204956a.length));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object d(GDIDataTransferProto.DataDownloadRequest dataDownloadRequest, dt2.k kVar, v13.c cVar) {
        a aVar;
        d dVar;
        GDIDataTransferProto.DataDownloadResponse.Builder builder;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i14 = aVar.f204943e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f204943e = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        Object obj = aVar.f204941c;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f204943e;
        if (i15 == 0) {
            r.b(obj);
            cz2.g<Unit> gVar = this.f204962g;
            AtomicLong atomicLong = gVar.f56899c;
            s sVar = gVar.f56901e;
            atomicLong.set(gVar.f56898b.millis());
            GDIDataTransferProto.DataDownloadResponse.Builder offset = GDIDataTransferProto.DataDownloadResponse.newBuilder().setId(dataDownloadRequest.getId()).setOffset(dataDownloadRequest.getOffset());
            boolean zIsActive = sVar.isActive();
            Logger logger = this.f204961f;
            if (zIsActive) {
                int offset2 = dataDownloadRequest.getOffset();
                byte[] bArr = this.f204956a;
                if (offset2 == 0 && bArr.length == 0) {
                    logger.debug("Data is empty");
                    offset.setStatus(GDIDataTransferProto.DataDownloadResponse.Status.SUCCESS);
                    offset.setPayload(ByteString.EMPTY);
                } else if (dataDownloadRequest.getOffset() < 0 || dataDownloadRequest.getOffset() >= bArr.length) {
                    String str = "Received data download request with invalid offset: " + dataDownloadRequest.getOffset();
                    logger.debug(str);
                    sVar.O(new DataTransferException(str, null, 2, 0 == true ? 1 : 0));
                    offset.setStatus(GDIDataTransferProto.DataDownloadResponse.Status.INVALID_OFFSET);
                } else {
                    logger.debug("Received data download request: offset=" + dataDownloadRequest.getOffset());
                    int iMin = Math.min(bArr.length - dataDownloadRequest.getOffset(), dataDownloadRequest.getMaxChunkSize());
                    offset.setStatus(GDIDataTransferProto.DataDownloadResponse.Status.SUCCESS);
                    if (iMin == 0) {
                        offset.setPayload(ByteString.EMPTY);
                    } else {
                        offset.setPayload(ByteString.copyFrom(bArr, dataDownloadRequest.getOffset(), iMin));
                    }
                }
            } else {
                logger.debug("Transfer already ended. Aborting");
                offset.setStatus(GDIDataTransferProto.DataDownloadResponse.Status.INVALID_ID);
            }
            GDISmartProto.Smart smartA = qu2.a.a(GDIDataTransferProto.DataTransferService.newBuilder().setDataDownloadResponse(offset));
            smartA.getClass();
            try {
                aVar.f204939a = this;
                aVar.f204940b = offset;
                aVar.f204943e = 1;
                if (kVar.a(smartA, aVar) == obj2) {
                    return obj2;
                }
                dVar = this;
                builder = offset;
            } catch (ProtobufException e4) {
                e = e4;
                dVar = this;
                dVar.f204961f.error("Failed to send data download response", (Throwable) e);
                cz2.g<Unit> gVar2 = dVar.f204962g;
                DataTransferException dataTransferException = new DataTransferException("Failed to send data download response", e);
                gVar2.getClass();
                gVar2.f56901e.O(dataTransferException);
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            builder = aVar.f204940b;
            dVar = aVar.f204939a;
            try {
                r.b(obj);
            } catch (ProtobufException e14) {
                e = e14;
                dVar.f204961f.error("Failed to send data download response", (Throwable) e);
                cz2.g<Unit> gVar3 = dVar.f204962g;
                DataTransferException dataTransferException2 = new DataTransferException("Failed to send data download response", e);
                gVar3.getClass();
                gVar3.f56901e.O(dataTransferException2);
            }
        }
        p<Integer, Integer, Unit> pVar = dVar.f204958c;
        byte[] bArr2 = dVar.f204956a;
        if (pVar != null) {
            pVar.invoke(new Integer(builder.getOffset() + builder.getPayload().size()), new Integer(bArr2.length));
        }
        if (builder.getOffset() + builder.getPayload().size() == bArr2.length) {
            dVar.f204961f.debug("transfer complete");
            dVar.f204962g.b(Unit.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(GDIDataTransferProto.FileAccessItemRequest fileAccessItemRequest, mk2.d dVar, dt2.k kVar, v13.c cVar) {
        b bVar;
        UUID uuid;
        mk2.d dVar2;
        GDIDataTransferProto.FileAccessItemResponse.Builder builder;
        ProtobufException e4;
        d dVar3;
        mk2.a aVar;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i14 = bVar.f204951h;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f204951h = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object obj = bVar.f204949f;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f204951h;
        if (i15 == 0) {
            r.b(obj);
            this.f204962g.f56900d.set(true);
            GDIDataTransferProto.FileAccessItemResponse.Builder dataXferId = GDIDataTransferProto.FileAccessItemResponse.newBuilder().setDataXferId(fileAccessItemRequest.getDataXferId());
            synchronized (this) {
                uuid = this.f204963h;
                if (uuid == null) {
                    mk2.b.a aVar2 = mk2.b.f119189e;
                    Long l14 = new Long(fileAccessItemRequest.getDataXferId());
                    cz2.a aVar3 = this.f204957b;
                    aVar2.getClass();
                    aVar3.getClass();
                    long jLongValue = l14.longValue();
                    h23.c.f81216a.getClass();
                    uuid = new UUID(jLongValue, h23.c.f81217b.e());
                    this.f204963h = uuid;
                }
            }
            boolean zIsActive = this.f204962g.f56901e.isActive();
            Logger logger = this.f204961f;
            if (zIsActive) {
                logger.debug("Received file access download request");
                dataXferId.setStatus(GDIDataTransferProto.FileAccessItemResponse.Status.OK);
                dataXferId.setFileAccessItemUid(y.b(uuid));
            } else {
                logger.debug("Transfer already ended. Aborting");
                dataXferId.setStatus(GDIDataTransferProto.FileAccessItemResponse.Status.INVALID_ID);
            }
            GDISmartProto.Smart smartA = qu2.a.a(GDIDataTransferProto.DataTransferService.newBuilder().setFileAccessItemResponse(dataXferId));
            smartA.getClass();
            try {
                bVar.f204944a = this;
                bVar.f204945b = fileAccessItemRequest;
                bVar.f204946c = dVar;
                bVar.f204947d = dataXferId;
                bVar.f204948e = uuid;
                bVar.f204951h = 1;
                if (kVar.a(smartA, bVar) == obj2) {
                    return obj2;
                }
                dVar3 = this;
                dVar2 = dVar;
                builder = dataXferId;
            } catch (ProtobufException e14) {
                dVar2 = dVar;
                builder = dataXferId;
                e4 = e14;
                dVar3 = this;
                dVar3.f204961f.error("Failed to send data download response", (Throwable) e4);
                cz2.g<Unit> gVar = dVar3.f204962g;
                DataTransferException dataTransferException = new DataTransferException("Failed to send file access download response", e4);
                gVar.getClass();
                gVar.f56901e.O(dataTransferException);
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            UUID uuid2 = bVar.f204948e;
            builder = bVar.f204947d;
            dVar2 = bVar.f204946c;
            GDIDataTransferProto.FileAccessItemRequest fileAccessItemRequest2 = bVar.f204945b;
            dVar3 = bVar.f204944a;
            try {
                r.b(obj);
                uuid = uuid2;
                fileAccessItemRequest = fileAccessItemRequest2;
            } catch (ProtobufException e15) {
                e4 = e15;
                uuid = uuid2;
                fileAccessItemRequest = fileAccessItemRequest2;
                dVar3.f204961f.error("Failed to send data download response", (Throwable) e4);
                cz2.g<Unit> gVar2 = dVar3.f204962g;
                DataTransferException dataTransferException2 = new DataTransferException("Failed to send file access download response", e4);
                gVar2.getClass();
                gVar2.f56901e.O(dataTransferException2);
            }
        }
        if (builder.getStatus() == GDIDataTransferProto.FileAccessItemResponse.Status.OK) {
            try {
                if (fileAccessItemRequest.hasExpectedLatency()) {
                    mk2.a.C2267a c2267a = mk2.a.f119182a;
                    GDIDataTransferProto.FileAccessItemRequest.Latency expectedLatency = fileAccessItemRequest.getExpectedLatency();
                    expectedLatency.getClass();
                    c2267a.getClass();
                    int i16 = mk2.a.C2267a.C2268a.f119188a[expectedLatency.ordinal()];
                    if (i16 == 1) {
                        aVar = mk2.a.SOON;
                    } else if (i16 != 2) {
                        aVar = i16 != 3 ? mk2.a.STANDARD : mk2.a.DURING_ACTIVITY;
                    } else {
                        aVar = mk2.a.IMMEDIATE;
                    }
                } else {
                    aVar = dVar3.f204960e;
                    if (aVar == null) {
                        aVar = mk2.a.STANDARD;
                    }
                }
                Long l15 = new Long(fileAccessItemRequest.getDataXferId());
                String str = dVar3.f204959d;
                if (str == null) {
                    str = "";
                }
                dVar2.a(dVar3.f204956a, new mk2.b(uuid, l15, aVar, str), dVar3);
            } catch (Exception e16) {
                dVar3.f204961f.error("Unexpected exception queueing Ad Hoc transfer", (Throwable) e16);
                cz2.g<Unit> gVar3 = dVar3.f204962g;
                DataTransferException dataTransferException3 = new DataTransferException("Unexpected exception queueing Ad Hoc transfer", e16);
                gVar3.getClass();
                gVar3.f56901e.O(dataTransferException3);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(v13.c cVar) throws DataTransferException {
        c cVar2;
        d dVar;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f204955d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f204955d = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object obj = cVar2.f204953b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f204955d;
        if (i15 != 0) {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dVar = cVar2.f204952a;
            try {
                r.b(obj);
                return Unit.INSTANCE;
            } catch (TimeoutException e4) {
                e = e4;
                dVar.f204961f.debug("transfer timed out");
                throw new DataTransferException("transfer timed out", e);
            }
        }
        r.b(obj);
        this.f204961f.debug("Start data transfer: data size = " + this.f204956a.length);
        try {
            cz2.g<Unit> gVar = this.f204962g;
            cVar2.f204952a = this;
            cVar2.f204955d = 1;
            if (gVar.a(cVar2) == aVar) {
                return aVar;
            }
            return Unit.INSTANCE;
        } catch (TimeoutException e14) {
            e = e14;
            dVar = this;
            dVar.f204961f.debug("transfer timed out");
            throw new DataTransferException("transfer timed out", e);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d(int i14, byte[] bArr, long j8, cz2.a aVar, p pVar, String str, mk2.a aVar2, int i15, p005kotlin.jvm.internal.j jVar) {
        cz2.a aVar3;
        long j14 = (i15 & 4) != 0 ? 30000L : j8;
        if ((i15 & 8) != 0) {
            cz2.a.f56879a.getClass();
            aVar3 = cz2.a.C1219a.f56881b;
        } else {
            aVar3 = aVar;
        }
        this(i14, bArr, j14, aVar3, (i15 & 16) != 0 ? null : pVar, (i15 & 32) != 0 ? null : str, (i15 & 64) != 0 ? null : aVar2);
    }
}
