package g2;

import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {2, 0, 0})
public final class f0<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k0 f75102a;

    public f0(k0 k0Var) {
        this.f75102a = k0Var;
    }

    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        Object key = ((t0) t14).getKey();
        k0 k0Var = this.f75102a;
        return r13.a.b(Integer.valueOf(k0Var.a(key)), Integer.valueOf(k0Var.a(((t0) t7).getKey())));
    }
}
