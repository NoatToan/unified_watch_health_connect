package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.ig;
import com.xiaomi.push.service.XMPushService;
import java.io.File;

/* JADX INFO: loaded from: classes11.dex */
public class zys implements XMPushService.n {
    public static boolean d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f41811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f41812b;
    public int c;

    public zys(Context context) {
        this.f41811a = context;
    }

    public static void c(boolean z) {
        d = z;
    }

    @Override // com.xiaomi.push.service.XMPushService.n
    public void a() {
        b(this.f41811a);
        if (this.f41812b && d()) {
            x9s.o("TinyData TinyDataCacheProcessor.pingFollowUpAction ts:" + System.currentTimeMillis());
            rzs rzsVarB = czs.a(this.f41811a).b();
            if (e(rzsVarB)) {
                d = true;
                azs.b(this.f41811a, rzsVarB);
            } else {
                x9s.o("TinyData TinyDataCacheProcessor.pingFollowUpAction !canUpload(uploader) ts:" + System.currentTimeMillis());
            }
        }
    }

    public final void b(Context context) {
        this.f41812b = vas.d(context).m(ig.TinyDataUploadSwitch.a(), true);
        int iA = vas.d(context).a(ig.TinyDataUploadFrequency.a(), 7200);
        this.c = iA;
        this.c = Math.max(60, iA);
    }

    public final boolean d() {
        return Math.abs((System.currentTimeMillis() / 1000) - this.f41811a.getSharedPreferences("mipush_extra", 4).getLong("last_tiny_data_upload_timestamp", -1L)) > ((long) this.c);
    }

    public final boolean e(rzs rzsVar) {
        if (!obs.v(this.f41811a) || rzsVar == null || TextUtils.isEmpty(a(this.f41811a.getPackageName())) || !new File(this.f41811a.getFilesDir(), "tiny_data.data").exists() || d) {
            return false;
        }
        return !vas.d(this.f41811a).m(ig.ScreenOnOrChargingTinyDataUploadSwitch.a(), false) || lzs.k(this.f41811a) || lzs.q(this.f41811a);
    }

    public final String a(String str) {
        if ("com.xiaomi.xmsf".equals(str)) {
            return "1000271";
        }
        return this.f41811a.getSharedPreferences("pref_registered_pkg_names", 0).getString(str, null);
    }
}
