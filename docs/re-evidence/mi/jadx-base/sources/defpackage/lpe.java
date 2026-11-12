package defpackage;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class lpe implements ote {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set<String> f25298a = new HashSet();

    @Override // defpackage.ote
    public void a(String str) {
        b(str, null);
    }

    @Override // defpackage.ote
    public void b(String str, Throwable th) {
        Set<String> set = f25298a;
        if (set.contains(str)) {
            return;
        }
        set.add(str);
    }

    public void c(String str, Throwable th) {
        boolean z = w1e.f37439a;
    }

    @Override // defpackage.ote
    public void debug(String str) {
        c(str, null);
    }

    @Override // defpackage.ote
    public void error(String str, Throwable th) {
        boolean z = w1e.f37439a;
    }
}
