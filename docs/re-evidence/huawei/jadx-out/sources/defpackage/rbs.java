package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class rbs extends rbn {
    private static final long serialVersionUID = 3686256241400139560L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, String> f47102a = new HashMap(16);

    public void d(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        this.f47102a.put(str, str2);
    }

    public String e(String str) {
        return (!TextUtils.isEmpty(str) && this.f47102a.containsKey(str)) ? this.f47102a.get(str) : "";
    }
}
