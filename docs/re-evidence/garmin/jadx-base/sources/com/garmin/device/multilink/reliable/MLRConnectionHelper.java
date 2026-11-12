package com.garmin.device.multilink.reliable;

import am.j;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import androidx.room.a0;
import c22.t;
import com.garmin.device.multilink.MultiLinkClosedException;
import com.garmin.device.multilink.MultiLinkException;
import com.google.common.primitives.UnsignedBytes;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import gt2.c;
import i3.e5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.BiConsumer;
import ml2.d;
import ml2.f;
import ml2.i0;
import ml2.m;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tn.k;

/* JADX INFO: loaded from: classes11.dex */
public class MLRConnectionHelper {
    private static final long CONFIGURE_TIMEOUT = 10000;
    private static final ConcurrentHashMap<Integer, MLRConnectionHelper> CONNECTIONS;
    private static final Logger DETAIL_LOGGER;
    private static final Handler HANDLER;
    private static final HandlerThread HANDLER_THREAD;
    private static final AtomicLong LAST_START_BLOB_TIME;
    private static final Logger LOGGER;
    private static final int MLR_DATA_RESULT_FAILED = 2;
    private static final int MLR_DATA_RESULT_PENDING = 1;
    private static final int MLR_DATA_RESULT_SUCCESS = 0;
    public static final int MLR_STATUS_OK = 0;
    private static final long READY_TO_SEND_BLOB_TIMEOUT = 120000;
    private final BiConsumer<Integer, byte[]> dataCallback;
    private final String macAddress;
    private final int mlrConnectionId;
    private final ConcurrentHashMap<Integer, Timer> sendConfigureTimers;
    private final HashMap<Integer, FutureHolder> sendFutures;
    private final HashSet<Integer> serviceHandles;
    private final AtomicInteger transactionId;
    public final d watchDog;
    private final i0 writer;

    /* JADX INFO: renamed from: com.garmin.device.multilink.reliable.MLRConnectionHelper$1, reason: invalid class name */
    public class AnonymousClass1 extends TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f50797a = 0;
        final /* synthetic */ int val$handle;

