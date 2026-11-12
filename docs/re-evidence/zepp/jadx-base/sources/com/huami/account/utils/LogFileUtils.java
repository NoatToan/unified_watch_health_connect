package com.huami.account.utils;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.huami.devicerecorder.UriGetter;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.FileUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u001a\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004J(\u0010\u0015\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u0016\u0010\u0017\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0004R\u0016\u0010\u0019\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/huami/account/utils/LogFileUtils;", "", "Ljava/util/zip/ZipOutputStream;", "zos", "Ljava/io/File;", "srcFile", "", "excludeName", "", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/net/Uri;", "uri", "c", "path", "b", "zipFile", "", "archiveLogFiles", "dir", "archiveDir", "file", "shareFile", "Ljava/lang/String;", "TAG", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class LogFileUtils {

    @NotNull
    public static final LogFileUtils INSTANCE = new LogFileUtils();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "LogFileUtils";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ File a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File file, String str) {
            super(0);
            this.a = file;
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Adding directory: " + this.a.getName() + ",excludeName:" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ File a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(File file) {
            super(0);
            this.a = file;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Adding file: " + this.a.getName();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ IOException a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(IOException iOException) {
            super(0);
            this.a = iOException;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "IOException :" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ IOException a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(IOException iOException) {
            super(0);
            this.a = iOException;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Error creating zip file: " + this.a;
        }
    }

    private LogFileUtils() {
    }

    private final void a(ZipOutputStream zos, File srcFile, String excludeName) {
        HMLog.debug(TAG, new a(srcFile, excludeName));
        File[] fileArrListFiles = srcFile.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        int length = fileArrListFiles.length;
        int i = 0;
        while (i < length) {
            File file = fileArrListFiles[i];
            i++;
            if (file.isDirectory()) {
                a(zos, file, excludeName);
            } else if (TextUtils.isEmpty(excludeName) || !Intrinsics.areEqual(excludeName, file.getName())) {
                try {
                    HMLog.debug(TAG, new b(file));
                    byte[] bArr = new byte[1024];
                    FileInputStream fileInputStream = new FileInputStream(file);
                    zos.putNextEntry(new ZipEntry(file.getName()));
                    while (true) {
                        int i2 = fileInputStream.read(bArr);
                        if (i2 <= 0) {
                            break;
                        } else {
                            zos.write(bArr, 0, i2);
                        }
                    }
                    zos.closeEntry();
                    fileInputStream.close();
                } catch (IOException e) {
                    HMLog.debug(TAG, new c(e));
                }
            }
        }
    }

    public static /* synthetic */ boolean archiveDir$default(LogFileUtils logFileUtils, String str, File file, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        return logFileUtils.archiveDir(str, file, str2);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0044 A[PHI: r12
      0x0044: PHI (r12v5 android.database.Cursor) = (r12v6 android.database.Cursor), (r12v7 android.database.Cursor) binds: [B:27:0x0058, B:14:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:5:0x0021  */
    private final Uri b(Context context, String path) throws Throwable {
        Throwable th;
        Cursor cursorQuery;
        boolean z;
        int columnIndex;
        Uri contentUri = MediaStore.Files.getContentUri("external");
        try {
            cursorQuery = context.getContentResolver().query(contentUri, new String[]{"_id"}, "_data= ?", new String[]{path}, null);
            if (cursorQuery == null) {
                if (!z && (columnIndex = cursorQuery.getColumnIndex("_id")) >= 0) {
                    Uri uriWithAppendedPath = Uri.withAppendedPath(contentUri, String.valueOf(cursorQuery.getInt(columnIndex)));
                    cursorQuery.close();
                    return uriWithAppendedPath;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } else {
                try {
                    z = cursorQuery.moveToFirst();
                    if (!z) {
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (Exception unused) {
                    if (cursorQuery != null) {
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th;
                }
            }
        } catch (Exception unused2) {
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            cursorQuery = null;
        }
        return null;
    }

    private final void c(Context context, Uri uri) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(UriGetter.ShareContentType.File);
        intent.putExtra("android.intent.extra.STREAM", uri);
        intent.addFlags(1);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    @JvmOverloads
    public final boolean archiveDir(@Nullable String str, @Nullable File file) {
        return archiveDir$default(this, str, file, null, 4, null);
    }

    @JvmOverloads
    public final boolean archiveDir(@Nullable String dir, @Nullable File zipFile, @Nullable String excludeName) {
        if (dir == null || zipFile == null) {
            return false;
        }
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(zipFile));
            a(zipOutputStream, new File(dir), excludeName);
            zipOutputStream.close();
            return true;
        } catch (IOException e) {
            HMLog.debug(TAG, new d(e));
            return false;
        }
    }

    public final boolean archiveLogFiles(@Nullable Context context, @Nullable File zipFile) {
        return archiveDir$default(this, FileUtils.getLogRootDir(context), zipFile, null, 4, null);
    }

    public final void shareFile(@NotNull Context context, @NotNull File file) {
        c(context, b(context, file.getAbsolutePath()));
    }
}
