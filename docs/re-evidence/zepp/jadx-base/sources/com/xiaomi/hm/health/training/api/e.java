package com.xiaomi.hm.health.training.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.xiaomi.hm.health.training.api.bean.SkusItem;
import com.xiaomi.hm.health.training.api.bean.TrainingItem;
import com.xiaomi.hm.health.training.api.function.Supplier;
import com.xiaomi.hm.health.training.api.helper.DataConverter;
import com.xiaomi.hm.health.training.api.util.Loggers;
import java.util.Locale;

/* JADX INFO: loaded from: classes21.dex */
class e extends g {
    private static final String c = "Train-CachedWebApi";
    private b b;

    public e(IWebApi iWebApi, b bVar) {
        super(iWebApi);
        this.b = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object c(boolean z, String str, String str2) {
        Locale locale = Locale.CHINA;
        Object[] objArr = new Object[3];
        objArr[0] = z ? "成功" : "失败";
        objArr[1] = str;
        objArr[2] = str2;
        return String.format(locale, "将数据库中已参加的训练标记为未参加%s，trainingId: %s , skuId: %s", objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object d(boolean z, String str, String str2) {
        Locale locale = Locale.CHINA;
        Object[] objArr = new Object[3];
        objArr[0] = z ? "成功" : "失败";
        objArr[1] = str;
        objArr[2] = str2;
        return String.format(locale, "已参加的训练保存到数据库%s，trainingId: %s , skuId: %s", objArr);
    }

    @Override // com.xiaomi.hm.health.training.api.g, com.xiaomi.hm.health.training.api.IWebApi
    public boolean exitTraining(@NonNull String str, @NonNull final String str2, @Nullable final String str3) {
        boolean zExitTraining = super.exitTraining(str, str2, str3);
        if (zExitTraining) {
            TrainingItem trainingItemB = this.b.b(str2);
            if (trainingItemB != null) {
                trainingItemB.isParticipate = false;
            }
            NewDbApi.INSTANCE.exitJoinedTraining(Long.valueOf(str2).longValue());
            final boolean zA = j.a(str2);
            Loggers.getLogger().v(c, new Supplier() { // from class: com.xiaomi.hm.health.training.api.d
                @Override // com.xiaomi.hm.health.training.api.function.Supplier
                public final Object get() {
                    return e.c(zA, str2, str3);
                }
            });
        }
        return zExitTraining;
    }

    @Override // com.xiaomi.hm.health.training.api.g, com.xiaomi.hm.health.training.api.IWebApi
    public boolean joinTraining(@NonNull String str, @NonNull final String str2, @Nullable final String str3) {
        TrainingItem trainingItemB;
        boolean zJoinTraining = super.joinTraining(str, str2, str3);
        if (zJoinTraining && (trainingItemB = this.b.b(str2)) != null) {
            trainingItemB.isParticipate = true;
            SkusItem skuItem = DataConverter.getSkuItem(trainingItemB);
            if (skuItem != null && skuItem.skuId.equals(str3) && DataConverter.isFreeFeaturedCourse(trainingItemB)) {
                skuItem.isPurchased = Boolean.TRUE;
            }
            NewDbApi.INSTANCE.insertOrUpdateJoinedTraining(trainingItemB);
            final boolean zC = j.c(trainingItemB);
            Loggers.getLogger().v(c, new Supplier() { // from class: com.xiaomi.hm.health.training.api.c
                @Override // com.xiaomi.hm.health.training.api.function.Supplier
                public final Object get() {
                    return e.d(zC, str2, str3);
                }
            });
        }
        return zJoinTraining;
    }

    @Override // com.xiaomi.hm.health.training.api.g, com.xiaomi.hm.health.training.api.IWebApi
    @NonNull
    public TrainingItem loadTrainingDetail(@NonNull String str, @Nullable Boolean bool) {
        TrainingItem trainingItemLoadTrainingDetail = super.loadTrainingDetail(str, bool);
        this.b.e(trainingItemLoadTrainingDetail);
        return trainingItemLoadTrainingDetail;
    }
}
