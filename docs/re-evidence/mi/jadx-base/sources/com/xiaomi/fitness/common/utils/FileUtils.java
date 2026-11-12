package com.xiaomi.fitness.common.utils;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.IOExtKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.smarthome.framework.api.UserConfig;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\b\u0010\r\u001a\u00020\u0005H\u0007J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\bJ\u001a\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\bJ\u001a\u0010\u0016\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\bJ\u001a\u0010\u0019\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u000e\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u0005J\u0010\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0005J\u0010\u0010#\u001a\u00020\u00102\b\u0010$\u001a\u0004\u0018\u00010\bJ\u000e\u0010\u001e\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\bJ5\u0010&\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\b2%\b\u0002\u0010'\u001a\u001f\u0012\u0013\u0012\u00110\b¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u0010\u0018\u00010(J\u0012\u0010+\u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u0007J\u000e\u0010,\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u0005J \u0010.\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010/\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u0005J\u001e\u00100\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010/\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u0005J\u000e\u00101\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\bJ\u000e\u00102\u001a\u0002032\u0006\u0010$\u001a\u00020\bJ \u00104\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010/\u001a\u0004\u0018\u00010\u00052\u0006\u0010-\u001a\u00020\u0005J\u0018\u00105\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010/\u001a\u0004\u0018\u00010\u0005J\u0018\u00106\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010/\u001a\u0004\u0018\u00010\u0005J\u0010\u00107\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u00108\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u00109\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0005H\u0007J\u0012\u0010:\u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u0007J\u001a\u0010;\u001a\u00020\u00102\b\u0010<\u001a\u0004\u0018\u00010\b2\b\u0010\"\u001a\u0004\u0018\u00010\u0005J\u0018\u0010A\u001a\u00020!2\b\u0010B\u001a\u0004\u0018\u00010\b2\u0006\u0010C\u001a\u00020\u0005J\u0018\u0010D\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010E\u001a\u00020\u0018H\u0002J\"\u0010D\u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010\u00052\u0006\u0010E\u001a\u00020\u00182\u0006\u0010F\u001a\u00020\u0010H\u0002J\u001a\u0010D\u001a\u00020\u00102\b\u0010$\u001a\u0004\u0018\u00010\b2\b\u0010E\u001a\u0004\u0018\u00010\u0018J\u0016\u0010G\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010H\u001a\u00020\u0005J$\u0010D\u001a\u00020\u00102\b\u0010$\u001a\u0004\u0018\u00010\b2\b\u0010E\u001a\u0004\u0018\u00010\u00182\u0006\u0010F\u001a\u00020\u0010H\u0007J\u0010\u0010I\u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005J\u0012\u0010J\u001a\u0004\u0018\u00010\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005J\u0018\u0010K\u001a\u0004\u0018\u00010L2\u0006\u0010M\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u0005J\u0010\u0010K\u001a\u0004\u0018\u00010L2\u0006\u0010\"\u001a\u00020\u0005J&\u0010N\u001a\u0002HO\"\u0006\b\u0000\u0010O\u0018\u00012\u0006\u0010P\u001a\u00020Q2\u0006\u0010\"\u001a\u00020\u0005H\u0086\b¢\u0006\u0002\u0010RJ\u0012\u0010S\u001a\u0004\u0018\u00010\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005JN\u0010T\u001a\u00020!2\u0006\u0010\t\u001a\u00020\n2%\b\u0002\u0010'\u001a\u001f\u0012\u0013\u0012\u00110\b¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u0010\u0018\u00010(2\u0012\u0010\u001f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050U\"\u00020\u0005¢\u0006\u0002\u0010VJ\u000e\u0010W\u001a\u00020!2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010X\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010Y\u001a\u0004\u0018\u00010\u00052\b\u0010B\u001a\u0004\u0018\u00010\u0005J\u0010\u0010Z\u001a\u0004\u0018\u00010\u00052\u0006\u0010*\u001a\u00020\u0005J\u0010\u0010[\u001a\u0004\u0018\u00010\u00052\u0006\u0010$\u001a\u00020\u0005JN\u0010\\\u001a\u00020!2\u0006\u0010\t\u001a\u00020\n2%\b\u0002\u0010'\u001a\u001f\u0012\u0013\u0012\u00110\b¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u0010\u0018\u00010(2\u0012\u0010\u001f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050U\"\u00020\u0005¢\u0006\u0002\u0010VJ\u0006\u0010]\u001a\u00020\u0010J\u0016\u0010^\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010_2\u0006\u0010\"\u001a\u00020\u0005J\u000e\u0010`\u001a\u00020a2\u0006\u0010$\u001a\u00020\bJ\u000e\u0010b\u001a\u00020a2\u0006\u0010$\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u0011\u0010=\u001a\u00020>8F¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006c"}, d2 = {"Lcom/xiaomi/fitness/common/utils/FileUtils;", "", "<init>", "()V", "TAG", "", "WEARABLE_PAKAGE_NAME", "getSharedPrefDir", "Ljava/io/File;", "context", "Landroid/content/Context;", "getLogDirPath", "getMMKVRootDirFile", "getAuthorityFileProvider", "getDatabaseDir", "createFolder", "", "destFolder", "destFolderFile", "copyFile", "srcFile", "destFile", "copyToFile", "inputStream", "Ljava/io/InputStream;", "writeToFile", "srcFilePath", "outputStream", "Ljava/io/OutputStream;", "writeTo", "deleteFile", "filePath", "deleteFileDir", "", "path", "deleteFileDirec", "file", "dirFile", "deleteFileList", "filter", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "isFileExists", "getFileNameWithoutSuffix", "fileName", "createFileInCachePath", "dirName", "createFileInFilesPath", "createFileWithDirs", "createPrinter", "Ljava/io/PrintWriter;", "getFileInFilesPath", "createDirInFiles", "createDirInCache", "getCachePath", "getFilesPath", "getParentDirFormPath", "isExists", "rename", "oldFile", "internalAvailableSize", "", "getInternalAvailableSize", "()J", "printAllFilesInDir", "dir", "tag", "writeFile", "stream", "append", "writeStrToFile", "sourceStr", "makeDirs", "getFolderName", "readObject", "Ljava/io/Serializable;", "dirPath", "readBean", "T", "gson", "Lcom/google/gson/Gson;", "(Lcom/google/gson/Gson;Ljava/lang/String;)Ljava/lang/Object;", "loadFromFile", "clearApplicationData", "", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;[Ljava/lang/String;)V", "cleanExternalCache", "getExternalCacheFile", "getExternalFilesDirPath", "getExternalFilesFile", "getFilesDirFile", "clearSpFile", "isDualAppInstallation", "getFileList", "", "getFilesByteSize", "", "getNormalFileByteSize", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFileUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileUtils.kt\ncom/xiaomi/fitness/common/utils/FileUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,711:1\n1#2:712\n13402#3,2:713\n13402#3,2:715\n13402#3,2:717\n13402#3,2:719\n13402#3,2:721\n13402#3,2:723\n13402#3,2:725\n*S KotlinDebug\n*F\n+ 1 FileUtils.kt\ncom/xiaomi/fitness/common/utils/FileUtils\n*L\n221#1:713,2\n238#1:715,2\n570#1:717,2\n578#1:719,2\n635#1:721,2\n643#1:723,2\n692#1:725,2\n*E\n"})
public final class FileUtils {

