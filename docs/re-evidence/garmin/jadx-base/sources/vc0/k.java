package vc0;

import android.os.Handler;
import androidx.fragment.app.Fragment;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvc0/k;", "Lxt2/a$d;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k implements xt2.a.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f176996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fragment f176997b;

    public k(j jVar, Fragment fragment) {
        this.f176996a = jVar;
        this.f176997b = fragment;
    }

    @Override // xt2.a.d
    public final void c(rs2.c cVar) {
        cVar.getClass();
        j.f176990h.debug("sendFindMyDeviceRequest: onFailedToStartFindMyWatch");
        j jVar = this.f176996a;
        Handler handler = jVar.f176995g;
        if (handler != null) {
            handler.post(new h(jVar, this.f176997b, 1));
        }
    }

    @Override // xt2.a.d
    public final void d(rs2.c cVar) {
        cVar.getClass();
        j.f176990h.debug("sendFindMyDeviceRequest: onStartFindMyWatch.");
        j jVar = this.f176996a;
        Handler handler = jVar.f176995g;
        if (handler != null) {
            handler.post(new h(jVar, this.f176997b, 2));
        }
    }
}
