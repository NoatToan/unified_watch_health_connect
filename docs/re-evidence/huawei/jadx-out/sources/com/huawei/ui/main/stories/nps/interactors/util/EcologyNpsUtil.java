package com.huawei.ui.main.stories.nps.interactors.util;

import com.huawei.hwlogsmodel.LogUtil;
import defpackage.njy;
import defpackage.piq;
import defpackage.pjc;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class EcologyNpsUtil {
    private static final int DEFAULT_NPS_ID = 0;
    private static final int ECOLOGY_HEALTH_NPS_ID = 31;
    private static final int ECOLOGY_SPORT_NPS_ID = 30;
    private static final String TAG = "EcologyNpsUtil";

    public static int getDeviceNpsId(String str) {
        LogUtil.a(TAG, "productId : ", str);
        pjc intelligentDeviceBean = getIntelligentDeviceBean(str);
        if (intelligentDeviceBean == null) {
            return 0;
        }
        if (intelligentDeviceBean.b() == 1) {
            return 30;
        }
        return intelligentDeviceBean.b() == 2 ? 31 : 0;
    }

    private static pjc getIntelligentDeviceBean(String str) {
        List<pjc> listC = piq.e().c(str);
        if (njy.e(listC)) {
            return null;
        }
        pjc pjcVar = listC.get(0);
        if (piq.e().b(listC.get(0))) {
            return pjcVar;
        }
        return null;
    }

    public static String getEcologyModel(String str) {
        LogUtil.a(TAG, "productId : ", str);
        pjc intelligentDeviceBean = getIntelligentDeviceBean(str);
        if (intelligentDeviceBean == null) {
            return "";
        }
        return intelligentDeviceBean.o();
    }
}
