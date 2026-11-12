package com.xiaomi.fitness.health.sleep.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.p004activity.result.ActivityResult;
import androidx.p004activity.result.ActivityResultCallback;
import androidx.p004activity.result.ActivityResultLauncher;
import androidx.p004activity.result.contract.ActivityResultContracts;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.xiaomi.fit.data.common.constant.FitnessDataChangedSource;
import com.xiaomi.fit.data.common.constant.FitnessDataChangedUtils;
import com.xiaomi.fit.fitness.export.api.FitnessServerSyncer;
import com.xiaomi.fit.fitness.export.api.repository.ISleepRepository;
import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fit.fitness.export.data.stat.SleepAnimalReport;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.auto.start.AutoStarterImpl;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.bus.LiveDataBus;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableProductManager;
import com.xiaomi.fitness.device.manager.export.bean.WearableProduct;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.interfere.net.SleepInterferePlan;
import com.xiaomi.fitness.health.sleep.rhythm.SleepDayRhythmMonitorEntranceHolder;
import com.xiaomi.fitness.health.sleep.ui.SleepDayItemFragment;
import com.xiaomi.fitness.health.sleep.ui.adapter.SleepDayDetailAdapter;
import com.xiaomi.fitness.health.sleep.ui.holder.ISleepScore;
import com.xiaomi.fitness.health.sleep.ui.holder.SleepDayAnimalEntranceHolder;
import com.xiaomi.fitness.health.sleep.ui.holder.SleepDurationHolder;
import com.xiaomi.fitness.health.sleep.ui.holder.SleepInterfereBizHolder;
import com.xiaomi.fitness.health.sleep.ui.holder.SleepScoreEvaluationHolder;
import com.xiaomi.fitness.health.sleep.ui.setting.SleepPermissionSettingFragment;
import com.xiaomi.fitness.health.sleep.ui.setting.repository.SleepTracePermissionGuidePreference;
import com.xiaomi.fitness.health.sleep.ui.setting.util.SleepPermissionSettingUtil;
import com.xiaomi.fitness.health.sleep.utils.SleepTrackHelper;
import com.xiaomi.fitness.health.sleep.view.SleepViewModel;
import com.xiaomi.fitness.util.ExtUtilKt;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.view.CardUnderstandView;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.av6;
import defpackage.c0j;
import defpackage.eri;
import defpackage.jbe;
import defpackage.jce;
import defpackage.jui;
import defpackage.lbe;
import defpackage.oba;
import defpackage.xbe;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 c2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001cB\u0007¢\u0006\u0004\bb\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\u0007J\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0007J\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0007J\u000f\u0010\u0012\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0007J\u000f\u0010\u0013\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0007J\u000f\u0010\u0014\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0007J\u001f\u0010\u0018\u001a\u00020\u00052\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001a\u0010\u0007J!\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0005H\u0016¢\u0006\u0004\b!\u0010\u0007J\u000f\u0010\"\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\"\u0010\u0007J\u000f\u0010#\u001a\u00020\u0005H\u0014¢\u0006\u0004\b#\u0010\u0007J\u000f\u0010$\u001a\u00020\u0005H\u0016¢\u0006\u0004\b$\u0010\u0007J\u001f\u0010(\u001a\u00020\u00052\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\rH\u0016¢\u0006\u0004\b(\u0010)R\u0018\u0010*\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00106\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010<\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010?\u001a\u00020>8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010B\u001a\u00020A8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010E\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010G\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010FR\u0018\u0010H\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010FR\u0018\u0010I\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010K\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bK\u0010JR\u0016\u0010M\u001a\u00020L8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010O\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bO\u0010JR\u0016\u0010Q\u001a\u00020P8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010S\u001a\u00020P8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bS\u0010RR\u0016\u0010T\u001a\u00020L8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bT\u0010NR%\u0010X\u001a\u0010\u0012\f\u0012\n W*\u0004\u0018\u00010V0V0U8\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R \u0010]\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010a\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`¨\u0006d"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/SleepDayItemFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/sleep/view/SleepViewModel;", "Loba;", "Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepDayDetailAdapter$OnItemClickListener;", "", "triggerFetchFitnessReport", "()V", "initPermissionInstructionView", "upDateSleepAudioInstruction", "updateSleepPermissionSettingInstruction", "showRestrictedPermSettingDialogByEveryDay", "showPermSettingDialogByEveryDay", "", "desStr", "buildPermSettingDialog", "(I)V", "showPermSettingInstViewByEveryDay", "showPermSettingInstViewByCommon", "initView", "initUnderstandView", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "result", "refreshView", "(Ljava/util/List;)V", "showEmpty", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, LifecycleConstantKt.ON_PAUSE, "onInvisible", "onDestroyView", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "sleepReport", "position", "onClick", "(Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;I)V", "currentPosition", "Ljava/lang/Integer;", "Lorg/joda/time/LocalDate;", "currentLocalDate", "Lorg/joda/time/LocalDate;", "Landroidx/recyclerview/widget/RecyclerView;", "sleepRecordRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepDayDetailAdapter;", "sleepDayDetailAdapter", "Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepDayDetailAdapter;", "Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepScoreEvaluationHolder;", "sleepScoreEvaluationHolder", "Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepScoreEvaluationHolder;", "Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepDurationHolder;", "sleepDurationHolder", "Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepDurationHolder;", "Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepDayAnimalEntranceHolder;", "sleepAnimalEntranceHolder", "Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepDayAnimalEntranceHolder;", "Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepInterfereBizHolder;", "sleepInterfereHolder", "Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepInterfereBizHolder;", "Lcom/xiaomi/fitness/health/sleep/rhythm/SleepDayRhythmMonitorEntranceHolder;", "sleepDayRhythmMonitorEntranceHolder", "Lcom/xiaomi/fitness/health/sleep/rhythm/SleepDayRhythmMonitorEntranceHolder;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;", "allDaySleepReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;", "preDaySleepReport", "localDateNowDaySleepReport", "containerView", "Landroid/view/View;", "permSettingInstView", "Landroid/widget/TextView;", "permSettingInstTv", "Landroid/widget/TextView;", "sleepAudioDataView", "Landroidx/appcompat/widget/AppCompatImageView;", "closePermSettingCross", "Landroidx/appcompat/widget/AppCompatImageView;", "closePermAudioCross", "permAudioDataInstTv", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "resultLauncherForSleepEfficiencyCard", "Landroidx/activity/result/ActivityResultLauncher;", "getResultLauncherForSleepEfficiencyCard", "()Landroidx/activity/result/ActivityResultLauncher;", "Landroidx/lifecycle/Observer;", "reportObserver", "Landroidx/lifecycle/Observer;", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSleepDayItemFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepDayItemFragment.kt\ncom/xiaomi/fitness/health/sleep/ui/SleepDayItemFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,594:1\n1#2:595\n1863#3,2:596\n*S KotlinDebug\n*F\n+ 1 SleepDayItemFragment.kt\ncom/xiaomi/fitness/health/sleep/ui/SleepDayItemFragment\n*L\n255#1:596,2\n*E\n"})
public final class SleepDayItemFragment extends Hilt_SleepDayItemFragment<SleepViewModel, oba> implements SleepDayDetailAdapter.OnItemClickListener {

