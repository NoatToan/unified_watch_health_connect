package com.xiaomi.fitness.health.sleep;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fitness.baseui.dialog.DateTimePickerDialog;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.GoToBedTimeCalibrateFragment;
import com.xiaomi.fitness.health.sleep.ui.adapter.SleepEfficiencyHolder;
import com.xiaomi.fitness.health.sleep.view.SleepViewModel;
import com.xiaomi.fitness.repo.RepositoryManager;
import defpackage.c0j;
import defpackage.eri;
import defpackage.iji;
import defpackage.ili;
import defpackage.io0;
import defpackage.jui;
import defpackage.m8e;
import defpackage.nuf;
import defpackage.pni;
import defpackage.yaa;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 72\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u00017B\u0007¢\u0006\u0004\b6\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u0007J\u001d\u0010\u0011\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0007J\u000f\u0010\u0014\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0007J\u0017\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001a\u0010\u0007J\u000f\u0010\u001b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001b\u0010\u0007J!\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001f\u0010 J'\u0010$\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b$\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010+R\u0016\u0010/\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010+R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00105\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00068"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/GoToBedTimeCalibrateFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseSpringBackBindingFragment;", "Lcom/xiaomi/fitness/health/sleep/view/SleepViewModel;", "Lio0;", "Lyaa;", "", "createStickyButton", "()V", "showGoToBedTimeDialogIfNeed", "updateLieInBedDuration", "", "getGoToBedTimeRange", "()[J", "getLeaveBedTimeRange", "showLeaveBedTimeDialogIfNeed", "Lkotlin/Function0;", "callback", "checkSleepTimeDiffAndOnSuccess", "(Lkotlin/jvm/functions/Function0;)V", "initBasicUi", "setCardClickListener", "Landroid/os/Bundle;", "data", "handleSelectedGoToBedTime", "(Landroid/os/Bundle;)V", "handleSelectedWakeUpTime", "updateGoToBedTimeDisplay", "updateLeaveBedTimeDisplay", "Landroid/view/View;", "view", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "onFragmentResult", "(IILandroid/os/Bundle;)V", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "mSegmentReport", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "", "allDaySleepTimestampInSec", "J", "mGoToBedTimestampInSec", "Ljava/lang/Long;", "mBedTime", "mWakeUpTime", "Landroid/widget/TextView;", "mStickyButton", "Landroid/widget/TextView;", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class GoToBedTimeCalibrateFragment extends Hilt_GoToBedTimeCalibrateFragment<SleepViewModel, io0> implements yaa {
    public static final int REQ_CODE_CALIBRATE_GO_TO_BED_TIME = 111;
    public static final int REQ_CODE_CALIBRATE_LEAVE_BED_TIME = 222;

    @NotNull
    public static final String TAG = "GoToBedTimeCalibrateFragment";

    @NotNull
    private static final String TIMESTAMP_PLACEHOLDER = "--:--";
    private long allDaySleepTimestampInSec;
    private long mBedTime;

    @Nullable
    private Long mGoToBedTimestampInSec = 0L;

    @Nullable
    private SleepSegmentReport mSegmentReport;
    private TextView mStickyButton;
    private long mWakeUpTime;

    private final void checkSleepTimeDiffAndOnSuccess(Function0<Unit> callback) {
        Long l = this.mGoToBedTimestampInSec;
        if (l == null) {
            Application application = ApplicationExtKt.getApplication();
            String string = getString(c0j.Rf);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            ToastExtKt.toastShort(application, string);
            return;
        }
        Intrinsics.checkNotNull(l);
        if (l.longValue() > this.mBedTime) {
            ToastExtKt.toastShort(ApplicationExtKt.getApplication(), c0j.ge);
            return;
        }
        long j = this.mWakeUpTime;
        Long l2 = this.mGoToBedTimestampInSec;
        Intrinsics.checkNotNull(l2);
        if (j <= l2.longValue()) {
            ToastExtKt.toastShort(ApplicationExtKt.getApplication(), c0j.Rf);
        } else {
            callback.invoke();
        }
    }

    private final void createStickyButton() {
        TextView textView = new TextView(requireContext());
        textView.setId(eri.i1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(textView.getResources().getDimensionPixelSize(ili.common_btn_single_line_width), textView.getResources().getDimensionPixelSize(ili.common_btn_height));
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) (textView.getResources().getDisplayMetrics().density * 26.67f);
        textView.setLayoutParams(layoutParams);
        textView.setBackground(textView.getResources().getDrawable(pni.z2));
        textView.setText(c0j.e);
        textView.setTextColor(textView.getResources().getColor(iji.I3));
        textView.setTextSize(17.42f);
        textView.setGravity(17);
        this.mStickyButton = textView;
        ViewExtKt.clickWithTrigger$default(textView, 0L, new Function1() { // from class: z0b
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GoToBedTimeCalibrateFragment.createStickyButton$lambda$5(this.f40746a, (TextView) obj);
            }
        }, 1, null);
        ViewParent parent = requireView().getParent();
        TextView textView2 = null;
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            TextView textView3 = this.mStickyButton;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mStickyButton");
                textView3 = null;
            }
            viewGroup.addView(textView3);
        }
        TextView textView4 = this.mStickyButton;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStickyButton");
        } else {
            textView2 = textView4;
        }
        textView2.post(new Runnable() { // from class: a1b
            @Override // java.lang.Runnable
            public final void run() {
                GoToBedTimeCalibrateFragment.createStickyButton$lambda$6(this.f518a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createStickyButton$lambda$5(final GoToBedTimeCalibrateFragment this$0, TextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.checkSleepTimeDiffAndOnSuccess(new Function0() { // from class: c1b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GoToBedTimeCalibrateFragment.createStickyButton$lambda$5$lambda$4(this.f4820a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createStickyButton$lambda$5$lambda$4(final GoToBedTimeCalibrateFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.checkSleepTimeDiffAndOnSuccess(new Function0() { // from class: b1b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GoToBedTimeCalibrateFragment.createStickyButton$lambda$5$lambda$4$lambda$3(this.f3677a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit createStickyButton$lambda$5$lambda$4$lambda$3(GoToBedTimeCalibrateFragment this$0) {
        SleepSegmentReport sleepSegmentReport;
        SleepSegmentReport sleepSegmentReport2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SleepSegmentReport sleepSegmentReport3 = this$0.mSegmentReport;
        if (sleepSegmentReport3 == null) {
            return Unit.INSTANCE;
        }
        if (sleepSegmentReport3 != null) {
            sleepSegmentReport3.setLeaveBedTime(Long.valueOf(this$0.mWakeUpTime));
        }
        SleepSegmentReport sleepSegmentReport4 = this$0.mSegmentReport;
        if (sleepSegmentReport4 != null) {
            sleepSegmentReport4.setGoBedTime(this$0.mGoToBedTimestampInSec);
        }
        SleepSegmentReport sleepSegmentReport5 = this$0.mSegmentReport;
        if (sleepSegmentReport5 != null) {
            sleepSegmentReport5.setWakeupTime(this$0.mWakeUpTime);
        }
        Long l = this$0.mGoToBedTimestampInSec;
        if (l != null && (sleepSegmentReport2 = this$0.mSegmentReport) != null) {
            long j = this$0.mWakeUpTime;
            Intrinsics.checkNotNull(l);
            sleepSegmentReport2.setLinBedDuration(Long.valueOf(j - l.longValue()));
        }
        Long l2 = this$0.mGoToBedTimestampInSec;
        if (l2 != null && (sleepSegmentReport = this$0.mSegmentReport) != null) {
            long j2 = this$0.mBedTime;
            Intrinsics.checkNotNull(l2);
            sleepSegmentReport.setEntrySleepDuration(Long.valueOf(j2 - l2.longValue()));
        }
        Logger.i(TAG, "checkSleepTimeDiffAndOnSuccess mSegmentReport=" + this$0.mSegmentReport);
        SleepSegmentReport sleepSegmentReport6 = this$0.mSegmentReport;
        Integer sleepEfficiency = sleepSegmentReport6 != null ? sleepSegmentReport6.getSleepEfficiency() : null;
        SleepSegmentReport sleepSegmentReport7 = this$0.mSegmentReport;
        Long linBedDuration = sleepSegmentReport7 != null ? sleepSegmentReport7.getLinBedDuration() : null;
        SleepSegmentReport sleepSegmentReport8 = this$0.mSegmentReport;
        Long entrySleepDuration = sleepSegmentReport8 != null ? sleepSegmentReport8.getEntrySleepDuration() : null;
        SleepSegmentReport sleepSegmentReport9 = this$0.mSegmentReport;
        Long leaveBedTime = sleepSegmentReport9 != null ? sleepSegmentReport9.getLeaveBedTime() : null;
        SleepSegmentReport sleepSegmentReport10 = this$0.mSegmentReport;
        Logger.i(TAG, "checkSleepTimeDiffAndOnSuccess sleepEfficiency... , sleepEfficiency = " + sleepEfficiency + ", linBedDuration = " + linBedDuration + ", entrySleepDuration = " + entrySleepDuration + ", leaveBedTime = " + leaveBedTime + ", goBedTime = " + (sleepSegmentReport10 != null ? sleepSegmentReport10.getGoBedTime() : null));
        SleepViewModel sleepViewModel = (SleepViewModel) this$0.getMViewModel();
        SleepSegmentReport sleepSegmentReport11 = this$0.mSegmentReport;
        Intrinsics.checkNotNull(sleepSegmentReport11);
        sleepViewModel.calibrateSleepSegmentReport(sleepSegmentReport11);
        Intent intent = new Intent();
        intent.putExtra("refresh?", true);
        this$0.requireActivity().setResult(-1, intent);
        this$0.requireActivity().finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createStickyButton$lambda$6(GoToBedTimeCalibrateFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TextView textView = this$0.mStickyButton;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStickyButton");
            textView = null;
        }
        nuf.g(textView);
    }

    private final long[] getGoToBedTimeRange() {
        long j = this.allDaySleepTimestampInSec;
        long j2 = RepositoryManager.GAP_A_DAY;
        long j3 = 1000;
        long[] jArr = {(j - j2) * j3, ((j + j2) * j3) - 1};
        Logger.d(TAG, "getGoToBedTimeRange result[0]=" + jArr[0] + " result=" + jArr[1]);
        return jArr;
    }

    private final long[] getLeaveBedTimeRange() {
        long j = this.allDaySleepTimestampInSec;
        long j2 = 1000;
        long[] jArr = {j * j2, RangesKt___RangesKt.coerceAtMost((j + ((long) 172800)) * j2, System.currentTimeMillis())};
        Logger.d(TAG, "getLeaveBedTimeRange result[0]=" + jArr[0] + " result=" + jArr[1]);
        return jArr;
    }

    private final void handleSelectedGoToBedTime(Bundle data) {
        this.mGoToBedTimestampInSec = Long.valueOf(data.getLong("key_select_mills", System.currentTimeMillis()) / ((long) 1000));
        updateGoToBedTimeDisplay();
        updateLieInBedDuration();
    }

    private final void handleSelectedWakeUpTime(Bundle data) {
        this.mWakeUpTime = data.getLong("key_select_mills", System.currentTimeMillis()) / ((long) 1000);
        updateLeaveBedTimeDisplay();
        updateLieInBedDuration();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initBasicUi() {
        Long linBedDuration;
        setTitle(c0j.Qf);
        ((io0) getMBinding()).D.setText(c0j.ih);
        TextView textView = ((io0) getMBinding()).E;
        SleepSegmentReport sleepSegmentReport = this.mSegmentReport;
        textView.setText(TimeDateUtil.getZNTimeWithMin(((sleepSegmentReport == null || (linBedDuration = sleepSegmentReport.getLinBedDuration()) == null) ? 0 : (int) linBedDuration.longValue()) / 60));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setCardClickListener() {
        SleepSegmentReport sleepSegmentReport = this.mSegmentReport;
        Long goBedTime = sleepSegmentReport != null ? sleepSegmentReport.getGoBedTime() : null;
        nuf.g(((io0) getMBinding()).H);
        nuf.g(((io0) getMBinding()).J);
        this.mGoToBedTimestampInSec = goBedTime;
        updateGoToBedTimeDisplay();
        updateLeaveBedTimeDisplay();
        ((io0) getMBinding()).G.D.setText(c0j.Pf);
        ((io0) getMBinding()).I.D.setText(c0j.Fk);
        ViewExtKt.clickWithTrigger$default(((io0) getMBinding()).H, 0L, new Function1() { // from class: d1b
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GoToBedTimeCalibrateFragment.setCardClickListener$lambda$7(this.f14954a, (CardView) obj);
            }
        }, 1, null);
        updateLieInBedDuration();
        ViewExtKt.clickWithTrigger$default(((io0) getMBinding()).J, 0L, new Function1() { // from class: e1b
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GoToBedTimeCalibrateFragment.setCardClickListener$lambda$8(this.f16150a, (CardView) obj);
            }
        }, 1, null);
        m8e m8eVar = ((io0) getMBinding()).I;
        m8eVar.A.setTextColor(ExtUtilsKt.getColor(iji.common_btn_normal_text_color_unenabled));
        m8eVar.C.setTextColor(ExtUtilsKt.getColor(iji.common_btn_normal_text_color_unenabled));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setCardClickListener$lambda$7(GoToBedTimeCalibrateFragment this$0, CardView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.showGoToBedTimeDialogIfNeed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setCardClickListener$lambda$8(GoToBedTimeCalibrateFragment this$0, CardView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Toast.makeText(this$0.getContext(), this$0.getString(c0j.Ua), 0).show();
        return Unit.INSTANCE;
    }

    private final void showGoToBedTimeDialogIfNeed() {
        DateTimePickerDialog dateTimePickerDialogCreate = new DateTimePickerDialog.a(getString(c0j.Pf)).setCustomLayoutId(jui.Y6).setPositiveText(c0j.J7).setNegativeText(c0j.D7).setCancelable(false).setDialogTitle(c0j.Pf).create();
        if (dateTimePickerDialogCreate != null) {
            dateTimePickerDialogCreate.setRequestCode(111);
        }
        long[] goToBedTimeRange = getGoToBedTimeRange();
        if (dateTimePickerDialogCreate != null) {
            dateTimePickerDialogCreate.B(goToBedTimeRange[0]);
        }
        if (dateTimePickerDialogCreate != null) {
            dateTimePickerDialogCreate.A(goToBedTimeRange[1]);
        }
        if (dateTimePickerDialogCreate != null) {
            Long l = this.mGoToBedTimestampInSec;
            dateTimePickerDialogCreate.y((l != null ? l.longValue() : this.mBedTime) * ((long) 1000));
        }
        if (dateTimePickerDialogCreate != null) {
            dateTimePickerDialogCreate.showIfNeed(getChildFragmentManager());
        }
    }

    private final void showLeaveBedTimeDialogIfNeed() {
        DateTimePickerDialog dateTimePickerDialogCreate = new DateTimePickerDialog.a(getString(c0j.Fk)).setCustomLayoutId(jui.Y6).setPositiveText(c0j.J7).setNegativeText(c0j.D7).setCancelable(false).setDialogTitle(c0j.Fk).create();
        if (dateTimePickerDialogCreate != null) {
            dateTimePickerDialogCreate.setRequestCode(222);
        }
        long[] leaveBedTimeRange = getLeaveBedTimeRange();
        if (dateTimePickerDialogCreate != null) {
            dateTimePickerDialogCreate.B(leaveBedTimeRange[0]);
        }
        if (dateTimePickerDialogCreate != null) {
            dateTimePickerDialogCreate.A(leaveBedTimeRange[1]);
        }
        if (dateTimePickerDialogCreate != null) {
            dateTimePickerDialogCreate.y(this.mWakeUpTime * ((long) 1000));
        }
        if (dateTimePickerDialogCreate != null) {
            dateTimePickerDialogCreate.showIfNeed(getChildFragmentManager());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateGoToBedTimeDisplay() {
        if (this.mGoToBedTimestampInSec == null) {
            ((io0) getMBinding()).G.A.setText(TIMESTAMP_PLACEHOLDER);
        } else {
            TextView textView = ((io0) getMBinding()).G.A;
            Long l = this.mGoToBedTimestampInSec;
            Intrinsics.checkNotNull(l);
            textView.setText(TimeDateUtil.getHHmmLocalFormat(l.longValue()));
        }
        TextView textView2 = ((io0) getMBinding()).G.C;
        TimeDateUtil timeDateUtil = TimeDateUtil.INSTANCE;
        Long l2 = this.mGoToBedTimestampInSec;
        textView2.setText(timeDateUtil.getDateMMDDLocalFormat((l2 != null ? l2.longValue() : this.mBedTime) * ((long) 1000)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateLeaveBedTimeDisplay() {
        ((io0) getMBinding()).I.A.setText(TimeDateUtil.getHHmmLocalFormat(this.mWakeUpTime));
        ((io0) getMBinding()).I.C.setText(TimeDateUtil.INSTANCE.getDateMMDDLocalFormat(this.mWakeUpTime * ((long) 1000)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateLieInBedDuration() {
        Long l = this.mGoToBedTimestampInSec;
        if (l == null) {
            ((io0) getMBinding()).E.setText(TIMESTAMP_PLACEHOLDER);
            return;
        }
        long j = this.mWakeUpTime;
        Intrinsics.checkNotNull(l);
        ((io0) getMBinding()).E.setText(TimeDateUtil.getZNTimeWithMin((int) ((j - l.longValue()) / ((long) 60))));
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    /* JADX INFO: renamed from: getLayoutId */
    public int getMContentLayoutId() {
        return jui.h;
    }

    @Override // defpackage.yaa
    public void onFragmentResult(int requestCode, int resultCode, @NotNull Bundle data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (requestCode == 111 && resultCode == -1) {
            handleSelectedGoToBedTime(data);
        } else if (requestCode == 222 && resultCode == -1) {
            handleSelectedWakeUpTime(data);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        createStickyButton();
        Bundle arguments = getArguments();
        SleepSegmentReport sleepSegmentReport = (SleepSegmentReport) (arguments != null ? arguments.getSerializable(SleepEfficiencyHolder.KEY_SLEEP_SEGMENT_REPORT) : null);
        this.mSegmentReport = sleepSegmentReport;
        Logger.d(TAG, "onViewCreated mSegmentReport=" + sleepSegmentReport);
        SleepSegmentReport sleepSegmentReport2 = this.mSegmentReport;
        if (sleepSegmentReport2 != null) {
            this.mBedTime = sleepSegmentReport2.getBedTime();
            SleepSegmentReport sleepSegmentReport3 = this.mSegmentReport;
            if (sleepSegmentReport3 != null) {
                this.mWakeUpTime = sleepSegmentReport3.getWakeupTime();
                Bundle arguments2 = getArguments();
                Long lValueOf = arguments2 != null ? Long.valueOf(arguments2.getLong(SleepEfficiencyHolder.KEY_ALL_DAY_SLEEP_TIMESTAMP)) : null;
                Intrinsics.checkNotNull(lValueOf, "null cannot be cast to non-null type kotlin.Long");
                this.allDaySleepTimestampInSec = lValueOf.longValue();
                initBasicUi();
                setTitleBackground(iji.T2);
                setCardClickListener();
            }
        }
    }
}
