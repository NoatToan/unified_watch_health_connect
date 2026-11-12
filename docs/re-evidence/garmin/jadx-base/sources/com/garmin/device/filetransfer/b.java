package com.garmin.device.filetransfer;

import com.garmin.proto.generated.GDIFileAccess;
import com.garmin.proto.generated.GDIFileAccessExtension;
import com.garmin.proto.generated.GDISmartProto;
import dt2.g;
import i3.e5;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import lc.u0;
import lk2.a0;
import lk2.k;
import lk2.l;
import lk2.m;
import lk2.p;
import lk2.q;
import lk2.s;
import lk2.t;
import lk2.y;
import o13.r;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import v13.c;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/device/filetransfer/b;", "", "Ldt2/g;", "messenger", "Lorg/slf4j/Logger;", "logger", "<init>", "(Ldt2/g;Lorg/slf4j/Logger;)V", "a", "file-transfer-device_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f50754c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f50755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Logger f50756b;

    /* JADX INFO: renamed from: com.garmin.device.filetransfer.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C1025b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f50757a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f50758b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f50759c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f50760d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f50761e;

        static {
            int[] iArr = new int[GDIFileAccess.ModifyFlagsResponse.Status.values().length];
            try {
                iArr[GDIFileAccess.ModifyFlagsResponse.Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GDIFileAccess.ModifyFlagsResponse.Status.FAIL_ITEM_NOT_PROVIDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GDIFileAccess.ModifyFlagsResponse.Status.FAIL_ITEM_NOT_FOUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GDIFileAccess.ModifyFlagsResponse.Status.FAIL_FLAGS_NOT_PROVIDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GDIFileAccess.ModifyFlagsResponse.Status.FAIL_MAX_FLAGS_REACHED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[GDIFileAccess.ModifyFlagsResponse.Status.FAIL_OTHER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f50757a = iArr;
            int[] iArr2 = new int[GDIFileAccess.ItemAccessResult.values().length];
            try {
                iArr2[GDIFileAccess.ItemAccessResult.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[GDIFileAccess.ItemAccessResult.ITEM_TYPE_NOT_SUPPORTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[GDIFileAccess.ItemAccessResult.NO_SUPPORTED_TRANSPORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[GDIFileAccess.ItemAccessResult.NO_AVAILABLE_RESOURCES.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[GDIFileAccess.ItemAccessResult.INVALID_PARAMS.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[GDIFileAccess.ItemAccessResult.INTERNAL_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[GDIFileAccess.ItemAccessResult.INVALID_OFFSET.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[GDIFileAccess.ItemAccessResult.AMBIGUOUS_DATA_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[GDIFileAccess.ItemAccessResult.UNKNOWN_ITEM.ordinal()] = 9;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[GDIFileAccess.ItemAccessResult.NO_SPACE.ordinal()] = 10;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[GDIFileAccess.ItemAccessResult.DATA_TYPE_ERROR.ordinal()] = 11;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[GDIFileAccess.ItemAccessResult.CONFLICTING_PUSH_REQUEST.ordinal()] = 12;
            } catch (NoSuchFieldError unused18) {
            }
            f50758b = iArr2;
            int[] iArr3 = new int[GDIFileAccess.DeleteItemResponse.Result.values().length];
            try {
                iArr3[GDIFileAccess.DeleteItemResponse.Result.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[GDIFileAccess.DeleteItemResponse.Result.ITEM_DOES_NOT_EXIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[GDIFileAccess.DeleteItemResponse.Result.ITEM_CANNOT_BE_DELETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[GDIFileAccess.DeleteItemResponse.Result.TRANSFER_IN_PROGRESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[GDIFileAccess.DeleteItemResponse.Result.DELETE_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[GDIFileAccess.DeleteItemResponse.Result.INVALID_PARAMS.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[GDIFileAccess.DeleteItemResponse.Result.OPERATION_NOT_SUPPORTED.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            f50759c = iArr3;
            int[] iArr4 = new int[GDIFileAccess.GetItemChecksumResponse.Result.values().length];
            try {
                iArr4[GDIFileAccess.GetItemChecksumResponse.Result.UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr4[GDIFileAccess.GetItemChecksumResponse.Result.FAIL_ITEM_DOES_NOT_EXIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr4[GDIFileAccess.GetItemChecksumResponse.Result.FAIL_ITEM_SIZE_TOO_LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr4[GDIFileAccess.GetItemChecksumResponse.Result.FAIL_INTERNAL_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr4[GDIFileAccess.GetItemChecksumResponse.Result.FAIL_DEVICE_IS_BUSY.ordinal()] = 5;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr4[GDIFileAccess.GetItemChecksumResponse.Result.SUCCESS.ordinal()] = 6;
            } catch (NoSuchFieldError unused31) {
            }
            f50760d = iArr4;
            int[] iArr5 = new int[GDIFileAccess.CancelTransferResponse.Status.values().length];
            try {
                iArr5[GDIFileAccess.CancelTransferResponse.Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr5[GDIFileAccess.CancelTransferResponse.Status.UNKNOWN_TRANSFER.ordinal()] = 2;
            } catch (NoSuchFieldError unused33) {
            }
            f50761e = iArr5;
        }
    }

    public b(g gVar, Logger logger) {
        gVar.getClass();
        logger.getClass();
        this.f50755a = gVar;
        this.f50756b = logger;
    }

    public static void a(GDIFileAccess.ItemAccessResult itemAccessResult, String str, String str2) throws ItemAccessException {
        switch (C1025b.f50758b[itemAccessResult.ordinal()]) {
            case 1:
                return;
            case 2:
                throw new ItemAccessException(itemAccessResult, e5.g(str, " failed: Data type is not supported ", str2));
            case 3:
                throw new ItemAccessException(itemAccessResult, e5.g(str, " failed: No supported transports in common ", str2));
            case 4:
                throw new ItemAccessException(itemAccessResult, e5.g(str, " failed: Insufficient resources on device ", str2));
            case 5:
                throw new ItemAccessException(itemAccessResult, e5.g(str, " failed: Device failed to process params ", str2));
            case 6:
                throw new ItemAccessException(itemAccessResult, e5.g(str, " failed: Device internal error ", str2));
            case 7:
                throw new ItemAccessException(itemAccessResult, e5.g(str, " failed: Provided offset is invalid ", str2));
            case 8:
                throw new ItemAccessException(itemAccessResult, e5.g(str, " failed: Ambiguous data type. Likely missing dataType gdxml_file_identifier ", str2));
            case 9:
                throw new ItemAccessException(itemAccessResult, e5.g(str, " failed: Provided id doesn't exist ", str2));
            case 10:
                throw new ItemAccessException(itemAccessResult, e5.g(str, " failed: Not enough space on device ", str2));
            case 11:
                throw new ItemAccessException(itemAccessResult, e5.g(str, " failed: Data type error without data type error details ", str2));
            case 12:
                throw new ItemAccessException(itemAccessResult, e5.g(str, " failed: Another app running push with different priority ", str2));
            default:
                throw new ItemAccessException(itemAccessResult, e5.g(str, " failed: Unknown device internal error ", str2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(UUID uuid, int i14, c cVar) throws FileTransferException {
        k kVar;
        b bVar;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i15 = kVar.f113262e;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                kVar.f113262e = i15 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        Object objI = kVar.f113260c;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i16 = kVar.f113262e;
        if (i16 == 0) {
            r.b(objI);
            this.f50756b.debug("Cancelling item " + uuid + " - " + i14);
            GDIFileAccess.Service.Builder cancelTransferRequest = GDIFileAccess.Service.newBuilder().setCancelTransferRequest(GDIFileAccess.CancelTransferRequest.newBuilder().setTransferHandle(i14));
            cancelTransferRequest.getClass();
            kVar.f113258a = this;
            kVar.f113259b = uuid;
            kVar.f113262e = 1;
            objI = i(cancelTransferRequest, "Cancel item", kVar);
            if (objI == obj) {
                return obj;
            }
            bVar = this;
        } else {
            if (i16 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uuid = kVar.f113259b;
            bVar = kVar.f113258a;
            r.b(objI);
        }
        GDIFileAccess.Service service = (GDIFileAccess.Service) objI;
        if (!service.hasCancelTransferResponse()) {
            throw new FileTransferException("Cancel item failed: response is missing cancel item response", null, 2, null);
        }
        GDIFileAccess.CancelTransferResponse cancelTransferResponse = service.getCancelTransferResponse();
        if (!cancelTransferResponse.hasStatus()) {
            throw new FileTransferException("Cancel item failed: Missing result status", null, 2, null);
        }
        GDIFileAccess.CancelTransferResponse.Status status = cancelTransferResponse.getStatus();
        int i17 = status == null ? -1 : C1025b.f50761e[status.ordinal()];
        if (i17 == -1) {
            throw new FileTransferException("Cancel item failed: Null result", null, 2, null);
        }
        if (i17 == 1) {
            bVar.f50756b.debug("Cancel succeeded for item " + uuid);
            return Unit.INSTANCE;
        }
        if (i17 != 2) {
            u0.r();
            return null;
        }
        bVar.f50756b.info("Cancel request did not complete: item " + uuid + " does not exist");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(UUID uuid, c cVar) throws FileTransferException {
        l lVar;
        b bVar;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i14 = lVar.f113266d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f113266d = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        Object objI = lVar.f113264b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = lVar.f113266d;
        if (i15 == 0) {
            r.b(objI);
            this.f50756b.debug("Get checksum for item {}", uuid);
            GDIFileAccess.Service.Builder getItemChecksumRequest = GDIFileAccess.Service.newBuilder().setGetItemChecksumRequest(GDIFileAccess.GetItemChecksumRequest.newBuilder().setUid(y.b(uuid)));
            getItemChecksumRequest.getClass();
            lVar.f113263a = this;
            lVar.f113266d = 1;
            objI = i(getItemChecksumRequest, "Checksum item", lVar);
            if (objI == obj) {
                return obj;
            }
            bVar = this;
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = lVar.f113263a;
            r.b(objI);
        }
        GDIFileAccess.Service service = (GDIFileAccess.Service) objI;
        if (!service.hasGetItemChecksumResponse()) {
            throw new FileTransferException("Checksum failed: response is missing item checksum response", null, 2, null);
        }
        GDIFileAccess.GetItemChecksumResponse getItemChecksumResponse = service.getGetItemChecksumResponse();
        bVar.f50756b.debug("Get checksum response: {}, {}", getItemChecksumResponse.getResult(), new Long(getItemChecksumResponse.getChecksumTruncatedMd5()));
        GDIFileAccess.GetItemChecksumResponse.Result result = getItemChecksumResponse.getResult();
        switch (result == null ? -1 : C1025b.f50760d[result.ordinal()]) {
            case -1:
            case 1:
                throw new FileTransferException("Checksum failed: Response is missing result", null, 2, null);
            case 0:
            default:
                u0.r();
                return null;
            case 2:
            case 3:
                return null;
            case 4:
            case 5:
                throw new FileTransferException("Checksum failed: " + getItemChecksumResponse.getResult(), null, 2, null);
            case 6:
                return new Long(getItemChecksumResponse.getChecksumTruncatedMd5());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(UUID uuid, GDIFileAccess.TransferDirection transferDirection, c cVar) throws FileTransferException {
        m mVar;
        b bVar;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i14 = mVar.f113271e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f113271e = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Object objI = mVar.f113269c;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar.f113271e;
        if (i15 == 0) {
            r.b(objI);
            this.f50756b.debug("Deleting item " + uuid);
            GDIFileAccess.Service.Builder deleteItemRequest = GDIFileAccess.Service.newBuilder().setDeleteItemRequest(GDIFileAccess.DeleteItemRequest.newBuilder().setUid(y.b(uuid)).setDirection(transferDirection));
            deleteItemRequest.getClass();
            mVar.f113267a = this;
            mVar.f113268b = uuid;
            mVar.f113271e = 1;
            objI = i(deleteItemRequest, "Delete item", mVar);
            if (objI == obj) {
                return obj;
            }
            bVar = this;
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uuid = mVar.f113268b;
            bVar = mVar.f113267a;
            r.b(objI);
        }
        GDIFileAccess.Service service = (GDIFileAccess.Service) objI;
        if (!service.hasDeleteItemResponse()) {
            throw new FileTransferException("Delete item failed: response is missing delete item response", null, 2, null);
        }
        GDIFileAccess.DeleteItemResponse deleteItemResponse = service.getDeleteItemResponse();
        if (!deleteItemResponse.hasResult()) {
            throw new FileTransferException("Delete item failed: Missing result", null, 2, null);
        }
        GDIFileAccess.DeleteItemResponse.Result result = deleteItemResponse.getResult();
        switch (result == null ? -1 : C1025b.f50759c[result.ordinal()]) {
            case -1:
                bVar.f50756b.error("Delete failed: Null result");
                throw new FileTransferException("Delete item failed: Null result", null, 2, null);
            case 0:
            default:
                u0.r();
                return null;
            case 1:
                bVar.f50756b.debug("Delete succeeded for item " + uuid);
                return Unit.INSTANCE;
            case 2:
                bVar.f50756b.info("Delete request did not complete: item " + uuid + " does not exist");
                return Unit.INSTANCE;
            case 3:
                bVar.f50756b.error("Delete failed: Item " + uuid + " cannot be deleted");
                throw new FileTransferException("Delete failed: Item cannot be deleted", null, 2, null);
            case 4:
                bVar.f50756b.error("Delete failed: Item " + uuid + " is transferring in another app");
                throw new FileTransferException("Delete failed: Item is transferring in another app", null, 2, null);
            case 5:
                Integer num = deleteItemResponse.hasErrorCode() ? new Integer(deleteItemResponse.getErrorCode()) : null;
                Integer num2 = deleteItemResponse.hasErrorSource() ? new Integer(deleteItemResponse.getErrorSource()) : null;
                bVar.f50756b.error("Delete failed for item at source=" + num2 + ", code=" + num);
                throw new FileTransferException("Delete failed", null, 2, null);
            case 6:
            case 7:
                bVar.f50756b.error("Delete failed: " + result.name());
                throw new FileTransferException(fb1.c.n("Delete failed: ", result.name()), null, 2, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0198 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x017d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:23:0x005e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    /* JADX WARN: Code duplicated, block: B:29:0x0075 A[LOOP:1: B:27:0x006f->B:29:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x008f A[LOOP:2: B:31:0x0089->B:33:0x008f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:47:0x0105 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x0106  */
    /* JADX WARN: Code duplicated, block: B:52:0x0112  */
    /* JADX WARN: Code duplicated, block: B:54:0x0118  */
    /* JADX WARN: Code duplicated, block: B:56:0x0122  */
    /* JADX WARN: Code duplicated, block: B:58:0x012a  */
    /* JADX WARN: Code duplicated, block: B:60:0x0130  */
    /* JADX WARN: Code duplicated, block: B:63:0x013f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0175  */
    /* JADX WARN: Code duplicated, block: B:69:0x0183  */
    /* JADX WARN: Code duplicated, block: B:71:0x018e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0191  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:83:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:88:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:90:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:95:0x0201  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0106 -> B:103:0x010a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object e(lk2.v r14, v13.c r15) {
        /*
            Method dump skipped, instruction units count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.garmin.device.filetransfer.b.e(lk2.v, v13.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(UUID uuid, Collection collection, Collection collection2, c cVar) throws FileTransferException {
        p pVar;
        b bVar;
        String strE;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i14 = pVar.f113282d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                pVar.f113282d = i14 - Integer.MIN_VALUE;
            } else {
                pVar = new p(this, cVar);
            }
        } else {
            pVar = new p(this, cVar);
        }
        Object objI = pVar.f113280b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = pVar.f113282d;
        if (i15 == 0) {
            r.b(objI);
            if (collection.isEmpty() && collection2.isEmpty()) {
                this.f50756b.warn("Skipping modify request. No flags were provided");
                return Unit.INSTANCE;
            }
            GDIFileAccess.ModifyFlagsRequest.Builder builderNewBuilder = GDIFileAccess.ModifyFlagsRequest.newBuilder();
            builderNewBuilder.setUid(y.b(uuid));
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                builderNewBuilder.addSetFlags(y.b((UUID) it.next()));
            }
            Iterator it3 = collection2.iterator();
            while (it3.hasNext()) {
                builderNewBuilder.addClearFlags(y.b((UUID) it3.next()));
            }
            GDIFileAccess.Service.Builder modifyFlagsRequest = GDIFileAccess.Service.newBuilder().setModifyFlagsRequest(builderNewBuilder);
            modifyFlagsRequest.getClass();
            pVar.f113279a = this;
            pVar.f113282d = 1;
            objI = i(modifyFlagsRequest, "Modify files", pVar);
            if (objI == obj) {
                return obj;
            }
            bVar = this;
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = pVar.f113279a;
            r.b(objI);
        }
        GDIFileAccess.Service service = (GDIFileAccess.Service) objI;
        if (!service.hasModifyFlagsResponse()) {
            throw new FileTransferException("Modify flags failed: Response is missing modify flags response", null, 2, null);
        }
        GDIFileAccess.ModifyFlagsResponse modifyFlagsResponse = service.getModifyFlagsResponse();
        if (!modifyFlagsResponse.hasStatus()) {
            throw new FileTransferException("Modify flags failed: Response is missing modify flags status", null, 2, null);
        }
        GDIFileAccess.ModifyFlagsResponse.Status status = modifyFlagsResponse.getStatus();
        switch (status == null ? -1 : C1025b.f50757a[status.ordinal()]) {
            case -1:
                throw new FileTransferException("Modify flags failed: Null status", null, 2, null);
            case 0:
            default:
                u0.r();
                return null;
            case 1:
                return Unit.INSTANCE;
            case 2:
                throw new FileTransferException("Modify flags failed: No uid was provided", null, 2, null);
            case 3:
                throw new FileTransferException("Modify flags failed: Item not found", null, 2, null);
            case 4:
                throw new FileTransferException("Modify flags failed: no flags provided", null, 2, null);
            case 5:
                throw new FileTransferException("Modify flags failed: Maximum flag count has been reached", null, 2, null);
            case 6:
                if (modifyFlagsResponse.hasErrorCode() && modifyFlagsResponse.hasErrorSource()) {
                    strE = tn.k.e(modifyFlagsResponse.getErrorSource(), modifyFlagsResponse.getErrorCode(), "Modify flags failed: source=", ", code=");
                    bVar.f50756b.error(strE);
                } else {
                    strE = "Modify flags failed";
                }
                throw new FileTransferException(strE, null, 2, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(int i14, int i15, c cVar) throws FileTransferException {
        q qVar;
        Serializable serializableI;
        Object obj;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i16 = qVar.f113285c;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                qVar.f113285c = i16 - Integer.MIN_VALUE;
            } else {
                qVar = new q(this, cVar);
            }
        } else {
            qVar = new q(this, cVar);
        }
        Object obj2 = qVar.f113283a;
        Serializable serializable = u13.a.COROUTINE_SUSPENDED;
        int i17 = qVar.f113285c;
        if (i17 == 0) {
            r.b(obj2);
            GDIFileAccess.Service.Builder priorityUpdateRequest = GDIFileAccess.Service.newBuilder().setPriorityUpdateRequest(GDIFileAccess.PriorityUpdateRequest.newBuilder().setTransferHandle(i14).setNewPriority(i15));
            priorityUpdateRequest.getClass();
            qVar.f113285c = 1;
            serializableI = i(priorityUpdateRequest, "Priority update", qVar);
            if (serializableI == serializable) {
                obj = serializableI;
                return serializable;
            }
        } else {
            if (i17 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj2);
            obj = obj2;
        }
        obj = serializableI;
        GDIFileAccess.Service service = (GDIFileAccess.Service) obj;
        int i18 = 2;
        Exception exc = null;
        boolean z14 = false;
        if (!service.hasPriorityUpdateResponse()) {
            throw new FileTransferException("Priority update failed: Response is missing priority update response", null, 2, null);
        }
        GDIFileAccess.PriorityUpdateResponse priorityUpdateResponse = service.getPriorityUpdateResponse();
        if (!priorityUpdateResponse.hasStatus()) {
            throw new PriorityUpdateException("Priority update failed: no status", exc, i18, z14 ? 1 : 0);
        }
        GDIFileAccess.PriorityUpdateResponse.Status status = priorityUpdateResponse.getStatus();
        if (status == GDIFileAccess.PriorityUpdateResponse.Status.SUCCESS) {
            return Unit.INSTANCE;
        }
        status.getClass();
        throw new PriorityUpdateException(status);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object h(UUID uuid, int i14, Long l14, long j8, List list, boolean z14, c cVar) throws FileTransferException {
        lk2.r rVar;
        b bVar;
        boolean z15;
        Integer num;
        if (cVar instanceof lk2.r) {
            rVar = (lk2.r) cVar;
            int i15 = rVar.f113290e;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                rVar.f113290e = i15 - Integer.MIN_VALUE;
            } else {
                rVar = new lk2.r(this, cVar);
            }
        } else {
            rVar = new lk2.r(this, cVar);
        }
        Object objI = rVar.f113288c;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i16 = rVar.f113290e;
        if (i16 == 0) {
            r.b(objI);
            GDIFileAccess.ItemReference.Builder uid = GDIFileAccess.ItemReference.newBuilder().setUid(y.b(uuid));
            com.garmin.device.filetransfer.a.f50723m.getClass();
            if (uuid.equals(com.garmin.device.filetransfer.a.f50724n)) {
                uid.setDataType(GDIFileAccess.DataType.newBuilder().setFormat(GDIFileAccess.DataType.Format.SPECIAL_CASE).setSpecialCase(GDIFileAccess.DataType.SpecialCase.COUNTER_BYTE_TEST).build());
                Logger logger = this.f50756b;
                if (l14 != null) {
                    long jLongValue = l14.longValue();
                    if (jLongValue != -123) {
                        uid.setDataSize(jLongValue);
                    } else {
                        logger.warn("Skipped setting the dataSize for COUNTER_BYTE_TEST special case.");
                    }
                } else {
                    logger.error("File size for read request not set.");
                }
            }
            GDIFileAccess.PullItemDataRequest.Builder offset = GDIFileAccess.PullItemDataRequest.newBuilder().setPriority(i14).setItem(uid).addAllSupportedTransports(k(list)).setOffset(j8);
            if (z14) {
                offset.setRequestedCompressionWindow(15);
            }
            GDIFileAccess.Service.Builder pullItemRequest = GDIFileAccess.Service.newBuilder().setPullItemRequest(offset);
            pullItemRequest.getClass();
            rVar.f113286a = this;
            rVar.f113287b = z14;
            rVar.f113290e = 1;
            objI = i(pullItemRequest, "Read", rVar);
            if (objI == obj) {
                return obj;
            }
            bVar = this;
            z15 = z14;
        } else {
            if (i16 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z15 = rVar.f113287b;
            bVar = rVar.f113286a;
            r.b(objI);
        }
        GDIFileAccess.Service service = (GDIFileAccess.Service) objI;
        if (!service.hasPullItemResponse()) {
            throw new FileTransferException("Read failed: Response is missing pull item response", null, 2, null);
        }
        GDIFileAccess.PullItemDataResponse pullItemResponse = service.getPullItemResponse();
        if (!pullItemResponse.hasResult()) {
            throw new FileTransferException("Read failed: Pull item response is missing result", null, 2, null);
        }
        StringBuilder sb3 = new StringBuilder();
        if (pullItemResponse.hasFilePath() || pullItemResponse.hasErrorCode() || pullItemResponse.hasErrorSource()) {
            StringBuilder sb4 = new StringBuilder("Device read error details: ");
            if (pullItemResponse.hasFilePath()) {
                String str = "path " + pullItemResponse.getFilePath() + ", ";
                sb4.append(str);
                sb3.append(str);
            }
            if (pullItemResponse.hasErrorCode()) {
                String str2 = "code " + pullItemResponse.getErrorCode() + ", ";
                sb4.append(str2);
                sb3.append(str2);
            }
            if (pullItemResponse.hasErrorSource()) {
                String str3 = "source " + pullItemResponse.getErrorSource() + ", ";
                sb4.append(str3);
                sb3.append(str3);
            }
            bVar.f50756b.error(sb4.toString());
        }
        if (pullItemResponse.getResult() == GDIFileAccess.ItemAccessResult.DATA_TYPE_ERROR && pullItemResponse.hasDataSpecificErrorSource() && pullItemResponse.hasDataSpecificErrorCode()) {
            throw new DataTypeSpecificException(pullItemResponse.getDataSpecificErrorSource(), pullItemResponse.getDataSpecificErrorCode(), "Read failed: ");
        }
        GDIFileAccess.ItemAccessResult result = pullItemResponse.getResult();
        result.getClass();
        String string = sb3.toString();
        bVar.getClass();
        a(result, "Read", string);
        if (!pullItemResponse.hasTransport() || !pullItemResponse.hasTransferHandle()) {
            throw new FileTransferException("Read failed: Pull item response missing ".concat(!pullItemResponse.hasTransport() ? "transport" : "handle"), null, 2, null);
        }
        if (pullItemResponse.hasCompressionWindow()) {
            int compressionWindow = pullItemResponse.getCompressionWindow();
            f50754c.getClass();
            if (9 > compressionWindow || compressionWindow >= 16 || !z15) {
                TransferStatusException.Companion companion = TransferStatusException.INSTANCE;
                String str4 = "Device has invalid pull compression window " + pullItemResponse.getCompressionWindow();
                companion.getClass();
                throw new TransferStatusException(GDIFileAccess.TransferStatusRequest.FailureReason.COMPRESSION_FAILED, str4, null);
            }
            bVar.f50756b.info("Device pull compression window: " + pullItemResponse.getCompressionWindow());
            num = new Integer(pullItemResponse.getCompressionWindow());
        } else {
            num = null;
        }
        return new a0(pullItemResponse.getTransferHandle(), pullItemResponse.getTransport().getNumber(), null, num);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable i(GDIFileAccess.Service.Builder builder, String str, c cVar) throws FileTransferException {
        s sVar;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i14 = sVar.f113294d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                sVar.f113294d = i14 - Integer.MIN_VALUE;
            } else {
                sVar = new s(this, cVar);
            }
        } else {
            sVar = new s(this, cVar);
        }
        Object objB = sVar.f113292b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = sVar.f113294d;
        try {
            if (i15 == 0) {
                r.b(objB);
                g gVar = this.f50755a;
                GDIFileAccess.Service serviceBuild = builder.build();
                GDISmartProto.Smart.Builder builderNewBuilder = GDISmartProto.Smart.newBuilder();
                builderNewBuilder.setExtension(GDIFileAccessExtension.fileAccessService, serviceBuild);
                GDISmartProto.Smart smartBuild = builderNewBuilder.build();
                smartBuild.getClass();
                sVar.f113291a = str;
                sVar.f113294d = 1;
                objB = gVar.b(smartBuild, sVar);
                if (objB == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = sVar.f113291a;
                r.b(objB);
            }
            GDIFileAccess.Service serviceA = su2.a.a((GDISmartProto.Smart) objB);
            if (serviceA != null) {
                return serviceA;
            }
            throw new FileTransferException(tn.k.g(str, " failed: Response is missing file access service"), null, 2, null);
        } catch (Exception e4) {
            throw new FileTransferException(e5.g(str, " failed: Failed to send proto request: ", e4.getMessage()), e4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(UUID uuid, GDIFileAccess.DataType.Builder builder, int i14, long j8, List list, boolean z14, c cVar) throws FileTransferException {
        t tVar;
        b bVar;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i15 = tVar.f113299e;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                tVar.f113299e = i15 - Integer.MIN_VALUE;
            } else {
                tVar = new t(this, cVar);
            }
        } else {
            tVar = new t(this, cVar);
        }
        Object objI = tVar.f113297c;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i16 = tVar.f113299e;
        if (i16 == 0) {
            r.b(objI);
            GDIFileAccess.PushItemDataRequest.Builder builderAddAllSupportedTransports = GDIFileAccess.PushItemDataRequest.newBuilder().setItem(GDIFileAccess.ItemReference.newBuilder().setDataType(builder).setDataSize(j8).setUid(y.b(uuid))).setPriority(i14).addAllSupportedTransports(k(list));
            if (z14) {
                builderAddAllSupportedTransports.setRequestedCompressionWindow(15);
            }
            GDIFileAccess.Service.Builder pushItemRequest = GDIFileAccess.Service.newBuilder().setPushItemRequest(builderAddAllSupportedTransports);
            pushItemRequest.getClass();
            tVar.f113295a = this;
            tVar.f113296b = z14;
            tVar.f113299e = 1;
            objI = i(pushItemRequest, "Write", tVar);
            if (objI == obj) {
                return obj;
            }
            bVar = this;
        } else {
            if (i16 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z14 = tVar.f113296b;
            bVar = tVar.f113295a;
            r.b(objI);
        }
        GDIFileAccess.Service service = (GDIFileAccess.Service) objI;
        Integer num = null;
        if (!service.hasPushItemResponse()) {
            throw new FileTransferException("Write failed: Response is missing push item response", null, 2, null);
        }
        GDIFileAccess.PushItemDataResponse pushItemResponse = service.getPushItemResponse();
        if (!pushItemResponse.hasResult()) {
            throw new FileTransferException("Write failed: Push item response is missing result", null, 2, null);
        }
        StringBuilder sb3 = new StringBuilder();
        if (pushItemResponse.hasFilePath() || pushItemResponse.hasErrorCode() || pushItemResponse.hasErrorSource()) {
            StringBuilder sb4 = new StringBuilder("Device write error details: ");
            if (pushItemResponse.hasFilePath()) {
                String str = "path " + pushItemResponse.getFilePath() + ", ";
                sb4.append(str);
                sb3.append(str);
            }
            if (pushItemResponse.hasErrorCode()) {
                String str2 = "code " + pushItemResponse.getErrorCode() + ", ";
                sb4.append(str2);
                sb3.append(str2);
            }
            if (pushItemResponse.hasErrorSource()) {
                String str3 = "source " + pushItemResponse.getErrorSource() + ", ";
                sb4.append(str3);
                sb3.append(str3);
            }
            bVar.f50756b.error(sb4.toString());
        }
        if (pushItemResponse.getResult() == GDIFileAccess.ItemAccessResult.DATA_TYPE_ERROR && pushItemResponse.hasDataSpecificErrorSource() && pushItemResponse.hasDataSpecificErrorCode()) {
            throw new DataTypeSpecificException(pushItemResponse.getDataSpecificErrorSource(), pushItemResponse.getDataSpecificErrorCode(), "Write failed: ");
        }
        GDIFileAccess.ItemAccessResult result = pushItemResponse.getResult();
        result.getClass();
        String string = sb3.toString();
        bVar.getClass();
        a(result, "Write", string);
        if (!pushItemResponse.hasTransport() || !pushItemResponse.hasTransferHandle() || !pushItemResponse.hasOffset()) {
            throw new FileTransferException("Write failed: Push item response has missing fields", null, 2, null);
        }
        if (pushItemResponse.hasCompressionWindow()) {
            int compressionWindow = pushItemResponse.getCompressionWindow();
            f50754c.getClass();
            if (9 > compressionWindow || compressionWindow >= 16 || !z14) {
                TransferStatusException.Companion companion = TransferStatusException.INSTANCE;
                String str4 = "Device has invalid push compression window " + pushItemResponse.getCompressionWindow();
                companion.getClass();
                throw new TransferStatusException(GDIFileAccess.TransferStatusRequest.FailureReason.COMPRESSION_FAILED, str4, null);
            }
            bVar.f50756b.info("Device push compression window: " + pushItemResponse.getCompressionWindow());
            num = new Integer(pushItemResponse.getCompressionWindow());
        }
        return new a0(pushItemResponse.getTransferHandle(), pushItemResponse.getTransport().getNumber(), new Long(pushItemResponse.getOffset()), num);
    }

    public final ArrayList k(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            GDIFileAccess.TransportProtocol transportProtocolForNumber = GDIFileAccess.TransportProtocol.forNumber(iIntValue);
            if (transportProtocolForNumber == null) {
                this.f50756b.error("Invalid transport protocol: " + iIntValue);
            }
            if (transportProtocolForNumber != null) {
                arrayList.add(transportProtocolForNumber);
            }
        }
        return arrayList;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/device/filetransfer/b$a;", "", "<init>", "()V", "", "MIN_WINDOW_BITS", "I", "MAX_WINDOW_BITS", "file-transfer-device_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
