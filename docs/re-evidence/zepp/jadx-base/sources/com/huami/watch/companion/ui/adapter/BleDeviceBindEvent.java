package com.huami.watch.companion.ui.adapter;

import android.app.Activity;
import com.huami.watch.companion.ui.activity.SearchBindDeviceActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/huami/watch/companion/ui/adapter/BleDeviceBindEvent;", "", "Lcom/huami/watch/companion/ui/activity/SearchBindDeviceActivity$DeviceState;", "a", "Lcom/huami/watch/companion/ui/activity/SearchBindDeviceActivity$DeviceState;", "getDeviceState", "()Lcom/huami/watch/companion/ui/activity/SearchBindDeviceActivity$DeviceState;", "deviceState", "Landroid/app/Activity;", "b", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "activity", "<init>", "(Lcom/huami/watch/companion/ui/activity/SearchBindDeviceActivity$DeviceState;Landroid/app/Activity;)V", "companion_release"}, k = 1, mv = {1, 5, 1})
public final class BleDeviceBindEvent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SearchBindDeviceActivity.DeviceState deviceState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Activity activity;

    public BleDeviceBindEvent(@NotNull SearchBindDeviceActivity.DeviceState deviceState, @NotNull Activity activity) {
        this.deviceState = deviceState;
        this.activity = activity;
    }

    @NotNull
    public final Activity getActivity() {
        return this.activity;
    }

    @NotNull
    public final SearchBindDeviceActivity.DeviceState getDeviceState() {
        return this.deviceState;
    }
}
