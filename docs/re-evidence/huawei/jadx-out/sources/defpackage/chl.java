package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.codevalueplatform.coderule.bean.basebean.IntentInfo;
import com.huawei.codevalueplatform.coderule.bean.basebean.Rule;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.openalliance.ad.constant.Constants;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes4.dex */
public class chl {
    public Intent c(String str, List<Rule> list) {
        Intent intentD = d(str, list);
        if (intentD == null) {
            return null;
        }
        cib.b("CloudCodeRuleJumper", "jump intent is find in rule table");
        intentD.addFlags(268435456);
        return intentD;
    }

    private Intent d(String str, List<Rule> list) {
        List<IntentInfo> arrayList;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (Rule rule : list) {
            if (rule.getMatchType() == 0) {
                arrayList = e(str, rule);
            } else if (rule.getMatchType() == 1) {
                arrayList = a(str, rule);
            } else if (rule.getMatchType() == 2) {
                arrayList = c(str, rule);
            } else {
                arrayList = new ArrayList<>();
            }
            if (!arrayList.isEmpty()) {
                return d(str, b(arrayList));
            }
        }
        return null;
    }

    private Intent d(String str, IntentInfo intentInfo) {
        if (intentInfo == null) {
            cib.b("CloudCodeRuleJumper", "startIntent intentInfo is null");
            return null;
        }
        if (intentInfo.getAppType() == 0) {
            return b(intentInfo, str);
        }
        if (intentInfo.getAppType() == 2) {
            return e(str);
        }
        if (intentInfo.getAppType() != 3) {
            cib.b("CloudCodeRuleJumper", "default process");
            return null;
        }
        return c();
    }

    private Intent b(IntentInfo intentInfo, String str) {
        boolean zB;
        Intent intentB;
        if (TextUtils.isEmpty(intentInfo.getPackageName())) {
            return null;
        }
        boolean zIsEmpty = TextUtils.isEmpty(intentInfo.getActivity());
        if (!zIsEmpty && TextUtils.isEmpty(intentInfo.getAppVersion())) {
            return null;
        }
        cib.b("CloudCodeRuleJumper", "check jump isImplicitJump: " + zIsEmpty);
        if (zIsEmpty) {
            Intent intentB2 = b(e(intentInfo), intentInfo, str);
            zB = intentB2 != null ? cic.d(chm.c(), intentB2) : false;
        } else {
            zB = b(intentInfo.getPackageName(), intentInfo.getAppVersion());
        }
        cib.b("CloudCodeRuleJumper", "isJumpValid: " + zB);
        if (!zB) {
            return d(intentInfo);
        }
        if (zIsEmpty) {
            intentB = e(intentInfo);
        } else {
            intentB = b(intentInfo);
        }
        return b(intentB, intentInfo, str);
    }

    private Intent e(IntentInfo intentInfo) {
        Intent intent = new Intent(intentInfo.getAction());
        intent.setPackage(intentInfo.getPackageName());
        return intent;
    }

    private Intent b(IntentInfo intentInfo) {
        Intent intent = new Intent();
        intent.setAction(intentInfo.getAction());
        intent.setComponent(c(intentInfo));
        return intent;
    }

    private Intent b(Intent intent, IntentInfo intentInfo, String str) {
        String url = intentInfo.getUrlValueType() == 1 ? intentInfo.getUrl() : str;
        if (url == null) {
            url = "";
        }
        if (!TextUtils.isEmpty(intentInfo.getExtraValueKey())) {
            intent.putExtra(intentInfo.getExtraValueKey(), str);
            cib.b("CloudCodeRuleJumper", "key: " + intentInfo.getExtraValueKey());
        }
        intent.setData(c(intentInfo, url));
        intent.putExtra("clientId", chm.d());
        return intent;
    }

