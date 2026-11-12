package com.amap.api.mapcore.util;

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
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
public class fz {
    private static AssetManager b = null;
    private static Resources c = null;
    private static Resources d = null;
    private static boolean e = true;
    private static Context f = null;
    private static String g = "amap_resource";
    private static String h = "1_0_0";
    private static String j = ".jar";
    private static String k = g + h + j;
    private static String i = ".png";
    private static String l = g + h + i;
    private static String m = "";
    private static String n = m + k;
    private static Resources.Theme o = null;
    private static Resources.Theme p = null;
    private static Field q = null;
    private static Field r = null;
    private static Activity s = null;
    public static int a = -1;

    public static class a implements FilenameFilter {
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(fz.h);
            sb.append(fz.j);
            return str.startsWith(fz.g) && !str.endsWith(sb.toString());
        }
    }

    public static boolean a(Context context) {
        try {
            f = context;
            File fileB = b(context);
            if (fileB != null) {
                m = fileB.getAbsolutePath() + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE;
            }
            n = m + k;
            if (!e) {
                return true;
            }
            if (!c(context)) {
                return false;
            }
            AssetManager assetManagerA = a(n);
            b = assetManagerA;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            displayMetrics.setToDefaults();
            c = new Resources(assetManagerA, displayMetrics, context.getResources().getConfiguration());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return true;
    }

    private static void e() {
        File[] fileArrListFiles = new File(m).listFiles(new a());
        if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
            return;
        }
        for (File file : fileArrListFiles) {
            file.delete();
        }
    }

    private static File b(Context context) {
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

    private static boolean c(Context context) {
        boolean z;
        m = context.getFilesDir().getAbsolutePath();
        n = m + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + k;
        InputStream inputStreamOpen = null;
        try {
            inputStreamOpen = context.getResources().getAssets().open(l);
            File file = new File(n);
            long length = file.length();
            int iAvailable = inputStreamOpen.available();
            if (file.exists() && length == iAvailable) {
                inputStreamOpen.close();
                z = true;
            } else {
                z = false;
            }
            if (z) {
                try {
                    inputStreamOpen.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                    hn.c(e2, "ResourcesUtil", "copyResourceJarToAppFilesDir(Context ctx)");
                }
                return true;
            }
            e();
            OutputStream outputStreamA = a(inputStreamOpen);
            try {
                inputStreamOpen.close();
                if (outputStreamA != null) {
                    outputStreamA.close();
                }
            } catch (IOException e3) {
                e3.printStackTrace();
                hn.c(e3, "ResourcesUtil", "copyResourceJarToAppFilesDir(Context ctx)");
            }
            return true;
        } catch (Throwable th) {
            try {
                th.printStackTrace();
                hn.c(th, "ResourcesUtil", "copyResourceJarToAppFilesDir(Context ctx)");
                return false;
            } finally {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                        hn.c(e4, "ResourcesUtil", "copyResourceJarToAppFilesDir(Context ctx)");
                    }
                }
            }
        }
    }

    public static Resources a() {
        Resources resources = c;
        return resources == null ? f.getResources() : resources;
    }

    private static AssetManager a(String str) {
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
                hn.c(th, "ResourcesUtil", "getAssetManager(String apkPath)");
                return assetManager;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static OutputStream a(InputStream inputStream) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(new File(m, k));
        byte[] bArr = new byte[1024];
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 <= 0) {
                return fileOutputStream;
            }
            fileOutputStream.write(bArr, 0, i2);
        }
    }

    public static View a(Context context, int i2) {
        XmlResourceParser xml = a().getXml(i2);
        View viewInflate = null;
        if (!e) {
            return LayoutInflater.from(context).inflate(xml, (ViewGroup) null);
        }
        try {
            int i3 = a;
            if (i3 == -1) {
                i3 = 0;
            }
            viewInflate = LayoutInflater.from(new fy(context, i3, fz.class.getClassLoader())).inflate(xml, (ViewGroup) null);
        } catch (Throwable th) {
            try {
                th.printStackTrace();
                hn.c(th, "ResourcesUtil", "selfInflate(Activity activity, int resource, ViewGroup root)");
            } finally {
                xml.close();
            }
        }
        return viewInflate;
    }
}
