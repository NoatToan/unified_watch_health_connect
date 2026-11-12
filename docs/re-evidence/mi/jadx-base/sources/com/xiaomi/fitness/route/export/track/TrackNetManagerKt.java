package com.xiaomi.fitness.route.export.track;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.route.export.track.TrackNetManagerKt;
import dagger.hilt.android.EntryPointAccessors;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"instance", "Lcom/xiaomi/fitness/route/export/track/TrackNet;", "Lcom/xiaomi/fitness/route/export/track/TrackNet$Companion;", "getInstance", "(Lcom/xiaomi/fitness/route/export/track/TrackNet$Companion;)Lcom/xiaomi/fitness/route/export/track/TrackNet;", "instance$delegate", "Lkotlin/Lazy;", "sourceLocal", "", "sourceSportReport", "sourceCommunity", "route-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TrackNetManagerKt {

    @NotNull
    private static final Lazy instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: rnp
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TrackNetManagerKt.instance_delegate$lambda$0();
        }
    });
    public static final int sourceCommunity = 3;
    public static final int sourceLocal = 1;
    public static final int sourceSportReport = 2;

    @NotNull
    public static final TrackNet getInstance(@NotNull TrackNet.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (TrackNet) instance$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TrackNet instance_delegate$lambda$0() {
        return ((TrackNetPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), TrackNetPoint.class)).getTrackNet();
    }
}
