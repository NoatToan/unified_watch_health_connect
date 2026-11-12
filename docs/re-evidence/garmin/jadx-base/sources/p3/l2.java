package p3;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lp3/l2;", "T", "Lp3/k2;", "Lp3/p1;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lt13/g;", "coroutineContext", "<init>", "(Lp3/p1;Lt13/g;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l2<T> implements k2<T>, p1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p1<T> f135149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t13.g f135150b;

    public l2(p1<T> p1Var, t13.g gVar) {
        this.f135149a = p1Var;
        this.f135150b = gVar;
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext, reason: from getter */
    public final t13.g getF135150b() {
        return this.f135150b;
    }

    @Override // p3.x3
    /* JADX INFO: renamed from: getValue */
    public final T getF182175a() {
        return this.f135149a.getF182175a();
    }

    @Override // p3.p1
    public final void setValue(T t7) {
        this.f135149a.setValue(t7);
    }

    @Override // p3.p1
    public final e23.l<T, Unit> y() {
        return this.f135149a.y();
    }

    @Override // p3.p1
    public final T z() {
        return this.f135149a.z();
    }
}
