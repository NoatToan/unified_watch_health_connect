package com.huami.feedback.zepp.ui.issue;

import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.Observer;
import androidx.p010navigation.fragment.FragmentKt;
import androidx.view.OnBackPressedCallback;
import androidx.view.OnBackPressedDispatcherKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.feedback.entity.IssueItem;
import com.huami.feedback.entity.UserForm;
import com.huami.feedback.sync.api.device.DeviceType;
import com.huami.feedback.sync.api.device.FeedbackDevice;
import com.huami.feedback.ui.DialogUtilsKt;
import com.huami.feedback.zepp.ui.FeedbackViewModel;
import com.huami.feedback.zepp.ui.R;
import com.huami.feedback.zepp.ui.edit.FeedbackWorkService;
import com.huami.feedback.zepp.ui.issue.IssueFragment;
import com.huami.lib.compose.rainbow.ThemeKt;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.FragmentExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 J*\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\nH\u0002J\u0012\u0010\u0010\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u001a\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016R\u001d\u0010\u001e\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/huami/feedback/zepp/ui/issue/IssueFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/huami/feedback/sync/api/device/FeedbackDevice;", "feedbackDevice", "", "title", "", "issueId", "Lcom/huami/feedback/entity/IssueItem;", "issueItem", "", "f", "e", "h", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/huami/feedback/zepp/ui/FeedbackViewModel;", "a", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.a, "()Lcom/huami/feedback/zepp/ui/FeedbackViewModel;", "viewModel", "<init>", "()V", "feedback-zepp-ui_release"}, k = 1, mv = {1, 5, 1})
public final class IssueFragment extends Fragment {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/activity/OnBackPressedCallback;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<OnBackPressedCallback, Unit> {
        public a() {
            super(1);
        }

        public final void a(@NotNull OnBackPressedCallback onBackPressedCallback) {
            IssueFragment.this.e();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OnBackPressedCallback onBackPressedCallback) {
            a(onBackPressedCallback);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u000b"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {
            public final /* synthetic */ IssueFragment a;

            /* JADX INFO: renamed from: com.huami.feedback.zepp.ui.issue.IssueFragment$b$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
            public static final class C0397a extends Lambda implements Function0<Unit> {
                public final /* synthetic */ IssueFragment a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0397a(IssueFragment issueFragment) {
                    super(0);
                    this.a = issueFragment;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Unit getA() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.a.e();
                }
            }

            /* JADX INFO: renamed from: com.huami.feedback.zepp.ui.issue.IssueFragment$b$a$b, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
            public static final class C0398b extends Lambda implements Function4<FeedbackDevice, String, Integer, IssueItem, Unit> {
                public final /* synthetic */ IssueFragment a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0398b(IssueFragment issueFragment) {
                    super(4);
                    this.a = issueFragment;
                }

