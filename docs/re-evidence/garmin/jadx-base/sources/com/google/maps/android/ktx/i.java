package com.google.maps.android.ktx;

import com.google.android.gms.maps.StreetViewPanorama;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StreetViewPanorama f54334b;

    public /* synthetic */ i(StreetViewPanorama streetViewPanorama, int i14) {
        this.f54333a = i14;
        this.f54334b = streetViewPanorama;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f54333a) {
            case 0:
                return StreetViewPanoramaViewKt.AnonymousClass1.invokeSuspend$lambda$1(this.f54334b);
            case 1:
                return StreetViewPanoramaViewKt.C39451.invokeSuspend$lambda$1(this.f54334b);
            case 2:
                return StreetViewPanoramaViewKt.C39461.invokeSuspend$lambda$1(this.f54334b);
            default:
                return StreetViewPanoramaViewKt.C39471.invokeSuspend$lambda$1(this.f54334b);
        }
    }
}
