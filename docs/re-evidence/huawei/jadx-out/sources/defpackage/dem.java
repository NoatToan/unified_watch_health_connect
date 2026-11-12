package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hms.mlsdk.asr.MLAsrConstants;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.LogAnonymous;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class dem {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final HashMap<String, String> f31711b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private del f31712a;
    private dej e;

    static {
        HashMap<String, String> map = new HashMap<>();
        f31711b = map;
        map.put("ZH", "zh-CN");
        map.put("EN", "en-US,en-GB");
        map.put("TH", MLAsrConstants.LAN_TH_TH);
        map.put("JA", "ja-JP");
        map.put("PL", "pl-PL");
        map.put("RO", "ro-RO");
        map.put("TR", MLAsrConstants.LAN_TR_TR);
        map.put("SV", "sv-SE");
        map.put("DE", MLAsrConstants.LAN_DE_DE);
        map.put("FR", MLAsrConstants.LAN_FR_FR);
        map.put("ES", "es-ES,es-US");
        map.put("IT", MLAsrConstants.LAN_IT_IT);
        map.put("AR", "ar-EG");
        map.put("RU", MLAsrConstants.LAN_RU_RU);
        map.put("CS", "cs-CZ");
        map.put("PT", "pt-PT");
        map.put("BG", "bg-BG");
    }

    private dem() {
    }

    /* JADX INFO: loaded from: classes7.dex */
    static class b {
        private static final dem e = new dem();
    }

    public static dem b() {
        dem demVar = b.e;
        demVar.a(BaseApplication.b());
        return demVar;
    }

    private void a(Context context) {
        if (context == null) {
            LogUtil.j("Track_SportNounManager", "loadSportNameJsonFile() context == null");
            return;
        }
        AssetManager assets = context.getAssets();
        if (this.f31712a == null) {
            try {
                this.f31712a = (del) lls.a(assets.open("SportWordConfig.json"), del.class);
            } catch (IOException e) {
                LogUtil.e("Track_SportNounManager", LogAnonymous.b(e));
            }
            del delVar = this.f31712a;
            LogUtil.a("Track_SportNounManager", "mSportWordsInfo : ", delVar == null ? 0 : delVar.c());
        }
        if (this.e == null) {
            try {
                this.e = (dej) lls.a(assets.open("SportNounGroup.json"), dej.class);
            } catch (IOException e2) {
                LogUtil.e("Track_SportNounManager", LogAnonymous.b(e2));
            }
            dej dejVar = this.e;
            LogUtil.a("Track_SportNounManager", "mSportNounGroupInfo : ", dejVar == null ? 0 : dejVar.b());
        }
    }

    public den b(String str) {
        del delVar;
        if (TextUtils.isEmpty(str) || (delVar = this.f31712a) == null || delVar.d() == null) {
            return null;
        }
        for (den denVar : this.f31712a.d()) {
            if (denVar != null && str.equals(denVar.e())) {
                LogUtil.a("Track_SportNounManager", "wordName: ", str, ", secondSortNum: ", denVar.d(), ", wordNum: ", denVar.c());
                return denVar;
            }
        }
        return null;
    }

    public void d() {
        LogUtil.a("Track_SportNounManager", "jumpToMainPage()");
        GRSManager.c(BaseApplication.b()).d("helpCustomerUrl", new GrsQueryCallback() { // from class: dem.1
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str) {
                LogUtil.a("Track_SportNounManager", "jumpToMainPage() urlDomain: ", str);
                if (!TextUtils.isEmpty(str)) {
                    dem demVar = dem.this;
                    demVar.d(demVar.c(str));
                } else {
                    LogUtil.j("Track_SportNounManager", "jumpToMainPage() urlDomain is Empty");
                }
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i) {
                LogUtil.j("Track_SportNounManager", "jumpToMainPage() onCallBackFail() -> ", Integer.valueOf(i));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(String str) {
        String str2;
        LogUtil.a("Track_SportNounManager", "getMainPageUrl()");
        int iN = CommonUtil.n(BaseApplication.b(), LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1009));
        LogUtil.a("Track_SportNounManager", "getMainPageUrl() siteId: ", Integer.valueOf(iN));
        if (iN == 1) {
            if (a().equals("zh-CN")) {
                str2 = String.format(Locale.ENGLISH, "/hwtips/help/health_help_all/%s/index.html#/card/ug011?cid=11080", "zh-CN");
            } else {
                str2 = String.format(Locale.ENGLISH, "/hwtips/help/health_help_all/%s/index.html#/card/ug011?cid=11080", "en-US");
            }
        } else {
            str2 = String.format(Locale.ENGLISH, "/handbook/mapJumppage/EMUI10.0/C001B001/en-US/index.html?lang=%s&groupId=ug011", a());
        }
        String str3 = str + str2;
        LogUtil.a("Track_SportNounManager", "getMainPageUrl() mainPageUrl: ", str3);
        return str3;
    }

    public void a(String str) {
        LogUtil.a("Track_SportNounManager", "jumpToDetailPage() wordName: ", str);
        final den denVarB = b(str);
        if (denVarB == null) {
            LogUtil.j("Track_SportNounManager", "sportWordsItem == null");
            return;
        }
        if (TextUtils.isEmpty(denVarB.d()) || TextUtils.isEmpty(denVarB.c())) {
            LogUtil.j("Track_SportNounManager", "getSecondSortNum or getWordNum is empty");
            return;
        }
        int iN = CommonUtil.n(BaseApplication.b(), LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1009));
        LogUtil.a("Track_SportNounManager", "jumpToDetailPage() siteId: ", Integer.valueOf(iN));
        if (iN == 1) {
            GRSManager.c(BaseApplication.b()).d("domainKlgMapDtlUrl", new GrsQueryCallback() { // from class: dem.2
                @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                public void onCallBackSuccess(String str2) {
                    LogUtil.a("Track_SportNounManager", "jumpToDetailPage() urlDomain: ", str2);
                    if (!TextUtils.isEmpty(str2)) {
                        dem demVar = dem.this;
                        demVar.d(demVar.c(str2, denVarB));
                    } else {
                        LogUtil.j("Track_SportNounManager", "jumpToDetailPage() urlDomain is Empty");
                    }
                }

                @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                public void onCallBackFail(int i) {
                    LogUtil.j("Track_SportNounManager", "jumpToDetailPage() onCallBackFail() -> ", Integer.valueOf(i));
                }
            });
        } else {
            GRSManager.c(BaseApplication.b()).d("helpCustomerUrl", new GrsQueryCallback() { // from class: dem.5
                @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                public void onCallBackSuccess(String str2) {
                    LogUtil.a("Track_SportNounManager", "jumpToDetailPage() urlDomain: ", str2);
                    if (!TextUtils.isEmpty(str2)) {
                        dem demVar = dem.this;
                        demVar.d(demVar.c(str2, denVarB));
                    } else {
                        LogUtil.j("Track_SportNounManager", "jumpToDetailPage() urlDomain is Empty");
                    }
                }

                @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                public void onCallBackFail(int i) {
                    LogUtil.j("Track_SportNounManager", "jumpToDetailPage() onCallBackFail() -> ", Integer.valueOf(i));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(String str, den denVar) {
        String str2;
        LogUtil.a("Track_SportNounManager", "getDetailPageUrl()");
        int iN = CommonUtil.n(BaseApplication.b(), LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1009));
        LogUtil.a("Track_SportNounManager", "getDetailPageUrl() siteId: ", Integer.valueOf(iN));
        if (iN == 1) {
            if (a().equals("zh-CN")) {
                str2 = String.format(Locale.ENGLISH, "/hwtips/topic/health_help_all/%s/%s.html?cid=11080#%s", "zh-CN", denVar.d(), denVar.c());
            } else {
                str2 = String.format(Locale.ENGLISH, "/hwtips/topic/health_help_all/%s/%s.html?cid=11080#%s", "en-US", denVar.d(), denVar.c());
            }
        } else {
            String str3 = denVar.b() + "";
            if (denVar.b() < 10) {
                str3 = "0" + denVar.b();
            }
            str2 = String.format(Locale.ENGLISH, "/handbook/mapJumppage/EMUI10.0/C001B001/en-US/index.html?lang=%s&id=%s&funNum=%s", a(), str3, denVar.d());
        }
        String str4 = str + str2;
        LogUtil.a("Track_SportNounManager", "getDetailPageUrl() detailPageUrl: ", str4);
        return str4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        LogUtil.a("Track_SportNounManager", "jumpToWebViewPage() url: ", str);
        Intent intent = new Intent();
        intent.setClassName(BaseApplication.d(), "com.huawei.operation.activity.WebViewActivity");
        intent.putExtra("url", str);
        intent.addFlags(268435456);
        lsx.c(intent, BaseApplication.b());
    }

    private static String a() {
        String strU = CommonUtil.u();
        String str = TextUtils.isEmpty(strU) ? "" : f31711b.get(strU.toUpperCase(Locale.ENGLISH));
        LogUtil.a("Track_SportNounManager", "getLanguageTag() languageTags: ", str);
        if (TextUtils.isEmpty(str)) {
            return "en-US";
        }
        if (!str.contains(",")) {
            return str;
        }
        String strZ = CommonUtil.z();
        LogUtil.a("Track_SportNounManager", "getLanguageTag() currentLanguageTag: ", strZ);
        if (TextUtils.isEmpty(strZ)) {
            return "en-US";
        }
        String[] strArrSplit = str.split(",");
        String str2 = strArrSplit[0];
        for (String str3 : strArrSplit) {
            if (TextUtils.equals(strZ, str3)) {
                str2 = str3;
                break;
            }
        }
        LogUtil.a("Track_SportNounManager", "getLanguageTag() languageTag: ", str2);
        return str2;
    }
}
