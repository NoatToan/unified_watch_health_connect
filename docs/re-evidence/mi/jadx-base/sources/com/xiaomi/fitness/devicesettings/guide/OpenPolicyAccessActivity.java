package com.xiaomi.fitness.devicesettings.guide;

import android.os.Bundle;
import android.view.View;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.devicesettings.guide.OpenPolicyAccessActivity;
import com.xiaomi.fitness.notify.export.NotifyHelperExtKt;
import defpackage.c1h;
import defpackage.eui;
import defpackage.wzi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0013\u0010\nJ\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0006*\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/guide/OpenPolicyAccessActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/devicesettings/guide/GuideNotificationViewModel;", "Lc1h;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "()V", "bindView", "(Lc1h;)V", "", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class OpenPolicyAccessActivity extends Hilt_OpenPolicyAccessActivity<GuideNotificationViewModel, c1h> {

    @NotNull
    private static final String TAG = "OpenNotifyRemindActivity";

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$0(View view) {
        if (NotifyHelperExtKt.getNotificationManagerExport().isNotificationPolicyAccessGranted()) {
            return;
        }
        NotifyHelperExtKt.getNotificationManagerExport().gotoNotificationPolicyAccessSetting();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull c1h c1hVar) {
        Intrinsics.checkNotNullParameter(c1hVar, "<this>");
        c1hVar.E.setOnClickListener(new View.OnClickListener() { // from class: cbh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OpenPolicyAccessActivity.bindView$lambda$0(view);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.m3;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    @Override // com.xiaomi.fitness.devicesettings.guide.Hilt_OpenPolicyAccessActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(wzi.Ue);
        setActionBarResizeable(true);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (NotifyHelperExtKt.getNotificationManagerExport().isNotificationPolicyAccessGranted()) {
            onBackPressed();
        }
    }
}
