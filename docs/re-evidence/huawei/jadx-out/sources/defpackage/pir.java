package defpackage;

import android.text.TextUtils;
import java.io.File;
import java.util.HashMap;

/* JADX INFO: loaded from: classes14.dex */
public class pir {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String[] f45454b = {"sr-Latn", "jv-Latn"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static HashMap<String, String> f45453a = new HashMap() { // from class: pir.5
        private static final long serialVersionUID = 1212859686823339267L;

        {
            put("sr-Latn", "b+sr+Latn");
            put("jv-Latn", "b+jv+Latn");
        }
    };

    public static String c() {
        return phs.d + "index_all" + File.separator + "done";
    }

    public static String d() {
        return phs.d + "index_all" + File.separator + "index_all.json";
    }

    public static String a() {
        return phs.d + "img_index_all" + File.separator;
    }

    public static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return phs.d + str + File.separator;
    }
}
