package com.huami.third.googlefit.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p008lifecycle.ViewModelStore;
import androidx.p008lifecycle.ViewModelStoreOwner;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.thirdparty.support.ExtensionKt;
import com.huami.thirdparty.support.ui.WebPageActivity;
import com.huami.tools.log.HMLog;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u001a\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016R\u001d\u0010\u0010\u001a\u00020\u000b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/huami/third/googlefit/ui/GoogleFitBindFragment;", "Landroidx/fragment/app/Fragment;", "", "b", "", "c", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Lcom/huami/third/googlefit/ui/GoogleFitViewModel;", "a", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.a, "()Lcom/huami/third/googlefit/ui/GoogleFitViewModel;", "viewModel", "<init>", "()V", "Companion", "googlefit-ui_release"}, k = 1, mv = {1, 4, 1})
public final class GoogleFitBindFragment extends Fragment {

    @NotNull
    public static final String GOOGLE_FIT_URL = "https://fit.google.com";
    private static final String c = "GoogleFitBindFragment";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy viewModel;
    private HashMap b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "bindStateView()-刷新UI";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "", "onClick", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class b implements View.OnClickListener {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ boolean a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z) {
                super(0);
                this.a = z;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "检测google fit是否具有fitness权限 hasAuthorized = " + this.a;
            }
        }

        /* JADX INFO: renamed from: com.huami.third.googlefit.ui.GoogleFitBindFragment$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class C0616b extends Lambda implements Function0<String> {
            public static final C0616b a = new C0616b();

            public C0616b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "打开google fit客户端";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class c extends Lambda implements Function0<String> {
            public static final c a = new c();

            public c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "打开google fit客户端失败，进入google fit官网";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class d extends Lambda implements Function0<String> {
            public static final d a = new d();

            public d() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "执行google fit绑定";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;", "it", "", "a", "(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V"}, k = 3, mv = {1, 4, 1})
        public static final class e extends Lambda implements Function1<GoogleSignInAccount, Unit> {

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ GoogleSignInAccount a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(GoogleSignInAccount googleSignInAccount) {
                    super(0);
                    this.a = googleSignInAccount;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Google账户登录成功，用户名：");
                    GoogleSignInAccount googleSignInAccount = this.a;
                    sb.append(googleSignInAccount != null ? googleSignInAccount.getDisplayName() : null);
                    return sb.toString();
                }
            }

            public e() {
                super(1);
            }

            public final void a(@Nullable GoogleSignInAccount googleSignInAccount) {
                HMLog.info(GoogleFitBindFragment.c, new a(googleSignInAccount));
                ((TextView) GoogleFitBindFragment.this._$_findCachedViewById(R.id.tv_account)).setText(googleSignInAccount != null ? googleSignInAccount.getDisplayName() : null);
                ((Button) GoogleFitBindFragment.this._$_findCachedViewById(R.id.tv_unbind)).setVisibility(8);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(GoogleSignInAccount googleSignInAccount) {
                a(googleSignInAccount);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;", "it", "", "a", "(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V"}, k = 3, mv = {1, 4, 1})
        public static final class f extends Lambda implements Function1<GoogleSignInAccount, Unit> {

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ GoogleSignInAccount a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(GoogleSignInAccount googleSignInAccount) {
                    super(0);
                    this.a = googleSignInAccount;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    StringBuilder sb = new StringBuilder();
                    sb.append("GoogleFit获取权限成功，用户名：");
                    GoogleSignInAccount googleSignInAccount = this.a;
                    sb.append(googleSignInAccount != null ? googleSignInAccount.getDisplayName() : null);
                    return sb.toString();
                }
            }

            public f() {
                super(1);
            }

            public final void a(@Nullable GoogleSignInAccount googleSignInAccount) {
                HMLog.info(GoogleFitBindFragment.c, new a(googleSignInAccount));
                ((Button) GoogleFitBindFragment.this._$_findCachedViewById(R.id.tv_unbind)).setVisibility(0);
                Toast.makeText(GoogleFitBindFragment.this.requireContext(), GoogleFitBindFragment.this.getString(R.string.bind_success), 0).show();
                FuncKt.getGoogleFitAuthSuccessCallback().invoke();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(GoogleSignInAccount googleSignInAccount) {
                a(googleSignInAccount);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(I)V"}, k = 3, mv = {1, 4, 1})
        public static final class g extends Lambda implements Function1<Integer, Unit> {

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ int a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(int i) {
                    super(0);
                    this.a = i;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "Google账户登录失败，resultCode=" + this.a;
                }
            }

            public g() {
                super(1);
            }

            public final void a(int i) {
                HMLog.info(GoogleFitBindFragment.c, new a(i));
                ((TextView) GoogleFitBindFragment.this._$_findCachedViewById(R.id.tv_account)).setText(GoogleFitBindFragment.this.getString(R.string.google_account));
                ((Button) GoogleFitBindFragment.this._$_findCachedViewById(R.id.tv_unbind)).setVisibility(8);
                Toast.makeText(GoogleFitBindFragment.this.requireContext(), GoogleFitBindFragment.this.getString(R.string.bind_failed), 0).show();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                a(num.intValue());
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(I)V"}, k = 3, mv = {1, 4, 1})
        public static final class h extends Lambda implements Function1<Integer, Unit> {

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ int a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(int i) {
                    super(0);
                    this.a = i;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "GoogleFit获取权限失败，resultCode=" + this.a;
                }
            }

            public h() {
                super(1);
            }

            public final void a(int i) {
                HMLog.info(GoogleFitBindFragment.c, new a(i));
                Toast.makeText(GoogleFitBindFragment.this.requireContext(), GoogleFitBindFragment.this.getString(R.string.bind_failed), 0).show();
                ((TextView) GoogleFitBindFragment.this._$_findCachedViewById(R.id.tv_account)).setText(GoogleFitBindFragment.this.getString(R.string.google_account));
                ((Button) GoogleFitBindFragment.this._$_findCachedViewById(R.id.tv_unbind)).setVisibility(8);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                a(num.intValue());
                return Unit.INSTANCE;
            }
        }

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            boolean zHasAuthorized = GoogleFitBindFragment.this.d().hasAuthorized(GoogleFitBindFragment.this.requireContext());
            HMLog.info(GoogleFitBindFragment.c, new a(zHasAuthorized));
            if (!zHasAuthorized) {
                HMLog.info(GoogleFitBindFragment.c, d.a);
                GoogleFitBindFragment.this.d().auth(GoogleFitBindFragment.this.requireActivity(), new e(), new f(), new g(), new h());
                return;
            }
            HMLog.info(GoogleFitBindFragment.c, C0616b.a);
            if (ExtensionKt.openGoogleFit(GoogleFitBindFragment.this.requireActivity())) {
                return;
            }
            HMLog.info(GoogleFitBindFragment.c, c.a);
            GoogleFitBindFragment googleFitBindFragment = GoogleFitBindFragment.this;
            googleFitBindFragment.startActivity(WebPageActivity.INSTANCE.getIntent(googleFitBindFragment.requireContext(), GoogleFitBindFragment.GOOGLE_FIT_URL, GoogleFitBindFragment.this.getString(R.string.google_fit)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "", "onClick", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class c implements View.OnClickListener {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "执行google fit解绑";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class b extends Lambda implements Function0<Unit> {

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
            public static final class a extends Lambda implements Function0<String> {
                public static final a a = new a();

                public a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "google fit解绑成功";
                }
            }

            public b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                HMLog.info(GoogleFitBindFragment.c, a.a);
                GoogleFitBindFragment.this.b();
                FuncKt.getGoogleFitRevokeSuccessCallback().invoke();
            }
        }

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            HMLog.info(GoogleFitBindFragment.c, a.a);
            GoogleFitBindFragment.this.d().unbind(GoogleFitBindFragment.this.requireContext(), new b());
        }
    }

    public GoogleFitBindFragment() {
        super(R.layout.fragment_google_fit_bind);
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.huami.third.googlefit.ui.GoogleFitBindFragment$$special$$inlined$viewModels$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Fragment invoke() {
                return this;
            }
        };
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(GoogleFitViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.third.googlefit.ui.GoogleFitBindFragment$$special$$inlined$viewModels$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return ((ViewModelStoreOwner) function0.invoke()).getViewModelStore();
            }
        }, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        HMLog.info(c, a.a);
        boolean zHasAuthorized = d().hasAuthorized(requireContext());
        ((TextView) _$_findCachedViewById(R.id.tv_account)).setText(zHasAuthorized ? c() : getString(R.string.google_account));
        ((Button) _$_findCachedViewById(R.id.tv_unbind)).setVisibility(zHasAuthorized ? 0 : 8);
    }

    private final CharSequence c() {
        String signInAccountName = d().getSignInAccountName(requireContext());
        return signInAccountName == null || signInAccountName.length() == 0 ? getString(R.string.google_account_unknown) : signInAccountName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GoogleFitViewModel d() {
        return (GoogleFitViewModel) this.viewModel.getValue();
    }

    public void _$_clearFindViewByIdCache() {
        HashMap map = this.b;
        if (map != null) {
            map.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.b == null) {
            this.b = new HashMap();
        }
        View view = (View) this.b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View viewFindViewById = view2.findViewById(i);
        this.b.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        int i = R.id.bind_state_view;
        ExtensionKt.backgroundRadius((RelativeLayout) _$_findCachedViewById(i), ContextCompat.getColor(requireContext(), R.color.s38), ExtensionKt.dp2Px(requireContext(), 5.0f));
        ((RelativeLayout) _$_findCachedViewById(i)).setOnClickListener(new b());
        int i2 = R.id.tv_unbind;
        ExtensionKt.backgroundRadius$default((Button) _$_findCachedViewById(i2), 0, ExtensionKt.dp2Px(requireContext(), 5.0f), 1, null);
        ((Button) _$_findCachedViewById(i2)).setVisibility(8);
        ((Button) _$_findCachedViewById(i2)).setOnClickListener(new c());
        b();
    }
}
