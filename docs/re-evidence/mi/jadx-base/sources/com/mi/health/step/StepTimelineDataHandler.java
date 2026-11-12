package com.mi.health.step;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStepReport;
import com.xiaomi.fit.fitness.export.data.aggregation.record.StepRecord;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fitness.common.lifecycle.IDataHandler;
import com.xiaomi.fitness.common.log.Logger;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000e\u000fB\u001f\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0016R\u0018\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/mi/health/step/StepTimelineDataHandler;", "Lcom/xiaomi/fitness/common/lifecycle/IDataHandler;", "Landroid/database/Cursor;", "projection", "", "", "context", "Landroid/content/Context;", "<init>", "([Ljava/lang/String;Landroid/content/Context;)V", "[Ljava/lang/String;", "onDataReady", "dataSet", "Lcom/xiaomi/fitness/common/lifecycle/IDataHandler$DataSet;", "Companion", "Columns", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStepTimelineDataHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StepTimelineDataHandler.kt\ncom/mi/health/step/StepTimelineDataHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,68:1\n1#2:69\n13402#3,2:70\n*S KotlinDebug\n*F\n+ 1 StepTimelineDataHandler.kt\ncom/mi/health/step/StepTimelineDataHandler\n*L\n53#1:70,2\n*E\n"})
public final class StepTimelineDataHandler implements IDataHandler<Cursor> {

    @NotNull
    private static final String[] DEFAULT_COLS = {"time", "steps", "distance", "calories"};
    private static final long ONE_DAY = 86400;

    @NotNull
    public static final String STEP_REPORT_MAP = "stepMap";

    @NotNull
    private static final String TAG = "StepTimelineHandler";

    @Nullable
    private final String[] projection;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/mi/health/step/StepTimelineDataHandler$Columns;", "", "<init>", "()V", "TIME", "", "STEPS", "DISTANCE", "CALORIES", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Columns {

        @NotNull
        public static final String CALORIES = "calories";

        @NotNull
        public static final String DISTANCE = "distance";

        @NotNull
        public static final Columns INSTANCE = new Columns();

        @NotNull
        public static final String STEPS = "steps";

        @NotNull
        public static final String TIME = "time";

        private Columns() {
        }
    }

    public StepTimelineDataHandler(@Nullable String[] strArr, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.projection = strArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Code duplicated, block: B:25:0x003f  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b3  */
    @Override // com.xiaomi.fitness.common.lifecycle.IDataHandler
    @NotNull
    public Cursor onDataReady(@NotNull IDataHandler.DataSet dataSet) {
        List<StepRecord> listEmptyList;
        Intrinsics.checkNotNullParameter(dataSet, "dataSet");
        Map map = (Map) dataSet.get(STEP_REPORT_MAP);
        Object obj = map != null ? map.get(HomeDataType.STEP) : null;
        DailyStepReport dailyStepReport = obj instanceof DailyStepReport ? (DailyStepReport) obj : null;
        if (dailyStepReport == null || (listEmptyList = dailyStepReport.getStepRecords()) == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        String[] strArr = this.projection;
        if (strArr == null) {
            strArr = DEFAULT_COLS;
        } else {
            if (!(!(strArr.length == 0))) {
                strArr = null;
            }
            if (strArr == null) {
                strArr = DEFAULT_COLS;
            }
        }
        MatrixCursor matrixCursor = new MatrixCursor(strArr, listEmptyList.size());
        for (StepRecord stepRecord : listEmptyList) {
            MatrixCursor.RowBuilder rowBuilderNewRow = matrixCursor.newRow();
            for (String str : strArr) {
                switch (str) {
                    case "calories":
                        rowBuilderNewRow.add(Integer.valueOf(stepRecord.getCalories()));
                        break;
                    case "time":
                        rowBuilderNewRow.add(Long.valueOf(stepRecord.getTime()));
                        break;
                    case "steps":
                        rowBuilderNewRow.add(Integer.valueOf(stepRecord.getSteps()));
                        break;
                    case "distance":
                        rowBuilderNewRow.add(Integer.valueOf(stepRecord.getDistance()));
                        break;
                    default:
                        rowBuilderNewRow.add(null);
                        break;
                }
            }
        }
        Logger.i(TAG, "build cursor rows=" + matrixCursor.getCount());
        return matrixCursor;
    }
}
