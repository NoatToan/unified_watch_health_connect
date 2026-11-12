package com.mi.health.course.eco.vm;

import androidx.lifecycle.MutableLiveData;
import com.google.android.exoplayer2.m;
import com.google.android.exoplayer2.q;
import com.mi.health.course.LineChartType;
import com.mi.health.course.eco.vm.EcoCourseAudioVM;
import com.mi.health.course.export.data.CourseAllInfoKt;
import com.mi.health.course.export.data.CourseConfigModel;
import com.mi.health.course.util.LogUtil;
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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000fJ\u0006\u0010\u001e\u001a\u00020\u001cJ\u0006\u0010\u001f\u001a\u00020\u001cJ\u0006\u0010 \u001a\u00020\u001cJ\u0006\u0010!\u001a\u00020\u001cJ\u000e\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$J\u0010\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u0006H\u0002J\u0016\u0010'\u001a\u00020\u001c2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010)R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006*"}, d2 = {"Lcom/mi/health/course/eco/vm/EcoCourseAudioVM;", "Lcom/mi/health/course/eco/vm/EcoCourseBasePlayerVM;", "<init>", "()V", "audioSegmentList", "Ljava/util/ArrayList;", "Lcom/mi/health/course/export/data/CourseConfigModel$AudioSegment;", "lineChartDataEmitter", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/wearable/course/data/LinechartViewProperty;", "getLineChartDataEmitter", "()Landroidx/lifecycle/MutableLiveData;", "lineChartDataEmitter$delegate", "Lkotlin/Lazy;", "titleEmitter", "", "getTitleEmitter", "lineChartType", "getLineChartType", "()Ljava/lang/String;", "setLineChartType", "(Ljava/lang/String;)V", "isDistanceNotMet", "", "()Z", "setDistanceNotMet", "(Z)V", "startAudio", "", "audioPath", "pauseAudio", "resumeAudio", "stopAudio", "showJumpData", "sendCmd", "distance", "", "showTitle", "segment", "initAudioSegment", "segments", "", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEcoCourseAudioVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcoCourseAudioVM.kt\ncom/mi/health/course/eco/vm/EcoCourseAudioVM\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,203:1\n1863#2,2:204\n1863#2,2:206\n*S KotlinDebug\n*F\n+ 1 EcoCourseAudioVM.kt\ncom/mi/health/course/eco/vm/EcoCourseAudioVM\n*L\n52#1:204,2\n70#1:206,2\n*E\n"})
public final class EcoCourseAudioVM extends EcoCourseBasePlayerVM {
    private boolean isDistanceNotMet;

    @NotNull
    private ArrayList<CourseConfigModel.AudioSegment> audioSegmentList = new ArrayList<>();

