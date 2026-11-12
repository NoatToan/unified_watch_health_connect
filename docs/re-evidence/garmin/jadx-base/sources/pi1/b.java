package pi1;

import android.content.Context;
import android.os.Environment;
import i3.e5;
import java.io.File;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpi1/b;", "", "<init>", "()V", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f137854a = new b();

    private b() {
    }

    public static final File a(Context context, String str) {
        context.getClass();
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            File filesDir = context.getFilesDir();
            filesDir.getClass();
            return filesDir;
        }
        File externalFilesDir = context.getExternalFilesDir(str);
        if (externalFilesDir == null) {
            externalFilesDir = context.getFilesDir();
        }
        externalFilesDir.getClass();
        return externalFilesDir;
    }

    public static File b(Context context) {
        context.getClass();
        return new File(e5.g(context.getCacheDir().toString(), File.separator, "logs"));
    }
}
