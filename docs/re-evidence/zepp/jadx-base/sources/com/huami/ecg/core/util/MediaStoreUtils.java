package com.huami.ecg.core.util;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u001a\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/huami/ecg/core/util/MediaStoreUtils;", "", "", "path", "", "isNeedMediastore", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "isFileExsits", "", "getFileSize", "", "getFileByteArray", "TAG", "Ljava/lang/String;", "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class MediaStoreUtils {
    public static final MediaStoreUtils INSTANCE = new MediaStoreUtils();

    @NotNull
    public static final String TAG = "MediaStoreUtils";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
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

    private MediaStoreUtils() {
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032 A[Catch: all -> 0x002a, Exception -> 0x002d, TryCatch #10 {Exception -> 0x002d, all -> 0x002a, blocks: (B:10:0x0025, B:16:0x0032, B:18:0x0038, B:19:0x003d), top: B:61:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0038 A[Catch: all -> 0x002a, Exception -> 0x002d, LOOP:0: B:15:0x0030->B:18:0x0038, LOOP_END, TryCatch #10 {Exception -> 0x002d, all -> 0x002a, blocks: (B:10:0x0025, B:16:0x0032, B:18:0x0038, B:19:0x003d), top: B:61:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x002f A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0036 -> B:14:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public final byte[] getFileByteArray(@org.jetbrains.annotations.NotNull android.content.Context r6, @org.jetbrains.annotations.Nullable java.lang.String r7) {
        /*
            r5 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            android.content.ContentResolver r6 = r6.getContentResolver()
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L5e
            java.io.InputStream r6 = r6.openInputStream(r7)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L5e
            java.io.DataOutputStream r7 = new java.io.DataOutputStream     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            r1 = -1
            if (r6 == 0) goto L2f
            int r3 = r6.read(r2)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2d
            goto L30
        L2a:
            r0 = move-exception
            r1 = r7
            goto L51
        L2d:
            r1 = r7
            goto L5f
        L2f:
            r3 = -1
        L30:
            if (r3 <= 0) goto L3d
            r4 = 0
            r7.write(r2, r4, r3)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2d
            if (r6 == 0) goto L2f
            int r3 = r6.read(r2)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2d
            goto L30
        L3d:
            r7.flush()     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2d
            r7.close()     // Catch: java.io.IOException -> L44
            goto L45
        L44:
        L45:
            if (r6 == 0) goto L69
        L47:
            r6.close()     // Catch: java.io.IOException -> L69
            goto L69
        L4b:
            r0 = move-exception
            goto L51
        L4d:
            goto L5f
        L4f:
            r0 = move-exception
            r6 = r1
        L51:
            if (r1 == 0) goto L58
            r1.close()     // Catch: java.io.IOException -> L57
            goto L58
        L57:
        L58:
            if (r6 == 0) goto L5d
            r6.close()     // Catch: java.io.IOException -> L5d
        L5d:
            throw r0
        L5e:
            r6 = r1
        L5f:
            if (r1 == 0) goto L66
            r1.close()     // Catch: java.io.IOException -> L65
            goto L66
        L65:
        L66:
            if (r6 == 0) goto L69
            goto L47
        L69:
            byte[] r6 = r0.toByteArray()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huami.ecg.core.util.MediaStoreUtils.getFileByteArray(android.content.Context, java.lang.String):byte[]");
    }

    public final long getFileSize(@NotNull Context context, @Nullable String path) {
        if (TextUtils.isEmpty(path)) {
            return 0L;
        }
        if (!isNeedMediastore(path)) {
            return new File(path).length();
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(Uri.parse(path), "r");
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                return parcelFileDescriptorOpenFileDescriptor.getStatSize();
            }
            return 0L;
        } catch (Exception e) {
            HMLog.warn(TAG, e, new a(e));
            return 0L;
        }
    }

    public final boolean isFileExsits(@NotNull Context context, @Nullable String path) {
        if (TextUtils.isEmpty(path)) {
            return false;
        }
        try {
            return context.getContentResolver().openFileDescriptor(Uri.parse(path), "r") != null;
        } catch (Exception e) {
            HMLog.warn(TAG, e, new b(e));
            return false;
        }
    }

    public final boolean isNeedMediastore(@Nullable String path) {
        if (TextUtils.isEmpty(path)) {
            return false;
        }
        if (path == null) {
            Intrinsics.throwNpe();
        }
        return m.startsWith$default(path, "content", false, 2, null);
    }
}
