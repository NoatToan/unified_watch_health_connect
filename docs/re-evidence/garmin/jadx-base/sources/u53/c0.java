package u53;

import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import o53.z0;
import p005kotlin.Metadata;
import u53.d0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000*\u0012\b\u0000\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0004j\u0002`\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u000b\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¨\u0006\t"}, d2 = {"Lu53/c0;", "Lu53/d0;", "", "T", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "<init>", "()V", "_size", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class c0<T extends d0 & Comparable<? super T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f168723b = AtomicIntegerFieldUpdater.newUpdater(c0.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T[] f168724a;

    public final void a(z0.c cVar) {
        cVar.a((z0.d) this);
        T[] tArr = this.f168724a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f168723b;
        if (tArr == null) {
            tArr = (T[]) new d0[4];
            this.f168724a = tArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= tArr.length) {
            tArr = (T[]) ((d0[]) Arrays.copyOf(tArr, atomicIntegerFieldUpdater.get(this) * 2));
            this.f168724a = tArr;
        }
        int i14 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i14 + 1);
        tArr[i14] = cVar;
        cVar.f129433b = i14;
        c(i14);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0047  */
    /* JADX WARN: Code duplicated, block: B:14:0x0054  */
    /* JADX WARN: Code duplicated, block: B:17:0x0067  */
    /* JADX WARN: Code duplicated, block: B:21:0x007b A[LOOP:0: B:9:0x003c->B:21:0x007b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0080 A[EDGE_INSN: B:24:0x0080->B:22:0x0080 BREAK  A[LOOP:0: B:9:0x003c->B:21:0x007b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0080 A[EDGE_INSN: B:25:0x0080->B:22:0x0080 BREAK  A[LOOP:0: B:9:0x003c->B:21:0x007b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[SYNTHETIC] */
    public final T b(int i14) {
        int i15;
        int i16;
        T[] tArr;
        int i17;
        T t7;
        T t14;
        T t15;
        T t16;
        T[] tArr2 = this.f168724a;
        tArr2.getClass();
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f168723b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i14 < atomicIntegerFieldUpdater.get(this)) {
            d(i14, atomicIntegerFieldUpdater.get(this));
            int i18 = (i14 - 1) / 2;
            if (i14 > 0) {
                T t17 = tArr2[i14];
                t17.getClass();
                T t18 = tArr2[i18];
                t18.getClass();
                if (((Comparable) t17).compareTo(t18) < 0) {
                    d(i14, i18);
                    c(i18);
                } else {
                    while (true) {
                        i15 = i14 * 2;
                        i16 = i15 + 1;
                        if (i16 >= atomicIntegerFieldUpdater.get(this)) {
                            break;
                        }
                        tArr = this.f168724a;
                        tArr.getClass();
                        i17 = i15 + 2;
                        if (i17 < atomicIntegerFieldUpdater.get(this)) {
                            t15 = tArr[i17];
                            t15.getClass();
                            t16 = tArr[i16];
                            t16.getClass();
                            if (((Comparable) t15).compareTo(t16) >= 0) {
                                i17 = i16;
                            }
                        } else {
                            i17 = i16;
                        }
                        t7 = tArr[i14];
                        t7.getClass();
                        t14 = tArr[i17];
                        t14.getClass();
                        if (((Comparable) t7).compareTo(t14) <= 0) {
                            break;
                        }
                        d(i14, i17);
                        i14 = i17;
                    }
                }
            } else {
                while (true) {
                    i15 = i14 * 2;
                    i16 = i15 + 1;
                    if (i16 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                        break;
                    }
                    tArr = this.f168724a;
                    tArr.getClass();
                    i17 = i15 + 2;
                    if (i17 < atomicIntegerFieldUpdater.get(this)) {
                        t15 = tArr[i17];
                        t15.getClass();
                        t16 = tArr[i16];
                        t16.getClass();
                        if (((Comparable) t15).compareTo(t16) >= 0) {
                            i17 = i16;
                        }
                    } else {
                        i17 = i16;
                    }
                    t7 = tArr[i14];
                    t7.getClass();
                    t14 = tArr[i17];
                    t14.getClass();
                    if (((Comparable) t7).compareTo(t14) <= 0) {
                        break;
                        break;
                    }
                    d(i14, i17);
                    i14 = i17;
                }
            }
        }
        T t19 = tArr2[atomicIntegerFieldUpdater.get(this)];
        t19.getClass();
        t19.a(null);
        t19.setIndex(-1);
        tArr2[atomicIntegerFieldUpdater.get(this)] = null;
        return t19;
    }

    public final void c(int i14) {
        while (i14 > 0) {
            T[] tArr = this.f168724a;
            tArr.getClass();
            int i15 = (i14 - 1) / 2;
            T t7 = tArr[i15];
            t7.getClass();
            T t14 = tArr[i14];
            t14.getClass();
            if (((Comparable) t7).compareTo(t14) <= 0) {
                return;
            }
            d(i14, i15);
            i14 = i15;
        }
    }

    public final void d(int i14, int i15) {
        T[] tArr = this.f168724a;
        tArr.getClass();
        T t7 = tArr[i15];
        t7.getClass();
        T t14 = tArr[i14];
        t14.getClass();
        tArr[i14] = t7;
        tArr[i15] = t14;
        t7.setIndex(i14);
        t14.setIndex(i15);
    }
}
