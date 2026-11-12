package defpackage;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes7.dex */
public class qpo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f31728b;
    public final String c;
    public String d;
    public boolean e;
    public long f;
    public boolean g;
    public int h;
    public Drawable i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f31729k;

    public qpo(String str, String str2, String str3) {
        this.h = 0;
        this.f31727a = str;
        this.f31728b = str2;
        this.c = str3;
    }

    public static int a(String str) {
        if (TextUtils.equals(str, "weeks")) {
            return c0j.K6;
        }
        return TextUtils.equals(str, "months") ? c0j.J6 : c0j.I6;
    }

    public qpo(String str, String str2, String str3, String str4, int i, Drawable drawable) {
        this.f31727a = str;
        this.f31728b = str2;
        this.c = str3;
        this.d = str4;
        this.h = i;
        this.i = drawable;
    }

    public qpo(String str, String str2, String str3, String str4) {
        this.h = 0;
        this.f31727a = str;
        this.f31728b = str2;
        this.c = str3;
        this.d = str4;
    }

    public qpo(String str, boolean z, long j) {
        this.h = 0;
        this.f31728b = "";
        this.c = "";
        this.f31727a = str;
        this.e = z;
        this.f = j;
    }
}
