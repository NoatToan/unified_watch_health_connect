package com.mi.health.course.vm;

import androidx.lifecycle.MutableLiveData;
import com.google.android.exoplayer2.m;
import com.google.android.exoplayer2.q;
import com.mi.health.course.LineChartType;
import com.mi.health.course.export.data.CourseAllInfoKt;
import com.mi.health.course.export.data.CourseConfigModel;
import com.mi.health.course.util.LogUtil;
import com.mi.health.course.vm.CourseAudioVM;
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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000fJ\u0006\u0010\u001e\u001a\u00020\u001cJ\u0006\u0010\u001f\u001a\u00020\u001cJ\u0006\u0010 \u001a\u00020\u001cJ\u000e\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020#J\u0010\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u0006H\u0002J\u0016\u0010&\u001a\u00020\u001c2\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010(R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006)"}, d2 = {"Lcom/mi/health/course/vm/CourseAudioVM;", "Lcom/mi/health/course/vm/CourseBasePlayerVM;", "<init>", "()V", "audioSegmentList", "Ljava/util/ArrayList;", "Lcom/mi/health/course/export/data/CourseConfigModel$AudioSegment;", "lineChartDataEmitter", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/wearable/course/data/LinechartViewProperty;", "getLineChartDataEmitter", "()Landroidx/lifecycle/MutableLiveData;", "lineChartDataEmitter$delegate", "Lkotlin/Lazy;", "titleEmitter", "", "getTitleEmitter", "lineChartType", "getLineChartType", "()Ljava/lang/String;", "setLineChartType", "(Ljava/lang/String;)V", "isDistanceNotMet", "", "()Z", "setDistanceNotMet", "(Z)V", "startAudio", "", "audioPath", "pauseAudio", "resumeAudio", "stopAudio", "sendCmd", "distance", "", "showTitle", "segment", "initAudioSegment", "segments", "", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCourseAudioVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseAudioVM.kt\ncom/mi/health/course/vm/CourseAudioVM\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,164:1\n1863#2,2:165\n*S KotlinDebug\n*F\n+ 1 CourseAudioVM.kt\ncom/mi/health/course/vm/CourseAudioVM\n*L\n51#1:165,2\n*E\n"})
public final class CourseAudioVM extends CourseBasePlayerVM {
    private boolean isDistanceNotMet;

    @NotNull
    private ArrayList<CourseConfigModel.AudioSegment> audioSegmentList = new ArrayList<>();

