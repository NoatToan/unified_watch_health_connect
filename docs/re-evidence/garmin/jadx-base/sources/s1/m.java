package s1;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p3.x3;
import s1.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004BM\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0001\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ls1/m;", "T", "Ls1/r;", "V", "Lp3/x3;", "Ls1/c2;", "typeConverter", "initialValue", "initialVelocityVector", "", "lastFrameTimeNanos", "finishedTimeNanos", "", "isRunning", "<init>", "(Ls1/c2;Ljava/lang/Object;Ls1/r;JJZ)V", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m<T, V extends r> implements x3<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2<T, V> f155627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p3.c2 f155628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public V f155629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f155630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f155631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f155632f;

    public m(c2<T, V> c2Var, T t7, V v14, long j8, long j14, boolean z14) {
        V vInvoke;
        this.f155627a = c2Var;
        this.f155628b = p3.p0.n(t7);
        if (v14 != null) {
            vInvoke = (V) v.c(v14);
        } else {
            vInvoke = c2Var.a().invoke(t7);
            vInvoke.d();
        }
        this.f155629c = vInvoke;
        this.f155630d = j8;
        this.f155631e = j14;
        this.f155632f = z14;
    }

    public final T a() {
        return this.f155627a.b().invoke(this.f155629c);
    }

    @Override // p3.x3
    /* JADX INFO: renamed from: getValue */
    public final T getF182175a() {
        return this.f155628b.getF182175a();
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AnimationState(value=");
        sb3.append(this.f155628b.getF182175a());
        sb3.append(", velocity=");
        sb3.append(a());
        sb3.append(", isRunning=");
        sb3.append(this.f155632f);
        sb3.append(", lastFrameTimeNanos=");
        sb3.append(this.f155630d);
        sb3.append(", finishedTimeNanos=");
        return androidx.room.a0.l(sb3, this.f155631e, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public /* synthetic */ m(c2 c2Var, Object obj, r rVar, long j8, long j14, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(c2Var, obj, (i14 & 4) != 0 ? null : rVar, (i14 & 8) != 0 ? Long.MIN_VALUE : j8, (i14 & 16) != 0 ? Long.MIN_VALUE : j14, (i14 & 32) != 0 ? false : z14);
    }
}
