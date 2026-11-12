package vz2;

import android.os.Bundle;
import android.webkit.CookieSyncManager;
import com.myfitnesspal.android.sdk.MfpAuthError;

/* JADX INFO: loaded from: classes3.dex */
public class h implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f180944a;

    public h(i iVar) {
        this.f180944a = iVar;
    }

    @Override // vz2.d
    public final void a(Bundle bundle) {
        CookieSyncManager.getInstance().sync();
        this.f180944a.d(bundle);
    }

    @Override // vz2.d
    public final void b(Bundle bundle) {
        this.f180944a.c(bundle);
    }

    @Override // vz2.d
    public final void c(MfpAuthError mfpAuthError) {
        this.f180944a.b(mfpAuthError);
    }

    @Override // vz2.d
    public final void d(g gVar) {
        i iVar = this.f180944a;
        iVar.getClass();
        wz2.a.a("Login failed: " + gVar, new Object[0]);
        iVar.f180953i.d(gVar);
    }
}