    /* JADX INFO: renamed from: lineChartDataEmitter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy lineChartDataEmitter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: no4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CourseAudioVM.lineChartDataEmitter_delegate$lambda$0();
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

    public final void initAudioSegment(@Nullable List<? extends CourseConfigModel.AudioSegment> segments) {
        String item;
        int iIntValue;
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
        LogUtil.INSTANCE.i("CourseAudioVM", "initRecommendSpeed type=" + item + "***audioSegment list size=" + size);
        String str = "startTime";
        String str2 = "get(...)";
        String str3 = "endTime";
        if (Intrinsics.areEqual(item, LineChartType.DISTANCE.getItem())) {
            int i = 0;
            int iIntValue2 = 0;
            while (i < size) {
                CourseConfigModel.AudioSegment audioSegment2 = this.audioSegmentList.get(i);
                Intrinsics.checkNotNullExpressionValue(audioSegment2, "get(...)");
                CourseConfigModel.AudioSegment audioSegment3 = audioSegment2;
                String str4 = audioSegment3.startTime;
                Intrinsics.checkNotNullExpressionValue(str4, str);
                audioSegment3.timeInMills = CourseAllInfoKt.parseTime(str4);
                String str5 = audioSegment3.endTime;
                Intrinsics.checkNotNullExpressionValue(str5, str3);
                audioSegment3.endTimeMills = CourseAllInfoKt.parseTime(str5);
                audioSegment3.requiredDistance = iIntValue2;
                LogUtil logUtil = LogUtil.INSTANCE;
                int i2 = i;
                long j = audioSegment3.timeInMills;
                String str6 = str3;
                StringBuilder sb = new StringBuilder();
                String str7 = str;
                sb.append("initRecommendSpeed timeInMills=");
                sb.append(j);
                sb.append("***requiredDistance=");
                sb.append(iIntValue2);
                logUtil.i("CourseAudioVM", sb.toString());
                int i3 = i2 + 1;
                if (i3 >= size) {
                    String triggerValue = audioSegment3.triggerValue;
                    Intrinsics.checkNotNullExpressionValue(triggerValue, "triggerValue");
                    Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(triggerValue);
                    iIntValue = (intOrNull != null ? intOrNull.intValue() : 0) + iIntValue2;
                    float f = iIntValue;
                    arrayList.add(new LinechartDataEntity(f, audioSegment3.speed));
                    logUtil.i("CourseAudioVM", "initRecommendSpeed linechart insert x=" + f + "***y=" + audioSegment3.speed);
                } else {
                    CourseConfigModel.AudioSegment audioSegment4 = this.audioSegmentList.get(i3);
                    Intrinsics.checkNotNullExpressionValue(audioSegment4, "get(...)");
                    CourseConfigModel.AudioSegment audioSegment5 = audioSegment4;
                    if (i2 == 0) {
                        arrayList.add(new LinechartDataEntity(0.0f, audioSegment3.speed));
                        logUtil.i("CourseAudioVM", "initRecommendSpeed linechart insert x=0f***y=" + audioSegment3.speed);
                    }
                    String triggerValue2 = audioSegment3.triggerValue;
                    Intrinsics.checkNotNullExpressionValue(triggerValue2, "triggerValue");
                    Integer intOrNull2 = StringsKt__StringNumberConversionsKt.toIntOrNull(triggerValue2);
                    iIntValue2 += intOrNull2 != null ? intOrNull2.intValue() : 0;
                    float f2 = iIntValue2;
                    arrayList.add(new LinechartDataEntity(f2, audioSegment3.speed));
                    logUtil.i("CourseAudioVM", "initRecommendSpeed linechart insert x=" + f2 + "***y=" + audioSegment3.speed);
                    arrayList.add(new LinechartDataEntity(f2, audioSegment5.speed));
                    logUtil.i("CourseAudioVM", "initRecommendSpeed linechart insert x=" + f2 + "***y=" + audioSegment5.speed);
                    str3 = str6;
                    str = str7;
                    i = i3;
                }
            }
            iIntValue = iIntValue2;
        } else {
            String str8 = "endTime";
            if (Intrinsics.areEqual(item, LineChartType.TIME.getItem())) {
                int i4 = 0;
                int time = 0;
                while (i4 < size) {
                    CourseConfigModel.AudioSegment audioSegment6 = this.audioSegmentList.get(i4);
                    Intrinsics.checkNotNullExpressionValue(audioSegment6, str2);
                    CourseConfigModel.AudioSegment audioSegment7 = audioSegment6;
                    String startTime = audioSegment7.startTime;
                    Intrinsics.checkNotNullExpressionValue(startTime, "startTime");
                    audioSegment7.timeInMills = CourseAllInfoKt.parseTime(startTime);
                    String str9 = audioSegment7.endTime;
                    String str10 = str8;
                    Intrinsics.checkNotNullExpressionValue(str9, str10);
                    audioSegment7.endTimeMills = CourseAllInfoKt.parseTime(str9);
                    String startTime2 = audioSegment7.startTime;
                    Intrinsics.checkNotNullExpressionValue(startTime2, "startTime");
                    float f3 = 60000;
                    float time2 = CourseAllInfoKt.parseTime(startTime2) / f3;
                    String str11 = str2;
                    arrayList.add(new LinechartDataEntity(time2, audioSegment7.speed));
                    LogUtil logUtil2 = LogUtil.INSTANCE;
                    logUtil2.i("CourseAudioVM", "initRecommendSpeed linechart insert x=" + time2 + "***y=" + audioSegment7.speed);
                    String str12 = audioSegment7.endTime;
                    Intrinsics.checkNotNullExpressionValue(str12, str10);
                    float time3 = ((float) CourseAllInfoKt.parseTime(str12)) / f3;
                    String str13 = audioSegment7.endTime;
                    Intrinsics.checkNotNullExpressionValue(str13, str10);
                    String str14 = item;
                    int i5 = i4;
                    arrayList.add(new LinechartDataEntity(CourseAllInfoKt.parseTime(str13) / f3, audioSegment7.speed));
                    logUtil2.i("CourseAudioVM", "initRecommendSpeed linechart insert x=" + time3 + "***y=" + audioSegment7.speed + "**maxValueX=" + time);
                    if (i5 == size - 1) {
                        String str15 = audioSegment7.endTime;
                        Intrinsics.checkNotNullExpressionValue(str15, str10);
                        time = ((int) CourseAllInfoKt.parseTime(str15)) / 1000;
                    }
                    i4 = i5 + 1;
                    str2 = str11;
                    item = str14;
                    str8 = str10;
                }
                iIntValue = time;
            } else {
                iIntValue = 0;
            }
        }
        this.lineChartType = item;
        LinechartViewProperty linechartViewProperty = new LinechartViewProperty(arrayList, item, iIntValue);
        LogUtil.INSTANCE.i("CourseAudioVM", "initRecommendSpeed linechart maxValueX=" + iIntValue);
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
                LogUtil logUtil = LogUtil.INSTANCE;
                logUtil.d("CourseAudioVM", "sendCmd distance=" + distance + "**requiredDistance=" + i + "**currentProgress=" + currentPosition + "startTime=" + audioSegment.timeInMills + "**endTime=" + audioSegment.endTimeMills + "**triggerValue=" + audioSegment.triggerValue);
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
                        logUtil.d("CourseAudioVM", "Distance Met resumeAudio");
                        this.isDistanceNotMet = false;
                        resumeAudio();
                    }
                } else if (getPlayer().isPlaying()) {
                    logUtil.d("CourseAudioVM", "isDistanceNotMet pauseAudio");
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
