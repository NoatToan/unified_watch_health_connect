package com.xiaomi.fitness.res.preload.export;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.res.preload.export.PreloadManagerExtKt;
import dagger.hilt.android.EntryPointAccessors;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"instance", "Lcom/xiaomi/fitness/res/preload/export/ResPreloadManager;", "Lcom/xiaomi/fitness/res/preload/export/ResPreloadManager$Companion;", "getInstance", "(Lcom/xiaomi/fitness/res/preload/export/ResPreloadManager$Companion;)Lcom/xiaomi/fitness/res/preload/export/ResPreloadManager;", "instance$delegate", "Lkotlin/Lazy;", "res-preload-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PreloadManagerExtKt {

    @NotNull
    private static final Lazy instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: k7i
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PreloadManagerExtKt.instance_delegate$lambda$0();
        }
    });

    @NotNull
    public static final ResPreloadManager getInstance(@NotNull ResPreloadManager.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (ResPreloadManager) instance$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ResPreloadManager instance_delegate$lambda$0() {
        return ((ResPreloadPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), ResPreloadPoint.class)).getResPreloadManager();
    }
}
