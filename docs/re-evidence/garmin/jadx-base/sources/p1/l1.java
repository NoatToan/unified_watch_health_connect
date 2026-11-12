package p1;

import android.content.res.ColorStateList;
import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001a\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lp1/l1;", "E", "", "", "initialCapacity", "<init>", "(I)V", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class l1<E> implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f134764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ int[] f134765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f134766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f134767d;

    public l1(int i14) {
        if (i14 == 0) {
            this.f134765b = q1.a.f142054a;
            this.f134766c = q1.a.f142056c;
            return;
        }
        int i15 = i14 * 4;
        for (int i16 = 4; i16 < 32; i16++) {
            int i17 = (1 << i16) - 12;
            if (i15 <= i17) {
                i15 = i17;
                break;
            }
        }
        int i18 = i15 / 4;
        this.f134765b = new int[i18];
        this.f134766c = new Object[i18];
    }

    public final void a(int i14, ColorStateList colorStateList) {
        int i15 = this.f134767d;
        if (i15 != 0 && i14 <= this.f134765b[i15 - 1]) {
            e(i14, colorStateList);
            return;
        }
        if (this.f134764a && i15 >= this.f134765b.length) {
            b0.a(this);
        }
        int i16 = this.f134767d;
        if (i16 >= this.f134765b.length) {
            int i17 = (i16 + 1) * 4;
            for (int i18 = 4; i18 < 32; i18++) {
                int i19 = (1 << i18) - 12;
                if (i17 <= i19) {
                    i17 = i19;
                    break;
                }
            }
            int i24 = i17 / 4;
            this.f134765b = Arrays.copyOf(this.f134765b, i24);
            this.f134766c = Arrays.copyOf(this.f134766c, i24);
        }
        this.f134765b[i16] = i14;
        this.f134766c[i16] = colorStateList;
        this.f134767d = i16 + 1;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final l1<E> clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        l1<E> l1Var = (l1) objClone;
        l1Var.f134765b = (int[]) this.f134765b.clone();
        l1Var.f134766c = (Object[]) this.f134766c.clone();
        return l1Var;
    }

    public final E c(int i14) {
        E e4;
        int iA = q1.a.a(this.f134767d, i14, this.f134765b);
        if (iA < 0 || (e4 = (E) this.f134766c[iA]) == b0.f134676c) {
            return null;
        }
        return e4;
    }

    public final int d(int i14) {
        if (this.f134764a) {
            b0.a(this);
        }
        return this.f134765b[i14];
    }

    public final void e(int i14, E e4) {
        int iA = q1.a.a(this.f134767d, i14, this.f134765b);
        if (iA >= 0) {
            this.f134766c[iA] = e4;
            return;
        }
        int i15 = ~iA;
        int i16 = this.f134767d;
        if (i15 < i16) {
            Object[] objArr = this.f134766c;
            if (objArr[i15] == b0.f134676c) {
                this.f134765b[i15] = i14;
                objArr[i15] = e4;
                return;
            }
        }
        if (this.f134764a && i16 >= this.f134765b.length) {
            b0.a(this);
            i15 = ~q1.a.a(this.f134767d, i14, this.f134765b);
        }
        int i17 = this.f134767d;
        if (i17 >= this.f134765b.length) {
            int i18 = (i17 + 1) * 4;
            for (int i19 = 4; i19 < 32; i19++) {
                int i24 = (1 << i19) - 12;
                if (i18 <= i24) {
                    i18 = i24;
                    break;
                }
            }
            int i25 = i18 / 4;
            this.f134765b = Arrays.copyOf(this.f134765b, i25);
            this.f134766c = Arrays.copyOf(this.f134766c, i25);
        }
        int i26 = this.f134767d;
        if (i26 - i15 != 0) {
            int[] iArr = this.f134765b;
            int i27 = i15 + 1;
            p13.s.d(i27, i15, i26, iArr, iArr);
            Object[] objArr2 = this.f134766c;
            p13.s.h(objArr2, objArr2, i27, i15, this.f134767d);
        }
        this.f134765b[i15] = i14;
        this.f134766c[i15] = e4;
        this.f134767d++;
    }

    public final int f() {
        if (this.f134764a) {
            b0.a(this);
        }
        return this.f134767d;
    }

    public final E g(int i14) {
        if (this.f134764a) {
            b0.a(this);
        }
        Object[] objArr = this.f134766c;
        if (i14 < objArr.length) {
            return (E) objArr[i14];
        }
        int i15 = d.f134691a;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        if (f() <= 0) {
            return "{}";
        }
        StringBuilder sb3 = new StringBuilder(this.f134767d * 28);
        sb3.append(CoreConstants.CURLY_LEFT);
        int i14 = this.f134767d;
        for (int i15 = 0; i15 < i14; i15++) {
            if (i15 > 0) {
                sb3.append(", ");
            }
            sb3.append(d(i15));
            sb3.append('=');
            E eG = g(i15);
            if (eG != this) {
                sb3.append(eG);
            } else {
                sb3.append("(this Map)");
            }
        }
        sb3.append(CoreConstants.CURLY_RIGHT);
        return sb3.toString();
    }

    public l1() {
        this(0, 1, null);
    }

    public /* synthetic */ l1(int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? 10 : i14);
    }
}
