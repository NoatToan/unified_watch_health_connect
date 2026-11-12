package defpackage;

import java.net.InetSocketAddress;

/* JADX INFO: loaded from: classes11.dex */
public final class rjs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f32624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f32625b;

    public rjs(String str, int i) {
        this.f32624a = str;
        this.f32625b = i;
    }

    public static rjs b(String str, int i) {
        int iLastIndexOf = str.lastIndexOf(":");
        if (iLastIndexOf != -1) {
            String strSubstring = str.substring(0, iLastIndexOf);
            try {
                int i2 = Integer.parseInt(str.substring(iLastIndexOf + 1));
                if (i2 > 0) {
                    i = i2;
                }
            } catch (NumberFormatException unused) {
            }
            str = strSubstring;
        }
        return new rjs(str, i);
    }

    public static InetSocketAddress d(String str, int i) {
        rjs rjsVarB = b(str, i);
        return new InetSocketAddress(rjsVarB.c(), rjsVarB.a());
    }

    public int a() {
        return this.f32625b;
    }

    public String c() {
        return this.f32624a;
    }

    public String toString() {
        if (this.f32625b <= 0) {
            return this.f32624a;
        }
        return this.f32624a + ":" + this.f32625b;
    }
}
