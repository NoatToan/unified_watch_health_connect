package com.liulishuo.filedownloader.util;

import android.app.ActivityManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.Process;
import android.os.StatFs;
import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import com.liulishuo.filedownloader.BuildConfig;
import com.liulishuo.filedownloader.connection.FileDownloadConnection;
import com.liulishuo.filedownloader.download.CustomComponentHolder;
import com.liulishuo.filedownloader.exception.FileDownloadGiveUpRetryException;
import com.liulishuo.filedownloader.exception.FileDownloadSecurityException;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import com.liulishuo.filedownloader.stream.FileDownloadOutputStream;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.cybergarage.http.HTTP;

/* JADX INFO: loaded from: classes18.dex */
public class FileDownloadUtils {
    private static int a = 65536;
    private static long b = 2000;
    private static String c = null;
    private static Boolean d = null;
    private static final String e = "filedownloader";
    private static final String f = ".old_file_converted";
    private static Boolean g = null;
    private static final Pattern h = Pattern.compile("attachment;\\s*filename\\*\\s*=\\s*\"*([^\"]*)'\\S*'([^\"]*)\"*");
    private static final Pattern i = Pattern.compile("attachment;\\s*filename\\s*=\\s*\"*([^\"\\n]*)\"*");
    private static final String j = "FileDownloader";

    private static String a(FileDownloadConnection fileDownloadConnection) {
        return fileDownloadConnection.getResponseHeaderField("Content-Range");
    }

