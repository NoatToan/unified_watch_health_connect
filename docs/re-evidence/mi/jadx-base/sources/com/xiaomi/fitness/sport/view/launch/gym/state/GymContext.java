package com.xiaomi.fitness.sport.view.launch.gym.state;

import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\u000e\u0010$\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\u000e\u0010%\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\u0006\u0010&\u001a\u00020 R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0019@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/sport/view/launch/gym/state/GymContext;", "", "<init>", "()V", "TAG", "", "gymConnectState", "Lcom/xiaomi/fitness/sport/view/launch/gym/state/GymConnectState;", "gymLogin", "Lcom/xiaomi/fitness/sport/view/launch/gym/state/GymLoginState;", "getGymLogin", "()Lcom/xiaomi/fitness/sport/view/launch/gym/state/GymLoginState;", "gymUpdate", "Lcom/xiaomi/fitness/sport/view/launch/gym/state/GymUpdateState;", "getGymUpdate", "()Lcom/xiaomi/fitness/sport/view/launch/gym/state/GymUpdateState;", "gymLock", "Lcom/xiaomi/fitness/sport/view/launch/gym/state/GymLockState;", "getGymLock", "()Lcom/xiaomi/fitness/sport/view/launch/gym/state/GymLockState;", "gymLaunch", "Lcom/xiaomi/fitness/sport/view/launch/gym/state/GymLaunchState;", "getGymLaunch", "()Lcom/xiaomi/fitness/sport/view/launch/gym/state/GymLaunchState;", "value", "Lcom/xiaomi/fitness/sport/view/launch/gym/state/GymState;", "gymState", "getGymState", "()Lcom/xiaomi/fitness/sport/view/launch/gym/state/GymState;", "setGymState", "(Lcom/xiaomi/fitness/sport/view/launch/gym/state/GymState;)V", "launchGym", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "checkUpdate", "checkLock", "checkLogin", "checkConnect", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GymContext {

    @NotNull
    public static final GymContext INSTANCE;

    @NotNull
    public static final String TAG = "GymContext";

    @NotNull
    private static final GymConnectState gymConnectState;

    @NotNull
    private static final GymLaunchState gymLaunch;

    @NotNull
    private static final GymLockState gymLock;

    @NotNull
    private static final GymLoginState gymLogin;

    @NotNull
    private static GymState gymState;

    @NotNull
    private static final GymUpdateState gymUpdate;

    static {
        GymContext gymContext = new GymContext();
        INSTANCE = gymContext;
        GymConnectState gymConnectState2 = new GymConnectState();
        gymConnectState = gymConnectState2;
        gymLogin = new GymLoginState();
        gymUpdate = new GymUpdateState();
        gymLock = new GymLockState();
        gymLaunch = new GymLaunchState();
        gymState = gymConnectState2;
        gymConnectState2.setGymContext(gymContext);
    }

    private GymContext() {
    }

    public final void checkConnect() {
        gymConnectState.checkConnect();
    }

    public final void checkLock(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        FragmentActivity fragmentActivity = (FragmentActivity) new WeakReference(activity).get();
        if (fragmentActivity != null) {
            gymLock.lock(fragmentActivity, false);
        }
    }

    public final void checkLogin(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        gymLogin.login(activity, false);
    }

    public final void checkUpdate(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        FragmentActivity fragmentActivity = (FragmentActivity) new WeakReference(activity).get();
        if (fragmentActivity != null) {
            gymUpdate.updating(fragmentActivity, false);
        }
    }

    @NotNull
    public final GymLaunchState getGymLaunch() {
        return gymLaunch;
    }

    @NotNull
    public final GymLockState getGymLock() {
        return gymLock;
    }

    @NotNull
    public final GymLoginState getGymLogin() {
        return gymLogin;
    }

    @NotNull
    public final GymState getGymState() {
        return gymState;
    }

    @NotNull
    public final GymUpdateState getGymUpdate() {
        return gymUpdate;
    }

    public final void launchGym(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        FitnessLogUtils.i("GymContext", "launchGym");
        setGymState(gymConnectState);
        FragmentActivity fragmentActivity = (FragmentActivity) new WeakReference(activity).get();
        if (fragmentActivity != null) {
            gymState.connect(fragmentActivity, true);
        }
    }

    public final void setGymState(@NotNull GymState value) {
        Intrinsics.checkNotNullParameter(value, "value");
        gymState = value;
        value.setGymContext(this);
    }
}
