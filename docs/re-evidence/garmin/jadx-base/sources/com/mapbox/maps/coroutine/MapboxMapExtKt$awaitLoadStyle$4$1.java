package com.mapbox.maps.coroutine;

import com.mapbox.maps.Style;
import o13.h;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s;
import t13.d;
import t13.f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public /* synthetic */ class MapboxMapExtKt$awaitLoadStyle$4$1 implements Style.OnStyleLoaded, n {
    final /* synthetic */ d<Style> $tmp0;

    /* JADX WARN: Multi-variable type inference failed */
    public MapboxMapExtKt$awaitLoadStyle$4$1(d<? super Style> dVar) {
        this.$tmp0 = dVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Style.OnStyleLoaded) && (obj instanceof n)) {
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

    @Override // com.mapbox.maps.Style.OnStyleLoaded
    public final void onStyleLoaded(Style style) {
        style.getClass();
        d<Style> dVar = this.$tmp0;
        int i14 = o13.q.f128596b;
        dVar.resumeWith(style);
    }
}
