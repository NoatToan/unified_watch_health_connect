package com.xiaomi.hm.health.device.healthsetting;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProviders;
import com.huami.devicex.R;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.companion.arch.Result;
import com.huami.watch.companion.ecg.ui.helper.LoadingDialogHelper;
import com.huami.watch.companion.ui.fragment.CalorieGoalSettingFragment;
import com.huami.watch.ui.dialog.AlertDialog;
import com.xiaomi.hm.health.baseui.widget.ItemView;
import com.xiaomi.hm.health.device.healthsetting.HMHealthSettingActivity;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016J\"\u0010\u0013\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016R\u001d\u0010\u0018\u001a\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001d\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/device/healthsetting/HMHealthSettingActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Landroid/view/View$OnClickListener;", "Lcom/xiaomi/hm/health/baseui/widget/ItemView$OnCheckedChangeListener;", "", "initView", SOAP.XMLNS, "x", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/View;", "v", "onClick", "Lcom/xiaomi/hm/health/baseui/widget/ItemView;", "itemView", "", "isChecked", "fromUser", "onCheckedChanged", "Lcom/xiaomi/hm/health/device/healthsetting/HealthSettingViewModel;", "Lkotlin/Lazy;", "r", "()Lcom/xiaomi/hm/health/device/healthsetting/HealthSettingViewModel;", "mHealthConfigViewModel", "Lcom/huami/watch/companion/ecg/ui/helper/LoadingDialogHelper;", "y", DTransferConstants.SEARCH_KEY, "()Lcom/huami/watch/companion/ecg/ui/helper/LoadingDialogHelper;", "mDialogHelper", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HMHealthSettingActivity extends BaseTitleActivity implements View.OnClickListener, ItemView.OnCheckedChangeListener {

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final Lazy mHealthConfigViewModel = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDialogHelper = LazyKt__LazyJVMKt.lazy(new a());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watch/companion/ecg/ui/helper/LoadingDialogHelper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<LoadingDialogHelper> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LoadingDialogHelper invoke() {
            return new LoadingDialogHelper(HMHealthSettingActivity.this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/healthsetting/HealthSettingViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<HealthSettingViewModel> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HealthSettingViewModel invoke() {
            return (HealthSettingViewModel) ViewModelProviders.of(HMHealthSettingActivity.this).get(HealthSettingViewModel.class);
        }
    }

    private final void initView() {
        setTitleText(R.string.title_health_setting);
        ((ItemView) findViewById(R.id.itemCalGoalView)).setOnClickListener(this);
        ((ItemView) findViewById(R.id.itemLongSitView)).setOnCheckedChangeListener(this);
        ((ItemView) findViewById(R.id.itemStepGoalView)).setOnCheckedChangeListener(this);
    }

    private final LoadingDialogHelper q() {
        return (LoadingDialogHelper) this.mDialogHelper.getValue();
    }

    private final HealthSettingViewModel r() {
        return (HealthSettingViewModel) this.mHealthConfigViewModel.getValue();
    }

    private final void s() {
        r().getCalorieGoalLiveData().observe(this, new Observer() { // from class: tz2
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HMHealthSettingActivity.t(this.a, (Integer) obj);
            }
        });
        r().getLongSitRemindLiveData().observe(this, new Observer() { // from class: rz2
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HMHealthSettingActivity.u(this.a, (Boolean) obj);
            }
        });
        r().getStepGoalRemindLiveData().observe(this, new Observer() { // from class: sz2
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HMHealthSettingActivity.v(this.a, (Boolean) obj);
            }
        });
        r().getSyncStatusLiveData().observe(this, new Observer() { // from class: qz2
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HMHealthSettingActivity.w(this.a, (Result) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(HMHealthSettingActivity hMHealthSettingActivity, Integer num) {
        if (num == null) {
            return;
        }
        int iIntValue = num.intValue();
        ((ItemView) hMHealthSettingActivity.findViewById(R.id.itemCalGoalView)).setValue(iIntValue + hMHealthSettingActivity.getString(R.string.unit_calorie));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(HMHealthSettingActivity hMHealthSettingActivity, Boolean bool) {
        if (bool == null) {
            return;
        }
        ((ItemView) hMHealthSettingActivity.findViewById(R.id.itemLongSitView)).setChecked(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(HMHealthSettingActivity hMHealthSettingActivity, Boolean bool) {
        if (bool == null) {
            return;
        }
        ((ItemView) hMHealthSettingActivity.findViewById(R.id.itemStepGoalView)).setChecked(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(HMHealthSettingActivity hMHealthSettingActivity, Result result) {
        hMHealthSettingActivity.q().showOrError(result, hMHealthSettingActivity.getString(R.string.setting_loading), hMHealthSettingActivity.getString(R.string.setting_success), hMHealthSettingActivity.getString(R.string.setting_fail));
    }

    private final void x() {
        final CalorieGoalSettingFragment calorieGoalSettingFragment = new CalorieGoalSettingFragment();
        AlertDialog.setTitle(getString(R.string.setting_step_goal)).setContent(calorieGoalSettingFragment).setPositiveBtn(getString(R.string.btn_enter), new DialogInterface.OnClickListener() { // from class: pz2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                HMHealthSettingActivity.y(this.a, calorieGoalSettingFragment, dialogInterface, i);
            }
        }).setNegativeBtn(getString(R.string.btn_cancel)).show(getFragmentManager(), "CalSetting");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(HMHealthSettingActivity hMHealthSettingActivity, CalorieGoalSettingFragment calorieGoalSettingFragment, DialogInterface dialogInterface, int i) {
        hMHealthSettingActivity.r().saveCalorieGoal(calorieGoalSettingFragment.getCurrentSelectCalorie());
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.xiaomi.hm.health.baseui.widget.ItemView.OnCheckedChangeListener
    public void onCheckedChanged(@Nullable ItemView itemView, boolean isChecked, boolean fromUser) {
        Integer numValueOf = itemView == null ? null : Integer.valueOf(itemView.getId());
        int i = R.id.itemLongSitView;
        if (numValueOf != null && numValueOf.intValue() == i) {
            if (fromUser) {
                r().saveLongSitRemind(isChecked);
            }
        } else {
            int i2 = R.id.itemStepGoalView;
            if (numValueOf != null && numValueOf.intValue() == i2 && fromUser) {
                r().saveStepGoalRemind(isChecked);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View v) {
        if (v.getId() != R.id.itemCalGoalView) {
            throw new IllegalArgumentException("Unknown id");
        }
        x();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_setting_bak);
        setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE, ContextCompat.getColor(this, R.color.white), true);
        initView();
        s();
    }
}
