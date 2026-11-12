package defpackage;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class b0i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0i f3652a = c();

    public static class a extends b0i {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Map<Class<?>, Object> f3653b;

        static {
            HashMap map = new HashMap();
            map.put(Bundle.class, new i63());
            map.put(Intent.class, new wcd());
            f3653b = Collections.unmodifiableMap(map);
        }

        @Override // defpackage.b0i
        public Map<Class<?>, Object> a() {
            return f3653b;
        }

        @Override // defpackage.b0i
        public void b(String str) {
        }

        @Override // defpackage.b0i
        public String e() {
            return System.lineSeparator();
        }

        @Override // defpackage.b0i
        public void f(String str) {
        }
    }

    public static b0i c() {
        try {
            Class.forName("android.os.Build");
            return new a();
        } catch (ClassNotFoundException unused) {
            return new b0i();
        }
    }

    public static b0i d() {
        return f3652a;
    }

    public Map<Class<?>, Object> a() {
        return Collections.emptyMap();
    }

    public void b(String str) {
        System.out.println(str);
    }

    @SuppressLint({"NewApi"})
    public String e() {
        return System.lineSeparator();
    }

    public void f(String str) {
        System.out.println(str);
    }
}
