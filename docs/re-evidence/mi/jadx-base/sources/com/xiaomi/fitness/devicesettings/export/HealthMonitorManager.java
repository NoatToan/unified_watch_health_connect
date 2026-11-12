package com.xiaomi.fitness.devicesettings.export;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ<\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00072\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007H&J6\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007H&J\b\u0010\r\u001a\u00020\u0003H&¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/export/HealthMonitorManager;", "", "loadHrOpenContinuous", "", "did", "", "onSuccess", "Lkotlin/Function1;", "", "onError", "", "hrOpenContinuous", "Lkotlin/Function0;", "clearOld", "Companion", "device-settings-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface HealthMonitorManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int FREQ_CLOSE = -1;
    public static final int FREQ_CONTINUOUS = 1;
    public static final int FREQ_INTELLIGENT = 0;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/export/HealthMonitorManager$Companion;", "", "<init>", "()V", "FREQ_CLOSE", "", "FREQ_INTELLIGENT", "FREQ_CONTINUOUS", "device-settings-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int FREQ_CLOSE = -1;
        public static final int FREQ_CONTINUOUS = 1;
        public static final int FREQ_INTELLIGENT = 0;

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void hrOpenContinuous$default(HealthMonitorManager healthMonitorManager, String str, Function0 function0, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hrOpenContinuous");
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            healthMonitorManager.hrOpenContinuous(str, function0, function1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void loadHrOpenContinuous$default(HealthMonitorManager healthMonitorManager, String str, Function1 function1, Function1 function2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadHrOpenContinuous");
            }
            if ((i & 4) != 0) {
                function2 = null;
            }
            healthMonitorManager.loadHrOpenContinuous(str, function1, function2);
        }
    }

    void clearOld();

    void hrOpenContinuous(@NotNull String did, @NotNull Function0<Unit> onSuccess, @Nullable Function1<? super Integer, Unit> onError);

    void loadHrOpenContinuous(@NotNull String did, @NotNull Function1<? super Boolean, Unit> onSuccess, @Nullable Function1<? super Integer, Unit> onError);
}
