package com.huami.watch.companion.esim;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/huami/watch/companion/esim/ESimCallback;", "", "<init>", "()V", "Companion", "esim_release"}, k = 1, mv = {1, 5, 1})
public final class ESimCallback {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static IESimDeviceManager a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/huami/watch/companion/esim/ESimCallback$Companion;", "", "Lcom/huami/watch/companion/esim/IESimDeviceManager;", "manager", "", "setESimDeviceManager", "esimDeviceManager", "Lcom/huami/watch/companion/esim/IESimDeviceManager;", "getEsimDeviceManager", "()Lcom/huami/watch/companion/esim/IESimDeviceManager;", "setEsimDeviceManager", "(Lcom/huami/watch/companion/esim/IESimDeviceManager;)V", "<init>", "()V", "esim_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final IESimDeviceManager getEsimDeviceManager() {
            return ESimCallback.a;
        }

        public final void setESimDeviceManager(@NotNull IESimDeviceManager manager) {
            setEsimDeviceManager(manager);
        }

        public final void setEsimDeviceManager(@Nullable IESimDeviceManager iESimDeviceManager) {
            ESimCallback.a = iESimDeviceManager;
        }
    }
}
