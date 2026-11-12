package com.huami.widget.share.utils;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.util.net.NetUtil;
import com.huami.widget.share.R;
import com.huami.widget.share.ShareTarget;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import com.xiaomi.hm.health.Constant;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0007J\"\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u0006H\u0007R\u0016\u0010\u0011\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/huami/widget/share/utils/ShareUtils;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/widget/share/ShareTarget;", "target", "", "getUninstallStr", "a", "c", "", "isNetworkConnected", "Ljava/io/File;", "internalImage", FileDownloadModel.FILENAME, "copyImageToExternalStorage", "Ljava/lang/String;", "TAG", "<init>", "()V", "share_release"}, k = 1, mv = {1, 5, 1})
public final class ShareUtils {

    @NotNull
    public static final ShareUtils INSTANCE = new ShareUtils();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "ShareUtils";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "openOutputStream 失败，返回 null";
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
            return "insert 失败，返回 null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "保存图片失败: " + Log.getStackTraceString(this.a);
        }
    }

    private ShareUtils() {
    }

    private final String a(Context context, ShareTarget target) {
        int i = target.type;
        if (i == 1 || i == 2) {
            return context.getString(R.string.share_weixin_label_untranslates);
        }
        if (i == 15) {
            return context.getString(R.string.share_instagram_label_untranslates);
        }
        switch (i) {
            case 4:
                return context.getString(R.string.share_weibo_label);
            case 5:
                return context.getString(R.string.share_qq_zone_label);
            case 6:
                return context.getString(R.string.share_qq_label);
            case 7:
                return context.getString(R.string.share_line_label_untranslates);
            case 8:
                return context.getString(R.string.share_facebook_label_untranslates);
            case 9:
                return context.getString(R.string.share_twitter_label_untranslates);
            default:
                return "";
        }
    }

    @JvmStatic
    public static final boolean copyImageToExternalStorage(@NotNull Context context, @NotNull File internalImage, @NotNull String filename) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            String str = Environment.DIRECTORY_PICTURES;
            Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", filename);
            contentValues.put("mime_type", MimeTypes.IMAGE_JPEG);
            if (Build.VERSION.SDK_INT >= 29) {
                contentValues.put("relative_path", str);
            }
            ContentResolver contentResolver = context.getContentResolver();
            Uri uriInsert = contentResolver.insert(uri, contentValues);
            if (uriInsert == null) {
                HMLog.info(TAG, b.a);
            } else {
                OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
                if (outputStreamOpenOutputStream != null) {
                    ByteStreamsKt.copyTo$default(new FileInputStream(internalImage), outputStreamOpenOutputStream, 0, 2, null);
                    return true;
                }
                HMLog.info(TAG, a.a);
            }
            objM3845constructorimpl = Result.m3845constructorimpl(false);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.info(TAG, new c(thM3848exceptionOrNullimpl));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = bool;
        }
        return ((Boolean) objM3845constructorimpl).booleanValue();
    }

    public static /* synthetic */ boolean copyImageToExternalStorage$default(Context context, File file, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = Constant.SHARE_FILE_NAME;
        }
        return copyImageToExternalStorage(context, file, str);
    }

    @JvmStatic
    @NotNull
    public static final String getUninstallStr(@NotNull Context context, @NotNull ShareTarget target) {
        String strA = INSTANCE.a(context, target);
        return TextUtils.isEmpty(strA) ? "" : context.getString(R.string.share_uninstall, strA);
    }

    @Deprecated(message = "", replaceWith = @ReplaceWith(expression = "NetUtil.networkInfo().isNetworkConnect()", imports = {"com.huami.util.net.NetUtil"}))
    @JvmStatic
    public static final boolean isNetworkConnected(@NotNull Context c2) {
        return NetUtil.INSTANCE.networkInfo().isNetworkConnect();
    }
}
