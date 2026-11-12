package com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.pressure;

import androidx.databinding.ObservableBoolean;
import com.miui.tsmclient.nfc.NfcConstants;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.onetrack.c.q;
import defpackage.av9;
import defpackage.dt9;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0013\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/pressure/PressureModel;", "", "Ldt9;", q.f13857a, "", NfcConstants.METHOD_SET_CONFIG, "(Ldt9;)V", "transform2Monitor", "()Ldt9;", "", "toString", "()Ljava/lang/String;", "Landroidx/databinding/ObservableBoolean;", "pressureDetectionSwitch", "Landroidx/databinding/ObservableBoolean;", "getPressureDetectionSwitch", "()Landroidx/databinding/ObservableBoolean;", "highPressureNoticeSupport", "getHighPressureNoticeSupport", "highPressureNoticeSwitch", "getHighPressureNoticeSwitch", "<init>", "()V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class PressureModel {

    @NotNull
    private final ObservableBoolean pressureDetectionSwitch = new ObservableBoolean(false);

    @NotNull
    private final ObservableBoolean highPressureNoticeSupport = new ObservableBoolean(false);

    @NotNull
    private final ObservableBoolean highPressureNoticeSwitch = new ObservableBoolean(false);

    @NotNull
    public final ObservableBoolean getHighPressureNoticeSupport() {
        return this.highPressureNoticeSupport;
    }

    @NotNull
    public final ObservableBoolean getHighPressureNoticeSwitch() {
        return this.highPressureNoticeSwitch;
    }

    @NotNull
    public final ObservableBoolean getPressureDetectionSwitch() {
        return this.pressureDetectionSwitch;
    }

    public final void setConfig(@Nullable dt9 config) {
        if (config == null) {
            return;
        }
        this.pressureDetectionSwitch.set(config.c);
        av9 av9Var = config.d;
        if (av9Var != null) {
            this.highPressureNoticeSupport.set(true);
            this.highPressureNoticeSwitch.set(av9Var.c);
        }
        Logger.d("PressureModel", "setConfig " + this);
    }

    @NotNull
    public String toString() {
        return "PressureModel(pressureDetectionSwitch=" + this.pressureDetectionSwitch.get() + ", highPressureNoticeSupport=" + this.highPressureNoticeSupport.get() + ", highPressureNoticeSwitch=" + this.highPressureNoticeSwitch.get() + ")";
    }

    @NotNull
    public final dt9 transform2Monitor() {
        dt9 dt9Var = new dt9();
        dt9Var.c = this.pressureDetectionSwitch.get();
        if (this.highPressureNoticeSupport.get()) {
            av9 av9Var = new av9();
            dt9Var.d = av9Var;
            av9Var.c = this.highPressureNoticeSwitch.get();
        }
        Logger.d("PressureModel", "transform2Monitor " + this);
        return dt9Var;
    }
}
