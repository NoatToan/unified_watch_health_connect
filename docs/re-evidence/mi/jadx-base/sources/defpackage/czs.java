package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.Cif;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class czs {
    public static volatile czs c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<String, rzs> f14899b = new HashMap();

    public czs(Context context) {
        this.f14898a = context;
    }

    public static czs a(Context context) {
        if (context == null) {
            x9s.D("[TinyDataManager]:mContext is null, TinyDataManager.getInstance(Context) failed.");
            return null;
        }
        if (c == null) {
            synchronized (czs.class) {
                try {
                    if (c == null) {
                        c = new czs(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public rzs b() {
        rzs rzsVar = this.f14899b.get("UPLOADER_PUSH_CHANNEL");
        if (rzsVar != null) {
            return rzsVar;
        }
        rzs rzsVar2 = this.f14899b.get("UPLOADER_HTTP");
        if (rzsVar2 != null) {
            return rzsVar2;
        }
        return null;
    }

    public Map<String, rzs> c() {
        return this.f14899b;
    }

    public void d(rzs rzsVar, String str) {
        if (rzsVar == null) {
            x9s.D("[TinyDataManager]: please do not add null mUploader to TinyDataManager.");
        } else if (TextUtils.isEmpty(str)) {
            x9s.D("[TinyDataManager]: can not add a provider from unkown resource.");
        } else {
            c().put(str, rzsVar);
        }
    }

    public boolean e(Cif cif, String str) {
        if (TextUtils.isEmpty(str)) {
            x9s.o("pkgName is null or empty, upload ClientUploadDataItem failed.");
            return false;
        }
        if (jfs.e(cif, false)) {
            return false;
        }
        if (TextUtils.isEmpty(cif.d())) {
            cif.f(jfs.b());
        }
        cif.g(str);
        nfs.a(this.f14898a, cif);
        return true;
    }
}
