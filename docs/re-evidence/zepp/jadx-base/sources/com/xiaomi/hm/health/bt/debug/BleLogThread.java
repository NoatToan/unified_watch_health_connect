package com.xiaomi.hm.health.bt.debug;

import android.os.StatFs;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 *2\u00020\u0001:\u0001*B\u001d\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b(\u0010)J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0006\u0010\u0007\u001a\u00020\u0002R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001a\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\t\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0016\u0010\"\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u0014R\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lcom/xiaomi/hm/health/bt/debug/BleLogThread;", "Ljava/lang/Thread;", "", "c", "", "b", "run", "notifyRun", "", "a", "Ljava/lang/String;", "mLogPath", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lcom/xiaomi/hm/health/bt/debug/BleLogAction;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "cacheLogQueue", "Ljava/lang/Object;", "Ljava/lang/Object;", "mSync", GoogleApiAvailabilityLight.a, "Z", "mIsRunning", "Lcom/xiaomi/hm/health/bt/debug/BleLoggerWriter;", "e", "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/bt/debug/BleLoggerWriter;", "mBleLoggerWriter", "", "f", "J", "mLastTime", "g", "mLastWriteTime", "h", "mIsCanWriteToSd", "", "Lcom/xiaomi/hm/health/bt/debug/BleLogWriteAction;", "i", "Ljava/util/List;", "mCacheLogList", "<init>", "(Ljava/lang/String;Ljava/util/concurrent/ConcurrentLinkedQueue;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class BleLogThread extends Thread {
    private static final int j = 50;
    private static final int k = 2000;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String mLogPath;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ConcurrentLinkedQueue<BleLogAction> cacheLogQueue;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean mIsRunning;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private long mLastTime;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private long mLastWriteTime;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean mIsCanWriteToSd;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Object mSync = new Object();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy mBleLoggerWriter = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final List<BleLogWriteAction> mCacheLogList = new ArrayList();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/debug/BleLoggerWriter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<BleLoggerWriter> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BleLoggerWriter invoke() {
            return new BleLoggerWriter(BleLogThread.this.mLogPath, 0L, 2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() throws InterruptedException {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() throws InterruptedException {
            BleLogThread.this.mIsRunning = false;
            BleLogThread.this.mSync.wait();
            BleLogThread.this.mIsRunning = true;
        }
    }

    public BleLogThread(@NotNull String str, @NotNull ConcurrentLinkedQueue<BleLogAction> concurrentLinkedQueue) {
        this.mLogPath = str;
        this.cacheLogQueue = concurrentLinkedQueue;
    }

    private final BleLoggerWriter a() {
        return (BleLoggerWriter) this.mBleLoggerWriter.getValue();
    }

    private final boolean b() {
        try {
            StatFs statFs = new StatFs(this.mLogPath);
            return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize()) > 52428800;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    private final void c() {
        if (this.mCacheLogList.isEmpty()) {
            this.mLastWriteTime = System.currentTimeMillis();
            return;
        }
        if (System.currentTimeMillis() - this.mLastTime > 60000) {
            this.mLastTime = System.currentTimeMillis();
            this.mIsCanWriteToSd = b();
        }
        if (!this.mIsCanWriteToSd) {
            this.mCacheLogList.clear();
            return;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<T> it2 = this.mCacheLogList.iterator();
        while (it2.hasNext()) {
            sb.append(((BleLogWriteAction) it2.next()).getLogInfo());
        }
        this.mCacheLogList.clear();
        try {
            a().write(BleLogEncrypt.INSTANCE.getInstance().encrypt(sb.toString()));
        } catch (Exception unused) {
        }
        this.mLastWriteTime = System.currentTimeMillis();
    }

    public final void notifyRun() {
        if (this.mIsRunning) {
            return;
        }
        synchronized (this.mSync) {
            this.mSync.notify();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0053 */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        Unit unit;
        super.run();
        while (true) {
            synchronized (this.mSync) {
                this.mIsRunning = true;
                BleLogAction bleLogActionPoll = this.cacheLogQueue.poll();
                if (bleLogActionPoll == null) {
                    unit = null;
                } else {
                    if (bleLogActionPoll instanceof BleLogWriteAction) {
                        this.mCacheLogList.add((BleLogWriteAction) bleLogActionPoll);
                    }
                    if (this.mLastWriteTime > 0 && System.currentTimeMillis() - this.mLastWriteTime >= 2000) {
                        c();
                    }
                    if (this.mCacheLogList.size() >= 50) {
                        c();
                    }
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    new b().invoke();
                }
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }
}
