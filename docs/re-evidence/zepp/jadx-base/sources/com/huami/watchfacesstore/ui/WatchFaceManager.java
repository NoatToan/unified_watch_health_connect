package com.huami.watchfacesstore.ui;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import androidx.multidex.MultiDexExtractor;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watchfacesstore.ext.KoinExtKt;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b%\u0010&J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ\u0010\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\bJ\u0018\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\bJ\u000e\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bJ\u0018\u0010\u0015\u001a\u00020\u00142\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u0002J\"\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018R\u0016\u0010\u001d\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/huami/watchfacesstore/ui/WatchFaceManager;", "", "Ljava/io/File;", "file", "excludeFile", "", "b", "a", "", "deviceId", "watchfaceId", "getWatchPathByDeviceAndUrl", "path", "delete", "excludePath", "skinBin", "getBinName", "getDialFileName", "source", "dest", "", "copyFile", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/net/Uri;", "inputUri", "outputUri", "savePhotoFromUriToUri", "Ljava/lang/String;", "TAG", "WATCH_SKIN_FILE_PATH", "c", "WATCH_FACE_PARENT_PATH", "", GoogleApiAvailabilityLight.a, LogUtil.I, "COPY_FILE_PER_SIZE", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class WatchFaceManager {

    @NotNull
    public static final WatchFaceManager INSTANCE = new WatchFaceManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "WatchSkinManager";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String WATCH_SKIN_FILE_PATH = "watch_skin_local";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private static final String WATCH_FACE_PARENT_PATH;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final int COPY_FILE_PER_SIZE = 1024;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "makeDir fail.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "createNewFile fail.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "copyFile fail.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "savePhotoFromUriToUri success";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ Uri a;
        public final /* synthetic */ Exception b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Uri uri, Exception exc) {
            super(0);
            this.a = uri;
            this.b = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Failed to write photo: " + this.a + " because: " + this.b;
        }
    }

    static {
        String str;
        try {
            str = KoinExtKt.getAppContext().getFilesDir().getAbsolutePath() + File.separator + WATCH_SKIN_FILE_PATH;
        } catch (Exception unused) {
            str = null;
        }
        WATCH_FACE_PARENT_PATH = str;
    }

    private WatchFaceManager() {
    }

    private final void a(File file) {
        try {
            if (file.isFile()) {
                file.delete();
                return;
            }
            if (file.isDirectory()) {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    int i = 0;
                    if (!(fileArrListFiles.length == 0)) {
                        int length = fileArrListFiles.length;
                        while (i < length) {
                            File file2 = fileArrListFiles[i];
                            i++;
                            a(file2);
                        }
                        file.delete();
                        return;
                    }
                }
                file.delete();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private final void b(File file, File excludeFile) {
        try {
            if (file.isFile()) {
                file.delete();
                return;
            }
            if (file.isDirectory()) {
                File[] fileArrListFiles = file.listFiles();
                int i = 0;
                if (fileArrListFiles == null) {
                    fileArrListFiles = new File[0];
                }
                int length = fileArrListFiles.length;
                while (i < length) {
                    File file2 = fileArrListFiles[i];
                    i++;
                    if (!Intrinsics.areEqual(file2, excludeFile)) {
                        a(file2);
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082 A[Catch: Exception -> 0x0086, TRY_LEAVE, TryCatch #5 {Exception -> 0x0086, blocks: (B:46:0x007c, B:49:0x0082), top: B:68:0x007c }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0097  */
    /* JADX WARN: Code duplicated, block: B:61:0x0098 A[Catch: Exception -> 0x009c, TRY_LEAVE, TryCatch #2 {Exception -> 0x009c, blocks: (B:58:0x0092, B:61:0x0098), top: B:66:0x0092 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final boolean copyFile(@Nullable File source, @NotNull File dest) throws Throwable {
        FileOutputStream fileOutputStream;
        Exception exc;
        FileOutputStream fileOutputStream2;
        Throwable th;
        FileInputStream fileInputStream = null;
        try {
            if (!dest.exists()) {
                File parentFile = dest.getParentFile();
                Objects.requireNonNull(parentFile);
                if (!parentFile.exists() && !dest.getParentFile().mkdir()) {
                    HMLog.info(TAG, a.a);
                    return false;
                }
                if (!dest.createNewFile()) {
                    HMLog.info(TAG, b.a);
                    return false;
                }
            }
            FileInputStream fileInputStream2 = new FileInputStream(source);
            try {
                fileOutputStream2 = new FileOutputStream(dest);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = fileInputStream2.read(bArr);
                        if (i <= 0) {
                            try {
                                fileInputStream2.close();
                                fileOutputStream2.close();
                                return true;
                            } catch (Exception e2) {
                                e2.printStackTrace();
                                return true;
                            }
                        }
                        fileOutputStream2.write(bArr, 0, i);
                    }
                } catch (Exception e3) {
                    exc = e3;
                    fileInputStream = fileInputStream2;
                    try {
                        HMLog.error$default(TAG, null, exc, c.a, 2, null);
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                                if (fileOutputStream2 == null) {
                                    fileOutputStream2.close();
                                }
                            } catch (Exception e4) {
                                e4.printStackTrace();
                                return false;
                            }
                        } else if (fileOutputStream2 == null) {
                            fileOutputStream2.close();
                        }
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        Throwable th3 = th;
                        fileOutputStream = fileOutputStream2;
                        th = th3;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Exception e5) {
                                e5.printStackTrace();
                                throw th;
                            }
                        }
                        if (fileOutputStream == null) {
                            throw th;
                        }
                        fileOutputStream.close();
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    fileInputStream = fileInputStream2;
                    Throwable th5 = th;
                    fileOutputStream = fileOutputStream2;
                    th = th5;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    if (fileOutputStream == null) {
                        throw th;
                    }
                    fileOutputStream.close();
                    throw th;
                }
            } catch (Exception e6) {
                exc = e6;
                fileOutputStream2 = null;
            } catch (Throwable th6) {
                th = th6;
                fileOutputStream = null;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream == null) {
                    throw th;
                }
                fileOutputStream.close();
                throw th;
            }
        } catch (Exception e7) {
            exc = e7;
            fileOutputStream2 = null;
        } catch (Throwable th7) {
            th = th7;
            fileOutputStream = null;
        }
    }

    public final void delete(@Nullable String path) {
        if (path == null || path.length() == 0) {
            return;
        }
        File file = new File(path);
        if (file.exists()) {
            a(file);
        }
    }

    @NotNull
    public final String getBinName(@NotNull String skinBin) {
        try {
            Object[] array = StringsKt__StringsKt.split$default((CharSequence) skinBin, new String[]{FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE}, false, 0, 6, (Object) null).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr = (String[]) array;
            Object[] array2 = StringsKt__StringsKt.split$default((CharSequence) strArr[strArr.length - 1], new String[]{"."}, false, 0, 6, (Object) null).toArray(new String[0]);
            if (array2 != null) {
                return ((String[]) array2)[0];
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Exception unused) {
            return String.valueOf(System.currentTimeMillis());
        }
    }

    @NotNull
    public final String getDialFileName(@NotNull String skinBin) {
        try {
            Object[] array = StringsKt__StringsKt.split$default((CharSequence) skinBin, new String[]{FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE}, false, 0, 6, (Object) null).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr = (String[]) array;
            return strArr[strArr.length - 1];
        } catch (Exception unused) {
            return System.currentTimeMillis() + MultiDexExtractor.EXTRACTED_SUFFIX;
        }
    }

    @Nullable
    public final String getWatchPathByDeviceAndUrl(@NotNull String deviceId, @NotNull String watchfaceId) {
        String str = WATCH_FACE_PARENT_PATH;
        if (str == null) {
            return null;
        }
        return str + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + deviceId + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + watchfaceId;
    }

    public final boolean savePhotoFromUriToUri(@NotNull Context context, @Nullable Uri inputUri, @Nullable Uri outputUri) {
        if (inputUri != null && outputUri != null) {
            try {
                AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(outputUri, "rw");
                FileOutputStream fileOutputStreamCreateOutputStream = assetFileDescriptorOpenAssetFileDescriptor == null ? null : assetFileDescriptorOpenAssetFileDescriptor.createOutputStream();
                InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(inputUri);
                if (fileOutputStreamCreateOutputStream != null && inputStreamOpenInputStream != null) {
                    byte[] bArr = new byte[16384];
                    while (true) {
                        int i = inputStreamOpenInputStream.read(bArr);
                        if (i <= 0) {
                            HMLog.info(TAG, d.a);
                            return true;
                        }
                        fileOutputStreamCreateOutputStream.write(bArr, 0, i);
                    }
                }
                return false;
            } catch (Exception e2) {
                HMLog.info(TAG, new e(inputUri, e2));
            }
        }
        return false;
    }

    public final void delete(@Nullable String path, @NotNull String excludePath) {
        if (path == null || path.length() == 0) {
            return;
        }
        File file = new File(path);
        if (file.exists()) {
            b(file, new File(excludePath));
        }
    }
}
