package com.huami.watch.companion.agreement.util;

import android.content.Context;
import com.huami.watch.companion.agreement.AgreementManager;
import com.huami.watch.companion.agreement.bean.AgreementType;
import com.huami.watch.companion.config.Config;
import com.huami.watch.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class AgreementUtil {
    private static final String a = "Agreement-Util";

    public static List<String> getNeedRequestTypes(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(AgreementType.TOS.getType());
        arrayList.add(AgreementType.PRIVACY.getType());
        if (isNeedExperience(context)) {
            arrayList.add(AgreementType.EXPERIENCE.getType());
        }
        return arrayList;
    }

    public static boolean isExperienceAgree(Context context) {
        boolean z = !Config.isUserOversea(context) || (!Config.isUserEU(context) && AgreementManager.isAgree(AgreementType.EXPERIENCE));
        Log.d(a, "IsExperienceAgree : " + z, new Object[0]);
        return z;
    }

    public static boolean isNeedExperience(Context context) {
        return Config.isUserOversea(context) && !Config.isUserEU(context);
    }
}
