package com.huami.bloodoxygen.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bloodoxygen.core.koin.BloodOxygenKoinScopeKt;
import com.huami.bloodoxygen.ui.R;
import com.huami.bloodoxygen.ui.activity.Spo2IntroDetailActivity;
import com.huami.bloodoxygen.ui.view.BloodOxygenTitleBar;
import com.huami.bloodoxygen.ui.vo.DetailUIConfig;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.tools.analytics.DbUtils;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\u001d\u0010\u000b\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/huami/bloodoxygen/ui/activity/Spo2IntroDetailActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lcom/huami/bloodoxygen/ui/vo/DetailUIConfig;", "a", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.a, "()Lcom/huami/bloodoxygen/ui/vo/DetailUIConfig;", "config", "<init>", "()V", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class Spo2IntroDetailActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy config = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/bloodoxygen/ui/activity/Spo2IntroDetailActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", WebConstant.QueryParam.LAUNCH, "<init>", "()V", "ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@NotNull Context context) {
            context.startActivity(new Intent(context, (Class<?>) Spo2IntroDetailActivity.class));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bloodoxygen/ui/vo/DetailUIConfig;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<DetailUIConfig> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DetailUIConfig invoke() {
            return (DetailUIConfig) BloodOxygenKoinScopeKt.getBloodOxygenKoinScope().get(Reflection.getOrCreateKotlinClass(DetailUIConfig.class), null, null);
        }
    }

    private final DetailUIConfig d() {
        return (DetailUIConfig) this.config.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Spo2IntroDetailActivity spo2IntroDetailActivity, View view) {
        spo2IntroDetailActivity.finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bo_ui_activity_spo2_intro_detail);
        ((BloodOxygenTitleBar) findViewById(R.id.title_bar)).setNavigationOnClickListener(new View.OnClickListener() { // from class: t77
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Spo2IntroDetailActivity.e(this.a, view);
            }
        });
        if (d().isMifitStyle()) {
            ((ImageView) findViewById(R.id.step_one)).setImageResource(R.drawable.bo_ui_mifit_image_spo2_measure_step_one);
            ((ImageView) findViewById(R.id.step_two)).setImageResource(R.drawable.bo_ui_mifit_image_spo2_measure_step_two);
            ((ImageView) findViewById(R.id.step_three)).setImageResource(R.drawable.bo_ui_mifit_image_spo2_measure_step_three);
        }
    }
}
