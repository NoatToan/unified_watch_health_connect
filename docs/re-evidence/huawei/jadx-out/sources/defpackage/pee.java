package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import health.compact.a.CommonUtil;
import health.compact.a.util.LogUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes14.dex */
public class pee {
    public static String e(InputStream inputStream) {
        String str = "";
        if (inputStream == null) {
            LogUtil.d("Suggestion_FileUtil", "getString, inputStream is null.");
            return "";
        }
        try {
            try {
                byte[] bArr = new byte[inputStream.available()];
                str = inputStream.read(bArr) > 0 ? new String(bArr, "UTF-8") : "";
            } catch (IOException e) {
                LogUtil.c("Suggestion_FileUtil", ExceptionUtils.c(e));
            }
            return str;
        } finally {
            try {
                inputStream.close();
            } catch (IOException e2) {
                LogUtil.c("Suggestion_FileUtil", ExceptionUtils.c(e2));
            }
        }
    }

    public static String a(Context context, String str) {
        try {
            if (context == null) {
                LogUtil.d("Suggestion_FileUtil", "getStringByAssetManager, context is null.");
                return "";
            }
            AssetManager assets = context.getAssets();
            return assets == null ? "" : e(assets.open(str));
        } catch (IOException e) {
            LogUtil.c("Suggestion_FileUtil", ExceptionUtils.c(e));
            return "";
        }
    }

    public static boolean c(File file) {
        if (file == null) {
            LogUtil.d("Suggestion_FileUtil", "isDeleteFile, file is null.");
            return false;
        }
        if (!file.exists()) {
            return false;
        }
        if (file.isFile()) {
            return file.delete();
        }
        if (file.isDirectory()) {
            d(file);
        }
        return file.delete();
    }

    private static void d(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2 != null) {
                c(file2);
            }
        }
    }

    public static boolean b(String str) {
        return e(new File(str));
    }

    public static boolean e(File file) {
        if (file == null) {
            LogUtil.d("Suggestion_FileUtil", "isDeleteDirSuccess, file is null.");
            return false;
        }
        if (!file.exists()) {
            return false;
        }
        if (file.isFile()) {
            return file.delete();
        }
        if (file.isDirectory()) {
            a(file);
        }
        return file.delete();
    }

    private static void a(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2 != null) {
                e(file2);
            }
        }
    }

    public static void b(Context context, String str, String str2) throws Throwable {
        Throwable th;
        FileOutputStream fileOutputStream;
        IOException e;
        InputStream inputStreamOpen;
        FileOutputStream fileOutputStream2;
        InputStream inputStream = null;
        try {
            try {
                if (context == null) {
                    LogUtil.d("Suggestion_FileUtil", "putAssetsToSdCard, context is null.");
                    a((InputStream) null, (FileOutputStream) null);
                    return;
                }
                String[] list = context.getAssets().list(str);
                if (list == null || list.length == 0) {
                    inputStreamOpen = context.getAssets().open(str);
                    try {
                        byte[] bArr = new byte[1024];
                        File file = new File(CommonUtil.e(str2 + File.separator + str.substring(str.lastIndexOf(47))));
                        if (file.exists()) {
                            a(inputStreamOpen, (FileOutputStream) null);
                            return;
                        }
                        if (!file.createNewFile()) {
                            LogUtil.d("Suggestion_FileUtil", "Create File fail");
                            a(inputStreamOpen, (FileOutputStream) null);
                            return;
                        }
                        FileOutputStream fileOutputStreamOpenOutputStream = FileUtils.openOutputStream(file);
                        while (true) {
                            int i = inputStreamOpen.read(bArr);
                            if (i == -1) {
                                break;
                            } else {
                                fileOutputStreamOpenOutputStream.write(bArr, 0, i);
                            }
                        }
                        fileOutputStreamOpenOutputStream.flush();
                        inputStream = inputStreamOpen;
                        fileOutputStream2 = fileOutputStreamOpenOutputStream;
                    } catch (IOException e2) {
                        e = e2;
                        LogUtil.c("Suggestion_FileUtil", ExceptionUtils.c(e));
                        a(inputStreamOpen, (FileOutputStream) null);
                        return;
                    }
                } else {
                    String str3 = str2 + File.separator + str;
                    File file2 = new File(str3);
                    if (!file2.exists() && !file2.mkdirs()) {
                        LogUtil.c("Suggestion_FileUtil", "mkdirResult is fail");
                        a((InputStream) null, (FileOutputStream) null);
                        return;
                    }
                    for (String str4 : list) {
                        b(context, str + File.separator + str4, str3);
                    }
                    fileOutputStream2 = null;
                }
                a(inputStream, fileOutputStream2);
            } catch (Throwable th2) {
                th = th2;
                inputStream = context;
                fileOutputStream = null;
                a(inputStream, fileOutputStream);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            inputStreamOpen = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
            a(inputStream, fileOutputStream);
            throw th;
        }
    }

    private static void a(InputStream inputStream, FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                LogUtil.c("Suggestion_FileUtil", "putAssetsToSdCard fos ", ExceptionUtils.c(e));
            }
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e2) {
                LogUtil.c("Suggestion_FileUtil", "putAssetsToSdCard mIs ", ExceptionUtils.c(e2));
            }
        }
    }

    public static InputStream e(String str, String str2) {
        if (str != null && str2 != null && !str.isEmpty() && !str2.isEmpty()) {
            LogUtil.a("Suggestion_FileUtil", "getFileInputStream moduleName = ", str, " and fileName = ", str2);
            AssetManager assets = BaseApplication.getContext().getAssets();
            if (assets == null) {
                com.huawei.hwlogsmodel.LogUtil.j("Suggestion_FileUtil", "getFileInputStream assetManager == null");
                return null;
            }
            try {
                for (String str3 : assets.list(str)) {
                    if (str2.equals(str3)) {
                        return assets.open(str + "/" + str2);
                    }
                }
            } catch (IOException e) {
                com.huawei.hwlogsmodel.LogUtil.j("Suggestion_FileUtil", "getFileInputStream IOException " + e.getMessage());
            }
            com.huawei.hwlogsmodel.LogUtil.j("Suggestion_FileUtil", "getFileInputStream folderName or fileName error");
        }
        return null;
    }

    public static long a(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.d("Suggestion_FileUtil", "getFolderSize filename is null");
            return -1L;
        }
        File file = new File(str);
        if (!file.exists() || !file.isFile()) {
            com.huawei.hwlogsmodel.LogUtil.e("Suggestion_FileUtil", "getFolderSize err");
            return -1L;
        }
        return file.length();
    }
}
