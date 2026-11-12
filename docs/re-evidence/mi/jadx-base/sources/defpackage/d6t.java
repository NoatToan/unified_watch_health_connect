package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class d6t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f15160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o0t f15161b;
    public String c;

    public d6t(Context context, o0t o0tVar, String str) {
        this.f15160a = context.getApplicationContext();
        this.f15161b = o0tVar;
        this.c = str;
    }

    public static String a(Context context, o0t o0tVar, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("\"sdkversion\":\"");
            sb.append(o0tVar.f());
            sb.append("\",\"product\":\"");
            sb.append(o0tVar.a());
            sb.append("\",\"nt\":\"");
            sb.append(h0t.w(context));
            sb.append("\",\"details\":");
            sb.append(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return sb.toString();
    }

    public final byte[] b() {
        return p0t.n(a(this.f15160a, this.f15161b, this.c));
    }
}
