package com.huawei.pluginachievement.gltexture.util;

import android.content.Context;
import android.text.TextUtils;
import androidx.webkit.ProxyConfig;
import com.huawei.health.h5pro.utils.GeneralUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.pluginachievement.gltexture.impl.AchieveMedalCallBack;
import defpackage.osa;
import defpackage.osh;
import defpackage.osz;
import defpackage.otf;
import defpackage.pax;
import health.compact.a.CommonUtil;
import io.jsonwebtoken.Header;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes13.dex */
public class FileUtil {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile FileUtil f22004c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f22005b;
    private ExecutorService d;

    public FileUtil(Context context) {
        LogUtil.a("PLGACHIEVE_FileUtil", com.huawei.android.hicloud.sync.util.FileUtil.TAG);
        if (context == null) {
            this.f22005b = BaseApplication.getContext();
        } else {
            this.f22005b = context.getApplicationContext();
        }
        this.d = Executors.newSingleThreadExecutor();
        d();
    }

    public static FileUtil e(Context context) {
        if (f22004c == null) {
            synchronized (FileUtil.class) {
                if (f22004c == null) {
                    f22004c = new FileUtil(context);
                }
            }
        }
        return f22004c;
    }

    private boolean a(String str, String str2) {
        if (!GeneralUtil.isSafePath(str)) {
            LogUtil.j("PLGACHIEVE_FileUtil", "sanitizeFileName(entryName): untrusted -> " + str);
            return false;
        }
        if (!GeneralUtil.isSafePath(str2)) {
            LogUtil.j("PLGACHIEVE_FileUtil", "sanitizeFileName(intendedDir): untrusted -> " + str2);
            return false;
        }
        String strC = CommonUtil.c(str2);
        try {
            String canonicalPath = new File(strC, str).getCanonicalPath();
            return !TextUtils.isEmpty(canonicalPath) && canonicalPath.startsWith(new File(CommonUtil.c(strC)).getCanonicalPath());
        } catch (IOException e) {
            LogUtil.e("PLGACHIEVE_FileUtil", e.getMessage());
        }
    }

    private void d() {
        if ("1".equals(osa.e(this.f22005b, "isNeedDelOldMedalDir"))) {
            return;
        }
        LogUtil.a("PLGACHIEVE_FileUtil", "deleteDirWithFile");
        e();
        osa.b(this.f22005b, "isNeedDelOldMedalDir", "1");
    }

    private void e() {
        try {
            e(new File(this.f22005b.getFilesDir().getCanonicalPath() + File.separator + "achievemedal"));
        } catch (IOException e) {
            LogUtil.e("PLGACHIEVE_FileUtil", "FileNotFoundException:", e.getMessage());
        }
    }

    public void a() {
        e();
        otf.d();
        osa.b(this.f22005b, "_medalTextureDownload", "");
        osa.b(this.f22005b, "clearMedalResCache", "1");
    }

