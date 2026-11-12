package com.xiaomi.fitness.userinfo.ui;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.baseui.widget.NumberPickerView;
import com.xiaomi.fitness.baseui.widget.SpinnerDatePicker;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.login.export.CheckerUserSettingManager;
import com.xiaomi.fitness.login.export.CheckerUserSettingManagerExtKt;
import com.xiaomi.fitness.user.info.export.SetPageManageExtKt;
import com.xiaomi.fitness.user.info.export.SetPageManager;
import com.xiaomi.fitness.user.info.export.UserInformationManager;
import com.xiaomi.fitness.user.info.export.UserInformationManagerExtKt;
import com.xiaomi.fitness.userinfo.ui.GuideEditBirthdayActivity;
import com.xiaomi.fitness.userinfo.utils.GuidePageUtil;
import com.xiaomi.fitness.userinfo.utils.UserInfoConfigUtil;
import defpackage.ajq;
import defpackage.av6;
import defpackage.hsi;
import defpackage.nvi;
import defpackage.o1j;
import defpackage.sv1;
import java.lang.ref.WeakReference;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Y\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\n*\u0001!\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b)\u0010\u0011J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0015¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010%¨\u0006*"}, d2 = {"Lcom/xiaomi/fitness/userinfo/ui/GuideEditBirthdayActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/userinfo/ui/UserGuideViewModel;", "Lajq;", "view", "", "initPickerConfig", "(Lcom/xiaomi/fitness/userinfo/ui/GuideEditBirthdayActivity;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "isSkip", "showAgeDialog", "(Z)V", LifecycleConstantKt.ON_DESTROY, "()V", "", "mCurrentBirthday", "J", "Lcom/xiaomi/fitness/baseui/widget/SpinnerDatePicker;", "mPickerBirthday", "Lcom/xiaomi/fitness/baseui/widget/SpinnerDatePicker;", "", "mIndex", "I", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "mActivity", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "Landroid/content/IntentFilter;", "intentFilter", "Landroid/content/IntentFilter;", "com/xiaomi/fitness/userinfo/ui/GuideEditBirthdayActivity$mBroadcastReceiver$1", "mBroadcastReceiver", "Lcom/xiaomi/fitness/userinfo/ui/GuideEditBirthdayActivity$mBroadcastReceiver$1;", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class GuideEditBirthdayActivity extends Hilt_GuideEditBirthdayActivity<UserGuideViewModel, ajq> {
    private BaseActivity mActivity;
    private long mCurrentBirthday;
    private int mIndex;
    private SpinnerDatePicker mPickerBirthday;

    @NotNull
    private final IntentFilter intentFilter = new IntentFilter();

    @NotNull
    private final GuideEditBirthdayActivity$mBroadcastReceiver$1 mBroadcastReceiver = new BroadcastReceiver() { // from class: com.xiaomi.fitness.userinfo.ui.GuideEditBirthdayActivity$mBroadcastReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            this.this$0.finish();
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ UserGuideViewModel access$getMViewModel(GuideEditBirthdayActivity guideEditBirthdayActivity) {
        return (UserGuideViewModel) guideEditBirthdayActivity.getMViewModel();
    }

    private final void initPickerConfig(GuideEditBirthdayActivity view) {
        final Calendar calendar = Calendar.getInstance();
        this.mPickerBirthday = (SpinnerDatePicker) view.findViewById(hsi.E0);
        long[] birthdaySelectRange = UserInformationManagerExtKt.getInstance(UserInformationManager.INSTANCE).getBirthdaySelectRange();
        SpinnerDatePicker spinnerDatePicker = this.mPickerBirthday;
        SpinnerDatePicker spinnerDatePicker2 = null;
        if (spinnerDatePicker == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPickerBirthday");
            spinnerDatePicker = null;
        }
        spinnerDatePicker.b(birthdaySelectRange[0], birthdaySelectRange[1]);
        SpinnerDatePicker spinnerDatePicker3 = this.mPickerBirthday;
        if (spinnerDatePicker3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPickerBirthday");
            spinnerDatePicker3 = null;
        }
        View viewFindViewById = spinnerDatePicker3.findViewById(hsi.H1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        final NumberPickerView numberPickerView = (NumberPickerView) viewFindViewById;
        SpinnerDatePicker spinnerDatePicker4 = this.mPickerBirthday;
        if (spinnerDatePicker4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPickerBirthday");
            spinnerDatePicker4 = null;
        }
        View viewFindViewById2 = spinnerDatePicker4.findViewById(hsi.A0);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        NumberPickerView numberPickerView2 = (NumberPickerView) viewFindViewById2;
        SpinnerDatePicker spinnerDatePicker5 = this.mPickerBirthday;
        if (spinnerDatePicker5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPickerBirthday");
            spinnerDatePicker5 = null;
        }
        View viewFindViewById3 = spinnerDatePicker5.findViewById(hsi.w);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        NumberPickerView numberPickerView3 = (NumberPickerView) viewFindViewById3;
        if (AppUtil.INSTANCE.isPlayChannel() || !LocaleUtil.isCN()) {
            numberPickerView.setHintText(" ");
            numberPickerView2.setHintText(" ");
            numberPickerView3.setHintText(" ");
        } else {
            numberPickerView.setHintText(getString(o1j.x1));
            numberPickerView2.setHintText(getString(o1j.f));
            numberPickerView3.setHintText(getString(o1j.d));
        }
        SpinnerDatePicker spinnerDatePicker6 = this.mPickerBirthday;
        if (spinnerDatePicker6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPickerBirthday");
        } else {
            spinnerDatePicker2 = spinnerDatePicker6;
        }
        spinnerDatePicker2.setOnDateChangedListener(new SpinnerDatePicker.d() { // from class: q4b
            @Override // com.xiaomi.fitness.baseui.widget.SpinnerDatePicker.d
            public final void a(SpinnerDatePicker spinnerDatePicker7, int i, int i2, int i3) {
                GuideEditBirthdayActivity.initPickerConfig$lambda$2(calendar, this, numberPickerView, spinnerDatePicker7, i, i2, i3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initPickerConfig$lambda$2(Calendar calendar, GuideEditBirthdayActivity this$0, NumberPickerView yearPicker, SpinnerDatePicker spinnerDatePicker, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(yearPicker, "$yearPicker");
        calendar.set(i, i2, i3);
        this$0.mCurrentBirthday = calendar.getTimeInMillis();
        if (AppUtil.INSTANCE.isPlayChannel() || !LocaleUtil.isCN()) {
            yearPicker.setHintText(" ");
        } else {
            yearPicker.setHintText(this$0.getString(o1j.x1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(GuideEditBirthdayActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showAgeDialog(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCreate$lambda$1(GuideEditBirthdayActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).accountLogin();
            return;
        }
        boolean zCheckIsBiggerThanLimitAge = GuidePageUtil.INSTANCE.checkIsBiggerThanLimitAge(this$0.mCurrentBirthday);
        if (zCheckIsBiggerThanLimitAge) {
            ((UserGuideViewModel) this$0.getMViewModel()).setBirthday(UserInfoConfigUtil.INSTANCE.getDateToString(this$0.mCurrentBirthday, "yyyy-MM-dd"));
        }
        if (!zCheckIsBiggerThanLimitAge) {
            this$0.showAgeDialog(false);
            return;
        }
        UserGuideViewModel userGuideViewModel = (UserGuideViewModel) this$0.getMViewModel();
        BaseActivity baseActivity = this$0.mActivity;
        if (baseActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivity");
            baseActivity = null;
        }
        userGuideViewModel.onNext(new WeakReference<>(baseActivity), this$0.mIndex);
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return nvi.g;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return sv1.f34012a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.userinfo.ui.Hilt_GuideEditBirthdayActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"ResourceType"})
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((UserGuideViewModel) getMViewModel()).initUserProfile();
        setTitle(o1j.r1);
        this.mActivity = this;
        if (getIntent().getBooleanExtra(GuidePageUtil.KEY_PAGE_SKIP_ENABLE, true)) {
            setEndTextView(hsi.D0, o1j.K0, null, 14.0f, new View.OnClickListener() { // from class: r4b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GuideEditBirthdayActivity.onCreate$lambda$0(this.f32171a, view);
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
        textView.setOnClickListener(new View.OnClickListener() { // from class: s4b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideEditBirthdayActivity.onCreate$lambda$1(this.f33267a, view);
            }
        });
        this.mCurrentBirthday = ((UserGuideViewModel) getMViewModel()).getBirthday();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(this.mCurrentBirthday);
        SpinnerDatePicker spinnerDatePicker = this.mPickerBirthday;
        if (spinnerDatePicker == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPickerBirthday");
            spinnerDatePicker = null;
        }
        spinnerDatePicker.c(calendar.get(1), calendar.get(2), calendar.get(5));
        this.intentFilter.addAction(UserInfoConfigUtil.ACTION_USER_INFO_GUIDE_FINISH_ACTIVITY);
        if (Build.VERSION.SDK_INT >= 33) {
            registerReceiver(this.mBroadcastReceiver, this.intentFilter, 2);
        } else {
            registerReceiver(this.mBroadcastReceiver, this.intentFilter);
        }
    }

    @Override // com.xiaomi.fitness.userinfo.ui.Hilt_GuideEditBirthdayActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        unregisterReceiver(this.mBroadcastReceiver);
        super.onDestroy();
    }

    public final void showAgeDialog(final boolean isSkip) {
        CommonDialog commonDialogCreate = new CommonDialog.c("repeat").setDialogTitle(o1j.C0).setDialogDescription(o1j.I).setNegativeText(o1j.common_exit).setPositiveText(o1j.B).create();
        Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
        Intrinsics.checkNotNull(commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.userinfo.ui.GuideEditBirthdayActivity.showAgeDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    AccountManagerExtKt.getInstance(AccountManager.INSTANCE).logout();
                    return;
                }
                if (which != -1) {
                    return;
                }
                BaseActivity baseActivity = null;
                if (isSkip) {
                    UserGuideViewModel userGuideViewModelAccess$getMViewModel = GuideEditBirthdayActivity.access$getMViewModel(this);
                    BaseActivity baseActivity2 = this.mActivity;
                    if (baseActivity2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mActivity");
                    } else {
                        baseActivity = baseActivity2;
                    }
                    userGuideViewModelAccess$getMViewModel.onSkip(new WeakReference<>(baseActivity), this.mIndex);
                    return;
                }
                UserGuideViewModel userGuideViewModelAccess$getMViewModel2 = GuideEditBirthdayActivity.access$getMViewModel(this);
                BaseActivity baseActivity3 = this.mActivity;
                if (baseActivity3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mActivity");
                } else {
                    baseActivity = baseActivity3;
                }
                userGuideViewModelAccess$getMViewModel2.onNext(new WeakReference<>(baseActivity), this.mIndex);
            }

            @Override // defpackage.av6
            public void onDialogMultiClick(String dialogName, int which, boolean isChecked) {
                Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                super.onDialogMultiClick(dialogName, which, isChecked);
            }
        }), "null cannot be cast to non-null type com.xiaomi.fitness.baseui.dialog.CommonDialog<*>");
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
    }
}
