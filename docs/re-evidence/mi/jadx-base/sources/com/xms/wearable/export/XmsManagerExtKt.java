package com.xms.wearable.export;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xms.wearable.export.XmsManagerExtKt;
import dagger.hilt.android.EntryPointAccessors;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"instance", "Lcom/xms/wearable/export/XmsManager;", "Lcom/xms/wearable/export/XmsManager$Companion;", "getInstance", "(Lcom/xms/wearable/export/XmsManager$Companion;)Lcom/xms/wearable/export/XmsManager;", "instance$delegate", "Lkotlin/Lazy;", "xmswearable-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class XmsManagerExtKt {

    @NotNull
    private static final Lazy instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ltr
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return XmsManagerExtKt.instance_delegate$lambda$0();
        }
    });

    @NotNull
    public static final XmsManager getInstance(@NotNull XmsManager.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (XmsManager) instance$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final XmsManager instance_delegate$lambda$0() {
        return ((XmsManagerPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), XmsManagerPoint.class)).getXmsManager();
    }
}
