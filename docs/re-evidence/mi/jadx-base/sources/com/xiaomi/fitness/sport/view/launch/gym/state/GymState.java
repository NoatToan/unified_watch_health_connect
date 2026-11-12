package com.xiaomi.fitness.sport.view.launch.gym.state;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/sport/view/launch/gym/state/GymState;", "Lcom/xiaomi/fitness/sport/view/launch/gym/state/IGymState;", "<init>", "()V", "gymContext", "Lcom/xiaomi/fitness/sport/view/launch/gym/state/GymContext;", "getGymContext", "()Lcom/xiaomi/fitness/sport/view/launch/gym/state/GymContext;", "setGymContext", "(Lcom/xiaomi/fitness/sport/view/launch/gym/state/GymContext;)V", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class GymState implements IGymState {

    @NotNull
    public static final String TAG = "GymState";
    public GymContext gymContext;

    @NotNull
    public final GymContext getGymContext() {
        GymContext gymContext = this.gymContext;
        if (gymContext != null) {
            return gymContext;
        }
        Intrinsics.throwUninitializedPropertyAccessException("gymContext");
        return null;
    }

    public final void setGymContext(@NotNull GymContext gymContext) {
        Intrinsics.checkNotNullParameter(gymContext, "<set-?>");
        this.gymContext = gymContext;
    }
}
