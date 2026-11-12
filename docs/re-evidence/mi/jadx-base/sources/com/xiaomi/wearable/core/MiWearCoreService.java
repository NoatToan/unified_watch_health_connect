package com.xiaomi.wearable.core;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.xiaomi.wearable.core.MiWearCoreService;
import com.xiaomi.wearable.core.server.IMiWearCoreImpl;
import com.xiaomi.wearable.core.server.PermissionChecker;
import com.xiaomi.wearable.wear.api.ProxyDataManager;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000/\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0005\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\"\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/wearable/core/MiWearCoreService;", "Landroid/app/Service;", "<init>", "()V", "coreInstance", "com/xiaomi/wearable/core/MiWearCoreService$coreInstance$2$1", "getCoreInstance", "()Lcom/xiaomi/wearable/core/MiWearCoreService$coreInstance$2$1;", "coreInstance$delegate", "Lkotlin/Lazy;", "onCreate", "", "onStartCommand", "", "intent", "Landroid/content/Intent;", "flags", "startId", "onBind", "Landroid/os/IBinder;", "Companion", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MiWearCoreService extends Service {

    @NotNull
    private static final String TAG = "MiWearCoreService";

    /* JADX INFO: renamed from: coreInstance$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy coreInstance = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: wwf
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MiWearCoreService.coreInstance_delegate$lambda$0();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.xiaomi.wearable.core.MiWearCoreService$coreInstance$2$1] */
    public static final MiWearCoreService$coreInstance$2$1 coreInstance_delegate$lambda$0() {
        return new b.a() { // from class: com.xiaomi.wearable.core.MiWearCoreService$coreInstance$2$1
            @Override // com.xiaomi.wearable.core.b
            public e getMiWearCoreBinder() {
                String callingPackage = com.xiaomi.wearable.CoreExtKt.getCallingPackage();
                if (callingPackage == null) {
                    CoreExtKt.getLogger().i("MiWearCoreService", "getInstance() called");
                    return null;
                }
                if (PermissionChecker.INSTANCE.checkCert(callingPackage)) {
                    return IMiWearCoreImpl.INSTANCE.getInstance();
                }
                throw new SecurityException("---------");
            }
        };
    }

    private final MiWearCoreService$coreInstance$2$1 getCoreInstance() {
        return (MiWearCoreService$coreInstance$2$1) this.coreInstance.getValue();
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@Nullable Intent intent) {
        return getCoreInstance();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        CoreExtKt.getLogger().i(TAG, "onCreate() called");
    }

    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int flags, int startId) {
        if (intent == null) {
            CoreExtKt.getLogger().i(TAG, "intent is null ");
        }
        if (intent != null && intent.hasExtra("device") && intent != null) {
            ProxyDataManager.INSTANCE.restoreProxyData(intent);
        }
        return super.onStartCommand(intent, flags, startId);
    }
}
