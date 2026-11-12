package defpackage;

import android.content.Context;
import android.text.TextUtils;
import androidx.webkit.ProxyConfig;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.phoneservice.feedbackcommon.network.FeedbackWebConstants;
import com.huawei.ui.main.stories.lightcloud.service.LightCloudCallBack;
import com.huawei.ui.main.stories.lightcloud.service.LightCloudHttpCallBack;
import com.huawei.ui.main.stories.recommendcloud.constants.RecommendConstants;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.Normalizer;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes19.dex */
public class vsk {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f51555b = Pattern.compile("(.*([/\\\\]{1}[\\.\\.]{1,2}|[\\.\\.]{1,2}[/\\\\]{1}|\\.\\.).*|\\.)");
    private static volatile vsk e = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f51556c;
    private ExecutorService d = Executors.newSingleThreadExecutor();

    private vsk(Context context) {
        this.f51556c = context.getApplicationContext();
    }

    public static vsk b(Context context) {
        LogUtil.a("UIDV_FileUtil", "getInstance");
        if (e == null) {
            synchronized (vsk.class) {
                if (e == null) {
                    e = new vsk(context);
                }
            }
        }
        return e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(String str, String str2) {
        try {
            return Normalizer.normalize(new File(str2, str).getCanonicalPath(), Normalizer.Form.NFKC).startsWith(Normalizer.normalize(new File(str2).getCanonicalPath(), Normalizer.Form.NFKC));
        } catch (IOException e2) {
            LogUtil.e("UIDV_FileUtil", e2.getMessage());
            return false;
        }
    }

    public void b(vsd vsdVar, final LightCloudHttpCallBack lightCloudHttpCallBack) {
        LogUtil.a("UIDV_FileUtil", "doDownload");
        if (vsdVar == null) {
            LogUtil.a("UIDV_FileUtil", "lightCloudObject is null");
            return;
        }
        final String strJ = j(vsdVar.c());
        final String strE = vsdVar.e();
        if (strJ == null || "".equals(strJ)) {
            LogUtil.j("UIDV_FileUtil", "fileId is null");
            return;
        }
        if (strE == null || "".equals(strE)) {
            LogUtil.j("UIDV_FileUtil", "downloadUrl is null");
            return;
        }
        String strE2 = e();
        if (TextUtils.isEmpty(strE2)) {
            LogUtil.j("UIDV_FileUtil", "doDownload() canonicalPath is empty.");
            return;
        }
        final String str = strE2 + File.separator + "lightcloud" + File.separator;
        final String str2 = str + strJ;
        if (str2 == null || "".equals(str2)) {
            LogUtil.j("UIDV_FileUtil", "savePath is null");
            return;
        }
        ExecutorService executorService = this.d;
        if (executorService == null || executorService.isShutdown()) {
            this.d = Executors.newSingleThreadExecutor();
        }
        this.d.execute(new Runnable() { // from class: vsk.2
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                if (vsk.this.d(strJ, str)) {
                    vsk.this.a(strE, str2, lightCloudHttpCallBack);
                } else {
                    LogUtil.a("UIDV_FileUtil", "savePath is not sanitze");
                }
            }
        });
    }

