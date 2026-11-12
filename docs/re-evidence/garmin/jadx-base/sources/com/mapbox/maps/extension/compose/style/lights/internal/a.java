package com.mapbox.maps.extension.compose.style.lights.internal;

import com.mapbox.bindgen.Expected;
import com.mapbox.maps.MapboxLogger;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Expected.Action {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54452a;

    public /* synthetic */ a(int i14) {
        this.f54452a = i14;
    }

    @Override // com.mapbox.bindgen.Expected.Action
    public final void run(Object obj) {
        switch (this.f54452a) {
            case 0:
                MapboxLight$Default$BindToMap$1.invokeSuspend$lambda$0((String) obj);
                break;
            case 1:
                MapboxLogger.logD("MapboxLight", "setStyleLights: null");
                break;
            case 2:
                MapboxLight$DynamicLight$BindToMap$1.invokeSuspend$lambda$1((String) obj);
                break;
            default:
                MapboxLight$FlatLight$BindToMap$1.invokeSuspend$lambda$0((String) obj);
                break;
        }
    }
}
