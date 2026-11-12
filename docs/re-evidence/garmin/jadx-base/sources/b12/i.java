package b12;

import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p007l6.b0;
import p007l6.z;
import p5.k0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp5/k0;", "", "invoke", "(Lp5/k0;)V", "<anonymous>"}, k = 3, mv = {2, 3, 0})
public final class i extends w implements l<k0, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f14413a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(z zVar) {
        super(1);
        this.f14413a = zVar;
    }

    @Override // e23.l
    public final Unit invoke(k0 k0Var) {
        b0.a(k0Var, this.f14413a);
        return Unit.INSTANCE;
    }
}
