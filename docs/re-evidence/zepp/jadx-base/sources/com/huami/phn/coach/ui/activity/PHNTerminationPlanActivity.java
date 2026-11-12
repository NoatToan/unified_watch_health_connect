package com.huami.phn.coach.ui.activity;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentTransaction;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.huami.phn.coach.R;
import com.huami.phn.coach.ui.GlobalTitleStyle;
import com.huami.phn.coach.ui.activity.PHNTerminationPlanActivity;
import com.huami.phn.coach.ui.dialog.TerminationPlanDialog;
import com.huami.phn.coach.viewmodel.PHNTerminationPlanViewModel;
import com.huami.tools.analytics.DbUtils;
import com.huami.view.basetitle.BaseTitleActivity;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014R\u001d\u0010\f\u001a\u00020\u00078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/huami/phn/coach/ui/activity/PHNTerminationPlanActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "initView", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/huami/phn/coach/viewmodel/PHNTerminationPlanViewModel;", "x", "Lkotlin/Lazy;", "o", "()Lcom/huami/phn/coach/viewmodel/PHNTerminationPlanViewModel;", "phnTerminationPlanViewModel", "<init>", "()V", "Companion", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public final class PHNTerminationPlanActivity extends BaseTitleActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final Lazy phnTerminationPlanViewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/phn/coach/ui/activity/PHNTerminationPlanActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "start", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void start(@NotNull Context context) {
            context.startActivity(new Intent(context, (Class<?>) PHNTerminationPlanActivity.class));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PHNTerminationPlanActivity() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.phn.coach.ui.activity.PHNTerminationPlanActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.phnTerminationPlanViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<PHNTerminationPlanViewModel>() { // from class: com.huami.phn.coach.ui.activity.PHNTerminationPlanActivity$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.phn.coach.viewmodel.PHNTerminationPlanViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final PHNTerminationPlanViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(PHNTerminationPlanViewModel.class), function0, objArr);
            }
        });
    }

    private final void initView() {
        TextView textView = (TextView) findViewById(R.id.tv_confirm_termination);
        TextView textView2 = (TextView) findViewById(R.id.tv_keep_going);
        textView.setOnClickListener(new View.OnClickListener() { // from class: dp5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PHNTerminationPlanActivity.p(this.a, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: cp5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PHNTerminationPlanActivity.q(this.a, view);
            }
        });
        o().getStopPlanLiveData().observe(this, new Observer() { // from class: ep5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                PHNTerminationPlanActivity.r(this.a, (Boolean) obj);
            }
        });
    }

    private final PHNTerminationPlanViewModel o() {
        return (PHNTerminationPlanViewModel) this.phnTerminationPlanViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(PHNTerminationPlanActivity pHNTerminationPlanActivity, View view) {
        TerminationPlanDialog terminationPlanDialog = new TerminationPlanDialog();
        FragmentTransaction fragmentTransactionBeginTransaction = pHNTerminationPlanActivity.getSupportFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.setTransition(4099);
        terminationPlanDialog.show(fragmentTransactionBeginTransaction, "tpa_tp");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(PHNTerminationPlanActivity pHNTerminationPlanActivity, View view) {
        pHNTerminationPlanActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(PHNTerminationPlanActivity pHNTerminationPlanActivity, Boolean bool) {
        if (bool.booleanValue()) {
            pHNTerminationPlanActivity.startActivity(new Intent(pHNTerminationPlanActivity, (Class<?>) PHNDetailPageActivity.class));
            pHNTerminationPlanActivity.finish();
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phn_activity_termination_plan);
        GlobalTitleStyle.setUnifyTitleStyle$default(this, false, getString(R.string.phn_termination_plan), null, null, 12, null);
        initView();
    }
}
