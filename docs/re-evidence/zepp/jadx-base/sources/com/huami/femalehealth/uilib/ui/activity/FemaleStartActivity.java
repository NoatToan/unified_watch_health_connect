package com.huami.femalehealth.uilib.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.chenenyu.router.annotation.Route;
import com.huami.femalehealth.uilib.R;
import com.huami.femalehealth.uilib.helper.RTLHelper;
import com.huami.femalehealth.uilib.koin.ComponentCallbackExtKt;
import com.huami.femalehealth.uilib.ui.activity.FemaleStartActivity;
import com.huami.femalehealth.uilib.viewmodel.SettingViewModel;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.module.homepage.cards.helper.RouterHelper;
import com.huami.tools.analytics.DbUtils;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes4.dex */
@Route({RouterHelper.FEMALE_HEALTH_PATH_MIFIT})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\t\u001a\u00020\u0002H\u0014R\u001d\u0010\u000f\u001a\u00020\n8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/huami/femalehealth/uilib/ui/activity/FemaleStartActivity;", "Lcom/huami/femalehealth/uilib/ui/activity/FHBaseTitleActivity;", "", "f", "h", "i", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onResume", "Lcom/huami/femalehealth/uilib/viewmodel/SettingViewModel;", "a", "Lkotlin/Lazy;", "e", "()Lcom/huami/femalehealth/uilib/viewmodel/SettingViewModel;", "viewModel", "<init>", "()V", "Companion", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class FemaleStartActivity extends FHBaseTitleActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "FemaleStartActivity";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/huami/femalehealth/uilib/ui/activity/FemaleStartActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "start", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "uilib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void start(@NotNull Context context) {
            Intent intent = new Intent(context, (Class<?>) FemaleStartActivity.class);
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FemaleStartActivity() {
        final ComponentCallbackExtKt.C15291 c15291 = new ComponentCallbackExtKt.C15291(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<SettingViewModel>() { // from class: com.huami.femalehealth.uilib.ui.activity.FemaleStartActivity$special$$inlined$injectViewModelInFH$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.femalehealth.uilib.viewmodel.SettingViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SettingViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(SettingViewModel.class), c15291, objArr);
            }
        });
    }

    private final SettingViewModel e() {
        return (SettingViewModel) this.viewModel.getValue();
    }

    private final void f() {
        ((RainbowTitleBar) findViewById(R.id.tv_title_bar)).setNavigationOnClickListener(new View.OnClickListener() { // from class: x52
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FemaleStartActivity.g(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(FemaleStartActivity femaleStartActivity, View view) {
        femaleStartActivity.finish();
    }

    private final void h() {
        FemaleHealthActivity.INSTANCE.start(this);
    }

    private final void i() {
        FHPeriodSettingActivity.INSTANCE.start(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(FemaleStartActivity femaleStartActivity, View view) {
        femaleStartActivity.finish();
        femaleStartActivity.i();
    }

    @Override // com.huami.femalehealth.uilib.ui.activity.FHBaseTitleActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.femalehealth.uilib.ui.activity.FHBaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fh_activity_home);
        f();
        ((Button) findViewById(R.id.btn_home_open)).setOnClickListener(new View.OnClickListener() { // from class: y52
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FemaleStartActivity.j(this.a, view);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        ((TextView) findViewById(R.id.tv_home_desc)).setGravity(RTLHelper.INSTANCE.isRTL(this) ? 5 : 3);
        super.onResume();
    }
}
