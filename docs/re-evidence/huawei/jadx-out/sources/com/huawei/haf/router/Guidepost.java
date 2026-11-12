package com.huawei.haf.router;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.router.core.AppRouterHelper;
import com.huawei.haf.router.core.AppRouterPostcard;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.operation.ble.BleConstants;

/* JADX INFO: loaded from: classes.dex */
public final class Guidepost extends AppRouterPostcard {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f6014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Bundle f6015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f6016c;
    private String d;
    private int e;
    private int g;
    private Bundle h;

    public Guidepost(String str, String str2, Uri uri) {
        super(str, str2, uri);
        this.f6015b = new Bundle();
        this.e = -1;
        this.f6014a = -1;
    }

    public Object i() {
        return AppRouterHelper.b(e(), this, -1, (NaviCallback) null);
    }

    public Object b(Context context) {
        this.f6016c = context;
        return AppRouterHelper.b(e(), this, -1, (NaviCallback) null);
    }

    public Object a(Context context, NaviCallback naviCallback) {
        this.f6016c = context;
        return AppRouterHelper.b(e(), this, -1, naviCallback);
    }

    public void b(Activity activity, int i) {
        this.f6016c = activity;
        AppRouterHelper.b(e(), this, i, (NaviCallback) null);
    }

    public void a(Activity activity, int i, NaviCallback naviCallback) {
        this.f6016c = activity;
        AppRouterHelper.b(e(), this, i, naviCallback);
    }

    public Guidepost d(Bundle bundle) {
        Bundle bundle2;
        if (bundle != null && !bundle.isEmpty() && bundle != (bundle2 = this.f6015b)) {
            bundle2.putAll(bundle);
        }
        return this;
    }

    public Guidepost e(String str, boolean z) {
        this.f6015b.putBoolean(str, z);
        return this;
    }

    public Guidepost c(String str, byte b2) {
        this.f6015b.putByte(str, b2);
        return this;
    }

    public Guidepost e(String str, short s) {
        this.f6015b.putShort(str, s);
        return this;
    }

    public Guidepost a(String str, int i) {
        this.f6015b.putInt(str, i);
        return this;
    }

    public Guidepost b(String str, long j) {
        this.f6015b.putLong(str, j);
        return this;
    }

    public Guidepost b(String str, char c2) {
        this.f6015b.putChar(str, c2);
        return this;
    }

    public Guidepost b(String str, float f) {
        this.f6015b.putFloat(str, f);
        return this;
    }

    public Guidepost a(String str, double d) {
        this.f6015b.putDouble(str, d);
        return this;
    }

    public Guidepost c(String str, String str2) {
        this.f6015b.putString(str, str2);
        return this;
    }

    public Guidepost e(String str, Parcelable parcelable) {
        this.f6015b.putParcelable(str, parcelable);
        return this;
    }

    public Guidepost a(int i, int i2) {
        this.e = i;
        this.f6014a = i2;
        return this;
    }

    public Guidepost e(String str) {
        this.d = str;
        return this;
    }

    public Guidepost d(int i) {
        this.g = i;
        return this;
    }

    public Guidepost e(int i) {
        this.g = i | this.g;
        return this;
    }

    public int f() {
        return this.g;
    }

    public int b() {
        return this.e;
    }

    public int c() {
        return this.f6014a;
    }

    public String a() {
        return this.d;
    }

    public Bundle j() {
        return this.h;
    }

    public Bundle d() {
        return this.f6015b;
    }

    public Context e() {
        if (this.f6016c == null) {
            this.f6016c = BaseApplication.j();
        }
        Context context = this.f6016c;
        return context == null ? BaseApplication.b() : context;
    }

    static Bundle a(Guidepost guidepost) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("uri", guidepost.o());
        bundle.putString(BleConstants.KEY_PATH, guidepost.l());
        b(bundle, guidepost);
        return bundle;
    }

    static Guidepost e(Bundle bundle) {
        bundle.setClassLoader(BaseApplication.b().getClassLoader());
        Uri uri = (Uri) bundle.getParcelable("uri");
        if (uri != null) {
            Guidepost guidepostB = AppRouterHelper.b(uri);
            a(guidepostB, bundle);
            return guidepostB;
        }
        String string = bundle.getString(BleConstants.KEY_PATH);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        Guidepost guidepostA = AppRouterHelper.a(string);
        a(guidepostA, bundle);
        return guidepostA;
    }

    private static void b(Bundle bundle, Guidepost guidepost) {
        bundle.putBundle("bundle", guidepost.d());
        bundle.putInt(ParamConstants.Param.FLAGS, guidepost.f());
        bundle.putInt("enterAnim", guidepost.b());
        bundle.putInt("exitAnim", guidepost.c());
        bundle.putString("action", guidepost.a());
        Bundle bundleJ = guidepost.j();
        if (bundleJ != null) {
            bundle.putBundle("optionBundle", bundleJ);
        }
    }

    private static void a(Guidepost guidepost, Bundle bundle) {
        guidepost.d(bundle.getBundle("bundle"));
        guidepost.d(bundle.getInt(ParamConstants.Param.FLAGS));
        guidepost.a(bundle.getInt("enterAnim"), bundle.getInt("exitAnim"));
        guidepost.e(bundle.getString("action"));
        Bundle bundle2 = bundle.getBundle("optionBundle");
        if (bundle2 != null) {
            guidepost.h = bundle2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Guidepost{");
        if (o() != null) {
            sb.append("uri=");
            sb.append(o());
        } else {
            sb.append("path=");
            sb.append(l());
        }
        if (!this.f6015b.isEmpty()) {
            sb.append(", extras=");
            sb.append(this.f6015b);
        }
        if (this.g != 0) {
            sb.append(", flags=");
            sb.append(this.g);
        }
        if (h() != 0) {
            sb.append(", extra=");
            sb.append(h());
        }
        if (this.e != 0) {
            sb.append(", enterAnim=");
            sb.append(this.e);
        }
        if (this.f6014a != 0) {
            sb.append(", exitAnim=");
            sb.append(this.f6014a);
        }
        if (!TextUtils.isEmpty(this.d)) {
            sb.append(", action=");
            sb.append(this.d);
        }
        if (m() != null) {
            sb.append(", provider=");
            sb.append(m());
        }
        sb.append("}");
        return sb.toString();
    }
}
