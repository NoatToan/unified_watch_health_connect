package com.xiaomi.fitness.health.sleep.rhythm.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.lifecycle.LiveData;
import androidx.viewpager2.widget.ViewPager2;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.fitness.export.data.project.SleepRhythmReport;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.calendar.CalendarActivity;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.curse.data.CurseExtKt;
import com.xiaomi.fitness.health.export.HealthPageExtKt;
import com.xiaomi.fitness.health.export.IHealthPage;
import com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmMonitorViewModel;
import com.xiaomi.fitness.health.sleep.rhythm.calendar.SleepRhythmCalendarAdapter;
import com.xiaomi.fitness.health.sleep.rhythm.calendar.SleepRhythmCalendarDayData;
import com.xiaomi.fitness.health.sleep.rhythm.diary.SleepDiaryUpdateFragment;
import com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmDetailFragment;
import com.xiaomi.fitness.health.sleep.rhythm.ui.SleepRhythmCalendarActivity;
import com.xiaomi.fitness.health.sleep.rhythm.utils.SleepRhythmExtKt;
import com.xiaomi.fitness.health.sleep.utils.SleepTrackHelper;
import com.xiaomi.fitness.main.export.ConfigPreference;
import com.xiaomi.fitness.util.ExtUtilKt;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.view.TitleBarAlphaView;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import com.xiaomi.fitness.watch.face.edit.utils.Source;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.a4i;
import defpackage.av6;
import defpackage.c0j;
import defpackage.cob;
import defpackage.cv1;
import defpackage.eah;
import defpackage.eri;
import defpackage.fce;
import defpackage.iji;
import defpackage.jui;
import defpackage.nwi;
import defpackage.qxi;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 E2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001EB\u0007¢\u0006\u0004\bD\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J'\u0010\u0010\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0006J\u000f\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0006J\u000f\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0006J\u000f\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0006J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0006J\u000f\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0006J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001c\u0010\u0006J\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ\u0019\u0010 \u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0014¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\"\u0010\u0006R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001e\u00100\u001a\n /*\u0004\u0018\u00010\u00180\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R$\u00104\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u000203\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R \u0010<\u001a\f\u0012\u0006\u0012\u0004\u0018\u000106\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010A\u001a\u00020>8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010C\u001a\u00020>8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010@¨\u0006F"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/ui/SleepRhythmCalendarActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/health/sleep/rhythm/SleepRhythmMonitorViewModel;", "Lcob;", "", "registerObserver", "()V", "jumpDiaryOrDetailPageIfNeed", Constants.KEY_REQUEST_DATA, "requestLatestSleepRhythmReport", "autoEndRhythmIfNeed", "initView", "", Source.TIME_SECOND, "", "sid", "jumpDiaryRecordFragment", "(Ljava/lang/Long;Ljava/lang/String;)V", "initCalendarRecordView", "updateActionView", "dealEndMonitor", "updateTitleAndSubtitle", "initTitleBar", "showCalendar", "Lorg/joda/time/LocalDate;", DialWidgetType.DATE, "switchMonth", "(Lorg/joda/time/LocalDate;)V", "dealSleepRemindMenuClick", "updateTopBarSubtitle", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "Lcom/xiaomi/fitness/view/TitleBarAlphaView;", "titleBarAlphaView", "Lcom/xiaomi/fitness/view/TitleBarAlphaView;", "Lfce;", "calendarRecordBinding", "Lfce;", "Lcom/xiaomi/fitness/health/sleep/rhythm/calendar/SleepRhythmCalendarAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "getAdapter", "()Lcom/xiaomi/fitness/health/sleep/rhythm/calendar/SleepRhythmCalendarAdapter;", "adapter", "kotlin.jvm.PlatformType", "curDate", "Lorg/joda/time/LocalDate;", "", "Lcom/xiaomi/fitness/health/sleep/rhythm/calendar/SleepRhythmCalendarDayData;", "records", "Ljava/util/Map;", "Lcom/xiaomi/fit/fitness/export/data/project/SleepRhythmReport;", "latestRhythmReport", "Lcom/xiaomi/fit/fitness/export/data/project/SleepRhythmReport;", "endOfTodaySecond", "J", "Landroidx/lifecycle/LiveData;", "latestSleepRhythmBeforeTodayLiveData", "Landroidx/lifecycle/LiveData;", "", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepRhythmCalendarActivity extends Hilt_SleepRhythmCalendarActivity<SleepRhythmMonitorViewModel, cob> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "SleepDisorderUI";
    private fce calendarRecordBinding;
    private long endOfTodaySecond;

    @Nullable
    private SleepRhythmReport latestRhythmReport;

    @Nullable
    private LiveData<SleepRhythmReport> latestSleepRhythmBeforeTodayLiveData;

    @Nullable
    private Map<Long, SleepRhythmCalendarDayData> records;
    private TitleBarAlphaView titleBarAlphaView;

    /* JADX INFO: renamed from: adapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy adapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: fsm
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SleepRhythmCalendarActivity.adapter_delegate$lambda$0(this.f18163a);
        }
    });
    private LocalDate curDate = LocalDate.now();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/ui/SleepRhythmCalendarActivity$Companion;", "", "<init>", "()V", "TAG", "", "todayZeroMills", "", "getTodayZeroMills", "()J", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long getTodayZeroMills() {
            return CurseExtKt.getZeroMills(System.currentTimeMillis());
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.rhythm.ui.SleepRhythmCalendarActivity$initTitleBar$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/xiaomi/fitness/health/sleep/rhythm/ui/SleepRhythmCalendarActivity$initTitleBar$1", "Leah;", "Landroid/view/View;", "view", "", "onImgBackClick", "(Landroid/view/View;)V", "onImgShareClick", "onShowCalendar", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class C25211 implements eah {
        public C25211() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean onImgShareClick$lambda$0(SleepRhythmCalendarActivity this$0, MenuItem menuItem) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (menuItem.getItemId() != eri.Hb) {
                return true;
            }
            this$0.dealSleepRemindMenuClick();
            return true;
        }

        @Override // defpackage.eah
        public void onImgBackClick(View view) {
            SleepRhythmCalendarActivity.this.finish();
        }

        @Override // defpackage.eah
        public void onImgShareClick(View view) {
            SleepRhythmCalendarActivity sleepRhythmCalendarActivity = SleepRhythmCalendarActivity.this;
            Intrinsics.checkNotNull(view);
            a4i a4iVar = new a4i(sleepRhythmCalendarActivity, view);
            a4iVar.f(nwi.l);
            final SleepRhythmCalendarActivity sleepRhythmCalendarActivity2 = SleepRhythmCalendarActivity.this;
            a4iVar.setOnMenuItemClickListener(new a4i.c() { // from class: ism
                @Override // a4i.c
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    return SleepRhythmCalendarActivity.C25211.onImgShareClick$lambda$0(sleepRhythmCalendarActivity2, menuItem);
                }
            });
            a4iVar.g();
            SleepTrackHelper.INSTANCE.trackSleepRhythmCalendarMenuMoreClick();
        }

        @Override // defpackage.eah
        public void onShowCalendar() {
            SleepRhythmCalendarActivity.this.showCalendar();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ SleepRhythmMonitorViewModel access$getMViewModel(SleepRhythmCalendarActivity sleepRhythmCalendarActivity) {
        return (SleepRhythmMonitorViewModel) sleepRhythmCalendarActivity.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SleepRhythmCalendarAdapter adapter_delegate$lambda$0(SleepRhythmCalendarActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new SleepRhythmCalendarAdapter(this$0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void autoEndRhythmIfNeed() {
        SleepRhythmReport sleepRhythmReport = this.latestRhythmReport;
        if (sleepRhythmReport == null || sleepRhythmReport.getSid() == null) {
            return;
        }
        SleepRhythmReport sleepRhythmReport2 = this.latestRhythmReport;
        Intrinsics.checkNotNull(sleepRhythmReport2);
        if (sleepRhythmReport2.getType() == 0) {
            long todayZeroMills = INSTANCE.getTodayZeroMills();
            SleepRhythmReport sleepRhythmReport3 = this.latestRhythmReport;
            Intrinsics.checkNotNull(sleepRhythmReport3);
            if (todayZeroMills > sleepRhythmReport3.getEndTime() * ((long) 1000)) {
                SleepRhythmReport sleepRhythmReport4 = this.latestRhythmReport;
                Intrinsics.checkNotNull(sleepRhythmReport4);
                sleepRhythmReport4.setType(2);
                SleepRhythmMonitorViewModel sleepRhythmMonitorViewModel = (SleepRhythmMonitorViewModel) getMViewModel();
                SleepRhythmReport sleepRhythmReport5 = this.latestRhythmReport;
                Intrinsics.checkNotNull(sleepRhythmReport5);
                String sid = sleepRhythmReport5.getSid();
                Intrinsics.checkNotNull(sid);
                SleepRhythmReport sleepRhythmReport6 = this.latestRhythmReport;
                Intrinsics.checkNotNull(sleepRhythmReport6);
                sleepRhythmMonitorViewModel.addSleepRhyThmReport(sid, sleepRhythmReport6);
            }
        }
    }

    private final void dealEndMonitor() {
        if (this.latestRhythmReport == null) {
            return;
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            String did = wearableDeviceModel.getDid();
            SleepRhythmReport sleepRhythmReport = this.latestRhythmReport;
            Intrinsics.checkNotNull(sleepRhythmReport);
            if (Intrinsics.areEqual(did, sleepRhythmReport.getSid())) {
                if (!wearableDeviceModel.getIsDeviceConnected()) {
                    ToastExtKt.toastShort(this, c0j.f4801r);
                    return;
                }
                CommonDialog commonDialogCreate = (CommonDialog) getSupportFragmentManager().l0("end_rhythm_dialog");
                if (commonDialogCreate == null || !commonDialogCreate.isShowing()) {
                    if (commonDialogCreate == null) {
                        commonDialogCreate = new CommonDialog.c("end_rhythm_dialog").setDialogTitle(c0j.Mi).setDialogDescription(c0j.Li).setNegativeText(c0j.D7).setPositiveText(c0j.J7).create();
                        Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
                    }
                    commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.health.sleep.rhythm.ui.SleepRhythmCalendarActivity.dealEndMonitor.1
                        @Override // defpackage.av6
                        public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                            super.onDialogClick(dialogName, dialog, which);
                            if (which == -1) {
                                SleepRhythmReport sleepRhythmReport2 = SleepRhythmCalendarActivity.this.latestRhythmReport;
                                Intrinsics.checkNotNull(sleepRhythmReport2);
                                long time = sleepRhythmReport2.getTime();
                                SleepRhythmReport sleepRhythmReport3 = SleepRhythmCalendarActivity.this.latestRhythmReport;
                                Intrinsics.checkNotNull(sleepRhythmReport3);
                                sleepRhythmReport3.setCycleDay(TimeDateUtil.getIntervalDay(time * ((long) 1000), System.currentTimeMillis()) + 1);
                                SleepRhythmReport sleepRhythmReport4 = SleepRhythmCalendarActivity.this.latestRhythmReport;
                                Intrinsics.checkNotNull(sleepRhythmReport4);
                                sleepRhythmReport4.setType(1);
                                PageState.DefaultImpls.showLoading$default(SleepRhythmCalendarActivity.this, null, 0, false, 3, null);
                                SleepRhythmMonitorViewModel sleepRhythmMonitorViewModelAccess$getMViewModel = SleepRhythmCalendarActivity.access$getMViewModel(SleepRhythmCalendarActivity.this);
                                SleepRhythmReport sleepRhythmReport5 = SleepRhythmCalendarActivity.this.latestRhythmReport;
                                Intrinsics.checkNotNull(sleepRhythmReport5);
                                sleepRhythmMonitorViewModelAccess$getMViewModel.setSleepRhythmMonitor(sleepRhythmReport5);
                            }
                        }
                    });
                    commonDialogCreate.showIfNeed(getSupportFragmentManager());
                    return;
                }
                return;
            }
        }
        ToastExtKt.toastShort(this, c0j.Ni);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dealSleepRemindMenuClick() {
        SleepRhythmExtKt.checkDeviceSupportEffective(this, new Function1() { // from class: csm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepRhythmCalendarActivity.dealSleepRemindMenuClick$lambda$18(this.f14682a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dealSleepRemindMenuClick$lambda$18(SleepRhythmCalendarActivity this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            BaseFragmentExKt.gotoFragmentPage(this$0, SleepRhythmRemindSettingFragment.class, null, true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SleepRhythmCalendarAdapter getAdapter() {
        return (SleepRhythmCalendarAdapter) this.adapter.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initCalendarRecordView() {
        fce fceVar = ((cob) getMBinding()).A;
        this.calendarRecordBinding = fceVar;
        if (fceVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("calendarRecordBinding");
            fceVar = null;
        }
        ViewPager2 datePager = fceVar.B;
        Intrinsics.checkNotNullExpressionValue(datePager, "datePager");
        datePager.setAdapter(getAdapter());
        SleepRhythmCalendarAdapter adapter = getAdapter();
        LocalDate curDate = this.curDate;
        Intrinsics.checkNotNullExpressionValue(curDate, "curDate");
        datePager.k(adapter.getPos(curDate), false);
        datePager.h(new ViewPager2.i() { // from class: com.xiaomi.fitness.health.sleep.rhythm.ui.SleepRhythmCalendarActivity.initCalendarRecordView.1
            @Override // androidx.viewpager2.widget.ViewPager2.i
            public void onPageSelected(int position) {
                LocalDate dateFromPos = SleepRhythmCalendarActivity.this.getAdapter().getDateFromPos(position);
                SleepRhythmCalendarActivity.this.curDate = dateFromPos;
                Logger.d(SleepRhythmCalendarActivity.TAG, "onPageSelected: " + dateFromPos);
                SleepRhythmCalendarActivity.this.updateTitleAndSubtitle();
                SleepRhythmCalendarActivity sleepRhythmCalendarActivity = SleepRhythmCalendarActivity.this;
                LocalDate localDate = sleepRhythmCalendarActivity.curDate;
                Intrinsics.checkNotNullExpressionValue(localDate, "access$getCurDate$p(...)");
                sleepRhythmCalendarActivity.updateTopBarSubtitle(localDate);
            }
        });
        updateTitleAndSubtitle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initTitleBar() {
        this.titleBarAlphaView = ((cob) getMBinding()).H;
        setActionBarDisplayable(false);
        getWindow().getDecorView().setBackgroundResource(iji.T2);
        TitleBarAlphaView titleBarAlphaView = this.titleBarAlphaView;
        TitleBarAlphaView titleBarAlphaView2 = null;
        if (titleBarAlphaView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBarAlphaView");
            titleBarAlphaView = null;
        }
        titleBarAlphaView.setTitleClickable(true);
        TitleBarAlphaView titleBarAlphaView3 = this.titleBarAlphaView;
        if (titleBarAlphaView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBarAlphaView");
            titleBarAlphaView3 = null;
        }
        titleBarAlphaView3.updateTitleRes(c0j.vj);
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
        updateTopBarSubtitle(localDateNow);
        TitleBarAlphaView titleBarAlphaView4 = this.titleBarAlphaView;
        if (titleBarAlphaView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBarAlphaView");
        } else {
            titleBarAlphaView2 = titleBarAlphaView4;
        }
        titleBarAlphaView2.setOnTitleBarClickListener(new C25211());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        initCalendarRecordView();
        ((cob) getMBinding()).I.setOnClickListener(new View.OnClickListener() { // from class: gsm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepRhythmCalendarActivity.initView$lambda$7(this.f19302a, view);
            }
        });
        ((cob) getMBinding()).J.setOnClickListener(new View.OnClickListener() { // from class: hsm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepRhythmCalendarActivity.initView$lambda$8(this.f20410a, view);
            }
        });
        ((cob) getMBinding()).D.setOnClickListener(new View.OnClickListener() { // from class: trm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepRhythmCalendarActivity.initView$lambda$9(this.f34970a, view);
            }
        });
        ImageView secondhospital = ((cob) getMBinding()).G;
        Intrinsics.checkNotNullExpressionValue(secondhospital, "secondhospital");
        ((cob) getMBinding()).E.setOnClickListener(new View.OnClickListener() { // from class: urm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepRhythmCalendarActivity.initView$lambda$10(this.f36060a, view);
            }
        });
        fce fceVar = this.calendarRecordBinding;
        if (fceVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("calendarRecordBinding");
            fceVar = null;
        }
        fceVar.F.setOnClickListener(new View.OnClickListener() { // from class: vrm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepRhythmCalendarActivity.initView$lambda$12(this.f37165a, view);
            }
        });
        ((cob) getMBinding()).K.setOnClickListener(new View.OnClickListener() { // from class: wrm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepRhythmCalendarActivity.initView$lambda$13(this.f38289a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$10(SleepRhythmCalendarActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SleepTrackHelper.INSTANCE.trackSleepRhythmAllRecordEntranceClick();
        BaseFragmentExKt.gotoFragmentPage(this$0, SleepRhythmRecordListFragment.class, null, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initView$lambda$12(final SleepRhythmCalendarActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SleepTrackHelper.INSTANCE.trackSleepDailyRecordClick();
        ((SleepRhythmMonitorViewModel) this$0.getMViewModel()).queryJumpDiaryDateLiveData().observe(this$0, new SleepRhythmCalendarActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: esm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepRhythmCalendarActivity.initView$lambda$12$lambda$11(this.f17026a, (Long) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$12$lambda$11(SleepRhythmCalendarActivity this$0, Long l) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SleepRhythmReport sleepRhythmReport = this$0.latestRhythmReport;
        Logger.i(TAG, "queryJumpDiaryDate " + l + " sid " + (sleepRhythmReport != null ? sleepRhythmReport.getSid() : null));
        SleepRhythmReport sleepRhythmReport2 = this$0.latestRhythmReport;
        this$0.jumpDiaryRecordFragment(l, sleepRhythmReport2 != null ? sleepRhythmReport2.getSid() : null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$13(SleepRhythmCalendarActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        HealthPageExtKt.getInstance(IHealthPage.INSTANCE).goToHealthVisitDoctorPage(this$0, 98);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$7(SleepRhythmCalendarActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WebViewUtilKt.startWebView$default(HealthUtil.INSTANCE.getUnderstandSleepRhythm(), this$0.getString(c0j.Fj), false, false, null, false, null, false, 252, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$8(SleepRhythmCalendarActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WebViewUtilKt.startWebView$default("https://watch.iot.mi.com/html/general/index.html?locale=zh_cn#/sleep-health/about-research", this$0.getString(c0j.Ej), false, false, null, false, null, false, 252, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$9(SleepRhythmCalendarActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SleepTrackHelper.INSTANCE.trackSleepRhythmAllRecordEntranceClick();
        BaseFragmentExKt.gotoFragmentPage(this$0, SleepRhythmRecordListFragment.class, null, false);
    }

    private final void jumpDiaryOrDetailPageIfNeed() {
        SleepRhythmReport rhythmInfo;
        Map<Long, SleepRhythmCalendarDayData> map = this.records;
        if (map == null) {
            return;
        }
        Intrinsics.checkNotNull(map);
        LocalDate curDate = this.curDate;
        Intrinsics.checkNotNullExpressionValue(curDate, "curDate");
        SleepRhythmCalendarDayData sleepRhythmCalendarDayData = map.get(Long.valueOf(CurseExtKt.getZeroMills(ExtUtilKt.getMills(curDate)) / ((long) 1000)));
        if (sleepRhythmCalendarDayData == null) {
            return;
        }
        if (sleepRhythmCalendarDayData.getType() == 1 || (sleepRhythmCalendarDayData.getType() == 0 && sleepRhythmCalendarDayData.getRhythmInfo() != null)) {
            Long lValueOf = Long.valueOf(sleepRhythmCalendarDayData.getTime());
            SleepRhythmReport rhythmInfo2 = sleepRhythmCalendarDayData.getRhythmInfo();
            jumpDiaryRecordFragment(lValueOf, rhythmInfo2 != null ? rhythmInfo2.getSid() : null);
        } else if ((sleepRhythmCalendarDayData.getType() == 2 || sleepRhythmCalendarDayData.getType() == 3) && (rhythmInfo = sleepRhythmCalendarDayData.getRhythmInfo()) != null) {
            Bundle bundle = new Bundle();
            SleepRhythmReport sleepRhythmReport = new SleepRhythmReport(rhythmInfo.getType(), 1, sleepRhythmCalendarDayData.getTime());
            sleepRhythmReport.setSid(rhythmInfo.getSid());
            Unit unit = Unit.INSTANCE;
            bundle.putSerializable("report", sleepRhythmReport);
            BaseFragmentExKt.gotoFragmentPage(this, SleepRhythmDetailFragment.class, bundle, true);
        }
    }

    private final void jumpDiaryRecordFragment(Long timeSecond, String sid) {
        Bundle bundle;
        if (timeSecond == null) {
            bundle = null;
        } else {
            Bundle bundle2 = new Bundle();
            bundle2.putLong(SleepDiaryUpdateFragment.INTENT_REQUEST_TIME, timeSecond.longValue());
            bundle2.putString(SleepDiaryUpdateFragment.INTENT_REQUEST_SID, sid);
            bundle = bundle2;
        }
        BaseFragmentExKt.gotoFragmentPage(this, SleepDiaryUpdateFragment.class, bundle, true);
    }

    public static /* synthetic */ void jumpDiaryRecordFragment$default(SleepRhythmCalendarActivity sleepRhythmCalendarActivity, Long l, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        sleepRhythmCalendarActivity.jumpDiaryRecordFragment(l, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void registerObserver() {
        ((SleepRhythmMonitorViewModel) getMViewModel()).getOnDayClickLiveData().observe(this, new SleepRhythmCalendarActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: bsm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepRhythmCalendarActivity.registerObserver$lambda$1(this.f4569a, (LocalDate) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerObserver$lambda$1(SleepRhythmCalendarActivity this$0, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.curDate = localDate;
        this$0.updateTitleAndSubtitle();
        SleepRhythmCalendarAdapter adapter = this$0.getAdapter();
        Intrinsics.checkNotNull(localDate);
        adapter.setSelectDay(localDate);
        this$0.jumpDiaryOrDetailPageIfNeed();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void requestData() {
        Logger.i(TAG, "开始requestData请求数据");
        ((SleepRhythmMonitorViewModel) getMViewModel()).getResumeMonthItemLiveData().observe(this, new SleepRhythmCalendarActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: srm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepRhythmCalendarActivity.requestData$lambda$4(this.f33919a, (Map) obj);
            }
        }));
        ((SleepRhythmMonitorViewModel) getMViewModel()).getSetMonitorResultLiveData().observe(this, new SleepRhythmCalendarActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: zrm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepRhythmCalendarActivity.requestData$lambda$5(this.f41606a, (Pair) obj);
            }
        }));
        this.endOfTodaySecond = TimeUtils.INSTANCE.getEndOfToday() / ((long) 1000);
        requestLatestSleepRhythmReport();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestData$lambda$4(SleepRhythmCalendarActivity this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "resumeMonthItemLiveData返回数据" + map);
        this$0.records = map;
        this$0.updateTitleAndSubtitle();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestData$lambda$5(SleepRhythmCalendarActivity this$0, Pair pair) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "setMonitorResultLiveData返回数据" + pair);
        this$0.dismissDialogForce();
        if (((Number) pair.getFirst()).intValue() != 0) {
            ToastExtKt.toastShort(this$0, c0j.f4801r);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void requestLatestSleepRhythmReport() {
        LiveData<SleepRhythmReport> liveData = this.latestSleepRhythmBeforeTodayLiveData;
        if (liveData != null) {
            liveData.removeObservers(this);
        }
        LiveData<SleepRhythmReport> liveDataQueryLatestSleepRhythmBeforeTodayLiveData = ((SleepRhythmMonitorViewModel) getMViewModel()).queryLatestSleepRhythmBeforeTodayLiveData(this.endOfTodaySecond);
        this.latestSleepRhythmBeforeTodayLiveData = liveDataQueryLatestSleepRhythmBeforeTodayLiveData;
        Intrinsics.checkNotNull(liveDataQueryLatestSleepRhythmBeforeTodayLiveData);
        liveDataQueryLatestSleepRhythmBeforeTodayLiveData.observe(this, new SleepRhythmCalendarActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: dsm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepRhythmCalendarActivity.requestLatestSleepRhythmReport$lambda$6(this.f15894a, (SleepRhythmReport) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:34:0x014e A[Catch: Exception -> 0x0053, TryCatch #0 {Exception -> 0x0053, blocks: (B:3:0x001e, B:5:0x003c, B:7:0x0040, B:13:0x005d, B:15:0x006c, B:17:0x0071, B:18:0x00a6, B:21:0x00c9, B:24:0x00e6, B:26:0x00f1, B:27:0x00f5, B:29:0x0100, B:31:0x0105, B:32:0x012b, B:34:0x014e, B:35:0x0152, B:37:0x015d, B:39:0x0162), top: B:44:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:37:0x015d A[Catch: Exception -> 0x0053, TryCatch #0 {Exception -> 0x0053, blocks: (B:3:0x001e, B:5:0x003c, B:7:0x0040, B:13:0x005d, B:15:0x006c, B:17:0x0071, B:18:0x00a6, B:21:0x00c9, B:24:0x00e6, B:26:0x00f1, B:27:0x00f5, B:29:0x0100, B:31:0x0105, B:32:0x012b, B:34:0x014e, B:35:0x0152, B:37:0x015d, B:39:0x0162), top: B:44:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0161  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit requestLatestSleepRhythmReport$lambda$6(SleepRhythmCalendarActivity this$0, SleepRhythmReport sleepRhythmReport) {
        fce fceVar;
        TitleBarAlphaView titleBarAlphaView;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "queryLatestSleepRhythmBeforeTodayEnd " + sleepRhythmReport);
        this$0.latestRhythmReport = sleepRhythmReport;
        try {
            boolean is_support_sleep_rhythm = ConfigPreference.INSTANCE.getIS_SUPPORT_SLEEP_RHYTHM();
            Logger.i("是否支持睡眠健康:" + is_support_sleep_rhythm, new Object[0]);
            if (is_support_sleep_rhythm && this$0.latestRhythmReport == null) {
                Logger.i("已经支持健康研究,没有报告数据直接跳转健康研究", new Object[0]);
                HealthPageExtKt.getInstance(IHealthPage.INSTANCE).goToHealthVisitDoctorPage(this$0, 98);
            }
            TitleBarAlphaView titleBarAlphaView2 = null;
            fce fceVar2 = null;
            TitleBarAlphaView titleBarAlphaView3 = null;
            if (is_support_sleep_rhythm) {
                ((cob) this$0.getMBinding()).I.setVisibility(8);
                ((cob) this$0.getMBinding()).K.setVisibility(0);
                SleepRhythmReport sleepRhythmReport2 = this$0.latestRhythmReport;
                Intrinsics.checkNotNull(sleepRhythmReport2);
                if (sleepRhythmReport2.getType() != 0) {
                    long todayZeroMills = INSTANCE.getTodayZeroMills() / ((long) 1000);
                    SleepRhythmReport sleepRhythmReport3 = this$0.latestRhythmReport;
                    Intrinsics.checkNotNull(sleepRhythmReport3);
                    if (todayZeroMills <= sleepRhythmReport3.getEndTime() + ((long) 7776000)) {
                        SleepRhythmReport sleepRhythmReport4 = this$0.latestRhythmReport;
                        Intrinsics.checkNotNull(sleepRhythmReport4);
                        Logger.i("上一份报告未结束或结束时间时间还在90天内" + sleepRhythmReport4.getEndTime(), new Object[0]);
                        fceVar = this$0.calendarRecordBinding;
                        if (fceVar == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("calendarRecordBinding");
                            fceVar = null;
                        }
                        fceVar.getRoot().setVisibility(0);
                        titleBarAlphaView = this$0.titleBarAlphaView;
                        if (titleBarAlphaView == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("titleBarAlphaView");
                        } else {
                            titleBarAlphaView2 = titleBarAlphaView;
                        }
                        titleBarAlphaView2.showDesc(true);
                        ((cob) this$0.getMBinding()).J.setVisibility(8);
                        ((cob) this$0.getMBinding()).D.setVisibility(0);
                        ((cob) this$0.getMBinding()).E.setVisibility(8);
                    } else {
                        Logger.i("已经不在节律内!", new Object[0]);
                        fce fceVar3 = this$0.calendarRecordBinding;
                        if (fceVar3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("calendarRecordBinding");
                            fceVar3 = null;
                        }
                        fceVar3.getRoot().setVisibility(8);
                        TitleBarAlphaView titleBarAlphaView4 = this$0.titleBarAlphaView;
                        if (titleBarAlphaView4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("titleBarAlphaView");
                        } else {
                            titleBarAlphaView3 = titleBarAlphaView4;
                        }
                        titleBarAlphaView3.showDesc(false);
                        ((cob) this$0.getMBinding()).J.setVisibility(0);
                        ((cob) this$0.getMBinding()).D.setVisibility(8);
                        ((cob) this$0.getMBinding()).E.setVisibility(0);
                    }
                } else {
                    SleepRhythmReport sleepRhythmReport5 = this$0.latestRhythmReport;
                    Intrinsics.checkNotNull(sleepRhythmReport5);
                    Logger.i("上一份报告未结束或结束时间时间还在90天内" + sleepRhythmReport5.getEndTime(), new Object[0]);
                    fceVar = this$0.calendarRecordBinding;
                    if (fceVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("calendarRecordBinding");
                        fceVar = null;
                    }
                    fceVar.getRoot().setVisibility(0);
                    titleBarAlphaView = this$0.titleBarAlphaView;
                    if (titleBarAlphaView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("titleBarAlphaView");
                    } else {
                        titleBarAlphaView2 = titleBarAlphaView;
                    }
                    titleBarAlphaView2.showDesc(true);
                    ((cob) this$0.getMBinding()).J.setVisibility(8);
                    ((cob) this$0.getMBinding()).D.setVisibility(0);
                    ((cob) this$0.getMBinding()).E.setVisibility(8);
                }
            } else {
                ((cob) this$0.getMBinding()).K.setVisibility(8);
                fce fceVar4 = this$0.calendarRecordBinding;
                if (fceVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("calendarRecordBinding");
                } else {
                    fceVar2 = fceVar4;
                }
                fceVar2.getRoot().setVisibility(0);
                ((cob) this$0.getMBinding()).E.setVisibility(8);
                ((cob) this$0.getMBinding()).D.setVisibility(0);
                ((cob) this$0.getMBinding()).I.setVisibility(0);
                ((cob) this$0.getMBinding()).J.setVisibility(8);
            }
        } catch (Exception e) {
            Logger.e("更新睡眠节律记录异常" + e, new Object[0]);
        }
        this$0.updateActionView();
        this$0.autoEndRhythmIfNeed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showCalendar() {
        Bundle bundle = new Bundle();
        bundle.putInt("position", 2);
        bundle.putSerializable("local_date", this.curDate);
        bundle.putBoolean("from_activity", true);
        bundle.putBoolean("switch_day_week_month", false);
        Intent intent = new Intent(this, (Class<?>) CalendarActivity.class);
        intent.putExtras(bundle);
        startForActivityResult(intent, new Function2() { // from class: xrm
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SleepRhythmCalendarActivity.showCalendar$lambda$17(this.f39397a, ((Integer) obj).intValue(), (Intent) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showCalendar$lambda$17(SleepRhythmCalendarActivity this$0, int i, Intent intent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Serializable serializableExtra = intent != null ? intent.getSerializableExtra("calendar_date") : null;
        LocalDate localDate = serializableExtra instanceof LocalDate ? (LocalDate) serializableExtra : null;
        if (i == -1 && localDate != null) {
            LocalDate curDate = this$0.curDate;
            Intrinsics.checkNotNullExpressionValue(curDate, "curDate");
            if (TimeDateUtil.isSameMonth(curDate, localDate)) {
                return Unit.INSTANCE;
            }
            this$0.switchMonth(localDate);
        }
        return Unit.INSTANCE;
    }

    private final void switchMonth(LocalDate date) {
        LocalDate localDatePlusDays = date.minusDays(date.getDayOfMonth()).plusDays(Math.min(this.curDate.getDayOfMonth(), TimeDateUtil.INSTANCE.getDaysOfMonth(ExtUtilKt.getMills(date))));
        SleepRhythmCalendarAdapter adapter = getAdapter();
        Intrinsics.checkNotNull(localDatePlusDays);
        int pos = adapter.getPos(localDatePlusDays);
        fce fceVar = this.calendarRecordBinding;
        if (fceVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("calendarRecordBinding");
            fceVar = null;
        }
        fceVar.B.k(pos, false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0011  */
    private final void updateActionView() {
        final boolean z;
        SleepRhythmReport sleepRhythmReport = this.latestRhythmReport;
        if (sleepRhythmReport != null) {
            Intrinsics.checkNotNull(sleepRhythmReport);
            if (sleepRhythmReport.getType() == 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        fce fceVar = this.calendarRecordBinding;
        fce fceVar2 = null;
        if (fceVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("calendarRecordBinding");
            fceVar = null;
        }
        fceVar.A.setText(z ? c0j.uj : c0j.xj);
        fce fceVar3 = this.calendarRecordBinding;
        if (fceVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("calendarRecordBinding");
            fceVar3 = null;
        }
        ViewExtKt.clickWithTrigger$default(fceVar3.A, 0L, new Function1() { // from class: yrm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepRhythmCalendarActivity.updateActionView$lambda$16(z, this, (TextView) obj);
            }
        }, 1, null);
        fce fceVar4 = this.calendarRecordBinding;
        if (fceVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("calendarRecordBinding");
        } else {
            fceVar2 = fceVar4;
        }
        LinearLayoutCompat llRecordJournal = fceVar2.F;
        Intrinsics.checkNotNullExpressionValue(llRecordJournal, "llRecordJournal");
        ViewExtKt.setVisible(llRecordJournal, this.latestRhythmReport != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateActionView$lambda$16(boolean z, final SleepRhythmCalendarActivity this$0, TextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (z) {
            SleepTrackHelper.INSTANCE.trackSleepRhythmEndClick();
            this$0.dealEndMonitor();
        } else {
            SleepTrackHelper.INSTANCE.trackSleepRhythmOpenClick(2);
            SleepRhythmExtKt.checkDeviceSupportEffective(this$0, new Function1() { // from class: asm
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SleepRhythmCalendarActivity.updateActionView$lambda$16$lambda$15(this.f3418a, ((Boolean) obj).booleanValue());
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateActionView$lambda$16$lambda$15(SleepRhythmCalendarActivity this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            BaseFragmentExKt.gotoFragmentPage(this$0, SleepRhythmMonitorSettingFragment.class, null, true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTitleAndSubtitle() {
        SleepRhythmCalendarDayData sleepRhythmCalendarDayData;
        String string;
        SleepRhythmReport rhythmInfo;
        fce fceVar = this.calendarRecordBinding;
        fce fceVar2 = null;
        if (fceVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("calendarRecordBinding");
            fceVar = null;
        }
        TextView textView = fceVar.I;
        String string2 = getString(c0j.l);
        LocalDate curDate = this.curDate;
        Intrinsics.checkNotNullExpressionValue(curDate, "curDate");
        textView.setText(TimeUtils.formatDate(string2, Long.valueOf(ExtUtilKt.getMills(curDate))));
        Map<Long, SleepRhythmCalendarDayData> map = this.records;
        if (map != null) {
            LocalDate curDate2 = this.curDate;
            Intrinsics.checkNotNullExpressionValue(curDate2, "curDate");
            sleepRhythmCalendarDayData = map.get(Long.valueOf(CurseExtKt.getZeroMills(ExtUtilKt.getMills(curDate2)) / ((long) 1000)));
        } else {
            sleepRhythmCalendarDayData = null;
        }
        SleepRhythmReport rhythmInfo2 = sleepRhythmCalendarDayData != null ? sleepRhythmCalendarDayData.getRhythmInfo() : null;
        boolean z = false;
        if (sleepRhythmCalendarDayData != null && (rhythmInfo = sleepRhythmCalendarDayData.getRhythmInfo()) != null && rhythmInfo.getType() == 0) {
            z = true;
        }
        fce fceVar3 = this.calendarRecordBinding;
        if (fceVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("calendarRecordBinding");
        } else {
            fceVar2 = fceVar3;
        }
        TextView textView2 = fceVar2.H;
        if (sleepRhythmCalendarDayData == null || rhythmInfo2 == null) {
            string = getString(c0j.yj);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        } else {
            long time = rhythmInfo2.getTime() * ((long) 1000);
            LocalDate curDate3 = this.curDate;
            Intrinsics.checkNotNullExpressionValue(curDate3, "curDate");
            int intervalDay = TimeDateUtil.getIntervalDay(time, ExtUtilKt.getMills(curDate3)) + 1;
            if (z) {
                int cycleDay = rhythmInfo2.getCycleDay() - intervalDay;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                string = String.format("%s%s%s", Arrays.copyOf(new Object[]{getResources().getQuantityString(qxi.M0, intervalDay, Integer.valueOf(intervalDay)), getResources().getString(c0j.f5), getResources().getQuantityString(qxi.N0, cycleDay, Integer.valueOf(cycleDay))}, 3));
                Intrinsics.checkNotNullExpressionValue(string, "format(...)");
            } else {
                string = getResources().getQuantityString(qxi.M0, intervalDay, Integer.valueOf(intervalDay));
                Intrinsics.checkNotNull(string);
            }
        }
        textView2.setText(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTopBarSubtitle(LocalDate date) {
        String dateYYYYMMLocalFormat = TimeDateUtil.getDateYYYYMMLocalFormat(date);
        TitleBarAlphaView titleBarAlphaView = this.titleBarAlphaView;
        if (titleBarAlphaView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBarAlphaView");
            titleBarAlphaView = null;
        }
        titleBarAlphaView.updateSubTitleStr(dateYYYYMMLocalFormat);
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.F2;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return cv1.f14763a;
    }

    @Override // com.xiaomi.fitness.health.sleep.rhythm.ui.Hilt_SleepRhythmCalendarActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initTitleBar();
        initView();
        registerObserver();
        requestData();
        SleepTrackHelper.INSTANCE.trackSleepRhythmLandingPageExpose(true);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        long endOfToday = TimeUtils.INSTANCE.getEndOfToday() / ((long) 1000);
        if (endOfToday != this.endOfTodaySecond) {
            this.endOfTodaySecond = endOfToday;
            requestLatestSleepRhythmReport();
        }
    }
}
