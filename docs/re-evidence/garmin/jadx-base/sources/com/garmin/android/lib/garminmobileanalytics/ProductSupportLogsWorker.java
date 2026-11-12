package com.garmin.android.lib.garminmobileanalytics;

import a23.f;
import a23.g;
import android.content.Context;
import android.os.SystemClock;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.d;
import c53.c0;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.FirebasePerformance;
import com.google.gson.Gson;
import e23.l;
import j20.x;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import lc.u0;
import okhttp3.internal.Util;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.e;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;
import p13.u;
import tn.k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/lib/garminmobileanalytics/ProductSupportLogsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "analytics-omt_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ProductSupportLogsWorker extends Worker {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f49919e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Set<String> f49920f = u.m0(new String[]{".zip", ".tar", ".gz", ".tgz"});

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f49921a;

        static {
            int[] iArr = new int[a.EnumC0992a.values().length];
            try {
                iArr[a.EnumC0992a.DIRECTORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.EnumC0992a.COMPRESSED_FILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f49921a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/io/File;", "invoke", "(Ljava/io/File;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends w implements l<File, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ File f49922a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(File file) {
            super(1);
            this.f49922a = file;
        }

        @Override // e23.l
        public final Boolean invoke(File file) {
            File file2 = file;
            file2.getClass();
            return Boolean.valueOf(file2.isFile() && !s.g(file2.getName(), this.f49922a.getName()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductSupportLogsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    public static void d(File file, Logger logger) {
        try {
            if (file.exists()) {
                if (g.d(file)) {
                    logger.debug("cleanUp: success");
                } else {
                    logger.warn("cleanUp: 'deleteRecursively' returned false, could have been a partial delete");
                }
            }
        } catch (Exception e4) {
            logger.error("cleanUp", (Throwable) e4);
        }
    }

    public static void e(File file, File file2, Logger logger) throws Throwable {
        Throwable th3;
        FileChannel channel;
        String name = file.getName();
        File file3 = new File(file2, name);
        file3.createNewFile();
        FileChannel fileChannel = null;
        try {
            FileChannel channel2 = new FileInputStream(file).getChannel();
            try {
                channel = new FileOutputStream(file3).getChannel();
                try {
                    long size = channel2.size();
                    channel.transferFrom(channel2, 0L, size);
                    logger.debug("copyFileNIO: " + name + " -> " + size + " bytes");
                    Util.closeQuietly(channel2);
                    Util.closeQuietly(channel);
                } catch (Throwable th4) {
                    th3 = th4;
                    fileChannel = channel2;
                    if (fileChannel != null) {
                        Util.closeQuietly(fileChannel);
                    }
                    if (channel == null) {
                        throw th3;
                    }
                    Util.closeQuietly(channel);
                    throw th3;
                }
            } catch (Throwable th5) {
                th3 = th5;
                channel = null;
            }
        } catch (Throwable th6) {
            th3 = th6;
            channel = null;
        }
    }

    public static d.a g(androidx.work.c cVar, Logger logger, File file) throws Throwable {
        String strE;
        d.a c0165a;
        URL url = new URL(cVar.e("key_omt_api_url"));
        Object objFromJson = new Gson().fromJson(cVar.e("key_analytics_client_info"), (Class<Object>) kc2.a.class);
        objFromJson.getClass();
        kc2.a aVar = (kc2.a) objFromJson;
        String strE2 = e.e(SystemClock.elapsedRealtime(), "Boundary-");
        logger.debug("executeUpload: {} {}", FirebasePerformance.HttpMethod.POST, url);
        HttpURLConnection httpURLConnection = null;
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            uRLConnectionOpenConnection.getClass();
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) uRLConnectionOpenConnection;
            try {
                httpURLConnection2.setConnectTimeout(30000);
                httpURLConnection2.setReadTimeout(30000);
                httpURLConnection2.setDoInput(true);
                httpURLConnection2.setDoOutput(true);
                httpURLConnection2.setUseCaches(false);
                httpURLConnection2.setRequestMethod(FirebasePerformance.HttpMethod.POST);
                nd2.a aVar2 = nd2.a.f125408a;
                httpURLConnection2.setRequestProperty("Garmin-Client-Name", aVar.f());
                httpURLConnection2.setRequestProperty("Garmin-Client-Version", aVar.getApplicationInfo().getVersion());
                httpURLConnection2.setRequestProperty("Garmin-Client-Platform", aVar.getOperatingSystemInfo().getName());
                httpURLConnection2.setRequestProperty("Garmin-Client-Platform-Version", aVar.getOperatingSystemInfo().getVersion());
                httpURLConnection2.setRequestProperty(HttpHeaders.CONNECTION, "keep-alive");
                httpURLConnection2.setRequestProperty(HttpHeaders.ACCEPT, "application/json");
                httpURLConnection2.setRequestProperty(HttpHeaders.ACCEPT_LANGUAGE, "en_US");
                httpURLConnection2.setRequestProperty("Garmin-Client-Guid", aVar.getAndroidDeviceGuid());
                httpURLConnection2.setRequestProperty(HttpHeaders.CONTENT_TYPE, "multipart/form-data; boundary=".concat(strE2));
                DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection2.getOutputStream());
                try {
                    dataOutputStream.writeBytes("--" + strE2 + IOUtils.LINE_SEPARATOR_WINDOWS);
                    dataOutputStream.writeBytes("Content-Disposition: form-data; name=\"file\"; filename=\"" + file.getName() + "\"\r\n");
                    dataOutputStream.writeBytes("Content-Type: " + URLConnection.guessContentTypeFromName(file.getName()) + IOUtils.LINE_SEPARATOR_WINDOWS);
                    dataOutputStream.writeBytes(IOUtils.LINE_SEPARATOR_WINDOWS);
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        byte[] bArr = new byte[ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES];
                        while (true) {
                            int i14 = fileInputStream.read(bArr);
                            if (i14 == -1) {
                                break;
                            }
                            dataOutputStream.write(bArr, 0, i14);
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                jg.b.l(dataOutputStream, th);
                                throw th3;
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                        fileInputStream.close();
                        dataOutputStream.writeBytes(IOUtils.LINE_SEPARATOR_WINDOWS + "--" + strE2 + "--" + IOUtils.LINE_SEPARATOR_WINDOWS);
                        dataOutputStream.flush();
                        dataOutputStream.close();
                        if (httpURLConnection2.getResponseCode() == 204) {
                            logger.debug("executeUpload: " + httpURLConnection2.getResponseCode() + ", file uploaded successfully");
                            c0165a = new d.a.c();
                        } else {
                            int responseCode = httpURLConnection2.getResponseCode();
                            InputStream errorStream = httpURLConnection2.getErrorStream();
                            BufferedReader bufferedReader = errorStream != null ? new BufferedReader(new InputStreamReader(errorStream, d53.c.f57666b), 8192) : null;
                            if (bufferedReader != null) {
                                try {
                                    strE = lg.d.E(bufferedReader);
                                } catch (Throwable th4) {
                                    try {
                                        throw th4;
                                    } catch (Throwable th5) {
                                        jg.b.l(bufferedReader, th4);
                                        throw th5;
                                    }
                                }
                            } else {
                                strE = null;
                            }
                            jg.b.l(bufferedReader, null);
                            if (strE == null) {
                                strE = "";
                            }
                            logger.warn("executeUpload: " + responseCode + "\n" + strE);
                            c0165a = new d.a.C0165a();
                        }
                        httpURLConnection2.disconnect();
                        return c0165a;
                    } catch (Throwable th6) {
                        try {
                            throw th6;
                        } catch (Throwable th7) {
                            jg.b.l(fileInputStream, th6);
                            throw th7;
                        }
                    }
                } catch (Throwable th8) {
                    throw th8;
                }
            } catch (Throwable th9) {
                th = th9;
                httpURLConnection = httpURLConnection2;
                if (httpURLConnection != null) {
                    try {
                        httpURLConnection.disconnect();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        } catch (Throwable th10) {
            th = th10;
        }
    }

    public static File h(File file, Logger logger) throws IOException {
        File file2 = new File(file, k.g(file.getName(), ".zip"));
        ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file2)));
        try {
            c53.g.a aVar = new c53.g.a(c0.h(f.c(file, a23.c.TOP_DOWN), new c(file2)));
            while (aVar.hasNext()) {
                File file3 = (File) aVar.next();
                String name = file3.getName();
                name.getClass();
                long length = file3.length();
                zipOutputStream.putNextEntry(new ZipEntry(name));
                dh.b.p(new FileInputStream(file3), zipOutputStream, 8192);
                logger.debug("zip: added " + ((Object) name) + " (" + length + " bytes)");
            }
            Unit unit = Unit.INSTANCE;
            zipOutputStream.close();
            return file2;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                jg.b.l(zipOutputStream, th3);
                throw th4;
            }
        }
    }

    public static byte[] i(File file, Logger logger) throws IOException {
        long length = file.length();
        String name = file.getName();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ZipOutputStream zipOutputStream = new ZipOutputStream(byteArrayOutputStream);
        try {
            zipOutputStream.putNextEntry(new ZipEntry(name));
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                dh.b.p(fileInputStream, zipOutputStream, 8192);
                fileInputStream.close();
                zipOutputStream.closeEntry();
                Unit unit = Unit.INSTANCE;
                zipOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                int length2 = byteArray.length;
                StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(length, "zipFileToMemory: ", name, " -> uncompressed[");
                sbJ.append("] bytes, compressed[");
                sbJ.append(length2);
                sbJ.append("] bytes");
                logger.debug(sbJ.toString());
                return byteArray;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    jg.b.l(fileInputStream, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                jg.b.l(zipOutputStream, th5);
                throw th6;
            }
        }
    }

    @Override // androidx.work.Worker
    public final d.a c() throws Throwable {
        d.a c0165a;
        d.a cVar;
        WorkerParameters workerParameters = this.f11470b;
        androidx.work.c cVar2 = workerParameters.f11427b;
        androidx.work.c cVar3 = workerParameters.f11427b;
        String strE = cVar2.e("mode_enum_name");
        strE.getClass();
        int i14 = b.f49921a[a.EnumC0992a.valueOf(strE).ordinal()];
        a aVar = f49919e;
        if (i14 != 1) {
            if (i14 != 2) {
                u0.r();
                return null;
            }
            aVar.getClass();
            Logger logger = LoggerFactory.getLogger("OMT#ProdSuppLogsWorker");
            logger.getClass();
            try {
                String strE2 = cVar3.e("key_compressed_file_absolute_path");
                strE2.getClass();
                File file = new File(strE2);
                if (file.exists()) {
                    logger.debug("doWorkForDirectoryMode: " + file.getName() + " (" + file.length() + " bytes) ready for upload");
                    cVar3.getClass();
                    cVar = g(cVar3, logger, file);
                } else {
                    logger.warn("doWorkForCompressedFileMode: [" + file.getAbsolutePath() + "] does not exist");
                    cVar = new d.a.c();
                }
                return cVar;
            } catch (Exception e4) {
                logger.error("doWorkForCompressedFileMode", (Throwable) e4);
                return new d.a.C0165a();
            }
        }
        aVar.getClass();
        Logger logger2 = LoggerFactory.getLogger("OMT#ProdSuppLogsWorker");
        logger2.getClass();
        File fileF = null;
        try {
            try {
                String strE3 = cVar3.e("key_directory_absolute_path");
                strE3.getClass();
                File file2 = new File(strE3);
                File[] fileArrListFiles = file2.listFiles();
                if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                    String strE4 = cVar3.e("key_sort_priority_enum_name");
                    strE4.getClass();
                    fileF = f(file2, jc2.d.valueOf(strE4), logger2);
                    File[] fileArrListFiles2 = fileF.listFiles();
                    if (fileArrListFiles2 == null || fileArrListFiles2.length == 0) {
                        logger2.warn("doWorkForDirectoryMode: directory [" + fileF.getAbsolutePath() + "] is empty");
                        c0165a = new d.a.c();
                    } else {
                        File fileH = h(fileF, logger2);
                        long length = fileH.length();
                        if (length > 0) {
                            logger2.debug("doWorkForDirectoryMode: " + fileH.getName() + " (" + length + " bytes) ready for upload");
                            c0165a = g(cVar3, logger2, fileH);
                        } else {
                            logger2.warn("doWorkForDirectoryMode: [" + fileH.getAbsolutePath() + "] is empty");
                            c0165a = new d.a.c();
                        }
                    }
                    d(fileF, logger2);
                    return c0165a;
                }
                logger2.warn("doWorkForDirectoryMode: directory [" + file2.getAbsolutePath() + "] is empty");
                return new d.a.c();
            } catch (Exception e14) {
                logger2.error("doWorkForDirectoryMode", (Throwable) e14);
                c0165a = new d.a.C0165a();
                if (0 == 0) {
                    return c0165a;
                }
            }
        } catch (Throwable th3) {
            if (0 != 0) {
                d(null, logger2);
            }
            throw th3;
        }
    }

    public final File f(File file, jc2.d dVar, Logger logger) throws Exception {
        File dir = null;
        try {
            dir = this.f11469a.getDir("PROD_SUPPORT_LOGS_" + SystemClock.elapsedRealtime(), 0);
            File[] fileArrListFiles = file.listFiles();
            fileArrListFiles.getClass();
            ArrayList arrayList = new ArrayList();
            for (File file2 : fileArrListFiles) {
                file2.getClass();
                arrayList.add(new jc2.g(file2, dVar));
            }
            jc2.g[] gVarArr = (jc2.g[]) arrayList.toArray(new jc2.g[0]);
            Arrays.sort(gVarArr);
            for (jc2.g gVar : gVarArr) {
                File file3 = gVar.f98183b;
                f49919e.getClass();
                if (a.a(file3)) {
                    if (dir.length() + file3.length() < 250000000) {
                        e(file3, dir, logger);
                    } else {
                        String name = file3.getName();
                        name.getClass();
                        logger.warn("copyFiles: " + name + " not copied, would exceed MAX_UPLOAD_BYTES 250000000");
                    }
                } else if (file3.length() > 0) {
                    byte[] bArrI = i(file3, logger);
                    if (dir.length() + ((long) bArrI.length) < 250000000) {
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(dir, file3.getName() + ".zip")));
                        try {
                            bufferedOutputStream.write(bArrI);
                            Unit unit = Unit.INSTANCE;
                            bufferedOutputStream.close();
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                jg.b.l(bufferedOutputStream, th3);
                                throw th4;
                            }
                        }
                    } else {
                        String name2 = file3.getName();
                        name2.getClass();
                        logger.warn("copyFiles: " + name2 + " not copied, would exceed MAX_UPLOAD_BYTES 250000000");
                    }
                } else {
                    e(file3, dir, logger);
                }
            }
            return dir;
        } catch (Exception e4) {
            if (dir != null) {
                g.d(dir);
            }
            throw e4;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/garmin/android/lib/garminmobileanalytics/ProductSupportLogsWorker$a;", "", "<init>", "()V", "", "KEY_ANALYTICS_CLIENT_INFO", "Ljava/lang/String;", "KEY_COMPRESSED_FILE_ABSOLUTE_PATH", "KEY_DIRECTORY_ABSOLUTE_PATH", "KEY_MODE_ENUM_NAME", "KEY_OMT_API_URL", "KEY_SORT_PRIORITY_ENUM_NAME", "LOG_TAG", "", "MAX_UPLOAD_BYTES", "I", "a", "analytics-omt_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: com.garmin.android.lib.garminmobileanalytics.ProductSupportLogsWorker$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/lib/garminmobileanalytics/ProductSupportLogsWorker$a$a;", "", "", "uniqueWorkName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getUniqueWorkName", "()Ljava/lang/String;", "DIRECTORY", "COMPRESSED_FILE", "analytics-omt_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public enum EnumC0992a {
            DIRECTORY("productSupportLogsModeDirectory"),
            COMPRESSED_FILE("productSupportLogsModeCompressedFile");

            private static final /* synthetic */ w13.a $ENTRIES = w13.b.g(values());
            private final String uniqueWorkName;

            EnumC0992a(String str) {
                this.uniqueWorkName = str;
            }

            public static w13.a<EnumC0992a> getEntries() {
                return $ENTRIES;
            }

            public final String getUniqueWorkName() {
                return this.uniqueWorkName;
            }
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        public static boolean a(File file) {
            file.getClass();
            String name = file.getName();
            name.getClass();
            Locale locale = Locale.US;
            String strF = x.f(locale, name, locale);
            ProductSupportLogsWorker.f49919e.getClass();
            Set<String> set = ProductSupportLogsWorker.f49920f;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    if (d53.u.p(strF, (String) it.next(), false)) {
                        return true;
                    }
                }
            }
            return false;
        }

        private a() {
        }
    }
}
