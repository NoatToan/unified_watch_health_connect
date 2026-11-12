package kotlin;

import t13.g;

/* JADX INFO: loaded from: classes.dex */
public interface g2 extends g.a {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final a f91193c0 = a.f91194a;

    @p005kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Li5/g2$a;", "Lt13/g$b;", "Li5/g2;", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements g.b<g2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f91194a = new a();

        private a() {
        }
    }

    @Override // t13.g.a
    default g.b<?> getKey() {
        return f91193c0;
    }

    Object x();
}
