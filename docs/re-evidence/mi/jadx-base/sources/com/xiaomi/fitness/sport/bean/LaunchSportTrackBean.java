package com.xiaomi.fitness.sport.bean;

import com.amap.api.maps.model.MyLocationStyle;
import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b+\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\u001e\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010&\u001a\u0004\u0018\u00010'X\u0086\u000e¢\u0006\u0010\n\u0002\u0010,\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010-\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b-\u0010\u0012\"\u0004\b.\u0010\u0014R\u001e\u0010/\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b/\u0010\u0012\"\u0004\b0\u0010\u0014R\u001e\u00101\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b1\u0010\u0012\"\u0004\b2\u0010\u0014R\u001e\u00103\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b3\u0010\u0012\"\u0004\b4\u0010\u0014R\u001e\u00105\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b5\u0010\u0012\"\u0004\b6\u0010\u0014R\u001c\u00107\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0007\"\u0004\b9\u0010\tR\u001c\u0010:\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0007\"\u0004\b<\u0010\tR\u001e\u0010=\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b>\u0010\u0012\"\u0004\b?\u0010\u0014R\u001c\u0010@\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0007\"\u0004\bB\u0010\tR\u001e\u0010C\u001a\u0004\u0018\u00010'X\u0086\u000e¢\u0006\u0010\n\u0002\u0010,\u001a\u0004\bD\u0010)\"\u0004\bE\u0010+R\u001e\u0010F\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\bG\u0010\"\"\u0004\bH\u0010$R\u001e\u0010I\u001a\u0004\u0018\u00010'X\u0086\u000e¢\u0006\u0010\n\u0002\u0010,\u001a\u0004\bJ\u0010)\"\u0004\bK\u0010+R\u001e\u0010L\u001a\u0004\u0018\u00010'X\u0086\u000e¢\u0006\u0010\n\u0002\u0010,\u001a\u0004\bM\u0010)\"\u0004\bN\u0010+R\u001e\u0010O\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\bP\u0010\u0012\"\u0004\bQ\u0010\u0014¨\u0006R"}, d2 = {"Lcom/xiaomi/fitness/sport/bean/LaunchSportTrackBean;", "", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "exerciseTypeDetail", "getExerciseTypeDetail", "setExerciseTypeDetail", "source", "getSource", "setSource", "isGPS", "", "()Ljava/lang/Boolean;", "setGPS", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "deviceModel", "getDeviceModel", "setDeviceModel", "instrumentModel", "getInstrumentModel", "setInstrumentModel", "targetType", "getTargetType", "setTargetType", "targetValue", "", "getTargetValue", "()Ljava/lang/Float;", "setTargetValue", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "tempoAvg", "", "getTempoAvg", "()Ljava/lang/Integer;", "setTempoAvg", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "isDisplay", "setDisplay", "isLighten", "setLighten", "isAuto", "setAuto", "isVoice", "setVoice", "isRemind", "setRemind", "speedRemind", "getSpeedRemind", "setSpeedRemind", "typeStr", "getTypeStr", "setTypeStr", "result", "getResult", "setResult", MyLocationStyle.ERROR_INFO, "getErrorInfo", "setErrorInfo", "durationMin", "getDurationMin", "setDurationMin", "distance", "getDistance", "setDistance", "targetCompleteness", "getTargetCompleteness", "setTargetCompleteness", "count", "getCount", FitnessReportKey.setCount, "exerciseResultPage", "getExerciseResultPage", "setExerciseResultPage", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LaunchSportTrackBean {

    @Nullable
    private Integer count;

    @Nullable
    private String deviceModel;

    @Nullable
    private Float distance;

    @Nullable
    private Integer durationMin;

    @Nullable
    private String errorInfo;

    @Nullable
    private Boolean exerciseResultPage;

    @Nullable
    private String exerciseTypeDetail;

    @Nullable
    private String instrumentModel;

    @Nullable
    private Boolean isAuto;

    @Nullable
    private Boolean isDisplay;

    @Nullable
    private Boolean isGPS;

    @Nullable
    private Boolean isLighten;

    @Nullable
    private Boolean isRemind;

    @Nullable
    private Boolean isVoice;

    @Nullable
    private String name;

    @Nullable
    private Boolean result;

    @Nullable
    private String source;

    @Nullable
    private String speedRemind;

    @Nullable
    private Integer targetCompleteness;

    @Nullable
    private String targetType;

    @Nullable
    private Float targetValue;

    @Nullable
    private Integer tempoAvg;

    @Nullable
    private String typeStr;

    @Nullable
    public final Integer getCount() {
        return this.count;
    }

    @Nullable
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    @Nullable
    public final Float getDistance() {
        return this.distance;
    }

    @Nullable
    public final Integer getDurationMin() {
        return this.durationMin;
    }

    @Nullable
    public final String getErrorInfo() {
        return this.errorInfo;
    }

    @Nullable
    public final Boolean getExerciseResultPage() {
        return this.exerciseResultPage;
    }

    @Nullable
    public final String getExerciseTypeDetail() {
        return this.exerciseTypeDetail;
    }

    @Nullable
    public final String getInstrumentModel() {
        return this.instrumentModel;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Boolean getResult() {
        return this.result;
    }

    @Nullable
    public final String getSource() {
        return this.source;
    }

    @Nullable
    public final String getSpeedRemind() {
        return this.speedRemind;
    }

    @Nullable
    public final Integer getTargetCompleteness() {
        return this.targetCompleteness;
    }

    @Nullable
    public final String getTargetType() {
        return this.targetType;
    }

    @Nullable
    public final Float getTargetValue() {
        return this.targetValue;
    }

    @Nullable
    public final Integer getTempoAvg() {
        return this.tempoAvg;
    }

    @Nullable
    public final String getTypeStr() {
        return this.typeStr;
    }

    @Nullable
    /* JADX INFO: renamed from: isAuto, reason: from getter */
    public final Boolean getIsAuto() {
        return this.isAuto;
    }

    @Nullable
    /* JADX INFO: renamed from: isDisplay, reason: from getter */
    public final Boolean getIsDisplay() {
        return this.isDisplay;
    }

    @Nullable
    /* JADX INFO: renamed from: isGPS, reason: from getter */
    public final Boolean getIsGPS() {
        return this.isGPS;
    }

    @Nullable
    /* JADX INFO: renamed from: isLighten, reason: from getter */
    public final Boolean getIsLighten() {
        return this.isLighten;
    }

    @Nullable
    /* JADX INFO: renamed from: isRemind, reason: from getter */
    public final Boolean getIsRemind() {
        return this.isRemind;
    }

    @Nullable
    /* JADX INFO: renamed from: isVoice, reason: from getter */
    public final Boolean getIsVoice() {
        return this.isVoice;
    }

    public final void setAuto(@Nullable Boolean bool) {
        this.isAuto = bool;
    }

    public final void setCount(@Nullable Integer num) {
        this.count = num;
    }

    public final void setDeviceModel(@Nullable String str) {
        this.deviceModel = str;
    }

    public final void setDisplay(@Nullable Boolean bool) {
        this.isDisplay = bool;
    }

    public final void setDistance(@Nullable Float f) {
        this.distance = f;
    }

    public final void setDurationMin(@Nullable Integer num) {
        this.durationMin = num;
    }

    public final void setErrorInfo(@Nullable String str) {
        this.errorInfo = str;
    }

    public final void setExerciseResultPage(@Nullable Boolean bool) {
        this.exerciseResultPage = bool;
    }

    public final void setExerciseTypeDetail(@Nullable String str) {
        this.exerciseTypeDetail = str;
    }

    public final void setGPS(@Nullable Boolean bool) {
        this.isGPS = bool;
    }

    public final void setInstrumentModel(@Nullable String str) {
        this.instrumentModel = str;
    }

    public final void setLighten(@Nullable Boolean bool) {
        this.isLighten = bool;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setRemind(@Nullable Boolean bool) {
        this.isRemind = bool;
    }

    public final void setResult(@Nullable Boolean bool) {
        this.result = bool;
    }

    public final void setSource(@Nullable String str) {
        this.source = str;
    }

    public final void setSpeedRemind(@Nullable String str) {
        this.speedRemind = str;
    }

    public final void setTargetCompleteness(@Nullable Integer num) {
        this.targetCompleteness = num;
    }

    public final void setTargetType(@Nullable String str) {
        this.targetType = str;
    }

    public final void setTargetValue(@Nullable Float f) {
        this.targetValue = f;
    }

    public final void setTempoAvg(@Nullable Integer num) {
        this.tempoAvg = num;
    }

    public final void setTypeStr(@Nullable String str) {
        this.typeStr = str;
    }

    public final void setVoice(@Nullable Boolean bool) {
        this.isVoice = bool;
    }
}
