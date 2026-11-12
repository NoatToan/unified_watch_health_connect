package defpackage;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.Ordering;
import com.google.common.collect.ParametricNullness;
import com.huawei.operation.utils.Constants;
import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class akc<F, T> extends Ordering<F> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Function<F, ? extends T> f496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Ordering<T> f497c;

    public akc(Function<F, ? extends T> function, Ordering<T> ordering) {
        this.f496b = (Function) Preconditions.checkNotNull(function);
        this.f497c = (Ordering) Preconditions.checkNotNull(ordering);
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(@ParametricNullness F f, @ParametricNullness F f2) {
        return this.f497c.compare(this.f496b.apply(f), this.f496b.apply(f2));
    }

    @Override // java.util.Comparator
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof akc)) {
            return false;
        }
        akc akcVar = (akc) obj;
        return this.f496b.equals(akcVar.f496b) && this.f497c.equals(akcVar.f497c);
    }

    public int hashCode() {
        return Objects.hashCode(this.f496b, this.f497c);
    }

    public String toString() {
        return this.f497c + ".onResultOf(" + this.f496b + Constants.RIGHT_BRACKET_ONLY;
    }
}
