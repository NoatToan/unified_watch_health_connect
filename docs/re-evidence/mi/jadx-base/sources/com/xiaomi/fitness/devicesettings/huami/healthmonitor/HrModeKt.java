package com.xiaomi.fitness.devicesettings.huami.healthmonitor;

import android.content.res.Resources;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.hm.health.bt.sdk.data.HrFreq;
import defpackage.wzi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0001\u001a\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u0018\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b¨\u0006\u000f"}, d2 = {"MODE_SLEEP", "", "MODE_AUTO", "MODE_FULL", "MODE_CLOSE", "res", "Landroid/content/res/Resources;", "kotlin.jvm.PlatformType", "Landroid/content/res/Resources;", "getMode", "Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/HrMode;", "modeId", "getHrFreq", "Lcom/xiaomi/hm/health/bt/sdk/data/HrFreq;", "frequency", "device-settings_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HrModeKt {
    public static final int MODE_AUTO = 2;
    public static final int MODE_CLOSE = 0;
    public static final int MODE_FULL = 3;
    public static final int MODE_SLEEP = 1;
    private static final Resources res = AppUtil.getApp().getResources();

    @NotNull
    public static final HrFreq getHrFreq(int i) {
        if (i == 1) {
            return HrFreq.FREQ_1;
        }
        if (i == 5) {
            return HrFreq.FREQ_5;
        }
        if (i != 10) {
            return i != 255 ? HrFreq.FREQ_30 : HrFreq.FREQ_SMART;
        }
        return HrFreq.FREQ_10;
    }

    @NotNull
    public static final HrMode getMode(int i) {
        HrMode hrMode;
        if (i == 1) {
            hrMode = HrMode.Sleep.INSTANCE;
            Resources resources = res;
            hrMode.title = resources.getString(wzi.Q4);
            hrMode.des = resources.getString(wzi.R4);
        } else if (i == 2) {
            hrMode = HrMode.Auto.INSTANCE;
            Resources resources2 = res;
            hrMode.title = resources2.getString(wzi.a3);
            hrMode.des = resources2.getString(wzi.b3);
        } else if (i != 3) {
            hrMode = HrMode.Close.INSTANCE;
            Resources resources3 = res;
            hrMode.title = resources3.getString(wzi.f);
            hrMode.des = resources3.getString(wzi.z1);
        } else {
            hrMode = HrMode.Full.INSTANCE;
            Resources resources4 = res;
            hrMode.title = resources4.getString(wzi.O4);
            hrMode.des = resources4.getString(wzi.P4);
        }
        Logger.d("HrModeSetting", "getMode: name = " + hrMode.title + "; desc = " + hrMode.des);
        return hrMode;
    }
}
