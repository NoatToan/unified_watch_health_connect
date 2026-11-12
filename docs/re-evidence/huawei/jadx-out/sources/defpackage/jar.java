package defpackage;

import android.content.Context;
import android.os.Environment;
import android.os.Process;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.healthcloud.plugintrack.manager.TrackAltitudeMgr;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwlogsmodel.common.LogConfig;
import com.huawei.openalliance.ad.constant.AiCoreSdkConstant;
import health.compact.a.CommonUtil;
import health.compact.a.CompileParameterUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public class jar {
    private static int d = -1;

    public static double[] c(double d2, double d3, double d4, double d5) {
        return new double[]{(((d5 - d3) * 3.141592653589793d) / 180.0d) * 6378245.0d * Math.cos((d2 * 3.141592653589793d) / 180.0d), (((d4 - d2) * 3.141592653589793d) / 180.0d) * 6378245.0d};
    }

    public static void e(String str, int i, int i2, double d2, double d3, double d4, int i3, int[] iArr) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("Track_GPSFileUtils", "saveFileDataHead fileName is empty! ");
            return;
        }
        d = i;
        String str2 = b() + "/tracktest";
        File file = new File(str2);
        if (!file.exists()) {
            LogUtil.a("Track_GPSFileUtils", "saveFileDataHead mkdir result ", Boolean.valueOf(file.mkdirs()));
        }
        String str3 = str2 + "/" + str;
        File file2 = new File(str3);
        try {
            if (!file2.exists()) {
                LogUtil.a("Track_GPSFileUtils", "saveFileDataHead createNewFile result ", Boolean.valueOf(file2.createNewFile()));
            }
            xji.a(file2.getCanonicalPath(), "S2", 0);
        } catch (IOException e) {
            LogUtil.e("Track_GPSFileUtils", "saveFileDataHead IOException ", LogAnonymous.b(e));
        }
        LogUtil.a("Track_GPSFileUtils", "saveFileDataHead createFile result ", Boolean.valueOf(b(str3, i, i2, d2, d3, d4, i3, iArr)));
    }

    public static void a(String str, short s, short s2, float f, float f2, int i, int i2, int i3, short s3, short s4) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("Track_GPSFileUtils", "saveFileData fileName is empty! ");
            return;
        }
        String str2 = b() + "/tracktest";
        File file = new File(str2);
        if (!file.exists()) {
            LogUtil.a("Track_GPSFileUtils", "saveFileData mkdir result ", Boolean.valueOf(file.mkdirs()));
        }
        String str3 = str2 + "/" + str;
        File file2 = new File(str3);
        try {
            if (!file2.exists()) {
                LogUtil.a("Track_GPSFileUtils", "saveFileData createNewFile result ", Boolean.valueOf(file2.createNewFile()));
            }
            xji.a(file2.getCanonicalPath(), "S2", 0);
        } catch (IOException e) {
            LogUtil.e("Track_GPSFileUtils", "saveFileData IOException ", LogAnonymous.b(e));
        }
        d(str3, s, s2, f, f2, i, i2, i3, s3, s4);
    }

    private static boolean b(String str, int i, int i2, double d2, double d3, double d4, int i3, int[] iArr) {
        try {
            izr izrVar = new izr(new DataOutputStream(new FileOutputStream(str, true)));
            try {
                izrVar.write(i);
                izrVar.a(i2);
                izrVar.d(Double.doubleToLongBits(d2));
                izrVar.d(Double.doubleToLongBits(d3));
                if (d == 3) {
                    izrVar.d(Double.doubleToLongBits(d4));
                    izrVar.a(i3);
                }
                for (int i4 : iArr) {
                    izrVar.write(i4);
                }
                izrVar.close();
                return true;
            } catch (Throwable th) {
                try {
                    izrVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            LogUtil.e("Track_GPSFileUtils", "createFile error :", LogAnonymous.b(e));
            return false;
        }
    }

    private static boolean d(String str, short s, short s2, float f, float f2, int i, int i2, int i3, short s3, short s4) {
        try {
            izr izrVar = new izr(new DataOutputStream(new FileOutputStream(str, true)));
            try {
                izrVar.b(s);
                izrVar.b(s2);
                izrVar.a(Float.floatToIntBits(f));
                izrVar.a(Float.floatToIntBits(f2));
                izrVar.write(i);
                izrVar.write(i2);
                izrVar.write(i3);
                if (d == 3) {
                    izrVar.b(s3);
                    izrVar.b(s4);
                }
                ReleaseLogUtil.d("Track_GPSFileUtils", "saveGpsPath filePath ", str);
                izrVar.close();
                return true;
            } catch (Throwable th) {
                try {
                    izrVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            LogUtil.e("Track_GPSFileUtils", "createFile error :", LogAnonymous.b(e));
            return false;
        }
    }

    public static String b() {
        if (!CommonUtil.at() && (CompileParameterUtil.d("IS_DEBUG_VERSION") || (CommonUtil.ap() && c()))) {
            if (("mounted".equals(Environment.getExternalStorageState()) || !Environment.isExternalStorageRemovable()) && !PermissionUtil.a()) {
                return Environment.getExternalStorageDirectory().getPath();
            }
            return LogConfig.o();
        }
        return LogConfig.o();
    }

    private static boolean c() {
        return new TrackAltitudeMgr(BaseApplication.b()).b();
    }

    public static void e() {
        File file = new File(b() + "/tracktest");
        if (file.exists()) {
            a(file);
        }
    }

    private static void a(File file) {
        boolean zDelete;
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length <= 20) {
            LogUtil.j("Track_GPSFileUtils", "deleteOldFile files is null or less than 20 files.");
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                a(file2);
                zDelete = file2.delete();
            } else {
                zDelete = file2.delete();
            }
            LogUtil.a("Track_GPSFileUtils", "deleteOldFile:", Boolean.valueOf(zDelete));
        }
    }

    public static boolean d(long j, int i) {
        if (i == 1) {
            LogUtil.j("Track_GPSFileUtils", "isExecutedTrackProcess false");
            return false;
        }
        LogUtil.j("Track_GPSFileUtils", "isExecutedTrackProcess sportDuration ", Long.valueOf(j));
        return j <= AiCoreSdkConstant.CHECK_SUPPORT_INTERVAL;
    }

    public static boolean e(int i) {
        if (Utils.o() || !Process.is64Bit()) {
            return false;
        }
        iwy iwyVarA = iwy.a(BaseApplication.b());
        if (iwyVarA == null) {
            ReleaseLogUtil.a("Track_GPSFileUtils", "isSupportPostProcess sportManager is null");
            return false;
        }
        if (iwyVarA.l() != -1 || iwyVarA.aq()) {
            return false;
        }
        if (i == 258 || i == 257) {
            return !CommonUtil.bu() || qsr.c().h();
        }
        return false;
    }

    public static void b(String str, String str2, Context context) {
        if ((CommonUtil.ap() || CommonUtil.ao()) && !TextUtils.isEmpty(str)) {
            String str3 = b() + "/tracktest";
            File file = new File(str3);
            if (!file.exists()) {
                LogUtil.a("Track_GPSFileUtils", "saveFileData mkdir result ", Boolean.valueOf(file.mkdirs()));
            }
            String str4 = str3 + "/higeo_" + str + ".txt";
            File file2 = new File(str4);
            try {
                if (!file2.exists()) {
                    LogUtil.a("Track_GPSFileUtils", "saveFileData createNewFile result ", Boolean.valueOf(file2.createNewFile()));
                }
                xji.a(file2.getCanonicalPath(), "S2", 0);
            } catch (IOException e) {
                LogUtil.e("Track_GPSFileUtils", "saveFileData IOException ", LogAnonymous.b(e));
            }
            try {
                izr izrVar = new izr(new DataOutputStream(new FileOutputStream(str4, true)));
                try {
                    izrVar.writeBytes(str2);
                    izrVar.flush();
                    izrVar.close();
                } catch (Throwable th) {
                    try {
                        izrVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused) {
                LogUtil.a("Track_GPSFileUtils", "fileNotFound");
            } catch (IOException e2) {
                LogUtil.a("Track_GPSFileUtils", "saveDisAndPaceToFile", e2.getMessage());
            }
            LogUtil.d("Track_GPSFileUtils", "saveDisAndPaceToFile success");
        }
    }
}
