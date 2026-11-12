package w63;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lw63/l;", "Ljava/io/Closeable;", "Lokio/Closeable;", "<init>", "()V", "a", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class l implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f183387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y f183388b;

    static {
        u uVar;
        new a(null);
        try {
            Class.forName("java.nio.file.Files");
            uVar = new v();
        } catch (ClassNotFoundException unused) {
            uVar = new u();
        }
        f183387a = uVar;
        y.a aVar = y.f183408b;
        String property = System.getProperty("java.io.tmpdir");
        property.getClass();
        aVar.getClass();
        f183388b = y.a.a(property);
        ClassLoader classLoader = x63.f.class.getClassLoader();
        classLoader.getClass();
        new x63.f(classLoader, false, null, 4, null);
    }

    public abstract f0 a(y yVar);

    public abstract void c(y yVar, y yVar2);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public abstract void e(y yVar);

    public abstract void f(y yVar);

    public final void j(y yVar) {
        yVar.getClass();
        f(yVar);
    }

    public final boolean k(y yVar) {
        yVar.getClass();
        return p(yVar) != null;
    }

    public abstract List<y> l(y yVar);

    public final k n(y yVar) throws FileNotFoundException {
        yVar.getClass();
        k kVarP = p(yVar);
        if (kVarP != null) {
            return kVarP;
        }
        vb.h.r(yVar, "no such file: ");
        return null;
    }

    public abstract k p(y yVar);

    public abstract j s(y yVar);

    public abstract f0 v(y yVar, boolean z14);

    public abstract g0 w(y yVar);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lw63/l$a;", "", "<init>", "()V", "Lw63/l;", "SYSTEM", "Lw63/l;", "Lw63/y;", "SYSTEM_TEMPORARY_DIRECTORY", "Lw63/y;", "RESOURCES", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
