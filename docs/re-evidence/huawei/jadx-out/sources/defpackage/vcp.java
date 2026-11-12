package defpackage;

import android.content.res.Resources;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import health.compact.a.Utils;

/* JADX INFO: loaded from: classes19.dex */
public class vcp {
    public static String a(dnb dnbVar) {
        if (dnbVar == null) {
            LogUtil.j("HealthWeight_BodyCompositionSuggestUtils", "initBodyComposition WeightBean is null");
            return "";
        }
        LogUtil.a("HealthWeight_BodyCompositionSuggestUtils", "initBodyComposition Pole is ", Integer.valueOf(dnbVar.ac()));
        if (dnbVar.ac() == 2) {
            LogUtil.a("HealthWeight_BodyCompositionSuggestUtils", "initBodyComposition Age is ", Integer.valueOf(dnbVar.c()));
            if (exz.c(dnbVar.c())) {
                return c(dnbVar, BaseApplication.getContext().getResources().getStringArray(R.array.weight_suggest_pole_ehight_child));
            }
            return e(dnbVar, BaseApplication.getContext().getResources().getStringArray(R.array.weight_suggest_pole_ehight));
        }
        return a(dnbVar, BaseApplication.getContext().getResources().getStringArray(R.array.weight_suggest_pole_four));
    }

    private static String a(dnb dnbVar, String[] strArr) {
        int doubleOrIntLevelByType = (int) dnbVar.getDoubleOrIntLevelByType(1);
        int doubleOrIntLevelByType2 = (int) dnbVar.getDoubleOrIntLevelByType(10);
        int doubleOrIntLevelByType3 = (int) dnbVar.getDoubleOrIntLevelByType(5);
        int iB = exz.b(dnbVar.f(), Utils.o(), dnbVar.an(), dnbVar.c());
        String str = "IDS_weight_assess_" + iB + doubleOrIntLevelByType + doubleOrIntLevelByType3 + doubleOrIntLevelByType2;
        LogUtil.a("HealthWeight_BodyCompositionSuggestUtils", "initComprehensiveAdviceId xmlId is ", Integer.valueOf(iB), Integer.valueOf(doubleOrIntLevelByType), Integer.valueOf(doubleOrIntLevelByType3), Integer.valueOf(doubleOrIntLevelByType2));
        return a(str, strArr);
    }

    private static String e(dnb dnbVar, String[] strArr) {
        int doubleOrIntLevelByType = (int) dnbVar.getDoubleOrIntLevelByType(1);
        int doubleOrIntLevelByType2 = (int) dnbVar.getDoubleOrIntLevelByType(10);
        int doubleOrIntLevelByType3 = (int) dnbVar.getDoubleOrIntLevelByType(5);
        byte bAn = dnbVar.an();
        int iC = dnbVar.c();
        int iC2 = exz.c(bAn, dnbVar.af(), iC);
        int iB = exz.b(dnbVar.f(), Utils.o(), bAn, iC);
        int iB2 = exz.b(bAn, dnbVar.j());
        int iAb = (int) dnbVar.ab();
        int i = iAb == 0 ? iAb : 1;
        String str = "IDS_weight_assess_" + doubleOrIntLevelByType + doubleOrIntLevelByType2 + doubleOrIntLevelByType3 + iC2 + iB + iB2 + i;
        LogUtil.a("HealthWeight_BodyCompositionSuggestUtils", "initEightPoleComprehensiveAdviceId xmlId is ", Integer.valueOf(doubleOrIntLevelByType), Integer.valueOf(doubleOrIntLevelByType2), Integer.valueOf(doubleOrIntLevelByType3), Integer.valueOf(iC2), Integer.valueOf(iB), Integer.valueOf(iB2), Integer.valueOf(i));
        return a(str, strArr);
    }

    private static String c(dnb dnbVar, String[] strArr) {
        byte bAn = dnbVar.an();
        int doubleOrIntLevelByType = (int) dnbVar.getDoubleOrIntLevelByType(1);
        int doubleOrIntLevelByType2 = (int) dnbVar.getDoubleOrIntLevelByType(10);
        int doubleOrIntLevelByType3 = (int) dnbVar.getDoubleOrIntLevelByType(5);
        int iC = exz.c(bAn, dnbVar.af(), dnbVar.c());
        int iB = exz.b(dnbVar.f(), Utils.o(), dnbVar.an(), dnbVar.c());
        int iAb = (int) dnbVar.ab();
        return a("IDS_weight_assess_" + doubleOrIntLevelByType + doubleOrIntLevelByType2 + doubleOrIntLevelByType3 + iC + iB + (iAb == 0 ? iAb : 1), strArr);
    }

    private static String a(String str, String[] strArr) {
        try {
            String strD = d(str, strArr);
            LogUtil.a("HealthWeight_BodyCompositionSuggestUtils", "arrayId is ", strD);
            return BaseApplication.getContext().getResources().getString(elo.d(strD));
        } catch (Resources.NotFoundException unused) {
            LogUtil.e("HealthWeight_BodyCompositionSuggestUtils", "resource NotFoundException");
            return "";
        }
    }

    private static String d(String str, String[] strArr) {
        String str2;
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                str2 = "";
                break;
            }
            str2 = strArr[i];
            if (str2.startsWith(str)) {
                break;
            }
            i++;
        }
        String[] strArrSplit = str2.split("\\|");
        if (njy.e(strArrSplit, 1)) {
            LogUtil.j("HealthWeight_BodyCompositionSuggestUtils", "queryXmlId temps is Array Index Out Of Bound");
            return "";
        }
        return strArrSplit[1];
    }
}
