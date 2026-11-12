package com.huawei.hms.network.embedded;

import java.net.Proxy;

/* JADX INFO: loaded from: classes34.dex */
public final class m9 {
    public static boolean b(t7 t7Var, Proxy.Type type) {
        return !t7Var.g() && type == Proxy.Type.HTTP;
    }

    public static String a(t7 t7Var, Proxy.Type type) {
        StringBuilder sb = new StringBuilder();
        sb.append(t7Var.h());
        sb.append(' ');
        boolean zB = b(t7Var, type);
        m7 m7VarK = t7Var.k();
        if (zB) {
            sb.append(m7VarK);
        } else {
            sb.append(a(m7VarK));
        }
        sb.append(" HTTP/1.1");
        return sb.toString();
    }

    public static String a(m7 m7Var) {
        String strC = m7Var.c();
        String strE = m7Var.e();
        if (strE == null) {
            return strC;
        }
        return strC + '?' + strE;
    }
}
