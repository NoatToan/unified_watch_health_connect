package com.xiaomi.fitness.common.handler;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.xiaomi.fitness.common.log.Logger;
import defpackage.e2p;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u000b\f\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/common/handler/JobHandlerProvider;", "", "<init>", "()V", "TAG", "", "sWorkerName", "newJobHandler", "Lcom/xiaomi/fitness/common/handler/IJobHandler;", "callback", "Landroid/os/Handler$Callback;", "ILooperLoader", "LooperLoader", "InnerJobHandler", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JobHandlerProvider {

    @NotNull
    public static final JobHandlerProvider INSTANCE = new JobHandlerProvider();

    @NotNull
    private static final String TAG = "JobHandlerProvider";

    @NotNull
    private static final String sWorkerName = "job-hdl";

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/common/handler/JobHandlerProvider$ILooperLoader;", "", "obtain", "Landroid/os/Looper;", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ILooperLoader {
        @Nullable
        Looper obtain();
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/common/handler/JobHandlerProvider$InnerJobHandler;", "Lcom/xiaomi/fitness/common/handler/IJobHandler;", "Landroid/os/Handler;", "newJob", "()Landroid/os/Handler;", "", "cancelJobs", "()V", "Lcom/xiaomi/fitness/common/handler/JobHandlerProvider$ILooperLoader;", "mLooper", "Lcom/xiaomi/fitness/common/handler/JobHandlerProvider$ILooperLoader;", "Landroid/os/Handler$Callback;", "mCallback", "Landroid/os/Handler$Callback;", "Le2p;", "mHandlerVar", "Le2p;", "<init>", "(Lcom/xiaomi/fitness/common/handler/JobHandlerProvider$ILooperLoader;Landroid/os/Handler$Callback;)V", "common_release"}, k = 1, mv = {2, 0, 0})
    public static final class InnerJobHandler implements IJobHandler {

        @Nullable
        private final Handler.Callback mCallback;

        @NotNull
        private final e2p<Handler> mHandlerVar;

        @NotNull
        private final ILooperLoader mLooper;

        public InnerJobHandler(@NotNull ILooperLoader mLooper, @Nullable Handler.Callback callback) {
            Intrinsics.checkNotNullParameter(mLooper, "mLooper");
            this.mLooper = mLooper;
            this.mCallback = callback;
            this.mHandlerVar = new e2p<Handler>() { // from class: com.xiaomi.fitness.common.handler.JobHandlerProvider$InnerJobHandler$mHandlerVar$1
                @Override // defpackage.unq
                public Handler constructor() {
                    Looper looperObtain = this.this$0.mLooper.obtain();
                    Handler handler = looperObtain != null ? new Handler(looperObtain, this.this$0.mCallback) : null;
                    Intrinsics.checkNotNull(handler);
                    return handler;
                }
            };
        }

        @Override // com.xiaomi.fitness.common.handler.IJobHandler
        public void cancelJobs() {
            Handler handlerPeek = this.mHandlerVar.peek();
            if (handlerPeek != null) {
                handlerPeek.removeCallbacksAndMessages(null);
            }
        }

        @Override // com.xiaomi.fitness.common.handler.IJobHandler
        @NotNull
        public Handler newJob() {
            Handler handler = this.mHandlerVar.get();
            Intrinsics.checkNotNullExpressionValue(handler, "get(...)");
            return handler;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/common/handler/JobHandlerProvider$LooperLoader;", "Lcom/xiaomi/fitness/common/handler/JobHandlerProvider$ILooperLoader;", "<init>", "()V", "mLooperImpl", "Landroid/os/Looper;", "getMLooperImpl", "()Landroid/os/Looper;", "setMLooperImpl", "(Landroid/os/Looper;)V", "obtain", "Companion", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LooperLoader implements ILooperLoader {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private static final int KEEP_LOOPER_SIZE;
        private static int sOptCount;

        @NotNull
        private static final ArrayList<Looper> sPool;

        @Nullable
        private Looper mLooperImpl;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000e\u001a\u00020\nJ\u0006\u0010\u000f\u001a\u00020\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/common/handler/JobHandlerProvider$LooperLoader$Companion;", "", "<init>", "()V", "KEEP_LOOPER_SIZE", "", "getKEEP_LOOPER_SIZE", "()I", "sPool", "Ljava/util/ArrayList;", "Landroid/os/Looper;", "getSPool", "()Ljava/util/ArrayList;", "sOptCount", "obtainLooper", "createNewLooper", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final Looper createNewLooper() {
                HandlerThread handlerThread = new HandlerThread(JobHandlerProvider.sWorkerName, 9);
                handlerThread.start();
                Looper looper = handlerThread.getLooper();
                Intrinsics.checkNotNullExpressionValue(looper, "getLooper(...)");
                return looper;
            }

            public final int getKEEP_LOOPER_SIZE() {
                return LooperLoader.KEEP_LOOPER_SIZE;
            }

            @NotNull
            public final ArrayList<Looper> getSPool() {
                return LooperLoader.sPool;
            }

            @NotNull
            public final Looper obtainLooper() {
                synchronized (getSPool()) {
                    Looper looperMyLooper = Looper.myLooper();
                    if (looperMyLooper == null) {
                        Companion companion = LooperLoader.INSTANCE;
                        if (!companion.getSPool().isEmpty()) {
                            Looper looper = companion.getSPool().get(0);
                            Intrinsics.checkNotNullExpressionValue(looper, "get(...)");
                            return looper;
                        }
                    }
                    Companion companion2 = LooperLoader.INSTANCE;
                    ArrayList arrayList = new ArrayList(companion2.getKEEP_LOOPER_SIZE());
                    Iterator<Looper> it = companion2.getSPool().iterator();
                    Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                    while (it.hasNext()) {
                        Looper next = it.next();
                        Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                        Looper looper2 = next;
                        if (!Intrinsics.areEqual(looperMyLooper, looper2)) {
                            arrayList.add(looper2);
                        }
                    }
                    Companion companion3 = LooperLoader.INSTANCE;
                    if (companion3.getSPool().size() < companion3.getKEEP_LOOPER_SIZE() || arrayList.isEmpty()) {
                        Looper looperCreateNewLooper = companion3.createNewLooper();
                        companion3.getSPool().add(looperCreateNewLooper);
                        Logger.INSTANCE.v(JobHandlerProvider.TAG, "new worker: %s", looperCreateNewLooper);
                        return looperCreateNewLooper;
                    }
                    LooperLoader.sOptCount++;
                    int size = arrayList.size();
                    Looper looper3 = (Looper) arrayList.get(size != 1 ? LooperLoader.sOptCount % size : 0);
                    Logger.INSTANCE.v(JobHandlerProvider.TAG, "opt loop: %s = %s", looper3, Integer.valueOf(LooperLoader.sOptCount));
                    return looper3;
                }
            }
        }

        static {
            int iMax = Math.max(3, Runtime.getRuntime().availableProcessors() / 3);
            KEEP_LOOPER_SIZE = iMax;
            sPool = new ArrayList<>(iMax);
        }

        @Nullable
        public final Looper getMLooperImpl() {
            return this.mLooperImpl;
        }

        @Override // com.xiaomi.fitness.common.handler.JobHandlerProvider.ILooperLoader
        @Nullable
        public Looper obtain() {
            if (this.mLooperImpl == null) {
                this.mLooperImpl = INSTANCE.obtainLooper();
            }
            return this.mLooperImpl;
        }

        public final void setMLooperImpl(@Nullable Looper looper) {
            this.mLooperImpl = looper;
        }
    }

    private JobHandlerProvider() {
    }

    public static /* synthetic */ IJobHandler newJobHandler$default(JobHandlerProvider jobHandlerProvider, Handler.Callback callback, int i, Object obj) {
        if ((i & 1) != 0) {
            callback = null;
        }
        return jobHandlerProvider.newJobHandler(callback);
    }

    @JvmOverloads
    @NotNull
    public final IJobHandler newJobHandler() {
        return newJobHandler$default(this, null, 1, null);
    }

    @JvmOverloads
    @NotNull
    public final IJobHandler newJobHandler(@Nullable Handler.Callback callback) {
        return new InnerJobHandler(new LooperLoader(), callback);
    }
}