        public AnonymousClass1(int i14) {
            this.val$handle = i14;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                synchronized (MLRConnectionHelper.this.serviceHandles) {
                    try {
                        MLRConnectionHelper.this.sendConfigureTimers.remove(Integer.valueOf(this.val$handle));
                        if (MLRConnectionHelper.this.serviceHandles.contains(Integer.valueOf(this.val$handle))) {
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            long j8 = MLRConnectionHelper.LAST_START_BLOB_TIME.get() + MLRConnectionHelper.READY_TO_SEND_BLOB_TIMEOUT;
                            MLRConnectionHelper mLRConnectionHelper = MLRConnectionHelper.this;
                            if (j8 < jElapsedRealtime) {
                                MLRConnectionHelper.logError(mLRConnectionHelper.macAddress, "send configure did not start within expected window. mlrReadyToSend since it has been 2min since last onSendDataBlobStart");
                                MLRConnectionHelper.mlrReadyToSend();
                            } else {
                                MLRConnectionHelper.logError(mLRConnectionHelper.macAddress, "send configure did not start within expected window. requestProcessing anyway");
                                MLRConnectionHelper.HANDLER.post(new a(0));
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                MLRConnectionHelper.logError(MLRConnectionHelper.this.macAddress, "send configure failed: " + th4.getMessage());
            }
        }
    }

    public static final class FutureHolder {
        final SettableFuture<Void> future;
        final int handle;

        public FutureHolder(int i14, SettableFuture<Void> settableFuture) {
            this.handle = i14;
            this.future = settableFuture;
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("MLR_HandlerThread");
        HANDLER_THREAD = handlerThread;
        handlerThread.start();
        HANDLER = new Handler(handlerThread.getLooper());
        CONNECTIONS = new ConcurrentHashMap<>();
        LAST_START_BLOB_TIME = new AtomicLong();
        LOGGER = LoggerFactory.getLogger("ML#MLRConnectionHelper");
        int i14 = c.f79010a;
        DETAIL_LOGGER = gt2.b.f79005a.i("MLR");
    }

    public MLRConnectionHelper(i0 i0Var, String str, int i14, BiConsumer<Integer, byte[]> biConsumer, d dVar) {
        this.serviceHandles = new HashSet<>();
        this.sendFutures = new HashMap<>();
        this.transactionId = new AtomicInteger();
        this.sendConfigureTimers = new ConcurrentHashMap<>();
        this.writer = i0Var;
        this.mlrConnectionId = i14;
        this.dataCallback = biConsumer;
        this.macAddress = str;
        this.watchDog = dVar;
        if (CONNECTIONS.put(Integer.valueOf(i14), this) != null) {
            detailedLog(str, j.h(i14, "New connection created before previous one closed, connectionId: "));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void detailedLog(String str, String str2) {
        if (MLRInitializer.isDebug()) {
            if (str != null) {
                str2 = a0.j("[", str, "] ", str2);
            }
            DETAIL_LOGGER.trace(str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void logError(String str, String str2) {
        if (str != null) {
            str2 = a0.j("[", str, "] ", str2);
        }
        LOGGER.error(str2);
        if (MLRInitializer.isDebug()) {
            DETAIL_LOGGER.error(str2);
        }
    }

    private static boolean logMlrEvent(int i14, String str) {
        if (!MLRInitializer.isDebug()) {
            return false;
        }
        if (i14 == 1) {
            DETAIL_LOGGER.error(str);
            return true;
        }
        if (i14 != 2 || str.startsWith("MLR_reliable_run_protocol")) {
            return false;
        }
        DETAIL_LOGGER.warn(str);
        return true;
    }

    private static native void mlrCloseConnection(int i14, int i15);

    private static native int mlrOpenConnection(int i14, int i15, int i16);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void mlrReadyToSend();

    private static native void mlrReceiveRawPacket(int i14, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void mlrReliableRunProtocol();

    private static native int mlrSendDataBlob(int i14, int i15, byte[] bArr, int i16);

    private static int onParsedReceivedPacket(int i14, int i15, byte[] bArr) {
        String strE = k.e(i14, i15, "onParsedReceivedPacket: handle:", ", connectionId:");
        MLRConnectionHelper mLRConnectionHelper = CONNECTIONS.get(Integer.valueOf(i15));
        if (mLRConnectionHelper == null) {
            detailedLog(null, strE);
            LOGGER.error("onParsedReceivedPacket: MLR called invalid connection ID");
            return 2;
        }
        detailedLog(mLRConnectionHelper.macAddress, strE);
        if (bArr == null || bArr.length == 0) {
            LOGGER.error("onParsedReceivedPacket: MLR provided no parsed data");
            return 2;
        }
        mLRConnectionHelper.dataCallback.accept(Integer.valueOf(i14), bArr);
        return 0;
    }

    private static void onRequestProcessing() {
        detailedLog(null, "onRequestProcessing");
        HANDLER.post(new a(1));
    }

    private static void onSendDataBlobComplete(int i14, int i15, int i16) {
        FutureHolder futureHolderRemove;
        StringBuilder sbJ = e5.j(i16, i14, "onSendDataBlobComplete: transaction:", ", handle:", ", connectionId:");
        sbJ.append(i15);
        String string = sbJ.toString();
        MLRConnectionHelper mLRConnectionHelper = CONNECTIONS.get(Integer.valueOf(i15));
        if (mLRConnectionHelper == null) {
            detailedLog(null, string);
            LOGGER.error("onSendDataBlobComplete: MLR called invalid connection ID");
            return;
        }
        detailedLog(mLRConnectionHelper.macAddress, string);
        synchronized (mLRConnectionHelper.sendFutures) {
            futureHolderRemove = mLRConnectionHelper.sendFutures.remove(Integer.valueOf(i16));
        }
        if (futureHolderRemove != null) {
            futureHolderRemove.future.set(null);
        }
    }

    private static int onSendDataBlobStart(final int i14, int i15, byte[] bArr) {
        LAST_START_BLOB_TIME.set(SystemClock.elapsedRealtime());
        final MLRConnectionHelper mLRConnectionHelper = CONNECTIONS.get(Integer.valueOf(i15));
        final String str = mLRConnectionHelper != null ? mLRConnectionHelper.macAddress : null;
        detailedLog(str, k.e(i14, i15, "onSendDataBlobStart: handle:", ", connectionId: "));
        if (mLRConnectionHelper == null) {
            LOGGER.error("onSendDataBlobStart: MLR called invalid connection ID");
            return 2;
        }
        Timer timerRemove = mLRConnectionHelper.sendConfigureTimers.remove(Integer.valueOf(i14));
        if (timerRemove != null) {
            timerRemove.cancel();
        }
        if (bArr == null || bArr.length == 0) {
            LOGGER.error("onSendDataBlobStart: MLR provided no data to send");
            return 2;
        }
        Futures.addCallback(mLRConnectionHelper.writer.a(i14, bArr), new FutureCallback<Void>() { // from class: com.garmin.device.multilink.reliable.MLRConnectionHelper.2
            @Override // com.google.common.util.concurrent.FutureCallback
            public void onFailure(Throwable th3) {
                MLRConnectionHelper.LOGGER.error("Failed to write MLR data: handle:{}", Integer.valueOf(i14), th3);
                d dVar = mLRConnectionHelper.watchDog;
                if (dVar != null) {
                    int i16 = i14;
                    az2.a<Integer, d.C2269d> aVar = dVar.f119318e;
                    d.C2269d c2269d = aVar.f13782a.get(Integer.valueOf(i16));
                    if (c2269d != null && c2269d.f119322b.incrementAndGet() > 15 && c2269d.f119323c.get() + 240000 < dVar.f119315b.millis()) {
                        ge1.b.T(dVar.f119316c, null, null, new f(dVar, "consecutive failures", c2269d, null), 3);
                    }
                }
                try {
                    MLRConnectionHelper.mlrReadyToSend();
                } catch (Throwable unused) {
                }
            }

            @Override // com.google.common.util.concurrent.FutureCallback
            public void onSuccess(Void r14) {
                MLRConnectionHelper.detailedLog(str, "onSendDataBlobStart: success: handle:" + i14);
                d dVar = mLRConnectionHelper.watchDog;
                if (dVar != null) {
                    int i16 = i14;
                    d.C2269d c2269d = dVar.f119318e.f13782a.get(Integer.valueOf(i16));
                    if (c2269d != null) {
                        c2269d.f119322b.set(0);
                        c2269d.f119323c.set(dVar.f119315b.millis());
                    }
                }
                try {
                    MLRConnectionHelper.mlrReadyToSend();
                } catch (Throwable unused) {
                }
            }
        }, MoreExecutors.directExecutor());
        return 1;
    }

    public void close() {
        ArrayList arrayList;
        ArrayList<Integer> arrayList2;
        MLRConnectionHelper mLRConnectionHelperRemove = CONNECTIONS.remove(Integer.valueOf(this.mlrConnectionId));
        if (mLRConnectionHelperRemove != null) {
            detailedLog(mLRConnectionHelperRemove.macAddress, "close()");
        }
        synchronized (this.sendFutures) {
            arrayList = new ArrayList(this.sendFutures.values());
            this.sendFutures.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((FutureHolder) it.next()).future.setException(new MultiLinkClosedException("Connection closed"));
        }
        ArrayList arrayList3 = new ArrayList();
        synchronized (this.serviceHandles) {
            arrayList2 = new ArrayList(this.serviceHandles);
            this.serviceHandles.clear();
            arrayList3.addAll(this.sendConfigureTimers.values());
            this.sendConfigureTimers.clear();
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            ((Timer) it3.next()).cancel();
        }
        for (Integer num : arrayList2) {
            d dVar = this.watchDog;
            if (dVar != null) {
                dVar.a(num.intValue());
            }
            mlrCloseConnection(num.intValue(), this.mlrConnectionId);
        }
    }

    public void onCloseHandle(int i14) {
        boolean zRemove;
        Timer timerRemove;
        SettableFuture<Void> settableFuture;
        detailedLog(this.macAddress, j.h(i14, "onCloseHandle: handle:"));
        synchronized (this.serviceHandles) {
            zRemove = this.serviceHandles.remove(Integer.valueOf(i14));
            timerRemove = this.sendConfigureTimers.remove(Integer.valueOf(i14));
        }
        if (timerRemove != null) {
            timerRemove.cancel();
        }
        if (zRemove) {
            mlrCloseConnection(i14, this.mlrConnectionId);
            d dVar = this.watchDog;
            if (dVar != null) {
                dVar.a(i14);
            }
        }
        synchronized (this.sendFutures) {
            try {
                Iterator it = new HashSet(this.sendFutures.keySet()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        settableFuture = null;
                        break;
                    }
                    Integer num = (Integer) it.next();
                    num.intValue();
                    FutureHolder futureHolder = this.sendFutures.get(num);
                    if (futureHolder != null && futureHolder.handle == i14) {
                        settableFuture = futureHolder.future;
                        this.sendFutures.remove(num);
                        break;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (settableFuture != null) {
            settableFuture.setException(new MultiLinkClosedException("Handle closed"));
        }
    }

    public int onOpenHandle(int i14, int i15, int i16) {
        Timer timerRemove;
        String str = String.format("%02X", Integer.valueOf(i15));
        synchronized (this.serviceHandles) {
            try {
                if (!this.serviceHandles.add(Integer.valueOf(i14))) {
                    logError(this.macAddress, "onOpenHandle already open: service:" + str + ", handle:" + i14);
                }
                if (i15 != 2) {
                    this.sendConfigureTimers.put(Integer.valueOf(i14), new Timer());
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        detailedLog(this.macAddress, "onOpenHandle: service:" + str + ", handle:" + i14);
        int iMlrOpenConnection = mlrOpenConnection(i14, this.mlrConnectionId, i16);
        if (iMlrOpenConnection != 0) {
            synchronized (this.serviceHandles) {
                this.serviceHandles.remove(Integer.valueOf(i14));
                timerRemove = this.sendConfigureTimers.remove(Integer.valueOf(i14));
            }
            if (timerRemove != null) {
                timerRemove.cancel();
            }
            String str2 = this.macAddress;
            StringBuilder sbK = androidx.core.view.j.k(i14, "onOpenHandle: service:", str, ", handle:", ", failed:");
            sbK.append(iMlrOpenConnection);
            logError(str2, sbK.toString());
            return iMlrOpenConnection;
        }
        detailedLog(this.macAddress, t.e(i14, "onOpenHandle: service:", str, ", handle:", ", success"));
        d dVar = this.watchDog;
        if (dVar != null) {
            Logger logger = dVar.f119317d;
            az2.a<Integer, d.C2269d> aVar = dVar.f119318e;
            if (aVar.f13782a.containsKey(Integer.valueOf(i14))) {
                logger.warn("Service with handle " + i14 + " is already being monitored.");
                return iMlrOpenConnection;
            }
            if (m.f119396c.contains(Integer.valueOf(i15))) {
                aVar.put(Integer.valueOf(i14), new d.C2269d(i15, dVar.f119315b));
                logger.info("Started monitoring service " + i15 + " with handle " + i14);
            }
        }
        return iMlrOpenConnection;
    }

    public void receiveRawPacket(byte[] bArr) {
        boolean zContains;
        byte b14 = bArr[0];
        int i14 = b14 & UnsignedBytes.MAX_VALUE;
        if ((b14 & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
            this.dataCallback.accept(Integer.valueOf(i14), Arrays.copyOfRange(bArr, 1, bArr.length));
            return;
        }
        int i15 = (((b14 & 112) >> 4) | 128) & 255;
        synchronized (this.serviceHandles) {
            zContains = this.serviceHandles.contains(Integer.valueOf(i15));
        }
        if (zContains) {
            mlrReceiveRawPacket(this.mlrConnectionId, bArr);
        } else {
            this.dataCallback.accept(Integer.valueOf(i14), Arrays.copyOfRange(bArr, 1, bArr.length));
        }
    }

    public ListenableFuture<Void> sendDataBlob(int i14, byte[] bArr) {
        Timer timer;
        SettableFuture settableFutureCreate = SettableFuture.create();
        int iIncrementAndGet = this.transactionId.incrementAndGet();
        synchronized (this.sendFutures) {
            this.sendFutures.put(Integer.valueOf(iIncrementAndGet), new FutureHolder(i14, settableFutureCreate));
        }
        synchronized (this.serviceHandles) {
            timer = this.sendConfigureTimers.get(Integer.valueOf(i14));
        }
        if (timer == null) {
            String str = this.macAddress;
            StringBuilder sbJ = e5.j(iIncrementAndGet, i14, "sendDataBlob: transaction:", ", handle:", ", size:");
            sbJ.append(bArr.length);
            detailedLog(str, sbJ.toString());
        } else {
            String strA = bArr.length <= 30 ? dz2.c.a(bArr) : j.q(new StringBuilder("[size:"), bArr.length, "]");
            String str2 = this.macAddress;
            StringBuilder sbK = androidx.core.view.j.k(iIncrementAndGet, "sendDataBlob: configure:", strA, ", transaction:", ", handle:");
            sbK.append(i14);
            detailedLog(str2, sbK.toString());
            try {
                timer.schedule(new AnonymousClass1(i14), 10000L);
            } catch (Throwable th3) {
                logError(this.macAddress, "fallback timer failed: " + th3.getMessage());
            }
        }
        int iMlrSendDataBlob = mlrSendDataBlob(i14, this.mlrConnectionId, bArr, iIncrementAndGet);
        if (iMlrSendDataBlob != 0) {
            synchronized (this.sendFutures) {
                this.sendFutures.remove(Integer.valueOf(iIncrementAndGet));
            }
            detailedLog(this.macAddress, k.e(iMlrSendDataBlob, iIncrementAndGet, "sendDataBlob failed: status:", ", transaction:"));
            settableFutureCreate.setException(new MultiLinkException(j.h(iMlrSendDataBlob, "Reliable write: sendDataBlob failed status:")));
        } else if (timer != null) {
            detailedLog(this.macAddress, j.h(i14, "sendDataBlob: configure: success: handle:"));
        }
        return settableFutureCreate;
    }

    public MLRConnectionHelper(i0 i0Var, String str, int i14, BiConsumer<Integer, byte[]> biConsumer) {
        this(i0Var, str, i14, biConsumer, null);
    }
}
