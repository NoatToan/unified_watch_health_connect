package defpackage;

import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class kxh {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private kuy f39583c;

    private kxh() {
        this.f39583c = kuy.e();
    }

    static class c {
        private static final kxh d = new kxh();
    }

    public static kxh d() {
        return c.d;
    }

    public boolean e(kum kumVar) {
        if (e(kumVar.b())) {
            return c(kumVar) > 0;
        }
        return b(kumVar) > 0;
    }

    public int d(String str) {
        return kwf.f(this.f39583c.query(a("permission"), b(str), null, null, null), "_id");
    }

    private long b(kum kumVar) {
        LogUtil.d("Debug_AuthorizationManager", "insertPermission()");
        return this.f39583c.insert(kvw.d(kumVar));
    }

    private int c(kum kumVar) {
        return this.f39583c.update(kvw.d(kumVar), a("permission"), b(kumVar.b()));
    }

    private boolean e(String str) {
        return kwf.m(this.f39583c.query(a("permission"), b(str), null, null, null));
    }

    private String a(String str) {
        return str + CommonUtil.EQUAL;
    }

    private String[] b(String str) {
        return new String[]{str};
    }
}
