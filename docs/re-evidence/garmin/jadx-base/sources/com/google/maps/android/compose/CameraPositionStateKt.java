package com.google.maps.android.compose;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.net.SyslogConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.m2;
import p3.x1;
import p3.y3;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a5\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0014\b\u0006\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\" \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0011\u0010\u000f\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010"}, d2 = {"", Action.KEY_ATTRIBUTE, "Lkotlin/Function1;", "Lcom/google/maps/android/compose/CameraPositionState;", "", "init", "rememberCameraPositionState", "(Ljava/lang/String;Le23/l;Lp3/m;II)Lcom/google/maps/android/compose/CameraPositionState;", "Lp3/m2;", "LocalCameraPositionState", "Lp3/m2;", "getLocalCameraPositionState", "()Lp3/m2;", "getCurrentCameraPositionState", "(Lp3/m;I)Lcom/google/maps/android/compose/CameraPositionState;", "currentCameraPositionState", "maps-compose_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class CameraPositionStateKt {
    private static final m2<CameraPositionState> LocalCameraPositionState = new y3(new b(0));

    /* JADX INFO: renamed from: com.google.maps.android.compose.CameraPositionStateKt$rememberCameraPositionState$2, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass2 implements e23.a<CameraPositionState> {
        final /* synthetic */ e23.l<CameraPositionState, Unit> $init;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(e23.l<? super CameraPositionState, Unit> lVar) {
            this.$init = lVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // e23.a
        public final CameraPositionState invoke() {
            CameraPositionState cameraPositionStateInvoke$default = CameraPositionState.Companion.invoke$default(CameraPositionState.INSTANCE, null, 1, null);
            this.$init.invoke(cameraPositionStateInvoke$default);
            return cameraPositionStateInvoke$default;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CameraPositionState LocalCameraPositionState$lambda$0() {
        return CameraPositionState.Companion.invoke$default(CameraPositionState.INSTANCE, null, 1, null);
    }

    @GoogleMapComposable
    public static final CameraPositionState getCurrentCameraPositionState(p3.m mVar, int i14) {
        x1 x1Var = p3.n.f135158a;
        return (CameraPositionState) mVar.A(LocalCameraPositionState);
    }

    public static final m2<CameraPositionState> getLocalCameraPositionState() {
        return LocalCameraPositionState;
    }

    public static final CameraPositionState rememberCameraPositionState(String str, e23.l<? super CameraPositionState, Unit> lVar, p3.m mVar, int i14, int i15) {
        mVar.C(-1911106014);
        if ((i15 & 1) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i15 & 2) != 0) {
            lVar = AnonymousClass1.INSTANCE;
        }
        CameraPositionState cameraPositionState = (CameraPositionState) d4.a.d(new Object[0], CameraPositionState.INSTANCE.getSaver(), str2, new AnonymousClass2(lVar), mVar, (i14 << 6) & 896, 0);
        mVar.f();
        return cameraPositionState;
    }

    /* JADX INFO: renamed from: com.google.maps.android.compose.CameraPositionStateKt$rememberCameraPositionState$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass1 implements e23.l<CameraPositionState, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(CameraPositionState cameraPositionState) {
            invoke2(cameraPositionState);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CameraPositionState cameraPositionState) {
            cameraPositionState.getClass();
        }
    }
}
