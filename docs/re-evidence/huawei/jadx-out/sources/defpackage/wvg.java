package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.health.operationbundle.R;
import com.huawei.hiar.ARImageMetadata;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes19.dex */
public class wvg {
    public static String a(long j, Context context) {
        String strA;
        LogUtil.a("SocialUtils", "getRelativeTime");
        if (j <= 0) {
            LogUtil.j("SocialUtils", "simpleDateFormat.parse is wrong");
            return "";
        }
        Date date = new Date();
        Calendar.getInstance().setTime(date);
        Date date2 = new Date(j);
        long time = date.getTime() - date2.getTime();
        if (c(date2)) {
            if (time <= 60000 && 0 <= time) {
                strA = context.getResources().getString(R.string.IDS_social_information_just_now);
            } else if (time <= 3600000 && time > 60000) {
                strA = context.getResources().getQuantityString(R.plurals.IDS_social_information_minute_ago, (((int) time) / 1000) / 60, Long.valueOf((time / 1000) / 60));
            } else {
                strA = new SimpleDateFormat("HH:mm").format(date2);
            }
        } else if (a(date2)) {
            strA = context.getResources().getString(R.string.IDS_calendar_current_date_yesterday);
        } else {
            strA = UnitUtil.a(date2, ARImageMetadata.CONTROL_SCENE_MODE);
        }
        LogUtil.a("SocialUtils", "relativeTime = ", strA);
        return strA;
    }

    public static boolean c(Date date) {
        if (date == null) {
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date);
        return calendar2.get(1) == calendar.get(1) && calendar2.get(6) - calendar.get(6) == 0;
    }

    public static boolean a(Date date) {
        if (date == null) {
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date);
        return calendar2.get(1) == calendar.get(1) && calendar2.get(6) - calendar.get(6) == -1;
    }

    public static boolean a(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        if (zIsEmpty) {
            return zIsEmpty;
        }
        return str.trim().length() <= 0;
    }

    public static int e(int[] iArr, int i) {
        if (iArr == null || iArr.length <= 0) {
            return -1;
        }
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    public static boolean b() {
        return VersionControlUtil.isSupportOperationAccount() && !Utils.o();
    }

    public static String d(String str) {
        return str == null ? "" : str.trim();
    }

    public static boolean e(String str) {
        if (a(str)) {
            return false;
        }
        return str.equals(String.valueOf(0)) || str.equals(String.valueOf(1));
    }

    public static String b(osg osgVar) {
        boolean z = osgVar != null;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(z);
        if (z) {
            stringBuffer.append(osgVar.ac()).append(osgVar.h()).append(osgVar.c());
        }
        return stringBuffer.toString();
    }

    public static boolean a(long j, long j2) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (j != 0 && j2 != 0) {
            return j <= timeInMillis && timeInMillis <= j2;
        }
        if (j == 0 || j2 != 0) {
            return j != 0 || j2 == 0 || timeInMillis <= j2;
        }
        return j <= timeInMillis;
    }

    public static float d(float f, float f2) {
        return new BigDecimal(f).subtract(new BigDecimal(f2)).floatValue();
    }

    public static float e(float f, float f2, int i) {
        return new BigDecimal(f).divide(new BigDecimal(f2), i, 4).floatValue();
    }
}
