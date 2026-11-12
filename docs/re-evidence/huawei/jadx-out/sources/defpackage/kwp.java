package defpackage;

import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class kwp {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private kup f39560b;

    private kwp() {
        this.f39560b = kup.b();
    }

    static class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final kwp f39561c = new kwp();
    }

    public static kwp e() {
        return d.f39561c;
    }

    public boolean c(kui kuiVar) {
        if (c(kuiVar.c(), kuiVar.i(), kuiVar.e())) {
            return b(kuiVar) > 0;
        }
        return d(kuiVar) > 0;
    }

    private long d(kui kuiVar) {
        LogUtil.d("Debug_AuthorizationManager", "insertAuthorization()");
        long jCurrentTimeMillis = System.currentTimeMillis();
        kuiVar.c(jCurrentTimeMillis);
        kuiVar.b(jCurrentTimeMillis);
        return this.f39560b.insert(kvw.e(kuiVar));
    }

    private int b(kui kuiVar) {
        kuiVar.b(System.currentTimeMillis());
        return this.f39560b.update(kvw.e(kuiVar), b(), d(kuiVar.c(), kuiVar.i(), kuiVar.e()));
    }

    private boolean c(int i, int i2, int i3) {
        return kwf.m(this.f39560b.query(b(), d(i, i2, i3), null, null, null));
    }

    private String b() {
        return "app_id =? and user_id =? and permission_id =? ";
    }

    private String[] d(int i, int i2, int i3) {
        return new String[]{Integer.toString(i), Integer.toString(i2), Integer.toString(i3)};
    }
}
