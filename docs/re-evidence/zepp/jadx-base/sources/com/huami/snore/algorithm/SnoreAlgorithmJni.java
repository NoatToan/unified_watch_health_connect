package com.huami.snore.algorithm;

import android.content.Context;
import com.huami.snore.core.ext.KoinExtKt;
import com.huami.snore.core.manager.SnoreFileManager;
import com.huami.tools.analytics.DbUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.text.m;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010!\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\"\u0010#J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\u000e\u001a\u00020\rJ\u0019\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\tH\u0086 J\u0011\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0011H\u0086 J#\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0086 J\u0011\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0011H\u0086 R\"\u0010\u001d\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0013\u0010 \u001a\u00020\t8F@\u0006¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lcom/huami/snore/algorithm/SnoreAlgorithmJni;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "fileName", "a", "", HTTP.CONTENT_RANGE_BYTES, "", "len", "", "sendData", "", "getDb", "modelPath", "noSnoreTime", "", "createNativeObject", "addr", "nativeGetBd", "tytes", "nativSendData", "nativeGetResult", "J", "getSnoreClass", "()J", "setSnoreClass", "(J)V", "snoreClass", "getResult", "()I", "result", "modelName", "<init>", "(Ljava/lang/String;I)V", "snore_release"}, k = 1, mv = {1, 5, 1})
public final class SnoreAlgorithmJni {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private long snoreClass;

    public SnoreAlgorithmJni(@NotNull String str, int i) {
        this.snoreClass = createNativeObject(a(KoinExtKt.getAppContext(), str), i);
    }

    private final String a(Context context, String fileName) {
        File file = new File(SnoreFileManager.INSTANCE.getStoragePath(context), fileName);
        if (!file.exists()) {
            for (String str : file.getParentFile().list()) {
                if (m.startsWith$default(str, "model", false, 2, null) && m.endsWith$default(str, ".tflite", false, 2, null)) {
                    File file2 = new File(SnoreFileManager.INSTANCE.getStoragePath(context), str);
                    if (file2.exists()) {
                        file2.delete();
                    }
                }
            }
            try {
                InputStream inputStreamOpen = context.getAssets().open(fileName);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[1024];
                        for (int i = inputStreamOpen.read(bArr); i > 0; i = inputStreamOpen.read(bArr)) {
                            fileOutputStream.write(bArr, 0, i);
                        }
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(fileOutputStream, null);
                        CloseableKt.closeFinally(inputStreamOpen, null);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            CloseableKt.closeFinally(fileOutputStream, th);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        CloseableKt.closeFinally(inputStreamOpen, th3);
                        throw th4;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return file.getAbsolutePath();
    }

    public final native long createNativeObject(@NotNull String modelPath, int noSnoreTime);

    public final double getDb() {
        return nativeGetBd(this.snoreClass);
    }

    public final int getResult() {
        return nativeGetResult(this.snoreClass);
    }

    public final long getSnoreClass() {
        return this.snoreClass;
    }

    public final native void nativSendData(long addr, @Nullable byte[] tytes, int len);

    public final native double nativeGetBd(long addr);

    public final native int nativeGetResult(long addr);

    public final void sendData(@Nullable byte[] bytes, int len) {
        nativSendData(this.snoreClass, bytes, len);
    }

    public final void setSnoreClass(long j) {
        this.snoreClass = j;
    }
}
