package defpackage;

import android.content.Context;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class jhh {
    public static void a(Context context, int i, boolean z, int i2) {
        HashMap map = new HashMap(5);
        map.put("click", 1);
        map.put("sport_type", Integer.valueOf(i));
        map.put("trackType", z ? "3D" : "common");
        map.put("logTime", Integer.valueOf(i2));
        lmf.d().c(context, AnalyticsValue.HEALTH_RETRACK_ENTER_1040057.value(), map, 0);
    }

    public static void c(Context context, int i, boolean z) {
        HashMap map = new HashMap(3);
        map.put("click", 1);
        map.put("sport_type", Integer.valueOf(i));
        map.put("trackType", z ? "3D" : "common");
        lmf.d().c(context, AnalyticsValue.HEALTH_RETRACK_START_1040058.value(), map, 0);
    }

    public static void a(Context context, int i, boolean z, boolean z2, int i2) {
        String str;
        HashMap map = new HashMap(6);
        map.put("click", 1);
        if (!z2) {
            map.put("video_type", 0);
        } else {
            map.put("video_type", 1);
        }
        map.put("click", 1);
        map.put("sport_type", Integer.valueOf(i));
        if (z) {
            str = "3D";
        } else {
            str = "common";
        }
        map.put("trackType", str);
        map.put("video_quality", Integer.valueOf(i2));
        lmf.d().c(context, AnalyticsValue.HEALTH_RETRACK_SAVE_1040051.value(), map, 0);
    }

    public static void c(Context context, int i, boolean z, String str) {
        String str2;
        HashMap map = new HashMap(4);
        map.put("click", 1);
        map.put("sport_type", Integer.valueOf(i));
        if (z) {
            str2 = "3D";
        } else {
            str2 = "common";
        }
        map.put("trackType", str2);
        map.put(CommonUtil.PAGE_TYPE, str);
        lmf.d().c(context, AnalyticsValue.HEALTH_RETRACK_MUSIC_1040053.value(), map, 0);
    }

    public static void d(Context context, jhn jhnVar, String str) {
        HashMap map = new HashMap(8);
        map.put("click", 1);
        map.put("sport_type", Integer.valueOf(jhnVar.h()));
        map.put("trackType", jhnVar.i() ? "3D" : "common");
        map.put("defaultValue", str);
        map.put("map_type", null);
        map.put("mark_type", jhnVar.e());
        map.put("music_type", jhnVar.d());
        map.put("angleType", Integer.valueOf(jhnVar.b()));
        lmf.d().c(context, AnalyticsValue.HEALTH_RETRACK_MAPTYPE_1040052.value(), map, 0);
    }

    public static void e(Context context, int i, boolean z, int i2) {
        String str;
        HashMap map = new HashMap(4);
        map.put("click", 1);
        map.put("dynamic_track_share_type", Integer.valueOf(i2));
        map.put("sport_type", Integer.valueOf(i));
        if (z) {
            str = "3D";
        } else {
            str = "common";
        }
        map.put("trackType", str);
        lmf.d().c(context, AnalyticsValue.HEALTH_RETRACK_SHARE_TO_PLATFORM_1040054.value(), map, 0);
    }

    public static void b(Context context, int i, boolean z) {
        String str;
        HashMap map = new HashMap(3);
        map.put("click", 1);
        map.put("sport_type", Integer.valueOf(i));
        if (z) {
            str = "3D";
        } else {
            str = "common";
        }
        map.put("trackType", str);
        lmf.d().c(context, AnalyticsValue.HEALTH_RETRACK_PERSONALIZED_1040055.value(), map, 0);
    }

    public static void a(Context context, int i, boolean z, int i2, String str) {
        String str2;
        HashMap map = new HashMap(4);
        map.put("click", 1);
        map.put("sport_type", Integer.valueOf(i));
        if (z) {
            str2 = "3D";
        } else {
            str2 = "common";
        }
        map.put("trackType", str2);
        map.put("event", Integer.valueOf(i2));
        map.put("signageType", str);
        lmf.d().c(context, AnalyticsValue.HEALTH_RETRACK_MOMENTS_1040067.value(), map, 0);
    }

    public static void c(Context context, jhn jhnVar) {
        HashMap map = new HashMap(10);
        map.put("click", 1);
        map.put("sport_type", Integer.valueOf(jhnVar.h()));
        map.put("trackType", jhnVar.i() ? "3D" : "common");
        map.put("piclNum", Integer.valueOf(jhnVar.g()));
        map.put("videoNum", Integer.valueOf(jhnVar.f()));
        map.put("feelings", Boolean.valueOf(jhnVar.a()));
        map.put("map_type", jhnVar.c());
        map.put("mark_type", jhnVar.e());
        map.put("music_type", jhnVar.d());
        map.put("angleType", Integer.valueOf(jhnVar.b()));
        lmf.d().c(context, AnalyticsValue.HEALTH_RETRACK_PERSONALIZED_1040070.value(), map, 0);
    }
}
