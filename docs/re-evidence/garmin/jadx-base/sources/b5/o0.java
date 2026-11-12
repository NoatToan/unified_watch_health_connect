package b5;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lb5/o0;", "Lkotlin/Function1;", "", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o0 implements e23.l<Boolean, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i0 f15864a;

    @Override // e23.l
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        i0 i0Var = this.f15864a;
        if (i0Var != null) {
            i0Var.f15818c = zBooleanValue;
        }
        return Unit.INSTANCE;
    }
}
