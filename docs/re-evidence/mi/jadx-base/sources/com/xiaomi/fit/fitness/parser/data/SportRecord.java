package com.xiaomi.fit.fitness.parser.data;

import com.xiaomi.fit.data.common.data.sport.ITSportTrainingState;
import com.xiaomi.fit.fitness.parser.schema.FitnessRecordKey;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u0007\n\u0002\bE\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010t\u001a\u00020uH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u001e\u0010 \u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b!\u0010\u0019\"\u0004\b\"\u0010\u001bR\u001e\u0010#\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b$\u0010\u0019\"\u0004\b%\u0010\u001bR\u001c\u0010&\u001a\u0004\u0018\u00010\u0000X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001e\u0010+\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b,\u0010\u0019\"\u0004\b-\u0010\u001bR\u001e\u0010.\u001a\u0004\u0018\u00010/X\u0086\u000e¢\u0006\u0010\n\u0002\u00104\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001e\u00105\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b6\u0010\u0019\"\u0004\b7\u0010\u001bR\u001e\u00108\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b9\u0010\u0019\"\u0004\b:\u0010\u001bR\u001e\u0010;\u001a\u0004\u0018\u00010/X\u0086\u000e¢\u0006\u0010\n\u0002\u00104\u001a\u0004\b<\u00101\"\u0004\b=\u00103R\u001e\u0010>\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b?\u0010\u0019\"\u0004\b@\u0010\u001bR\u001e\u0010A\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\bB\u0010\u0019\"\u0004\bC\u0010\u001bR\u001e\u0010D\u001a\u0004\u0018\u00010/X\u0086\u000e¢\u0006\u0010\n\u0002\u00104\u001a\u0004\bE\u00101\"\u0004\bF\u00103R\u001e\u0010G\u001a\u0004\u0018\u00010/X\u0086\u000e¢\u0006\u0010\n\u0002\u00104\u001a\u0004\bH\u00101\"\u0004\bI\u00103R\u001e\u0010J\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\bK\u0010\u0019\"\u0004\bL\u0010\u001bR\u001e\u0010M\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\bN\u0010\u0019\"\u0004\bO\u0010\u001bR\u001e\u0010P\u001a\u0004\u0018\u00010/X\u0086\u000e¢\u0006\u0010\n\u0002\u00104\u001a\u0004\bQ\u00101\"\u0004\bR\u00103R\u001e\u0010S\u001a\u0004\u0018\u00010/X\u0086\u000e¢\u0006\u0010\n\u0002\u00104\u001a\u0004\bT\u00101\"\u0004\bU\u00103R\u001e\u0010V\u001a\u0004\u0018\u00010/X\u0086\u000e¢\u0006\u0010\n\u0002\u00104\u001a\u0004\bW\u00101\"\u0004\bX\u00103R\u001e\u0010Y\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\bZ\u0010\u0019\"\u0004\b[\u0010\u001bR\u001e\u0010\\\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b]\u0010\u0019\"\u0004\b^\u0010\u001bR\u001e\u0010_\u001a\u0004\u0018\u00010/X\u0086\u000e¢\u0006\u0010\n\u0002\u00104\u001a\u0004\b`\u00101\"\u0004\ba\u00103R\u001e\u0010b\u001a\u0004\u0018\u00010/X\u0086\u000e¢\u0006\u0010\n\u0002\u00104\u001a\u0004\bc\u00101\"\u0004\bd\u00103R\u001e\u0010e\u001a\u0004\u0018\u00010/X\u0086\u000e¢\u0006\u0010\n\u0002\u00104\u001a\u0004\bf\u00101\"\u0004\bg\u00103R\u001e\u0010h\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\bi\u0010\u0019\"\u0004\bj\u0010\u001bR\u001e\u0010k\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\bl\u0010\u0019\"\u0004\bm\u0010\u001bR\u001e\u0010n\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\bo\u0010\u0019\"\u0004\bp\u0010\u001bR\u001e\u0010q\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\br\u0010\u0019\"\u0004\bs\u0010\u001b¨\u0006v"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/data/SportRecord;", "", "startTime", "", "recordCount", "<init>", "(JJ)V", "getStartTime", "()J", "getRecordCount", "recordList", "", "Lcom/xiaomi/fit/fitness/parser/data/OneSportRecord;", "getRecordList", "()Ljava/util/List;", "setRecordList", "(Ljava/util/List;)V", "isSportPause", "", "()Z", "setSportPause", "(Z)V", "pauseType", "", "getPauseType", "()Ljava/lang/Integer;", "setPauseType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "iTState", "getITState", "setITState", "iTTotalCount", "getITTotalCount", "setITTotalCount", "iTTotalDistance", "getITTotalDistance", "setITTotalDistance", "restSportRecord", "getRestSportRecord", "()Lcom/xiaomi/fit/fitness/parser/data/SportRecord;", "setRestSportRecord", "(Lcom/xiaomi/fit/fitness/parser/data/SportRecord;)V", FitnessRecordKey.skiPath, "getSkiPath", "setSkiPath", "height", "", "getHeight", "()Ljava/lang/Float;", "setHeight", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "itTotalSteps", "getItTotalSteps", "setItTotalSteps", "itAvgPaces", "getItAvgPaces", "setItAvgPaces", "itAvgSpeed", "getItAvgSpeed", "setItAvgSpeed", "itSkiTotalTime", "getItSkiTotalTime", "setItSkiTotalTime", "itSkiTotalDistance", "getItSkiTotalDistance", "setItSkiTotalDistance", "itSkiAvgSpeed", "getItSkiAvgSpeed", "setItSkiAvgSpeed", "itSkiMaxSpeed", "getItSkiMaxSpeed", "setItSkiMaxSpeed", "itSkiSlope", "getItSkiSlope", "setItSkiSlope", "divingType", "getDivingType", "setDivingType", "divingAvgTemperature", "getDivingAvgTemperature", "setDivingAvgTemperature", "divingMaxDepth", "getDivingMaxDepth", "setDivingMaxDepth", "divingAvgDepth", "getDivingAvgDepth", "setDivingAvgDepth", "divingInSectionDuration", "getDivingInSectionDuration", "setDivingInSectionDuration", "divingOutSectionDuration", "getDivingOutSectionDuration", "setDivingOutSectionDuration", "divingMinTemperature", "getDivingMinTemperature", "setDivingMinTemperature", "divingAvgDownSpeed", "getDivingAvgDownSpeed", "setDivingAvgDownSpeed", "divingAvgUpSpeed", "getDivingAvgUpSpeed", "setDivingAvgUpSpeed", "itTotalDuration", "getItTotalDuration", "setItTotalDuration", "itActionCount", "getItActionCount", "setItActionCount", "itTotalWeight", "getItTotalWeight", "setItTotalWeight", "itActionType", "getItActionType", "setItActionType", "toString", "", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSportDataResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportDataResult.kt\ncom/xiaomi/fit/fitness/parser/data/SportRecord\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,170:1\n1#2:171\n*E\n"})
public final class SportRecord {

