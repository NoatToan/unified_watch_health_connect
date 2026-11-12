package com.huami.account.ui.register;

import android.R;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.account.AccountExternalsKt;
import com.huami.account.HMLoginManager;
import com.huami.account.UserLegalInfoComponents;
import com.huami.account.UserLegalInfoManager;
import com.huami.account.event.EventRegisterErrorTipExit;
import com.huami.account.legal.ServerLegalTask;
import com.huami.account.service.AuthNavigation;
import com.huami.account.service.model.Area;
import com.huami.account.service.model.LoginViewOptions;
import com.huami.account.service.proxy.KoinProxyKt;
import com.huami.account.ui.areas.AreasKt;
import com.huami.account.ui.areas.SelectAreaActivity;
import com.huami.account.ui.areas.SelectAreaHelper;
import com.huami.account.ui.areas.SelectAreaManager;
import com.huami.account.ui.common.BaseTitleOauthActivity;
import com.huami.account.ui.common.GlobalTitleStyleKt;
import com.huami.account.ui.common.LoadingDialogHelper;
import com.huami.account.ui.legal.UserAgreementFooterFragment;
import com.huami.account.ui.register.RegisterActivity;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.companion.ui.activity.BaseDeviceStatusActivity;
import com.xiaomi.hm.health.baseutil.Language;
import de.greenrobot.event.EventBus;
import java.io.Serializable;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 U2\u00020\u0001:\u0002UVB\u0007¢\u0006\u0004\bT\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\u001c\u0010\r\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\tH\u0002J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\tH\u0002J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u0014\u0010\u0018\u001a\u00020\u0017*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011H\u0002J\u0012\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014J\u0016\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0011J\"\u0010#\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u00172\b\u0010\"\u001a\u0004\u0018\u00010!H\u0014J\u000f\u0010&\u001a\u00020\u0002H\u0000¢\u0006\u0004\b$\u0010%J\u0006\u0010'\u001a\u00020\u000bJ\u0006\u0010(\u001a\u00020\u0002J\u0006\u0010)\u001a\u00020\u0002J\u0016\u0010*\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0011J\b\u0010+\u001a\u00020\u0002H\u0014J\u000e\u0010.\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,R\u001d\u00104\u001a\u00020/8@@\u0000X\u0080\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0018\u00107\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u00106R\u0018\u0010:\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u00109R\u0018\u0010=\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010<R\u0016\u0010@\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u001e\u0010D\u001a\n A*\u0004\u0018\u00010\t0\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR%\u0010H\u001a\n A*\u0004\u0018\u00010\u00060\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u00101\u001a\u0004\bF\u0010GR%\u0010L\u001a\n A*\u0004\u0018\u00010I0I8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u00101\u001a\u0004\b0\u0010KR\u0016\u0010N\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010CR$\u0010S\u001a\u00020\u000b2\u0006\u0010O\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bP\u0010?\u001a\u0004\bQ\u0010R¨\u0006W"}, d2 = {"Lcom/huami/account/ui/register/RegisterActivity;", "Lcom/huami/account/ui/common/BaseTitleOauthActivity;", "", "Q", "P", LogUtil.D, "Landroid/view/View;", "B", "C", "Lcom/huami/account/service/model/Area;", BaseDeviceStatusActivity.KEY_AREA, "", "isChinaEmailDebug", "K", "selectedArea", "R", "N", "", "name", "O", "M", "Landroidx/fragment/app/Fragment;", "tag", "", "y", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "username", "password", "onAlreadyRegister", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "loginSuccess$accountui_release", "()V", "loginSuccess", "isAgreementChecked", "saveUxPreference", "onLoginSuccess", "registerSuccessButLoginError", "onDestroy", "Lcom/huami/account/event/EventRegisterErrorTipExit;", "event", "onEventMainThread", "Lcom/huami/account/ui/common/LoadingDialogHelper;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lkotlin/Lazy;", "getDialog$accountui_release", "()Lcom/huami/account/ui/common/LoadingDialogHelper;", "dialog", "Lcom/huami/account/ui/legal/UserAgreementFooterFragment;", "Lcom/huami/account/ui/legal/UserAgreementFooterFragment;", "userAgreementFragment", "Lcom/huami/account/ui/register/BaseRegisterFragment;", "Lcom/huami/account/ui/register/BaseRegisterFragment;", "registerFormFragment", "Lcom/huami/account/ui/register/RegisterActivity$KeyboardVisibilityListener;", "Lcom/huami/account/ui/register/RegisterActivity$KeyboardVisibilityListener;", "keyboardListener", "E", "Z", "isShowSuccessDialog", "kotlin.jvm.PlatformType", "F", "Lcom/huami/account/service/model/Area;", "chinaArea", "G", "z", "()Landroid/view/View;", "layoutSelectAreaContainer", "Landroid/widget/ScrollView;", "H", "()Landroid/widget/ScrollView;", "registerScroller", LogUtil.I, "currentSelectedArea", "<set-?>", "J", "getHasSelectedArea", "()Z", "hasSelectedArea", "<init>", "Companion", "KeyboardVisibilityListener", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class RegisterActivity extends BaseTitleOauthActivity {
    public static final int REQUEST_REGISTER = 1000;

    @NotNull
    public static final String TAG_REGISTER_EMAIL = "registerEmail";

    @NotNull
    public static final String TAG_REGISTER_PHONE = "registerPhone";

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    private UserAgreementFooterFragment userAgreementFragment;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    private BaseRegisterFragment registerFormFragment;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @Nullable
    private KeyboardVisibilityListener keyboardListener;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private boolean isShowSuccessDialog;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private boolean hasSelectedArea;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private final Lazy dialog = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final Area chinaArea = SelectAreaHelper.getAreaByCountryCode("CN");

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    private final Lazy layoutSelectAreaContainer = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    private final Lazy registerScroller = LazyKt__LazyJVMKt.lazy(new d());

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @NotNull
    private Area currentSelectedArea = SelectAreaManager.getDefaultArea();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B:\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00020\f¢\u0006\u0004\b\u001c\u0010\u001dJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR1\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/huami/account/ui/register/RegisterActivity$KeyboardVisibilityListener;", "", "", "release", "Landroid/app/Activity;", "a", "Landroid/app/Activity;", "activity", "Landroid/view/ViewGroup;", "b", "Landroid/view/ViewGroup;", "rootLayout", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "isShow", "c", "Lkotlin/jvm/functions/Function1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", GoogleApiAvailabilityLight.a, LogUtil.I, "lastHeightDiff", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "e", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "keyboardLayoutListener", "<init>", "(Landroid/app/Activity;Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static final class KeyboardVisibilityListener {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Activity activity;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final ViewGroup rootLayout;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final Function1<Boolean, Unit> listener;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private int lastHeightDiff;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        private final ViewTreeObserver.OnGlobalLayoutListener keyboardLayoutListener;

        /* JADX WARN: Multi-variable type inference failed */
        public KeyboardVisibilityListener(@NotNull Activity activity, @NotNull ViewGroup viewGroup, @NotNull Function1<? super Boolean, Unit> function1) {
            this.activity = activity;
            this.rootLayout = viewGroup;
            this.listener = function1;
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: va6
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    RegisterActivity.KeyboardVisibilityListener.b(this.a);
                }
            };
            this.keyboardLayoutListener = onGlobalLayoutListener;
            viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(KeyboardVisibilityListener keyboardVisibilityListener) {
            int height = keyboardVisibilityListener.rootLayout.getRootView().getHeight() - keyboardVisibilityListener.rootLayout.getHeight();
            int top = keyboardVisibilityListener.activity.getWindow().findViewById(R.id.content).getTop();
            if (height != keyboardVisibilityListener.lastHeightDiff) {
                keyboardVisibilityListener.lastHeightDiff = height;
                keyboardVisibilityListener.listener.invoke(Boolean.valueOf(height > top));
            }
        }

        public final void release() {
            this.rootLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this.keyboardLayoutListener);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/account/ui/common/LoadingDialogHelper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<LoadingDialogHelper> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LoadingDialogHelper invoke() {
            return new LoadingDialogHelper(RegisterActivity.this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<View> {
        public b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
            return RegisterActivity.this.findViewById(com.huami.account.ui.R.id.layout_select_area_container);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            BaseRegisterFragment baseRegisterFragment = RegisterActivity.this.registerFormFragment;
            if (baseRegisterFragment == null) {
                return;
            }
            baseRegisterFragment.updateBtnState();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/ScrollView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<ScrollView> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ScrollView invoke() {
            return (ScrollView) RegisterActivity.this.findViewById(com.huami.account.ui.R.id.register_scroller);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "isShow", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<Boolean, Unit> {
        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            if (z) {
                RegisterActivity.this.A().scrollTo(0, RegisterActivity.this.A().getHeight());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ScrollView A() {
        return (ScrollView) this.registerScroller.getValue();
    }

    private final View B() {
        return findViewById(com.huami.account.ui.R.id.layout_select_area);
    }

    private final void C() {
        Intent intent = new Intent(this, (Class<?>) SelectAreaActivity.class);
        intent.putExtra(SelectAreaActivity.SELECT_AREA_ONLY, true);
        intent.putExtra("selectedArea", this.currentSelectedArea);
        startActivityForResult(intent, SelectAreaActivity.REQUEST_SELECT_AREA_ONLY);
    }

    private final void D() {
        if (AccountExternalsKt.getConfigDelegate().debug()) {
            B().setOnLongClickListener(new View.OnLongClickListener() { // from class: ta6
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return RegisterActivity.E(this.a, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean E(final RegisterActivity registerActivity, View view) {
        ServerLegalTask.executeServerLegalTask(registerActivity, registerActivity.getDialog$accountui_release(), registerActivity.chinaArea, new ServerLegalTask.SuccessCallback() { // from class: ua6
            @Override // com.huami.account.legal.ServerLegalTask.SuccessCallback
            public final void onSuccess() {
                RegisterActivity.F(this.a);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(RegisterActivity registerActivity) {
        registerActivity.hasSelectedArea = true;
        registerActivity.O(AreasKt.getDisplayName(registerActivity.chinaArea));
        registerActivity.K(registerActivity.chinaArea, true);
        registerActivity.M(registerActivity.chinaArea);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(RegisterActivity registerActivity, DialogInterface dialogInterface, int i) {
        registerActivity.getDialog$accountui_release().hideDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(RegisterActivity registerActivity, String str, String str2, DialogInterface dialogInterface, int i) {
        registerActivity.finish();
        AuthNavigation.DefaultImpls.navigateToNormalLogin$default((AuthNavigation) KoinProxyKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(AuthNavigation.class), null, null), registerActivity, LoginViewOptions.INSTANCE.fillLogin(str, str2), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(RegisterActivity registerActivity, View view) {
        HMLoginManager.goAccountFaq(registerActivity, "mifit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(RegisterActivity registerActivity, View view) {
        registerActivity.C();
    }

    private final void K(Area area, boolean isChinaEmailDebug) {
        BaseRegisterFragment phoneRegisterFormFragment;
        if (isChinaEmailDebug && SelectAreaHelper.isCN(area)) {
            EmailRegisterFormFragment emailRegisterFormFragment = new EmailRegisterFormFragment();
            emailRegisterFormFragment.setArea(this.chinaArea);
            y(emailRegisterFormFragment, TAG_REGISTER_EMAIL);
            Unit unit = Unit.INSTANCE;
            this.registerFormFragment = emailRegisterFormFragment;
            return;
        }
        if (area == null) {
            area = SelectAreaHelper.getDefaultArea();
        }
        BaseRegisterFragment baseRegisterFragment = this.registerFormFragment;
        if ((baseRegisterFragment instanceof PhoneRegisterFormFragment) && SelectAreaHelper.isCN(area)) {
            ((PhoneRegisterFormFragment) baseRegisterFragment).updateBtnState();
            return;
        }
        if ((baseRegisterFragment instanceof EmailRegisterFormFragment) && !SelectAreaHelper.isCN(area)) {
            EmailRegisterFormFragment emailRegisterFormFragment2 = (EmailRegisterFormFragment) baseRegisterFragment;
            emailRegisterFormFragment2.setArea(area);
            emailRegisterFormFragment2.updateBtnState();
            return;
        }
        if (Intrinsics.areEqual(area.getValue(), Locale.SIMPLIFIED_CHINESE.getCountry())) {
            phoneRegisterFormFragment = new PhoneRegisterFormFragment();
            y(phoneRegisterFormFragment, TAG_REGISTER_PHONE);
            Unit unit2 = Unit.INSTANCE;
        } else {
            EmailRegisterFormFragment emailRegisterFormFragment3 = new EmailRegisterFormFragment();
            emailRegisterFormFragment3.setArea(area);
            y(emailRegisterFormFragment3, TAG_REGISTER_EMAIL);
            Unit unit3 = Unit.INSTANCE;
            phoneRegisterFormFragment = emailRegisterFormFragment3;
        }
        this.registerFormFragment = phoneRegisterFormFragment;
    }

    public static /* synthetic */ void L(RegisterActivity registerActivity, Area area, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        registerActivity.K(area, z);
    }

    private final void M(Area area) {
        UserAgreementFooterFragment userAgreementFooterFragmentShowUserAgreementFooterFragment = UserLegalInfoManager.showUserAgreementFooterFragment(this, com.huami.account.ui.R.id.user_agreement_layout, SelectAreaHelper.isShowUxAgreement(area), area.getValue());
        userAgreementFooterFragmentShowUserAgreementFooterFragment.setUserAgreementCheckListener(new c());
        Unit unit = Unit.INSTANCE;
        this.userAgreementFragment = userAgreementFooterFragmentShowUserAgreementFooterFragment;
    }

    private final void N(Area selectedArea) {
        O(AreasKt.getDisplayName(selectedArea));
        M(selectedArea);
        L(this, selectedArea, false, 2, null);
    }

    private final void O(String name) {
        ((TextView) findViewById(com.huami.account.ui.R.id.tv_select_area)).setText(name);
    }

    private final void P() {
        this.keyboardListener = new KeyboardVisibilityListener(this, A(), new e());
    }

    private final void Q() {
        z().setVisibility(4);
        View viewZ = z();
        ViewGroup.LayoutParams layoutParams = viewZ.getLayoutParams();
        layoutParams.height = viewZ.getResources().getDimensionPixelSize(com.huami.account.ui.R.dimen.account_ui_register_header_height);
        Unit unit = Unit.INSTANCE;
        viewZ.setLayoutParams(layoutParams);
        this.hasSelectedArea = true;
        N(this.chinaArea);
    }

    private final void R(Area selectedArea) {
        if (Intrinsics.areEqual(selectedArea.getValue(), "CN") && Language.isSimplifiedChinese()) {
            UserLegalInfoComponents.INSTANCE.showRegisterPrivacyTip(this);
        }
    }

    private final int y(Fragment fragment, String str) {
        return getSupportFragmentManager().beginTransaction().replace(com.huami.account.ui.R.id.register_form_layout, fragment, str).commit();
    }

    private final View z() {
        return (View) this.layoutSelectAreaContainer.getValue();
    }

    @NotNull
    public final LoadingDialogHelper getDialog$accountui_release() {
        return (LoadingDialogHelper) this.dialog.getValue();
    }

    public final boolean getHasSelectedArea() {
        return this.hasSelectedArea;
    }

    public final boolean isAgreementChecked() {
        UserAgreementFooterFragment userAgreementFooterFragment = this.userAgreementFragment;
        return userAgreementFooterFragment != null && userAgreementFooterFragment.isUserAgreementChecked();
    }

    public final void loginSuccess$accountui_release() {
        setResult(-1);
        if (!HMLoginManager.isExistingUser()) {
            getDialog$accountui_release().hideDialog();
            finish();
        } else {
            LoadingDialog loadingDialog = getDialog$accountui_release().getLoadingDialog();
            if (loadingDialog == null) {
                return;
            }
            loadingDialog.setSuccess(getString(com.huami.account.ui.R.string.account_ui_login_success), new LoadingDialog.OnAnimEndListener() { // from class: com.huami.account.ui.register.RegisterActivity$loginSuccess$1
                @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
                public void onAnimEnd(@NotNull LoadingDialog dialog) {
                }

                @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
                public void onDismiss(@NotNull LoadingDialog dialog) {
                    this.a.finish();
                }
            });
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 223 && resultCode == -1) {
            this.hasSelectedArea = true;
            Serializable serializableExtra = data == null ? null : data.getSerializableExtra("selectedArea");
            if (serializableExtra instanceof Area) {
                Area area = (Area) serializableExtra;
                N(area);
                R(area);
                this.currentSelectedArea = area;
            }
        }
    }

    public final void onAlreadyRegister(@NotNull final String username, @NotNull final String password) {
        new AlertDialogFragment.Builder(this).setMessage(com.huami.account.ui.R.string.account_ui_account_already_register).setNegativeButton(com.huami.account.ui.R.string.account_ui_cancel, new DialogInterface.OnClickListener() { // from class: pa6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                RegisterActivity.G(this.a, dialogInterface, i);
            }
        }).setPositiveButton(com.huami.account.ui.R.string.account_ui_account_direct_login, new DialogInterface.OnClickListener() { // from class: qa6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                RegisterActivity.H(this.a, username, password, dialogInterface, i);
            }
        }).show(getSupportFragmentManager());
    }

    @Override // com.huami.account.ui.common.BaseTitleOauthActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.huami.account.ui.R.layout.account_ui_activity_register_main);
        setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE_EXCHANGE, ContextCompat.getColor(this, com.huami.account.ui.R.color.s38), getString(com.huami.account.ui.R.string.account_ui_account_register), !RainbowUtils.isDarkMode(this));
        GlobalTitleStyleKt.setupAccountTitleStyle(this);
        setRightTitle(getString(com.huami.account.ui.R.string.account_ui_account_faq));
        getRightTitle().setOnClickListener(new View.OnClickListener() { // from class: ra6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RegisterActivity.I(this.a, view);
            }
        });
        getRightTitle().setVisibility(8);
        P();
        if (AccountExternalsKt.getAccountDelegate().isChineseOnly()) {
            Q();
            return;
        }
        L(this, null, false, 2, null);
        B().setOnClickListener(new View.OnClickListener() { // from class: sa6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RegisterActivity.J(this.a, view);
            }
        });
        D();
        EventBus.getDefault().registerSticky(this);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        KeyboardVisibilityListener keyboardVisibilityListener = this.keyboardListener;
        if (keyboardVisibilityListener != null) {
            keyboardVisibilityListener.release();
        }
        EventBus.getDefault().unregister(this);
        super.onDestroy();
    }

    public final void onEventMainThread(@NotNull EventRegisterErrorTipExit event) {
        finish();
    }

    public final void onLoginSuccess() {
        setResult(-1);
        if (!HMLoginManager.isExistingUser()) {
            getDialog$accountui_release().hideDialog();
            finish();
        } else {
            LoadingDialog loadingDialog = getDialog$accountui_release().getLoadingDialog();
            if (loadingDialog == null) {
                return;
            }
            loadingDialog.setSuccess(getString(com.huami.account.ui.R.string.account_ui_login_success), new LoadingDialog.OnAnimEndListener() { // from class: com.huami.account.ui.register.RegisterActivity.onLoginSuccess.1
                @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
                public void onAnimEnd(@NotNull LoadingDialog dialog) {
                }

                @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
                public void onDismiss(@NotNull LoadingDialog dialog) {
                    RegisterActivity.this.finish();
                }
            });
        }
    }

    public final void registerSuccessButLoginError(@NotNull String username, @NotNull String password) {
        finish();
        AuthNavigation.DefaultImpls.navigateToNormalLogin$default((AuthNavigation) KoinProxyKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(AuthNavigation.class), null, null), this, LoginViewOptions.INSTANCE.fillLogin(username, password), null, 4, null);
    }

    public final void saveUxPreference() {
        UserAgreementFooterFragment userAgreementFooterFragment = this.userAgreementFragment;
        if (userAgreementFooterFragment == null) {
            return;
        }
        userAgreementFooterFragment.saveUxPreference();
    }
}
