package com.mi.health.course.vm;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import com.mi.health.course.export.data.HrCourseConfigModel;
import com.mi.health.course.ext.CourseExtKt;
import com.mi.health.course.util.LogUtil;
import com.mi.health.course.vm.CourseHeartRateVM;
import com.xiaomi.fitness.account.HrZone;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import com.xiaomi.wearable.course.data.LinechartDataEntity;
import com.xiaomi.wearable.course.data.LinechartViewProperty;
import defpackage.rvn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010:\u001a\u00020\u000e2\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fJ\u001a\u0010<\u001a\u00020\u000e2\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\fJ\u001a\u0010=\u001a\u00020\u000e2\u0006\u0010>\u001a\u00020\u00192\b\b\u0002\u0010?\u001a\u00020\u0019H\u0002J\u0006\u0010B\u001a\u00020\u000eJ\u0006\u0010C\u001a\u00020\u000eJ\u001e\u0010D\u001a\u00020\u000e2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\u00192\u0006\u0010H\u001a\u00020(J\u0010\u0010I\u001a\u00020\u00192\u0006\u0010J\u001a\u00020\u0010H\u0002J\b\u0010K\u001a\u00020\u001bH\u0002J\u0010\u0010L\u001a\u00020\u000e2\u0006\u0010J\u001a\u00020\u0010H\u0002J\u0010\u0010M\u001a\u00020\u000e2\b\u0010N\u001a\u0004\u0018\u00010OJ\b\u0010P\u001a\u00020\u000eH\u0002J\b\u0010Q\u001a\u00020\u000eH\u0014R!\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001fR\u001a\u0010\"\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010$\"\u0004\b/\u0010&R\u001a\u00100\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010$\"\u0004\b2\u0010&R\u001a\u00103\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001d\"\u0004\b4\u0010\u001fR\u000e\u00105\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u00107\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010\n\u001a\u0004\b8\u0010$R\u000e\u0010@\u001a\u00020AX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006R"}, d2 = {"Lcom/mi/health/course/vm/CourseHeartRateVM;", "Lcom/mi/health/course/vm/CourseBasePlayerVM;", "<init>", "()V", "lineChartDataEmitter", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/wearable/course/data/LinechartViewProperty;", "getLineChartDataEmitter", "()Landroidx/lifecycle/MutableLiveData;", "lineChartDataEmitter$delegate", "Lkotlin/Lazy;", "toastEmitter", "Lkotlin/Function1;", "", "", "stageTitleEmitter", "Lcom/mi/health/course/export/data/HrCourseConfigModel$HrDetailStage;", "hrSegmentList", "Ljava/util/ArrayList;", "mHandler", "Landroid/os/Handler;", "mHrException", "Lcom/mi/health/course/export/data/HrCourseConfigModel$HrException;", "bpmList", "Ljava/util/LinkedList;", "", "linkEnable", "", "getLinkEnable", "()Z", "setLinkEnable", "(Z)V", "isCoursePause", "setCoursePause", "numberAddSpeed", "getNumberAddSpeed", "()I", "setNumberAddSpeed", "(I)V", "mCurrentValue", "", "getMCurrentValue", "()F", "setMCurrentValue", "(F)V", "firstAddSpeedBpm", "getFirstAddSpeedBpm", "setFirstAddSpeedBpm", "mCurrentBpm", "getMCurrentBpm", "setMCurrentBpm", "isShowSpeedProtectDialog", "setShowSpeedProtectDialog", "isCourseComplete", "isRemoveMsg", "maxHr", "getMaxHr", "maxHr$delegate", "setToastListener", "lister", "setStageTitleListener", "bpmAudio", "type", "time", "dialogDismissRunnable", "Ljava/lang/Runnable;", "protectDialogDismiss", "removeAutoDismissMsg", "changePropertyFromBpm", "currentSportTime", "", "bpm", "currentValue", "getBpmAverage", StepsInfo.KEY_STAGE, "hasAbnormalHr", "deviceLinked", "initLineChart", "courseDetail", "Lcom/mi/health/course/export/data/HrCourseConfigModel$HrConfigDetail;", "removeMsg", "onCleared", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCourseHeartRateVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseHeartRateVM.kt\ncom/mi/health/course/vm/CourseHeartRateVM\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,379:1\n1863#2,2:380\n1863#2,2:382\n1863#2,2:384\n1863#2,2:386\n1863#2,2:388\n*S KotlinDebug\n*F\n+ 1 CourseHeartRateVM.kt\ncom/mi/health/course/vm/CourseHeartRateVM\n*L\n143#1:380,2\n212#1:382,2\n228#1:384,2\n258#1:386,2\n298#1:388,2\n*E\n"})
public final class CourseHeartRateVM extends CourseBasePlayerVM {
    private int firstAddSpeedBpm;
    private boolean isCourseComplete;
    private boolean isCoursePause;
    private boolean isRemoveMsg;
    private int mCurrentBpm;
    private float mCurrentValue;

