package k4;

import e23.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lk4/c;", "event", "Lk4/i;", "invoke", "(Lk4/c;)Lk4/i;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
public final class g extends w implements l<c, i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l<c, Boolean> f102821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f102822b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(l<? super c, Boolean> lVar, i iVar) {
        super(1);
        this.f102821a = lVar;
        this.f102822b = iVar;
    }

    @Override // e23.l
    public final i invoke(c cVar) {
        if (this.f102821a.invoke(cVar).booleanValue()) {
            return this.f102822b;
        }
        return null;
    }
}
