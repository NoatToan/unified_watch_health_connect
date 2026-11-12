package com.huami.xiaopeng.ui.amazfit.utils;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\"\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/huami/xiaopeng/ui/amazfit/utils/XpLifeCycleHelper;", "", "", "XP_LIFE_CYCLE_TAG", "Ljava/lang/String;", "", "a", "Z", "isInXpModule", "()Z", "setInXpModule", "(Z)V", "Lcom/huami/xiaopeng/ui/amazfit/utils/XpLifeCycleListener;", "b", "Lcom/huami/xiaopeng/ui/amazfit/utils/XpLifeCycleListener;", "getXpModuleLifeCycle", "()Lcom/huami/xiaopeng/ui/amazfit/utils/XpLifeCycleListener;", "setXpModuleLifeCycle", "(Lcom/huami/xiaopeng/ui/amazfit/utils/XpLifeCycleListener;)V", "xpModuleLifeCycle", "<init>", "()V", "xiaopeng-ui-amazfit_release"}, k = 1, mv = {1, 5, 1})
public final class XpLifeCycleHelper {

    @NotNull
    public static final XpLifeCycleHelper INSTANCE = new XpLifeCycleHelper();

    @NotNull
    public static final String XP_LIFE_CYCLE_TAG = "XpLifeCycle";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static boolean isInXpModule;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private static XpLifeCycleListener xpModuleLifeCycle;

    private XpLifeCycleHelper() {
    }

    @Nullable
    public final XpLifeCycleListener getXpModuleLifeCycle() {
        return xpModuleLifeCycle;
    }

    public final boolean isInXpModule() {
        return isInXpModule;
    }

    public final void setInXpModule(boolean z) {
        isInXpModule = z;
    }

    public final void setXpModuleLifeCycle(@Nullable XpLifeCycleListener xpLifeCycleListener) {
        xpModuleLifeCycle = xpLifeCycleListener;
    }
}
