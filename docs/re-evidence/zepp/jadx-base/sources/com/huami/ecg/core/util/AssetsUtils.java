package com.huami.ecg.core.util;

import android.content.Context;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u001e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004R\u0016\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/huami/ecg/core/util/AssetsUtils;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "assetsFile", "desPath", "", "a", "assetFile", "internalFile", "copyAsset2Internal", "TAG", "Ljava/lang/String;", "", "BYTE_SIZE", LogUtil.I, "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class AssetsUtils {
    public static final int BYTE_SIZE = 1024;
    public static final AssetsUtils INSTANCE = new AssetsUtils();

    @NotNull
    public static final String TAG = "AssetsUtils";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Ref.ObjectRef c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, Ref.ObjectRef objectRef) {
            super(0);
            this.a = str;
            this.b = str2;
            this.c = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "assetsFile:" + this.a + ", desPath:" + this.b + ", length:" + ((InputStream) this.c.element).available();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "copyAssetFileByStream() " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ IOException a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(IOException iOException) {
            super(0);
            this.a = iOException;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "copyAssetFileByStream() " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ IOException a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(IOException iOException) {
            super(0);
            this.a = iOException;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "copyAssetFileByStream() " + this.a;
        }
    }

    private AssetsUtils() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11, types: [T, java.io.InputStream] */
    private final boolean a(Context context, String assetsFile, String desPath) throws Throwable {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        FileOutputStream fileOutputStream = null;
        objectRef.element = null;
        try {
            objectRef.element = context.getAssets().open(assetsFile);
            HMLog.info(TAG, new a(assetsFile, desPath, objectRef));
            FileOutputStream fileOutputStream2 = new FileOutputStream(desPath);
            try {
                byte[] bArr = new byte[1024];
                Ref.IntRef intRef = new Ref.IntRef();
                while (true) {
                    int i = ((InputStream) objectRef.element).read(bArr);
                    intRef.element = i;
                    if (i == -1) {
                        break;
                    }
                    fileOutputStream2.write(bArr, 0, i);
                }
                fileOutputStream2.flush();
                try {
                    InputStream inputStream = (InputStream) objectRef.element;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException e) {
                    HMLog.info(TAG, new c(e));
                }
                try {
                    fileOutputStream2.close();
                } catch (IOException e2) {
                    HMLog.info(TAG, new d(e2));
                }
                return true;
            } catch (Exception e3) {
                e = e3;
                fileOutputStream = fileOutputStream2;
                HMLog.info(TAG, new b(e));
                try {
                    InputStream inputStream2 = (InputStream) objectRef.element;
                    if (inputStream2 != null) {
                        inputStream2.close();
                    }
                } catch (IOException e4) {
                    HMLog.info(TAG, new c(e4));
                }
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e5) {
                        HMLog.info(TAG, new d(e5));
                    }
                }
                return false;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                try {
                    InputStream inputStream3 = (InputStream) objectRef.element;
                    if (inputStream3 != null) {
                        inputStream3.close();
                    }
                } catch (IOException e6) {
                    HMLog.info(TAG, new c(e6));
                }
                if (fileOutputStream == null) {
                    throw th;
                }
                try {
                    fileOutputStream.close();
                    throw th;
                } catch (IOException e7) {
                    HMLog.info(TAG, new d(e7));
                    throw th;
                }
            }
        } catch (Exception e8) {
            e = e8;
        }
    }

    @NotNull
    public final String copyAsset2Internal(@NotNull Context context, @NotNull String assetFile, @NotNull String internalFile) {
        String str = context.getFilesDir().getPath() + internalFile;
        return (new File(str).exists() || a(context, assetFile, str)) ? str : "";
    }
}