    @Nullable
    private Float divingAvgDepth;

    @Nullable
    private Float divingAvgDownSpeed;

    @Nullable
    private Float divingAvgTemperature;

    @Nullable
    private Float divingAvgUpSpeed;

    @Nullable
    private Integer divingInSectionDuration;

    @Nullable
    private Float divingMaxDepth;

    @Nullable
    private Float divingMinTemperature;

    @Nullable
    private Integer divingOutSectionDuration;

    @Nullable
    private Integer divingType;

    @Nullable
    private Float height;

    @ITSportTrainingState
    @Nullable
    private Integer iTState;

    @Nullable
    private Integer iTTotalCount;

    @Nullable
    private Integer iTTotalDistance;
    private boolean isSportPause = true;

    @Nullable
    private Integer itActionCount;

    @Nullable
    private Integer itActionType;

    @Nullable
    private Integer itAvgPaces;

    @Nullable
    private Float itAvgSpeed;

    @Nullable
    private Float itSkiAvgSpeed;

    @Nullable
    private Float itSkiMaxSpeed;

    @Nullable
    private Integer itSkiSlope;

    @Nullable
    private Integer itSkiTotalDistance;

    @Nullable
    private Integer itSkiTotalTime;

    @Nullable
    private Integer itTotalDuration;

    @Nullable
    private Integer itTotalSteps;

    @Nullable
    private Integer itTotalWeight;

    @Nullable
    private Integer pauseType;
    private final long recordCount;
    public List<OneSportRecord> recordList;

    @Nullable
    private SportRecord restSportRecord;

