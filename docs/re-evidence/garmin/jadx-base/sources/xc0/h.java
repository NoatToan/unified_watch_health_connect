package xc0;

import android.os.Handler;
import androidx.fragment.app.Fragment;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxc0/h;", "Lxt2/a$d;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h implements xt2.a.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f189927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fragment f189928b;

    public h(g gVar, Fragment fragment) {
        this.f189927a = gVar;
        this.f189928b = fragment;
    }

    @Override // xt2.a.d
    public final void c(rs2.c cVar) {
        cVar.getClass();
        g.f189921g.debug("sendFindMyDeviceRequest: onFailedToStartFindMyWatch");
        g gVar = this.f189927a;
        Handler handler = gVar.f189926f;
        if (handler != null) {
            handler.post(new f(gVar, this.f189928b, 2));
        }
    }

    @Override // xt2.a.d
    public final void d(rs2.c cVar) {
        cVar.getClass();
        g.f189921g.debug("sendFindMyDeviceRequest: onStartFindMyWatch.");
        g gVar = this.f189927a;
        Handler handler = gVar.f189926f;
        if (handler != null) {
            handler.post(new f(gVar, this.f189928b, 1));
        }
    }
}
