package com.huami.jac.ui.amazfit.navigation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/huami/jac/ui/amazfit/navigation/JacArgs;", "", "", "a", "Ljava/lang/String;", "getWatchId", "()Ljava/lang/String;", "setWatchId", "(Ljava/lang/String;)V", "watchId", "b", "getVin", "setVin", "vin", "<init>", "()V", "jac-ui-amazfit_release"}, k = 1, mv = {1, 5, 1})
public final class JacArgs {

    @NotNull
    public static final JacArgs INSTANCE = new JacArgs();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static String watchId = "";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static String vin = "";

    private JacArgs() {
    }

    @NotNull
    public final String getVin() {
        return vin;
    }

    @NotNull
    public final String getWatchId() {
        return watchId;
    }

    public final void setVin(@NotNull String str) {
        vin = str;
    }

    public final void setWatchId(@NotNull String str) {
        watchId = str;
    }
}
