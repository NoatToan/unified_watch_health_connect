package com.xiaomi.ai.domain.mobileapp.adapter;

import com.google.gson.JsonObject;
import com.xiaomi.ai.domain.mobileapp.common.ActionType;
import com.xiaomi.ai.domain.mobileapp.common.Device;
import com.xiaomi.ai.domain.mobileapp.common.MobileAppIntention;
import com.xiaomi.ai.domain.mobileapp.parser.ResourceSuite;
import defpackage.aqe;
import defpackage.klo;
import defpackage.qpe;

/* JADX INFO: loaded from: classes7.dex */
public class EdgeAdapter {
    private static final qpe LOGGER = aqe.f(EdgeAdapter.class);

    public static void adapt(MobileAppIntention mobileAppIntention) {
        adapt(mobileAppIntention, Device.PHONE, -1, new JsonObject());
    }

    public static void adapt(MobileAppIntention mobileAppIntention, Device device, int i, JsonObject jsonObject) {
        if (mobileAppIntention == null || mobileAppIntention.getScore() < 0.5d) {
            return;
        }
        String action = mobileAppIntention.getAction();
        boolean z = true;
        boolean z2 = ActionType.UNINSTALL.toString().equals(action) || (!mobileAppIntention.getApps().isEmpty() && mobileAppIntention.getConfidence() >= 1.0d && (ResourceSuite.getInstance().hasToken(mobileAppIntention.getName(), device) || !mobileAppIntention.getTag().isEmpty()));
        LOGGER.debug("appName:{} device.getAppName:{} app size:{} action:{} clientId:{}", device.getAppNameOriginal(), device.getAppName(), Integer.valueOf(mobileAppIntention.getApps().size()), action, Integer.valueOf(i));
        if (i >= 304002000) {
            if ((ActionType.INSTALL.toString().equals(action) || ActionType.OPEN.toString().equals(action)) && mobileAppIntention.getApps().size() > 1) {
                z2 = false;
            }
            if (ActionType.CLOSE.toString().equals(action)) {
                String forcegroundApp = ContextAdapter.parseForcegroundApp(jsonObject);
                if (klo.f(forcegroundApp) || ContextAdapter.MIUI_HOME_PACKAGE.equals(forcegroundApp) || mobileAppIntention.getApps().size() != 1 || !forcegroundApp.equals(mobileAppIntention.getApps().get(0).getPackageName())) {
                    z = false;
                }
            } else {
                z = z2;
            }
            if (ActionType.CLOSE_CURRENT.toString().equals(action)) {
                return;
            } else {
                z2 = z;
            }
        }
        if (z2) {
            return;
        }
        mobileAppIntention.setScore(0.0d);
    }
}
