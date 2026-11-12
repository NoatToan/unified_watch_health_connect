package com.mapbox.maps.extension.compose;

import com.mapbox.maps.interactions.FeatureState;
import com.mapbox.maps.interactions.FeatureStateCallback;
import o13.h;
import o53.j;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s;
import t13.d;
import t13.f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public /* synthetic */ class MapState$getFeatureState$2$1$cancelable$1 implements FeatureStateCallback, n {
    final /* synthetic */ j<FS> $tmp0;

    /* JADX WARN: Multi-variable type inference failed */
    public MapState$getFeatureState$2$1$cancelable$1(j<? super FS> jVar) {
        this.$tmp0 = jVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof FeatureStateCallback) && (obj instanceof n)) {
            return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p005kotlin.jvm.internal.n
    public final h<?> getFunctionDelegate() {
        return new q(1, this.$tmp0, f.class, "resume", "resume(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", 1);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    /* JADX WARN: Incorrect types in method signature: (TFS;)V */
    @Override // com.mapbox.maps.interactions.FeatureStateCallback
    public final void onFeatureState(FeatureState featureState) {
        featureState.getClass();
        d dVar = this.$tmp0;
        int i14 = o13.q.f128596b;
        dVar.resumeWith(featureState);
    }
}
