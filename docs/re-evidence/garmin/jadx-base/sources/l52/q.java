package l52;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ll52/q;", "T", "", "value", "<init>", "(Ljava/lang/Object;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f110337a;

    public q(T t7) {
        this.f110337a = t7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && p005kotlin.jvm.internal.s.g(this.f110337a, ((q) obj).f110337a);
    }

    public final int hashCode() {
        T t7 = this.f110337a;
        if (t7 == null) {
            return 0;
        }
        return t7.hashCode();
    }

    public final String toString() {
        return org.apache.commons.lang3.e.f("ValueHolder(value=", ")", this.f110337a);
    }
}
