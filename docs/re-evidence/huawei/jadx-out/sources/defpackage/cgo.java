package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.huawei.health.socialshare.api.SocialShareCenterApi;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes23.dex */
public class cgo {
    public static void b(Context context, Bitmap bitmap, int i) {
        gxt gxtVar = new gxt(1);
        gxtVar.d(bitmap);
        gxtVar.d("12");
        HashMap map = new HashMap(1);
        map.put(ParsedFieldTag.TASK_TYPE, Integer.valueOf(i));
        gxtVar.c(map);
        gxtVar.f(false);
        gxtVar.e(false);
        ((SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class)).exeShare(gxtVar, context);
    }

    public static String d(String str, int i) {
        int i2;
        if (i == 0) {
            i2 = 52;
        } else if (i == 1) {
            i2 = 24;
        } else if (i != 2) {
            i2 = i != 3 ? 20 : 131080;
        } else {
            i2 = 131076;
        }
        return UnitUtil.a(c(str), i2);
    }

    public static Date c(String str) {
        try {
            return DateFormatUtil.d(str, DateFormatUtil.DateFormatType.DATE_FORMAT_8);
        } catch (ParseException e) {
            LogUtil.e("HL_WeeklyShareUtils", "getParseDate, parseException:", e.getMessage());
            return new Date();
        }
    }
}
