package defpackage;

/* JADX INFO: loaded from: classes9.dex */
public class ibk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f37442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f37443b;
    private int d;

    public ibk(int i) {
        this(-1, i);
    }

    public ibk(int i, int i2) {
        this.d = i;
        this.f37443b = i2;
    }

    public int a() {
        return this.d;
    }

    public int b() {
        return this.f37443b;
    }

    public Object c() {
        return this.f37442a;
    }

    public void a(Object obj) {
        this.f37442a = obj;
    }

    public String toString() {
        return "RecycleItemData{viewId=" + this.d + ", viewType=" + this.f37443b + ", itemData=" + this.f37442a + '}';
    }
}
