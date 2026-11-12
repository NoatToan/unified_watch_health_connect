package androidx.profileinstaller;

import android.content.Context;
import androidx.annotation.RequiresApi;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: androidx.profileinstaller.a$a, reason: collision with other inner class name */
    @RequiresApi(api = 24)
    public static class C0064a {
        public static File a(Context context) {
            return context.createDeviceProtectedStorageContext().getCodeCacheDir();
        }
    }

    public static boolean a(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : fileArrListFiles) {
            z = a(file2) && z;
        }
        return z;
    }

    public static void b(Context context, ProfileInstallReceiver.a aVar) {
        if (a(C0064a.a(context))) {
            aVar.a(14, null);
        } else {
            aVar.a(15, null);
        }
    }
}
