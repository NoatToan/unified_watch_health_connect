package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class aas implements svc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap<String, HashMap<String, g3s>> f843b;

    public aas(Context context) {
        this.f842a = context;
    }

    public static String d(g3s g3sVar) {
        return String.valueOf(g3sVar.f18566a) + PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX + g3sVar.f18567b;
    }

    private String g(g3s g3sVar) {
        String str;
        int i = g3sVar.f18566a;
        String str2 = g3sVar.f18567b;
        if (i <= 0 || TextUtils.isEmpty(str2)) {
            str = "";
        } else {
            str = String.valueOf(i) + PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX + str2;
        }
        File file = new File(this.f842a.getFilesDir(), "perf");
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str).getAbsolutePath();
    }

    @Override // defpackage.wes
    public void a() throws Throwable {
        ifs.c(this.f842a, "perf", "perfUploading");
        File[] fileArrF = ifs.f(this.f842a, "perfUploading");
        if (fileArrF == null || fileArrF.length <= 0) {
            return;
        }
        for (File file : fileArrF) {
            if (file != null) {
                List<String> listE = ons.e(this.f842a, file.getAbsolutePath());
                file.delete();
                e(listE);
            }
        }
    }

    @Override // defpackage.fjs
    public void b() {
        HashMap<String, HashMap<String, g3s>> map = this.f843b;
        if (map == null) {
            return;
        }
        if (map.size() > 0) {
            Iterator<String> it = this.f843b.keySet().iterator();
            while (it.hasNext()) {
                HashMap<String, g3s> map2 = this.f843b.get(it.next());
                if (map2 != null && map2.size() > 0) {
                    g3s[] g3sVarArr = new g3s[map2.size()];
                    map2.values().toArray(g3sVarArr);
                    f(g3sVarArr);
                }
            }
        }
        this.f843b.clear();
    }

    @Override // defpackage.fjs
    public void c(g3s g3sVar) {
        if ((g3sVar instanceof rqh) && this.f843b != null) {
            rqh rqhVar = (rqh) g3sVar;
            String strD = d(rqhVar);
            String strC = ons.c(rqhVar);
            HashMap<String, g3s> map = this.f843b.get(strD);
            if (map == null) {
                map = new HashMap<>();
            }
            rqh rqhVar2 = (rqh) map.get(strC);
            if (rqhVar2 != null) {
                rqhVar.i += rqhVar2.i;
                rqhVar.j += rqhVar2.j;
            }
            map.put(strC, rqhVar);
            this.f843b.put(strD, map);
        }
    }

    public void e(List<String> list) {
        throw null;
    }

    public void f(g3s[] g3sVarArr) {
        String strH = h(g3sVarArr[0]);
        if (TextUtils.isEmpty(strH)) {
            return;
        }
        ons.g(strH, g3sVarArr);
    }

    public final String h(g3s g3sVar) {
        String strG = g(g3sVar);
        if (TextUtils.isEmpty(strG)) {
            return null;
        }
        for (int i = 0; i < 20; i++) {
            String str = strG + i;
            if (ifs.d(this.f842a, str)) {
                return str;
            }
        }
        return null;
    }

    @Override // defpackage.svc
    public void b(HashMap<String, HashMap<String, g3s>> map) {
        this.f843b = map;
    }
}