    /* JADX INFO: renamed from: lineChartDataEmitter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy lineChartDataEmitter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: fl7
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

    public final void initAudioSegment(@Nullable List<? extends CourseConfigModel.AudioSegment> segments) {
        String item;
        String str;
        int iIntValue;
        String str2;
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
        String str3 = com.mi.health.course.activity.eco.EcoCourseAudioVM.TAG;
        LogUtil.INSTANCE.i(com.mi.health.course.activity.eco.EcoCourseAudioVM.TAG, "initRecommendSpeed type=" + item + "***audioSegment list size=" + size);
        String str4 = "get(...)";
        String str5 = "startTime";
        String str6 = "initRecommendSpeed linechart insert x=";
        String str7 = "endTime";
        if (Intrinsics.areEqual(item, LineChartType.DISTANCE.getItem())) {
            int i = 0;
            int iIntValue2 = 0;
            while (i < size) {
                CourseConfigModel.AudioSegment audioSegment2 = this.audioSegmentList.get(i);
                Intrinsics.checkNotNullExpressionValue(audioSegment2, "get(...)");
                CourseConfigModel.AudioSegment audioSegment3 = audioSegment2;
                String str8 = audioSegment3.startTime;
                Intrinsics.checkNotNullExpressionValue(str8, str5);
                audioSegment3.timeInMills = CourseAllInfoKt.parseTime(str8);
                String str9 = audioSegment3.endTime;
                Intrinsics.checkNotNullExpressionValue(str9, str7);
                audioSegment3.endTimeMills = CourseAllInfoKt.parseTime(str9);
                audioSegment3.requiredDistance = iIntValue2;
                LogUtil logUtil = LogUtil.INSTANCE;
                int i2 = i;
                long j = audioSegment3.timeInMills;
                String str10 = str7;
                StringBuilder sb = new StringBuilder();
                String str11 = str5;
                sb.append("initRecommendSpeed timeInMills=");
                sb.append(j);
                sb.append("***requiredDistance=");
                sb.append(iIntValue2);
                logUtil.i(com.mi.health.course.activity.eco.EcoCourseAudioVM.TAG, sb.toString());
                int i3 = i2 + 1;
                if (i3 >= size) {
                    String triggerValue = audioSegment3.triggerValue;
                    Intrinsics.checkNotNullExpressionValue(triggerValue, "triggerValue");
                    Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(triggerValue);
                    iIntValue = (intOrNull != null ? intOrNull.intValue() : 0) + iIntValue2;
                    float f = iIntValue;
                    arrayList.add(new LinechartDataEntity(f, audioSegment3.speed));
                    logUtil.i(com.mi.health.course.activity.eco.EcoCourseAudioVM.TAG, "initRecommendSpeed linechart insert x=" + f + "***y=" + audioSegment3.speed);
                    str = com.mi.health.course.activity.eco.EcoCourseAudioVM.TAG;
                } else {
                    CourseConfigModel.AudioSegment audioSegment4 = this.audioSegmentList.get(i3);
                    Intrinsics.checkNotNullExpressionValue(audioSegment4, "get(...)");
                    CourseConfigModel.AudioSegment audioSegment5 = audioSegment4;
                    if (i2 == 0) {
                        arrayList.add(new LinechartDataEntity(0.0f, audioSegment3.speed));
                        logUtil.i(com.mi.health.course.activity.eco.EcoCourseAudioVM.TAG, "initRecommendSpeed linechart insert x=0f***y=" + audioSegment3.speed);
                    }
                    String triggerValue2 = audioSegment3.triggerValue;
                    Intrinsics.checkNotNullExpressionValue(triggerValue2, "triggerValue");
                    Integer intOrNull2 = StringsKt__StringNumberConversionsKt.toIntOrNull(triggerValue2);
                    iIntValue2 += intOrNull2 != null ? intOrNull2.intValue() : 0;
                    float f2 = iIntValue2;
                    arrayList.add(new LinechartDataEntity(f2, audioSegment3.speed));
                    logUtil.i(com.mi.health.course.activity.eco.EcoCourseAudioVM.TAG, "initRecommendSpeed linechart insert x=" + f2 + "***y=" + audioSegment3.speed);
                    arrayList.add(new LinechartDataEntity(f2, audioSegment5.speed));
                    logUtil.i(com.mi.health.course.activity.eco.EcoCourseAudioVM.TAG, "initRecommendSpeed linechart insert x=" + f2 + "***y=" + audioSegment5.speed);
                    str7 = str10;
                    str5 = str11;
                    i = i3;
                }
            }
            str = com.mi.health.course.activity.eco.EcoCourseAudioVM.TAG;
            iIntValue = iIntValue2;
        } else {
            String str12 = "startTime";
            String str13 = "endTime";
            if (!Intrinsics.areEqual(item, LineChartType.TIME.getItem())) {
                str = com.mi.health.course.activity.eco.EcoCourseAudioVM.TAG;
                iIntValue = 0;
            } else if (isRopeSkipping()) {
                int i4 = 0;
                int time = 0;
                while (i4 < size) {
                    CourseConfigModel.AudioSegment audioSegment6 = this.audioSegmentList.get(i4);
                    Intrinsics.checkNotNullExpressionValue(audioSegment6, str4);
                    CourseConfigModel.AudioSegment audioSegment7 = audioSegment6;
                    String str14 = audioSegment7.startTime;
                    String str15 = str12;
                    Intrinsics.checkNotNullExpressionValue(str14, str15);
                    String str16 = str6;
                    audioSegment7.timeInMills = CourseAllInfoKt.parseTime(str14);
                    String str17 = audioSegment7.endTime;
                    String str18 = str13;
                    Intrinsics.checkNotNullExpressionValue(str17, str18);
                    String str19 = item;
                    int i5 = i4;
                    audioSegment7.endTimeMills = CourseAllInfoKt.parseTime(str17);
                    String str20 = audioSegment7.startTime;
                    Intrinsics.checkNotNullExpressionValue(str20, str15);
                    float f3 = 60000;
                    float time2 = CourseAllInfoKt.parseTime(str20) / f3;
                    LogUtil logUtil2 = LogUtil.INSTANCE;
                    logUtil2.i(str3, "initRecommendSpeed linechart insert  x=" + time2 + "***y=" + audioSegment7.sectionValue);
                    arrayList.add(new LinechartDataEntity(time2, (float) audioSegment7.sectionValue));
                    logUtil2.i(str3, str16 + time2 + "***y=" + audioSegment7.sectionValue);
                    String str21 = audioSegment7.endTime;
                    Intrinsics.checkNotNullExpressionValue(str21, str18);
                    float time3 = ((float) CourseAllInfoKt.parseTime(str21)) / f3;
                    String str22 = audioSegment7.endTime;
                    Intrinsics.checkNotNullExpressionValue(str22, str18);
                    String str23 = str4;
                    String str24 = str3;
                    arrayList.add(new LinechartDataEntity(CourseAllInfoKt.parseTime(str22) / f3, audioSegment7.sectionValue));
                    logUtil2.i(str24, str16 + time3 + "***y=" + audioSegment7.sectionValue + "**maxValueX=" + time);
                    if (i5 == size - 1) {
                        String str25 = audioSegment7.endTime;
                        Intrinsics.checkNotNullExpressionValue(str25, str18);
                        time = ((int) CourseAllInfoKt.parseTime(str25)) / 1000;
                    }
                    i4 = i5 + 1;
                    str3 = str24;
                    str13 = str18;
                    str6 = str16;
                    item = str19;
                    str12 = str15;
                    str4 = str23;
                }
                str = str3;
                iIntValue = time;
            } else {
                String str26 = item;
                str = com.mi.health.course.activity.eco.EcoCourseAudioVM.TAG;
                String str27 = str13;
                int time4 = 0;
                int i6 = 0;
                while (i6 < size) {
                    CourseConfigModel.AudioSegment audioSegment8 = this.audioSegmentList.get(i6);
                    Intrinsics.checkNotNullExpressionValue(audioSegment8, "get(...)");
                    CourseConfigModel.AudioSegment audioSegment9 = audioSegment8;
                    String str28 = audioSegment9.startTime;
                    Intrinsics.checkNotNullExpressionValue(str28, str12);
                    audioSegment9.timeInMills = CourseAllInfoKt.parseTime(str28);
                    String str29 = audioSegment9.endTime;
                    Intrinsics.checkNotNullExpressionValue(str29, str27);
                    audioSegment9.endTimeMills = CourseAllInfoKt.parseTime(str29);
                    String str30 = audioSegment9.startTime;
                    Intrinsics.checkNotNullExpressionValue(str30, str12);
                    float f4 = 60000;
                    float time5 = CourseAllInfoKt.parseTime(str30) / f4;
                    arrayList.add(new LinechartDataEntity(time5, audioSegment9.speed));
                    LogUtil logUtil3 = LogUtil.INSTANCE;
                    logUtil3.i(str, "initRecommendSpeed linechart insert x=" + time5 + "***y=" + audioSegment9.speed);
                    String str31 = audioSegment9.endTime;
                    Intrinsics.checkNotNullExpressionValue(str31, str27);
                    float time6 = ((float) CourseAllInfoKt.parseTime(str31)) / f4;
                    String str32 = audioSegment9.endTime;
                    Intrinsics.checkNotNullExpressionValue(str32, str27);
                    String str33 = str27;
                    arrayList.add(new LinechartDataEntity(CourseAllInfoKt.parseTime(str32) / f4, audioSegment9.speed));
                    logUtil3.i(str, "initRecommendSpeed linechart insert x=" + time6 + "***y=" + audioSegment9.speed + "**maxValueX=" + time4);
                    if (i6 == size - 1) {
                        String str34 = audioSegment9.endTime;
                        str2 = str33;
                        Intrinsics.checkNotNullExpressionValue(str34, str2);
                        time4 = ((int) CourseAllInfoKt.parseTime(str34)) / 1000;
                    } else {
                        str2 = str33;
                    }
                    i6++;
                    str27 = str2;
                }
                iIntValue = time4;
                item = str26;
            }
        }
        this.lineChartType = item;
        LinechartViewProperty linechartViewProperty = new LinechartViewProperty(arrayList, item, iIntValue);
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
                LogUtil logUtil = LogUtil.INSTANCE;
                logUtil.d(com.mi.health.course.activity.eco.EcoCourseAudioVM.TAG, "sendCmd distance=" + distance + "**requiredDistance=" + i + "**currentProgress=" + currentPosition + "startTime=" + audioSegment.timeInMills + "**endTime=" + audioSegment.endTimeMills + "**triggerValue=" + audioSegment.triggerValue);
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
                        logUtil.d(com.mi.health.course.activity.eco.EcoCourseAudioVM.TAG, "Distance Met resumeAudio");
                        this.isDistanceNotMet = false;
                        resumeAudio();
                    }
                } else if (getPlayer().isPlaying()) {
                    logUtil.d(com.mi.health.course.activity.eco.EcoCourseAudioVM.TAG, "isDistanceNotMet pauseAudio");
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

    public final void showJumpData() {
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
