package l4;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
public final class d extends p005kotlin.jvm.internal.w implements e23.a<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f109842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f109843b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, f fVar) {
        super(0);
        this.f109842a = cVar;
        this.f109843b = fVar;
    }

    @Override // e23.a
    public final Unit invoke() {
        this.f109842a.f109840d.invoke(this.f109843b);
        return Unit.INSTANCE;
    }
}