                public final void a(@Nullable FeedbackDevice feedbackDevice, @NotNull String str, int i, @NotNull IssueItem issueItem) {
                    this.a.f(feedbackDevice, str, i, issueItem);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(FeedbackDevice feedbackDevice, String str, Integer num, IssueItem issueItem) {
                    a(feedbackDevice, str, num.intValue(), issueItem);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(IssueFragment issueFragment) {
                super(2);
                this.a = issueFragment;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            @Composable
            public final void invoke(@Nullable Composer composer, int i) {
                if (((i & 11) ^ 2) == 0 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                } else {
                    IssueScreenKt.IssueRoute(this.a.d(), new C0397a(this.a), new C0398b(this.a), composer, 8);
                }
            }
        }

        public b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        @Composable
        public final void invoke(@Nullable Composer composer, int i) {
            if (((i & 11) ^ 2) == 0 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                ThemeKt.RainbowTheme(IssueFragment.this.d().getIsForceDarkInternal(), ComposableLambdaKt.composableLambda(composer, -819896266, true, new a(IssueFragment.this)), composer, 48, 0);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "历史有失败表单，弹框提示用户。";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "用户取消继续失败表单提交，开启新的用户反馈！";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "用户继续失败表单提交，开始跳转并回填表单信息！";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IssueFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.feedback.zepp.ui.issue.IssueFragment$special$$inlined$sharedViewModel$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                return ViewModelOwner.INSTANCE.from(this.requireActivity(), this.requireActivity());
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<FeedbackViewModel>() { // from class: com.huami.feedback.zepp.ui.issue.IssueFragment$special$$inlined$sharedViewModel$default$2
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
                return FragmentExtKt.getSharedViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(FeedbackViewModel.class), function0, objArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FeedbackViewModel d() {
        return (FeedbackViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        if (d().getUserFormState().getValue() != null) {
            DialogUtilsKt.showExitDialog(requireActivity(), getChildFragmentManager());
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(FeedbackDevice feedbackDevice, String title, int issueId, IssueItem issueItem) {
        UserForm userFormCopy;
        Parcelable[] parcelableArray;
        UserForm value = d().getUserFormState().getValue();
        ArrayList arrayList = null;
        if (value == null) {
            userFormCopy = null;
        } else {
            userFormCopy = value.copy((127 & 1) != 0 ? value.deviceType : feedbackDevice == null ? null : feedbackDevice.getDeviceType(), (127 & 2) != 0 ? value.issueTitle : title, (127 & 4) != 0 ? value.issueID : issueId, (127 & 8) != 0 ? value.issueItem : issueItem, (127 & 16) != 0 ? value.description : null, (127 & 32) != 0 ? value.contact : null, (127 & 64) != 0 ? value.images : null, (127 & 128) != 0 ? value.timeStamp : 0L);
        }
        if (userFormCopy == null) {
            DeviceType deviceType = feedbackDevice == null ? null : feedbackDevice.getDeviceType();
            Bundle arguments = getArguments();
            String string = arguments == null ? null : arguments.getString("description");
            Bundle arguments2 = getArguments();
            if (arguments2 != null && (parcelableArray = arguments2.getParcelableArray("images")) != null) {
                arrayList = new ArrayList(parcelableArray.length);
                int i = 0;
                int length = parcelableArray.length;
                while (i < length) {
                    Parcelable parcelable = parcelableArray[i];
                    i++;
                    Objects.requireNonNull(parcelable, "null cannot be cast to non-null type android.net.Uri");
                    arrayList.add((Uri) parcelable);
                }
            }
            userFormCopy = new UserForm(deviceType, title, issueId, issueItem, string, null, arrayList, 0L, 128, null);
        }
        d().updateUserForm(userFormCopy);
        FragmentKt.findNavController(this).navigate(R.id.action_issueFragment_to_feedbackEditFragment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(IssueFragment issueFragment, Boolean bool) {
        if (bool.booleanValue()) {
            issueFragment.h();
        }
    }

    private final void h() {
        HMLog.info("feedback", c.a);
        new AlertDialogFragment.Builder(getContext()).setTitle(R.string.feedback_ialog_title_notice).setMessage(R.string.feedback_dialog_retry_msg).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: lh4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                IssueFragment.i(this.a, dialogInterface, i);
            }
        }).setPositiveButton(R.string.feedback_dialog_btn_continue_text, new DialogInterface.OnClickListener() { // from class: kh4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                IssueFragment.j(this.a, dialogInterface, i);
            }
        }).setCancelable(false).show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(IssueFragment issueFragment, DialogInterface dialogInterface, int i) {
        HMLog.info("feedback", d.a);
        issueFragment.d().reloadHistoryFormIfNeedAndClearSavedUserForm(false);
        issueFragment.d().updateUserForm(null);
        FeedbackWorkService.INSTANCE.stopFeedback(issueFragment.requireContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(IssueFragment issueFragment, DialogInterface dialogInterface, int i) {
        HMLog.info("feedback", e.a);
        issueFragment.d().reloadHistoryFormIfNeedAndClearSavedUserForm(true);
        FeedbackWorkService.INSTANCE.stopFeedback(issueFragment.requireContext());
        FragmentKt.findNavController(issueFragment).navigate(R.id.action_issueFragment_to_feedbackEditFragment);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        OnBackPressedDispatcherKt.addCallback$default(requireActivity().getOnBackPressedDispatcher(), this, false, new a(), 2, null);
        d().checkHistoryFeedback();
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ComposeView composeView = new ComposeView(requireContext(), null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-985532479, true, new b()));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        d().getShowRetryDialogState().observe(getViewLifecycleOwner(), new Observer() { // from class: mh4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                IssueFragment.g(this.a, (Boolean) obj);
            }
        });
    }
}
