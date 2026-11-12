package com.xiaomi.fitness.devicesettings.huami.healthmonitor;

import com.xiaomi.fitness.settingitem.settingitem.HRDetect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.DebugKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0002\u001a\u0012\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b\u001a\r\u0010\t\u001a\u00020\u0004*\u00020\bH\u0082\b\u001a\u0012\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\b\u001a\u0012\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\b\u001a\u0012\u0010\r\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\b¨\u0006\u000e"}, d2 = {"setSleepDetectionSwitch", "", "Lcom/xiaomi/fitness/settingitem/settingitem/HRDetect;", DebugKt.DEBUG_PROPERTY_VALUE_ON, "", "isSleepAIDSDetectionEnable", "setHrDetectionFreq", "freq", "", "warningOn", "setHighHrWarningThreshold", "value", "setLowHrWarningThreshold", "setLowSpo2WarningThreshold", "device-settings_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHRDetectExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HRDetectExt.kt\ncom/xiaomi/fitness/devicesettings/huami/healthmonitor/HRDetectExtKt\n*L\n1#1,63:1\n47#1:64\n47#1:65\n47#1:66\n47#1:67\n47#1:68\n47#1:69\n*S KotlinDebug\n*F\n+ 1 HRDetectExt.kt\ncom/xiaomi/fitness/devicesettings/huami/healthmonitor/HRDetectExtKt\n*L\n50#1:64\n51#1:65\n55#1:66\n56#1:67\n60#1:68\n61#1:69\n*E\n"})
public final class HRDetectExtKt {
    public static final boolean isSleepAIDSDetectionEnable(@NotNull HRDetect hRDetect) {
        Intrinsics.checkNotNullParameter(hRDetect, "<this>");
        return hRDetect.getType() == 1 || hRDetect.getType() == 3;
    }

    public static final void setHighHrWarningThreshold(@NotNull HRDetect hRDetect, int i) {
        Intrinsics.checkNotNullParameter(hRDetect, "<this>");
        hRDetect.setWarningEnable(i > 0);
        if (i > 0) {
            hRDetect.setWarningValue(i);
        }
    }

    public static final void setHrDetectionFreq(@NotNull HRDetect hRDetect, int i) {
        Intrinsics.checkNotNullParameter(hRDetect, "<this>");
        if (i == 0) {
            hRDetect.setType(isSleepAIDSDetectionEnable(hRDetect) ? 1 : 0);
        } else {
            hRDetect.setType(isSleepAIDSDetectionEnable(hRDetect) ? 3 : 2);
            hRDetect.setFreq(i);
        }
    }

    public static final void setLowHrWarningThreshold(@NotNull HRDetect hRDetect, int i) {
        Intrinsics.checkNotNullParameter(hRDetect, "<this>");
        hRDetect.setLowWarningEnable(i > 0);
        if (i > 0) {
            hRDetect.setLowWarningValue(i);
        }
    }

    public static final void setLowSpo2WarningThreshold(@NotNull HRDetect hRDetect, int i) {
        Intrinsics.checkNotNullParameter(hRDetect, "<this>");
        hRDetect.setLowSpo2WarningEnable(i > 0);
        if (i > 0) {
            hRDetect.setLowSpo2WarningValue(i);
        }
    }

    public static final void setSleepDetectionSwitch(@NotNull HRDetect hRDetect, boolean z) {
        Intrinsics.checkNotNullParameter(hRDetect, "<this>");
        int i = 3;
        if (!z) {
            i = hRDetect.getType() == 3 ? 2 : 0;
        } else if (hRDetect.getType() == 0) {
            i = 1;
        }
        hRDetect.setType(i);
    }

    private static final boolean warningOn(int i) {
        return i > 0;
    }
}