    private Intent d(IntentInfo intentInfo) {
        if (TextUtils.equals(intentInfo.getPackageName(), "com.huawei.pcassistant")) {
            cib.b("CloudCodeRuleJumper", "pcassistant is not pre install");
            return null;
        }
        if (TextUtils.equals(intentInfo.getPackageName(), Constants.WELINK_PKG_NAME)) {
            cib.b("CloudCodeRuleJumper", "welink is need open with browser");
            return null;
        }
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("market://details?id=" + intentInfo.getPackageName()));
        intent.setPackage("com.huawei.appmarket");
        intent.setFlags(268435456);
        return intent;
    }

    private Uri c(IntentInfo intentInfo, String str) {
        if (TextUtils.equals(intentInfo.getPackageName(), "com.huawei.pcassistant")) {
            try {
                str = URLDecoder.decode(str, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
                cib.d("CloudCodeRuleJumper", "decode URL error");
                return null;
            }
        }
        return Uri.parse(str);
    }

    private ComponentName c(IntentInfo intentInfo) {
        if (cie.e() && TextUtils.equals(intentInfo.getPackageName(), "com.huawei.pcassistant")) {
            return new ComponentName("com.hihonor.pcassistant", "com.hihonor.pcassistant.ui.MainActivityEx");
        }
        return new ComponentName(intentInfo.getPackageName(), intentInfo.getActivity());
    }

    private boolean b(String str, String str2) {
        if (cic.c(cic.c(str), str2)) {
            return true;
        }
        cib.b("CloudCodeRuleJumper", "jump activity app limit version is not match");
        return false;
    }

    private Intent e(String str) {
        Intent intent = new Intent();
        intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
        intent.setData(Uri.parse(str));
        return intent;
    }

    private Intent c() {
        return cif.d();
    }

    private IntentInfo b(List<IntentInfo> list) {
        if (list.isEmpty()) {
            cib.b("CloudCodeRuleJumper", "getJumpIntent intentInfo list is empty");
            return null;
        }
        IntentInfo intentInfoA = a(c(list));
        if (intentInfoA == null) {
            cib.b("CloudCodeRuleJumper", "app not available");
        }
        return intentInfoA;
    }

    private List<IntentInfo> c(List<IntentInfo> list) {
        return (List) new ArrayList(list).stream().filter(new Predicate() { // from class: chk
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return Objects.nonNull((IntentInfo) obj);
            }
        }).sorted(new Comparator() { // from class: chn
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return chl.a((IntentInfo) obj, (IntentInfo) obj2);
            }
        }).collect(Collectors.toList());
    }

    static /* synthetic */ int a(IntentInfo intentInfo, IntentInfo intentInfo2) {
        return intentInfo.getAppType() - intentInfo2.getAppType();
    }

    private IntentInfo a(List<IntentInfo> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            IntentInfo intentInfo = list.get(i);
            if (intentInfo.getAppType() == 2 || (intentInfo.getAppType() == 3 && chm.h())) {
                return intentInfo;
            }
            if (cic.d(chm.c(), intentInfo.getPackageName())) {
                cib.b("CloudCodeRuleJumper", "available packageName:" + intentInfo.getPackageName());
                return intentInfo;
            }
        }
        return null;
    }

    private List<IntentInfo> a(String str, Rule rule) {
        if (str.startsWith(rule.getMatchedStr())) {
            return rule.getIntentInfo();
        }
        return new ArrayList();
    }

    private List<IntentInfo> c(String str, Rule rule) {
        if (str.endsWith(rule.getMatchedStr())) {
            return rule.getIntentInfo();
        }
        return new ArrayList();
    }

    private List<IntentInfo> e(String str, Rule rule) {
        String strC = c(rule);
        cib.a("CloudCodeRuleJumper", "check deeplink: " + strC);
        if (strC != null && str.startsWith(strC)) {
            return rule.getIntentInfo();
        }
        return new ArrayList();
    }

    private static String c(Rule rule) {
        String str;
        if (rule == null) {
            return null;
        }
        String strB = cih.b(rule.getSchema());
        String strB2 = cih.b(rule.getHost());
        String strB3 = cih.b(rule.getPort());
        String strB4 = cih.b(rule.getPath());
        if (!TextUtils.isEmpty(strB3)) {
            str = ":" + strB3;
        } else {
            str = "";
        }
        String str2 = strB + "://" + strB2 + str + strB4;
        return str2.endsWith("/") ? str2.substring(0, str2.length() - 1) : str2;
    }
}