    @Nullable
    private HrCourseConfigModel.HrException mHrException;
    private int numberAddSpeed;

    @Nullable
    private Function1<? super HrCourseConfigModel.HrDetailStage, Unit> stageTitleEmitter;

    @Nullable
    private Function1<? super String, Unit> toastEmitter;

    /* JADX INFO: renamed from: lineChartDataEmitter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy lineChartDataEmitter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: lr4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CourseHeartRateVM.lineChartDataEmitter_delegate$lambda$0();
        }
    });

    @NotNull
    private ArrayList<HrCourseConfigModel.HrDetailStage> hrSegmentList = new ArrayList<>();

    @NotNull
    private final Handler mHandler = new Handler(Looper.getMainLooper());

    @NotNull
    private final LinkedList<Integer> bpmList = new LinkedList<>();
    private boolean linkEnable = true;
    private boolean isShowSpeedProtectDialog = true;

    /* JADX INFO: renamed from: maxHr$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy maxHr = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: mr4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(CourseHeartRateVM.maxHr_delegate$lambda$1());
        }
    });

    @NotNull
    private final Runnable dialogDismissRunnable = new Runnable() { // from class: nr4
        @Override // java.lang.Runnable
        public final void run() {
            CourseHeartRateVM.dialogDismissRunnable$lambda$2(this.f28280a);
        }
    };

    private final void bpmAudio(int type, int time) {
        int identifier;
        if (this.linkEnable) {
            if (type == 1) {
                int iNextInt = new Random().nextInt(3) + 1;
                identifier = ApplicationExtKt.getApplication().getResources().getIdentifier("course_during_bpm" + iNextInt, "raw", ApplicationExtKt.getApplication().getPackageName());
            } else if (type == 2) {
                int iNextInt2 = new Random().nextInt(4) + 1;
                identifier = ApplicationExtKt.getApplication().getResources().getIdentifier("course_less_bpm" + iNextInt2, "raw", ApplicationExtKt.getApplication().getPackageName());
            } else if (type != 3) {
                identifier = type != 4 ? 0 : ApplicationExtKt.getApplication().getResources().getIdentifier("course_hr_complete", "raw", ApplicationExtKt.getApplication().getPackageName());
            } else {
                int iNextInt3 = new Random().nextInt(3) + 1;
                identifier = ApplicationExtKt.getApplication().getResources().getIdentifier("course_more_bpm" + iNextInt3, "raw", ApplicationExtKt.getApplication().getPackageName());
            }
            if (identifier > 0) {
                LogUtil.INSTANCE.i("CourseHeartRateVM", "bpmAudio type=" + type);
                rvn.Y(ApplicationExtKt.getApplication()).O(identifier, type == 4);
            }
        }
    }

    public static /* synthetic */ void bpmAudio$default(CourseHeartRateVM courseHeartRateVM, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        courseHeartRateVM.bpmAudio(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void changePropertyFromBpm$lambda$4$lambda$3(CourseHeartRateVM this$0, HrCourseConfigModel.HrDetailStage it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        this$0.deviceLinked(it);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0134  */
    /* JADX WARN: Code duplicated, block: B:41:0x0138  */
    /* JADX WARN: Code duplicated, block: B:44:0x014d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0152  */
    /* JADX WARN: Code duplicated, block: B:48:0x018d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0192 A[SYNTHETIC] */
    private final void deviceLinked(final HrCourseConfigModel.HrDetailStage stage) {
        int i;
        Float floatOrNull;
        float fFloatValue;
        Function1<? super String, Unit> function1;
        if (this.linkEnable && !this.isCoursePause) {
            int bpmAverage = getBpmAverage(stage);
            int minBpm = CourseExtKt.getMinBpm(stage, getMaxHr());
            int maxBpm = CourseExtKt.getMaxBpm(stage, getMaxHr());
            LogUtil logUtil = LogUtil.INSTANCE;
            logUtil.d("CourseHeartRateVM", "deviceLinked averageBpm=" + bpmAverage + "**minbpm=" + minBpm + "**maxbpm=" + maxBpm);
            List<HrCourseConfigModel.Regulation> list = stage.mRegulationList;
            if (minBpm <= bpmAverage && bpmAverage <= maxBpm) {
                this.numberAddSpeed = 0;
                logUtil.d("CourseHeartRateVM", "deviceLinked bpmAudio time=" + stage.hrStatusJudgeTime);
                bpmAudio(1, stage.hrStatusJudgeTime);
            } else if (bpmAverage < minBpm) {
                if (!hasAbnormalHr()) {
                    Intrinsics.checkNotNull(list);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        HrCourseConfigModel.Regulation regulation = (HrCourseConfigModel.Regulation) it.next();
                        int iAbs = Math.abs(bpmAverage - minBpm);
                        LogUtil logUtil2 = LogUtil.INSTANCE;
                        int i2 = regulation.minDifference;
                        int i3 = regulation.maxDifference;
                        int i4 = minBpm;
                        StringBuilder sb = new StringBuilder();
                        Iterator it2 = it;
                        sb.append("deviceLinked regulation intervalWithMinBpm=");
                        sb.append(iAbs);
                        sb.append("**minDifference=");
                        sb.append(i2);
                        sb.append("**maxDifference=");
                        sb.append(i3);
                        logUtil2.d("CourseHeartRateVM", sb.toString());
                        if (iAbs >= regulation.minDifference && iAbs < regulation.maxDifference) {
                            int i5 = this.numberAddSpeed;
                            HrCourseConfigModel.HrException hrException = this.mHrException;
                            if (i5 >= (hrException != null ? hrException.exceptionNum : 0)) {
                                int iAbs2 = Math.abs(this.mCurrentBpm - this.firstAddSpeedBpm);
                                HrCourseConfigModel.HrException hrException2 = this.mHrException;
                                if (iAbs2 <= (hrException2 != null ? hrException2.exceptionBpm : 0)) {
                                    Function1<? super String, Unit> function2 = this.toastEmitter;
                                    if (function2 != null) {
                                        function2.invoke("protect");
                                    }
                                    int i6 = this.numberAddSpeed;
                                    int i7 = this.mCurrentBpm;
                                    int i8 = this.firstAddSpeedBpm;
                                    HrCourseConfigModel.HrException hrException3 = this.mHrException;
                                    logUtil2.d("CourseHeartRateVM", "continue" + i6 + "times change value,currentBpm=" + i7 + "***firstAddSpeedBpm=" + i8 + "**interval=" + (hrException3 != null ? hrException3.exceptionBpm : 0));
                                    this.numberAddSpeed = 0;
                                } else {
                                    i = this.numberAddSpeed;
                                    if (i == 0) {
                                        this.firstAddSpeedBpm = this.mCurrentBpm;
                                    }
                                    this.numberAddSpeed = i + 1;
                                    float f = this.mCurrentValue;
                                    String value = regulation.value;
                                    Intrinsics.checkNotNullExpressionValue(value, "value");
                                    floatOrNull = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(value);
                                    if (floatOrNull != null) {
                                        fFloatValue = floatOrNull.floatValue();
                                    } else {
                                        fFloatValue = 1.0f;
                                    }
                                    float f2 = f + fFloatValue;
                                    String object = regulation.object;
                                    Intrinsics.checkNotNullExpressionValue(object, "object");
                                    changeProperty(object, f2);
                                    logUtil2.d("CourseHeartRateVM", "deviceLinked current speed=" + this.mCurrentValue + "**add speed=" + regulation.value + "**result speed=" + f2);
                                    bpmAudio$default(this, 2, 0, 2, null);
                                    function1 = this.toastEmitter;
                                    if (function1 != null) {
                                        function1.invoke("lessThan_hr");
                                    }
                                }
                            } else {
                                i = this.numberAddSpeed;
                                if (i == 0) {
                                    this.firstAddSpeedBpm = this.mCurrentBpm;
                                }
                                this.numberAddSpeed = i + 1;
                                float f3 = this.mCurrentValue;
                                String value2 = regulation.value;
                                Intrinsics.checkNotNullExpressionValue(value2, "value");
                                floatOrNull = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(value2);
                                if (floatOrNull != null) {
                                    fFloatValue = floatOrNull.floatValue();
                                } else {
                                    fFloatValue = 1.0f;
                                }
                                float f4 = f3 + fFloatValue;
                                String object2 = regulation.object;
                                Intrinsics.checkNotNullExpressionValue(object2, "object");
                                changeProperty(object2, f4);
                                logUtil2.d("CourseHeartRateVM", "deviceLinked current speed=" + this.mCurrentValue + "**add speed=" + regulation.value + "**result speed=" + f4);
                                bpmAudio$default(this, 2, 0, 2, null);
                                function1 = this.toastEmitter;
                                if (function1 != null) {
                                    function1.invoke("lessThan_hr");
                                }
                            }
                        }
                        minBpm = i4;
                        it = it2;
                    }
                }
            } else if (bpmAverage > maxBpm && !hasAbnormalHr()) {
                Intrinsics.checkNotNull(list);
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    HrCourseConfigModel.Regulation regulation2 = (HrCourseConfigModel.Regulation) it3.next();
                    int iAbs3 = Math.abs(bpmAverage - maxBpm);
                    LogUtil logUtil3 = LogUtil.INSTANCE;
                    int i9 = regulation2.minDifference;
                    int i10 = regulation2.maxDifference;
                    int i11 = bpmAverage;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it4 = it3;
                    sb2.append("deviceLinked regulation intervalWithMaxBpm=");
                    sb2.append(iAbs3);
                    sb2.append("**minDifference=");
                    sb2.append(i9);
                    sb2.append("**maxDifference=");
                    sb2.append(i10);
                    logUtil3.d("CourseHeartRateVM", sb2.toString());
                    if (iAbs3 >= regulation2.minDifference && iAbs3 <= regulation2.maxDifference) {
                        float f5 = this.mCurrentValue;
                        String value3 = regulation2.value;
                        Intrinsics.checkNotNullExpressionValue(value3, "value");
                        Float floatOrNull2 = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(value3);
                        float fFloatValue2 = f5 - (floatOrNull2 != null ? floatOrNull2.floatValue() : 1.0f);
                        logUtil3.d("CourseHeartRateVM", "deviceLinked current speed=" + this.mCurrentValue + "**reduce speed=" + regulation2.value + "**minspeed=" + stage.minSpeed);
                        if (fFloatValue2 < 1.0f) {
                            fFloatValue2 = 1.0f;
                        }
                        String object3 = regulation2.object;
                        Intrinsics.checkNotNullExpressionValue(object3, "object");
                        changeProperty(object3, fFloatValue2);
                        logUtil3.d("CourseHeartRateVM", "deviceLinked reduce speed result=" + fFloatValue2);
                        this.numberAddSpeed = 0;
                        bpmAudio$default(this, 3, 0, 2, null);
                        Function1<? super String, Unit> function3 = this.toastEmitter;
                        if (function3 != null) {
                            function3.invoke("moreThan_hr");
                        }
                    }
                    bpmAverage = i11;
                    it3 = it4;
                }
            }
        }
        this.mHandler.postDelayed(new Runnable() { // from class: or4
            @Override // java.lang.Runnable
            public final void run() {
                CourseHeartRateVM.deviceLinked$lambda$9(this.f29410a, stage);
            }
        }, stage.hrStatusJudgeTime * 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void deviceLinked$lambda$9(CourseHeartRateVM this$0, HrCourseConfigModel.HrDetailStage stage) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(stage, "$stage");
        this$0.deviceLinked(stage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dialogDismissRunnable$lambda$2(CourseHeartRateVM this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<? super String, Unit> function1 = this$0.toastEmitter;
        if (function1 != null) {
            function1.invoke("dialog_close");
        }
    }

    private final int getBpmAverage(HrCourseConfigModel.HrDetailStage stage) {
        int i = stage.bpmType;
        if (i != 1) {
            if (i != 2) {
                return 0;
            }
            Object objMax = Collections.max(this.bpmList);
            Intrinsics.checkNotNullExpressionValue(objMax, "max(...)");
            return ((Number) objMax).intValue();
        }
        Iterator<T> it = this.bpmList.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += ((Number) it.next()).intValue();
        }
        if (this.bpmList.size() > 0) {
            return iIntValue / this.bpmList.size();
        }
        return 0;
    }

    private final int getMaxHr() {
        return ((Number) this.maxHr.getValue()).intValue();
    }

    private final boolean hasAbnormalHr() {
        Iterator<T> it = this.bpmList.iterator();
        while (it.hasNext()) {
            if (((Number) it.next()).intValue() <= 0) {
                LogUtil.INSTANCE.d("CourseHeartRateVM", "Abnormal average heart rate");
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData lineChartDataEmitter_delegate$lambda$0() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int maxHr_delegate$lambda$1() {
        return new HrZone().getMaxHr();
    }

    private final void removeMsg() {
        this.mHandler.removeCallbacksAndMessages(null);
    }

    public final void changePropertyFromBpm(long currentSportTime, int bpm, float currentValue) {
        float f;
        int i;
        Object obj = null;
        int i2 = 2;
        boolean z = true;
        if (this.isCourseComplete) {
            if (this.isRemoveMsg) {
                return;
            }
            removeMsg();
            this.isRemoveMsg = true;
            bpmAudio$default(this, 4, 0, 2, null);
            LogUtil.INSTANCE.d("CourseHeartRateVM", "hr course is completed");
            return;
        }
        this.mCurrentValue = currentValue;
        this.mCurrentBpm = bpm;
        this.isCourseComplete = true;
        for (final HrCourseConfigModel.HrDetailStage hrDetailStage : this.hrSegmentList) {
            long j = hrDetailStage.startTimeMills;
            if (currentSportTime < hrDetailStage.endTimeMills && j <= currentSportTime) {
                this.isCourseComplete = false;
                CourseExtKt.addDataWithinCapacity(this.bpmList, bpm, hrDetailStage.averageHrTimeRange);
                if (!hrDetailStage.isStart) {
                    hrDetailStage.isStart = z;
                    Function1<? super HrCourseConfigModel.HrDetailStage, Unit> function1 = this.stageTitleEmitter;
                    if (function1 != null) {
                        function1.invoke(hrDetailStage);
                    }
                    LogUtil logUtil = LogUtil.INSTANCE;
                    logUtil.d("CourseHeartRateVM", "first enter " + hrDetailStage.stage);
                    this.mHandler.removeCallbacksAndMessages(obj);
                    this.mHandler.postDelayed(new Runnable() { // from class: pr4
                        @Override // java.lang.Runnable
                        public final void run() {
                            CourseHeartRateVM.changePropertyFromBpm$lambda$4$lambda$3(this.f30673a, hrDetailStage);
                        }
                    }, 60000L);
                    if (bpm != 0 || (i = hrDetailStage.stage) == z) {
                        int i3 = hrDetailStage.stage;
                        if (i3 == z) {
                            f = hrDetailStage.initSpeedMale;
                        } else if (i3 != i2) {
                            f = i3 != 3 ? 0.0f : this.mCurrentValue + hrDetailStage.initSpeedMale;
                        } else if (CourseExtKt.isSexMale()) {
                            f = hrDetailStage.initSpeedMale;
                            if (currentValue >= f) {
                                f = this.mCurrentValue;
                            }
                        } else {
                            f = hrDetailStage.initSpeedFemale;
                            if (currentValue >= f) {
                                f = this.mCurrentValue;
                            }
                        }
                        rvn.Y(ApplicationExtKt.getApplication()).P(hrDetailStage.stage, hrDetailStage.duration, CourseExtKt.getMinBpm(hrDetailStage, getMaxHr()), CourseExtKt.getMaxBpm(hrDetailStage, getMaxHr()));
                        if (this.linkEnable) {
                            if (f < 1.0f) {
                                f = 1.0f;
                            }
                            changeProperty("speed", f);
                        }
                        logUtil.d("CourseHeartRateVM", "set stage result speed=" + f + "**currentSpeed=" + this.mCurrentValue + "**initSpeedMale=" + hrDetailStage.initSpeedMale + "**initSpeedFemale=" + hrDetailStage.initSpeedFemale + "**linkenable=" + this.linkEnable);
                    } else {
                        logUtil.d("CourseHeartRateVM", "bpm 0 and stage=" + i);
                    }
                }
                if (this.isShowSpeedProtectDialog) {
                    float f2 = this.mCurrentValue;
                    HrCourseConfigModel.HrException hrException = this.mHrException;
                    if (f2 >= (hrException != null ? hrException.maxSpeed : 0.0f)) {
                        int minBpm = CourseExtKt.getMinBpm(hrDetailStage, getMaxHr());
                        if (bpm > CourseExtKt.getMaxBpm(hrDetailStage, getMaxHr()) || minBpm > bpm) {
                            this.isShowSpeedProtectDialog = false;
                            Function1<? super String, Unit> function2 = this.toastEmitter;
                            if (function2 != null) {
                                function2.invoke("speed_protect");
                            }
                            LogUtil logUtil2 = LogUtil.INSTANCE;
                            HrCourseConfigModel.HrException hrException2 = this.mHrException;
                            logUtil2.d("CourseHeartRateVM", "reach " + (hrException2 != null ? hrException2.maxSpeed : 0.0f) + ",still not in the target range");
                        }
                    }
                }
            }
            obj = null;
            i2 = 2;
            z = true;
        }
    }

    public final int getFirstAddSpeedBpm() {
        return this.firstAddSpeedBpm;
    }

    @NotNull
    public final MutableLiveData<LinechartViewProperty> getLineChartDataEmitter() {
        return (MutableLiveData) this.lineChartDataEmitter.getValue();
    }

    public final boolean getLinkEnable() {
        return this.linkEnable;
    }

    public final int getMCurrentBpm() {
        return this.mCurrentBpm;
    }

    public final float getMCurrentValue() {
        return this.mCurrentValue;
    }

    public final int getNumberAddSpeed() {
        return this.numberAddSpeed;
    }

    public final void initLineChart(@Nullable HrCourseConfigModel.HrConfigDetail courseDetail) {
        if (courseDetail == null) {
            return;
        }
        this.hrSegmentList.addAll(courseDetail.mDetailList);
        this.mHrException = courseDetail.mHrException;
        ArrayList arrayList = new ArrayList();
        int size = this.hrSegmentList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            HrCourseConfigModel.HrDetailStage hrDetailStage = this.hrSegmentList.get(i2);
            Intrinsics.checkNotNullExpressionValue(hrDetailStage, "get(...)");
            HrCourseConfigModel.HrDetailStage hrDetailStage2 = hrDetailStage;
            hrDetailStage2.startTimeMills = i * 60000;
            int i3 = hrDetailStage2.duration;
            float f = i;
            float minBpm = CourseExtKt.getMinBpm(hrDetailStage2, getMaxHr());
            arrayList.add(new LinechartDataEntity(f, minBpm));
            LogUtil logUtil = LogUtil.INSTANCE;
            logUtil.i("CourseHeartRateVM", "initLineChart add data x=" + f + "**y=" + minBpm + "**minPercent=" + hrDetailStage2.minHrPercent + "**minBpm=" + CourseExtKt.getMinBpm(hrDetailStage2, getMaxHr()));
            i += i3;
            hrDetailStage2.endTimeMills = (long) (60000 * i);
            float f2 = (float) i;
            float maxBpm = (float) CourseExtKt.getMaxBpm(hrDetailStage2, getMaxHr());
            arrayList.add(new LinechartDataEntity(f2, maxBpm));
            logUtil.i("CourseHeartRateVM", "initLineChart add data x=" + f2 + "**y=" + maxBpm + "**minPercent=" + hrDetailStage2.maxHrPercent + "**maxBpm=" + CourseExtKt.getMaxBpm(hrDetailStage2, getMaxHr()));
        }
        LinechartViewProperty linechartViewProperty = new LinechartViewProperty(arrayList, null, i, 2, null);
        LogUtil.INSTANCE.i("CourseHeartRateVM", "initRecommendSpeed linechart maxValueX=" + i);
        getLineChartDataEmitter().setValue(linechartViewProperty);
    }

    /* JADX INFO: renamed from: isCoursePause, reason: from getter */
    public final boolean getIsCoursePause() {
        return this.isCoursePause;
    }

    /* JADX INFO: renamed from: isShowSpeedProtectDialog, reason: from getter */
    public final boolean getIsShowSpeedProtectDialog() {
        return this.isShowSpeedProtectDialog;
    }

    @Override // com.mi.health.course.vm.CourseBasePlayerVM, defpackage.dvq
    public void onCleared() {
        super.onCleared();
        removeMsg();
    }

    public final void protectDialogDismiss() {
        LogUtil.INSTANCE.d("CourseHeartRateVM", "send protectDialog dismiss (10000)s later");
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.postDelayed(this.dialogDismissRunnable, 10000L);
        }
    }

    public final void removeAutoDismissMsg() {
        this.mHandler.removeCallbacks(this.dialogDismissRunnable);
    }

    public final void setCoursePause(boolean z) {
        this.isCoursePause = z;
    }

    public final void setFirstAddSpeedBpm(int i) {
        this.firstAddSpeedBpm = i;
    }

    public final void setLinkEnable(boolean z) {
        this.linkEnable = z;
    }

    public final void setMCurrentBpm(int i) {
        this.mCurrentBpm = i;
    }

    public final void setMCurrentValue(float f) {
        this.mCurrentValue = f;
    }

    public final void setNumberAddSpeed(int i) {
        this.numberAddSpeed = i;
    }

    public final void setShowSpeedProtectDialog(boolean z) {
        this.isShowSpeedProtectDialog = z;
    }

    public final void setStageTitleListener(@NotNull Function1<? super HrCourseConfigModel.HrDetailStage, Unit> lister) {
        Intrinsics.checkNotNullParameter(lister, "lister");
        this.stageTitleEmitter = lister;
    }

    public final void setToastListener(@NotNull Function1<? super String, Unit> lister) {
        Intrinsics.checkNotNullParameter(lister, "lister");
        this.toastEmitter = lister;
    }
}