    private static boolean b(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        ActivityManager activityManager = (ActivityManager) context.getApplicationContext().getSystemService("activity");
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null || (powerManager = (PowerManager) context.getSystemService("power")) == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT > 19) {
            if (!powerManager.isInteractive()) {
                return false;
            }
        } else if (!powerManager.isScreenOn()) {
            return false;
        }
        String packageName = context.getApplicationContext().getPackageName();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.processName.equals(packageName) && runningAppProcessInfo.importance == 100) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkPermission(String str) {
        return FileDownloadHelper.getAppContext().checkCallingOrSelfPermission(str) == 0;
    }

    public static long convertContentLengthString(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static String[] convertHeaderString(String str) {
        String[] strArrSplit = str.split("\n");
        String[] strArr = new String[strArrSplit.length * 2];
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            String[] strArrSplit2 = strArrSplit[i2].split(": ");
            int i3 = i2 * 2;
            strArr[i3] = strArrSplit2[0];
            strArr[i3 + 1] = strArrSplit2[1];
        }
        return strArr;
    }

    public static FileDownloadOutputStream createOutputStream(String str) throws IOException {
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("found invalid internal destination path, empty");
        }
        if (!isFilenameValid(str)) {
            throw new RuntimeException(formatString("found invalid internal destination filename %s", str));
        }
        File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            throw new RuntimeException(formatString("found invalid internal destination path[%s], & path is directory[%B]", str, Boolean.valueOf(file.isDirectory())));
        }
        if (file.exists() || file.createNewFile()) {
            return CustomComponentHolder.getImpl().createOutputStream(file);
        }
        throw new IOException(formatString("create new file error  %s", file.getAbsolutePath()));
    }

    public static String defaultUserAgent() {
        return formatString("FileDownloader/%s", BuildConfig.VERSION_NAME);
    }

    public static void deleteTargetFile(String str) {
        if (str != null) {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
        }
    }

    public static void deleteTaskFiles(String str, String str2) {
        deleteTempFile(str2);
        deleteTargetFile(str);
    }

    public static void deleteTempFile(String str) {
        if (str != null) {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
        }
    }

    public static long findContentLength(int i2, FileDownloadConnection fileDownloadConnection) {
        long jConvertContentLengthString = convertContentLengthString(fileDownloadConnection.getResponseHeaderField("Content-Length"));
        String responseHeaderField = fileDownloadConnection.getResponseHeaderField("Transfer-Encoding");
        if (jConvertContentLengthString >= 0) {
            return jConvertContentLengthString;
        }
        if (!(responseHeaderField != null && responseHeaderField.equals("chunked"))) {
            if (!FileDownloadProperties.getImpl().httpLenient) {
                throw new FileDownloadGiveUpRetryException("can't know the size of the download file, and its Transfer-Encoding is not Chunked either.\nyou can ignore such exception by add http.lenient=true to the filedownloader.properties");
            }
            if (FileDownloadLog.NEED_LOG) {
                FileDownloadLog.d(FileDownloadUtils.class, "%d response header is not legal but HTTP lenient is true, so handle as the case of transfer encoding chunk", Integer.valueOf(i2));
            }
        }
        return -1L;
    }

    public static long findContentLengthFromContentRange(FileDownloadConnection fileDownloadConnection) {
        long contentLengthFromContentRange = parseContentLengthFromContentRange(a(fileDownloadConnection));
        if (contentLengthFromContentRange < 0) {
            return -1L;
        }
        return contentLengthFromContentRange;
    }

    public static String findEtag(int i2, FileDownloadConnection fileDownloadConnection) {
        if (fileDownloadConnection == null) {
            throw new RuntimeException("connection is null when findEtag");
        }
        String responseHeaderField = fileDownloadConnection.getResponseHeaderField("Etag");
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.d(FileDownloadUtils.class, "etag find %s for task(%d)", responseHeaderField, Integer.valueOf(i2));
        }
        return responseHeaderField;
    }

    public static String findFilename(FileDownloadConnection fileDownloadConnection, String str) throws FileDownloadSecurityException {
        String contentDisposition = parseContentDisposition(fileDownloadConnection.getResponseHeaderField("Content-Disposition"));
        if (TextUtils.isEmpty(contentDisposition)) {
            return generateFileName(str);
        }
        if (contentDisposition.contains("../")) {
            throw new FileDownloadSecurityException(formatString("The filename [%s] from the response is not allowable, because it contains '../', which can raise the directory traversal vulnerability", contentDisposition));
        }
        return contentDisposition;
    }

    public static long findInstanceLengthForTrial(FileDownloadConnection fileDownloadConnection) {
        long jFindInstanceLengthFromContentRange = findInstanceLengthFromContentRange(fileDownloadConnection);
        if (jFindInstanceLengthFromContentRange < 0) {
            FileDownloadLog.w(FileDownloadUtils.class, "don't get instance length fromContent-Range header", new Object[0]);
            jFindInstanceLengthFromContentRange = -1;
        }
        if (jFindInstanceLengthFromContentRange == 0 && FileDownloadProperties.getImpl().trialConnectionHeadMethod) {
            return -1L;
        }
        return jFindInstanceLengthFromContentRange;
    }

    public static long findInstanceLengthFromContentRange(FileDownloadConnection fileDownloadConnection) {
        return parseContentRangeFoInstanceLength(a(fileDownloadConnection));
    }

    public static String formatString(String str, Object... objArr) {
        return String.format(Locale.ENGLISH, str, objArr);
    }

    public static String generateFileName(String str) {
        return md5(str);
    }

    public static String generateFilePath(String str, String str2) {
        if (str2 == null) {
            throw new IllegalStateException("can't generate real path, the file name is null");
        }
        if (str != null) {
            return formatString("%s%s%s", str, File.separator, str2);
        }
        throw new IllegalStateException("can't generate real path, the directory is null");
    }

    public static int generateId(String str, String str2) {
        return CustomComponentHolder.getImpl().getIdGeneratorInstance().generateId(str, str2, false);
    }

    public static File getConvertedMarkedFile(Context context) {
        return new File(context.getFilesDir().getAbsolutePath() + File.separator + "filedownloader", f);
    }

    public static String getDefaultSaveFilePath(String str) {
        return generateFilePath(getDefaultSaveRootPath(), generateFileName(str));
    }

    public static String getDefaultSaveRootPath() {
        if (TextUtils.isEmpty(c)) {
            return FileDownloadHelper.getAppContext().getExternalCacheDir() == null ? Environment.getDownloadCacheDirectory().getAbsolutePath() : FileDownloadHelper.getAppContext().getExternalCacheDir().getAbsolutePath();
        }
        return c;
    }

    public static long getFreeSpaceBytes(String str) {
        StatFs statFs = new StatFs(str);
        return Build.VERSION.SDK_INT >= 18 ? statFs.getAvailableBytes() : ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
    }

    public static int getMinProgressStep() {
        return a;
    }

    public static long getMinProgressTime() {
        return b;
    }

    public static String getParent(String str) {
        int length = str.length();
        int i2 = (File.separatorChar == '\\' && length > 2 && str.charAt(1) == ':') ? 2 : 0;
        int iLastIndexOf = str.lastIndexOf(File.separatorChar);
        int i3 = (iLastIndexOf != -1 || i2 <= 0) ? iLastIndexOf : 2;
        if (i3 == -1) {
            return null;
        }
        char cCharAt = str.charAt(length - 1);
        char c2 = File.separatorChar;
        if (cCharAt == c2) {
            return null;
        }
        return (str.indexOf(c2) == i3 && str.charAt(i2) == File.separatorChar) ? str.substring(0, i3 + 1) : str.substring(0, i3);
    }

    public static String getStack() {
        return getStack(true);
    }

    public static String getTargetFilePath(String str, boolean z, String str2) {
        if (str == null) {
            return null;
        }
        if (!z) {
            return str;
        }
        if (str2 == null) {
            return null;
        }
        return generateFilePath(str, str2);
    }

    public static String getTempPath(String str) {
        return formatString("%s.temp", str);
    }

    public static String getThreadPoolName(String str) {
        return "FileDownloader-" + str;
    }

    public static boolean isAcceptRange(int i2, FileDownloadConnection fileDownloadConnection) {
        if (i2 == 206 || i2 == 1) {
            return true;
        }
        return HTTP.CONTENT_RANGE_BYTES.equals(fileDownloadConnection.getResponseHeaderField(HttpHeaders.ACCEPT_RANGES));
    }

    public static boolean isBreakpointAvailable(int i2, FileDownloadModel fileDownloadModel) {
        return isBreakpointAvailable(i2, fileDownloadModel, null);
    }

    public static boolean isDownloaderProcess(Context context) {
        Boolean bool = d;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean zEndsWith = false;
        if (!FileDownloadProperties.getImpl().processNonSeparate) {
            int iMyPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null) {
                FileDownloadLog.w(FileDownloadUtils.class, "fail to get the activity manager!", new Object[0]);
                return false;
            }
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null || runningAppProcesses.isEmpty()) {
                FileDownloadLog.w(FileDownloadUtils.class, "The running app process info list from ActivityManager is null or empty, maybe current App is not running.", new Object[0]);
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == iMyPid) {
                    zEndsWith = runningAppProcessInfo.processName.endsWith(":filedownloader");
                    break;
                }
            }
        } else {
            zEndsWith = true;
        }
        Boolean boolValueOf = Boolean.valueOf(zEndsWith);
        d = boolValueOf;
        return boolValueOf.booleanValue();
    }

    public static boolean isFilenameConverted(Context context) {
        if (g == null) {
            g = Boolean.valueOf(getConvertedMarkedFile(context).exists());
        }
        return g.booleanValue();
    }

    public static boolean isFilenameValid(String str) {
        return true;
    }

    public static boolean isNeedSync(long j2, long j3) {
        return j2 > ((long) getMinProgressStep()) && j3 > getMinProgressTime();
    }

    public static boolean isNetworkNotOnWifiType() {
        ConnectivityManager connectivityManager = (ConnectivityManager) FileDownloadHelper.getAppContext().getSystemService("connectivity");
        if (connectivityManager == null) {
            FileDownloadLog.w(FileDownloadUtils.class, "failed to get connectivity manager!", new Object[0]);
            return true;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo == null || activeNetworkInfo.getType() != 1;
    }

    public static void markConverted(Context context) {
        File convertedMarkedFile = getConvertedMarkedFile(context);
        try {
            convertedMarkedFile.getParentFile().mkdirs();
            convertedMarkedFile.createNewFile();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public static String md5(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
            for (byte b2 : bArrDigest) {
                int i2 = b2 & 255;
                if (i2 < 16) {
                    sb.append("0");
                }
                sb.append(Integer.toHexString(i2));
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("Huh, UTF-8 should be supported?", e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new RuntimeException("Huh, MD5 should be supported?", e3);
        }
    }

    public static boolean needMakeServiceForeground(Context context) {
        return Build.VERSION.SDK_INT >= 26 && !b(context);
    }

    public static String parseContentDisposition(String str) {
        if (str == null) {
            return null;
        }
        try {
            Matcher matcher = h.matcher(str);
            if (matcher.find()) {
                return URLDecoder.decode(matcher.group(2), matcher.group(1));
            }
            Matcher matcher2 = i.matcher(str);
            if (matcher2.find()) {
                return matcher2.group(1);
            }
            return null;
        } catch (UnsupportedEncodingException | IllegalStateException unused) {
        }
    }

    public static long parseContentLengthFromContentRange(String str) {
        if (str != null && str.length() != 0) {
            try {
                Matcher matcher = Pattern.compile("bytes (\\d+)-(\\d+)/\\d+").matcher(str);
                if (matcher.find()) {
                    return (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                }
            } catch (Exception e2) {
                FileDownloadLog.e(FileDownloadUtils.class, e2, "parse content length from content range error", new Object[0]);
            }
        }
        return -1L;
    }

    public static long parseContentRangeFoInstanceLength(String str) {
        if (str == null) {
            return -1L;
        }
        String[] strArrSplit = str.split(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
        if (strArrSplit.length >= 2) {
            try {
                return Long.parseLong(strArrSplit[1]);
            } catch (NumberFormatException unused) {
                FileDownloadLog.w(FileDownloadUtils.class, "parse instance length failed with %s", str);
            }
        }
        return -1L;
    }

    public static void setDefaultSaveRootPath(String str) {
        c = str;
    }

    public static void setMinProgressStep(int i2) throws IllegalAccessException {
        if (!isDownloaderProcess(FileDownloadHelper.getAppContext())) {
            throw new IllegalAccessException("This value is used in the :filedownloader process, so set this value in your process is without effect. You can add 'process.non-separate=true' in 'filedownloader.properties' to share the main process to FileDownloadService. Or you can configure this value in 'filedownloader.properties' by 'download.min-progress-step'.");
        }
        a = i2;
    }

    public static void setMinProgressTime(long j2) throws IllegalAccessException {
        if (!isDownloaderProcess(FileDownloadHelper.getAppContext())) {
            throw new IllegalAccessException("This value is used in the :filedownloader process, so set this value in your process is without effect. You can add 'process.non-separate=true' in 'filedownloader.properties' to share the main process to FileDownloadService. Or you can configure this value in 'filedownloader.properties' by 'download.min-progress-time'.");
        }
        b = j2;
    }

    public static String getStack(boolean z) {
        return getStack(new Throwable().getStackTrace(), z);
    }

    public static boolean isBreakpointAvailable(int i2, FileDownloadModel fileDownloadModel, Boolean bool) {
        if (fileDownloadModel == null) {
            if (FileDownloadLog.NEED_LOG) {
                FileDownloadLog.d(FileDownloadUtils.class, "can't continue %d model == null", Integer.valueOf(i2));
            }
            return false;
        }
        if (fileDownloadModel.getTempFilePath() != null) {
            return isBreakpointAvailable(i2, fileDownloadModel, fileDownloadModel.getTempFilePath(), bool);
        }
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.d(FileDownloadUtils.class, "can't continue %d temp path == null", Integer.valueOf(i2));
        }
        return false;
    }

    public static int generateId(String str, String str2, boolean z) {
        return CustomComponentHolder.getImpl().getIdGeneratorInstance().generateId(str, str2, z);
    }

    public static String getStack(StackTraceElement[] stackTraceElementArr, boolean z) {
        if (stackTraceElementArr == null || stackTraceElementArr.length < 4) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 3; i2 < stackTraceElementArr.length; i2++) {
            if (stackTraceElementArr[i2].getClassName().contains(BuildConfig.APPLICATION_ID)) {
                sb.append("[");
                sb.append(stackTraceElementArr[i2].getClassName().substring(28));
                sb.append(":");
                sb.append(stackTraceElementArr[i2].getMethodName());
                if (z) {
                    sb.append("(");
                    sb.append(stackTraceElementArr[i2].getLineNumber());
                    sb.append(")]");
                } else {
                    sb.append("]");
                }
            }
        }
        return sb.toString();
    }

    public static boolean isBreakpointAvailable(int i2, FileDownloadModel fileDownloadModel, String str, Boolean bool) {
        if (str == null) {
            if (!FileDownloadLog.NEED_LOG) {
                return false;
            }
            FileDownloadLog.d(FileDownloadUtils.class, "can't continue %d path = null", Integer.valueOf(i2));
            return false;
        }
        File file = new File(str);
        boolean zExists = file.exists();
        boolean zIsDirectory = file.isDirectory();
        if (zExists && !zIsDirectory) {
            long length = file.length();
            long soFar = fileDownloadModel.getSoFar();
            if (fileDownloadModel.getConnectionCount() <= 1 && soFar == 0) {
                if (!FileDownloadLog.NEED_LOG) {
                    return false;
                }
                FileDownloadLog.d(FileDownloadUtils.class, "can't continue %d the downloaded-record is zero.", Integer.valueOf(i2));
                return false;
            }
            long total = fileDownloadModel.getTotal();
            if (length >= soFar && (total == -1 || (length <= total && soFar < total))) {
                if (bool == null || bool.booleanValue() || total != length) {
                    return true;
                }
                if (!FileDownloadLog.NEED_LOG) {
                    return false;
                }
                FileDownloadLog.d(FileDownloadUtils.class, "can't continue %d, because of the output stream doesn't support seek, but the task has already pre-allocated, so we only can download it from the very beginning.", Integer.valueOf(i2));
                return false;
            }
            if (!FileDownloadLog.NEED_LOG) {
                return false;
            }
            FileDownloadLog.d(FileDownloadUtils.class, "can't continue %d dirty data fileLength[%d] sofar[%d] total[%d]", Integer.valueOf(i2), Long.valueOf(length), Long.valueOf(soFar), Long.valueOf(total));
            return false;
        }
        if (!FileDownloadLog.NEED_LOG) {
            return false;
        }
        FileDownloadLog.d(FileDownloadUtils.class, "can't continue %d file not suit, exists[%B], directory[%B]", Integer.valueOf(i2), Boolean.valueOf(zExists), Boolean.valueOf(zIsDirectory));
        return false;
    }
}
