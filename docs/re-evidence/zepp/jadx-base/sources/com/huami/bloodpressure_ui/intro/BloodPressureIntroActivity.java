package com.huami.bloodpressure_ui.intro;

import android.os.Bundle;
import android.view.View;
import com.chenenyu.router.annotation.Route;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bloodpressure_ui.R;
import com.huami.bloodpressure_ui.base.BaseActivity;
import com.huami.bloodpressure_ui.databinding.ActivityBloodPressureIntroBinding;
import com.huami.bloodpressure_ui.ext.ContextExKt;
import com.huami.bloodpressure_ui.intro.BloodPressureIntroActivity;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.activity.ActivityViewBindingsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Route({BloodPressureIntroActivity.ROUTE_BLOODPRESSURE_INTRO})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014R\u001d\u0010\f\u001a\u00020\u00078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/huami/bloodpressure_ui/intro/BloodPressureIntroActivity;", "Lcom/huami/bloodpressure_ui/base/BaseActivity;", "", "initTitle", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/huami/bloodpressure_ui/databinding/ActivityBloodPressureIntroBinding;", "a", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", GoogleApiAvailabilityLight.a, "()Lcom/huami/bloodpressure_ui/databinding/ActivityBloodPressureIntroBinding;", "binding", "<init>", "()V", "Companion", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureIntroActivity extends BaseActivity {

    @NotNull
    public static final String ROUTE_BLOODPRESSURE_INTRO = "bloodpressure/BloodPressureIntroActivity";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding = ActivityViewBindingsKt.viewBinding(new BloodPressureIntroActivity$special$$inlined$viewBinding$1(new InflateViewBinder(ActivityBloodPressureIntroBinding.class)));
    public static final /* synthetic */ KProperty<Object>[] b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BloodPressureIntroActivity.class), "binding", "getBinding()Lcom/huami/bloodpressure_ui/databinding/ActivityBloodPressureIntroBinding;"))};

    private final ActivityBloodPressureIntroBinding d() {
        return (ActivityBloodPressureIntroBinding) this.binding.getValue(this, b[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(BloodPressureIntroActivity bloodPressureIntroActivity, View view) {
        bloodPressureIntroActivity.finish();
    }

    private final void initTitle() {
        RainbowTitleBar rainbowTitleBar = d().containerTitlebar.tvTitlebar;
        rainbowTitleBar.setTitle(R.string.blood_pressure_func);
        rainbowTitleBar.setTitleTextColor(ContextExKt.color(rainbowTitleBar.getContext(), R.color.s1));
        rainbowTitleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: f10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BloodPressureIntroActivity.e(this.a, view);
            }
        });
    }

    @Override // com.huami.bloodpressure_ui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(d().getRoot());
        initTitle();
        d().icBp.setImageResource(R.drawable.ic_blood_pressure);
        d().ivUse.setImageResource(R.drawable.ic_bp_intro_use);
    }
}
