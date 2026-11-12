package com.huami.sky.lib.repo;

import com.huami.sky.lib.entity.SkyPromotionInfo;
import com.huami.sky.service.SkyUpdateShowInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u001b\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\n\u0010\t\u001a\u0004\u0018\u00010\u0004H&J\u0010\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\nH&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/huami/sky/lib/repo/SkyPromotionRepo;", "", "Lcom/huami/sky/lib/entity/SkyPromotionInfo;", "getFeatureUpdateTips", "Lcom/huami/sky/service/SkyUpdateShowInfo;", "showInfo", "", "saveSkyUpdateShowInfo", "(Lcom/huami/sky/service/SkyUpdateShowInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSkyUpdateShowInfo", "Lkotlinx/coroutines/flow/Flow;", "listenSkyUpdateShow", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public interface SkyPromotionRepo {
    @Nullable
    SkyPromotionInfo getFeatureUpdateTips();

    @Nullable
    SkyUpdateShowInfo getSkyUpdateShowInfo();

    @NotNull
    Flow<SkyUpdateShowInfo> listenSkyUpdateShow();

    @Nullable
    Object saveSkyUpdateShowInfo(@NotNull SkyUpdateShowInfo skyUpdateShowInfo, @NotNull Continuation<? super Unit> continuation);
}
