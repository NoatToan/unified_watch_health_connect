package com.xiaomi.hm.health.device.watch_skin;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004R\u0016\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/device/watch_skin/UriUtils;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/net/Uri;", "inputUri", "outputUri", "", "savePhotoFromUriToUri", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class UriUtils {

    @NotNull
    public static final UriUtils INSTANCE = new UriUtils();

    @NotNull
    public static final String TAG = "UriUtils";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Uri a;
        public final /* synthetic */ Exception b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Uri uri, Exception exc) {
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

    private UriUtils() {
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
                            return true;
                        }
                        fileOutputStreamCreateOutputStream.write(bArr, 0, i);
                    }
                }
                return false;
            } catch (Exception e) {
                HMLog.info(TAG, new a(inputUri, e));
            }
        }
        return false;
    }
}
