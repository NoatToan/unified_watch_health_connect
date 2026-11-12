package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.appgallery.coreservice.h;
import com.huawei.hms.framework.network.grs.GrsApp;

/* JADX INFO: loaded from: classes23.dex */
public class bhm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f1107a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static bhm f1108c;
    private String e = "";
    private String d = "";

    public void e(Context context, String str) {
        if (str == null) {
            str = "";
        }
        if (this.e.equals(str)) {
            return;
        }
        this.e = str;
        new h(context).b("hc", str);
    }

    public String a(Context context) {
        String strA = new h(context).a("hc", "");
        this.e = strA;
        if (TextUtils.isEmpty(strA)) {
            this.e = GrsApp.getInstance().getIssueCountryCode(context);
        }
        return this.e;
    }

    public void d(Context context, String str) {
        if (str == null) {
            str = "";
        }
        if (this.d.equals(str)) {
            return;
        }
        this.d = str;
        new h(context).b("grs_app_name", str);
    }

    public String d(Context context) {
        String strA = new h(context).a("grs_app_name", "");
        this.d = strA;
        return strA;
    }

    public static bhm d() {
        bhm bhmVar;
        synchronized (f1107a) {
            if (f1108c == null) {
                f1108c = new bhm();
            }
            bhmVar = f1108c;
        }
        return bhmVar;
    }

    private bhm() {
    }
}
