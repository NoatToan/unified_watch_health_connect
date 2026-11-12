package defpackage;

import android.app.Activity;
import com.facebook.react.bridge.WritableMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ayr {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f3590b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l1d f3591a;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ayr f3592a = new ayr();
    }

    public static ayr b() {
        return b.f3592a;
    }

    public Activity a() {
        return jzr.e().b();
    }

    public void c(iwr iwrVar) {
        sk1.c(iwrVar);
        if (f3590b) {
            zxr.b("YRN_YRNV3_SDK", "YRNManager had been initialized!");
            return;
        }
        f3590b = true;
        vwr.g().i(iwrVar);
        this.f3591a = dxr.k();
        tur.a().c(this.f3591a);
        jzr.e().g(this.f3591a);
        swr.e().f(this.f3591a);
    }

    public void d(String str, t1d t1dVar) {
        l1d l1dVar;
        if (e() && (l1dVar = this.f3591a) != null) {
            l1dVar.e(str, t1dVar);
        }
    }

    public boolean e() {
        return f3590b;
    }

    public boolean f(String str, String str2, Map<String, Object> map) {
        l1d l1dVar;
        return e() && (l1dVar = this.f3591a) != null && l1dVar.b(str, str2, map);
    }

    public boolean g(String str, String str2, WritableMap writableMap) {
        l1d l1dVar;
        return e() && (l1dVar = this.f3591a) != null && l1dVar.j(str, str2, writableMap);
    }

    public ayr() {
    }
}
