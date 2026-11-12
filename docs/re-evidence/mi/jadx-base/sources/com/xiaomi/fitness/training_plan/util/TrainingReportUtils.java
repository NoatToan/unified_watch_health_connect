package com.xiaomi.fitness.training_plan.util;

import com.google.gson.Gson;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.training_plan.net.TrainingPlanRequest;
import com.xiaomi.fitness.training_plan.util.TrainingReportUtils;
import com.xiaomi.fitness.training_plan_export.model.SportReportItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0012J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0017\u001a\u00020\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/training_plan/util/TrainingReportUtils;", "", "<init>", "()V", "TAG", "", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "gson$delegate", "Lkotlin/Lazy;", "trainingPlanRequest", "Lcom/xiaomi/fitness/training_plan/net/TrainingPlanRequest;", "getTrainingPlanRequest", "()Lcom/xiaomi/fitness/training_plan/net/TrainingPlanRequest;", "trainingPlanRequest$delegate", "convertItems2Reports", "", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "items", "Lcom/xiaomi/fitness/training_plan_export/model/SportReportItem;", "convertItem2Report", "item", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTrainingReportUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrainingReportUtils.kt\ncom/xiaomi/fitness/training_plan/util/TrainingReportUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,62:1\n1863#2:63\n1864#2:65\n1#3:64\n*S KotlinDebug\n*F\n+ 1 TrainingReportUtils.kt\ncom/xiaomi/fitness/training_plan/util/TrainingReportUtils\n*L\n24#1:63\n24#1:65\n*E\n"})
public final class TrainingReportUtils {

    @NotNull
    private static final String TAG = "TrainingReportUtils";

    @NotNull
    public static final TrainingReportUtils INSTANCE = new TrainingReportUtils();

    /* JADX INFO: renamed from: gson$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy gson = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: awp
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TrainingReportUtils.gson_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: trainingPlanRequest$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy trainingPlanRequest = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: bwp
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TrainingReportUtils.trainingPlanRequest_delegate$lambda$1();
        }
    });

    private TrainingReportUtils() {
    }

    private final Gson getGson() {
        return (Gson) gson.getValue();
    }

    private final TrainingPlanRequest getTrainingPlanRequest() {
        return (TrainingPlanRequest) trainingPlanRequest.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gson gson_delegate$lambda$0() {
        return new Gson();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TrainingPlanRequest trainingPlanRequest_delegate$lambda$1() {
        return new TrainingPlanRequest();
    }

    @Nullable
    public final SportBasicReport convertItem2Report(@NotNull SportReportItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        try {
            int currentTZOffsetInSec = FitnessDateUtils.getCurrentTZOffsetInSec();
            Object objFromJson = getGson().fromJson(item.getValue(), (Class<Object>) SportBasicReport.class);
            SportBasicReport sportBasicReport = (SportBasicReport) objFromJson;
            sportBasicReport.setSid(item.getSid());
            sportBasicReport.setDbKeyTime(Long.valueOf(item.getTime()));
            sportBasicReport.setEntityStartTime(Long.valueOf(sportBasicReport.getStartTime()));
            sportBasicReport.setEntityEndTime(Long.valueOf(sportBasicReport.getEndTime()));
            sportBasicReport.setEntityOffsetTime(Integer.valueOf(item.getZoneOffset()));
            long zoneOffset = item.getZoneOffset() - currentTZOffsetInSec;
            sportBasicReport.setStartTime(sportBasicReport.getStartTime() + zoneOffset);
            sportBasicReport.setEndTime(sportBasicReport.getEndTime() + zoneOffset);
            return (SportBasicReport) objFromJson;
        } catch (Exception e) {
            Logger.e(TAG, "convertItem2Report exception", e);
            return null;
        }
    }

    @NotNull
    public final List<SportBasicReport> convertItems2Reports(@Nullable List<SportReportItem> items) {
        ArrayList arrayList = new ArrayList();
        if (items != null) {
            Iterator<T> it = items.iterator();
            while (it.hasNext()) {
                SportBasicReport sportBasicReportConvertItem2Report = INSTANCE.convertItem2Report((SportReportItem) it.next());
                if (sportBasicReportConvertItem2Report != null) {
                    arrayList.add(sportBasicReportConvertItem2Report);
                }
            }
        }
        return arrayList;
    }
}
