package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hms.mlsdk.asr.MLAsrConstants;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.operation.PluginOperation;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.Utils;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class uka {
    private static final String[] e = {"ar-EG", "en-GB", "bg-BG", "cs-CZ", MLAsrConstants.LAN_FR_FR, MLAsrConstants.LAN_DE_DE, MLAsrConstants.LAN_IT_IT, "ja-JP", "pl-PL", "pt-PT", "ro-RO", MLAsrConstants.LAN_RU_RU, MLAsrConstants.LAN_ES_ES, "es-US", "sv-SE", MLAsrConstants.LAN_TH_TH, MLAsrConstants.LAN_TR_TR, "zh-CN", "en-US"};

    public static void e(final Context context, final String str) {
        if (!Utils.o()) {
            Intent intent = new Intent();
            intent.setData(Uri.parse("huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.knowledge?h5pro=true&isImmerse&showStatusBar&path=Knowledge&knowledgeNo=EJ020"));
            intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
            intent.setFlags(268435456);
            iov.d(BaseApplication.getContext(), intent);
            return;
        }
        GRSManager.c(context).d("domainKlgMapDtlUrl", new GrsQueryCallback() { // from class: uka.4
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str2) {
                if (!TextUtils.isEmpty(str2)) {
                    PluginOperation.getInstance(context).startOperationWebPage(uka.c(context, str2, str));
                } else {
                    LogUtil.j("SportDescriptionUtils", "enterDescriptionUrl url is empty");
                }
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i) {
                LogUtil.j("SportDescriptionUtils", "enterDescriptionUrl fail resultCode is ", Integer.valueOf(i));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(Context context, String str, String str2) {
        String str3;
        LogUtil.a("SportDescriptionUtils", "enter enterDescriptionUrl");
        if (CommonUtil.n(context, LoginInit.getInstance(context).getAccountInfo(1009)) == 1) {
            str3 = LanguageUtil.f(context) ? String.format(Locale.ENGLISH, str2, "zh-CN") : String.format(Locale.ENGLISH, str2, "en-US");
        } else {
            String strZ = CommonUtil.z();
            if (!Arrays.asList(e).contains(strZ)) {
                str3 = String.format(Locale.ENGLISH, str2, "en-US");
            } else {
                str3 = String.format(Locale.ENGLISH, str2, strZ);
            }
        }
        return str + str3;
    }
}