    public void b(String str, String str2, String str3, AchieveMedalCallBack achieveMedalCallBack) throws Throwable {
        if (achieveMedalCallBack == null) {
            return;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            achieveMedalCallBack.onResponse(-1);
            return;
        }
        String strD = pax.d(str2);
        if (osz.b(strD)) {
            a(str, strD + File.separator + str3 + ".png", achieveMedalCallBack);
            return;
        }
        achieveMedalCallBack.onResponse(-1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r10v11, types: [javax.net.ssl.HttpsURLConnection] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.huawei.pluginachievement.gltexture.util.FileUtil] */
    private void a(String str, String str2, AchieveMedalCallBack achieveMedalCallBack) throws Throwable {
        FileOutputStream fileOutputStream;
        ?? r10;
        ?? r11;
        InputStream inputStream;
        FileOutputStream fileOutputStream2;
        String strC = str2;
        if (!GeneralUtil.isSafePath(str2)) {
            LogUtil.j("PLGACHIEVE_FileUtil", "downloadMedalPng: untrusted -> " + strC);
            return;
        }
        int iD = -1;
        InputStream inputStream2 = null;
        fileOutputStream = null;
        InputStream inputStream3 = null;
        fileOutputStream = null;
        inputStream2 = null;
        FileOutputStream fileOutputStream3 = null;
        FileOutputStream fileOutputStream4 = null;
        try {
            try {
                URL url = new URL(str);
                URLConnection uRLConnectionOpenConnection = url.openConnection();
                if (ProxyConfig.MATCH_HTTPS.equals(url.getProtocol().toLowerCase(Locale.ENGLISH)) && (uRLConnectionOpenConnection instanceof HttpsURLConnection)) {
                    r11 = (HttpsURLConnection) uRLConnectionOpenConnection;
                    try {
                        osh.a(r11);
                        r11 = r11;
                    } catch (IOException e) {
                        e = e;
                        inputStream = null;
                        LogUtil.e("PLGACHIEVE_FileUtil", "downloadMedalPng IOException");
                        String message = e.getMessage();
                        b(inputStream, fileOutputStream4);
                        d(strC, achieveMedalCallBack, -1, message);
                        a(r11);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = null;
                        r10 = r11;
                        b(inputStream2, fileOutputStream);
                        d(strC, achieveMedalCallBack, -1, "faild");
                        a(r10);
                        throw th;
                    }
                } else {
                    if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                        b(null, null);
                        d(strC, achieveMedalCallBack, -1, "faild");
                        a(null);
                        return;
                    }
                    r11 = (HttpURLConnection) uRLConnectionOpenConnection;
                }
                r11.setConnectTimeout(10000);
                r11.setReadTimeout(10000);
                r11.setRequestMethod("GET");
                int responseCode = r11.getResponseCode();
                LogUtil.d("PLGACHIEVE_FileUtil", "download resCode = ", Integer.valueOf(responseCode));
                if (responseCode == 200) {
                    inputStream = r11.getInputStream();
                    try {
                        strC = CommonUtil.c(str2);
                        File fileE = e(strC);
                        if (fileE == null) {
                            throw new IOException();
                        }
                        if (fileE.exists()) {
                            LogUtil.d("PLGACHIEVE_FileUtil", "deleteResult is ", Boolean.valueOf(fileE.delete()));
                        }
                        LogUtil.d("PLGACHIEVE_FileUtil", "createResult is ", Boolean.valueOf(fileE.createNewFile()));
                        fileOutputStream2 = new FileOutputStream(fileE);
                        try {
                            iD = d(fileOutputStream2, inputStream, responseCode);
                            inputStream3 = inputStream;
                        } catch (IOException e2) {
                            e = e2;
                            fileOutputStream4 = fileOutputStream2;
                            LogUtil.e("PLGACHIEVE_FileUtil", "downloadMedalPng IOException");
                            String message2 = e.getMessage();
                            b(inputStream, fileOutputStream4);
                            d(strC, achieveMedalCallBack, -1, message2);
                            a(r11);
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream3 = fileOutputStream2;
                            fileOutputStream = fileOutputStream3;
                            inputStream2 = inputStream;
                            r10 = r11;
                            b(inputStream2, fileOutputStream);
                            d(strC, achieveMedalCallBack, -1, "faild");
                            a(r10);
                            throw th;
                        }
                    } catch (IOException e3) {
                        e = e3;
                    }
                } else {
                    fileOutputStream2 = null;
                }
                b(inputStream3, fileOutputStream2);
                d(strC, achieveMedalCallBack, iD, "faild");
                a(r11);
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e4) {
            e = e4;
            r11 = 0;
            inputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
            r10 = 0;
        }
    }

    private int d(FileOutputStream fileOutputStream, InputStream inputStream, int i) {
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i2 = inputStream.read(bArr);
                if (i2 != -1) {
                    fileOutputStream.write(bArr, 0, i2);
                } else {
                    fileOutputStream.flush();
                    return i;
                }
                b(inputStream, fileOutputStream);
            }
        } catch (IOException unused) {
            LogUtil.e("PLGACHIEVE_FileUtil", "downloadMedalPng download IOException");
            return -1;
        } finally {
            b(inputStream, fileOutputStream);
        }
    }

    private void a(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    private void d(String str, AchieveMedalCallBack achieveMedalCallBack, int i, String str2) {
        if (i == -1 && ".png".equals(osz.e(str))) {
            if (!GeneralUtil.isSafePath(str)) {
                LogUtil.j("PLGACHIEVE_FileUtil", "deleteFileAndCallbackResult: untrusted -> " + str);
                return;
            } else {
                File file = new File(str);
                if (file.exists() && !file.delete()) {
                    LogUtil.d("PLGACHIEVE_FileUtil", "downloadMedalPng delete file failed");
                }
            }
        }
        if (achieveMedalCallBack != null) {
            achieveMedalCallBack.onResponse(i);
        }
    }

    private void b(InputStream inputStream, FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (IOException unused) {
                LogUtil.e("PLGACHIEVE_FileUtil", "closeFileStream IOException");
            }
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused2) {
                LogUtil.e("PLGACHIEVE_FileUtil", "closeFileStream IOException");
            }
        }
    }

    public void d(String str, String str2, AchieveMedalCallBack achieveMedalCallBack) throws Throwable {
        FileOutputStream fileOutputStream;
        int responseCode;
        FileOutputStream fileOutputStream2;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || achieveMedalCallBack == null) {
            return;
        }
        String strB = b(str2);
        if (!GeneralUtil.isSafePath(strB)) {
            LogUtil.j("PLGACHIEVE_FileUtil", "download: untrusted -> " + strB);
            return;
        }
        int i = -1;
        InputStream inputStream = null;
        InputStream inputStream2 = null;
        FileOutputStream fileOutputStream3 = null;
        inputStream = null;
        inputStream = null;
        try {
            HttpURLConnection httpURLConnectionA = a(str);
            responseCode = httpURLConnectionA.getResponseCode();
            if (responseCode == 200) {
                try {
                    InputStream inputStream3 = httpURLConnectionA.getInputStream();
                    try {
                        if (!c(strB)) {
                            LogUtil.a("PLGACHIEVE_FileUtil", "createFileDir false");
                            c(inputStream3, (FileOutputStream) null, responseCode, achieveMedalCallBack);
                            return;
                        }
                        String strC = CommonUtil.c(strB + ".zip");
                        File fileE = e(strC);
                        int iLastIndexOf = strB.lastIndexOf(47);
                        int i2 = iLastIndexOf + 1;
                        if (!TextUtils.isEmpty(strC) && i2 < strC.length()) {
                            String strSubstring = strC.substring(i2, strC.length());
                            File fileE2 = e(CommonUtil.c(a(strB, iLastIndexOf) + File.separator + "_" + strSubstring));
                            if (fileE2 == null || fileE == null) {
                                throw new IOException();
                            }
                            fileOutputStream2 = new FileOutputStream(fileE2);
                            try {
                                c(fileOutputStream2, inputStream3);
                                responseCode = c(fileE2, fileE, str2, achieveMedalCallBack);
                                inputStream2 = inputStream3;
                            } catch (IOException unused) {
                                fileOutputStream3 = fileOutputStream2;
                                fileOutputStream = fileOutputStream3;
                                inputStream = inputStream3;
                                try {
                                    LogUtil.e("PLGACHIEVE_FileUtil", "download IOException");
                                    c(inputStream, fileOutputStream, -1, achieveMedalCallBack);
                                    return;
                                } catch (Throwable th) {
                                    th = th;
                                    i = responseCode;
                                    c(inputStream, fileOutputStream, i, achieveMedalCallBack);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                inputStream = inputStream3;
                                i = responseCode;
                                fileOutputStream = fileOutputStream2;
                                c(inputStream, fileOutputStream, i, achieveMedalCallBack);
                                throw th;
                            }
                        }
                        LogUtil.j("PLGACHIEVE_FileUtil", "download zipPath isEmpty or substring IndexOutOfBounds.");
                        c(inputStream3, (FileOutputStream) null, responseCode, achieveMedalCallBack);
                        return;
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream = null;
                        inputStream = inputStream3;
                        i = responseCode;
                        c(inputStream, fileOutputStream, i, achieveMedalCallBack);
                        throw th;
                    }
                } catch (IOException unused3) {
                    fileOutputStream = null;
                    LogUtil.e("PLGACHIEVE_FileUtil", "download IOException");
                    c(inputStream, fileOutputStream, -1, achieveMedalCallBack);
                    return;
                } catch (Throwable th4) {
                    th = th4;
                    fileOutputStream = null;
                }
            } else {
                fileOutputStream2 = null;
            }
            c(inputStream2, fileOutputStream2, responseCode, achieveMedalCallBack);
        } catch (IOException unused4) {
            responseCode = -1;
        } catch (Throwable th5) {
            th = th5;
            fileOutputStream = null;
        }
    }

    private String b(String str) {
        try {
            return this.f22005b.getFilesDir().getCanonicalPath() + File.separator + "achievemedal" + File.separator + str;
        } catch (IOException unused) {
            LogUtil.e("PLGACHIEVE_FileUtil", "initSavePath: IOException");
            return "";
        }
    }

    private HttpURLConnection a(String str) throws IOException {
        HttpURLConnection httpURLConnection;
        URL url = new URL(str);
        if (ProxyConfig.MATCH_HTTPS.equals(url.getProtocol().toLowerCase(Locale.ENGLISH))) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
            osh.a(httpsURLConnection);
            httpURLConnection = httpsURLConnection;
        } else {
            httpURLConnection = (HttpURLConnection) url.openConnection();
        }
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setRequestMethod("GET");
        return httpURLConnection;
    }

    private void c(FileOutputStream fileOutputStream, InputStream inputStream) {
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStream.read(bArr);
                if (i != -1) {
                    fileOutputStream.write(bArr, 0, i);
                } else {
                    fileOutputStream.flush();
                    return;
                }
            }
        } catch (IOException unused) {
            LogUtil.e("PLGACHIEVE_FileUtil", "dealFileOutputStream IOException");
            a(inputStream);
            a(fileOutputStream);
        }
    }

    private int c(File file, File file2, String str, AchieveMedalCallBack achieveMedalCallBack) {
        if (!file.renameTo(file2)) {
            if (!file.exists()) {
                return -1;
            }
            LogUtil.d("PLGACHIEVE_FileUtil", "deleteRet = ", Boolean.valueOf(file.delete()));
            return -1;
        }
        d(str, achieveMedalCallBack);
        return 0;
    }

    private void c(InputStream inputStream, FileOutputStream fileOutputStream, int i, AchieveMedalCallBack achieveMedalCallBack) {
        a(inputStream);
        a(fileOutputStream);
        if (i != 0) {
            achieveMedalCallBack.onResponse(i);
        }
    }

    public static void e(File file) {
        File[] fileArrListFiles;
        if (file == null || !file.exists() || !file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2 != null) {
                if (file2.isFile()) {
                    LogUtil.d("PLGACHIEVE_FileUtil", "deleteDirWithFile result=", Boolean.valueOf(file2.delete()));
                } else if (file2.isDirectory()) {
                    e(file2);
                } else {
                    LogUtil.d("PLGACHIEVE_FileUtil", "file type error");
                }
            }
        }
        LogUtil.d("PLGACHIEVE_FileUtil", "deleteDirWithFile result=", Boolean.valueOf(file.delete()));
    }

    private void d(String str, final AchieveMedalCallBack achieveMedalCallBack) {
        try {
            final String str2 = this.f22005b.getFilesDir().getCanonicalPath() + File.separator + "achievemedal" + File.separator + str + ".zip";
            final String str3 = this.f22005b.getFilesDir().getCanonicalPath() + File.separator + "achievemedal" + File.separator + str;
            if (this.d.isShutdown()) {
                return;
            }
            this.d.execute(new Runnable() { // from class: osw
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.e.e(str2, str3, achieveMedalCallBack);
                }
            });
        } catch (IOException e) {
            LogUtil.e("PLGACHIEVE_FileUtil", "FileNotFoundException:", e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void e(String str, String str2, AchieveMedalCallBack achieveMedalCallBack) throws Throwable {
        FileOutputStream fileOutputStream;
        ZipInputStream zipInputStream;
        FileOutputStream fileOutputStream2;
        ZipInputStream zipInputStream2;
        ZipInputStream zipInputStream3;
        if (!GeneralUtil.isSafePath(str)) {
            LogUtil.j("PLGACHIEVE_FileUtil", "unZip(zipFileString): untrusted -> " + str);
            return;
        }
        if (!GeneralUtil.isSafePath(str2)) {
            LogUtil.j("PLGACHIEVE_FileUtil", "unZip(outPathString): untrusted -> " + str2);
            return;
        }
        String strC = CommonUtil.c(str);
        String strC2 = CommonUtil.c(str2);
        int i = 0;
        FileInputStream fileInputStream = null;
        fileOutputStream = null;
        ZipInputStream zipInputStream4 = null;
        ZipInputStream zipInputStream5 = null;
        FileOutputStream fileOutputStream3 = null;
        fileInputStream = null;
        FileInputStream fileInputStream2 = null;
        try {
            FileInputStream fileInputStream3 = new FileInputStream(strC);
            try {
                zipInputStream3 = new ZipInputStream(fileInputStream3);
                while (true) {
                    try {
                        ZipEntry nextEntry = zipInputStream3.getNextEntry();
                        if (nextEntry == null) {
                            break;
                        }
                        String strC3 = CommonUtil.c(nextEntry.getName());
                        if (TextUtils.isEmpty(strC3) || !a(strC3, strC2)) {
                            LogUtil.d("PLGACHIEVE_FileUtil", "zipName is empty or zip is too max!");
                        } else if (nextEntry.isDirectory()) {
                            LogUtil.d("PLGACHIEVE_FileUtil", "createFileDir=", Boolean.valueOf(c(strC2 + File.separator + strC3.substring(0, strC3.length() - 1))));
                        } else {
                            File file = new File(strC2 + File.separator + strC3);
                            File parentFile = file.getParentFile();
                            if (!parentFile.exists()) {
                                LogUtil.d("PLGACHIEVE_FileUtil", "parentFile dirResult status=", Boolean.valueOf(parentFile.mkdirs()));
                            }
                            LogUtil.d("PLGACHIEVE_FileUtil", "result = ", Boolean.valueOf(file.createNewFile()));
                            a(fileOutputStream3);
                            fileOutputStream2 = new FileOutputStream(file);
                            try {
                                c(fileOutputStream2, 0, zipInputStream3);
                                fileOutputStream3 = fileOutputStream2;
                            } catch (IOException unused) {
                                zipInputStream4 = zipInputStream3;
                                zipInputStream2 = zipInputStream4;
                                fileInputStream2 = fileInputStream3;
                                try {
                                    LogUtil.e("PLGACHIEVE_FileUtil", "unZip IOException");
                                    zipInputStream = zipInputStream2;
                                    c(fileInputStream2, zipInputStream, fileOutputStream2);
                                    i = -3;
                                    e(str2, i, achieveMedalCallBack);
                                    d(strC);
                                } catch (Throwable th) {
                                    th = th;
                                    zipInputStream = zipInputStream2;
                                    fileInputStream = fileInputStream2;
                                    fileOutputStream = fileOutputStream2;
                                    c(fileInputStream, zipInputStream, fileOutputStream);
                                    throw th;
                                }
                            } catch (IllegalArgumentException e) {
                                e = e;
                                zipInputStream5 = zipInputStream3;
                                zipInputStream = zipInputStream5;
                                fileInputStream2 = fileInputStream3;
                                try {
                                    LogUtil.e("PLGACHIEVE_FileUtil", "IllegalArgumentException:", e.getMessage());
                                    c(fileInputStream2, zipInputStream, fileOutputStream2);
                                    i = -3;
                                    e(str2, i, achieveMedalCallBack);
                                    d(strC);
                                } catch (Throwable th2) {
                                    th = th2;
                                    fileInputStream = fileInputStream2;
                                    fileOutputStream = fileOutputStream2;
                                    c(fileInputStream, zipInputStream, fileOutputStream);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                fileOutputStream3 = fileOutputStream2;
                                fileOutputStream = fileOutputStream3;
                                fileInputStream = fileInputStream3;
                                zipInputStream = zipInputStream3;
                                c(fileInputStream, zipInputStream, fileOutputStream);
                                throw th;
                            }
                        }
                    } catch (IOException unused2) {
                        fileOutputStream2 = fileOutputStream3;
                    } catch (IllegalArgumentException e2) {
                        e = e2;
                        fileOutputStream2 = fileOutputStream3;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                c(fileInputStream3, zipInputStream3, fileOutputStream3);
            } catch (IOException unused3) {
                fileOutputStream2 = null;
            } catch (IllegalArgumentException e3) {
                e = e3;
                fileOutputStream2 = null;
            } catch (Throwable th5) {
                th = th5;
                zipInputStream3 = null;
            }
        } catch (IOException unused4) {
            zipInputStream2 = null;
            fileOutputStream2 = null;
        } catch (IllegalArgumentException e4) {
            e = e4;
            zipInputStream = null;
            fileOutputStream2 = null;
        } catch (Throwable th6) {
            th = th6;
            fileOutputStream = null;
            zipInputStream = null;
        }
        e(str2, i, achieveMedalCallBack);
        d(strC);
    }

    private void c(FileOutputStream fileOutputStream, int i, ZipInputStream zipInputStream) {
        int i2;
        try {
            byte[] bArr = new byte[1024];
            while (i + 1024 <= 5242880 && (i2 = zipInputStream.read(bArr)) != -1) {
                fileOutputStream.write(bArr, 0, i2);
                i += i2;
                fileOutputStream.flush();
            }
        } catch (IOException unused) {
            LogUtil.e("PLGACHIEVE_FileUtil", "dealOutputStream IOException");
            e(zipInputStream);
            a(fileOutputStream);
        }
    }

    private void c(FileInputStream fileInputStream, ZipInputStream zipInputStream, FileOutputStream fileOutputStream) {
        c(fileInputStream);
        e(zipInputStream);
        a(fileOutputStream);
    }

    private void e(String str, int i, AchieveMedalCallBack achieveMedalCallBack) {
        if (new File(str).isDirectory() && i == 0) {
            achieveMedalCallBack.onResponse(0);
        } else {
            LogUtil.d("PLGACHIEVE_FileUtil", "unZip and the dir fail");
            achieveMedalCallBack.onResponse(-3);
        }
    }

    public void d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        d(e(str));
    }

    private void d(File file) {
        String strSubstring;
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isFile()) {
            LogUtil.d("PLGACHIEVE_FileUtil", "deleteDirZipFile result=", Boolean.valueOf(file.delete()));
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2 != null && file2.isFile()) {
                String name = file2.getName();
                int iLastIndexOf = name.lastIndexOf(".") + 1;
                if (name.length() <= iLastIndexOf) {
                    strSubstring = "";
                } else {
                    strSubstring = name.substring(iLastIndexOf);
                }
                if (Header.COMPRESSION_ALGORITHM.equals(strSubstring)) {
                    LogUtil.d("PLGACHIEVE_FileUtil", "deleteDirZipFile result=", Boolean.valueOf(file2.delete()));
                }
            }
        }
    }

    public static File e(String str) {
        return a(new String[]{str});
    }

    public static File a(String[] strArr) {
        if (strArr == null) {
            return new File("");
        }
        File file = null;
        for (String str : strArr) {
            if (file == null) {
                file = new File(str);
            } else {
                file = new File(file, str);
            }
        }
        return file;
    }

    private static String a(String str, int i) {
        if (!TextUtils.isEmpty(str) && str.length() >= i) {
            return str.substring(0, i);
        }
        return "";
    }

    private static boolean c(String str) {
        if (!GeneralUtil.isSafePath(str)) {
            LogUtil.j("PLGACHIEVE_FileUtil", "createFileDir: untrusted -> " + str);
            return false;
        }
        String strC = CommonUtil.c(str);
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j("PLGACHIEVE_FileUtil", "createFileDir, checkPath is isEmpty");
            return false;
        }
        File file = new File(strC);
        if (file.exists()) {
            return true;
        }
        boolean zMkdirs = file.mkdirs();
        LogUtil.d("PLGACHIEVE_FileUtil", "dirResult:", zMkdirs ? "success" : ParamConstants.CallbackMethod.ON_FAIL);
        return zMkdirs;
    }

    private static void a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
                LogUtil.e("PLGACHIEVE_FileUtil", "closeInputStream IOException");
            }
        }
    }

    private static void a(FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (IOException unused) {
                LogUtil.e("PLGACHIEVE_FileUtil", "closeFileOutputStream IOException");
            }
        }
    }

    private static void c(FileInputStream fileInputStream) {
        if (fileInputStream != null) {
            try {
                fileInputStream.close();
            } catch (IOException unused) {
                LogUtil.e("PLGACHIEVE_FileUtil", "closeFileInputStream IOException");
            }
        }
    }

    private static void e(ZipInputStream zipInputStream) {
        if (zipInputStream != null) {
            try {
                zipInputStream.close();
            } catch (IOException unused) {
                LogUtil.a("PLGACHIEVE_FileUtil", "closeZipInputStream IOException");
            }
        }
    }
}
