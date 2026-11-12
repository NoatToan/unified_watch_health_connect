package com.xiaomi.wearable.core.client;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.RemoteException;
import com.xiaomi.fitness.common.utils.FusionLocationRequest;
import com.xiaomi.wearable.core.CoreExtKt;
import com.xiaomi.wearable.core.b;
import com.xiaomi.wearable.core.client.LyraService;
import com.xiaomi.wearable.core.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n*\u0001-\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bA\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\u0015\u0010\u0011\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0014\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b/\u00100R\u001a\u00104\u001a\b\u0012\u0004\u0012\u000203028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00106\u001a\u0002038\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082T¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b;\u0010#R\u0014\u0010<\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b<\u0010#R\u0014\u0010=\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b=\u0010#R\u0014\u0010>\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b>\u0010#R\u0014\u0010?\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b?\u0010#R\u0014\u0010@\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b@\u0010#¨\u0006B"}, d2 = {"Lcom/xiaomi/wearable/core/client/LyraService;", "", "", "startBindServiceTimer", "()V", "stopBindServiceTimer", "", "state", "notifyServiceState", "(I)V", "bindReason", "Lcom/xiaomi/wearable/core/client/ServiceStateListener;", "serviceStateListener", "", "bindService", "(ILcom/xiaomi/wearable/core/client/ServiceStateListener;)Z", "unbindCoreService", "addServiceConnectionListener", "(Lcom/xiaomi/wearable/core/client/ServiceStateListener;)V", "removeServiceConnectionListener", "crashChecker", "()Z", "Ljava/util/ArrayList;", "connections", "Ljava/util/ArrayList;", "Lcom/xiaomi/wearable/core/e;", "miWearCore", "Lcom/xiaomi/wearable/core/e;", "getMiWearCore", "()Lcom/xiaomi/wearable/core/e;", "setMiWearCore", "(Lcom/xiaomi/wearable/core/e;)V", "isConnected", "Z", "bindServiceLimitTimes", "I", "Ljava/lang/Runnable;", "bindTimeoutRunnable", "Ljava/lang/Runnable;", "Landroid/os/IBinder$DeathRecipient;", "mBinderDeathRecipient$delegate", "Lkotlin/Lazy;", "getMBinderDeathRecipient", "()Landroid/os/IBinder$DeathRecipient;", "mBinderDeathRecipient", "com/xiaomi/wearable/core/client/LyraService$mConnection$2$1", "mConnection$delegate", "getMConnection", "()Lcom/xiaomi/wearable/core/client/LyraService$mConnection$2$1;", "mConnection", "Ljava/util/concurrent/CopyOnWriteArrayList;", "", "crashTimestamps", "Ljava/util/concurrent/CopyOnWriteArrayList;", "TIME_WINDOW", "J", "", "TAG", "Ljava/lang/String;", "BIND_START", "BIND_DIED", "BIND_LYRA_REPLACE", "BIND_TIMEOUT", "MAX_BINDER_DIED", "MAX_LYRA_SERVICE_BIND_TIMES", "<init>", "miwear-core_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nLyraService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LyraService.kt\ncom/xiaomi/wearable/core/client/LyraService\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,195:1\n1#2:196\n1863#3,2:197\n*S KotlinDebug\n*F\n+ 1 LyraService.kt\ncom/xiaomi/wearable/core/client/LyraService\n*L\n165#1:197,2\n*E\n"})
public final class LyraService {
    public static final int BIND_DIED = 2;
    public static final int BIND_LYRA_REPLACE = 3;
    public static final int BIND_START = 1;
    public static final int BIND_TIMEOUT = 4;
    private static final int MAX_BINDER_DIED = 6;
    private static final int MAX_LYRA_SERVICE_BIND_TIMES = 3;

    @NotNull
    private static final String TAG = "CoreServiceConnector";
    private static final long TIME_WINDOW = 300000;
    private static volatile int bindServiceLimitTimes;
    private static boolean isConnected;

    @Nullable
    private static volatile e miWearCore;

    @NotNull
    public static final LyraService INSTANCE = new LyraService();

    @NotNull
    private static final ArrayList<ServiceStateListener> connections = new ArrayList<>();

