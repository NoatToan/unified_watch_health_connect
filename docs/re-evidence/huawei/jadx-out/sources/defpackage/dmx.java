package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public class dmx<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f32034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f32035b;
    private T d;

    public T c() {
        return this.d;
    }

    public Integer a() {
        return this.f32034a;
    }

    public dmx(int i, String str, T t) {
        this.f32034a = Integer.valueOf(i);
        this.f32035b = str;
        this.d = t;
    }

    public static <T> dmx<T> e(T t) {
        return new dmx<>(0, "", t);
    }

    public static <T> dmx<T> c(int i, String str) {
        return new dmx<>(i, str, null);
    }
}
