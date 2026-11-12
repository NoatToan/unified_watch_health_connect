package com.xiaomi.fitness.active.pk.export;

import com.xiaomi.fitness.active.pk.export.ActivePkPageExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import dagger.hilt.android.EntryPointAccessors;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"INSTANCE", "Lcom/xiaomi/fitness/active/pk/export/IPkExport;", "Lcom/xiaomi/fitness/active/pk/export/IPkExport$Companion;", "getINSTANCE", "(Lcom/xiaomi/fitness/active/pk/export/IPkExport$Companion;)Lcom/xiaomi/fitness/active/pk/export/IPkExport;", "INSTANCE$delegate", "Lkotlin/Lazy;", "active-pk-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ActivePkPageExtKt {

    @NotNull
    private static final Lazy INSTANCE$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: gf0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ActivePkPageExtKt.INSTANCE_delegate$lambda$0();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final IPkExport INSTANCE_delegate$lambda$0() {
        return ((PkPagePoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), PkPagePoint.class)).getPkPage();
    }

    @NotNull
    public static final IPkExport getINSTANCE(@NotNull IPkExport.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (IPkExport) INSTANCE$delegate.getValue();
    }
}
