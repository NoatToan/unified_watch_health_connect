package androidx.work;

import gl1.y;
import java.util.concurrent.Executor;
import o53.s0;
import o53.z;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import ue.e;
import ue.e0;
import ue.f0;
import ue.i;
import ue.k0;
import ue.p;
import ue.w;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Landroidx/work/a;", "", "Landroidx/work/a$a;", "builder", "<init>", "(Landroidx/work/a$a;)V", "a", "c", "b", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f11435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f11436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f11437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ue.b f11438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k0 f11439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p f11440f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e0 f11441g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f11442h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f11443i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f11444j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f11445k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f11446l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f11447m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ue.d f11448n;

    public interface c {
        a a();
    }

    static {
        new b(null);
    }

    public a(C0163a c0163a) {
        c0163a.getClass();
        Executor executor = c0163a.f11449a;
        Executor executorA = executor == null ? e.a(false) : executor;
        this.f11435a = executorA;
        this.f11436b = executor != null ? y.o(executorA) : s0.f129406a;
        Executor executor2 = c0163a.f11452d;
        this.f11437c = executor2 == null ? e.a(true) : executor2;
        ue.b bVar = c0163a.f11453e;
        this.f11438d = bVar == null ? new f0() : bVar;
        k0 k0Var = c0163a.f11450b;
        this.f11439e = k0Var == null ? i.f170087a : k0Var;
        p pVar = c0163a.f11451c;
        this.f11440f = pVar == null ? w.f170130a : pVar;
        e0 e0Var = c0163a.f11454f;
        this.f11441g = e0Var == null ? new ve.d() : e0Var;
        this.f11443i = c0163a.f11456h;
        this.f11444j = c0163a.f11457i;
        this.f11446l = c0163a.f11458j;
        this.f11442h = c0163a.f11455g;
        this.f11445k = c0163a.f11459k;
        this.f11447m = c0163a.f11460l;
        ue.d dVar = c0163a.f11461m;
        this.f11448n = dVar == null ? new ue.d() : dVar;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/work/a$b;", "", "<init>", "()V", "", "MIN_SCHEDULER_LIMIT", "I", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: androidx.work.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/work/a$a;", "", "<init>", "()V", "Landroidx/work/a;", "configuration", "(Landroidx/work/a;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C0163a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Executor f11449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final k0 f11450b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p f11451c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Executor f11452d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ue.b f11453e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final e0 f11454f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f11455g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f11456h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f11457i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f11458j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f11459k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f11460l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final ue.d f11461m;

        public C0163a(a aVar) {
            aVar.getClass();
            this.f11449a = aVar.f11435a;
            this.f11450b = aVar.f11439e;
            this.f11451c = aVar.f11440f;
            this.f11452d = aVar.f11437c;
            this.f11453e = aVar.f11438d;
            this.f11456h = aVar.f11443i;
            this.f11457i = aVar.f11444j;
            this.f11458j = aVar.f11446l;
            this.f11454f = aVar.f11441g;
            this.f11455g = aVar.f11442h;
            this.f11459k = aVar.f11445k;
            this.f11460l = aVar.f11447m;
            this.f11461m = aVar.f11448n;
        }

        public C0163a() {
            this.f11455g = 600000L;
            this.f11456h = 4;
            this.f11457i = Integer.MAX_VALUE;
            this.f11458j = 20;
            this.f11459k = 8;
            this.f11460l = true;
        }
    }
}
