package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class nip {
    public static volatile nip c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public hsr f27966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27967b = 80;

    public nip() {
        try {
            hsr hsrVar = new hsr();
            this.f27966a = hsrVar;
            hsrVar.c();
        } catch (Exception unused) {
            throw new RuntimeException("failed to init segmenter.");
        }
    }

    public static void a() {
        c = null;
    }

    public static nip b() {
        if (c == null) {
            synchronized (nip.class) {
                if (c == null) {
                    try {
                        c = new nip();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return c;
    }

    public List<String> c(String str) {
        return this.f27966a.f(str);
    }

    public List<String> d(String str, Set<String> set) {
        return this.f27966a.j(str, set, 80);
    }
}
