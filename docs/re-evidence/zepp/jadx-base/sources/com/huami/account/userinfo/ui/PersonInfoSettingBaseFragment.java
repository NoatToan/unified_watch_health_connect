package com.huami.account.userinfo.ui;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.Lifecycle;
import androidx.p008lifecycle.LifecycleOwnerKt;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.account.ui.common.LoadingDialogContainer;
import com.huami.account.ui.common.LoadingDialogContainerKt;
import com.huami.account.ui.common.LoadingDialogHelper;
import com.huami.account.userinfo.R;
import com.huami.android.design.dialog.BaseDialogFragment;
import com.huami.lib.view.SystemBarTintSupport;
import com.huami.widget.share.ShareAnalytics;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.model.account.HMUserInfo;
import java.util.Map;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 62\u00020\u0001:\u000267B\u0007¢\u0006\u0004\b4\u00105J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0014J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0004J\u0010\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010J\u000e\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0005J\u001c\u0010\u0018\u001a\u00020\u00022\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0015H\u0004R\"\u0010\u001a\u001a\u00020\u00198\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010&\u001a\u0004\u0018\u00010\u00108\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001d\u0010/\u001a\u00020*8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102¨\u00068"}, d2 = {"Lcom/huami/account/userinfo/ui/PersonInfoSettingBaseFragment;", "Lcom/huami/android/design/dialog/BaseDialogFragment;", "", GoogleApiAvailabilityLight.a, "onStart", "", "hasPadding", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "", "synced", ShareAnalytics.ParamValue.SAVE, "Lcom/huami/account/userinfo/ui/PersonInfoSettingBaseFragment$OnDataChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "isNewUser", "setIsNewUser", "", "", "filed", "updatePersonInfoParam", "Lcom/xiaomi/hm/health/model/account/HMUserInfo;", "mUserInfo", "Lcom/xiaomi/hm/health/model/account/HMUserInfo;", "getMUserInfo", "()Lcom/xiaomi/hm/health/model/account/HMUserInfo;", "setMUserInfo", "(Lcom/xiaomi/hm/health/model/account/HMUserInfo;)V", "e", "Lcom/huami/account/userinfo/ui/PersonInfoSettingBaseFragment$OnDataChangeListener;", "getMListener", "()Lcom/huami/account/userinfo/ui/PersonInfoSettingBaseFragment$OnDataChangeListener;", "setMListener", "(Lcom/huami/account/userinfo/ui/PersonInfoSettingBaseFragment$OnDataChangeListener;)V", "mListener", "f", "Z", "isFromNewUserGuide", "Lcom/huami/account/userinfo/ui/PersonInfoViewModel;", "g", "Lkotlin/Lazy;", "c", "()Lcom/huami/account/userinfo/ui/PersonInfoViewModel;", "personInfoViewModel", "Lcom/huami/account/ui/common/LoadingDialogContainer;", "h", "Lcom/huami/account/ui/common/LoadingDialogContainer;", "loadingDialogContainer", "<init>", "()V", "Companion", "OnDataChangeListener", "userinfo_release"}, k = 1, mv = {1, 5, 1})
public abstract class PersonInfoSettingBaseFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private OnDataChangeListener mListener;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean isFromNewUserGuide;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy personInfoViewModel;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private LoadingDialogContainer loadingDialogContainer;
    public HMUserInfo mUserInfo;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ*\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b¨\u0006\u000e"}, d2 = {"Lcom/huami/account/userinfo/ui/PersonInfoSettingBaseFragment$Companion;", "", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lcom/huami/account/userinfo/ui/PersonInfoSettingBaseFragment;", "fragment", "Lcom/huami/account/userinfo/ui/PersonInfoSettingBaseFragment$OnDataChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "isNewUser", "", "showSelf", "<init>", "()V", "userinfo_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void showSelf$default(Companion companion, FragmentActivity fragmentActivity, PersonInfoSettingBaseFragment personInfoSettingBaseFragment, OnDataChangeListener onDataChangeListener, boolean z, int i, Object obj) {
            if ((i & 8) != 0) {
                z = false;
            }
            companion.showSelf(fragmentActivity, personInfoSettingBaseFragment, onDataChangeListener, z);
        }

        public final void showSelf(@NotNull FragmentActivity activity, @NotNull PersonInfoSettingBaseFragment fragment, @Nullable OnDataChangeListener listener, boolean isNewUser) {
            fragment.setListener(listener);
            fragment.show(activity.getSupportFragmentManager(), (String) null);
            fragment.setIsNewUser(isNewUser);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Lcom/huami/account/userinfo/ui/PersonInfoSettingBaseFragment$OnDataChangeListener;", "", "", "onChange", "userinfo_release"}, k = 1, mv = {1, 5, 1})
    public interface OnDataChangeListener {
        void onChange();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.account.userinfo.ui.PersonInfoSettingBaseFragment$updatePersonInfoParam$1", f = "PersonInfoSettingBaseFragment.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Map<String, String> c;
        public final /* synthetic */ FragmentActivity d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Map<String, String> map, FragmentActivity fragmentActivity, String str, String str2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = map;
            this.d = fragmentActivity;
            this.e = str;
            this.f = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PersonInfoSettingBaseFragment.this.new a(this.c, this.d, this.e, this.f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PersonInfoViewModel personInfoViewModelC = PersonInfoSettingBaseFragment.this.c();
                Map<String, String> map = this.c;
                this.a = 1;
                obj = personInfoViewModelC.updatePartOfPersonInfo(map, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            if (!this.d.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                return Unit.INSTANCE;
            }
            if (zBooleanValue) {
                LoadingDialogContainer loadingDialogContainer = PersonInfoSettingBaseFragment.this.loadingDialogContainer;
                Objects.requireNonNull(loadingDialogContainer);
                loadingDialogContainer.setSuccess(this.e, null);
                OnDataChangeListener mListener = PersonInfoSettingBaseFragment.this.getMListener();
                if (mListener != null) {
                    mListener.onChange();
                }
            } else {
                LoadingDialogContainer loadingDialogContainer2 = PersonInfoSettingBaseFragment.this.loadingDialogContainer;
                Objects.requireNonNull(loadingDialogContainer2);
                loadingDialogContainer2.setFailed(this.f, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PersonInfoSettingBaseFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.account.userinfo.ui.PersonInfoSettingBaseFragment$special$$inlined$viewModel$default$1
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
        this.personInfoViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<PersonInfoViewModel>() { // from class: com.huami.account.userinfo.ui.PersonInfoSettingBaseFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.account.userinfo.ui.PersonInfoViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final PersonInfoViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(PersonInfoViewModel.class), function0, objArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PersonInfoViewModel c() {
        return (PersonInfoViewModel) this.personInfoViewModel.getValue();
    }

    private final void d() {
        setMUserInfo(HMPersonInfo.getInstance().getUserInfo());
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Nullable
    public final OnDataChangeListener getMListener() {
        return this.mListener;
    }

    @NotNull
    public final HMUserInfo getMUserInfo() {
        HMUserInfo hMUserInfo = this.mUserInfo;
        Objects.requireNonNull(hMUserInfo);
        return hMUserInfo;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasPadding() {
        return true;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int i = R.style.DimPanel;
        if (SystemBarTintSupport.isSupport(getActivity())) {
            i = R.style.DimPanelTint;
        }
        setStyle(0, i);
        d();
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        Window window = dialog == null ? null : dialog.getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.height = -1;
            window.setAttributes(attributes);
        }
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.loadingDialogContainer = new LoadingDialogHelper(requireActivity());
    }

    public final void save(int synced) {
        HMPersonInfo.getInstance().saveInfo(synced);
    }

    public final void setIsNewUser(boolean isNewUser) {
        this.isFromNewUserGuide = isNewUser;
    }

    public final void setListener(@Nullable OnDataChangeListener listener) {
        this.mListener = listener;
    }

    public final void setMListener(@Nullable OnDataChangeListener onDataChangeListener) {
        this.mListener = onDataChangeListener;
    }

    public final void setMUserInfo(@NotNull HMUserInfo hMUserInfo) {
        this.mUserInfo = hMUserInfo;
    }

    public final void updatePersonInfoParam(@NotNull Map<String, String> filed) {
        if (this.isFromNewUserGuide) {
            OnDataChangeListener onDataChangeListener = this.mListener;
            if (onDataChangeListener == null) {
                return;
            }
            onDataChangeListener.onChange();
            return;
        }
        LoadingDialogContainer loadingDialogContainer = this.loadingDialogContainer;
        Objects.requireNonNull(loadingDialogContainer);
        LoadingDialogContainerKt.showLoadingDialog(loadingDialogContainer, R.string.user_info_loading);
        String string = getString(R.string.user_info_loading_success);
        String string2 = getString(R.string.user_info_loading_fail);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        e.f(LifecycleOwnerKt.getLifecycleScope(activity), null, null, new a(filed, activity, string, string2, null), 3, null);
    }
}
