package com.xiaomi.fitness.sport_eco_manager_export.listener;

import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import defpackage.fs9;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ'\u0010\u0007\u001a\u00020\u00062\u0016\u0010\u0005\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00030\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002H&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager_export/listener/IEcoGym;", "", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/DeviceTaskCallBack;", "", "Lfs9;", "callBack", "", "isGymUpdating", "(Lcom/xiaomi/fitness/sport_eco_manager_export/listener/DeviceTaskCallBack;)V", "Landroidx/fragment/app/FragmentActivity;", LifecycleConstantKt.TYPE_ACTIVITY, "", "callback", "actionGymLock", "(Landroidx/fragment/app/FragmentActivity;Lcom/xiaomi/fitness/sport_eco_manager_export/listener/DeviceTaskCallBack;)V", "Companion", "sport-eco-manager-export_release"}, k = 1, mv = {2, 0, 0})
public interface IEcoGym {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager_export/listener/IEcoGym$Companion;", "", "<init>", "()V", "sport-eco-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void actionGymLock(@NotNull FragmentActivity activity, @NotNull DeviceTaskCallBack<Boolean> callback);

    void isGymUpdating(@NotNull DeviceTaskCallBack<fs9[]> callBack);
}
