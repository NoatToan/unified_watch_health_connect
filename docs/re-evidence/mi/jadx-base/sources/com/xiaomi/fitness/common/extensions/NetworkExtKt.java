package com.xiaomi.fitness.common.extensions;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.common.utils.NetworkStateUtil;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0006\u0010\u0007\u001a\u00020\b\u001a\u0006\u0010\t\u001a\u00020\u0006\u001a+\u0010\n\u001a\u00020\u000b2#\b\u0001\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u000b0\r\u001a+\u0010\u0011\u001a\u00020\u000b2#\b\u0001\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u000b0\r\"\u0011\u0010\u0000\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0002\"\u0011\u0010\u0003\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0002\"\u0011\u0010\u0004\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0002¨\u0006\u0012"}, d2 = {"isWifiConnected", "", "()Z", "isNetworkAvailable", "isMobileAvailable", "getNetWorkState", "", "getNetWorkTypeName", "", "getNetworkType", "registerConnectChangeListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "isConnect", "unregisterConnectChangeListener", "common_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NetworkExtKt {
    public static final int getNetWorkState() {
        return NetUtil.INSTANCE.getNetWorkState(ApplicationExtKt.getApplication());
    }

    @NotNull
    public static final String getNetWorkTypeName() {
        return NetUtil.INSTANCE.getNetWorkTypeName(ApplicationExtKt.getApplication());
    }

    public static final int getNetworkType() {
        return NetUtil.INSTANCE.getNetworkType(ApplicationExtKt.getApplication());
    }

    public static final boolean isMobileAvailable() {
        return NetUtil.INSTANCE.isMobileAva(ApplicationExtKt.getApplication());
    }

    public static final boolean isNetworkAvailable() {
        return NetUtil.INSTANCE.getNetWorkAvailable(ApplicationExtKt.getApplication());
    }

    public static final boolean isWifiConnected() {
        return NetUtil.INSTANCE.isWifiCon(ApplicationExtKt.getApplication());
    }

    public static final void registerConnectChangeListener(@NotNull Function1<? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        NetworkStateUtil.INSTANCE.getInstance(ApplicationExtKt.getApplication()).registerConnectChangeListener(listener);
    }

    public static final void unregisterConnectChangeListener(@NotNull Function1<? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        NetworkStateUtil.INSTANCE.getInstance(ApplicationExtKt.getApplication()).unregisterConnectChangeListener(listener);
    }
}
