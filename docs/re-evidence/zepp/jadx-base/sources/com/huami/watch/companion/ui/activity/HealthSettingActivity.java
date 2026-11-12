package com.huami.watch.companion.ui.activity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProviders;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.companion.R;
import com.huami.watch.companion.arch.Result;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.ecg.ui.helper.LoadingDialogHelper;
import com.huami.watch.companion.ui.activity.HealthSettingActivity;
import com.huami.watch.companion.ui.arch.HealthConfigViewModel;
import com.huami.watch.companion.ui.fragment.CalorieGoalSettingFragment;
import com.huami.watch.ui.dialog.AlertDialog;
import com.xiaomi.hm.health.baseui.widget.ItemView;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016J\"\u0010\u0013\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016R\u001d\u0010\u0018\u001a\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001d\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/huami/watch/companion/ui/activity/HealthSettingActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Landroid/view/View$OnClickListener;", "Lcom/xiaomi/hm/health/baseui/widget/ItemView$OnCheckedChangeListener;", "", "initView", SOAP.XMLNS, "x", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/View;", "v", "onClick", "Lcom/xiaomi/hm/health/baseui/widget/ItemView;", "itemView", "", "isChecked", "fromUser", "onCheckedChanged", "Lcom/huami/watch/companion/ui/arch/HealthConfigViewModel;", "Lkotlin/Lazy;", "r", "()Lcom/huami/watch/companion/ui/arch/HealthConfigViewModel;", "mHealthConfigViewModel", "Lcom/huami/watch/companion/ecg/ui/helper/LoadingDialogHelper;", "y", DTransferConstants.SEARCH_KEY, "()Lcom/huami/watch/companion/ecg/ui/helper/LoadingDialogHelper;", "mDialogHelper", "<init>", "()V", "companion_release"}, k = 1, mv = {1, 5, 1})
public final class HealthSettingActivity extends BaseTitleActivity implements View.OnClickListener, ItemView.OnCheckedChangeListener {

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
            return new LoadingDialogHelper(HealthSettingActivity.this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watch/companion/ui/arch/HealthConfigViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<HealthConfigViewModel> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HealthConfigViewModel invoke() {
            return (HealthConfigViewModel) ViewModelProviders.of(HealthSettingActivity.this).get(HealthConfigViewModel.class);
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

    private final HealthConfigViewModel r() {
        return (HealthConfigViewModel) this.mHealthConfigViewModel.getValue();
    }

    private final void s() {
        r().getCalorieGoalLiveData().observe(this, new Observer() { // from class: tx3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HealthSettingActivity.t(this.a, (Integer) obj);
            }
        });
        r().getLongSitRemindLiveData().observe(this, new Observer() { // from class: rx3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HealthSettingActivity.u(this.a, (Boolean) obj);
            }
        });
        r().getStepGoalRemindLiveData().observe(this, new Observer() { // from class: sx3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HealthSettingActivity.v(this.a, (Boolean) obj);
            }
        });
        r().getSyncStatusLiveData().observe(this, new Observer() { // from class: qx3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HealthSettingActivity.w(this.a, (Result) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(HealthSettingActivity healthSettingActivity, Integer num) {
        if (num == null) {
            return;
        }
        int iIntValue = num.intValue();
        ((ItemView) healthSettingActivity.findViewById(R.id.itemCalGoalView)).setValue(iIntValue + healthSettingActivity.getString(R.string.unit_calorie));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(HealthSettingActivity healthSettingActivity, Boolean bool) {
        if (bool == null) {
            return;
        }
        ((ItemView) healthSettingActivity.findViewById(R.id.itemLongSitView)).setChecked(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(HealthSettingActivity healthSettingActivity, Boolean bool) {
        if (bool == null) {
            return;
        }
        ((ItemView) healthSettingActivity.findViewById(R.id.itemStepGoalView)).setChecked(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(HealthSettingActivity healthSettingActivity, Result result) {
        healthSettingActivity.q().showOrError(result, healthSettingActivity.getString(R.string.setting_loading), healthSettingActivity.getString(R.string.setting_success), healthSettingActivity.getString(R.string.setting_fail));
    }

    private final void x() {
        final CalorieGoalSettingFragment calorieGoalSettingFragment = new CalorieGoalSettingFragment();
        AlertDialog.setTitle(getString(R.string.setting_step_goal)).setContent(calorieGoalSettingFragment).setPositiveBtn(getString(R.string.btn_enter), new DialogInterface.OnClickListener() { // from class: px3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                HealthSettingActivity.y(this.a, calorieGoalSettingFragment, dialogInterface, i);
            }
        }).setNegativeBtn(getString(R.string.btn_cancel)).show(getFragmentManager(), "CalSetting");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(HealthSettingActivity healthSettingActivity, CalorieGoalSettingFragment calorieGoalSettingFragment, DialogInterface dialogInterface, int i) {
        if (DeviceManager.getManager(healthSettingActivity).isBoundDeviceConnected()) {
            healthSettingActivity.r().saveCalorieGoal(calorieGoalSettingFragment.getCurrentSelectCalorie());
        } else {
            Toast.makeText(healthSettingActivity, R.string.device_disconnected, 0).show();
        }
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
        setContentView(R.layout.activity_health_setting);
        setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE, ContextCompat.getColor(this, R.color.white), true);
        initView();
        s();
    }
}
