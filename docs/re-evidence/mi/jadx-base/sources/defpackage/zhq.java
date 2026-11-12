package defpackage;

import android.content.Context;
import android.os.UserManager;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public class zhq {

    @RequiresApi(24)
    public static class a {
        public static boolean a(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    public static boolean a(Context context) {
        return a.a(context);
    }
}
