package ml2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class e extends p005kotlin.jvm.internal.w implements e23.a<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f119327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f119328b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, Runnable runnable) {
        super(0);
        this.f119327a = dVar;
        this.f119328b = runnable;
    }

    @Override // e23.a
    public final Unit invoke() {
        this.f119327a.f119317d.debug("onResetNeeded");
        this.f119328b.run();
        return Unit.INSTANCE;
    }
}
