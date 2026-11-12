package com.xiaomi.fitness.userinfo.goal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.widget.NumberPickerView;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.main.export.MainTab;
import com.xiaomi.fitness.userinfo.goal.StepGoalActivity;
import com.xiaomi.fitness.userinfo.utils.GoalConfigSupport;
import com.xiaomi.fitness.userinfo.utils.GuidePageUtil;
import defpackage.c1p;
import defpackage.fyi;
import defpackage.hki;
import defpackage.nvi;
import defpackage.o1j;
import defpackage.sjq;
import defpackage.sv1;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\n*\u0001\u001a\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\"\u0010\nJ\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0086D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001e¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/userinfo/goal/StepGoalActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/userinfo/goal/GoalGuideViewModel;", "Lsjq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_DESTROY, "()V", "", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "", "mSelectValue", "I", "Landroid/content/IntentFilter;", "intentFilter", "Landroid/content/IntentFilter;", "mIndex", "", "mFirstGuideFromSportTarget", "Z", "com/xiaomi/fitness/userinfo/goal/StepGoalActivity$mReceiver$1", "mReceiver", "Lcom/xiaomi/fitness/userinfo/goal/StepGoalActivity$mReceiver$1;", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class StepGoalActivity extends Hilt_StepGoalActivity<GoalGuideViewModel, sjq> {
    private boolean mFirstGuideFromSportTarget;
    private int mIndex;

    @NotNull
    private final String TAG = "StepGoalActivity";
    private int mSelectValue = 1000;

    @NotNull
    private final IntentFilter intentFilter = new IntentFilter();

    @NotNull
    private StepGoalActivity$mReceiver$1 mReceiver = new BroadcastReceiver() { // from class: com.xiaomi.fitness.userinfo.goal.StepGoalActivity$mReceiver$1
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
    public static final void onCreate$lambda$0(StepGoalActivity this$0, Ref.ObjectRef mPicker, NumberPickerView numberPickerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(mPicker, "$mPicker");
        String str = this$0.TAG;
        String contentByCurrValue = ((NumberPickerView) mPicker.element).getContentByCurrValue();
        Intrinsics.checkNotNullExpressionValue(contentByCurrValue, "getContentByCurrValue(...)");
        Logger.i(str + " Goal manager selectValue step mPicker.contentByCurrValue = " + Integer.parseInt(contentByCurrValue), new Object[0]);
        String contentByCurrValue2 = ((NumberPickerView) mPicker.element).getContentByCurrValue();
        Intrinsics.checkNotNullExpressionValue(contentByCurrValue2, "getContentByCurrValue(...)");
        this$0.mSelectValue = Integer.parseInt(contentByCurrValue2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCreate$lambda$1(StepGoalActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((GoalGuideViewModel) this$0.getMViewModel()).setGoal(this$0.mSelectValue, GoalConfigSupport.INSTANCE.getSUPPORT_GOAL_STEP());
        ((GoalGuideViewModel) this$0.getMViewModel()).onNext(this$0, this$0.mIndex, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$2(StepGoalActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return nvi.p;
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return sv1.f34012a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, com.xiaomi.fitness.baseui.widget.NumberPickerView, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.xiaomi.fitness.userinfo.goal.Hilt_StepGoalActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(o1j.U0);
        ((GoalGuideViewModel) getMViewModel()).initUserProfile();
        this.mIndex = getIntent().getIntExtra(GuidePageUtil.KEY_PAGE_INDEX, 0);
        this.mFirstGuideFromSportTarget = getIntent().getBooleanExtra(GuidePageUtil.KEY_FIRST_GUIDE_FROM_SPORT_TARGET, false);
        GoalConfigSupport goalConfigSupport = GoalConfigSupport.INSTANCE;
        int goalValue = goalConfigSupport.getGoalValue(goalConfigSupport.getSTEP_GOAL_FIELD(), UserInfoManager.getUserProfile$default(((GoalGuideViewModel) getMViewModel()).getMUserInfoManager(), false, 1, null).getRegularGoalList());
        if (goalValue == 0) {
            goalValue = 6000;
        }
        this.mSelectValue = goalValue;
        Logger.i(this.TAG + " Goal manager current step default is " + goalValue, new Object[0]);
        ArrayList arrayList = new ArrayList();
        String[] strArrB = c1p.b(arrayList, 2000, SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH, 1000);
        Intrinsics.checkNotNullExpressionValue(strArrB, "showTargetList(...)");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? stepGoalSettingPicker = ((sjq) getMBinding()).F;
        Intrinsics.checkNotNullExpressionValue(stepGoalSettingPicker, "stepGoalSettingPicker");
        objectRef.element = stepGoalSettingPicker;
        stepGoalSettingPicker.setDisplayedValues(strArrB);
        ((NumberPickerView) objectRef.element).setMinValue(0);
        ((NumberPickerView) objectRef.element).setMaxValue(49);
        Logger.i(this.TAG + " Goal manager selectValue step mSelectValue.toString()= " + this.mSelectValue, new Object[0]);
        ((NumberPickerView) objectRef.element).setValue(arrayList.indexOf(String.valueOf(this.mSelectValue)));
        ((NumberPickerView) objectRef.element).setOnValueChangedListener(new NumberPickerView.d() { // from class: geo
            @Override // com.xiaomi.fitness.baseui.widget.NumberPickerView.d
            public final void onValueChange(NumberPickerView numberPickerView, int i, int i2) {
                StepGoalActivity.onCreate$lambda$0(this.f18901a, objectRef, numberPickerView, i, i2);
            }
        });
        ((NumberPickerView) objectRef.element).setHintTextColor(hki.f20169a);
        NumberPickerView numberPickerView = (NumberPickerView) objectRef.element;
        int i = fyi.e;
        int i2 = this.mSelectValue;
        numberPickerView.setHintText(ResourceExtKt.getQuantityString(this, i, i2, Integer.valueOf(i2)));
        Logger.i(this.TAG + " Goal manager selectValue step = " + this.mSelectValue, new Object[0]);
        ((sjq) getMBinding()).D.setOnClickListener(new View.OnClickListener() { // from class: heo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StepGoalActivity.onCreate$lambda$1(this.f19988a, view);
            }
        });
        ((sjq) getMBinding()).E.setOnClickListener(new View.OnClickListener() { // from class: ieo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StepGoalActivity.onCreate$lambda$2(this.f21063a, view);
            }
        });
        ((sjq) getMBinding()).A.setText(getString(o1j.g0, Integer.valueOf(this.mIndex), 3));
        this.intentFilter.addAction("goal_action_finish_activity");
        if (Build.VERSION.SDK_INT >= 33) {
            registerReceiver(this.mReceiver, this.intentFilter, 2);
        } else {
            registerReceiver(this.mReceiver, this.intentFilter);
        }
    }

    @Override // com.xiaomi.fitness.userinfo.goal.Hilt_StepGoalActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        unregisterReceiver(this.mReceiver);
        super.onDestroy();
    }
}