    private String e() {
        Context context = this.f51556c;
        if (context == null) {
            LogUtil.j("UIDV_FileUtil", "getFileCanonicalPath mContext is null");
            return "";
        }
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            try {
                return filesDir.getCanonicalPath();
            } catch (IOException unused) {
                LogUtil.e("UIDV_FileUtil", "doDownload() getCanonicalPath meet io exception");
            }
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, LightCloudHttpCallBack lightCloudHttpCallBack) throws Throwable {
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        int responseCode;
        HttpURLConnection httpURLConnection;
        String message;
        LogUtil.a("UIDV_FileUtil", "download");
        String str3 = RecommendConstants.DOWNLOAD_FAIL;
        int i = 0;
        HttpURLConnection httpURLConnection2 = null;
        FileOutputStream fileOutputStream2 = null;
        InputStream inputStream2 = null;
        httpURLConnection2 = null;
        httpURLConnection2 = null;
        httpURLConnection2 = null;
        httpURLConnection2 = null;
        int i2 = -1;
        try {
            try {
                try {
                    URL url = new URL(str);
                    if (ProxyConfig.MATCH_HTTPS.equals(url.getProtocol().toLowerCase(Locale.ENGLISH))) {
                        LogUtil.a("UIDV_FileUtil", ProxyConfig.MATCH_HTTPS);
                        httpURLConnection = (HttpsURLConnection) url.openConnection();
                    } else {
                        httpURLConnection = (HttpURLConnection) url.openConnection();
                    }
                    try {
                        httpURLConnection.setConnectTimeout(10000);
                        httpURLConnection.setReadTimeout(10000);
                        httpURLConnection.setRequestMethod("GET");
                        responseCode = httpURLConnection.getResponseCode();
                        try {
                            LogUtil.a("UIDV_FileUtil", "resCode = ", Integer.valueOf(responseCode));
                            if (responseCode == 200) {
                                inputStream = httpURLConnection.getInputStream();
                                try {
                                    LogUtil.a("UIDV_FileUtil", "saveFile");
                                    if (!b(str2)) {
                                        LogUtil.j("UIDV_FileUtil", "createFileDir false");
                                        vsi.c(httpURLConnection);
                                        vsi.c(inputStream);
                                        vsi.c((FileOutputStream) null);
                                        lightCloudHttpCallBack.onResponce(responseCode, RecommendConstants.DOWNLOAD_FAIL);
                                        return;
                                    }
                                    LogUtil.d("UIDV_FileUtil", "savePath = ", str2);
                                    String str4 = str2 + ".zip";
                                    LogUtil.d("UIDV_FileUtil", "zipPath = ", str4);
                                    int iLastIndexOf = str2.lastIndexOf(47);
                                    String strSubstring = str4.substring(iLastIndexOf + 1, str4.length());
                                    LogUtil.a("UIDV_FileUtil", "fileName = ", strSubstring);
                                    File file = new File(c(str2, iLastIndexOf) + File.separator + "_" + strSubstring);
                                    fileOutputStream = new FileOutputStream(file);
                                    try {
                                        byte[] bArr = new byte[1024];
                                        while (true) {
                                            int i3 = inputStream.read(bArr);
                                            if (i3 == -1) {
                                                break;
                                            } else {
                                                fileOutputStream.write(bArr, 0, i3);
                                            }
                                        }
                                        fileOutputStream.flush();
                                        boolean zRenameTo = file.renameTo(new File(str4));
                                        LogUtil.a("UIDV_FileUtil", "isRenameOk = ", Boolean.valueOf(zRenameTo));
                                        if (zRenameTo) {
                                            str3 = "success";
                                        } else {
                                            if (file.exists()) {
                                                LogUtil.a("UIDV_FileUtil", "deleteRet = ", Boolean.valueOf(file.delete()));
                                            }
                                            str3 = "rename fail";
                                            i = -1;
                                        }
                                        inputStream2 = inputStream;
                                    } catch (MalformedURLException e2) {
                                        e = e2;
                                        httpURLConnection2 = httpURLConnection;
                                        LogUtil.e("UIDV_FileUtil", "MalformedURLException e = ", e.getMessage());
                                        message = e.getMessage();
                                        vsi.c(httpURLConnection2);
                                        vsi.c(inputStream);
                                        vsi.c(fileOutputStream);
                                        lightCloudHttpCallBack.onResponce(-1, message);
                                    } catch (IOException e3) {
                                        e = e3;
                                        httpURLConnection2 = httpURLConnection;
                                        LogUtil.e("UIDV_FileUtil", "IOException e = ", e.getMessage());
                                        message = e.getMessage();
                                        vsi.c(httpURLConnection2);
                                        vsi.c(inputStream);
                                        vsi.c(fileOutputStream);
                                        lightCloudHttpCallBack.onResponce(-1, message);
                                    } catch (Throwable th) {
                                        th = th;
                                        httpURLConnection2 = httpURLConnection;
                                        i2 = responseCode;
                                        vsi.c(httpURLConnection2);
                                        vsi.c(inputStream);
                                        vsi.c(fileOutputStream);
                                        lightCloudHttpCallBack.onResponce(i2, RecommendConstants.DOWNLOAD_FAIL);
                                        throw th;
                                    }
                                } catch (MalformedURLException e4) {
                                    e = e4;
                                    fileOutputStream = null;
                                } catch (IOException e5) {
                                    e = e5;
                                    fileOutputStream = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                    i2 = responseCode;
                                    fileOutputStream = fileOutputStream2;
                                    httpURLConnection2 = httpURLConnection;
                                    vsi.c(httpURLConnection2);
                                    vsi.c(inputStream);
                                    vsi.c(fileOutputStream);
                                    lightCloudHttpCallBack.onResponce(i2, RecommendConstants.DOWNLOAD_FAIL);
                                    throw th;
                                }
                            } else {
                                fileOutputStream = null;
                                i = responseCode;
                            }
                            vsi.c(httpURLConnection);
                            vsi.c(inputStream2);
                            vsi.c(fileOutputStream);
                            lightCloudHttpCallBack.onResponce(i, str3);
                        } catch (MalformedURLException e6) {
                            e = e6;
                            inputStream = null;
                            fileOutputStream = null;
                            httpURLConnection2 = httpURLConnection;
                            LogUtil.e("UIDV_FileUtil", "MalformedURLException e = ", e.getMessage());
                            message = e.getMessage();
                            vsi.c(httpURLConnection2);
                            vsi.c(inputStream);
                            vsi.c(fileOutputStream);
                            lightCloudHttpCallBack.onResponce(-1, message);
                        } catch (IOException e7) {
                            e = e7;
                            inputStream = null;
                            fileOutputStream = null;
                            httpURLConnection2 = httpURLConnection;
                            LogUtil.e("UIDV_FileUtil", "IOException e = ", e.getMessage());
                            message = e.getMessage();
                            vsi.c(httpURLConnection2);
                            vsi.c(inputStream);
                            vsi.c(fileOutputStream);
                            lightCloudHttpCallBack.onResponce(-1, message);
                        } catch (Throwable th3) {
                            th = th3;
                            i2 = responseCode;
                            inputStream = null;
                            fileOutputStream = null;
                            httpURLConnection2 = httpURLConnection;
                            vsi.c(httpURLConnection2);
                            vsi.c(inputStream);
                            vsi.c(fileOutputStream);
                            lightCloudHttpCallBack.onResponce(i2, RecommendConstants.DOWNLOAD_FAIL);
                            throw th;
                        }
                    } catch (MalformedURLException e8) {
                        e = e8;
                        responseCode = -1;
                    } catch (IOException e9) {
                        e = e9;
                        responseCode = -1;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    httpURLConnection = httpURLConnection2;
                    i2 = responseCode;
                    fileOutputStream2 = fileOutputStream;
                }
            } catch (MalformedURLException e10) {
                e = e10;
                inputStream = null;
                fileOutputStream = null;
                responseCode = -1;
            } catch (IOException e11) {
                e = e11;
                inputStream = null;
                fileOutputStream = null;
                responseCode = -1;
            } catch (Throwable th6) {
                th = th6;
                inputStream = null;
                fileOutputStream = null;
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    public void a(final vsd vsdVar, final LightCloudCallBack lightCloudCallBack) {
        LogUtil.a("UIDV_FileUtil", "doUnZip");
        if (vsdVar == null) {
            LogUtil.j("UIDV_FileUtil", "lightCloudObject is null");
            return;
        }
        String strJ = j(vsdVar.c());
        if (strJ == null || "".equals(strJ)) {
            LogUtil.j("UIDV_FileUtil", "fileId is null");
            return;
        }
        String strB = vsdVar.b();
        if (strB == null || "".equals(strB)) {
            LogUtil.j("UIDV_FileUtil", "ver is null");
            return;
        }
        String strE = e();
        if (TextUtils.isEmpty(strE)) {
            LogUtil.j("UIDV_FileUtil", "doUnZip() canonicalPath is empty.");
            return;
        }
        final String str = strE + File.separator + "lightcloud" + File.separator + strJ + ".zip";
        final String str2 = strE + File.separator + "lightcloud" + File.separator + strJ;
        ExecutorService executorService = this.d;
        if (executorService == null || executorService.isShutdown()) {
            this.d = Executors.newSingleThreadExecutor();
        }
        this.d.execute(new Runnable() { // from class: vsk.4
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                vsk.this.e(str, str2, vsdVar, lightCloudCallBack);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str, String str2, vsd vsdVar, LightCloudCallBack lightCloudCallBack) throws Throwable {
        ZipInputStream zipInputStream;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        ZipInputStream zipInputStream2;
        ZipEntry nextEntry;
        int i;
        LogUtil.a("UIDV_FileUtil", "UnZip");
        int i2 = 0;
        FileInputStream fileInputStream = null;
        fileOutputStream = null;
        fileOutputStream = null;
        fileOutputStream = null;
        fileOutputStream = null;
        fileOutputStream = null;
        FileOutputStream fileOutputStream3 = null;
        ZipInputStream zipInputStream3 = null;
        ZipInputStream zipInputStream4 = null;
        ZipInputStream zipInputStream5 = null;
        fileInputStream = null;
        fileInputStream = null;
        fileInputStream = null;
        fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    zipInputStream2 = new ZipInputStream(fileInputStream2);
                    try {
                        LogUtil.a("UIDV_FileUtil", "entryNum init ", 0);
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 + 1024 <= 10485760 && (nextEntry = zipInputStream2.getNextEntry()) != null) {
                            String name = nextEntry.getName();
                            LogUtil.a("UIDV_FileUtil", "szName=", name);
                            if (d(name, str2) && !name.contains(FeedbackWebConstants.INVALID_FILE_NAME_PRE)) {
                                if (nextEntry.isDirectory()) {
                                    LogUtil.a("UIDV_FileUtil", "zipEntry.isDirectory()");
                                    LogUtil.a("UIDV_FileUtil", "mkdir status=", Boolean.valueOf(b(str2 + File.separator + name.substring(0, name.length() - 1))));
                                } else {
                                    LogUtil.a("UIDV_FileUtil", "zipEntry.isFile");
                                    File fileC = c(str2 + File.separator + name);
                                    if (fileC != null) {
                                        LogUtil.a("UIDV_FileUtil", "isCreate = ", Boolean.valueOf(fileC.createNewFile()));
                                        vsi.c(fileOutputStream3);
                                        fileOutputStream = new FileOutputStream(fileC);
                                        try {
                                            byte[] bArr = new byte[1024];
                                            while (true) {
                                                if (i3 + 1024 > 10485760) {
                                                    i = 10485760;
                                                    break;
                                                }
                                                int i5 = zipInputStream2.read(bArr);
                                                if (i5 == -1) {
                                                    i = 10485760;
                                                    break;
                                                } else {
                                                    fileOutputStream.write(bArr, 0, i5);
                                                    fileOutputStream.flush();
                                                    i3 += i5;
                                                }
                                            }
                                            if (i3 > i) {
                                                LogUtil.j("UIDV_FileUtil", "File being unzipped is too big.");
                                                vsi.a(fileInputStream2);
                                                vsi.d(zipInputStream2);
                                                vsi.c(fileOutputStream);
                                                return;
                                            }
                                            fileOutputStream3 = fileOutputStream;
                                        } catch (FileNotFoundException unused) {
                                            fileOutputStream3 = fileOutputStream;
                                            fileOutputStream2 = fileOutputStream3;
                                            fileInputStream = fileInputStream2;
                                            LogUtil.e("UIDV_FileUtil", "unZip FileNotFoundException.");
                                            fileOutputStream = fileOutputStream2;
                                            zipInputStream = zipInputStream2;
                                            vsi.a(fileInputStream);
                                            vsi.d(zipInputStream);
                                            vsi.c(fileOutputStream);
                                            i2 = -3;
                                        } catch (IOException e2) {
                                            e = e2;
                                            zipInputStream3 = zipInputStream2;
                                            zipInputStream = zipInputStream3;
                                            fileInputStream = fileInputStream2;
                                            LogUtil.e("UIDV_FileUtil", "IOException:", e.getMessage());
                                            vsi.a(fileInputStream);
                                            vsi.d(zipInputStream);
                                            vsi.c(fileOutputStream);
                                            i2 = -3;
                                        } catch (IllegalArgumentException e3) {
                                            e = e3;
                                            zipInputStream4 = zipInputStream2;
                                            zipInputStream = zipInputStream4;
                                            fileInputStream = fileInputStream2;
                                            LogUtil.e("UIDV_FileUtil", "IllegalArgumentException:", e.getMessage());
                                            vsi.a(fileInputStream);
                                            vsi.d(zipInputStream);
                                            vsi.c(fileOutputStream);
                                            i2 = -3;
                                        } catch (Throwable th) {
                                            th = th;
                                            zipInputStream5 = zipInputStream2;
                                            zipInputStream = zipInputStream5;
                                            fileInputStream = fileInputStream2;
                                            vsi.a(fileInputStream);
                                            vsi.d(zipInputStream);
                                            vsi.c(fileOutputStream);
                                            throw th;
                                        }
                                    }
                                }
                                i4++;
                                if (i4 > 1024) {
                                    LogUtil.a("UIDV_FileUtil", "entryNum exceed max");
                                    break;
                                }
                                fileOutputStream2 = fileOutputStream3;
                                fileInputStream = fileInputStream2;
                                try {
                                    LogUtil.e("UIDV_FileUtil", "unZip FileNotFoundException.");
                                    fileOutputStream = fileOutputStream2;
                                    zipInputStream = zipInputStream2;
                                    vsi.a(fileInputStream);
                                    vsi.d(zipInputStream);
                                    vsi.c(fileOutputStream);
                                    i2 = -3;
                                    if (new File(str2).isDirectory() || i2 != 0) {
                                        LogUtil.j("UIDV_FileUtil", "unZip and the dir fail");
                                        lightCloudCallBack.onResponce(vsdVar.c(), -3);
                                    }
                                    LogUtil.a("UIDV_FileUtil", "unZip finish");
                                    StorageParams storageParams = new StorageParams();
                                    SharedPreferenceManager.e(this.f51556c, String.valueOf(10000), j(vsdVar.c()) + RecommendConstants.VER_POSTFIX, vsdVar.b(), storageParams);
                                    lightCloudCallBack.onResponce(vsdVar.c(), i2);
                                    return;
                                } catch (Throwable th2) {
                                    th = th2;
                                    fileOutputStream = fileOutputStream2;
                                    zipInputStream = zipInputStream2;
                                    vsi.a(fileInputStream);
                                    vsi.d(zipInputStream);
                                    vsi.c(fileOutputStream);
                                    throw th;
                                }
                            }
                            LogUtil.j("UIDV_FileUtil", "outPath is not sanitze");
                        }
                        vsi.a(fileInputStream2);
                        vsi.d(zipInputStream2);
                        vsi.c(fileOutputStream3);
                    } catch (FileNotFoundException unused2) {
                    } catch (IOException e4) {
                        e = e4;
                        fileOutputStream = fileOutputStream3;
                    } catch (IllegalArgumentException e5) {
                        e = e5;
                        fileOutputStream = fileOutputStream3;
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream = fileOutputStream3;
                    }
                } catch (FileNotFoundException unused3) {
                    zipInputStream2 = null;
                } catch (IOException e6) {
                    e = e6;
                    fileOutputStream = null;
                } catch (IllegalArgumentException e7) {
                    e = e7;
                    fileOutputStream = null;
                } catch (Throwable th4) {
                    th = th4;
                    fileOutputStream = null;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (FileNotFoundException unused4) {
            fileOutputStream2 = null;
            zipInputStream2 = null;
        } catch (IOException e8) {
            e = e8;
            zipInputStream = null;
            fileOutputStream = null;
        } catch (IllegalArgumentException e9) {
            e = e9;
            zipInputStream = null;
            fileOutputStream = null;
        } catch (Throwable th6) {
            th = th6;
            zipInputStream = null;
            fileOutputStream = null;
        }
        if (new File(str2).isDirectory()) {
        }
        LogUtil.j("UIDV_FileUtil", "unZip and the dir fail");
        lightCloudCallBack.onResponce(vsdVar.c(), -3);
    }

    private File c(String str) {
        if (!d(str)) {
            return null;
        }
        File file = new File(a(str));
        File parentFile = file.getParentFile();
        if (!parentFile.exists()) {
            LogUtil.a("UIDV_FileUtil", "parentFile mkdir status=", Boolean.valueOf(parentFile.mkdirs()));
        }
        return file;
    }

    private static String c(String str, int i) {
        try {
            return str.substring(0, i);
        } catch (StringIndexOutOfBoundsException e2) {
            LogUtil.e("UIDV_FileUtil", "StringIndexOutOfBoundsException:", e2.getMessage());
            return null;
        }
    }

    private static boolean b(String str) {
        if (str == null) {
            return false;
        }
        File file = new File(str);
        return file.exists() || file.mkdirs();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0022 A[PHI: r3
      0x0022: PHI (r3v7 java.lang.String) = 
      (r3v0 java.lang.String)
      (r3v1 java.lang.String)
      (r3v2 java.lang.String)
      (r3v3 java.lang.String)
      (r3v4 java.lang.String)
      (r3v5 java.lang.String)
      (r3v6 java.lang.String)
     binds: [B:8:0x0020, B:11:0x0030, B:14:0x003f, B:17:0x004e, B:20:0x005d, B:23:0x006c, B:26:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    private String j(String str) {
        String str2 = "";
        if (str == null || "".equals(str)) {
            LogUtil.a("UIDV_FileUtil", "fileId null");
            return "";
        }
        String strNormalize = Normalizer.normalize(str, Normalizer.Form.NFKC);
        String str3 = "airule";
        if (strNormalize.startsWith(Normalizer.normalize("airule", Normalizer.Form.NFKC))) {
            str2 = str3;
        } else {
            str3 = "servicefwo";
            if (strNormalize.startsWith(Normalizer.normalize("servicefwo", Normalizer.Form.NFKC))) {
                str2 = str3;
            } else {
                str3 = "servicefw";
                if (strNormalize.startsWith(Normalizer.normalize("servicefw", Normalizer.Form.NFKC))) {
                    str2 = str3;
                } else {
                    str3 = "healthconfig";
                    if (strNormalize.startsWith(Normalizer.normalize("healthconfig", Normalizer.Form.NFKC))) {
                        str2 = str3;
                    } else {
                        str3 = "kit";
                        if (strNormalize.startsWith(Normalizer.normalize("kit", Normalizer.Form.NFKC))) {
                            str2 = str3;
                        } else {
                            str3 = "oversea_app_update";
                            if (strNormalize.startsWith(Normalizer.normalize("oversea_app_update", Normalizer.Form.NFKC))) {
                                str2 = str3;
                            } else {
                                str3 = "shortcuts";
                                if (strNormalize.startsWith(Normalizer.normalize("shortcuts", Normalizer.Form.NFKC))) {
                                    str2 = str3;
                                } else if ("ecg_blocklist".equals(strNormalize)) {
                                    str2 = "ecgblock";
                                }
                            }
                        }
                    }
                }
            }
        }
        LogUtil.a("UIDV_FileUtil", "folder is ", str2);
        return str2;
    }

    public static boolean d(String str) {
        if (str == null) {
            return false;
        }
        return !f51555b.matcher(str).matches();
    }

    private static String e(String str) {
        if (str == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer(16);
        for (int i = 0; i < str.length(); i++) {
            for (int i2 = 0; i2 < 94; i2++) {
                if (str.charAt(i) == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890-=[];\\',./ ~!@#$%^&*()_+\"{}|:<>?".charAt(i2)) {
                    stringBuffer.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890-=[];\\',./ ~!@#$%^&*()_+\"{}|:<>?".charAt(i2));
                    break;
                }
            }
        }
        return stringBuffer.toString();
    }

    private static String a(String str) {
        if (d(str)) {
            return e(str);
        }
        throw new IllegalArgumentException("Invalid file path");
    }
}
