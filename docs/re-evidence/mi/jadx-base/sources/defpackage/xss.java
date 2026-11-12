package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Environment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes4.dex */
public class xss {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static AssetManager f39430a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Resources f39431b = null;
    public static boolean c = true;
    public static Context d = null;
    public static String e = "amap_resource";
    public static String f = "1_0_0";
    public static String h = ".jar";
    public static String i = e + f + h;
    public static String g = ".png";
    public static String j = e + f + g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static String f39432k = "";
    public static String l = f39432k + i;
    public static Resources.Theme m = null;
    public static Resources.Theme n = null;
    public static Field o = null;
    public static Field p = null;
    public static Activity q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f39433r = -1;

    public static class a implements FilenameFilter {
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(xss.f);
            sb.append(xss.h);
            return str.startsWith(xss.e) && !str.endsWith(sb.toString());
        }
    }

    public static AssetManager a(String str) {
        AssetManager assetManager = null;
        try {
            Class<?> cls = Class.forName("android.content.res.AssetManager");
            AssetManager assetManager2 = (AssetManager) cls.getConstructor(null).newInstance(null);
            try {
                cls.getDeclaredMethod("addAssetPath", String.class).invoke(assetManager2, str);
                return assetManager2;
            } catch (Throwable th) {
                th = th;
                assetManager = assetManager2;
                m2t.r(th, "ResourcesUtil", "getAssetManager(String apkPath)");
                return assetManager;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static Resources b() {
        Resources resources = f39431b;
        return resources == null ? d.getResources() : resources;
    }

    public static Resources c(Context context, AssetManager assetManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayMetrics.setToDefaults();
        return new Resources(assetManager, displayMetrics, context.getResources().getConfiguration());
    }

    public static View d(Context context, int i2) {
        XmlResourceParser xml = b().getXml(i2);
        View viewInflate = null;
        if (!c) {
            return LayoutInflater.from(context).inflate(xml, (ViewGroup) null);
        }
        try {
            int i3 = f39433r;
            if (i3 == -1) {
                i3 = 0;
            }
            viewInflate = LayoutInflater.from(new uss(context, i3, xss.class.getClassLoader())).inflate(xml, (ViewGroup) null);
        } catch (Throwable th) {
            try {
                th.printStackTrace();
                m2t.r(th, "ResourcesUtil", "selfInflate(Activity activity, int resource, ViewGroup root)");
            } finally {
                xml.close();
            }
        }
        return viewInflate;
    }

    public static OutputStream e(InputStream inputStream) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(new File(f39432k, i));
        byte[] bArr = new byte[1024];
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 <= 0) {
                return fileOutputStream;
            }
            fileOutputStream.write(bArr, 0, i2);
        }
    }

    public static boolean f(Context context) {
        try {
            d = context;
            File fileG = g(context);
            if (fileG != null) {
                f39432k = fileG.getAbsolutePath() + "/";
            }
            l = f39432k + i;
            if (!c) {
                return true;
            }
            if (!k(context)) {
                return false;
            }
            AssetManager assetManagerA = a(l);
            f39430a = assetManagerA;
            f39431b = c(context, assetManagerA);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return true;
    }

    public static File g(Context context) {
        try {
            if (context == null) {
                if (context != null) {
                    context.getFilesDir();
                }
                return null;
            }
            try {
                File externalFilesDir = (Environment.getExternalStorageState().equals("mounted") && Environment.getExternalStorageDirectory().canWrite()) ? context.getExternalFilesDir("LBS") : context.getFilesDir();
                if (externalFilesDir == null) {
                    context.getFilesDir();
                }
                return externalFilesDir;
            } catch (Exception e2) {
                e2.printStackTrace();
                if (0 == 0) {
                    return context.getFilesDir();
                }
                return null;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                context.getFilesDir();
            }
            throw th;
        }
    }

    public static boolean i(InputStream inputStream) throws IOException {
        File file = new File(l);
        long length = file.length();
        int iAvailable = inputStream.available();
        if (!file.exists() || length != iAvailable) {
            return false;
        }
        inputStream.close();
        return true;
    }

    public static boolean k(Context context) {
        m(context);
        InputStream inputStreamOpen = null;
        try {
            inputStreamOpen = context.getResources().getAssets().open(j);
            if (i(inputStreamOpen)) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                        m2t.r(e2, "ResourcesUtil", "copyResourceJarToAppFilesDir(Context ctx)");
                    }
                }
                return true;
            }
            n();
            OutputStream outputStreamE = e(inputStreamOpen);
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                    m2t.r(e3, "ResourcesUtil", "copyResourceJarToAppFilesDir(Context ctx)");
                }
            }
            outputStreamE.close();
            return true;
        } catch (Throwable th) {
            try {
                th.printStackTrace();
                m2t.r(th, "ResourcesUtil", "copyResourceJarToAppFilesDir(Context ctx)");
                if (inputStreamOpen == null) {
                    return false;
                }
                try {
                    return false;
                } catch (IOException e4) {
                    return false;
                }
            } finally {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                        m2t.r(e5, "ResourcesUtil", "copyResourceJarToAppFilesDir(Context ctx)");
                    }
                }
            }
        }
    }

    public static void m(Context context) {
        f39432k = context.getFilesDir().getAbsolutePath();
        l = f39432k + "/" + i;
    }

    public static void n() {
        File[] fileArrListFiles = new File(f39432k).listFiles(new a());
        if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
            return;
        }
        for (File file : fileArrListFiles) {
            file.delete();
        }
    }
}