    @Nullable
    private Integer skiPath;
    private final long startTime;

    public SportRecord(long j, long j2) {
        this.startTime = j;
        this.recordCount = j2;
    }

    @Nullable
    public final Float getDivingAvgDepth() {
        return this.divingAvgDepth;
    }

    @Nullable
    public final Float getDivingAvgDownSpeed() {
        return this.divingAvgDownSpeed;
    }

    @Nullable
    public final Float getDivingAvgTemperature() {
        return this.divingAvgTemperature;
    }

    @Nullable
    public final Float getDivingAvgUpSpeed() {
        return this.divingAvgUpSpeed;
    }

    @Nullable
    public final Integer getDivingInSectionDuration() {
        return this.divingInSectionDuration;
    }

    @Nullable
    public final Float getDivingMaxDepth() {
        return this.divingMaxDepth;
    }

    @Nullable
    public final Float getDivingMinTemperature() {
        return this.divingMinTemperature;
    }

    @Nullable
    public final Integer getDivingOutSectionDuration() {
        return this.divingOutSectionDuration;
    }

    @Nullable
    public final Integer getDivingType() {
        return this.divingType;
    }

    @Nullable
    public final Float getHeight() {
        return this.height;
    }

    @Nullable
    public final Integer getITState() {
        return this.iTState;
    }

    @Nullable
    public final Integer getITTotalCount() {
        return this.iTTotalCount;
    }

    @Nullable
    public final Integer getITTotalDistance() {
        return this.iTTotalDistance;
    }

    @Nullable
    public final Integer getItActionCount() {
        return this.itActionCount;
    }

    @Nullable
    public final Integer getItActionType() {
        return this.itActionType;
    }

    @Nullable
    public final Integer getItAvgPaces() {
        return this.itAvgPaces;
    }

    @Nullable
    public final Float getItAvgSpeed() {
        return this.itAvgSpeed;
    }

    @Nullable
    public final Float getItSkiAvgSpeed() {
        return this.itSkiAvgSpeed;
    }

    @Nullable
    public final Float getItSkiMaxSpeed() {
        return this.itSkiMaxSpeed;
    }

    @Nullable
    public final Integer getItSkiSlope() {
        return this.itSkiSlope;
    }

    @Nullable
    public final Integer getItSkiTotalDistance() {
        return this.itSkiTotalDistance;
    }

    @Nullable
    public final Integer getItSkiTotalTime() {
        return this.itSkiTotalTime;
    }

    @Nullable
    public final Integer getItTotalDuration() {
        return this.itTotalDuration;
    }

    @Nullable
    public final Integer getItTotalSteps() {
        return this.itTotalSteps;
    }

    @Nullable
    public final Integer getItTotalWeight() {
        return this.itTotalWeight;
    }

    @Nullable
    public final Integer getPauseType() {
        return this.pauseType;
    }

    public final long getRecordCount() {
        return this.recordCount;
    }

    @NotNull
    public final List<OneSportRecord> getRecordList() {
        List<OneSportRecord> list = this.recordList;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("recordList");
        return null;
    }

    @Nullable
    public final SportRecord getRestSportRecord() {
        return this.restSportRecord;
    }

