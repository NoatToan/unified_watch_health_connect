package com.xiaomi.hm.health.sleep.manger;

import android.content.Context;
import androidx.p008lifecycle.LiveData;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.sleep.sleephome.promotion.SleepPromotionVo;
import com.huami.tools.analytics.DbUtils;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/sleep/manger/SleepPromotionDataManager;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/sleep/manger/PromotionType;", "promotionType", "Landroidx/lifecycle/LiveData;", "", "Lcom/huami/sleep/sleephome/promotion/SleepPromotionVo;", "loadData", "", "MAX_COUNT", LogUtil.I, "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SleepPromotionDataManager {

    @NotNull
    public static final SleepPromotionDataManager INSTANCE = new SleepPromotionDataManager();
    private static final int MAX_COUNT = 3;

    /* JADX INFO: renamed from: com.xiaomi.hm.health.sleep.manger.SleepPromotionDataManager$loadData$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0014R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/xiaomi/hm/health/sleep/manger/SleepPromotionDataManager$loadData$1", "Landroidx/lifecycle/LiveData;", "", "Lcom/huami/sleep/sleephome/promotion/SleepPromotionVo;", "", "onActive", "Ljava/util/concurrent/atomic/AtomicBoolean;", "requested", "Ljava/util/concurrent/atomic/AtomicBoolean;", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class AnonymousClass1 extends LiveData<List<? extends SleepPromotionVo>> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ PromotionType $promotionType;

        @NotNull
        private final AtomicBoolean requested = new AtomicBoolean(false);

        public AnonymousClass1(Context context, PromotionType promotionType) {
            this.$context = context;
            this.$promotionType = promotionType;
        }

        @Override // androidx.p008lifecycle.LiveData
        public void onActive() {
            if (this.requested.get()) {
                return;
            }
            e.f(GlobalScope.INSTANCE, null, null, new SleepPromotionDataManager$loadData$1$onActive$1(this.$context, this.$promotionType, this, null), 3, null);
        }
    }

    private SleepPromotionDataManager() {
    }

    @NotNull
    public final LiveData<List<SleepPromotionVo>> loadData(@NotNull Context context, @NotNull PromotionType promotionType) {
        return new AnonymousClass1(context, promotionType);
    }
}
