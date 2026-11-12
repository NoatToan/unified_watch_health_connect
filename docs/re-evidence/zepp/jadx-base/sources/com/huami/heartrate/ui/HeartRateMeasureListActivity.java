package com.huami.heartrate.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.heartrate.R;
import com.huami.heartrate.databinding.HeartRateActivityHeartRateMeasureBinding;
import com.huami.heartrate.ui.HeartRateMeasureListActivity;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.activity.ActivityViewBindingsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\u001d\u0010\u000b\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/huami/heartrate/ui/HeartRateMeasureListActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lcom/huami/heartrate/databinding/HeartRateActivityHeartRateMeasureBinding;", "a", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", GoogleApiAvailabilityLight.a, "()Lcom/huami/heartrate/databinding/HeartRateActivityHeartRateMeasureBinding;", "binding", "<init>", "()V", "Companion", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final class HeartRateMeasureListActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding = ActivityViewBindingsKt.viewBinding(new HeartRateMeasureListActivity$special$$inlined$viewBinding$1(new InflateViewBinder(HeartRateActivityHeartRateMeasureBinding.class)));
    public static final /* synthetic */ KProperty<Object>[] b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(HeartRateMeasureListActivity.class), "binding", "getBinding()Lcom/huami/heartrate/databinding/HeartRateActivityHeartRateMeasureBinding;"))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/heartrate/ui/HeartRateMeasureListActivity$Companion;", "", "Landroidx/fragment/app/Fragment;", "fragment", "", "launchForResult", "<init>", "()V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launchForResult(@NotNull Fragment fragment) {
            fragment.startActivity(new Intent(fragment.requireContext(), (Class<?>) HeartRateMeasureListActivity.class));
        }
    }

    private final HeartRateActivityHeartRateMeasureBinding d() {
        return (HeartRateActivityHeartRateMeasureBinding) this.binding.getValue(this, b[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(HeartRateMeasureListActivity heartRateMeasureListActivity, View view) {
        heartRateMeasureListActivity.finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(savedInstanceState);
        setContentView(d().getRoot());
        d().tvTitleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: uy3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HeartRateMeasureListActivity.e(this.a, view);
            }
        });
        getSupportFragmentManager().beginTransaction().add(R.id.fragmentContainer, HeartRateMeasureListFragment.INSTANCE.newInstance()).commit();
    }
}
