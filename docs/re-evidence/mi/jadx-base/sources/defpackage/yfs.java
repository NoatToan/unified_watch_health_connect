package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.push.Cif;
import com.xiaomi.push.ig;

/* JADX INFO: loaded from: classes11.dex */
public class yfs {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile yfs f40142k;
    public Context e;
    public String f;
    public String g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40143a = "push_stat_sp";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40144b = "upload_time";
    public final String c = "delete_time";
    public final String d = "check_time";
    public k5s.a h = new cgs(this);
    public k5s.a i = new hgs(this);
    public k5s.a j = new lgs(this);

    public yfs(Context context) {
        this.e = context;
    }

    public static yfs b(Context context) {
        if (f40142k == null) {
            synchronized (yfs.class) {
                try {
                    if (f40142k == null) {
                        f40142k = new yfs(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f40142k;
    }

    public static /* synthetic */ eis c(yfs yfsVar) {
        yfsVar.getClass();
        return null;
    }

    public String d() {
        return this.f;
    }

    public void g(Cif cif) {
        if (k() && jfs.f(cif.e())) {
            h(fhs.i(this.e, n(), cif));
        }
    }

    public void h(ths.a aVar) {
        ths.b(this.e).d(aVar);
    }

    public void i(String str) {
        if (k() && !TextUtils.isEmpty(str)) {
            g(gis.a(this.e, str));
        }
    }

    public void j(String str, String str2, Boolean bool) {
    }

    public final boolean k() {
        return vas.d(this.e).m(ig.StatDataSwitch.a(), true);
    }

    public String l() {
        return this.g;
    }

    public final void m(String str) {
        SharedPreferences.Editor editorEdit = this.e.getSharedPreferences("push_stat_sp", 0).edit();
        editorEdit.putLong(str, System.currentTimeMillis());
        dct.a(editorEdit);
    }

    public final String n() {
        return this.e.getDatabasePath(ogs.f29158a).getAbsolutePath();
    }
}
