package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.marketing.datatype.LogicControlInfo;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.SingleGridContent;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.OsType;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes28.dex */
public class ewa {
    private static ConcurrentHashMap<String, Boolean> d = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f33550a = BaseApplication.b();

    public List<SingleGridContent> a(List<SingleGridContent> list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (njy.e(list)) {
            LogUtil.j("MarketingLogicControlMgr", "filterContentByLogicRules gridContents is empty");
            return arrayList;
        }
        for (SingleGridContent singleGridContent : list) {
            if (d(singleGridContent)) {
                arrayList.add(singleGridContent);
            }
        }
        return arrayList;
    }

    public boolean d(SingleGridContent singleGridContent) {
        if (singleGridContent == null) {
            return false;
        }
        if (singleGridContent.isShowLogicSwitch()) {
            return a(singleGridContent.getLogicControlCharacter());
        }
        return true;
    }

    public boolean e(ResourceBriefInfo resourceBriefInfo) {
        if (resourceBriefInfo == null) {
            return false;
        }
        if (resourceBriefInfo.isShowLogicSwitch()) {
            return a(resourceBriefInfo.getLogicControlCharacter());
        }
        return true;
    }

    private boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        LogUtil.a("MarketingLogicControlMgr", "isValidLogicControlRules logicControlStr:", str);
        LogicControlInfo logicControlInfo = (LogicControlInfo) qqt.e(str, LogicControlInfo.class);
        if (logicControlInfo != null) {
            return c(logicControlInfo.getOsVersion(), false) && c(logicControlInfo.getChipVersion(), true) && d(logicControlInfo.getAbility());
        }
        LogUtil.j("MarketingLogicControlMgr", "isValidLogicControlRules logicControlInfo is null");
        return false;
    }

    public static void a(Map<String, Boolean> map) {
        if (map == null || map.size() <= 0) {
            return;
        }
        LogUtil.a("MarketingLogicControlMgr", "addAbility abilityMap:", map.keySet().toString());
        LogUtil.a("MarketingLogicControlMgr", "addAbility abilityMap:", map.values().toString());
        for (Map.Entry<String, Boolean> entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                d.put(entry.getKey(), entry.getValue());
            }
        }
    }

    private boolean d(List<String> list) {
        if (njy.e(list)) {
            return true;
        }
        for (String str : list) {
            if (!d.containsKey(str) || d.get(str) == null || !d.get(str).booleanValue()) {
                LogUtil.j("MarketingLogicControlMgr", "isAbilityEnabled ability:", str, " is not support");
                return false;
            }
        }
        return true;
    }

    private boolean c(LogicControlInfo.VersionControlInfo versionControlInfo, boolean z) {
        String strF;
        int iN;
        String strD;
        int iB;
        int iB2;
        if (versionControlInfo == null) {
            LogUtil.j("MarketingLogicControlMgr", "isVersionValid osOrChipVersion is null");
            return true;
        }
        if (z) {
            strF = CommonUtil.f();
            strD = d(strF);
            iN = CommonUtil.n(this.f33550a, strF.substring(strD.length()));
        } else {
            strF = "" + Build.VERSION.SDK_INT;
            iN = Build.VERSION.SDK_INT;
            strD = OsType.ANDROID;
        }
        if (versionControlInfo.getMin() == null || !versionControlInfo.getMin().containsKey(strD)) {
            iB = 0;
            iB2 = 0;
        } else {
            iB = CommonUtil.b(this.f33550a, versionControlInfo.getMin().get(strD), -1);
            iB2 = Integer.MAX_VALUE;
        }
        if (versionControlInfo.getMax() != null && versionControlInfo.getMax().containsKey(strD)) {
            iB2 = CommonUtil.b(this.f33550a, versionControlInfo.getMax().get(strD), -1);
        }
        List<String> arrayList = new ArrayList<>();
        List<String> arrayList2 = new ArrayList<>();
        if (versionControlInfo.getSupportList() != null && versionControlInfo.getSupportList().containsKey(OsType.ANDROID)) {
            arrayList = versionControlInfo.getSupportList().get(OsType.ANDROID);
        }
        if (versionControlInfo.getUnSupportList() != null && versionControlInfo.getUnSupportList().containsKey(OsType.ANDROID)) {
            arrayList2 = versionControlInfo.getUnSupportList().get(OsType.ANDROID);
        }
        LogUtil.a("MarketingLogicControlMgr", "isVersionValid curVersion:", Integer.valueOf(iN), " minVer:", Integer.valueOf(iB), " maxVer:", Integer.valueOf(iB2));
        if (!njy.e(arrayList2) && arrayList2.contains(strF)) {
            return false;
        }
        if (iN == 0 || iN < iB || iN > iB2) {
            return !njy.e(arrayList) && arrayList.contains(strF);
        }
        return true;
    }

    private String d(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c2 : charArray) {
            if (!Character.isAlphabetic(c2)) {
                break;
            }
            sb.append(c2);
        }
        return sb.toString();
    }
}
