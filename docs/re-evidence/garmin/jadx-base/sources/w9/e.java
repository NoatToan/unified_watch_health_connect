package w9;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.d0;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006B%\b\u0016\u0012\u001a\u0010\n\u001a\u000e\u0012\n\b\u0001\u0012\u00060\bj\u0002`\t0\u0007\"\u00060\bj\u0002`\t¢\u0006\u0004\b\u0002\u0010\u000bB-\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001a\u0010\n\u001a\u000e\u0012\n\b\u0001\u0012\u00060\bj\u0002`\t0\u0007\"\u00060\bj\u0002`\t¢\u0006\u0004\b\u0002\u0010\f¨\u0006\r"}, d2 = {"Lw9/e;", "", "<init>", "()V", "Lo53/b0;", "viewModelScope", "(Lo53/b0;)V", "", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "closeables", "([Ljava/lang/AutoCloseable;)V", "(Lo53/b0;[Ljava/lang/AutoCloseable;)V", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f183568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f183569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f183570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f183571d;

    public e(b0 b0Var, AutoCloseable... autoCloseableArr) {
        b0Var.getClass();
        autoCloseableArr.getClass();
        this.f183568a = new d();
        this.f183569b = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f183570c = linkedHashSet;
        b("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", new a(b0Var));
        d0.w(linkedHashSet, autoCloseableArr);
    }

    public static void c(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                h.p(autoCloseable);
            } catch (Exception e4) {
                o2.c.p(e4);
            }
        }
    }

    public final void a(AutoCloseable autoCloseable) {
        autoCloseable.getClass();
        if (this.f183571d) {
            c(autoCloseable);
            return;
        }
        synchronized (this.f183568a) {
            this.f183570c.add(autoCloseable);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void b(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        if (this.f183571d) {
            c(autoCloseable);
            return;
        }
        synchronized (this.f183568a) {
            autoCloseable2 = (AutoCloseable) this.f183569b.put(str, autoCloseable);
        }
        c(autoCloseable2);
    }

    public e(b0 b0Var) {
        b0Var.getClass();
        this.f183568a = new d();
        this.f183569b = new LinkedHashMap();
        this.f183570c = new LinkedHashSet();
        b("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", new a(b0Var));
    }

    public e(AutoCloseable... autoCloseableArr) {
        autoCloseableArr.getClass();
        this.f183568a = new d();
        this.f183569b = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f183570c = linkedHashSet;
        d0.w(linkedHashSet, autoCloseableArr);
    }

    public e() {
        this.f183568a = new d();
        this.f183569b = new LinkedHashMap();
        this.f183570c = new LinkedHashSet();
    }
}
