package og2;

import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class n<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p005kotlin.jvm.internal.r0 f132065a;

    public n(p005kotlin.jvm.internal.r0 r0Var) {
        this.f132065a = r0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        int iIntValue = ((Number) t14).intValue();
        p005kotlin.jvm.internal.r0 r0Var = this.f132065a;
        return r13.a.b(Float.valueOf(((float[]) r0Var.f105810a)[iIntValue]), Float.valueOf(((float[]) r0Var.f105810a)[((Number) t7).intValue()]));
    }
}
