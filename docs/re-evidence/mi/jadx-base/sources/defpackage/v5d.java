package defpackage;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public class v5d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Uri f36497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f36498b;
    public double c;
    public boolean d;

    public v5d(Context context, String str) {
        this(context, str, 0.0d, 0.0d);
    }

    public final Uri a(Context context) {
        this.d = true;
        return wqk.b().e(context, this.f36498b);
    }

    public final Uri b(Context context) {
        try {
            Uri uri = Uri.parse(this.f36498b);
            return uri.getScheme() == null ? a(context) : uri;
        } catch (Exception unused) {
            return a(context);
        }
    }

    public double c() {
        return this.c;
    }

    public String d() {
        return this.f36498b;
    }

    public Uri e() {
        return (Uri) sk1.c(this.f36497a);
    }

    public boolean f() {
        return this.d;
    }

    public v5d(Context context, String str, double d, double d2) {
        this.f36498b = str;
        this.c = d * d2;
        this.f36497a = b(context);
    }
}
