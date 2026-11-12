package yc;

import java.lang.ref.WeakReference;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u000b\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u00002\u001e\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00030\u0002H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "T", "Ljava/lang/ref/WeakReference;", "Lkotlin/Function2;", "Lyc/c1;", "Lyc/z0;", "", "it", "", "invoke", "(Ljava/lang/ref/WeakReference;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class q2 extends p005kotlin.jvm.internal.w implements e23.l<WeakReference<e23.p<? super c1, ? super z0, ? extends Unit>>, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.p<c1, z0, Unit> f196328a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q2(e23.p<? super c1, ? super z0, Unit> pVar) {
        super(1);
        this.f196328a = pVar;
    }

    @Override // e23.l
    public final Boolean invoke(WeakReference<e23.p<? super c1, ? super z0, ? extends Unit>> weakReference) {
        WeakReference<e23.p<? super c1, ? super z0, ? extends Unit>> weakReference2 = weakReference;
        weakReference2.getClass();
        return Boolean.valueOf(weakReference2.get() == null || weakReference2.get() == this.f196328a);
    }
}
