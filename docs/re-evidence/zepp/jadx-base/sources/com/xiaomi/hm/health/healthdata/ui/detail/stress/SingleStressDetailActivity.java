package com.xiaomi.hm.health.healthdata.ui.detail.stress;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.stress.domain.model.SingleStress;
import com.huami.stress.domain.service.StressLevelService;
import com.huami.tools.analytics.DbUtils;
import com.huami.widget.colorsbar.ColorsBar;
import com.huami.widget.typeface.TypefaceTextView;
import com.xiaomi.hm.health.R;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.HMDeviceUtils;
import com.xiaomi.hm.health.healthdata.ui.detail.stress.SingleStressDetailActivity;
import com.xiaomi.hm.health.healthdata.utils.stress.StressDataHelper;
import java.io.Serializable;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002J\u0012\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/detail/stress/SingleStressDetailActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/huami/stress/domain/model/SingleStress;", "stress", "", "h", "", "title", "e", "", "value", "i", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "a", "Lcom/huami/stress/domain/model/SingleStress;", "mStress", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SingleStressDetailActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String b = "extra_stress";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private SingleStress mStress;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/detail/stress/SingleStressDetailActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/stress/domain/model/SingleStress;", "stress", "", "navigate", "", "EXTRA_STRESS", "Ljava/lang/String;", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void navigate(@NotNull Context context, @NotNull SingleStress stress) {
            Intent intent = new Intent(context, (Class<?>) SingleStressDetailActivity.class);
            intent.putExtra(SingleStressDetailActivity.b, stress);
            Unit unit = Unit.INSTANCE;
            context.startActivity(intent);
        }
    }

    private final void e(String title) {
        RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) findViewById(R.id.rainbow_title_bar);
        rainbowTitleBar.setTitle(title);
        rainbowTitleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: hv6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SingleStressDetailActivity.f(this.a, view);
            }
        });
        rainbowTitleBar.setOnActionMenuClickListener(new RainbowTitleBar.OnActionMenuClickListener() { // from class: iv6
            @Override // com.huami.lib.rainbow.titlebar.RainbowTitleBar.OnActionMenuClickListener
            public final void onClick(View view, int i) {
                SingleStressDetailActivity.g(this.a, view, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(SingleStressDetailActivity singleStressDetailActivity, View view) {
        singleStressDetailActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(SingleStressDetailActivity singleStressDetailActivity, View view, int i) {
        SingleStress singleStress = singleStressDetailActivity.mStress;
        if (singleStress == null) {
            return;
        }
        SingleStressShareActivity.INSTANCE.navigate(singleStressDetailActivity, singleStress);
    }

    private final void h(SingleStress stress) {
        this.mStress = stress;
        e(TimeUtils.formatDateTime_y_12(this, new Date(stress.getTimestamp())));
        ColorsBar colorsBar = (ColorsBar) findViewById(R.id.colors_bar);
        colorsBar.enableIndicator(true);
        colorsBar.initColorsSection(StressDataHelper.INSTANCE.getStressColorsBarData(colorsBar.getContext()));
        ((TypefaceTextView) findViewById(R.id.data_source)).setText(getString(com.huami.watch.hmwatchmanager.R.string.stress_data_source, new Object[]{HMDeviceUtils.getDeviceDescription(this, HMDeviceSource.fromValue(stress.getDeviceSource()), (String) null)}));
        i(stress.getValue());
    }

    private final void i(int value) {
        String string;
        int iCalculateStressLevel = StressLevelService.INSTANCE.calculateStressLevel(value);
        Drawable drawable = ContextCompat.getDrawable(this, com.huami.watch.hmwatchmanager.R.drawable.shape_circle_stress_pie_empty);
        String string2 = "";
        if (iCalculateStressLevel == 1) {
            drawable = ContextCompat.getDrawable(this, com.huami.watch.hmwatchmanager.R.drawable.stress_bg_stress_result_relax);
            string2 = getString(com.huami.watch.hmwatchmanager.R.string.stress_level, new Object[]{getString(com.huami.watch.hmwatchmanager.R.string.stress_level_relax)});
            string = getString(com.huami.watch.hmwatchmanager.R.string.stress_detail_current_level_relax_desc);
        } else if (iCalculateStressLevel == 2) {
            drawable = ContextCompat.getDrawable(this, com.huami.watch.hmwatchmanager.R.drawable.stress_bg_stress_result_normal);
            string2 = getString(com.huami.watch.hmwatchmanager.R.string.stress_level, new Object[]{getString(com.huami.watch.hmwatchmanager.R.string.stress_level_normal)});
            string = getString(com.huami.watch.hmwatchmanager.R.string.stress_detail_current_level_normal_desc);
        } else if (iCalculateStressLevel == 3) {
            drawable = ContextCompat.getDrawable(this, com.huami.watch.hmwatchmanager.R.drawable.stress_bg_stress_result_medium);
            string2 = getString(com.huami.watch.hmwatchmanager.R.string.stress_level, new Object[]{getString(com.huami.watch.hmwatchmanager.R.string.stress_level_medium)});
            string = getString(com.huami.watch.hmwatchmanager.R.string.stress_detail_current_level_medium_desc);
        } else if (iCalculateStressLevel != 4) {
            string = "";
        } else {
            drawable = ContextCompat.getDrawable(this, com.huami.watch.hmwatchmanager.R.drawable.stress_bg_stress_result_high);
            string2 = getString(com.huami.watch.hmwatchmanager.R.string.stress_level, new Object[]{getString(com.huami.watch.hmwatchmanager.R.string.stress_level_high)});
            string = getString(com.huami.watch.hmwatchmanager.R.string.stress_detail_current_level_high_desc);
        }
        int i = R.id.value_tv;
        ((TypefaceTextView) findViewById(i)).setText(String.valueOf(value));
        ((TypefaceTextView) findViewById(i)).setBackground(drawable);
        ((ColorsBar) findViewById(R.id.colors_bar)).updateData(value);
        ((TypefaceTextView) findViewById(R.id.level_str)).setText(string2);
        ((TypefaceTextView) findViewById(R.id.level_desc)).setText(string);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(2132017904);
        super.onCreate(savedInstanceState);
        setContentView(com.huami.watch.hmwatchmanager.R.layout.activity_single_stress_detail);
        Serializable serializableExtra = getIntent().getSerializableExtra(b);
        if (serializableExtra == null) {
            return;
        }
        h((SingleStress) serializableExtra);
    }
}
