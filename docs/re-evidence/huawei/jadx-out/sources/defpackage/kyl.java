package defpackage;

import android.util.ArrayMap;
import com.huawei.hihealthservice.auth.WhiteListApp;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class kyl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, WhiteListApp> f39625b;

    private kyl() {
        this.f39625b = new ArrayMap(16);
    }

    static class d {
        private static final kyl d = new kyl();
    }

    public static kyl c() {
        return d.d;
    }

    public WhiteListApp e(String str) {
        return this.f39625b.get(str);
    }

    public void b(Map<String, WhiteListApp> map) {
        this.f39625b.clear();
        this.f39625b = map;
    }
}
