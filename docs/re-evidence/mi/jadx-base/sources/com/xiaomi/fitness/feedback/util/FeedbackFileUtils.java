package com.xiaomi.fitness.feedback.util;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.wearable.common.util.encrypt.AESUtils;
import defpackage.im9;
import defpackage.lm9;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005J$\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J>\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001fH\u0002J\u0016\u0010 \u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u0005J\u0016\u0010\"\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u0005J\u0006\u0010$\u001a\u00020\u0005J\u0006\u0010%\u001a\u00020\u0005J\u0012\u0010&\u001a\u0004\u0018\u00010\u00052\b\u0010'\u001a\u0004\u0018\u00010\u0005R\u0016\u0010\u0004\u001a\u00020\u00058\u0002X\u0083D¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/feedback/util/FeedbackFileUtils;", "", "<init>", "()V", "TAG", "", "getTAG$annotations", "LOG_DIR", "getLOG_DIR", "()Ljava/lang/String;", "DUMP_DIR", "getDUMP_DIR", "copyDirOrFile", "", "context", "Landroid/content/Context;", "inPath", "outPath", "zipFolder", "", "srcFileString", "zipFileString", "extraFile", "Ljava/io/File;", "zipFiles", "folderString", "fileString", "zipOutputSteam", "Ljava/util/zip/ZipOutputStream;", "newPathParams", "zipFilesNameList", "", "getExternalFilesDirPath", "dir", "getFilesDirFile", "file", "getLogDirPath", "getDebiceLogDirPath", "loadFromFile", "filePath", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFeedbackFileUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeedbackFileUtils.kt\ncom/xiaomi/fitness/feedback/util/FeedbackFileUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,212:1\n1#2:213\n*E\n"})
public final class FeedbackFileUtils {

    @NotNull
    public static final FeedbackFileUtils INSTANCE = new FeedbackFileUtils();

    @NotNull
    private static final String TAG = "FeedbackFileUtil";

    @NotNull
    private static final String LOG_DIR = "log";

    @NotNull
    private static final String DUMP_DIR = "dump";

    private FeedbackFileUtils() {
    }

    @JvmStatic
    private static /* synthetic */ void getTAG$annotations() {
    }

    private final void zipFiles(String folderString, String fileString, ZipOutputStream zipOutputSteam, String newPathParams, List<String> zipFilesNameList) throws Exception {
        ZipEntry zipEntry;
        boolean zEncryptFile;
        if (zipOutputSteam == null) {
            return;
        }
        if (zipFilesNameList == null) {
            zipFilesNameList = new ArrayList<>();
        }
        File file = new File(folderString + fileString);
        if (!file.isFile()) {
            String[] list = file.list();
            if (list != null && list.length > 0) {
                Iterator it = ArrayIteratorKt.iterator(list);
                while (it.hasNext()) {
                    String str = (String) it.next();
                    String str2 = folderString + fileString + File.separator;
                    Intrinsics.checkNotNull(str);
                    zipFiles(str2, str, zipOutputSteam, null, zipFilesNameList);
                }
                return;
            }
            ZipEntry zipEntry2 = new ZipEntry(fileString + File.separator);
            String name = zipEntry2.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            zipFilesNameList.add(name);
            Logger.i(TAG, "extra zipEntry " + zipEntry2.getName());
            zipOutputSteam.putNextEntry(zipEntry2);
            zipOutputSteam.closeEntry();
            return;
        }
        if (zipFilesNameList.contains(fileString)) {
            String str3 = fileString + ".bak";
            while (zipFilesNameList.contains(str3)) {
                str3 = str3 + ".bak";
            }
            zipEntry = new ZipEntry(str3);
        } else {
            zipEntry = new ZipEntry(fileString);
        }
        String absolutePath = file.getAbsolutePath();
        file.getParent();
        if (TextUtils.isEmpty(newPathParams)) {
            Intrinsics.checkNotNull(absolutePath);
            int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) absolutePath, ".", 0, false, 6, (Object) null);
            loadFromFile(absolutePath);
            String strSubstring = absolutePath.substring(0, iLastIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String strSubstring2 = absolutePath.substring(iLastIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            newPathParams = strSubstring + "_ect" + strSubstring2;
            FileUtils.INSTANCE.deleteFile(newPathParams);
        }
        if (AppUtil.INSTANCE.isDevChannel()) {
            Logger.d(TAG, "FeedbackFile copyFile");
            zEncryptFile = im9.t(absolutePath, newPathParams);
        } else {
            Logger.i(TAG, "FeedbackFile encryptFile");
            zEncryptFile = AESUtils.INSTANCE.encryptFile(absolutePath, newPathParams, System.currentTimeMillis() + "abc");
        }
        Logger.i(TAG, "new path is " + newPathParams + ", result is " + zEncryptFile);
        File file2 = new File(newPathParams);
        if (zEncryptFile) {
            FileInputStream fileInputStream = new FileInputStream(file2);
            try {
                String name2 = zipEntry.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                zipFilesNameList.add(name2);
                zipOutputSteam.putNextEntry(zipEntry);
                byte[] bArr = new byte[4096];
                while (true) {
                    int i = fileInputStream.read(bArr);
                    if (i == -1) {
                        break;
                    } else {
                        zipOutputSteam.write(bArr, 0, i);
                    }
                }
                zipOutputSteam.closeEntry();
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(fileInputStream, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(fileInputStream, th);
                    throw th2;
                }
            }
        }
        FileUtils.INSTANCE.deleteFile(file2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void zipFiles$default(FeedbackFileUtils feedbackFileUtils, String str, String str2, ZipOutputStream zipOutputStream, String str3, List list, int i, Object obj) throws Exception {
        if ((i & 16) != 0) {
            list = null;
        }
        feedbackFileUtils.zipFiles(str, str2, zipOutputStream, str3, list);
    }

    public final void copyDirOrFile(@NotNull Context context, @NotNull String inPath, @NotNull String outPath) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inPath, "inPath");
        Intrinsics.checkNotNullParameter(outPath, "outPath");
        StringBuilder sb = new StringBuilder();
        sb.append("copyDirOrFile [ inPath:");
        sb.append(inPath);
        sb.append(", outPath:");
        sb.append(outPath);
        sb.append(" ]");
        File file = new File(inPath);
        if (file.exists()) {
            File file2 = new File(outPath);
            if (!file.isDirectory()) {
                if (file2.exists()) {
                    file2.delete();
                }
                try {
                    if (AppUtil.INSTANCE.isDevChannel()) {
                        im9.t(inPath, outPath);
                        return;
                    }
                    AESUtils.INSTANCE.encryptFile(inPath, outPath, System.currentTimeMillis() + "abc");
                    return;
                } catch (Throwable th) {
                    th.printStackTrace();
                    Unit unit = Unit.INSTANCE;
                    return;
                }
            }
            String[] list = file.list();
            if (list == null || list.length == 0) {
                return;
            }
            if (!file2.exists() && !file2.mkdirs()) {
                String absolutePath = file2.getAbsolutePath();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("mkdirs() FAIL:");
                sb2.append(absolutePath);
                return;
            }
            Iterator it = ArrayIteratorKt.iterator(list);
            while (it.hasNext()) {
                String str2 = (String) it.next();
                String str3 = File.separator;
                String str4 = outPath + str3;
                if (Intrinsics.areEqual(inPath, "")) {
                    str = inPath;
                } else {
                    str = inPath + str3;
                }
                copyDirOrFile(context, str + str2, str4 + str2);
            }
        }
    }

