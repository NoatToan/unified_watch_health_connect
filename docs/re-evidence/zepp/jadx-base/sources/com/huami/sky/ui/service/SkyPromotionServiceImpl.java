package com.huami.sky.ui.service;

import com.huami.sky.lib.repo.SkyPromotionRepo;
import com.huami.sky.service.SkyPromotionService;
import com.huami.sky.service.SkyUpdateShowInfo;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/sky/ui/service/SkyPromotionServiceImpl;", "Lcom/huami/sky/service/SkyPromotionService;", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/sky/service/SkyUpdateShowInfo;", "listenSkyUpdateShow", "getSkyUpdateShow", "Lcom/huami/sky/lib/repo/SkyPromotionRepo;", "a", "Lcom/huami/sky/lib/repo/SkyPromotionRepo;", "promotionRepo", "<init>", "(Lcom/huami/sky/lib/repo/SkyPromotionRepo;)V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SkyPromotionServiceImpl implements SkyPromotionService {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SkyPromotionRepo promotionRepo;

    public SkyPromotionServiceImpl(@NotNull SkyPromotionRepo skyPromotionRepo) {
        this.promotionRepo = skyPromotionRepo;
    }

    @Override // com.huami.sky.service.SkyPromotionService
    @Nullable
    public SkyUpdateShowInfo getSkyUpdateShow() {
        return this.promotionRepo.getSkyUpdateShowInfo();
    }

    @Override // com.huami.sky.service.SkyPromotionService
    @NotNull
    public Flow<SkyUpdateShowInfo> listenSkyUpdateShow() {
        return this.promotionRepo.listenSkyUpdateShow();
    }
}
