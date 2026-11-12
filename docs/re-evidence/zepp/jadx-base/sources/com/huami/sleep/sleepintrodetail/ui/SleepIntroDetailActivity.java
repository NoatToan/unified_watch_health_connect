package com.huami.sleep.sleepintrodetail.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelLazy;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.sleep.R;
import com.huami.sleep.ext.ViewExKt;
import com.huami.sleep.sleepintrodetail.ui.SleepIntroDetailActivity;
import com.huami.sleep.sleepintrodetail.viewmodel.SleepIntroDetailBaseViewModel;
import com.huami.sleep.sleepintrodetail.vo.SleepIntroDetailVo;
import com.huami.tools.analytics.DbUtils;
import com.huami.view.basetitle.BaseTitleActivity;
import java.io.Serializable;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014R\u001d\u0010\r\u001a\u00020\b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/huami/sleep/sleepintrodetail/ui/SleepIntroDetailActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "initView", "observeData", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/huami/sleep/sleepintrodetail/viewmodel/SleepIntroDetailBaseViewModel;", "x", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.b, "()Lcom/huami/sleep/sleepintrodetail/viewmodel/SleepIntroDetailBaseViewModel;", "viewModel", "<init>", "()V", "Companion", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepIntroDetailActivity extends BaseTitleActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String y = "sleep_intro_detail";

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(SleepIntroDetailBaseViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.sleep.sleepintrodetail.ui.SleepIntroDetailActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final ViewModelStore getA() {
            return this.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.huami.sleep.sleepintrodetail.ui.SleepIntroDetailActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final ViewModelProvider.Factory getA() {
            return this.getDefaultViewModelProviderFactory();
        }
    });

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/huami/sleep/sleepintrodetail/ui/SleepIntroDetailActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/sleep/sleepintrodetail/vo/SleepIntroDetailVo;", "detail", "", WebConstant.QueryParam.LAUNCH, "", "EXTRA_SLEEP_INTRO_DETAIL", "Ljava/lang/String;", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@NotNull Context context, @NotNull SleepIntroDetailVo detail) {
            Intent intent = new Intent(context, (Class<?>) SleepIntroDetailActivity.class);
            intent.putExtra(SleepIntroDetailActivity.y, detail);
            context.startActivity(intent);
        }
    }

    private final void initView() {
        ViewExKt.setUnifyTitleStyle$default(this, "", null, null, 6, null);
    }

    private final SleepIntroDetailBaseViewModel n() {
        return (SleepIntroDetailBaseViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(SleepIntroDetailActivity sleepIntroDetailActivity, String str) {
        sleepIntroDetailActivity.setTitleText(str);
    }

    private final void observeData() {
        SleepIntroDetailBaseViewModel sleepIntroDetailBaseViewModelN = n();
        getIntent();
        Serializable serializableExtra = getIntent().getSerializableExtra(y);
        Objects.requireNonNull(serializableExtra, "null cannot be cast to non-null type com.huami.sleep.sleepintrodetail.vo.SleepIntroDetailVo");
        sleepIntroDetailBaseViewModelN.setIntroDetail((SleepIntroDetailVo) serializableExtra);
        sleepIntroDetailBaseViewModelN.getPageTitle().observe(this, new Observer() { // from class: k07
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepIntroDetailActivity.o(this.a, (String) obj);
            }
        });
        sleepIntroDetailBaseViewModelN.getDetailFragment().observe(this, new Observer() { // from class: j07
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepIntroDetailActivity.p(this.a, (Fragment) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(SleepIntroDetailActivity sleepIntroDetailActivity, Fragment fragment) {
        FragmentTransaction fragmentTransactionBeginTransaction = sleepIntroDetailActivity.getSupportFragmentManager().beginTransaction();
        sleepIntroDetailActivity.addFragment(fragment, R.id.fragment_container);
        fragmentTransactionBeginTransaction.commit();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep_intro_detail);
        initView();
        observeData();
    }
}
