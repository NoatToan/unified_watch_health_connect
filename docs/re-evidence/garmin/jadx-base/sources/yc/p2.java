package yc;

import java.lang.ref.WeakReference;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "T", "Ljava/lang/ref/WeakReference;", "Lyc/m2$b;", "it", "", "invoke", "(Ljava/lang/ref/WeakReference;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class p2 extends p005kotlin.jvm.internal.w implements e23.l<WeakReference<m2.b>, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m2.b f196311a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(m2.b bVar) {
        super(1);
        this.f196311a = bVar;
    }

    @Override // e23.l
    public final Boolean invoke(WeakReference<m2.b> weakReference) {
        WeakReference<m2.b> weakReference2 = weakReference;
        weakReference2.getClass();
        return Boolean.valueOf(weakReference2.get() == null || weakReference2.get() == this.f196311a);
    }
}
