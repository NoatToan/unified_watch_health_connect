package com.huawei.watchface;

import android.content.ComponentName;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.mvp.model.datatype.ShareModel;
import com.huawei.watchface.mvp.model.helper.systemparam.NewSystemParamManager;
import com.huawei.watchface.mvp.model.helper.systemparam.SystemParamNames;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.FileHelper;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.IntegerUtils;
import com.tencent.connect.common.Constants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes45.dex */
public class d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f30118a = new a();

    public class a extends HashMap {
        public a() {
            put(d4.XIAOHONGSHU, "com.xingin.xhs");
            put(d4.QQ, "com.tencent.mobileqq");
            put(d4.QQ_ZONE, Constants.PACKAGE_QZONE);
            put(d4.WEIBO, "com.sina.weibo");
            put(d4.DOUYIN, "com.ss.android.ugc.aweme");
            put(d4.FACEBOOK, "com.facebook.katana");
            put(d4.TELEGRAM, "org.telegram.messenger");
            put(d4.INSTAGRAM, "com.instagram.android");
            put(d4.WHATSAPP, "com.whatsapp");
            put(d4.TWITTER, "com.twitter.android");
            put(d4.LINKEDIN, "com.linkedin.android");
            put(d4.VK, "com.vkontakte.android");
        }
    }

    public void a(d4 d4Var, ShareModel shareModel, c4.c cVar) {
        if (shareModel == null) {
            HwLog.i("OtherShare", "share shareModel is null");
            cVar.a("", 1, "OtherShare shareModel is null");
            return;
        }
        if (d4Var != d4.MORE && !o.a(a(d4Var))) {
            HwLog.i("OtherShare", "share is not installed:" + d4Var.getValue());
            cVar.a(shareModel.getShareType(), 2, "not installed");
            return;
        }
        int iA = IntegerUtils.a(shareModel.getShareContentType());
        if (iA == 0) {
            b(d4Var, shareModel, cVar);
        } else if (iA == 1) {
            c(d4Var, shareModel, cVar);
        } else {
            cVar.a(shareModel.getShareType(), 1, "shareContentType is unknow");
            HwLog.i("OtherShare", "shareContentType is unknow");
        }
    }

    public final void b(d4 d4Var, ShareModel shareModel, c4.c cVar) {
        HwLog.i("OtherShare", "shareImage enter");
        if (CommonUtils.b(Environment.getApplicationContext(), a(d4Var, shareModel, com.huawei.operation.utils.Constants.IMAGE_TYPE))) {
            cVar.a(shareModel.getShareType(), 0, "shareImage success");
            HwLog.i("OtherShare", "shareImage success");
        } else {
            cVar.a(shareModel.getShareType(), 1, "shareImage error");
            HwLog.i("OtherShare", "shareImage startActivityRes error");
        }
    }

    public final void c(d4 d4Var, ShareModel shareModel, c4.c cVar) {
        HwLog.i("OtherShare", "shareText enter");
        if (CommonUtils.b(Environment.getApplicationContext(), a(d4Var, shareModel, "text/plain"))) {
            cVar.a(shareModel.getShareType(), 0, "shareText success");
            HwLog.i("OtherShare", "shareText success");
        } else {
            cVar.a(shareModel.getShareType(), 1, "shareText error");
            HwLog.i("OtherShare", "shareText startActivityRes error");
        }
    }

    public final ComponentName a(d4 d4Var, String str) {
        try {
            JSONObject jSONObject = new JSONObject(NewSystemParamManager.getSystemParam(SystemParamNames.SYSTEM_PARAM_IS_SET_COMPONENT, "{\"6\":\"com.sina.weibo.composerinde.ComposerDispatchActivity\",\"4\":\"com.tencent.mobileqq.activity.JumpActivity\",\"3_0\":\"com.ss.android.ugc.aweme.share.OpenPlatformShareRealActivity\",\"10_0\":\"com.facebook.composer.shareintent.ImplicitShareIntentHandlerDefaultAlias\",\"12_0\":\"com.instagram.share.handleractivity.ShareHandlerActivity\",\"14\":\"com.twitter.composer.ComposerActivity\",\"15\":\"com.linkedin.android.publishing.sharing.SharingDeepLinkActivity\",\"16_0\":\"com.vkontakte.android.sharing.SharingExternalActivity\"}"));
            String strOptString = jSONObject.optString(String.valueOf(d4Var.getValue()));
            HwLog.i("OtherShare", "componentNameClass shareTypeEnum:" + strOptString);
            if (!TextUtils.isEmpty(strOptString)) {
                return new ComponentName(a(d4Var), strOptString);
            }
            String strOptString2 = jSONObject.optString(d4Var.getValue() + "_" + str);
            StringBuilder sb = new StringBuilder("componentNameClass contentType:");
            sb.append(strOptString2);
            HwLog.i("OtherShare", sb.toString());
            if (TextUtils.isEmpty(strOptString2)) {
                return null;
            }
            return new ComponentName(a(d4Var), strOptString2);
        } catch (JSONException e) {
            HwLog.e("OtherShare", "getComponent JSONException:" + HwLog.printException((Exception) e));
            return null;
        }
    }

    public final Intent a(d4 d4Var, ShareModel shareModel, String str) {
        Intent intent = new Intent("android.intent.action.SEND");
        try {
            String strA = a(d4Var);
            if (!TextUtils.isEmpty(strA)) {
                intent.setPackage(strA);
            }
            ComponentName componentNameA = a(d4Var, shareModel.getShareContentType());
            if (componentNameA != null) {
                intent.setComponent(componentNameA);
            }
            intent.setType(str);
            if (TextUtils.equals(str, com.huawei.operation.utils.Constants.IMAGE_TYPE)) {
                intent.putExtra("android.intent.extra.STREAM", shareModel.getShareImageUri() != null ? shareModel.getShareImageUri() : FileHelper.g(shareModel.getShareImagePath()));
            } else {
                intent.putExtra("android.intent.extra.TEXT", shareModel.getShareTextContent() + shareModel.getShareUrlContent());
            }
            intent = Intent.createChooser(intent, shareModel.getShareTitleContent());
            intent.addFlags(268435456);
            intent.setFlags(1);
            intent.setFlags(2);
            return intent;
        } catch (Exception e) {
            HwLog.e("OtherShare", "createShareIntent Exception:" + HwLog.printException(e));
            return intent;
        }
    }

    public final String a(d4 d4Var) {
        return (String) f30118a.get(d4Var);
    }
}
