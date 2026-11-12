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
public class pmc {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f45647c = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<Integer, pmv> f45648b;
    private pnk d;
    private List<String> e;

    private pmc() {
        this.e = new ArrayList();
        b();
        this.d = pnk.a();
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final pmc f45649a = new pmc();
    }

    public static final pmc a() {
        return c.f45649a;
    }

    private void b() {
        synchronized (f45647c) {
            if (this.f45648b == null) {
                String strA = pnn.a(pld.j);
                if (StringUtils.g(strA)) {
                    LogUtil.e("ShareConfigManager", "share config is empty.");
                    return;
                }
                try {
                    this.f45648b = (Map) new GsonBuilder().create().fromJson(CommonUtil.ac(strA), new TypeToken<Map<Integer, pmv>>() { // from class: com.huawei.pluginsocialshare.shareconfig.ShareConfigManager$1
                    }.getType());
                } catch (JsonSyntaxException e) {
                    this.f45648b = new HashMap();
                    FileUtils.deleteQuietly(FileUtils.getFile(pld.j));
                    LogUtil.e("ShareConfigManager", "parse json exception.", LogAnonymous.b(e));
                }
                Map<Integer, pmv> map = this.f45648b;
                if (map != null) {
                    LogUtil.a("ShareConfigManager", "Share data size:", Integer.valueOf(map.size()));
                } else {
                    LogUtil.j("ShareConfigManager", "Share data is null");
                }
            }
        }
    }

    public void e() {
        b(new GsonBuilder().create());
        this.d.c();
        d();
    }

    private void d() {
        if (this.e.size() > 0) {
            StringBuilder sb = new StringBuilder();
            for (String str : this.e) {
                boolean zB = pnn.b(str);
                sb.append("delete file: ");
                sb.append(str);
                sb.append(":");
                sb.append(zB);
                sb.append('\n');
            }
            LogUtil.a("ShareConfigManager", sb.toString());
        }
    }

    private void b(Gson gson) {
        synchronized (f45647c) {
            Map<Integer, pmv> map = this.f45648b;
            if (map != null) {
                LogUtil.a("ShareConfigManager", "write share config json result:", Boolean.valueOf(pnn.d(pld.j, gson.toJson(map))));
            }
        }
    }

    pmv c(int i) {
        pmv pmvVar;
        synchronized (f45647c) {
            Map<Integer, pmv> map = this.f45648b;
            pmvVar = map == null ? null : map.get(Integer.valueOf(i));
        }
        return pmvVar;
    }

    public void c(int i, ShareDataInfo shareDataInfo, int i2) {
        synchronized (f45647c) {
            if (this.f45648b == null) {
                this.f45648b = new HashMap();
            }
            pmv pmvVar = this.f45648b.get(Integer.valueOf(i));
            if (pmvVar == null) {
                pmvVar = new pmv(i);
            }
            pmvVar.d(System.currentTimeMillis());
            if (this.d.b(i2) != null) {
                this.d.b(i2).updateData(pmvVar, shareDataInfo);
            }
            this.f45648b.put(Integer.valueOf(i), pmvVar);
        }
    }

    void b(int i, ShareDataInfo shareDataInfo, int i2) {
        synchronized (f45647c) {
            Map<Integer, pmv> map = this.f45648b;
            if (map != null && map.get(Integer.valueOf(i)) != null) {
                pmv pmvVar = this.f45648b.get(Integer.valueOf(i));
                if (this.d.b(i2) != null) {
                    this.d.b(i2).deleteData(pmvVar, shareDataInfo);
                }
                this.f45648b.put(Integer.valueOf(i), pmvVar);
                if (!StringUtils.g(shareDataInfo.getSportTypes()) || (shareDataInfo instanceof plg)) {
                    return;
                }
                this.e.add(shareDataInfo.getPath());
                return;
            }
            LogUtil.e("ShareConfigManager", "empty data map or sportType not exist.");
        }
    }

    Map<Integer, ShareDataInfo> e(List<Integer> list, int i) {
        HashMap map = new HashMap();
        if (!njy.e(list)) {
            for (Integer num : list) {
                if (num != null) {
                    ShareDataInfo shareDataInfoA = a(i, num.intValue());
                    if (shareDataInfoA == null) {
                        LogUtil.e("ShareConfigManager", "id is not exist.");
                    } else {
                        map.put(num, shareDataInfoA);
                    }
                }
            }
        }
        return map;
    }

    ShareDataInfo a(int i, int i2) {
        return this.d.b(i).getShareDataById(i2);
    }

    public gyg d(int i) {
        pmv pmvVarC = c(i);
        if (pmvVarC == null) {
            return null;
        }
        return this.d.e(pmvVarC);
    }
}
