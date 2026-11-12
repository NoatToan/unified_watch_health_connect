package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public abstract class PrimitiveSpreadBuilder<T> {
    private final int a;
    private int b;

    @NotNull
    private final T[] c;

    public PrimitiveSpreadBuilder(int i) {
        this.a = i;
        this.c = (T[]) new Object[i];
    }

    private static /* synthetic */ void a() {
    }

    public final void addSpread(@NotNull T t) {
        T[] tArr = this.c;
        int i = this.b;
        this.b = i + 1;
        tArr[i] = t;
    }

    public final int getPosition() {
        return this.b;
    }

    public abstract int getSize(@NotNull T t);

    public final void setPosition(int i) {
        this.b = i;
    }

    public final int size() {
        int i = this.a - 1;
        int i2 = 0;
        if (i < 0) {
            return 0;
        }
        int size = 0;
        while (true) {
            int i3 = i2 + 1;
            T t = this.c[i2];
            size += t == null ? 1 : getSize(t);
            if (i2 == i) {
                return size;
            }
            i2 = i3;
        }
    }

    @NotNull
    public final T toArray(@NotNull T t, @NotNull T t2) {
        int i;
        int i2 = this.a - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int i4 = 0;
            int i5 = 0;
            i = 0;
            while (true) {
                int i6 = i4 + 1;
                T t3 = this.c[i4];
                if (t3 != null) {
                    if (i5 < i4) {
                        int i7 = i4 - i5;
                        System.arraycopy(t, i5, t2, i, i7);
                        i += i7;
                    }
                    int size = getSize(t3);
                    System.arraycopy(t3, 0, t2, i, size);
                    i += size;
                    i5 = i6;
                }
                if (i4 == i2) {
                    break;
                }
                i4 = i6;
            }
            i3 = i5;
        } else {
            i = 0;
        }
        int i8 = this.a;
        if (i3 < i8) {
            System.arraycopy(t, i3, t2, i, i8 - i3);
        }
        return t2;
    }
}