    @NotNull
    public static final String TAG = "SleepDayItemUI";

    @Nullable
    private AllDaySleepReport allDaySleepReport;
    private AppCompatImageView closePermAudioCross;
    private AppCompatImageView closePermSettingCross;

    @Nullable
    private View containerView;

    @Nullable
    private LocalDate currentLocalDate;

    @Nullable
    private Integer currentPosition;

    @Nullable
    private AllDaySleepReport localDateNowDaySleepReport;
    private TextView permAudioDataInstTv;
    private TextView permSettingInstTv;
    private View permSettingInstView;

    @Nullable
    private AllDaySleepReport preDaySleepReport;

    @NotNull
    private final Observer<List<DailyBasicReport>> reportObserver;

    @NotNull
    private final ActivityResultLauncher<Intent> resultLauncherForSleepEfficiencyCard;
    private SleepDayAnimalEntranceHolder sleepAnimalEntranceHolder;
    private View sleepAudioDataView;
    private SleepDayDetailAdapter sleepDayDetailAdapter;
    private SleepDayRhythmMonitorEntranceHolder sleepDayRhythmMonitorEntranceHolder;
    private SleepDurationHolder sleepDurationHolder;
    private SleepInterfereBizHolder sleepInterfereHolder;
    private RecyclerView sleepRecordRecyclerView;
    private SleepScoreEvaluationHolder sleepScoreEvaluationHolder;

