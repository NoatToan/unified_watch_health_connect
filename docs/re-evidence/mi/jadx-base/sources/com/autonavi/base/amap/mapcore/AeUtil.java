package com.autonavi.base.amap.mapcore;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.amap.api.maps.AMapException;
import com.amap.api.maps.MapsInitializer;
import com.autonavi.amap.mapcore.MsgProcessor;
import com.autonavi.base.ae.gmap.GLMapEngine;
import com.autonavi.config.a;
import com.xiaomi.smarthome.CpuConstant;
import defpackage.f7t;
import defpackage.gos;
import defpackage.jos;
import defpackage.m0t;
import defpackage.m2t;
import defpackage.mms;
import defpackage.nls;
import defpackage.o0t;
import defpackage.pms;
import defpackage.q2t;
import defpackage.ugt;
import defpackage.zns;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class AeUtil {
    private static final String AMAP_ASSETS_DB_CK_PATH = "ae/res.ck";
    private static final String AMAP_GLOBAL_DB_NAME = "global.db";
    private static final String AMAP_GLOBAL_SP_ITEM_MD5 = "amap_res_global_db_md5";
    private static final String AMAP_GLOBAL_SP_NAME = "amap_res_global_db";
    private static final String AMAP_INTERSECTION_ASSETS_DIR = "VM3DRes";
    public static final String AMAP_RESZIP_TARGET_DIR_NAME = "res920";
    public static final String CONFIGNAME = "GNaviConfig.xml";
    public static final boolean IS_AE = true;
    public static final String RESZIPNAME = "res.zip";
    public static final String ROOTPATH = "/amap/";
    public static final String ROOT_DATA_PATH_NAME = "data_v6";
    public static final String ROOT_DATA_PATH_OLD_NAME = "data";
    private static String global_db_path;

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

    private static boolean checkLib(String str, String str2) {
        String strA = m0t.a(str);
        if (TextUtils.equals(str2, CpuConstant.CPU_ARMEABI_V8A)) {
            return TextUtils.equals(strA, ugt.f35749a[0]);
        }
        if (TextUtils.equals(str2, CpuConstant.CPU_ARMEABIV7)) {
            return TextUtils.equals(strA, ugt.f35749a[1]);
        }
        if (TextUtils.equals(str2, "x86_64")) {
            return TextUtils.equals(strA, ugt.f35749a[2]);
        }
        return false;
    }

    private static String formatFileSeparator(String str) {
        return str != null ? str.replace("//", "/") : str;
    }

    private static String getAssetsGlobalDbMd5(Context context) {
        return new String(FileUtil.readFileContentsFromAssets(context, AMAP_ASSETS_DB_CK_PATH));
    }

    public static String getGlobalDbPath() {
        return global_db_path;
    }

    public static void initCrashHandle(Context context) {
        o0t o0tVarT;
        try {
            if (!q2t.a(zns.t()).c(context) || (o0tVarT = zns.t()) == null) {
                return;
            }
            MsgProcessor.nativeInitInfo(context, q2t.a(o0tVarT).d(context), o0tVarT.a(), o0tVarT.e(), o0tVarT.f(), o0tVarT.i());
        } catch (Throwable th) {
            zns.E(th);
        }
    }

    public static void initIntersectionRes(final Context context, final GLMapEngine.InitParam initParam) {
        String mapBaseStorage = FileUtil.getMapBaseStorage(context);
        String str = mapBaseStorage + "/VM3DRes/";
        File file = new File(mapBaseStorage);
        if (!file.exists()) {
            file.mkdir();
        }
        File file2 = new File(str);
        if (!file2.exists()) {
            file2.mkdir();
        }
        initParam.mIntersectionResPath = str;
        initParam.mIntersectionResPath = formatFileSeparator(str);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            loadAndSaveIntersectionRes("map_assets/VM3DRes", initParam.mIntersectionResPath, context);
            return;
        }
        try {
            pms.a().b(new f7t() { // from class: com.autonavi.base.amap.mapcore.AeUtil.2
                @Override // defpackage.f7t
                public final void runTask() {
                    AeUtil.loadAndSaveIntersectionRes("map_assets/VM3DRes", initParam.mIntersectionResPath, context);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
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
                pms.a().b(new f7t() { // from class: com.autonavi.base.amap.mapcore.AeUtil.1
                    @Override // defpackage.f7t
                    public final void runTask() {
                        AeUtil.loadEngineRes(mapBaseStorage, context);
                    }
                });
            } catch (Exception e) {
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
                mms.m(context, "initConfig error:" + th.getMessage());
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
    public static void loadAndSaveIntersectionRes(String str, String str2, Context context) {
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            String[] list = context.getAssets().list(str);
            if (list == null) {
                return;
            }
            for (String str3 : list) {
                readAssetsFileAndSave(str + "/" + str3, new File(str2, str3).getAbsolutePath(), context);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[PHI: r4
      0x0043: PHI (r4v2 java.lang.String) = (r4v1 java.lang.String), (r4v4 java.lang.String) binds: [B:11:0x002a, B:15:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x00de  */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
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
            z = false;
            assetsGlobalDbMd5 = null;
        }
        if (z) {
            z2 = z;
        } else {
            assetsGlobalDbMd5 = getAssetsGlobalDbMd5(context);
            String strB = nls.b(context, AMAP_GLOBAL_SP_NAME, AMAP_GLOBAL_SP_ITEM_MD5, "");
            if (!TextUtils.isEmpty(strB) && strB.equals(assetsGlobalDbMd5)) {
                z2 = z;
            }
        }
        if (!z2 && checkEngineRes(file)) {
            global_db_path = file + "/global.db";
        } else {
            try {
                try {
                    try {
                        inputStreamOpen = context.getAssets().open("ae/res.zip");
                        FileUtil.decompress(inputStreamOpen, file.getAbsolutePath());
                        global_db_path = file + "/global.db";
                        if (inputStreamOpen != null) {
                            inputStreamOpen.close();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } catch (Throwable th) {
                    if (inputStreamOpen != null) {
                        try {
                            inputStreamOpen.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Exception e3) {
                e3.printStackTrace();
                zns.E(e3);
                mms.m(context, "loadEngineRes error:" + e3.getMessage());
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                if (z2) {
                    nls.c(context, AMAP_GLOBAL_SP_NAME, AMAP_GLOBAL_SP_ITEM_MD5, assetsGlobalDbMd5);
                }
            } catch (OutOfMemoryError e4) {
                e4.printStackTrace();
                zns.E(e4);
                mms.m(context, "loadEngineRes error:" + e4.getMessage());
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                if (z2) {
                    nls.c(context, AMAP_GLOBAL_SP_NAME, AMAP_GLOBAL_SP_ITEM_MD5, assetsGlobalDbMd5);
                }
            }
        }
        if (z2) {
            nls.c(context, AMAP_GLOBAL_SP_NAME, AMAP_GLOBAL_SP_ITEM_MD5, assetsGlobalDbMd5);
        }
    }

    public static boolean loadLib(Context context) {
        try {
            if (!a.f6920b) {
                System.loadLibrary(a.f6919a);
                a.f6920b = true;
            }
            return true;
        } catch (Throwable th) {
            m2t.r(th, "AeUtil", "loadLib");
            zns.E(th);
            jos.l(gos.c, "load so failed " + th.getMessage());
            return false;
        }
    }

    public static boolean loadLibPath(Context context) {
        try {
            String libPath = MapsInitializer.getLibPath();
            String libAbi = MapsInitializer.getLibAbi();
            if (!TextUtils.isEmpty(libPath) && !TextUtils.isEmpty(libAbi)) {
                if (checkLib(libPath, libAbi)) {
                    System.load(libPath);
                    return true;
                }
                zns.E(new AMapException(AMapException.ERROR_LIB_NOT_MATCH));
                return false;
            }
            return false;
        } catch (Throwable th) {
            m2t.r(th, "AeUtil", "loadLibPath");
            zns.E(th);
            jos.l(gos.c, "load so failed " + th.getMessage());
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
