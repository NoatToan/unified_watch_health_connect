package com.xiaomi.fitness.chart.entrys;

import defpackage.aji;
import defpackage.gni;
import defpackage.x44;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u000f\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\u000e\u0010\u0018\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bR\u001a\u0010\f\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b\u0015\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/chart/entrys/StressEntry;", "Lcom/xiaomi/fitness/chart/entrys/MaxMinEntry;", "x", "", "y", "timestamp", "", "type", "", "deviceType", "<init>", "(FFJII)V", "pressType", "getPressType", "()I", "setPressType", "(I)V", "color", "getColor", "setColor", "getDeviceType", "setDeviceType", "", "setHuamiPressType", "getPressColor", "Companion", "chart_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StressEntry extends MaxMinEntry {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int DEVICE_DEFAULT_TYPE = 0;
    public static final int DEVICE_HUAMI_TYPE = 1;
    public static final int MAX_STRESS = 100;
    public static final int TYPE_PRESS_MILD = 2;
    public static final int TYPE_PRESS_MODERATE = 1;
    public static final int TYPE_PRESS_RELAX = 3;
    public static final int TYPE_PRESS_SEVERE = 0;
    private int color;
    private int deviceType;
    private int pressType;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\u0007J\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\u0007J\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/chart/entrys/StressEntry$Companion;", "", "<init>", "()V", "MAX_STRESS", "", "TYPE_PRESS_SEVERE", "TYPE_PRESS_MODERATE", "TYPE_PRESS_MILD", "TYPE_PRESS_RELAX", "DEVICE_HUAMI_TYPE", "DEVICE_DEFAULT_TYPE", "getStressType", "stressValue", "deviceType", "getStressTypeFace", "getPressTypeColor", "pressType", "chart_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getPressTypeColor(int pressType) {
            if (pressType != 0 && pressType != 1 && pressType != 2 && pressType == 3) {
                return x44.a(aji.H);
            }
            return x44.a(aji.H);
        }

        @JvmStatic
        public final int getStressType(int stressValue, int deviceType) {
            if (deviceType == 1) {
                if (stressValue <= 79) {
                    if (stressValue <= 59) {
                        if (stressValue <= 39) {
                            return 3;
                        }
                        return 2;
                    }
                    return 1;
                }
                return 0;
            }
            if (stressValue <= 80) {
                if (stressValue <= 50) {
                    if (stressValue <= 25) {
                        return 3;
                    }
                    return 2;
                }
                return 1;
            }
            return 0;
        }

        public final int getStressTypeFace(int stressValue, int deviceType) {
            int stressType = getStressType(stressValue, deviceType);
            if (stressType == 0) {
                return gni.d;
            }
            if (stressType == 1) {
                return gni.g;
            }
            if (stressType != 2 && stressType == 3) {
                return gni.f;
            }
            return gni.e;
        }
    }

    public StressEntry(float f, float f2, long j, int i, int i2) {
        super(f, f2, j, i);
        this.deviceType = i2;
        if (i2 == 1) {
            setHuamiPressType();
        } else {
            setPressType();
        }
        this.color = getPressColor(this.pressType);
    }

    @JvmStatic
    public static final int getStressType(int i, int i2) {
        return INSTANCE.getStressType(i, i2);
    }

    private final void setHuamiPressType() {
        int i;
        if (getY() > 79.0f) {
            i = 0;
        } else if (getY() > 59.0f) {
            i = 1;
        } else {
            i = getY() > 39.0f ? 2 : 3;
        }
        this.pressType = i;
    }

    public final int getColor() {
        return this.color;
    }

    public final int getDeviceType() {
        return this.deviceType;
    }

    public final int getPressColor(int pressType) {
        if (pressType != 0 && pressType != 1 && pressType != 2 && pressType == 3) {
            return x44.a(aji.H);
        }
        return x44.a(aji.H);
    }

    public final int getPressType() {
        return this.pressType;
    }

    public final void setColor(int i) {
        this.color = i;
    }

    public final void setDeviceType(int i) {
        this.deviceType = i;
    }

    public final void setPressType(int i) {
        this.pressType = i;
    }

    private final void setPressType() {
        int i;
        if (getY() > 80.0f) {
            i = 0;
        } else if (getY() > 50.0f) {
            i = 1;
        } else {
            i = getY() > 25.0f ? 2 : 3;
        }
        this.pressType = i;
    }
}
