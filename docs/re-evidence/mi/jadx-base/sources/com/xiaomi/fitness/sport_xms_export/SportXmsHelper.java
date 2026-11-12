package com.xiaomi.fitness.sport_xms_export;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.sport_xms.data.SensorData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018J,\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0012\u0010\u000f\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\rH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&J$\u0010\u0014\u001a\u00020\u00032\u001a\u0010\u0012\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00030\u0015H&¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/sport_xms_export/SportXmsHelper;", "", "bindXmsService", "", "context", "Landroid/content/Context;", "onInit", "Lkotlin/Function0;", LifecycleConstantKt.ON_DESTROY, "startSport", "time", "", "did", "", "pauseSport", "resumeSport", "finishSport", "setSportStateChangedListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/fitness/sport_xms_export/JDSportStateChangeListener;", "setSportXmsSensorDataChangedListener", "Lkotlin/Function1;", "", "Lcom/xiaomi/fitness/sport_xms/data/SensorData;", "Companion", "sport-xms-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SportXmsHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/sport_xms_export/SportXmsHelper$Companion;", "", "<init>", "()V", "sport-xms-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void bindXmsService(@NotNull Context context, @NotNull Function0<Unit> onInit, @NotNull Function0<Unit> onDestroy);

    void finishSport(@NotNull String did);

    void pauseSport(@NotNull String did);

    void resumeSport(@Nullable String did);

    void setSportStateChangedListener(@NotNull JDSportStateChangeListener listener);

    void setSportXmsSensorDataChangedListener(@NotNull Function1<? super List<SensorData>, Unit> listener);

    void startSport(long time, @NotNull String did);
}
