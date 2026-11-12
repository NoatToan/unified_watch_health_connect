package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hoo {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static class a<T> extends xno<T> {
        public final /* synthetic */ xno c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xno xnoVar, xno xnoVar2) {
            super(xnoVar);
            this.c = xnoVar2;
        }

        @Override // defpackage.a6h
        public void onCompleted() {
            this.c.onCompleted();
        }

        @Override // defpackage.a6h
        public void onError(Throwable th) {
            this.c.onError(th);
        }

        @Override // defpackage.a6h
        public void onNext(T t) {
            this.c.onNext(t);
        }
    }

    public static <T> xno<T> a(xno<? super T> xnoVar) {
        return new a(xnoVar, xnoVar);
    }
}
