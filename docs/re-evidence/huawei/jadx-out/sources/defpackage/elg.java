package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.health.device.api.HonourDeviceConstantsApi;
import com.huawei.hms.mlsdk.asr.MLAsrConstants;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import java.io.File;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class elg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f33122c = new Object();
    private static elg d;

    private elg() {
        LogUtil.a("PluginDevice_PathManager", "Enter getInstance()");
    }

    public static elg e() {
        elg elgVar;
        synchronized (f33122c) {
            if (d == null) {
                d = new elg();
            }
            elgVar = d;
        }
        return elgVar;
    }

    public boolean a(String str) {
        File file = new File(dxc.d + str);
        return file.exists() && file.delete();
    }

    public boolean d(String str) {
        return new File(c(str)).exists() && (new File(i(str)).exists() && new File(d(str, null)).exists());
    }

    public String b(String str) {
        StringBuilder sb = new StringBuilder(10);
        if (!CommonUtil.y(str)) {
            if (g(str)) {
                sb = b(b(b(b(sb, dxc.d, 5000), str, 5000), File.separator, 5000), str, 5000);
            } else {
                sb = b(b(sb, dxc.f32475b, 5000), str, 5000);
            }
        }
        return sb.toString();
    }

    public String c(String str) {
        StringBuilder sbB;
        StringBuilder sb = new StringBuilder(10);
        if (g(str)) {
            sbB = b(b(b(b(b(b(sb, dxc.d, 5000), str, 5000), File.separator, 5000), str, 5000), File.separator, 5000), "product.xml", 5000);
        } else {
            sbB = b(b(b(b(sb, dxc.f32475b, 5000), str, 5000), File.separator, 5000), "product.xml", 5000);
        }
        return sbB.toString();
    }

    public String d(String str, String str2) {
        if (CommonUtil.y(str) || CommonUtil.y(str2)) {
            LogUtil.j("PluginDevice_PathManager", "getImgPath productId or imgName more than MAX_STRING_LENGTH");
            return null;
        }
        String strC = c(str, str2);
        if (!TextUtils.isEmpty(strC)) {
            return strC;
        }
        String strB = b(str, str2);
        if (!TextUtils.isEmpty(strB)) {
            return strB;
        }
        StringBuilder sb = new StringBuilder(10);
        if (g(str)) {
            StringBuilder sbB = b(b(b(b(b(b(sb, dxc.d, 5000), str, 5000), File.separator, 5000), str, 5000), File.separator, 5000), "img", 5000);
            if (str2 != null) {
                sbB = b(b(b(sbB, File.separator, 5000), str2, 5000), ".png", 5000);
            }
            return sbB.toString();
        }
        StringBuilder sbB2 = b(b(b(b(sb, dxc.f32475b, 5000), str, 5000), File.separator, 5000), "img", 5000);
        if (str2 != null) {
            sbB2 = b(b(b(sbB2, File.separator, 5000), str2, 5000), ".png", 5000);
        }
        return sbB2.toString();
    }

    public String e(String str) {
        String strC;
        if (TextUtils.isEmpty(str) || (strC = CommonUtil.c(b(b(b(b(b(b(new StringBuilder(10), dxc.d, 5000), str, 5000), File.separator, 5000), str, 5000), File.separator, 5000), "H5/dist/index.html", 5000).toString())) == null || !new File(strC).exists()) {
            return "";
        }
        return Constants.PREFIX_FILE + strC;
    }

    public String i(String str) {
        return a(str, "");
    }

    public String a(String str, String str2) {
        StringBuilder sbB;
        String strB = LanguageUtil.b(BaseApplication.getContext());
        if (TextUtils.isEmpty(str2)) {
            str2 = strB;
        }
        if (g(str)) {
            String strF = f(str2);
            String str3 = dxc.d + str + File.separator + str + File.separator;
            String strC = CommonUtil.c(str3 + "lang/strings" + str2 + WatchFaceConstant.XML_SUFFIX);
            String strC2 = CommonUtil.c(str3 + "lang/strings" + str2 + com.huawei.openalliance.ad.constant.Constants.LINK + strF + WatchFaceConstant.XML_SUFFIX);
            if (strC2 == null || !new File(strC2).exists()) {
                return (strC == null || !new File(strC).exists()) ? e(str3, str2) : strC;
            }
            return strC2;
        }
        StringBuilder sbB2 = b(b(b(new StringBuilder(10), dxc.f32475b, 5000), str, 5000), File.separator, 5000);
        if (MLAsrConstants.LAN_ZH.equals(str2) && LanguageUtil.l(BaseApplication.getContext())) {
            sbB = b(sbB2, "lang/stringszh-rCN.xml", 5000);
        } else {
            sbB = b(sbB2, "lang/strings.xml", 5000);
        }
        return sbB.toString();
    }

    private String e(String str, String str2) {
        String strC = CommonUtil.c(str + "lang/strings" + a(BaseApplication.getContext(), str2) + WatchFaceConstant.XML_SUFFIX);
        if (strC != null && new File(strC).exists()) {
            return strC;
        }
        if (MLAsrConstants.LAN_ZH.equals(str2) && LanguageUtil.l(BaseApplication.getContext())) {
            return str + "lang/stringszh-rCN.xml";
        }
        return str + "lang/strings.xml";
    }

    private String f(String str) {
        String country = Locale.getDefault().getCountry();
        if (MLAsrConstants.LAN_ZH.equals(str)) {
            if (LanguageUtil.l(BaseApplication.getContext())) {
                return "CN";
            }
            if ("HK".equals(country)) {
                return "HK";
            }
            return "TW";
        }
        if ("my".equals(str)) {
            return d();
        }
        LogUtil.a("PluginDevice_PathManager", "is other language");
        return country;
    }

    private String d() {
        if ("Qaag".equals(Locale.getDefault().getScript())) {
            return "ZG";
        }
        return "MM";
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    private String a(Context context, String str) {
        byte b2;
        String strH = h(str);
        if (strH != null) {
            return strH;
        }
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != 3459) {
            if (iHashCode != 3500) {
                if (iHashCode != 3670) {
                    if (iHashCode != 3749) {
                        if (iHashCode == 3886 && str.equals(MLAsrConstants.LAN_ZH)) {
                            b2 = 4;
                        } else {
                            b2 = -1;
                        }
                    } else if (str.equals("uz")) {
                        b2 = 3;
                    } else {
                        b2 = -1;
                    }
                } else if (str.equals("si")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("my")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals("lo")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            return "lo-LA";
        }
        if (b2 == 1) {
            return "my-" + d();
        }
        if (b2 == 2) {
            return "si-LK";
        }
        if (b2 == 3) {
            return "uz-UZ";
        }
        if (b2 == 4) {
            if (LanguageUtil.l(context)) {
                return "zh-CN";
            }
            return "zh-TW";
        }
        return "";
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00a3  */
    private String h(String str) {
        str.hashCode();
        switch (str) {
            case "az":
                return "az-AZ";
            case "bo":
                return "bo-CN";
            case "en":
                return "en-GB";
            case "eu":
                return "eu-ES";
            case "gl":
                return "gl-ES";
            case "jv":
                return "jv-ID";
            case "ka":
                return "ka-GE";
            case "kk":
                return "kk-KZ";
            case "km":
                return "km-KH";
            case "sr":
                return "b+sr+Latn";
            default:
                return null;
        }
    }

    private String b(String str, String str2) {
        String strC;
        if (!CommonUtil.y(str) && !CommonUtil.y(str2)) {
            return (TextUtils.isEmpty(str2) || (strC = c(str, str2, false)) == null || !new File(strC).exists()) ? "" : strC;
        }
        LogUtil.j("PluginDevice_PathManager", "isOldProductImgFileExists productId or imgName more than MAX_STRING_LENGTH");
        return "";
    }

    private String c(String str, String str2) {
        String strC;
        if (!CommonUtil.y(str) && !CommonUtil.y(str2)) {
            return (TextUtils.isEmpty(str2) || (strC = c(str, str2, true)) == null || !new File(strC).exists()) ? "" : strC;
        }
        LogUtil.a("PluginDevice_PathManager", "isNewProductImgFileExists productId or imgName more than MAX_STRING_LENGTH");
        return "";
    }

    private String c(String str, String str2, boolean z) {
        StringBuilder sbB;
        StringBuilder sb = new StringBuilder(10);
        if (z) {
            sbB = b(b(b(sb, dxc.d, 5000), str, 5000), File.separator, 5000);
        } else {
            sbB = b(sb, dxc.f32475b, 5000);
        }
        return CommonUtil.c(b(b(b(b(b(b(sbB, str, 5000), File.separator, 5000), "img", 5000), File.separator, 5000), str2, 5000), ".png", 5000).toString());
    }

    private boolean g(String str) {
        if (((HonourDeviceConstantsApi) Services.b("PluginDevice", HonourDeviceConstantsApi.class)).isHonourDevice(str)) {
            return false;
        }
        String strC = CommonUtil.c(dxc.d + str + File.separator + str + File.separator + "product.xml");
        if (strC == null) {
            return false;
        }
        return new File(strC).exists();
    }

    private StringBuilder b(StringBuilder sb, String str, int i) {
        if (sb != null && str != null && sb.length() + str.length() < i) {
            sb.append(str);
        }
        return sb;
    }
}
