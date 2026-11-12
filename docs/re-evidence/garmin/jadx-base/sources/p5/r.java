package p5;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> extends p005kotlin.jvm.internal.w implements e23.a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f136091a = new a();

        public a() {
            super(0);
        }

        @Override // e23.a
        public final T invoke() {
            return null;
        }
    }

    public static final <T> T a(q qVar, j0<T> j0Var) {
        a aVar = a.f136091a;
        T t7 = (T) qVar.f136085a.d(j0Var);
        return t7 == null ? aVar.invoke() : t7;
    }
}
