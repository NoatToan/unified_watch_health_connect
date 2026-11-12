package health.compact.a;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import com.huawei.haf.application.BaseApplication;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class LogPathConfig {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f36606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f36607c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f36608a;
    private String d;
    private String e;

    static {
        String absolutePath = d(null).getAbsolutePath();
        f36606b = absolutePath;
        f36607c = absolutePath + "/huaweisystem/";
    }

    public LogPathConfig() {
        this(f36607c);
    }

    private LogPathConfig(String str) {
        this.f36608a = str;
        this.e = this.f36608a + BaseApplication.d() + "/";
        this.d = this.f36608a + BaseApplication.d() + ".otalog/";
    }

    private static File d(Context context) {
        if (context == null) {
            context = BaseApplication.b();
        }
        File externalFilesDir = ("mounted".equals(Environment.getExternalStorageState()) || !Environment.isExternalStorageRemovable()) ? context.getExternalFilesDir(null) : null;
        if (externalFilesDir != null) {
            return externalFilesDir;
        }
        Log.w("LogPathConfig", "getExternalFilesDirectory:innerContext.getFilesDir");
        return context.getFilesDir();
    }

    public String d() {
        String strG = BuildTypeConfig.e() ? CommonUtils.g(null) : f36607c;
        Log.d("LogPathConfig", "obtainSavePath(): path = " + strG);
        return strG;
    }

    public String a() {
        String strG;
        if (BuildTypeConfig.e()) {
            strG = CommonUtils.g(BaseApplication.d());
        } else {
            strG = this.e;
        }
        Log.d("LogPathConfig", "obtainSavePathDetail(): path = " + strG);
        return strG;
    }

    public String c() {
        if (BuildTypeConfig.e()) {
            return CommonUtils.g(BaseApplication.d() + ".otalog/");
        }
        return this.d;
    }

    public File e() {
        File file = new File(a());
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        Log.w("LogPathConfig", "obtainSaveFileDetail,create log directory failed");
        return null;
    }
}
