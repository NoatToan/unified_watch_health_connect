package com.huami.widget.share.utils;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.core.content.FileProvider;
import com.huami.tools.analytics.DbUtils;
import com.huami.widget.share.R;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import java.io.File;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u001e\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0002\u001a\u001a\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u001a\b\u0010\r\u001a\u00020\u000bH\u0003¨\u0006\u000e"}, d2 = {"Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "path", "Landroid/net/Uri;", "getExternalUri", "Lcom/tencent/mm/opensdk/openapi/IWXAPI;", "api", "filePath", "getWxImageContent", "c", "", "b", "a", "share_release"}, k = 2, mv = {1, 5, 1})
public final class UriCompatKt {
    @ChecksSdkIntAtLeast(api = 24)
    private static final boolean a() {
        return Build.VERSION.SDK_INT >= 24;
    }

    private static final boolean b(IWXAPI iwxapi) {
        return iwxapi.getWXAppSupportAPI() >= 654314752;
    }

    private static final Uri c(Context context, String str) {
        Object objM3845constructorimpl;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String string = context.getString(R.string.share_provider_file_authorities);
        try {
            Result.Companion companion = Result.Companion;
            Uri uriForFile = FileProvider.getUriForFile(context.getApplicationContext(), string, new File(str));
            context.grantUriPermission("com.tencent.mm", uriForFile, 1);
            objM3845constructorimpl = Result.m3845constructorimpl(uriForFile);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        return (Uri) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:14:0x0042 A[PHI: r11
      0x0042: PHI (r11v5 android.database.Cursor) = (r11v6 android.database.Cursor), (r11v7 android.database.Cursor) binds: [B:25:0x0056, B:12:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:5:0x0021  */
    /* JADX WARN: Code duplicated, block: B:9:0x002b A[Catch: all -> 0x0046, Exception -> 0x0048, TRY_LEAVE, TryCatch #4 {Exception -> 0x0048, all -> 0x0046, blocks: (B:9:0x002b, B:6:0x0023), top: B:27:0x0023 }] */
    @Nullable
    public static final Uri getExternalUri(@NotNull Context context, @NotNull String str) throws Throwable {
        Throwable th;
        Cursor cursorQuery;
        boolean z;
        Uri contentUri = MediaStore.Files.getContentUri("external");
        try {
            cursorQuery = context.getContentResolver().query(contentUri, new String[]{"_id"}, "_data= ?", new String[]{str}, null);
            if (cursorQuery == null) {
                if (z) {
                    Uri uriWithAppendedPath = Uri.withAppendedPath(contentUri, String.valueOf(cursorQuery.getInt(cursorQuery.getColumnIndex("_id"))));
                    cursorQuery.close();
                    return uriWithAppendedPath;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } else {
                try {
                    z = cursorQuery.moveToFirst();
                    if (z) {
                        Uri uriWithAppendedPath2 = Uri.withAppendedPath(contentUri, String.valueOf(cursorQuery.getInt(cursorQuery.getColumnIndex("_id"))));
                        cursorQuery.close();
                        return uriWithAppendedPath2;
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

    @NotNull
    public static final String getWxImageContent(@NotNull IWXAPI iwxapi, @NotNull Context context, @NotNull String str) throws Throwable {
        if (!b(iwxapi) || !a()) {
            return str;
        }
        Uri externalUri = getExternalUri(context, str);
        String string = externalUri == null ? null : externalUri.toString();
        if (string == null) {
            string = String.valueOf(c(context, str));
        }
        return string;
    }
}
