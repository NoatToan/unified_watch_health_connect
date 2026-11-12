package u7;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\rB9\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lu7/k0;", "T", "Lu7/s1;", "Lu7/k1;", "serializer", "Lkotlin/Function1;", "Ljava/io/File;", "Lu7/t0;", "coordinatorProducer", "Lkotlin/Function0;", "produceFile", "<init>", "(Lu7/k1;Le23/l;Le23/a;)V", "b", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k0<T> implements s1<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f169175d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final LinkedHashSet f169176e = new LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f169177f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1<T> f169178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<File, t0> f169179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.a<File> f169180c;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Ljava/io/File;", "it", "Lu7/t0;", "invoke", "(Ljava/io/File;)Lu7/t0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a extends p005kotlin.jvm.internal.w implements e23.l<File, t0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f169181a = new a();

        public a() {
            super(1);
        }

        @Override // e23.l
        public final t0 invoke(File file) {
            File file2 = file;
            file2.getClass();
            String absolutePath = file2.getCanonicalFile().getAbsolutePath();
            absolutePath.getClass();
            return new q1(absolutePath);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k0(k1<T> k1Var, e23.l<? super File, ? extends t0> lVar, e23.a<? extends File> aVar) {
        k1Var.getClass();
        lVar.getClass();
        aVar.getClass();
        this.f169178a = k1Var;
        this.f169179b = lVar;
        this.f169180c = aVar;
    }

    @Override // u7.s1
    public final o0 createConnection() throws IOException {
        File canonicalFile = this.f169180c.invoke().getCanonicalFile();
        synchronized (f169177f) {
            String absolutePath = canonicalFile.getAbsolutePath();
            LinkedHashSet linkedHashSet = f169176e;
            if (linkedHashSet.contains(absolutePath)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            absolutePath.getClass();
            linkedHashSet.add(absolutePath);
        }
        return new o0(canonicalFile, this.f169178a, this.f169179b.invoke(canonicalFile), new l0(canonicalFile));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lu7/k0$b;", "", "<init>", "()V", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ k0(k1 k1Var, e23.l lVar, e23.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(k1Var, (i14 & 2) != 0 ? a.f169181a : lVar, aVar);
    }
}
