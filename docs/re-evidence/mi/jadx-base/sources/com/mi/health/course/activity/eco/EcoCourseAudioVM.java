package com.mi.health.course.activity.eco;

import androidx.lifecycle.MutableLiveData;
import com.google.android.exoplayer2.m;
import com.google.android.exoplayer2.q;
import com.mi.health.course.LineChartType;
import com.mi.health.course.activity.eco.EcoCourseAudioVM;
import com.mi.health.course.export.data.CourseAllInfoKt;
import com.mi.health.course.export.data.CourseConfigModel;
import com.mi.health.course.util.LogUtil;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.wearable.course.data.LinechartDataEntity;
import com.xiaomi.wearable.course.data.LinechartViewProperty;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001+B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000fJ\u0006\u0010\u001e\u001a\u00020\u001cJ\u0006\u0010\u001f\u001a\u00020\u001cJ\u0006\u0010 \u001a\u00020\u001cJ\u0006\u0010!\u001a\u00020\u001cJ\u000e\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$J\u0010\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u0006H\u0002J \u0010'\u001a\u00020\u001c2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010\u000fR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006,"}, d2 = {"Lcom/mi/health/course/activity/eco/EcoCourseAudioVM;", "Lcom/mi/health/course/activity/eco/EcoCourseBasePlayerVM;", "<init>", "()V", "audioSegmentList", "Ljava/util/ArrayList;", "Lcom/mi/health/course/export/data/CourseConfigModel$AudioSegment;", "lineChartDataEmitter", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/wearable/course/data/LinechartViewProperty;", "getLineChartDataEmitter", "()Landroidx/lifecycle/MutableLiveData;", "lineChartDataEmitter$delegate", "Lkotlin/Lazy;", "titleEmitter", "", "getTitleEmitter", "lineChartType", "getLineChartType", "()Ljava/lang/String;", "setLineChartType", "(Ljava/lang/String;)V", "isDistanceNotMet", "", "()Z", "setDistanceNotMet", "(Z)V", "startAudio", "", "audioPath", "pauseAudio", "resumeAudio", "stopAudio", "showBikeData", "sendCmd", "distance", "", "showTitle", "segment", "initAudioSegment", "segments", "", "model", "Companion", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEcoCourseAudioVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcoCourseAudioVM.kt\ncom/mi/health/course/activity/eco/EcoCourseAudioVM\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,241:1\n1863#2,2:242\n1863#2,2:244\n*S KotlinDebug\n*F\n+ 1 EcoCourseAudioVM.kt\ncom/mi/health/course/activity/eco/EcoCourseAudioVM\n*L\n51#1:242,2\n69#1:244,2\n*E\n"})
public final class EcoCourseAudioVM extends EcoCourseBasePlayerVM {

    @NotNull
    public static final String TAG = "EcoCourseAudioVM";
    private boolean isDistanceNotMet;

    @NotNull
    private ArrayList<CourseConfigModel.AudioSegment> audioSegmentList = new ArrayList<>();

