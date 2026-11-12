package com.huami.watch.companion.cloud.api;

import android.content.Context;
import android.text.TextUtils;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.cloud.CloudClient;
import com.huami.watch.util.Log;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\u000b\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/huami/watch/companion/cloud/api/FileDownloadApi;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "url", "", "getData", "getFileNameByUrl", "a", "Ljava/lang/String;", "TAG", "<init>", "()V", "companion_release"}, k = 1, mv = {1, 5, 1})
public final class FileDownloadApi {

    @NotNull
    public static final FileDownloadApi INSTANCE = new FileDownloadApi();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "FileDownloadApi";

    private FileDownloadApi() {
    }

    @Nullable
    public final byte[] getData(@NotNull Context context, @NotNull String url) {
        byte[] bArrBytes;
        ResponseBody responseBodyBody;
        if (TextUtils.isEmpty(url)) {
            return null;
        }
        try {
            Response responseDoRequest = CloudClient.doRequest(context, CloudClient.newGet(url));
            bArrBytes = (!responseDoRequest.isSuccessful() || (responseBodyBody = responseDoRequest.body()) == null) ? null : responseBodyBody.bytes();
        } catch (IOException e) {
            e.printStackTrace();
            Log.e(TAG, "Get File Data:error:" + e, new Object[0]);
        }
        Log.d(TAG, "Get File Data : " + (bArrBytes != null ? bArrBytes.toString() : null), new Object[0]);
        return bArrBytes;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0071  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v4, types: [okhttp3.Response] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r2v2, types: [okhttp3.Response] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Nullable
    public final String getFileNameByUrl(@NotNull Context context, @NotNull String url) throws Throwable {
        Response responseDoRequest;
        String strSubstring = null;
        strSubstring = null;
        strSubstring = null;
        ?? r2 = 0;
        if (!TextUtils.isEmpty(url)) {
            try {
                try {
                    responseDoRequest = CloudClient.doRequest(context, CloudClient.newGet(url));
                    try {
                        String string = responseDoRequest.request().url().toString();
                        Log.d(TAG, "getFileNameByUrl:realUrl" + string, new Object[0]);
                        strSubstring = string.substring(StringsKt__StringsKt.lastIndexOf$default((CharSequence) string, FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE, 0, false, 6, (Object) null) + 1);
                        context = responseDoRequest;
                    } catch (IOException e) {
                        e = e;
                        e.printStackTrace();
                        Log.e(TAG, "Get File Name:error:" + e, new Object[0]);
                        context = responseDoRequest;
                        if (responseDoRequest != null) {
                        }
                        return strSubstring;
                    }
                } catch (Throwable th) {
                    th = th;
                    r2 = context;
                    if (r2 != 0) {
                        r2.close();
                    }
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                responseDoRequest = null;
            } catch (Throwable th2) {
                th = th2;
                if (r2 != 0) {
                    r2.close();
                }
                throw th;
            }
            context.close();
        }
        return strSubstring;
    }
}
