package e63;

import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Le63/i;", "T", "Le63/v;", "", "predicates", "<init>", "(Ljava/util/List;)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i<T> implements v<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<v<T>> f63249a;

    /* JADX WARN: Multi-variable type inference failed */
    public i(List<? extends v<? super T>> list) {
        list.getClass();
        this.f63249a = list;
    }

    @Override // e63.v
    public final boolean test(T t7) {
        List<v<T>> list = this.f63249a;
        if (list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((v) it.next()).test(t7)) {
                return false;
            }
        }
        return true;
    }
}