    /* JADX INFO: renamed from: lineChartDataEmitter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy lineChartDataEmitter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: gl7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoCourseAudioVM.lineChartDataEmitter_delegate$lambda$0();
        }
    });

    @NotNull
    private final MutableLiveData<String> titleEmitter = new MutableLiveData<>();

    @NotNull
    private String lineChartType = "";

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData lineChartDataEmitter_delegate$lambda$0() {
        return new MutableLiveData();
    }

    private final void showTitle(CourseConfigModel.AudioSegment segment) {
        if (segment.isShowTitle) {
            return;
        }
        segment.isShowTitle = true;
        this.titleEmitter.setValue(segment.introduction);
    }

    @NotNull
    public final MutableLiveData<LinechartViewProperty> getLineChartDataEmitter() {
        return (MutableLiveData) this.lineChartDataEmitter.getValue();
    }

    @NotNull
    public final String getLineChartType() {
        return this.lineChartType;
    }

    @NotNull
    public final MutableLiveData<String> getTitleEmitter() {
        return this.titleEmitter;
    }

    public final void initAudioSegment(@Nullable List<? extends CourseConfigModel.AudioSegment> segments, @Nullable String model) {
        String item;
        String str;
        String str2;
        int iIntValue;
        String str3;
        if (segments == null) {
            return;
        }
        this.audioSegmentList.addAll(segments);
        ArrayList arrayList = new ArrayList();
        if (this.audioSegmentList.isEmpty()) {
            return;
        }
        int size = this.audioSegmentList.size();
        CourseConfigModel.AudioSegment audioSegment = this.audioSegmentList.get(0);
        if (audioSegment == null || (item = audioSegment.triggerItem) == null) {
            item = LineChartType.TIME.getItem();
        }
        String str4 = TAG;
        FitnessLogUtils.i(TAG, "initRecommendSpeed type=" + item + "***audioSegment list size=" + size);
        String str5 = "get(...)";
        String str6 = "startTime";
        String str7 = "endTime";
        if (Intrinsics.areEqual(item, LineChartType.DISTANCE.getItem())) {
            int i = 0;
            int iIntValue2 = 0;
            while (i < size) {
                CourseConfigModel.AudioSegment audioSegment2 = this.audioSegmentList.get(i);
                Intrinsics.checkNotNullExpressionValue(audioSegment2, "get(...)");
                CourseConfigModel.AudioSegment audioSegment3 = audioSegment2;
                String startTime = audioSegment3.startTime;
                Intrinsics.checkNotNullExpressionValue(startTime, "startTime");
                audioSegment3.timeInMills = CourseAllInfoKt.parseTime(startTime);
                String str8 = audioSegment3.endTime;
                Intrinsics.checkNotNullExpressionValue(str8, str7);
                audioSegment3.endTimeMills = CourseAllInfoKt.parseTime(str8);
                audioSegment3.requiredDistance = iIntValue2;
                long j = audioSegment3.timeInMills;
                StringBuilder sb = new StringBuilder();
                String str9 = str7;
                sb.append("initRecommendSpeed timeInMills=");
                sb.append(j);
                sb.append("***requiredDistance=");
                sb.append(iIntValue2);
                FitnessLogUtils.d(TAG, sb.toString());
                int i2 = i + 1;
                if (i2 >= size) {
                    String triggerValue = audioSegment3.triggerValue;
                    Intrinsics.checkNotNullExpressionValue(triggerValue, "triggerValue");
                    Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(triggerValue);
                    iIntValue = (intOrNull != null ? intOrNull.intValue() : 0) + iIntValue2;
                    float f = iIntValue;
                    arrayList.add(new LinechartDataEntity(f, audioSegment3.speed));
                    FitnessLogUtils.d(TAG, "initRecommendSpeed linechart insert x=" + f + "***y=" + audioSegment3.speed);
                    str2 = item;
                    str = TAG;
                } else {
                    CourseConfigModel.AudioSegment audioSegment4 = this.audioSegmentList.get(i2);
                    Intrinsics.checkNotNullExpressionValue(audioSegment4, "get(...)");
                    CourseConfigModel.AudioSegment audioSegment5 = audioSegment4;
                    if (i == 0) {
                        arrayList.add(new LinechartDataEntity(0.0f, audioSegment3.speed));
                        FitnessLogUtils.d(TAG, "initRecommendSpeed linechart insert x=0f***y=" + audioSegment3.speed);
                    }
                    String triggerValue2 = audioSegment3.triggerValue;
                    Intrinsics.checkNotNullExpressionValue(triggerValue2, "triggerValue");
                    Integer intOrNull2 = StringsKt__StringNumberConversionsKt.toIntOrNull(triggerValue2);
                    iIntValue2 += intOrNull2 != null ? intOrNull2.intValue() : 0;
                    float f2 = iIntValue2;
                    arrayList.add(new LinechartDataEntity(f2, audioSegment3.speed));
                    FitnessLogUtils.d(TAG, "initRecommendSpeed linechart insert x=" + f2 + "***y=" + audioSegment3.speed);
                    arrayList.add(new LinechartDataEntity(f2, audioSegment5.speed));
                    FitnessLogUtils.d(TAG, "initRecommendSpeed linechart insert x=" + f2 + "***y=" + audioSegment5.speed);
                    i = i2;
                    str7 = str9;
                }
            }
            str2 = item;
            str = TAG;
            iIntValue = iIntValue2;
        } else {
            String str10 = "endTime";
            if (Intrinsics.areEqual(item, LineChartType.TIME.getItem())) {
                String str11 = "**maxValueX=";
                int i3 = 60000;
                if (Intrinsics.areEqual(model, "yesoul.exbike.jsc01y")) {
                    int i4 = 0;
                    int time = 0;
                    while (i4 < size) {
                        CourseConfigModel.AudioSegment audioSegment6 = this.audioSegmentList.get(i4);
                        Intrinsics.checkNotNullExpressionValue(audioSegment6, str5);
                        CourseConfigModel.AudioSegment audioSegment7 = audioSegment6;
                        String str12 = audioSegment7.startTime;
                        Intrinsics.checkNotNullExpressionValue(str12, str6);
                        audioSegment7.timeInMills = CourseAllInfoKt.parseTime(str12);
                        String str13 = audioSegment7.endTime;
                        String str14 = str10;
                        Intrinsics.checkNotNullExpressionValue(str13, str14);
                        String str15 = item;
                        int i5 = i4;
                        audioSegment7.endTimeMills = CourseAllInfoKt.parseTime(str13);
                        String str16 = audioSegment7.startTime;
                        Intrinsics.checkNotNullExpressionValue(str16, str6);
                        float f3 = i3;
                        float time2 = CourseAllInfoKt.parseTime(str16) / f3;
                        LogUtil logUtil = LogUtil.INSTANCE;
                        int i6 = audioSegment7.sectionValue;
                        StringBuilder sb2 = new StringBuilder();
                        String str17 = str6;
                        sb2.append("initRecommendBike linechart insert  x=");
                        sb2.append(time2);
                        sb2.append("***y=");
                        sb2.append(i6);
                        logUtil.i(str4, sb2.toString());
                        arrayList.add(new LinechartDataEntity(time2, audioSegment7.sectionValue));
                        logUtil.i(str4, "initRecommendBike linechart insert x=" + time2 + "***y=" + audioSegment7.sectionValue);
                        String str18 = audioSegment7.endTime;
                        Intrinsics.checkNotNullExpressionValue(str18, str14);
                        int i7 = size;
                        float time3 = ((float) CourseAllInfoKt.parseTime(str18)) / f3;
                        String str19 = audioSegment7.endTime;
                        Intrinsics.checkNotNullExpressionValue(str19, str14);
                        String str20 = str4;
                        String str21 = str5;
                        arrayList.add(new LinechartDataEntity(CourseAllInfoKt.parseTime(str19) / f3, audioSegment7.sectionValue));
                        logUtil.i(str20, "initRecommendBike linechart insert x=" + time3 + "***y=" + audioSegment7.sectionValue + "**maxValueX=" + time);
                        if (i5 == i7 - 1) {
                            String str22 = audioSegment7.endTime;
                            Intrinsics.checkNotNullExpressionValue(str22, str14);
                            time = ((int) CourseAllInfoKt.parseTime(str22)) / 1000;
                        }
                        i4 = i5 + 1;
                        str4 = str20;
                        size = i7;
                        str10 = str14;
                        item = str15;
                        str6 = str17;
                        str5 = str21;
                        i3 = 60000;
                    }
                    str3 = item;
                    str = str4;
                    iIntValue = time;
                } else {
                    str3 = item;
                    str = TAG;
                    int time4 = 0;
                    int i8 = 0;
                    while (i8 < size) {
                        CourseConfigModel.AudioSegment audioSegment8 = this.audioSegmentList.get(i8);
                        Intrinsics.checkNotNullExpressionValue(audioSegment8, "get(...)");
                        CourseConfigModel.AudioSegment audioSegment9 = audioSegment8;
                        String startTime2 = audioSegment9.startTime;
                        Intrinsics.checkNotNullExpressionValue(startTime2, "startTime");
                        int i9 = i8;
                        String str23 = str11;
                        audioSegment9.timeInMills = CourseAllInfoKt.parseTime(startTime2);
                        String str24 = audioSegment9.endTime;
                        Intrinsics.checkNotNullExpressionValue(str24, str10);
                        audioSegment9.endTimeMills = CourseAllInfoKt.parseTime(str24);
                        String startTime3 = audioSegment9.startTime;
                        Intrinsics.checkNotNullExpressionValue(startTime3, "startTime");
                        float f4 = 60000;
                        float time5 = CourseAllInfoKt.parseTime(startTime3) / f4;
                        arrayList.add(new LinechartDataEntity(time5, audioSegment9.speed));
                        FitnessLogUtils.d(str, "initRecommendSpeed linechart insert x=" + time5 + "***y=" + audioSegment9.speed);
                        String str25 = audioSegment9.endTime;
                        Intrinsics.checkNotNullExpressionValue(str25, str10);
                        float time6 = ((float) CourseAllInfoKt.parseTime(str25)) / f4;
                        String str26 = audioSegment9.endTime;
                        Intrinsics.checkNotNullExpressionValue(str26, str10);
                        arrayList.add(new LinechartDataEntity(CourseAllInfoKt.parseTime(str26) / f4, audioSegment9.speed));
                        FitnessLogUtils.d(str, "initRecommendSpeed linechart insert x=" + time6 + "***y=" + audioSegment9.speed + str23 + time4);
                        if (i9 == size - 1) {
                            String str27 = audioSegment9.endTime;
                            Intrinsics.checkNotNullExpressionValue(str27, str10);
                            time4 = ((int) CourseAllInfoKt.parseTime(str27)) / 1000;
                        }
                        str11 = str23;
                        i8 = i9 + 1;
                    }
                    iIntValue = time4;
                }
                str2 = str3;
            } else {
                String str28 = item;
                str = TAG;
                str2 = str28;
                iIntValue = 0;
            }
        }
        this.lineChartType = str2;
        LinechartViewProperty linechartViewProperty = new LinechartViewProperty(arrayList, str2, iIntValue);
        LogUtil.INSTANCE.i(str, "initRecommendSpeed linechart maxValueX=" + iIntValue);
        getLineChartDataEmitter().setValue(linechartViewProperty);
    }

    /* JADX INFO: renamed from: isDistanceNotMet, reason: from getter */
    public final boolean getIsDistanceNotMet() {
        return this.isDistanceNotMet;
    }

