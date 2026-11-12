package com.huami.feedback.zepp.ui.edit;

import android.annotation.SuppressLint;
import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.Observer;
import androidx.p010navigation.fragment.FragmentKt;
import androidx.view.OnBackPressedCallback;
import androidx.view.OnBackPressedDispatcherKt;
import com.amap.api.mapcore.util.hl;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.feedback.inject.FileProviderAuth;
import com.huami.feedback.ui.DialogUtilsKt;
import com.huami.feedback.zepp.ui.FeedbackViewModel;
import com.huami.feedback.zepp.ui.R;
import com.huami.feedback.zepp.ui.edit.FeedbackEditFragment;
import com.huami.lib.compose.rainbow.ThemeKt;
import com.huami.tools.log.HMLog;
import com.huami.utils.easypermission.EasyPermissions;
import com.huami.utils.easypermission.PermissionDialogFragmentCompat;
import com.loc.z;
import com.xiaomi.hm.health.baseutil.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.FragmentExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 92\u00020\u00012\u00020\u0002:\u00019B\u0007¢\u0006\u0004\b7\u00108J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0003H\u0002J\b\u0010\b\u001a\u00020\u0003H\u0002J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00102\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u001e\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016J\u001e\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0017J/\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u000e\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\"\u0010$\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00142\b\u0010#\u001a\u0004\u0018\u00010\"H\u0017R\u001d\u0010*\u001a\u00020%8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010/\u001a\u00020+8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010.R\"\u00101\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u0006:"}, d2 = {"Lcom/huami/feedback/zepp/ui/edit/FeedbackEditFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/huami/utils/easypermission/EasyPermissions$PermissionCallbacks;", "", "h", z.j, GoogleApiAvailabilityLight.a, "e", hl.k, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "", "requestCode", "", "", "perms", "onPermissionsGranted", "onPermissionsDenied", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "Lcom/huami/feedback/zepp/ui/FeedbackViewModel;", "a", "Lkotlin/Lazy;", "g", "()Lcom/huami/feedback/zepp/ui/FeedbackViewModel;", "viewModel", "Lcom/huami/feedback/inject/FileProviderAuth;", "b", "f", "()Lcom/huami/feedback/inject/FileProviderAuth;", "providerAuth", "Ljava/io/File;", "currentPhotoFile", "Ljava/io/File;", "getCurrentPhotoFile", "()Ljava/io/File;", "setCurrentPhotoFile", "(Ljava/io/File;)V", "<init>", "()V", "Companion", "feedback-zepp-ui_release"}, k = 1, mv = {1, 5, 1})
public final class FeedbackEditFragment extends Fragment implements EasyPermissions.PermissionCallbacks {
    public static final int PERMISSION_CAMERA = 20;
    public static final int PERMISSION_READ_STORAGE = 21;

    @NotNull
    public static final String REQUEST_KEY_CAMERA = "feedback_camera";

