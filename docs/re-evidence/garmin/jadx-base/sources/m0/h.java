package m0;

import b0.l0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0005B\u0013\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lm0/h;", "Lb0/l0$j;", "screenFlash", "<init>", "(Lb0/l0$j;)V", "a", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h implements l0.j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f115497e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0.j f115498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f115499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f115500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l0.k f115501d;

    private h(l0.j jVar) {
        this.f115498a = jVar;
        this.f115499b = new Object();
    }

    @Override // b0.l0.j
    public final void a(long j8, l0.k kVar) {
        kVar.getClass();
        synchronized (this.f115499b) {
            this.f115500c = true;
            this.f115501d = kVar;
            Unit unit = Unit.INSTANCE;
        }
        l0.j jVar = this.f115498a;
        if (jVar != null) {
            jVar.a(j8, new g(this, 0));
        } else {
            c();
        }
    }

    public final void b() {
        l0.j jVar;
        synchronized (this.f115499b) {
            try {
                if (this.f115500c && (jVar = this.f115498a) != null) {
                    jVar.clear();
                }
                this.f115500c = false;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void c() {
        synchronized (this.f115499b) {
            try {
                l0.k kVar = this.f115501d;
                if (kVar != null) {
                    kVar.a();
                }
                this.f115501d = null;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // b0.l0.j
    public final void clear() {
        b();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lm0/h$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ h(l0.j jVar, p005kotlin.jvm.internal.j jVar2) {
        this(jVar);
    }
}
