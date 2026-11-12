package aurelienribon.tweenengine;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
abstract class Pool<T> {
    private final ArrayList<T> a;
    private final Callback<T> b;

    public interface Callback<T> {
        void onPool(T t);

        void onUnPool(T t);
    }

    public Pool(int i, Callback<T> callback) {
        this.a = new ArrayList<>(i);
        this.b = callback;
    }

    public void a() {
        this.a.clear();
    }

    public abstract T b();

    public void c(int i) {
        this.a.ensureCapacity(i);
    }

    public void d(T t) {
        if (this.a.contains(t)) {
            return;
        }
        Callback<T> callback = this.b;
        if (callback != null) {
            callback.onPool(t);
        }
        this.a.add(t);
    }

    public T e() {
        T tRemove;
        if (this.a.isEmpty()) {
            tRemove = b();
        } else {
            ArrayList<T> arrayList = this.a;
            tRemove = arrayList.remove(arrayList.size() - 1);
        }
        Callback<T> callback = this.b;
        if (callback != null) {
            callback.onUnPool(tRemove);
        }
        return tRemove;
    }

    public int f() {
        return this.a.size();
    }
}
