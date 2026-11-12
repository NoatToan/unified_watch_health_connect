package com.garmin.device.nfc;

import android.os.Parcelable;
import android.util.SparseArray;
import androidx.media3.common.p;
import com.garmin.io.cobs.CobsDecodeException;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningScheduledExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.Executors;
import o62.b0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import pl2.l;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001:\u0006\b\t\n\u000b\f\rB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/garmin/device/nfc/NfcCommandHandler;", "", "Lcom/garmin/device/nfc/g;", "dispatcher", "", "lockId", "<init>", "(Lcom/garmin/device/nfc/g;B)V", "NfcCapabilityException", "a", "b", JWKParameterNames.RSA_EXPONENT, "c", "d", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class NfcCommandHandler {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f50799g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.garmin.device.nfc.g f50800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f50801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f50802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public pl2.f f50803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ListeningScheduledExecutorService f50804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final tl2.i f50805f;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/garmin/device/nfc/NfcCommandHandler$NfcCapabilityException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "message", "Lrl2/a;", "failureReason", "<init>", "(Ljava/lang/String;Lrl2/a;)V", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "Lrl2/a;", "getFailureReason", "()Lrl2/a;", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static class NfcCapabilityException extends Exception {
        private final rl2.a failureReason;
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NfcCapabilityException(String str, rl2.a aVar) {
            super(str);
            str.getClass();
            aVar.getClass();
            this.message = str;
            this.failureReason = aVar;
        }

        public final rl2.a getFailureReason() {
            return this.failureReason;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.message;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/device/nfc/NfcCommandHandler$c;", "", "", "deviceFlag", "<init>", "(Ljava/lang/String;IB)V", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum c {
        /* JADX INFO: Fake field, exist only in values array */
        INVALID((byte) 0),
        UNLOCKED((byte) 1),
        /* JADX INFO: Fake field, exist only in values array */
        INTERNAL((byte) 2),
        /* JADX INFO: Fake field, exist only in values array */
        LOCAL_WALLET((byte) 3),
        /* JADX INFO: Fake field, exist only in values array */
        REMOTE_APDU((byte) 10),
        /* JADX INFO: Fake field, exist only in values array */
        REMOTE_WALLET(Ascii.VT),
        /* JADX INFO: Fake field, exist only in values array */
        GARMIN_PAY_APP(Ascii.FF);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte f50822a;

        c(byte b14) {
            this.f50822a = b14;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/device/nfc/NfcCommandHandler$d;", "", "", TtmlNode.ATTR_ID, "<init>", "(Ljava/lang/String;IB)V", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum d {
        FITPAY((byte) 1),
        /* JADX INFO: Fake field, exist only in values array */
        UNION_PAY((byte) 2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte f50825a;

        d(byte b14) {
            this.f50825a = b14;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/device/nfc/NfcCommandHandler$e;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum e {
        WALLET_UPDATE_REQUEST_RESPONSE(0),
        ADD_CREDIT_CARD_REQUEST_RESPONSE(1),
        UPDATE_CREDIT_CARD_REQUEST_RESPONSE(2),
        DELETE_CREDIT_CARD_REQUEST_RESPONSE(3),
        WALLET_UPDATE_COMPLETED_REQUEST_RESPONSE(4),
        DEVICE_WALLET_STATE_REQUEST(5),
        RESET_WALLET_REQUEST(6),
        CREATE_OWNER_DATA(7),
        READ_OWNER_DATA(8),
        DELETE_OWNER_DATA(9),
        /* JADX INFO: Fake field, exist only in values array */
        GET_WALLET_CAPABILITIES(10),
        DELETE_BY_PROVIDER(11),
        SET_EXPRESS_TRANSIT_CARD(12),
        GET_EXPRESS_TRANSIT_CARD(13),
        GET_TRANSIT_CARD_ID(14);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f50841a;

        e(int i14) {
            this.f50841a = i14;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/device/nfc/NfcCommandHandler$f", "Lcom/garmin/device/nfc/g$f;", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f implements com.garmin.device.nfc.g.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ cs2.a<Boolean> f50842a;

        public f(cs2.a<Boolean> aVar) {
            this.f50842a = aVar;
        }

        @Override // com.garmin.device.nfc.g.e
        public final void a(i iVar) {
            NfcCommandHandler.f50799g.debug("Received CREATE_OWNER_DATA");
            this.f50842a.accept(Boolean.valueOf(j.b(iVar, e.CREATE_OWNER_DATA)));
        }

        @Override // com.garmin.device.nfc.g.f
        public final void b(int i14) {
            NfcCommandHandler.f50799g.debug("No response for CREATE_OWNER_DATA");
            this.f50842a.accept(Boolean.FALSE);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/device/nfc/NfcCommandHandler$g", "Lpl2/e;", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class g implements pl2.e {
        public g() {
        }

        @Override // pl2.e
        public final pl2.f getCapabilities() {
            pl2.f fVar;
            NfcCommandHandler nfcCommandHandler = NfcCommandHandler.this;
            synchronized (nfcCommandHandler.f50802c) {
                fVar = nfcCommandHandler.f50803d;
            }
            return fVar;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/device/nfc/NfcCommandHandler$h", "Lcom/garmin/device/nfc/g$f;", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class h implements com.garmin.device.nfc.g.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ cs2.a<Boolean> f50845b;

        public h(cs2.a<Boolean> aVar) {
            this.f50845b = aVar;
        }

        @Override // com.garmin.device.nfc.g.e
        public final void a(i iVar) {
            HashSet<tl2.c> hashSet;
            boolean zB = j.b(iVar, e.RESET_WALLET_REQUEST);
            if (zB) {
                tl2.i iVar2 = NfcCommandHandler.this.f50805f;
                iVar2.getClass();
                tl2.i.f165329l.debug("Clearing queued non-high priority transfers");
                synchronized (iVar2.f165335e) {
                    try {
                        PriorityQueue<tl2.c> priorityQueue = iVar2.f165335e;
                        ArrayList arrayList = new ArrayList();
                        for (tl2.c cVar : priorityQueue) {
                            if (cVar.f165285b != tl2.c.EnumC3105c.HIGH_PRIORITY_MESSAGE) {
                                arrayList.add(cVar);
                            }
                        }
                        hashSet = new HashSet(arrayList);
                        iVar2.f165335e.removeAll(hashSet);
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                for (tl2.c cVar2 : hashSet) {
                    cVar2.getClass();
                    cVar2.f(tl2.c.b.DROPPED, null);
                }
            }
            NfcCommandHandler.f50799g.debug("Received RESET_WALLET_REQUEST");
            this.f50845b.accept(Boolean.valueOf(zB));
        }

        @Override // com.garmin.device.nfc.g.f
        public final void b(int i14) {
            NfcCommandHandler.f50799g.debug("No response for RESET_WALLET_REQUEST");
            this.f50845b.accept(Boolean.FALSE);
        }
    }

    static {
        new a(null);
        f50799g = LoggerFactory.getLogger("PAY#NFC#CommandHandler");
    }

    public NfcCommandHandler(final com.garmin.device.nfc.g gVar, byte b14) {
        gVar.getClass();
        this.f50800a = gVar;
        this.f50801b = b14;
        if (b14 < 12 || b14 > 20) {
            vb.h.s("Valid range of lockIds is 12-20");
            throw null;
        }
        this.f50802c = new byte[0];
        this.f50804e = MoreExecutors.listeningDecorator(Executors.newSingleThreadScheduledExecutor());
        this.f50805f = new tl2.i(gVar, b14, new g());
        gVar.f50865b.info(TtmlNode.START);
        if (!gVar.f50868e.compareAndSet(0, 1)) {
            vb.h.z("NfcServiceDispatcher has already been started.");
            throw null;
        }
        final int i14 = 0;
        gVar.f50871h = new Thread(new Runnable() { // from class: pl2.m
            @Override // java.lang.Runnable
            public final void run() {
                com.garmin.device.nfc.g.f fVar;
                switch (i14) {
                    case 0:
                        com.garmin.device.nfc.g gVar2 = gVar;
                        gVar2.f50865b.info("*** ENTER NFC DISPATCHER ***");
                        gVar2.f50865b.info("process");
                        while (gVar2.f50868e.get() == 1) {
                            try {
                                byte[] bArrA = gVar2.f50866c.a();
                                int iA = o.a(1, bArrA);
                                if (iA < 1 || iA > 5) {
                                    gVar2.b((byte) 3);
                                } else {
                                    int iA2 = o.a(iA + 1, bArrA);
                                    if (iA2 < 1 || iA2 > 5) {
                                        gVar2.b((byte) 2);
                                    } else {
                                        com.garmin.device.nfc.i iVar = new com.garmin.device.nfc.i(bArrA);
                                        byte[] bArr = iVar.f50907a;
                                        boolean z14 = false;
                                        if (bArr.length != 0) {
                                            int length = bArr.length - 1;
                                            byte b15 = 0;
                                            for (int i15 = 0; i15 < length; i15++) {
                                                b15 = (byte) (b15 ^ bArr[i15]);
                                            }
                                            if (b15 == bArr[bArr.length - 1]) {
                                                z14 = true;
                                            }
                                        }
                                        Logger logger = gVar2.f50865b;
                                        if (z14) {
                                            logger.debug("Decoding success" + com.garmin.device.nfc.j.a(iVar.a()));
                                            if (iVar.f() == com.garmin.device.nfc.i.a.COMPANION_APPLICATION) {
                                                synchronized (gVar2.f50869f) {
                                                    try {
                                                        com.garmin.device.nfc.g.c cVar = gVar2.f50869f.get(iVar.c());
                                                        if (cVar != null) {
                                                            fVar = cVar.f50881a;
                                                            gVar2.f50875l.removeCallbacks(cVar.f50882b);
                                                            gVar2.f50869f.remove(iVar.c());
                                                        } else {
                                                            fVar = null;
                                                        }
                                                    } catch (Throwable th3) {
                                                        throw th3;
                                                    }
                                                }
                                                if (fVar != null) {
                                                    fVar.a(iVar);
                                                } else {
                                                    gVar2.f50865b.error("No callback for transaction: " + iVar.c() + "; source = " + iVar.f());
                                                }
                                            } else if (iVar.f() == com.garmin.device.nfc.i.a.GARMIN_DEVICE) {
                                                gVar2.a(iVar).a(iVar, new b0(7, gVar2, iVar));
                                            }
                                        } else {
                                            logger.debug("CRC validation unsuccessful " + iVar.toString());
                                            gVar2.b((byte) 5);
                                        }
                                    }
                                }
                            } catch (CobsDecodeException e4) {
                                gVar2.f50865b.error("Decoding failed" + e4.failure());
                                if (e4.failure() == it2.a.DECODE_BUFFER_OVERRUN) {
                                    gVar2.b((byte) 4);
                                } else if (e4.failure() == it2.a.UNEXPECTED_END_OF_FRAME) {
                                    gVar2.b((byte) 1);
                                }
                            } catch (IOException e14) {
                                gVar2.f50865b.debug("MultilinkServiceDispatcher IOException: " + e14.getMessage());
                            }
                        }
                        gVar2.f50865b.info("*** EXIT NFC DISPATCHER ***");
                        return;
                    default:
                        com.garmin.device.nfc.g gVar3 = gVar;
                        Logger logger2 = gVar3.f50865b;
                        logger2.info("writeMessageThread");
                        while (gVar3.f50868e.get() == 1) {
                            try {
                                com.garmin.device.nfc.i iVarTake = gVar3.f50876m.take();
                                try {
                                    gVar3.f50867d.a(iVarTake.f50907a.length, iVarTake.a());
                                } catch (Exception e15) {
                                    logger2.error("Sending message failed", (Throwable) e15);
                                }
                            } catch (InterruptedException e16) {
                                logger2.error("writeMessageThread - e: " + e16.getMessage());
                            }
                        }
                        return;
                }
            }
        }, gVar.f50864a);
        final int i15 = 1;
        gVar.f50872i = new Thread(new Runnable() { // from class: pl2.m
            @Override // java.lang.Runnable
            public final void run() {
                com.garmin.device.nfc.g.f fVar;
                switch (i15) {
                    case 0:
                        com.garmin.device.nfc.g gVar2 = gVar;
                        gVar2.f50865b.info("*** ENTER NFC DISPATCHER ***");
                        gVar2.f50865b.info("process");
                        while (gVar2.f50868e.get() == 1) {
                            try {
                                byte[] bArrA = gVar2.f50866c.a();
                                int iA = o.a(1, bArrA);
                                if (iA < 1 || iA > 5) {
                                    gVar2.b((byte) 3);
                                } else {
                                    int iA2 = o.a(iA + 1, bArrA);
                                    if (iA2 < 1 || iA2 > 5) {
                                        gVar2.b((byte) 2);
                                    } else {
                                        com.garmin.device.nfc.i iVar = new com.garmin.device.nfc.i(bArrA);
                                        byte[] bArr = iVar.f50907a;
                                        boolean z14 = false;
                                        if (bArr.length != 0) {
                                            int length = bArr.length - 1;
                                            byte b15 = 0;
                                            for (int i16 = 0; i16 < length; i16++) {
                                                b15 = (byte) (b15 ^ bArr[i16]);
                                            }
                                            if (b15 == bArr[bArr.length - 1]) {
                                                z14 = true;
                                            }
                                        }
                                        Logger logger = gVar2.f50865b;
                                        if (z14) {
                                            logger.debug("Decoding success" + com.garmin.device.nfc.j.a(iVar.a()));
                                            if (iVar.f() == com.garmin.device.nfc.i.a.COMPANION_APPLICATION) {
                                                synchronized (gVar2.f50869f) {
                                                    try {
                                                        com.garmin.device.nfc.g.c cVar = gVar2.f50869f.get(iVar.c());
                                                        if (cVar != null) {
                                                            fVar = cVar.f50881a;
                                                            gVar2.f50875l.removeCallbacks(cVar.f50882b);
                                                            gVar2.f50869f.remove(iVar.c());
                                                        } else {
                                                            fVar = null;
                                                        }
                                                    } catch (Throwable th3) {
                                                        throw th3;
                                                    }
                                                }
                                                if (fVar != null) {
                                                    fVar.a(iVar);
                                                } else {
                                                    gVar2.f50865b.error("No callback for transaction: " + iVar.c() + "; source = " + iVar.f());
                                                }
                                            } else if (iVar.f() == com.garmin.device.nfc.i.a.GARMIN_DEVICE) {
                                                gVar2.a(iVar).a(iVar, new b0(7, gVar2, iVar));
                                            }
                                        } else {
                                            logger.debug("CRC validation unsuccessful " + iVar.toString());
                                            gVar2.b((byte) 5);
                                        }
                                    }
                                }
                            } catch (CobsDecodeException e4) {
                                gVar2.f50865b.error("Decoding failed" + e4.failure());
                                if (e4.failure() == it2.a.DECODE_BUFFER_OVERRUN) {
                                    gVar2.b((byte) 4);
                                } else if (e4.failure() == it2.a.UNEXPECTED_END_OF_FRAME) {
                                    gVar2.b((byte) 1);
                                }
                            } catch (IOException e14) {
                                gVar2.f50865b.debug("MultilinkServiceDispatcher IOException: " + e14.getMessage());
                            }
                        }
                        gVar2.f50865b.info("*** EXIT NFC DISPATCHER ***");
                        return;
                    default:
                        com.garmin.device.nfc.g gVar3 = gVar;
                        Logger logger2 = gVar3.f50865b;
                        logger2.info("writeMessageThread");
                        while (gVar3.f50868e.get() == 1) {
                            try {
                                com.garmin.device.nfc.i iVarTake = gVar3.f50876m.take();
                                try {
                                    gVar3.f50867d.a(iVarTake.f50907a.length, iVarTake.a());
                                } catch (Exception e15) {
                                    logger2.error("Sending message failed", (Throwable) e15);
                                }
                            } catch (InterruptedException e16) {
                                logger2.error("writeMessageThread - e: " + e16.getMessage());
                            }
                        }
                        return;
                }
            }
        });
        gVar.f50871h.start();
        gVar.f50872i.start();
    }

    public final int a(com.garmin.device.nfc.h[] hVarArr, cs2.a<Boolean> aVar) {
        byte[] bArr;
        byte[] bArr2;
        b bVar = b.WALLET_UPDATE_REQUEST_RESPONSE;
        Parcelable.Creator<com.garmin.device.nfc.h> creator = com.garmin.device.nfc.h.CREATOR;
        int length = 0;
        for (com.garmin.device.nfc.h hVar : hVarArr) {
            if (hVar != null && (bArr2 = hVar.f50884a) != null) {
                length += bArr2.length;
            }
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 1);
        byteBufferAllocate.put((byte) e.CREATE_OWNER_DATA.f50841a);
        for (com.garmin.device.nfc.h hVar2 : hVarArr) {
            if (hVar2 != null && (bArr = hVar2.f50884a) != null) {
                byteBufferAllocate.put(bArr, 0, bArr.length);
            }
        }
        return tl2.i.e(this.f50805f, new i(bVar, byteBufferAllocate.array()), new f(aVar), 0L, 12);
    }

    public final void b(cs2.a aVar) {
        b bVar = b.WALLET_UPDATE_REQUEST_RESPONSE;
        Parcelable.Creator<com.garmin.device.nfc.h> creator = com.garmin.device.nfc.h.CREATOR;
        tl2.i.e(this.f50805f, new i(bVar, (byte) e.DELETE_OWNER_DATA.f50841a), new com.garmin.device.nfc.c(aVar), 0L, 12);
    }

    public final synchronized int c(cs2.a<l> aVar) {
        f50799g.trace("Checking if pass code is set");
        return this.f50805f.c(new sl2.e(aVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ListenableFuture<Collection<com.garmin.device.nfc.b>> d(List<? extends com.garmin.device.nfc.h.b> list) {
        b bVar = b.WALLET_UPDATE_REQUEST_RESPONSE;
        Parcelable.Creator<com.garmin.device.nfc.h> creator = com.garmin.device.nfc.h.CREATOR;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(list.size() + 1).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put((byte) e.DEVICE_WALLET_STATE_REQUEST.f50841a);
        Iterator<? extends com.garmin.device.nfc.h.b> it = list.iterator();
        while (it.hasNext()) {
            byteBufferOrder.put((byte) it.next().f50888a);
        }
        i iVar = new i(bVar, byteBufferOrder.array());
        tl2.g gVar = tl2.i.f165328k;
        tl2.i iVar2 = this.f50805f;
        iVar2.getClass();
        xl2.b bVar2 = new xl2.b(iVar, 0L, 0, null, 8, null);
        iVar2.f(new xl2.a(iVar2.a(bVar2), tl2.c.EnumC3105c.LOW_PRIORITY_MESSAGE, 0 == true ? 1 : 0, 4, null));
        ListenableFuture<Collection<com.garmin.device.nfc.b>> listenableFutureTransform = Futures.transform(bVar2.f191316f, new p(10), this.f50804e);
        listenableFutureTransform.getClass();
        return listenableFutureTransform;
    }

    public final int e(cs2.a<Boolean> aVar) {
        b bVar = b.WALLET_UPDATE_REQUEST_RESPONSE;
        Parcelable.Creator<com.garmin.device.nfc.h> creator = com.garmin.device.nfc.h.CREATOR;
        return tl2.i.e(this.f50805f, new i(bVar, new byte[]{(byte) (((byte) e.RESET_WALLET_REQUEST.f50841a) | UnsignedBytes.MAX_POWER_OF_TWO), 3, 1}), new h(aVar), 120000L, 8);
    }

    public final void f(pl2.k kVar, sl2.f fVar, cs2.a aVar) {
        fVar.getClass();
        f50799g.trace("Setting pass code");
        this.f50805f.b(new sl2.i(kVar.f138584a, kVar.f138587d, aVar, kVar.f138586c, fVar));
    }

    public final void g() {
        com.garmin.device.nfc.g gVar = this.f50800a;
        it2.e eVar = gVar.f50867d;
        Logger logger = gVar.f50865b;
        logger.info("stop");
        if (gVar.f50868e.compareAndSet(1, 2)) {
            gVar.f50875l.removeCallbacksAndMessages(null);
            Thread thread = gVar.f50871h;
            if (thread != null) {
                thread.interrupt();
            }
            Thread thread2 = gVar.f50872i;
            if (thread2 != null) {
                thread2.interrupt();
            }
            gVar.f50873j.quit();
            try {
                try {
                    gVar.f50866c.close();
                    eVar.close();
                } catch (Throwable th3) {
                    eVar.close();
                    throw th3;
                }
            } catch (IOException unused) {
                logger.warn("Error closing reader or writer");
            }
        }
        tl2.i iVar = this.f50805f;
        iVar.getClass();
        HashSet hashSet = new HashSet();
        synchronized (iVar.f165335e) {
            try {
                tl2.c cVar = iVar.f165337g;
                if (cVar != null) {
                    iVar.f165335e.add(cVar);
                }
                hashSet.addAll(iVar.f165335e);
                iVar.f165335e.clear();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((tl2.c) it.next()).b();
        }
        iVar.f165340j.removeCallbacksAndMessages(null);
        iVar.f165334d.quit();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/device/nfc/NfcCommandHandler$b;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "a", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        APDU_FROM_MOBILE(0),
        /* JADX INFO: Fake field, exist only in values array */
        APDU_FROM_REMOTEDEVICE(1),
        PROTOCOL_ERROR(2),
        /* JADX INFO: Fake field, exist only in values array */
        DEVICE_INFO_REQUEST_RESPONSE(3),
        /* JADX INFO: Fake field, exist only in values array */
        SEID_REQUEST_RESPONSE(4),
        WALLET_UPDATE_REQUEST_RESPONSE(5),
        /* JADX INFO: Fake field, exist only in values array */
        REQUEST_APDU_TRANSFER(6),
        /* JADX INFO: Fake field, exist only in values array */
        END_APDU_TRANSFER(7),
        APDU_TRANSFER_STATUS_NOTIFICATION(8),
        /* JADX INFO: Fake field, exist only in values array */
        UNIONPAY_BTC_COMMAND_FROM_MOBILE(9),
        /* JADX INFO: Fake field, exist only in values array */
        UNIONPAY_BTC_COMMAND_FROM_REMOTEDEVICE(10),
        /* JADX INFO: Fake field, exist only in values array */
        CHECK_PRELOAD_CAP(11),
        NFC_ACCESS_GET_STATE(16),
        NFC_ACCESS_ACQUIRE(18),
        NFC_ACCESS_RELEASE(20),
        GET_CAPABILITIES(22),
        /* JADX INFO: Fake field, exist only in values array */
        APDU_COMMANDS_BATCH_FROM_MOBILE(24),
        NOTIFICATION_FROM_MOBILE_TO_DEVICE(27),
        DEVICE_DRIVEN_SOCKET(28),
        APP_CAPABILITIES(32);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final SparseArray<b> f50806b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f50819a;

        static {
            new a(null);
            f50806b = new SparseArray<>(values().length);
            for (b bVar : values()) {
                f50806b.put(bVar.f50819a, bVar);
            }
        }

        b(int i14) {
            this.f50819a = i14;
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/device/nfc/NfcCommandHandler$b$a;", "", "<init>", "()V", "Landroid/util/SparseArray;", "Lcom/garmin/device/nfc/NfcCommandHandler$b;", "responseDictionary", "Landroid/util/SparseArray;", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/garmin/device/nfc/NfcCommandHandler$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "LOGGER", "Lorg/slf4j/Logger;", "", "NTP_RESPONSE_SUCCESS", "I", "NTP_RESPONSE_FAILURE", "NTP_RESPONSE_BUSY", "", "GARMIN_PAY_LOCK_ID", "B", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
