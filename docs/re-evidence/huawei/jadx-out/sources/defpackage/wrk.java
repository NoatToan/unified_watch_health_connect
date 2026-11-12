package defpackage;

import android.text.TextUtils;
import com.google.gson.JsonSyntaxException;
import com.huawei.hms.kit.awareness.status.CapabilityStatus;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.userprofile.card.familycard.beans.FamilyHealthCardInfo;
import health.compact.a.LogAnonymous;
import health.compact.a.SharedPreferenceManager;

/* JADX INFO: loaded from: classes19.dex */
public class wrk {
    public static void b(FamilyHealthCardInfo familyHealthCardInfo) {
        if (familyHealthCardInfo == null) {
            return;
        }
        String strB = qqt.b(familyHealthCardInfo);
        if (TextUtils.isEmpty(strB)) {
            return;
        }
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(CapabilityStatus.AWA_CAP_CODE_WIFI), "family_health_card_data", strB, null);
    }

    public static FamilyHealthCardInfo d() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(CapabilityStatus.AWA_CAP_CODE_WIFI), "family_health_card_data");
        if (TextUtils.isEmpty(strE)) {
            return new FamilyHealthCardInfo();
        }
        try {
            return (FamilyHealthCardInfo) qqt.e(strE, FamilyHealthCardInfo.class);
        } catch (JsonSyntaxException | NumberFormatException e) {
            LogUtil.e("FamilyHealthCardCacheUtil", LogAnonymous.b(e));
            return new FamilyHealthCardInfo();
        }
    }
}
