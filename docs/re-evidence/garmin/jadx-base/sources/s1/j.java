package s1;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import s1.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B[\b\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0010\b\u001a\u00028\u0001\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00028\u0000\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ls1/j;", "T", "Ls1/r;", "V", "", "initialValue", "Ls1/c2;", "typeConverter", "initialVelocityVector", "", "lastFrameTimeNanos", "targetValue", "startTimeNanos", "", "isRunning", "Lkotlin/Function0;", "", "onCancel", "<init>", "(Ljava/lang/Object;Ls1/c2;Ls1/r;JLjava/lang/Object;JZLe23/a;)V", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j<T, V extends r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2<T, V> f155603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f155604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f155605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.a<Unit> f155606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p3.c2 f155607e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public V f155608f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f155609g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f155610h = Long.MIN_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p3.c2 f155611i;

    public j(T t7, c2<T, V> c2Var, V v14, long j8, T t14, long j14, boolean z14, e23.a<Unit> aVar) {
        this.f155603a = c2Var;
        this.f155604b = t14;
        this.f155605c = j14;
        this.f155606d = aVar;
        this.f155607e = p3.p0.n(t7);
        this.f155608f = (V) v.c(v14);
        this.f155609g = j8;
        this.f155611i = p3.p0.n(Boolean.valueOf(z14));
    }

    public final void a() {
        this.f155611i.setValue(Boolean.FALSE);
        this.f155606d.invoke();
    }

    public final T b() {
        return this.f155603a.b().invoke(this.f155608f);
    }
}
