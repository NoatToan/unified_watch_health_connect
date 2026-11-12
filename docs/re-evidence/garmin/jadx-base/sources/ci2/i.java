package ci2;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "shouldLeave", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class i extends w implements e23.l<Boolean, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f27700a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar) {
        super(1);
        this.f27700a = lVar;
    }

    @Override // e23.l
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            this.f27700a.d(false, null);
        }
        return Unit.INSTANCE;
    }
}
