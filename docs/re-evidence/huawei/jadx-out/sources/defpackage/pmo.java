package defpackage;

import androidx.collection.SimpleArrayMap;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.utils.StringUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public class pmo {
    private static volatile Map<Integer, gyc> d;
    private static final boolean e = qrs.af(BaseApplication.b());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static SimpleArrayMap<Integer, Integer> f45676b = new SimpleArrayMap<>(14);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static SimpleArrayMap<Integer, Integer> f45677c = new SimpleArrayMap<>(14);

    static {
        b();
        f45676b.put(258, 621051339);
        f45676b.put(264, 621051341);
        f45676b.put(257, 621051327);
        f45676b.put(281, 621051327);
        f45676b.put(259, 621051343);
        f45676b.put(10001, 621051325);
        f45676b.put(262, 621051393);
        f45676b.put(Integer.valueOf(OldToNewMotionPath.SPORT_TYPE_OPEN_AREA_SWIM), 621051393);
        f45676b.put(283, 621051317);
        f45676b.put(137, 621051337);
        f45676b.put(260, 621051396);
        f45676b.put(Integer.valueOf(OldToNewMotionPath.SPORT_TYPE_OTHER_SPORT), 621051324);
        f45676b.put(Integer.valueOf(OldToNewMotionPath.SPORT_TYPE_CROSS_TRAINER), 621051350);
        f45676b.put(Integer.valueOf(OldToNewMotionPath.SPORT_TYPE_INDOOR_BIKE), 621051379);
    }

    public static int e(int i) {
        return f45676b.getOrDefault(Integer.valueOf(i), 621051319).intValue();
    }

    public static void d(int i) {
        SimpleArrayMap<Integer, Integer> simpleArrayMap = f45677c;
        if (f45676b.get(Integer.valueOf(i)) == null) {
            i = 0;
        }
        simpleArrayMap.put(Integer.valueOf(i), 0);
    }

    public static void c(int i, int i2) {
        SimpleArrayMap<Integer, Integer> simpleArrayMap = f45677c;
        if (f45676b.get(Integer.valueOf(i)) == null) {
            i = 0;
        }
        simpleArrayMap.put(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static int c(int i) {
        return f45676b.get(Integer.valueOf(i)) == null ? f45677c.getOrDefault(0, 0).intValue() : f45677c.getOrDefault(Integer.valueOf(i), 0).intValue();
    }

    public static void e(int i, gyc gycVar) {
        if (d == null) {
            LogUtil.e("share_ShareThemeConfig", "putLastShareInfo map do not load.");
        } else {
            d.put(Integer.valueOf(i), gycVar);
        }
    }

    private static void b() throws Throwable {
        if (d == null) {
            String strA = pnn.a(pld.q);
            if (StringUtils.g(strA)) {
                LogUtil.e("share_ShareThemeConfig", "background config is empty.");
                d = new HashMap();
            } else {
                d = (Map) new GsonBuilder().create().fromJson(CommonUtil.ac(strA), new TypeToken<Map<Integer, gyc>>() { // from class: com.huawei.pluginsocialshare.shareconfig.ShareThemeConfig$1
                }.getType());
            }
        }
    }

    public static void d() {
        if (d != null) {
            LogUtil.a("share_ShareThemeConfig", "write background config json result:", Boolean.valueOf(pnn.d(pld.q, new GsonBuilder().create().toJson(d))));
        }
    }

    public static gyc a(int i) {
        if (d == null) {
            LogUtil.e("share_ShareThemeConfig", "getShareDataById map do not load.");
            return null;
        }
        return d.get(Integer.valueOf(i));
    }
}
