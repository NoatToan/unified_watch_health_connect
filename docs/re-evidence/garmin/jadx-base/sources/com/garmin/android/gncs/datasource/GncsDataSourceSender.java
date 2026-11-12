package com.garmin.android.gncs.datasource;

import a73.o;
import ih2.b;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Consumer;
import rs2.v;

/* JADX INFO: loaded from: classes11.dex */
public class GncsDataSourceSender {
    private static final int INVALID_NUMBER = -1;
    public static final long MAX_QUEUE_DURATION = 20000;
    public final Delegate mDelegate;
    private final v mMessenger;
    private final String mTag;
    private final ConcurrentLinkedQueue<TransferItem> transferQueue = new ConcurrentLinkedQueue<>();
    private Consumer<Failure> transferListener = null;

    /* JADX INFO: renamed from: com.garmin.android.gncs.datasource.GncsDataSourceSender$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$garmin$android$gncs$datasource$GncsDataSourceResponseMessage$ResponseType;

        static {
            int[] iArr = new int[GncsDataSourceResponseMessage.ResponseType.values().length];
            $SwitchMap$com$garmin$android$gncs$datasource$GncsDataSourceResponseMessage$ResponseType = iArr;
            try {
                iArr[GncsDataSourceResponseMessage.ResponseType.TRANSFER_SUCCESSFUL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$garmin$android$gncs$datasource$GncsDataSourceResponseMessage$ResponseType[GncsDataSourceResponseMessage.ResponseType.RESEND_LAST_DATA_PACKET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$garmin$android$gncs$datasource$GncsDataSourceResponseMessage$ResponseType[GncsDataSourceResponseMessage.ResponseType.ABORT_REQUEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$garmin$android$gncs$datasource$GncsDataSourceResponseMessage$ResponseType[GncsDataSourceResponseMessage.ResponseType.ERROR_CRC_MISMATCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$garmin$android$gncs$datasource$GncsDataSourceResponseMessage$ResponseType[GncsDataSourceResponseMessage.ResponseType.ERROR_DATA_OFFSET_MISMATCH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public interface Delegate {
        byte[] getSessionKey();

        void send(int i14, byte[] bArr, Consumer<byte[]> consumer);
    }

    public enum Failure {
        DATA_TRANSFER_FAILED,
        REMOTE_DEVICE_ABORT_TRANSFER,
        REMOTE_DEVICE_UNKNOWN_OR_NOT_SUPPORTED_OPERATION,
        GNCS_DATA_SOURCE_CREATE_FAILED
    }

    public GncsDataSourceSender(String str, v vVar, Delegate delegate) {
        this.mMessenger = vVar;
        this.mDelegate = delegate;
        this.mTag = str;
    }

    private void addToTransferQueue(byte[] bArr, Consumer<Failure> consumer) {
        trace("addToTransferQueue");
        this.transferListener = consumer;
        TransferItem transferItem = new TransferItem(0);
        transferItem.ancsPayload = bArr;
        transferItem.currCrcSeed = 0;
        transferItem.currDataOffset = 0;
        transferItem.queuedTime = System.currentTimeMillis();
        this.transferQueue.add(transferItem);
    }

    private void flushQueue() {
        if (this.transferQueue.size() > 0) {
            try {
                this.transferQueue.poll();
                TransferItem transferItemPoll = null;
                while (transferItemPoll != null) {
                    transferItemPoll = this.transferQueue.poll();
                }
            } catch (NoSuchElementException unused) {
            }
            trace("transfer queue flushed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendDataMessage$0(byte[] bArr) {
        if (bArr == null) {
            startNextTransfer(Failure.DATA_TRANSFER_FAILED);
            return;
        }
        try {
            processDataResponseMessage(new GncsDataSourceResponseMessage(bArr));
        } catch (Exception e4) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.mTag);
            sb3.append("failed to parse message -> ");
            sb3.append(e4.getMessage() != null ? e4.getMessage() : "");
            b.d(sb3.toString());
            startNextTransfer(Failure.DATA_TRANSFER_FAILED);
        }
    }

    private void processDataResponseMessage(GncsDataSourceResponseMessage gncsDataSourceResponseMessage) {
        trace("processDataResponseMessage: " + gncsDataSourceResponseMessage.toString());
        TransferItem transferItemPeek = this.transferQueue.peek();
        if (transferItemPeek != null) {
            int i14 = AnonymousClass1.$SwitchMap$com$garmin$android$gncs$datasource$GncsDataSourceResponseMessage$ResponseType[GncsDataSourceResponseMessage.ResponseType.getResponseType(gncsDataSourceResponseMessage.getResponse()).ordinal()];
            if (i14 == 1) {
                if (transferItemPeek.ancsPayload.length <= transferItemPeek.currDataOffset) {
                    startNextTransfer(null);
                    return;
                } else {
                    trace("TRANSFER_SUCCESSFUL, sending next data packet...");
                    sendDataMessage(transferItemPeek.currCrcSeed, transferItemPeek.currDataOffset);
                    return;
                }
            }
            if (i14 == 2) {
                b.d(this.mTag + "RESEND_LAST_DATA_PACKET, resending last data packet...");
                sendDataMessage(transferItemPeek.prevCrcSeed, transferItemPeek.prevDataOffset);
                return;
            }
            if (i14 == 3) {
                trace("ABORT_REQUEST");
                startNextTransfer(Failure.REMOTE_DEVICE_ABORT_TRANSFER);
                return;
            }
            if (i14 == 4) {
                b.d(this.mTag + "ERROR_CRC_MISMATCH, resending last data packet...");
                sendDataMessage(transferItemPeek.prevCrcSeed, transferItemPeek.prevDataOffset);
                return;
            }
            if (i14 == 5 && transferItemPeek.prevDataOffset != transferItemPeek.currDataOffset) {
                b.d(this.mTag + "ERROR_DATA_OFFSET_MISMATCH, resending last data packet...");
                sendDataMessage(transferItemPeek.currCrcSeed, transferItemPeek.currDataOffset);
            }
        }
    }

    private void sendDataMessage(int i14, int i15) {
        TransferItem transferItemPeek = this.transferQueue.peek();
        if (transferItemPeek == null) {
            return;
        }
        GncsDataSourceMessage gncsDataSourceMessage = new GncsDataSourceMessage(this.mMessenger.c());
        int iPopulateDataAndCrc = gncsDataSourceMessage.populateDataAndCrc(transferItemPeek.ancsPayload, i15, i14, this.mDelegate.getSessionKey(), this.mMessenger.c());
        if (iPopulateDataAndCrc <= 0) {
            startNextTransfer(Failure.GNCS_DATA_SOURCE_CREATE_FAILED);
            return;
        }
        transferItemPeek.prevDataOffset = i15;
        transferItemPeek.prevCrcSeed = i14;
        transferItemPeek.currDataOffset = i15 + iPopulateDataAndCrc;
        transferItemPeek.currCrcSeed = gncsDataSourceMessage.getTransferredDataCrc();
        this.mDelegate.send(GncsDataSourceMessage.MESSAGE_ID, gncsDataSourceMessage.toByteArray(), new o(this, 2));
    }

    private void startNextTransfer(Failure failure) {
        if (this.transferQueue.peek() != null) {
            Consumer<Failure> consumer = this.transferListener;
            if (consumer != null) {
                consumer.accept(failure);
            }
            this.transferQueue.poll();
        }
        if (failure == Failure.DATA_TRANSFER_FAILED) {
            trace("unable to send data to the remote device, flushing transfer queue: " + this.transferQueue);
            flushQueue();
            return;
        }
        if (failure == Failure.REMOTE_DEVICE_ABORT_TRANSFER) {
            trace("remote device has requested the entire transfer to be aborted, flushing transfer queue: " + this.transferQueue);
            flushQueue();
            return;
        }
        if (failure == Failure.REMOTE_DEVICE_UNKNOWN_OR_NOT_SUPPORTED_OPERATION) {
            trace("remote device does not support this GFDI message, flushing transfer queue: " + this.transferQueue);
            flushQueue();
            return;
        }
        Failure failure2 = Failure.GNCS_DATA_SOURCE_CREATE_FAILED;
        ConcurrentLinkedQueue<TransferItem> concurrentLinkedQueue = this.transferQueue;
        if (failure != failure2) {
            if (concurrentLinkedQueue.peek() != null) {
                startTransfer();
            }
        } else {
            trace("unable to create GFDI message, flushing transfer queue: " + concurrentLinkedQueue);
            flushQueue();
        }
    }

    private void startTransfer() {
        sendDataMessage(0, 0);
    }

    private void trace(String str) {
        b.b(this.mTag + str);
    }

    public void close() {
        flushQueue();
        this.transferQueue.clear();
        this.transferListener = null;
    }

    public void sendGncsDataSource(byte[] bArr, Consumer<Failure> consumer) {
        TransferItem transferItemPeek = this.transferQueue.peek();
        boolean z14 = false;
        while (transferItemPeek != null && System.currentTimeMillis() - transferItemPeek.queuedTime > 20000) {
            this.transferQueue.poll();
            transferItemPeek = this.transferQueue.peek();
            z14 = true;
        }
        if (z14) {
            trace("transfer queue had backlog that was purged");
        }
        boolean zIsEmpty = this.transferQueue.isEmpty();
        addToTransferQueue(bArr, consumer);
        if (zIsEmpty) {
            trace("starting queue transfer (first message)");
            startTransfer();
        } else if (z14) {
            trace("starting queue transfer (backlog)");
            startTransfer();
        }
    }

    public static final class TransferItem {
        public byte[] ancsPayload;
        public int currCrcSeed;
        public int currDataOffset;
        public int prevCrcSeed;
        public int prevDataOffset;
        public long queuedTime;

        private TransferItem() {
            this.ancsPayload = null;
            this.currCrcSeed = -1;
            this.currDataOffset = -1;
            this.prevCrcSeed = -1;
            this.prevDataOffset = -1;
            this.queuedTime = 0L;
        }

        public /* synthetic */ TransferItem(int i14) {
            this();
        }
    }
}
