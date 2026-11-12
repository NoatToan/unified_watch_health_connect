package ew1;

import android.content.Context;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class q implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f66665b;

    public /* synthetic */ q(r rVar, int i14) {
        this.f66664a = i14;
        this.f66665b = rVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f66664a;
        r rVar = this.f66665b;
        switch (i14) {
            case 0:
                r.a aVar = r.f66699d;
                Context contextRequireContext = rVar.requireContext();
                contextRequireContext.getClass();
                return new l22.a(contextRequireContext);
            default:
                r.a aVar2 = r.f66699d;
                rVar.getParentFragmentManager().Z();
                return Unit.INSTANCE;
        }
    }
}
