package k3;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.m;
import p3.d0;
import p3.p0;
import s1.e2;
import s1.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lk3/g;", "Lk3/f;", "Lk3/h;", "initialValue", "<init>", "(Lk3/h;)V", "a", "material3-adaptive-navigation-suite"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f102511c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1.b<Float, n> f102512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f102513b;

    public g(h hVar) {
        float f14 = e.f102509a;
        Float fValueOf = Float.valueOf(hVar == h.Visible ? 1.0f : 0.0f);
        m mVar = m.f105803a;
        this.f102512a = new s1.b<>(fValueOf, e2.f155568a, null, null, 12, null);
        this.f102513b = p0.f(new jx0.e(this, 7));
    }

    @Override // k3.f
    public final h a() {
        return (h) this.f102513b.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k3.f
    public final h getTargetValue() {
        return ((Number) this.f102512a.f155491e.getF182175a()).floatValue() == 1.0f ? h.Visible : h.Hidden;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lk3/g$a;", "", "<init>", "()V", "", "Hidden", "F", "Visible", "material3-adaptive-navigation-suite"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
