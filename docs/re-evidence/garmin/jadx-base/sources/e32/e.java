package e32;

import androidx.lifecycle.z0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Le32/e;", "T", "Landroidx/lifecycle/z0;", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class e<T> implements z0<T> {
    public abstract void a(T t7);

    @Override // androidx.lifecycle.z0
    public final void onChanged(T t7) {
        if (t7 != null) {
            a(t7);
        }
    }
}