    @NotNull
    private static final String TAG = "FileUtils";

    @NotNull
    public static final FileUtils INSTANCE = new FileUtils();

    @NotNull
    private static final String WEARABLE_PAKAGE_NAME = "com.xiaomi.wearable";

    private FileUtils() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void clearApplicationData$default(FileUtils fileUtils, Context context, Function1 function1, String[] strArr, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        fileUtils.clearApplicationData(context, function1, strArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void clearSpFile$default(FileUtils fileUtils, Context context, Function1 function1, String[] strArr, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        fileUtils.clearSpFile(context, function1, strArr);
    }

    @JvmStatic
    public static final boolean createFolder(@Nullable String destFolder) {
        if (destFolder == null) {
            return false;
        }
        return INSTANCE.createFolder(new File(destFolder));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean deleteFileList$default(FileUtils fileUtils, File file, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        return fileUtils.deleteFileList(file, function1);
    }

    @JvmStatic
    @NotNull
    public static final String getAuthorityFileProvider() {
        return ApplicationExtKt.getApplication().getPackageName() + ".fileprovider";
    }

    @JvmStatic
    @NotNull
    public static final String getCachePath(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String path = context.getCacheDir().getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        return path;
    }

    @JvmStatic
    @NotNull
    public static final File getDatabaseDir(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new File(context.getDataDir(), "databases");
    }

    @JvmStatic
    @NotNull
    public static final String getFilesPath(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String path = context.getFilesDir().getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        return path;
    }

    @JvmStatic
    @NotNull
    public static final String getParentDirFormPath(@NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        String parent = new File(filePath).getParent();
        Intrinsics.checkNotNullExpressionValue(parent, "getParent(...)");
        return parent;
    }

    @JvmStatic
    public static final boolean isExists(@Nullable String filePath) {
        if (TextUtils.isEmpty(filePath)) {
            return false;
        }
        return new File(filePath).exists();
    }

    @JvmStatic
    public static final boolean isFileExists(@Nullable String filePath) {
        if (TextUtils.isEmpty(filePath)) {
            return false;
        }
        Intrinsics.checkNotNull(filePath);
        File file = new File(filePath);
        return !file.isDirectory() && file.exists();
    }

    private final boolean writeFile(String filePath, InputStream stream) {
        return writeFile(filePath, stream, false);
    }

    public final void cleanExternalCache(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File externalCacheFile = getExternalCacheFile(context);
        if (externalCacheFile != null) {
            deleteFile(externalCacheFile);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0065  */
    /* JADX WARN: Code duplicated, block: B:15:0x0070  */
    /* JADX WARN: Code duplicated, block: B:16:0x0073  */
    public final void clearApplicationData(@NotNull Context context, @Nullable Function1<? super File, Boolean> filter, @NotNull String... filePath) {
        FileUtils fileUtils;
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        File[] fileArr = {context.getCacheDir(), getDatabaseDir(context), getSharedPrefDir(context), getMMKVRootDirFile(context), new File(getFilesPath(context))};
        File externalCacheFile = getExternalCacheFile(context);
        if (externalCacheFile != null) {
            ArraysKt___ArraysJvmKt.plus(fileArr, externalCacheFile);
        }
        for (int i = 0; i < 5; i++) {
            File file = fileArr[i];
            if (filter != null) {
                Intrinsics.checkNotNull(file);
                if (filter.invoke(file).booleanValue()) {
                    Logger.i("Keep file(" + file + ") without deleting", new Object[0]);
                } else {
                    fileUtils = INSTANCE;
                    Intrinsics.checkNotNull(file);
                    if (fileUtils.deleteFileList(file, filter)) {
                        str = "success";
                    } else {
                        str = "fail";
                    }
                    Logger.i("Delete file(" + file + ") " + str, new Object[0]);
                }
            } else {
                fileUtils = INSTANCE;
                Intrinsics.checkNotNull(file);
                if (fileUtils.deleteFileList(file, filter)) {
                    str = "success";
                } else {
                    str = "fail";
                }
                Logger.i("Delete file(" + file + ") " + str, new Object[0]);
            }
        }
        for (String str2 : filePath) {
            INSTANCE.deleteFile(str2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0058  */
    /* JADX WARN: Code duplicated, block: B:15:0x0063  */
    /* JADX WARN: Code duplicated, block: B:16:0x0066  */
    public final void clearSpFile(@NotNull Context context, @Nullable Function1<? super File, Boolean> filter, @NotNull String... filePath) {
        FileUtils fileUtils;
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        File[] fileArr = {context.getCacheDir(), getSharedPrefDir(context), getMMKVRootDirFile(context)};
        File externalCacheFile = getExternalCacheFile(context);
        if (externalCacheFile != null) {
            ArraysKt___ArraysJvmKt.plus(fileArr, externalCacheFile);
        }
        for (int i = 0; i < 3; i++) {
            File file = fileArr[i];
            if (filter != null) {
                Intrinsics.checkNotNull(file);
                if (filter.invoke(file).booleanValue()) {
                    Logger.i("clearSpFile Keep file(" + file + ") without deleting", new Object[0]);
                } else {
                    fileUtils = INSTANCE;
                    Intrinsics.checkNotNull(file);
                    if (fileUtils.deleteFileList(file, filter)) {
                        str = "success";
                    } else {
                        str = "fail";
                    }
                    Logger.i("clearSpFile Delete file(" + file + ") " + str, new Object[0]);
                }
            } else {
                fileUtils = INSTANCE;
                Intrinsics.checkNotNull(file);
                if (fileUtils.deleteFileList(file, filter)) {
                    str = "success";
                } else {
                    str = "fail";
                }
                Logger.i("clearSpFile Delete file(" + file + ") " + str, new Object[0]);
            }
        }
        for (String str2 : filePath) {
            INSTANCE.deleteFile(str2);
        }
    }

    public final boolean copyFile(@Nullable File srcFile, @Nullable File destFile) {
        if (srcFile == null || destFile == null) {
            return false;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(srcFile);
            try {
                boolean zCopyToFile = INSTANCE.copyToFile(fileInputStream, destFile);
                CloseableKt.closeFinally(fileInputStream, null);
                return zCopyToFile;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(fileInputStream, th);
                    throw th2;
                }
            }
        } catch (IOException e) {
            Logger.e(TAG, "Failed to copy file " + e);
            return false;
        }
    }

    public final boolean copyToFile(@Nullable InputStream inputStream, @Nullable File destFile) throws Throwable {
        boolean z;
        if (inputStream == null || destFile == null) {
            return false;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                if (!destFile.exists() || destFile.delete()) {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(destFile);
                    try {
                        try {
                            try {
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int i = inputStream.read(bArr);
                                    if (i < 0) {
                                        break;
                                    }
                                    fileOutputStream2.write(bArr, 0, i);
                                }
                                fileOutputStream2.flush();
                                try {
                                    fileOutputStream2.getFD().sync();
                                } catch (IOException e) {
                                    Logger.e(TAG, "Error occurred while copy file " + e);
                                }
                                z = true;
                                fileOutputStream = fileOutputStream2;
                            } catch (Throwable th) {
                                th = th;
                                fileOutputStream = fileOutputStream2;
                                IOExtKt.closeSilently(this, fileOutputStream);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            fileOutputStream2.flush();
                            try {
                                fileOutputStream2.getFD().sync();
                            } catch (IOException e2) {
                                Logger.e(TAG, "Error occurred while copy file " + e2);
                            }
                            throw th2;
                        }
                    } catch (IOException e3) {
                        e = e3;
                        fileOutputStream = fileOutputStream2;
                        Logger.e(TAG, "Failed to copy file " + e);
                        if (destFile.exists()) {
                            destFile.delete();
                        }
                        IOExtKt.closeSilently(this, fileOutputStream);
                        return false;
                    }
                } else {
                    z = false;
                }
                IOExtKt.closeSilently(this, fileOutputStream);
                return z;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e4) {
            e = e4;
        }
    }

    @NotNull
    public final File createDirInCache(@NotNull Context context, @Nullable String dirName) {
        Intrinsics.checkNotNullParameter(context, "context");
        File file = new File(getCachePath(context), dirName);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @NotNull
    public final File createDirInFiles(@NotNull Context context, @Nullable String dirName) {
        Intrinsics.checkNotNullParameter(context, "context");
        File file = new File(getFilesPath(context), dirName);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @Nullable
    public final File createFileInCachePath(@NotNull Context context, @NotNull String dirName, @NotNull String fileName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dirName, "dirName");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        try {
            File file = new File(createDirInCache(context, dirName), fileName);
            if (file.exists()) {
                return file;
            }
            file.createNewFile();
            return file;
        } catch (IOException e) {
            Logger.e(TAG, "Error occurred while createFileInCachePath " + e);
            return null;
        }
    }

    @NotNull
    public final File createFileInFilesPath(@NotNull Context context, @NotNull String dirName, @NotNull String fileName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dirName, "dirName");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        File fileInFilesPath = getFileInFilesPath(context, dirName, fileName);
        if (!fileInFilesPath.exists()) {
            createFileWithDirs(fileInFilesPath);
        }
        return fileInFilesPath;
    }

    public final boolean createFileWithDirs(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        try {
            if (file.exists()) {
                return false;
            }
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists()) {
                parentFile.mkdirs();
            }
            return file.createNewFile();
        } catch (IOException e) {
            Logger.e(TAG, "ERROR occurred while createFileInFilesPath " + e);
            return false;
        }
    }

    @NotNull
    public final PrintWriter createPrinter(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        try {
            createFileWithDirs(file);
            return new PrintWriter((Writer) new OutputStreamWriter(new FileOutputStream(file, true), StandardCharsets.UTF_8), true);
        } catch (FileNotFoundException e) {
            throw new IllegalStateException(e);
        }
    }

    public final boolean deleteFile(@NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        if (!TextUtils.isEmpty(filePath)) {
            File file = new File(filePath);
            if (!file.isDirectory() && file.exists()) {
                return file.delete();
            }
        }
        return false;
    }

    public final void deleteFileDir(@Nullable String path) {
        deleteFileDirec(new File(path));
    }

    public final boolean deleteFileDirec(@Nullable File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        if (!file.isDirectory()) {
            return file.delete();
        }
        Iterator it = ArrayIteratorKt.iterator(file.listFiles());
        while (it.hasNext()) {
            File file2 = (File) it.next();
            Intrinsics.checkNotNull(file2);
            deleteFile(file2);
        }
        return file.delete();
    }

    public final boolean deleteFileList(@NotNull File dirFile, @Nullable Function1<? super File, Boolean> filter) {
        Intrinsics.checkNotNullParameter(dirFile, "dirFile");
        if (!dirFile.exists() || (filter != null && filter.invoke(dirFile).booleanValue())) {
            return false;
        }
        if (dirFile.isFile() || dirFile.length() == 0) {
            return dirFile.delete();
        }
        File[] fileArrListFiles = dirFile.listFiles();
        if (fileArrListFiles == null) {
            return true;
        }
        for (File file : fileArrListFiles) {
            FileUtils fileUtils = INSTANCE;
            Intrinsics.checkNotNull(file);
            fileUtils.deleteFileList(file, filter);
        }
        return true;
    }

    @Nullable
    public final File getExternalCacheFile(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Intrinsics.areEqual(Environment.getExternalStorageState(), "mounted")) {
            return context.getExternalCacheDir();
        }
        return null;
    }

    @Nullable
    public final String getExternalFilesDirPath(@Nullable String dir) {
        File externalFilesDir = ApplicationExtKt.getApplication().getExternalFilesDir(dir);
        if (externalFilesDir != null) {
            return externalFilesDir.getAbsolutePath();
        }
        if (dir != null) {
            return INSTANCE.getFilesDirFile(dir);
        }
        return null;
    }

    @Nullable
    public final String getExternalFilesFile(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        File externalFilesDir = ApplicationExtKt.getApplication().getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return getFilesDirFile(name);
        }
        return externalFilesDir.getAbsolutePath() + File.separator + name;
    }

    @NotNull
    public final File getFileInFilesPath(@NotNull Context context, @Nullable String dirName, @NotNull String fileName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        if (TextUtils.isEmpty(dirName)) {
            return new File(context.getFilesDir(), fileName);
        }
        File filesDir = context.getFilesDir();
        Intrinsics.checkNotNull(dirName);
        return new File(new File(filesDir, dirName), fileName);
    }

    @Nullable
    public final List<String> getFileList(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        File externalFilesDir = ApplicationExtKt.getApplication().getExternalFilesDir(path);
        File[] fileArrListFiles = externalFilesDir != null ? externalFilesDir.listFiles() : null;
        if (fileArrListFiles == null) {
            Logger.i(TAG, "files is null");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ArrayIteratorKt.iterator(fileArrListFiles);
        while (it.hasNext()) {
            ListExtKt.add(arrayList, ((File) it.next()).getAbsolutePath());
        }
        return arrayList;
    }

    @NotNull
    public final String getFileNameWithoutSuffix(@NotNull String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        if (TextUtils.isEmpty(fileName)) {
            Logger.e(TAG, "file name empty");
            return "";
        }
        int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) fileName, '.', 0, false, 6, (Object) null);
        if (iLastIndexOf$default == -1) {
            return "";
        }
        String strSubstring = fileName.substring(0, iLastIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final int getFilesByteSize(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (file.isFile()) {
            return getNormalFileByteSize(file);
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return 0;
        }
        int filesByteSize = 0;
        for (File file2 : fileArrListFiles) {
            FileUtils fileUtils = INSTANCE;
            Intrinsics.checkNotNull(file2);
            filesByteSize += fileUtils.getFilesByteSize(file2);
        }
        return filesByteSize;
    }

    @Nullable
    public final String getFilesDirFile(@NotNull String file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return ApplicationExtKt.getApplication().getFilesDir().getAbsolutePath() + File.separator + file;
    }

    @Nullable
    public final String getFolderName(@Nullable String filePath) {
        Integer numValueOf;
        if (TextUtils.isEmpty(filePath)) {
            return filePath;
        }
        if (filePath != null) {
            String separator = File.separator;
            Intrinsics.checkNotNullExpressionValue(separator, "separator");
            numValueOf = Integer.valueOf(StringsKt__StringsKt.lastIndexOf$default((CharSequence) filePath, separator, 0, false, 6, (Object) null));
        } else {
            numValueOf = null;
        }
        if (numValueOf != null && numValueOf.intValue() == -1) {
            return "";
        }
        if (numValueOf == null) {
            return null;
        }
        String strSubstring = filePath.substring(0, numValueOf.intValue());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final long getInternalAvailableSize() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
    }

    @Nullable
    public final String getLogDirPath() {
        return getExternalFilesDirPath("log");
    }

    @NotNull
    public final File getMMKVRootDirFile(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new File(context.getFilesDir().getAbsolutePath() + "/mmkv");
    }

    public final int getNormalFileByteSize(@NotNull File file) throws Throwable {
        Intrinsics.checkNotNullParameter(file, "file");
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    int iAvailable = fileInputStream2.available();
                    fileInputStream2.close();
                    return iAvailable;
                } catch (Exception e) {
                    e = e;
                    fileInputStream = fileInputStream2;
                    Logger.w(TAG, "getNormalFileByteSize", e);
                    if (fileInputStream == null) {
                        return 0;
                    }
                    fileInputStream.close();
                    return 0;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @NotNull
    public final File getSharedPrefDir(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new File(context.getDataDir(), "shared_prefs");
    }

    public final boolean isDualAppInstallation() {
        Logger.i(TAG, "isDualAppInstallation come");
        Application application = ApplicationExtKt.getApplication();
        PackageManager packageManager = application != null ? application.getPackageManager() : null;
        List<PackageInfo> installedPackages = packageManager != null ? packageManager.getInstalledPackages(0) : null;
        if (installedPackages != null) {
            for (PackageInfo packageInfo : installedPackages) {
                if (Intrinsics.areEqual(packageInfo.packageName, WEARABLE_PAKAGE_NAME)) {
                    Logger.i(TAG, "isDualAppInstallation packageName is wearable versionName is " + packageInfo.versionName);
                    String str = packageInfo.versionName;
                    if (str == null || !StringsKt__StringsJVMKt.startsWith$default(str, "2", false, 2, null)) {
                        String str2 = packageInfo.versionName;
                        if (str2 != null) {
                            StringsKt__StringsJVMKt.startsWith$default(str2, UserConfig.KEY_LITE_SCENE_ORDER, false, 2, null);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Nullable
    public final String loadFromFile(@Nullable String filePath) {
        if (filePath == null) {
            return null;
        }
        try {
            if (filePath.length() == 0) {
                return null;
            }
            File file = new File(filePath);
            if (!file.exists()) {
                return null;
            }
            Reader inputStreamReader = new InputStreamReader(new FileInputStream(file), Charsets.UTF_8);
            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            try {
                String text = TextStreamsKt.readText(bufferedReader);
                CloseableKt.closeFinally(bufferedReader, null);
                return text;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(bufferedReader, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final boolean makeDirs(@Nullable String filePath) {
        String folderName = getFolderName(filePath);
        if (TextUtils.isEmpty(folderName)) {
            return false;
        }
        File file = new File(folderName);
        if (file.exists() && file.isDirectory()) {
            return true;
        }
        return file.mkdirs();
    }

    public final void printAllFilesInDir(@Nullable File dir, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (dir == null || !dir.exists()) {
            Logger.e(tag, "dir is null or not exists");
            return;
        }
        if (dir.isDirectory()) {
            File[] fileArrListFiles = dir.listFiles();
            Intrinsics.checkNotNull(fileArrListFiles);
            if (fileArrListFiles.length == 0) {
                return;
            }
            Iterator it = ArrayIteratorKt.iterator(fileArrListFiles);
            while (it.hasNext()) {
                printAllFilesInDir((File) it.next(), tag);
            }
            return;
        }
        if (!dir.isFile()) {
            Logger.e(tag, "the file is not a direction or a file, may be hide, " + dir);
            return;
        }
        Logger.i(tag, "file:" + dir.getAbsolutePath());
    }

    public final /* synthetic */ <T> T readBean(Gson gson, String path) throws JsonSyntaxException, JsonIOException {
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(path, "path");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(path));
        try {
            Intrinsics.reifiedOperationMarker(4, "T");
            T t = (T) gson.fromJson((Reader) inputStreamReader, (Class) Object.class);
            InlineMarker.finallyStart(1);
            IOExtKt.closeSilently(this, inputStreamReader);
            return t;
        } finally {
            InlineMarker.finallyStart(1);
            IOExtKt.closeSilently(this, inputStreamReader);
            InlineMarker.finallyEnd(1);
        }
    }

    @Nullable
    public final synchronized Serializable readObject(@NotNull String dirPath, @NotNull String fileName) {
        Intrinsics.checkNotNullParameter(dirPath, "dirPath");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        return readObject(dirPath + File.separator + fileName);
    }

    public final boolean rename(@Nullable File oldFile, @Nullable String path) {
        if (oldFile == null || !oldFile.exists() || TextUtils.isEmpty(path)) {
            return false;
        }
        File file = new File(path);
        return !file.exists() && oldFile.renameTo(file);
    }

    public final void writeStrToFile(@NotNull String filePath, @NotNull String sourceStr) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(sourceStr, "sourceStr");
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        byte[] bytes = sourceStr.getBytes(UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        writeFile(filePath, new ByteArrayInputStream(bytes));
    }

    public final boolean writeTo(@Nullable InputStream inputStream, @Nullable OutputStream outputStream) {
        if (inputStream == null || outputStream == null) {
            return false;
        }
        try {
            try {
                byte[] bArr = new byte[8192];
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                Ref.IntRef intRef = new Ref.IntRef();
                while (true) {
                    int i = bufferedInputStream.read(bArr, 0, 8192);
                    intRef.element = i;
                    if (i < 0) {
                        outputStream.flush();
                        IOExtKt.closeSilently(this, inputStream, outputStream);
                        return true;
                    }
                    outputStream.write(bArr, 0, i);
                }
            } catch (Exception e) {
                Logger.e(TAG, "writeToFile has an error " + e);
                IOExtKt.closeSilently(this, inputStream, outputStream);
                return false;
            }
        } catch (Throwable th) {
            IOExtKt.closeSilently(this, inputStream, outputStream);
            throw th;
        }
    }

    public final boolean writeToFile(@Nullable String srcFilePath, @Nullable OutputStream outputStream) throws Throwable {
        if (TextUtils.isEmpty(srcFilePath) || outputStream == null || !isExists(srcFilePath)) {
            return false;
        }
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(srcFilePath);
                try {
                    boolean zWriteTo = writeTo(fileInputStream2, outputStream);
                    IOExtKt.closeSilently(this, fileInputStream2, outputStream);
                    return zWriteTo;
                } catch (Exception e) {
                    e = e;
                    fileInputStream = fileInputStream2;
                    Logger.e(TAG, e.getMessage(), e);
                    IOExtKt.closeSilently(this, fileInputStream, outputStream);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    IOExtKt.closeSilently(this, fileInputStream, outputStream);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final boolean writeFile(String filePath, InputStream stream, boolean append) {
        return writeFile(filePath != null ? new File(filePath) : null, stream, append);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Nullable
    public final synchronized Serializable readObject(@NotNull String path) {
        ObjectInputStream objectInputStream;
        int i = 2;
        i = 2;
        i = 2;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(path, "path");
            ?? file = new File(path);
            ?? Exists = file.exists();
            Serializable serializable = null;
            try {
                if (Exists == 0) {
                    return null;
                }
                try {
                    Exists = new FileInputStream((File) file);
                    try {
                        objectInputStream = new ObjectInputStream(Exists);
                        try {
                            Object object = objectInputStream.readObject();
                            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type java.io.Serializable");
                            Serializable serializable2 = (Serializable) object;
                            ?? r2 = {Exists, objectInputStream};
                            IOExtKt.closeSilently(this, r2);
                            serializable = serializable2;
                            i = r2;
                            file = objectInputStream;
                            Exists = Exists;
                        } catch (FileNotFoundException e) {
                            e = e;
                            e.printStackTrace();
                            ?? r3 = {Exists, objectInputStream};
                            IOExtKt.closeSilently(this, r3);
                            i = r3;
                            file = objectInputStream;
                            Exists = Exists;
                        } catch (Exception e2) {
                            e = e2;
                            e.printStackTrace();
                            ?? r4 = {Exists, objectInputStream};
                            IOExtKt.closeSilently(this, r4);
                            i = r4;
                            file = objectInputStream;
                            Exists = Exists;
                        }
                    } catch (FileNotFoundException e3) {
                        e = e3;
                        objectInputStream = null;
                    } catch (Exception e4) {
                        e = e4;
                        objectInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        file = 0;
                    }
                } catch (FileNotFoundException e5) {
                    e = e5;
                    Exists = 0;
                    objectInputStream = null;
                } catch (Exception e6) {
                    e = e6;
                    Exists = 0;
                    objectInputStream = null;
                } catch (Throwable th2) {
                    file = 0;
                    th = th2;
                    Exists = 0;
                }
                return serializable;
            } catch (Throwable th3) {
                th = th3;
            }
            ?? r5 = new Closeable[i];
            r5[0] = Exists;
            r5[1] = file;
            IOExtKt.closeSilently(this, r5);
            throw th;
        }
    }

    public final boolean createFolder(@Nullable File destFolderFile) {
        if (destFolderFile == null) {
            return false;
        }
        if (destFolderFile.exists()) {
            if (destFolderFile.isDirectory()) {
                return true;
            }
            boolean zDelete = destFolderFile.delete();
            Logger.e(TAG, "createFolder  there is a file that has the same name as the dest folder, delete it first. result:" + zDelete);
            if (!zDelete) {
                return false;
            }
        }
        if (destFolderFile.mkdirs()) {
            return true;
        }
        Logger.e(TAG, "folder: " + destFolderFile + " Can not be created.");
        return false;
    }

    public final boolean writeFile(@Nullable File file, @Nullable InputStream stream) {
        return writeFile(file, stream, false);
    }

    @JvmStatic
    public static final boolean writeFile(@Nullable File file, @Nullable InputStream stream, boolean append) throws Throwable {
        if (file == null) {
            return false;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                INSTANCE.makeDirs(file.getAbsolutePath());
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, append);
                try {
                    byte[] bArr = new byte[1024];
                    Ref.IntRef intRef = new Ref.IntRef();
                    while (true) {
                        Intrinsics.checkNotNull(stream);
                        int i = stream.read(bArr);
                        intRef.element = i;
                        if (i != -1) {
                            fileOutputStream2.write(bArr, 0, i);
                        } else {
                            fileOutputStream2.flush();
                            IOExtKt.closeSilently(INSTANCE, fileOutputStream2, stream);
                            return true;
                        }
                    }
                } catch (IOException e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    Logger.e("", e);
                    IOExtKt.closeSilently(INSTANCE, fileOutputStream, stream);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    IOExtKt.closeSilently(INSTANCE, fileOutputStream, stream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    public final boolean deleteFile(@NotNull File dirFile) {
        Intrinsics.checkNotNullParameter(dirFile, "dirFile");
        if (!dirFile.exists()) {
            return false;
        }
        if (!dirFile.isFile() && dirFile.length() != 0) {
            File[] fileArrListFiles = dirFile.listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    FileUtils fileUtils = INSTANCE;
                    Intrinsics.checkNotNull(file);
                    fileUtils.deleteFile(file);
                }
            }
            return dirFile.delete();
        }
        return dirFile.delete();
    }
}
