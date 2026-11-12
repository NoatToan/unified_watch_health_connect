package com.xiaomi.fitness.sport.view.launch.gym.state;

import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.sport.view.launch.gym.GymDeviceModel;
import defpackage.c1j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0006\u0010\n\u001a\u00020\tJ\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/sport/view/launch/gym/state/GymConnectState;", "Lcom/xiaomi/fitness/sport/view/launch/gym/state/GymState;", "<init>", "()V", "connect", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "isLaunch", "", "checkConnect", "login", "updating", "lock", "launch", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GymConnectState extends GymState {
    public final boolean checkConnect() {
        WearableDeviceModel wearableDeviceModelCurGymDeviceModel = GymDeviceModel.INSTANCE.curGymDeviceModel();
        return wearableDeviceModelCurGymDeviceModel != null && wearableDeviceModelCurGymDeviceModel.getIsDeviceConnected();
    }

    @Override // com.xiaomi.fitness.sport.view.launch.gym.state.IGymState
    public void connect(@NotNull FragmentActivity activity, boolean isLaunch) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!checkConnect()) {
            FitnessLogUtils.i("GymState", "gym is not connected , isLaunch : " + isLaunch);
            ToastUtil.showShortToast(c1j.f1);
            return;
        }
        FitnessLogUtils.i("GymState", "gym is connected , isLaunch : " + isLaunch);
        if (isLaunch) {
            super.getGymContext().setGymState(GymContext.INSTANCE.getGymLogin());
            super.getGymContext().getGymState().login(activity, isLaunch);
        }
    }

    @Override // com.xiaomi.fitness.sport.view.launch.gym.state.IGymState
    public void launch(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // com.xiaomi.fitness.sport.view.launch.gym.state.IGymState
    public void lock(@NotNull FragmentActivity activity, boolean isLaunch) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // com.xiaomi.fitness.sport.view.launch.gym.state.IGymState
    public void login(@NotNull FragmentActivity activity, boolean isLaunch) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // com.xiaomi.fitness.sport.view.launch.gym.state.IGymState
    public void updating(@NotNull FragmentActivity activity, boolean isLaunch) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }
}
