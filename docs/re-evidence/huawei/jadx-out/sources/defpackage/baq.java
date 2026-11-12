package defpackage;

import android.content.Context;
import android.content.res.Resources;
import androidx.media3.datasource.cache.CacheDataSink;
import com.huawei.haf.common.os.FileUtils;
import health.compact.a.LogUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Collections;
import org.json.JSONException;

/* JADX INFO: loaded from: classes22.dex */
public final class baq {
    private static final baq d = new baq();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private bak f902a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bap f903c = new bap();
    private boolean e;

    private baq() {
    }

    public static baq a() {
        return d;
    }

    public String b(Context context) {
        bak bakVarE = e(context);
        if (bakVarE != null) {
            return bakVarE.d();
        }
        return null;
    }

    public String a(Context context) {
        bak bakVarE = e(context);
        if (bakVarE != null) {
            return bakVarE.e();
        }
        return null;
    }

    public baj e(Context context, String str) {
        bak bakVarE = e(context);
        if (bakVarE != null) {
            return bakVarE.b(str);
        }
        return null;
    }

    public Collection<baj> c(Context context) {
        bak bakVarE = e(context);
        if (bakVarE != null) {
            return bakVarE.a();
        }
        return Collections.EMPTY_LIST;
    }

    public bak d(String str) {
        File file = new File(str);
        if (file.exists()) {
            return e(file);
        }
        return null;
    }

    public String b() {
        return this.f903c.e();
    }

    public boolean b(String str, File file) {
        return this.f903c.e(str, file);
    }

    private bak c(Context context, String str) {
        bak bakVarD = null;
        try {
            String str2 = "bundle_plugins/bundle_" + str + ".json";
            LogUtil.b("Bundle_InfoManager", "Default module file name: ", str2);
            long jCurrentTimeMillis = System.currentTimeMillis();
            bakVarD = d(context, str2);
            LogUtil.b("Bundle_InfoManager", "Parse default module info, cost time:", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), "ms");
            return bakVarD;
        } catch (IOException | JSONException e) {
            LogUtil.d("Bundle_InfoManager", "Failed to create default module info! ex=", LogUtil.c(e));
            return bakVarD;
        }
    }

    private bak e(File file) {
        bak bakVarC = null;
        try {
            LogUtil.b("Bundle_InfoManager", "Updated module file : ", file.getName());
            long jCurrentTimeMillis = System.currentTimeMillis();
            bakVarC = c(file);
            LogUtil.b("Bundle_InfoManager", "Parse updated module info, cost time:", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), "ms");
            return bakVarC;
        } catch (IOException | JSONException e) {
            LogUtil.d("Bundle_InfoManager", "Failed to create updated module info! ex=", LogUtil.c(e));
            return bakVarC;
        }
    }

    private bak e(Context context) {
        bak bakVarC;
        bak bakVar = this.f902a;
        if (bakVar != null) {
            return bakVar;
        }
        String strE = this.f903c.e();
        String strA = this.f903c.a();
        LogUtil.b("Bundle_InfoManager", "currentVersion:", strE, ", defaultVersion:", strA, ", allowUpdate:", Boolean.valueOf(this.e));
        if (!this.e || strA.equals(strE)) {
            bakVarC = c(context, strA);
        } else {
            bakVarC = e(new File(this.f903c.b(), "bundle_" + strE + ".json"));
        }
        this.f902a = bakVarC;
        return bakVarC;
    }

    private static bak d(Context context, String str) throws JSONException, IOException {
        return bak.d(d(a(context, str)));
    }

    private bak c(File file) throws JSONException, IOException {
        if (file == null || !file.exists()) {
            return null;
        }
        return bak.d(d(new FileInputStream(file)));
    }

    private static InputStream a(Context context, String str) {
        Resources resources = context.getResources();
        if (resources == null) {
            return null;
        }
        try {
            return resources.getAssets().open(str);
        } catch (IOException e) {
            LogUtil.d("Bundle_InfoManager", "createInputStreamFromAssets ex=", LogUtil.c(e));
            return null;
        }
    }

    private static String d(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return "";
        }
        try {
            return FileUtils.e(inputStream, CacheDataSink.DEFAULT_FRAGMENT_SIZE);
        } finally {
            FileUtils.a(inputStream);
        }
    }
}
