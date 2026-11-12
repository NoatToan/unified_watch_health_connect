package defpackage;

import com.bumptech.glide.load.DataSource;

/* JADX INFO: loaded from: classes4.dex */
public class nvg<R> implements lzp<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nvg<?> f28478a = new nvg<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final xzp<?> f28479b = new a();

    public static class a<R> implements xzp<R> {
        @Override // defpackage.xzp
        public lzp<R> a(DataSource dataSource, boolean z) {
            return nvg.f28478a;
        }
    }

    public static <R> xzp<R> b() {
        return (xzp<R>) f28479b;
    }

    @Override // defpackage.lzp
    public boolean a(Object obj, lzp.a aVar) {
        return false;
    }
}
