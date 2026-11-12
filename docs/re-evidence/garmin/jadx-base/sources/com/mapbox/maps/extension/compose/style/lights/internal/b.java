package com.mapbox.maps.extension.compose.style.lights.internal;

import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Expected.Action {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f54454b;

    public /* synthetic */ b(List list, int i14) {
        this.f54453a = i14;
        this.f54454b = list;
    }

    @Override // com.mapbox.bindgen.Expected.Action
    public final void run(Object obj) {
        switch (this.f54453a) {
            case 0:
                MapboxLight$DynamicLight$BindToMap$1.invokeSuspend$lambda$2((ArrayList) this.f54454b, (None) obj);
                break;
            default:
                MapboxLight$FlatLight$BindToMap$1.invokeSuspend$lambda$1(this.f54454b, (None) obj);
                break;
        }
    }
}
