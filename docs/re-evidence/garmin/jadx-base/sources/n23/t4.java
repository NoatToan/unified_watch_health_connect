package n23;

import java.lang.ref.WeakReference;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln23/t4;", "", "Ljava/lang/ClassLoader;", "classLoader", "<init>", "(Ljava/lang/ClassLoader;)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference<ClassLoader> f122629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f122630b;

    public t4(ClassLoader classLoader) {
        classLoader.getClass();
        this.f122629a = new WeakReference<>(classLoader);
        this.f122630b = System.identityHashCode(classLoader);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof t4) && this.f122629a.get() == ((t4) obj).f122629a.get();
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public final int getF122630b() {
        return this.f122630b;
    }

    public final String toString() {
        String string;
        ClassLoader classLoader = this.f122629a.get();
        return (classLoader == null || (string = classLoader.toString()) == null) ? "<null>" : string;
    }
}
