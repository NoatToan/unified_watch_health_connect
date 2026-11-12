package com.huami.third.alipay.ui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import androidx.p008lifecycle.ViewModelStoreOwner;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.third.alipay.AuthInfo;
import com.huami.third.alipay.UserInfo;
import com.huami.tools.log.HMLog;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u001a\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u001d\u0010\u0015\u001a\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u000eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lcom/huami/third/alipay/ui/AlipayBindFragment;", "Landroidx/fragment/app/Fragment;", "", "b", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "outState", "onSaveInstanceState", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "", "a", "Ljava/lang/String;", "userId", "appId", "Lcom/huami/third/alipay/ui/AlipayViewModel;", "c", "Lkotlin/Lazy;", "()Lcom/huami/third/alipay/ui/AlipayViewModel;", "alipayViewModel", "", GoogleApiAvailabilityLight.a, "Z", "isAuthorized", "e", "authString", "Lcom/huami/third/alipay/UserInfo;", "f", "Lcom/huami/third/alipay/UserInfo;", "userInfo", "<init>", "()V", "Companion", "alipay-ui_release"}, k = 1, mv = {1, 4, 1})
public class AlipayBindFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String EXTRA_APP_ID = "appId";

    @NotNull
    public static final String EXTRA_USER_ID = "userId";
    private static final String h = "AlipayBindFragment";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String appId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Lazy alipayViewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isAuthorized;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private String authString;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private UserInfo userInfo;
    private HashMap g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\r"}, d2 = {"Lcom/huami/third/alipay/ui/AlipayBindFragment$Companion;", "", "", "userId", "appId", "Landroid/os/Bundle;", "buildArguments", "EXTRA_APP_ID", "Ljava/lang/String;", "EXTRA_USER_ID", "TAG", "<init>", "()V", "alipay-ui_release"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final Bundle buildArguments(@NotNull String userId, @NotNull String appId) {
            return BundleKt.bundleOf(TuplesKt.to("userId", userId), TuplesKt.to("appId", appId));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$Factory;", "invoke", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class a extends Lambda implements Function0<ViewModelProvider.Factory> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final ViewModelProvider.Factory getA() {
            return AlipayVMFactory.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/huami/third/alipay/AuthInfo;", "authInfo", "", "a", "(Lcom/huami/third/alipay/AuthInfo;)V"}, k = 3, mv = {1, 4, 1})
    public static final class b<T> implements Observer<AuthInfo> {
        public b() {
        }

        @Override // androidx.p008lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onChanged(@Nullable AuthInfo authInfo) {
            LoadingView loadingView;
            if (authInfo != null) {
                AlipayBindFragment.this.authString = authInfo.getAuthInfo();
                AlipayBindFragment alipayBindFragment = AlipayBindFragment.this;
                alipayBindFragment.isAuthorized = alipayBindFragment.c().isAuthorized(authInfo.getStatus());
            }
            if (!AlipayBindFragment.this.isAuthorized && (loadingView = AlipayHolder.INSTANCE.getLoadingView()) != null) {
                loadingView.hideLoading(AlipayBindFragment.this.requireActivity());
            }
            AlipayBindFragment.this.b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/huami/third/alipay/UserInfo;", "userInfo", "", "a", "(Lcom/huami/third/alipay/UserInfo;)V"}, k = 3, mv = {1, 4, 1})
    public static final class c<T> implements Observer<UserInfo> {
        public c() {
        }

        @Override // androidx.p008lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onChanged(@Nullable UserInfo userInfo) {
            LoadingView loadingView = AlipayHolder.INSTANCE.getLoadingView();
            if (loadingView != null) {
                loadingView.hideLoading(AlipayBindFragment.this.requireActivity());
            }
            AlipayBindFragment.this.userInfo = userInfo;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/huami/third/alipay/UserInfo;", "userInfo", "", "a", "(Lcom/huami/third/alipay/UserInfo;)V"}, k = 3, mv = {1, 4, 1})
    public static final class d<T> implements Observer<UserInfo> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "绑定成功";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class b extends Lambda implements Function0<String> {
            public static final b a = new b();

            public b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "绑定失败";
            }
        }

        public d() {
        }

        @Override // androidx.p008lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onChanged(@Nullable UserInfo userInfo) {
            LoadingView loadingView = AlipayHolder.INSTANCE.getLoadingView();
            if (loadingView != null) {
                loadingView.hideLoading(AlipayBindFragment.this.requireActivity());
            }
            AlipayBindFragment.this.userInfo = userInfo;
            if (userInfo == null) {
                HMLog.info(AlipayBindFragment.h, b.a);
                Toast.makeText(AlipayBindFragment.this.getContext(), AlipayBindFragment.this.getString(R.string.bind_alipay_fail), 0).show();
            } else {
                HMLog.info(AlipayBindFragment.h, a.a);
                AlipayBindFragment.this.isAuthorized = true;
                AlipayBindFragment.this.b();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "unbindSuccess", "", "a", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 4, 1})
    public static final class e<T> implements Observer<Boolean> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "解除绑定成功";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class b extends Lambda implements Function0<String> {
            public static final b a = new b();

            public b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "解除绑定失败";
            }
        }

        public e() {
        }

        @Override // androidx.p008lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onChanged(Boolean bool) {
            LoadingView loadingView = AlipayHolder.INSTANCE.getLoadingView();
            if (loadingView != null) {
                loadingView.hideLoading(AlipayBindFragment.this.requireActivity());
            }
            if (!bool.booleanValue()) {
                HMLog.info(AlipayBindFragment.h, b.a);
                return;
            }
            HMLog.info(AlipayBindFragment.h, a.a);
            AlipayBindFragment.this.isAuthorized = false;
            AlipayBindFragment.this.b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "", "onClick", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class f implements View.OnClickListener {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "alipay授权-网络未连接";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class b extends Lambda implements Function0<String> {
            public static final b a = new b();

            public b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "解除绑定";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", "onClick", "(Landroid/content/DialogInterface;I)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class c implements DialogInterface.OnClickListener {
            public static final c a = new c();

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", "onClick", "(Landroid/content/DialogInterface;I)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class d implements DialogInterface.OnClickListener {
            public d() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                UserInfo userInfo = AlipayBindFragment.this.userInfo;
                if (userInfo != null) {
                    LoadingView loadingView = AlipayHolder.INSTANCE.getLoadingView();
                    if (loadingView != null) {
                        loadingView.showLoading(AlipayBindFragment.this.requireActivity());
                    }
                    AlipayBindFragment.this.c().revokeAuth(AlipayBindFragment.this.userId, AlipayBindFragment.this.appId, userInfo.getNickName());
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class e extends Lambda implements Function0<String> {
            public static final e a = new e();

            public e() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "alipay授权-支付宝未安装";
            }
        }

        /* JADX INFO: renamed from: com.huami.third.alipay.ui.AlipayBindFragment$f$f, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class C0614f extends Lambda implements Function0<String> {
            public static final C0614f a = new C0614f();

            public C0614f() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "alipay授权-authString为空";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class g extends Lambda implements Function0<String> {
            public static final g a = new g();

            public g() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "alipay授权";
            }
        }

        public f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            AlipayHolder alipayHolder = AlipayHolder.INSTANCE;
            if (alipayHolder.getBindInterceptor() != null) {
                if (alipayHolder.getBindInterceptor().intercept(AlipayBindFragment.this.requireActivity(), AlipayBindFragment.this.isAuthorized ? BindState.BIND : BindState.UNBIND)) {
                    return;
                }
            }
            if (!UtilKt.isNetworkConnected(AlipayBindFragment.this.requireContext())) {
                Toast.makeText(AlipayBindFragment.this.getContext(), AlipayBindFragment.this.getString(R.string.no_network_connection), 0).show();
                HMLog.error$default(AlipayBindFragment.h, null, null, a.a, 6, null);
                return;
            }
            if (AlipayBindFragment.this.isAuthorized) {
                HMLog.info(AlipayBindFragment.h, b.a);
                new AlertDialogFragment.Builder(AlipayBindFragment.this.requireContext()).setMessage(R.string.bind_alipay_unbind_verify).setCancelable(false).setNegativeButton(R.string.cancel, c.a).setPositiveButton(R.string.yes, new d()).show(AlipayBindFragment.this.getChildFragmentManager()).setGravity(17);
                return;
            }
            if (!UtilKt.checkAliPayInstalled(AlipayBindFragment.this.requireContext())) {
                Toast.makeText(AlipayBindFragment.this.getContext(), AlipayBindFragment.this.getString(R.string.bind_alipay_install), 0).show();
                HMLog.error$default(AlipayBindFragment.h, null, null, e.a, 6, null);
                return;
            }
            String str = AlipayBindFragment.this.authString;
            if (str == null || str.length() == 0) {
                HMLog.error$default(AlipayBindFragment.h, null, null, C0614f.a, 6, null);
                return;
            }
            HMLog.info(AlipayBindFragment.h, g.a);
            LoadingView loadingView = alipayHolder.getLoadingView();
            if (loadingView != null) {
                loadingView.showLoading(AlipayBindFragment.this.requireActivity());
            }
            AlipayBindFragment.this.c().auth(AlipayBindFragment.this.userId, AlipayBindFragment.this.appId, AlipayBindFragment.this.authString, AlipayBindFragment.this.requireActivity());
        }
    }

    public AlipayBindFragment() {
        super(R.layout.fragment_bind_alipay);
        this.userId = "";
        this.appId = "";
        a aVar = a.a;
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.huami.third.alipay.ui.AlipayBindFragment$$special$$inlined$viewModels$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final Fragment getA() {
                return this;
            }
        };
        this.alipayViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(AlipayViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.third.alipay.ui.AlipayBindFragment$$special$$inlined$viewModels$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ViewModelStore getA() {
                return ((ViewModelStoreOwner) function0.getA()).getViewModelStore();
            }
        }, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        TextView textView;
        TextView textView2;
        View view = getView();
        if (view != null && (textView2 = (TextView) view.findViewById(R.id.bind_alipay_btn)) != null) {
            textView2.setText(getString(this.isAuthorized ? R.string.bind_alipay_unbind : R.string.bind_alipay_btn));
        }
        View view2 = getView();
        if (view2 == null || (textView = (TextView) view2.findViewById(R.id.bind_alipay_tips)) == null) {
            return;
        }
        textView.setText(getString(this.isAuthorized ? R.string.bind_alipay_bound_tips : R.string.bind_alipay_tips));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AlipayViewModel c() {
        return (AlipayViewModel) this.alipayViewModel.getValue();
    }

    public void _$_clearFindViewByIdCache() {
        HashMap map = this.g;
        if (map != null) {
            map.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.g == null) {
            this.g = new HashMap();
        }
        View view = (View) this.g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View viewFindViewById = view2.findViewById(i);
        this.g.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        String string;
        String string2;
        super.onCreate(savedInstanceState);
        String str = "";
        if (savedInstanceState != null) {
            String string3 = savedInstanceState.getString("userId");
            if (string3 == null) {
                string3 = "";
            }
            this.userId = string3;
            String string4 = savedInstanceState.getString("appId");
            this.appId = string4 != null ? string4 : "";
            return;
        }
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("userId")) == null) {
            string = "";
        }
        this.userId = string;
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string2 = arguments2.getString("appId")) != null) {
            str = string2;
        }
        this.appId = str;
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("userId", this.userId);
        outState.putString("appId", this.appId);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        c().getCheckAuthLiveData().observe(getViewLifecycleOwner(), new b());
        c().getUserInfoLiveData().observe(getViewLifecycleOwner(), new c());
        c().getAuthLiveData().observe(getViewLifecycleOwner(), new d());
        c().getRevokeAuthLiveData().observe(getViewLifecycleOwner(), new e());
        LoadingView loadingView = AlipayHolder.INSTANCE.getLoadingView();
        if (loadingView != null) {
            loadingView.showLoading(requireActivity());
        }
        c().checkAuth(this.userId, this.appId);
        b();
        TextView textView = (TextView) view.findViewById(R.id.bind_alipay_btn);
        if (textView != null) {
            textView.setOnClickListener(new f());
        }
    }
}
