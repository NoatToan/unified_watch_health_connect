package com.xiaomi.hm.health.training.utils;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.mifit.sportlib.common.Constants;
import com.huami.snore.ui.activity.SnoreMonitorActivity;
import com.huami.watch.companion.mediac.Command;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.devicelib.DeviceCenter;
import com.xiaomi.hm.health.training.ui.widget.RealTimeHrView;
import javax.inject.Inject;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\b\t*\u0001\u0016\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001c\u001dB\t\b\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0004J\u0016\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/hm/health/training/utils/RealTimeHrHandler;", "", "Lcom/xiaomi/hm/health/training/utils/RealTimeHrHandler$OnHeartRateReceiveListener;", "hrReceiveListener", "", "setHrReceiveListener", "start", "pause", Command.RESUME, Command.STOP, "", Constants.DATA_KEY_HR, "maxRemindHr", "vibrateHr", "a", "Lcom/xiaomi/hm/health/training/utils/RealTimeHrHandler$OnHeartRateReceiveListener;", "", "b", "Z", SnoreMonitorActivity.PAGE_STARTED, "c", "hasBoundHrDevice", "com/xiaomi/hm/health/training/utils/RealTimeHrHandler$listener$1", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/training/utils/RealTimeHrHandler$listener$1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "()V", "Companion", "OnHeartRateReceiveListener", "trainingcomponent_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class RealTimeHrHandler {

    @NotNull
    private static final String e = "Train-RealTimeHrHandler";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private OnHeartRateReceiveListener hrReceiveListener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean started;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean hasBoundHrDevice = DeviceCenter.getInstance().hasBoundBandHrDevice();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final RealTimeHrHandler$listener$1 listener = new RealTimeHrHandler$listener$1(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/training/utils/RealTimeHrHandler$OnHeartRateReceiveListener;", "", "", Constants.DATA_KEY_HR, "Lcom/xiaomi/hm/health/training/ui/widget/RealTimeHrView$HrDetectState;", "state", "", "onHrReceive", "trainingcomponent_midongRelease"}, k = 1, mv = {1, 5, 1})
    public interface OnHeartRateReceiveListener {
        void onHrReceive(int hr, @Nullable RealTimeHrView.HrDetectState state);
    }

    @Inject
    public RealTimeHrHandler() {
    }

    public final synchronized void pause() {
        if (this.hasBoundHrDevice) {
            DeviceCenter.getInstance().pause();
        }
    }

    public final synchronized void resume() {
        if (this.hasBoundHrDevice) {
            DeviceCenter.getInstance().resume();
        }
    }

    public final void setHrReceiveListener(@NotNull OnHeartRateReceiveListener hrReceiveListener) {
        this.hrReceiveListener = hrReceiveListener;
    }

    public final synchronized void start() {
        if (this.hasBoundHrDevice) {
            if (!this.started) {
                this.started = true;
                DeviceCenter.getInstance().setPeripheralListener(this.listener);
                DeviceCenter.getInstance().start(DeviceCenter.getInstance().getBoundDevice(HMDeviceType.MILI).getValue());
            }
        }
    }

    public final synchronized void stop() {
        if (this.hasBoundHrDevice) {
            DeviceCenter.getInstance().stop();
            DeviceCenter.getInstance().setPeripheralListener(null);
            this.started = false;
        }
    }

    public final void vibrateHr(int hr, int maxRemindHr) {
        DeviceCenter.getInstance().vibrateHr(hr, maxRemindHr);
    }
}
