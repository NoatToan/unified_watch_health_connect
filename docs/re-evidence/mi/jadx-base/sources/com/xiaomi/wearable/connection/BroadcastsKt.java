package com.xiaomi.wearable.connection;

import android.content.Intent;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.wearable.CoreExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\u001a&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\b\u001a \u0010\u000b\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r\u001a0\u0010\u000e\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b\u001a(\u0010\u0012\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"CONNECT_ACTION", "", "ACCOUNT_ACTION", "DEVICE_CHANGE", "broadcastConnectStart", "", "did", "current", "", "model", "specificModel", "broadcastConnectSuccess", "connectType", "", "broadcastConnectFail", "errorCode", Constants.EXTRA_ERROR_MESSAGE, "times", "broadcastDisconnect", "status", "message", "miwear-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BroadcastsKt {

    @NotNull
    public static final String ACCOUNT_ACTION = "com.xiaomi.wearable.ACCOUNT_CHANGE";

    @NotNull
    public static final String CONNECT_ACTION = "com.xiaomi.wearable.DEVICE_CONNECT_STATE_CHANGE";

    @NotNull
    public static final String DEVICE_CHANGE = "com.xiaomi.wearable.DEVICE_CHANGE";

    public static final void broadcastConnectFail(@Nullable String str, int i, @NotNull String errorMsg, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        Intent intent = new Intent(CONNECT_ACTION);
        intent.putExtra("state", 3);
        intent.putExtra("code", i);
        if (str == null) {
            str = "";
        }
        intent.putExtra("did", str);
        intent.putExtra("times", i2);
        intent.putExtra(Constants.EXTRA_ERROR_MESSAGE, errorMsg);
        intent.putExtra("current_device", z);
        intent.setPackage(CoreExtKt.getContext().getPackageName());
        CoreExtKt.getContext().sendBroadcast(intent);
    }

    public static final void broadcastConnectStart(@NotNull String did, boolean z, @NotNull String model, boolean z2) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(model, "model");
        Intent intent = new Intent(CONNECT_ACTION);
        intent.putExtra("state", 1);
        intent.putExtra("did", did);
        intent.putExtra("current_device", z);
        intent.setPackage(CoreExtKt.getContext().getPackageName());
        CoreExtKt.getContext().sendBroadcast(intent);
    }

    public static final void broadcastConnectSuccess(@Nullable String str, boolean z, int i) {
        Intent intent = new Intent(CONNECT_ACTION);
        intent.putExtra("state", 2);
        if (str == null) {
            str = "";
        }
        intent.putExtra("did", str);
        intent.putExtra("current_device", z);
        intent.putExtra("connect_type", i);
        intent.setPackage(CoreExtKt.getContext().getPackageName());
        CoreExtKt.getContext().sendBroadcast(intent);
    }

    public static final void broadcastDisconnect(@Nullable String str, int i, @NotNull String message, boolean z) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intent intent = new Intent(CONNECT_ACTION);
        intent.putExtra("state", 4);
        intent.putExtra("code", i);
        intent.putExtra("message", message);
        if (str == null) {
            str = "";
        }
        intent.putExtra("did", str);
        intent.putExtra("current_device", z);
        intent.setPackage(CoreExtKt.getContext().getPackageName());
        CoreExtKt.getContext().sendBroadcast(intent);
    }
}
