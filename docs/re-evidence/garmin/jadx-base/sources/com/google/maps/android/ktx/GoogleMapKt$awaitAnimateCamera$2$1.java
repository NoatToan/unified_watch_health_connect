package com.google.maps.android.ktx;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.maps.GoogleMap;
import o13.q;
import o53.j;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/google/maps/android/ktx/GoogleMapKt$awaitAnimateCamera$2$1", "Lcom/google/android/gms/maps/GoogleMap$CancelableCallback;", "onFinish", "", "onCancel", "maps-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = SyslogConstants.LOG_LOCAL6)
public final class GoogleMapKt$awaitAnimateCamera$2$1 implements GoogleMap.CancelableCallback {
    final /* synthetic */ j<Unit> $continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public GoogleMapKt$awaitAnimateCamera$2$1(j<? super Unit> jVar) {
        this.$continuation = jVar;
    }

    @Override // com.google.android.gms.maps.GoogleMap.CancelableCallback
    public void onCancel() {
        this.$continuation.u(null);
    }

    @Override // com.google.android.gms.maps.GoogleMap.CancelableCallback
    public void onFinish() {
        j<Unit> jVar = this.$continuation;
        int i14 = q.f128596b;
        jVar.resumeWith(Unit.INSTANCE);
    }
}
