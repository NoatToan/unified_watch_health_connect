package com.huawei.hianalytics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o {
    public static y a(String str, String str2) {
        x xVarA;
        k.b().getClass();
        q0 q0Var = (q0) k.f11563b.get(str);
        if (q0Var == null || (xVarA = q0Var.a(str2)) == null) {
            return null;
        }
        y yVar = xVarA.l;
        return yVar == null ? new y() : yVar;
    }
}
