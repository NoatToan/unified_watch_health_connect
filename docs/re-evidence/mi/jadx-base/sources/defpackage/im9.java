package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import dalvik.system.ZipPathValidator;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import util.WechatFileUtil;

/* JADX INFO: loaded from: classes6.dex */
public class im9 extends r72 {
    public static String A() {
        return H() + "AudioFeedback/";
    }

    public static String B() {
        return AppUtil.getApp().getPackageName() + ".fileprovider";
    }

    public static byte[] C(String str) {
        byte[] bArr = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            bArr = new byte[fileInputStream.available()];
            fileInputStream.read(bArr);
            fileInputStream.close();
            return bArr;
        } catch (IOException e) {
            e.printStackTrace();
            return bArr;
        }
    }

    public static String D(String str) {
        File externalFilesDir = AppUtil.getApp().getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return r72.k(str);
        }
        return externalFilesDir.getAbsolutePath() + File.separator + str;
    }

    public static String E() {
        return c(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath() + File.separator + "MiWatch");
    }

    public static String F(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int iLastIndexOf = str.lastIndexOf(File.separator);
        return iLastIndexOf == -1 ? "" : str.substring(0, iLastIndexOf);
    }

    public static long G(File file) {
        File[] fileArrListFiles = file.listFiles();
        long length = 0;
        if (fileArrListFiles == null) {
            return 0L;
        }
        for (File file2 : fileArrListFiles) {
            length += file2.isFile() ? file2.length() : G(file2);
        }
        return length;
    }

    public static String H() {
        return AppUtil.getApp().getFilesDir().getAbsolutePath() + "/";
    }

    @RequiresApi(api = 29)
    public static Uri I(String str, String str2) {
        ContentValues contentValues = new ContentValues();
        String str3 = Environment.DIRECTORY_DOWNLOADS;
        String str4 = File.separator;
        contentValues.put("_display_name", str);
        contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS + str4 + str2);
        return AppUtil.getApp().getContentResolver().insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues);
    }

    public static Uri J(String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.DIRECTORY_DCIM);
        String str3 = File.separator;
        sb.append(str3);
        sb.append("MiWatch");
        sb.append(str3);
        sb.append(str2);
        contentValues.put("relative_path", sb.toString());
        return N() ? AppUtil.getApp().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues) : AppUtil.getApp().getContentResolver().insert(MediaStore.Images.Media.INTERNAL_CONTENT_URI, contentValues);
    }

    public static String K() {
        return r72.f(WechatFileUtil.QR_DIR);
    }

    public static String L() {
        return r72.f("temp");
    }

    public static String M() {
        return r72.f("video-cache");
    }

    public static boolean N() {
        return Environment.getExternalStorageState().equals("mounted");
    }

    public static boolean O() {
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath());
        String str = File.separator;
        sb.append(str);
        sb.append("internal_test");
        sb.append(str);
        String string = sb.toString();
        Logger.d("FileUtil", "TestFileExist path is " + string);
        File file = new File(string);
        Logger.d("FileUtil", "file is " + file.exists());
        return (file.exists() || AppUtil.INSTANCE.isPlayChannel()) ? false : true;
    }

    public static boolean P(String str) {
        String strF = F(str);
        if (TextUtils.isEmpty(strF)) {
            return false;
        }
        File file = new File(strF);
        if (file.exists() && file.isDirectory()) {
            return true;
        }
        return file.mkdirs();
    }

    public static void Q() {
        R("log");
        R("devicelog");
    }

    public static void R(String str) {
        String strF = r72.f(str);
        String str2 = System.currentTimeMillis() + str + ".zip";
        try {
            File file = new File(r72.j("wearablelog") + File.separator + str2);
            z(file);
            Z(strF, file, str2, "wearablelog");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean S(byte[] bArr, String str) {
        boolean zA;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            zA = r72.a(byteArrayInputStream, str);
            try {
                byteArrayInputStream.close();
            } catch (IOException e) {
                e = e;
                Logger.e("saveBytesToFile error:", String.valueOf(e));
                e.printStackTrace();
            }
        } catch (IOException e2) {
            e = e2;
            zA = false;
        }
        return zA;
    }

    public static boolean T(String str, String str2) {
        if (Build.VERSION.SDK_INT >= 34) {
            ZipPathValidator.clearCallback();
        }
        try {
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(str));
            while (true) {
                try {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry == null) {
                        zipInputStream.close();
                        Logger.i("FileUtil", "unZipFolder success");
                        return true;
                    }
                    String name = nextEntry.getName();
                    if (nextEntry.isDirectory()) {
                        new File(str2 + File.separator + name.substring(0, name.length() - 1)).mkdirs();
                    } else {
                        File file = new File(str2 + File.separator + name);
                        if (!file.exists() && file.getParentFile() != null) {
                            file.getParentFile().mkdirs();
                            file.createNewFile();
                        }
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int i = zipInputStream.read(bArr);
                                if (i == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, i);
                                fileOutputStream.flush();
                                try {
                                    zipInputStream.close();
                                } catch (Throwable th) {
                                    th.addSuppressed(th);
                                }
                                throw th;
                            }
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    }
                } catch (Throwable th4) {
                    zipInputStream.close();
                    throw th4;
                }
                Logger.i("FileUtil", "unZipFolder: " + e);
                e.printStackTrace();
                return false;
            }
        } catch (Exception e) {
            Logger.i("FileUtil", "unZipFolder: " + e);
            e.printStackTrace();
            return false;
        }
    }

    public static boolean U(File file, InputStream inputStream) {
        return V(file, inputStream, false);
    }

    public static boolean V(File file, InputStream inputStream, boolean z) throws Throwable {
        if (file == null) {
            return false;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                P(file.getAbsolutePath());
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, z);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, i);
                    }
                    fileOutputStream2.flush();
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e) {
                        Logger.e("FileUtil", String.valueOf(e));
                    }
                    try {
                        inputStream.close();
                        return true;
                    } catch (IOException e2) {
                        Logger.e("FileUtil", String.valueOf(e2));
                        return true;
                    }
                } catch (IOException e3) {
                    e = e3;
                    fileOutputStream = fileOutputStream2;
                    Logger.e("FileUtil", String.valueOf(e));
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e4) {
                            Logger.e("FileUtil", String.valueOf(e4));
                        }
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e5) {
                            Logger.e("FileUtil", String.valueOf(e5));
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e6) {
                            Logger.e("FileUtil", String.valueOf(e6));
                        }
                    }
                    if (inputStream == null) {
                        throw th;
                    }
                    try {
                        inputStream.close();
                        throw th;
                    } catch (IOException e7) {
                        Logger.e("FileUtil", String.valueOf(e7));
                        throw th;
                    }
                }
            } catch (IOException e8) {
                e = e8;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean W(String str, InputStream inputStream) {
        return X(str, inputStream, false);
    }

    public static boolean X(String str, InputStream inputStream, boolean z) {
        return V(str != null ? new File(str) : null, inputStream, z);
    }

    public static void Y(ZipOutputStream zipOutputStream, File file, String str) throws Throwable {
        FileInputStream fileInputStream = null;
        try {
            try {
                try {
                    if (!"files.zip".equals(file.getName()) && !"log.zip".equals(file.getName())) {
                        if (file.isDirectory()) {
                            File[] fileArrListFiles = file.listFiles();
                            Objects.requireNonNull(fileArrListFiles);
                            for (File file2 : fileArrListFiles) {
                                Y(zipOutputStream, file2, str + file.getName() + "/");
                            }
                        } else {
                            byte[] bArr = new byte[1024];
                            FileInputStream fileInputStream2 = new FileInputStream(file);
                            try {
                                zipOutputStream.putNextEntry(new ZipEntry(str + file.getName()));
                                while (true) {
                                    int i = fileInputStream2.read(bArr);
                                    if (i == -1) {
                                        break;
                                    } else {
                                        zipOutputStream.write(bArr, 0, i);
                                    }
                                }
                                zipOutputStream.closeEntry();
                                fileInputStream = fileInputStream2;
                            } catch (IOException e) {
                                e = e;
                                fileInputStream = fileInputStream2;
                                e.printStackTrace();
                                if (fileInputStream == null) {
                                    return;
                                } else {
                                    fileInputStream.close();
                                }
                            } catch (Throwable th) {
                                th = th;
                                fileInputStream = fileInputStream2;
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException e2) {
                                        e2.printStackTrace();
                                    }
                                }
                                throw th;
                            }
                        }
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                    }
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            } catch (IOException e4) {
                e = e4;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void Z(String str, File file, String str2, String str3) {
        File[] fileArrListFiles;
        ZipOutputStream zipOutputStream = null;
        try {
            try {
                try {
                    File file2 = new File(str);
                    if (file2.exists()) {
                        if (!file2.isDirectory() || ((fileArrListFiles = file2.listFiles()) != null && fileArrListFiles.length != 0)) {
                            ZipOutputStream zipOutputStream2 = Build.VERSION.SDK_INT >= 29 ? new ZipOutputStream(AppUtil.getApp().getContentResolver().openOutputStream(I(str2, str3))) : new ZipOutputStream(new FileOutputStream(file));
                            if (file2.isFile()) {
                                Y(zipOutputStream2, file2, "");
                            } else {
                                File[] fileArrListFiles2 = file2.listFiles();
                                if (fileArrListFiles2 == null) {
                                    try {
                                        zipOutputStream2.close();
                                        return;
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                        return;
                                    }
                                }
                                Objects.requireNonNull(fileArrListFiles2);
                                for (File file3 : fileArrListFiles2) {
                                    Y(zipOutputStream2, file3, "");
                                }
                            }
                            zipOutputStream2.close();
                        }
                    }
                } catch (IOException e2) {
                    e2.printStackTrace();
                    if (0 != 0) {
                        zipOutputStream.close();
                    }
                }
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    zipOutputStream.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static String c(String str) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        } else if (!file.isDirectory()) {
            file.delete();
            file.mkdirs();
        }
        return str;
    }

    public static String g(String str) {
        return c(E() + File.separator + str);
    }

    public static boolean t(String str, String str2) throws Throwable {
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    boolean zW = W(str2, fileInputStream2);
                    try {
                        fileInputStream2.close();
                    } catch (IOException e) {
                        Logger.e("FileUtil", String.valueOf(e));
                    }
                    return zW;
                } catch (FileNotFoundException e2) {
                    e = e2;
                    fileInputStream = fileInputStream2;
                    Logger.e("FileUtil", String.valueOf(e));
                    if (fileInputStream == null) {
                        return false;
                    }
                    try {
                        fileInputStream.close();
                        return false;
                    } catch (IOException e3) {
                        Logger.e("FileUtil", String.valueOf(e3));
                        return false;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e4) {
                            Logger.e("FileUtil", String.valueOf(e4));
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void u(String str, Uri uri) {
        try {
            InputStream inputStreamOpenInputStream = AppUtil.getApp().getContentResolver().openInputStream(uri);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(D(str)));
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStreamOpenInputStream.read(bArr);
                        if (i == -1) {
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            inputStreamOpenInputStream.close();
                            return;
                        }
                        fileOutputStream.write(bArr, 0, i);
                        if (inputStreamOpenInputStream != null) {
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                if (inputStreamOpenInputStream != null) {
                    inputStreamOpenInputStream.close();
                }
                throw th4;
            }
        } catch (Exception e) {
            Logger.e("FileUtil", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static boolean v(String str, Uri uri) {
        try {
            InputStream inputStreamOpenInputStream = AppUtil.getApp().getContentResolver().openInputStream(uri);
            try {
                File file = new File(str);
                if (!file.getParentFile().exists()) {
                    file.getParentFile().mkdirs();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStreamOpenInputStream.read(bArr);
                        if (i == -1) {
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            inputStreamOpenInputStream.close();
                            return true;
                        }
                        fileOutputStream.write(bArr, 0, i);
                        if (inputStreamOpenInputStream != null) {
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                if (inputStreamOpenInputStream != null) {
                    inputStreamOpenInputStream.close();
                }
                throw th4;
            }
        } catch (Exception e) {
            Logger.i("ShareTabBaseFragment", "Exception = " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    @RequiresApi(api = 29)
    public static Uri w(File file, String str) {
        Logger.i("FileUtil", "copyVideoFile Saved file " + file + " dir=" + str + " filePath=" + file.getPath());
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", file.getName());
        contentValues.put("mime_type", "video/mp4");
        contentValues.put("date_modified", Long.valueOf(System.currentTimeMillis() / 1000));
        contentValues.put("relative_path", Environment.DIRECTORY_MOVIES + File.separator + "MiWatch" + str);
        Uri uriX = x(contentValues);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                OutputStream outputStreamOpenOutputStream = AppUtil.getApp().getContentResolver().openOutputStream(uriX, Constants.DEVICE_TYPE_WEAR);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = fileInputStream.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        outputStreamOpenOutputStream.write(bArr, 0, i);
                        try {
                            fileInputStream.close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                        throw th;
                    }
                    outputStreamOpenOutputStream.flush();
                    outputStreamOpenOutputStream.close();
                    z(file);
                    fileInputStream.close();
                } catch (Throwable th2) {
                    if (outputStreamOpenOutputStream != null) {
                        try {
                            outputStreamOpenOutputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                fileInputStream.close();
                throw th4;
            }
        } catch (Exception e) {
            Logger.d("FileUtil", e);
        }
        return uriX;
    }

    public static Uri x(ContentValues contentValues) {
        return N() ? AppUtil.getApp().getContentResolver().insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues) : AppUtil.getApp().getContentResolver().insert(MediaStore.Video.Media.INTERNAL_CONTENT_URI, contentValues);
    }

    public static void y(String str) {
        z(new File(str));
    }

    public static boolean z(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        if (!file.isDirectory()) {
            return file.delete();
        }
        for (File file2 : file.listFiles()) {
            z(file2);
        }
        return file.delete();
    }
}
