package com.typesafe.config;

import defpackage.lc4;
import defpackage.nb4;
import defpackage.pc4;
import defpackage.skh;
import defpackage.vb4;
import java.io.File;
import java.io.Reader;
import java.net.URL;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    public static ClassLoader a(String str) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader != null) {
            return contextClassLoader;
        }
        throw new ConfigException.BugOrBroken("Context class loader is not set for the current thread; if Thread.currentThread().getContextClassLoader() returns null, you must pass a ClassLoader explicitly to ConfigFactory." + str);
    }

    public static nb4 b(ClassLoader classLoader) {
        return m();
    }

    public static nb4 c(ClassLoader classLoader) {
        return vb4.e(classLoader);
    }

    public static lc4 d(lc4 lc4Var, String str) {
        return lc4Var.d() == null ? lc4Var.i(a(str)) : lc4Var;
    }

    public static nb4 e(ClassLoader classLoader, nb4 nb4Var, pc4 pc4Var) {
        return b(classLoader).e(nb4Var).e(c(classLoader)).m(pc4Var);
    }

    public static nb4 f(String str) {
        return g(str, lc4.b(), pc4.a());
    }

    public static nb4 g(String str, lc4 lc4Var, pc4 pc4Var) {
        lc4 lc4VarD = d(lc4Var, "load");
        return e(lc4VarD.d(), k(str, lc4VarD), pc4Var);
    }

    public static nb4 h(File file, lc4 lc4Var) {
        return vb4.n(file, lc4Var).r();
    }

    public static nb4 i(Reader reader) {
        return j(reader, lc4.b());
    }

    public static nb4 j(Reader reader, lc4 lc4Var) {
        return skh.o(reader, lc4Var).r().r();
    }

    public static nb4 k(String str, lc4 lc4Var) {
        return vb4.o(str, lc4Var).r();
    }

    public static nb4 l(URL url, lc4 lc4Var) {
        return skh.q(url, lc4Var).r().r();
    }

    public static nb4 m() {
        return vb4.p();
    }
}
