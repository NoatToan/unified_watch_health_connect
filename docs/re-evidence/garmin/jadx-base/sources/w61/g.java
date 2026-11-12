package w61;

import androidx.lifecycle.z0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lw61/g;", "T", "Landroidx/lifecycle/z0;", "Lw61/f;", "Lkotlin/Function1;", "", "onEventProduced", "<init>", "(Le23/l;)V", "gcm-legacy_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g<T> implements z0<f<? extends T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<T, Unit> f183182a;

    /* JADX WARN: Multi-variable type inference failed */
    public g(e23.l<? super T, Unit> lVar) {
        lVar.getClass();
        this.f183182a = lVar;
    }

    @Override // androidx.lifecycle.z0
    public final void onChanged(Object obj) {
        f fVar = (f) obj;
        fVar.getClass();
        Object objA = fVar.a();
        if (objA != null) {
            this.f183182a.invoke((T) objA);
        }
    }
}
