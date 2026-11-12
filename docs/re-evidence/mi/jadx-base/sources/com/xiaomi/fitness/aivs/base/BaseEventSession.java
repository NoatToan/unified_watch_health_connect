package com.xiaomi.fitness.aivs.base;

import android.os.Handler;
import com.xiaomi.fitness.aivs.base.BaseEventSession;
import com.xiaomi.fitness.common.utils.AppUtil;
import defpackage.s9l;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\r\b&\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010*\u001a\u00020+J\u0006\u0010,\u001a\u00020+J\n\u0010-\u001a\u0004\u0018\u00010\u001cH\u0002J\u0010\u0010.\u001a\u00020+2\b\u0010/\u001a\u0004\u0018\u00010\u001cJ\b\u00100\u001a\u00020+H\u0016J\u0006\u00102\u001a\u00020+J\b\u00103\u001a\u00020+H\u0016J\b\u00104\u001a\u00020+H&J\b\u00105\u001a\u00020+H&J\u0012\u00106\u001a\u0004\u0018\u00010\u001c2\u0006\u00107\u001a\u00020\u001cH&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0017\"\u0004\b)\u0010\u0019R\u000e\u00101\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/xiaomi/fitness/aivs/base/BaseEventSession;", "Ljava/lang/Thread;", "did", "", "sessionId", "", "aivsService", "Lcom/xiaomi/fitness/aivs/base/BaseAivsService;", "<init>", "(Ljava/lang/String;BLcom/xiaomi/fitness/aivs/base/BaseAivsService;)V", "getDid", "()Ljava/lang/String;", "getSessionId", "()B", "getAivsService", "()Lcom/xiaomi/fitness/aivs/base/BaseAivsService;", "mLock", "", "getMLock", "()Ljava/lang/Object;", "sessionFinished", "", "getSessionFinished", "()Z", "setSessionFinished", "(Z)V", "dataQueue", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "", "getDataQueue", "()Ljava/util/concurrent/ConcurrentLinkedQueue;", "setDataQueue", "(Ljava/util/concurrent/ConcurrentLinkedQueue;)V", "lock", "Ljava/util/concurrent/CountDownLatch;", "getLock", "()Ljava/util/concurrent/CountDownLatch;", "setLock", "(Ljava/util/concurrent/CountDownLatch;)V", "audioInputStopped", "getAudioInputStopped", "setAudioInputStopped", "finish", "", "stopInput", "read", "write", "bytes", "interrupt", "fileName", "resetFileName", "run", "createDecoder", "destroyDecoder", "decodePcmData", "data", "aivs_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseEventSession extends Thread {

    @NotNull
    private final BaseAivsService aivsService;
    private boolean audioInputStopped;

    @NotNull
    private ConcurrentLinkedQueue<byte[]> dataQueue;

    @NotNull
    private final String did;

    @NotNull
    private String fileName;

    @Nullable
    private volatile CountDownLatch lock;

    @NotNull
    private final Object mLock;
    private boolean sessionFinished;
    private final byte sessionId;

    public BaseEventSession(@NotNull String did, byte b2, @NotNull BaseAivsService aivsService) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(aivsService, "aivsService");
        this.did = did;
        this.sessionId = b2;
        this.aivsService = aivsService;
        this.mLock = new Object();
        this.dataQueue = new ConcurrentLinkedQueue<>();
        this.fileName = "";
    }

    private final byte[] read() {
        return this.dataQueue.poll();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void run$lambda$0(BaseEventSession this$0) {
        BaseAivsSpeechRecognizerManager mSpeechRecognizerManager;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseAivsSpeechRecognizerManager mSpeechRecognizerManager2 = this$0.aivsService.getMSpeechRecognizerManager();
        if (!Intrinsics.areEqual(this$0, mSpeechRecognizerManager2 != null ? mSpeechRecognizerManager2.getMEventSession() : null) || (mSpeechRecognizerManager = this$0.aivsService.getMSpeechRecognizerManager()) == null) {
            return;
        }
        mSpeechRecognizerManager.stopAudioInput();
    }

    public abstract void createDecoder();

    @Nullable
    public abstract byte[] decodePcmData(@NotNull byte[] data);

    public abstract void destroyDecoder();

    public final void finish() {
        if (!this.audioInputStopped) {
            stopInput();
        }
        this.sessionFinished = true;
    }

    @NotNull
    public final BaseAivsService getAivsService() {
        return this.aivsService;
    }

    public final boolean getAudioInputStopped() {
        return this.audioInputStopped;
    }

    @NotNull
    public final ConcurrentLinkedQueue<byte[]> getDataQueue() {
        return this.dataQueue;
    }

    @NotNull
    public final String getDid() {
        return this.did;
    }

    @Nullable
    public final CountDownLatch getLock() {
        return this.lock;
    }

    @NotNull
    public final Object getMLock() {
        return this.mLock;
    }

    public final boolean getSessionFinished() {
        return this.sessionFinished;
    }

    public final byte getSessionId() {
        return this.sessionId;
    }

    @Override // java.lang.Thread
    public void interrupt() {
        try {
            super.interrupt();
        } catch (Exception e) {
            e.printStackTrace();
        }
        CountDownLatch countDownLatch = this.lock;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        this.dataQueue.clear();
    }

    public final void resetFileName() {
        this.fileName = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Handler handler;
        Runnable runnable;
        while (!Thread.interrupted()) {
            try {
                try {
                    byte[] bArr = read();
                    if (bArr != null) {
                        if (!(bArr.length == 0)) {
                            byte[] bArrDecodePcmData = decodePcmData(bArr);
                            if (bArrDecodePcmData != null) {
                                if (AppUtil.INSTANCE.isDevChannel() && this.fileName.length() > 0) {
                                    new Thread(new s9l(this.fileName, "pcmdata", bArrDecodePcmData)).start();
                                }
                                if (!this.aivsService.postData(bArrDecodePcmData, 0, bArrDecodePcmData.length, false)) {
                                    break;
                                }
                            }
                        }
                    }
                    this.lock = new CountDownLatch(1);
                    CountDownLatch countDownLatch = this.lock;
                    Intrinsics.checkNotNull(countDownLatch);
                    countDownLatch.await();
                } catch (Exception e) {
                    e.printStackTrace();
                    this.aivsService.postData(null, 0, 0, true);
                    handler = this.aivsService.getHandler();
                    if (handler == null) {
                        return;
                    } else {
                        runnable = new Runnable() { // from class: k72
                            @Override // java.lang.Runnable
                            public final void run() {
                                BaseEventSession.run$lambda$0(this.f23539a);
                            }
                        };
                    }
                }
            } catch (Throwable th) {
                this.aivsService.postData(null, 0, 0, true);
                Handler handler2 = this.aivsService.getHandler();
                if (handler2 != null) {
                    handler2.post(new Runnable() { // from class: k72
                        @Override // java.lang.Runnable
                        public final void run() {
                            BaseEventSession.run$lambda$0(this.f23539a);
                        }
                    });
                }
                throw th;
            }
        }
        this.aivsService.postData(null, 0, 0, true);
        handler = this.aivsService.getHandler();
        if (handler != null) {
            runnable = new Runnable() { // from class: k72
                @Override // java.lang.Runnable
                public final void run() {
                    BaseEventSession.run$lambda$0(this.f23539a);
                }
            };
            handler.post(runnable);
        }
    }

    public final void setAudioInputStopped(boolean z) {
        this.audioInputStopped = z;
    }

    public final void setDataQueue(@NotNull ConcurrentLinkedQueue<byte[]> concurrentLinkedQueue) {
        Intrinsics.checkNotNullParameter(concurrentLinkedQueue, "<set-?>");
        this.dataQueue = concurrentLinkedQueue;
    }

    public final void setLock(@Nullable CountDownLatch countDownLatch) {
        this.lock = countDownLatch;
    }

    public final void setSessionFinished(boolean z) {
        this.sessionFinished = z;
    }

    public final void stopInput() {
        interrupt();
        this.audioInputStopped = true;
        destroyDecoder();
    }

    public final void write(@Nullable byte[] bytes) {
        if (this.audioInputStopped) {
            return;
        }
        if (AppUtil.INSTANCE.isDevChannel() && this.fileName.length() > 0) {
            new Thread(new s9l(this.fileName, "opusdata", bytes)).start();
        }
        this.dataQueue.offer(bytes);
        CountDownLatch countDownLatch = this.lock;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public /* synthetic */ BaseEventSession(String str, byte b2, BaseAivsService baseAivsService, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? (byte) 0 : b2, baseAivsService);
    }
}
