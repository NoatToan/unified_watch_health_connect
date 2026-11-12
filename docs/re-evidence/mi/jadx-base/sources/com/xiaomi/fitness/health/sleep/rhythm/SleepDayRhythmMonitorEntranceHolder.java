package com.xiaomi.fitness.health.sleep.rhythm;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.health.connect.client.records.OvulationTestRecord;
import com.xiaomi.fit.fitness.export.api.FitnessServerSyncer;
import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fit.fitness.export.api.repository.ISleepRepository;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.data.HealthPrefer;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.rhythm.SleepDayRhythmMonitorEntranceHolder;
import com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmWaitNetDataFragment;
import com.xiaomi.fitness.health.sleep.rhythm.utils.SleepRhythmExtKt;
import com.xiaomi.fitness.health.sleep.utils.SleepTrackHelper;
import com.xiaomi.fitness.login.utils.RegionUtil;
import com.xiaomi.fitness.main.export.ConfigPreference;
import com.xiaomi.fitness.util.UtilsKt;
import defpackage.av6;
import defpackage.c0j;
import defpackage.hce;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\u000b\u001a\u00020\u00022!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/SleepDayRhythmMonitorEntranceHolder;", "", "", "initView", "()V", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", OvulationTestRecord.Result.POSITIVE, "resultCallback", "showCloudSyncDialog", "(Lkotlin/jvm/functions/Function1;)V", "clickCard", "Landroid/view/View;", "containerLayout", "Landroid/view/View;", "sleepresearchcontainerLayout", "Lcom/xiaomi/fit/fitness/export/api/FitnessServerSyncer;", "serverSyncer$delegate", "Lkotlin/Lazy;", "getServerSyncer", "()Lcom/xiaomi/fit/fitness/export/api/FitnessServerSyncer;", "serverSyncer", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lhce;", "binding", "<init>", "(Lhce;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepDayRhythmMonitorEntranceHolder {

    @NotNull
    private final View containerLayout;

    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: serverSyncer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy serverSyncer;

    @NotNull
    private final View sleepresearchcontainerLayout;

    public SleepDayRhythmMonitorEntranceHolder(@NotNull hce binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        ConstraintLayout layoutSleepRhythm = binding.C;
        Intrinsics.checkNotNullExpressionValue(layoutSleepRhythm, "layoutSleepRhythm");
        this.containerLayout = layoutSleepRhythm;
        ConstraintLayout layoutSleepResearch = binding.B;
        Intrinsics.checkNotNullExpressionValue(layoutSleepResearch, "layoutSleepResearch");
        this.sleepresearchcontainerLayout = layoutSleepResearch;
        this.serverSyncer = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: jkm
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SleepDayRhythmMonitorEntranceHolder.serverSyncer_delegate$lambda$0();
            }
        });
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.context = context;
        initView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit clickCard$lambda$3(SleepDayRhythmMonitorEntranceHolder this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            if (HealthPrefer.INSTANCE.getPULL_RECENT_ONE_YEAR_DATA_DONE()) {
                SleepRhythmExtKt.startSleepRhythmActivity(this$0.context);
            } else {
                FitnessServerSyncer.DefaultImpls.syncWithServer$default(this$0.getServerSyncer(), true, "home_page", null, 4, null);
                UtilsKt.gotoPage$default(this$0.context, SleepRhythmWaitNetDataFragment.class, null, false, 8, null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FitnessServerSyncer getServerSyncer() {
        return (FitnessServerSyncer) this.serverSyncer.getValue();
    }

    private final void initView() {
        this.containerLayout.setOnClickListener(new View.OnClickListener() { // from class: lkm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepDayRhythmMonitorEntranceHolder.initView$lambda$1(this.f25181a, view);
            }
        });
        this.sleepresearchcontainerLayout.setOnClickListener(new View.OnClickListener() { // from class: mkm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepDayRhythmMonitorEntranceHolder.initView$lambda$2(this.f26962a, view);
            }
        });
        if (AppUtil.INSTANCE.isPlayChannel() || !RegionUtil.isInnerCN()) {
            ViewExtKt.setVisible(this.containerLayout, false);
            ViewExtKt.setVisible(this.sleepresearchcontainerLayout, false);
            return;
        }
        boolean is_support_sleep_rhythm = ConfigPreference.INSTANCE.getIS_SUPPORT_SLEEP_RHYTHM();
        Logger.i("睡眠节律卡片:是否支持健康研究" + is_support_sleep_rhythm, new Object[0]);
        if (!is_support_sleep_rhythm) {
            ViewExtKt.setVisible(this.containerLayout, true);
            ViewExtKt.setVisible(this.sleepresearchcontainerLayout, false);
            return;
        }
        boolean rhyThmDataValidByAllData = ((ISleepRepository) FitnessDataExtKt.getInstance(IRepositoryProvider.INSTANCE).getRepository(ISleepRepository.class)).getRhyThmDataValidByAllData();
        Logger.i("睡眠节律卡片:", "是否有报告数据 " + rhyThmDataValidByAllData);
        if (!rhyThmDataValidByAllData) {
            ViewExtKt.setVisible(this.containerLayout, false);
            ViewExtKt.setVisible(this.sleepresearchcontainerLayout, true);
        } else {
            Logger.i("睡眠节律卡片:", "有数据,显示睡眠节律卡片");
            ViewExtKt.setVisible(this.containerLayout, true);
            ViewExtKt.setVisible(this.sleepresearchcontainerLayout, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(SleepDayRhythmMonitorEntranceHolder this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.clickCard();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2(SleepDayRhythmMonitorEntranceHolder this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.clickCard();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessServerSyncer serverSyncer_delegate$lambda$0() {
        return FitnessDataExtKt.getInstance(FitnessServerSyncer.INSTANCE);
    }

    private final void showCloudSyncDialog(final Function1<? super Boolean, Unit> resultCallback) {
        if (RegionPreference.INSTANCE.getSyncWeb()) {
            resultCallback.invoke2(Boolean.TRUE);
            return;
        }
        Context context = this.context;
        if (context instanceof FragmentActivity) {
            FragmentManager supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            CommonDialog commonDialogCreate = (CommonDialog) supportFragmentManager.l0("rhythm_open_sync_guide");
            if (commonDialogCreate == null || !commonDialogCreate.isShowing()) {
                if (commonDialogCreate == null) {
                    commonDialogCreate = new CommonDialog.c("rhythm_open_sync_guide").setDialogTitle(c0j.Ol).setDialogDescription(c0j.Aj).setNegativeText(c0j.c).setPositiveText(c0j.Va).setCancelable(false).setCanceledOnBackPressed(false).setCanceledOnTouchOutside(false).create();
                    Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
                }
                commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.health.sleep.rhythm.SleepDayRhythmMonitorEntranceHolder.showCloudSyncDialog.1
                    @Override // defpackage.av6
                    public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                        super.onDialogClick(dialogName, dialog, which);
                        if (which != -1) {
                            resultCallback.invoke2(Boolean.FALSE);
                            return;
                        }
                        RegionPreference.INSTANCE.setSyncWeb(true);
                        FitnessServerSyncer.DefaultImpls.syncWithServer$default(SleepDayRhythmMonitorEntranceHolder.this.getServerSyncer(), true, "cloud_sync_switch", null, 4, null);
                        resultCallback.invoke2(Boolean.TRUE);
                    }
                });
                commonDialogCreate.showIfNeed(supportFragmentManager);
            }
        }
    }

    public final void clickCard() {
        SleepTrackHelper.INSTANCE.trackSleepRhythmCardClick();
        showCloudSyncDialog(new Function1() { // from class: kkm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepDayRhythmMonitorEntranceHolder.clickCard$lambda$3(this.f23953a, ((Boolean) obj).booleanValue());
            }
        });
    }
}
