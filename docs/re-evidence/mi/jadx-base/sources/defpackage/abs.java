package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class abs implements t7s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f8s f866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f8s f867b;
    public final f8s c;
    public final f8s d;
    public final f8s e;
    public final f8s f;
    public final f8s g;
    public final f8s h;
    public final f8s i;

    public abs(f8s f8sVar, f8s f8sVar2, f8s f8sVar3, f8s f8sVar4, f8s f8sVar5, f8s f8sVar6, f8s f8sVar7, f8s f8sVar8, f8s f8sVar9) {
        this.f866a = f8sVar;
        this.f867b = f8sVar2;
        this.c = f8sVar3;
        this.d = f8sVar4;
        this.e = f8sVar5;
        this.f = f8sVar6;
        this.g = f8sVar7;
        this.h = f8sVar8;
        this.i = f8sVar9;
    }

    @Override // defpackage.f8s
    public final /* bridge */ /* synthetic */ Object a() {
        Context contextB = ((eft) this.f866a).b();
        Object objA = this.f867b.a();
        Object objA2 = this.c.a();
        i7s i7sVarC = i7s.c(b8s.a(this.d));
        Object objA3 = this.e.a();
        return new was(contextB, (eks) objA, (xgs) objA2, i7sVarC, (ihs) objA3, (tds) this.f.a(), i7s.c(b8s.a(this.g)), i7s.c(b8s.a(this.h)), (xns) this.i.a());
    }
}
