package com.huawei.hms.network.embedded;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: loaded from: classes34.dex */
public final class o9 {
    public static final int d = 307;
    public static final int e = 308;
    public static final int f = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r7 f15151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15153c;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15151a == r7.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f15152b);
        if (this.f15153c != null) {
            sb.append(' ');
            sb.append(this.f15153c);
        }
        return sb.toString();
    }

    public static o9 a(String str) throws IOException {
        r7 r7Var;
        int i;
        String strSubstring;
        if (str.startsWith("HTTP/1.")) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt == 0) {
                r7Var = r7.HTTP_1_0;
            } else {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                r7Var = r7.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            r7Var = r7.HTTP_1_0;
            i = 4;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        try {
            int i3 = Integer.parseInt(str.substring(i, i2));
            if (str.length() <= i2) {
                strSubstring = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                strSubstring = str.substring(i + 4);
            }
            return new o9(r7Var, i3, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
    }

    public static o9 a(v7 v7Var) {
        return new o9(v7Var.F(), v7Var.w(), v7Var.B());
    }

    public o9(r7 r7Var, int i, String str) {
        this.f15151a = r7Var;
        this.f15152b = i;
        this.f15153c = str;
    }
}
