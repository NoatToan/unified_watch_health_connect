package androidx.lifecycle;

import ch.qos.logback.core.joran.action.Action;
import java.io.Closeable;
import java.util.Arrays;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006B%\b\u0016\u0012\u001a\u0010\n\u001a\u000e\u0012\n\b\u0001\u0012\u00060\bj\u0002`\t0\u0007\"\u00060\bj\u0002`\t¢\u0006\u0004\b\u0002\u0010\u000bB-\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001a\u0010\n\u001a\u000e\u0012\n\b\u0001\u0012\u00060\bj\u0002`\t0\u0007\"\u00060\bj\u0002`\t¢\u0006\u0004\b\u0002\u0010\fB\u001d\b\u0017\u0012\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\u0007\"\u00020\r¢\u0006\u0004\b\u0002\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0003J!\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\n\u0010\u0015\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0016\u001a\u00020\u000f2\n\u0010\u0015\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0018J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0016\u0010\u0019J%\u0010\u001b\u001a\u0004\u0018\u00018\u0000\"\f\b\u0000\u0010\u001a*\u00060\bj\u0002`\t2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Landroidx/lifecycle/u1;", "", "<init>", "()V", "Lo53/b0;", "viewModelScope", "(Lo53/b0;)V", "", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "closeables", "([Ljava/lang/AutoCloseable;)V", "(Lo53/b0;[Ljava/lang/AutoCloseable;)V", "Ljava/io/Closeable;", "([Ljava/io/Closeable;)V", "", "onCleared", "clear$lifecycle_viewmodel", "clear", "", Action.KEY_ATTRIBUTE, "closeable", "addCloseable", "(Ljava/lang/String;Ljava/lang/AutoCloseable;)V", "(Ljava/lang/AutoCloseable;)V", "(Ljava/io/Closeable;)V", "T", "getCloseable", "(Ljava/lang/String;)Ljava/lang/AutoCloseable;", "Lw9/e;", "impl", "Lw9/e;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class u1 {
    private final w9.e impl;

    public u1(o53.b0 b0Var, AutoCloseable... autoCloseableArr) {
        b0Var.getClass();
        autoCloseableArr.getClass();
        this.impl = new w9.e(b0Var, (AutoCloseable[]) Arrays.copyOf(autoCloseableArr, autoCloseableArr.length));
    }

    public final void addCloseable(String key, AutoCloseable closeable) {
        key.getClass();
        closeable.getClass();
        w9.e eVar = this.impl;
        if (eVar != null) {
            eVar.b(key, closeable);
        }
    }

    public final void clear$lifecycle_viewmodel() {
        w9.e eVar = this.impl;
        if (eVar != null && !eVar.f183571d) {
            eVar.f183571d = true;
            synchronized (eVar.f183568a) {
                try {
                    Iterator it = eVar.f183569b.values().iterator();
                    while (it.hasNext()) {
                        w9.e.c((AutoCloseable) it.next());
                    }
                    Iterator it3 = eVar.f183570c.iterator();
                    while (it3.hasNext()) {
                        w9.e.c((AutoCloseable) it3.next());
                    }
                    eVar.f183570c.clear();
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        onCleared();
    }

    public final <T extends AutoCloseable> T getCloseable(String key) {
        T t7;
        key.getClass();
        w9.e eVar = this.impl;
        if (eVar == null) {
            return null;
        }
        synchronized (eVar.f183568a) {
            t7 = (T) eVar.f183569b.get(key);
        }
        return t7;
    }

    public void onCleared() {
    }

    public void addCloseable(AutoCloseable closeable) {
        closeable.getClass();
        w9.e eVar = this.impl;
        if (eVar != null) {
            eVar.a(closeable);
        }
    }

    @o13.e
    public /* synthetic */ void addCloseable(Closeable closeable) {
        closeable.getClass();
        w9.e eVar = this.impl;
        if (eVar != null) {
            eVar.a(closeable);
        }
    }

    public u1(o53.b0 b0Var) {
        b0Var.getClass();
        this.impl = new w9.e(b0Var);
    }

    public u1(AutoCloseable... autoCloseableArr) {
        autoCloseableArr.getClass();
        this.impl = new w9.e((AutoCloseable[]) Arrays.copyOf(autoCloseableArr, autoCloseableArr.length));
    }

    public u1() {
        this.impl = new w9.e();
    }

    @o13.e
    public /* synthetic */ u1(Closeable... closeableArr) {
        closeableArr.getClass();
        this.impl = new w9.e((AutoCloseable[]) Arrays.copyOf(closeableArr, closeableArr.length));
    }
}
