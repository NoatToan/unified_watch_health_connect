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
import com.xiaomi.fitness.userinfo.ui.GuideEditGenderActivity;
import com.xiaomi.fitness.userinfo.utils.GuidePageUtil;
import com.xiaomi.fitness.userinfo.utils.UserInfoConfigUtil;
import defpackage.ejq;
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
@Metadata(d1 = {"\u0000M\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\n*\u0001 \b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b(\u0010\rJ\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00148\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00148\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016R\u0016\u0010\u001c\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0016R\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010$¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/userinfo/ui/GuideEditGenderActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/userinfo/ui/UserGuideViewModel;", "Lejq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "view", "initPickerConfig", "(Lcom/xiaomi/fitness/userinfo/ui/GuideEditGenderActivity;)V", LifecycleConstantKt.ON_DESTROY, "()V", "", "mIndex", "I", "Lcom/xiaomi/fitness/baseui/widget/NumberPickerView;", "mPicker", "Lcom/xiaomi/fitness/baseui/widget/NumberPickerView;", "", "mCurrentGender", "Ljava/lang/String;", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "mActivity", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "SEX_MALE", "SEX_FEMALE", "mCurrentSelectGender", "Landroid/content/IntentFilter;", "intentFilter", "Landroid/content/IntentFilter;", "com/xiaomi/fitness/userinfo/ui/GuideEditGenderActivity$mBroadcastReceiver$1", "mBroadcastReceiver", "Lcom/xiaomi/fitness/userinfo/ui/GuideEditGenderActivity$mBroadcastReceiver$1;", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class GuideEditGenderActivity extends Hilt_GuideEditGenderActivity<UserGuideViewModel, ejq> {
    private BaseActivity mActivity;
    private String mCurrentGender;
    private int mIndex;

    @Nullable
    private NumberPickerView mPicker;

    @NotNull
    private final String SEX_MALE = "male";

    @NotNull
    private final String SEX_FEMALE = "female";

    @NotNull
    private String mCurrentSelectGender = "male";

    @NotNull
    private final IntentFilter intentFilter = new IntentFilter();

    @NotNull
    private final GuideEditGenderActivity$mBroadcastReceiver$1 mBroadcastReceiver = new BroadcastReceiver() { // from class: com.xiaomi.fitness.userinfo.ui.GuideEditGenderActivity$mBroadcastReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            this.this$0.finish();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initPickerConfig$lambda$2(GuideEditGenderActivity this$0, NumberPickerView numberPickerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        NumberPickerView numberPickerView2 = this$0.mPicker;
        Intrinsics.checkNotNull(numberPickerView2);
        this$0.mCurrentGender = numberPickerView2.getContentByCurrValue();
        String str = null;
        if (AccessController.getContext() != null) {
            NumberPickerView numberPickerView3 = this$0.mPicker;
            Intrinsics.checkNotNull(numberPickerView3);
            int i3 = o1j.j;
            Object[] objArr = new Object[1];
            String str2 = this$0.mCurrentGender;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCurrentGender");
                str2 = null;
            }
            objArr[0] = str2;
            numberPickerView3.setContentDescription(this$0.getString(i3, objArr));
        }
        String str3 = this$0.mCurrentGender;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCurrentGender");
        } else {
            str = str3;
        }
        if (str.equals(this$0.getString(o1j.F))) {
            this$0.mCurrentSelectGender = this$0.SEX_MALE;
        } else {
            this$0.mCurrentSelectGender = this$0.SEX_FEMALE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCreate$lambda$0(GuideEditGenderActivity this$0, View view) {
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
    public static final void onCreate$lambda$1(GuideEditGenderActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).accountLogin();
        } else {
            ((UserGuideViewModel) this$0.getMViewModel()).setUserSex(this$0.mCurrentSelectGender);
            ((UserGuideViewModel) this$0.getMViewModel()).onNext(new WeakReference<>(this$0), this$0.mIndex);
        }
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return nvi.i;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return sv1.f34012a;
    }

    public final void initPickerConfig(@NotNull GuideEditGenderActivity view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.mPicker = (NumberPickerView) view.findViewById(hsi.F0);
        String[] strArr = {getString(o1j.F), getString(o1j.D)};
        NumberPickerView numberPickerView = this.mPicker;
        Intrinsics.checkNotNull(numberPickerView);
        numberPickerView.setDisplayedValues(strArr);
        NumberPickerView numberPickerView2 = this.mPicker;
        Intrinsics.checkNotNull(numberPickerView2);
        numberPickerView2.setMinValue(0);
        NumberPickerView numberPickerView3 = this.mPicker;
        Intrinsics.checkNotNull(numberPickerView3);
        numberPickerView3.setMaxValue(1);
        NumberPickerView numberPickerView4 = this.mPicker;
        Intrinsics.checkNotNull(numberPickerView4);
        numberPickerView4.setOnValueChangedListener(new NumberPickerView.d() { // from class: w4b
            @Override // com.xiaomi.fitness.baseui.widget.NumberPickerView.d
            public final void onValueChange(NumberPickerView numberPickerView5, int i, int i2) {
                GuideEditGenderActivity.initPickerConfig$lambda$2(this.f37606a, numberPickerView5, i, i2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.userinfo.ui.Hilt_GuideEditGenderActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((UserGuideViewModel) getMViewModel()).initUserProfile();
        setTitle(o1j.t1);
        this.mActivity = this;
        if (getIntent().getBooleanExtra(GuidePageUtil.KEY_PAGE_SKIP_ENABLE, true)) {
            setEndTextView(hsi.D0, o1j.K0, null, 14.0f, new View.OnClickListener() { // from class: u4b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GuideEditGenderActivity.onCreate$lambda$0(this.f35363a, view);
                }
            });
        }
        this.mIndex = getIntent().getIntExtra(GuidePageUtil.KEY_PAGE_INDEX, 0);
        initPickerConfig(this);
        View viewFindViewById = findViewById(hsi.v1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById;
        if (SetPageManageExtKt.getInstance(SetPageManager.INSTANCE).isLastPage(this.mIndex)) {
            textView.setText(getString(o1j.A));
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: v4b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideEditGenderActivity.onCreate$lambda$1(this.f36463a, view);
            }
        });
        this.mCurrentGender = ((UserGuideViewModel) getMViewModel()).getGender();
        this.intentFilter.addAction(UserInfoConfigUtil.ACTION_USER_INFO_GUIDE_FINISH_ACTIVITY);
        if (Build.VERSION.SDK_INT >= 33) {
            registerReceiver(this.mBroadcastReceiver, this.intentFilter, 2);
        } else {
            registerReceiver(this.mBroadcastReceiver, this.intentFilter);
        }
    }

    @Override // com.xiaomi.fitness.userinfo.ui.Hilt_GuideEditGenderActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        unregisterReceiver(this.mBroadcastReceiver);
        super.onDestroy();
    }
}
