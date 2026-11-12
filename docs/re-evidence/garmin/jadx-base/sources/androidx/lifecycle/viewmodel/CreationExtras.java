package androidx.lifecycle.viewmodel;

import ch.qos.logback.core.CoreConstants;
import java.util.LinkedHashMap;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras;", "", "<init>", "()V", "c", "b", "a", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CreationExtras {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f8054b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f8055a = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras$b;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "<init>", "()V", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends CreationExtras {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f8056c = new b();

        private b() {
        }

        @Override // androidx.lifecycle.viewmodel.CreationExtras
        public final <T> T a(c<T> cVar) {
            cVar.getClass();
            return null;
        }
    }

    public interface c<T> {
    }

    static {
        new a(null);
    }

    public abstract <T> T a(c<T> cVar);

    public final boolean equals(Object obj) {
        if (obj instanceof CreationExtras) {
            return s.g(this.f8055a, ((CreationExtras) obj).f8055a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8055a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.f8055a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras$a;", "", "<init>", "()V", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
