package com.xiaomi.fitness.sport_eco.ftp.ui;

import android.os.Bundle;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference;
import com.xiaomi.fitness.trail.export.SportRecordApi;
import com.xiaomi.fitness.trail.export.SportRecordApiKt;
import defpackage.lp5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0012\u0010\u000f\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/ftp/ui/FtpTestResultV2ViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "TAG", "", "localSportType", "mDeviceModel", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "goSportReport", "", LifecycleConstantKt.TYPE_ACTIVITY, "Lcom/xiaomi/fitness/sport_eco/ftp/ui/FtpTestResultV2Activity;", "it", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "attach", "savedInstanceState", "Landroid/os/Bundle;", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFtpTestResultV2ViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FtpTestResultV2ViewModel.kt\ncom/xiaomi/fitness/sport_eco/ftp/ui/FtpTestResultV2ViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"})
public final class FtpTestResultV2ViewModel extends AbsViewModel {

    @NotNull
    private final String TAG = "FtpTestResultViewModel";

    @NotNull
    private String localSportType = SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE();
    private EcoDeviceModel mDeviceModel;

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        EcoDeviceManager ecoDeviceManagerExtKt = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE);
        String str = this.localSportType;
        if (str.length() == 0) {
            str = "ksmb.treadmill.m1v1";
        }
        EcoDeviceModel localDeviceModel = ecoDeviceManagerExtKt.getLocalDeviceModel(str);
        if (localDeviceModel == null) {
            throw new IllegalStateException("local device is null");
        }
        this.mDeviceModel = localDeviceModel;
    }

    public final void goSportReport(@NotNull FtpTestResultV2Activity activity, @Nullable SportBasicReport it) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (it == null) {
            activity.finish();
            return;
        }
        FitnessLogUtils.d(this.TAG, "SportBasicReport has data");
        Bundle bundle = new Bundle();
        int iA = lp5.a(it);
        bundle.putLong("time_stamp", it.getTimeStamp());
        bundle.putSerializable("sport_report", it);
        bundle.putInt("sport_type", iA);
        if (Intrinsics.areEqual(this.localSportType, "yesoul.exbike.jsc01y")) {
            SportRecordApiKt.getSportRecordApi().goEcoSportBicycleDetail(activity, bundle, it);
        } else {
            SportRecordApi.DefaultImpls.goSportDetail$default(SportRecordApiKt.getSportRecordApi(), activity, bundle, it, false, 8, null);
        }
        activity.finish();
    }
}
