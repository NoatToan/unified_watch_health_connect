package defpackage;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.Ordering;
import com.google.common.collect.ParametricNullness;
import com.huawei.operation.utils.Constants;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class alp<T> extends Ordering<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Comparator<? super T>[] f513a;

    public alp(Comparator<? super T> comparator, Comparator<? super T> comparator2) {
        this.f513a = new Comparator[]{comparator, comparator2};
    }

    public alp(Iterable<? extends Comparator<? super T>> iterable) {
        this.f513a = (Comparator[]) amn.a((Iterable) iterable, (Object[]) new Comparator[0]);
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(@ParametricNullness T t, @ParametricNullness T t2) {
        int i = 0;
        while (true) {
            Comparator<? super T>[] comparatorArr = this.f513a;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i].compare(t, t2);
            if (iCompare != 0) {
                return iCompare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof alp) {
            return Arrays.equals(this.f513a, ((alp) obj).f513a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f513a);
    }

    public String toString() {
        return "Ordering.compound(" + Arrays.toString(this.f513a) + Constants.RIGHT_BRACKET_ONLY;
    }
}
