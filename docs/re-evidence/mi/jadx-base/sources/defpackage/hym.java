package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import com.xiaomi.fitness.common.log.Logger;
import java.io.File;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public class hym {
    public static Uri a(Context context, Intent intent, Uri uri) {
        Objects.requireNonNull(context);
        Objects.requireNonNull(intent);
        Objects.requireNonNull(uri);
        String path = uri.getPath();
        if (TextUtils.isEmpty(path)) {
            Logger.w("SleepShareAudioUtils", "uri has no path, %s", uri.toString(), new Object[0]);
            return null;
        }
        Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".fileProvider", new File(path));
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent, 65536).iterator();
        while (it.hasNext()) {
            context.grantUriPermission(it.next().activityInfo.packageName, uriForFile, 3);
        }
        return uriForFile;
    }

    public static void b(Context context, String str, String str2) {
        Objects.requireNonNull(context);
        if (TextUtils.isEmpty(str)) {
            Logger.e("SleepShareAudioUtils", "share file failed, path = %s", str, new Object[0]);
            return;
        }
        File file = new File(str);
        if (!file.exists()) {
            Logger.e("SleepShareAudioUtils", "share file failed, file does not exist, %s", str, new Object[0]);
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        Uri uriA = a(context, intent, Uri.fromFile(file));
        intent.setType("audio/*");
        intent.putExtra("android.intent.extra.STREAM", uriA);
        intent.setFlags(268435456);
        context.startActivity(Intent.createChooser(intent, str2));
    }
}
