package f63;

import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf63/a;", "T", "Lf63/e;", "", "formatters", "<init>", "(Ljava/util/List;)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a<T> implements e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<e<T>> f69375a;

    /* JADX WARN: Multi-variable type inference failed */
    public a(List<? extends e<? super T>> list) {
        list.getClass();
        this.f69375a = list;
    }

    @Override // f63.e
    public final void a(Object obj, StringBuilder sb3, boolean z14) {
        Iterator<e<T>> it = this.f69375a.iterator();
        while (it.hasNext()) {
            it.next().a(obj, sb3, z14);
        }
    }
}
