package com.huami.rawdata_uploader.file;

import android.content.Context;
import android.text.TextUtils;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.zxing.common.StringUtils;
import com.huami.rawdata_uploader.ext.FileManagerExKt;
import com.huami.rawdata_uploader.vo.IRawDataType;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b-\u0010.J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001c\u0010\f\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0002J \u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002J\u0012\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0002J\u0016\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J&\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004J\u001e\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004J0\u0010!\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\bJ\"\u0010!\u001a\u0004\u0018\u00010\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\bJ\u001c\u0010%\u001a\u00020\u00112\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\"2\u0006\u0010$\u001a\u00020\u0006J\u000e\u0010&\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0006R\u0016\u0010)\u001a\u00020'8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010(R\u001e\u0010,\u001a\n **\u0004\u0018\u00010\u00040\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+¨\u0006/"}, d2 = {"Lcom/huami/rawdata_uploader/file/RawDataFileManager;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "dirName", "Ljava/io/File;", "b", "", "data", "savedFile", "", "c", "resFile", "Ljava/util/zip/ZipOutputStream;", "zipout", "rootpath", "", GoogleApiAvailabilityLight.a, "file", "a", "initDir", "subDir", "fileName", "getRawDataPath", "dir", "getDir", "Lcom/huami/rawdata_uploader/vo/IRawDataType;", "rawDataDataType", "uid", "", "generateTime", "rawData", "saveRawData", "", "resFileList", "zipFile", "zipFiles", "deleteFile", "", LogUtil.I, "BUFF_SIZE", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "<init>", "()V", "rawdata-uploader_release"}, k = 1, mv = {1, 5, 1})
public final class RawDataFileManager {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final int BUFF_SIZE = 1048576;

    @NotNull
    public static final RawDataFileManager INSTANCE = new RawDataFileManager();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final String TAG = RawDataFileManager.class.getSimpleName();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ IOException a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(IOException iOException) {
            super(0);
            this.a = iOException;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "saveRawData file failed to create:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ File b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j, File file) {
            super(0);
            this.a = j;
            this.b = file;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "saveRawData file existed and delete:" + this.a + ",path:" + this.b.getName();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "saveRawData file failed to save:" + this.a;
        }
    }

    private RawDataFileManager() {
    }

    private final boolean a(File file) {
        return file != null && file.exists() && file.length() > 0;
    }

    private final File b(Context context, String dirName) {
        return new File(context.getFilesDir(), dirName);
    }

    private final boolean c(byte[] data, File savedFile) throws Throwable {
        if (!((data == null || savedFile == null) ? false : true)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(savedFile);
                try {
                    fileOutputStream2.write(data);
                    fileOutputStream2.flush();
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    return true;
                } catch (IOException e3) {
                    e = e3;
                    HMLog.info(TAG, new a(e));
                    throw e;
                } catch (Exception e4) {
                    e = e4;
                    fileOutputStream = fileOutputStream2;
                    HMLog.info(TAG, new b(e));
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
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
                            e6.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e7) {
            e = e7;
        } catch (Exception e8) {
            e = e8;
        }
    }

    private final void d(File resFile, ZipOutputStream zipout, String rootpath) throws IOException {
        int length = rootpath.length() - 1;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            boolean z2 = Intrinsics.compare((int) rootpath.charAt(!z ? i2 : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i2++;
            } else {
                z = true;
            }
        }
        String str = rootpath.subSequence(i2, length + 1).toString().length() == 0 ? "" : File.separator;
        String str2 = ((Object) rootpath) + str + resFile.getName();
        Charset charsetForName = Charset.forName("8859_1");
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String str3 = new String(str2.getBytes(charsetForName), Charset.forName(StringUtils.GB2312));
        if (resFile.isDirectory()) {
            File[] fileArrListFiles = resFile.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            int length2 = fileArrListFiles.length;
            while (i < length2) {
                File file = fileArrListFiles[i];
                i++;
                INSTANCE.d(file, zipout, str3);
            }
            return;
        }
        byte[] bArr = new byte[1048576];
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(resFile), 1048576);
        zipout.putNextEntry(new ZipEntry(str3));
        while (true) {
            int i3 = bufferedInputStream.read(bArr);
            if (i3 == -1) {
                bufferedInputStream.close();
                zipout.flush();
                zipout.closeEntry();
                return;
            }
            zipout.write(bArr, 0, i3);
        }
    }

    public final void deleteFile(@NotNull File file) {
        if (a(file)) {
            file.delete();
        }
    }

    @NotNull
    public final File getDir(@NotNull File dir, @NotNull String subDir, @NotNull String fileName) {
        if (!TextUtils.isEmpty(subDir) && !new File(dir, subDir).exists()) {
            new File(dir, subDir).mkdir();
        }
        if (TextUtils.isEmpty(subDir)) {
            return TextUtils.isEmpty(fileName) ? dir : new File(dir, fileName);
        }
        if (TextUtils.isEmpty(fileName)) {
            return new File(dir, subDir);
        }
        return new File(dir.getPath() + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + subDir, fileName);
    }

    @NotNull
    public final File getRawDataPath(@NotNull Context context, @NotNull String subDir, @NotNull String dirName, @NotNull String fileName) {
        return getDir(b(context, dirName), subDir, fileName);
    }

    public final void initDir(@NotNull Context context, @NotNull String dirName) {
        File fileB = b(context, dirName);
        if (fileB.exists()) {
            return;
        }
        fileB.mkdirs();
    }

    @Nullable
    public final File saveRawData(@NotNull Context context, @NotNull IRawDataType rawDataDataType, @NotNull String uid, long generateTime, @NotNull byte[] rawData) throws IOException {
        return saveRawData(FileManagerExKt.getFileByDataType(context, uid, generateTime, rawDataDataType), generateTime, rawData);
    }

    public final void zipFiles(@NotNull Collection<? extends File> resFileList, @NotNull File zipFile) throws IOException {
        ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(zipFile), 1048576));
        Iterator<? extends File> it2 = resFileList.iterator();
        while (it2.hasNext()) {
            d(it2.next(), zipOutputStream, "");
        }
        zipOutputStream.close();
    }

    @Nullable
    public final File saveRawData(@Nullable File file, long generateTime, @NotNull byte[] rawData) throws IOException {
        if (file == null) {
            HMLog.info(TAG, new c(generateTime));
            return null;
        }
        if (file.exists() && file.delete()) {
            HMLog.debug(TAG, new d(generateTime, file));
        }
        if (c(rawData, file)) {
            return file;
        }
        HMLog.info(TAG, new e(generateTime));
        return null;
    }
}
