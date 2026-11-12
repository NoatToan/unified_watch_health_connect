package com.xiaomi.fitness.sport.view.launch.gym.setting;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.sport.view.launch.gym.setting.LocalSportSettingRequestKt;
import dagger.hilt.android.EntryPointAccessors;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"instance", "Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingRequest;", "Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingRequest$Companion;", "getInstance", "(Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingRequest$Companion;)Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingRequest;", "instance$delegate", "Lkotlin/Lazy;", "sport_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class LocalSportSettingRequestKt {

    @NotNull
    private static final Lazy instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: jme
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LocalSportSettingRequestKt.instance_delegate$lambda$0();
        }
    });

    @NotNull
    public static final LocalSportSettingRequest getInstance(@NotNull LocalSportSettingRequest.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (LocalSportSettingRequest) instance$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LocalSportSettingRequest instance_delegate$lambda$0() {
        return ((LocalSportSettingRequestPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), LocalSportSettingRequestPoint.class)).getRequest();
    }
}
