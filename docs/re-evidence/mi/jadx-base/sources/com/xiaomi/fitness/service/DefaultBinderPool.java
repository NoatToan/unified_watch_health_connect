package com.xiaomi.fitness.service;

import android.os.IBinder;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u001f\b\u0007\u0012\u0014\b\u0001\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000b\u001a\u00020\u0004H\u0016R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/service/DefaultBinderPool;", "Lcom/xiaomi/fitness/service/BinderPoolImpl;", "mBinder", "", "", "Landroid/os/IBinder;", "<init>", "(Ljava/util/Map;)V", "binders", "getBinders", "()Ljava/util/Map;", "getVersion", "Companion", "service_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DefaultBinderPool extends BinderPoolImpl {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int SERVER_VERSION = 0;

    @NotNull
    private final Map<Integer, IBinder> binders;

    @NotNull
    private final Map<Integer, IBinder> mBinder;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/service/DefaultBinderPool$Companion;", "", "<init>", "()V", "SERVER_VERSION", "", "service_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public DefaultBinderPool(@NotNull Map<Integer, IBinder> mBinder) {
        Intrinsics.checkNotNullParameter(mBinder, "mBinder");
        this.mBinder = mBinder;
        this.binders = new ConcurrentHashMap();
        getBinders().putAll(mBinder);
    }

    @Override // com.xiaomi.fitness.service.BinderPoolImpl
    @NotNull
    public Map<Integer, IBinder> getBinders() {
        return this.binders;
    }

    @Override // com.xiaomi.fitness.service.BinderPoolImpl, com.xiaomi.fitness.service.a
    public int getVersion() {
        return 0;
    }
}
