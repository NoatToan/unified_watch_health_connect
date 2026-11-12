package com.mapbox.maps.extension.compose.style.sources;

import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Expected.Transformer, Expected.Action {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SourceState f54474b;

    public /* synthetic */ a(SourceState sourceState, int i14) {
        this.f54473a = i14;
        this.f54474b = sourceState;
    }

    @Override // com.mapbox.bindgen.Expected.Transformer
    public Object invoke(Object obj) {
        switch (this.f54473a) {
            case 0:
                return SourceState.AnonymousClass2.emit$lambda$0(this.f54474b, (String) obj);
            default:
                return SourceState.addSource$lambda$4(this.f54474b, (None) obj);
        }
    }

    @Override // com.mapbox.bindgen.Expected.Action
    public void run(Object obj) {
        SourceState.removeSource$lambda$5(this.f54474b, (String) obj);
    }
}
