package com.xiaomi.process;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import com.miui.circulate.device.api.Constant;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.smarthome.frame.process.ProcessUtil;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.common.util.CloseUtils;
import com.xiaomi.smarthome.utils.LiveUpdateWatcher;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000fB\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0002J!\u0010\n\u001a\u0004\u0018\u0001H\u000b\"\u0004\b\u0000\u0010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\r¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/process/ProcessDataShareManager;", "Lcom/xiaomi/smarthome/utils/LiveUpdateWatcher;", "Lcom/xiaomi/process/CacheData;", "Landroid/os/IBinder$DeathRecipient;", "()V", "singleDispatcher", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "binderDied", "", "initData", "select", "T", Constant.KeyValue.KEY_COLUMN, "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "Companion", "smarthome-utils_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ProcessDataShareManager extends LiveUpdateWatcher<CacheData> implements IBinder.DeathRecipient {

    @NotNull
    private static final String ACTION_REQUESTPROXY = "ProcessDataShareManager_create";

    @NotNull
    private static final String ACTION_RESPONSEBINDER = "ProcessDataShareManager_binder";

    @NotNull
    private static final String TAG = "ProcessDataShareManager";

    @NotNull
    private final ExecutorCoroutineDispatcher singleDispatcher;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<ProcessDataShareManager> instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0<ProcessDataShareManager>() { // from class: com.xiaomi.process.ProcessDataShareManager$Companion$instance$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ProcessDataShareManager invoke() {
            return new ProcessDataShareManager(null);
        }
    });

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R!\u0010\u0007\u001a\u00020\b8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/process/ProcessDataShareManager$Companion;", "", "()V", "ACTION_REQUESTPROXY", "", "ACTION_RESPONSEBINDER", "TAG", "instance", "Lcom/xiaomi/process/ProcessDataShareManager;", "getInstance$annotations", "getInstance", "()Lcom/xiaomi/process/ProcessDataShareManager;", "instance$delegate", "Lkotlin/Lazy;", "smarthome-utils_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getInstance$annotations() {
        }

        @NotNull
        public final ProcessDataShareManager getInstance() {
            return (ProcessDataShareManager) ProcessDataShareManager.instance$delegate.getValue();
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.process.ProcessDataShareManager$initData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.process.ProcessDataShareManager$initData$1", f = "ProcessDataShareManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C34321 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C34321(Continuation<? super C34321> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ProcessDataShareManager.this.new C34321(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            FileLock fileLock;
            RandomAccessFile randomAccessFile;
            boolean z = true;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (ProcessDataShareManager.this.getMCache() == null) {
                try {
                    Context appContext = MiJiaEnvironment.getAppContext();
                    File file = new File(appContext.getCacheDir(), "ProcessDataShareManager.lock");
                    try {
                        if (!file.exists()) {
                            file.createNewFile();
                        }
                    } catch (IOException unused) {
                    }
                    FileLock fileLockLock = null;
                    try {
                        randomAccessFile = new RandomAccessFile(file, "rwd");
                        try {
                            FileChannel channel = randomAccessFile.getChannel();
                            try {
                                fileLockLock = channel.lock();
                                Intrinsics.stringPlus("createData flock ", file);
                                long j = 0;
                                int i = randomAccessFile.length() == 0 ? -1 : randomAccessFile.readInt();
                                String currentProcessName = ProcessUtil.getCurrentProcessName(appContext);
                                Object systemService = appContext.getSystemService(LifecycleConstantKt.TYPE_ACTIVITY);
                                if (systemService == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
                                }
                                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) systemService).getRunningAppProcesses()) {
                                    if (i == runningAppProcessInfo.pid) {
                                        CloseUtils.closeIO(channel, fileLockLock, randomAccessFile);
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("request type_proxy ");
                                        sb.append(i);
                                        sb.append(' ');
                                        sb.append((Object) currentProcessName);
                                        sb.append(' ');
                                        sb.append(runningAppProcessInfo.importance);
                                        sb.append(' ');
                                        if (ProcessDataShareManager.this.getMCache() == null) {
                                            z = false;
                                        }
                                        sb.append(z);
                                        if (ProcessDataShareManager.this.getMCache() == null) {
                                            appContext.sendBroadcast(new Intent(ProcessDataShareManager.ACTION_REQUESTPROXY).setPackage(appContext.getPackageName()));
                                        }
                                        return Unit.INSTANCE;
                                    }
                                    j = 0;
                                }
                                randomAccessFile.seek(j);
                                randomAccessFile.writeInt(Process.myPid());
                                CacheData cacheData = new CacheData();
                                CloseUtils.closeIO(channel, fileLockLock, randomAccessFile);
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("createData success ");
                                sb2.append(i);
                                sb2.append(' ');
                                sb2.append((Object) currentProcessName);
                                ProcessDataShareManager.this.dispatchUpdate(cacheData);
                                appContext.sendBroadcast(new Intent(ProcessDataShareManager.ACTION_RESPONSEBINDER).putExtra(ProcessDataShareManager.TAG, cacheData).setPackage(appContext.getPackageName()));
                            } catch (Exception unused2) {
                                fileLock = fileLockLock;
                                fileLockLock = channel;
                                CloseUtils.closeIO(fileLockLock, fileLock, randomAccessFile);
                                return Unit.INSTANCE;
                            }
                        } catch (Exception unused3) {
                            fileLock = null;
                        }
                    } catch (Exception unused4) {
                        fileLock = null;
                        randomAccessFile = null;
                    }
                } catch (Throwable unused5) {
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C34321) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public /* synthetic */ ProcessDataShareManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public static final ProcessDataShareManager getInstance() {
        return INSTANCE.getInstance();
    }

    private final void initData() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.singleDispatcher), null, null, new C34321(null), 3, null);
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        Intrinsics.stringPlus("binderDied ", ProcessUtil.getCurrentProcessName(MiJiaEnvironment.getAppContext()));
        setMCache(null);
        initData();
    }

    @Nullable
    public final <T> T select(@NotNull Class<T> k2) {
        Map<String, IInterface> cache;
        Intrinsics.checkNotNullParameter(k2, "k");
        CacheData mCache = getMCache();
        if (mCache == null || (cache = mCache.getCache()) == null) {
            return null;
        }
        return (T) cache.get(k2.getName());
    }

    private ProcessDataShareManager() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor()");
        this.singleDispatcher = ExecutorsKt.from(executorServiceNewSingleThreadExecutor);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ACTION_RESPONSEBINDER);
        intentFilter.addAction(ACTION_REQUESTPROXY);
        final Context appContext = MiJiaEnvironment.getAppContext();
        appContext.registerReceiver(new BroadcastReceiver() { // from class: com.xiaomi.process.ProcessDataShareManager.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(@NotNull Context context, @NotNull Intent intent) {
                Map<String, IInterface> cache;
                Map<String, IInterface> cache2;
                Map<String, IInterface> cache3;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(intent, "intent");
                Integer numValueOf = null;
                if (Intrinsics.areEqual(intent.getAction(), ProcessDataShareManager.ACTION_REQUESTPROXY)) {
                    CacheData mCache = ProcessDataShareManager.this.getMCache();
                    if (mCache != null && mCache.getType() == 1) {
                        appContext.sendBroadcast(new Intent(ProcessDataShareManager.ACTION_RESPONSEBINDER).putExtra(ProcessDataShareManager.TAG, mCache).setPackage(appContext.getPackageName()));
                        StringBuilder sb = new StringBuilder();
                        sb.append("response binderImpl ");
                        CacheData mCache2 = ProcessDataShareManager.this.getMCache();
                        if (mCache2 != null && (cache3 = mCache2.getCache()) != null) {
                            numValueOf = Integer.valueOf(cache3.size());
                        }
                        sb.append(numValueOf);
                        sb.append(' ');
                        sb.append((Object) ProcessUtil.getCurrentProcessName(appContext));
                        return;
                    }
                    return;
                }
                if (Intrinsics.areEqual(intent.getAction(), ProcessDataShareManager.ACTION_RESPONSEBINDER) && ProcessDataShareManager.this.getMCache() == null) {
                    try {
                        ProcessDataShareManager.this.dispatchUpdate((CacheData) intent.getParcelableExtra(ProcessDataShareManager.TAG));
                        CacheData mCache3 = ProcessDataShareManager.this.getMCache();
                        if (mCache3 != null && (cache2 = mCache3.getCache()) != null) {
                            ProcessDataShareManager processDataShareManager = ProcessDataShareManager.this;
                            Context context2 = appContext;
                            Iterator<Map.Entry<String, IInterface>> it = cache2.entrySet().iterator();
                            while (it.hasNext()) {
                                try {
                                    it.next().getValue().asBinder().linkToDeath(processDataShareManager, 0);
                                } catch (RemoteException e) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("onReceive binderProxy ");
                                    sb2.append(Log.getStackTraceString(e));
                                    sb2.append(' ');
                                    sb2.append((Object) ProcessUtil.getCurrentProcessName(context2));
                                }
                            }
                        }
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("onReceive binderProxy ");
                        CacheData mCache4 = ProcessDataShareManager.this.getMCache();
                        if (mCache4 != null && (cache = mCache4.getCache()) != null) {
                            numValueOf = Integer.valueOf(cache.size());
                        }
                        sb3.append(numValueOf);
                        sb3.append(' ');
                        sb3.append((Object) ProcessUtil.getCurrentProcessName(appContext));
                    } catch (Throwable unused) {
                        Intrinsics.stringPlus("onReceive error ", intent);
                    }
                }
            }
        }, intentFilter);
        initData();
    }
}
