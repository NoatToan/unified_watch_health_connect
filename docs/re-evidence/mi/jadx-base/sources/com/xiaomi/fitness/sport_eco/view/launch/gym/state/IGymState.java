package com.xiaomi.fitness.sport_eco.view.launch.gym.state;

import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&J\u001a\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&J\u001a\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&J\u001a\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/gym/state/IGymState;", "", "connect", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "isLaunch", "", "login", "updating", "lock", "launch", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IGymState {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void connect$default(IGymState iGymState, FragmentActivity fragmentActivity, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: connect");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            iGymState.connect(fragmentActivity, z);
        }

        public static /* synthetic */ void lock$default(IGymState iGymState, FragmentActivity fragmentActivity, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            iGymState.lock(fragmentActivity, z);
        }

        public static /* synthetic */ void login$default(IGymState iGymState, FragmentActivity fragmentActivity, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: login");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            iGymState.login(fragmentActivity, z);
        }

        public static /* synthetic */ void updating$default(IGymState iGymState, FragmentActivity fragmentActivity, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updating");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            iGymState.updating(fragmentActivity, z);
        }
    }

    void connect(@NotNull FragmentActivity activity, boolean isLaunch);

    void launch(@NotNull FragmentActivity activity);

    void lock(@NotNull FragmentActivity activity, boolean isLaunch);

    void login(@NotNull FragmentActivity activity, boolean isLaunch);

    void updating(@NotNull FragmentActivity activity, boolean isLaunch);
}
