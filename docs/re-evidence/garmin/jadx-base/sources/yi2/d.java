package yi2;

import o13.q;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class d extends w implements e23.l<Boolean, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o53.j<Boolean> f197369a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(o53.j<? super Boolean> jVar) {
        super(1);
        this.f197369a = jVar;
    }

    @Override // e23.l
    public final Unit invoke(Boolean bool) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        int i14 = q.f128596b;
        this.f197369a.resumeWith(bool2);
        return Unit.INSTANCE;
    }
}
