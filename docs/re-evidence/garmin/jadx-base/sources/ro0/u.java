package ro0;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import android.widget.Toast;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lro0/u;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f153887a = new u();

    private u() {
    }

    public static boolean a(Context context) {
        context.getClass();
        String externalStorageState = Environment.getExternalStorageState();
        if (TextUtils.isEmpty(externalStorageState)) {
            Toast.makeText(context, "Null external storage state. Impossible to write files to disk.", 1).show();
            return false;
        }
        if (p005kotlin.jvm.internal.s.g(externalStorageState, "mounted")) {
            return true;
        }
        if (p005kotlin.jvm.internal.s.g(externalStorageState, "shared")) {
            Toast.makeText(context, "Please disconnect USB cable.", 1).show();
            return false;
        }
        Toast.makeText(context, "Unknown external storage state [" + externalStorageState + "]", 1).show();
        return false;
    }
}
