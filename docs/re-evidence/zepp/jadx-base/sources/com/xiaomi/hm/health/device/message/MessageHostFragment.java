package com.xiaomi.hm.health.device.message;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.LifecycleOwnerKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.huami.phone_call.sms.PhoneCallReplyMsgViewModel;
import com.huami.tools.log.HMLog;
import com.huami.wallet.ui.helper.LoadingDialogHelper;
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
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J&\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016R\u001d\u0010\u0016\u001a\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001b\u001a\u00020\u00178B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/hm/health/device/message/MessageHostFragment;", "Landroidx/fragment/app/Fragment;", "", "g", "Landroid/view/View;", "v", "c", "f", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/huami/phone_call/sms/PhoneCallReplyMsgViewModel;", "a", "Lkotlin/Lazy;", "e", "()Lcom/huami/phone_call/sms/PhoneCallReplyMsgViewModel;", "viewModel", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "b", GoogleApiAvailabilityLight.a, "()Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "loadingHelper", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class MessageHostFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy loadingHelper;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<LoadingDialogHelper> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LoadingDialogHelper invoke() {
            return new LoadingDialogHelper(MessageHostFragment.this.requireActivity());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.message.MessageHostFragment$onViewCreated$3", f = "MessageHostFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MessageHostFragment.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            View view = MessageHostFragment.this.getView();
            ((AppCompatEditText) (view == null ? null : view.findViewById(R.id.et_content))).requestFocusFromTouch();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.message.MessageHostFragment$onViewCreated$5$1", f = "MessageHostFragment.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Boolean b;
        public final /* synthetic */ MessageHostFragment c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Boolean bool, MessageHostFragment messageHostFragment, Continuation<? super c> continuation) {
            super(2, continuation);
            this.b = bool;
            this.c = messageHostFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.b.booleanValue()) {
                    this.c.d().hideLoading();
                    this.a = 1;
                    if (DelayKt.delay(300L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    this.c.d().setFail(R.string.save_failed);
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MessageHostFragment messageHostFragment = this.c;
            View view = messageHostFragment.getView();
            messageHostFragment.c(view == null ? null : view.findViewById(R.id.et_content));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessageHostFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.xiaomi.hm.health.device.message.MessageHostFragment$special$$inlined$viewModel$default$1
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
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<PhoneCallReplyMsgViewModel>() { // from class: com.xiaomi.hm.health.device.message.MessageHostFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.phone_call.sms.PhoneCallReplyMsgViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final PhoneCallReplyMsgViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(PhoneCallReplyMsgViewModel.class), function0, objArr);
            }
        });
        this.loadingHelper = LazyKt__LazyJVMKt.lazy(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(View v) {
        requireActivity().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoadingDialogHelper d() {
        return (LoadingDialogHelper) this.loadingHelper.getValue();
    }

    private final PhoneCallReplyMsgViewModel e() {
        return (PhoneCallReplyMsgViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(View v) {
        d().showLoading(R.string.custom_vibrate_loading);
        PhoneCallReplyMsgViewModel phoneCallReplyMsgViewModelE = e();
        MessageHookManager messageHookManager = MessageHookManager.INSTANCE;
        String title = messageHookManager.getTitle();
        String phoneNo = messageHookManager.getPhoneNo();
        View view = getView();
        phoneCallReplyMsgViewModelE.sendMessage(title, phoneNo, String.valueOf(((AppCompatEditText) (view == null ? null : view.findViewById(R.id.et_content))).getText()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        View view = getView();
        AppCompatTextView appCompatTextView = (AppCompatTextView) (view == null ? null : view.findViewById(R.id.btn_send));
        View view2 = getView();
        Editable text = ((AppCompatEditText) (view2 != null ? view2.findViewById(R.id.et_content) : null)).getText();
        appCompatTextView.setEnabled(!(text == null || text.length() == 0));
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_message_hook, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        View view2 = getView();
        ((AppCompatTextView) (view2 == null ? null : view2.findViewById(R.id.btn_back))).setOnClickListener(new View.OnClickListener() { // from class: u15
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                this.a.c(view3);
            }
        });
        View view3 = getView();
        ((AppCompatTextView) (view3 == null ? null : view3.findViewById(R.id.btn_send))).setOnClickListener(new View.OnClickListener() { // from class: v15
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                this.a.f(view4);
            }
        });
        g();
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new b(null));
        View view4 = getView();
        ((TextView) (view4 != null ? view4.findViewById(R.id.et_content) : null)).addTextChangedListener(new TextWatcher() { // from class: com.xiaomi.hm.health.device.message.MessageHostFragment$onViewCreated$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable s) {
                this.a.g();
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
            }
        });
        e().getResultLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.device.message.MessageHostFragment$onViewCreated$$inlined$observeNotNull$1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Boolean bool) {
                if (bool == null) {
                    return;
                }
                try {
                    e.f(LifecycleOwnerKt.getLifecycleScope(this.a), Dispatchers.getMain(), null, new MessageHostFragment.c(bool, this.a, null), 2, null);
                } catch (Exception e) {
                    HMLog.e("ObserveError", e);
                }
            }
        });
    }
}
