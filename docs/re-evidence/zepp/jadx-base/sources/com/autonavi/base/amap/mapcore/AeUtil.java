package com.autonavi.base.amap.mapcore;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.amap.api.mapcore.util.eh;
import com.amap.api.mapcore.util.ep;
import com.amap.api.mapcore.util.er;
import com.amap.api.mapcore.util.ew;
import com.amap.api.mapcore.util.ex;
import com.amap.api.mapcore.util.gi;
import com.amap.api.mapcore.util.gt;
import com.amap.api.mapcore.util.hn;
import com.amap.api.mapcore.util.hv;
import com.amap.api.mapcore.util.hx;
import com.amap.api.mapcore.util.jq;
import com.amap.api.mapcore.util.jr;
import com.amap.api.mapcore.util.jt;
import com.autonavi.amap.mapcore.MsgProcessor;
import com.autonavi.base.ae.gmap.GLMapEngine;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class AeUtil {
    private static final String AMAP_ASSETS_DB_CK_PATH = "ae/res.ck";
    private static final String AMAP_GLOBAL_DB_NAME = "global.db";
    private static final String AMAP_GLOBAL_SP_ITEM_MD5 = "amap_res_global_db_md5";
    private static final String AMAP_GLOBAL_SP_NAME = "amap_res_global_db";
    public static final String AMAP_RESZIP_TARGET_DIR_NAME = "res780";
    public static final String CONFIGNAME = "GNaviConfig.xml";
    public static final boolean IS_AE = true;
    public static final String RESZIPNAME = "res.zip";
    public static final String ROOTPATH = "/amap/";
    public static final String ROOT_DATA_PATH_NAME = "data_v6";
    public static final String ROOT_DATA_PATH_OLD_NAME = "data";
    public static boolean isNaviSoLoaded = false;

    private static boolean checkEngineRes(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null && fileArrListFiles.length > 0) {
            for (File file2 : fileArrListFiles) {
                if (file2 != null && file2.getName().contains(AMAP_GLOBAL_DB_NAME)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static String formatFileSeparator(String str) {
        return str != null ? str.replace("//", FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE) : str;
    }

    private static String getAssetsGlobalDbMd5(Context context) {
        return new String(FileUtil.readFileContentsFromAssets(context, AMAP_ASSETS_DB_CK_PATH));
    }

    public static void initCrashHandle(Context context) {
        gt gtVarF;
        try {
            hx.a();
            if (!hv.a(er.f()).a(context) || (gtVarF = er.f()) == null) {
                return;
            }
            MsgProcessor.nativeInitInfo(context, hv.a(gtVarF).b(context), gtVarF.a(), gtVarF.b(), gtVarF.c(), gtVarF.g());
        } catch (Throwable th) {
            er.a(th);
        }
    }

    public static GLMapEngine.InitParam initResource(final Context context) throws Throwable {
        final String mapBaseStorage = FileUtil.getMapBaseStorage(context);
        String str = mapBaseStorage + "/data_v6/";
        File file = new File(mapBaseStorage);
        if (!file.exists()) {
            file.mkdir();
        }
        File file2 = new File(str);
        if (!file2.exists()) {
            file2.mkdir();
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            try {
                jq.a().a(new jr() { // from class: com.autonavi.base.amap.mapcore.AeUtil.1
                    @Override // com.amap.api.mapcore.util.jr
                    public final void runTask() {
                        AeUtil.loadEngineRes(mapBaseStorage, context);
                    }
                });
            } catch (gi e) {
                e.printStackTrace();
            }
        } else {
            loadEngineRes(mapBaseStorage, context);
        }
        GLMapEngine.InitParam initParam = new GLMapEngine.InitParam();
        byte[] fileContentsFromAssets = FileUtil.readFileContentsFromAssets(context, "ae/GNaviConfig.xml");
        initParam.mRootPath = mapBaseStorage;
        if (fileContentsFromAssets != null) {
            try {
                String str2 = new String(fileContentsFromAssets, "utf-8");
                initParam.mConfigContent = str2;
                if (!str2.contains(ROOT_DATA_PATH_NAME)) {
                    throw new Exception("GNaviConfig.xml 和数据目录data_v6不匹配");
                }
            } catch (Throwable th) {
                th.printStackTrace();
                ep.c(context, "initConfig error:" + th.getMessage());
            }
        }
        String str3 = str + "/map/";
        initParam.mOfflineDataPath = str3;
        initParam.mP3dCrossPath = str;
        initParam.mOfflineDataPath = formatFileSeparator(str3);
        initParam.mRootPath = formatFileSeparator(initParam.mRootPath);
        initParam.mP3dCrossPath = formatFileSeparator(initParam.mP3dCrossPath);
        return initParam;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[PHI: r10
      0x0043: PHI (r10v5 java.lang.String) = (r10v4 java.lang.String), (r10v8 java.lang.String) binds: [B:11:0x002a, B:15:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    public static void loadEngineRes(String str, Context context) {
        String assetsGlobalDbMd5;
        boolean z;
        File file = new File(str, AMAP_RESZIP_TARGET_DIR_NAME);
        boolean z2 = true;
        InputStream inputStreamOpen = null;
        if (!(file.exists() && file.isDirectory()) && file.mkdirs()) {
            assetsGlobalDbMd5 = getAssetsGlobalDbMd5(context);
            z = true;
        } else {
            assetsGlobalDbMd5 = null;
            z = false;
        }
        if (z) {
            z2 = z;
        } else {
            assetsGlobalDbMd5 = getAssetsGlobalDbMd5(context);
            String strA = eh.a(context, AMAP_GLOBAL_SP_NAME, AMAP_GLOBAL_SP_ITEM_MD5, "");
            if (!TextUtils.isEmpty(strA) && strA.equals(assetsGlobalDbMd5)) {
                z2 = z;
            }
        }
        try {
            try {
                if (!(z2 ? false : checkEngineRes(file))) {
                    try {
                        inputStreamOpen = context.getAssets().open("ae/res.zip");
                        FileUtil.decompress(inputStreamOpen, file.getAbsolutePath());
                        if (inputStreamOpen != null) {
                            inputStreamOpen.close();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        er.a(e);
                        ep.c(context, "loadEngineRes error:" + e.getMessage());
                        if (inputStreamOpen != null) {
                            inputStreamOpen.close();
                        }
                        if (z2) {
                            eh.a(context, AMAP_GLOBAL_SP_NAME, AMAP_GLOBAL_SP_ITEM_MD5, (Object) assetsGlobalDbMd5);
                        }
                    } catch (OutOfMemoryError e2) {
                        e2.printStackTrace();
                        er.a(e2);
                        ep.c(context, "loadEngineRes error:" + e2.getMessage());
                        if (inputStreamOpen != null) {
                            inputStreamOpen.close();
                        }
                        if (z2) {
                            eh.a(context, AMAP_GLOBAL_SP_NAME, AMAP_GLOBAL_SP_ITEM_MD5, (Object) assetsGlobalDbMd5);
                        }
                    }
                }
            } catch (IOException e3) {
                e3.printStackTrace();
            }
            if (z2) {
                eh.a(context, AMAP_GLOBAL_SP_NAME, AMAP_GLOBAL_SP_ITEM_MD5, (Object) assetsGlobalDbMd5);
            }
        } catch (Throwable th) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static boolean loadLib(Context context) {
        try {
            if (!isNaviSoLoaded) {
                System.loadLibrary(jt.a);
                isNaviSoLoaded = true;
            }
            return true;
        } catch (Throwable th) {
            hn.c(th, "AeUtil", "loadLib");
            er.a(th);
            ex.b(ew.c, "load so failed " + th.getMessage());
            return false;
        }
    }

    public static void readAssetsFileAndSave(String str, String str2, Context context) {
        FileOutputStream fileOutputStream;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        InputStream inputStream = null;
        try {
            InputStream inputStreamOpen = context.getAssets().open(str);
            try {
                File file = new File(str2);
                if (file.exists()) {
                    file.delete();
                }
                file.createNewFile();
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStreamOpen.read(bArr, 0, 1024);
                        if (i > 0) {
                            fileOutputStream2.write(bArr, 0, i);
                        } else {
                            try {
                                break;
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    inputStreamOpen.close();
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                } catch (Throwable th) {
                    inputStream = inputStreamOpen;
                    fileOutputStream = fileOutputStream2;
                    th = th;
                    try {
                        th.printStackTrace();
                    } finally {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream = inputStreamOpen;
                fileOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }
}
