package ca0;

import android.content.Context;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class r0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c42.c0 f26438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f26439c;

    public /* synthetic */ r0(c42.c0 c0Var, Context context, int i14) {
        this.f26437a = i14;
        this.f26438b = c0Var;
        this.f26439c = context;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        l90.b bVar = (l90.b) obj;
        switch (this.f26437a) {
            case 0:
                bVar.getClass();
                this.f26438b.invoke(this.f26439c, bVar);
                break;
            default:
                bVar.getClass();
                this.f26438b.invoke(this.f26439c, bVar);
                break;
        }
        return Unit.INSTANCE;
    }
}
