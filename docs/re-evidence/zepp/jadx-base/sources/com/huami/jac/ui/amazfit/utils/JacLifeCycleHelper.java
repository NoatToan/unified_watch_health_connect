package com.huami.jac.ui.amazfit.utils;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\"\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/huami/jac/ui/amazfit/utils/JacLifeCycleHelper;", "", "", JacLifeCycleHelper.JAC_LIFE_CYCLE_TAG, "Ljava/lang/String;", "", "a", "Z", "isInXpModule", "()Z", "setInXpModule", "(Z)V", "Lcom/huami/jac/ui/amazfit/utils/JacLifeCycleListener;", "b", "Lcom/huami/jac/ui/amazfit/utils/JacLifeCycleListener;", "getJacModuleLifeCycle", "()Lcom/huami/jac/ui/amazfit/utils/JacLifeCycleListener;", "setJacModuleLifeCycle", "(Lcom/huami/jac/ui/amazfit/utils/JacLifeCycleListener;)V", "jacModuleLifeCycle", "<init>", "()V", "jac-ui-amazfit_release"}, k = 1, mv = {1, 5, 1})
public final class JacLifeCycleHelper {

    @NotNull
    public static final JacLifeCycleHelper INSTANCE = new JacLifeCycleHelper();

    @NotNull
    public static final String JAC_LIFE_CYCLE_TAG = "JAC_LIFE_CYCLE_TAG";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static boolean isInXpModule;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private static JacLifeCycleListener jacModuleLifeCycle;

    private JacLifeCycleHelper() {
    }

    @Nullable
    public final JacLifeCycleListener getJacModuleLifeCycle() {
        return jacModuleLifeCycle;
    }

    public final boolean isInXpModule() {
        return isInXpModule;
    }

    public final void setInXpModule(boolean z) {
        isInXpModule = z;
    }

    public final void setJacModuleLifeCycle(@Nullable JacLifeCycleListener jacLifeCycleListener) {
        jacModuleLifeCycle = jacLifeCycleListener;
    }
}
