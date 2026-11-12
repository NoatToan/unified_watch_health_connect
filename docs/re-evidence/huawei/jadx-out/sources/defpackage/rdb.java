package defpackage;

import android.content.Context;
import android.text.format.DateFormat;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.device.R;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes16.dex */
public class rdb {
    public static String d(int i, Context context) {
        return e(c(a("", context, i), context, i), context, i);
    }

    private static String a(String str, Context context, int i) {
        if ((i & 64) == 64) {
            str = context.getResources().getString(R.string.IDS_sunday);
        }
        if ((i & 1) == 1) {
            if (!"".equals(str)) {
                str = str + " ";
            }
            str = str + context.getResources().getString(R.string.IDS_monday);
        }
        if ((i & 2) != 2) {
            return str;
        }
        if (!"".equals(str)) {
            str = str + " ";
        }
        return str + context.getResources().getString(R.string.IDS_tuesday);
    }

    private static String c(String str, Context context, int i) {
        if ((i & 4) == 4) {
            if (!"".equals(str)) {
                str = str + " ";
            }
            str = str + context.getResources().getString(R.string.IDS_wednesday);
        }
        if ((i & 8) == 8) {
            if (!"".equals(str)) {
                str = str + " ";
            }
            str = str + context.getResources().getString(R.string.IDS_thursday);
        }
        if ((i & 16) == 16) {
            if (!"".equals(str)) {
                str = str + " ";
            }
            str = str + context.getResources().getString(R.string.IDS_friday);
        }
        if ((i & 32) != 32) {
            return str;
        }
        if (!"".equals(str)) {
            str = str + " ";
        }
        return str + context.getResources().getString(R.string.IDS_saturday);
    }

    private static String e(String str, Context context, int i) {
        if (i == 127) {
            if (!"".equals(str)) {
                str = "";
            }
            str = str + context.getResources().getString(R.string.IDS_every_day);
        }
        if (i == 31) {
            if (!"".equals(str)) {
                str = "";
            }
            str = str + context.getResources().getString(R.string.IDS_every_day_work);
        }
        if (i != 0) {
            return str;
        }
        return ("".equals(str) ? str : "") + context.getResources().getString(R.string.IDS_only_once);
    }

    public static String d(Context context, int i) {
        String str = (i / 100) + ":" + (i % 100);
        try {
            str = DateFormat.getTimeFormat(context.getApplicationContext()).format(Long.valueOf(new SimpleDateFormat("HH:mm").parse(str).getTime()));
            LogUtil.a("AlarmUtil", "getOffsetTimeStr dateFormat offsetStr ", str);
            return str;
        } catch (ParseException e) {
            LogUtil.a("AlarmUtil", "parseException.getMessage() ", e.getMessage());
            return str;
        }
    }
}
