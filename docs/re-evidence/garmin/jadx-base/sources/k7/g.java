package k7;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lk7/g;", "", "T", "Lk7/f;", "", "maxPoolSize", "<init>", "(I)V", "core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class g<T> extends f<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f103266c;

    public g(int i14) {
        super(i14);
        this.f103266c = new Object();
    }

    @Override // k7.f, k7.e
    public final boolean a(T t7) {
        boolean zA;
        t7.getClass();
        synchronized (this.f103266c) {
            zA = super.a(t7);
        }
        return zA;
    }

    @Override // k7.f, k7.e
    public final T acquire() {
        T t7;
        synchronized (this.f103266c) {
            t7 = (T) super.acquire();
        }
        return t7;
    }
}
