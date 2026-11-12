package me2;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.maps.android.compose.CameraPositionState;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
public final class x implements e23.a<CameraPositionState> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l<CameraPositionState, Unit> f118239a;

    /* JADX WARN: Multi-variable type inference failed */
    public x(e23.l<? super CameraPositionState, Unit> lVar) {
        this.f118239a = lVar;
    }

    @Override // e23.a
    public final CameraPositionState invoke() {
        CameraPositionState cameraPositionStateInvoke$default = CameraPositionState.Companion.invoke$default(CameraPositionState.INSTANCE, null, 1, null);
        this.f118239a.invoke(cameraPositionStateInvoke$default);
        return cameraPositionStateInvoke$default;
    }
}
