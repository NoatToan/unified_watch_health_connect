package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.sdk.m.s.e;
import com.huawei.health.arkuix.IntentParams;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes7.dex */
public class fti {
    public static Intent c(Context context, Bundle bundle) {
        if (context == null || bundle == null) {
            LogUtil.j("ArkUIJumpUtils", "buildArkUIIntent invalid params");
            return null;
        }
        String string = bundle.getString("page_id");
        if (TextUtils.isEmpty(string)) {
            LogUtil.j("ArkUIJumpUtils", "buildArkUIIntent pageId is empty");
            return null;
        }
        if (!bundle.containsKey("module_type")) {
            LogUtil.j("ArkUIJumpUtils", "buildArkUIIntent moduleType is missing");
            return null;
        }
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), ArkUIXConstants.ENTRY_ABILITY_ACTIVITY);
        IntentParams.Builder builderAddBuildConfigInfo = IntentParams.builder().addPageId(string).addBuildConfigInfo(CommonUtil.a());
        if (bundle.containsKey("time_stamp")) {
            String string2 = bundle.getString("time_stamp");
            if (!TextUtils.isEmpty(string2)) {
                builderAddBuildConfigInfo.addTimeStamp(string2);
            }
        }
        String string3 = bundle.getString("bi_from_pullFrom");
        String string4 = bundle.getString("bi_from_resourceName");
        String string5 = bundle.getString("bi_from_pullOrder");
        if (!TextUtils.isEmpty(string3) && !TextUtils.isEmpty(string4) && !TextUtils.isEmpty(string5)) {
            builderAddBuildConfigInfo.addBiFrom(string3, string4, string5);
        }
        IntentParams intentParamsBuild = builderAddBuildConfigInfo.build();
        LogUtil.a("ArkUIJumpUtils", "buildArkUIIntent params: ", intentParamsBuild);
        intent.putExtra(e.n, intentParamsBuild.toString());
        intent.putExtra(ArkUIXConstants.ARKUIX_MODULE_TYPE_KEY, bundle.getInt("module_type"));
        return intent;
    }

    public static void e(Context context, Bundle bundle) {
        Intent intentC = c(context, bundle);
        if (intentC != null) {
            iov.c(context, intentC);
        }
    }
}
