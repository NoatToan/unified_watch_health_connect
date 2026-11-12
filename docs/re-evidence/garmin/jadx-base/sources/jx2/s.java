package jx2;

import android.os.SystemClock;
import com.garmin.proto.generated.GDIGarminHealth;
import com.garmin.samd.exception.GHSDuplicateUploadException;
import com.garmin.samd.exception.GHSFitFileTypeUnsupportedException;
import com.garmin.samd.exception.GHSInvalidFITArchiveException;
import com.garmin.samd.exception.GHSInvalidFITFileException;
import com.garmin.samd.exception.GHSSaMDIdMismatchException;
import com.garmin.samd.exception.GHSServerException;
import com.garmin.samd.exception.InvalidFileTransferProtobufRequestException;
import com.garmin.samd.exception.NetworkException;
import com.garmin.samd.exception.UserDoesNotConsentToUploadException;
import com.garmin.samd.repository.UnexpectedResponseCodeException;
import i3.e5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import o53.a0;
import o53.b0;
import o53.c0;
import o53.z;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.x;
import p13.y;
import v.e0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Ljx2/s;", "Ljx2/a;", "Lrs2/c;", "deviceInfo", "<init>", "(Lrs2/c;)V", "a", "b", "SaMD_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class s extends jx2.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static long f101615g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f101616h = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rs2.c f101617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f101618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference<kx2.f> f101619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f101620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile b f101621f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljx2/s$b;", "", "<init>", "(Ljava/lang/String;I)V", "SaMD_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum b {
        IDLE,
        PRECHECK,
        UPLOAD,
        UPLOAD_STATUS_CHECK
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f101627a;

        static {
            int[] iArr = new int[kx2.g.values().length];
            try {
                iArr[kx2.g.f107144b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f101627a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
    @v13.e(c = "com.garmin.samd.manager.SaMDFileTransferManager$notifyApp$1", f = "SaMDFileTransferManager.kt", l = {}, m = "invokeSuspend")
    public static final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Throwable f101628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s f101629b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ kx2.g f101630c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f101631d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ GDIGarminHealth.FileTransferRequest.FileType f101632e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ GDIGarminHealth.FileTransferRequest.ContentType f101633f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f101634g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f101635h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Integer f101636i;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f101637a;

            static {
                int[] iArr = new int[kx2.g.values().length];
                try {
                    iArr[kx2.g.f107150h.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f101637a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Throwable th3, s sVar, kx2.g gVar, String str, GDIGarminHealth.FileTransferRequest.FileType fileType, GDIGarminHealth.FileTransferRequest.ContentType contentType, boolean z14, int i14, Integer num, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f101628a = th3;
            this.f101629b = sVar;
            this.f101630c = gVar;
            this.f101631d = str;
            this.f101632e = fileType;
            this.f101633f = contentType;
            this.f101634g = z14;
            this.f101635h = i14;
            this.f101636i = num;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f101628a, this.f101629b, this.f101630c, this.f101631d, this.f101632e, this.f101633f, this.f101634g, this.f101635h, this.f101636i, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0021  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            kx2.g gVar;
            kx2.g gVar2;
            Unit unit;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            s sVar = this.f101629b;
            Throwable th3 = this.f101628a;
            Throwable thG = th3 != null ? sVar.g(th3) : null;
            int[] iArr = a.f101637a;
            kx2.g gVar3 = this.f101630c;
            if (iArr[gVar3.ordinal()] == 1 || thG == null) {
                gVar2 = gVar3;
            } else {
                int i14 = s.f101616h;
                sVar.getClass();
                if (thG instanceof GHSDuplicateUploadException) {
                    gVar = kx2.g.f107144b;
                } else if (thG instanceof GHSFitFileTypeUnsupportedException) {
                    gVar = kx2.g.f107146d;
                } else if (thG instanceof UserDoesNotConsentToUploadException) {
                    gVar = kx2.g.f107147e;
                } else {
                    if (thG instanceof GHSInvalidFITFileException ? true : thG instanceof GHSInvalidFITArchiveException) {
                        gVar = kx2.g.f107145c;
                    } else if (thG instanceof GHSServerException) {
                        gVar = kx2.g.f107152j;
                    } else if (thG instanceof NetworkException) {
                        gVar = kx2.g.f107153k;
                    } else {
                        gVar = thG instanceof GHSSaMDIdMismatchException ? kx2.g.f107151i : kx2.g.f107155m;
                    }
                }
                if (gVar != null) {
                    gVar2 = gVar;
                } else {
                    gVar2 = gVar3;
                }
            }
            kx2.e eVar = new kx2.e(gVar2, this.f101632e, sVar.f101620e, this.f101633f, sVar.f101617b, gVar3 == kx2.g.f107144b ? this.f101631d : null, null, null, null, 448, null);
            boolean z14 = this.f101634g;
            if (z14) {
                eVar.f107138g = new Integer(this.f101635h);
                eVar.f107139h = this.f101636i;
                eVar.f107140i = sVar.f101619d.getAndSet(new kx2.f(null, null, null, 7, null));
            }
            try {
                gx2.a aVarC = jx2.a.c();
                if (aVarC != null) {
                    aVarC.c(eVar);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    sVar.e("notifyApp -> app delegate is null", null);
                }
            } catch (Exception unused) {
            }
            if (z14) {
                try {
                    new hx2.b(hx2.a.FILE_TRANSFER).f(eVar, thG);
                } catch (Exception e4) {
                    sVar.e("notifyApp -> recordAnalyticFileTransfer", e4);
                }
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
        f101615g = -1L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(rs2.c cVar) {
        super(org.apache.commons.lang3.e.e(cVar.getF92746j(), "FileTransferManager_"));
        cVar.getClass();
        this.f101617b = cVar;
        this.f101619d = new AtomicReference<>();
        this.f101621f = b.IDLE;
    }

    public static final void i(s sVar, long j8, long j14) {
        AtomicReference<kx2.f> atomicReference = sVar.f101619d;
        kx2.f fVar = atomicReference.get();
        if (fVar == null) {
            fVar = new kx2.f(null, null, null, 7, null);
        }
        fVar.b(Long.valueOf(j14 - j8));
        atomicReference.set(fVar);
    }

    public static boolean k(gx2.a aVar) {
        if (f101615g < 0 || SystemClock.elapsedRealtime() - f101615g >= 900000) {
            try {
                f101615g = rx2.b.a(aVar.f()).f115276a ? SystemClock.elapsedRealtime() : -1L;
            } catch (UnexpectedResponseCodeException unused) {
                f101615g = -1L;
            }
        }
        return f101615g > 0;
    }

    public static /* synthetic */ void m(s sVar, boolean z14, Integer num, GDIGarminHealth.FileTransferRequest.FileType fileType, GDIGarminHealth.FileTransferRequest.ContentType contentType, kx2.g gVar, Throwable th3, int i14) {
        if ((i14 & 1) != 0) {
            z14 = false;
        }
        sVar.l(z14, 0, (i14 & 4) != 0 ? null : num, fileType, contentType, (i14 & 32) != 0 ? kx2.g.f107154l : gVar, null, (i14 & 128) != 0 ? null : th3);
    }

    public static Object p(zj2.e eVar, GDIGarminHealth.FileTransferRequest fileTransferRequest, px2.l lVar, px2.i iVar) throws InvalidFileTransferProtobufRequestException {
        if (!fileTransferRequest.hasXferData()) {
            vb.h.s("request does not have 'xfer_data'. Should be calling performInitialUpload");
            return null;
        }
        if (eVar == null) {
            throw new InvalidFileTransferProtobufRequestException("Device set XferData without app sending XFER_DATA capability");
        }
        q(fileTransferRequest);
        return eVar.c(fileTransferRequest.getXferData().getId(), fileTransferRequest.getXferData().getSize(), new w(lVar), "SAMD", iVar);
    }

    public static void q(GDIGarminHealth.FileTransferRequest fileTransferRequest) throws InvalidFileTransferProtobufRequestException {
        fileTransferRequest.getClass();
        if (!fileTransferRequest.hasXferData() && fileTransferRequest.getFileDataList().isEmpty() && !fileTransferRequest.hasRawBytes()) {
            throw new InvalidFileTransferProtobufRequestException("either 'raw_bytes', 'xfer_data', or 'file_data' must be set");
        }
        if (fileTransferRequest.hasRawBytes() && fileTransferRequest.getRawBytes().isEmpty()) {
            throw new InvalidFileTransferProtobufRequestException("'raw_bytes' is set, but is empty");
        }
        if (fileTransferRequest.hasXferData() && (!fileTransferRequest.getXferData().hasId() || !fileTransferRequest.getXferData().hasSize())) {
            throw new InvalidFileTransferProtobufRequestException("'xfer_data' is set, but is missing id or size");
        }
        List<GDIGarminHealth.FileTransferRequest.FileData> fileDataList = fileTransferRequest.getFileDataList();
        fileDataList.getClass();
        if (!fileDataList.isEmpty()) {
            List<GDIGarminHealth.FileTransferRequest.FileData> fileDataList2 = fileTransferRequest.getFileDataList();
            fileDataList2.getClass();
            int i14 = 0;
            for (Object obj : fileDataList2) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    x.q();
                    throw null;
                }
                GDIGarminHealth.FileTransferRequest.FileData fileData = (GDIGarminHealth.FileTransferRequest.FileData) obj;
                if (!fileData.hasData()) {
                    throw new InvalidFileTransferProtobufRequestException(e0.f(i14, "'file_data' is set, but idx [", "] is missing 'data' content"));
                }
                if (fileData.getData().isEmpty()) {
                    throw new InvalidFileTransferProtobufRequestException(e0.f(i14, "'file_data' is set, but idx [", "] 'data' is empty"));
                }
                i14 = i15;
            }
        }
        if (!fileTransferRequest.hasContentType()) {
            throw new InvalidFileTransferProtobufRequestException("'contentType' not set");
        }
        if (!fileTransferRequest.hasFileType()) {
            throw new InvalidFileTransferProtobufRequestException("'fileType' not set");
        }
        if (!fileTransferRequest.hasFileName()) {
            throw new InvalidFileTransferProtobufRequestException("'fileName' not set");
        }
    }

    public final void j(boolean z14, int i14, Integer num, long j8, String str, GDIGarminHealth.FileTransferRequest fileTransferRequest, kx2.g gVar, ox2.d.b bVar) {
        kx2.f fVar = this.f101619d.get();
        fVar.d(Long.valueOf(SystemClock.elapsedRealtime() - j8));
        this.f101619d.set(fVar);
        this.f101621f = b.IDLE;
        String strO = am.j.o("\n", bVar.toString(), e5.l(fileTransferRequest.getFileType().name(), " %s ", str, StringUtils.SPACE, gVar.name()));
        if (c.f101627a[gVar.ordinal()] == 1) {
            d().debug(String.format(strO, Arrays.copyOf(new Object[]{"externalId"}, 1)));
        } else {
            f(null, String.format(strO, Arrays.copyOf(new Object[]{"uploadId"}, 1)));
        }
        Exception exc = null;
        GDIGarminHealth.FileTransferRequest.FileType fileType = fileTransferRequest.getFileType();
        fileType.getClass();
        GDIGarminHealth.FileTransferRequest.ContentType contentType = fileTransferRequest.getContentType();
        contentType.getClass();
        if (z14) {
            exc = new Exception(String.valueOf(bVar));
        }
        l(true, i14, num, fileType, contentType, gVar, str, exc);
    }

    public final void l(boolean z14, int i14, Integer num, GDIGarminHealth.FileTransferRequest.FileType fileType, GDIGarminHealth.FileTransferRequest.ContentType contentType, kx2.g gVar, String str, Throwable th3) {
        gVar.getClass();
        gx2.b.f80060a.getClass();
        ge1.b.T(c0.a(((z) gx2.b.f80065f.getValue()).plus(new a0("SaMDFileTransferManager.notifyApp")).plus(ge1.b.h())), null, null, new d(th3, this, gVar, str, fileType, contentType, z14, i14, num, null), 3);
    }

    public final byte[] n(GDIGarminHealth.FileTransferRequest fileTransferRequest) {
        byte[] byteArray;
        fileTransferRequest.getClass();
        StringBuilder sb3 = new StringBuilder("parseFileBytes:");
        if (!fileTransferRequest.hasRawBytes() || fileTransferRequest.getRawBytes().isEmpty()) {
            int i14 = 0;
            byte[] bArrQ = new byte[0];
            List<GDIGarminHealth.FileTransferRequest.FileData> fileDataList = fileTransferRequest.getFileDataList();
            fileDataList.getClass();
            ArrayList arrayList = new ArrayList(y.r(fileDataList, 10));
            Iterator<T> it = fileDataList.iterator();
            while (it.hasNext()) {
                arrayList.add(((GDIGarminHealth.FileTransferRequest.FileData) it.next()).getData().toByteArray());
            }
            for (Object obj : arrayList) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    x.q();
                    throw null;
                }
                byte[] bArr = (byte[]) obj;
                sb3.append(am.j.g(i14, bArr.length, " [request.fileData(", ").data size ", "]"));
                bArrQ = p13.s.q(bArrQ, bArr);
                i14 = i15;
            }
            sb3.append(" [total size " + bArrQ.length + " bytes]");
            byteArray = bArrQ;
        } else {
            sb3.append("[request.rawBytes]");
            byteArray = fileTransferRequest.getRawBytes().toByteArray();
            byteArray.getClass();
        }
        this.f101620e = byteArray.length;
        d().debug(sb3.toString());
        return byteArray;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:32:0x0115  */
    /* JADX WARN: Code duplicated, block: B:39:0x017c  */
    /* JADX WARN: Code duplicated, block: B:44:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:50:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:52:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:57:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:65:0x0224  */
    /* JADX WARN: Code duplicated, block: B:67:0x0228  */
    /* JADX WARN: Code duplicated, block: B:86:0x00d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x01b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f8 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v24, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v16, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v2, types: [T, java.lang.String] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x017c -> B:16:0x004c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0253 -> B:24:0x00cd). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @android.annotation.SuppressLint({"VisibleForTests"})
    public final java.lang.Object o(com.garmin.proto.generated.GDIGarminHealth.FileTransferRequest r31, ox2.c r32, v13.c r33) {
        /*
            Method dump skipped, instruction units count: 631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jx2.s.o(com.garmin.proto.generated.GDIGarminHealth$FileTransferRequest, ox2.c, v13.c):java.lang.Object");
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Ljx2/s$a;", "", "<init>", "()V", "", "MAX_STATUS_CHECKS", "I", "", "SYNC_SERVER_AVAILABILITY_THRESHOLD_MILLIS", "J", "lastSyncServerAvailableTimestamp", "SaMD_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
