package com.huami.sleep.baseui;

import androidx.annotation.LayoutRes;
import androidx.fragment.app.Fragment;
import com.huami.sleep.sleephome.viewmodel.SleepHomeViewModel;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.FragmentExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0002H&R*\u0010\u000f\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0019\u001a\u00020\u00148F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/huami/sleep/baseui/LazyFragment;", "Landroidx/fragment/app/Fragment;", "", "onResume", "onDestroyView", "lazyInit", "visibleAfterLoaded", "", "kotlin.jvm.PlatformType", "a", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "setTAG", "(Ljava/lang/String;)V", "TAG", "", "b", "Z", "isLoaded", "Lcom/huami/sleep/sleephome/viewmodel/SleepHomeViewModel;", "c", "Lkotlin/Lazy;", "getMSleepHomeViewModel", "()Lcom/huami/sleep/sleephome/viewmodel/SleepHomeViewModel;", "mSleepHomeViewModel", "", "contentLayoutId", "<init>", "(I)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public abstract class LazyFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private String TAG;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean isLoaded;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy mSleepHomeViewModel;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyFragment(@LayoutRes int i) {
        super(i);
        this.TAG = getClass().getSimpleName();
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.sleep.baseui.LazyFragment$special$$inlined$sharedViewModel$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                return ViewModelOwner.INSTANCE.from(this.requireActivity(), this.requireActivity());
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.mSleepHomeViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<SleepHomeViewModel>() { // from class: com.huami.sleep.baseui.LazyFragment$special$$inlined$sharedViewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.sleep.sleephome.viewmodel.SleepHomeViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SleepHomeViewModel invoke() {
                return FragmentExtKt.getSharedViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(SleepHomeViewModel.class), function0, objArr);
            }
        });
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final SleepHomeViewModel getMSleepHomeViewModel() {
        return (SleepHomeViewModel) this.mSleepHomeViewModel.getValue();
    }

    public final String getTAG() {
        return this.TAG;
    }

    public abstract void lazyInit();

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.isLoaded = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (!this.isLoaded && !isHidden()) {
            lazyInit();
            this.isLoaded = true;
        } else {
            if (!this.isLoaded || isHidden()) {
                return;
            }
            visibleAfterLoaded();
        }
    }

    public final void setTAG(String str) {
        this.TAG = str;
    }

    public abstract void visibleAfterLoaded();
}
