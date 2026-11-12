package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes41.dex */
public class owe {
    public static String b(int i) {
        switch (i) {
            case 2017:
                return "/web/annualHtml/annualReport.html";
            case 2018:
                return "/web/annualHtml/annualReport2018.html";
            case 2019:
                return "/web/annualHtml/annualReport2019.html";
            case 2020:
                if (CommonUtil.cl()) {
                    return "/sandbox/cch5/testappCCH5/annualReport2020/dist/index.html";
                }
                if (CommonUtil.ap()) {
                    return "/sandbox/cch5/health/annualReport2020/dist/index.html";
                }
                return "/cch5/health/annualReport2020/dist/index.html";
            default:
                LogUtil.j("AnnualYearConstant", "getAnnualUrl error year = ", Integer.valueOf(i));
                return "";
        }
    }
}
