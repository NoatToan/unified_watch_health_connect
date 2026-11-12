package com.xiaomi.fitness.health.sleep.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DateTimePickerDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.health.sleep.ui.SleepAddRecordFragment;
import com.xiaomi.fitness.health.sleep.view.SleepViewModel;
import defpackage.c0j;
import defpackage.eri;
import defpackage.jui;
import defpackage.k5g;
import defpackage.kca;
import defpackage.nuf;
import defpackage.wc0;
import defpackage.yaa;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 X2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001XB\u0007¢\u0006\u0004\bW\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\u0007J\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0007J\u000f\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u0007J\u000f\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u0007J\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b!\u0010\u001dJ!\u0010%\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b%\u0010&J'\u0010)\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b)\u0010*R\"\u0010+\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u0010\u0018R\"\u00100\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010,\u001a\u0004\b1\u0010.\"\u0004\b2\u0010\u0018R*\u00105\u001a\n\u0012\u0004\u0012\u000204\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082D¢\u0006\u0006\n\u0004\b<\u0010=R\"\u0010?\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u0010@\u001a\u0004\bF\u0010B\"\u0004\bG\u0010DR\"\u0010H\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010@\u001a\u0004\bI\u0010B\"\u0004\bJ\u0010DR\"\u0010K\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010@\u001a\u0004\bL\u0010B\"\u0004\bM\u0010DR\"\u0010N\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010@\u001a\u0004\bO\u0010B\"\u0004\bP\u0010DR\"\u0010Q\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010@\u001a\u0004\bR\u0010B\"\u0004\bS\u0010DR\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010V¨\u0006Y"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/SleepAddRecordFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/sleep/view/SleepViewModel;", "Lkca;", "Lyaa;", "", "initActionBar", "()V", "initViews", "checkRecordValidityAndSave", "saveRecordToDatabaseAndFinish", "showWhetherToOverrideDialogIfNeed", "quitAddingAndGoBack", "showBedTimeDialogIfNeed", "showWakeupTimeDialogIfNeed", "", "getNormalDateRange", "()[J", "Ljava/util/Calendar;", "getOneMonthAgoCalendar", "()Ljava/util/Calendar;", "", "newTimeInMills", "updateBedTimeDisplay", "(J)V", "updateWakeUpTimeDisplay", "Landroid/os/Bundle;", "data", "handleBedTimeSelected", "(Landroid/os/Bundle;)V", "", "recordBoundaryIsInvalid", "()I", "handleWakeUpTimeSelected", "Landroid/view/View;", "view", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "onFragmentResult", "(IILandroid/os/Bundle;)V", "mBedTimeInMills", "J", "getMBedTimeInMills", "()J", "setMBedTimeInMills", "mWakeUpTimeInMills", "getMWakeUpTimeInMills", "setMWakeUpTimeInMills", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "whetherToOverrideDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "getWhetherToOverrideDialog", "()Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "setWhetherToOverrideDialog", "(Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;)V", "", "TAG", "Ljava/lang/String;", "Landroid/widget/TextView;", "bedTimeTv", "Landroid/widget/TextView;", "getBedTimeTv", "()Landroid/widget/TextView;", "setBedTimeTv", "(Landroid/widget/TextView;)V", "bedTimeTitle", "getBedTimeTitle", "setBedTimeTitle", "bedTimeDate", "getBedTimeDate", "setBedTimeDate", "wakeUpTimeTv", "getWakeUpTimeTv", "setWakeUpTimeTv", "wakeUpTimeTitle", "getWakeUpTimeTitle", "setWakeUpTimeTitle", "wakeUpTimeDate", "getWakeUpTimeDate", "setWakeUpTimeDate", "Lk5g$a;", "mMiuiEditModeActionBarListener", "Lk5g$a;", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepAddRecordFragment extends Hilt_SleepAddRecordFragment<SleepViewModel, kca> implements yaa {
    public static final int REQ_CODE_BED_TIME = 0;
    public static final int REQ_CODE_WAKE_UP_TIME = 1;
    public static final int REQ_OVERRIDE_HISTORY_RECORDS = 2;

    @NotNull
    public static final String SID_MANUAL_RECORD = "xiaomiwear_app_manually";
    public static final int SLEEP_DURATION_TOO_LONG = 20;
    public static final int WAKEUP_TIME_BEFORE_BED_TIME = 10;

    @NotNull
    private final String TAG;
    public TextView bedTimeDate;
    public TextView bedTimeTitle;
    public TextView bedTimeTv;
    private long mBedTimeInMills;

    @NotNull
    private final k5g.a mMiuiEditModeActionBarListener;
    private long mWakeUpTimeInMills;
    public TextView wakeUpTimeDate;
    public TextView wakeUpTimeTitle;
    public TextView wakeUpTimeTv;

    @Nullable
    private CommonDialog<DialogParams> whetherToOverrideDialog;

    public SleepAddRecordFragment() {
        super(jui.U0);
        this.TAG = "SleepAddRecordFragment";
        this.mMiuiEditModeActionBarListener = new k5g.a() { // from class: com.xiaomi.fitness.health.sleep.ui.SleepAddRecordFragment$mMiuiEditModeActionBarListener$1
            @Override // k5g.a
            public void onCancelClicked(View view) {
                Intrinsics.checkNotNullParameter(view, "view");
                this.this$0.quitAddingAndGoBack();
            }

            @Override // k5g.a
            public void onSaveClicked(View view) {
                Intrinsics.checkNotNullParameter(view, "view");
                this.this$0.checkRecordValidityAndSave();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void checkRecordValidityAndSave() {
        if (recordBoundaryIsInvalid() == 10) {
            Context context = getContext();
            if (context != null) {
                ToastExtKt.toastLong(context, c0j.Ro);
                return;
            }
            return;
        }
        if (recordBoundaryIsInvalid() == 20) {
            Context context2 = getContext();
            if (context2 != null) {
                ToastExtKt.toastLong(context2, c0j.Bf);
                return;
            }
            return;
        }
        if (((SleepViewModel) getMViewModel()).hasOverlayWithHistoryRecords(this.mBedTimeInMills, this.mWakeUpTimeInMills)) {
            showWhetherToOverrideDialogIfNeed();
        } else {
            saveRecordToDatabaseAndFinish();
        }
    }

    private final long[] getNormalDateRange() {
        return new long[]{getOneMonthAgoCalendar().getTimeInMillis(), TimeUtils.getBeginOfToday()};
    }

    private final Calendar getOneMonthAgoCalendar() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(2, -1);
        Intrinsics.checkNotNull(calendar);
        return calendar;
    }

    private final void handleBedTimeSelected(Bundle data) {
        updateBedTimeDisplay(data.getLong("key_select_mills", System.currentTimeMillis()));
    }

    private final void handleWakeUpTimeSelected(Bundle data) {
        updateWakeUpTimeDisplay(data.getLong("key_select_mills", System.currentTimeMillis()));
    }

    private final void initActionBar() {
        wc0 actionBar = getActionBar();
        if (actionBar != null) {
            k5g.d(requireContext(), actionBar, c0j.D, this.mMiuiEditModeActionBarListener);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initViews() {
        setBedTimeTitle((TextView) ((kca) getMBinding()).A.findViewById(eri.bn));
        getBedTimeTitle().setText(c0j.Wd);
        setBedTimeTv((TextView) ((kca) getMBinding()).A.findViewById(eri.f16991a));
        setBedTimeDate((TextView) ((kca) getMBinding()).A.findViewById(eri.Dk));
        setWakeUpTimeTitle((TextView) ((kca) getMBinding()).C.findViewById(eri.bn));
        getWakeUpTimeTitle().setText(c0j.Fk);
        setWakeUpTimeTv((TextView) ((kca) getMBinding()).C.findViewById(eri.f16991a));
        setWakeUpTimeDate((TextView) ((kca) getMBinding()).C.findViewById(eri.Dk));
        nuf.g(((kca) getMBinding()).A);
        nuf.g(((kca) getMBinding()).C);
        long jCurrentTimeMillis = System.currentTimeMillis();
        updateWakeUpTimeDisplay(jCurrentTimeMillis);
        updateBedTimeDisplay(jCurrentTimeMillis - ((long) 28800000));
        ((kca) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: ffm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepAddRecordFragment.initViews$lambda$1(this.f17744a, view);
            }
        });
        ((kca) getMBinding()).C.setOnClickListener(new View.OnClickListener() { // from class: gfm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepAddRecordFragment.initViews$lambda$2(this.f18929a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$1(SleepAddRecordFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showBedTimeDialogIfNeed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$2(SleepAddRecordFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showWakeupTimeDialogIfNeed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void quitAddingAndGoBack() {
        requireActivity().onBackPressed();
    }

    private final int recordBoundaryIsInvalid() {
        long j = this.mWakeUpTimeInMills;
        long j2 = this.mBedTimeInMills;
        if (j <= j2) {
            return 10;
        }
        return j - j2 > 86400000 ? 20 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void saveRecordToDatabaseAndFinish() {
        SleepSegmentReport sleepSegmentReportBuild = new SleepSegmentReport.Builder().build();
        sleepSegmentReportBuild.setSid("xiaomiwear_app_manually");
        long j = 1000;
        sleepSegmentReportBuild.setWakeupTime(this.mWakeUpTimeInMills / j);
        sleepSegmentReportBuild.setBedTime(this.mBedTimeInMills / j);
        int i = (int) ((this.mWakeUpTimeInMills - this.mBedTimeInMills) / ((long) 60000));
        sleepSegmentReportBuild.setTzIn15Min(FitnessDateUtils.getCurrentTZOffsetIn15min());
        sleepSegmentReportBuild.setSleepDuration(i);
        ((SleepViewModel) getMViewModel()).insertRecordToDatabase(sleepSegmentReportBuild);
        finish();
    }

    private final void showBedTimeDialogIfNeed() {
        DateTimePickerDialog dateTimePickerDialogCreate = new DateTimePickerDialog.a(getString(c0j.Wd)).setCustomLayoutId(jui.Y6).setPositiveText(c0j.J7).setNegativeText(c0j.D7).setCancelable(false).setDialogTitle(c0j.Wd).create();
        Logger.d(this.TAG, "mBedTimePickerDialog " + dateTimePickerDialogCreate);
        if (dateTimePickerDialogCreate != null) {
            dateTimePickerDialogCreate.setRequestCode(0);
        }
        long[] normalDateRange = getNormalDateRange();
        if (dateTimePickerDialogCreate != null) {
            dateTimePickerDialogCreate.B(normalDateRange[0]);
        }
        if (dateTimePickerDialogCreate != null) {
            dateTimePickerDialogCreate.A(System.currentTimeMillis());
        }
        if (dateTimePickerDialogCreate != null) {
            dateTimePickerDialogCreate.y(this.mBedTimeInMills);
        }
        if (dateTimePickerDialogCreate != null) {
            dateTimePickerDialogCreate.showIfNeed(getChildFragmentManager());
        }
    }

    private final void showWakeupTimeDialogIfNeed() {
        DateTimePickerDialog dateTimePickerDialogCreate = new DateTimePickerDialog.a(getString(c0j.Fk)).setCustomLayoutId(jui.Y6).setPositiveText(c0j.J7).setNegativeText(c0j.D7).setCancelable(false).setDialogTitle(c0j.Fk).create();
        Logger.d(this.TAG, "mWakeupTimePickerDialog " + dateTimePickerDialogCreate);
        if (dateTimePickerDialogCreate != null) {
            dateTimePickerDialogCreate.setRequestCode(1);
        }
        long[] normalDateRange = getNormalDateRange();
        if (dateTimePickerDialogCreate != null) {
            dateTimePickerDialogCreate.B(normalDateRange[0]);
        }
        if (dateTimePickerDialogCreate != null) {
            dateTimePickerDialogCreate.A(System.currentTimeMillis());
        }
        if (dateTimePickerDialogCreate != null) {
            dateTimePickerDialogCreate.y(this.mWakeUpTimeInMills);
        }
        if (dateTimePickerDialogCreate != null) {
            dateTimePickerDialogCreate.showIfNeed(getChildFragmentManager());
        }
    }

    private final void showWhetherToOverrideDialogIfNeed() {
        if (this.whetherToOverrideDialog == null) {
            this.whetherToOverrideDialog = new CommonDialog.c("WhetherToOverride").setDialogTitle(c0j.uh).setDialogDescription(c0j.Gk).setPositiveText(c0j.e).setNegativeText(c0j.c).setCancelable(false).create();
        }
        CommonDialog<DialogParams> commonDialog = this.whetherToOverrideDialog;
        if (commonDialog != null) {
            commonDialog.setRequestCode(2);
        }
        CommonDialog<DialogParams> commonDialog2 = this.whetherToOverrideDialog;
        if (commonDialog2 != null) {
            commonDialog2.showIfNeed(getChildFragmentManager());
        }
    }

    private final void updateBedTimeDisplay(long newTimeInMills) {
        this.mBedTimeInMills = newTimeInMills;
        Logger.d("SLEEP updateBedTimeDisplay mBedTimeInMills " + newTimeInMills, new Object[0]);
        String dateHHmm24Format = TimeDateUtil.getDateHHmm24Format(this.mBedTimeInMills / ((long) 1000));
        Logger.d("SLEEP updateBedTimeDisplay bedTimeHHmm " + dateHHmm24Format, new Object[0]);
        getBedTimeTv().setText(dateHHmm24Format);
        getBedTimeDate().setText(TimeDateUtil.getDateMMddNumberFormat(this.mBedTimeInMills));
    }

    private final void updateWakeUpTimeDisplay(long newTimeInMills) {
        this.mWakeUpTimeInMills = newTimeInMills;
        Logger.d("SLEEP updateWakeUpTimeDisplay mWakeUpTimeInMills " + newTimeInMills, new Object[0]);
        String dateHHmm24Format = TimeDateUtil.getDateHHmm24Format(this.mWakeUpTimeInMills / ((long) 1000));
        Logger.d("SLEEP updateWakeUpTimeDisplay wakeUpTimeHHmm " + dateHHmm24Format, new Object[0]);
        getWakeUpTimeTv().setText(dateHHmm24Format);
        getWakeUpTimeDate().setText(TimeDateUtil.getDateMMddNumberFormat(this.mWakeUpTimeInMills));
    }

    @NotNull
    public final TextView getBedTimeDate() {
        TextView textView = this.bedTimeDate;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bedTimeDate");
        return null;
    }

    @NotNull
    public final TextView getBedTimeTitle() {
        TextView textView = this.bedTimeTitle;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bedTimeTitle");
        return null;
    }

    @NotNull
    public final TextView getBedTimeTv() {
        TextView textView = this.bedTimeTv;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bedTimeTv");
        return null;
    }

    public final long getMBedTimeInMills() {
        return this.mBedTimeInMills;
    }

    public final long getMWakeUpTimeInMills() {
        return this.mWakeUpTimeInMills;
    }

    @NotNull
    public final TextView getWakeUpTimeDate() {
        TextView textView = this.wakeUpTimeDate;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("wakeUpTimeDate");
        return null;
    }

    @NotNull
    public final TextView getWakeUpTimeTitle() {
        TextView textView = this.wakeUpTimeTitle;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("wakeUpTimeTitle");
        return null;
    }

    @NotNull
    public final TextView getWakeUpTimeTv() {
        TextView textView = this.wakeUpTimeTv;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("wakeUpTimeTv");
        return null;
    }

    @Nullable
    public final CommonDialog<DialogParams> getWhetherToOverrideDialog() {
        return this.whetherToOverrideDialog;
    }

    @Override // defpackage.yaa
    public void onFragmentResult(int requestCode, int resultCode, @NotNull Bundle data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (requestCode == 0 && resultCode == -1) {
            handleBedTimeSelected(data);
            return;
        }
        if (requestCode == 1 && resultCode == -1) {
            handleWakeUpTimeSelected(data);
        } else if (requestCode == 2 && resultCode == -1) {
            saveRecordToDatabaseAndFinish();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initActionBar();
        initViews();
    }

    public final void setBedTimeDate(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.bedTimeDate = textView;
    }

    public final void setBedTimeTitle(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.bedTimeTitle = textView;
    }

    public final void setBedTimeTv(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.bedTimeTv = textView;
    }

    public final void setMBedTimeInMills(long j) {
        this.mBedTimeInMills = j;
    }

    public final void setMWakeUpTimeInMills(long j) {
        this.mWakeUpTimeInMills = j;
    }

    public final void setWakeUpTimeDate(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.wakeUpTimeDate = textView;
    }

    public final void setWakeUpTimeTitle(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.wakeUpTimeTitle = textView;
    }

    public final void setWakeUpTimeTv(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.wakeUpTimeTv = textView;
    }

    public final void setWhetherToOverrideDialog(@Nullable CommonDialog<DialogParams> commonDialog) {
        this.whetherToOverrideDialog = commonDialog;
    }
}
