package defpackage;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public final class hls implements t7s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f8s f20222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f8s f20223b;
    public final f8s c;
    public final f8s d;
    public final f8s e;
    public final f8s f;
    public final f8s g;

    public hls(f8s f8sVar, f8s f8sVar2, f8s f8sVar3, f8s f8sVar4, f8s f8sVar5, f8s f8sVar6, f8s f8sVar7) {
        this.f20222a = f8sVar;
        this.f20223b = f8sVar2;
        this.c = f8sVar3;
        this.d = f8sVar4;
        this.e = f8sVar5;
        this.f = f8sVar6;
        this.g = f8sVar7;
    }

    @Override // defpackage.f8s
    public final /* bridge */ /* synthetic */ Object a() {
        String str = (String) this.f20222a.a();
        Object objA = this.f20223b.a();
        Object objA2 = this.c.a();
        Context contextB = ((eft) this.d).b();
        Object objA3 = this.e.a();
        return new els(str != null ? new File(contextB.getExternalFilesDir(null), str) : contextB.getExternalFilesDir(null), (was) objA, (ihs) objA2, contextB, (dos) objA3, i7s.c(b8s.a(this.f)), (xns) this.g.a());
    }
}
