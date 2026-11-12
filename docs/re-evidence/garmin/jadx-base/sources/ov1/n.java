package ov1;

import android.content.Context;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class n implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f134200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f134201b;

    public /* synthetic */ n(p pVar, int i14) {
        this.f134200a = i14;
        this.f134201b = pVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f134200a;
        p pVar = this.f134201b;
        switch (i14) {
            case 0:
                p.a aVar = p.f134204c;
                Context contextRequireContext = pVar.requireContext();
                contextRequireContext.getClass();
                return new l22.a(contextRequireContext);
            default:
                p.a aVar2 = p.f134204c;
                pVar.getParentFragmentManager().Z();
                return Unit.INSTANCE;
        }
    }
}
