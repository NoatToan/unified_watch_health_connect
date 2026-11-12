package defpackage;

import android.text.TextUtils;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes13.dex */
public class pbo {
    public static boolean c(String str) {
        return TextUtils.isEmpty(str);
    }

    public static void d(ExecutorService executorService) {
        if (executorService != null) {
            executorService.shutdown();
        }
    }
}
