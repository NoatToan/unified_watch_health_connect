package ov1;

import android.content.Context;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f134157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f134158b;

    public /* synthetic */ e(f fVar, int i14) {
        this.f134157a = i14;
        this.f134158b = fVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f134157a;
        f fVar = this.f134158b;
        switch (i14) {
            case 0:
                f.a aVar = f.f134159c;
                Context contextRequireContext = fVar.requireContext();
                contextRequireContext.getClass();
                return new l22.a(contextRequireContext);
            default:
                f.a aVar2 = f.f134159c;
                fVar.getParentFragmentManager().Z();
                return Unit.INSTANCE;
        }
    }
}
