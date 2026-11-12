package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dmq {

    public enum a implements zta<Object, Boolean> {
        INSTANCE;

        @Override // defpackage.zta
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Object obj) {
            return Boolean.TRUE;
        }
    }

    public enum b implements zta<Object, Object> {
        INSTANCE;

        @Override // defpackage.zta
        public Object call(Object obj) {
            return obj;
        }
    }

    public static <T> zta<? super T, Boolean> a() {
        return a.INSTANCE;
    }

    public static <T> zta<T, T> b() {
        return b.INSTANCE;
    }
}
