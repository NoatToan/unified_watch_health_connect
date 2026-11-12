package vy0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvy0/u;", "Lvy0/t;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lc.v f180770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f180771b;

    public u(lc.v vVar, t tVar) {
        this.f180770a = vVar;
        this.f180771b = tVar;
    }

    @Override // vy0.t
    public final void a(com.garmin.android.apps.connectmobile.navigation.more.b bVar, e23.a<Unit> aVar) {
        bVar.getClass();
        if (this.f180770a.f111888h.f144302j.f7973d == androidx.lifecycle.b0.b.RESUMED) {
            this.f180771b.a(bVar, aVar);
        }
    }
}
