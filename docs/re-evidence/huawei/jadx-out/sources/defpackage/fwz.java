package defpackage;

import android.text.TextUtils;
import com.huawei.health.marketing.datatype.SingleGridContent;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.UnitUtil;
import java.util.MissingFormatArgumentException;

/* JADX INFO: loaded from: classes7.dex */
public class fwz {
    public static String e(int i) {
        if (i == 0) {
            return btx.c().getResources().getString(R.string.IDS_COURSE_DIFFICULTY_L2);
        }
        if (i == 1) {
            return btx.c().getResources().getString(R.string.IDS_COURSE_DIFFICULTY_L3);
        }
        if (i == 2) {
            return btx.c().getResources().getString(R.string.IDS_COURSE_DIFFICULTY_L4);
        }
        if (i == 6) {
            return btx.c().getResources().getString(R.string.IDS_COURSE_DIFFICULTY_L1);
        }
        return "--";
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0032  */
    public static String c(SingleGridContent singleGridContent, int i) {
        String str;
        String strE;
        String extend = singleGridContent.getExtend();
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(extend) || !extend.contains(",")) {
            str = null;
            strE = null;
        } else {
            String[] strArrSplit = extend.split(",");
            if (strArrSplit.length == 2) {
                str = strArrSplit[0];
                strE = e(CommonUtil.n(BaseApplication.getContext(), strArrSplit[1]));
            } else {
                str = null;
                strE = null;
            }
        }
        if (i == 19 && !TextUtils.isEmpty(strE)) {
            sb.append(strE);
        }
        try {
            if (singleGridContent.getCostTime() != 0) {
                if (i == 19) {
                    sb.append("    ");
                }
                sb.append(gzx.d(R.plurals.IDS_plugin_fitnessadvice_min, singleGridContent.getCostTime(), ped.m(singleGridContent.getCostTime())));
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "0")) {
                if (i == 19) {
                    sb.append("    ");
                } else if (!TextUtils.isEmpty(sb.toString())) {
                    sb.append("  ");
                }
                int iN = CommonUtil.n(BaseApplication.getContext(), str);
                sb.append(gzx.d(R.plurals.IDS_kcalories_unit, iN, UnitUtil.e(iN, 1, 0)));
            }
        } catch (MissingFormatArgumentException e) {
            LogUtil.e("CourseUtil", "MissingFormatArgumentException when format courseInfo. exception = ", e.getMessage());
        }
        return sb.toString();
    }
}
