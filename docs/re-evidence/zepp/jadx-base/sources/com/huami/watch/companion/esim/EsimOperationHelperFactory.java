package com.huami.watch.companion.esim;

import android.content.Context;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/huami/watch/companion/esim/EsimOperationHelperFactory;", "", "<init>", "()V", "Companion", "esim_release"}, k = 1, mv = {1, 5, 1})
public final class EsimOperationHelperFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static AbsEsimOperation a;

    @Nullable
    private static EsimBleOperationHelper b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/huami/watch/companion/esim/EsimOperationHelperFactory$Companion;", "", "Landroid/content/Context;", "ctx", "Lcom/huami/watch/companion/esim/AbsEsimOperation;", "b", "a", "createOperationHelper", "esimBTOperationHelper", "Lcom/huami/watch/companion/esim/AbsEsimOperation;", "Lcom/huami/watch/companion/esim/EsimBleOperationHelper;", "esimBleOperationHelper", "Lcom/huami/watch/companion/esim/EsimBleOperationHelper;", "<init>", "()V", "esim_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final AbsEsimOperation a(Context ctx) {
            if (EsimOperationHelperFactory.b == null) {
                EsimOperationHelperFactory.b = new EsimBleOperationHelper(ctx);
            }
            return EsimOperationHelperFactory.b;
        }

        private final AbsEsimOperation b(Context ctx) {
            if (EsimOperationHelperFactory.a == null) {
                EsimOperationHelperFactory.a = new EsimOperationHelper(ctx);
            }
            return EsimOperationHelperFactory.a;
        }

        @NotNull
        public final synchronized AbsEsimOperation createOperationHelper(@NotNull Context ctx) {
            HMDeviceType boundMajorDeviceType;
            IESimDeviceManager esimDeviceManager = ESimCallback.INSTANCE.getEsimDeviceManager();
            boundMajorDeviceType = esimDeviceManager == null ? null : esimDeviceManager.getBoundMajorDeviceType();
            if (boundMajorDeviceType == null) {
                boundMajorDeviceType = HMDeviceType.VDevice;
            }
            return boundMajorDeviceType == HMDeviceType.MILI ? a(ctx) : b(ctx);
        }
    }
}
