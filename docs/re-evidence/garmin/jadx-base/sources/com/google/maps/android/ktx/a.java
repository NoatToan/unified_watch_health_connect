package com.google.maps.android.ktx;

import com.google.android.gms.maps.GoogleMap;
import q53.t;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements GoogleMap.OnCameraIdleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f54323b;

    public /* synthetic */ a(t tVar, int i14) {
        this.f54322a = i14;
        this.f54323b = tVar;
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnCameraIdleListener
    public final void onCameraIdle() {
        switch (this.f54322a) {
            case 0:
                GoogleMapKt.AnonymousClass1.invokeSuspend$lambda$0(this.f54323b);
                break;
            default:
                GoogleMapKt.C39261.invokeSuspend$lambda$0(this.f54323b);
                break;
        }
    }
}
