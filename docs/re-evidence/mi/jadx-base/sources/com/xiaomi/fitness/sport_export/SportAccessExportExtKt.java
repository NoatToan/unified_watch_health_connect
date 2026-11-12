package com.xiaomi.fitness.sport_export;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.sport_export.SportAccessExportExtKt;
import dagger.hilt.android.EntryPointAccessors;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0007\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\"\u0014\u0010\u000b\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n\"\u0014\u0010\r\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0014\u0010\u000f\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\n¨\u0006\u0011"}, d2 = {"INSTANCE", "Lcom/xiaomi/fitness/sport_export/ISportAccessApi;", "Lcom/xiaomi/fitness/sport_export/ISportAccessApi$Companion;", "getINSTANCE", "(Lcom/xiaomi/fitness/sport_export/ISportAccessApi$Companion;)Lcom/xiaomi/fitness/sport_export/ISportAccessApi;", "INSTANCE$delegate", "Lkotlin/Lazy;", "SPORT_CHANGE_MESSAGE", "", "getSPORT_CHANGE_MESSAGE", "()Ljava/lang/String;", "WEAR_SPORT_START", "getWEAR_SPORT_START", "WEAR_SPORT_FINISHED", "getWEAR_SPORT_FINISHED", "SPORT_DATA_CHANGE_MESSAGE", "getSPORT_DATA_CHANGE_MESSAGE", "sport-export_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SportAccessExportExtKt {

    @NotNull
    private static final Lazy INSTANCE$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: k9n
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SportAccessExportExtKt.INSTANCE_delegate$lambda$0();
        }
    });

    @NotNull
    private static final String SPORT_CHANGE_MESSAGE = "WEAR_SPORT_STATUS_MESSAGE";

    @NotNull
    private static final String WEAR_SPORT_START = "WEAR_SPORT_START";

    @NotNull
    private static final String WEAR_SPORT_FINISHED = "WEAR_SPORT_FINISHED";

    @NotNull
    private static final String SPORT_DATA_CHANGE_MESSAGE = "WEAR_SPORT_DATA_STATUS_MESSAGE";

    /* JADX INFO: Access modifiers changed from: private */
    public static final ISportAccessApi INSTANCE_delegate$lambda$0() {
        return ((SportAccessPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), SportAccessPoint.class)).getSportAccessPoint();
    }

    @NotNull
    public static final ISportAccessApi getINSTANCE(@NotNull ISportAccessApi.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (ISportAccessApi) INSTANCE$delegate.getValue();
    }

    @NotNull
    public static final String getSPORT_CHANGE_MESSAGE() {
        return SPORT_CHANGE_MESSAGE;
    }

    @NotNull
    public static final String getSPORT_DATA_CHANGE_MESSAGE() {
        return SPORT_DATA_CHANGE_MESSAGE;
    }

    @NotNull
    public static final String getWEAR_SPORT_FINISHED() {
        return WEAR_SPORT_FINISHED;
    }

    @NotNull
    public static final String getWEAR_SPORT_START() {
        return WEAR_SPORT_START;
    }
}
