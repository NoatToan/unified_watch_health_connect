package com.xiaomi.fitness.wearos.export;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.wearos.export.WearOsExtKt;
import dagger.hilt.android.EntryPointAccessors;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001f\u0010\u0000\u001a\u00020\u0007*\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0003\u0010\t\"\u000e\u0010\u000b\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"instance", "Lcom/xiaomi/fitness/wearos/export/FastPairManager;", "Lcom/xiaomi/fitness/wearos/export/FastPairManager$Companion;", "getInstance", "(Lcom/xiaomi/fitness/wearos/export/FastPairManager$Companion;)Lcom/xiaomi/fitness/wearos/export/FastPairManager;", "instance$delegate", "Lkotlin/Lazy;", "Lcom/xiaomi/fitness/wearos/export/WearOSUtil;", "Lcom/xiaomi/fitness/wearos/export/WearOSUtil$Companion;", "(Lcom/xiaomi/fitness/wearos/export/WearOSUtil$Companion;)Lcom/xiaomi/fitness/wearos/export/WearOSUtil;", "instance$delegate$1", "EXTRA_MODEL_ID", "", "wearos-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class WearOsExtKt {

    @NotNull
    public static final String EXTRA_MODEL_ID = "com.google.android.gms.nearby.discovery.fastpair.MODEL_ID";

    @NotNull
    private static final Lazy instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: q7r
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WearOsExtKt.instance_delegate$lambda$0();
        }
    });

    @NotNull
    private static final Lazy instance$delegate$1 = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: r7r
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WearOsExtKt.instance_delegate$lambda$1();
        }
    });

    @NotNull
    public static final FastPairManager getInstance(@NotNull FastPairManager.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (FastPairManager) instance$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FastPairManager instance_delegate$lambda$0() {
        return ((WearOsUtilPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), WearOsUtilPoint.class)).getFastPairManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WearOSUtil instance_delegate$lambda$1() {
        return ((WearOsUtilPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), WearOsUtilPoint.class)).getWearOSUtil();
    }

    @NotNull
    public static final WearOSUtil getInstance(@NotNull WearOSUtil.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (WearOSUtil) instance$delegate$1.getValue();
    }
}
