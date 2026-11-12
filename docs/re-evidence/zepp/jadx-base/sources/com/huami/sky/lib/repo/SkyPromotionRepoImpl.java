package com.huami.sky.lib.repo;

import com.huami.sky.lib.api.SkyPromotionApi;
import com.huami.sky.lib.cache.SkyPlayCache;
import com.huami.sky.lib.entity.AssetInfo;
import com.huami.sky.lib.entity.SkyPromotionExtensions;
import com.huami.sky.lib.entity.SkyPromotionInfo;
import com.huami.sky.service.SkyUpdateShowInfo;
import com.huami.tools.log.HMLog;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.l;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001b\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\n\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\nH\u0016R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/huami/sky/lib/repo/SkyPromotionRepoImpl;", "Lcom/huami/sky/lib/repo/SkyPromotionRepo;", "Lcom/huami/sky/lib/entity/SkyPromotionInfo;", "getFeatureUpdateTips", "Lcom/huami/sky/service/SkyUpdateShowInfo;", "showInfo", "", "saveSkyUpdateShowInfo", "(Lcom/huami/sky/service/SkyUpdateShowInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSkyUpdateShowInfo", "Lkotlinx/coroutines/flow/Flow;", "listenSkyUpdateShow", "Lcom/huami/sky/lib/api/SkyPromotionApi;", "a", "Lcom/huami/sky/lib/api/SkyPromotionApi;", "promotionApi", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "b", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "skyUpdateShowFlow", "<init>", "(Lcom/huami/sky/lib/api/SkyPromotionApi;)V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final class SkyPromotionRepoImpl implements SkyPromotionRepo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SkyPromotionApi promotionApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableSharedFlow<SkyUpdateShowInfo> skyUpdateShowFlow = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "星空推广位信息获取失败";
        }
    }

    public SkyPromotionRepoImpl(@NotNull SkyPromotionApi skyPromotionApi) {
        this.promotionApi = skyPromotionApi;
    }

    @Override // com.huami.sky.lib.repo.SkyPromotionRepo
    @Nullable
    public SkyPromotionInfo getFeatureUpdateTips() {
        AssetInfo assets;
        String createAt;
        Long longOrNull;
        try {
            List<SkyPromotionInfo> featureUpdateTips = this.promotionApi.getFeatureUpdateTips();
            if (featureUpdateTips == null) {
                return null;
            }
            SkyUpdateShowInfo skyUpdateShowInfo = getSkyUpdateShowInfo();
            long jLongValue = -1;
            long createTime = skyUpdateShowInfo == null ? -1L : skyUpdateShowInfo.getCreateTime();
            SkyPromotionExtensions extensions = featureUpdateTips.get(0).getExtensions();
            if (extensions != null && (assets = extensions.getAssets()) != null && (createAt = assets.getCreateAt()) != null && (longOrNull = l.toLongOrNull(createAt)) != null) {
                jLongValue = longOrNull.longValue();
            }
            if (jLongValue > createTime) {
                return featureUpdateTips.get(0);
            }
            return null;
        } catch (Exception unused) {
            HMLog.info("SkyPromotionRepoImpl", a.a);
            return null;
        }
    }

    @Override // com.huami.sky.lib.repo.SkyPromotionRepo
    @Nullable
    public SkyUpdateShowInfo getSkyUpdateShowInfo() {
        return SkyPlayCache.INSTANCE.getInstance().getSkyUpdateShowInfo();
    }

    @Override // com.huami.sky.lib.repo.SkyPromotionRepo
    @NotNull
    public Flow<SkyUpdateShowInfo> listenSkyUpdateShow() {
        return this.skyUpdateShowFlow;
    }

    @Override // com.huami.sky.lib.repo.SkyPromotionRepo
    @Nullable
    public Object saveSkyUpdateShowInfo(@NotNull SkyUpdateShowInfo skyUpdateShowInfo, @NotNull Continuation<? super Unit> continuation) {
        SkyPlayCache.INSTANCE.getInstance().saveSkyUpdateShowInfo(skyUpdateShowInfo);
        Object objEmit = this.skyUpdateShowFlow.emit(skyUpdateShowInfo, continuation);
        return objEmit == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
    }
}
