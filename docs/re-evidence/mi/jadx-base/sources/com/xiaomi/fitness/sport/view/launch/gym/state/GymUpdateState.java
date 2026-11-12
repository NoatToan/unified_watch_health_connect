package com.xiaomi.fitness.sport.view.launch.gym.state;

import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.sport.view.launch.gym.GymDeviceModel;
import com.xiaomi.fitness.sport_manager_export.listener.DeviceTaskCallBack;
import defpackage.c1j;
import defpackage.gs9;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/sport/view/launch/gym/state/GymUpdateState;", "Lcom/xiaomi/fitness/sport/view/launch/gym/state/GymState;", "<init>", "()V", "updating", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "isLaunch", "", "connect", "login", "lock", "launch", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GymUpdateState extends GymState {
    @Override // com.xiaomi.fitness.sport.view.launch.gym.state.IGymState
    public void connect(@NotNull FragmentActivity activity, boolean isLaunch) {
        Intrinsics.checkNotNullParameter(activity, "activity");
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
    public void updating(@NotNull final FragmentActivity activity, final boolean isLaunch) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        GymDeviceModel.INSTANCE.isGymUpdating(new DeviceTaskCallBack<gs9[]>() { // from class: com.xiaomi.fitness.sport.view.launch.gym.state.GymUpdateState.updating.1
            @Override // com.xiaomi.fitness.sport_manager_export.listener.DeviceTaskCallBack
            public void onError(int errorCode) {
                if (errorCode == 5) {
                    FitnessLogUtils.i("GymState", "GYM is updating ");
                    ToastUtil.INSTANCE.showToast(c1j.x1);
                    return;
                }
                FitnessLogUtils.i("GymState", "GYM is not updating , but error , errorCode : " + errorCode);
                ToastUtil.INSTANCE.showToast(c1j.n5);
            }

            @Override // com.xiaomi.fitness.sport_manager_export.listener.DeviceTaskCallBack
            public void onResult(gs9[] result) {
                FitnessLogUtils.i("GymState", "GYM is not updating , isLaunch : " + isLaunch);
                if (isLaunch) {
                    this.getGymContext().setGymState(GymContext.INSTANCE.getGymLock());
                    this.getGymContext().getGymState().lock(activity, isLaunch);
                }
            }
        });
    }
}
