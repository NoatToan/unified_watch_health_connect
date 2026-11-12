package com.huami.account.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.autofill.HintConstants;
import androidx.p008lifecycle.LifecycleOwnerKt;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.AccountExternalsKt;
import com.huami.account.HMLoginManager;
import com.huami.account.HMLogoutManager;
import com.huami.account.HMProcessLoginDataManager;
import com.huami.account.event.EventPhoneBinding;
import com.huami.account.keeper.HMAccountKeeper;
import com.huami.account.service.AuthNavigation;
import com.huami.account.service.model.LoginViewOptions;
import com.huami.account.ui.BindPhoneForLoginActivity;
import com.huami.account.ui.areas.SelectAreaManager;
import com.huami.account.ui.common.DebugUi;
import com.huami.account.ui.register.BaseRegisterFragmentKt;
import com.huami.account.utils.AccountConstants;
import com.huami.account.utils.UtilsKt;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.passport.AccountManager;
import com.huami.passport.ErrorCode;
import com.huami.passport.IAccount;
import com.huami.passport.entity.BindResult;
import com.huami.passport.entity.LoginInfo;
import com.huami.passport.entity.Message;
import com.huami.tools.log.HMLog;
import com.huami.util.net.NetUtil;
import com.huami.widget.toast.IconToast;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import de.greenrobot.event.EventBus;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\b*\u0002HK\u0018\u0000 Q2\u00020\u0001:\u0001QB\u0007¢\u0006\u0004\bO\u0010PJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0014\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0016\u001a\u00020\u0002H\u0002J\u0012\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0014J\b\u0010\u001a\u001a\u00020\u0002H\u0016R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R%\u0010)\u001a\n $*\u0004\u0018\u00010#0#8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R%\u0010.\u001a\n $*\u0004\u0018\u00010*0*8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010-R%\u00103\u001a\n $*\u0004\u0018\u00010/0/8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010&\u001a\u0004\b1\u00102R%\u00106\u001a\n $*\u0004\u0018\u00010/0/8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010&\u001a\u0004\b5\u00102R%\u00109\u001a\n $*\u0004\u0018\u00010/0/8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010&\u001a\u0004\b8\u00102R%\u0010<\u001a\n $*\u0004\u0018\u00010/0/8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010&\u001a\u0004\b;\u00102R%\u0010A\u001a\n $*\u0004\u0018\u00010=0=8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010&\u001a\u0004\b?\u0010@R%\u0010C\u001a\n $*\u0004\u0018\u00010=0=8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010&\u001a\u0004\bB\u0010@R%\u0010G\u001a\n $*\u0004\u0018\u00010D0D8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\bE\u0010FR\u0016\u0010J\u001a\u00020H8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010IR\u0016\u0010N\u001a\u00020K8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010M¨\u0006R"}, d2 = {"Lcom/huami/account/ui/BindPhoneForLoginActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "", hl.k, "x", "", "phoneNum", LogUtil.D, HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "F", "reason", "l", "initViews", "phone", "access", z.j, LogUtil.I, "Lkotlinx/coroutines/Job;", GoogleApiAvailabilityLight.b, "", "msg", "E", "hideProgressDialog", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onBackPressed", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "a", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "mLoadingDialog", "", "b", "Z", "isCountingDown", "Landroid/view/View;", "kotlin.jvm.PlatformType", "c", "Lkotlin/Lazy;", "u", "()Landroid/view/View;", "nextStepBtn", "Landroid/widget/TextView;", GoogleApiAvailabilityLight.a, "v", "()Landroid/widget/TextView;", "sendVerifyBtn", "Landroid/widget/EditText;", "e", "t", "()Landroid/widget/EditText;", "inputVerificationCode", "f", SOAP.XMLNS, "inputPhoneNumber", "g", DTransferConstants.SEARCH_KEY, "inputPasswordText", "h", "r", "inputPasswordTextAgain", "Landroid/widget/ImageView;", "i", "o", "()Landroid/widget/ImageView;", "inputPasswordShow", com.google.android.exoplayer2.text.ttml.b.r, "inputPasswordShowAgain", "Lcom/huami/lib/rainbow/titlebar/RainbowTitleBar;", "w", "()Lcom/huami/lib/rainbow/titlebar/RainbowTitleBar;", "titleBar", "com/huami/account/ui/BindPhoneForLoginActivity$verifyCodeBtnStateListener$1", "Lcom/huami/account/ui/BindPhoneForLoginActivity$verifyCodeBtnStateListener$1;", "verifyCodeBtnStateListener", "com/huami/account/ui/BindPhoneForLoginActivity$nextStepButtonStateListener$1", "m", "Lcom/huami/account/ui/BindPhoneForLoginActivity$nextStepButtonStateListener$1;", "nextStepButtonStateListener", "<init>", "()V", "Companion", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class BindPhoneForLoginActivity extends AppCompatActivity {
    public static final int CHECK_SMS_PHONE_ALREADY_BIND = 10;
    public static final int CHECK_SMS_SUCCESS = 0;
    public static final int CHECK_SMS_TOO_FREQUENTLY = 12;
    public static final int RESEND_DELAY_SECONDS = 60;

    @NotNull
    private static final String n = "BindPhoneForLoginActivity";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog mLoadingDialog;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean isCountingDown;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy nextStepBtn = LazyKt__LazyJVMKt.lazy(new h());

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy sendVerifyBtn = LazyKt__LazyJVMKt.lazy(new j());

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy inputVerificationCode = LazyKt__LazyJVMKt.lazy(new g());

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy inputPhoneNumber = LazyKt__LazyJVMKt.lazy(new f());

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy inputPasswordText = LazyKt__LazyJVMKt.lazy(new d());

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy inputPasswordTextAgain = LazyKt__LazyJVMKt.lazy(new e());

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy inputPasswordShow = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy inputPasswordShowAgain = LazyKt__LazyJVMKt.lazy(new c());

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy titleBar = LazyKt__LazyJVMKt.lazy(new k());

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final BindPhoneForLoginActivity$verifyCodeBtnStateListener$1 verifyCodeBtnStateListener = new TextWatcher() { // from class: com.huami.account.ui.BindPhoneForLoginActivity$verifyCodeBtnStateListener$1
        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable s) {
            this.a.v().setEnabled(this.a.s().length() > 0 && !this.a.isCountingDown);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence s, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence s, int start, int before, int count) {
        }
    };

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final BindPhoneForLoginActivity$nextStepButtonStateListener$1 nextStepButtonStateListener = new TextWatcher() { // from class: com.huami.account.ui.BindPhoneForLoginActivity$nextStepButtonStateListener$1
        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable s) {
            this.a.I();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence s, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence s, int start, int before, int count) {
        }
    };

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.account.ui.BindPhoneForLoginActivity$enableResendAfterDelay$1", f = "BindPhoneForLoginActivity.kt", i = {0}, l = {373}, m = "invokeSuspend", n = {"timeRemain"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public Object b;
        public int c;
        public int d;
        public int e;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BindPhoneForLoginActivity.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x004a  */
        /* JADX WARN: Code duplicated, block: B:12:0x007d A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x007b -> B:13:0x007e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.e
                r2 = 60
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L28
                if (r1 != r4) goto L20
                int r1 = r9.d
                int r2 = r9.c
                java.lang.Object r5 = r9.b
                com.huami.account.ui.BindPhoneForLoginActivity r5 = (com.huami.account.ui.BindPhoneForLoginActivity) r5
                java.lang.Object r6 = r9.a
                kotlin.jvm.internal.Ref$IntRef r6 = (kotlin.jvm.internal.Ref.IntRef) r6
                kotlin.ResultKt.throwOnFailure(r10)
                r10 = r1
                r1 = r9
                goto L7e
            L20:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L28:
                kotlin.ResultKt.throwOnFailure(r10)
                com.huami.account.ui.BindPhoneForLoginActivity r10 = com.huami.account.ui.BindPhoneForLoginActivity.this
                android.widget.TextView r10 = com.huami.account.ui.BindPhoneForLoginActivity.access$getSendVerifyBtn(r10)
                r10.setEnabled(r3)
                kotlin.jvm.internal.Ref$IntRef r10 = new kotlin.jvm.internal.Ref$IntRef
                r10.<init>()
                r10.element = r2
                com.huami.account.ui.BindPhoneForLoginActivity r1 = com.huami.account.ui.BindPhoneForLoginActivity.this
                com.huami.account.ui.BindPhoneForLoginActivity.access$setCountingDown$p(r1, r4)
                com.huami.account.ui.BindPhoneForLoginActivity r1 = com.huami.account.ui.BindPhoneForLoginActivity.this
                r6 = r10
                r5 = r1
                r10 = 60
                r2 = 0
                r1 = r9
            L48:
                if (r2 >= r10) goto L86
                java.lang.Integer r7 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r2)
                r7.intValue()
                int r7 = r6.element
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r7)
                java.lang.String r7 = "s"
                r8.append(r7)
                java.lang.String r7 = r8.toString()
                android.widget.TextView r8 = com.huami.account.ui.BindPhoneForLoginActivity.access$getSendVerifyBtn(r5)
                r8.setText(r7)
                r7 = 1000(0x3e8, double:4.94E-321)
                r1.a = r6
                r1.b = r5
                r1.c = r2
                r1.d = r10
                r1.e = r4
                java.lang.Object r7 = kotlinx.coroutines.DelayKt.delay(r7, r1)
                if (r7 != r0) goto L7e
                return r0
            L7e:
                int r7 = r6.element
                int r7 = r7 + (-1)
                r6.element = r7
                int r2 = r2 + r4
                goto L48
            L86:
                com.huami.account.ui.BindPhoneForLoginActivity r10 = com.huami.account.ui.BindPhoneForLoginActivity.this
                com.huami.account.ui.BindPhoneForLoginActivity.access$setCountingDown$p(r10, r3)
                com.huami.account.ui.BindPhoneForLoginActivity r10 = com.huami.account.ui.BindPhoneForLoginActivity.this
                android.widget.TextView r10 = com.huami.account.ui.BindPhoneForLoginActivity.access$getSendVerifyBtn(r10)
                com.huami.account.ui.BindPhoneForLoginActivity r0 = com.huami.account.ui.BindPhoneForLoginActivity.this
                android.content.res.Resources r0 = r0.getResources()
                int r2 = com.huami.account.ui.R.string.account_ui_register_phone_resend_code
                java.lang.String r0 = r0.getString(r2)
                r10.setText(r0)
                com.huami.account.ui.BindPhoneForLoginActivity r10 = com.huami.account.ui.BindPhoneForLoginActivity.this
                android.widget.TextView r10 = com.huami.account.ui.BindPhoneForLoginActivity.access$getSendVerifyBtn(r10)
                r10.setEnabled(r4)
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huami.account.ui.BindPhoneForLoginActivity.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<ImageView> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ImageView getA() {
            return (ImageView) BindPhoneForLoginActivity.this.findViewById(R.id.input_password_show);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<ImageView> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ImageView getA() {
            return (ImageView) BindPhoneForLoginActivity.this.findViewById(R.id.input_password_show_again);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/EditText;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<EditText> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EditText getA() {
            return (EditText) BindPhoneForLoginActivity.this.findViewById(R.id.input_password_text);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/EditText;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<EditText> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EditText getA() {
            return (EditText) BindPhoneForLoginActivity.this.findViewById(R.id.input_password_text_again);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/EditText;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<EditText> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EditText getA() {
            return (EditText) BindPhoneForLoginActivity.this.findViewById(R.id.input_phone_number);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/EditText;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<EditText> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EditText getA() {
            return (EditText) BindPhoneForLoginActivity.this.findViewById(R.id.input_verification_code);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<View> {
        public h() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final View getA() {
            return BindPhoneForLoginActivity.this.findViewById(R.id.next_step_btn);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<Unit> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            BindPhoneForLoginActivity.this.x();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<TextView> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextView getA() {
            return (TextView) BindPhoneForLoginActivity.this.findViewById(R.id.send_verify_btn);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/lib/rainbow/titlebar/RainbowTitleBar;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<RainbowTitleBar> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RainbowTitleBar getA() {
            return (RainbowTitleBar) BindPhoneForLoginActivity.this.findViewById(R.id.bind_phone_title_bar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(BindPhoneForLoginActivity bindPhoneForLoginActivity, View view, int i2) {
        bindPhoneForLoginActivity.x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(BindPhoneForLoginActivity bindPhoneForLoginActivity, View view) {
        bindPhoneForLoginActivity.k();
    }

    private final void D(final String phoneNum) {
        String str = AccountConstants.DEFAULT_AREA_CODE + phoneNum;
        v().setEnabled(false);
        E(R.string.account_ui_account_verify_code_sending);
        AccountManager.getDefault(this).checkSmsBinding(str, SelectAreaManager.INSTANCE.getAreaBySave().getValue(), new IAccount.Callback<Message, ErrorCode>() { // from class: com.huami.account.ui.BindPhoneForLoginActivity$sendPhoneVerify$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ ErrorCode a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(ErrorCode errorCode) {
                    super(0);
                    this.a = errorCode;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return String.valueOf(this.a);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public final /* synthetic */ Message a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(Message message) {
                    super(0);
                    this.a = message;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    Message message = this.a;
                    Integer numValueOf = message == null ? null : Integer.valueOf(message.getCode());
                    Message message2 = this.a;
                    return "message code:" + numValueOf + ";errorMsg:" + (message2 != null ? message2.getErrorMsg() : null);
                }
            }

            @Override // com.huami.passport.IAccount.Callback
            public void onError(@Nullable ErrorCode errorCode) {
                HMLog.info("BindPhoneForLoginActivity", new a(errorCode));
                if (!Intrinsics.areEqual(errorCode == null ? null : errorCode.getErrorCode(), "429")) {
                    BindPhoneForLoginActivity.m(this.a, null, 1, null);
                } else {
                    BindPhoneForLoginActivity bindPhoneForLoginActivity = this.a;
                    bindPhoneForLoginActivity.l(bindPhoneForLoginActivity.getString(UtilsKt.toSmsLimitPrompt(errorCode.getMessage())));
                }
            }

            @Override // com.huami.passport.IAccount.Callback
            public void onSuccess(@Nullable Message message) {
                HMLog.info("BindPhoneForLoginActivity", new b(message));
                Integer numValueOf = message == null ? null : Integer.valueOf(message.getCode());
                if (numValueOf != null && numValueOf.intValue() == 0) {
                    LoadingDialog loadingDialog = this.a.mLoadingDialog;
                    if (loadingDialog != null) {
                        loadingDialog.setSuccess(this.a.getString(R.string.account_ui_account_sms_send_success));
                    }
                    this.a.n();
                    return;
                }
                if (numValueOf != null && numValueOf.intValue() == 12) {
                    LoadingDialog loadingDialog2 = this.a.mLoadingDialog;
                    if (loadingDialog2 != null) {
                        loadingDialog2.setFailed(this.a.getString(R.string.account_ui_account_too_much_operation));
                    }
                    this.a.v().setEnabled(true);
                    return;
                }
                if (numValueOf == null || numValueOf.intValue() != 10) {
                    BindPhoneForLoginActivity.m(this.a, null, 1, null);
                    return;
                }
                LoadingDialog loadingDialog3 = this.a.mLoadingDialog;
                if (loadingDialog3 != null) {
                    loadingDialog3.hide();
                }
                this.a.v().setText(this.a.getResources().getString(R.string.account_ui_register_phone_resend_code));
                this.a.v().setEnabled(true);
                this.a.F(phoneNum);
            }
        });
    }

    private final void E(int msg) {
        if (isFinishing()) {
            return;
        }
        LoadingDialog loadingDialog = this.mLoadingDialog;
        if (loadingDialog == null) {
            this.mLoadingDialog = LoadingDialog.showDialog(this, getString(msg));
        } else if (loadingDialog != null) {
            loadingDialog.setMessage(getString(msg));
        }
        LoadingDialog loadingDialog2 = this.mLoadingDialog;
        if (loadingDialog2 != null) {
            loadingDialog2.setCancelable(false);
        }
        LoadingDialog loadingDialog3 = this.mLoadingDialog;
        if (loadingDialog3 == null) {
            return;
        }
        loadingDialog3.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(final String phoneNumber) {
        new AlertDialogFragment.Builder(this).setTitle(getString(R.string.account_ui_phone_has_bound)).setMessage(getString(R.string.account_ui_phone_has_bound_content, new Object[]{phoneNumber})).themed().setPositiveButton(getString(R.string.account_ui_phone_login_this_account), new DialogInterface.OnClickListener() { // from class: yw
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                BindPhoneForLoginActivity.G(this.a, phoneNumber, dialogInterface, i2);
            }
        }).setNegativeButton(getString(R.string.account_ui_back_to_bind), new DialogInterface.OnClickListener() { // from class: zw
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                BindPhoneForLoginActivity.H(dialogInterface, i2);
            }
        }).show(getSupportFragmentManager()).setGravity(17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(BindPhoneForLoginActivity bindPhoneForLoginActivity, String str, DialogInterface dialogInterface, int i2) {
        AccountManager.getDefault(bindPhoneForLoginActivity).offlineLogout();
        AuthNavigation.DefaultImpls.navigateToNormalLogin$default((AuthNavigation) AndroidKoinScopeExtKt.getKoinScope(bindPhoneForLoginActivity).get(Reflection.getOrCreateKotlinClass(AuthNavigation.class), null, null), bindPhoneForLoginActivity, LoginViewOptions.INSTANCE.fillLogin(str, null), null, 4, null);
        bindPhoneForLoginActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I() {
        u().setEnabled(s().length() > 0 && q().length() > 0 && r().length() > 0 && t().length() > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideProgressDialog() {
        LoadingDialog loadingDialog = this.mLoadingDialog;
        if (loadingDialog == null || !loadingDialog.isShowing()) {
            return;
        }
        this.mLoadingDialog.dismiss();
    }

    private final void initViews() {
        s().addTextChangedListener(this.verifyCodeBtnStateListener);
        v().setOnClickListener(new View.OnClickListener() { // from class: bx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BindPhoneForLoginActivity.y(this.a, view);
            }
        });
        u().setOnClickListener(new View.OnClickListener() { // from class: cx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BindPhoneForLoginActivity.z(this.a, view);
            }
        });
        BaseRegisterFragmentKt.setupPasswordVisible(q(), o());
        BaseRegisterFragmentKt.setupPasswordVisible(r(), p());
        s().addTextChangedListener(this.nextStepButtonStateListener);
        q().addTextChangedListener(this.nextStepButtonStateListener);
        r().addTextChangedListener(this.nextStepButtonStateListener);
        t().addTextChangedListener(this.nextStepButtonStateListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(final String phone, String access) {
        AccountManager.getDefault(this).bindAccount(this, "huami_phone", access, SelectAreaManager.INSTANCE.getAreaBySave().getValue(), new IAccount.Callback<BindResult, ErrorCode>() { // from class: com.huami.account.ui.BindPhoneForLoginActivity$bindPhone$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ ErrorCode a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(ErrorCode errorCode) {
                    super(0);
                    this.a = errorCode;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return this.a.toString();
                }
            }

            @Override // com.huami.passport.IAccount.Callback
            public void onError(@NotNull ErrorCode errorCode) {
                HMLog.info("BindPhoneForLoginActivity", new a(errorCode));
                this.a.hideProgressDialog();
                BindPhoneForLoginActivity bindPhoneForLoginActivity = this.a;
                IconToast.showError(bindPhoneForLoginActivity, bindPhoneForLoginActivity.getString(R.string.account_ui_account_bind_failed));
            }

            @Override // com.huami.passport.IAccount.Callback
            public void onSuccess(@NotNull BindResult result) {
                LoadingDialog loadingDialog = this.a.mLoadingDialog;
                if (loadingDialog == null) {
                    return;
                }
                String string = this.a.getString(R.string.account_ui_account_bind_success);
                final String str = phone;
                final BindPhoneForLoginActivity bindPhoneForLoginActivity = this.a;
                loadingDialog.setSuccess(string, 500, new LoadingDialog.OnAnimEndListener() { // from class: com.huami.account.ui.BindPhoneForLoginActivity$bindPhone$1$onSuccess$1
                    @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
                    public void onAnimEnd(@NotNull LoadingDialog dialog) {
                    }

                    @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
                    public void onDismiss(@NotNull LoadingDialog dialog) {
                        HMAccountKeeper.INSTANCE.saveAlreadyBindPhone(true);
                        EventBus.getDefault().post(new EventPhoneBinding(str));
                        bindPhoneForLoginActivity.x();
                    }
                });
            }
        });
    }

    private final void k() {
        HMLogoutManager.logout(5);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(String reason) {
        LoadingDialog loadingDialog = this.mLoadingDialog;
        if (loadingDialog != null) {
            if (reason == null) {
                reason = getString(R.string.account_ui_register_phone_failed_please_retry);
            }
            loadingDialog.setFailed(reason);
        }
        v().setEnabled(true);
    }

    public static /* synthetic */ void m(BindPhoneForLoginActivity bindPhoneForLoginActivity, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        bindPhoneForLoginActivity.l(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Job n() {
        return kotlinx.coroutines.e.f(LifecycleOwnerKt.getLifecycleScope(this), null, null, new a(null), 3, null);
    }

    private final ImageView o() {
        return (ImageView) this.inputPasswordShow.getValue();
    }

    private final ImageView p() {
        return (ImageView) this.inputPasswordShowAgain.getValue();
    }

    private final EditText q() {
        return (EditText) this.inputPasswordText.getValue();
    }

    private final EditText r() {
        return (EditText) this.inputPasswordTextAgain.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EditText s() {
        return (EditText) this.inputPhoneNumber.getValue();
    }

    private final EditText t() {
        return (EditText) this.inputVerificationCode.getValue();
    }

    private final View u() {
        return (View) this.nextStepBtn.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView v() {
        return (TextView) this.sendVerifyBtn.getValue();
    }

    private final RainbowTitleBar w() {
        return (RainbowTitleBar) this.titleBar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        if (HMLoginManager.isNewUser()) {
            HMProcessLoginDataManager.skipToSetInfoPage(this, getIntent());
        } else {
            HMProcessLoginDataManager.goMainTabPage(this, Boolean.FALSE);
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(BindPhoneForLoginActivity bindPhoneForLoginActivity, View view) {
        if (!UtilsKt.isPhoneNumFormat(bindPhoneForLoginActivity.s().getText().toString())) {
            IconToast.showError(bindPhoneForLoginActivity, bindPhoneForLoginActivity.getString(R.string.account_ui_login_phone_format_error));
        } else if (NetUtil.INSTANCE.networkInfo().isNetworkConnect()) {
            bindPhoneForLoginActivity.D(bindPhoneForLoginActivity.s().getText().toString());
        } else {
            IconToast.showError(bindPhoneForLoginActivity, bindPhoneForLoginActivity.getString(R.string.account_ui_no_network_connection));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(final BindPhoneForLoginActivity bindPhoneForLoginActivity, View view) {
        if (!UtilsKt.isPhoneNumFormat(bindPhoneForLoginActivity.s().getText().toString())) {
            IconToast.showError(bindPhoneForLoginActivity, bindPhoneForLoginActivity.getString(R.string.account_ui_login_phone_format_error));
            return;
        }
        if (bindPhoneForLoginActivity.q().length() < 8) {
            IconToast.showError(bindPhoneForLoginActivity, bindPhoneForLoginActivity.getString(R.string.account_ui_account_pwd_length_error));
            return;
        }
        if (!UtilsKt.validPassword(bindPhoneForLoginActivity.q().getText().toString())) {
            IconToast.showError(bindPhoneForLoginActivity, bindPhoneForLoginActivity.getString(R.string.account_ui_login_email_password_format_error));
            return;
        }
        if (!Intrinsics.areEqual(bindPhoneForLoginActivity.q().getText().toString(), bindPhoneForLoginActivity.r().getText().toString())) {
            IconToast.showError(bindPhoneForLoginActivity, bindPhoneForLoginActivity.getString(R.string.account_ui_mili_setting_off_wist_lock_password_not_match));
            return;
        }
        if (bindPhoneForLoginActivity.t().length() == 0) {
            IconToast.showError(bindPhoneForLoginActivity, bindPhoneForLoginActivity.getString(R.string.account_ui_account_input_verify_code));
            return;
        }
        if (!NetUtil.INSTANCE.networkInfo().isNetworkConnect()) {
            IconToast.showError(bindPhoneForLoginActivity, bindPhoneForLoginActivity.getString(R.string.account_ui_no_network_connection));
            return;
        }
        bindPhoneForLoginActivity.E(R.string.account_ui_account_binding);
        final String str = AccountConstants.DEFAULT_AREA_CODE + ((Object) bindPhoneForLoginActivity.s().getText());
        AccountManager.getDefault(bindPhoneForLoginActivity).registrations("", str, bindPhoneForLoginActivity.q().getText().toString(), bindPhoneForLoginActivity.t().getText().toString(), SelectAreaManager.INSTANCE.getAreaBySave().getValue(), new IAccount.Callback<LoginInfo, ErrorCode>() { // from class: com.huami.account.ui.BindPhoneForLoginActivity$initViews$2$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ ErrorCode a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(ErrorCode errorCode) {
                    super(0);
                    this.a = errorCode;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return String.valueOf(this.a);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public static final b a = new b();

                public b() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "loginInfo or access is null";
                }
            }

            @Override // com.huami.passport.IAccount.Callback
            public void onError(@Nullable ErrorCode errorCode) {
                HMLog.info("BindPhoneForLoginActivity", new a(errorCode));
                this.a.hideProgressDialog();
                boolean z = false;
                if (errorCode != null && errorCode.getCode() == 4) {
                    z = true;
                }
                if (z) {
                    BindPhoneForLoginActivity bindPhoneForLoginActivity2 = this.a;
                    IconToast.showError(bindPhoneForLoginActivity2, bindPhoneForLoginActivity2.getString(R.string.account_ui_account_verify_code_wrong));
                } else {
                    BindPhoneForLoginActivity bindPhoneForLoginActivity3 = this.a;
                    IconToast.showError(bindPhoneForLoginActivity3, bindPhoneForLoginActivity3.getString(R.string.account_ui_account_bind_failed));
                }
            }

            @Override // com.huami.passport.IAccount.Callback
            public void onSuccess(@Nullable LoginInfo loginInfo) {
                if (loginInfo != null && loginInfo.getAccess() != null) {
                    this.a.j(str, loginInfo.getAccess());
                    return;
                }
                HMLog.info("BindPhoneForLoginActivity", b.a);
                this.a.hideProgressDialog();
                BindPhoneForLoginActivity bindPhoneForLoginActivity2 = this.a;
                IconToast.showError(bindPhoneForLoginActivity2, bindPhoneForLoginActivity2.getString(R.string.account_ui_account_bind_failed));
            }
        });
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (AccountExternalsKt.getConfigDelegate().allowSkipBindPhone()) {
            super.onBackPressed();
        } else {
            k();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.account_ui_activity_bind_phone);
        if (AccountExternalsKt.getConfigDelegate().allowSkipBindPhone()) {
            w().setMenuText(R.string.account_ui_start_up_enter);
            w().setOnActionMenuClickListener(new RainbowTitleBar.OnActionMenuClickListener() { // from class: ex
                @Override // com.huami.lib.rainbow.titlebar.RainbowTitleBar.OnActionMenuClickListener
                public final void onClick(View view, int i2) {
                    BindPhoneForLoginActivity.A(this.a, view, i2);
                }
            });
            w().setNavigationIcon((Drawable) null);
            w().setNavigationText((CharSequence) null);
            w().setNavigationOnClickListener(new View.OnClickListener() { // from class: dx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BindPhoneForLoginActivity.B(view);
                }
            });
        } else {
            w().setNavigationOnClickListener(new View.OnClickListener() { // from class: ax
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BindPhoneForLoginActivity.C(this.a, view);
                }
            });
            ViewParent parent = u().getParent();
            DebugUi.INSTANCE.insertDebugEntrance(parent instanceof LinearLayout ? (LinearLayout) parent : null, "跳过（仅用于调试模式）", new i());
        }
        initViews();
    }
}
