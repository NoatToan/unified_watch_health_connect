package com.xiaomi.fitness.sport_eco.view.launch.gym;

import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.sport_eco_manager_export.listener.DeviceTaskCallBack;
import com.xiaomi.fitness.sport_eco_manager_export.listener.IEcoGym;
import defpackage.fs9;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0007\u001a\u00020\u00062\u0016\u0010\u0005\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00030\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/gym/GymDeviceModelExt;", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/IEcoGym;", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/DeviceTaskCallBack;", "", "Lfs9;", "callBack", "", "isGymUpdating", "(Lcom/xiaomi/fitness/sport_eco_manager_export/listener/DeviceTaskCallBack;)V", "Landroidx/fragment/app/FragmentActivity;", LifecycleConstantKt.TYPE_ACTIVITY, "", "callback", "actionGymLock", "(Landroidx/fragment/app/FragmentActivity;Lcom/xiaomi/fitness/sport_eco_manager_export/listener/DeviceTaskCallBack;)V", "<init>", "()V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class GymDeviceModelExt implements IEcoGym {
    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.IEcoGym
    public void actionGymLock(@NotNull FragmentActivity activity, @NotNull DeviceTaskCallBack<Boolean> callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        GymDeviceModel.INSTANCE.getGymLock(activity, callback);
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.IEcoGym
    public void isGymUpdating(@NotNull DeviceTaskCallBack<fs9[]> callBack) {
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        GymDeviceModel.INSTANCE.isGymUpdating(callBack);
    }
}
