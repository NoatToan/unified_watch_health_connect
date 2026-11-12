package com.xiaomi.fitness.devicesettings.bluttooth.wearmode;

import com.xiaomi.fitness.devicesettings.bluttooth.wearmode.WearModeHelperImpl;
import com.xiaomi.fitness.devicesettings.di.FeatureItemModule;
import com.xiaomi.fitness.devicesettings.export.wearmode.WearModeHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\tH\u0016J \u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/wearmode/WearModeHelperImpl;", "Lcom/xiaomi/fitness/devicesettings/export/wearmode/WearModeHelper;", "<init>", "()V", "refreshWearMode", "", "did", "", "block", "Lkotlin/Function1;", "", "setWearMode", "mode", "fromLaunch", "", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WearModeHelperImpl implements WearModeHelper {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshWearMode$lambda$0(Function1 block, int i) {
        Intrinsics.checkNotNullParameter(block, "$block");
        FeatureItemModule.INSTANCE.setWearMode(Integer.valueOf(i));
        block.invoke2(Integer.valueOf(i));
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.devicesettings.export.wearmode.WearModeHelper
    public void refreshWearMode(@Nullable String did, @NotNull final Function1<? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        SwitchWearModeHelper.INSTANCE.getWearMode(did, new Function1() { // from class: o7r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WearModeHelperImpl.refreshWearMode$lambda$0(block, ((Integer) obj).intValue());
            }
        });
    }

    @Override // com.xiaomi.fitness.devicesettings.export.wearmode.WearModeHelper
    public void setWearMode(@NotNull String did, int mode, boolean fromLaunch) {
        Intrinsics.checkNotNullParameter(did, "did");
        SwitchWearModeHelper.INSTANCE.setWearMode(did, mode, fromLaunch);
    }
}
