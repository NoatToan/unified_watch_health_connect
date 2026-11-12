package defpackage;

import com.xiaomi.yrn.env.entity.YRNDevConfigInfo;
import com.xiaomi.yrn.env.entity.YRNDevModeInfo;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class swr implements j1d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l1d f34069a;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final swr f34070a = new swr();
    }

    public static swr e() {
        return b.f34070a;
    }

    @Override // defpackage.j1d
    public YRNDevModeInfo a(String str, String str2) {
        return qur.j().a(str, str2);
    }

    public void b(String str, String str2) {
        qur.j().b(str, str2);
        l1d l1dVar = this.f34069a;
        if (l1dVar != null) {
            l1dVar.a(str, str2);
        }
    }

    public List<YRNDevModeInfo> c() {
        return qur.j().c();
    }

    public YRNDevConfigInfo d(String str) {
        return qur.j().i(str);
    }

    public void f(l1d l1dVar) {
        this.f34069a = l1dVar;
    }

    public boolean g(String str, YRNDevConfigInfo yRNDevConfigInfo) {
        return qur.j().o(str, yRNDevConfigInfo);
    }

    public boolean h(YRNDevModeInfo yRNDevModeInfo) {
        return qur.j().p(yRNDevModeInfo);
    }

    public swr() {
    }
}