    public SleepDayItemFragment() {
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: ckm
            @Override // androidx.p004activity.result.ActivityResultCallback
            public final void a(Object obj) {
                SleepDayItemFragment.resultLauncherForSleepEfficiencyCard$lambda$1((ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.resultLauncherForSleepEfficiencyCard = activityResultLauncherRegisterForActivityResult;
        this.reportObserver = new Observer() { // from class: dkm
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepDayItemFragment.reportObserver$lambda$2(this.f15632a, (List) obj);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ SleepViewModel access$getMViewModel(SleepDayItemFragment sleepDayItemFragment) {
        return (SleepViewModel) sleepDayItemFragment.getMViewModel();
    }

    private final void buildPermSettingDialog(int desStr) {
        CommonDialog.c cVar = new CommonDialog.c("showPermSettingDialog");
        cVar.setDialogDescription(desStr);
        cVar.setPositiveText(c0j.V7);
        cVar.setNegativeText(c0j.I7);
        CommonDialog commonDialogCreate = cVar.create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.health.sleep.ui.SleepDayItemFragment.buildPermSettingDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which == -1) {
                    BaseFragmentExKt.gotoPage(SleepDayItemFragment.this, SleepPermissionSettingFragment.class, null);
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        });
        FragmentActivity activity = getActivity();
        commonDialogCreate.showIfNeed(activity != null ? activity.getSupportFragmentManager() : null);
        SleepTracePermissionGuidePreference.INSTANCE.setSETTING_DIALOG_CLOSED_TIMESTAMP(System.currentTimeMillis());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initPermissionInstructionView() {
        View view = ((oba) getMBinding()).J;
        this.permSettingInstView = view;
        View view2 = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("permSettingInstView");
            view = null;
        }
        this.permSettingInstTv = (TextView) view.findViewById(eri.a8);
        this.sleepAudioDataView = ((oba) getMBinding()).F;
        View view3 = this.permSettingInstView;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("permSettingInstView");
            view3 = null;
        }
        this.closePermSettingCross = (AppCompatImageView) view3.findViewById(eri.P1);
        View view4 = this.sleepAudioDataView;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepAudioDataView");
            view4 = null;
        }
        this.closePermAudioCross = (AppCompatImageView) view4.findViewById(eri.P1);
        View view5 = this.sleepAudioDataView;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepAudioDataView");
        } else {
            view2 = view5;
        }
        this.permAudioDataInstTv = (TextView) view2.findViewById(eri.a8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initUnderstandView() {
        CardUnderstandView understandCard = ((oba) getMBinding()).K;
        Intrinsics.checkNotNullExpressionValue(understandCard, "understandCard");
        understandCard.setOnClickListener(new View.OnClickListener() { // from class: zjm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepDayItemFragment.initUnderstandView$lambda$22(this.f41382a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initUnderstandView$lambda$22(SleepDayItemFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WebViewUtilKt.startWebView$default(HealthUtil.INSTANCE.getUnderstandSleepUrl(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null)), this$0.getString(c0j.Ck), false, false, null, false, null, false, 252, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        SleepInterfereBizHolder sleepInterfereBizHolder;
        this.containerView = ((oba) getMBinding()).D;
        setActionBarDisplayable(false);
        lbe cardDuration = ((oba) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(cardDuration, "cardDuration");
        this.sleepDurationHolder = new SleepDurationHolder(cardDuration, 0);
        jbe cardSleepAnimalEntrance = ((oba) getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(cardSleepAnimalEntrance, "cardSleepAnimalEntrance");
        this.sleepAnimalEntranceHolder = new SleepDayAnimalEntranceHolder(cardSleepAnimalEntrance);
        jce cardScore = ((oba) getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(cardScore, "cardScore");
        this.sleepScoreEvaluationHolder = new SleepScoreEvaluationHolder(cardScore, 0, new ISleepScore() { // from class: com.xiaomi.fitness.health.sleep.ui.SleepDayItemFragment.initView.1
            @Override // com.xiaomi.fitness.health.sleep.ui.holder.ISleepScore
            public void requestShowSleepAssistGuide() {
                SleepDayItemFragment.access$getMViewModel(SleepDayItemFragment.this).requestShowSleepAssistGuide();
            }
        });
        AppUtil appUtil = AppUtil.INSTANCE;
        if (appUtil.isPlayChannel()) {
            xbe sleepInterfere = ((oba) getMBinding()).H;
            Intrinsics.checkNotNullExpressionValue(sleepInterfere, "sleepInterfere");
            ConstraintLayout root = ((oba) getMBinding()).I.A;
            Intrinsics.checkNotNullExpressionValue(root, "root");
            sleepInterfereBizHolder = new SleepInterfereBizHolder(sleepInterfere, root);
        } else {
            xbe sleepInterfere2 = ((oba) getMBinding()).H;
            Intrinsics.checkNotNullExpressionValue(sleepInterfere2, "sleepInterfere");
            View viewFindViewById = ((oba) getMBinding()).E.findViewById(eri.jf);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            sleepInterfereBizHolder = new SleepInterfereBizHolder(sleepInterfere2, viewFindViewById);
        }
        this.sleepInterfereHolder = sleepInterfereBizHolder;
        this.sleepRecordRecyclerView = ((oba) getMBinding()).G;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        SleepDayDetailAdapter sleepDayDetailAdapter = new SleepDayDetailAdapter(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner));
        this.sleepDayDetailAdapter = sleepDayDetailAdapter;
        sleepDayDetailAdapter.setOnItemClickListener(this);
        RecyclerView recyclerView = this.sleepRecordRecyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepRecordRecyclerView");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        RecyclerView recyclerView2 = this.sleepRecordRecyclerView;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepRecordRecyclerView");
            recyclerView2 = null;
        }
        SleepDayDetailAdapter sleepDayDetailAdapter2 = this.sleepDayDetailAdapter;
        if (sleepDayDetailAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepDayDetailAdapter");
            sleepDayDetailAdapter2 = null;
        }
        recyclerView2.setAdapter(sleepDayDetailAdapter2);
        initUnderstandView();
        WearableProduct wearableProduct = (WearableProduct) DeviceManagerExtKt.getInstance(WearableProductManager.INSTANCE).findProduct(new Function1() { // from class: ekm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(SleepDayItemFragment.initView$lambda$19((WearableProduct) obj));
            }
        });
        Logger.i("initHealthBannerSet", "findSupportProduct " + (wearableProduct != null ? wearableProduct.getModel() : null));
        ((oba) getMBinding()).E.setSleepHealthBanner(this.currentPosition);
        ((SleepViewModel) getMViewModel()).getSleepShowAssistSwitchEnableLiveData().observe(getViewLifecycleOwner(), new SleepDayItemFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: pjm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepDayItemFragment.initView$lambda$20(this.f30471a, (Boolean) obj);
            }
        }));
        ((SleepViewModel) getMViewModel()).getSleepInterferePlanLiveData().observe(getViewLifecycleOwner(), new SleepDayItemFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: qjm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepDayItemFragment.initView$lambda$21(this.f31574a, (List) obj);
            }
        }));
        if (!appUtil.isPlayChannel()) {
            ConstraintLayout root2 = ((oba) getMBinding()).I.A;
            Intrinsics.checkNotNullExpressionValue(root2, "root");
            ViewExtKt.gone(root2);
        }
        ((SleepViewModel) getMViewModel()).getSleepInterferePlan();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initView$lambda$19(WearableProduct it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return StringsKt__StringsKt.contains$default((CharSequence) it.getModel(), (CharSequence) "miwear.watch.n66cn", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) it.getModel(), (CharSequence) "miwear.watch.n66nfc", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) it.getModel(), (CharSequence) "mijia.watch.n62s", false, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$20(SleepDayItemFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "onSleepAssistGuideResult " + bool);
        SleepScoreEvaluationHolder sleepScoreEvaluationHolder = this$0.sleepScoreEvaluationHolder;
        if (sleepScoreEvaluationHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepScoreEvaluationHolder");
            sleepScoreEvaluationHolder = null;
        }
        Intrinsics.checkNotNull(bool);
        sleepScoreEvaluationHolder.refreshViewOnAssistGuideResult(bool.booleanValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$21(SleepDayItemFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SleepInterfereBizHolder sleepInterfereBizHolder = this$0.sleepInterfereHolder;
        SleepInterferePlan sleepInterferePlan = null;
        if (sleepInterfereBizHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepInterfereHolder");
            sleepInterfereBizHolder = null;
        }
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            sleepInterferePlan = (SleepInterferePlan) list.get(0);
        }
        sleepInterfereBizHolder.updateSleepInterferePlan(sleepInterferePlan);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$5(SleepDayItemFragment this$0, SleepAnimalReport sleepAnimalReport) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SleepDayAnimalEntranceHolder sleepDayAnimalEntranceHolder = this$0.sleepAnimalEntranceHolder;
        if (sleepDayAnimalEntranceHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepAnimalEntranceHolder");
            sleepDayAnimalEntranceHolder = null;
        }
        sleepDayAnimalEntranceHolder.updateLatestSleepAnimalReport(sleepAnimalReport);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void refreshView(List<? extends DailyBasicReport> result) {
        Logger.i(TAG, "Sleep day onReportResult refreshView " + this.currentLocalDate + ";" + result);
        SleepDayDetailAdapter sleepDayDetailAdapter = null;
        this.allDaySleepReport = null;
        this.preDaySleepReport = null;
        if (ArrayUtils.isEmpty(result)) {
            this.allDaySleepReport = null;
        } else {
            Intrinsics.checkNotNull(result);
            for (DailyBasicReport dailyBasicReport : result) {
                if (dailyBasicReport instanceof AllDaySleepReport) {
                    AllDaySleepReport allDaySleepReport = (AllDaySleepReport) dailyBasicReport;
                    long time = allDaySleepReport.getTime();
                    LocalDate localDate = this.currentLocalDate;
                    Intrinsics.checkNotNull(localDate);
                    if (time == TimeDateUtil.changZeroOfTheDay(localDate)) {
                        this.allDaySleepReport = allDaySleepReport;
                        LocalDate localDate2 = this.currentLocalDate;
                        Intrinsics.checkNotNull(localDate2);
                        LocalDate localDateNow = LocalDate.now();
                        Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
                        if (TimeDateUtil.isSameLocalDate(localDate2, localDateNow)) {
                            this.localDateNowDaySleepReport = allDaySleepReport;
                        }
                    } else {
                        long time2 = allDaySleepReport.getTime();
                        LocalDate localDate3 = this.currentLocalDate;
                        Intrinsics.checkNotNull(localDate3);
                        LocalDate localDateMinusDays = localDate3.minusDays(1);
                        Intrinsics.checkNotNullExpressionValue(localDateMinusDays, "minusDays(...)");
                        if (time2 == TimeDateUtil.changZeroOfTheDay(localDateMinusDays)) {
                            this.preDaySleepReport = allDaySleepReport;
                        }
                    }
                }
            }
        }
        if (this.allDaySleepReport == null) {
            showEmpty();
            return;
        }
        RecyclerView recyclerView = this.sleepRecordRecyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepRecordRecyclerView");
            recyclerView = null;
        }
        ViewExtKt.setVisible(recyclerView, true);
        SleepDurationHolder sleepDurationHolder = this.sleepDurationHolder;
        if (sleepDurationHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepDurationHolder");
            sleepDurationHolder = null;
        }
        sleepDurationHolder.updateReport(this.allDaySleepReport);
        SleepScoreEvaluationHolder sleepScoreEvaluationHolder = this.sleepScoreEvaluationHolder;
        if (sleepScoreEvaluationHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepScoreEvaluationHolder");
            sleepScoreEvaluationHolder = null;
        }
        sleepScoreEvaluationHolder.updateReport(this.allDaySleepReport, this.preDaySleepReport);
        SleepDayDetailAdapter sleepDayDetailAdapter2 = this.sleepDayDetailAdapter;
        if (sleepDayDetailAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepDayDetailAdapter");
            sleepDayDetailAdapter2 = null;
        }
        sleepDayDetailAdapter2.updateAllDaySleepReport(this.allDaySleepReport);
        SleepDayDetailAdapter sleepDayDetailAdapter3 = this.sleepDayDetailAdapter;
        if (sleepDayDetailAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepDayDetailAdapter");
        } else {
            sleepDayDetailAdapter = sleepDayDetailAdapter3;
        }
        sleepDayDetailAdapter.setShowNoDataAudio(((SleepViewModel) getMViewModel()).sleepAudioIsEnabled());
        upDateSleepAudioInstruction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reportObserver$lambda$2(SleepDayItemFragment this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.refreshView(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resultLauncherForSleepEfficiencyCard$lambda$1(ActivityResult activityResult) {
        if (activityResult.c() == -1) {
            Intent intentA = activityResult.a();
            Boolean boolValueOf = intentA != null ? Boolean.valueOf(intentA.getBooleanExtra("refresh?", false)) : null;
            if (boolValueOf == null || !boolValueOf.booleanValue()) {
                return;
            }
            FitnessDataChangedUtils.sendRecentDataChangedBroadcast$default(FitnessDataChangedUtils.INSTANCE, FitnessDataChangedSource.ManualRecord, true, null, null, false, 28, null);
            FitnessServerSyncer.DefaultImpls.syncWithServer$default(FitnessDataExtKt.getInstance(FitnessServerSyncer.INSTANCE), true, "add_or_delete", null, 4, null);
        }
    }

    private final void showEmpty() {
        SleepDurationHolder sleepDurationHolder = this.sleepDurationHolder;
        RecyclerView recyclerView = null;
        if (sleepDurationHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepDurationHolder");
            sleepDurationHolder = null;
        }
        sleepDurationHolder.updateReport(null);
        SleepScoreEvaluationHolder sleepScoreEvaluationHolder = this.sleepScoreEvaluationHolder;
        if (sleepScoreEvaluationHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepScoreEvaluationHolder");
            sleepScoreEvaluationHolder = null;
        }
        sleepScoreEvaluationHolder.updateReport(null, null);
        RecyclerView recyclerView2 = this.sleepRecordRecyclerView;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepRecordRecyclerView");
        } else {
            recyclerView = recyclerView2;
        }
        ViewExtKt.setVisible(recyclerView, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showPermSettingDialogByEveryDay() {
        if (((SleepViewModel) getMViewModel()).sleepTrackIsEnabled() && !TimeUtils.INSTANCE.isSameDay(System.currentTimeMillis(), SleepTracePermissionGuidePreference.INSTANCE.getSETTING_DIALOG_CLOSED_TIMESTAMP())) {
            ((SleepViewModel) getMViewModel()).isNoRestrictedLevelLiveData().observe(getViewLifecycleOwner(), new SleepDayItemFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: vjm
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SleepDayItemFragment.showPermSettingDialogByEveryDay$lambda$12(this.f36955a, (Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showPermSettingDialogByEveryDay$lambda$12(SleepDayItemFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (TimeUtils.INSTANCE.isSameDay(System.currentTimeMillis(), SleepTracePermissionGuidePreference.INSTANCE.getSETTING_DIALOG_CLOSED_TIMESTAMP())) {
            return Unit.INSTANCE;
        }
        if (!Intrinsics.areEqual(bool, Boolean.TRUE)) {
            this$0.buildPermSettingDialog(c0j.yh);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showPermSettingInstViewByCommon() {
        View view = null;
        if (((SleepViewModel) getMViewModel()).sleepTrackIsEnabled()) {
            SleepTracePermissionGuidePreference sleepTracePermissionGuidePreference = SleepTracePermissionGuidePreference.INSTANCE;
            if (sleepTracePermissionGuidePreference.getCLOSE_COUNT() < 2) {
                if (sleepTracePermissionGuidePreference.getCLOSE_COUNT() == 1 && TimeUtils.INSTANCE.isSameDay(System.currentTimeMillis(), sleepTracePermissionGuidePreference.getFIRST_TIME_CLOSED_TIMESTAMP())) {
                    View view2 = this.permSettingInstView;
                    if (view2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("permSettingInstView");
                    } else {
                        view = view2;
                    }
                    ViewExtKt.gone(view);
                    return;
                }
                View view3 = this.permSettingInstView;
                if (view3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("permSettingInstView");
                    view3 = null;
                }
                ExtUtilKt.visible(view3);
                final boolean autoStartEnabled = SleepPermissionSettingUtil.INSTANCE.getAutoStartEnabled();
                ((SleepViewModel) getMViewModel()).isNoRestrictedLevelLiveData().observe(getViewLifecycleOwner(), new SleepDayItemFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ojm
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return SleepDayItemFragment.showPermSettingInstViewByCommon$lambda$16(this.f29228a, autoStartEnabled, (Boolean) obj);
                    }
                }));
                ((SleepViewModel) getMViewModel()).queryRestrictionLevel();
                AutoStarterImpl autoStarterImpl = AutoStarterImpl.INSTANCE;
                FragmentActivity fragmentActivityRequireActivity = requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                Logger.i(TAG, "canAutoStart=" + autoStarterImpl.canAutoStart(fragmentActivityRequireActivity));
                View view4 = this.permSettingInstView;
                if (view4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("permSettingInstView");
                    view4 = null;
                }
                view4.setOnClickListener(new View.OnClickListener() { // from class: wjm
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view5) {
                        SleepDayItemFragment.showPermSettingInstViewByCommon$lambda$17(this.f38036a, view5);
                    }
                });
                AppCompatImageView appCompatImageView = this.closePermSettingCross;
                if (appCompatImageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("closePermSettingCross");
                } else {
                    view = appCompatImageView;
                }
                view.setOnClickListener(new View.OnClickListener() { // from class: xjm
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view5) {
                        SleepDayItemFragment.showPermSettingInstViewByCommon$lambda$18(this.f39193a, view5);
                    }
                });
                return;
            }
        }
        View view5 = this.permSettingInstView;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("permSettingInstView");
        } else {
            view = view5;
        }
        ViewExtKt.gone(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showPermSettingInstViewByCommon$lambda$16(SleepDayItemFragment this$0, boolean z, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SleepPermissionSettingUtil sleepPermissionSettingUtil = SleepPermissionSettingUtil.INSTANCE;
        View view = this$0.permSettingInstView;
        TextView textView = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("permSettingInstView");
            view = null;
        }
        TextView textView2 = this$0.permSettingInstTv;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("permSettingInstTv");
        } else {
            textView = textView2;
        }
        sleepPermissionSettingUtil.updateSleepPermissionSettingInstructionCard(view, textView, Boolean.valueOf(z), bool);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPermSettingInstViewByCommon$lambda$17(SleepDayItemFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseFragmentExKt.gotoPage(this$0, SleepPermissionSettingFragment.class, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPermSettingInstViewByCommon$lambda$18(SleepDayItemFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SleepTracePermissionGuidePreference sleepTracePermissionGuidePreference = SleepTracePermissionGuidePreference.INSTANCE;
        sleepTracePermissionGuidePreference.setCLOSE_COUNT(sleepTracePermissionGuidePreference.getCLOSE_COUNT() + 1);
        if (sleepTracePermissionGuidePreference.getCLOSE_COUNT() == 1) {
            sleepTracePermissionGuidePreference.setFIRST_TIME_CLOSED_TIMESTAMP(System.currentTimeMillis());
        }
        View view2 = this$0.permSettingInstView;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("permSettingInstView");
            view2 = null;
        }
        ViewExtKt.gone(view2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showPermSettingInstViewByEveryDay() {
        View view = null;
        if (!((SleepViewModel) getMViewModel()).sleepTrackIsEnabled()) {
            View view2 = this.permSettingInstView;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("permSettingInstView");
            } else {
                view = view2;
            }
            ViewExtKt.gone(view);
            return;
        }
        if (TimeUtils.INSTANCE.isSameDay(System.currentTimeMillis(), SleepTracePermissionGuidePreference.INSTANCE.getSETTING_CLOSED_TIMESTAMP())) {
            View view3 = this.permSettingInstView;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("permSettingInstView");
            } else {
                view = view3;
            }
            ViewExtKt.gone(view);
            return;
        }
        View view4 = this.permSettingInstView;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("permSettingInstView");
            view4 = null;
        }
        ExtUtilKt.visible(view4);
        final boolean autoStartEnabled = SleepPermissionSettingUtil.INSTANCE.getAutoStartEnabled();
        ((SleepViewModel) getMViewModel()).isNoRestrictedLevelLiveData().observe(getViewLifecycleOwner(), new SleepDayItemFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: sjm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepDayItemFragment.showPermSettingInstViewByEveryDay$lambda$13(this.f33711a, autoStartEnabled, (Boolean) obj);
            }
        }));
        ((SleepViewModel) getMViewModel()).queryRestrictionLevel();
        AutoStarterImpl autoStarterImpl = AutoStarterImpl.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Logger.i(TAG, "canAutoStart=" + autoStarterImpl.canAutoStart(fragmentActivityRequireActivity));
        View view5 = this.permSettingInstView;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("permSettingInstView");
            view5 = null;
        }
        view5.setOnClickListener(new View.OnClickListener() { // from class: tjm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view6) {
                SleepDayItemFragment.showPermSettingInstViewByEveryDay$lambda$14(this.f34770a, view6);
            }
        });
        AppCompatImageView appCompatImageView = this.closePermSettingCross;
        if (appCompatImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("closePermSettingCross");
        } else {
            view = appCompatImageView;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: ujm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view6) {
                SleepDayItemFragment.showPermSettingInstViewByEveryDay$lambda$15(this.f35850a, view6);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showPermSettingInstViewByEveryDay$lambda$13(SleepDayItemFragment this$0, boolean z, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SleepPermissionSettingUtil sleepPermissionSettingUtil = SleepPermissionSettingUtil.INSTANCE;
        View view = this$0.permSettingInstView;
        TextView textView = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("permSettingInstView");
            view = null;
        }
        TextView textView2 = this$0.permSettingInstTv;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("permSettingInstTv");
        } else {
            textView = textView2;
        }
        sleepPermissionSettingUtil.updateSleepPermissionSettingInstructionCard(view, textView, Boolean.valueOf(z), bool);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPermSettingInstViewByEveryDay$lambda$14(SleepDayItemFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseFragmentExKt.gotoPage(this$0, SleepPermissionSettingFragment.class, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPermSettingInstViewByEveryDay$lambda$15(SleepDayItemFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SleepTracePermissionGuidePreference.INSTANCE.setSETTING_CLOSED_TIMESTAMP(System.currentTimeMillis());
        View view2 = this$0.permSettingInstView;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("permSettingInstView");
            view2 = null;
        }
        ViewExtKt.gone(view2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showRestrictedPermSettingDialogByEveryDay() {
        if (((SleepViewModel) getMViewModel()).sleepTrackIsEnabled() && !TimeUtils.INSTANCE.isSameDay(System.currentTimeMillis(), SleepTracePermissionGuidePreference.INSTANCE.getSETTING_DIALOG_CLOSED_TIMESTAMP())) {
            ((SleepViewModel) getMViewModel()).isRestrictedLevelLiveData().observe(getViewLifecycleOwner(), new SleepDayItemFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: rjm
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SleepDayItemFragment.showRestrictedPermSettingDialogByEveryDay$lambda$11(this.f32620a, (Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRestrictedPermSettingDialogByEveryDay$lambda$11(SleepDayItemFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (TimeUtils.INSTANCE.isSameDay(System.currentTimeMillis(), SleepTracePermissionGuidePreference.INSTANCE.getSETTING_DIALOG_CLOSED_TIMESTAMP())) {
            return Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            this$0.buildPermSettingDialog(c0j.zh);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void triggerFetchFitnessReport() {
        LiveData<List<DailyBasicReport>> fetchLiveData = ((SleepViewModel) getMViewModel()).getFetchLiveData();
        if (fetchLiveData != null) {
            fetchLiveData.removeObservers(getViewLifecycleOwner());
        }
        SleepViewModel sleepViewModel = (SleepViewModel) getMViewModel();
        SleepViewModel sleepViewModel2 = (SleepViewModel) getMViewModel();
        LocalDate localDate = this.currentLocalDate;
        Intrinsics.checkNotNull(localDate);
        sleepViewModel.setFetchLiveData(sleepViewModel2.triggerFetchFitnessReport(ISleepRepository.class, "days", TimeDateUtil.changZeroOfTheDay(localDate), 1, 0, ""));
        LiveData<List<DailyBasicReport>> fetchLiveData2 = ((SleepViewModel) getMViewModel()).getFetchLiveData();
        Intrinsics.checkNotNull(fetchLiveData2);
        fetchLiveData2.observe(getViewLifecycleOwner(), this.reportObserver);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void upDateSleepAudioInstruction() {
        TimeUtils timeUtils = TimeUtils.INSTANCE;
        long jCurrentTimeMillis = System.currentTimeMillis();
        SleepTracePermissionGuidePreference sleepTracePermissionGuidePreference = SleepTracePermissionGuidePreference.INSTANCE;
        if (timeUtils.isSameDay(jCurrentTimeMillis, sleepTracePermissionGuidePreference.getFIRST_LOOK_SLEEP_DATA_TIME())) {
            return;
        }
        View view = null;
        if (!RomUtils.isXiaomi()) {
            View view2 = this.sleepAudioDataView;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sleepAudioDataView");
            } else {
                view = view2;
            }
            ViewExtKt.gone(view);
            return;
        }
        if (!((SleepViewModel) getMViewModel()).sleepAudioIsEnabled() || sleepTracePermissionGuidePreference.getCLOSE_AUDIO_COUNT() > 2) {
            View view3 = this.sleepAudioDataView;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sleepAudioDataView");
            } else {
                view = view3;
            }
            ViewExtKt.gone(view);
            return;
        }
        if (sleepTracePermissionGuidePreference.getCLOSE_AUDIO_COUNT() == 1 && timeUtils.isSameDay(System.currentTimeMillis(), sleepTracePermissionGuidePreference.getFIRST_TIME_CLOSED_AUDIO_TITLE())) {
            View view4 = this.sleepAudioDataView;
            if (view4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sleepAudioDataView");
            } else {
                view = view4;
            }
            ViewExtKt.gone(view);
            return;
        }
        if (timeUtils.isSameDay(System.currentTimeMillis(), sleepTracePermissionGuidePreference.getOPEN_AUDIO_SWITCH_TIME())) {
            View view5 = this.sleepAudioDataView;
            if (view5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sleepAudioDataView");
            } else {
                view = view5;
            }
            ViewExtKt.gone(view);
            return;
        }
        View view6 = this.sleepAudioDataView;
        if (view6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepAudioDataView");
            view6 = null;
        }
        ExtUtilKt.visible(view6);
        final boolean autoStartEnabled = SleepPermissionSettingUtil.INSTANCE.getAutoStartEnabled();
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        final boolean z = sleepTracePermissionGuidePreference.getCLOSE_COUNT() >= 2 || (sleepTracePermissionGuidePreference.getCLOSE_COUNT() == 1 && timeUtils.isSameDay(System.currentTimeMillis(), sleepTracePermissionGuidePreference.getFIRST_TIME_CLOSED_TIMESTAMP()));
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(((SleepViewModel) getMViewModel()).getSleepSnoreRequestTime());
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
        final boolean z2 = TimeDateUtil.isSameLocalDate(localDateTimestampToLocalDate, localDateNow) && ((SleepViewModel) getMViewModel()).getSleepSnoreRequestTime() != 0;
        ((SleepViewModel) getMViewModel()).isNoRestrictedLevelLiveData().observe(getViewLifecycleOwner(), new SleepDayItemFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: akm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepDayItemFragment.upDateSleepAudioInstruction$lambda$9(autoStartEnabled, z, this, booleanRef, z2, (Boolean) obj);
            }
        }));
        ((SleepViewModel) getMViewModel()).queryRestrictionLevel();
        AppCompatImageView appCompatImageView = this.closePermAudioCross;
        if (appCompatImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("closePermAudioCross");
        } else {
            view = appCompatImageView;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: bkm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view7) {
                SleepDayItemFragment.upDateSleepAudioInstruction$lambda$10(this.f4320a, view7);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void upDateSleepAudioInstruction$lambda$10(SleepDayItemFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SleepTracePermissionGuidePreference sleepTracePermissionGuidePreference = SleepTracePermissionGuidePreference.INSTANCE;
        sleepTracePermissionGuidePreference.setCLOSE_AUDIO_COUNT(sleepTracePermissionGuidePreference.getCLOSE_AUDIO_COUNT() + 1);
        if (sleepTracePermissionGuidePreference.getCLOSE_AUDIO_COUNT() <= 2) {
            sleepTracePermissionGuidePreference.setFIRST_TIME_CLOSED_AUDIO_TITLE(System.currentTimeMillis());
        }
        View view2 = this$0.sleepAudioDataView;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepAudioDataView");
            view2 = null;
        }
        ViewExtKt.gone(view2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit upDateSleepAudioInstruction$lambda$9(boolean z, boolean z2, SleepDayItemFragment this$0, Ref.BooleanRef sleepAssistDataEmpty, boolean z3, Boolean bool) {
        boolean z4;
        List<SleepSegmentReport> sleepSegments;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(sleepAssistDataEmpty, "$sleepAssistDataEmpty");
        boolean z5 = (z && !Intrinsics.areEqual(bool, Boolean.FALSE)) || z2;
        AllDaySleepReport allDaySleepReport = this$0.localDateNowDaySleepReport;
        if (allDaySleepReport == null || (sleepSegments = allDaySleepReport.getSleepSegments()) == null) {
            z4 = false;
        } else {
            z4 = false;
            for (SleepSegmentReport sleepSegmentReport : sleepSegments) {
                if (!sleepSegmentReport.audioDataIsEmpty()) {
                    sleepAssistDataEmpty.element = false;
                }
                if (sleepSegmentReport.hasStageData()) {
                    z4 = true;
                }
            }
        }
        boolean z6 = z5 && sleepAssistDataEmpty.element && z4;
        Logger.i("upDateSleepAudioInstruction", "autoStartEnabled " + z + ", isNoRestrictedLevelLiveData " + bool + ", sleepAssistDataEmpty " + sleepAssistDataEmpty.element + ", hasLongSleep " + z4 + ",  requestAudioStatus " + z3 + ((SleepViewModel) this$0.getMViewModel()).getSleepSnoreRequestTime() + " permSettingShowStatus " + z2);
        if (z6) {
            SleepTracePermissionGuidePreference.INSTANCE.setFIRST_LOOK_SLEEP_DATA_TIME(System.currentTimeMillis());
        }
        View view = null;
        if (z3) {
            TextView textView = this$0.permAudioDataInstTv;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("permAudioDataInstTv");
                textView = null;
            }
            textView.setText(this$0.requireContext().getString(c0j.wd));
        } else {
            TextView textView2 = this$0.permAudioDataInstTv;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("permAudioDataInstTv");
                textView2 = null;
            }
            textView2.setText(this$0.requireContext().getString(c0j.xd));
        }
        View view2 = this$0.sleepAudioDataView;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepAudioDataView");
        } else {
            view = view2;
        }
        ViewExtKt.setVisible(view, z6);
        return Unit.INSTANCE;
    }

    private final void updateSleepPermissionSettingInstruction() {
        if (!RomUtils.isXiaomi()) {
            View view = this.permSettingInstView;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("permSettingInstView");
                view = null;
            }
            ViewExtKt.gone(view);
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 34) {
            showRestrictedPermSettingDialogByEveryDay();
        }
        if (i != 30) {
            showPermSettingInstViewByCommon();
        } else {
            showPermSettingInstViewByEveryDay();
            showPermSettingDialogByEveryDay();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.K0;
    }

    @NotNull
    public final ActivityResultLauncher<Intent> getResultLauncherForSleepEfficiencyCard() {
        return this.resultLauncherForSleepEfficiencyCard;
    }

    @Override // com.xiaomi.fitness.health.sleep.ui.adapter.SleepDayDetailAdapter.OnItemClickListener
    public void onClick(@NotNull SleepSegmentReport sleepReport, int position) {
        Intrinsics.checkNotNullParameter(sleepReport, "sleepReport");
        Intent intent = new Intent(requireContext(), (Class<?>) SleepLandScapeActivity.class);
        intent.putExtra(SleepLandScapeActivity.PARAM_SLEEP_REPORT_DATE, this.currentLocalDate);
        intent.putExtra(SleepLandScapeActivity.PARAM_SLEEP_REPORT_DATE_UNIQUE, sleepReport.getBedTime());
        intent.putExtra(SleepLandScapeActivity.PARAM_SLEEP_REPORT_POSITION, position);
        startActivity(intent);
        SleepTrackHelper.INSTANCE.trackSleepLandDetailActivityOrigin(false);
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        SleepDayAnimalEntranceHolder sleepDayAnimalEntranceHolder = this.sleepAnimalEntranceHolder;
        if (sleepDayAnimalEntranceHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepAnimalEntranceHolder");
            sleepDayAnimalEntranceHolder = null;
        }
        sleepDayAnimalEntranceHolder.disposeImageRequest();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onInvisible() {
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        OneTrackStatBean oneTrackStatBean = new OneTrackStatBean("c_pa_v3", "56.4.5.1.21797");
        Object[] objArr = new Object[8];
        objArr[0] = "name";
        objArr[1] = "sleeping_detail_page";
        objArr[2] = "page_fragment";
        objArr[3] = "day";
        objArr[4] = "title";
        objArr[5] = "睡眠";
        objArr[6] = "data";
        objArr[7] = this.allDaySleepReport == null ? "0" : "1";
        oneTrackExtKt.reportData(oneTrackStatBean, objArr);
        super.onInvisible();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        LiveDataBus.INSTANCE.get().with("stop_media").postValue(Boolean.TRUE);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        LocalDate localDateNow;
        super.onResume();
        View view = this.containerView;
        if (view != null) {
            view.requestLayout();
        }
        updateSleepPermissionSettingInstruction();
        upDateSleepAudioInstruction();
        SleepScoreEvaluationHolder sleepScoreEvaluationHolder = this.sleepScoreEvaluationHolder;
        SleepDayDetailAdapter sleepDayDetailAdapter = null;
        if (sleepScoreEvaluationHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepScoreEvaluationHolder");
            sleepScoreEvaluationHolder = null;
        }
        sleepScoreEvaluationHolder.onResume();
        SleepDayDetailAdapter sleepDayDetailAdapter2 = this.sleepDayDetailAdapter;
        if (sleepDayDetailAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepDayDetailAdapter");
            sleepDayDetailAdapter2 = null;
        }
        sleepDayDetailAdapter2.setShowNoDataAudio(((SleepViewModel) getMViewModel()).sleepAudioIsEnabled());
        SleepDayDetailAdapter sleepDayDetailAdapter3 = this.sleepDayDetailAdapter;
        if (sleepDayDetailAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepDayDetailAdapter");
        } else {
            sleepDayDetailAdapter = sleepDayDetailAdapter3;
        }
        sleepDayDetailAdapter.notifyDataSetChanged();
        Integer num = this.currentPosition;
        if (num != null) {
            localDateNow = LocalDate.now().minusDays(num.intValue());
            if (localDateNow == null) {
                localDateNow = LocalDate.now();
            }
        } else {
            localDateNow = LocalDate.now();
        }
        if (!localDateNow.isEqual(this.currentLocalDate)) {
            Logger.i(TAG, "date change old:" + this.currentLocalDate + " new:" + localDateNow);
            this.currentLocalDate = localDateNow;
            triggerFetchFitnessReport();
        }
        ((SleepViewModel) getMViewModel()).getSleepInterferePlan();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0032  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        LocalDate localDateNow;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        this.currentPosition = arguments != null ? Integer.valueOf(arguments.getInt("offset", 0)) : null;
        initView();
        Integer num = this.currentPosition;
        if (num != null) {
            localDateNow = LocalDate.now().minusDays(num.intValue());
            if (localDateNow == null) {
                localDateNow = LocalDate.now();
            }
        } else {
            localDateNow = LocalDate.now();
        }
        this.currentLocalDate = localDateNow;
        triggerFetchFitnessReport();
        ((SleepViewModel) getMViewModel()).queryLatestSleepAnimalLiveData().observe(getViewLifecycleOwner(), new SleepDayItemFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: yjm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepDayItemFragment.onViewCreated$lambda$5(this.f40249a, (SleepAnimalReport) obj);
            }
        }));
        initPermissionInstructionView();
        updateSleepPermissionSettingInstruction();
        upDateSleepAudioInstruction();
    }
}