    @Nullable
    public final Integer getSkiPath() {
        return this.skiPath;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: isSportPause, reason: from getter */
    public final boolean getIsSportPause() {
        return this.isSportPause;
    }

    public final void setDivingAvgDepth(@Nullable Float f) {
        this.divingAvgDepth = f;
    }

    public final void setDivingAvgDownSpeed(@Nullable Float f) {
        this.divingAvgDownSpeed = f;
    }

    public final void setDivingAvgTemperature(@Nullable Float f) {
        this.divingAvgTemperature = f;
    }

    public final void setDivingAvgUpSpeed(@Nullable Float f) {
        this.divingAvgUpSpeed = f;
    }

    public final void setDivingInSectionDuration(@Nullable Integer num) {
        this.divingInSectionDuration = num;
    }

    public final void setDivingMaxDepth(@Nullable Float f) {
        this.divingMaxDepth = f;
    }

    public final void setDivingMinTemperature(@Nullable Float f) {
        this.divingMinTemperature = f;
    }

    public final void setDivingOutSectionDuration(@Nullable Integer num) {
        this.divingOutSectionDuration = num;
    }

    public final void setDivingType(@Nullable Integer num) {
        this.divingType = num;
    }

    public final void setHeight(@Nullable Float f) {
        this.height = f;
    }

    public final void setITState(@Nullable Integer num) {
        this.iTState = num;
    }

    public final void setITTotalCount(@Nullable Integer num) {
        this.iTTotalCount = num;
    }

    public final void setITTotalDistance(@Nullable Integer num) {
        this.iTTotalDistance = num;
    }

    public final void setItActionCount(@Nullable Integer num) {
        this.itActionCount = num;
    }

    public final void setItActionType(@Nullable Integer num) {
        this.itActionType = num;
    }

    public final void setItAvgPaces(@Nullable Integer num) {
        this.itAvgPaces = num;
    }

    public final void setItAvgSpeed(@Nullable Float f) {
        this.itAvgSpeed = f;
    }

    public final void setItSkiAvgSpeed(@Nullable Float f) {
        this.itSkiAvgSpeed = f;
    }

    public final void setItSkiMaxSpeed(@Nullable Float f) {
        this.itSkiMaxSpeed = f;
    }

    public final void setItSkiSlope(@Nullable Integer num) {
        this.itSkiSlope = num;
    }

    public final void setItSkiTotalDistance(@Nullable Integer num) {
        this.itSkiTotalDistance = num;
    }

    public final void setItSkiTotalTime(@Nullable Integer num) {
        this.itSkiTotalTime = num;
    }

    public final void setItTotalDuration(@Nullable Integer num) {
        this.itTotalDuration = num;
    }

    public final void setItTotalSteps(@Nullable Integer num) {
        this.itTotalSteps = num;
    }

    public final void setItTotalWeight(@Nullable Integer num) {
        this.itTotalWeight = num;
    }

    public final void setPauseType(@Nullable Integer num) {
        this.pauseType = num;
    }

    public final void setRecordList(@NotNull List<OneSportRecord> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.recordList = list;
    }

    public final void setRestSportRecord(@Nullable SportRecord sportRecord) {
        this.restSportRecord = sportRecord;
    }

    public final void setSkiPath(@Nullable Integer num) {
        this.skiPath = num;
    }

    public final void setSportPause(boolean z) {
        this.isSportPause = z;
    }

    @NotNull
    public String toString() {
        String str = "startTime=" + this.startTime + ", recordCount=" + this.recordCount;
        if (this.iTState != null) {
            str = ((Object) str) + ", itState=" + this.iTState + ", isSportPause=" + this.isSportPause;
        }
        if (this.iTTotalCount != null) {
            str = ((Object) str) + ", iTTotalCount=" + this.iTTotalCount;
        }
        if (this.iTTotalDistance != null) {
            str = ((Object) str) + ", iTTotalDistance=" + this.iTTotalDistance;
        }
        if (this.skiPath != null) {
            str = ((Object) str) + ", skiPath=" + this.skiPath;
        }
        if (this.height != null) {
            str = ((Object) str) + ", initHeight=" + this.height;
        }
        if (this.itTotalSteps != null) {
            str = ((Object) str) + ", itTotalSteps=" + this.itTotalSteps;
        }
        if (this.itAvgPaces != null) {
            str = ((Object) str) + ", itTotalPaces=" + this.itAvgPaces;
        }
        if (this.itAvgSpeed != null) {
            str = ((Object) str) + ", itTotalSpeed=" + this.itAvgSpeed;
        }
        if (this.itSkiTotalTime != null) {
            str = ((Object) str) + ", itSkiTotalTime=" + this.itSkiTotalTime;
        }
        if (this.itSkiTotalDistance != null) {
            str = ((Object) str) + ", itSkiTotalDistance=" + this.itSkiTotalDistance;
        }
        if (this.itSkiAvgSpeed != null) {
            str = ((Object) str) + ", itTotalSpeed=" + this.itSkiAvgSpeed;
        }
        if (this.itSkiMaxSpeed != null) {
            str = ((Object) str) + ", itSkiMaxSpeed=" + this.itSkiMaxSpeed;
        }
        if (this.itSkiSlope != null) {
            str = ((Object) str) + ", itTotalSpeed=" + this.itSkiSlope;
        }
        if (this.itTotalDuration == null) {
            return str;
        }
        return ((Object) str) + ", itTotalDuration=" + this.itTotalDuration;
    }
}
