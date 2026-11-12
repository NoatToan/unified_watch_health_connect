package com.xiaomi.fitness.sport_export;

import com.xiaomi.fitness.common.utils.AppUtil;
import dagger.hilt.android.EntryPointAccessors;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"sportAidongGameApi", "Lcom/xiaomi/fitness/sport_export/SportAidongGameApi;", "getSportAidongGameApi", "()Lcom/xiaomi/fitness/sport_export/SportAidongGameApi;", "sport-export_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SportAidongGameApiKt {

    @NotNull
    private static final SportAidongGameApi sportAidongGameApi = ((SportAidongGameEntryPoint) EntryPointAccessors.fromApplication(AppUtil.getApp(), SportAidongGameEntryPoint.class)).getSportAidongGameApi();

    @NotNull
    public static final SportAidongGameApi getSportAidongGameApi() {
        return sportAidongGameApi;
    }
}
