package com.xiaomi.fitness.sport_eco.view.launch.gym.state;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.sport_eco.view.launch.gym.GymDeviceModel;
import com.xiaomi.fitness.sport_eco_manager_export.listener.DeviceTaskCallBack;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/gym/state/GymLockState;", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/state/GymState;", "<init>", "()V", "connect", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "isLaunch", "", "login", "updating", "lock", "launch", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GymLockState extends GymState {
    @Override // com.xiaomi.fitness.sport_eco.view.launch.gym.state.IGymState
    public void connect(@NotNull FragmentActivity activity, boolean isLaunch) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // com.xiaomi.fitness.sport_eco.view.launch.gym.state.IGymState
    public void launch(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // com.xiaomi.fitness.sport_eco.view.launch.gym.state.IGymState
    public void lock(@NotNull final FragmentActivity activity, final boolean isLaunch) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        GymDeviceModel.INSTANCE.getGymLock(activity, new DeviceTaskCallBack<Boolean>() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.state.GymLockState.lock.1
            @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.DeviceTaskCallBack
            public void onError(int errorCode) {
                FitnessLogUtils.e("GymLockState", "get gym lock error : " + errorCode);
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(activity), Dispatchers.getMain(), null, new GymLockState$lock$1$onError$1(null), 2, null);
            }

            @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.DeviceTaskCallBack
            public /* bridge */ /* synthetic */ void onResult(Boolean bool) {
                onResult(bool.booleanValue());
            }

            public void onResult(boolean hasLock) {
                if (hasLock) {
                    FitnessLogUtils.i("GymLockState", "gym is has Lock");
                    return;
                }
                boolean z = isLaunch;
                if (z) {
                    FitnessLogUtils.d("GymLockState", "gym is not lock , isLuanch : " + z);
                    this.getGymContext().setGymState(GymContext.INSTANCE.getGymLaunch());
                    this.getGymContext().getGymState().launch(activity);
                }
            }
        });
    }

    @Override // com.xiaomi.fitness.sport_eco.view.launch.gym.state.IGymState
    public void login(@NotNull FragmentActivity activity, boolean isLaunch) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // com.xiaomi.fitness.sport_eco.view.launch.gym.state.IGymState
    public void updating(@NotNull FragmentActivity activity, boolean isLaunch) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }
}
