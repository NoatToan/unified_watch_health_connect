package com.xiaomi.fitness.sport_manager_export.launch;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.sport_manager_export.listener.ISportSensorDataChangedListener;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u001a\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/sport_manager_export/launch/ISportRemoteSensorData;", "", "addSportSensorDataChangedListener", "", "obj", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/fitness/sport_manager_export/listener/ISportSensorDataChangedListener;", "removeSportSensorDataChangedListener", "Companion", "sport-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ISportRemoteSensorData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/sport_manager_export/launch/ISportRemoteSensorData$Companion;", "", "<init>", "()V", "sport-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void addSportSensorDataChangedListener(@NotNull Object obj, @Nullable ISportSensorDataChangedListener listener);

    void removeSportSensorDataChangedListener(@NotNull Object obj, @Nullable ISportSensorDataChangedListener listener);
}
