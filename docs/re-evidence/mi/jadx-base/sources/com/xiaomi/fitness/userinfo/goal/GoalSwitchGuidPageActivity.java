package com.xiaomi.fitness.userinfo.goal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.main.export.MainTab;
import com.xiaomi.fitness.user.info.export.GoalPageManager;
import com.xiaomi.fitness.user.info.export.GoalPageManagerExtKt;
import com.xiaomi.fitness.userinfo.goal.GoalSwitchGuidPageActivity;
import com.xiaomi.fitness.userinfo.utils.GoalConfigSupport;
import defpackage.lkq;
import defpackage.moi;
import defpackage.nvi;
import defpackage.o1j;
import defpackage.sv1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000=\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\n*\u0001\u0015\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\nJ\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\nR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/userinfo/goal/GoalSwitchGuidPageActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/userinfo/goal/GoalGuideViewModel;", "Llkq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "()V", LifecycleConstantKt.ON_DESTROY, "", "mIndex", "I", "", "TAG", "Ljava/lang/String;", "Landroid/content/IntentFilter;", "intentFilter", "Landroid/content/IntentFilter;", "com/xiaomi/fitness/userinfo/goal/GoalSwitchGuidPageActivity$mReceiver$1", "mReceiver", "Lcom/xiaomi/fitness/userinfo/goal/GoalSwitchGuidPageActivity$mReceiver$1;", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class GoalSwitchGuidPageActivity extends Hilt_GoalSwitchGuidPageActivity<GoalGuideViewModel, lkq> {
    private int mIndex;

    @NotNull
    private final String TAG = "GoalGuidPageFragment";

    @NotNull
    private final IntentFilter intentFilter = new IntentFilter();

    @NotNull
    private GoalSwitchGuidPageActivity$mReceiver$1 mReceiver = new BroadcastReceiver() { // from class: com.xiaomi.fitness.userinfo.goal.GoalSwitchGuidPageActivity$mReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            this.this$0.finish();
            Bundle bundle = new Bundle();
            bundle.putInt("key_tab", MainTab.Companion.getINDEX_DEVICE());
            MainExtKt.showMainActivity(this.this$0, null, bundle);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCreate$lambda$0(GoalSwitchGuidPageActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        GoalConfigSupport.INSTANCE.getDeviceSupportGoal();
        ((GoalGuideViewModel) this$0.getMViewModel()).onNext(this$0, this$0.mIndex, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCreate$lambda$1(GoalSwitchGuidPageActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        GoalConfigSupport goalConfigSupport = GoalConfigSupport.INSTANCE;
        if (goalConfigSupport.isDeviceSupportMhs()) {
            ((GoalGuideViewModel) this$0.getMViewModel()).setDefaultSwitchGoal(goalConfigSupport.getSUPPORT_GOAL_MHS());
        } else {
            ((GoalGuideViewModel) this$0.getMViewModel()).setDefaultSwitchGoal(goalConfigSupport.getSUPPORT_GOAL_STAND_TIMES());
        }
        ((GoalGuideViewModel) this$0.getMViewModel()).onNext(this$0, this$0.mIndex, false);
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return nvi.C;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return sv1.f34012a;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        GoalPageManagerExtKt.getInstance(GoalPageManager.INSTANCE).destoryActivity();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.userinfo.goal.Hilt_GoalSwitchGuidPageActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(o1j.f1);
        ((GoalGuideViewModel) getMViewModel()).initUserProfile();
        Logger.i(this.TAG + " Goal manager initContentView", new Object[0]);
        ((lkq) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: i2b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GoalSwitchGuidPageActivity.onCreate$lambda$0(this.f20695a, view);
            }
        });
        GoalConfigSupport goalConfigSupport = GoalConfigSupport.INSTANCE;
        if (goalConfigSupport.isDeviceSupportMhs()) {
            Logger.i(this.TAG + " Goal manager save default goal mhs", new Object[0]);
            ((lkq) getMBinding()).C.setBackgroundResource(moi.l);
            ((lkq) getMBinding()).E.setText(getString(o1j.X0));
            ((lkq) getMBinding()).D.setText(getString(o1j.W0));
            ((lkq) getMBinding()).B.setText(getString(o1j.c1));
        } else if (goalConfigSupport.isDeviceCurrentSupportStand()) {
            Logger.i(this.TAG + " Goal manager save default goal stand", new Object[0]);
            ((lkq) getMBinding()).B.setText(getString(o1j.g1));
            ((lkq) getMBinding()).D.setText(getString(o1j.Y0));
            ((lkq) getMBinding()).E.setText(getString(o1j.Z0));
            ((lkq) getMBinding()).C.setBackgroundResource(moi.m);
        }
        ((lkq) getMBinding()).B.setOnClickListener(new View.OnClickListener() { // from class: j2b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GoalSwitchGuidPageActivity.onCreate$lambda$1(this.f22350a, view);
            }
        });
        this.intentFilter.addAction("goal_action_finish_activity");
        if (Build.VERSION.SDK_INT >= 33) {
            registerReceiver(this.mReceiver, this.intentFilter, 2);
        } else {
            registerReceiver(this.mReceiver, this.intentFilter);
        }
    }

    @Override // com.xiaomi.fitness.userinfo.goal.Hilt_GoalSwitchGuidPageActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        unregisterReceiver(this.mReceiver);
        super.onDestroy();
    }
}
