package defpackage;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class aet implements t7s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f8s f937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f8s f938b;

    public aet(f8s f8sVar, f8s f8sVar2) {
        this.f937a = f8sVar;
        this.f938b = f8sVar2;
    }

    @Override // defpackage.f8s
    public final /* bridge */ /* synthetic */ Object a() {
        Object objA = this.f937a.a();
        Context contextB = ((eft) this.f938b).b();
        x4t x4tVar = (x4t) objA;
        d5s.a(contextB.getPackageManager(), new ComponentName(contextB.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"), 4);
        d5s.a(contextB.getPackageManager(), new ComponentName(contextB.getPackageName(), "com.google.android.play.core.assetpacks.ExtractionForegroundService"), 4);
        n7s.a(x4tVar);
        return x4tVar;
    }
}
