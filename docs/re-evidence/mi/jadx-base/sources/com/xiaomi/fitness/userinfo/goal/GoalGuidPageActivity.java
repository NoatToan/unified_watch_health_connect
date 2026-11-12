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
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.settingitem.RainbowTargetGuide;
import com.xiaomi.fitness.user.info.export.GoalPageManager;
import com.xiaomi.fitness.user.info.export.GoalPageManagerExtKt;
import com.xiaomi.fitness.userinfo.goal.GoalGuidPageActivity;
import com.xiaomi.fitness.userinfo.utils.GoalConfigSupport;
import com.xiaomi.fitness.userinfo.utils.GuidePageUtil;
import defpackage.jkq;
import defpackage.nvi;
import defpackage.o1j;
import defpackage.sv1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000M\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\n*\u0001\u001e\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b&\u0010\nJ\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000f\u0010\nR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\"¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/userinfo/goal/GoalGuidPageActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/userinfo/goal/GoalGuideViewModel;", "Ljkq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "()V", "", "flag", "setRainbowTargetGuide", "(Z)V", LifecycleConstantKt.ON_DESTROY, "", "mIndex", "I", "", "TAG", "Ljava/lang/String;", "Landroid/content/IntentFilter;", "intentFilter", "Landroid/content/IntentFilter;", "Landroid/content/BroadcastReceiver;", "mBroadcastReceiver", "Landroid/content/BroadcastReceiver;", "mFirstGuideFromSportTarget", "Z", "com/xiaomi/fitness/userinfo/goal/GoalGuidPageActivity$mReceiver$1", "mReceiver", "Lcom/xiaomi/fitness/userinfo/goal/GoalGuidPageActivity$mReceiver$1;", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class GoalGuidPageActivity extends Hilt_GoalGuidPageActivity<GoalGuideViewModel, jkq> {
    private BroadcastReceiver mBroadcastReceiver;
    private boolean mFirstGuideFromSportTarget;
    private int mIndex;

    @NotNull
    private final String TAG = "GoalGuidPageFragment";

    @NotNull
    private final IntentFilter intentFilter = new IntentFilter();

    @NotNull
    private GoalGuidPageActivity$mReceiver$1 mReceiver = new BroadcastReceiver() { // from class: com.xiaomi.fitness.userinfo.goal.GoalGuidPageActivity$mReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (this.this$0.mFirstGuideFromSportTarget) {
                this.this$0.finish();
                return;
            }
            this.this$0.finish();
            Bundle bundle = new Bundle();
            bundle.putInt("key_tab", MainTab.Companion.getINDEX_DEVICE());
            MainExtKt.showMainActivity(this.this$0, null, bundle);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCreate$lambda$0(GoalGuidPageActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        GoalConfigSupport goalConfigSupport = GoalConfigSupport.INSTANCE;
        goalConfigSupport.getDeviceSupportGoal();
        if (goalConfigSupport.isDeviceSupportMhs()) {
            Logger.i(this$0.TAG + " Goal manager save default goal mhs", new Object[0]);
            ((GoalGuideViewModel) this$0.getMViewModel()).setDefaultGoal(goalConfigSupport.getSUPPORT_GOAL_MHS());
        } else if (goalConfigSupport.isDeviceCurrentSupportStand()) {
            Logger.i(this$0.TAG + " Goal manager save default goal stand", new Object[0]);
            ((GoalGuideViewModel) this$0.getMViewModel()).setDefaultGoal(goalConfigSupport.getSUPPORT_GOAL_STAND_TIMES());
        }
        ((GoalGuideViewModel) this$0.getMViewModel()).onNext(this$0, this$0.mIndex, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCreate$lambda$1(GoalGuidPageActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((GoalGuideViewModel) this$0.getMViewModel()).onNext(this$0, this$0.mIndex, true);
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return nvi.B;
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
    @Override // com.xiaomi.fitness.userinfo.goal.Hilt_GoalGuidPageActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(o1j.V0);
        ((GoalGuideViewModel) getMViewModel()).initUserProfile();
        this.mFirstGuideFromSportTarget = getIntent().getBooleanExtra(GuidePageUtil.KEY_FIRST_GUIDE_FROM_SPORT_TARGET, false);
        Logger.i(this.TAG + " Goal manager initContentView", new Object[0]);
        ((jkq) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: g1b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GoalGuidPageActivity.onCreate$lambda$0(this.f18461a, view);
            }
        });
        ((jkq) getMBinding()).B.setOnClickListener(new View.OnClickListener() { // from class: h1b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GoalGuidPageActivity.onCreate$lambda$1(this.f19569a, view);
            }
        });
        this.intentFilter.addAction("goal_action_finish_activity");
        if (Build.VERSION.SDK_INT >= 33) {
            registerReceiver(this.mReceiver, this.intentFilter, 2);
        } else {
            registerReceiver(this.mReceiver, this.intentFilter);
        }
        setRainbowTargetGuide(true);
    }

    @Override // com.xiaomi.fitness.userinfo.goal.Hilt_GoalGuidPageActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        unregisterReceiver(this.mReceiver);
        super.onDestroy();
    }

    public final void setRainbowTargetGuide(boolean flag) {
        Logger.i(this.TAG, "set Rainbow Target Guide " + flag);
        RainbowTargetGuide rainbowTargetGuide = new RainbowTargetGuide();
        rainbowTargetGuide.setRainbowTargetGuide(flag);
        DeviceSettingManager.INSTANCE.getInstance().sendUserSettingItem(DeviceSettingConfigKey.KEY_RAINBOW_TARGET_GUIDE, rainbowTargetGuide, false);
    }
}