    @NotNull
    private static final Runnable bindTimeoutRunnable = new Runnable() { // from class: ewe
        @Override // java.lang.Runnable
        public final void run() {
            LyraService.bindTimeoutRunnable$lambda$0();
        }
    };

    /* JADX INFO: renamed from: mBinderDeathRecipient$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy mBinderDeathRecipient = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: fwe
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LyraService.mBinderDeathRecipient_delegate$lambda$2();
        }
    });

    /* JADX INFO: renamed from: mConnection$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy mConnection = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: gwe
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LyraService.mConnection_delegate$lambda$3();
        }
    });

    @NotNull
    private static final CopyOnWriteArrayList<Long> crashTimestamps = new CopyOnWriteArrayList<>();

    private LyraService() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindTimeoutRunnable$lambda$0() {
        if (isConnected || bindServiceLimitTimes >= 3) {
            return;
        }
        CoreExtKt.getLogger().i(TAG, "bind lyra service timeout");
        bindServiceLimitTimes++;
        INSTANCE.bindService(4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IBinder.DeathRecipient getMBinderDeathRecipient() {
        return (IBinder.DeathRecipient) mBinderDeathRecipient.getValue();
    }

    private final LyraService$mConnection$2$1 getMConnection() {
        return (LyraService$mConnection$2$1) mConnection.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IBinder.DeathRecipient mBinderDeathRecipient_delegate$lambda$2() {
        return new IBinder.DeathRecipient() { // from class: hwe
            @Override // android.os.IBinder.DeathRecipient
            public final void binderDied() {
                LyraService.mBinderDeathRecipient_delegate$lambda$2$lambda$1();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mBinderDeathRecipient_delegate$lambda$2$lambda$1() {
        CoreExtKt.getLogger().i(TAG, "binder died latestDied");
        LyraService lyraService = INSTANCE;
        lyraService.unbindCoreService();
        lyraService.stopBindServiceTimer();
        bindServiceLimitTimes = 0;
        if (lyraService.crashChecker()) {
            CoreExtKt.getLogger().i(TAG, "binderDied() state_disable");
            CoreExtKt.setLyraEnabled(false);
            CoreExtKt.setClearLyra(true);
            crashTimestamps.clear();
            lyraService.notifyServiceState(3);
        } else {
            isConnected = false;
            lyraService.notifyServiceState(2);
        }
        if (lyraService.bindService(2, null)) {
            return;
        }
        CoreExtKt.setLyraEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.xiaomi.wearable.core.client.LyraService$mConnection$2$1] */
    public static final LyraService$mConnection$2$1 mConnection_delegate$lambda$3() {
        return new ServiceConnection() { // from class: com.xiaomi.wearable.core.client.LyraService$mConnection$2$1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName name, IBinder service) {
                CoreExtKt.getLogger().i("CoreServiceConnector", "core service has been connected. clear " + CoreExtKt.getClearLyra());
                LyraService lyraService = LyraService.INSTANCE;
                lyraService.stopBindServiceTimer();
                LyraService.bindServiceLimitTimes = 0;
                try {
                    lyraService.setMiWearCore(b.a.asInterface(service).getMiWearCoreBinder());
                    CoreExtKt.getLogger().i("CoreServiceConnector", "onServiceConnected() permission checked: " + lyraService.getMiWearCore());
                    if (lyraService.getMiWearCore() != null) {
                        try {
                            e miWearCore2 = lyraService.getMiWearCore();
                            Intrinsics.checkNotNull(miWearCore2);
                            miWearCore2.asBinder().linkToDeath(lyraService.getMBinderDeathRecipient(), 1);
                        } catch (RemoteException e) {
                            CoreExtKt.getLogger().i("CoreServiceConnector", "link to death error " + e);
                            e.printStackTrace();
                        }
                        LyraService.isConnected = true;
                        if (!CoreExtKt.getClearLyra()) {
                            LyraService.INSTANCE.notifyServiceState(1);
                        } else {
                            LyraService.INSTANCE.notifyServiceState(4);
                            CoreExtKt.setClearLyra(false);
                        }
                    }
                } catch (DeadObjectException e2) {
                    e2.printStackTrace();
                }
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName name) {
                CoreExtKt.getLogger().i("CoreServiceConnector", "core service has been disconnected");
                LyraService.INSTANCE.stopBindServiceTimer();
                LyraService.bindServiceLimitTimes = 0;
                LyraService.isConnected = false;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyServiceState(int state) {
        Iterator<T> it = connections.iterator();
        while (it.hasNext()) {
            ((ServiceStateListener) it.next()).onCoreServiceState(state);
        }
    }

    private final void startBindServiceTimer() {
        CoreExtKt.getLogger().i(TAG, "startBindServiceTimer() called");
        com.xiaomi.wearable.CoreExtKt.getHandler().postDelayed(bindTimeoutRunnable, FusionLocationRequest.timeout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopBindServiceTimer() {
        CoreExtKt.getLogger().i(TAG, "stopBindServiceTimer() called");
        com.xiaomi.wearable.CoreExtKt.getHandler().removeCallbacks(bindTimeoutRunnable);
    }

    public final void addServiceConnectionListener(@NotNull ServiceStateListener serviceStateListener) {
        Intrinsics.checkNotNullParameter(serviceStateListener, "serviceStateListener");
        if (!CoreExtKt.getInLyra()) {
            isConnected = true;
            serviceStateListener.onCoreServiceState(1);
        }
        connections.add(serviceStateListener);
    }

    public final boolean bindService(int bindReason, @Nullable ServiceStateListener serviceStateListener) {
        stopBindServiceTimer();
        String strTargetPackageName = CoreExtKt.targetPackageName();
        if (serviceStateListener != null) {
            connections.add(serviceStateListener);
        }
        Intent intent = new Intent();
        intent.setPackage(strTargetPackageName);
        intent.setAction(strTargetPackageName + ".MiWearCoreService");
        boolean zBindService = com.xiaomi.wearable.CoreExtKt.getContext().bindService(intent, getMConnection(), 1);
        CoreExtKt.getLogger().i(TAG, "bindCoreService: " + bindReason + ", target package " + strTargetPackageName + ", bindResult " + zBindService);
        if (zBindService) {
            startBindServiceTimer();
        }
        return zBindService;
    }

    public final boolean crashChecker() {
        CopyOnWriteArrayList<Long> copyOnWriteArrayList;
        Logger logger = CoreExtKt.getLogger();
        CopyOnWriteArrayList<Long> copyOnWriteArrayList2 = crashTimestamps;
        Long l = copyOnWriteArrayList2.isEmpty() ^ true ? copyOnWriteArrayList2.get(0) : 0L;
        logger.i(TAG, "crashChecker() called start at " + l + ", times " + copyOnWriteArrayList2.size());
        long jCurrentTimeMillis = System.currentTimeMillis();
        copyOnWriteArrayList2.add(Long.valueOf(jCurrentTimeMillis));
        while (true) {
            copyOnWriteArrayList = crashTimestamps;
            if (!(!copyOnWriteArrayList.isEmpty())) {
                break;
            }
            Long l2 = copyOnWriteArrayList.get(0);
            Intrinsics.checkNotNullExpressionValue(l2, "get(...)");
            if (jCurrentTimeMillis - l2.longValue() <= 300000) {
                break;
            }
            copyOnWriteArrayList.remove(0);
        }
        return copyOnWriteArrayList.size() >= 6;
    }

    @Nullable
    public final e getMiWearCore() {
        return miWearCore;
    }

    public final void removeServiceConnectionListener(@NotNull ServiceStateListener serviceStateListener) {
        Intrinsics.checkNotNullParameter(serviceStateListener, "serviceStateListener");
        connections.remove(serviceStateListener);
    }

    public final void setMiWearCore(@Nullable e eVar) {
        miWearCore = eVar;
    }

    public final void unbindCoreService() {
        IBinder iBinderAsBinder;
        CoreExtKt.getLogger().i(TAG, "unbindService() called thread " + Thread.currentThread().getName());
        try {
            e eVar = miWearCore;
            if (eVar != null && (iBinderAsBinder = eVar.asBinder()) != null) {
                iBinderAsBinder.unlinkToDeath(getMBinderDeathRecipient(), 1);
            }
            miWearCore = null;
            com.xiaomi.wearable.CoreExtKt.getContext().unbindService(getMConnection());
        } catch (Exception e) {
            CoreExtKt.getLogger().e(TAG, "unbindService: ", e);
        }
    }
}
