package com.huami.applet.extension;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;
import com.huami.applet.AppletConfig;
import com.huami.applet.extension.ContextExtKt;
import com.huami.applet.utils.UtilsKt;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.io.TextStreamsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0000\u001a\u0016\u0010\f\u001a\u00020\u000b*\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0000\u001a\n\u0010\r\u001a\u00020\u0001*\u00020\u0000¨\u0006\u000e"}, d2 = {"Landroid/content/Context;", "", "isDebug", "", "filePath", "readAssetsFileContent", "appId", "Ljava/io/File;", "getAppletKVDir", "getAppletFilesDir", "msg", "", "toast", "isNetworkConnected", "applet_release"}, k = 2, mv = {1, 5, 1})
public final class ContextExtKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Context context, String str) {
        Toast.makeText(context, str, 0).show();
    }

    @NotNull
    public static final File getAppletFilesDir(@NotNull Context context, @NotNull String str) {
        return new File(((Object) context.getFilesDir().getAbsolutePath()) + "/applet_companion/" + ((Object) AppletConfig.INSTANCE.getUserId()) + '/' + str + "/files");
    }

    @NotNull
    public static final File getAppletKVDir(@NotNull Context context, @NotNull String str) {
        return new File(((Object) context.getFilesDir().getAbsolutePath()) + "/applet_companion/" + ((Object) AppletConfig.INSTANCE.getUserId()) + '/' + str + "/kv");
    }

    public static final boolean isDebug(@NotNull Context context) {
        return (context.getApplicationInfo() == null || (context.getApplicationInfo().flags & 2) == 0) ? false : true;
    }

    public static final boolean isNetworkConnected(@NotNull Context context) {
        Object systemService = context.getSystemService("connectivity");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Nullable
    public static final String readAssetsFileContent(@NotNull Context context, @NotNull String str) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            List<String> lines = TextStreamsKt.readLines(new InputStreamReader(context.getAssets().open(str)));
            StringBuilder sb = new StringBuilder();
            Iterator<T> it2 = lines.iterator();
            while (it2.hasNext()) {
                sb.append((String) it2.next());
                sb.append("\n");
            }
            objM3845constructorimpl = Result.m3845constructorimpl(sb.toString());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            thM3848exceptionOrNullimpl.printStackTrace();
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        return (String) objM3845constructorimpl;
    }

    public static final void toast(@NotNull final Context context, @Nullable final String str) {
        if (str == null) {
            return;
        }
        UtilsKt.executeOnMainThread(new Runnable() { // from class: wz0
            @Override // java.lang.Runnable
            public final void run() {
                ContextExtKt.b(context, str);
            }
        });
    }
}
