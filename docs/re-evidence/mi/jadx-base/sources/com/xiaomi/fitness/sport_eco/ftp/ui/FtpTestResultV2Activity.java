package com.xiaomi.fitness.sport_eco.ftp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.sport_eco.ftp.ui.FtpTestResultV2Activity;
import defpackage.e1j;
import defpackage.fvi;
import defpackage.rl0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001cB\t\b\u0007¢\u0006\u0004\b\u001b\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u0019\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u0006R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/ftp/ui/FtpTestResultV2Activity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/sport_eco/ftp/ui/FtpTestResultV2ViewModel;", "Lrl0;", "", "initBundle", "()V", "initTitleBar", "quit", "addButtonListener", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "mBasicReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "", "hasReport", "Z", "", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FtpTestResultV2Activity extends Hilt_FtpTestResultV2Activity<FtpTestResultV2ViewModel, rl0> {

    @NotNull
    public static final String TAG = "FtpTestResultActivity";
    private boolean hasReport;

    @Nullable
    private SportBasicReport mBasicReport;

    /* JADX WARN: Multi-variable type inference failed */
    private final void addButtonListener() {
        if (this.hasReport) {
            ((rl0) getMBinding()).B.setText(getResources().getString(e1j.Q4));
        } else {
            ((rl0) getMBinding()).B.setText(getResources().getString(e1j.S));
        }
        ((rl0) getMBinding()).B.setOnClickListener(new View.OnClickListener() { // from class: yra
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FtpTestResultV2Activity.addButtonListener$lambda$2(this.f40454a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void addButtonListener$lambda$2(FtpTestResultV2Activity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.hasReport) {
            ((FtpTestResultV2ViewModel) this$0.getMViewModel()).goSportReport(this$0, this$0.mBasicReport);
        } else {
            this$0.quit();
        }
    }

    private final void initBundle() {
        Intent intent = getIntent();
        this.mBasicReport = (SportBasicReport) intent.getSerializableExtra("sport_report");
        this.hasReport = intent.getBooleanExtra(FtpTestResultV2ActivityKt.HAS_REPORT, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initTitleBar() {
        setActionBarDisplayable(false);
        ((rl0) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: xra
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FtpTestResultV2Activity.initTitleBar$lambda$1(this.f39384a, view);
            }
        });
        ((rl0) getMBinding()).E.setText(getString(e1j.a1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initTitleBar$lambda$1(FtpTestResultV2Activity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.quit();
    }

    private final void quit() {
        finish();
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return fvi.h;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        quit();
    }

    @Override // com.xiaomi.fitness.sport_eco.ftp.ui.Hilt_FtpTestResultV2Activity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initBundle();
        initTitleBar();
        addButtonListener();
    }
}
