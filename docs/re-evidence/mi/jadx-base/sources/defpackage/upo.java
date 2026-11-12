package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class upo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tpo<Boolean> f36005a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final tpo<Boolean> f36006b = new c();

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static class a<T> implements tpo<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f36007a;

        public a(Object obj) {
            this.f36007a = obj;
        }

        @Override // defpackage.tpo
        public T get() {
            return (T) this.f36007a;
        }
    }

    public static class b implements tpo<Boolean> {
        @Override // defpackage.tpo
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean get() {
            return Boolean.TRUE;
        }
    }

    public static class c implements tpo<Boolean> {
        @Override // defpackage.tpo
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean get() {
            return Boolean.FALSE;
        }
    }

    public static <T> tpo<T> a(T t) {
        return new a(t);
    }
}
