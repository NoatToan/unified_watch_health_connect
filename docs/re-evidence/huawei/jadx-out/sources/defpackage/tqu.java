package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hms.mlsdk.asr.MLAsrConstants;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.ui.main.R;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.Services;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public class tqu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f49551a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile tqu f49552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DeviceInfo f49553c;
    private boolean d;
    private Context e;

    private tqu(Context context) {
        this.e = context;
    }

    public static tqu e() {
        if (f49552b == null) {
            synchronized (f49551a) {
                if (f49552b == null) {
                    f49552b = new tqu(BaseApplication.getContext());
                }
            }
        }
        return f49552b;
    }

    public String a(Context context, int i, String str) {
        String strC = c(CommonUtil.z(), context, i, str);
        Uri uri = Uri.parse(strC);
        LogUtil.a("HelpInteractor", "adaptUrlInMessageCenter path:", uri.getPath(), " query:", uri.getQuery());
        return strC;
    }

    private String b(Context context, DeviceInfo deviceInfo) {
        this.f49553c = deviceInfo;
        String string = this.e.getString(R.string.IDS_app_help_b2_url_temp);
        if (this.f49553c == null) {
            LogUtil.j("HelpInteractor", "adaptUrl mCurrentDeviceInfo == null");
            return string;
        }
        String strC = c(CommonUtil.z(), context, this.f49553c.getProductType(), "");
        LogUtil.a("HelpInteractor", "adaptUrl = ", strC);
        return strC;
    }

    public String d(int i, Context context) {
        String language;
        String country;
        if (context == null) {
            language = "";
            country = "";
        } else {
            Configuration configuration = context.getResources().getConfiguration();
            language = configuration.locale.getLanguage();
            country = configuration.locale.getCountry();
        }
        return c(i, language + Constants.LINK + country);
    }

    private String c(int i, String str) {
        Context context = BaseApplication.getContext();
        GRSManager gRSManagerC = GRSManager.c(context);
        String commonCountryCode = gRSManagerC.getCommonCountryCode();
        this.d = "CN".equalsIgnoreCase(commonCountryCode);
        return d(gRSManagerC.getNoCheckUrl("domainTipsResDbankcdnNew", commonCountryCode), str, c(context, i));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:49:0x00ca  */
    private String c(String str, Context context, int i, String str2) {
        GRSManager gRSManagerC = GRSManager.c(context);
        String commonCountryCode = gRSManagerC.getCommonCountryCode();
        this.d = "CN".equalsIgnoreCase(commonCountryCode);
        if (eei.d(this.f49553c)) {
            LogUtil.a("HelpInteractor", "isNewHonorHelp");
            return b(lvi.a(i).q(), str);
        }
        String noCheckUrl = gRSManagerC.getNoCheckUrl("domainTipsResDbankcdnNew", commonCountryCode);
        String strC = c(context, i);
        LogUtil.a("HelpInteractor", "getHelpUrl language:", str, " deviceName:", strC, " country:", commonCountryCode);
        strC.hashCode();
        switch (strC) {
            case "honor-aw70":
            case "huawei-aw70-pro":
            case "huawei-aw70":
            case "honor-aw70-pro":
                return d(noCheckUrl, str, strC);
            case "Maca":
                String strD = d(str, "huaweischeme://healthapp/router/openwith?address=com.huawei.health.h5.knowledge?h5pro=true&path=CatalogueDetail&knowledgeClassNo=SXT0088&isImmerse&showStatusBar");
                LogUtil.a("HelpInteractor", "getHelpUrl url :", strD);
                return strD;
            case "Crius":
            case "Janus":
            case "Talos":
            case "Terra":
            case "Fortuna":
                String strA = a(str, noCheckUrl, strC);
                LogUtil.a("HelpInteractor", "getHelpUrl url :", strA);
                return strA;
            default:
                String strC2 = c(i, str, str2);
                if (!"".equals(strC2)) {
                    return strC2;
                }
                String strB = b(lvi.a(i).o(), str);
                if (!"".equals(strB)) {
                    return strB;
                }
                String noCheckUrl2 = gRSManagerC.getNoCheckUrl("domainTipsResDbankcdn", commonCountryCode);
                LogUtil.a("HelpInteractor", "getHelpUrl helpUrl is null");
                return b(noCheckUrl2, str, strC);
        }
    }

    private String c(int i, String str, String str2) {
        edz edzVarI;
        if (!TextUtils.isEmpty(str2)) {
            LogUtil.a("HelpInteractor", "getHelpUrlFromHilinkId hilinkId:", str2);
        } else {
            DeviceInfo deviceInfo = this.f49553c;
            if (deviceInfo != null) {
                str2 = deviceInfo.getHiLinkDeviceId();
            }
            return "";
        }
        edl pluginInfoByDeviceType = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByDeviceType(i);
        if (pluginInfoByDeviceType == null || (edzVarI = pluginInfoByDeviceType.i()) == null) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject(new JSONObject(edzVarI.e()).getString("ai_tips_product_" + str2));
            if (jSONObject.has("wear_help_url")) {
                String string = jSONObject.getString("wear_help_url");
                LogUtil.a("HelpInteractor", "WERA_HELP_URL is ", string);
                return d(str, string);
            }
        } catch (JSONException e) {
            LogUtil.e("HelpInteractor", "WERA_HELP_URL error ", e.getMessage());
        }
        return "";
    }

    private String d(String str, String str2) {
        LogUtil.a("HelpInteractor", "getUrlByLang mIsNationalDomainName:", Boolean.valueOf(this.d));
        if (this.d) {
            return c(b(str), str, str2);
        }
        return c(TextUtils.equals(str, "zh-CN") || TextUtils.equals(str, "zh-rCN"), str, str2);
    }

    private String c(boolean z, String str, String str2) {
        try {
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append(String.format(Locale.ENGLISH, str2, "zh-CN"));
                sb.append(this.d ? "&cid=11065" : "");
                return sb.toString();
            }
            Locale locale = Locale.ENGLISH;
            if (this.d) {
                str = "en-US";
            }
            return String.format(locale, str2, str);
        } catch (IllegalArgumentException e) {
            LogUtil.e("HelpInteractor", "getUrlByLang IllegalArgumentException: ", e.getLocalizedMessage());
            return "";
        }
    }

    private boolean b(String str) {
        if (str != null && str.contains(Constants.LINK)) {
            String[] strArrSplit = str.split(Constants.LINK);
            if (strArrSplit.length > 0 && MLAsrConstants.LAN_ZH.equalsIgnoreCase(strArrSplit[0])) {
                return true;
            }
        }
        return false;
    }

    private String a(String str, String str2, String str3) {
        if (this.d) {
            if (TextUtils.equals(str, "zh-CN") || TextUtils.equals(str, "zh-rCN")) {
                return String.format(Locale.ENGLISH, str2 + "/%s/EMUI8.0/C001B001/%s/index.html", str3, "zh-CN");
            }
            return String.format(Locale.ENGLISH, str2 + "/%s/EMUI8.0/C001B001/%s/index.html", str3, "en-US");
        }
        if (TextUtils.equals(str, "zh-CN") || TextUtils.equals(str, "zh-rCN")) {
            return String.format(Locale.ENGLISH, str2 + "/handbook/Jumppage/EMUI8.0/C001B001/en-US/index.html?lang=%s&devicetype=%s", "zh-CN", str3);
        }
        return String.format(Locale.ENGLISH, str2 + "/handbook/Jumppage/EMUI8.0/C001B001/en-US/index.html?lang=%s&devicetype=%s", str, str3);
    }

    private String b(Map<String, String> map, String str) {
        if (map == null) {
            LogUtil.j("HelpInteractor", "getDefaultHelpUrl helpUrlMap is null");
            return "";
        }
        if (b(str)) {
            return map.get("zh_rCN");
        }
        return String.format(Locale.ENGLISH, map.get("en_us"), str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x005a  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    private String d(String str, String str2, String str3) {
        byte b2;
        byte b3;
        if (TextUtils.equals(str2, "zh-CN") || TextUtils.equals(str2, "zh-rCN")) {
            str3.hashCode();
            switch (str3) {
                case "honor-aw70":
                    b2 = 0;
                    break;
                case "huawei-aw70-pro":
                    b2 = 1;
                    break;
                case "huawei-aw70":
                    b2 = 2;
                    break;
                case "honor-aw70-pro":
                    b2 = 3;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 == 0) {
                return a(str2, str, "AW70_honor");
            }
            if (b2 == 1) {
                return c(str, str2, "AW70_B39");
            }
            if (b2 == 2) {
                return a(str2, str, "AW70");
            }
            if (b2 == 3) {
                return c(str, str2, "AW70_B39HN");
            }
            return a("zh-CN", str, "AW70");
        }
        str3.hashCode();
        switch (str3) {
            case "honor-aw70":
                b3 = 0;
                break;
            case "huawei-aw70-pro":
                b3 = 1;
                break;
            case "huawei-aw70":
                b3 = 2;
                break;
            case "honor-aw70-pro":
                b3 = 3;
                break;
            default:
                b3 = -1;
                break;
        }
        if (b3 == 0) {
            return a(str2, str, "AW70_honor");
        }
        if (b3 == 1) {
            return c(str, str2, "AW70_B39");
        }
        if (b3 == 2) {
            return a(str2, str, "AW70");
        }
        if (b3 == 3) {
            return c(str, str2, "AW70_B39HN");
        }
        return a(str2, str, "AW70");
    }

    private String c(String str, String str2, String str3) {
        if (TextUtils.equals(str2, "zh-CN") || TextUtils.equals(str2, "zh-rCN")) {
            if (this.d) {
                return str + String.format(Locale.ENGLISH, "/SmartWear/%s/EMUI8.0/C001B001/%s/index.html", str3, "zh-CN");
            }
            return str + String.format(Locale.ENGLISH, "/handbook/Jumppage/EMUI8.0/C001B001/en-US/index.html?lang=%s&devicetype=%s", "zh-CN", str3);
        }
        if (this.d) {
            return str + String.format(Locale.ENGLISH, "/SmartWear/%s/EMUI8.0/C001B001/%s/index.html", str3, "en-US");
        }
        return str + String.format(Locale.ENGLISH, "/handbook/Jumppage/EMUI8.0/C001B001/en-US/index.html?lang=%s&devicetype=%s", str2, str3);
    }

    private String b(String str, String str2, String str3) {
        LogUtil.a("HelpInteractor", "mIsNationalDomainName:", Boolean.valueOf(this.d));
        if (this.d) {
            if (b(str2)) {
                return String.format(Locale.ENGLISH, str + "/SmartWear/%s/EMUI8.0/C001B001/%s/index.html", str3, "zh-CN");
            }
            return String.format(Locale.ENGLISH, str + "/SmartWear/%s/EMUI8.0/C001B001/%s/index.html", str3, "en-US");
        }
        if (TextUtils.equals(str2, "zh-CN") || TextUtils.equals(str2, "zh-rCN")) {
            return String.format(Locale.ENGLISH, str + "/handbook/SmartWear/%s/EMUI8.0/C001B001/%s/index.html", str3, "zh-CN");
        }
        return String.format(Locale.ENGLISH, str + "/handbook/SmartWear/%s/EMUI8.0/C001B001/%s/index.html", str3, "en-US");
    }

    private String c(Context context, int i) {
        String country;
        if (i == 3) {
            return "huawei-watch";
        }
        if (i == 5) {
            if (context == null) {
                country = "";
            } else {
                country = context.getResources().getConfiguration().locale.getCountry();
            }
            if ("RU".equals(country) || "FR".equals(country) || FaqConstants.OPEN_TYPE_IN.equals(country)) {
                return "b0-honor";
            }
            return "b0";
        }
        if (i == 10) {
            return "Leo";
        }
        if (i == 96 || i == 275) {
            return "Maca";
        }
        if (i == 7) {
            return "B3";
        }
        if (i == 8) {
            return "Metis";
        }
        switch (i) {
            case 12:
                return "AW61";
            case 13:
                return "NYX";
            case 14:
                return "Grus";
            case 15:
                return "Eris";
            default:
                return d(i);
        }
    }

    private String d(int i) {
        if (i == 1) {
            return "b2";
        }
        if (i == 11) {
            return "AM_R1";
        }
        if (i == 16) {
            return "Janus";
        }
        if (i == 34) {
            return "HUAWEI_WATCH_GT2";
        }
        if (i == 23) {
            return "huawei-aw70";
        }
        if (i == 24) {
            return "honor-aw70";
        }
        if (i == 36) {
            return "huawei-aw70-pro";
        }
        if (i != 37) {
            switch (i) {
                case 18:
                    return "Crius";
                case 19:
                    return "Terra";
                case 20:
                    return "Talos";
                case 21:
                    return "Fortuna";
                default:
                    return e(i);
            }
        }
        return "honor-aw70-pro";
    }

    private String e(int i) {
        if (i == 35) {
            return "HONOR_MagicWatch2";
        }
        if (i == 55) {
            return "Terra_B0";
        }
        if (i == 44) {
            return "Andes_B19";
        }
        if (i == 45) {
            return "Andes_B29";
        }
        return "";
    }

    public String d(DeviceInfo deviceInfo) {
        String strB = b(this.e, deviceInfo);
        LogUtil.d("HelpInteractor", "getDeviceHelpUrl deviceName:", deviceInfo != null ? deviceInfo.getDeviceName() : "null name", ", helpUrl:", strB);
        return strB;
    }
}
