package com.huami.sleepassistant.lib.utils.handler;

import android.content.Context;
import android.os.Handler;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.tools.analytics.DbUtils;
import java.lang.ref.WeakReference;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0011\b\u0000\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rR(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/huami/sleepassistant/lib/utils/handler/HandlerUtil;", "Landroid/os/Handler;", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "a", "Ljava/lang/ref/WeakReference;", "getMActivityReference$lib_release", "()Ljava/lang/ref/WeakReference;", "setMActivityReference$lib_release", "(Ljava/lang/ref/WeakReference;)V", "mActivityReference", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class HandlerUtil extends Handler {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static HandlerUtil b;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private WeakReference<Context> mActivityReference;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/huami/sleepassistant/lib/utils/handler/HandlerUtil$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/sleepassistant/lib/utils/handler/HandlerUtil;", "getInstance", DefaultSettingsSpiCall.n, "Lcom/huami/sleepassistant/lib/utils/handler/HandlerUtil;", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HandlerUtil getInstance(@NotNull Context context) {
            if (HandlerUtil.b == null) {
                HandlerUtil.b = new HandlerUtil(context.getApplicationContext());
            }
            HandlerUtil handlerUtil = HandlerUtil.b;
            Objects.requireNonNull(handlerUtil, "null cannot be cast to non-null type com.huami.sleepassistant.lib.utils.handler.HandlerUtil");
            return handlerUtil;
        }
    }

    public HandlerUtil(@NotNull Context context) {
        this.mActivityReference = new WeakReference<>(context);
    }

    @NotNull
    public final WeakReference<Context> getMActivityReference$lib_release() {
        return this.mActivityReference;
    }

    public final void setMActivityReference$lib_release(@NotNull WeakReference<Context> weakReference) {
        this.mActivityReference = weakReference;
    }
}
