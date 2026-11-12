package com.huami.sleepassistant.lib.utils;

import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0007\u001a\u00020\u00062\u0010\u0010\u0005\u001a\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004J\u0006\u0010\b\u001a\u00020\u0003J\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nR$\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0004\u0018\u0001`\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/huami/sleepassistant/lib/utils/DeviceManagerUtils;", "", "Lkotlin/Function0;", "", "Lcom/huami/sleepassistant/lib/utils/GetStatusCallBack;", "callBack", "", "setGetStatusCallBack", "getStatus", "goJump", "Ljava/lang/Runnable;", "runnable", "setCallRunnable", "a", "Lkotlin/jvm/functions/Function0;", "b", "Ljava/lang/Runnable;", "<init>", "()V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class DeviceManagerUtils {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static DeviceManagerUtils c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Function0<Boolean> callBack;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Runnable runnable;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00028B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/huami/sleepassistant/lib/utils/DeviceManagerUtils$Companion;", "", "Lcom/huami/sleepassistant/lib/utils/DeviceManagerUtils;", "get", DefaultSettingsSpiCall.n, "Lcom/huami/sleepassistant/lib/utils/DeviceManagerUtils;", "a", "()Lcom/huami/sleepassistant/lib/utils/DeviceManagerUtils;", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final DeviceManagerUtils a() {
            if (DeviceManagerUtils.c == null) {
                DeviceManagerUtils.c = new DeviceManagerUtils(null);
            }
            return DeviceManagerUtils.c;
        }

        @NotNull
        public final synchronized DeviceManagerUtils get() {
            return a();
        }
    }

    private DeviceManagerUtils() {
    }

    public /* synthetic */ DeviceManagerUtils(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean getStatus() {
        Boolean boolInvoke;
        Function0<Boolean> function0 = this.callBack;
        if (function0 == null || (boolInvoke = function0.invoke()) == null) {
            return false;
        }
        return boolInvoke.booleanValue();
    }

    public final void goJump() {
        Runnable runnable = this.runnable;
        if (runnable == null) {
            return;
        }
        runnable.run();
    }

    public final void setCallRunnable(@NotNull Runnable runnable) {
        this.runnable = runnable;
    }

    public final void setGetStatusCallBack(@NotNull Function0<Boolean> callBack) {
        this.callBack = callBack;
    }
}