    @NotNull
    public final String getDUMP_DIR() {
        return DUMP_DIR;
    }

    @NotNull
    public final String getDebiceLogDirPath() {
        return getExternalFilesDirPath(ApplicationExtKt.getApplication(), "log/devicelog");
    }

    @NotNull
    public final String getExternalFilesDirPath(@NotNull Context context, @NotNull String dir) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dir, "dir");
        File externalFilesDir = context.getExternalFilesDir(dir);
        if (externalFilesDir == null) {
            return getFilesDirFile(context, dir);
        }
        String absolutePath = externalFilesDir.getAbsolutePath();
        Intrinsics.checkNotNull(absolutePath);
        return absolutePath;
    }

    @NotNull
    public final String getFilesDirFile(@NotNull Context context, @NotNull String file) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(file, "file");
        return context.getFilesDir().getAbsolutePath() + File.separator + file;
    }

    @NotNull
    public final String getLOG_DIR() {
        return LOG_DIR;
    }

    @NotNull
    public final String getLogDirPath() {
        return getExternalFilesDirPath(ApplicationExtKt.getApplication(), LOG_DIR);
    }

    @Nullable
    public final String loadFromFile(@Nullable String filePath) throws Throwable {
        String strC = null;
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
            strC = lm9.c(file, "UTF-8");
            Logger.d(TAG, "commons to read file to string");
            return strC;
        } catch (Exception e) {
            e.printStackTrace();
            return strC;
        }
    }

    public final boolean zipFolder(@Nullable String srcFileString, @Nullable String zipFileString, @Nullable File extraFile) throws Exception {
        String str;
        String str2 = TAG;
        Logger.i(str2, "zipFolder srcFileString:" + srcFileString + ";zipFileString:" + zipFileString + ";extraFile:" + extraFile);
        ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(zipFileString));
        if (extraFile != null) {
            if (extraFile.isFile()) {
                str = extraFile.getAbsolutePath() + ".bak";
            } else {
                str = "";
            }
            String str3 = str;
            String str4 = extraFile.getParent() + File.separator;
            String name = extraFile.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            zipFiles$default(this, str4, name, zipOutputStream, str3, null, 16, null);
        }
        File file = new File(srcFileString);
        Logger.i(str2, "srcFileString is exists:" + file.exists());
        String str5 = file.getParent() + File.separator;
        String name2 = file.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
        zipFiles$default(this, str5, name2, zipOutputStream, null, null, 16, null);
        zipOutputStream.finish();
        zipOutputStream.close();
        return true;
    }
}
