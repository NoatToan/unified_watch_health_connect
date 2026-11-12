package com.xiaomi.fitness.sport_eco_manager_export.launch;

import com.alibaba.android.arouter.facade.template.IProvider;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ISportDataChangedListener;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u001a\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteData;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "addSportDataChangedListener", "", "obj", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ISportDataChangedListener;", "removeSportDataChangedListener", "Companion", "sport-eco-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IEcoSportRemoteData extends IProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteData$Companion;", "", "<init>", "()V", "sport-eco-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void addSportDataChangedListener(@NotNull Object obj, @Nullable ISportDataChangedListener listener);

    void removeSportDataChangedListener(@NotNull Object obj, @Nullable ISportDataChangedListener listener);
}
