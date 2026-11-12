package com.mapbox.maps.extension.compose.style.sources;

import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Expected.Transformer, Expected.Action {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54475a;

    public /* synthetic */ b(int i14) {
        this.f54475a = i14;
    }

    @Override // com.mapbox.bindgen.Expected.Transformer
    public Object invoke(Object obj) {
        switch (this.f54475a) {
            case 0:
                return SourceState.AnonymousClass2.emit$lambda$1((Value) obj);
            default:
                return SourceState.addSource$lambda$3((String) obj);
        }
    }

    @Override // com.mapbox.bindgen.Expected.Action
    public void run(Object obj) {
        SourceState.C42021.invokeSuspend$lambda$1$lambda$0((String) obj);
    }
}
