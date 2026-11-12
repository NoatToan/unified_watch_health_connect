package com.xiaomi.fitness.userinfo.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.api.FitnessDataRecorder;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.baseui.widget.NumberPickerView;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.login.export.CheckerUserSettingManager;
import com.xiaomi.fitness.login.export.CheckerUserSettingManagerExtKt;
import com.xiaomi.fitness.user.info.export.SetPageManageExtKt;
import com.xiaomi.fitness.user.info.export.SetPageManager;
import com.xiaomi.fitness.userinfo.ui.GuideEditWeightActivity;
import com.xiaomi.fitness.userinfo.utils.GuidePageUtil;
import com.xiaomi.fitness.userinfo.utils.UserInfoConfigUtil;
import defpackage.c1p;
import defpackage.ehi;
import defpackage.hsi;
import defpackage.kjq;
import defpackage.nvi;
import defpackage.o1j;
import defpackage.sv1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000g\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\n*\u0001-\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b5\u0010\u0012J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010!R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001f0&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u001f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b)\u0010!R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00104\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00101¨\u00066"}, d2 = {"Lcom/xiaomi/fitness/userinfo/ui/GuideEditWeightActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/userinfo/ui/UserGuideViewModel;", "Lkjq;", "view", "", "initPickerConfig", "(Lcom/xiaomi/fitness/userinfo/ui/GuideEditWeightActivity;)V", "", "value", "", "getIndex", "(F)I", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_DESTROY, "()V", "mIndex", "I", "Lcom/xiaomi/fitness/baseui/widget/NumberPickerView;", "mIntegerPicker", "Lcom/xiaomi/fitness/baseui/widget/NumberPickerView;", "mFloatPicker", "mUnitPicker", "Landroid/view/View;", "mPickerLayout", "Landroid/view/View;", "mCurrentWeight", "F", "", "mCurrentUnit", "Ljava/lang/String;", "mLastUnit", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "mActivity", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "", "float_array", "[Ljava/lang/String;", "TAG", "Landroid/content/IntentFilter;", "intentFilter", "Landroid/content/IntentFilter;", "com/xiaomi/fitness/userinfo/ui/GuideEditWeightActivity$mBroadcastReceiver$1", "mBroadcastReceiver", "Lcom/xiaomi/fitness/userinfo/ui/GuideEditWeightActivity$mBroadcastReceiver$1;", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class GuideEditWeightActivity extends Hilt_GuideEditWeightActivity<UserGuideViewModel, kjq> {
    private String[] float_array;
    private BaseActivity mActivity;
    private String mCurrentUnit;
    private float mCurrentWeight;

    @Nullable
    private NumberPickerView mFloatPicker;
    private int mIndex;

    @Nullable
    private NumberPickerView mIntegerPicker;
    private String mLastUnit;

    @Nullable
    private View mPickerLayout;

    @Nullable
    private NumberPickerView mUnitPicker;

    @NotNull
    private final String TAG = "GuideEditWeightActivity";

    @NotNull
    private final IntentFilter intentFilter = new IntentFilter();

    @NotNull
    private final GuideEditWeightActivity$mBroadcastReceiver$1 mBroadcastReceiver = new BroadcastReceiver() { // from class: com.xiaomi.fitness.userinfo.ui.GuideEditWeightActivity$mBroadcastReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            this.this$0.finish();
        }
    };

    private final int getIndex(float value) {
        int i = (int) (value * 10);
        if (i - 1 > 0) {
            return i;
        }
        return 0;
    }

    private final void initPickerConfig(GuideEditWeightActivity view) {
        this.mPickerLayout = view.findViewById(hsi.k0);
        this.mIntegerPicker = (NumberPickerView) view.findViewById(hsi.K0);
        this.mUnitPicker = (NumberPickerView) view.findViewById(hsi.L0);
        this.mFloatPicker = (NumberPickerView) view.findViewById(hsi.J0);
        NumberPickerView numberPickerView = this.mIntegerPicker;
        Intrinsics.checkNotNull(numberPickerView);
        UserInfoConfigUtil userInfoConfigUtil = UserInfoConfigUtil.INSTANCE;
        numberPickerView.setMinValue(userInfoConfigUtil.getSUPPORTED_WEIGHT_RANGE_KG()[0]);
        NumberPickerView numberPickerView2 = this.mIntegerPicker;
        Intrinsics.checkNotNull(numberPickerView2);
        numberPickerView2.setMaxValue(userInfoConfigUtil.getSUPPORTED_WEIGHT_RANGE_KG()[1]);
        NumberPickerView numberPickerView3 = this.mFloatPicker;
        Intrinsics.checkNotNull(numberPickerView3);
        numberPickerView3.setMinValue(0);
        NumberPickerView numberPickerView4 = this.mFloatPicker;
        Intrinsics.checkNotNull(numberPickerView4);
        numberPickerView4.setMaxValue(9);
        NumberPickerView.d dVar = new NumberPickerView.d() { // from class: n5b
            @Override // com.xiaomi.fitness.baseui.widget.NumberPickerView.d
            public final void onValueChange(NumberPickerView numberPickerView5, int i, int i2) {
                GuideEditWeightActivity.initPickerConfig$lambda$2(this.f27563a, numberPickerView5, i, i2);
            }
        };
        NumberPickerView numberPickerView5 = this.mIntegerPicker;
        Intrinsics.checkNotNull(numberPickerView5);
        numberPickerView5.setOnValueChangedListener(dVar);
        NumberPickerView numberPickerView6 = this.mFloatPicker;
        Intrinsics.checkNotNull(numberPickerView6);
        NumberPickerView numberPickerView7 = this.mFloatPicker;
        Intrinsics.checkNotNull(numberPickerView7);
        numberPickerView6.setContentDescription(numberPickerView7.getContentByCurrValue());
        NumberPickerView numberPickerView8 = this.mFloatPicker;
        Intrinsics.checkNotNull(numberPickerView8);
        numberPickerView8.setOnValueChangedListener(dVar);
        NumberPickerView numberPickerView9 = this.mUnitPicker;
        Intrinsics.checkNotNull(numberPickerView9);
        numberPickerView9.setContentDescription(getString(o1j.n1));
        NumberPickerView numberPickerView10 = this.mUnitPicker;
        Intrinsics.checkNotNull(numberPickerView10);
        numberPickerView10.setOnValueChangedListener(new NumberPickerView.d() { // from class: o5b
            @Override // com.xiaomi.fitness.baseui.widget.NumberPickerView.d
            public final void onValueChange(NumberPickerView numberPickerView11, int i, int i2) {
                GuideEditWeightActivity.initPickerConfig$lambda$3(this.f28743a, numberPickerView11, i, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initPickerConfig$lambda$2(GuideEditWeightActivity this$0, NumberPickerView numberPickerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        NumberPickerView numberPickerView2 = this$0.mIntegerPicker;
        Intrinsics.checkNotNull(numberPickerView2);
        float value = numberPickerView2.getValue();
        NumberPickerView numberPickerView3 = this$0.mFloatPicker;
        Intrinsics.checkNotNull(numberPickerView3);
        String contentByCurrValue = numberPickerView3.getContentByCurrValue();
        Intrinsics.checkNotNullExpressionValue(contentByCurrValue, "getContentByCurrValue(...)");
        this$0.mCurrentWeight = value + Float.parseFloat(contentByCurrValue);
        NumberPickerView numberPickerView4 = this$0.mIntegerPicker;
        Intrinsics.checkNotNull(numberPickerView4);
        NumberPickerView numberPickerView5 = this$0.mIntegerPicker;
        Intrinsics.checkNotNull(numberPickerView5);
        numberPickerView4.setContentDescription(String.valueOf(numberPickerView5.getValue()));
        NumberPickerView numberPickerView6 = this$0.mFloatPicker;
        Intrinsics.checkNotNull(numberPickerView6);
        NumberPickerView numberPickerView7 = this$0.mFloatPicker;
        Intrinsics.checkNotNull(numberPickerView7);
        numberPickerView6.setContentDescription(numberPickerView7.getContentByCurrValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initPickerConfig$lambda$3(GuideEditWeightActivity this$0, NumberPickerView numberPickerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        NumberPickerView numberPickerView2 = this$0.mUnitPicker;
        Intrinsics.checkNotNull(numberPickerView2);
        this$0.mCurrentUnit = numberPickerView2.getContentByCurrValue();
        NumberPickerView numberPickerView3 = this$0.mUnitPicker;
        Intrinsics.checkNotNull(numberPickerView3);
        String str = this$0.mCurrentUnit;
        String str2 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCurrentUnit");
            str = null;
        }
        numberPickerView3.setContentDescription(str);
        String str3 = this$0.mCurrentUnit;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCurrentUnit");
            str3 = null;
        }
        if (str3.equals(this$0.getString(o1j.n1))) {
            NumberPickerView numberPickerView4 = this$0.mIntegerPicker;
            Intrinsics.checkNotNull(numberPickerView4);
            UserInfoConfigUtil userInfoConfigUtil = UserInfoConfigUtil.INSTANCE;
            numberPickerView4.setMinValue(userInfoConfigUtil.getSUPPORTED_WEIGHT_RANGE_KG()[0]);
            NumberPickerView numberPickerView5 = this$0.mIntegerPicker;
            Intrinsics.checkNotNull(numberPickerView5);
            numberPickerView5.setMaxValue(userInfoConfigUtil.getSUPPORTED_WEIGHT_RANGE_KG()[1]);
            String str4 = this$0.mLastUnit;
            if (str4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLastUnit");
                str4 = null;
            }
            if (str4.equals(this$0.getString(o1j.m1))) {
                Logger.i(this$0.TAG, "mCurrentWeight == " + this$0.mCurrentWeight);
                float f = this$0.mCurrentWeight / 2.0f;
                int iFloor = (int) Math.floor((double) f);
                float f2 = f - ((float) iFloor);
                Logger.d(this$0.TAG, "floatValue == " + f2);
                NumberPickerView numberPickerView6 = this$0.mIntegerPicker;
                Intrinsics.checkNotNull(numberPickerView6);
                numberPickerView6.setValue(iFloor);
                float fRound = Math.round(((double) f2) * 10.0d) * 0.1f;
                Logger.d(this$0.TAG, "tempValue == " + fRound);
                NumberPickerView numberPickerView7 = this$0.mFloatPicker;
                Intrinsics.checkNotNull(numberPickerView7);
                String[] strArr = this$0.float_array;
                if (strArr == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("float_array");
                    strArr = null;
                }
                numberPickerView7.a0(strArr, this$0.getIndex(fRound), true);
                this$0.mCurrentWeight = f;
            } else {
                String str5 = this$0.mLastUnit;
                if (str5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mLastUnit");
                    str5 = null;
                }
                if (str5.equals(this$0.getString(o1j.o1))) {
                    float f3 = this$0.mCurrentWeight * 0.4536f;
                    int iFloor2 = (int) Math.floor(f3);
                    NumberPickerView numberPickerView8 = this$0.mIntegerPicker;
                    Intrinsics.checkNotNull(numberPickerView8);
                    numberPickerView8.setValue(iFloor2);
                    float fRound2 = Math.round(((double) (f3 - iFloor2)) * 10.0d) * 0.1f;
                    this$0.mCurrentWeight = f3;
                    NumberPickerView numberPickerView9 = this$0.mFloatPicker;
                    Intrinsics.checkNotNull(numberPickerView9);
                    String[] strArr2 = this$0.float_array;
                    if (strArr2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("float_array");
                        strArr2 = null;
                    }
                    numberPickerView9.a0(strArr2, this$0.getIndex(fRound2), true);
                }
            }
            String str6 = this$0.mCurrentUnit;
            if (str6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCurrentUnit");
            } else {
                str2 = str6;
            }
            this$0.mLastUnit = str2;
            return;
        }
        String str7 = this$0.mCurrentUnit;
        if (str7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCurrentUnit");
            str7 = null;
        }
        if (str7.equals(this$0.getString(o1j.m1))) {
            NumberPickerView numberPickerView10 = this$0.mIntegerPicker;
            Intrinsics.checkNotNull(numberPickerView10);
            UserInfoConfigUtil userInfoConfigUtil2 = UserInfoConfigUtil.INSTANCE;
            numberPickerView10.setMinValue(userInfoConfigUtil2.getSUPPORTED_WEIGHT_RANGE_K()[0]);
            NumberPickerView numberPickerView11 = this$0.mIntegerPicker;
            Intrinsics.checkNotNull(numberPickerView11);
            numberPickerView11.setMaxValue(userInfoConfigUtil2.getSUPPORTED_WEIGHT_RANGE_K()[1]);
            String str8 = this$0.mLastUnit;
            if (str8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLastUnit");
                str8 = null;
            }
            if (str8.equals(this$0.getString(o1j.n1))) {
                float f4 = this$0.mCurrentWeight * 2.0f;
                int iFloor3 = (int) Math.floor(f4);
                NumberPickerView numberPickerView12 = this$0.mIntegerPicker;
                Intrinsics.checkNotNull(numberPickerView12);
                numberPickerView12.setValue(iFloor3);
                float fRound3 = Math.round(((double) (f4 - iFloor3)) * 10.0d) * 0.1f;
                this$0.mCurrentWeight = f4;
                NumberPickerView numberPickerView13 = this$0.mFloatPicker;
                Intrinsics.checkNotNull(numberPickerView13);
                String[] strArr3 = this$0.float_array;
                if (strArr3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("float_array");
                    strArr3 = null;
                }
                numberPickerView13.a0(strArr3, this$0.getIndex(fRound3), true);
            } else {
                String str9 = this$0.mLastUnit;
                if (str9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mLastUnit");
                    str9 = null;
                }
                if (str9.equals(this$0.getString(o1j.o1))) {
                    float f5 = this$0.mCurrentWeight * 0.4536f * 2;
                    int iFloor4 = (int) Math.floor(f5);
                    NumberPickerView numberPickerView14 = this$0.mIntegerPicker;
                    Intrinsics.checkNotNull(numberPickerView14);
                    numberPickerView14.setValue(iFloor4);
                    float fRound4 = Math.round(((double) (f5 - iFloor4)) * 10.0d) * 0.1f;
                    this$0.mCurrentWeight = f5;
                    NumberPickerView numberPickerView15 = this$0.mFloatPicker;
                    Intrinsics.checkNotNull(numberPickerView15);
                    String[] strArr4 = this$0.float_array;
                    if (strArr4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("float_array");
                        strArr4 = null;
                    }
                    numberPickerView15.a0(strArr4, this$0.getIndex(fRound4), true);
                }
            }
            String str10 = this$0.mCurrentUnit;
            if (str10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCurrentUnit");
            } else {
                str2 = str10;
            }
            this$0.mLastUnit = str2;
            return;
        }
        String str11 = this$0.mCurrentUnit;
        if (str11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCurrentUnit");
            str11 = null;
        }
        if (str11.equals(this$0.getString(o1j.o1))) {
            NumberPickerView numberPickerView16 = this$0.mIntegerPicker;
            Intrinsics.checkNotNull(numberPickerView16);
            UserInfoConfigUtil userInfoConfigUtil3 = UserInfoConfigUtil.INSTANCE;
            numberPickerView16.setMinValue(userInfoConfigUtil3.getSUPPORTED_WEIGHT_RANGE_POUND()[0]);
            NumberPickerView numberPickerView17 = this$0.mIntegerPicker;
            Intrinsics.checkNotNull(numberPickerView17);
            numberPickerView17.setMaxValue(userInfoConfigUtil3.getSUPPORTED_WEIGHT_RANGE_POUND()[1]);
            String str12 = this$0.mLastUnit;
            if (str12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLastUnit");
                str12 = null;
            }
            if (str12.equals(this$0.getString(o1j.n1))) {
                float f6 = this$0.mCurrentWeight / 0.4536f;
                int iFloor5 = (int) Math.floor(f6);
                NumberPickerView numberPickerView18 = this$0.mIntegerPicker;
                Intrinsics.checkNotNull(numberPickerView18);
                numberPickerView18.setValue(iFloor5);
                float fRound5 = Math.round(((double) (f6 - iFloor5)) * 10.0d) * 0.1f;
                this$0.mCurrentWeight = f6;
                Logger.d(this$0.TAG, "mCurrentWeight pound = " + f6);
                NumberPickerView numberPickerView19 = this$0.mFloatPicker;
                Intrinsics.checkNotNull(numberPickerView19);
                String[] strArr5 = this$0.float_array;
                if (strArr5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("float_array");
                    strArr5 = null;
                }
                numberPickerView19.a0(strArr5, this$0.getIndex(fRound5), true);
            } else {
                String str13 = this$0.mLastUnit;
                if (str13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mLastUnit");
                    str13 = null;
                }
                if (str13.equals(this$0.getString(o1j.m1))) {
                    float f7 = (this$0.mCurrentWeight / 2) / 0.4536f;
                    int iFloor6 = (int) Math.floor(f7);
                    NumberPickerView numberPickerView20 = this$0.mIntegerPicker;
                    Intrinsics.checkNotNull(numberPickerView20);
                    numberPickerView20.setValue(iFloor6);
                    float fRound6 = Math.round(((double) (f7 - iFloor6)) * 10.0d) * 0.1f;
                    this$0.mCurrentWeight = f7;
                    NumberPickerView numberPickerView21 = this$0.mFloatPicker;
                    Intrinsics.checkNotNull(numberPickerView21);
                    String[] strArr6 = this$0.float_array;
                    if (strArr6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("float_array");
                        strArr6 = null;
                    }
                    numberPickerView21.a0(strArr6, this$0.getIndex(fRound6), true);
                }
            }
            String str14 = this$0.mCurrentUnit;
            if (str14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCurrentUnit");
            } else {
                str2 = str14;
            }
            this$0.mLastUnit = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCreate$lambda$0(GuideEditWeightActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        UserGuideViewModel userGuideViewModel = (UserGuideViewModel) this$0.getMViewModel();
        BaseActivity baseActivity = this$0.mActivity;
        if (baseActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivity");
            baseActivity = null;
        }
        userGuideViewModel.onSkip(new WeakReference<>(baseActivity), this$0.mIndex);
        Logger.i(this$0.TAG, "onSkip weight activity");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCreate$lambda$1(GuideEditWeightActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).accountLogin();
            return;
        }
        Logger.i(this$0.TAG, "mCurrentWeight = " + this$0.mCurrentWeight);
        ((UserGuideViewModel) this$0.getMViewModel()).setWeight(this$0.mCurrentWeight);
        FitnessDataExtKt.getInstance(FitnessDataRecorder.INSTANCE).recordWeight("xiaomiwear_app_manually", FitnessDateUtils.getCurrentTZOffsetInSec(), new WeightItem(System.currentTimeMillis() / ((long) 1000), this$0.mCurrentWeight, null, null, null, null, null, null, null, null, 1020, null));
        ((UserGuideViewModel) this$0.getMViewModel()).onNext(new WeakReference<>(this$0), this$0.mIndex);
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return nvi.l;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return sv1.f34012a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.userinfo.ui.Hilt_GuideEditWeightActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(o1j.L);
        this.mActivity = this;
        if (getIntent().getBooleanExtra(GuidePageUtil.KEY_PAGE_SKIP_ENABLE, true)) {
            setEndTextView(hsi.D0, o1j.K0, null, 14.0f, new View.OnClickListener() { // from class: l5b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GuideEditWeightActivity.onCreate$lambda$0(this.f24680a, view);
                }
            });
        }
        ((UserGuideViewModel) getMViewModel()).initUserProfile();
        initPickerConfig(this);
        String[] stringArray = getResources().getStringArray(ehi.h);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        NumberPickerView numberPickerView = this.mUnitPicker;
        Intrinsics.checkNotNull(numberPickerView);
        numberPickerView.setDisplayedValues(stringArray);
        String[] strArrA = c1p.a(new ArrayList(), 0.0f, 0.9f, 0.1f);
        Intrinsics.checkNotNullExpressionValue(strArrA, "showTargetFloatList(...)");
        Logger.i(this.TAG, "mFloatPicker float_array is " + strArrA + " length is " + strArrA.length);
        NumberPickerView numberPickerView2 = this.mFloatPicker;
        Intrinsics.checkNotNull(numberPickerView2);
        numberPickerView2.setDisplayedValues(strArrA);
        this.mIndex = getIntent().getIntExtra(GuidePageUtil.KEY_PAGE_INDEX, 0);
        View viewFindViewById = findViewById(hsi.v1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById;
        if (SetPageManageExtKt.getInstance(SetPageManager.INSTANCE).isLastPage(this.mIndex)) {
            textView.setText(getString(o1j.A));
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: m5b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideEditWeightActivity.onCreate$lambda$1(this.f25764a, view);
            }
        });
        this.mCurrentWeight = ((UserGuideViewModel) getMViewModel()).getWeight();
        String string = getString(o1j.n1);
        this.mCurrentUnit = string;
        if (string == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCurrentUnit");
            string = null;
        }
        this.mLastUnit = string;
        Math.floor(this.mCurrentWeight);
        NumberPickerView numberPickerView3 = this.mIntegerPicker;
        Intrinsics.checkNotNull(numberPickerView3);
        numberPickerView3.setValue((int) ((UserGuideViewModel) getMViewModel()).getWeight());
        NumberPickerView numberPickerView4 = this.mIntegerPicker;
        Intrinsics.checkNotNull(numberPickerView4);
        numberPickerView4.setContentDescription(String.valueOf((int) ((UserGuideViewModel) getMViewModel()).getWeight()));
        this.intentFilter.addAction(UserInfoConfigUtil.ACTION_USER_INFO_GUIDE_FINISH_ACTIVITY);
        if (Build.VERSION.SDK_INT >= 33) {
            registerReceiver(this.mBroadcastReceiver, this.intentFilter, 2);
        } else {
            registerReceiver(this.mBroadcastReceiver, this.intentFilter);
        }
    }

    @Override // com.xiaomi.fitness.userinfo.ui.Hilt_GuideEditWeightActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        unregisterReceiver(this.mBroadcastReceiver);
        super.onDestroy();
    }
}
