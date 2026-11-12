package com.xiaomi.hm.health.heartrate;

import android.text.TextUtils;
import com.huami.device.feature.health.HealthDetect;
import com.xiaomi.hm.health.Constant;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.utils.HMPropertyUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0002"}, d2 = {"", "isOpenWholeHr", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class HeartDateUtilsKt {
    public static final boolean isOpenWholeHr() {
        if (!HMDeviceManager.getInstance().hasBound(HMDeviceType.WATCH)) {
            return HealthDetect.INSTANCE.getHealthConfig().isDeviceAlldayHrMeasure();
        }
        String property = HMPropertyUtil.getProperty("huami.watch.health.config", null);
        if (TextUtils.isEmpty(property)) {
            return false;
        }
        try {
            String strOptString = new JSONObject(property).optString(Constant.KEY_WATCH_CONFIG_HEARTE);
            return !TextUtils.isEmpty(strOptString) && Intrinsics.areEqual("1", strOptString);
        } catch (JSONException unused) {
            return false;
        }
    }
}
