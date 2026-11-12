package com.xiaomi.ai.domain.mobileapp.adapter;

import com.xiaomi.ai.domain.mobileapp.common.ActionType;
import com.xiaomi.ai.domain.mobileapp.common.AppItem;
import com.xiaomi.ai.domain.mobileapp.common.Device;
import com.xiaomi.ai.domain.mobileapp.common.MobileAppIntention;
import com.xiaomi.ai.domain.mobileapp.parser.ResourceSuite;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes7.dex */
public class ClientAdapter {
    private static final int CLOSE_MULTI_APP_VERSION = 302000004;
    private static final int CLOSE_MUSIC_VERSION = 303000002;
    private static final int DOWNLOAD_NOW_VERSION = 304001001;
    private static final String MIUI_PLAYER_PACKAGE = "com.miui.player";

    public static void adapt(MobileAppIntention mobileAppIntention, int i) {
        if (mobileAppIntention == null || mobileAppIntention.getScore() < 0.5d) {
            return;
        }
        adaptDownloadNow(mobileAppIntention, i);
        adaptCloseMusic(mobileAppIntention, i);
        adaptCloseMultiApp(mobileAppIntention, i);
    }

    private static void adaptCloseMultiApp(MobileAppIntention mobileAppIntention, int i) {
        if (!Device.isMiPhoneOrPad(mobileAppIntention.getDevice()) || i >= 302000004 || !ActionType.CLOSE.toString().equals(mobileAppIntention.getAction()) || mobileAppIntention.getApps().isEmpty()) {
            return;
        }
        MobileAppIntention.ShowApp showApp = mobileAppIntention.getApps().get(0);
        AppItem appItemByPackageName = ResourceSuite.getInstance().getAppItemByPackageName(showApp.getPackageName(), Device.PHONE);
        if (appItemByPackageName == null || !appItemByPackageName.hasName(mobileAppIntention.getName())) {
            mobileAppIntention.setScore(0.0d);
        } else {
            mobileAppIntention.setApps(new ArrayList(Collections.singletonList(showApp)));
        }
    }

    private static void adaptCloseMusic(MobileAppIntention mobileAppIntention, int i) {
        if (ActionType.CLOSE.toString().equals(mobileAppIntention.getAction()) && mobileAppIntention.getApps().size() == 1 && "com.miui.player".equals(mobileAppIntention.getApps().get(0).getPackageName()) && i < CLOSE_MUSIC_VERSION) {
            mobileAppIntention.setScore(0.79d);
        }
    }

    private static void adaptDownloadNow(MobileAppIntention mobileAppIntention, int i) {
        if (i < DOWNLOAD_NOW_VERSION) {
            mobileAppIntention.setDownloadNow(false);
        }
    }
}
