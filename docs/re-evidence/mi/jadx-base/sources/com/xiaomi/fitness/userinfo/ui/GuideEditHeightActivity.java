package com.xiaomi.fitness.userinfo.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.baseui.widget.NumberPickerView;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.login.export.CheckerUserSettingManager;
import com.xiaomi.fitness.login.export.CheckerUserSettingManagerExtKt;
import com.xiaomi.fitness.user.info.export.SetPageManageExtKt;
import com.xiaomi.fitness.user.info.export.SetPageManager;
import com.xiaomi.fitness.userinfo.ui.GuideEditHeightActivity;
import com.xiaomi.fitness.userinfo.utils.GuidePageUtil;
import com.xiaomi.fitness.userinfo.utils.UserInfoConfigUtil;
import defpackage.ehi;
import defpackage.gjq;
import defpackage.hsi;
import defpackage.nvi;
import defpackage.o1j;
import defpackage.sv1;
import java.lang.ref.WeakReference;
import java.security.AccessController;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000i\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\n*\u0001.\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b6\u0010\rJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0012\u0010\rR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015R\u0016\u0010\u001b\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082D¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020 8\u0002X\u0082D¢\u0006\u0006\n\u0004\b&\u0010\"R\u0014\u0010'\u001a\u00020 8\u0002X\u0082D¢\u0006\u0006\n\u0004\b'\u0010\"R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00103\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00105\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00102¨\u00067"}, d2 = {"Lcom/xiaomi/fitness/userinfo/ui/GuideEditHeightActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/userinfo/ui/UserGuideViewModel;", "Lgjq;", "view", "", "initPickerConfig", "(Lcom/xiaomi/fitness/userinfo/ui/GuideEditHeightActivity;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "setCurrentPicker", "()V", "", "value", "transformHeightValue", "(F)F", LifecycleConstantKt.ON_DESTROY, "Lcom/xiaomi/fitness/baseui/widget/NumberPickerView;", "mUnitPicker", "Lcom/xiaomi/fitness/baseui/widget/NumberPickerView;", "Landroid/view/View;", "mPickerLayout", "Landroid/view/View;", "mPicker", "mFloatPicker", "mCurrentHeight", "F", "", "mCurrentUnit", "Ljava/lang/String;", "", "mIndex", "I", "", "CM_TO_FEET", "D", "FEET_MAX", "FEET_TO_INCH", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "mActivity", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "Landroid/content/IntentFilter;", "intentFilter", "Landroid/content/IntentFilter;", "com/xiaomi/fitness/userinfo/ui/GuideEditHeightActivity$mBroadcastReceiver$1", "mBroadcastReceiver", "Lcom/xiaomi/fitness/userinfo/ui/GuideEditHeightActivity$mBroadcastReceiver$1;", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class GuideEditHeightActivity extends Hilt_GuideEditHeightActivity<UserGuideViewModel, gjq> {
    private BaseActivity mActivity;
    private float mCurrentHeight;

    @Nullable
    private NumberPickerView mFloatPicker;
    private int mIndex;

    @Nullable
    private NumberPickerView mPicker;

    @Nullable
    private View mPickerLayout;

    @Nullable
    private NumberPickerView mUnitPicker;

    @NotNull
    private String mCurrentUnit = "厘米";
    private final double CM_TO_FEET = 30.48d;
    private final int FEET_MAX = 8;
    private final int FEET_TO_INCH = 12;

    @NotNull
    private final IntentFilter intentFilter = new IntentFilter();

    @NotNull
    private final GuideEditHeightActivity$mBroadcastReceiver$1 mBroadcastReceiver = new BroadcastReceiver() { // from class: com.xiaomi.fitness.userinfo.ui.GuideEditHeightActivity$mBroadcastReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            this.this$0.finish();
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    private final void initPickerConfig(GuideEditHeightActivity view) {
        this.mPickerLayout = view.findViewById(hsi.j0);
        this.mPicker = (NumberPickerView) view.findViewById(hsi.G0);
        this.mUnitPicker = (NumberPickerView) view.findViewById(hsi.I0);
        if (this.mCurrentUnit.equals("英尺")) {
            NumberPickerView numberPickerView = this.mPicker;
            Intrinsics.checkNotNull(numberPickerView);
            UserInfoConfigUtil userInfoConfigUtil = UserInfoConfigUtil.INSTANCE;
            numberPickerView.setMinValue(userInfoConfigUtil.getSUPPORTED_HEIGHT_FEET_RANGE()[0]);
            NumberPickerView numberPickerView2 = this.mPicker;
            Intrinsics.checkNotNull(numberPickerView2);
            numberPickerView2.setMaxValue(userInfoConfigUtil.getSUPPORTED_HEIGHT_FEET_RANGE()[1]);
        } else {
            NumberPickerView numberPickerView3 = this.mPicker;
            Intrinsics.checkNotNull(numberPickerView3);
            UserInfoConfigUtil userInfoConfigUtil2 = UserInfoConfigUtil.INSTANCE;
            numberPickerView3.setMinValue(userInfoConfigUtil2.getSUPPORTED_HEIGHT_RANGE()[0]);
            NumberPickerView numberPickerView4 = this.mPicker;
            Intrinsics.checkNotNull(numberPickerView4);
            numberPickerView4.setMaxValue(userInfoConfigUtil2.getSUPPORTED_HEIGHT_RANGE()[1]);
        }
        this.mCurrentHeight = ((UserGuideViewModel) getMViewModel()).getHeight();
        NumberPickerView numberPickerView5 = (NumberPickerView) view.findViewById(hsi.H0);
        this.mFloatPicker = numberPickerView5;
        Intrinsics.checkNotNull(numberPickerView5);
        UserInfoConfigUtil userInfoConfigUtil3 = UserInfoConfigUtil.INSTANCE;
        numberPickerView5.setMinValue(userInfoConfigUtil3.getSUPPORTED_HEIGHT_INCH_RANGE()[0]);
        NumberPickerView numberPickerView6 = this.mFloatPicker;
        Intrinsics.checkNotNull(numberPickerView6);
        numberPickerView6.setMaxValue(userInfoConfigUtil3.getSUPPORTED_HEIGHT_INCH_RANGE()[1]);
        setCurrentPicker();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCreate$lambda$0(GuideEditHeightActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        UserGuideViewModel userGuideViewModel = (UserGuideViewModel) this$0.getMViewModel();
        BaseActivity baseActivity = this$0.mActivity;
        if (baseActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivity");
            baseActivity = null;
        }
        userGuideViewModel.onSkip(new WeakReference<>(baseActivity), this$0.mIndex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCreate$lambda$1(GuideEditHeightActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).accountLogin();
        } else {
            ((UserGuideViewModel) this$0.getMViewModel()).setHeight(this$0.transformHeightValue(this$0.mCurrentHeight));
            ((UserGuideViewModel) this$0.getMViewModel()).onNext(new WeakReference<>(this$0), this$0.mIndex);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setCurrentPicker$lambda$2(GuideEditHeightActivity this$0, NumberPickerView numberPickerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        NumberPickerView numberPickerView2 = this$0.mPicker;
        Intrinsics.checkNotNull(numberPickerView2);
        double value = numberPickerView2.getValue();
        NumberPickerView numberPickerView3 = this$0.mFloatPicker;
        Intrinsics.checkNotNull(numberPickerView3);
        this$0.mCurrentHeight = (float) (value + (((double) numberPickerView3.getValue()) * 0.1d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setCurrentPicker$lambda$3(GuideEditHeightActivity this$0, NumberPickerView numberPickerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        NumberPickerView numberPickerView2 = this$0.mPicker;
        Intrinsics.checkNotNull(numberPickerView2);
        this$0.mCurrentHeight = numberPickerView2.getValue();
        if (AccessController.getContext() != null) {
            NumberPickerView numberPickerView3 = this$0.mPicker;
            Intrinsics.checkNotNull(numberPickerView3);
            numberPickerView3.setContentDescription(this$0.getString(o1j.j, String.valueOf(this$0.mCurrentHeight)));
            View view = this$0.mPickerLayout;
            Intrinsics.checkNotNull(view);
            view.setContentDescription(this$0.getString(o1j.j, String.valueOf(this$0.mCurrentHeight)));
        }
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return nvi.j;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return sv1.f34012a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.userinfo.ui.Hilt_GuideEditHeightActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(o1j.E);
        this.mActivity = this;
        if (getIntent().getBooleanExtra(GuidePageUtil.KEY_PAGE_SKIP_ENABLE, true)) {
            setEndTextView(hsi.D0, o1j.K0, null, 14.0f, new View.OnClickListener() { // from class: a5b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GuideEditHeightActivity.onCreate$lambda$0(this.f635a, view);
                }
            });
        }
        this.mIndex = getIntent().getIntExtra(GuidePageUtil.KEY_PAGE_INDEX, 0);
        ((UserGuideViewModel) getMViewModel()).initUserProfile();
        View viewFindViewById = findViewById(hsi.v1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById;
        if (SetPageManageExtKt.getInstance(SetPageManager.INSTANCE).isLastPage(this.mIndex)) {
            textView.setText(getString(o1j.A));
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: b5b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideEditHeightActivity.onCreate$lambda$1(this.f3815a, view);
            }
        });
        initPickerConfig(this);
        String[] stringArray = getResources().getStringArray(ehi.f16648a);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        NumberPickerView numberPickerView = this.mUnitPicker;
        Intrinsics.checkNotNull(numberPickerView);
        numberPickerView.setDisplayedValues(stringArray);
        this.intentFilter.addAction(UserInfoConfigUtil.ACTION_USER_INFO_GUIDE_FINISH_ACTIVITY);
        if (Build.VERSION.SDK_INT >= 33) {
            registerReceiver(this.mBroadcastReceiver, this.intentFilter, 2);
        } else {
            registerReceiver(this.mBroadcastReceiver, this.intentFilter);
        }
    }

    @Override // com.xiaomi.fitness.userinfo.ui.Hilt_GuideEditHeightActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        unregisterReceiver(this.mBroadcastReceiver);
        super.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setCurrentPicker() {
        if (!this.mCurrentUnit.equals("英尺")) {
            this.mCurrentHeight = ((UserGuideViewModel) getMViewModel()).getHeight();
            NumberPickerView numberPickerView = this.mPicker;
            Intrinsics.checkNotNull(numberPickerView);
            UserInfoConfigUtil userInfoConfigUtil = UserInfoConfigUtil.INSTANCE;
            numberPickerView.setMinValue(userInfoConfigUtil.getSUPPORTED_HEIGHT_RANGE()[0]);
            NumberPickerView numberPickerView2 = this.mPicker;
            Intrinsics.checkNotNull(numberPickerView2);
            numberPickerView2.setMaxValue(userInfoConfigUtil.getSUPPORTED_HEIGHT_RANGE()[1]);
            float f = this.mCurrentHeight;
            if (f < this.FEET_MAX + 1) {
                int iFloor = (int) Math.floor(f);
                int iRound = Math.round((this.mCurrentHeight - iFloor) * 12);
                NumberPickerView numberPickerView3 = this.mPicker;
                Intrinsics.checkNotNull(numberPickerView3);
                numberPickerView3.setValue((int) (((double) (iFloor + iRound)) * this.CM_TO_FEET));
            } else {
                NumberPickerView numberPickerView4 = this.mPicker;
                Intrinsics.checkNotNull(numberPickerView4);
                numberPickerView4.setValue((int) this.mCurrentHeight);
            }
            NumberPickerView numberPickerView5 = this.mFloatPicker;
            Intrinsics.checkNotNull(numberPickerView5);
            numberPickerView5.setVisibility(8);
            NumberPickerView numberPickerView6 = this.mPicker;
            Intrinsics.checkNotNull(numberPickerView6);
            numberPickerView6.setOnValueChangedListener(new NumberPickerView.d() { // from class: z4b
                @Override // com.xiaomi.fitness.baseui.widget.NumberPickerView.d
                public final void onValueChange(NumberPickerView numberPickerView7, int i, int i2) {
                    GuideEditHeightActivity.setCurrentPicker$lambda$3(this.f40865a, numberPickerView7, i, i2);
                }
            });
            return;
        }
        NumberPickerView numberPickerView7 = this.mPicker;
        Intrinsics.checkNotNull(numberPickerView7);
        UserInfoConfigUtil userInfoConfigUtil2 = UserInfoConfigUtil.INSTANCE;
        numberPickerView7.setMinValue(userInfoConfigUtil2.getSUPPORTED_HEIGHT_FEET_RANGE()[0]);
        NumberPickerView numberPickerView8 = this.mPicker;
        Intrinsics.checkNotNull(numberPickerView8);
        numberPickerView8.setMaxValue(userInfoConfigUtil2.getSUPPORTED_HEIGHT_FEET_RANGE()[1]);
        float f2 = this.mCurrentHeight;
        if (f2 > this.FEET_MAX) {
            int iFloor2 = (int) Math.floor(((double) f2) / this.CM_TO_FEET);
            int iRound2 = (int) Math.round(((((double) this.mCurrentHeight) / this.CM_TO_FEET) - ((double) iFloor2)) * ((double) this.FEET_TO_INCH));
            NumberPickerView numberPickerView9 = this.mPicker;
            Intrinsics.checkNotNull(numberPickerView9);
            numberPickerView9.setValue(iFloor2);
            NumberPickerView numberPickerView10 = this.mFloatPicker;
            Intrinsics.checkNotNull(numberPickerView10);
            numberPickerView10.setValue(iRound2);
        }
        NumberPickerView numberPickerView11 = this.mPicker;
        Intrinsics.checkNotNull(numberPickerView11);
        numberPickerView11.setHintText("'");
        NumberPickerView numberPickerView12 = this.mFloatPicker;
        Intrinsics.checkNotNull(numberPickerView12);
        numberPickerView12.setHintText("\"");
        NumberPickerView numberPickerView13 = this.mFloatPicker;
        Intrinsics.checkNotNull(numberPickerView13);
        numberPickerView13.setVisibility(0);
        NumberPickerView.d dVar = new NumberPickerView.d() { // from class: y4b
            @Override // com.xiaomi.fitness.baseui.widget.NumberPickerView.d
            public final void onValueChange(NumberPickerView numberPickerView14, int i, int i2) {
                GuideEditHeightActivity.setCurrentPicker$lambda$2(this.f39776a, numberPickerView14, i, i2);
            }
        };
        NumberPickerView numberPickerView14 = this.mPicker;
        Intrinsics.checkNotNull(numberPickerView14);
        numberPickerView14.setOnValueChangedListener(dVar);
        NumberPickerView numberPickerView15 = this.mFloatPicker;
        Intrinsics.checkNotNull(numberPickerView15);
        numberPickerView15.setOnValueChangedListener(dVar);
    }

    public final float transformHeightValue(float value) {
        return value < ((float) (this.FEET_MAX + 1)) ? (int) (((double) value) * this.CM_TO_FEET) : value;
    }
}