    @NotNull
    public static final String REQUEST_KEY_READ_PHOTO = "feedback_readPhoto";
    public static final int REQ_TAKE_PHOTO = 19;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy providerAuth;
    public File currentPhotoFile;
    public static final int $stable = 8;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/activity/OnBackPressedCallback;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<OnBackPressedCallback, Unit> {
        public a() {
            super(1);
        }

        public final void a(@NotNull OnBackPressedCallback onBackPressedCallback) {
            FeedbackEditFragment.this.h();
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
            public final /* synthetic */ FeedbackEditFragment a;

            /* JADX INFO: renamed from: com.huami.feedback.zepp.ui.edit.FeedbackEditFragment$b$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
            public static final class C0390a extends Lambda implements Function0<Unit> {
                public final /* synthetic */ FeedbackEditFragment a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0390a(FeedbackEditFragment feedbackEditFragment) {
                    super(0);
                    this.a = feedbackEditFragment;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Unit getA() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.a.h();
                }
            }

            /* JADX INFO: renamed from: com.huami.feedback.zepp.ui.edit.FeedbackEditFragment$b$a$b, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
            public static final class C0391b extends Lambda implements Function0<Unit> {
                public final /* synthetic */ FeedbackEditFragment a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0391b(FeedbackEditFragment feedbackEditFragment) {
                    super(0);
                    this.a = feedbackEditFragment;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Unit getA() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    FragmentActivity activity = this.a.getActivity();
                    if (activity == null) {
                        return;
                    }
                    activity.finish();
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
            public static final class c extends Lambda implements Function0<Unit> {
                public final /* synthetic */ FeedbackEditFragment a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(FeedbackEditFragment feedbackEditFragment) {
                    super(0);
                    this.a = feedbackEditFragment;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Unit getA() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.a.d();
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
            public static final class d extends Lambda implements Function0<Unit> {
                public final /* synthetic */ FeedbackEditFragment a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(FeedbackEditFragment feedbackEditFragment) {
                    super(0);
                    this.a = feedbackEditFragment;
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(FeedbackEditFragment feedbackEditFragment) {
                super(2);
                this.a = feedbackEditFragment;
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
                    FeedbackScreenKt.FeedbackScreenRoute(this.a.g(), new C0390a(this.a), new C0391b(this.a), new c(this.a), new d(this.a), composer, 8);
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
                ThemeKt.RainbowTheme(FeedbackEditFragment.this.g().getIsForceDarkInternal(), ComposableLambdaKt.composableLambda(composer, -819892682, true, new a(FeedbackEditFragment.this)), composer, 48, 0);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ IOException a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(IOException iOException) {
            super(0);
            this.a = iOException;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("创建照片文件失败。", this.a);
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
            return "历史有失败表单，弹框提示用户。";
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
            return "用户取消继续失败表单提交，开启新的用户反馈！";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
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
    public FeedbackEditFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.feedback.zepp.ui.edit.FeedbackEditFragment$special$$inlined$sharedViewModel$default$1
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
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<FeedbackViewModel>() { // from class: com.huami.feedback.zepp.ui.edit.FeedbackEditFragment$special$$inlined$sharedViewModel$default$2
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
        LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.SYNCHRONIZED;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.providerAuth = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<FileProviderAuth>() { // from class: com.huami.feedback.zepp.ui.edit.FeedbackEditFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.feedback.inject.FileProviderAuth, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final FileProviderAuth getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(FileProviderAuth.class), objArr2, objArr3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        EasyPermissions.requestPermissions(this, getString(R.string.permission_rationale_msg_camera_select_image), 20, REQUEST_KEY_CAMERA, "android.permission.CAMERA");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        EasyPermissions.requestPermissions(this, getString(R.string.permission_rationale_storage_select_image), 21, REQUEST_KEY_READ_PHOTO, "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    private final FileProviderAuth f() {
        return (FileProviderAuth) this.providerAuth.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FeedbackViewModel g() {
        return (FeedbackViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        if (FragmentKt.findNavController(this).navigateUp()) {
            return;
        }
        if (g().getUserFormState().getValue() != null) {
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
    public static final void i(FeedbackEditFragment feedbackEditFragment, Boolean bool) {
        if (bool.booleanValue()) {
            feedbackEditFragment.k();
        }
    }

    private final void j() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        try {
            File file = new File(FileUtils.getAppFileDir(requireContext(), "capture") + ((Object) File.separator) + System.currentTimeMillis() + ".jpg");
            file.createNewFile();
            Unit unit = Unit.INSTANCE;
            setCurrentPhotoFile(file);
            if (Build.VERSION.SDK_INT >= 24) {
                intent.setFlags(1);
                intent.putExtra("output", FileProvider.getUriForFile(requireContext(), f().providerAuthString(), getCurrentPhotoFile()));
            } else {
                intent.putExtra("output", Uri.fromFile(getCurrentPhotoFile()));
            }
            if (intent.resolveActivity(requireActivity().getPackageManager()) == null) {
                return;
            }
            startActivityForResult(intent, 19);
        } catch (IOException e2) {
            HMLog.error$default("feedback", null, null, new c(e2), 6, null);
        }
    }

    private final void k() {
        HMLog.info("feedback", d.a);
        new AlertDialogFragment.Builder(getContext()).setTitle(R.string.feedback_ialog_title_notice).setMessage(R.string.feedback_dialog_retry_msg).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: v42
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                FeedbackEditFragment.l(this.a, dialogInterface, i);
            }
        }).setPositiveButton(R.string.feedback_dialog_btn_continue_text, new DialogInterface.OnClickListener() { // from class: u42
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                FeedbackEditFragment.m(this.a, dialogInterface, i);
            }
        }).setCancelable(false).show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(FeedbackEditFragment feedbackEditFragment, DialogInterface dialogInterface, int i) {
        HMLog.info("feedback", e.a);
        feedbackEditFragment.g().reloadHistoryFormIfNeedAndClearSavedUserForm(false);
        feedbackEditFragment.g().updateUserForm(null);
        FeedbackWorkService.INSTANCE.stopFeedback(feedbackEditFragment.requireContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(FeedbackEditFragment feedbackEditFragment, DialogInterface dialogInterface, int i) {
        HMLog.info("feedback", f.a);
        feedbackEditFragment.g().reloadHistoryFormIfNeedAndClearSavedUserForm(true);
        FeedbackWorkService.INSTANCE.stopFeedback(feedbackEditFragment.requireContext());
    }

    @NotNull
    public final File getCurrentPhotoFile() {
        File file = this.currentPhotoFile;
        if (file != null) {
            return file;
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    @Deprecated(message = "Deprecated in Java")
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == -1 && requestCode == 19) {
            try {
                Result.Companion companion = Result.Companion;
                g().addImage(Uri.fromFile(getCurrentPhotoFile()));
                Result.m3845constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        OnBackPressedDispatcherKt.addCallback$default(requireActivity().getOnBackPressedDispatcher(), this, false, new a(), 2, null);
        g().checkHistoryFeedback();
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ComposeView composeView = new ComposeView(requireContext(), null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-985531967, true, new b()));
        return composeView;
    }

    @Override // com.huami.utils.easypermission.EasyPermissions.PermissionCallbacks
    @SuppressLint({"RestrictedApi"})
    public void onPermissionsDenied(int requestCode, @NotNull List<String> perms) {
        String string;
        if (EasyPermissions.somePermissionPermanentlyDenied(this, perms)) {
            if (requestCode != 20) {
                string = requestCode != 21 ? null : getString(R.string.permission_denied_msg_storage_select_image);
            } else {
                string = getString(R.string.permission_denied_msg_camera_select_camera);
            }
            if (string == null) {
                return;
            }
            new PermissionDialogFragmentCompat.Builder().setMessage(string).create().show(getChildFragmentManager(), "");
        }
    }

    @Override // com.huami.utils.easypermission.EasyPermissions.PermissionCallbacks
    public void onPermissionsGranted(int requestCode, @NotNull List<String> perms) {
        if (requestCode == 20) {
            j();
        } else {
            if (requestCode != 21) {
                return;
            }
            FragmentKt.findNavController(this).navigate(R.id.action_feedbackEditFragment_to_imageFragment);
        }
    }

    @Override // androidx.fragment.app.Fragment, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        EasyPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults, this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        g().getShowRetryDialogState().observe(getViewLifecycleOwner(), new Observer() { // from class: w42
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                FeedbackEditFragment.i(this.a, (Boolean) obj);
            }
        });
    }

    public final void setCurrentPhotoFile(@NotNull File file) {
        this.currentPhotoFile = file;
    }
}
