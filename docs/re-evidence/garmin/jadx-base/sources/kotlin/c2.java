package kotlin;

import e23.l;
import p005kotlin.jvm.internal.w;
import q53.i;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
public final class c2 extends w implements l<Object, p005kotlin.Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i<p005kotlin.Unit> f91124a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(i<p005kotlin.Unit> iVar) {
        super(1);
        this.f91124a = iVar;
    }

    @Override // e23.l
    public final p005kotlin.Unit invoke(Object obj) {
        if (d2.f91134c.compareAndSet(false, true)) {
            this.f91124a.i(p005kotlin.Unit.INSTANCE);
        }
        return p005kotlin.Unit.INSTANCE;
    }
}
