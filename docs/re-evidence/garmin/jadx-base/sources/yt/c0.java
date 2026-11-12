package yt;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "androidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$onHelpersChanged$1"}, k = 3, mv = {2, 3, 0}, xi = 48)
public final class c0 extends p005kotlin.jvm.internal.w implements e23.a<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p1 f199279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p007l6.p f199280b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(p1 p1Var, p007l6.p pVar) {
        super(0);
        this.f199279a = p1Var;
        this.f199280b = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Unit invoke() {
        p1 p1Var = this.f199279a;
        p1Var.setValue(Boolean.valueOf(!((Boolean) p1Var.getF182175a()).booleanValue()));
        this.f199280b.f110492d = true;
        return Unit.INSTANCE;
    }
}
