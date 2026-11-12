package defpackage;

import android.net.Uri;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.bundle.extension.ComponentInfo;
import health.compact.a.utils.StringUtils;

/* JADX INFO: loaded from: classes42.dex */
class phi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f45372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f45373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f45374c;
    private int d;
    private String e;

    phi() {
    }

    public String b() {
        return this.f45372a;
    }

    public String e() {
        return this.f45373b;
    }

    public String c() {
        return this.f45374c;
    }

    public String a() {
        return this.e;
    }

    public boolean d() {
        return (StringUtils.g(this.f45372a) || StringUtils.g(this.f45373b) || StringUtils.g(this.f45374c) || StringUtils.g(this.e) || this.d > BaseApplication.c() || this.d == 0 || !this.f45372a.equals("opencard") || !ComponentInfo.PluginPay_A_119.equals(Uri.parse(this.e).getQueryParameter("classPath"))) ? false : true;
    }
}
