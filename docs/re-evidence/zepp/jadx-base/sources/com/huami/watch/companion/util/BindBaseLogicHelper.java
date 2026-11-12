package com.huami.watch.companion.util;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/huami/watch/companion/util/BindBaseLogicHelper;", "", "<init>", "()V", "Companion", "companion_release"}, k = 1, mv = {1, 5, 1})
public final class BindBaseLogicHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static BindBaseLogicProxy a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/huami/watch/companion/util/BindBaseLogicHelper$Companion;", "", "Lcom/huami/watch/companion/util/IBindBaseLogicCallback;", "proxy", "", "setBindBaseLogicProxy", "Lcom/huami/watch/companion/util/BindBaseLogicProxy;", "getBindBaseLogicProxy", "Lcom/huami/watch/companion/util/BindBaseLogicProxy;", "<init>", "()V", "companion_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final BindBaseLogicProxy getBindBaseLogicProxy() {
            return BindBaseLogicHelper.a;
        }

        @JvmStatic
        public final void setBindBaseLogicProxy(@NotNull IBindBaseLogicCallback proxy) {
            BindBaseLogicHelper.a = new BindBaseLogicProxy(proxy);
        }
    }

    @JvmStatic
    @Nullable
    public static final BindBaseLogicProxy getBindBaseLogicProxy() {
        return INSTANCE.getBindBaseLogicProxy();
    }

    @JvmStatic
    public static final void setBindBaseLogicProxy(@NotNull IBindBaseLogicCallback iBindBaseLogicCallback) {
        INSTANCE.setBindBaseLogicProxy(iBindBaseLogicCallback);
    }
}
