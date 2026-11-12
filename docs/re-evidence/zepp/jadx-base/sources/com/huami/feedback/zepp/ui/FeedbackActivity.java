package com.huami.feedback.zepp.ui;

import android.content.ComponentCallbacks;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p010navigation.NavController;
import androidx.p010navigation.NavGraph;
import androidx.p010navigation.fragment.NavHostFragment;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.feedback.FeedbackBaseActivity;
import com.huami.feedback.entity.UserForm;
import com.huami.feedback.util.ConstantsKt;
import com.huami.feedback.zepp.ui.edit.FeedbackWorkService;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014R\u001d\u0010\f\u001a\u00020\u00078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/huami/feedback/zepp/ui/FeedbackActivity;", "Lcom/huami/feedback/FeedbackBaseActivity;", "", GoogleApiAvailabilityLight.a, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/huami/feedback/zepp/ui/FeedbackViewModel;", "a", "Lkotlin/Lazy;", "c", "()Lcom/huami/feedback/zepp/ui/FeedbackViewModel;", "viewModel", "<init>", "()V", "Companion", "feedback-zepp-ui_release"}, k = 1, mv = {1, 5, 1})
public final class FeedbackActivity extends FeedbackBaseActivity {

    @NotNull
    public static final String KEY_FEEDBACK_SOURCE = "fromSource";

    @NotNull
    public static final String KEY_USER_DESCRIPTION = "userDescription";

    @NotNull
    public static final String KEY_USER_FORM = "userForm";

    @NotNull
    public static final String KEY_USER_IMAGES = "userImages";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public FeedbackActivity() {
        super(R.layout.activity_feedback);
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.feedback.zepp.ui.FeedbackActivity$special$$inlined$viewModel$default$1
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
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<FeedbackViewModel>() { // from class: com.huami.feedback.zepp.ui.FeedbackActivity$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.feedback.zepp.ui.FeedbackViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final FeedbackViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(FeedbackViewModel.class), function0, objArr);
            }
        });
    }

    private final FeedbackViewModel c() {
        return (FeedbackViewModel) this.viewModel.getValue();
    }

    private final void d() {
        Uri[] uriArr;
        Fragment fragmentFindFragmentById = getSupportFragmentManager().findFragmentById(R.id.fragment_container);
        Objects.requireNonNull(fragmentFindFragmentById, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        NavController navController = ((NavHostFragment) fragmentFindFragmentById).getNavController();
        NavGraph navGraphInflate = navController.getNavInflater().inflate(R.navigation.feedback_nav_graph);
        String stringExtra = getIntent().getStringExtra(KEY_FEEDBACK_SOURCE);
        if (stringExtra != null) {
            FeedbackWorkService.INSTANCE.recordFeedbackSource(stringExtra);
            c().setFromSource(stringExtra);
        }
        UserForm userForm = (UserForm) getIntent().getParcelableExtra(KEY_USER_FORM);
        if (userForm != null) {
            c().updateUserForm(userForm);
            navGraphInflate.setStartDestination(R.id.feedbackEditFragment);
            navController.setGraph(navGraphInflate);
            return;
        }
        String stringExtra2 = getIntent().getStringExtra(KEY_USER_DESCRIPTION);
        Parcelable[] parcelableArrayExtra = getIntent().getParcelableArrayExtra(KEY_USER_IMAGES);
        if (parcelableArrayExtra == null) {
            uriArr = null;
        } else {
            ArrayList arrayList = new ArrayList(parcelableArrayExtra.length);
            int length = parcelableArrayExtra.length;
            int i = 0;
            while (i < length) {
                Parcelable parcelable = parcelableArrayExtra[i];
                i++;
                Objects.requireNonNull(parcelable, "null cannot be cast to non-null type android.net.Uri");
                arrayList.add((Uri) parcelable);
            }
            Object[] array = arrayList.toArray(new Uri[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            uriArr = (Uri[]) array;
        }
        navController.setGraph(navGraphInflate, BundleKt.bundleOf(TuplesKt.to("description", stringExtra2), TuplesKt.to("images", uriArr)));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        boolean booleanExtra = getIntent().getBooleanExtra(ConstantsKt.EXTRA_FORCE_DARK, false);
        if (booleanExtra) {
            getDelegate().setLocalNightMode(2);
        }
        super.onCreate(savedInstanceState);
        if (booleanExtra) {
            c().setForceDark();
        }
        d();
    }
}
