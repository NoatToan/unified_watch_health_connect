package defpackage;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.health.socialshare.model.socialsharebean.ShareDataInfo;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.utils.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes15.dex */
public class pmn {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f45673b;
    private static volatile boolean d;
    private static volatile boolean e;
    private static volatile String j;
    private List<String> f;
    private Map<Integer, pmv> k;
    private pnh l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f45672a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile Map<Integer, ShareDataInfo> f45674c = new HashMap();
    private static volatile Map<Integer, ShareDataInfo> g = new HashMap();
    private static volatile Map<Integer, ShareDataInfo> i = new HashMap();
    private static volatile Map<Integer, pnb> h = new HashMap();

    private pmn() {
        this.f = new ArrayList();
        j();
        this.l = pnh.a();
    }

    public static void c(int i2, ShareDataInfo shareDataInfo) {
        if (f45674c == null) {
            LogUtil.e("SportShareConfigManager", "putLastShareInfo map do not load.");
        } else {
            f45674c.put(Integer.valueOf(i2), shareDataInfo);
        }
    }

    public static ShareDataInfo c(int i2) {
        if (f45674c == null) {
            LogUtil.e("SportShareConfigManager", "getLastShareInfo map do not load.");
            return null;
        }
        return f45674c.get(Integer.valueOf(i2));
    }

    public static void b(int i2, ShareDataInfo shareDataInfo) {
        if (g == null || shareDataInfo == null) {
            LogUtil.e("SportShareConfigManager", "putLastShareInfo map do not load.");
        } else {
            g.put(Integer.valueOf(i2), shareDataInfo);
        }
    }

    public static ShareDataInfo d(int i2) {
        if (g == null) {
            LogUtil.e("SportShareConfigManager", "getLastShareInfo map do not load.");
            return null;
        }
        return g.get(Integer.valueOf(i2));
    }

    public static void a(int i2, ShareDataInfo shareDataInfo) {
        if (i == null) {
            LogUtil.e("SportShareConfigManager", "putLastStickerShareInfo map do not load.");
        } else {
            i.put(Integer.valueOf(i2), shareDataInfo);
        }
    }

    public static void b(int i2, pnb pnbVar) {
        if (h == null) {
            LogUtil.e("SportShareConfigManager", "putLastMaskShareInfo map do not load.");
        } else {
            h.put(Integer.valueOf(i2), pnbVar);
        }
    }

    public static ShareDataInfo a(int i2) {
        if (i == null) {
            LogUtil.e("SportShareConfigManager", "getLastShareInfo map do not load.");
            return null;
        }
        return i.get(Integer.valueOf(i2));
    }

    public static pnb e(int i2) {
        if (h == null) {
            LogUtil.e("SportShareConfigManager", "getLastMaskShareInfo map do not load.");
            return null;
        }
        return h.get(Integer.valueOf(i2));
    }

    public static void b() {
        if (i != null) {
            i.clear();
        }
    }

    public static void a() {
        if (h != null) {
            h.clear();
        }
    }

    public static boolean g() {
        return f45673b;
    }

    public static void c(boolean z) {
        f45673b = z;
    }

    public static boolean c() {
        return e;
    }

    public static void b(boolean z) {
        e = z;
    }

    public static void d(boolean z) {
        d = z;
    }

    public static String d() {
        return j;
    }

    public static void a(String str) {
        j = str;
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final pmn f45675a = new pmn();
    }

    public static final pmn e() {
        return b.f45675a;
    }

