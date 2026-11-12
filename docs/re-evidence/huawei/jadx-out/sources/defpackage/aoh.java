package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.eventbus.ElementTypesAreNonnullByDefault;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public class aoh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private aoi f627a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f628c;
    final Object d;
    private final Method e;

    public final void a(final Object obj) {
        this.f628c.execute(new Runnable() { // from class: aof
            @Override // java.lang.Runnable
            public final void run() {
                this.f624b.c(obj);
            }
        });
    }

    /* synthetic */ void c(Object obj) {
        try {
            b(obj);
        } catch (InvocationTargetException e) {
            this.f627a.a(e.getCause(), e(obj));
        }
    }

    void b(Object obj) throws InvocationTargetException {
        try {
            this.e.invoke(this.d, Preconditions.checkNotNull(obj));
        } catch (IllegalAccessException e) {
            throw new Error("Method became inaccessible: " + obj, e);
        } catch (IllegalArgumentException e2) {
            throw new Error("Method rejected target/argument: " + obj, e2);
        } catch (InvocationTargetException e3) {
            if (e3.getCause() instanceof Error) {
                throw ((Error) e3.getCause());
            }
            throw e3;
        }
    }

    private aog e(Object obj) {
        return new aog(this.f627a, obj, this.d, this.e);
    }

    public final int hashCode() {
        return ((this.e.hashCode() + 31) * 31) + System.identityHashCode(this.d);
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (!(obj instanceof aoh)) {
            return false;
        }
        aoh aohVar = (aoh) obj;
        return this.d == aohVar.d && this.e.equals(aohVar.e);
    }
}
