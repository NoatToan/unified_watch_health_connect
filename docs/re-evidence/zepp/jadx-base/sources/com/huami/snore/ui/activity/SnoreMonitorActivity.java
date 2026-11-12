package com.huami.snore.ui.activity;

import android.content.ComponentCallbacks;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentTransaction;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.google.android.exoplayer2.text.ttml.b;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.snore.core.R;
import com.huami.snore.core.ext.KoinExtKt;
import com.huami.snore.core.helper.SnoreHelper;
import com.huami.snore.ui.activity.SnoreMonitorActivity;
import com.huami.snore.ui.base.BaseSnoreMonitorFragment;
import com.huami.snore.ui.fragment.SnoreMonitorStartedFragment;
import com.huami.snore.ui.fragment.SnoreMonitorUnStartFragment;
import com.huami.snore.ui.viewmodel.SnoreMonitorViewModel;
import com.huami.view.basetitle.BaseTitleActivity;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0012\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\f\u001a\u00020\u0002H\u0016R\u001d\u0010\u0012\u001a\u00020\r8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/huami/snore/ui/activity/SnoreMonitorActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "m", "Lcom/huami/snore/ui/base/BaseSnoreMonitorFragment;", "fragment", "", "tag", b.r, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onBackPressed", "Lcom/huami/snore/ui/viewmodel/SnoreMonitorViewModel;", "x", "Lkotlin/Lazy;", "o", "()Lcom/huami/snore/ui/viewmodel/SnoreMonitorViewModel;", "viewModel", "y", "Ljava/lang/String;", "currentPageState", "<init>", "()V", "Companion", "snore_release"}, k = 1, mv = {1, 5, 1})
public final class SnoreMonitorActivity extends BaseTitleActivity {

    @NotNull
    private static final String A = "started_fragment";

    @NotNull
    public static final String PAGE_FINISH = "finish";

    @NotNull
    public static final String PAGE_STARTED = "started";

    @NotNull
    public static final String PAGE_UN_START = "unStart";

    @NotNull
    public static final String TAG = "SnoreMonitorActivity";

    @NotNull
    private static final String z = "unStart_fragment";

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private String currentPageState;

    /* JADX WARN: Multi-variable type inference failed */
    public SnoreMonitorActivity() {
        System.loadLibrary("snoring-lib");
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.snore.ui.activity.SnoreMonitorActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<SnoreMonitorViewModel>() { // from class: com.huami.snore.ui.activity.SnoreMonitorActivity$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.snore.ui.viewmodel.SnoreMonitorViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SnoreMonitorViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(SnoreMonitorViewModel.class), function0, objArr);
            }
        });
    }

    private final void m() {
        o().getPageStateLiveData().observe(this, new Observer() { // from class: o57
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SnoreMonitorActivity.n(this.a, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(SnoreMonitorActivity snoreMonitorActivity, String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1897185151) {
                if (iHashCode != -1274442605) {
                    if (iHashCode == -306840247 && str.equals(PAGE_UN_START)) {
                        snoreMonitorActivity.p(new SnoreMonitorUnStartFragment(), z);
                    }
                } else if (str.equals("finish")) {
                    snoreMonitorActivity.finish();
                }
            } else if (str.equals(PAGE_STARTED)) {
                snoreMonitorActivity.p(new SnoreMonitorStartedFragment(), A);
            }
        }
        snoreMonitorActivity.currentPageState = str;
    }

    private final SnoreMonitorViewModel o() {
        return (SnoreMonitorViewModel) this.viewModel.getValue();
    }

    private final void p(BaseSnoreMonitorFragment fragment, String tag) {
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        if (Intrinsics.areEqual(tag, z)) {
            if (getSupportFragmentManager().findFragmentByTag(z) != null) {
                fragmentTransactionBeginTransaction.show(getSupportFragmentManager().findFragmentByTag(z));
            } else {
                fragmentTransactionBeginTransaction.add(R.id.content, fragment, tag);
            }
            if (getSupportFragmentManager().findFragmentByTag(A) != null) {
                fragmentTransactionBeginTransaction.remove(getSupportFragmentManager().findFragmentByTag(A));
            }
        }
        if (Intrinsics.areEqual(tag, A)) {
            fragmentTransactionBeginTransaction.add(R.id.content, fragment, tag);
            if (getSupportFragmentManager().findFragmentByTag(z) != null) {
                fragmentTransactionBeginTransaction.hide(getSupportFragmentManager().findFragmentByTag(z));
            }
        }
        fragmentTransactionBeginTransaction.commit();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        String str = this.currentPageState;
        Objects.requireNonNull(str);
        if (Intrinsics.areEqual(str, PAGE_UN_START)) {
            finish();
            return;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        Unit unit = Unit.INSTANCE;
        startActivity(intent);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snore_monitor_layout);
        setStyle(BaseTitleActivity.STYLE.NONE, ContextCompat.getColor(this, R.color.s38), !RainbowUtils.isDarkMode(this));
        m();
        o().getPageStateLiveData().setValue(PAGE_UN_START);
        SnoreHelper.instance.abnormalFinishDeleteData(this);
        KoinExtKt.getPageStatusAnalyticsManagerImpl().recordEvent("SNORING_V");
    }
}