    public final void pauseAudio() {
        getPlayer().pause();
    }

    public final void resumeAudio() {
        if (this.isDistanceNotMet) {
            return;
        }
        getPlayer().z(true);
        getPlayer().prepare();
    }

    public final void sendCmd(int distance) {
        for (CourseConfigModel.AudioSegment audioSegment : this.audioSegmentList) {
            long currentPosition = getPlayer().getCurrentPosition();
            long j = 1000;
            long j2 = audioSegment.timeInMills - j;
            if (j2 < 0) {
                j2 = 0;
            }
            long j3 = audioSegment.endTimeMills - j;
            if (j2 <= currentPosition && currentPosition < j3) {
                if (Intrinsics.areEqual(this.lineChartType, LineChartType.TIME.getItem())) {
                    showTitle(audioSegment);
                    return;
                }
                int i = audioSegment.requiredDistance;
                FitnessLogUtils.d(TAG, "sendCmd distance=" + distance + "**requiredDistance=" + i + "**currentProgress=" + currentPosition + "startTime=" + audioSegment.timeInMills + "**endTime=" + audioSegment.endTimeMills + "**triggerValue=" + audioSegment.triggerValue);
                if (distance >= i) {
                    float f = distance;
                    float f2 = i;
                    String triggerValue = audioSegment.triggerValue;
                    Intrinsics.checkNotNullExpressionValue(triggerValue, "triggerValue");
                    Float floatOrNull = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(triggerValue);
                    if (f >= f2 + (floatOrNull != null ? floatOrNull.floatValue() : 0.0f)) {
                        getPlayer().seekTo(audioSegment.endTimeMills);
                    }
                    showTitle(audioSegment);
                    cmd(currentPosition);
                    if (this.isDistanceNotMet && !getPlayer().isPlaying()) {
                        FitnessLogUtils.d(TAG, "Distance Met resumeAudio");
                        this.isDistanceNotMet = false;
                        resumeAudio();
                    }
                } else if (getPlayer().isPlaying()) {
                    FitnessLogUtils.d(TAG, "isDistanceNotMet pauseAudio");
                    this.isDistanceNotMet = true;
                    pauseAudio();
                }
            }
        }
    }

    public final void setDistanceNotMet(boolean z) {
        this.isDistanceNotMet = z;
    }

    public final void setLineChartType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.lineChartType = str;
    }

    public final void showBikeData() {
        for (CourseConfigModel.AudioSegment audioSegment : this.audioSegmentList) {
            long currentPosition = getPlayer().getCurrentPosition();
            long j = 1000;
            long j2 = audioSegment.timeInMills - j;
            if (j2 < 0) {
                j2 = 0;
            }
            long j3 = audioSegment.endTimeMills - j;
            if (j2 <= currentPosition && currentPosition < j3 && Intrinsics.areEqual(this.lineChartType, LineChartType.TIME.getItem())) {
                showTitle(audioSegment);
                cmd(currentPosition);
                return;
            }
        }
    }

    public final void startAudio(@NotNull String audioPath) {
        Intrinsics.checkNotNullParameter(audioPath, "audioPath");
        q player = getPlayer();
        player.z(true);
        player.I(m.c(audioPath));
        player.prepare();
    }

    public final void stopAudio() {
        getPlayer().stop();
    }
}
