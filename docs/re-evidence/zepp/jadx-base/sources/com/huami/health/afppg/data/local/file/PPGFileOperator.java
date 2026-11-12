package com.huami.health.afppg.data.local.file;

import android.content.Context;
import android.text.TextUtils;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.zxing.common.StringUtils;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.health.afppg.service.PPGFilePathService;
import com.huami.health.afppg.utils.PPGExtensionsKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0005\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b3\u00104J\"\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J2\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00062\u0010\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u0012J,\u0010\u0018\u001a\u0004\u0018\u00010\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\u00062\u0010\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u0012J\"\u0010\u001c\u001a\u00020\u001b2\u0010\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\bJ\"\u0010\u001d\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\"\u0010\u001e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\"\u0010\u001f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u001e\u0010\"\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0006J\u001c\u0010&\u001a\u00020\u000f2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0#2\u0006\u0010%\u001a\u00020\bR\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010'R\u0016\u0010)\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010'R\u0016\u0010*\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010'R\u0016\u0010,\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010'R\u0016\u0010.\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010'R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u00101¨\u00065"}, d2 = {"Lcom/huami/health/afppg/data/local/file/PPGFileOperator;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "uid", "", "secondtime", "Ljava/io/File;", "b", "a", "resFile", "Ljava/util/zip/ZipOutputStream;", "zipout", "rootpath", "", "c", "second", "", "", "rrData", "saveRRRaw", "file", "pgabData", "saveRawData", "data", "savedFile", "", "saveByteData", "getAfPpgFile", "getHrPpgFile", "getAfAccFile", "userId", "time", "getRRPeakZipFile", "", "resFileList", "zipFile", "zipFiles", "Ljava/lang/String;", "TAG", "TAG_FILE_NAME_RR", "TAG_FILE_NAME_AF_PPG", GoogleApiAvailabilityLight.a, "TAG_FILE_NAME_HR_PPG", "e", "TAG_FILE_NAME_AF_ACC", "", "f", LogUtil.I, "BUFF_SIZE", "<init>", "()V", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public final class PPGFileOperator {

    @NotNull
    public static final PPGFileOperator INSTANCE = new PPGFileOperator();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "af_ppg_PpgFileOperator";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String TAG_FILE_NAME_RR = "rr";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final String TAG_FILE_NAME_AF_PPG = "ppg-ab";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final String TAG_FILE_NAME_HR_PPG = "hr-ppg";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final String TAG_FILE_NAME_AF_ACC = "af-acc";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final int BUFF_SIZE = 1048576;

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
            return Intrinsics.stringPlus("rr file failed to create:", Long.valueOf(this.a));
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
            return "rr file existed and delete:" + this.a + ",path:" + ((Object) this.b.getName());
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
            return Intrinsics.stringPlus("rr file failed to save:", Long.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("saveRawData file failed to create:", Long.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ File b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(long j, File file) {
            super(0);
            this.a = j;
            this.b = file;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "saveRawData file existed and delete:" + this.a + ",path:" + ((Object) this.b.getName());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("saveRawData file failed to save:", Long.valueOf(this.a));
        }
    }

    private PPGFileOperator() {
    }

    private final String a(String uid) {
        if (TextUtils.isEmpty(uid)) {
            uid = EcgData.DEFAULT_DIGIT_VALUE;
        }
        return Intrinsics.stringPlus(uid, Constants.ACCEPT_TIME_SEPARATOR_SERVER);
    }

    private final File b(Context context, String uid, long secondtime) {
        return PPGFilePathService.INSTANCE.getRRPath(context, uid, ((Object) a(uid)) + secondtime + "-rr.txt");
    }

    private final void c(File resFile, ZipOutputStream zipout, String rootpath) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(rootpath);
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
        sb.append((Object) (rootpath.subSequence(i2, length + 1).toString().length() == 0 ? "" : File.separator));
        sb.append((Object) resFile.getName());
        String string = sb.toString();
        Charset charsetForName = Charset.forName("8859_1");
        Objects.requireNonNull(string, "null cannot be cast to non-null type java.lang.String");
        String str = new String(string.getBytes(charsetForName), Charset.forName(StringUtils.GB2312));
        if (resFile.isDirectory()) {
            File[] fileArrListFiles = resFile.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            int length2 = fileArrListFiles.length;
            while (i < length2) {
                File file = fileArrListFiles[i];
                i++;
                INSTANCE.c(file, zipout, str);
            }
            return;
        }
        byte[] bArr = new byte[1048576];
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(resFile), 1048576);
        zipout.putNextEntry(new ZipEntry(str));
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

    @Nullable
    public final File getAfAccFile(@NotNull Context context, @Nullable String uid, long secondtime) {
        return PPGFilePathService.INSTANCE.getRRPath(context, uid, ((Object) a(uid)) + secondtime + "-af-acc.txt");
    }

    @Nullable
    public final File getAfPpgFile(@NotNull Context context, @Nullable String uid, long secondtime) {
        return PPGFilePathService.INSTANCE.getRRPath(context, uid, ((Object) a(uid)) + secondtime + "-ppg-ab.txt");
    }

    @Nullable
    public final File getHrPpgFile(@NotNull Context context, @Nullable String uid, long secondtime) {
        return PPGFilePathService.INSTANCE.getRRPath(context, uid, ((Object) a(uid)) + secondtime + "-hr-ppg.txt");
    }

    @NotNull
    public final File getRRPeakZipFile(@NotNull Context context, @NotNull String userId, long time) {
        return PPGFilePathService.INSTANCE.getRRPath(context, userId, time + "-rr.zip");
    }

    public final boolean saveByteData(@Nullable List<Byte> data, @Nullable File savedFile) throws Throwable {
        if (!((data == null || savedFile == null) ? false : true)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(savedFile);
                try {
                    fileOutputStream2.write(PPGExtensionsKt.listToByteArray(data));
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

    @Nullable
    public final File saveRRRaw(@NotNull Context context, @NotNull String uid, long second, @Nullable List<Byte> rrData) throws IOException {
        File fileB = b(context, uid, second);
        if (fileB == null) {
            HMLog.error$default(TAG, null, null, new c(second), 6, null);
            return null;
        }
        if (fileB.exists() && fileB.delete()) {
            HMLog.debug(TAG, new d(second, fileB));
        }
        if (saveByteData(rrData, fileB)) {
            return fileB;
        }
        HMLog.info(TAG, new e(second));
        return null;
    }

    @Nullable
    public final File saveRawData(@Nullable File file, long second, @Nullable List<Byte> pgabData) throws IOException {
        if (file == null) {
            HMLog.info(TAG, new f(second));
            return null;
        }
        if (file.exists() && file.delete()) {
            HMLog.debug(TAG, new g(second, file));
        }
        if (saveByteData(pgabData, file)) {
            return file;
        }
        HMLog.info(TAG, new h(second));
        return null;
    }

    public final void zipFiles(@NotNull Collection<? extends File> resFileList, @NotNull File zipFile) throws IOException {
        ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(zipFile), 1048576));
        Iterator<? extends File> it2 = resFileList.iterator();
        while (it2.hasNext()) {
            c(it2.next(), zipOutputStream, "");
        }
        zipOutputStream.close();
    }
}
