package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;

/* JADX INFO: loaded from: classes4.dex */
public class ea9 extends v5d {
    public final dmb e;
    public Uri f;

    public ea9(Context context, String str, dmb dmbVar) {
        this(context, str, 0.0d, 0.0d, dmbVar);
    }

    public static boolean k(Uri uri) {
        return "data".equals(uri.getScheme());
    }

    public static boolean m(Uri uri) {
        return MiuiCursorConstants.CONTENT.equals(uri.getScheme());
    }

    public static boolean o(Uri uri) {
        return "file".equals(uri.getScheme());
    }

    public static boolean p(Uri uri) {
        return "res".equals(uri.getScheme());
    }

    public static boolean q(Uri uri) {
        return "android.resource".equals(uri.getScheme());
    }

    @Override // defpackage.v5d
    public Uri e() {
        return this.f;
    }

    @Override // defpackage.v5d
    public boolean f() {
        Uri uri = this.f;
        return uri != null && q(uri);
    }

    public e0b g() {
        return new e0b(e().toString(), h());
    }

    public dmb h() {
        return this.e;
    }

    public Object i() {
        if (!l() && !j()) {
            if (f()) {
                return e();
            }
            return n() ? e().toString() : g();
        }
        return d();
    }

    public boolean j() {
        Uri uri = this.f;
        return uri != null && k(uri);
    }

    public boolean l() {
        Uri uri = this.f;
        return uri != null && m(uri);
    }

    public boolean n() {
        Uri uri = this.f;
        return uri != null && o(uri);
    }

    public ea9(Context context, String str, double d, double d2, dmb dmbVar) {
        super(context, str, d, d2);
        this.e = dmbVar == null ? dmb.f15684b : dmbVar;
        this.f = super.e();
        if (f() && TextUtils.isEmpty(this.f.toString())) {
            throw new Resources.NotFoundException("Local Resource Not Found. Resource: '" + d() + "'.");
        }
        if (p(this.f)) {
            this.f = Uri.parse(this.f.toString().replace("res:/", "android.resource://" + context.getPackageName() + "/"));
        }
    }
}