    private void j() {
        synchronized (f45672a) {
            if (this.k == null) {
                String strA = pnn.a(pld.o);
                if (StringUtils.g(strA)) {
                    LogUtil.e("SportShareConfigManager", "share config is empty.");
                    return;
                }
                try {
                    this.k = (Map) new GsonBuilder().create().fromJson(CommonUtil.ac(strA), new TypeToken<Map<Integer, pmv>>() { // from class: com.huawei.pluginsocialshare.shareconfig.SportShareConfigManager$1
                    }.getType());
                } catch (JsonSyntaxException e2) {
                    this.k = new HashMap();
                    FileUtils.deleteQuietly(FileUtils.getFile(pld.o));
                    LogUtil.e("SportShareConfigManager", "parse json exception.", LogAnonymous.b(e2));
                }
                Map<Integer, pmv> map = this.k;
                if (map != null) {
                    LogUtil.a("SportShareConfigManager", "Share data size:", Integer.valueOf(map.size()));
                } else {
                    LogUtil.j("SportShareConfigManager", "Share data is null");
                }
            }
        }
    }

    public void h() {
        b(new GsonBuilder().create());
        this.l.c();
        f();
    }

    private void f() {
        if (this.f.size() > 0) {
            StringBuilder sb = new StringBuilder();
            for (String str : this.f) {
                boolean zB = pnn.b(str);
                sb.append("delete file: ");
                sb.append(str);
                sb.append(":");
                sb.append(zB);
                sb.append('\n');
            }
            LogUtil.a("SportShareConfigManager", sb.toString());
        }
    }

    private void b(Gson gson) {
        synchronized (f45672a) {
            Map<Integer, pmv> map = this.k;
            if (map != null) {
                LogUtil.a("SportShareConfigManager", "write share config json result:", Boolean.valueOf(pnn.d(pld.o, gson.toJson(map))));
            }
        }
    }

    pmv f(int i2) {
        pmv pmvVar;
        synchronized (f45672a) {
            Map<Integer, pmv> map = this.k;
            pmvVar = map == null ? null : map.get(Integer.valueOf(i2));
        }
        return pmvVar;
    }

    public void e(int i2, ShareDataInfo shareDataInfo, int i3) {
        synchronized (f45672a) {
            if (this.k == null) {
                this.k = new HashMap();
            }
            pmv pmvVar = this.k.get(Integer.valueOf(i2));
            if (pmvVar == null) {
                pmvVar = new pmv(i2);
            }
            pmvVar.d(System.currentTimeMillis());
            if (this.l.c(i3) != null) {
                this.l.c(i3).updateData(pmvVar, shareDataInfo);
            }
            this.k.put(Integer.valueOf(i2), pmvVar);
        }
    }

    void c(int i2, ShareDataInfo shareDataInfo, int i3) {
        synchronized (f45672a) {
            Map<Integer, pmv> map = this.k;
            if (map != null && map.get(Integer.valueOf(i2)) != null) {
                pmv pmvVar = this.k.get(Integer.valueOf(i2));
                if (this.l.c(i3) != null) {
                    this.l.c(i3).deleteData(pmvVar, shareDataInfo);
                }
                this.k.put(Integer.valueOf(i2), pmvVar);
                if (!StringUtils.g(shareDataInfo.getSportTypes()) || (shareDataInfo instanceof plg)) {
                    return;
                }
                this.f.add(shareDataInfo.getPath());
                return;
            }
            LogUtil.e("SportShareConfigManager", "empty data map or sportType not exist.");
        }
    }

    Map<Integer, ShareDataInfo> c(List<Integer> list, int i2) {
        HashMap map = new HashMap();
        if (!njy.e(list)) {
            for (Integer num : list) {
                if (num != null) {
                    ShareDataInfo shareDataInfoE = e(i2, num.intValue());
                    if (shareDataInfoE == null) {
                        LogUtil.e("SportShareConfigManager", "id is not exist.");
                    } else {
                        map.put(num, shareDataInfoE);
                    }
                }
            }
        }
        return map;
    }

    ShareDataInfo e(int i2, int i3) {
        return this.l.c(i2).getShareDataById(i3);
    }

    public gyf b(int i2) {
        pmv pmvVarF = f(i2);
        if (pmvVarF == null) {
            return null;
        }
        return this.l.a(pmvVarF);
    }
}
