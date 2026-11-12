package com.xiaomi.fitness.health.sleep.rhythm.diary;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.health.connect.client.records.OvulationTestRecord;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.mibi.sdk.component.params.SdkContants;
import com.miui.tsmclient.util.StringUtils;
import com.xiaomi.fit.fitness.export.data.project.SleepDiaryReport;
import com.xiaomi.fit.fitness.export.data.project.SleepMedicationDetail;
import com.xiaomi.fit.fitness.export.data.project.SleepNapSituation;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.baseui.widget.NumberPickerView;
import com.xiaomi.fitness.common.dialog.HourMinutePickerDialog;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.health.sleep.rhythm.diary.SleepDiaryUpdateFragment;
import com.xiaomi.fitness.health.sleep.rhythm.view.PickSleepTimeDialog;
import com.xiaomi.fitness.util.ExtUtilKt;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;
import defpackage.av6;
import defpackage.c0j;
import defpackage.eri;
import defpackage.h62;
import defpackage.ili;
import defpackage.jui;
import defpackage.pni;
import defpackage.qxi;
import defpackage.sba;
import defpackage.yaa;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0002cbB\u0007¢\u0006\u0004\ba\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u0007J\u000f\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0007J\u000f\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0007J\u000f\u0010\u0012\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0007J\u000f\u0010\u0013\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0007J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016JA\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u001f\u0010 J/\u0010%\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u0019H\u0002¢\u0006\u0004\b%\u0010&J/\u0010,\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020'2\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010)2\u0006\u0010+\u001a\u00020\u0019H\u0002¢\u0006\u0004\b,\u0010-J\u001d\u00100\u001a\u00020\u00052\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00050.H\u0002¢\u0006\u0004\b0\u00101J!\u00106\u001a\u00020\u00052\u0006\u00103\u001a\u0002022\b\u00105\u001a\u0004\u0018\u000104H\u0016¢\u0006\u0004\b6\u00107J\u0013\u00108\u001a\u00020\u0005*\u00020\u0003H\u0016¢\u0006\u0004\b8\u00109J'\u0010<\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00192\u0006\u0010:\u001a\u00020\u00192\u0006\u0010;\u001a\u000204H\u0016¢\u0006\u0004\b<\u0010=J)\u0010?\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00192\u0006\u0010:\u001a\u00020\u00192\b\u0010;\u001a\u0004\u0018\u00010>H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u001eH\u0016¢\u0006\u0004\bA\u0010BR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00190C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001b\u0010K\u001a\u00020F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001b\u0010P\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010H\u001a\u0004\bN\u0010OR\u001b\u0010U\u001a\u00020Q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010H\u001a\u0004\bS\u0010TR\u001b\u0010Z\u001a\u00020V8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010H\u001a\u0004\bX\u0010YR\u001b\u0010]\u001a\u00020V8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b[\u0010H\u001a\u0004\b\\\u0010YR\u0016\u0010^\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010`R\u0016\u0010+\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010_¨\u0006d"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/diary/SleepDiaryUpdateFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/sleep/rhythm/diary/SleepDiaryUpdateViewModel;", "Lsba;", "Lyaa;", "", "onSave", "()V", "requestDiaryData", "initAddDiaryView", "Lcom/xiaomi/fit/fitness/export/data/project/SleepDiaryReport;", "sleepDiary", "updateEditView", "(Lcom/xiaomi/fit/fitness/export/data/project/SleepDiaryReport;)V", "selectSleepInDayTime", "selectWakeUpInNightTime", "selectLightOffToSleepTime", "selectInDayWakeUpTime", "selectInDayGetUpTime", "selectReadyToSleepTime", "", "getYearRange", "()[J", "", "readySleepTime", "", "toSleepDurationTime", "wakeUpTimeInNight", "wakeUpTime", "getUpTime", "", "handleSleepTimeLimit", "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;)Z", "hour", "minute", "time", AccountInteractActivity.KEY_REQUEST_CODE, "dealTimeResult", "(IIJI)V", "Lcom/xiaomi/fit/fitness/export/data/project/SleepNapSituation;", "needUpdateSleepInDayTime", "", "currentList", "needUpdateSleepInDayTimeIndex", "handleNapSituationList", "(Lcom/xiaomi/fit/fitness/export/data/project/SleepNapSituation;Ljava/util/List;I)Z", "Lkotlin/Function0;", OvulationTestRecord.Result.POSITIVE, "showRecordDeleteRemindDialog", "(Lkotlin/jvm/functions/Function0;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", SdkContants.KEY_BUNDLE, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "bindView", "(Lsba;)V", "resultCode", "data", "onFragmentResult", "(IILandroid/os/Bundle;)V", "Landroid/content/Intent;", "onActivityResult", "(IILandroid/content/Intent;)V", "onBackPressed", "()Z", "", "minuteRange", "Ljava/util/List;", "Lcom/xiaomi/fitness/health/sleep/rhythm/diary/SleepDiaryMedicationAdapter;", "mSleepDiaryMedicationAdapter$delegate", "Lkotlin/Lazy;", "getMSleepDiaryMedicationAdapter", "()Lcom/xiaomi/fitness/health/sleep/rhythm/diary/SleepDiaryMedicationAdapter;", "mSleepDiaryMedicationAdapter", "Lcom/xiaomi/fitness/health/sleep/rhythm/diary/SleepDiaryWakeUpInNightAdapter;", "mSleepDiaryWakeUpInNightAdapter$delegate", "getMSleepDiaryWakeUpInNightAdapter", "()Lcom/xiaomi/fitness/health/sleep/rhythm/diary/SleepDiaryWakeUpInNightAdapter;", "mSleepDiaryWakeUpInNightAdapter", "Lcom/xiaomi/fitness/health/sleep/rhythm/diary/SleepDiarySleepInDayAdapter;", "mSleepDiarySleepInDayAdapter$delegate", "getMSleepDiarySleepInDayAdapter", "()Lcom/xiaomi/fitness/health/sleep/rhythm/diary/SleepDiarySleepInDayAdapter;", "mSleepDiarySleepInDayAdapter", "Lcom/xiaomi/fitness/health/sleep/rhythm/diary/SleepRhythmSelectItemAdapter;", "mSleepDiarySleepDifficultyAdapter$delegate", "getMSleepDiarySleepDifficultyAdapter", "()Lcom/xiaomi/fitness/health/sleep/rhythm/diary/SleepRhythmSelectItemAdapter;", "mSleepDiarySleepDifficultyAdapter", "mSleepDiarySleepFeelAdapter$delegate", "getMSleepDiarySleepFeelAdapter", "mSleepDiarySleepFeelAdapter", "needUpdateWakeUpInNightFromListIndex", "I", "Lcom/xiaomi/fit/fitness/export/data/project/SleepNapSituation;", "<init>", "Companion", "SpaceItemDecoration", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSleepDiaryUpdateFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepDiaryUpdateFragment.kt\ncom/xiaomi/fitness/health/sleep/rhythm/diary/SleepDiaryUpdateFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1116:1\n1863#2,2:1117\n1863#2,2:1119\n1872#2,3:1121\n*S KotlinDebug\n*F\n+ 1 SleepDiaryUpdateFragment.kt\ncom/xiaomi/fitness/health/sleep/rhythm/diary/SleepDiaryUpdateFragment\n*L\n663#1:1117,2\n813#1:1119,2\n1001#1:1121,3\n*E\n"})
public final class SleepDiaryUpdateFragment extends Hilt_SleepDiaryUpdateFragment<SleepDiaryUpdateViewModel, sba> implements yaa {

    @NotNull
    public static final String INTENT_REQUEST_SID = "request_sid";

    @NotNull
    public static final String INTENT_REQUEST_TIME = "request_time";
    public static final int REQUEST_IN_DAY_GET_UP_TIME = 1003;
    public static final int REQUEST_IN_DAY_SLEEP_END_TIME = 1006;
    public static final int REQUEST_IN_DAY_SLEEP_START_TIME = 1005;
    public static final int REQUEST_IN_DAY_WAKE_UP_TIME = 1002;
    public static final int REQUEST_IN_NIGHT_WAKE_UP_TIME = 1004;
    public static final int REQUEST_LIGHT_OFF_SLEEP_TIME = 1001;
    public static final int REQUEST_READY_SLEEP_TIME = 1000;

    /* JADX INFO: renamed from: mSleepDiaryMedicationAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mSleepDiaryMedicationAdapter;

    /* JADX INFO: renamed from: mSleepDiarySleepDifficultyAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mSleepDiarySleepDifficultyAdapter;

    /* JADX INFO: renamed from: mSleepDiarySleepFeelAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mSleepDiarySleepFeelAdapter;

    /* JADX INFO: renamed from: mSleepDiarySleepInDayAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mSleepDiarySleepInDayAdapter;

    /* JADX INFO: renamed from: mSleepDiaryWakeUpInNightAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mSleepDiaryWakeUpInNightAdapter;

    @NotNull
    private final List<Integer> minuteRange;

    @Nullable
    private SleepNapSituation needUpdateSleepInDayTime;
    private int needUpdateSleepInDayTimeIndex;
    private int needUpdateWakeUpInNightFromListIndex;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/diary/SleepDiaryUpdateFragment$SpaceItemDecoration;", "Lh62;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", "state", "", "getCustomItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class SpaceItemDecoration extends h62 {
        @Override // defpackage.h62
        public void getCustomItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.z state) {
            Intrinsics.checkNotNullParameter(outRect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            super.getCustomItemOffsets(outRect, view, parent, state);
            parent.getChildAdapterPosition(view);
            parent.getChildCount();
            outRect.top = AppUtil.getApp().getResources().getDimensionPixelSize(ili.c);
        }
    }

    public SleepDiaryUpdateFragment() {
        super(jui.M0);
        this.minuteRange = new ArrayList();
        this.mSleepDiaryMedicationAdapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: wkm
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SleepDiaryUpdateFragment.mSleepDiaryMedicationAdapter_delegate$lambda$0(this.f38071a);
            }
        });
        this.mSleepDiaryWakeUpInNightAdapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: blm
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SleepDiaryUpdateFragment.mSleepDiaryWakeUpInNightAdapter_delegate$lambda$1(this.f4345a);
            }
        });
        this.mSleepDiarySleepInDayAdapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: clm
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SleepDiaryUpdateFragment.mSleepDiarySleepInDayAdapter_delegate$lambda$2(this.f5462a);
            }
        });
        this.mSleepDiarySleepDifficultyAdapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: dlm
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SleepDiaryUpdateFragment.mSleepDiarySleepDifficultyAdapter_delegate$lambda$3(this.f15663a);
            }
        });
        this.mSleepDiarySleepFeelAdapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: elm
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SleepDiaryUpdateFragment.mSleepDiarySleepFeelAdapter_delegate$lambda$4(this.f16777a);
            }
        });
        this.needUpdateWakeUpInNightFromListIndex = -1;
        this.needUpdateSleepInDayTimeIndex = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ sba access$getMBinding(SleepDiaryUpdateFragment sleepDiaryUpdateFragment) {
        return (sba) sleepDiaryUpdateFragment.getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ SleepDiaryUpdateViewModel access$getMViewModel(SleepDiaryUpdateFragment sleepDiaryUpdateFragment) {
        return (SleepDiaryUpdateViewModel) sleepDiaryUpdateFragment.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$10(SleepDiaryUpdateFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.selectInDayGetUpTime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindView$lambda$11(SleepDiaryUpdateFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bundle bundle = new Bundle();
        bundle.putInt(SleepDiaryMedicationUpdateFragment.INTENT_REQUEST_ACTION_INDEX, -1);
        Long preSleepRoutineTime = ((SleepDiaryUpdateViewModel) this$0.getMViewModel()).getUpdateSleepDiaryInfo().getPreSleepRoutineTime();
        if (preSleepRoutineTime != null) {
            bundle.putLong(SleepDiaryMedicationUpdateFragment.INTENT_REQUEST_DATA_SLEEP_TIME, preSleepRoutineTime.longValue());
        }
        bundle.putLong(SleepDiaryMedicationUpdateFragment.INTENT_REQUEST_DATA_DIARY_TIME, ((SleepDiaryUpdateViewModel) this$0.getMViewModel()).getUpdateSleepDiaryInfo().getTime());
        BaseFragmentExKt.gotoPageForResult(this$0, (Class<?>) SleepDiaryMedicationUpdateFragment.class, bundle, 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$12(SleepDiaryUpdateFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.needUpdateWakeUpInNightFromListIndex = -1;
        this$0.selectWakeUpInNightTime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$13(SleepDiaryUpdateFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.needUpdateSleepInDayTimeIndex = -1;
        this$0.selectSleepInDayTime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$7(SleepDiaryUpdateFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.selectReadyToSleepTime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$8(SleepDiaryUpdateFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.selectLightOffToSleepTime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$9(SleepDiaryUpdateFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.selectInDayWakeUpTime();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void dealTimeResult(int hour, int minute, long time, int requestCode) {
        List<Integer> arrayList;
        Long lValueOf;
        SleepNapSituation sleepNapSituation;
        List<SleepNapSituation> arrayList2;
        SleepDiaryUpdateFragment sleepDiaryUpdateFragment = this;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time != 0 ? time : System.currentTimeMillis());
        calendar.set(11, hour);
        calendar.set(12, minute);
        if (requestCode == 1000 || requestCode == 1005 || requestCode == 1006) {
            SleepDiaryHandle sleepDiaryHandle = SleepDiaryHandle.INSTANCE;
            long j = 1000;
            if (sleepDiaryHandle.isLimitSelectDay(time, ((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().getTime() * j)) {
                String date = TimeUtils.formatDate("MM/dd", Long.valueOf(sleepDiaryHandle.getLastDayZeroTime(((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().getTime() * j)));
                String date2 = TimeUtils.formatDate("MM/dd", Long.valueOf(((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().getTime() * j));
                FragmentActivity mActivity = getMActivity();
                if (mActivity != null) {
                    String string = sleepDiaryUpdateFragment.getString(c0j.bc, date, date2);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    ToastExtKt.toastShort(mActivity, string);
                    return;
                }
                return;
            }
        }
        if (requestCode == 1002 || requestCode == 1003) {
            long j2 = 1000;
            if (SleepDiaryHandle.INSTANCE.isLimitSelectCurrentDay(time, ((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().getTime() * j2)) {
                String date3 = TimeUtils.formatDate("MM/dd", Long.valueOf(((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().getTime() * j2));
                FragmentActivity mActivity2 = getMActivity();
                if (mActivity2 != null) {
                    String string2 = getString(c0j.ac, date3);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    ToastExtKt.toastShort(mActivity2, string2);
                    return;
                }
                return;
            }
            sleepDiaryUpdateFragment = this;
        }
        boolean z = false;
        switch (requestCode) {
            case 1000:
                long j3 = 1000;
                if (!handleSleepTimeLimit(Long.valueOf(calendar.getTimeInMillis() / j3), null, null, null, null)) {
                    long timeInMillis = calendar.getTimeInMillis() / j3;
                    List<SleepMedicationDetail> medicationBeforeBedtime = ((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().getMedicationBeforeBedtime();
                    if (medicationBeforeBedtime != null) {
                        Iterator<T> it = medicationBeforeBedtime.iterator();
                        while (it.hasNext()) {
                            if (((SleepMedicationDetail) it.next()).getMedicationSchedule() >= calendar.getTimeInMillis() / j3) {
                                FragmentActivity mActivity3 = getMActivity();
                                if (mActivity3 != null) {
                                    ToastExtKt.toastShort(mActivity3, c0j.R9);
                                }
                                z = true;
                            }
                        }
                        if (z) {
                        }
                    }
                    ((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().setPreSleepRoutineTime(Long.valueOf(calendar.getTimeInMillis() / j3));
                    ((sba) getMBinding()).L.setRemindText(TimeUtils.formatDate("MM/dd HH:mm", Long.valueOf(calendar.getTimeInMillis())));
                    break;
                }
                break;
            case 1001:
                int i = (hour * 60) + minute;
                if (!handleSleepTimeLimit(null, Integer.valueOf(i), null, null, null)) {
                    ((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().setFallAsleepDuration(Integer.valueOf(i));
                    RightArrowSingleLineTextView rightArrowSingleLineTextView = ((sba) getMBinding()).J;
                    Resources resources = getResources();
                    int i2 = qxi.R1;
                    Integer fallAsleepDuration = ((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().getFallAsleepDuration();
                    int iIntValue = fallAsleepDuration != null ? fallAsleepDuration.intValue() : 0;
                    Object[] objArr = new Object[1];
                    Integer fallAsleepDuration2 = ((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().getFallAsleepDuration();
                    objArr[0] = Integer.valueOf(fallAsleepDuration2 != null ? fallAsleepDuration2.intValue() : 0);
                    rightArrowSingleLineTextView.setRemindText(resources.getQuantityString(i2, iIntValue, objArr));
                    break;
                }
                break;
            case 1002:
                long j4 = 1000;
                if (!handleSleepTimeLimit(null, null, null, Long.valueOf(calendar.getTimeInMillis() / j4), null)) {
                    ((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().setMorningWakeUpTime(Long.valueOf(calendar.getTimeInMillis() / j4));
                    ((sba) getMBinding()).I.setRemindText(TimeUtils.formatDate("MM/dd HH:mm", Long.valueOf(calendar.getTimeInMillis())));
                    break;
                }
                break;
            case 1003:
                long j5 = 1000;
                if (!handleSleepTimeLimit(null, null, null, null, Long.valueOf(calendar.getTimeInMillis() / j5))) {
                    ((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().setMorningGettingUpTime(Long.valueOf(calendar.getTimeInMillis() / j5));
                    ((sba) getMBinding()).H.setRemindText(TimeUtils.formatDate("MM/dd HH:mm", Long.valueOf(calendar.getTimeInMillis())));
                    break;
                }
                break;
            case 1004:
                int i3 = (hour * 60) + minute;
                if (!handleSleepTimeLimit(null, null, Integer.valueOf(i3), null, null)) {
                    List<Integer> fallAsleepAgainDuration = ((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().getFallAsleepAgainDuration();
                    if (fallAsleepAgainDuration == null || (arrayList = CollectionsKt___CollectionsKt.toMutableList((Collection) fallAsleepAgainDuration)) == null) {
                        arrayList = new ArrayList<>();
                    }
                    int i4 = sleepDiaryUpdateFragment.needUpdateWakeUpInNightFromListIndex;
                    if (i4 == -1) {
                        arrayList.add(Integer.valueOf(i3));
                    } else {
                        arrayList.set(i4, Integer.valueOf(i3));
                    }
                    SleepDiaryReport updateSleepDiaryInfo = ((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo();
                    updateSleepDiaryInfo.setFallAsleepAgainDuration(arrayList);
                    ((SleepDiaryUpdateViewModel) getMViewModel()).setUpdateSleepDiaryInfo(updateSleepDiaryInfo);
                    getMSleepDiaryWakeUpInNightAdapter().updateDataList(CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList));
                    if (!arrayList.isEmpty()) {
                        RecyclerView wakeUpRv = ((sba) getMBinding()).Y;
                        Intrinsics.checkNotNullExpressionValue(wakeUpRv, "wakeUpRv");
                        ExtUtilKt.visible(wakeUpRv);
                    } else {
                        RecyclerView wakeUpRv2 = ((sba) getMBinding()).Y;
                        Intrinsics.checkNotNullExpressionValue(wakeUpRv2, "wakeUpRv");
                        ExtUtilKt.gone(wakeUpRv2);
                    }
                    break;
                }
                break;
            case 1005:
                if (sleepDiaryUpdateFragment.needUpdateSleepInDayTimeIndex == -1) {
                    lValueOf = null;
                } else {
                    List<SleepNapSituation> napSituation = ((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().getNapSituation();
                    Intrinsics.checkNotNull(napSituation);
                    lValueOf = Long.valueOf(napSituation.get(sleepDiaryUpdateFragment.needUpdateSleepInDayTimeIndex).getWakeUpTime());
                }
                long j6 = 1000;
                long currentLastDaySleepOrMedicationTime = SleepDiaryHandle.INSTANCE.toCurrentLastDaySleepOrMedicationTime(lValueOf, ((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().getTime() * j6);
                if (sleepDiaryUpdateFragment.needUpdateSleepInDayTimeIndex == -1) {
                    sleepNapSituation = new SleepNapSituation(calendar.getTimeInMillis() / j6, 0L);
                } else {
                    long timeInMillis2 = calendar.getTimeInMillis() / j6;
                    List<SleepNapSituation> napSituation2 = ((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().getNapSituation();
                    Intrinsics.checkNotNull(napSituation2);
                    sleepNapSituation = new SleepNapSituation(timeInMillis2, napSituation2.get(sleepDiaryUpdateFragment.needUpdateSleepInDayTimeIndex).getWakeUpTime());
                }
                sleepDiaryUpdateFragment.needUpdateSleepInDayTime = sleepNapSituation;
                int i5 = Integer.parseInt(TimeUtils.formatDate("HH", Long.valueOf(currentLastDaySleepOrMedicationTime)));
                int i6 = Integer.parseInt(TimeUtils.formatDate("mm", Long.valueOf(currentLastDaySleepOrMedicationTime)));
                View viewInflate = getLayoutInflater().inflate(jui.L7, (ViewGroup) null);
                PickSleepTimeDialog pickSleepTimeDialogCreate = new PickSleepTimeDialog.Builder("hm").setCustomView(viewInflate).setPositiveText(c0j.J7).setNegativeText(c0j.D7).setCancelable(false).setDialogTitle(new DialogParams.DialogDescriptionString(c0j.jf, new Object[0])).create();
                if (pickSleepTimeDialogCreate != null) {
                    pickSleepTimeDialogCreate.showIfNeed(getChildFragmentManager());
                }
                Intrinsics.checkNotNull(pickSleepTimeDialogCreate);
                pickSleepTimeDialogCreate.setRequestCode(1006);
                pickSleepTimeDialogCreate.setRange(getYearRange(), currentLastDaySleepOrMedicationTime);
                pickSleepTimeDialogCreate.setMinuteData(CollectionsKt___CollectionsKt.toIntArray(sleepDiaryUpdateFragment.minuteRange));
                Intrinsics.checkNotNull(viewInflate);
                View viewFindViewById = viewInflate.findViewById(eri.M3);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                NumberPickerView numberPickerView = (NumberPickerView) viewFindViewById;
                View viewFindViewById2 = viewInflate.findViewById(eri.N3);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
                View viewFindViewById3 = viewInflate.findViewById(eri.Pk);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
                pickSleepTimeDialogCreate.setValue(numberPickerView, (NumberPickerView) viewFindViewById2, (TextView) viewFindViewById3, i5, i6, currentLastDaySleepOrMedicationTime);
                break;
            case 1006:
                SleepNapSituation sleepNapSituation2 = sleepDiaryUpdateFragment.needUpdateSleepInDayTime;
                Intrinsics.checkNotNull(sleepNapSituation2);
                long j7 = 1000;
                if (sleepNapSituation2.getBedtime() < calendar.getTimeInMillis() / j7) {
                    SleepNapSituation sleepNapSituation3 = sleepDiaryUpdateFragment.needUpdateSleepInDayTime;
                    Intrinsics.checkNotNull(sleepNapSituation3);
                    sleepDiaryUpdateFragment.needUpdateSleepInDayTime = new SleepNapSituation(sleepNapSituation3.getBedtime(), calendar.getTimeInMillis() / j7);
                    List<SleepNapSituation> napSituation3 = ((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().getNapSituation();
                    if (napSituation3 == null || (arrayList2 = CollectionsKt___CollectionsKt.toMutableList((Collection) napSituation3)) == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    SleepNapSituation sleepNapSituation4 = sleepDiaryUpdateFragment.needUpdateSleepInDayTime;
                    Intrinsics.checkNotNull(sleepNapSituation4);
                    if (!sleepDiaryUpdateFragment.handleNapSituationList(sleepNapSituation4, arrayList2, sleepDiaryUpdateFragment.needUpdateSleepInDayTimeIndex)) {
                        int i7 = sleepDiaryUpdateFragment.needUpdateSleepInDayTimeIndex;
                        if (i7 == -1) {
                            ListExtKt.add(arrayList2, sleepDiaryUpdateFragment.needUpdateSleepInDayTime);
                        } else {
                            SleepNapSituation sleepNapSituation5 = sleepDiaryUpdateFragment.needUpdateSleepInDayTime;
                            Intrinsics.checkNotNull(sleepNapSituation5);
                            arrayList2.set(i7, sleepNapSituation5);
                        }
                        ((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().setNapSituation(arrayList2);
                        getMSleepDiarySleepInDayAdapter().updateDataList(arrayList2);
                        if (!arrayList2.isEmpty()) {
                            RecyclerView sleepInDayRv = ((sba) getMBinding()).U;
                            Intrinsics.checkNotNullExpressionValue(sleepInDayRv, "sleepInDayRv");
                            ExtUtilKt.visible(sleepInDayRv);
                        } else {
                            RecyclerView sleepInDayRv2 = ((sba) getMBinding()).U;
                            Intrinsics.checkNotNullExpressionValue(sleepInDayRv2, "sleepInDayRv");
                            ExtUtilKt.gone(sleepInDayRv2);
                        }
                    } else {
                        FragmentActivity mActivity4 = getMActivity();
                        if (mActivity4 != null) {
                            String string3 = sleepDiaryUpdateFragment.getString(c0j.of);
                            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                            ToastExtKt.toastShort(mActivity4, string3);
                        }
                    }
                } else {
                    FragmentActivity mActivity5 = getMActivity();
                    if (mActivity5 != null) {
                        String string4 = sleepDiaryUpdateFragment.getString(c0j.pf);
                        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                        ToastExtKt.toastShort(mActivity5, string4);
                    }
                }
                break;
        }
    }

    private final SleepDiaryMedicationAdapter getMSleepDiaryMedicationAdapter() {
        return (SleepDiaryMedicationAdapter) this.mSleepDiaryMedicationAdapter.getValue();
    }

    private final SleepRhythmSelectItemAdapter getMSleepDiarySleepDifficultyAdapter() {
        return (SleepRhythmSelectItemAdapter) this.mSleepDiarySleepDifficultyAdapter.getValue();
    }

    private final SleepRhythmSelectItemAdapter getMSleepDiarySleepFeelAdapter() {
        return (SleepRhythmSelectItemAdapter) this.mSleepDiarySleepFeelAdapter.getValue();
    }

    private final SleepDiarySleepInDayAdapter getMSleepDiarySleepInDayAdapter() {
        return (SleepDiarySleepInDayAdapter) this.mSleepDiarySleepInDayAdapter.getValue();
    }

    private final SleepDiaryWakeUpInNightAdapter getMSleepDiaryWakeUpInNightAdapter() {
        return (SleepDiaryWakeUpInNightAdapter) this.mSleepDiaryWakeUpInNightAdapter.getValue();
    }

    private final long[] getYearRange() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(1, -1);
        return new long[]{calendar.getTimeInMillis(), System.currentTimeMillis()};
    }

    private final boolean handleNapSituationList(SleepNapSituation needUpdateSleepInDayTime, List<SleepNapSituation> currentList, int needUpdateSleepInDayTimeIndex) {
        List<SleepNapSituation> list = currentList;
        if (list != null && !list.isEmpty()) {
            int i = 0;
            for (Object obj : currentList) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                SleepNapSituation sleepNapSituation = (SleepNapSituation) obj;
                if (needUpdateSleepInDayTimeIndex != i) {
                    long bedtime = sleepNapSituation.getBedtime();
                    long wakeUpTime = sleepNapSituation.getWakeUpTime();
                    long bedtime2 = needUpdateSleepInDayTime.getBedtime();
                    if (bedtime <= bedtime2 && bedtime2 <= wakeUpTime) {
                        return true;
                    }
                    long bedtime3 = sleepNapSituation.getBedtime();
                    long wakeUpTime2 = sleepNapSituation.getWakeUpTime();
                    long wakeUpTime3 = needUpdateSleepInDayTime.getWakeUpTime();
                    if (bedtime3 <= wakeUpTime3 && wakeUpTime3 <= wakeUpTime2) {
                        return true;
                    }
                }
                i = i2;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean handleSleepTimeLimit(Long readySleepTime, Integer toSleepDurationTime, Integer wakeUpTimeInNight, Long wakeUpTime, Long getUpTime) {
        int iIntValue;
        Long preSleepRoutineTime = readySleepTime == null ? ((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().getPreSleepRoutineTime() : readySleepTime;
        if (toSleepDurationTime != null) {
            iIntValue = toSleepDurationTime.intValue();
        } else {
            Integer fallAsleepDuration = ((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().getFallAsleepDuration();
            iIntValue = fallAsleepDuration != null ? fallAsleepDuration.intValue() : 0;
        }
        List<Integer> fallAsleepAgainDuration = ((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().getFallAsleepAgainDuration();
        if (fallAsleepAgainDuration == null) {
            fallAsleepAgainDuration = new ArrayList<>();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(fallAsleepAgainDuration);
        if (wakeUpTimeInNight != null) {
            if (this.needUpdateWakeUpInNightFromListIndex == -1) {
                arrayList.add(wakeUpTimeInNight);
            } else {
                CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList).set(this.needUpdateWakeUpInNightFromListIndex, wakeUpTimeInNight);
            }
        }
        Iterator it = arrayList.iterator();
        int iIntValue2 = 0;
        while (it.hasNext()) {
            iIntValue2 += ((Number) it.next()).intValue();
        }
        Long morningWakeUpTime = wakeUpTime == null ? ((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().getMorningWakeUpTime() : wakeUpTime;
        Long morningGettingUpTime = getUpTime == null ? ((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().getMorningGettingUpTime() : getUpTime;
        if ((readySleepTime == null && toSleepDurationTime == null && wakeUpTimeInNight == null) || preSleepRoutineTime == null) {
            iIntValue = iIntValue;
        } else {
            long jLongValue = preSleepRoutineTime.longValue() + ((long) (iIntValue * 60));
            long j = ((long) (iIntValue2 * 60)) + jLongValue;
            if (morningWakeUpTime != null) {
                if (morningWakeUpTime.longValue() < jLongValue) {
                    FragmentActivity mActivity = getMActivity();
                    if (mActivity != null) {
                        String string = getString(c0j.qf);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        ToastExtKt.toastShort(mActivity, string);
                    }
                    return true;
                }
                if (morningWakeUpTime.longValue() < j) {
                    FragmentActivity mActivity2 = getMActivity();
                    if (mActivity2 != null) {
                        String string2 = getString(c0j.sf);
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        ToastExtKt.toastShort(mActivity2, string2);
                    }
                    return true;
                }
                if (morningWakeUpTime.longValue() - jLongValue >= TimeUtils.INSTANCE.getTIME_ONE_DAY_IN_MILLIS() / ((long) 1000)) {
                    FragmentActivity mActivity3 = getMActivity();
                    if (mActivity3 != null) {
                        String string3 = getString(c0j.rf);
                        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                        ToastExtKt.toastShort(mActivity3, string3);
                    }
                    return true;
                }
            }
            if (morningGettingUpTime != null) {
                if (morningGettingUpTime.longValue() < jLongValue) {
                    FragmentActivity mActivity4 = getMActivity();
                    if (mActivity4 != null) {
                        String string4 = getString(c0j.qf);
                        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                        ToastExtKt.toastShort(mActivity4, string4);
                    }
                    return true;
                }
                if (morningGettingUpTime.longValue() < j) {
                    FragmentActivity mActivity5 = getMActivity();
                    if (mActivity5 != null) {
                        String string5 = getString(c0j.sf);
                        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                        ToastExtKt.toastShort(mActivity5, string5);
                    }
                    return true;
                }
                if (morningGettingUpTime.longValue() - jLongValue >= TimeUtils.INSTANCE.getTIME_ONE_DAY_IN_MILLIS() / ((long) 1000)) {
                    FragmentActivity mActivity6 = getMActivity();
                    if (mActivity6 != null) {
                        String string6 = getString(c0j.rf);
                        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                        ToastExtKt.toastShort(mActivity6, string6);
                    }
                    return true;
                }
            }
        }
        if (wakeUpTime != null) {
            if (preSleepRoutineTime != null) {
                long jLongValue2 = preSleepRoutineTime.longValue() + ((long) (iIntValue * 60));
                long j2 = ((long) (iIntValue2 * 60)) + jLongValue2;
                if (wakeUpTime.longValue() < jLongValue2) {
                    FragmentActivity mActivity7 = getMActivity();
                    if (mActivity7 != null) {
                        String string7 = getString(c0j.pf);
                        Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                        ToastExtKt.toastShort(mActivity7, string7);
                    }
                    return true;
                }
                if (wakeUpTime.longValue() < j2) {
                    FragmentActivity mActivity8 = getMActivity();
                    if (mActivity8 != null) {
                        String string8 = getString(c0j.sf);
                        Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                        ToastExtKt.toastShort(mActivity8, string8);
                    }
                    return true;
                }
                if (wakeUpTime.longValue() - jLongValue2 >= TimeUtils.INSTANCE.getTIME_ONE_DAY_IN_MILLIS() / ((long) 1000)) {
                    FragmentActivity mActivity9 = getMActivity();
                    if (mActivity9 != null) {
                        String string9 = getString(c0j.rf);
                        Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
                        ToastExtKt.toastShort(mActivity9, string9);
                    }
                    return true;
                }
            }
            if (morningGettingUpTime != null && morningGettingUpTime.longValue() < wakeUpTime.longValue()) {
                FragmentActivity mActivity10 = getMActivity();
                if (mActivity10 != null) {
                    String string10 = getString(c0j.uf);
                    Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
                    ToastExtKt.toastShort(mActivity10, string10);
                }
                return true;
            }
        }
        if (getUpTime == null) {
            return false;
        }
        if (preSleepRoutineTime != null) {
            long jLongValue3 = preSleepRoutineTime.longValue() + ((long) (iIntValue * 60));
            long j3 = ((long) (iIntValue2 * 60)) + jLongValue3;
            if (getUpTime.longValue() < jLongValue3) {
                FragmentActivity mActivity11 = getMActivity();
                if (mActivity11 != null) {
                    String string11 = getString(c0j.pf);
                    Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
                    ToastExtKt.toastShort(mActivity11, string11);
                }
                return true;
            }
            if (getUpTime.longValue() < j3) {
                FragmentActivity mActivity12 = getMActivity();
                if (mActivity12 != null) {
                    String string12 = getString(c0j.sf);
                    Intrinsics.checkNotNullExpressionValue(string12, "getString(...)");
                    ToastExtKt.toastShort(mActivity12, string12);
                }
                return true;
            }
            if (getUpTime.longValue() - jLongValue3 >= TimeUtils.INSTANCE.getTIME_ONE_DAY_IN_MILLIS() / ((long) 1000)) {
                FragmentActivity mActivity13 = getMActivity();
                if (mActivity13 != null) {
                    String string13 = getString(c0j.rf);
                    Intrinsics.checkNotNullExpressionValue(string13, "getString(...)");
                    ToastExtKt.toastShort(mActivity13, string13);
                }
                return true;
            }
        }
        if (morningWakeUpTime == null || getUpTime.longValue() >= morningWakeUpTime.longValue()) {
            return false;
        }
        FragmentActivity mActivity14 = getMActivity();
        if (mActivity14 != null) {
            String string14 = getString(c0j.tf);
            Intrinsics.checkNotNullExpressionValue(string14, "getString(...)");
            ToastExtKt.toastShort(mActivity14, string14);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initAddDiaryView() {
        ((sba) getMBinding()).C.setRemindText(TimeDateUtil.getDateFormated(((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().getTime() * ((long) 1000), StringUtils.EXPECT_DATE_FORMAT));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SleepDiaryMedicationAdapter mSleepDiaryMedicationAdapter_delegate$lambda$0(SleepDiaryUpdateFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new SleepDiaryMedicationAdapter(new SleepDiaryUpdateFragment$mSleepDiaryMedicationAdapter$2$1(this$0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SleepRhythmSelectItemAdapter mSleepDiarySleepDifficultyAdapter_delegate$lambda$3(final SleepDiaryUpdateFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new SleepRhythmSelectItemAdapter(CollectionsKt__CollectionsKt.mutableListOf(new SleepRhythmSelectItemAdapter.SleepRhythmSelectItem(0, 1, false), new SleepRhythmSelectItemAdapter.SleepRhythmSelectItem(1, 2, false), new SleepRhythmSelectItemAdapter.SleepRhythmSelectItem(2, 3, false), new SleepRhythmSelectItemAdapter.SleepRhythmSelectItem(3, 4, false), new SleepRhythmSelectItemAdapter.SleepRhythmSelectItem(4, 5, false)), new SleepRhythmSelectItemAdapter.OnSleepItemSelectListener() { // from class: com.xiaomi.fitness.health.sleep.rhythm.diary.SleepDiaryUpdateFragment$mSleepDiarySleepDifficultyAdapter$2$1
            @Override // com.xiaomi.fitness.health.sleep.rhythm.diary.SleepRhythmSelectItemAdapter.OnSleepItemSelectListener
            public void onItemSelect(SleepRhythmSelectItemAdapter.SleepRhythmSelectItem item) {
                Intrinsics.checkNotNullParameter(item, "item");
                if (item.isSelect()) {
                    SleepDiaryUpdateFragment.access$getMViewModel(this.this$0).getUpdateSleepDiaryInfo().setInsomniaDifficulty(Integer.valueOf(item.getValue()));
                } else {
                    SleepDiaryUpdateFragment.access$getMViewModel(this.this$0).getUpdateSleepDiaryInfo().setInsomniaDifficulty(null);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SleepRhythmSelectItemAdapter mSleepDiarySleepFeelAdapter_delegate$lambda$4(final SleepDiaryUpdateFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new SleepRhythmSelectItemAdapter(CollectionsKt__CollectionsKt.mutableListOf(new SleepRhythmSelectItemAdapter.SleepRhythmSelectItem(0, 1, false), new SleepRhythmSelectItemAdapter.SleepRhythmSelectItem(1, 2, false), new SleepRhythmSelectItemAdapter.SleepRhythmSelectItem(2, 3, false), new SleepRhythmSelectItemAdapter.SleepRhythmSelectItem(3, 4, false), new SleepRhythmSelectItemAdapter.SleepRhythmSelectItem(4, 5, false)), new SleepRhythmSelectItemAdapter.OnSleepItemSelectListener() { // from class: com.xiaomi.fitness.health.sleep.rhythm.diary.SleepDiaryUpdateFragment$mSleepDiarySleepFeelAdapter$2$1
            @Override // com.xiaomi.fitness.health.sleep.rhythm.diary.SleepRhythmSelectItemAdapter.OnSleepItemSelectListener
            public void onItemSelect(SleepRhythmSelectItemAdapter.SleepRhythmSelectItem item) {
                Intrinsics.checkNotNullParameter(item, "item");
                if (item.isSelect()) {
                    SleepDiaryUpdateFragment.access$getMViewModel(this.this$0).getUpdateSleepDiaryInfo().setSleepQuality(Integer.valueOf(item.getValue()));
                } else {
                    SleepDiaryUpdateFragment.access$getMViewModel(this.this$0).getUpdateSleepDiaryInfo().setSleepQuality(null);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SleepDiarySleepInDayAdapter mSleepDiarySleepInDayAdapter_delegate$lambda$2(SleepDiaryUpdateFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new SleepDiarySleepInDayAdapter(new SleepDiaryUpdateFragment$mSleepDiarySleepInDayAdapter$2$1(this$0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SleepDiaryWakeUpInNightAdapter mSleepDiaryWakeUpInNightAdapter_delegate$lambda$1(final SleepDiaryUpdateFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new SleepDiaryWakeUpInNightAdapter(new SleepDiaryWakeUpInNightAdapter.OnSleepDiaryWakeUpInNightItemClickListener() { // from class: com.xiaomi.fitness.health.sleep.rhythm.diary.SleepDiaryUpdateFragment$mSleepDiaryWakeUpInNightAdapter$2$1
            @Override // com.xiaomi.fitness.health.sleep.rhythm.diary.SleepDiaryWakeUpInNightAdapter.OnSleepDiaryWakeUpInNightItemClickListener
            public void onItemSelectDelete(int index, List<Integer> wakeUpTimeInNight) {
                Intrinsics.checkNotNullParameter(wakeUpTimeInNight, "wakeUpTimeInNight");
                List<Integer> fallAsleepAgainDuration = SleepDiaryUpdateFragment.access$getMViewModel(this.this$0).getUpdateSleepDiaryInfo().getFallAsleepAgainDuration();
                if (fallAsleepAgainDuration != null && !fallAsleepAgainDuration.isEmpty()) {
                    SleepDiaryUpdateFragment.access$getMViewModel(this.this$0).getUpdateSleepDiaryInfo().setFallAsleepAgainDuration(wakeUpTimeInNight);
                }
                if (wakeUpTimeInNight.isEmpty()) {
                    RecyclerView wakeUpRv = SleepDiaryUpdateFragment.access$getMBinding(this.this$0).Y;
                    Intrinsics.checkNotNullExpressionValue(wakeUpRv, "wakeUpRv");
                    ExtUtilKt.gone(wakeUpRv);
                } else {
                    RecyclerView wakeUpRv2 = SleepDiaryUpdateFragment.access$getMBinding(this.this$0).Y;
                    Intrinsics.checkNotNullExpressionValue(wakeUpRv2, "wakeUpRv");
                    ExtUtilKt.visible(wakeUpRv2);
                }
            }

            @Override // com.xiaomi.fitness.health.sleep.rhythm.diary.SleepDiaryWakeUpInNightAdapter.OnSleepDiaryWakeUpInNightItemClickListener
            public void onItemSelectEdit(int index, int wakeUpTimeInNight) {
                this.this$0.needUpdateWakeUpInNightFromListIndex = index;
                this.this$0.selectWakeUpInNightTime();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onSave() {
        if (((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().getPreSleepRoutineTime() == null || ((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().getFallAsleepDuration() == null || ((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().getMorningWakeUpTime() == null || ((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().getMorningGettingUpTime() == null || ((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().getInsomniaDifficulty() == null || ((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().getSleepQuality() == null) {
            CommonDialog commonDialogCreate = new CommonDialog.c("commonDialog").setDialogTitle(c0j.Ci).setPositiveText(c0j.I7).setCanceledOnTouchOutside(false).create();
            commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.health.sleep.rhythm.diary.SleepDiaryUpdateFragment.onSave.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                }
            });
            commonDialogCreate.showIfNeed(getParentFragmentManager());
            return;
        }
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString(INTENT_REQUEST_SID) : null;
        if (string != null && string.length() != 0) {
            SleepDiaryReport updateSleepDiaryInfo = ((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo();
            Bundle arguments2 = getArguments();
            updateSleepDiaryInfo.setSid(arguments2 != null ? arguments2.getString(INTENT_REQUEST_SID) : null);
        }
        ((SleepDiaryUpdateViewModel) getMViewModel()).addSleepDiaryReport(((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo());
        Intent intent = new Intent();
        FragmentActivity mActivity = getMActivity();
        if (mActivity != null) {
            mActivity.setResult(-1, intent);
        }
        FragmentActivity mActivity2 = getMActivity();
        if (mActivity2 != null) {
            mActivity2.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$5(SleepDiaryUpdateFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onSave();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void requestDiaryData() {
        ((SleepDiaryUpdateViewModel) getMViewModel()).getLocalSleepDiaryInfo().observe(getViewLifecycleOwner(), new Observer() { // from class: glm
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepDiaryUpdateFragment.requestDiaryData$lambda$6(this.f19116a, (SleepDiaryReport) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestDiaryData$lambda$6(SleepDiaryUpdateFragment this$0, SleepDiaryReport sleepDiaryReport) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (sleepDiaryReport == null) {
            this$0.initAddDiaryView();
        } else {
            this$0.updateEditView(sleepDiaryReport);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void selectInDayGetUpTime() {
        long currentWakeOrGetUpTime = SleepDiaryHandle.INSTANCE.toCurrentWakeOrGetUpTime(((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().getMorningGettingUpTime(), ((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().getTime() * ((long) 1000));
        int i = Integer.parseInt(TimeUtils.formatDate("HH", Long.valueOf(currentWakeOrGetUpTime)));
        int i2 = Integer.parseInt(TimeUtils.formatDate("mm", Long.valueOf(currentWakeOrGetUpTime)));
        PickSleepTimeDialog pickSleepTimeDialogCreate = (PickSleepTimeDialog) getChildFragmentManager().l0("selectInDayGetUpTime");
        if (pickSleepTimeDialogCreate == null || !pickSleepTimeDialogCreate.isShowing()) {
            View viewInflate = getLayoutInflater().inflate(jui.L7, (ViewGroup) null);
            if (pickSleepTimeDialogCreate == null) {
                pickSleepTimeDialogCreate = new PickSleepTimeDialog.Builder("hm").setCustomView(viewInflate).setPositiveText(c0j.J7).setNegativeText(c0j.D7).setCancelable(false).setDialogTitle(new DialogParams.DialogDescriptionString(c0j.f1if, new Object[0])).create();
            }
            PickSleepTimeDialog pickSleepTimeDialog = pickSleepTimeDialogCreate;
            Intrinsics.checkNotNull(pickSleepTimeDialog);
            pickSleepTimeDialog.setRequestCode(1003);
            pickSleepTimeDialog.setRange(getYearRange(), currentWakeOrGetUpTime);
            pickSleepTimeDialog.setMinuteData(CollectionsKt___CollectionsKt.toIntArray(this.minuteRange));
            pickSleepTimeDialog.showIfNeed(getChildFragmentManager());
            Intrinsics.checkNotNull(viewInflate);
            View viewFindViewById = viewInflate.findViewById(eri.M3);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            NumberPickerView numberPickerView = (NumberPickerView) viewFindViewById;
            View viewFindViewById2 = viewInflate.findViewById(eri.N3);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            NumberPickerView numberPickerView2 = (NumberPickerView) viewFindViewById2;
            View viewFindViewById3 = viewInflate.findViewById(eri.Pk);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            pickSleepTimeDialog.setValue(numberPickerView, numberPickerView2, (TextView) viewFindViewById3, i, i2, currentWakeOrGetUpTime);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void selectInDayWakeUpTime() {
        long currentWakeOrGetUpTime = SleepDiaryHandle.INSTANCE.toCurrentWakeOrGetUpTime(((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().getMorningWakeUpTime(), ((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().getTime() * ((long) 1000));
        int i = Integer.parseInt(TimeUtils.formatDate("HH", Long.valueOf(currentWakeOrGetUpTime)));
        int i2 = Integer.parseInt(TimeUtils.formatDate("mm", Long.valueOf(currentWakeOrGetUpTime)));
        PickSleepTimeDialog pickSleepTimeDialogCreate = (PickSleepTimeDialog) getChildFragmentManager().l0("selectReadyToSleepTime");
        if (pickSleepTimeDialogCreate == null || !pickSleepTimeDialogCreate.isShowing()) {
            View viewInflate = getLayoutInflater().inflate(jui.L7, (ViewGroup) null);
            if (pickSleepTimeDialogCreate == null) {
                pickSleepTimeDialogCreate = new PickSleepTimeDialog.Builder("hm").setCustomView(viewInflate).setPositiveText(c0j.J7).setNegativeText(c0j.D7).setCancelable(false).setDialogTitle(new DialogParams.DialogDescriptionString(c0j.lf, new Object[0])).create();
            }
            PickSleepTimeDialog pickSleepTimeDialog = pickSleepTimeDialogCreate;
            Intrinsics.checkNotNull(pickSleepTimeDialog);
            pickSleepTimeDialog.setRequestCode(1002);
            pickSleepTimeDialog.setRange(getYearRange(), currentWakeOrGetUpTime);
            pickSleepTimeDialog.setMinuteData(CollectionsKt___CollectionsKt.toIntArray(this.minuteRange));
            pickSleepTimeDialog.showIfNeed(getChildFragmentManager());
            Intrinsics.checkNotNull(viewInflate);
            View viewFindViewById = viewInflate.findViewById(eri.M3);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            NumberPickerView numberPickerView = (NumberPickerView) viewFindViewById;
            View viewFindViewById2 = viewInflate.findViewById(eri.N3);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            NumberPickerView numberPickerView2 = (NumberPickerView) viewFindViewById2;
            View viewFindViewById3 = viewInflate.findViewById(eri.Pk);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            pickSleepTimeDialog.setValue(numberPickerView, numberPickerView2, (TextView) viewFindViewById3, i, i2, currentWakeOrGetUpTime);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void selectLightOffToSleepTime() {
        HourMinutePickerDialog hourMinutePickerDialog = (HourMinutePickerDialog) getChildFragmentManager().l0("selectLightOffToSleepTime");
        if (hourMinutePickerDialog == null || !hourMinutePickerDialog.isShowing()) {
            Integer fallAsleepDuration = ((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().getFallAsleepDuration();
            int iIntValue = fallAsleepDuration != null ? fallAsleepDuration.intValue() : 0;
            int i = iIntValue / 60;
            int i2 = iIntValue % 60;
            if (hourMinutePickerDialog == null) {
                HourMinutePickerDialog hourMinutePickerDialogCreate = new HourMinutePickerDialog.a("hm").setCustomLayoutId(jui.f7).setPositiveText(c0j.J7).setNegativeText(c0j.D7).setCancelable(false).setDialogTitle(new DialogParams.DialogDescriptionString(c0j.nf, new Object[0])).create();
                Intrinsics.checkNotNullExpressionValue(hourMinutePickerDialogCreate, "create(...)");
                hourMinutePickerDialog = hourMinutePickerDialogCreate;
            }
            hourMinutePickerDialog.B(true);
            hourMinutePickerDialog.setMinuteData(CollectionsKt___CollectionsKt.toIntArray(this.minuteRange));
            hourMinutePickerDialog.setRequestCode(1001);
            hourMinutePickerDialog.setValue(i, i2);
            hourMinutePickerDialog.showIfNeed(getChildFragmentManager());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void selectReadyToSleepTime() {
        long currentLastDaySleepOrMedicationTime = SleepDiaryHandle.INSTANCE.toCurrentLastDaySleepOrMedicationTime(((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().getPreSleepRoutineTime(), ((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().getTime() * ((long) 1000));
        int i = Integer.parseInt(TimeUtils.formatDate("HH", Long.valueOf(currentLastDaySleepOrMedicationTime)));
        int i2 = Integer.parseInt(TimeUtils.formatDate("mm", Long.valueOf(currentLastDaySleepOrMedicationTime)));
        View viewInflate = getLayoutInflater().inflate(jui.L7, (ViewGroup) null);
        PickSleepTimeDialog pickSleepTimeDialogCreate = new PickSleepTimeDialog.Builder("hm").setCustomView(viewInflate).setPositiveText(c0j.J7).setNegativeText(c0j.D7).setCancelable(false).setDialogTitle(new DialogParams.DialogDescriptionString(c0j.Kb, new Object[0])).create();
        if (pickSleepTimeDialogCreate != null) {
            pickSleepTimeDialogCreate.showIfNeed(getChildFragmentManager());
        }
        Intrinsics.checkNotNull(pickSleepTimeDialogCreate);
        pickSleepTimeDialogCreate.setRequestCode(1000);
        pickSleepTimeDialogCreate.setRange(getYearRange(), currentLastDaySleepOrMedicationTime);
        pickSleepTimeDialogCreate.setMinuteData(CollectionsKt___CollectionsKt.toIntArray(this.minuteRange));
        Intrinsics.checkNotNull(viewInflate);
        View viewFindViewById = viewInflate.findViewById(eri.M3);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        NumberPickerView numberPickerView = (NumberPickerView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(eri.N3);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        View viewFindViewById3 = viewInflate.findViewById(eri.Pk);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        pickSleepTimeDialogCreate.setValue(numberPickerView, (NumberPickerView) viewFindViewById2, (TextView) viewFindViewById3, i, i2, currentLastDaySleepOrMedicationTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void selectSleepInDayTime() {
        Long lValueOf;
        if (this.needUpdateSleepInDayTimeIndex == -1) {
            lValueOf = null;
        } else {
            List<SleepNapSituation> napSituation = ((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().getNapSituation();
            Intrinsics.checkNotNull(napSituation);
            lValueOf = Long.valueOf(napSituation.get(this.needUpdateSleepInDayTimeIndex).getBedtime());
        }
        long currentLastDaySleepOrMedicationTime = SleepDiaryHandle.INSTANCE.toCurrentLastDaySleepOrMedicationTime(lValueOf, ((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().getTime() * ((long) 1000));
        int i = Integer.parseInt(TimeUtils.formatDate("HH", Long.valueOf(currentLastDaySleepOrMedicationTime)));
        int i2 = Integer.parseInt(TimeUtils.formatDate("mm", Long.valueOf(currentLastDaySleepOrMedicationTime)));
        View viewInflate = getLayoutInflater().inflate(jui.L7, (ViewGroup) null);
        PickSleepTimeDialog pickSleepTimeDialogCreate = new PickSleepTimeDialog.Builder("hm").setCustomView(viewInflate).setPositiveText(c0j.J7).setNegativeText(c0j.D7).setCancelable(false).setDialogTitle(new DialogParams.DialogDescriptionString(c0j.kf, new Object[0])).create();
        if (pickSleepTimeDialogCreate != null) {
            pickSleepTimeDialogCreate.showIfNeed(getChildFragmentManager());
        }
        Intrinsics.checkNotNull(pickSleepTimeDialogCreate);
        pickSleepTimeDialogCreate.setRequestCode(1005);
        pickSleepTimeDialogCreate.setRange(getYearRange(), currentLastDaySleepOrMedicationTime);
        pickSleepTimeDialogCreate.setMinuteData(CollectionsKt___CollectionsKt.toIntArray(this.minuteRange));
        Intrinsics.checkNotNull(viewInflate);
        View viewFindViewById = viewInflate.findViewById(eri.M3);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        NumberPickerView numberPickerView = (NumberPickerView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(eri.N3);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        View viewFindViewById3 = viewInflate.findViewById(eri.Pk);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        pickSleepTimeDialogCreate.setValue(numberPickerView, (NumberPickerView) viewFindViewById2, (TextView) viewFindViewById3, i, i2, currentLastDaySleepOrMedicationTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void selectWakeUpInNightTime() {
        HourMinutePickerDialog hourMinutePickerDialog = (HourMinutePickerDialog) getChildFragmentManager().l0("selectWakeUpInNightTime");
        if (hourMinutePickerDialog == null || !hourMinutePickerDialog.isShowing()) {
            int iIntValue = this.needUpdateWakeUpInNightFromListIndex == -1 ? 0 : getMSleepDiaryWakeUpInNightAdapter().getCurrentDataList().get(this.needUpdateWakeUpInNightFromListIndex).intValue();
            int i = iIntValue / 60;
            int i2 = this.needUpdateWakeUpInNightFromListIndex != -1 ? iIntValue % 60 : 1;
            if (hourMinutePickerDialog == null) {
                HourMinutePickerDialog hourMinutePickerDialogCreate = new HourMinutePickerDialog.a("hm").setCustomLayoutId(jui.f7).setPositiveText(c0j.J7).setNegativeText(c0j.D7).setCancelable(false).setDialogTitle(new DialogParams.DialogDescriptionString(getString(c0j.Qo))).create();
                Intrinsics.checkNotNullExpressionValue(hourMinutePickerDialogCreate, "create(...)");
                hourMinutePickerDialog = hourMinutePickerDialogCreate;
            }
            hourMinutePickerDialog.setMinuteData(CollectionsKt___CollectionsKt.toIntArray(this.minuteRange));
            hourMinutePickerDialog.setRequestCode(1004);
            hourMinutePickerDialog.setValue(i, i2);
            hourMinutePickerDialog.showIfNeed(getChildFragmentManager());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showRecordDeleteRemindDialog(final Function0<Unit> positive) {
        CommonDialog commonDialogCreate = new CommonDialog.c("commonDialog").setDialogTitle(c0j.Bi).setPositiveText(c0j.e).setNegativeText(c0j.c).setCanceledOnTouchOutside(true).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.health.sleep.rhythm.diary.SleepDiaryUpdateFragment.showRecordDeleteRemindDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which == -1) {
                    positive.invoke();
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        });
        commonDialogCreate.showIfNeed(getParentFragmentManager());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateEditView(SleepDiaryReport sleepDiary) {
        ((SleepDiaryUpdateViewModel) getMViewModel()).setUpdateSleepDiaryInfo(sleepDiary);
        long j = 1000;
        ((sba) getMBinding()).C.setRemindText(TimeUtils.formatDate(StringUtils.EXPECT_DATE_FORMAT, Long.valueOf(((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().getTime() * j)));
        if (sleepDiary.getPreSleepRoutineTime() != null) {
            RightArrowSingleLineTextView rightArrowSingleLineTextView = ((sba) getMBinding()).L;
            Long preSleepRoutineTime = sleepDiary.getPreSleepRoutineTime();
            Intrinsics.checkNotNull(preSleepRoutineTime);
            rightArrowSingleLineTextView.setRemindText(TimeUtils.formatDate("MM/dd HH:mm", Long.valueOf(preSleepRoutineTime.longValue() * j)));
        }
        if (sleepDiary.getFallAsleepDuration() != null) {
            RightArrowSingleLineTextView rightArrowSingleLineTextView2 = ((sba) getMBinding()).J;
            Resources resources = getResources();
            int i = qxi.R1;
            Integer fallAsleepDuration = sleepDiary.getFallAsleepDuration();
            Intrinsics.checkNotNull(fallAsleepDuration);
            int iIntValue = fallAsleepDuration.intValue();
            Integer fallAsleepDuration2 = sleepDiary.getFallAsleepDuration();
            Intrinsics.checkNotNull(fallAsleepDuration2);
            rightArrowSingleLineTextView2.setRemindText(resources.getQuantityString(i, iIntValue, fallAsleepDuration2));
        }
        if (sleepDiary.getMorningWakeUpTime() != null) {
            RightArrowSingleLineTextView rightArrowSingleLineTextView3 = ((sba) getMBinding()).I;
            Long morningWakeUpTime = sleepDiary.getMorningWakeUpTime();
            Intrinsics.checkNotNull(morningWakeUpTime);
            rightArrowSingleLineTextView3.setRemindText(TimeUtils.formatDate("MM/dd HH:mm", Long.valueOf(morningWakeUpTime.longValue() * j)));
        }
        if (sleepDiary.getMorningGettingUpTime() != null) {
            RightArrowSingleLineTextView rightArrowSingleLineTextView4 = ((sba) getMBinding()).H;
            Long morningGettingUpTime = sleepDiary.getMorningGettingUpTime();
            Intrinsics.checkNotNull(morningGettingUpTime);
            rightArrowSingleLineTextView4.setRemindText(TimeUtils.formatDate("MM/dd HH:mm", Long.valueOf(morningGettingUpTime.longValue() * j)));
        }
        List<SleepMedicationDetail> medicationBeforeBedtime = sleepDiary.getMedicationBeforeBedtime();
        if (medicationBeforeBedtime == null || medicationBeforeBedtime.isEmpty()) {
            RecyclerView medicationRv = ((sba) getMBinding()).K;
            Intrinsics.checkNotNullExpressionValue(medicationRv, "medicationRv");
            ExtUtilKt.gone(medicationRv);
        } else {
            RecyclerView medicationRv2 = ((sba) getMBinding()).K;
            Intrinsics.checkNotNullExpressionValue(medicationRv2, "medicationRv");
            ExtUtilKt.visible(medicationRv2);
            SleepDiaryMedicationAdapter mSleepDiaryMedicationAdapter = getMSleepDiaryMedicationAdapter();
            List<SleepMedicationDetail> medicationBeforeBedtime2 = sleepDiary.getMedicationBeforeBedtime();
            Intrinsics.checkNotNull(medicationBeforeBedtime2);
            mSleepDiaryMedicationAdapter.updateDataList(CollectionsKt___CollectionsKt.toMutableList((Collection) medicationBeforeBedtime2));
        }
        List<Integer> fallAsleepAgainDuration = sleepDiary.getFallAsleepAgainDuration();
        if (fallAsleepAgainDuration == null || fallAsleepAgainDuration.isEmpty()) {
            RecyclerView wakeUpRv = ((sba) getMBinding()).Y;
            Intrinsics.checkNotNullExpressionValue(wakeUpRv, "wakeUpRv");
            ExtUtilKt.gone(wakeUpRv);
        } else {
            RecyclerView wakeUpRv2 = ((sba) getMBinding()).Y;
            Intrinsics.checkNotNullExpressionValue(wakeUpRv2, "wakeUpRv");
            ExtUtilKt.visible(wakeUpRv2);
            SleepDiaryWakeUpInNightAdapter mSleepDiaryWakeUpInNightAdapter = getMSleepDiaryWakeUpInNightAdapter();
            List<Integer> fallAsleepAgainDuration2 = sleepDiary.getFallAsleepAgainDuration();
            Intrinsics.checkNotNull(fallAsleepAgainDuration2);
            mSleepDiaryWakeUpInNightAdapter.updateDataList(CollectionsKt___CollectionsKt.toMutableList((Collection) fallAsleepAgainDuration2));
        }
        List<SleepNapSituation> napSituation = sleepDiary.getNapSituation();
        if (napSituation == null || napSituation.isEmpty()) {
            RecyclerView sleepInDayRv = ((sba) getMBinding()).U;
            Intrinsics.checkNotNullExpressionValue(sleepInDayRv, "sleepInDayRv");
            ExtUtilKt.gone(sleepInDayRv);
        } else {
            RecyclerView sleepInDayRv2 = ((sba) getMBinding()).U;
            Intrinsics.checkNotNullExpressionValue(sleepInDayRv2, "sleepInDayRv");
            ExtUtilKt.visible(sleepInDayRv2);
            SleepDiarySleepInDayAdapter mSleepDiarySleepInDayAdapter = getMSleepDiarySleepInDayAdapter();
            List<SleepNapSituation> napSituation2 = sleepDiary.getNapSituation();
            Intrinsics.checkNotNull(napSituation2);
            mSleepDiarySleepInDayAdapter.updateDataList(CollectionsKt___CollectionsKt.toMutableList((Collection) napSituation2));
        }
        getMSleepDiarySleepDifficultyAdapter().onSelect(sleepDiary.getInsomniaDifficulty());
        getMSleepDiarySleepFeelAdapter().onSelect(sleepDiary.getSleepQuality());
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull sba sbaVar) {
        Intrinsics.checkNotNullParameter(sbaVar, "<this>");
        sbaVar.L.setTitle(Marker.ANY_MARKER + getString(c0j.Kb));
        sbaVar.J.setTitle(Marker.ANY_MARKER + getString(c0j.nf));
        sbaVar.I.setTitle(Marker.ANY_MARKER + getString(c0j.lf));
        sbaVar.H.setTitle(Marker.ANY_MARKER + getString(c0j.f1if));
        sbaVar.N.setText(Marker.ANY_MARKER + getString(c0j.vf));
        sbaVar.Q.setText(Marker.ANY_MARKER + getString(c0j.Of));
        sbaVar.L.setOnClickListener(new View.OnClickListener() { // from class: hlm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepDiaryUpdateFragment.bindView$lambda$7(this.f20219a, view);
            }
        });
        sbaVar.J.setOnClickListener(new View.OnClickListener() { // from class: ilm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepDiaryUpdateFragment.bindView$lambda$8(this.f21279a, view);
            }
        });
        sbaVar.I.setOnClickListener(new View.OnClickListener() { // from class: jlm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepDiaryUpdateFragment.bindView$lambda$9(this.f22912a, view);
            }
        });
        sbaVar.H.setOnClickListener(new View.OnClickListener() { // from class: xkm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepDiaryUpdateFragment.bindView$lambda$10(this.f39219a, view);
            }
        });
        sbaVar.A.setOnClickListener(new View.OnClickListener() { // from class: ykm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepDiaryUpdateFragment.bindView$lambda$11(this.f40272a, view);
            }
        });
        sbaVar.W.setOnClickListener(new View.OnClickListener() { // from class: zkm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepDiaryUpdateFragment.bindView$lambda$12(this.f41407a, view);
            }
        });
        sbaVar.T.setOnClickListener(new View.OnClickListener() { // from class: alm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepDiaryUpdateFragment.bindView$lambda$13(this.f1180a, view);
            }
        });
        sbaVar.K.setAdapter(getMSleepDiaryMedicationAdapter());
        sbaVar.K.addItemDecoration(new SpaceItemDecoration());
        sbaVar.Y.setAdapter(getMSleepDiaryWakeUpInNightAdapter());
        sbaVar.Y.addItemDecoration(new SpaceItemDecoration());
        sbaVar.U.setAdapter(getMSleepDiarySleepInDayAdapter());
        sbaVar.U.addItemDecoration(new SpaceItemDecoration());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        List<SleepMedicationDetail> arrayList;
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == -1) {
            if (requestCode == 1000 || requestCode == 1001) {
                Serializable serializableExtra = data != null ? data.getSerializableExtra(SleepDiaryMedicationUpdateFragment.INTENT_REQUEST_DATA) : null;
                Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.project.SleepMedicationDetail");
                SleepMedicationDetail sleepMedicationDetail = (SleepMedicationDetail) serializableExtra;
                List<SleepMedicationDetail> medicationBeforeBedtime = ((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().getMedicationBeforeBedtime();
                if (medicationBeforeBedtime == null || (arrayList = CollectionsKt___CollectionsKt.toMutableList((Collection) medicationBeforeBedtime)) == null) {
                    arrayList = new ArrayList<>();
                }
                Logger.i(SleepDiaryHandle.TAG, " onActivityResult requestCode:" + requestCode);
                if (requestCode == 1000) {
                    arrayList.add(sleepMedicationDetail);
                } else {
                    arrayList.set(data.getIntExtra(SleepDiaryMedicationUpdateFragment.INTENT_REQUEST_ACTION_INDEX, -1), sleepMedicationDetail);
                }
                ((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().setMedicationBeforeBedtime(arrayList);
                getMSleepDiaryMedicationAdapter().updateDataList(arrayList);
                if (arrayList.isEmpty()) {
                    RecyclerView medicationRv = ((sba) getMBinding()).K;
                    Intrinsics.checkNotNullExpressionValue(medicationRv, "medicationRv");
                    ExtUtilKt.gone(medicationRv);
                } else {
                    RecyclerView medicationRv2 = ((sba) getMBinding()).K;
                    Intrinsics.checkNotNullExpressionValue(medicationRv2, "medicationRv");
                    ExtUtilKt.visible(medicationRv2);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        List<SleepMedicationDetail> medicationBeforeBedtime;
        List<Integer> fallAsleepAgainDuration;
        List<SleepNapSituation> napSituation = ((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().getNapSituation();
        if ((napSituation == null || napSituation.isEmpty()) && (((medicationBeforeBedtime = ((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().getMedicationBeforeBedtime()) == null || medicationBeforeBedtime.isEmpty()) && ((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().getPreSleepRoutineTime() == null && ((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().getFallAsleepDuration() == null && (((fallAsleepAgainDuration = ((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().getFallAsleepAgainDuration()) == null || fallAsleepAgainDuration.isEmpty()) && ((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().getMorningGettingUpTime() == null && ((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().getInsomniaDifficulty() == null && ((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().getSleepQuality() == null && ((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().getMorningWakeUpTime() == null))) {
            return super.onBackPressed();
        }
        CommonDialog commonDialogCreate = new CommonDialog.c("commonDialog").setDialogTitle(c0j.zi).setPositiveText(c0j.Ai).setNegativeText(c0j.yi).setCanceledOnTouchOutside(true).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.health.sleep.rhythm.diary.SleepDiaryUpdateFragment.onBackPressed.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which == -2) {
                    SleepDiaryUpdateFragment.this.finish();
                } else if (which == -1) {
                    SleepDiaryUpdateFragment.this.onSave();
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        });
        commonDialogCreate.showIfNeed(getParentFragmentManager());
        return true;
    }

    @Override // defpackage.yaa
    public void onFragmentResult(int requestCode, int resultCode, @NotNull Bundle data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (resultCode == -1) {
            int i = data.getInt(PickSleepTimeDialog.KEY_SELECT_HOUR, -1);
            int i2 = data.getInt(PickSleepTimeDialog.KEY_SELECT_MINUTE, -1);
            long j = data.getLong(PickSleepTimeDialog.KEY_SELECT_TIME, 0L);
            Logger.i(SleepDiaryHandle.TAG, "dealTimeResult REQUEST_READY_SLEEP_TIME hour:" + i + " minute:" + i2 + " time:" + j);
            if (i == -1 || i2 == -1) {
                return;
            }
            dealTimeResult(i, i2, j, requestCode);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00af  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        setTitle(getString(c0j.hf));
        setActionBarDisplayable(true);
        setActionBarExpandState(0);
        IActionBar.DefaultImpls.setEndView$default(this, 0, pni.O1, null, new View.OnClickListener() { // from class: flm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SleepDiaryUpdateFragment.onViewCreated$lambda$5(this.f17901a, view2);
            }
        }, 5, null);
        for (int i = 0; i < 60; i++) {
            this.minuteRange.add(Integer.valueOf(i));
        }
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            if (arguments == null || arguments.getLong(INTENT_REQUEST_TIME) != 0) {
                SleepDiaryReport updateSleepDiaryInfo = ((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo();
                Bundle arguments2 = getArguments();
                updateSleepDiaryInfo.setTimestamp(arguments2 != null ? arguments2.getLong(INTENT_REQUEST_TIME) : 0L);
                Bundle arguments3 = getArguments();
                String string = arguments3 != null ? arguments3.getString(INTENT_REQUEST_SID) : null;
                if (string != null && string.length() != 0) {
                    SleepDiaryReport updateSleepDiaryInfo2 = ((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo();
                    Bundle arguments4 = getArguments();
                    updateSleepDiaryInfo2.setSid(arguments4 != null ? arguments4.getString(INTENT_REQUEST_SID) : null);
                }
                ((SleepDiaryUpdateViewModel) getMViewModel()).getSleepDiaryReport(((SleepDiaryUpdateViewModel) getMViewModel()).getUpdateSleepDiaryInfo().getTime());
            } else {
                initAddDiaryView();
            }
        } else {
            initAddDiaryView();
        }
        ((sba) getMBinding()).P.setAdapter(getMSleepDiarySleepDifficultyAdapter());
        ((sba) getMBinding()).P.setLayoutManager(new GridLayoutManager(getMActivity(), 5));
        ((sba) getMBinding()).S.setAdapter(getMSleepDiarySleepFeelAdapter());
        ((sba) getMBinding()).S.setLayoutManager(new GridLayoutManager(getMActivity(), 5));
        requestDiaryData();
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("expose_v3", "56.85.0.1.35880"), "name", "sleep_diary_deatil", "type", 2);
    }
}
